package p611s;

import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import ai.advance.sdk.global.iqa.lib.enums.CardDimension;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: s.h */
/* JADX INFO: loaded from: classes23.dex */
public class C44222h {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, b> f97674a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public Float f97675b;

    /* JADX INFO: renamed from: c */
    public Float f97676c;

    /* JADX INFO: renamed from: d */
    public Float f97677d;

    /* JADX INFO: renamed from: e */
    public Float f97678e;

    /* JADX INFO: renamed from: f */
    public Float f97679f;

    /* JADX INFO: renamed from: g */
    public Float f97680g;

    /* JADX INFO: renamed from: h */
    public Float f97681h;

    /* JADX INFO: renamed from: i */
    public Float f97682i;

    /* JADX INFO: renamed from: s.h$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f97683a;

        /* JADX INFO: renamed from: b */
        public C44209c f97684b;

        /* JADX INFO: renamed from: c */
        public long f97685c;

        public b() {
        }

        /* JADX INFO: renamed from: c */
        public void m97521c(String str) {
            this.f97683a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m97517a(@NonNull C44209c c44209c, String str, long j11) throws Throwable {
        try {
            try {
                if (c44209c.m97480a() != ImageWarnCode.NO_CARD) {
                    Float f11 = this.f97675b;
                    if (f11 == null || c44209c.f97599t > f11.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.EDGE_CROSS);
                        this.f97675b = Float.valueOf(c44209c.f97599t);
                    }
                    Float f12 = this.f97676c;
                    if (f12 == null || c44209c.f97601v < f12.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.BLUR);
                        this.f97676c = Float.valueOf(c44209c.f97601v);
                    }
                    Float f13 = this.f97677d;
                    if (f13 == null || c44209c.f97602w < f13.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.DIM);
                        this.f97677d = Float.valueOf(c44209c.f97602w);
                    }
                    Float f14 = this.f97678e;
                    if (f14 == null || c44209c.f97600u < f14.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.EXPOSURE);
                        this.f97678e = Float.valueOf(c44209c.f97600u);
                    }
                    Float f15 = this.f97679f;
                    if (f15 == null || c44209c.f97598s > f15.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.AREA);
                        this.f97679f = Float.valueOf(c44209c.f97598s);
                    }
                    Float f16 = this.f97680g;
                    if (f16 == null || c44209c.f97587h < f16.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.QUALITY);
                        this.f97680g = Float.valueOf(c44209c.f97587h);
                    }
                    Float f17 = this.f97681h;
                    if (f17 == null || c44209c.f97603x < f17.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.OCCLUDED);
                        this.f97681h = Float.valueOf(c44209c.f97603x);
                    }
                    Float f18 = this.f97682i;
                    if (f18 == null || c44209c.f97604y < f18.floatValue()) {
                        m97518b(c44209c, str, j11, CardDimension.GLOSSY);
                        this.f97682i = Float.valueOf(c44209c.f97604y);
                    }
                    return;
                }
                try {
                    m97518b(c44209c, str, j11, CardDimension.NO_CARD);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public void m97518b(C44209c c44209c, String str, long j11, CardDimension cardDimension) {
        b bVar = this.f97674a.get(cardDimension.name());
        if (bVar == null) {
            bVar = new b();
            this.f97674a.put(cardDimension.name(), bVar);
        }
        bVar.m97521c(str);
        bVar.f97684b = c44209c;
        bVar.f97685c = j11;
    }
}
