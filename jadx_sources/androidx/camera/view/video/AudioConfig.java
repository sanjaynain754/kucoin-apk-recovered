package androidx.camera.view.video;

import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes23.dex */
public class AudioConfig {
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z11) {
        return new AudioConfig(z11);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }

    public AudioConfig(boolean z11) {
        this.mIsAudioEnabled = z11;
    }
}
