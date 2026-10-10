package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34669c extends AudioManager$AudioPlaybackCallback {

    /* JADX INFO: renamed from: a */
    volatile a f73347a;

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76000a();
    }

    public C34669c() {
        AudioManager audioManager;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 26 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioPlaybackCallback(this, null);
                Log.m76034i("LiteavAudioPlaybackCallback", "register audio playback callback", new Object[0]);
            } catch (Throwable th2) {
                Log.m76033e("LiteavAudioPlaybackCallback", "register audio playback callback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    public final void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
        a aVar = this.f73347a;
        if (aVar == null) {
            return;
        }
        aVar.mo76000a();
    }
}
