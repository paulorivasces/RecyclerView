package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {
        int resource = modelClassList.get(position).getImagenprincipal();
        String titulo1 = modelClassList.get(position).getTitulo1();
        String titulo2 = modelClassList.get(position).getTitulo2();
        String titulo3 = modelClassList.get(position).getTitulo3();
        viewholder.setData(resource, titulo1, titulo2, titulo3);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {

        private ImageView imagenprincipal;
        private TextView titulo1;
        private TextView titulo2;
        private TextView titulo3;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imagenprincipal = itemView.findViewById(R.id.imageView);
            titulo1 = itemView.findViewById(R.id.textView);
            titulo2 = itemView.findViewById(R.id.textView2);
            titulo3 = itemView.findViewById(R.id.textView3);
        }

        private void setData(int imageResource, String titulo1Text, String titulo2Text, String titulo3Text) {
            imagenprincipal.setImageResource(imageResource);
            titulo1.setText(titulo1Text);
            titulo2.setText(titulo2Text);
            titulo3.setText(titulo3Text);
        }

    }

}
