package com.kim.pizzaorderapp_kim2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kim.pizzaorderapp_kim2.Datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

       callPhoneBtn.setOnClickListener {
            val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
           val myIntent = Intent(Intent.ACTION_CALL, myUri)
           startActivity(myIntent)
       }

    }

    override fun setValues() {


        mStoreData = intent.getSerializableExtra("storeData") as Store

//        with 작성시 여러가지 중에 View 선택해야 함

        Glide.with(mContext).load(mStoreData.logoUrl).into(storeLogoImg)
        storeNameTxt.text = mStoreData.name
        storePhoneNumTxt.text = mStoreData.phoneNum


    }


}