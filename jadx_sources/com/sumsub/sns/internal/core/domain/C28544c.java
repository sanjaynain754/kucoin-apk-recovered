package com.sumsub.sns.internal.core.domain;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import kotlinx.coroutines.C41690i;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28544c implements InterfaceC28584k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28578h f58097a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: a */
    public final Object mo69411a(ContinuationImpl continuationImpl) {
        C28538b c28538b;
        if (continuationImpl instanceof C28538b) {
            c28538b = (C28538b) continuationImpl;
            int i11 = c28538b.f58093c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28538b.f58093c = i11 - Integer.MIN_VALUE;
            } else {
                c28538b = new C28538b(this, continuationImpl);
            }
        } else {
            c28538b = new C28538b(this, continuationImpl);
        }
        Object objM70045b = c28538b.f58091a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28538b.f58093c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f58097a.f58180r.getValue();
            c28538b.f58093c = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c28538b);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        return ((AbstractC29971N) objM70045b).m70051c();
    }

    public C28544c(C28578h c28578h) {
        this.f58097a = c28578h;
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: b */
    public final Object mo69412b() {
        return ((C29967J) ((InterfaceC29984m) this.f58097a.f58180r.getValue())).m70039a();
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
        return (C29124h) objMo69412b;
    }
}
