package of0;

import androidx.annotation.NonNull;
import cf0.InterfaceC4964s;
import ih0.AbstractC38637s;
import ih0.C38642x;
import lh0.InterfaceC42224a;
import lh0.InterfaceC42225b;

/* JADX INFO: renamed from: of0.b */
/* JADX INFO: compiled from: SimpleExtDelimiterProcessor.java */
/* JADX INFO: loaded from: classes60.dex */
public class C43040b implements InterfaceC42224a {

    /* JADX INFO: renamed from: a */
    public final char f95225a;

    /* JADX INFO: renamed from: b */
    public final char f95226b;

    /* JADX INFO: renamed from: c */
    public final int f95227c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4964s f95228d;

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: b */
    public char mo84420b() {
        return this.f95226b;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: c */
    public int mo84421c() {
        return this.f95227c;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: d */
    public char mo84422d() {
        return this.f95225a;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: e */
    public void mo84423e(C38642x c38642x, C38642x c38642x2, int i11) {
        C43041c c43041c = new C43041c(this.f95228d);
        AbstractC38637s abstractC38637sM87357e = c38642x.m87357e();
        while (abstractC38637sM87357e != null && abstractC38637sM87357e != c38642x2) {
            AbstractC38637s abstractC38637sM87357e2 = abstractC38637sM87357e.m87357e();
            c43041c.m87354b(abstractC38637sM87357e);
            abstractC38637sM87357e = abstractC38637sM87357e2;
        }
        c38642x.m87359h(c43041c);
    }

    public C43040b(char c11, char c12, int i11, @NonNull InterfaceC4964s interfaceC4964s) {
        this.f95225a = c11;
        this.f95226b = c12;
        this.f95227c = i11;
        this.f95228d = interfaceC4964s;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: a */
    public int mo84419a(InterfaceC42225b interfaceC42225b, InterfaceC42225b interfaceC42225b2) {
        if (interfaceC42225b.length() >= this.f95227c) {
            int length = interfaceC42225b2.length();
            int i11 = this.f95227c;
            if (length >= i11) {
                return i11;
            }
            return 0;
        }
        return 0;
    }
}
