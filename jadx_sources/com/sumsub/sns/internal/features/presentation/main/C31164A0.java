package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.socket.C30043i;
import com.sumsub.sns.internal.features.data.repository.socket.C30044j;
import com.sumsub.sns.internal.features.data.repository.socket.C30050p;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31164A0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29124h f63014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31164A0(C31251c2 c31251c2, C29124h c29124h, Continuation continuation) {
        super(2, continuation);
        this.f63013b = c31251c2;
        this.f63014c = c29124h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31164A0(this.f63013b, this.f63014c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31164A0(this.f63013b, this.f63014c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.main.C31251c2.m70639a(r9, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r8) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63012a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C31251c2 c31251c2 = this.f63013b;
        C30050p c30050p = (C30050p) c31251c2.f63277k;
        AbstractC28421U.m69303a(C41636g.m90917h(C41636g.m90895S(C41636g.m90898V((InterfaceC41673r) c30050p.f60381k.getValue(), new C30043i(c30050p, "SNSAppViewModel", null)), new C30044j(c30050p, "SNSAppViewModel", null)), new C31203N0(null)), ViewModelKt.getViewModelScope(c31251c2), (Function2) null);
        AbstractC28421U.m69303a(((C29967J) c31251c2.f63276j).f60201i, ViewModelKt.getViewModelScope(c31251c2), new C31206O0(c31251c2, null));
        C31251c2 c31251c3 = this.f63013b;
        C28936t c28936t = c31251c3.f63285s;
        KProperty kProperty = C31251c2.f63267D[1];
        boolean zBooleanValue = ((Boolean) c28936t.m69705a()).booleanValue();
        C29124h c29124h = this.f63014c;
        this.f63012a = 1;
        if (c31251c3.m70646a(zBooleanValue, c29124h, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31251c2 c31251c4 = this.f63013b;
        this.f63012a = 2;
    }
}
