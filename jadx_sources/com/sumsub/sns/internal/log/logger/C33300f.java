package com.sumsub.sns.internal.log.logger;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29722y2;
import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.features.data.model.common.LogType;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33300f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67885a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C33301g f67887c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LogParams f67888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33300f(C33301g c33301g, LogParams logParams, Continuation continuation) {
        super(2, continuation);
        this.f67887c = c33301g;
        this.f67888d = logParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C33300f c33300f = new C33300f(this.f67887c, this.f67888d, continuation);
        c33300f.f67886b = obj;
        return c33300f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C33300f) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object obj2 = this.f67885a;
        boolean z11 = false;
        try {
            if (obj2 != 0) {
                if (obj2 == 1) {
                    InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f67886b;
                    ResultKt.throwOnFailure(obj);
                    obj2 = interfaceC41709m0;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f67886b;
                C30002b c30002b = this.f67887c.f67889a;
                LogType logType = LogType.Warn;
                LogParams logParams = this.f67888d;
                this.f67886b = interfaceC41709m1;
                this.f67885a = 1;
                obj2 = interfaceC41709m1;
                if (c30002b.f60286a.m70064a(logType.getValue(), AbstractC29722y2.m69913a(logParams), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (SNSException.Api e11) {
            Integer code = e11.getCode();
            if (code != null) {
                iIntValue = code.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue >= 400) {
                Integer code2 = e11.getCode();
                if (code2 != null) {
                    iIntValue2 = code2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 <= 499) {
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(obj2), "Unauthorized, drop packet", null, 4, null);
                }
                return Boxing.boxBoolean(z11);
            }
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(obj2), "Failed to send logs", e11);
            return Boxing.boxBoolean(z11);
        } catch (Exception e12) {
            C33272c c33272c2 = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(obj2), "Failed to send logs", e12);
        }
        z11 = true;
        return Boxing.boxBoolean(z11);
    }
}
