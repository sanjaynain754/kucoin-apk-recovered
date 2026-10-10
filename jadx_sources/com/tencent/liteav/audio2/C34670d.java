package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34670d extends AudioManager.AudioRecordingCallback {

    /* JADX INFO: renamed from: a */
    volatile a f73348a;

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.d$a */
    public interface a {
        void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list);
    }

    public C34670d() {
        AudioManager audioManager;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioRecordingCallback(this, null);
                Log.m76034i("LiteavAudioRecordingCallback", "register audio recording callback", new Object[0]);
            } catch (Throwable th2) {
                Log.m76033e("LiteavAudioRecordingCallback", "register audio recording callback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        a aVar = this.f73348a;
        if (aVar == null) {
            return;
        }
        aVar.OnRecordingConfigChanged(list);
    }
}
