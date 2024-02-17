package com.example.e_suraksha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.e_suraksha.Modal;
import com.example.e_suraksha.R;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Modal> dataList;
    private Context context;

    public MyAdapter(List<Modal> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.datafromcdr, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Modal data = dataList.get(position);
        holder.textView.setText(data.getMobile());
        holder.txt2.setText(data.getLocation());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView,txt2;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.number);
            txt2=itemView.findViewById(R.id.location);

        }
    }
}
