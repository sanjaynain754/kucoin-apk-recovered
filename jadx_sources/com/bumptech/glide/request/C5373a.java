package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p419l2.InterfaceC42029c;

/* JADX INFO: renamed from: com.bumptech.glide.request.a */
/* JADX INFO: compiled from: ErrorRequestCoordinator.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5373a implements RequestCoordinator, InterfaceC42029c {

    /* JADX INFO: renamed from: a */
    public final Object f7056a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final RequestCoordinator f7057b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC42029c f7058c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC42029c f7059d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f7060e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f7061f;

    @Override // com.bumptech.glide.request.RequestCoordinator, p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: a */
    public boolean mo6928a() {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                z11 = this.f7058c.mo6928a() || this.f7059d.mo6928a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: b */
    public void mo6929b(InterfaceC42029c interfaceC42029c) {
        synchronized (this.f7056a) {
            try {
                if (interfaceC42029c.equals(this.f7058c)) {
                    this.f7060e = RequestCoordinator.RequestState.SUCCESS;
                } else if (interfaceC42029c.equals(this.f7059d)) {
                    this.f7061f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f7057b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo6929b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public boolean mo6930c(InterfaceC42029c interfaceC42029c) {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                z11 = m6961l() && m6959j(interfaceC42029c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    public void clear() {
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f7060e = requestState;
                this.f7058c.clear();
                if (this.f7061f != requestState) {
                    this.f7061f = requestState;
                    this.f7059d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: d */
    public boolean mo6938d(InterfaceC42029c interfaceC42029c) {
        if (interfaceC42029c instanceof C5373a) {
            C5373a c5373a = (C5373a) interfaceC42029c;
            if (this.f7058c.mo6938d(c5373a.f7058c) && this.f7059d.mo6938d(c5373a.f7059d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: e */
    public boolean mo6931e(InterfaceC42029c interfaceC42029c) {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                z11 = m6962m() && m6959j(interfaceC42029c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: f */
    public boolean mo6940f() {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = this.f7060e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z11 = requestState == requestState2 && this.f7061f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: g */
    public void mo6932g(InterfaceC42029c interfaceC42029c) {
        synchronized (this.f7056a) {
            try {
                if (interfaceC42029c.equals(this.f7059d)) {
                    this.f7061f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f7057b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo6932g(this);
                    }
                    return;
                }
                this.f7060e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f7061f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f7061f = requestState2;
                    this.f7059d.mo6943i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f7056a) {
            try {
                RequestCoordinator requestCoordinator = this.f7057b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: h */
    public boolean mo6933h(InterfaceC42029c interfaceC42029c) {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                z11 = m6960k() && m6959j(interfaceC42029c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: i */
    public void mo6943i() {
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = this.f7060e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f7060e = requestState2;
                    this.f7058c.mo6943i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = this.f7060e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z11 = requestState == requestState2 || this.f7061f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = this.f7060e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z11 = requestState == requestState2 || this.f7061f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    public final boolean m6959j(InterfaceC42029c interfaceC42029c) {
        if (interfaceC42029c.equals(this.f7058c)) {
            return true;
        }
        return this.f7060e == RequestCoordinator.RequestState.FAILED && interfaceC42029c.equals(this.f7059d);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    public final boolean m6960k() {
        RequestCoordinator requestCoordinator = this.f7057b;
        return requestCoordinator == null || requestCoordinator.mo6933h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    public final boolean m6961l() {
        RequestCoordinator requestCoordinator = this.f7057b;
        return requestCoordinator == null || requestCoordinator.mo6930c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    public final boolean m6962m() {
        RequestCoordinator requestCoordinator = this.f7057b;
        return requestCoordinator == null || requestCoordinator.mo6931e(this);
    }

    /* JADX INFO: renamed from: n */
    public void m6963n(InterfaceC42029c interfaceC42029c, InterfaceC42029c interfaceC42029c2) {
        this.f7058c = interfaceC42029c;
        this.f7059d = interfaceC42029c2;
    }

    @Override // p419l2.InterfaceC42029c
    public void pause() {
        synchronized (this.f7056a) {
            try {
                RequestCoordinator.RequestState requestState = this.f7060e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f7060e = RequestCoordinator.RequestState.PAUSED;
                    this.f7058c.pause();
                }
                if (this.f7061f == requestState2) {
                    this.f7061f = RequestCoordinator.RequestState.PAUSED;
                    this.f7059d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C5373a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f7060e = requestState;
        this.f7061f = requestState;
        this.f7056a = obj;
        this.f7057b = requestCoordinator;
    }
}
