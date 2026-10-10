package p008a6;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.memory.AbstractC5659b;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p712w3.C45713m;
import p819z3.C46682k;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a6.a0 */
/* JADX INFO: compiled from: MemoryPooledByteBufferFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"La6/a0;", "Lz3/h;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "Lz3/k;", "pooledByteStreams", "<init>", "(Lcom/facebook/imagepipeline/memory/b;Lz3/k;)V", "Ljava/io/InputStream;", "inputStream", "La6/z;", "g", "(Ljava/io/InputStream;)La6/z;", "", "bytes", "i", "([B)La6/z;", "", "initialCapacity", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/io/InputStream;I)La6/z;", "Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "outputStream", "f", "(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;)La6/z;", "j", "()Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "k", "(I)Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/imagepipeline/memory/b;", "b", "Lz3/k;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0134a0 implements InterfaceC46679h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5659b pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C46682k pooledByteStreams;

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: f */
    public final C0166z m607f(@NotNull InputStream inputStream, @NotNull MemoryPooledByteBufferOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.pooledByteStreams.m102901a(inputStream, outputStream);
        return outputStream.mo9487a();
    }

    @Override // p819z3.InterfaceC46679h
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0166z mo602a(@NotNull InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
        try {
            return m607f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p819z3.InterfaceC46679h
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0166z mo606e(@NotNull InputStream inputStream, int initialCapacity) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
        try {
            return m607f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p819z3.InterfaceC46679h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0166z mo604c(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                C0166z c0166zM9490h = memoryPooledByteBufferOutputStream.mo9487a();
                memoryPooledByteBufferOutputStream.close();
                return c0166zM9490h;
            } catch (IOException e11) {
                throw C45713m.m100908a(e11);
            }
        } catch (Throwable th2) {
            memoryPooledByteBufferOutputStream.close();
            throw th2;
        }
    }

    @Override // p819z3.InterfaceC46679h
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo603b() {
        return new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
    }

    @Override // p819z3.InterfaceC46679h
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo605d(int initialCapacity) {
        return new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
    }

    public C0134a0(@NotNull AbstractC5659b pool, @NotNull C46682k pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.pool = pool;
        this.pooledByteStreams = pooledByteStreams;
    }
}
