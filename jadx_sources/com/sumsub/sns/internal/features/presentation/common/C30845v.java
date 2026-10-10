package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30845v extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29015J f62292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC30808G f62293c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29054T f62294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30845v(C29015J c29015j, AbstractC30808G abstractC30808G, C29054T c29054t, Continuation continuation) {
        super(2, continuation);
        this.f62292b = c29015j;
        this.f62293c = abstractC30808G;
        this.f62294d = c29054t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30845v(this.f62292b, this.f62293c, this.f62294d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30845v) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1.m71228a(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.utils.C32635M.m71222a(r5, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62291a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C29015J c29015j = this.f62292b;
            if (c29015j != null) {
                C32635M c32635m = this.f62293c.f62236a;
                this.f62291a = 1;
            } else {
                C32635M c32635m2 = this.f62293c.f62236a;
                C29054T c29054t = this.f62294d;
                this.f62291a = 2;
                c32635m2.getClass();
            }
        }
        return Unit.INSTANCE;
    }
}
