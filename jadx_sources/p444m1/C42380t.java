package p444m1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p484o1.C42929k;
import p484o1.C42930l;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.t */
/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42380t {

    /* JADX INFO: renamed from: b */
    public static SparseArrayCompat<WeakReference<Interpolator>> f93909b;

    /* JADX INFO: renamed from: a */
    public static final Interpolator f93908a = new LinearInterpolator();

    /* JADX INFO: renamed from: c */
    public static JsonReader.C5103a f93910c = JsonReader.C5103a.m5845a("t", CmcdData.Factory.STREAMING_FORMAT_SS, "e", "o", "i", CmcdData.Factory.STREAMING_FORMAT_HLS, TypedValues.TransitionType.S_TO, "ti");

    /* JADX INFO: renamed from: d */
    public static JsonReader.C5103a f93911d = JsonReader.C5103a.m5845a("x", "y");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static WeakReference<Interpolator> m92986a(int i11) {
        WeakReference<Interpolator> weakReference;
        synchronized (C42380t.class) {
            weakReference = m92992g().get(i11);
        }
        return weakReference;
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m92987b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = C42929k.m94188b(pointF.x, -1.0f, 1.0f);
        pointF.y = C42929k.m94188b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C42929k.m94188b(pointF2.x, -1.0f, 1.0f);
        float fM94188b = C42929k.m94188b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM94188b;
        int iM94206i = C42930l.m94206i(pointF.x, pointF.y, pointF2.x, fM94188b);
        WeakReference<Interpolator> weakReferenceM92986a = C5072d.m5645e() ? null : m92986a(iM94206i);
        Interpolator interpolator = weakReferenceM92986a != null ? weakReferenceM92986a.get() : null;
        if (weakReferenceM92986a != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e11) {
            interpolatorCreate = "The Path cannot loop back on itself.".equals(e11.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!C5072d.m5645e()) {
            try {
                m92993h(iM94206i, new WeakReference(interpolatorCreate));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorCreate;
    }

    /* JADX INFO: renamed from: c */
    public static <T> C43348a<T> m92988c(JsonReader jsonReader, C5080h c5080h, float f11, InterfaceC42374n0<T> interfaceC42374n0, boolean z11, boolean z12) throws IOException {
        if (z11 && z12) {
            return m92990e(c5080h, jsonReader, f11, interfaceC42374n0);
        }
        return z11 ? m92989d(c5080h, jsonReader, f11, interfaceC42374n0) : m92991f(jsonReader, f11, interfaceC42374n0);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    /* JADX INFO: renamed from: e */
    public static <T> C43348a<T> m92990e(C5080h c5080h, JsonReader jsonReader, float f11, InterfaceC42374n0<T> interfaceC42374n0) throws IOException {
        Interpolator interpolatorM92987b;
        Interpolator interpolatorM92987b2;
        Interpolator interpolatorM92987b3;
        T t11;
        Interpolator interpolator;
        PointF pointF;
        C43348a<T> c43348a;
        PointF pointF2;
        boolean z11;
        float f12;
        jsonReader.mo5830g();
        boolean z12 = false;
        PointF pointFM92983e = null;
        PointF pointFM92983e2 = null;
        PointF pointF3 = null;
        T tMo92921a = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFM92983e3 = null;
        PointF pointFM92983e4 = null;
        float fMo5835l = 0.0f;
        T tMo92921a2 = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93910c)) {
                case 0:
                    fMo5835l = (float) jsonReader.mo5835l();
                    break;
                case 1:
                    tMo92921a = interfaceC42374n0.mo92921a(jsonReader, f11);
                    break;
                case 2:
                    tMo92921a2 = interfaceC42374n0.mo92921a(jsonReader, f11);
                    break;
                case 3:
                    boolean z13 = z12;
                    if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.mo5830g();
                        float fMo5835l2 = 0.0f;
                        float fMo5835l3 = 0.0f;
                        float fMo5835l4 = 0.0f;
                        float fMo5835l5 = 0.0f;
                        while (jsonReader.mo5833j()) {
                            int iMo5841v = jsonReader.mo5841v(f93911d);
                            if (iMo5841v == 0) {
                                pointF2 = pointF5;
                                JsonReader.Token tokenMo5839q = jsonReader.mo5839q();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenMo5839q == token) {
                                    fMo5835l4 = (float) jsonReader.mo5835l();
                                    fMo5835l2 = fMo5835l4;
                                } else {
                                    jsonReader.mo5829b();
                                    fMo5835l2 = (float) jsonReader.mo5835l();
                                    fMo5835l4 = jsonReader.mo5839q() == token ? (float) jsonReader.mo5835l() : fMo5835l2;
                                    jsonReader.mo5831h();
                                }
                            } else if (iMo5841v != 1) {
                                jsonReader.mo5843x();
                            } else {
                                JsonReader.Token tokenMo5839q2 = jsonReader.mo5839q();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenMo5839q2 == token2) {
                                    pointF2 = pointF5;
                                    fMo5835l5 = (float) jsonReader.mo5835l();
                                    fMo5835l3 = fMo5835l5;
                                } else {
                                    pointF2 = pointF5;
                                    jsonReader.mo5829b();
                                    fMo5835l3 = (float) jsonReader.mo5835l();
                                    fMo5835l5 = jsonReader.mo5839q() == token2 ? (float) jsonReader.mo5835l() : fMo5835l3;
                                    jsonReader.mo5831h();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fMo5835l2, fMo5835l3);
                        pointF4 = new PointF(fMo5835l4, fMo5835l5);
                        jsonReader.mo5832i();
                    } else {
                        pointFM92983e = C42379s.m92983e(jsonReader, f11);
                    }
                    z12 = z13;
                    break;
                case 4:
                    if (jsonReader.mo5839q() != JsonReader.Token.BEGIN_OBJECT) {
                        pointFM92983e2 = C42379s.m92983e(jsonReader, f11);
                    } else {
                        jsonReader.mo5830g();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float fMo5835l6 = 0.0f;
                        float fMo5835l7 = 0.0f;
                        while (jsonReader.mo5833j()) {
                            int iMo5841v2 = jsonReader.mo5841v(f93911d);
                            if (iMo5841v2 != 0) {
                                z11 = z12;
                                if (iMo5841v2 != 1) {
                                    jsonReader.mo5843x();
                                } else {
                                    JsonReader.Token tokenMo5839q3 = jsonReader.mo5839q();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenMo5839q3 == token3) {
                                        fMo5835l7 = (float) jsonReader.mo5835l();
                                        f14 = fMo5835l7;
                                    } else {
                                        jsonReader.mo5829b();
                                        PointF pointF7 = pointFM92983e3;
                                        float fMo5835l8 = (float) jsonReader.mo5835l();
                                        fMo5835l7 = jsonReader.mo5839q() == token3 ? (float) jsonReader.mo5835l() : fMo5835l8;
                                        jsonReader.mo5831h();
                                        pointFM92983e3 = pointF7;
                                        f14 = fMo5835l8;
                                    }
                                }
                            } else {
                                z11 = z12;
                                PointF pointF8 = pointFM92983e3;
                                JsonReader.Token tokenMo5839q4 = jsonReader.mo5839q();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenMo5839q4 == token4) {
                                    pointFM92983e3 = pointF8;
                                    fMo5835l6 = (float) jsonReader.mo5835l();
                                    f13 = fMo5835l6;
                                } else {
                                    pointFM92983e3 = pointF8;
                                    jsonReader.mo5829b();
                                    float fMo5835l9 = (float) jsonReader.mo5835l();
                                    if (jsonReader.mo5839q() == token4) {
                                        f12 = fMo5835l9;
                                        fMo5835l6 = (float) jsonReader.mo5835l();
                                    } else {
                                        f12 = fMo5835l9;
                                        fMo5835l6 = f12;
                                    }
                                    jsonReader.mo5831h();
                                    f13 = f12;
                                }
                            }
                            z12 = z11;
                        }
                        PointF pointF9 = new PointF(f13, f14);
                        PointF pointF10 = new PointF(fMo5835l6, fMo5835l7);
                        jsonReader.mo5832i();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z12 = jsonReader.mo5836m() == 1;
                    break;
                case 6:
                    pointFM92983e3 = C42379s.m92983e(jsonReader, f11);
                    break;
                case 7:
                    pointFM92983e4 = C42379s.m92983e(jsonReader, f11);
                    break;
                default:
                    jsonReader.mo5843x();
                    break;
            }
        }
        boolean z14 = z12;
        PointF pointF11 = pointF5;
        jsonReader.mo5832i();
        if (z14) {
            interpolator = f93908a;
            t11 = tMo92921a;
        } else {
            if (pointFM92983e == null || pointFM92983e2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorM92987b = f93908a;
                } else {
                    interpolatorM92987b2 = m92987b(pointF3, pointF11);
                    interpolatorM92987b3 = m92987b(pointF4, pointF6);
                    t11 = tMo92921a2;
                    interpolator = null;
                }
                if (interpolatorM92987b2 != null || interpolatorM92987b3 == null) {
                    pointF = pointFM92983e4;
                    c43348a = new C43348a<>(c5080h, tMo92921a, t11, interpolator, fMo5835l, null);
                } else {
                    pointF = pointFM92983e4;
                    c43348a = new C43348a<>(c5080h, tMo92921a, t11, interpolatorM92987b2, interpolatorM92987b3, fMo5835l, null);
                }
                c43348a.f95722o = pointFM92983e3;
                c43348a.f95723p = pointF;
                return c43348a;
            }
            interpolatorM92987b = m92987b(pointFM92983e, pointFM92983e2);
            interpolator = interpolatorM92987b;
            t11 = tMo92921a2;
        }
        interpolatorM92987b2 = null;
        interpolatorM92987b3 = null;
        if (interpolatorM92987b2 != null) {
            pointF = pointFM92983e4;
            c43348a = new C43348a<>(c5080h, tMo92921a, t11, interpolator, fMo5835l, null);
        } else {
            pointF = pointFM92983e4;
            c43348a = new C43348a<>(c5080h, tMo92921a, t11, interpolator, fMo5835l, null);
        }
        c43348a.f95722o = pointFM92983e3;
        c43348a.f95723p = pointF;
        return c43348a;
    }

    /* JADX INFO: renamed from: g */
    public static SparseArrayCompat<WeakReference<Interpolator>> m92992g() {
        if (f93909b == null) {
            f93909b = new SparseArrayCompat<>();
        }
        return f93909b;
    }

    /* JADX INFO: renamed from: h */
    public static void m92993h(int i11, WeakReference<Interpolator> weakReference) {
        synchronized (C42380t.class) {
            f93909b.put(i11, weakReference);
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> C43348a<T> m92989d(C5080h c5080h, JsonReader jsonReader, float f11, InterfaceC42374n0<T> interfaceC42374n0) throws IOException {
        Interpolator interpolatorM92987b;
        Interpolator interpolator;
        T t11;
        jsonReader.mo5830g();
        PointF pointFM92983e = null;
        T tMo92921a = null;
        T tMo92921a2 = null;
        PointF pointFM92983e2 = null;
        PointF pointFM92983e3 = null;
        float fMo5835l = 0.0f;
        boolean z11 = false;
        PointF pointFM92983e4 = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93910c)) {
                case 0:
                    fMo5835l = (float) jsonReader.mo5835l();
                    break;
                case 1:
                    tMo92921a2 = interfaceC42374n0.mo92921a(jsonReader, f11);
                    break;
                case 2:
                    tMo92921a = interfaceC42374n0.mo92921a(jsonReader, f11);
                    break;
                case 3:
                    pointFM92983e = C42379s.m92983e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFM92983e4 = C42379s.m92983e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.mo5836m() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    break;
                case 6:
                    pointFM92983e2 = C42379s.m92983e(jsonReader, f11);
                    break;
                case 7:
                    pointFM92983e3 = C42379s.m92983e(jsonReader, f11);
                    break;
                default:
                    jsonReader.mo5843x();
                    break;
            }
        }
        jsonReader.mo5832i();
        if (z11) {
            interpolator = f93908a;
            t11 = tMo92921a2;
        } else {
            if (pointFM92983e != null && pointFM92983e4 != null) {
                interpolatorM92987b = m92987b(pointFM92983e, pointFM92983e4);
            } else {
                interpolatorM92987b = f93908a;
            }
            interpolator = interpolatorM92987b;
            t11 = tMo92921a;
        }
        C43348a<T> c43348a = new C43348a<>(c5080h, tMo92921a2, t11, interpolator, fMo5835l, null);
        c43348a.f95722o = pointFM92983e2;
        c43348a.f95723p = pointFM92983e3;
        return c43348a;
    }

    /* JADX INFO: renamed from: f */
    public static <T> C43348a<T> m92991f(JsonReader jsonReader, float f11, InterfaceC42374n0<T> interfaceC42374n0) throws IOException {
        return new C43348a<>(interfaceC42374n0.mo92921a(jsonReader, f11));
    }
}
