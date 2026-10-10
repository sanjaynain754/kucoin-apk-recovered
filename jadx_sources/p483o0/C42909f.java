package p483o0;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: compiled from: TaskCompletionSource.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42909f<TResult> {

    /* JADX INFO: renamed from: a */
    public final C42908e<TResult> f95015a = new C42908e<>();

    /* JADX INFO: renamed from: a */
    public C42908e<TResult> m94111a() {
        return this.f95015a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m94115e() {
        return this.f95015a.m94107p();
    }

    /* JADX INFO: renamed from: f */
    public boolean m94116f(Exception exc) {
        return this.f95015a.m94108q(exc);
    }

    /* JADX INFO: renamed from: g */
    public boolean m94117g(TResult tresult) {
        return this.f95015a.m94109r(tresult);
    }

    /* JADX INFO: renamed from: b */
    public void m94112b() {
        if (m94115e()) {
        } else {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m94113c(Exception exc) {
        if (m94116f(exc)) {
        } else {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m94114d(TResult tresult) {
        if (m94117g(tresult)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
