package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29858d;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32471G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66209a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66212d;

    /* JADX INFO: renamed from: e */
    public Throwable f66213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32471G0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66211c = c32487o0;
        this.f66212d = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32471G0 c32471g0 = new C32471G0(this.f66211c, continuation, this.f66212d);
        c32471g0.f66210b = obj;
        return c32471g0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32471G0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00de A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:7:0x0011, B:45:0x00d6, B:47:0x00de, B:25:0x0059, B:27:0x005f, B:29:0x0064, B:33:0x008d, B:37:0x0093, B:38:0x00ac, B:39:0x00b2, B:41:0x00b8, B:24:0x004f, B:18:0x002e, B:13:0x0021, B:22:0x0048, B:19:0x0036), top: B:52:0x0009, inners: #0 }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66209a;
        try {
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            th2 = this.f66213e;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        this.f66212d.throwError(th2, "SumsubId", C32509b0.f66336a);
                    }
                    this.f66211c.showProgress(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                AbstractC32493S.m71164a("open profile");
                C32487O0 c32487o0 = this.f66212d;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC30056e interfaceC30056e = c32487o0.f66263b;
                this.f66209a = 1;
                obj = ((C30059h) interfaceC30056e).f60399a.m70081a(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
                objM103844constructorimpl = Result.m103844constructorimpl((C29858d) obj);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                C29858d c29858d = (C29858d) objM103844constructorimpl;
                if (c29858d != null) {
                    AbstractC32493S.m71164a("open profile, opening in external browser");
                    String str = c29858d.f59944b + "/oauth?token=" + c29858d.f59943a;
                    C32487O0 c32487o1 = this.f66212d;
                    String str2 = c29858d.f59944b;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = c29858d.f59945c;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    C32511c c32511c = new C32511c(str, str2, str3);
                    C28936t c28936t = c32487o1.f66276o;
                    KProperty kProperty = C32487O0.f66261v[4];
                    c28936t.f58834a.set(c28936t.f58835b, c32511c);
                    this.f66212d.m71156a(SNSSumsubIdStep.WEB_VIEW_ACCOUNT);
                } else {
                    AbstractC32493S.m71164a("open profile, data is empty");
                }
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c.f67816e.f67810a.mo68956e("SnsId", "open profile error", thM103847exceptionOrNullimpl);
                C32487O0 c32487o2 = this.f66212d;
                this.f66210b = objM103844constructorimpl;
                this.f66213e = thM103847exceptionOrNullimpl;
                this.f66209a = 2;
                KProperty[] kPropertyArr = C32487O0.f66261v;
                obj = c32487o2.m71154a(thM103847exceptionOrNullimpl, this);
                if (obj != coroutine_suspended) {
                    th2 = thM103847exceptionOrNullimpl;
                    if (((Boolean) obj).booleanValue()) {
                        this.f66212d.throwError(th2, "SumsubId", C32509b0.f66336a);
                    }
                }
                return coroutine_suspended;
            }
            this.f66211c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            this.f66211c.showProgress(false);
            throw th4;
        }
    }
}
