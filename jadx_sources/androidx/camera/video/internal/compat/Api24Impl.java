package androidx.camera.video.internal.compat;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(24)
public final class Api24Impl {
    private Api24Impl() {
    }

    public static int getClientAudioSessionId(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int getTimestamp(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i11) {
        return audioRecord.getTimestamp(audioTimestamp, i11);
    }
}
