package com.dimensiva.ecommerce.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import com.dimensiva.ecommerce.adapters.ItemAdapter
import com.dimensiva.ecommerce.databinding.ActivityMainBinding
import com.dimensiva.ecommerce.interfaces.RetrofitCallback
import com.dimensiva.ecommerce.models.Item
import com.dimensiva.ecommerce.models.ItemsResponse
import com.dimensiva.ecommerce.repository.ProductsRespository
import com.dimensiva.ecommerce.utils.SharedPreferencesUtil
import com.mancj.materialsearchbar.MaterialSearchBar


class MainActivity : AppCompatActivity(), RetrofitCallback,
    MaterialSearchBar.OnSearchActionListener {


    private lateinit var lastSearches: MutableList<String>
    private lateinit var binding: ActivityMainBinding
    private lateinit var productsRespository: ProductsRespository

    private val itemLiveData = MutableLiveData<List<Item>>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lastSearches = ArrayList()

        //Enable searchbar callbacks
        binding.searchBar.setOnSearchActionListener(this)

        //Get last session of searched products
        val sharedPrefSaved = SharedPreferencesUtil.getArrayPrefs("latestSearches", this)

        //get all queries from the last session
        binding.searchBar.lastSuggestions = sharedPrefSaved


        binding.searchBar.setHint("buscar producto")
        productsRespository = ProductsRespository()


    }


    override fun onProductSearch(product: ItemsResponse) {
        //println("Product ${product.items}")

        val adapter = ItemAdapter()
        binding.rvItems.adapter = adapter
        itemLiveData.value = product.items as List<Item>?

        itemLiveData.observe(this, {
            adapter.submitList(it)
            adapter.notifyDataSetChanged()
        })


    }

    override fun onError(error: String) {
        println(error)
    }


    //SearchBar
    override fun onSearchStateChanged(enabled: Boolean) {
        println("onSearchStateChanged")
    }

    override fun onSearchConfirmed(text: CharSequence?) {
        //println("Text searched = $text")
        productsRespository.searchProduct(text.toString(), this)

        //Get and save list of searches
        lastSearches = binding.searchBar.lastSuggestions as MutableList<String>
        SharedPreferencesUtil.setArrayPrefs("latestSearches", lastSearches, this)


    }

    override fun onButtonClicked(buttonCode: Int) {
        println("onButtonClicked")
    }

}