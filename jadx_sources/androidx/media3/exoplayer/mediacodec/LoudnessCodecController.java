package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(35)
@UnstableApi
public final class LoudnessCodecController {

    @Nullable
    private android.media.LoudnessCodecController loudnessCodecController;
    private final HashSet<MediaCodec> mediaCodecs;
    private final LoudnessParameterUpdateListener updateListener;

    public LoudnessCodecController() {
        this(LoudnessParameterUpdateListener.DEFAULT);
    }

    public LoudnessCodecController(LoudnessParameterUpdateListener loudnessParameterUpdateListener) {
        this.mediaCodecs = new HashSet<>();
        this.updateListener = loudnessParameterUpdateListener;
    }

    public void addMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            Assertions.checkState(this.mediaCodecs.add(mediaCodec));
        }
    }

    public void release() {
        this.mediaCodecs.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void removeMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.mediaCodecs.remove(mediaCodec) || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void setAudioSessionId(int i11) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.loudnessCodecController = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i11, MoreExecutors.directExecutor(), new LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController.1
            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                return LoudnessCodecController.this.updateListener.onLoudnessParameterUpdate(bundle);
            }
        });
        this.loudnessCodecController = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.mediaCodecs.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public interface LoudnessParameterUpdateListener {
        public static final LoudnessParameterUpdateListener DEFAULT = new LoudnessParameterUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.k
            @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
            public final Bundle onLoudnessParameterUpdate(Bundle bundle) {
                return LoudnessCodecController.LoudnessParameterUpdateListener.m3328a(bundle);
            }
        };

        Bundle onLoudnessParameterUpdate(Bundle bundle);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ Bundle m3328a(Bundle bundle) {
            return bundle;
        }
    }
}
