package com.example.catalog1212.Adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.catalog1212.Fragments.DetailFragment
import com.example.catalog1212.Model
import com.example.catalog1212.R

class AdapterLinear (private val array: ArrayList<Model>,private val context: FragmentActivity)
    :RecyclerView.Adapter<AdapterLinear.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val image: ImageView
            val name: TextView
            val description: TextView

            init {
                image = itemView.findViewById(R.id.imageView_linear)
                name = itemView.findViewById(R.id.name_linear)
                description = itemView.findViewById(R.id.description_linear)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.linear_layout, parent, false)

            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = array[position]
            Glide.with(holder.itemView).load(item.image).into(holder.image)
            holder.name.text = item.name
            holder.description.text = item.description

            holder.itemView.setOnClickListener {
                val bundle = Bundle()
                bundle.putSerializable("KEY", item)

                context.supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, DetailFragment::class.java, bundle)
                    .addToBackStack(null).commit()
            }
        }

        override fun getItemCount(): Int {
            return array.size
        }
    }
