package com.aselley.fitnesuygulamas.recycler;

import com.aselley.fitnesuygulamas.R;

public class FitnessPictureViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    ProgressBar progressBar;

    public FitnessPictureViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.recyclerview_fitness_pictures_list_imageview);
        progressBar = itemView.findViewById(R.id.recyclerview_fitness_pictures_list_progressbar);
    }

    public void getMoves(Context context, FitnessMove fitnessMove) {
        itemView.setTag(fitnessMove);
        Picasso.get().load(fitnessMove.getFitnessPicture()).fit().centerCrop().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {

            }
        });

    }

}
