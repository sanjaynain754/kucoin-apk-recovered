package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32818b;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32827k;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32765u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67047a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32767w f67049c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32767w f67050d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f67051e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f67052f;

    /* JADX INFO: renamed from: g */
    public Throwable f67053g;

    /* JADX INFO: renamed from: h */
    public Throwable f67054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32765u(C32767w c32767w, Continuation continuation, C32767w c32767w2, String str, String str2) {
        super(2, continuation);
        this.f67049c = c32767w;
        this.f67050d = c32767w2;
        this.f67051e = str;
        this.f67052f = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32765u c32765u = new C32765u(this.f67049c, continuation, this.f67050d, this.f67051e, this.f67052f);
        c32765u.f67048b = obj;
        return c32765u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32765u) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x010a, code lost:
    
        if (((com.sumsub.sns.internal.features.presentation.verification2.host.C32814J) r13).m71348a(r1) == r0) goto L43;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70106a;
        Object obj2;
        Throwable thM103847exceptionOrNullimpl;
        Throwable th2;
        C29570k0 c29570k0;
        String str;
        int iIntValue;
        long jLongValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67047a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        thM103847exceptionOrNullimpl = this.f67054h;
                        th2 = this.f67053g;
                        obj2 = this.f67048b;
                        ResultKt.throwOnFailure(obj);
                        String strM69377a = AbstractC28476n.m69377a(thM103847exceptionOrNullimpl, (C29983l) obj);
                        C32827k c32827k = ((C32814J) this.f67050d.f67059a).f67152h;
                        C32818b c32818b = new C32818b(strM69377a, this.f67052f);
                        C28936t c28936t = c32827k.f67174a;
                        KProperty kProperty = C32827k.f67173c[0];
                        c28936t.f58834a.set(c28936t.f58835b, c32818b);
                        InterfaceC32769y interfaceC32769y = this.f67050d.f67059a;
                        C32745a c32745a = new C32745a(th2);
                        this.f67048b = obj2;
                        this.f67053g = null;
                        this.f67054h = null;
                        this.f67047a = 3;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    objM70106a = ((Result) obj).getValue();
                }
                this.f67049c.showProgress(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C30083Q c30083q = this.f67050d.f67062d;
            String str2 = this.f67051e;
            String str3 = this.f67052f;
            this.f67047a = 1;
            objM70106a = c30083q.m70106a(str2, str3, this);
            if (objM70106a == coroutine_suspended) {
            }
            return coroutine_suspended;
            obj2 = objM70106a;
            if (Result.m103851isSuccessimpl(obj2) && (str = (c29570k0 = (C29570k0) obj2).f59586a) != null) {
                Integer num = c29570k0.f59593h;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 6;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l11 = c29570k0.f59594i;
                if (l11 != null) {
                    jLongValue = l11.longValue();
                } else {
                    jLongValue = 60;
                }
                ((C32814J) this.f67050d.f67059a).f67151g.m71293a(this.f67052f, jCurrentTimeMillis + timeUnit.toMillis(jLongValue));
                C32827k c32827k2 = ((C32814J) this.f67050d.f67059a).f67152h;
                C32820d c32820d = new C32820d(this.f67052f, str, iIntValue);
                C28936t c28936t2 = c32827k2.f67174a;
                KProperty kProperty2 = C32827k.f67173c[0];
                c28936t2.f58834a.set(c28936t2.f58835b, c32820d);
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c.f67814c.mo68956e("OtpInputViewModel", "Request code error", thM103847exceptionOrNullimpl);
                C32767w c32767w = this.f67050d;
                int i12 = C32767w.f67058V;
                c32767w.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                C32767w c32767w2 = this.f67050d;
                this.f67048b = obj2;
                this.f67053g = thM103847exceptionOrNullimpl;
                this.f67054h = thM103847exceptionOrNullimpl;
                this.f67047a = 2;
                obj = c32767w2.getStrings(this);
                if (obj != coroutine_suspended) {
                    th2 = thM103847exceptionOrNullimpl;
                    String strM69377a2 = AbstractC28476n.m69377a(thM103847exceptionOrNullimpl, (C29983l) obj);
                    C32827k c32827k3 = ((C32814J) this.f67050d.f67059a).f67152h;
                    C32818b c32818b2 = new C32818b(strM69377a2, this.f67052f);
                    C28936t c28936t3 = c32827k3.f67174a;
                    KProperty kProperty3 = C32827k.f67173c[0];
                    c28936t3.f58834a.set(c28936t3.f58835b, c32818b2);
                    InterfaceC32769y interfaceC32769y2 = this.f67050d.f67059a;
                    C32745a c32745a2 = new C32745a(th2);
                    this.f67048b = obj2;
                    this.f67053g = null;
                    this.f67054h = null;
                    this.f67047a = 3;
                }
                return coroutine_suspended;
            }
            this.f67049c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            this.f67049c.showProgress(false);
            throw th3;
        }
    }
}
