package com.sumsub.sns.internal.features.presentation.support;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32620k extends AbstractC28073M0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f66554a;

    /* JADX INFO: renamed from: b */
    public final C30034c f66555b;

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C32617h(null, null, null, null, null, CollectionsKt.emptyList());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        C32618i c32618i;
        if (continuation instanceof C32618i) {
            c32618i = (C32618i) continuation;
            int i11 = c32618i.f66545c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32618i.f66545c = i11 - Integer.MIN_VALUE;
            } else {
                c32618i = new C32618i(this, (ContinuationImpl) continuation);
            }
        } else {
            c32618i = new C32618i(this, (ContinuationImpl) continuation);
        }
        Object obj = c32618i.f66543a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32618i.f66545c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c32618i.f66545c = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(this, c32618i) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC28073M0.updateState$default(this, false, new C32619j(this, null), 1, null);
        return Unit.INSTANCE;
    }

    public C32620k(C28547d c28547d, C30034c c30034c, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f66554a = c28547d;
        this.f66555b = c30034c;
    }
}
