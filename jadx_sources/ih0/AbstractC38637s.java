package ih0;

/* JADX INFO: renamed from: ih0.s */
/* JADX INFO: compiled from: Node.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC38637s {

    /* JADX INFO: renamed from: a */
    public AbstractC38637s f86634a = null;

    /* JADX INFO: renamed from: b */
    public AbstractC38637s f86635b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC38637s f86636c = null;

    /* JADX INFO: renamed from: d */
    public AbstractC38637s f86637d = null;

    /* JADX INFO: renamed from: e */
    public AbstractC38637s f86638e = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo87323a(InterfaceC38644z interfaceC38644z);

    /* JADX INFO: renamed from: c */
    public AbstractC38637s m87355c() {
        return this.f86635b;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC38637s m87356d() {
        return this.f86636c;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC38637s m87357e() {
        return this.f86638e;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC38637s mo87320f() {
        return this.f86634a;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC38637s m87358g() {
        return this.f86637d;
    }

    /* JADX INFO: renamed from: j */
    public void mo87321j(AbstractC38637s abstractC38637s) {
        this.f86634a = abstractC38637s;
    }

    /* JADX INFO: renamed from: k */
    public String mo87344k() {
        return "";
    }

    /* JADX INFO: renamed from: l */
    public void m87361l() {
        AbstractC38637s abstractC38637s = this.f86637d;
        if (abstractC38637s != null) {
            abstractC38637s.f86638e = this.f86638e;
        } else {
            AbstractC38637s abstractC38637s2 = this.f86634a;
            if (abstractC38637s2 != null) {
                abstractC38637s2.f86635b = this.f86638e;
            }
        }
        AbstractC38637s abstractC38637s3 = this.f86638e;
        if (abstractC38637s3 != null) {
            abstractC38637s3.f86637d = abstractC38637s;
        } else {
            AbstractC38637s abstractC38637s4 = this.f86634a;
            if (abstractC38637s4 != null) {
                abstractC38637s4.f86636c = abstractC38637s;
            }
        }
        this.f86634a = null;
        this.f86638e = null;
        this.f86637d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + mo87344k() + "}";
    }

    /* JADX INFO: renamed from: b */
    public void m87354b(AbstractC38637s abstractC38637s) {
        abstractC38637s.m87361l();
        abstractC38637s.mo87321j(this);
        AbstractC38637s abstractC38637s2 = this.f86636c;
        if (abstractC38637s2 != null) {
            abstractC38637s2.f86638e = abstractC38637s;
            abstractC38637s.f86637d = abstractC38637s2;
            this.f86636c = abstractC38637s;
        } else {
            this.f86635b = abstractC38637s;
            this.f86636c = abstractC38637s;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m87359h(AbstractC38637s abstractC38637s) {
        abstractC38637s.m87361l();
        AbstractC38637s abstractC38637s2 = this.f86638e;
        abstractC38637s.f86638e = abstractC38637s2;
        if (abstractC38637s2 != null) {
            abstractC38637s2.f86637d = abstractC38637s;
        }
        abstractC38637s.f86637d = this;
        this.f86638e = abstractC38637s;
        AbstractC38637s abstractC38637s3 = this.f86634a;
        abstractC38637s.f86634a = abstractC38637s3;
        if (abstractC38637s.f86638e == null) {
            abstractC38637s3.f86636c = abstractC38637s;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m87360i(AbstractC38637s abstractC38637s) {
        abstractC38637s.m87361l();
        AbstractC38637s abstractC38637s2 = this.f86637d;
        abstractC38637s.f86637d = abstractC38637s2;
        if (abstractC38637s2 != null) {
            abstractC38637s2.f86638e = abstractC38637s;
        }
        abstractC38637s.f86638e = this;
        this.f86637d = abstractC38637s;
        AbstractC38637s abstractC38637s3 = this.f86634a;
        abstractC38637s.f86634a = abstractC38637s3;
        if (abstractC38637s.f86637d == null) {
            abstractC38637s3.f86635b = abstractC38637s;
        }
    }
}
