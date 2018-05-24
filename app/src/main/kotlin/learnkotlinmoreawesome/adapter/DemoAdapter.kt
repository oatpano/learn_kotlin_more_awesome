package learnkotlinmoreawesome.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oatrice.learnkotlinmoreawesome.R
import kotlinx.android.synthetic.main.view_item.view.*
import model.Data
import model.ModelKotlin

class DemoAdapter(val data: ModelKotlin): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.view_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.datalist.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val myViewHolder = holder as MyViewHolder
        myViewHolder.bind(data.datalist[position], listener)
    }

    private lateinit var listener: (String) -> Unit

    fun setListener(listener: (String)->Unit) {
        this.listener = listener
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(data: Data, listener: (String) -> Unit) = with(itemView) {
            tvName.text = data.name
            tvFacilityType.text = data.facilityType

            setOnClickListener { listener.invoke(data.name) }

        }

    }

}