package p684v5;

import java.io.IOException;
import java.io.InputStream;
import p190d4.C36612c;
import p712w3.C45702b;
import p712w3.C45708h;
import p712w3.C45713m;
import p749x5.C46075i;
import p819z3.C46678g;
import p819z3.InterfaceC46672a;

/* JADX INFO: renamed from: v5.f */
/* JADX INFO: compiled from: ProgressiveJpegParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45425f {

    /* JADX INFO: renamed from: g */
    public boolean f102461g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC46672a f102462h;

    /* JADX INFO: renamed from: c */
    public int f102457c = 0;

    /* JADX INFO: renamed from: b */
    public int f102456b = 0;

    /* JADX INFO: renamed from: d */
    public int f102458d = 0;

    /* JADX INFO: renamed from: f */
    public int f102460f = 0;

    /* JADX INFO: renamed from: e */
    public int f102459e = 0;

    /* JADX INFO: renamed from: a */
    public int f102455a = 0;

    /* JADX INFO: renamed from: b */
    public static boolean m100390b(int i11) {
        if (i11 == 1) {
            return false;
        }
        return ((i11 >= 208 && i11 <= 215) || i11 == 217 || i11 == 216) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m100391a(InputStream inputStream) throws Throwable {
        int i11;
        int i12 = this.f102459e;
        while (this.f102455a != 6 && (i11 = inputStream.read()) != -1) {
            try {
                int i13 = this.f102457c;
                this.f102457c = i13 + 1;
                if (this.f102461g) {
                    this.f102455a = 6;
                    this.f102461g = false;
                    return false;
                }
                int i14 = this.f102455a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 4) {
                                    this.f102455a = 5;
                                } else if (i14 != 5) {
                                    C45708h.m100898i(false);
                                } else {
                                    int i15 = ((this.f102456b << 8) + i11) - 2;
                                    C36612c.m81931a(inputStream, i15);
                                    this.f102457c += i15;
                                    this.f102455a = 2;
                                }
                            } else if (i11 == 255) {
                                this.f102455a = 3;
                            } else if (i11 == 0) {
                                this.f102455a = 2;
                            } else if (i11 == 217) {
                                this.f102461g = true;
                                m100395f(i13 - 1);
                                this.f102455a = 2;
                            } else {
                                if (i11 == 218) {
                                    m100395f(i13 - 1);
                                }
                                if (m100390b(i11)) {
                                    this.f102455a = 4;
                                } else {
                                    this.f102455a = 2;
                                }
                            }
                        } else if (i11 == 255) {
                            this.f102455a = 3;
                        }
                    } else if (i11 == 216) {
                        this.f102455a = 2;
                    } else {
                        this.f102455a = 6;
                    }
                } else if (i11 == 255) {
                    this.f102455a = 1;
                } else {
                    this.f102455a = 6;
                }
                this.f102456b = i11;
            } catch (IOException e11) {
                C45713m.m100908a(e11);
            }
        }
        return (this.f102455a == 6 || this.f102459e == i12) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public int m100392c() {
        return this.f102460f;
    }

    /* JADX INFO: renamed from: d */
    public int m100393d() {
        return this.f102459e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m100394e() {
        return this.f102461g;
    }

    /* JADX INFO: renamed from: f */
    public final void m100395f(int i11) {
        int i12 = this.f102458d;
        if (i12 > 0) {
            this.f102460f = i11;
        }
        this.f102458d = i12 + 1;
        this.f102459e = i12;
    }

    /* JADX INFO: renamed from: g */
    public boolean m100396g(C46075i c46075i) {
        if (this.f102455a == 6 || c46075i.m101582q() <= this.f102457c) {
            return false;
        }
        C46678g c46678g = new C46678g(c46075i.m101580o(), this.f102462h.get(16384), this.f102462h);
        try {
            C36612c.m81931a(c46678g, this.f102457c);
            return m100391a(c46678g);
        } catch (IOException e11) {
            C45713m.m100908a(e11);
            return false;
        } finally {
            C45702b.m100881b(c46678g);
        }
    }

    public C45425f(InterfaceC46672a interfaceC46672a) {
        this.f102462h = (InterfaceC46672a) C45708h.m100896g(interfaceC46672a);
    }
}
