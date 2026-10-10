package com.bumptech.glide.request;

import p419l2.InterfaceC42029c;

/* JADX INFO: loaded from: classes.dex */
public interface RequestCoordinator {

    /* JADX INFO: loaded from: classes34.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        public boolean isComplete() {
            return this.isComplete;
        }

        RequestState(boolean z11) {
            this.isComplete = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo6928a();

    /* JADX INFO: renamed from: b */
    void mo6929b(InterfaceC42029c interfaceC42029c);

    /* JADX INFO: renamed from: c */
    boolean mo6930c(InterfaceC42029c interfaceC42029c);

    /* JADX INFO: renamed from: e */
    boolean mo6931e(InterfaceC42029c interfaceC42029c);

    /* JADX INFO: renamed from: g */
    void mo6932g(InterfaceC42029c interfaceC42029c);

    RequestCoordinator getRoot();

    /* JADX INFO: renamed from: h */
    boolean mo6933h(InterfaceC42029c interfaceC42029c);
}
