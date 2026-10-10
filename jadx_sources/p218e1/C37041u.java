package p218e1;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p248f1.AbstractC37305a;

/* JADX INFO: renamed from: e1.u */
/* JADX INFO: compiled from: TrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37041u implements InterfaceC37023c, AbstractC37305a.b {

    /* JADX INFO: renamed from: a */
    public final String f82293a;

    /* JADX INFO: renamed from: b */
    public final boolean f82294b;

    /* JADX INFO: renamed from: c */
    public final List<AbstractC37305a.b> f82295c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ShapeTrimPath.Type f82296d;

    /* JADX INFO: renamed from: e */
    public final AbstractC37305a<?, Float> f82297e;

    /* JADX INFO: renamed from: f */
    public final AbstractC37305a<?, Float> f82298f;

    /* JADX INFO: renamed from: g */
    public final AbstractC37305a<?, Float> f82299g;

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        for (int i11 = 0; i11 < this.f82295c.size(); i11++) {
            this.f82295c.get(i11).mo5788e();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82884a(AbstractC37305a.b bVar) {
        this.f82295c.add(bVar);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC37305a<?, Float> m82885c() {
        return this.f82298f;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC37305a<?, Float> m82886g() {
        return this.f82299g;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC37305a<?, Float> m82887i() {
        return this.f82297e;
    }

    /* JADX INFO: renamed from: j */
    public ShapeTrimPath.Type m82888j() {
        return this.f82296d;
    }

    /* JADX INFO: renamed from: k */
    public boolean m82889k() {
        return this.f82294b;
    }

    public C37041u(AbstractC5095a abstractC5095a, ShapeTrimPath shapeTrimPath) {
        this.f82293a = shapeTrimPath.m5722c();
        this.f82294b = shapeTrimPath.m5726g();
        this.f82296d = shapeTrimPath.m5725f();
        AbstractC37305a<Float, Float> abstractC37305aMo86574a = shapeTrimPath.m5724e().mo86574a();
        this.f82297e = abstractC37305aMo86574a;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a2 = shapeTrimPath.m5721b().mo86574a();
        this.f82298f = abstractC37305aMo86574a2;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a3 = shapeTrimPath.m5723d().mo86574a();
        this.f82299g = abstractC37305aMo86574a3;
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
        abstractC37305aMo86574a.m83824a(this);
        abstractC37305aMo86574a2.m83824a(this);
        abstractC37305aMo86574a3.m83824a(this);
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
    }
}
