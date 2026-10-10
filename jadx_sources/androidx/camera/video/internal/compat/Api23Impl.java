package androidx.camera.video.internal.compat;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(23)
public final class Api23Impl {
    public static AudioRecord.Builder createAudioRecordBuilder() {
        return new AudioRecord.Builder();
    }

    private Api23Impl() {
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioRecord build(AudioRecord.Builder builder) throws UnsupportedOperationException {
        return builder.build();
    }

    public static void setAudioFormat(AudioRecord.Builder builder, AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void setAudioSource(AudioRecord.Builder builder, int i11) {
        builder.setAudioSource(i11);
    }

    public static void setBufferSizeInBytes(AudioRecord.Builder builder, int i11) {
        builder.setBufferSizeInBytes(i11);
    }
}
