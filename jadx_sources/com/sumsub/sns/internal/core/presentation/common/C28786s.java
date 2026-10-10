package com.sumsub.sns.internal.core.presentation.common;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28786s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58545a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f58546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28787t f58547c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f58548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28786s(AbstractC28787t abstractC28787t, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f58547c = abstractC28787t;
        this.f58548d = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28786s c28786s = new C28786s(this.f58547c, this.f58548d, continuation);
        c28786s.f58546b = obj;
        return c28786s;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28786s) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58545a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41709m0 = (InterfaceC41709m0) this.f58546b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f58546b;
            AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = this.f58547c.f58549a.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
            this.f58546b = interfaceC41709m1;
            this.f58545a = 1;
            Object strings = viewModel$idensic_mobile_sdk_aar_defaultRelease.getStrings(this);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41709m0 = interfaceC41709m1;
            obj = strings;
        }
        C29983l c29983l = (C29983l) obj;
        if (!C41713n0.m91132h(interfaceC41709m0)) {
            return Unit.INSTANCE;
        }
        this.f58548d.invoke(c29983l);
        return Unit.INSTANCE;
    }
}
