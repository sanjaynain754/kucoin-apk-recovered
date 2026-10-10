package p248f1;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p444m1.C42365j;
import p522p1.C43349b;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.c */
/* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37307c implements AbstractC37305a.b {

    /* JADX INFO: renamed from: a */
    public final AbstractC37305a.b f82779a;

    /* JADX INFO: renamed from: b */
    public final AbstractC37305a<Integer, Integer> f82780b;

    /* JADX INFO: renamed from: c */
    public final AbstractC37305a<Float, Float> f82781c;

    /* JADX INFO: renamed from: d */
    public final AbstractC37305a<Float, Float> f82782d;

    /* JADX INFO: renamed from: e */
    public final AbstractC37305a<Float, Float> f82783e;

    /* JADX INFO: renamed from: f */
    public final AbstractC37305a<Float, Float> f82784f;

    /* JADX INFO: renamed from: g */
    public boolean f82785g = true;

    /* JADX INFO: renamed from: f1.c$a */
    /* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
    public class a extends C43350c<Float> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C43350c f82786d;

        public a(C43350c c43350c) {
            this.f82786d = c43350c;
        }

        @Override // p522p1.C43350c
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float mo5530a(C43349b<Float> c43349b) {
            Float f11 = (Float) this.f82786d.mo5530a(c43349b);
            if (f11 == null) {
                return null;
            }
            return Float.valueOf(f11.floatValue() * 2.55f);
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82785g = true;
        this.f82779a.mo5788e();
    }

    /* JADX INFO: renamed from: a */
    public void m83848a(Paint paint) {
        if (this.f82785g) {
            this.f82785g = false;
            double dFloatValue = ((double) this.f82782d.mo83831h().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f82783e.mo83831h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f82780b.mo83831h().intValue();
            paint.setShadowLayer(this.f82784f.mo83831h().floatValue(), fSin, fCos, Color.argb(Math.round(this.f82781c.mo83831h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83849b(@Nullable C43350c<Integer> c43350c) {
        this.f82780b.m83838o(c43350c);
    }

    /* JADX INFO: renamed from: c */
    public void m83850c(@Nullable C43350c<Float> c43350c) {
        this.f82782d.m83838o(c43350c);
    }

    /* JADX INFO: renamed from: d */
    public void m83851d(@Nullable C43350c<Float> c43350c) {
        this.f82783e.m83838o(c43350c);
    }

    /* JADX INFO: renamed from: f */
    public void m83852f(@Nullable C43350c<Float> c43350c) {
        if (c43350c == null) {
            this.f82781c.m83838o(null);
        } else {
            this.f82781c.m83838o(new a(c43350c));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m83853g(@Nullable C43350c<Float> c43350c) {
        this.f82784f.m83838o(c43350c);
    }

    public C37307c(AbstractC37305a.b bVar, AbstractC5095a abstractC5095a, C42365j c42365j) {
        this.f82779a = bVar;
        AbstractC37305a<Integer, Integer> abstractC37305aMo86574a = c42365j.m92957a().mo86574a();
        this.f82780b = abstractC37305aMo86574a;
        abstractC37305aMo86574a.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        AbstractC37305a<Float, Float> abstractC37305aMo86574a2 = c42365j.m92960d().mo86574a();
        this.f82781c = abstractC37305aMo86574a2;
        abstractC37305aMo86574a2.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        AbstractC37305a<Float, Float> abstractC37305aMo86574a3 = c42365j.m92958b().mo86574a();
        this.f82782d = abstractC37305aMo86574a3;
        abstractC37305aMo86574a3.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
        AbstractC37305a<Float, Float> abstractC37305aMo86574a4 = c42365j.m92959c().mo86574a();
        this.f82783e = abstractC37305aMo86574a4;
        abstractC37305aMo86574a4.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a4);
        AbstractC37305a<Float, Float> abstractC37305aMo86574a5 = c42365j.m92961e().mo86574a();
        this.f82784f = abstractC37305aMo86574a5;
        abstractC37305aMo86574a5.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a5);
    }
}
