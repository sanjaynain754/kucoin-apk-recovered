package fh0;

import ih0.C38642x;
import java.util.LinkedList;
import java.util.ListIterator;
import lh0.InterfaceC42224a;
import lh0.InterfaceC42225b;

/* JADX INFO: renamed from: fh0.r */
/* JADX INFO: compiled from: StaggeredDelimiterProcessor.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37497r implements InterfaceC42224a {

    /* JADX INFO: renamed from: a */
    public final char f83187a;

    /* JADX INFO: renamed from: b */
    public int f83188b = 0;

    /* JADX INFO: renamed from: c */
    public LinkedList<InterfaceC42224a> f83189c = new LinkedList<>();

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: b */
    public char mo84420b() {
        return this.f83187a;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: c */
    public int mo84421c() {
        return this.f83188b;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: d */
    public char mo84422d() {
        return this.f83187a;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC42224a m84425g(int i11) {
        for (InterfaceC42224a interfaceC42224a : this.f83189c) {
            if (interfaceC42224a.mo84421c() <= i11) {
                return interfaceC42224a;
            }
        }
        return this.f83189c.getFirst();
    }

    public C37497r(char c11) {
        this.f83187a = c11;
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: a */
    public int mo84419a(InterfaceC42225b interfaceC42225b, InterfaceC42225b interfaceC42225b2) {
        return m84425g(interfaceC42225b.length()).mo84419a(interfaceC42225b, interfaceC42225b2);
    }

    @Override // lh0.InterfaceC42224a
    /* JADX INFO: renamed from: e */
    public void mo84423e(C38642x c38642x, C38642x c38642x2, int i11) {
        m84425g(i11).mo84423e(c38642x, c38642x2, i11);
    }

    /* JADX INFO: renamed from: f */
    public void m84424f(InterfaceC42224a interfaceC42224a) {
        int iMo84421c = interfaceC42224a.mo84421c();
        ListIterator<InterfaceC42224a> listIterator = this.f83189c.listIterator();
        while (listIterator.hasNext()) {
            int iMo84421c2 = listIterator.next().mo84421c();
            if (iMo84421c > iMo84421c2) {
                listIterator.previous();
                listIterator.add(interfaceC42224a);
                return;
            } else if (iMo84421c == iMo84421c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f83187a + "' and minimum length " + iMo84421c);
            }
        }
        this.f83189c.add(interfaceC42224a);
        this.f83188b = iMo84421c;
    }
}
