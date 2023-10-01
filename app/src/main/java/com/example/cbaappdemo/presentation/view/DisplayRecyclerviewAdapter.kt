package com.example.cbaappdemo.presentation.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.cbaappdemo.data.dto.CBADataModel
import com.example.cbaappdemo.databinding.ItemImageTextItemViewBinding
import com.example.cbaappdemo.databinding.ItemImageViewBinding
import com.example.cbaappdemo.databinding.ItemTypeTextBinding
import com.example.cbaappdemo.presentation.view.viewholder.MessageViewHolder
import com.example.cbaappdemo.presentation.view.viewholder.OptionMessageViewHolder

class DisplayRecyclerviewAdapter(private val cbaDataModel: CBADataModel) :
    RecyclerView.Adapter<ViewHolder>() {

    private lateinit var bindingText: ItemTypeTextBinding
    private lateinit var bindingImage: ItemImageViewBinding
    private lateinit var bindingTextWithImage: ItemImageTextItemViewBinding

    override fun getItemCount() = cbaDataModel.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        when (viewType) {
            1 -> {
                bindingText = ItemTypeTextBinding.inflate(inflater, parent, false)
                return MessageViewHolder(bindingText.root)
            }

            2 -> {
                bindingImage = ItemImageViewBinding.inflate(inflater, parent, false)
                return ImageViewHolder(bindingImage.root)
            }

            3 -> {
                bindingTextWithImage = ItemImageTextItemViewBinding.inflate(inflater, parent, false)
                return ImageTextViewHolder(bindingTextWithImage.root)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (holder) {
            is MessageViewHolder -> {
                val messageData = cbaDataModel[position]
                holder.bind(messageData)
            }

            is ImageViewHolder -> {
                val imageData = cbaDataModel[position]
                holder.bind(imageData)
            }

            is ImageTextViewHolder -> {
                val imageTextData = cbaDataModel[position]
                holder.bind(imageTextData)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (cbaDataModel[position].type) {
            "message" -> 1
            "student.details" -> 2
            "option.message" -> 3
            "image" -> 4
            else -> super.getItemViewType(position)
        }
    }

    // Create your ViewHolder classes for different view types here

    inner class MessageViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(data: CBADataModel) {

        }
    }

    inner class ImageViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(data: CBADataModel) {

        }
    }

    inner class ImageTextViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(data: OptionMessageViewHolder) {

        }
    }
}
