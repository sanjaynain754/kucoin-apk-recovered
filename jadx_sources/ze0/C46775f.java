package ze0;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ze0.f */
/* JADX INFO: compiled from: BufferExt.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Ljava/nio/ByteBuffer;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "c", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "", "Lze0/j;", "capacities", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)[Ljava/nio/ByteBuffer;", "b", "(Ljava/nio/ByteBuffer;Ljava/util/List;)[Ljava/nio/ByteBuffer;", "core_release"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBufferExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferExt.kt\nio/github/crow_misia/libyuv/BufferExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n59#1,9:72\n59#1,5:81\n66#1,2:88\n1#2:71\n1869#3,2:86\n*S KotlinDebug\n*F\n+ 1 BufferExt.kt\nio/github/crow_misia/libyuv/BufferExtKt\n*L\n28#1:72,9\n39#1:81,5\n39#1:88,2\n44#1:86,2\n*E\n"})
public final class C46775f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ByteBuffer[] m103077a(@NotNull List<C46779j> capacities) {
        Intrinsics.checkNotNullParameter(capacities, "capacities");
        if (capacities.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Yuv yuv = Yuv.INSTANCE;
        Iterator<T> it = capacities.iterator();
        int value = 0;
        while (it.hasNext()) {
            value += ((C46779j) it.next()).getValue();
        }
        return m103078b(yuv.allocNativeBuffer(value), capacities);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ByteBuffer[] m103078b(@NotNull ByteBuffer byteBuffer, @NotNull List<C46779j> capacities) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(capacities, "capacities");
        if (capacities.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            ByteBuffer[] byteBufferArr = new ByteBuffer[capacities.size() + 1];
            Iterator<T> it = capacities.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                int value = ((C46779j) it.next()).getValue();
                byteBuffer.position(i11);
                i11 += value;
                byteBuffer.limit(i11);
                byteBufferArr[i12] = byteBuffer.slice();
                i12++;
            }
            if (i11 > iLimit) {
                throw new IllegalStateException("buffer limit is bigger than expected");
            }
            byteBufferArr[i12] = byteBuffer;
            ByteBuffer[] byteBufferArr2 = (ByteBuffer[]) ArraysKt.requireNoNulls(byteBufferArr);
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            return byteBufferArr2;
        } catch (Throwable th2) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Bitmap m103079c(@NotNull ByteBuffer byteBuffer, int i11, int i12, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        byteBuffer.position(0);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        return bitmapCreateBitmap;
    }
}
