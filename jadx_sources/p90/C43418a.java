package p90;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p90.a */
/* JADX INFO: compiled from: buffers.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t*\n\u0010\u000b\"\u00020\n2\u00020\n*\n\u0010\f\"\u00020\u00022\u00020\u0002*\n\u0010\r\"\u00020\u00062\u00020\u0006*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e*\n\u0010\u0011\"\u00020\u00102\u00020\u0010¨\u0006\u0012"}, m90084d2 = {"", "size", "Ljava/nio/ByteBuffer;", "Lcom/otaliastudios/opengl/types/ByteBuffer;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Ljava/nio/ByteBuffer;", "Ljava/nio/FloatBuffer;", "Lcom/otaliastudios/opengl/types/FloatBuffer;", "b", "(I)Ljava/nio/FloatBuffer;", "Ljava/nio/Buffer;", "Buffer", "ByteBuffer", "FloatBuffer", "Ljava/nio/IntBuffer;", "IntBuffer", "Ljava/nio/ShortBuffer;", "ShortBuffer", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
@JvmName(name = "BuffersJvmKt")
public final class C43418a {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final FloatBuffer m95608b(int i11) {
        FloatBuffer floatBufferAsFloatBuffer = m95607a(i11 * 4).asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "byteBuffer(size * Egloo.SIZE_OF_FLOAT).asFloatBuffer()");
        return floatBufferAsFloatBuffer;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ByteBuffer m95607a(int i11) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        byteBufferOrder.limit(byteBufferOrder.capacity());
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "allocateDirect(size * Egloo.SIZE_OF_BYTE)\n        .order(ByteOrder.nativeOrder())\n        .also { it.limit(it.capacity()) }");
        return byteBufferOrder;
    }
}
