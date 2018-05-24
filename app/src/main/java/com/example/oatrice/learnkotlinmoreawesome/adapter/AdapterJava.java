package com.example.oatrice.learnkotlinmoreawesome.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oatrice.learnkotlinmoreawesome.R;
import com.example.oatrice.learnkotlinmoreawesome.model.ModelJava;

public class AdapterJava extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ModelJava data;
    private MyListener listener;

    public AdapterJava(ModelJava data) {

        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myholder = (MyViewHolder) holder;
        myholder.bind(data.getDatalist().get(position), listener);
    }

    @Override
    public int getItemCount() {
        return data.getDatalist().size();
    }

    public void setListener(MyListener listener) {
        this.listener = listener;
    }

    public interface MyListener {
        void onItemClilck(String name);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvName;
        private final TextView tvFacility;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvFacility = itemView.findViewById(R.id.tvFacilityType);
        }

        public void bind(final ModelJava.Data data, final MyListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener == null) {
                        listener.onItemClilck(data.getName());
                    }
                }
            });

            tvName.setText(data.getName());
            tvFacility.setText(data.getFacilityType());

        }
    }
}
