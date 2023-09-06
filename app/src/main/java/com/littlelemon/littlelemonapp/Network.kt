package com.littlelemon.littlelemonapp

import androidx.lifecycle.LiveData
import androidx.room.Room
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.net.URL

@Serializable
data class MenuNetworkData(
    @SerialName("menu")
    val menu: List<MenuItemNetwork>
)

@Serializable
class MenuItemNetwork(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String,
    @SerialName("price")
    val price: Double,
    @SerialName("image")
    val image: String,
    @SerialName("category")
    val category: String
) {
    fun toMenuItemRoom() =
        MenuItemRoom(
            id,
            title,
            description,
            price,
            image,
            category
        )
}