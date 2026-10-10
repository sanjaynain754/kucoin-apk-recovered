package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30101b;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32700Z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66863a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66864b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32720j0 f66865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66866d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32720j0 f66867e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f66868f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f66869g;

    /* JADX INFO: renamed from: h */
    public Object f66870h;

    /* JADX INFO: renamed from: i */
    public Throwable f66871i;

    /* JADX INFO: renamed from: j */
    public C32720j0 f66872j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32700Z(C32720j0 c32720j0, String str, Continuation continuation, C32720j0 c32720j1, String str2, String str3) {
        super(2, continuation);
        this.f66865c = c32720j0;
        this.f66866d = str;
        this.f66867e = c32720j1;
        this.f66868f = str2;
        this.f66869g = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32700Z c32700z = new C32700Z(this.f66865c, this.f66866d, continuation, this.f66867e, this.f66868f, this.f66869g);
        c32700z.f66864b = obj;
        return c32700z;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32700Z) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: Exception -> 0x001f, CancellationException -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x001a, B:39:0x00c9, B:15:0x0032, B:31:0x008f, B:33:0x0097, B:35:0x009d, B:19:0x003e, B:26:0x0075, B:28:0x007b, B:23:0x0055), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object objM70112a;
        InterfaceC41709m0 interfaceC41709m1;
        Throwable thM103847exceptionOrNullimpl;
        C32720j0 c32720j0;
        Object strings;
        Throwable th2;
        C32720j0 c32720j1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66863a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            c32720j1 = this.f66872j;
                            th2 = this.f66871i;
                            interfaceC41709m1 = (InterfaceC41709m0) this.f66864b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                String strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                KProperty[] kPropertyArr = C32720j0.f66932t;
                                c32720j1.m71307a(strM69377a);
                                this.f66867e.showProgress(false);
                            } catch (CancellationException unused) {
                                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objM70112a = this.f66870h;
                    InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.f66864b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        interfaceC41709m0 = interfaceC41709m2;
                        this.f66867e.showProgress(false);
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70112a);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c c33272c = C33272c.f67812a;
                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66867e), "request code error", thM103847exceptionOrNullimpl);
                            this.f66867e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                            c32720j0 = this.f66867e;
                            this.f66864b = interfaceC41709m0;
                            this.f66870h = objM70112a;
                            this.f66871i = thM103847exceptionOrNullimpl;
                            this.f66872j = c32720j0;
                            this.f66863a = 3;
                            strings = c32720j0.getStrings(this);
                            if (strings != coroutine_suspended) {
                                interfaceC41709m1 = interfaceC41709m0;
                                obj = strings;
                                th2 = thM103847exceptionOrNullimpl;
                                c32720j1 = c32720j0;
                                String strM69377a2 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                KProperty[] kPropertyArr2 = C32720j0.f66932t;
                                c32720j1.m71307a(strM69377a2);
                                this.f66867e.showProgress(false);
                            }
                            return coroutine_suspended;
                        }
                    } catch (CancellationException unused2) {
                        interfaceC41709m1 = interfaceC41709m2;
                        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                    }
                    return Unit.INSTANCE;
                }
                InterfaceC41709m0 interfaceC41709m3 = (InterfaceC41709m0) this.f66864b;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM70112a = ((Result) obj).getValue();
                    interfaceC41709m0 = interfaceC41709m3;
                } catch (CancellationException unused3) {
                    interfaceC41709m1 = interfaceC41709m3;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                }
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC41709m0 = (InterfaceC41709m0) this.f66864b;
            try {
                C32720j0 c32720j2 = this.f66867e;
                KProperty[] kPropertyArr3 = C32720j0.f66932t;
                c32720j2.m71307a((CharSequence) null);
                this.f66867e.showProgress(true);
                C30101b c30101b = this.f66867e.f66938f;
                String str = this.f66868f;
                String str2 = this.f66869g;
                this.f66864b = interfaceC41709m0;
                this.f66863a = 1;
                objM70112a = c30101b.m70112a(str, str2, this);
                if (objM70112a == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (CancellationException unused4) {
                interfaceC41709m1 = interfaceC41709m0;
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
            }
            if (Result.m103851isSuccessimpl(objM70112a)) {
                C32720j0 c32720j3 = this.f66867e;
                this.f66864b = interfaceC41709m0;
                this.f66870h = objM70112a;
                this.f66863a = 2;
                KProperty[] kPropertyArr4 = C32720j0.f66932t;
                if (c32720j3.m71310b((C29570k0) objM70112a, this) != coroutine_suspended) {
                    this.f66867e.showProgress(false);
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70112a);
                    if (thM103847exceptionOrNullimpl != null) {
                        C33272c c33272c2 = C33272c.f67812a;
                        C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66867e), "request code error", thM103847exceptionOrNullimpl);
                        this.f66867e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                        c32720j0 = this.f66867e;
                        this.f66864b = interfaceC41709m0;
                        this.f66870h = objM70112a;
                        this.f66871i = thM103847exceptionOrNullimpl;
                        this.f66872j = c32720j0;
                        this.f66863a = 3;
                        strings = c32720j0.getStrings(this);
                        if (strings != coroutine_suspended) {
                            interfaceC41709m1 = interfaceC41709m0;
                            obj = strings;
                            th2 = thM103847exceptionOrNullimpl;
                            c32720j1 = c32720j0;
                            String strM69377a3 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                            KProperty[] kPropertyArr5 = C32720j0.f66932t;
                            c32720j1.m71307a(strM69377a3);
                            this.f66867e.showProgress(false);
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70112a);
                if (thM103847exceptionOrNullimpl != null) {
                    C33272c c33272c3 = C33272c.f67812a;
                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this.f66867e), "request code error", thM103847exceptionOrNullimpl);
                    this.f66867e.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                    c32720j0 = this.f66867e;
                    this.f66864b = interfaceC41709m0;
                    this.f66870h = objM70112a;
                    this.f66871i = thM103847exceptionOrNullimpl;
                    this.f66872j = c32720j0;
                    this.f66863a = 3;
                    strings = c32720j0.getStrings(this);
                    if (strings != coroutine_suspended) {
                        interfaceC41709m1 = interfaceC41709m0;
                        obj = strings;
                        th2 = thM103847exceptionOrNullimpl;
                        c32720j1 = c32720j0;
                        String strM69377a4 = AbstractC28476n.m69377a(th2, (C29983l) obj);
                        KProperty[] kPropertyArr6 = C32720j0.f66932t;
                        c32720j1.m71307a(strM69377a4);
                        this.f66867e.showProgress(false);
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f66865c, e11, this.f66866d, null, 4, null);
        }
    }
}
