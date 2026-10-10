package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;

    @Nullable
    private VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i11);

        void onStreamVolumeChanged(int i11, boolean z11);
    }

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.eventHandler;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.j3
                @Override // java.lang.Runnable
                public final void run() {
                    streamVolumeManager.updateVolumeAndNotifyIfChanged();
                }
            });
        }
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i11) {
        if (Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i11);
        }
        return getVolumeFromManager(audioManager, i11) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume == volumeFromManager && this.muted == mutedFromManager) {
            return;
        }
        this.volume = volumeFromManager;
        this.muted = mutedFromManager;
        this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    public void decreaseVolume(int i11) {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, i11);
        updateVolumeAndNotifyIfChanged();
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getMinVolume() {
        if (Util.SDK_INT >= 28) {
            return this.audioManager.getStreamMinVolume(this.streamType);
        }
        return 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void increaseVolume(int i11) {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, i11);
        updateVolumeAndNotifyIfChanged();
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void release() {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e11) {
                Log.m2962w(TAG, "Error unregistering stream volume receiver", e11);
            }
            this.receiver = null;
        }
    }

    public void setMuted(boolean z11, int i11) {
        if (Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(this.streamType, z11 ? -100 : 100, i11);
        } else {
            this.audioManager.setStreamMute(this.streamType, z11);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void setStreamType(int i11) {
        if (this.streamType == i11) {
            return;
        }
        this.streamType = i11;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i11);
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener, int i11) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = i11;
        this.volume = getVolumeFromManager(audioManager, i11);
        this.muted = getMutedFromManager(audioManager, i11);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e11) {
            Log.m2962w(TAG, "Error registering stream volume receiver", e11);
        }
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i11) {
        try {
            return audioManager.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            Log.m2962w(TAG, "Could not retrieve stream volume for stream type " + i11, e11);
            return audioManager.getStreamMaxVolume(i11);
        }
    }

    public void setVolume(int i11, int i12) {
        if (i11 >= getMinVolume() && i11 <= getMaxVolume()) {
            this.audioManager.setStreamVolume(this.streamType, i11, i12);
            updateVolumeAndNotifyIfChanged();
        }
    }
}
