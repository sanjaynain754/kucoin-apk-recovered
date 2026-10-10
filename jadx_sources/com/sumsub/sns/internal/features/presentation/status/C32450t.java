package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30088W;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32450t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32403L f66142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29172p f66143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32450t(C32403L c32403l, AbstractC29172p abstractC29172p, Continuation continuation) {
        super(2, continuation);
        this.f66142b = c32403l;
        this.f66143c = abstractC29172p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32450t(this.f66142b, this.f66143c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32450t(this.f66142b, this.f66143c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r12 == r0) goto L29;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object objM70108a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66141a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    objM70108a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(Result.m103851isSuccessimpl(objM70108a));
        }
        ResultKt.throwOnFailure(obj);
        C32403L c32403l = this.f66142b;
        this.f66141a = 1;
        obj = c32403l.getStrings(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list = ((C29983l) obj).f60249b;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29332c c29332c = ((C29380i) it.next()).f59390b;
                if (c29332c != null) {
                    arrayList2.add(c29332c);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            C32403L c32403l2 = this.f66142b;
            C30088W c30088w = c32403l2.f66043b;
            InterfaceC29921d interfaceC29921d = c32403l2.f66046e;
            AbstractC29172p abstractC29172p = this.f66143c;
            this.f66141a = 2;
            objM70108a = c30088w.m70108a(interfaceC29921d, abstractC29172p, arrayList, true, this);
        } else {
            C33272c.f67816e.f67810a.mo68956e("SNSApplicantStatusViewModel", "acceptAgreement: no agreements found", null);
            return Boxing.boxBoolean(false);
        }
    }
}
