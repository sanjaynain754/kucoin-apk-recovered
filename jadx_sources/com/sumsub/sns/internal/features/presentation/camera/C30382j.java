package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30382j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30388m f61122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30382j(C30388m c30388m, Continuation continuation) {
        super(2, continuation);
        this.f61122b = c30388m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30382j(this.f61122b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30382j(this.f61122b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61121a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30388m c30388m = this.f61122b;
            this.f61121a = 1;
            IdentitySide identitySide = (IdentitySide) c30388m.f57253a.get("CONTROLLER_CURRENT_SIDE");
            if (identitySide != null && (value = identitySide.getValue()) != null) {
                C29903a c29903a = C28366e.f57832a;
                C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, value);
            }
            Object objM69065a = c30388m.m69065a(c30388m.f61132j, new C30386l(c30388m, null), this);
            if (objM69065a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM69065a = Unit.INSTANCE;
            }
            if (objM69065a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
