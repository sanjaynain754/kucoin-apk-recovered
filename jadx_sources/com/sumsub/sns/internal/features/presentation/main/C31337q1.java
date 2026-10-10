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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31337q1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29124h f63522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31337q1(C31243a2 c31243a2, C29124h c29124h, Continuation continuation) {
        super(2, continuation);
        this.f63521b = c31243a2;
        this.f63522c = c29124h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31337q1(this.f63521b, this.f63522c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31337q1(this.f63521b, this.f63522c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.main.C31243a2.m70614a(r9, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r8) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63520a;
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
        C31243a2 c31243a2 = this.f63521b;
        C30050p c30050p = (C30050p) c31243a2.f63227j;
        AbstractC28421U.m69303a(C41636g.m90917h(C41636g.m90895S(C41636g.m90898V((InterfaceC41673r) c30050p.f60381k.getValue(), new C30043i(c30050p, "SNSAppViewModel2", null)), new C30044j(c30050p, "SNSAppViewModel2", null)), new C31368y1(null)), ViewModelKt.getViewModelScope(c31243a2), (Function2) null);
        AbstractC28421U.m69303a(((C29967J) c31243a2.f63226i).f60201i, ViewModelKt.getViewModelScope(c31243a2), new C31372z1(c31243a2, null));
        C31243a2 c31243a3 = this.f63521b;
        C28936t c28936t = c31243a3.f63232o;
        KProperty kProperty = C31243a2.f63220x[1];
        boolean zBooleanValue = ((Boolean) c28936t.m69705a()).booleanValue();
        C29124h c29124h = this.f63522c;
        this.f63520a = 1;
        if (c31243a3.m70619a(zBooleanValue, c29124h, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31243a2 c31243a4 = this.f63521b;
        this.f63520a = 2;
    }
}
