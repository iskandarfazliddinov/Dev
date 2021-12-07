package com.example.dev.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.dev.Data.UserData
import com.example.dev.R
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(val data:ArrayList<UserData>):RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    data class ViewHolder(val view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            val image : ImageView = findViewById(R.id.user_img)
            image.setImageResource(data[position].imageData!!)
            user_text_1?.text = data[position].textData_1
            user_text_2?.text = data [position].textData_2
        }
    }

    override fun getItemCount(): Int {

        return data.size

    }
}