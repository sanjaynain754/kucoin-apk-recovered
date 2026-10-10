package p248f1;

import androidx.annotation.Nullable;
import java.util.Collections;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.q */
/* JADX INFO: compiled from: ValueCallbackKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37321q<K, A> extends AbstractC37305a<K, A> {

    /* JADX INFO: renamed from: i */
    public final A f82831i;

    public C37321q(C43350c<A> c43350c) {
        this(c43350c, null);
    }

    public C37321q(C43350c<A> c43350c, @Nullable A a11) {
        super(Collections.EMPTY_LIST);
        m83838o(c43350c);
        this.f82831i = a11;
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: c */
    public float mo83826c() {
        return 1.0f;
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: h */
    public A mo83831h() {
        C43350c<A> c43350c = this.f82769e;
        A a11 = this.f82831i;
        return c43350c.m95467b(0.0f, 0.0f, a11, a11, m83829f(), m83829f(), m83829f());
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: l */
    public void mo83835l() {
        if (this.f82769e != null) {
            super.mo83835l();
        }
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: n */
    public void mo83837n(float f11) {
        this.f82768d = f11;
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: i */
    public A mo83832i(C43348a<K> c43348a, float f11) {
        return mo83831h();
    }
}
