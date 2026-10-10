package com.dianping.logan;

/* JADX INFO: renamed from: com.dianping.logan.d */
/* JADX INFO: compiled from: LoganProtocol.java */
/* JADX INFO: loaded from: classes.dex */
public class C5461d implements InterfaceC5462e {

    /* JADX INFO: renamed from: d */
    public static C5461d f7465d;

    /* JADX INFO: renamed from: a */
    public InterfaceC5462e f7466a;

    /* JADX INFO: renamed from: b */
    public boolean f7467b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5464g f7468c;

    /* JADX INFO: renamed from: g */
    public static C5461d m7527g() {
        if (f7465d == null) {
            synchronized (C5461d.class) {
                f7465d = new C5461d();
            }
        }
        return f7465d;
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: a */
    public void mo7485a() {
        InterfaceC5462e interfaceC5462e = this.f7466a;
        if (interfaceC5462e != null) {
            interfaceC5462e.mo7485a();
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: b */
    public void mo7486b(String str, String str2, int i11, String str3, String str4) {
        if (this.f7467b) {
            return;
        }
        if (!CLoganProtocol.m7483g()) {
            this.f7466a = null;
            return;
        }
        CLoganProtocol cLoganProtocolM7484i = CLoganProtocol.m7484i();
        this.f7466a = cLoganProtocolM7484i;
        cLoganProtocolM7484i.mo7490f(this.f7468c);
        this.f7466a.mo7486b(str, str2, i11, str3, str4);
        this.f7467b = true;
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: c */
    public void mo7487c(int i11, String str, long j11, String str2, long j12, boolean z11) {
        InterfaceC5462e interfaceC5462e = this.f7466a;
        if (interfaceC5462e != null) {
            interfaceC5462e.mo7487c(i11, str, j11, str2, j12, z11);
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: d */
    public void mo7488d(String str) {
        InterfaceC5462e interfaceC5462e = this.f7466a;
        if (interfaceC5462e != null) {
            interfaceC5462e.mo7488d(str);
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: e */
    public void mo7489e(boolean z11) {
        InterfaceC5462e interfaceC5462e = this.f7466a;
        if (interfaceC5462e != null) {
            interfaceC5462e.mo7489e(z11);
        }
    }

    @Override // com.dianping.logan.InterfaceC5462e
    /* JADX INFO: renamed from: f */
    public void mo7490f(InterfaceC5464g interfaceC5464g) {
        this.f7468c = interfaceC5464g;
    }
}
