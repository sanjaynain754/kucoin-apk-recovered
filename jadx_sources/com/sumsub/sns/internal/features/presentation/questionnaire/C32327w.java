package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32327w extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC41635f f65868a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f65869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32300I f65870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32327w(C32300I c32300i, Continuation continuation) {
        super(3, continuation);
        this.f65870c = c32300i;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C32327w c32327w = new C32327w(this.f65870c, (Continuation) obj3);
        c32327w.f65868a = (InterfaceC41635f) obj;
        c32327w.f65869b = (Throwable) obj2;
        return c32327w.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f = this.f65868a;
        Throwable th2 = this.f65869b;
        C33272c c33272c = C33272c.f67812a;
        String strM71624a = AbstractC33294e.m71624a(interfaceC41635f);
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        C33272c.f67814c.mo68956e(strM71624a, message, th2);
        C32300I c32300i = this.f65870c;
        AbstractC28052C.throwError$default(c32300i, th2, c32300i.f65807i, null, 4, null);
        return Unit.INSTANCE;
    }
}
