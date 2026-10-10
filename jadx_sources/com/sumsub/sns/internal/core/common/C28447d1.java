package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32647d;
import com.sumsub.sns.internal.features.presentation.utils.C32643b;
import com.sumsub.sns.internal.features.presentation.utils.C32645c;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.d1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28447d1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28052C f57957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32649e f57958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f57959d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function1 f57960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28447d1(AbstractC28052C abstractC28052C, C32649e c32649e, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f57957b = abstractC28052C;
        this.f57958c = c32649e;
        this.f57959d = str;
        this.f57960e = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28447d1(this.f57957b, this.f57958c, this.f57959d, this.f57960e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28447d1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57956a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC28052C abstractC28052C = this.f57957b;
                this.f57956a = 1;
                obj = abstractC28052C.getStrings(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list = ((C29983l) obj).f60249b;
            C32649e c32649e = this.f57958c;
            String str = this.f57959d;
            c32649e.getClass();
            AbstractC32647d abstractC32647dM71263a = C32649e.m71263a(str, list);
            if (abstractC32647dM71263a instanceof C32643b) {
                AbstractC28052C.onLinkClicked$default(this.f57957b, ((C32643b) abstractC32647dM71263a).f66638a, false, 2, null);
            } else if (abstractC32647dM71263a instanceof C32645c) {
                this.f57960e.invoke(((C32645c) abstractC32647dM71263a).f66640a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e("handleAgreementLinkClick", "Error handling link click", e12);
            C33272c.f67816e.f67810a.mo68956e("handleAgreementLinkClick", "Error handling link click", e12);
        }
        return Unit.INSTANCE;
    }
}
