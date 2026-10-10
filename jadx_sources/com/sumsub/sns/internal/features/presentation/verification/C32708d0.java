package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32708d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66898a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32720j0 f66900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66901d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32720j0 f66902e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f66903f;

    /* JADX INFO: renamed from: g */
    public Object f66904g;

    /* JADX INFO: renamed from: h */
    public Object f66905h;

    /* JADX INFO: renamed from: i */
    public C32720j0 f66906i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32708d0(C32720j0 c32720j0, String str, Continuation continuation, C32720j0 c32720j1, String str2) {
        super(2, continuation);
        this.f66900c = c32720j0;
        this.f66901d = str;
        this.f66902e = c32720j1;
        this.f66903f = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32708d0 c32708d0 = new C32708d0(this.f66900c, this.f66901d, continuation, this.f66902e, this.f66903f);
        c32708d0.f66899b = obj;
        return c32708d0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32708d0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f8 A[Catch: Exception -> 0x0026, CancellationException -> 0x017f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x017f, blocks: (B:49:0x0134, B:51:0x013a, B:41:0x00f2, B:43:0x00f8), top: B:64:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134 A[Catch: Exception -> 0x0026, CancellationException -> 0x017f, PHI: r2 r13
      0x0134: PHI (r2v6 java.lang.Object) = (r2v5 java.lang.Object), (r2v9 java.lang.Object) binds: [B:42:0x00f6, B:48:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r13v31 ??) = (r13v46 ??), (r13v37 ??) binds: [B:42:0x00f6, B:48:0x0133] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {CancellationException -> 0x017f, blocks: (B:49:0x0134, B:51:0x013a, B:41:0x00f2, B:43:0x00f8), top: B:64:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x013a A[Catch: Exception -> 0x0026, CancellationException -> 0x017f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x017f, blocks: (B:49:0x0134, B:51:0x013a, B:41:0x00f2, B:43:0x00f8), top: B:64:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [kotlinx.coroutines.m0] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r11;
        InterfaceC41709m0 interfaceC41709m0;
        Object objM70106a;
        C32720j0 c32720j0;
        Object obj2;
        ?? r13;
        C32720j0 c32720j1;
        Object objM71296a;
        C32720j0 c32720j2;
        Throwable thM103847exceptionOrNullimpl;
        C32720j0 c32720j3;
        Object strings;
        Throwable th2;
        C32720j0 c32720j4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f66898a;
        try {
            try {
                if (r12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC41709m0 = (InterfaceC41709m0) this.f66899b;
                    C32720j0 c32720j5 = this.f66902e;
                    c32720j5.f66946n = true;
                    String str = this.f66903f;
                    c32720j5.m71307a((CharSequence) null);
                    this.f66902e.showProgress(true);
                    if (this.f66902e.f66933a != ValidationIdentifierType.EMAIL || Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches()) {
                        this.f66902e.fireEvent(C32736s.f66988a);
                        if (this.f66902e.f66933a == ValidationIdentifierType.PHONE && !StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
                            str = "+" + str;
                        }
                        C32720j0 c32720j6 = this.f66902e;
                        C30083Q c30083q = c32720j6.f66936d;
                        String type = c32720j6.f66933a.getType();
                        this.f66899b = interfaceC41709m0;
                        this.f66898a = 2;
                        objM70106a = c30083q.m70106a(type, str, this);
                        if (objM70106a != coroutine_suspended) {
                            InterfaceC41709m0 interfaceC41709m1 = interfaceC41709m0;
                            obj2 = objM70106a;
                            r13 = interfaceC41709m1;
                            r13 = r13;
                            if (Result.m103851isSuccessimpl(obj2)) {
                                c32720j1 = this.f66902e;
                                this.f66899b = r13;
                                this.f66904g = obj2;
                                this.f66905h = c32720j1;
                                this.f66898a = 3;
                                objM71296a = C32720j0.m71296a(c32720j1, (C29570k0) obj2, this);
                                if (objM71296a != coroutine_suspended) {
                                    r11 = r13;
                                    obj = objM71296a;
                                    c32720j2 = c32720j1;
                                    C32742x c32742x = (C32742x) obj;
                                    KProperty[] kPropertyArr = C32720j0.f66932t;
                                    C28936t c28936t = c32720j2.f66944l;
                                    KProperty kProperty = C32720j0.f66932t[2];
                                    c28936t.f58834a.set(c28936t.f58835b, c32742x);
                                    c32720j2.f66937e.m71293a(c32742x.f66998d, c32742x.f67000f);
                                    c32720j2.m71305a(SNSVerificationStepViewModel$Step.VERIFY_CODE);
                                    this.f66902e.showProgress(false);
                                    r13 = r11;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C33272c c33272c = C33272c.f67812a;
                                        C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66902e), "request code error", thM103847exceptionOrNullimpl);
                                        this.f66902e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                                        c32720j3 = this.f66902e;
                                        this.f66899b = r13;
                                        this.f66904g = obj2;
                                        this.f66905h = thM103847exceptionOrNullimpl;
                                        this.f66906i = c32720j3;
                                        this.f66898a = 4;
                                        strings = c32720j3.getStrings(this);
                                        if (strings != coroutine_suspended) {
                                            obj = strings;
                                            th2 = thM103847exceptionOrNullimpl;
                                            c32720j4 = c32720j3;
                                            String strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                            KProperty[] kPropertyArr2 = C32720j0.f66932t;
                                            c32720j4.m71307a(strM69377a);
                                            this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                                            this.f66902e.showProgress(false);
                                        }
                                    }
                                }
                            } else {
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c c33272c2 = C33272c.f67812a;
                                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66902e), "request code error", thM103847exceptionOrNullimpl);
                                    this.f66902e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                                    c32720j3 = this.f66902e;
                                    this.f66899b = r13;
                                    this.f66904g = obj2;
                                    this.f66905h = thM103847exceptionOrNullimpl;
                                    this.f66906i = c32720j3;
                                    this.f66898a = 4;
                                    strings = c32720j3.getStrings(this);
                                    if (strings != coroutine_suspended) {
                                        obj = strings;
                                        th2 = thM103847exceptionOrNullimpl;
                                        c32720j4 = c32720j3;
                                        String strM69377a2 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        KProperty[] kPropertyArr3 = C32720j0.f66932t;
                                        c32720j4.m71307a(strM69377a2);
                                        this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                                        this.f66902e.showProgress(false);
                                    }
                                }
                            }
                        }
                    } else {
                        c32720j0 = this.f66902e;
                        this.f66899b = interfaceC41709m0;
                        this.f66904g = c32720j0;
                        this.f66898a = 1;
                        obj = c32720j0.getString("sns_confirmation_contact_email_isNotValid", this);
                        if (obj == coroutine_suspended) {
                        }
                        KProperty[] kPropertyArr4 = C32720j0.f66932t;
                        c32720j0.m71307a((CharSequence) obj);
                        this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                        this.f66902e.showProgress(false);
                    }
                    return coroutine_suspended;
                }
                if (r12 == 1) {
                    c32720j0 = (C32720j0) this.f66904g;
                    ResultKt.throwOnFailure(obj);
                    KProperty[] kPropertyArr5 = C32720j0.f66932t;
                    c32720j0.m71307a((CharSequence) obj);
                    this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                    this.f66902e.showProgress(false);
                } else if (r12 != 2) {
                    if (r12 == 3) {
                        c32720j2 = (C32720j0) this.f66905h;
                        obj2 = this.f66904g;
                        r11 = (InterfaceC41709m0) this.f66899b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r11 = r11;
                            C32742x c32742x2 = (C32742x) obj;
                            KProperty[] kPropertyArr6 = C32720j0.f66932t;
                            C28936t c28936t2 = c32720j2.f66944l;
                            KProperty kProperty2 = C32720j0.f66932t[2];
                            c28936t2.f58834a.set(c28936t2.f58835b, c32742x2);
                            c32720j2.f66937e.m71293a(c32742x2.f66998d, c32742x2.f67000f);
                            c32720j2.m71305a(SNSVerificationStepViewModel$Step.VERIFY_CODE);
                            this.f66902e.showProgress(false);
                            r13 = r11;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c c33272c3 = C33272c.f67812a;
                                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66902e), "request code error", thM103847exceptionOrNullimpl);
                                this.f66902e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                                c32720j3 = this.f66902e;
                                this.f66899b = r13;
                                this.f66904g = obj2;
                                this.f66905h = thM103847exceptionOrNullimpl;
                                this.f66906i = c32720j3;
                                this.f66898a = 4;
                                strings = c32720j3.getStrings(this);
                                if (strings != coroutine_suspended) {
                                    obj = strings;
                                    th2 = thM103847exceptionOrNullimpl;
                                    c32720j4 = c32720j3;
                                }
                                return coroutine_suspended;
                            }
                        } catch (CancellationException unused) {
                            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(r11), "CancellationException happened", null, 4, null);
                        }
                    } else {
                        if (r12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c32720j4 = this.f66906i;
                        th2 = (Throwable) this.f66905h;
                        ResultKt.throwOnFailure(obj);
                    }
                    String strM69377a3 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                    KProperty[] kPropertyArr7 = C32720j0.f66932t;
                    c32720j4.m71307a(strM69377a3);
                    this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                    this.f66902e.showProgress(false);
                } else {
                    interfaceC41709m0 = (InterfaceC41709m0) this.f66899b;
                    ResultKt.throwOnFailure(obj);
                    objM70106a = ((Result) obj).getValue();
                    InterfaceC41709m0 interfaceC41709m2 = interfaceC41709m0;
                    obj2 = objM70106a;
                    r13 = interfaceC41709m2;
                    try {
                        r13 = r13;
                        if (Result.m103851isSuccessimpl(obj2)) {
                            c32720j1 = this.f66902e;
                            this.f66899b = r13;
                            this.f66904g = obj2;
                            this.f66905h = c32720j1;
                            this.f66898a = 3;
                            objM71296a = C32720j0.m71296a(c32720j1, (C29570k0) obj2, this);
                            if (objM71296a != coroutine_suspended) {
                                r11 = r13;
                                obj = objM71296a;
                                c32720j2 = c32720j1;
                                C32742x c32742x3 = (C32742x) obj;
                                KProperty[] kPropertyArr8 = C32720j0.f66932t;
                                C28936t c28936t3 = c32720j2.f66944l;
                                KProperty kProperty3 = C32720j0.f66932t[2];
                                c28936t3.f58834a.set(c28936t3.f58835b, c32742x3);
                                c32720j2.f66937e.m71293a(c32742x3.f66998d, c32742x3.f67000f);
                                c32720j2.m71305a(SNSVerificationStepViewModel$Step.VERIFY_CODE);
                                this.f66902e.showProgress(false);
                                r13 = r11;
                                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                                if (thM103847exceptionOrNullimpl != null) {
                                    C33272c c33272c4 = C33272c.f67812a;
                                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66902e), "request code error", thM103847exceptionOrNullimpl);
                                    this.f66902e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                                    c32720j3 = this.f66902e;
                                    this.f66899b = r13;
                                    this.f66904g = obj2;
                                    this.f66905h = thM103847exceptionOrNullimpl;
                                    this.f66906i = c32720j3;
                                    this.f66898a = 4;
                                    strings = c32720j3.getStrings(this);
                                    if (strings != coroutine_suspended) {
                                        obj = strings;
                                        th2 = thM103847exceptionOrNullimpl;
                                        c32720j4 = c32720j3;
                                        String strM69377a4 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        KProperty[] kPropertyArr9 = C32720j0.f66932t;
                                        c32720j4.m71307a(strM69377a4);
                                        this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                                        this.f66902e.showProgress(false);
                                    }
                                }
                            }
                        } else {
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c c33272c5 = C33272c.f67812a;
                                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66902e), "request code error", thM103847exceptionOrNullimpl);
                                this.f66902e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                                c32720j3 = this.f66902e;
                                this.f66899b = r13;
                                this.f66904g = obj2;
                                this.f66905h = thM103847exceptionOrNullimpl;
                                this.f66906i = c32720j3;
                                this.f66898a = 4;
                                strings = c32720j3.getStrings(this);
                                if (strings != coroutine_suspended) {
                                    obj = strings;
                                    th2 = thM103847exceptionOrNullimpl;
                                    c32720j4 = c32720j3;
                                    String strM69377a5 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                    KProperty[] kPropertyArr10 = C32720j0.f66932t;
                                    c32720j4.m71307a(strM69377a5);
                                    this.f66902e.m71305a(SNSVerificationStepViewModel$Step.INIT);
                                    this.f66902e.showProgress(false);
                                }
                            }
                        }
                        return coroutine_suspended;
                    } catch (CancellationException unused2) {
                        r11 = r13;
                        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(r11), "CancellationException happened", null, 4, null);
                    }
                }
            } catch (CancellationException unused3) {
                r11 = r12;
            }
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f66900c, e11, this.f66901d, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
