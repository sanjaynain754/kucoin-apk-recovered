package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.kubi.otc.entity.OtcAd;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29851I;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30055d;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.features.presentation.result.C32363c;
import com.sumsub.sns.internal.features.presentation.result.C32371k;
import com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType;
import com.sumsub.sns.internal.log.C33272c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32481L0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66240a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66242c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66243d;

    /* JADX INFO: renamed from: e */
    public Serializable f66244e;

    /* JADX INFO: renamed from: f */
    public Screen f66245f;

    /* JADX INFO: renamed from: g */
    public SNSFinishResultType f66246g;

    /* JADX INFO: renamed from: h */
    public C28494t f66247h;

    /* JADX INFO: renamed from: i */
    public C32487O0 f66248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32481L0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66242c = c32487o0;
        this.f66243d = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32481L0 c32481l0 = new C32481L0(this.f66242c, continuation, this.f66243d);
        c32481l0.f66241b = obj;
        return c32481l0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32481L0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x016d A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001c, B:98:0x01ec, B:100:0x01f4, B:16:0x003c, B:88:0x01a1, B:90:0x01a5, B:92:0x01b0, B:93:0x01c2, B:95:0x01c8, B:82:0x0167, B:84:0x016d, B:81:0x015c, B:26:0x0061, B:28:0x0085, B:30:0x008b, B:32:0x0095, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:39:0x00aa, B:41:0x00b1, B:43:0x00be, B:45:0x00c5, B:47:0x00d2, B:48:0x00d6, B:53:0x00ec, B:51:0x00e0, B:54:0x00f1, B:55:0x00fd, B:18:0x0047, B:79:0x0154, B:23:0x0055, B:76:0x0144, B:56:0x00ff, B:60:0x0118, B:65:0x0123, B:69:0x012b, B:72:0x013d), top: B:105:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:87:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001c, B:98:0x01ec, B:100:0x01f4, B:16:0x003c, B:88:0x01a1, B:90:0x01a5, B:92:0x01b0, B:93:0x01c2, B:95:0x01c8, B:82:0x0167, B:84:0x016d, B:81:0x015c, B:26:0x0061, B:28:0x0085, B:30:0x008b, B:32:0x0095, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:39:0x00aa, B:41:0x00b1, B:43:0x00be, B:45:0x00c5, B:47:0x00d2, B:48:0x00d6, B:53:0x00ec, B:51:0x00e0, B:54:0x00f1, B:55:0x00fd, B:18:0x0047, B:79:0x0154, B:23:0x0055, B:76:0x0144, B:56:0x00ff, B:60:0x0118, B:65:0x0123, B:69:0x012b, B:72:0x013d), top: B:105:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2 A[Catch: all -> 0x0023, PHI: r10
      0x01c2: PHI (r10v2 java.lang.Object) = (r10v0 java.lang.Object), (r10v4 java.lang.Object) binds: [B:83:0x016b, B:92:0x01b0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001c, B:98:0x01ec, B:100:0x01f4, B:16:0x003c, B:88:0x01a1, B:90:0x01a5, B:92:0x01b0, B:93:0x01c2, B:95:0x01c8, B:82:0x0167, B:84:0x016d, B:81:0x015c, B:26:0x0061, B:28:0x0085, B:30:0x008b, B:32:0x0095, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:39:0x00aa, B:41:0x00b1, B:43:0x00be, B:45:0x00c5, B:47:0x00d2, B:48:0x00d6, B:53:0x00ec, B:51:0x00e0, B:54:0x00f1, B:55:0x00fd, B:18:0x0047, B:79:0x0154, B:23:0x0055, B:76:0x0144, B:56:0x00ff, B:60:0x0118, B:65:0x0123, B:69:0x012b, B:72:0x013d), top: B:105:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001c, B:98:0x01ec, B:100:0x01f4, B:16:0x003c, B:88:0x01a1, B:90:0x01a5, B:92:0x01b0, B:93:0x01c2, B:95:0x01c8, B:82:0x0167, B:84:0x016d, B:81:0x015c, B:26:0x0061, B:28:0x0085, B:30:0x008b, B:32:0x0095, B:34:0x009c, B:36:0x00a2, B:37:0x00a6, B:39:0x00aa, B:41:0x00b1, B:43:0x00be, B:45:0x00c5, B:47:0x00d2, B:48:0x00d6, B:53:0x00ec, B:51:0x00e0, B:54:0x00f1, B:55:0x00fd, B:18:0x0047, B:79:0x0154, B:23:0x0055, B:76:0x0144, B:56:0x00ff, B:60:0x0118, B:65:0x0123, B:69:0x012b, B:72:0x013d), top: B:105:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        if (r4 == r2) goto L97;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object obj2;
        Screen screen;
        C32487O0 c32487o0;
        C28494t c28494t;
        SNSFinishResultType sNSFinishResultType;
        String str;
        Object config;
        C32487O0 c32487o1;
        Object obj3;
        C28494t c28494t2;
        SNSFinishResultType sNSFinishResultType2;
        Throwable thM103847exceptionOrNullimpl;
        Object objM71154a;
        C29124h c29124h;
        String strM69770a;
        int iIntValue;
        C32487O0 c32487o2;
        String str2;
        Integer numValueOf;
        Object objM70042a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66240a;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC32493S.m71164a("submit data");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C28936t c28936t = this.f66243d.f66272k;
                    KProperty kProperty = C32487O0.f66261v[2];
                    Iterator it = ((List) c28936t.m69705a()).iterator();
                    loop0: while (true) {
                        iIntValue = -1;
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            AbstractC32550p abstractC32550p = (AbstractC32550p) it.next();
                            if (abstractC32550p instanceof C32529i) {
                                if (((C32529i) abstractC32550p).f66357e && (str2 = ((C32529i) abstractC32550p).f66353a) != null) {
                                    arrayList2.add(str2);
                                }
                            } else if ((abstractC32550p instanceof C32541m) && ((C32541m) abstractC32550p).f66385g && !Intrinsics.areEqual(((C32541m) abstractC32550p).f66379a, OtcAd.KYC_NOT_PASS) && ((C32541m) abstractC32550p).f66379a != null) {
                                if (Intrinsics.areEqual(((C32541m) abstractC32550p).f66380b, "address")) {
                                    try {
                                        numValueOf = Integer.valueOf(Integer.parseInt(((C32541m) abstractC32550p).f66379a));
                                    } catch (NumberFormatException e11) {
                                        C33272c.f67814c.mo68959w("String.toIntSafe", "invalid number", e11);
                                        numValueOf = null;
                                    }
                                    if (numValueOf != null) {
                                        iIntValue = numValueOf.intValue();
                                    }
                                } else {
                                    Boxing.boxBoolean(arrayList.add(((C32541m) abstractC32550p).f66379a));
                                }
                            }
                            this.f66242c.showProgress(false);
                            throw th;
                        }
                    }
                    C32487O0 c32487o3 = this.f66243d;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC30056e interfaceC30056e = c32487o3.f66263b;
                    Integer numBoxInt = Boxing.boxInt(iIntValue);
                    this.f66241b = c32487o3;
                    this.f66240a = 1;
                    C30055d c30055d = ((C30059h) interfaceC30056e).f60399a;
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (!(!arrayList2.isEmpty())) {
                        arrayList2 = null;
                    }
                    if (numBoxInt == null || numBoxInt.intValue() < 0) {
                        numBoxInt = null;
                    }
                    Object objM70085a = c30055d.f60391a.m70085a(new C29851I(arrayList, arrayList2, numBoxInt), this);
                    if (objM70085a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM70085a = (C29227I) objM70085a;
                    }
                    if (objM70085a != coroutine_suspended) {
                        c32487o2 = c32487o3;
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    c32487o2 = (C32487O0) this.f66241b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        objM70042a = obj;
                        objM103844constructorimpl = Result.m103844constructorimpl((AbstractC29971N) objM70042a);
                        obj2 = objM103844constructorimpl;
                        if (Result.m103851isSuccessimpl(obj2)) {
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c.f67816e.f67810a.mo68956e("SnsId", "error submitting docs", thM103847exceptionOrNullimpl);
                                C32487O0 c32487o4 = this.f66243d;
                                this.f66241b = obj2;
                                this.f66244e = thM103847exceptionOrNullimpl;
                                this.f66245f = null;
                                this.f66246g = null;
                                this.f66247h = null;
                                this.f66248i = null;
                                this.f66240a = 4;
                                KProperty[] kPropertyArr = C32487O0.f66261v;
                                objM71154a = c32487o4.m71154a(thM103847exceptionOrNullimpl, this);
                            }
                            this.f66242c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                        C32487O0 c32487o5 = this.f66243d;
                        screen = Screen.SumsubIdDataProcessedScreen;
                        KProperty[] kPropertyArr2 = C32487O0.f66261v;
                        c32487o5.m71155a(screen);
                        c32487o0 = this.f66243d;
                        c28494t = new C28494t();
                        sNSFinishResultType = SNSFinishResultType.SUCCESS;
                        str = "sumsubid";
                        this.f66241b = obj2;
                        this.f66244e = "sumsubid";
                        this.f66245f = screen;
                        this.f66246g = sNSFinishResultType;
                        this.f66247h = c28494t;
                        this.f66248i = c32487o0;
                        this.f66240a = 3;
                        config = c32487o0.getConfig(this);
                        if (config == coroutine_suspended) {
                            c32487o1 = c32487o0;
                            obj3 = obj2;
                            c28494t2 = c28494t;
                            sNSFinishResultType2 = sNSFinishResultType;
                            c29124h = (C29124h) config;
                            if (c29124h != null) {
                                strM69770a = AbstractC29130i.m69770a("sumsubid.reuseDataProcessed.title", c29124h.f59089v);
                            } else {
                                strM69770a = null;
                            }
                            AbstractC28052C.finish$default(c32487o1, c28494t2, null, null, new C32363c(sNSFinishResultType2, screen, str, new C32371k(strM69770a)), 6, null);
                            obj2 = obj3;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                            if (thM103847exceptionOrNullimpl != null) {
                                C33272c.f67816e.f67810a.mo68956e("SnsId", "error submitting docs", thM103847exceptionOrNullimpl);
                                C32487O0 c32487o6 = this.f66243d;
                                this.f66241b = obj2;
                                this.f66244e = thM103847exceptionOrNullimpl;
                                this.f66245f = null;
                                this.f66246g = null;
                                this.f66247h = null;
                                this.f66248i = null;
                                this.f66240a = 4;
                                KProperty[] kPropertyArr3 = C32487O0.f66261v;
                                objM71154a = c32487o6.m71154a(thM103847exceptionOrNullimpl, this);
                            }
                            this.f66242c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (i11 == 3) {
                        C32487O0 c32487o7 = this.f66248i;
                        C28494t c28494t3 = this.f66247h;
                        sNSFinishResultType2 = this.f66246g;
                        screen = this.f66245f;
                        String str3 = (String) this.f66244e;
                        Object obj4 = this.f66241b;
                        ResultKt.throwOnFailure(obj);
                        str = str3;
                        c32487o1 = c32487o7;
                        obj3 = obj4;
                        c28494t2 = c28494t3;
                        config = obj;
                        c29124h = (C29124h) config;
                        if (c29124h != null) {
                            strM69770a = AbstractC29130i.m69770a("sumsubid.reuseDataProcessed.title", c29124h.f59089v);
                        } else {
                            strM69770a = null;
                        }
                        AbstractC28052C.finish$default(c32487o1, c28494t2, null, null, new C32363c(sNSFinishResultType2, screen, str, new C32371k(strM69770a)), 6, null);
                        obj2 = obj3;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "error submitting docs", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o8 = this.f66243d;
                            this.f66241b = obj2;
                            this.f66244e = thM103847exceptionOrNullimpl;
                            this.f66245f = null;
                            this.f66246g = null;
                            this.f66247h = null;
                            this.f66248i = null;
                            this.f66240a = 4;
                            KProperty[] kPropertyArr4 = C32487O0.f66261v;
                            objM71154a = c32487o8.m71154a(thM103847exceptionOrNullimpl, this);
                        }
                        this.f66242c.showProgress(false);
                        return Unit.INSTANCE;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    thM103847exceptionOrNullimpl = (Throwable) this.f66244e;
                    ResultKt.throwOnFailure(obj);
                    objM71154a = obj;
                }
                if (((Boolean) objM71154a).booleanValue()) {
                    this.f66243d.throwError(thM103847exceptionOrNullimpl, "SumsubId", C32515d0.f66341a);
                }
                this.f66242c.showProgress(false);
                return Unit.INSTANCE;
                InterfaceC29984m interfaceC29984m = c32487o2.f66262a;
                this.f66241b = null;
                this.f66240a = 2;
                objM70042a = ((C29967J) interfaceC29984m).m70042a(true, (Continuation) this);
                if (objM70042a != coroutine_suspended) {
                    objM103844constructorimpl = Result.m103844constructorimpl((AbstractC29971N) objM70042a);
                    obj2 = objM103844constructorimpl;
                    if (Result.m103851isSuccessimpl(obj2)) {
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "error submitting docs", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o9 = this.f66243d;
                            this.f66241b = obj2;
                            this.f66244e = thM103847exceptionOrNullimpl;
                            this.f66245f = null;
                            this.f66246g = null;
                            this.f66247h = null;
                            this.f66248i = null;
                            this.f66240a = 4;
                            KProperty[] kPropertyArr5 = C32487O0.f66261v;
                            objM71154a = c32487o9.m71154a(thM103847exceptionOrNullimpl, this);
                        }
                        this.f66242c.showProgress(false);
                        return Unit.INSTANCE;
                    }
                    C32487O0 c32487o10 = this.f66243d;
                    screen = Screen.SumsubIdDataProcessedScreen;
                    KProperty[] kPropertyArr6 = C32487O0.f66261v;
                    c32487o10.m71155a(screen);
                    c32487o0 = this.f66243d;
                    c28494t = new C28494t();
                    sNSFinishResultType = SNSFinishResultType.SUCCESS;
                    str = "sumsubid";
                    this.f66241b = obj2;
                    this.f66244e = "sumsubid";
                    this.f66245f = screen;
                    this.f66246g = sNSFinishResultType;
                    this.f66247h = c28494t;
                    this.f66248i = c32487o0;
                    this.f66240a = 3;
                    config = c32487o0.getConfig(this);
                    if (config == coroutine_suspended) {
                        c32487o1 = c32487o0;
                        obj3 = obj2;
                        c28494t2 = c28494t;
                        sNSFinishResultType2 = sNSFinishResultType;
                        c29124h = (C29124h) config;
                        if (c29124h != null) {
                            strM69770a = AbstractC29130i.m69770a("sumsubid.reuseDataProcessed.title", c29124h.f59089v);
                        } else {
                            strM69770a = null;
                        }
                        AbstractC28052C.finish$default(c32487o1, c28494t2, null, null, new C32363c(sNSFinishResultType2, screen, str, new C32371k(strM69770a)), 6, null);
                        obj2 = obj3;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c.f67816e.f67810a.mo68956e("SnsId", "error submitting docs", thM103847exceptionOrNullimpl);
                            C32487O0 c32487o11 = this.f66243d;
                            this.f66241b = obj2;
                            this.f66244e = thM103847exceptionOrNullimpl;
                            this.f66245f = null;
                            this.f66246g = null;
                            this.f66247h = null;
                            this.f66248i = null;
                            this.f66240a = 4;
                            KProperty[] kPropertyArr7 = C32487O0.f66261v;
                            objM71154a = c32487o11.m71154a(thM103847exceptionOrNullimpl, this);
                        }
                        this.f66242c.showProgress(false);
                        return Unit.INSTANCE;
                    }
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            this.f66242c.showProgress(false);
            throw th3;
        }
    }
}
