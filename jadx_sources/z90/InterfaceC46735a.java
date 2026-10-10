package z90;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: z90.a */
/* JADX INFO: compiled from: DataSink.java */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC46735a {
    /* JADX INFO: renamed from: a */
    void mo101055a(@NonNull TrackType trackType, @NonNull MediaFormat mediaFormat);

    /* JADX INFO: renamed from: b */
    void mo101056b(double d11, double d12);

    /* JADX INFO: renamed from: c */
    void mo101057c(int i11);

    /* JADX INFO: renamed from: d */
    void mo101058d(@NonNull TrackType trackType, @NonNull TrackStatus trackStatus);

    /* JADX INFO: renamed from: e */
    void mo101059e(@NonNull TrackType trackType, @NonNull ByteBuffer byteBuffer, @NonNull MediaCodec.BufferInfo bufferInfo);

    void release();

    void stop();
}
