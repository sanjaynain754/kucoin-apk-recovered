package com.sumsub.sns.core.presentation.base;

import androidx.fragment.app.Fragment;
import com.sumsub.sns.internal.core.common.AbstractC28501v0;
import com.sumsub.sns.internal.core.common.InterfaceC28504w0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28127j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28133l f57349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Fragment f57350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57351c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f57352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28127j(AbstractC28133l abstractC28133l, Fragment fragment, String str, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f57349a = abstractC28133l;
        this.f57350b = fragment;
        this.f57351c = str;
        this.f57352d = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28127j(this.f57349a, this.f57350b, this.f57351c, this.f57352d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28127j) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (!this.f57349a.isAdded()) {
            return Unit.INSTANCE;
        }
        InterfaceC28504w0 interfaceC28504w0Access$getNavigation = AbstractC28133l.access$getNavigation(this.f57349a);
        if (interfaceC28504w0Access$getNavigation != null) {
            AbstractC28501v0.m69388a(interfaceC28504w0Access$getNavigation, this.f57350b, this.f57351c, this.f57352d, 8);
        }
        return Unit.INSTANCE;
    }
}
