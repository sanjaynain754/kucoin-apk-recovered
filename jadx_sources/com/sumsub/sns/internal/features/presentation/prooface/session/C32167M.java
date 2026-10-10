package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32167M extends SuspendLambda implements Function5 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC32252y f65490a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AnswerType f65491b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C32240s f65492c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f65493d;

    public C32167M(Continuation continuation) {
        super(5, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C32167M c32167m = new C32167M((Continuation) obj5);
        c32167m.f65490a = (InterfaceC32252y) obj;
        c32167m.f65491b = (AnswerType) obj2;
        c32167m.f65492c = (C32240s) obj3;
        c32167m.f65493d = zBooleanValue;
        return c32167m.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC32252y interfaceC32252y = this.f65490a;
        AnswerType answerType = this.f65491b;
        C32240s c32240s = this.f65492c;
        boolean z11 = this.f65493d;
        if (c32240s != null) {
            return new C32240s(c32240s.f65691a, z11);
        }
        return new C32242t(interfaceC32252y, answerType);
    }
}
