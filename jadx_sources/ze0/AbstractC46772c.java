package ze0;

import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ze0.c */
/* JADX INFO: compiled from: AbstractBuffer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0012\u0010\u001cR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lze0/c;", "Lze0/e;", "Ljava/nio/ByteBuffer;", "buffer", "Landroid/graphics/Rect;", "cropRect", "", "Lze0/o;", "planes", "Ljava/lang/Runnable;", "releaseCallback", "<init>", "(Ljava/nio/ByteBuffer;Landroid/graphics/Rect;[Lze0/o;Ljava/lang/Runnable;)V", "", "close", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/nio/ByteBuffer;", "b", "Ljava/nio/ByteBuffer;", "getBuffer$core_release", "setBuffer$core_release", "(Ljava/nio/ByteBuffer;)V", "value", "c", "[Lze0/o;", "getPlanes", "()[Lze0/o;", "([Lze0/o;)V", "d", "Landroid/graphics/Rect;", "getCropRect", "()Landroid/graphics/Rect;", "setCropRect", "(Landroid/graphics/Rect;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "e", "Ljava/util/concurrent/atomic/AtomicReference;", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBuffer.kt\nio/github/crow_misia/libyuv/AbstractBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,89:1\n1#2:90\n13472#3,2:91\n13472#3,2:93\n13472#3,2:95\n*S KotlinDebug\n*F\n+ 1 AbstractBuffer.kt\nio/github/crow_misia/libyuv/AbstractBuffer\n*L\n57#1:91,2\n70#1:93,2\n81#1:95,2\n*E\n"})
public abstract class AbstractC46772c implements InterfaceC46774e {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ByteBuffer buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public AbstractC46784o[] planes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Rect cropRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Runnable> releaseCallback;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.buffer = null;
        Runnable andSet = this.releaseCallback.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        m103074b(new AbstractC46784o[0]);
    }

    public AbstractC46772c(@Nullable ByteBuffer byteBuffer, @NotNull Rect cropRect, @NotNull AbstractC46784o[] planes, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(planes, "planes");
        this.buffer = byteBuffer;
        this.planes = planes;
        this.cropRect = cropRect;
        this.releaseCallback = new AtomicReference<>(runnable);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public ByteBuffer m103073a() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            return byteBuffer;
        }
        int iMo87798b = 0;
        for (AbstractC46784o abstractC46784o : getPlanes()) {
            iMo87798b += abstractC46784o.mo87798b();
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMo87798b);
        this.buffer = byteBufferAllocateDirect;
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: renamed from: b */
    public void m103074b(@NotNull AbstractC46784o[] abstractC46784oArr) {
        Intrinsics.checkNotNullParameter(abstractC46784oArr, "<set-?>");
        this.planes = abstractC46784oArr;
    }

    @Override // ze0.InterfaceC46774e
    @NotNull
    public Rect getCropRect() {
        return this.cropRect;
    }

    @Override // ze0.InterfaceC46774e
    @NotNull
    public AbstractC46784o[] getPlanes() {
        return this.planes;
    }
}
