package p391k3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.p060ml.MTensor;
import org.jetbrains.annotations.NotNull;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k3.f */
/* JADX INFO: compiled from: Operator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0007¢\u0006\u0004\b\u0006\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\fJ\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, m90084d2 = {"Lk3/f;", "", "<init>", "()V", "Lcom/facebook/appevents/ml/MTensor;", "x", "b", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)V", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "i", "(Lcom/facebook/appevents/ml/MTensor;)V", "", "startDim", "f", "(Lcom/facebook/appevents/ml/MTensor;I)V", "", "tensors", "([Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "j", "d", "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "", "texts", "seqLength", "e", "([Ljava/lang/String;ILcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "k", "(Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", CmcdData.Factory.STREAM_TYPE_LIVE, "c", "poolSize", "g", "(Lcom/facebook/appevents/ml/MTensor;I)Lcom/facebook/appevents/ml/MTensor;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40877f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40877f f90889a = new C40877f();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m89461a(@NotNull MTensor x11, @NotNull MTensor b11) {
        if (C42757a.m93689d(C40877f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(b11, "b");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            int iM8284b3 = x11.m8284b(2);
            float[] data = x11.getData();
            float[] data2 = b11.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                for (int i12 = 0; i12 < iM8284b2; i12++) {
                    for (int i13 = 0; i13 < iM8284b3; i13++) {
                        int i14 = (i11 * iM8284b2 * iM8284b3) + (i12 * iM8284b3) + i13;
                        data[i14] = data[i14] + data2[i13];
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final MTensor m89462b(@NotNull MTensor[] tensors) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int iM8284b = tensors[0].m8284b(0);
            int iM8284b2 = 0;
            for (MTensor mTensor : tensors) {
                iM8284b2 += mTensor.m8284b(1);
            }
            MTensor mTensor2 = new MTensor(new int[]{iM8284b, iM8284b2});
            float[] data = mTensor2.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                int i12 = i11 * iM8284b2;
                int length = tensors.length;
                for (int i13 = 0; i13 < length; i13++) {
                    float[] data2 = tensors[i13].getData();
                    int iM8284b3 = tensors[i13].m8284b(1);
                    System.arraycopy(data2, i11 * iM8284b3, data, i12, iM8284b3);
                    i12 += iM8284b3;
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final MTensor m89463c(@NotNull MTensor x11, @NotNull MTensor w11) {
        MTensor mTensor;
        MTensor mTensor2 = null;
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(w11, "w");
            int i11 = 0;
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            int iM8284b3 = x11.m8284b(2);
            int iM8284b4 = w11.m8284b(0);
            int i12 = (iM8284b2 - iM8284b4) + 1;
            int iM8284b5 = w11.m8284b(2);
            MTensor mTensor3 = new MTensor(new int[]{iM8284b, i12, iM8284b5});
            float[] data = x11.getData();
            float[] data2 = mTensor3.getData();
            float[] data3 = w11.getData();
            int i13 = 0;
            while (i13 < iM8284b) {
                int i14 = i11;
                while (i14 < iM8284b5) {
                    int i15 = i11;
                    while (i15 < i12) {
                        float f11 = 0.0f;
                        while (i11 < iM8284b4) {
                            mTensor = mTensor2;
                            for (int i16 = 0; i16 < iM8284b3; i16++) {
                                try {
                                    f11 += data[(iM8284b2 * iM8284b3 * i13) + ((i11 + i15) * iM8284b3) + i16] * data3[(((i11 * iM8284b3) + i16) * iM8284b5) + i14];
                                } catch (Throwable th2) {
                                    th = th2;
                                    C42757a.m93687b(th, C40877f.class);
                                    return mTensor;
                                }
                            }
                            i11++;
                            mTensor2 = mTensor;
                        }
                        MTensor mTensor4 = mTensor2;
                        data2[(i12 * iM8284b5 * i13) + (i15 * iM8284b5) + i14] = f11;
                        i15++;
                        mTensor2 = mTensor4;
                        i11 = 0;
                    }
                    i14++;
                    i11 = 0;
                }
                i13++;
                i11 = 0;
            }
            return mTensor3;
        } catch (Throwable th3) {
            th = th3;
            mTensor = null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final MTensor m89464d(@NotNull MTensor x11, @NotNull MTensor w11, @NotNull MTensor b11) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(w11, "w");
            Intrinsics.checkNotNullParameter(b11, "b");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = b11.m8284b(0);
            MTensor mTensorM89468h = m89468h(x11, w11);
            float[] data = b11.getData();
            float[] data2 = mTensorM89468h.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                for (int i12 = 0; i12 < iM8284b2; i12++) {
                    int i13 = (i11 * iM8284b2) + i12;
                    data2[i13] = data2[i13] + data[i12];
                }
            }
            return mTensorM89468h;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final MTensor m89465e(@NotNull String[] texts, int seqLength, @NotNull MTensor w11) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w11, "w");
            int length = texts.length;
            int iM8284b = w11.m8284b(1);
            MTensor mTensor = new MTensor(new int[]{length, seqLength, iM8284b});
            float[] data = mTensor.getData();
            float[] data2 = w11.getData();
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArrM89476d = C40878g.f90890a.m89476d(texts[i11], seqLength);
                for (int i12 = 0; i12 < seqLength; i12++) {
                    System.arraycopy(data2, iArrM89476d[i12] * iM8284b, data, (iM8284b * seqLength * i11) + (iM8284b * i12), iM8284b);
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m89466f(@NotNull MTensor x11, int startDim) {
        if (C42757a.m93689d(C40877f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            if (startDim >= x11.m8285c()) {
                return;
            }
            int iM8285c = x11.m8285c();
            int iM8284b = 1;
            for (int i11 = startDim; i11 < iM8285c; i11++) {
                iM8284b *= x11.m8284b(i11);
            }
            int[] iArr = new int[startDim + 1];
            for (int i12 = 0; i12 < startDim; i12++) {
                iArr[i12] = x11.m8284b(i12);
            }
            iArr[startDim] = iM8284b;
            x11.m8286d(iArr);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final MTensor m89467g(@NotNull MTensor x11, int poolSize) {
        MTensor mTensor;
        MTensor mTensor2 = null;
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            int i11 = 0;
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            int iM8284b3 = x11.m8284b(2);
            int i12 = (iM8284b2 - poolSize) + 1;
            MTensor mTensor3 = new MTensor(new int[]{iM8284b, i12, iM8284b3});
            float[] data = x11.getData();
            float[] data2 = mTensor3.getData();
            int i13 = 0;
            while (i13 < iM8284b) {
                int i14 = i11;
                while (i14 < iM8284b3) {
                    int i15 = i11;
                    while (i15 < i12) {
                        int i16 = i15 * iM8284b3;
                        int i17 = (i13 * i12 * iM8284b3) + i16 + i14;
                        int i18 = (i13 * iM8284b2 * iM8284b3) + i16 + i14;
                        data2[i17] = Float.MIN_VALUE;
                        int i19 = i11;
                        while (i19 < poolSize) {
                            mTensor = mTensor2;
                            try {
                                data2[i17] = Math.max(data2[i17], data[i18 + (i19 * iM8284b3)]);
                                i19++;
                                mTensor2 = mTensor;
                            } catch (Throwable th2) {
                                th = th2;
                                C42757a.m93687b(th, C40877f.class);
                                return mTensor;
                            }
                        }
                        i15++;
                        i11 = 0;
                    }
                    i14++;
                    i11 = 0;
                }
                i13++;
                i11 = 0;
            }
            return mTensor3;
        } catch (Throwable th3) {
            th = th3;
            mTensor = mTensor2;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final MTensor m89468h(@NotNull MTensor x11, @NotNull MTensor w11) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(w11, "w");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = w11.m8284b(0);
            int iM8284b3 = w11.m8284b(1);
            MTensor mTensor = new MTensor(new int[]{iM8284b, iM8284b3});
            float[] data = x11.getData();
            float[] data2 = w11.getData();
            float[] data3 = mTensor.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                for (int i12 = 0; i12 < iM8284b3; i12++) {
                    int i13 = (i11 * iM8284b3) + i12;
                    data3[i13] = 0.0f;
                    for (int i14 = 0; i14 < iM8284b2; i14++) {
                        data3[i13] = data3[i13] + (data[(i11 * iM8284b2) + i14] * data2[(i14 * iM8284b3) + i12]);
                    }
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m89469i(@NotNull MTensor x11) {
        if (C42757a.m93689d(C40877f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            float[] data = x11.getData();
            int length = data.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (data[i11] < 0.0f) {
                    data[i11] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m89470j(@NotNull MTensor x11) {
        if (C42757a.m93689d(C40877f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            float[] data = x11.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                int i12 = i11 * iM8284b2;
                int i13 = i12 + iM8284b2;
                float f11 = Float.MIN_VALUE;
                for (int i14 = i12; i14 < i13; i14++) {
                    float f12 = data[i14];
                    if (f12 > f11) {
                        f11 = f12;
                    }
                }
                float f13 = 0.0f;
                for (int i15 = i12; i15 < i13; i15++) {
                    float fExp = (float) Math.exp(data[i15] - f11);
                    data[i15] = fExp;
                    f13 += fExp;
                }
                while (i12 < i13) {
                    data[i12] = data[i12] / f13;
                    i12++;
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final MTensor m89471k(@NotNull MTensor x11) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            MTensor mTensor = new MTensor(new int[]{iM8284b2, iM8284b});
            float[] data = x11.getData();
            float[] data2 = mTensor.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                for (int i12 = 0; i12 < iM8284b2; i12++) {
                    data2[(i12 * iM8284b) + i11] = data[(i11 * iM8284b2) + i12];
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final MTensor m89472l(@NotNull MTensor x11) {
        if (C42757a.m93689d(C40877f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x11, "x");
            int iM8284b = x11.m8284b(0);
            int iM8284b2 = x11.m8284b(1);
            int iM8284b3 = x11.m8284b(2);
            MTensor mTensor = new MTensor(new int[]{iM8284b3, iM8284b2, iM8284b});
            float[] data = x11.getData();
            float[] data2 = mTensor.getData();
            for (int i11 = 0; i11 < iM8284b; i11++) {
                for (int i12 = 0; i12 < iM8284b2; i12++) {
                    for (int i13 = 0; i13 < iM8284b3; i13++) {
                        data2[(i13 * iM8284b * iM8284b2) + (i12 * iM8284b) + i11] = data[(i11 * iM8284b2 * iM8284b3) + (i12 * iM8284b3) + i13];
                    }
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40877f.class);
            return null;
        }
    }
}
