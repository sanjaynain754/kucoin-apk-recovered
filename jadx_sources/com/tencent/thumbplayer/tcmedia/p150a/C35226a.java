package com.tencent.thumbplayer.tcmedia.p150a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.a */
/* JADX INFO: loaded from: classes62.dex */
public class C35226a {
    /* JADX INFO: renamed from: a */
    public static Bitmap m77324a(TPVideoFrame tPVideoFrame) {
        int i11;
        int i12;
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || (i11 = tPVideoFrame.height) == 0 || (i12 = tPVideoFrame.width) == 0) {
            return null;
        }
        return m77325a(bArr[0], i12, i11, tPVideoFrame.rotation);
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m77325a(byte[] bArr, int i11, int i12, int i13) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.RGB_565);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        if (i13 == 0) {
            return bitmapCreateBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i13);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap[] m77326b(TPVideoFrame tPVideoFrame) {
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || tPVideoFrame.height == 0 || tPVideoFrame.width == 0) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[bArr.length];
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = tPVideoFrame.data;
            if (i11 >= bArr2.length) {
                return bitmapArr;
            }
            bitmapArr[i11] = m77325a(bArr2[i11], tPVideoFrame.width, tPVideoFrame.height, tPVideoFrame.rotation);
            i11++;
        }
    }
}
