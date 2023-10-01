package com.example.cbaappdemo.data.dto

data class CBADataModelItem(
    val attachments: List<Attachment>?,
    val text: String?,
    val type: String,
    val url: String?
)