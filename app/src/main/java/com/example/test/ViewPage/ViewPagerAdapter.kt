package com.example.test.ViewPage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.MainActivity
import com.example.test.R

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.PagerVH>() {

    var obj: List<ViewPageModel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        val text1: TextView = itemView.findViewById(R.id.textView)
        val text2: TextView = itemView.findViewById(R.id.textView1)
        val image2: ImageView = itemView.findViewById(R.id.imageView2)
        val button: Button = itemView.findViewById(R.id.Skip)
        val context: Context = itemView.context
        val image1: ImageView = itemView.findViewById(R.id.imageViewGroups)
        val mainContainer: LinearLayout = itemView.findViewById(R.id.mainViewPagerContainer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.activity_one_of_three, parent, false))
    }

    override fun getItemCount(): Int {
        return obj.size
    }

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        holder.text1.text = obj[position].text1
        holder.text2.text = obj[position].text2
        holder.image2.setImageResource(obj[position].image)
        holder.image1.setImageResource(obj[position].image1)
        holder.button.setOnClickListener {
            holder.context.startActivity(Intent(holder.context, MainActivity::class.java))
        }
        if(position == obj.size-1){
            holder.button.text = "Завершить"
        }
    }
}

