package io.github.crow_misia.libyuv;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ze0.AbstractC46784o;
import ze0.C46785p;

/* JADX INFO: compiled from: PlanePrimitive.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lio/github/crow_misia/libyuv/PlanePrimitive;", "Lze0/o;", "Lze0/p;", "rowStride", "Ljava/nio/ByteBuffer;", "buffer", "", "bufferSize", "<init>", "(ILjava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "c", "b", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "d", "Companion", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class PlanePrimitive extends AbstractC46784o {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int rowStride;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final ByteBuffer buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int bufferSize;

    /* JADX INFO: compiled from: PlanePrimitive.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m90084d2 = {"Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;", "", "<init>", "()V", "create", "Lio/github/crow_misia/libyuv/PlanePrimitive;", "rowStride", "", "buffer", "Ljava/nio/ByteBuffer;", "bufferSize", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final PlanePrimitive create(int i11, @NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return create$default(this, i11, buffer, 0, 4, null);
        }

        public Companion() {
        }

        public static /* synthetic */ PlanePrimitive create$default(Companion companion, int i11, ByteBuffer byteBuffer, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                i12 = byteBuffer.capacity();
            }
            return companion.create(i11, byteBuffer, i12);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final PlanePrimitive create(int rowStride, @NotNull ByteBuffer buffer, int bufferSize) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return new PlanePrimitive(C46785p.m103110a(rowStride), buffer, bufferSize, null);
        }
    }

    public /* synthetic */ PlanePrimitive(int i11, ByteBuffer byteBuffer, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, byteBuffer, i12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanePrimitive)) {
            return false;
        }
        PlanePrimitive planePrimitive = (PlanePrimitive) other;
        return C46785p.m103111b(this.rowStride, planePrimitive.rowStride) && Intrinsics.areEqual(this.buffer, planePrimitive.buffer) && this.bufferSize == planePrimitive.bufferSize;
    }

    public /* synthetic */ PlanePrimitive(int i11, ByteBuffer byteBuffer, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, byteBuffer, (i13 & 4) != 0 ? byteBuffer.capacity() : i12, null);
    }

    @Override // ze0.AbstractC46784o
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    @Override // ze0.AbstractC46784o
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getBufferSize() {
        return this.bufferSize;
    }

    @Override // ze0.AbstractC46784o
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getRowStride() {
        return this.rowStride;
    }

    public int hashCode() {
        return (((C46785p.m103112c(this.rowStride) * 31) + this.buffer.hashCode()) * 31) + Integer.hashCode(this.bufferSize);
    }

    @NotNull
    public String toString() {
        return "PlanePrimitive(rowStride=" + ((Object) C46785p.m103114e(this.rowStride)) + ", buffer=" + this.buffer + ", bufferSize=" + this.bufferSize + ')';
    }

    public PlanePrimitive(int i11, ByteBuffer buffer, int i12) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.rowStride = i11;
        this.buffer = buffer;
        this.bufferSize = i12;
    }
}
