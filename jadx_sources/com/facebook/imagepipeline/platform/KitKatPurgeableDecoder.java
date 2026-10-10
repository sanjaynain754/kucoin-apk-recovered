package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p006a4.AbstractC0110a;
import p008a6.C0161u;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@TargetApi(19)
@InterfaceC45704d
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c */
    public final C0161u f9185c;

    /* JADX INFO: renamed from: h */
    public static void m9520h(byte[] bArr, int i11) {
        bArr[i11] = -1;
        bArr[i11 + 1] = -39;
    }

    @InterfaceC45704d
    public KitKatPurgeableDecoder(C0161u c0161u) {
        this.f9185c = c0161u;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo9502c(AbstractC0110a<PooledByteBuffer> abstractC0110a, BitmapFactory.Options options) {
        PooledByteBuffer pooledByteBufferM565l = abstractC0110a.m565l();
        int size = pooledByteBufferM565l.size();
        AbstractC0110a<byte[]> abstractC0110aM719a = this.f9185c.m719a(size);
        try {
            byte[] bArrM565l = abstractC0110aM719a.m565l();
            pooledByteBufferM565l.mo732d(0, bArrM565l, 0, size);
            return (Bitmap) C45708h.m100897h(BitmapFactory.decodeByteArray(bArrM565l, 0, size, options), "BitmapFactory returned null");
        } finally {
            AbstractC0110a.m555j(abstractC0110aM719a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo9503d(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z11;
        if (DalvikPurgeableDecoder.m9500e(abstractC0110a, i11)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f9172b;
        }
        PooledByteBuffer pooledByteBufferM565l = abstractC0110a.m565l();
        if (i11 <= pooledByteBufferM565l.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        int i12 = i11 + 2;
        AbstractC0110a<byte[]> abstractC0110aM719a = this.f9185c.m719a(i12);
        try {
            byte[] bArrM565l = abstractC0110aM719a.m565l();
            pooledByteBufferM565l.mo732d(0, bArrM565l, 0, i11);
            if (bArr != null) {
                m9520h(bArrM565l, i11);
                i11 = i12;
            }
            return (Bitmap) C45708h.m100897h(BitmapFactory.decodeByteArray(bArrM565l, 0, i11, options), "BitmapFactory returned null");
        } finally {
            AbstractC0110a.m555j(abstractC0110aM719a);
        }
    }
}
