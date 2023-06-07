package com.ny.in.utils;

import androidx.appcompat.app.AppCompatActivity;

import com.ny.in.R;
import com.ny.in.fragments.UpdateAppFragment;
import com.ny.in.model.GitHubResponse;

import java.io.IOException;
import java.util.concurrent.Executors;

public class UpdateUtils {
    public static void checkForUpdates(AppCompatActivity appCompatActivity){
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                try {
                    GitHubResponse[] gitHubResponses = new CheckForUpdates().checkForUpdates();
                    if (gitHubResponses != null) {
                        UpdateAppFragment updateAppFragment = new UpdateAppFragment(gitHubResponses);
                        appCompatActivity.getSupportFragmentManager().beginTransaction().add(R.id.container , updateAppFragment).addToBackStack(null).commit();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
