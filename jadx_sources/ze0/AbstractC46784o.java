package ze0;

import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ze0.o */
/* JADX INFO: compiled from: Plane.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lze0/o;", "", "<init>", "()V", "Lze0/e;", "buffer", "", "planeIndex", "d", "(Lze0/e;I)I", "Lze0/p;", "c", "()I", "rowStride", "Ljava/nio/ByteBuffer;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/nio/ByteBuffer;", "b", "bufferSize", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC46784o {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract ByteBuffer mo87797a();

    /* JADX INFO: renamed from: b */
    public abstract int mo87798b();

    /* JADX INFO: renamed from: c */
    public abstract int mo87799c();

    /* JADX INFO: renamed from: d */
    public final int m103109d(@NotNull InterfaceC46774e buffer, int planeIndex) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Rect cropRect = buffer.getCropRect();
        return buffer.mo103065s(planeIndex, mo87799c(), cropRect.left, cropRect.top);
    }
}
