package u90;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: u90.a */
/* JADX INFO: compiled from: MediaCodecBuffers.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45141a {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f101584a;

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f101586c = null;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer[] f101585b = null;

    @NonNull
    /* JADX INFO: renamed from: a */
    public ByteBuffer m99772a(int i11) {
        return this.f101584a.getInputBuffer(i11);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public ByteBuffer m99773b(int i11) {
        return this.f101584a.getOutputBuffer(i11);
    }

    public C45141a(@NonNull MediaCodec mediaCodec) {
        this.f101584a = mediaCodec;
    }

    /* JADX INFO: renamed from: c */
    public void m99774c() {
    }
}
