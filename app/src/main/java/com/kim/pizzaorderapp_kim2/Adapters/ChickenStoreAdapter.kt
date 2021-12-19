package com.kim.pizzaorderapp_kim2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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
        return row
    }
}