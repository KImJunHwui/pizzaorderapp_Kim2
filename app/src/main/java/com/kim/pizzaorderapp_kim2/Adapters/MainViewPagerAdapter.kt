package com.kim.pizzaorderapp_kim2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzaorderapp_kim2.Fragments.ChickenStoreListFragment
import com.kim.pizzaorderapp_kim2.Fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PizzaStoreListFragment()
            else -> ChickenStoreListFragment()

        }
    }

    override fun getCount(): Int {

        return 2
    }


}