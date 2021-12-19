package com.kim.pizzaorderapp_kim2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.kim.pizzaorderapp_kim2.Datas.PizzaStore
import com.kim.pizzaorderapp_kim2.R

class ChickenStoreAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resID, mList) {

        val Inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = Inflater.inflate(R.layout.chicken_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val storeNameTxt2 = row.findViewById<TextView>(R.id.storeNameTxt2)
        val logoImg2 = row.findViewById<ImageView>(R.id.logoImg2)

        storeNameTxt2.text = data.name

        Glide.with(mContext).load(data.logoURL).into(logoImg2)

        return row
    }
}