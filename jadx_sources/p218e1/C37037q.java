package p218e1;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p248f1.AbstractC37305a;
import p297h1.C38071a;
import p355j1.C40205h;
import p355j1.C40206i;

/* JADX INFO: renamed from: e1.q */
/* JADX INFO: compiled from: RoundedCornersContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37037q implements InterfaceC37039s, AbstractC37305a.b {

    /* JADX INFO: renamed from: a */
    public final LottieDrawable f82277a;

    /* JADX INFO: renamed from: b */
    public final String f82278b;

    /* JADX INFO: renamed from: c */
    public final AbstractC37305a<Float, Float> f82279c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C40206i f82280d;

    /* JADX INFO: renamed from: a */
    public static int m82878a(int i11, int i12) {
        int i13 = i11 / i12;
        return ((i11 ^ i12) >= 0 || i12 * i13 == i11) ? i13 : i13 - 1;
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82277a.invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public AbstractC37305a<Float, Float> m82880g() {
        return this.f82279c;
    }

    public C37037q(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40205h c40205h) {
        this.f82277a = lottieDrawable;
        this.f82278b = c40205h.m88583c();
        AbstractC37305a<Float, Float> abstractC37305aMo86574a = c40205h.m88582b().mo86574a();
        this.f82279c = abstractC37305aMo86574a;
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC37305aMo86574a.m83824a(this);
    }

    /* JADX INFO: renamed from: c */
    public static int m82879c(int i11, int i12) {
        return i11 - (m82878a(i11, i12) * i12);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // p218e1.InterfaceC37039s
    /* JADX INFO: renamed from: h */
    public C40206i mo82881h(C40206i c40206i) {
        PointF pointFM85953c;
        PointF pointFM85952b;
        boolean z11;
        List<C38071a> listM88584a = c40206i.m88584a();
        if (listM88584a.size() > 2) {
            float fFloatValue = this.f82279c.mo83831h().floatValue();
            if (fFloatValue != 0.0f) {
                C40206i c40206iM82882i = m82882i(c40206i);
                c40206iM82882i.m88589f(c40206i.m88585b().x, c40206i.m88585b().y);
                List<C38071a> listM88584a2 = c40206iM82882i.m88584a();
                boolean zM88587d = c40206i.m88587d();
                int i11 = 0;
                int i12 = 0;
                while (i11 < listM88584a.size()) {
                    C38071a c38071a = listM88584a.get(i11);
                    C38071a c38071a2 = listM88584a.get(m82879c(i11 - 1, listM88584a.size()));
                    C38071a c38071a3 = listM88584a.get(m82879c(i11 - 2, listM88584a.size()));
                    if (i11 == 0 && !zM88587d) {
                        pointFM85953c = c40206i.m88585b();
                    } else {
                        pointFM85953c = c38071a2.m85953c();
                    }
                    if (i11 == 0 && !zM88587d) {
                        pointFM85952b = pointFM85953c;
                    } else {
                        pointFM85952b = c38071a2.m85952b();
                    }
                    PointF pointFM85951a = c38071a.m85951a();
                    PointF pointFM85953c2 = c38071a3.m85953c();
                    PointF pointFM85953c3 = c38071a.m85953c();
                    if (!c40206i.m88587d()) {
                        z11 = true;
                        if (i11 != 0 && i11 != listM88584a.size() - 1) {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (pointFM85952b.equals(pointFM85953c) && pointFM85951a.equals(pointFM85953c) && !z11) {
                        float f11 = pointFM85953c.x;
                        float f12 = f11 - pointFM85953c2.x;
                        float f13 = pointFM85953c.y;
                        float f14 = f13 - pointFM85953c2.y;
                        float f15 = pointFM85953c3.x - f11;
                        float f16 = pointFM85953c3.y - f13;
                        float fHypot = (float) Math.hypot(f12, f14);
                        float fHypot2 = (float) Math.hypot(f15, f16);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f17 = pointFM85953c.x;
                        float f18 = ((pointFM85953c2.x - f17) * fMin) + f17;
                        float f19 = pointFM85953c.y;
                        float f21 = ((pointFM85953c2.y - f19) * fMin) + f19;
                        float f22 = ((pointFM85953c3.x - f17) * fMin2) + f17;
                        float f23 = ((pointFM85953c3.y - f19) * fMin2) + f19;
                        float f24 = f18 - ((f18 - f17) * 0.5519f);
                        float f25 = f21 - ((f21 - f19) * 0.5519f);
                        float f26 = f22 - ((f22 - f17) * 0.5519f);
                        float f27 = f23 - ((f23 - f19) * 0.5519f);
                        C38071a c38071a4 = listM88584a2.get(m82879c(i12 - 1, listM88584a2.size()));
                        C38071a c38071a5 = listM88584a2.get(i12);
                        c38071a4.m85955e(f18, f21);
                        c38071a4.m85956f(f18, f21);
                        if (i11 == 0) {
                            c40206iM82882i.m88589f(f18, f21);
                        }
                        c38071a5.m85954d(f24, f25);
                        C38071a c38071a6 = listM88584a2.get(i12 + 1);
                        c38071a5.m85955e(f26, f27);
                        c38071a5.m85956f(f22, f23);
                        c38071a6.m85954d(f22, f23);
                        i12 += 2;
                    } else {
                        C38071a c38071a7 = listM88584a2.get(m82879c(i12 - 1, listM88584a2.size()));
                        C38071a c38071a8 = listM88584a2.get(i12);
                        c38071a7.m85955e(c38071a2.m85952b().x, c38071a2.m85952b().y);
                        c38071a7.m85956f(c38071a2.m85953c().x, c38071a2.m85953c().y);
                        c38071a8.m85954d(c38071a.m85951a().x, c38071a.m85951a().y);
                        i12++;
                    }
                    i11++;
                    listM88584a = listM88584a;
                }
                return c40206iM82882i;
            }
        }
        return c40206i;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public final C40206i m82882i(C40206i c40206i) {
        PointF pointFM85953c;
        PointF pointFM85952b;
        boolean z11;
        List<C38071a> listM88584a = c40206i.m88584a();
        boolean zM88587d = c40206i.m88587d();
        int i11 = 0;
        for (int size = listM88584a.size() - 1; size >= 0; size--) {
            C38071a c38071a = listM88584a.get(size);
            C38071a c38071a2 = listM88584a.get(m82879c(size - 1, listM88584a.size()));
            if (size == 0 && !zM88587d) {
                pointFM85953c = c40206i.m88585b();
            } else {
                pointFM85953c = c38071a2.m85953c();
            }
            if (size == 0 && !zM88587d) {
                pointFM85952b = pointFM85953c;
            } else {
                pointFM85952b = c38071a2.m85952b();
            }
            PointF pointFM85951a = c38071a.m85951a();
            if (!c40206i.m88587d() && (size == 0 || size == listM88584a.size() - 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (pointFM85952b.equals(pointFM85953c) && pointFM85951a.equals(pointFM85953c) && !z11) {
                i11 += 2;
            } else {
                i11++;
            }
        }
        C40206i c40206i2 = this.f82280d;
        if (c40206i2 == null || c40206i2.m88584a().size() != i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new C38071a());
            }
            this.f82280d = new C40206i(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f82280d.m88588e(zM88587d);
        return this.f82280d;
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
    }
}
