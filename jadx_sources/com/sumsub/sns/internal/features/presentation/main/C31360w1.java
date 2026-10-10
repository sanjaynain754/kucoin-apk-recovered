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
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.w1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31360w1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63554a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f63556c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31243a2 f63557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31360w1(Function2 function2, C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63556c = (SuspendLambda) function2;
        this.f63557d = c31243a2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31360w1 c31360w1 = new C31360w1(this.f63556c, this.f63557d, continuation);
        c31360w1.f63555b = obj;
        return c31360w1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31360w1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63554a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f63555b;
                ?? r11 = this.f63556c;
                this.f63554a = 1;
                if (r11.invoke(interfaceC41709m0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C31243a2 c31243a2 = this.f63557d;
            KProperty[] kPropertyArr = C31243a2.f63220x;
            c31243a2.m70634f(false);
        } catch (CancellationException unused) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "CancellationException happened", null);
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63557d, e11, "TYPE_UNKNOWN", null, 4, null);
        } finally {
            C31243a2 c31243a3 = this.f63557d;
            KProperty[] kPropertyArr2 = C31243a2.f63220x;
            c31243a3.m70634f(false);
        }
        return Unit.INSTANCE;
    }
}
