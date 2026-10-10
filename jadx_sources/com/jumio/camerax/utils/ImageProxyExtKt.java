package com.jumio.camerax.utils;

import androidx.camera.core.ImageProxy;
import com.jumio.core.util.ReflectionUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"INVALID_ADDRESS", "", "nv21Bytes", "", "Landroidx/camera/core/ImageProxy;", "getNv21Bytes", "(Landroidx/camera/core/ImageProxy;)[B", "singlePlaneByteArray", "getSinglePlaneByteArray", "overlaps", "", "Ljava/nio/ByteBuffer;", "other", "getAddress", "Ljava/nio/Buffer;", "toArray", "jumio-camerax_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageProxyExtKt {
    /* JADX INFO: renamed from: a */
    public static final long m14429a(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.isDirect()) {
                return ((Number) ReflectionUtil.INSTANCE.getMember(Buffer.class, "address", byteBuffer, true)).longValue();
            }
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    @NotNull
    public static final byte[] getNv21Bytes(@NotNull ImageProxy imageProxy) {
        int width;
        boolean z11;
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        int height = imageProxy.getHeight() * imageProxy.getWidth();
        byte[] bArr = new byte[(((imageProxy.getHeight() * imageProxy.getWidth()) / 4) * 2) + height];
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ByteBuffer buffer2 = imageProxy.getPlanes()[1].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer2, "getBuffer(...)");
        ByteBuffer buffer3 = imageProxy.getPlanes()[2].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer3, "getBuffer(...)");
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        if (rowStride == imageProxy.getWidth()) {
            buffer.get(bArr, 0, height);
            width = height;
        } else {
            long j11 = rowStride;
            long j12 = -j11;
            width = 0;
            while (width < height) {
                j12 += j11;
                buffer.position((int) j12);
                buffer.get(bArr, width, imageProxy.getWidth());
                width += imageProxy.getWidth();
            }
        }
        int rowStride2 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[2].getPixelStride();
        if (pixelStride == 2 && rowStride2 == imageProxy.getWidth()) {
            long jM14429a = m14429a(buffer2);
            long jM14429a2 = m14429a(buffer3);
            if (jM14429a == -1 || jM14429a2 == -1) {
                if (buffer3.isReadOnly()) {
                    z11 = false;
                } else {
                    byte b11 = buffer3.get(1);
                    byte b12 = (byte) (~b11);
                    try {
                        buffer3.put(1, b12);
                        z11 = buffer2.get(0) == b12;
                        buffer3.put(1, b11);
                    } catch (Exception unused) {
                        z11 = false;
                    }
                }
            } else if (jM14429a == jM14429a2 + 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                buffer3.position(0);
                buffer2.position(0);
                buffer3.get(bArr, height, 1);
                buffer2.get(bArr, height + 1, buffer2.remaining());
                return bArr;
            }
        }
        int height2 = imageProxy.getHeight() / 2;
        for (int i11 = 0; i11 < height2; i11++) {
            int width2 = imageProxy.getWidth() / 2;
            for (int i12 = 0; i12 < width2; i12++) {
                int i13 = (i11 * rowStride2) + (i12 * pixelStride);
                int i14 = width + 1;
                bArr[width] = buffer3.get(i13);
                width += 2;
                bArr[i14] = buffer2.get(i13);
            }
        }
        return bArr;
    }

    @NotNull
    public static final byte[] getSinglePlaneByteArray(@NotNull ImageProxy imageProxy) {
        ByteBuffer buffer;
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        ImageProxy.PlaneProxy[] planes = imageProxy.getPlanes();
        Intrinsics.checkNotNullExpressionValue(planes, "getPlanes(...)");
        ImageProxy.PlaneProxy planeProxy = (ImageProxy.PlaneProxy) ArraysKt.firstOrNull(planes);
        if (planeProxy == null || (buffer = planeProxy.getBuffer()) == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }
}
