package com.sumsub.sns.internal.features.presentation.country.picker;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30901m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30903o f62427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30891d f62428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30901m(C30903o c30903o, C30891d c30891d, Continuation continuation) {
        super(2, continuation);
        this.f62427b = c30903o;
        this.f62428c = c30891d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30901m(this.f62427b, this.f62428c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30901m(this.f62427b, this.f62428c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62426a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n = this.f62427b.f62434c;
            C30891d c30891d = this.f62428c;
            this.f62426a = 1;
            if (interfaceC41669n.emit(c30891d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
