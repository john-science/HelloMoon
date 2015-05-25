package net.antineutrino.android.hellomoon;


import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;


public class HelloMoonFragment extends Fragment {

    private ImageButton mPlayButton;
    private ImageButton mPauseButton;
    private ImageButton mStopButton;
    private AudioPlayer mPlayer = new AudioPlayer();

    public HelloMoonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @TargetApi(16)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);

        mPlayButton = (ImageButton)v.findViewById(R.id.hellomoon_playButton);
        mPlayButton.setEnabled(true);
        mPlayButton.setImageAlpha(1000);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayButton.setImageAlpha(100);
                mPauseButton.setImageAlpha(1000);
                mStopButton.setImageAlpha(1000);
                mPlayButton.setEnabled(false);
                mPauseButton.setEnabled(true);
                mStopButton.setEnabled(true);
                mPlayer.play(getActivity());
            }
        });

        mPauseButton = (ImageButton)v.findViewById(R.id.hellomoon_pauseButton);
        mPauseButton.setEnabled(false);
        mPauseButton.setImageAlpha(100);
        mPauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayButton.setImageAlpha(1000);
                mPauseButton.setImageAlpha(100);
                mStopButton.setImageAlpha(1000);
                mPlayButton.setEnabled(true);
                mPauseButton.setEnabled(false);
                mStopButton.setEnabled(true);
                mPlayer.pause();
            }
        });

        mStopButton = (ImageButton)v.findViewById(R.id.hellomoon_stopButton);
        mStopButton.setEnabled(false);
        mStopButton.setImageAlpha(100);
        mStopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayButton.setImageAlpha(1000);
                mPauseButton.setImageAlpha(100);
                mStopButton.setImageAlpha(100);
                mPlayButton.setEnabled(true);
                mPauseButton.setEnabled(false);
                mStopButton.setEnabled(false);
                mPlayer.stop();
            }
        });

        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }
}
