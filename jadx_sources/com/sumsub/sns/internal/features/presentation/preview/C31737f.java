package com.sumsub.sns.internal.features.presentation.preview;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31737f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public AbstractC29172p f64469a;

    /* JADX INFO: renamed from: b */
    public int f64470b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64471c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC31739h f64472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31737f(AbstractC31739h abstractC31739h, Continuation continuation) {
        super(2, continuation);
        this.f64472d = abstractC31739h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31737f c31737f = new C31737f(this.f64472d, continuation);
        c31737f.f64471c = obj;
        return c31737f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31737f c31737f = new C31737f(this.f64472d, (Continuation) obj2);
        c31737f.f64471c = (InterfaceC41709m0) obj;
        return c31737f.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:14:0x0028, B:34:0x0093, B:36:0x0099, B:42:0x00a6, B:45:0x00c8, B:48:0x00dc, B:49:0x00e6, B:17:0x0036, B:24:0x0060, B:26:0x0076, B:30:0x007e, B:20:0x0041), top: B:53:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:14:0x0028, B:34:0x0093, B:36:0x0099, B:42:0x00a6, B:45:0x00c8, B:48:0x00dc, B:49:0x00e6, B:17:0x0036, B:24:0x0060, B:26:0x0076, B:30:0x007e, B:20:0x0041), top: B:53:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r9.mo70740a(r1, r3, r8) == r0) goto L44;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        AbstractC29172p abstractC29172p;
        Object value;
        InterfaceC41709m0 interfaceC41709m1;
        String message;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64470b;
        boolean z11 = true;
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
                        abstractC29172p = this.f64469a;
                        interfaceC41709m1 = (InterfaceC41709m0) this.f64471c;
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                        if (!Result.m103850isFailureimpl(value)) {
                            if (Result.m103850isFailureimpl(value)) {
                                obj2 = null;
                            } else {
                                obj2 = value;
                            }
                            if (obj2 == null) {
                                AbstractC31739h abstractC31739h = this.f64472d;
                                ResultKt.throwOnFailure(value);
                                abstractC31739h.mo70743a((C30270n) value);
                                this.f64472d.showProgress(false);
                                AbstractC31739h abstractC31739h2 = this.f64472d;
                                C29124h config = abstractC31739h2.getConfig();
                                this.f64471c = null;
                                this.f64469a = null;
                                this.f64470b = 3;
                            }
                        }
                        Exception exc = (Exception) Result.m103847exceptionOrNullimpl(value);
                        C33272c c33272c = C33272c.f67812a;
                        String strM71624a = AbstractC33294e.m71624a(interfaceC41709m1);
                        message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        C33272c.f67814c.mo68956e(strM71624a, message, exc);
                        throw new Exception(exc);
                    }
                } else {
                    interfaceC41709m0 = (InterfaceC41709m0) this.f64471c;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.f64471c;
            this.f64472d.showProgress(true);
            this.f64472d.mo70746c(false);
            InterfaceC29984m interfaceC29984m = this.f64472d.f64478c;
            this.f64471c = interfaceC41709m2;
            this.f64470b = 1;
            Object objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) this);
            if (objM70042a != coroutine_suspended) {
                interfaceC41709m0 = interfaceC41709m2;
                obj = objM70042a;
            }
            return coroutine_suspended;
            AbstractC29172p abstractC29172p2 = (AbstractC29172p) ((AbstractC29971N) obj).m70052d();
            C29154m c29154mM69794a = abstractC29172p2.m69794a(this.f64472d.f64476a.getType());
            if (c29154mM69794a == null || !c29154mM69794a.m69789c()) {
                z11 = false;
            }
            C30156e c30156e = this.f64472d.f64479d;
            this.f64471c = interfaceC41709m0;
            this.f64469a = abstractC29172p2;
            this.f64470b = 2;
            Object objM70120a = c30156e.m70120a(z11, this);
            if (objM70120a != coroutine_suspended) {
                InterfaceC41709m0 interfaceC41709m3 = interfaceC41709m0;
                abstractC29172p = abstractC29172p2;
                value = objM70120a;
                interfaceC41709m1 = interfaceC41709m3;
                if (!Result.m103850isFailureimpl(value)) {
                    if (Result.m103850isFailureimpl(value)) {
                        obj2 = null;
                    } else {
                        obj2 = value;
                    }
                    if (obj2 == null) {
                        AbstractC31739h abstractC31739h3 = this.f64472d;
                        ResultKt.throwOnFailure(value);
                        abstractC31739h3.mo70743a((C30270n) value);
                        this.f64472d.showProgress(false);
                        AbstractC31739h abstractC31739h4 = this.f64472d;
                        C29124h config2 = abstractC31739h4.getConfig();
                        this.f64471c = null;
                        this.f64469a = null;
                        this.f64470b = 3;
                    }
                }
                Exception exc2 = (Exception) Result.m103847exceptionOrNullimpl(value);
                C33272c c33272c2 = C33272c.f67812a;
                String strM71624a2 = AbstractC33294e.m71624a(interfaceC41709m1);
                message = exc2.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67814c.mo68956e(strM71624a2, message, exc2);
                throw new Exception(exc2);
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(this.f64472d, th2);
        }
    }
}
