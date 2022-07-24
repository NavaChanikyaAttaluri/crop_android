package com.android.crop.ui.details

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.crop.ItemModel
import com.android.crop.databinding.ItemDetailLayoutBinding
import com.android.crop.databinding.ItemListViewBinding

class ItemListAdapter(var list: ArrayList<ItemModel>) :
    RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    lateinit var context: Context

    class ViewHolder(val binding: ItemDetailLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val binding =
            ItemDetailLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvName.text = list[position].name
        if (list[position].imageList.isNotEmpty()) {
            holder.binding.imageView1.setImageDrawable(context.getDrawable(list[position].imageList[0]))
            holder.binding.imageView2.setImageDrawable(context.getDrawable(list[position].imageList[1]))
        } else {
            holder.binding.imageView1.visibility = View.GONE
            holder.binding.imageView2.visibility = View.GONE
        }
    }

    override fun getItemCount() = list.size
}