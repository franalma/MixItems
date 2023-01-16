package com.fra.dtse.mixitems.ui.model;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.fra.dtse.mixitems.R;
import com.fra.dtse.mixitems.databinding.ListItem4RowsBinding;

import java.util.List;

public class ListIssuesAdapter extends RecyclerView.Adapter<ListIssuesAdapter.ViewHolder> {

    public interface ListIssueListener{
        void onItemClick(int pos);
    }

    List<List4RowModel> items;
    ListIssueListener listener;

    public ListIssuesAdapter(List<List4RowModel> items, ListIssueListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItem4RowsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.list_item_4_rows,parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        List4RowModel item = items.get(position);
        holder.bind(item.getRow1(), item.getRow2(),item.getRow3(), item.getRow4());
    }

    @Override
    public int getItemCount() {
        System.out.println("--->items:"+ items.size());
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ListItem4RowsBinding binding;

        public ViewHolder(ListItem4RowsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(String row1, String row2, String row3, String row4){
            binding.idRow1.setText(row1);
            binding.idRow2.setText(row2);
            binding.idRow3.setText(row3);
            binding.idRow4.setText(row4);


            if (listener != null){
                listener.onItemClick(getAdapterPosition());
            }
        }
    }
}
