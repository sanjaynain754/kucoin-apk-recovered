package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p008a6.C0166z;
import p008a6.InterfaceC0164x;
import p819z3.AbstractC46681j;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MemoryPooledByteBufferOutputStream.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "Lz3/j;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "", "initialCapacity", "<init>", "(Lcom/facebook/imagepipeline/memory/b;I)V", "La6/z;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()La6/z;", "size", "()I", "oneByte", "", "write", "(I)V", "", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "count", "([BII)V", "close", "()V", "newLength", "g", "b", "Lcom/facebook/imagepipeline/memory/b;", "La4/a;", "La6/x;", "c", "La4/a;", "bufRef", "d", "I", "InvalidStreamException", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MemoryPooledByteBufferOutputStream extends AbstractC46681j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5659b pool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AbstractC0110a<InterfaceC0164x> bufRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int count;

    /* JADX INFO: compiled from: MemoryPooledByteBufferOutputStream.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(AbstractC5659b abstractC5659b, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5659b, (i12 & 2) != 0 ? abstractC5659b.m9498D() : i11);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        write(new byte[]{(byte) oneByte});
    }

    /* JADX INFO: renamed from: b */
    public final void m9488b() {
        if (!AbstractC0110a.m557o(this.bufRef)) {
            throw new InvalidStreamException();
        }
    }

    @Override // p819z3.AbstractC46681j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC0110a.m555j(this.bufRef);
        this.bufRef = null;
        this.count = -1;
        super.close();
    }

    @Override // p819z3.AbstractC46681j
    /* JADX INFO: renamed from: size, reason: from getter */
    public int getCount() {
        return this.count;
    }

    @JvmOverloads
    public MemoryPooledByteBufferOutputStream(@NotNull AbstractC5659b pool, int i11) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i11 > 0) {
            this.pool = pool;
            this.count = 0;
            this.bufRef = AbstractC0110a.m560u(pool.get(i11), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public final void m9489g(int newLength) throws Throwable {
        m9488b();
        AbstractC0110a<InterfaceC0164x> abstractC0110a = this.bufRef;
        if (abstractC0110a != null) {
            Intrinsics.checkNotNull(abstractC0110a);
            if (newLength <= abstractC0110a.m565l().getSize()) {
                return;
            }
            InterfaceC0164x interfaceC0164x = this.pool.get(newLength);
            Intrinsics.checkNotNullExpressionValue(interfaceC0164x, "get(...)");
            InterfaceC0164x interfaceC0164x2 = interfaceC0164x;
            AbstractC0110a<InterfaceC0164x> abstractC0110a2 = this.bufRef;
            if (abstractC0110a2 != null) {
                Intrinsics.checkNotNull(abstractC0110a2);
                abstractC0110a2.m565l().mo660h(0, interfaceC0164x2, 0, this.count);
                AbstractC0110a<InterfaceC0164x> abstractC0110a3 = this.bufRef;
                Intrinsics.checkNotNull(abstractC0110a3);
                abstractC0110a3.close();
                this.bufRef = AbstractC0110a.m560u(interfaceC0164x2, this.pool);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p819z3.AbstractC46681j
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0166z mo9487a() {
        m9488b();
        AbstractC0110a<InterfaceC0164x> abstractC0110a = this.bufRef;
        if (abstractC0110a != null) {
            return new C0166z(abstractC0110a, this.count);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int count) throws Throwable {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (offset >= 0 && count >= 0 && offset + count <= buffer.length) {
            m9488b();
            m9489g(this.count + count);
            AbstractC0110a<InterfaceC0164x> abstractC0110a = this.bufRef;
            if (abstractC0110a != null) {
                abstractC0110a.m565l().mo659g(this.count, buffer, offset, count);
                this.count += count;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + offset + "; regionLength=" + count);
    }
}
