package gh0;

import ih0.AbstractC38637s;
import ih0.C38625g;
import ih0.C38641w;
import ih0.C38642x;
import lh0.InterfaceC42224a;
import lh0.InterfaceC42225b;

/* JADX INFO: renamed from: gh0.b */
/* JADX INFO: compiled from: EmphasisDelimiterProcessor.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC37928b implements InterfaceC42224a {

    /* JADX INFO: renamed from: a */
    public final char f85324a;

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: c */
    public int mo84421c() {
        return 1;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: b */
    public char mo84420b() {
        return this.f85324a;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: d */
    public char mo84422d() {
        return this.f85324a;
    }

    public AbstractC37928b(char c11) {
        this.f85324a = c11;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: a */
    public int mo84419a(InterfaceC42225b interfaceC42225b, InterfaceC42225b interfaceC42225b2) {
        if ((interfaceC42225b.mo84325a() || interfaceC42225b2.mo84327c()) && interfaceC42225b2.mo84326b() % 3 != 0 && (interfaceC42225b.mo84326b() + interfaceC42225b2.mo84326b()) % 3 == 0) {
            return 0;
        }
        if (interfaceC42225b.length() >= 2 && interfaceC42225b2.length() >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: e */
    public void mo84423e(C38642x c38642x, C38642x c38642x2, int i11) {
        AbstractC38637s c38641w;
        String strValueOf = String.valueOf(mo84422d());
        if (i11 == 1) {
            c38641w = new C38625g(strValueOf);
        } else {
            c38641w = new C38641w(strValueOf + strValueOf);
        }
        AbstractC38637s abstractC38637sM87357e = c38642x.m87357e();
        while (abstractC38637sM87357e != null && abstractC38637sM87357e != c38642x2) {
            AbstractC38637s abstractC38637sM87357e2 = abstractC38637sM87357e.m87357e();
            c38641w.m87354b(abstractC38637sM87357e);
            abstractC38637sM87357e = abstractC38637sM87357e2;
        }
        c38642x.m87359h(c38641w);
    }
}
