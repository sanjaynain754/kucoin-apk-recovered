package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31071a0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31120v0 f62827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31071a0(C31120v0 c31120v0, Continuation continuation) {
        super(2, continuation);
        this.f62827b = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31071a0(this.f62827b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31071a0(this.f62827b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Control control;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62826a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) this.f62827b.f62922h.f58327a.invoke()).booleanValue();
            C31120v0 c31120v0 = this.f62827b;
            if (c31120v0.f62928n == 0) {
                control = Control.StartButton;
            } else {
                control = Control.RetryButton;
            }
            C28367f.m69256a(c31120v0.m70585e(), control, MapsKt.mapOf(TuplesKt.m90091to("IS_LOCATION_ENABLED", String.valueOf(zBooleanValue))), (Popup) null, 4);
            C31120v0 c31120v1 = this.f62827b;
            this.f62826a = 1;
            if (c31120v1.m70584b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
