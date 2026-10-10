package com.sumsub.sns.internal.features.presentation.camera.photo;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30413S extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC41635f f61199a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f61200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30413S(C30736v0 c30736v0, Continuation continuation) {
        super(3, continuation);
        this.f61201c = c30736v0;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C30413S c30413s = new C30413S(this.f61201c, (Continuation) obj3);
        c30413s.f61199a = (InterfaceC41635f) obj;
        c30413s.f61200b = (Throwable) obj2;
        return c30413s.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f = this.f61199a;
        Throwable th2 = this.f61200b;
        C33272c c33272c = C33272c.f67812a;
        String strM71624a = AbstractC33294e.m71624a(interfaceC41635f);
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        C33272c.f67814c.mo68956e(strM71624a, message, th2);
        C30736v0 c30736v0 = this.f61201c;
        AbstractC28052C.throwError$default(c30736v0, th2, c30736v0.f62088a, null, 4, null);
        return Unit.INSTANCE;
    }
}
