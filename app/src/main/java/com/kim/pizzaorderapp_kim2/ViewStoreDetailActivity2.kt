package com.kim.pizzaorderapp_kim2

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import com.kim.pizzaorderapp_kim2.Datas.PizzaStore
import kotlinx.android.synthetic.main.activity_view_store_detail2.*

class ViewStoreDetailActivity2 : BaseActivity() {

    lateinit var mStoreData2 : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail2)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        callPhoneBtn2.setOnClickListener {

            val permissionListener = object : PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${mStoreData2.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(mContext, "전화연결 권한이 없습니다.", Toast.LENGTH_SHORT).show()
                }

            }

            TedPermission.create()
                .setPermissionListener(permissionListener)
                .setDeniedMessage("[설정]에서 전화 권한을 켜 주세요")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()


        }
    }

    override fun setValues() {

        mStoreData2 = intent.getSerializableExtra("StoreData") as PizzaStore

        Glide.with(mContext).load(mStoreData2.logoURL).into(storelogoImg2)

        storeNameTxt2.text = mStoreData2.name
        storePhoneNumTxt2.text = mStoreData2.phoneNum


    }


}