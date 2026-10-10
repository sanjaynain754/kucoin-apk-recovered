package androidx.camera.video.internal.compat;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(31)
public final class Api31Impl {
    private Api31Impl() {
    }

    public static Range<Integer>[] getInputChannelCountRanges(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getInputChannelCountRanges();
    }

    public static int getMinInputChannelCount(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getMinInputChannelCount();
    }

    public static void setContext(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}
