package com.google.zxing.client.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public final class BeepManager {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = "BeepManager";
    private static final long VIBRATE_DURATION = 200;
    private final Context context;
    private boolean beepEnabled = true;
    private boolean vibrateEnabled = false;

    @SuppressLint({"MissingPermission"})
    public synchronized void playBeepSoundAndVibrate() {
        Vibrator vibrator;
        try {
            if (this.beepEnabled) {
                playBeepSound();
            }
            if (this.vibrateEnabled && (vibrator = (Vibrator) this.context.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean isBeepEnabled() {
        return this.beepEnabled;
    }

    public boolean isVibrateEnabled() {
        return this.vibrateEnabled;
    }

    public MediaPlayer playBeepSound() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.google.zxing.client.android.BeepManager.1
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.stop();
                mediaPlayer2.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.google.zxing.client.android.BeepManager.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i11, int i12) {
                Log.w(BeepManager.TAG, "Failed to beep " + i11 + ", " + i12);
                mediaPlayer2.stop();
                mediaPlayer2.release();
                return true;
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.context.getResources().openRawResourceFd(C9149R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e11) {
            Log.w(TAG, e11);
            mediaPlayer.release();
            return null;
        }
    }

    public void setBeepEnabled(boolean z11) {
        this.beepEnabled = z11;
    }

    public void setVibrateEnabled(boolean z11) {
        this.vibrateEnabled = z11;
    }

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.context = activity.getApplicationContext();
    }
}
