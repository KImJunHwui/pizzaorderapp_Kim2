package com.kim.pizzaorderapp_kim2.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzaorderapp_kim2.Adapters.ChickenStoreAdapter
import com.kim.pizzaorderapp_kim2.Adapters.PizzaStoreAdapter
import com.kim.pizzaorderapp_kim2.Datas.PizzaStore
import com.kim.pizzaorderapp_kim2.R
import com.kim.pizzaorderapp_kim2.ViewStoreDetailActivity2
import kotlinx.android.synthetic.main.fragment_chicken_store_list.*

class ChickenStoreListFragment : Fragment() {

    lateinit var mChickenStoreAdapter : ChickenStoreAdapter

    val mChickenStoreDataList = ArrayList<PizzaStore>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드

        mChickenStoreDataList.add( PizzaStore("준휘 통닭가게","3456-4992", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtuD3FDLZX5CtGrKe6UD6bGj_jh0KCL4_a2g&usqp=CAU"))
        mChickenStoreDataList.add( PizzaStore("수연 통닭가게","1111-2222", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAx9jVj6j4GFwdOPAFO_XCUv2u-WHPV1CgGg&usqp=CAU"))
        mChickenStoreDataList.add( PizzaStore("지율 통닭가게","3333-4444", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb3VZk5UuuzMHHth1V3PX3Q8l-8DEtdwa4rw&usqp=CAU"))
        mChickenStoreDataList.add( PizzaStore("응삼 통닭가게","6666-5555", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz-xb1Ze1Fu1Suh8U-r90wdz6YnxnV6xgXtg&usqp=CAU"))

        mChickenStoreAdapter = ChickenStoreAdapter(requireContext(), R.layout.chicken_store_list_item, mChickenStoreDataList)

        chickenStoreListView.adapter = mChickenStoreAdapter

        chickenStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickedstore2 = mChickenStoreDataList[position]

            val myIntent = Intent(requireContext(), ViewStoreDetailActivity2::class.java)

            myIntent.putExtra("StoreData", clickedstore2)

            startActivity(myIntent)


        }

    }

    }
