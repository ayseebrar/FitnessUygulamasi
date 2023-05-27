package com.aselley.fitnesuygulamas.fFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aselley.fitnesuygulamas.FitnesMove;
import com.aselley.fitnesuygulamas.PopupActivity;
import com.aselley.fitnesuygulamas.R;

public class FitnessPictures  extends Fragment  implements FitnessPictureAdapter.MyListener {




    public static FitnessPictures newInstance() {
        return new FitnessPictures();
    }





    @Nullable
    @androidx.annotation.Nullable
    @Override
    public View onCreateView(@NonNull @androidx.annotation.NonNull LayoutInflater inflater, @Nullable @androidx.annotation.Nullable ViewGroup container, @Nullable @androidx.annotation.Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fitness_pictures,container,false);


        return rootView;
    }
    private ArrayList<FitnessMove> getFitnessMoves(ArrayList<FitnessMove> fitnessMoves) {

        for (int i = 0; i<16; i++) {

            fitnessMoves.add(new FitnessMove("Fitness Move Name" + i,
                    "http://www.atilsamancioglu.com/wp-content/uploads/2018/06/fitness"+i+".jpg",
                    "Fitness Move Description",
                    100));

        }


        return fitnessMoves;
    }


    @Override
    public void MyListener(FitnesMove fitnessMove) {
        System.out.println("Fitness Move:" + fitnessMove.getFitnessName());

        Intent intent = PopupActivity.newIntent(getActivity(),fitnessMove);
        startActivity(intent);

    }




    }

