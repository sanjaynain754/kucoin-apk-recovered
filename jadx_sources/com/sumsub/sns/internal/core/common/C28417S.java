package com.sumsub.sns.internal.core.common;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28417S extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LifecycleOwner f57929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41634e f57930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28417S(LifecycleOwner lifecycleOwner, InterfaceC41634e interfaceC41634e, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f57929b = lifecycleOwner;
        this.f57930c = interfaceC41634e;
        this.f57931d = function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28417S(this.f57929b, this.f57930c, this.f57931d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28417S) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57928a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.f57929b.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C28414Q c28414q = new C28414Q(null, this.f57931d, this.f57930c);
            this.f57928a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c28414q, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
