package com.dimensiva.ecommerce.models

import com.google.gson.annotations.SerializedName

data class Item(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("rating")
	val rating: Double? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)
