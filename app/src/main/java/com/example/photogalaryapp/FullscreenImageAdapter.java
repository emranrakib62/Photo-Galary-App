package com.example.photogalaryapp;

import android.content.Context;
import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.List;

public class FullscreenImageAdapter extends RecyclerView.Adapter<FullscreenImageAdapter.FullscreenViewHolder> {

    private final List<Integer> imageList;
    private final Context context;

    public FullscreenImageAdapter(Context context, List<Integer> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    static class FullscreenViewHolder extends RecyclerView.ViewHolder {
        PhotoView photoView;
        public FullscreenViewHolder(@NonNull View itemView) {
            super(itemView);
            photoView = itemView.findViewById(R.id.photoView);
        }
    }

    @NonNull
    @Override
    public FullscreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fullscreen_image_item, parent, false);
        return new FullscreenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FullscreenViewHolder holder, int position) {
        holder.photoView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
