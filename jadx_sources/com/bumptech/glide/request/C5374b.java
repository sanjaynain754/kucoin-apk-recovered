package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p419l2.InterfaceC42029c;

/* JADX INFO: renamed from: com.bumptech.glide.request.b */
/* JADX INFO: compiled from: ThumbnailRequestCoordinator.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5374b implements RequestCoordinator, InterfaceC42029c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final RequestCoordinator f7062a;

    /* JADX INFO: renamed from: b */
    public final Object f7063b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC42029c f7064c;

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC42029c f7065d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f7066e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f7067f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("requestLock")
    public boolean f7068g;

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    private boolean m6964j() {
        RequestCoordinator requestCoordinator = this.f7062a;
        return requestCoordinator == null || requestCoordinator.mo6933h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m6965k() {
        RequestCoordinator requestCoordinator = this.f7062a;
        return requestCoordinator == null || requestCoordinator.mo6930c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m6966l() {
        RequestCoordinator requestCoordinator = this.f7062a;
        return requestCoordinator == null || requestCoordinator.mo6931e(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: a */
    public boolean mo6928a() {
        boolean z11;
        synchronized (this.f7063b) {
            try {
                z11 = this.f7065d.mo6928a() || this.f7064c.mo6928a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: b */
    public void mo6929b(InterfaceC42029c interfaceC42029c) {
        synchronized (this.f7063b) {
            try {
                if (interfaceC42029c.equals(this.f7065d)) {
                    this.f7067f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f7066e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f7062a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo6929b(this);
                }
                if (!this.f7067f.isComplete()) {
                    this.f7065d.clear();
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
        synchronized (this.f7063b) {
            try {
                z11 = m6965k() && interfaceC42029c.equals(this.f7064c) && !mo6928a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    public void clear() {
        synchronized (this.f7063b) {
            this.f7068g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f7066e = requestState;
            this.f7067f = requestState;
            this.f7065d.clear();
            this.f7064c.clear();
        }
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: d */
    public boolean mo6938d(InterfaceC42029c interfaceC42029c) {
        if (interfaceC42029c instanceof C5374b) {
            C5374b c5374b = (C5374b) interfaceC42029c;
            if (this.f7064c != null ? this.f7064c.mo6938d(c5374b.f7064c) : c5374b.f7064c == null) {
                if (this.f7065d == null) {
                    if (c5374b.f7065d == null) {
                        return true;
                    }
                } else if (this.f7065d.mo6938d(c5374b.f7065d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: e */
    public boolean mo6931e(InterfaceC42029c interfaceC42029c) {
        boolean z11;
        synchronized (this.f7063b) {
            try {
                z11 = m6966l() && (interfaceC42029c.equals(this.f7064c) || this.f7066e != RequestCoordinator.RequestState.SUCCESS);
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
        synchronized (this.f7063b) {
            z11 = this.f7066e == RequestCoordinator.RequestState.CLEARED;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: g */
    public void mo6932g(InterfaceC42029c interfaceC42029c) {
        synchronized (this.f7063b) {
            try {
                if (!interfaceC42029c.equals(this.f7064c)) {
                    this.f7067f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f7066e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f7062a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo6932g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f7063b) {
            try {
                RequestCoordinator requestCoordinator = this.f7062a;
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
        synchronized (this.f7063b) {
            try {
                z11 = m6964j() && interfaceC42029c.equals(this.f7064c) && this.f7066e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: i */
    public void mo6943i() {
        synchronized (this.f7063b) {
            try {
                this.f7068g = true;
                try {
                    if (this.f7066e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f7067f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f7067f = requestState2;
                            this.f7065d.mo6943i();
                        }
                    }
                    if (this.f7068g) {
                        RequestCoordinator.RequestState requestState3 = this.f7066e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f7066e = requestState4;
                            this.f7064c.mo6943i();
                        }
                    }
                    this.f7068g = false;
                } catch (Throwable th2) {
                    this.f7068g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f7063b) {
            z11 = this.f7066e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f7063b) {
            z11 = this.f7066e == RequestCoordinator.RequestState.RUNNING;
        }
        return z11;
    }

    /* JADX INFO: renamed from: m */
    public void m6967m(InterfaceC42029c interfaceC42029c, InterfaceC42029c interfaceC42029c2) {
        this.f7064c = interfaceC42029c;
        this.f7065d = interfaceC42029c2;
    }

    @Override // p419l2.InterfaceC42029c
    public void pause() {
        synchronized (this.f7063b) {
            try {
                if (!this.f7067f.isComplete()) {
                    this.f7067f = RequestCoordinator.RequestState.PAUSED;
                    this.f7065d.pause();
                }
                if (!this.f7066e.isComplete()) {
                    this.f7066e = RequestCoordinator.RequestState.PAUSED;
                    this.f7064c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C5374b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f7066e = requestState;
        this.f7067f = requestState;
        this.f7063b = obj;
        this.f7062a = requestCoordinator;
    }
}
