package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28116f0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f57331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57332b;

    public C28116f0(InterfaceC41635f interfaceC41635f, AbstractC28142p0 abstractC28142p0) {
        this.f57331a = interfaceC41635f;
        this.f57332b = abstractC28142p0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C28113e0 c28113e0;
        if (continuation instanceof C28113e0) {
            c28113e0 = (C28113e0) continuation;
            int i11 = c28113e0.f57324b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28113e0.f57324b = i11 - Integer.MIN_VALUE;
            } else {
                c28113e0 = new C28113e0(this, continuation);
            }
        } else {
            c28113e0 = new C28113e0(this, continuation);
        }
        Object obj2 = c28113e0.f57323a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28113e0.f57324b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f57331a;
            C29980i c29980i = (C29980i) obj;
            if (!this.f57332b.initViewModelConfig.f57273b || (c29980i != null && !c29980i.m70060a())) {
                c28113e0.f57324b = 1;
                if (interfaceC41635f.emit(obj, c28113e0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
