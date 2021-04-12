package com.example.unit_3_sprint_4_evaluation

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseModel(

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("data")
	val data: List<DataModel?>? = null,

	@field:SerializedName("success")
	val success: Boolean? = null
)