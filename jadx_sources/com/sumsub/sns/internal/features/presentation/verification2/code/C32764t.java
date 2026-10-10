package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30101b;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32764t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32767w f67042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32767w f67043d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f67044e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f67045f;

    /* JADX INFO: renamed from: g */
    public Throwable f67046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32764t(C32767w c32767w, Continuation continuation, C32767w c32767w2, String str, String str2) {
        super(2, continuation);
        this.f67042c = c32767w;
        this.f67043d = c32767w2;
        this.f67044e = str;
        this.f67045f = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32764t c32764t = new C32764t(this.f67042c, continuation, this.f67043d, this.f67044e, this.f67045f);
        c32764t.f67041b = obj;
        return c32764t;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32764t) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0016, B:15:0x002a, B:36:0x009d, B:18:0x0031, B:30:0x0075, B:32:0x007b, B:19:0x0036, B:25:0x005f, B:27:0x0065, B:22:0x0047), top: B:43:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r1.m71338a(r11, r10) == r0) goto L38;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70112a;
        Throwable thM103847exceptionOrNullimpl;
        Object strings;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67040a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            thM103847exceptionOrNullimpl = this.f67046g;
                            obj2 = this.f67041b;
                            ResultKt.throwOnFailure(obj);
                            String strM69377a = AbstractC28476n.m69377a(thM103847exceptionOrNullimpl, (C29983l) obj);
                            C32767w c32767w = this.f67043d;
                            this.f67041b = obj2;
                            this.f67046g = null;
                            this.f67040a = 4;
                            int i12 = C32767w.f67058V;
                        }
                    } else {
                        Object obj3 = this.f67041b;
                        ResultKt.throwOnFailure(obj);
                        objM70112a = obj3;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70112a);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67814c.mo68956e("OtpInputViewModel", "Check code error", thM103847exceptionOrNullimpl);
                            C32767w c32767w2 = this.f67043d;
                            int i13 = C32767w.f67058V;
                            c32767w2.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                            C32767w c32767w3 = this.f67043d;
                            this.f67041b = objM70112a;
                            this.f67046g = thM103847exceptionOrNullimpl;
                            this.f67040a = 3;
                            strings = c32767w3.getStrings(this);
                            if (strings == coroutine_suspended) {
                                obj2 = objM70112a;
                                obj = strings;
                                String strM69377a2 = AbstractC28476n.m69377a(thM103847exceptionOrNullimpl, (C29983l) obj);
                                C32767w c32767w4 = this.f67043d;
                                this.f67041b = obj2;
                                this.f67046g = null;
                                this.f67040a = 4;
                                int i14 = C32767w.f67058V;
                            }
                            return coroutine_suspended;
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    objM70112a = ((Result) obj).getValue();
                }
                this.f67042c.showProgress(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f67043d.f67064f.setValue(null);
            C30101b c30101b = this.f67043d.f67063e;
            String str = this.f67044e;
            String str2 = this.f67045f;
            this.f67040a = 1;
            objM70112a = c30101b.m70112a(str, str2, this);
            if (objM70112a == coroutine_suspended) {
            }
            return coroutine_suspended;
            if (Result.m103851isSuccessimpl(objM70112a)) {
                C32767w c32767w5 = this.f67043d;
                this.f67041b = objM70112a;
                this.f67040a = 2;
                if (C32767w.m71337a(c32767w5, (C29570k0) objM70112a, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70112a);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c.f67814c.mo68956e("OtpInputViewModel", "Check code error", thM103847exceptionOrNullimpl);
                C32767w c32767w6 = this.f67043d;
                int i15 = C32767w.f67058V;
                c32767w6.checkThrowableIsCritical(thM103847exceptionOrNullimpl);
                C32767w c32767w7 = this.f67043d;
                this.f67041b = objM70112a;
                this.f67046g = thM103847exceptionOrNullimpl;
                this.f67040a = 3;
                strings = c32767w7.getStrings(this);
                if (strings == coroutine_suspended) {
                    obj2 = objM70112a;
                    obj = strings;
                    String strM69377a3 = AbstractC28476n.m69377a(thM103847exceptionOrNullimpl, (C29983l) obj);
                    C32767w c32767w8 = this.f67043d;
                    this.f67041b = obj2;
                    this.f67046g = null;
                    this.f67040a = 4;
                    int i16 = C32767w.f67058V;
                }
                return coroutine_suspended;
            }
            this.f67042c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f67042c.showProgress(false);
            throw th2;
        }
    }
}
