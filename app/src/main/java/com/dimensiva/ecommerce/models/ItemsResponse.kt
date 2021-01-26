package com.dimensiva.ecommerce.models

import com.google.gson.annotations.SerializedName

data class ItemsResponse(

	@field:SerializedName("totalResults")
	val totalResults: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
)

data class ItemsItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("rating")
	val rating: Double? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)
