package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.MRTDError;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30233F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30234G f60768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f60769c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f60770d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f60771e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MRTDError f60772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30233F(C30234G c30234g, String str, String str2, String str3, MRTDError mRTDError, Continuation continuation) {
        super(2, continuation);
        this.f60768b = c30234g;
        this.f60769c = str;
        this.f60770d = str2;
        this.f60771e = str3;
        this.f60772f = mRTDError;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30233F(this.f60768b, this.f60769c, this.f60770d, this.f60771e, this.f60772f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30233F) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60767a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C29917M c29917m = this.f60768b.f60773a;
        String str = this.f60769c;
        String str2 = this.f60770d;
        String str3 = this.f60771e;
        MRTDError mRTDError = this.f60772f;
        this.f60767a = 1;
        Object objM69954a = ((C29914J) c29917m.f60057a).m69954a(str, str2, str3, (ArrayList) null, (String) null, (String) null, CollectionsKt.listOf(mRTDError.getValue()), this);
        if (objM69954a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM69954a;
    }
}
