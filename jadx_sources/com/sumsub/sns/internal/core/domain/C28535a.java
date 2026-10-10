package com.sumsub.sns.internal.core.domain;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import kotlinx.coroutines.C41690i;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28535a implements InterfaceC28584k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28578h f58088a;

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: a */
    public final Object mo69411a(ContinuationImpl continuationImpl) {
        return ((C30034c) this.f58088a.f58167e.getValue()).m70075b(continuationImpl);
    }

    public C28535a(C28578h c28578h) {
        this.f58088a = c28578h;
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: b */
    public final Object mo69412b() {
        C29124h c29124h = (C29124h) ((C30034c) this.f58088a.f58167e.getValue()).f60332a.mo69412b();
        if (c29124h != null) {
            return c29124h.f59068a;
        }
        return null;
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    public final /* bridge */ /* synthetic */ void put(Object obj) {
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: a */
    public final Object mo69410a() throws InterruptedException {
        Object objMo69412b = mo69412b();
        if (objMo69412b == null) {
            objMo69412b = C41690i.m91067b(null, new C28582j(this, null), 1, null);
        }
        return (String) objMo69412b;
    }
}
