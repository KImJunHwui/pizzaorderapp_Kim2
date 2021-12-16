package com.kim.pizzaorderapp_kim2.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzaorderapp_kim2.Adapters.PizzaStoreAdapter
import com.kim.pizzaorderapp_kim2.Datas.Store
import com.kim.pizzaorderapp_kim2.R
import com.kim.pizzaorderapp_kim2.ViewStoreDetailActivity
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment : Fragment() {

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드

        mPizzaStoreDataList.add(Store("준휘 피자 가게","1111-5555", "https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add(Store("수연 피자 가게","2222-5555", "https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add(Store("지율 피자 가게","3333-5555", "https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add(Store("응삼 피자 가게","4444-5555", "https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item,mPizzaStoreDataList)

           pizzaStoreListView.adapter = mPizzaStoreAdapter

        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

            val ClickedStore = mPizzaStoreDataList[position]

            val myIntent = Intent(requireContext(), ViewStoreDetailActivity::class.java)

            myIntent.putExtra("storeData", ClickedStore)

            startActivity(myIntent)
        }


    }

    }
