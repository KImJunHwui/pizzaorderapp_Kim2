package com.kim.pizzaorderapp_kim2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
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

    }

    override fun setValues() {

        mStoreData2 = intent.getSerializableExtra("StoreData") as PizzaStore

        Glide.with(mContext).load(mStoreData2.logoURL).into(storelogoImg2)

        storeNameTxt2.text = mStoreData2.name
        storePhoneNumTxt2.text = mStoreData2.phoneNum


    }


}