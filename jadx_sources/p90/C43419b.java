package p90;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.Buffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p90.b */
/* JADX INFO: compiled from: buffers.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Ljava/nio/Buffer;", "Lcom/otaliastudios/opengl/types/Buffer;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/nio/Buffer;)V", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C43419b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m95609a(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer instanceof InterfaceC43420c) {
            ((InterfaceC43420c) buffer).dispose();
        }
    }
}
