package com.dimensiva.ecommerce.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.dimensiva.ecommerce.models.Item
import com.dimensiva.ecommerce.repository.ProductsRespository

class ItemsViewModel(application: Application) : AndroidViewModel(application) {
    private var repository: ProductsRespository = ProductsRespository()

    //Observable livedata to fetch products



}