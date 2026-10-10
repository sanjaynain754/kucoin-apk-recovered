package com.sumsub.sns.internal.core.presentation.common;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32490Q;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28785r extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58541a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f58542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32490Q f58543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f58544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28785r(C32490Q c32490q, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f58543c = c32490q;
        this.f58544d = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28785r c28785r = new C28785r(this.f58543c, this.f58544d, continuation);
        c28785r.f58542b = obj;
        return c28785r;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28785r) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58541a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41709m0 = (InterfaceC41709m0) this.f58542b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f58542b;
            AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = this.f58543c.f58549a.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            this.f58542b = interfaceC41709m1;
            this.f58541a = 1;
            Object config = viewModel$idensic_mobile_sdk_aar_defaultRelease.getConfig(this);
            if (config == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41709m0 = interfaceC41709m1;
            obj = config;
        }
        C29124h c29124h = (C29124h) obj;
        if (c29124h == null) {
            return Unit.INSTANCE;
        }
        if (!C41713n0.m91132h(interfaceC41709m0)) {
            return Unit.INSTANCE;
        }
        this.f58544d.invoke(c29124h);
        return Unit.INSTANCE;
    }
}
