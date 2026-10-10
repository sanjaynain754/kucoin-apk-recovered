package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.A1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30435A1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f61264c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29054T f61265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30435A1(C30440B2 c30440b2, C32635M c32635m, C29054T c29054t, Continuation continuation) {
        super(2, continuation);
        this.f61263b = c30440b2;
        this.f61264c = c32635m;
        this.f61265d = c29054t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30435A1(this.f61263b, this.f61264c, this.f61265d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30435A1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61262a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30440B2 c30440b2 = this.f61263b;
            C32635M c32635m = this.f61264c;
            C29054T c29054t = this.f61265d;
            this.f61262a = 1;
            KProperty[] kPropertyArr = C30440B2.f61279U;
            if (c30440b2.m70293a(c32635m, c29054t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
