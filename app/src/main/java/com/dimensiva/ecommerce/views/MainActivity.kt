package com.dimensiva.ecommerce.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dimensiva.ecommerce.adapters.ItemAdapter
import com.dimensiva.ecommerce.databinding.ActivityMainBinding
import com.dimensiva.ecommerce.interfaces.RetrofitCallback
import com.dimensiva.ecommerce.models.ItemsResponse

import com.dimensiva.ecommerce.repository.ProductsRespository
import com.dimensiva.ecommerce.utils.DummyData
import com.dimensiva.ecommerce.viewmodels.ItemsViewModel

class MainActivity : AppCompatActivity(), RetrofitCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var productsRespository: ProductsRespository
    private lateinit var itemViewModel: ItemsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val textSearched = binding.searchBar.text


        productsRespository = ProductsRespository()
        productsRespository.searchProduct(textSearched, this)



        val adapter = ItemAdapter()
        binding.rvItems.adapter = adapter
        adapter.submitList(DummyData.getItems())
    }


    override fun onProductSearch(product: ItemsResponse) {
        //println("Product ${product.items.toString()}")
    }

    override fun onError(error: String) {
        println(error)
    }
}