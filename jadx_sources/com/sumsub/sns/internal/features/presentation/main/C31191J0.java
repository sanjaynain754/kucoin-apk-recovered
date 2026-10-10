package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31191J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63057a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f63059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31251c2 f63060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31191J0(Function2 function2, C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63059c = (SuspendLambda) function2;
        this.f63060d = c31251c2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31191J0 c31191j0 = new C31191J0(this.f63059c, this.f63060d, continuation);
        c31191j0.f63058b = obj;
        return c31191j0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31191J0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63057a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f63058b;
                ?? r11 = this.f63059c;
                this.f63057a = 1;
                if (r11.invoke(interfaceC41709m0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C31251c2 c31251c2 = this.f63060d;
            C31363x0 c31363x0 = C31251c2.f63266C;
            c31251c2.m70658f(false);
        } catch (CancellationException unused) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "CancellationException happened", null);
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63060d, e11, "TYPE_UNKNOWN", null, 4, null);
        } finally {
            C31251c2 c31251c3 = this.f63060d;
            C31363x0 c31363x1 = C31251c2.f63266C;
            c31251c3.m70658f(false);
        }
        return Unit.INSTANCE;
    }
}
