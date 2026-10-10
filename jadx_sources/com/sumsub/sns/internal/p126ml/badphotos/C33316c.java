package com.sumsub.sns.internal.p126ml.badphotos;

import android.content.Context;
import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.badphotos.models.C33319a;
import com.sumsub.sns.internal.p126ml.badphotos.pipeline.C33320a;
import com.sumsub.sns.internal.p126ml.core.AbstractC33324c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33329h;
import com.sumsub.sns.internal.p126ml.core.C33322b;
import com.sumsub.sns.internal.p126ml.core.buffer.C33323a;
import com.sumsub.sns.internal.p126ml.core.pipeline.C33338a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.tensorflow.lite.DataType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.badphotos.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33316c extends AbstractC33329h {

    /* JADX INFO: renamed from: k */
    public static final C33314a f67931k = new C33314a();

    /* JADX INFO: renamed from: g */
    public final long f67932g;

    /* JADX INFO: renamed from: h */
    public final float[][][][] f67933h;

    /* JADX INFO: renamed from: i */
    public final C33322b f67934i;

    /* JADX INFO: renamed from: j */
    public final String f67935j;

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object mo71636a(Object obj, long j11) {
        return new C33319a(this.f67933h[0][0][0][0], j11);
    }

    public C33316c(Context context, OkHttpClient okHttpClient, String str, long j11, String str2, boolean z11) {
        super("MlSolution.BadPhotosDetector");
        this.f67932g = j11;
        this.f67933h = new float[][][][]{new float[][][]{new float[][]{new float[]{0.0f}}, new float[][]{new float[]{0.0f}}}};
        this.f67934i = new C33322b(context, okHttpClient, str, z11, "MlSolution.BadPhotosDetector");
        this.f67935j = "Unsatisfactory photos detector";
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: b */
    public final AbstractC33324c mo71638b() {
        return this.f67934i;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: c */
    public final Map mo71639c() {
        HashMap map = new HashMap();
        map.put(0, this.f67933h);
        return map;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: d */
    public final String mo71640d() {
        return this.f67935j;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object[] mo71637a(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        C33338a c33338a;
        Bitmap bitmap = (Bitmap) obj;
        C33320a c33320a = new C33320a();
        int i11 = 1;
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 512, 512, true);
        } catch (OutOfMemoryError unused) {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 512, 512, true);
            } catch (InterruptedException unused2) {
                throw new AssertionError();
            }
        }
        Bitmap bitmap2 = bitmapCreateScaledBitmap;
        try {
            int[] iArr = new int[bitmap2.getHeight() * bitmap2.getWidth()];
            bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            c33338a = new C33338a(bitmap2.getWidth(), bitmap2.getHeight(), iArr);
        } catch (OutOfMemoryError unused3) {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
                int[] iArr2 = new int[bitmap2.getHeight() * bitmap2.getWidth()];
                bitmap2.getPixels(iArr2, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                c33338a = new C33338a(bitmap2.getWidth(), bitmap2.getHeight(), iArr2);
            } catch (InterruptedException unused4) {
                throw new AssertionError();
            }
        }
        C33323a c33323a = (C33323a) c33320a.m71660a(c33338a);
        for (int i12 : c33323a.f67952b) {
            i11 *= i12;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(DataType.FLOAT32.byteSize() * i11);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.asFloatBuffer().put(c33323a.f67951a);
        return new Object[]{byteBufferAllocateDirect};
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final long mo71635a() {
        return this.f67932g;
    }
}
