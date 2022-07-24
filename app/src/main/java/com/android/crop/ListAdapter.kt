package com.android.crop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.crop.databinding.ItemListViewBinding

class ListAdapter(var list: ArrayList<String>, val cropItemClickListener: CropItemClickListener) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemListViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textViewTitle.text = list[position]
        holder.itemView.setOnClickListener { cropItemClickListener.onItemClicked(list[position]) }
    }

    override fun getItemCount() = list.size
}

interface CropItemClickListener {
    fun onItemClicked(name: String)
}