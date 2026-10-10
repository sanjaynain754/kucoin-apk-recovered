package com.sumsub.sns.core.presentation.base;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.D0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28055D0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57216a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f57218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28073M0 f57219d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f57220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28055D0(Function2 function2, AbstractC28073M0 abstractC28073M0, String str, Continuation continuation) {
        super(2, continuation);
        this.f57218c = function2;
        this.f57219d = abstractC28073M0;
        this.f57220e = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28055D0 c28055d0 = new C28055D0(this.f57218c, this.f57219d, this.f57220e, continuation);
        c28055d0.f57217b = obj;
        return c28055d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28055D0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57216a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC41709m0 = (InterfaceC41709m0) this.f57217b;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException unused) {
                        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f57217b;
                try {
                    Function2 function2 = this.f57218c;
                    this.f57217b = interfaceC41709m1;
                    this.f57216a = 1;
                    if (function2.invoke(interfaceC41709m1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException unused2) {
                    interfaceC41709m0 = interfaceC41709m1;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
                }
            }
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f57219d, e11, this.f57220e, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
