package com.slc.onlyflans.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.slc.onlyflans.R
import com.slc.onlyflans.models.Flan

class FlanAdapter(private var flans: ArrayList<Flan>, private val listener: OnFlanClickListener): RecyclerView.Adapter<FlanAdapter.FlanViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlanViewHolder {
        return FlanViewHolder(LayoutInflater.from(parent.context), parent)
    }

    override fun getItemCount(): Int = flans.size

    override fun onBindViewHolder(holder: FlanViewHolder, position: Int) {
        val flan = flans[position]
        holder.image!!.setImageDrawable(ContextCompat.getDrawable(holder.image!!.context, flan.image))
    }

    class FlanViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_flan, parent, false)) {

        var card: ConstraintLayout? = null
        var image: ImageView? = null

        init {
            card = itemView.findViewById(R.id.root)
            image = itemView.findViewById(R.id.ivFlan)
        }
    }


    interface OnFlanClickListener {
        fun onClickFlan()
    }

}