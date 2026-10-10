package com.dianping.logan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class CLoganProtocol implements InterfaceC5462e {

    /* JADX INFO: renamed from: e */
    public static CLoganProtocol f7425e;

    /* JADX INFO: renamed from: f */
    public static boolean f7426f;

    /* JADX INFO: renamed from: a */
    public boolean f7427a;

    /* JADX INFO: renamed from: b */
    public boolean f7428b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5464g f7429c;

    /* JADX INFO: renamed from: d */
    public Set<Integer> f7430d = Collections.synchronizedSet(new HashSet());

    private native void clogan_debug(boolean z11);

    private native void clogan_flush();

    private native int clogan_init(String str, String str2, int i11, String str3, String str4);

    private native int clogan_open(String str);

    private native int clogan_write(int i11, String str, long j11, String str2, long j12, int i12);

    static {
        try {
            System.loadLibrary("logan");
            f7426f = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            f7426f = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7483g() {
        return f7426f;
    }

    /* JADX INFO: renamed from: i */
    public static CLoganProtocol m7484i() {
        if (f7425e == null) {
            synchronized (CLoganProtocol.class) {
                try {
                    if (f7425e == null) {
                        f7425e = new CLoganProtocol();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7425e;
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: a */
    public void mo7485a() {
        if (this.f7428b && f7426f) {
            try {
                clogan_flush();
            } catch (UnsatisfiedLinkError e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: b */
    public void mo7486b(String str, String str2, int i11, String str3, String str4) {
        if (this.f7427a) {
            return;
        }
        if (!f7426f) {
            m7491h("logan_loadso", -5020);
            return;
        }
        try {
            int iClogan_init = clogan_init(str, str2, i11, str3, str4);
            this.f7427a = true;
            m7491h("clogan_init", iClogan_init);
        } catch (UnsatisfiedLinkError e11) {
            e11.printStackTrace();
            m7491h("clogan_init", -1060);
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: c */
    public void mo7487c(int i11, String str, long j11, String str2, long j12, boolean z11) {
        if (!this.f7428b || !f7426f) {
            return;
        }
        try {
            int iClogan_write = clogan_write(i11, str, j11, str2, j12, z11 ? 1 : 0);
            if (iClogan_write == -4010) {
                try {
                    if (!C5458a.f7437c) {
                        return;
                    }
                } catch (UnsatisfiedLinkError e11) {
                    e = e11;
                    e.printStackTrace();
                    m7491h("clogan_write", -4060);
                    return;
                }
            }
            m7491h("clogan_write", iClogan_write);
        } catch (UnsatisfiedLinkError e12) {
            e = e12;
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: d */
    public void mo7488d(String str) {
        if (this.f7427a && f7426f) {
            try {
                int iClogan_open = clogan_open(str);
                this.f7428b = true;
                m7491h("clogan_open", iClogan_open);
            } catch (UnsatisfiedLinkError e11) {
                e11.printStackTrace();
                m7491h("clogan_open", -2070);
            }
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: e */
    public void mo7489e(boolean z11) {
        if (this.f7427a && f7426f) {
            try {
                clogan_debug(z11);
            } catch (UnsatisfiedLinkError e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: f */
    public void mo7490f(InterfaceC5464g interfaceC5464g) {
        this.f7429c = interfaceC5464g;
    }

    /* JADX INFO: renamed from: h */
    public final void m7491h(String str, int i11) {
        if (i11 < 0) {
            if ("clogan_write".endsWith(str) && i11 != -4060) {
                if (this.f7430d.contains(Integer.valueOf(i11))) {
                    return;
                } else {
                    this.f7430d.add(Integer.valueOf(i11));
                }
            }
            InterfaceC5464g interfaceC5464g = this.f7429c;
            if (interfaceC5464g != null) {
                interfaceC5464g.mo7543a(str, i11);
            }
        }
    }
}
