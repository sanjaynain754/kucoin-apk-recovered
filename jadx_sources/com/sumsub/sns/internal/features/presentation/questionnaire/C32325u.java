package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32325u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65861a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32300I f65863c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32300I f65864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32325u(C32300I c32300i, Continuation continuation, C32300I c32300i2) {
        super(2, continuation);
        this.f65863c = c32300i;
        this.f65864d = c32300i2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32325u c32325u = new C32325u(this.f65863c, continuation, this.f65864d);
        c32325u.f65862b = obj;
        return c32325u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32325u) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65861a;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C32300I c32300i = this.f65864d;
                this.f65861a = 1;
                KProperty[] kPropertyArr = C32300I.f65798w;
                obj = c32300i.m71086a(true, (ContinuationImpl) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C32300I c32300i2 = this.f65864d;
                C30316a.m70183b(c32300i2.f65799a, "SNSQuestionnaireViewModel", "Successfully submitted questionnaire. Current page: " + c32300i2.m71089e() + ", total pages: " + this.f65864d.m71091g().f58567b.size());
                if (this.f65864d.m71089e() < CollectionsKt.getLastIndex(this.f65864d.m71091g().f58567b)) {
                    int iM71089e = this.f65864d.m71089e();
                    C28936t c28936t = this.f65864d.f65810l;
                    KProperty[] kPropertyArr2 = C32300I.f65798w;
                    KProperty kProperty = kPropertyArr2[1];
                    c28936t.f58834a.set(c28936t.f58835b, Integer.valueOf(iM71089e + 1));
                    C32300I c32300i3 = this.f65864d;
                    SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
                    C28936t c28936t2 = c32300i3.f65808j;
                    KProperty kProperty2 = kPropertyArr2[0];
                    c28936t2.f58834a.set(c28936t2.f58835b, sNSQuestionnaireViewModel$Step);
                    C32300I c32300i4 = this.f65864d;
                    C30316a.m70183b(c32300i4.f65799a, "SNSQuestionnaireViewModel", "Showing next page: " + c32300i4.m71089e());
                } else {
                    AbstractC28052C.finish$default(this.f65864d, new C28494t(true), null, null, null, 14, null);
                }
            }
            this.f65863c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f65863c.showProgress(false);
            throw th2;
        }
    }
}
