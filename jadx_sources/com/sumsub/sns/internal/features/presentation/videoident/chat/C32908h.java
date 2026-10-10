package com.sumsub.sns.internal.features.presentation.videoident.chat;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32908h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32921u f67314b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32917q f67315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32908h(C32921u c32921u, C32917q c32917q, Continuation continuation) {
        super(2, continuation);
        this.f67314b = c32921u;
        this.f67315c = c32917q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32908h(this.f67314b, this.f67315c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32908h(this.f67314b, this.f67315c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67313a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n = this.f67314b.f67361i;
            C32907g c32907g = new C32907g(this.f67315c);
            this.f67313a = 1;
            if (interfaceC41669n.collect(c32907g, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
