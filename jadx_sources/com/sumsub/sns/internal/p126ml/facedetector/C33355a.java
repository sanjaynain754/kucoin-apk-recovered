package com.sumsub.sns.internal.p126ml.facedetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import com.sumsub.sns.internal.p126ml.core.AbstractC33324c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33329h;
import com.sumsub.sns.internal.p126ml.core.C33321a;
import com.sumsub.sns.internal.p126ml.core.buffer.C33323a;
import com.sumsub.sns.internal.p126ml.core.pipeline.C33339b;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33357a;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33358b;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33359c;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33362f;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33363g;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33364h;
import com.sumsub.sns.internal.p126ml.facedetector.pipeline.C33365a;
import com.sumsub.sns.internal.p126ml.facedetector.utils.AbstractC33366a;
import com.sumsub.sns.internal.p126ml.facedetector.utils.C33367b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.InterpreterApi;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.facedetector.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33355a extends AbstractC33329h {

    /* JADX INFO: renamed from: g */
    public final C33362f f68009g;

    /* JADX INFO: renamed from: h */
    public float[][][] f68010h;

    /* JADX INFO: renamed from: i */
    public float[][][] f68011i;

    /* JADX INFO: renamed from: j */
    public ArrayList f68012j;

    /* JADX INFO: renamed from: k */
    public C33364h f68013k;

    /* JADX INFO: renamed from: l */
    public C33367b f68014l;

    /* JADX INFO: renamed from: m */
    public final C33321a f68015m;

    /* JADX INFO: renamed from: n */
    public final String f68016n;

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object mo71636a(Object obj, long j11) {
        float width;
        float width2;
        float height;
        char c11;
        Bitmap bitmap = (Bitmap) obj;
        C33367b c33367b = this.f68014l;
        if (c33367b == null) {
            c33367b = null;
        }
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        C33364h c33364h = this.f68013k;
        if (c33364h == null) {
            c33364h = null;
        }
        float[][][] fArr = this.f68011i;
        if (fArr == null) {
            fArr = null;
        }
        float[][][] fArr2 = this.f68010h;
        if (fArr2 == null) {
            fArr2 = null;
        }
        ArrayList arrayList = this.f68012j;
        ArrayList arrayList2 = arrayList != null ? arrayList : null;
        c33367b.getClass();
        char c12 = 1;
        if (fArr2.length == 1) {
            int i11 = 0;
            float[][] fArr3 = fArr2[0];
            int length = fArr3.length;
            c33364h.getClass();
            int i12 = 896;
            if (length == 896) {
                int i13 = 16;
                if (fArr3[0].length == 16) {
                    if (fArr.length == 1) {
                        float[][] fArr4 = fArr[0];
                        if (fArr4.length == 896 && fArr4[0].length == 1) {
                            int i14 = c33364h.f68043b;
                            if (i14 <= 0 && i14 != -1) {
                                throw new IllegalArgumentException("MaxNumberOfFaces must be greater than 0 or -1");
                            }
                            ArrayList arrayList3 = new ArrayList(896);
                            int i15 = 0;
                            while (i15 < 896) {
                                float f11 = fArr[i11][i15][i11];
                                int i16 = i15;
                                float f12 = f11;
                                if (f11 < -100.0d) {
                                    f12 = -((float) 100.0d);
                                }
                                int i17 = i11;
                                ArrayList arrayList4 = arrayList2;
                                if (f12 > 100.0d) {
                                    f12 = (float) 100.0d;
                                }
                                float fExp = 1.0f / (((float) Math.exp(-f12)) + 1.0f);
                                if (fExp <= Float.MIN_VALUE) {
                                    fExp = Float.MIN_VALUE;
                                }
                                arrayList3.add(Float.valueOf(fExp));
                                i15 = i16 + 1;
                                arrayList2 = arrayList4;
                                i11 = i17;
                            }
                            int i18 = i11;
                            ArrayList arrayList5 = arrayList2;
                            ArrayList arrayList6 = new ArrayList();
                            int i19 = i18;
                            while (i19 < i12) {
                                ArrayList arrayList7 = arrayList5;
                                if (((Number) arrayList3.get(i19)).floatValue() < c33364h.f68042a) {
                                    c11 = c12;
                                } else {
                                    float[][] fArr5 = fArr2[i18];
                                    float[] fArr6 = new float[i13];
                                    float[] fArr7 = fArr5[i19];
                                    float f13 = fArr7[i18];
                                    float f14 = fArr7[c12];
                                    c11 = c12;
                                    char c13 = 2;
                                    float f15 = fArr7[2];
                                    float f16 = fArr7[3];
                                    float f17 = ((f13 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68019c) + ((C33357a) arrayList7.get(i19)).f68017a;
                                    float f18 = ((f14 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68020d) + ((C33357a) arrayList7.get(i19)).f68018b;
                                    float f19 = 2;
                                    float f21 = ((f16 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68020d) / f19;
                                    float f22 = ((f15 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68019c) / f19;
                                    fArr6[i18] = f18 - f21;
                                    fArr6[c11] = f17 - f22;
                                    fArr6[2] = f18 + f21;
                                    fArr6[3] = f17 + f22;
                                    int i21 = i18;
                                    while (i21 < 6) {
                                        int i22 = i21 * 2;
                                        int i23 = i22 + 4;
                                        float[] fArr8 = fArr5[i19];
                                        float f23 = fArr8[i23];
                                        int i24 = i22 + 5;
                                        float f24 = fArr8[i24];
                                        fArr6[i23] = ((f23 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68019c) + ((C33357a) arrayList7.get(i19)).f68017a;
                                        fArr6[i24] = ((f24 / 128.0f) * ((C33357a) arrayList7.get(i19)).f68020d) + ((C33357a) arrayList7.get(i19)).f68018b;
                                        i21++;
                                        c13 = c13;
                                    }
                                    char c14 = c13;
                                    float fFloatValue = ((Number) arrayList3.get(i19)).floatValue();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (int i25 = 4; i25 < 15; i25 += 2) {
                                        arrayList8.add(new PointF(fArr6[i25], fArr6[i25 + 1]));
                                    }
                                    arrayList6.add(new C33359c(fFloatValue, new RectF(fArr6[c11], fArr6[i18], fArr6[3], fArr6[c14]), arrayList8));
                                }
                                i19++;
                                arrayList5 = arrayList7;
                                c12 = c11;
                                i13 = 16;
                                i12 = 896;
                                i18 = 0;
                            }
                            List<C33359c> listM71670a = C33367b.m71670a(arrayList6);
                            int i26 = c33364h.f68043b;
                            if (i26 != -1) {
                                listM71670a = C33367b.m71671a(listM71670a, i26);
                            }
                            if (size.getWidth() != size.getHeight()) {
                                float f25 = 0.0f;
                                if (size.getWidth() < size.getHeight()) {
                                    width2 = (1.0f - (size.getWidth() / size.getHeight())) / 2.0f;
                                    height = size.getHeight() / size.getWidth();
                                    width = 1.0f;
                                } else {
                                    float height2 = (1.0f - (size.getHeight() / size.getWidth())) / 2.0f;
                                    width = size.getWidth() / size.getHeight();
                                    width2 = 0.0f;
                                    f25 = height2;
                                    height = 1.0f;
                                }
                                for (C33359c c33359c : listM71670a) {
                                    RectF rectF = c33359c.f68035b;
                                    rectF.left = (rectF.left - width2) * height;
                                    rectF.right = (rectF.right - width2) * height;
                                    rectF.top = (rectF.top - f25) * width;
                                    rectF.bottom = (rectF.bottom - f25) * width;
                                    int size2 = c33359c.f68036c.size();
                                    for (int i27 = 0; i27 < size2; i27++) {
                                        ((PointF) c33359c.f68036c.get(i27)).x -= width2;
                                        ((PointF) c33359c.f68036c.get(i27)).x *= height;
                                        ((PointF) c33359c.f68036c.get(i27)).y -= f25;
                                        ((PointF) c33359c.f68036c.get(i27)).y *= width;
                                    }
                                }
                            }
                            return new C33363g(listM71670a);
                        }
                    }
                    throw new IllegalArgumentException("RawScores dimensions is not correct");
                }
            }
        }
        throw new IllegalArgumentException("RawBoxes dimensions is not correct");
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: c */
    public final Map mo71639c() {
        float[][][] fArr = this.f68010h;
        if (fArr == null) {
            fArr = null;
        }
        Pair pairM90091to = TuplesKt.m90091to(0, fArr);
        float[][][] fArr2 = this.f68011i;
        return MapsKt.mapOf(pairM90091to, TuplesKt.m90091to(1, fArr2 != null ? fArr2 : null));
    }

    public C33355a(Context context, C33362f c33362f) {
        super("MlSolution.TfFaceDetection");
        this.f68009g = c33362f;
        this.f68015m = new C33321a(context);
        this.f68016n = "Face detector";
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: b */
    public final AbstractC33324c mo71638b() {
        return this.f68015m;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: d */
    public final String mo71640d() {
        return this.f68016n;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object[] mo71637a(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap = (Bitmap) obj;
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        C33339b c33339b = new C33339b(iMax, iMax);
        C33365a c33365a = new C33365a();
        Object objM71660a = c33339b.m71660a(bitmap);
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objM71660a, 128, 128, false);
        } catch (OutOfMemoryError unused) {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objM71660a, 128, 128, false);
            } catch (InterruptedException unused2) {
                throw new AssertionError();
            }
        }
        C33323a c33323a = (C33323a) c33365a.m71660a(bitmapCreateScaledBitmap);
        int i11 = 1;
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
    public final void mo71658a(InterpreterApi interpreterApi) {
        int[] iArrShape = interpreterApi.getOutputTensor(0).shape();
        int i11 = iArrShape[0];
        float[][][] fArr = new float[i11][][];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArrShape[1];
            float[][] fArr2 = new float[i13][];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr2[i14] = new float[iArrShape[2]];
            }
            fArr[i12] = fArr2;
        }
        this.f68010h = fArr;
        int[] iArrShape2 = interpreterApi.getOutputTensor(1).shape();
        int i15 = iArrShape2[0];
        float[][][] fArr3 = new float[i15][][];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArrShape2[1];
            float[][] fArr4 = new float[i17][];
            for (int i18 = 0; i18 < i17; i18++) {
                fArr4[i18] = new float[iArrShape2[2]];
            }
            fArr3[i16] = fArr4;
        }
        this.f68011i = fArr3;
        this.f68012j = AbstractC33366a.m71667a(new C33358b());
        C33362f c33362f = this.f68009g;
        this.f68013k = new C33364h(c33362f.f68039a, c33362f.f68040b);
        this.f68014l = new C33367b();
    }
}
