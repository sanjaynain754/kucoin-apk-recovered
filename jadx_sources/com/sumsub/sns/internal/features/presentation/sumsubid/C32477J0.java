package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.StepAction;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29848F;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30059h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32477J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66226a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66228c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66229d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32487O0 f66230e;

    /* JADX INFO: renamed from: f */
    public Object f66231f;

    /* JADX INFO: renamed from: g */
    public C32487O0 f66232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32477J0(C32487O0 c32487o0, Continuation continuation, String str, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66228c = c32487o0;
        this.f66229d = str;
        this.f66230e = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32477J0 c32477j0 = new C32477J0(this.f66228c, continuation, this.f66229d, this.f66230e);
        c32477j0.f66227b = obj;
        return c32477j0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32477J0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0125 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0139 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:10:0x001d, B:92:0x01c3, B:94:0x01c7, B:97:0x01d3, B:17:0x0035, B:86:0x01a9, B:88:0x01b1, B:20:0x0040, B:80:0x0180, B:82:0x0188, B:42:0x00aa, B:44:0x00b0, B:46:0x00c8, B:52:0x00e6, B:59:0x00fa, B:53:0x00e9, B:54:0x00ee, B:55:0x00ef, B:56:0x00f2, B:57:0x00f5, B:58:0x00f8, B:61:0x0125, B:63:0x0129, B:65:0x012d, B:70:0x014f, B:73:0x0155, B:66:0x0139, B:69:0x0145, B:74:0x0166, B:76:0x016c, B:41:0x00a0, B:26:0x004b, B:32:0x007b, B:35:0x0085, B:29:0x0056, B:22:0x0045, B:39:0x0099, B:36:0x0087), top: B:102:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d2  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        Object objM71154a;
        Object obj2;
        C29848F c29848f;
        KProperty[] kPropertyArr;
        C32487O0 c32487o0;
        Integer num;
        C32487O0 c32487o1;
        String str;
        int i11;
        Screen screen;
        C32487O0 c32487o2;
        Object strings;
        C32487O0 c32487o3;
        Throwable th2;
        String strM69377a;
        C32487O0 c32487o4;
        C29124h c29124h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f66226a;
        String strM69770a = null;
        try {
            try {
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    if (i12 == 5) {
                                        c32487o4 = (C32487O0) this.f66231f;
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    c32487o3 = this.f66232g;
                                    th2 = (Throwable) this.f66231f;
                                    obj2 = this.f66227b;
                                    ResultKt.throwOnFailure(obj);
                                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                    if (strM69377a == null) {
                                        C32487O0 c32487o5 = this.f66230e;
                                        this.f66227b = obj2;
                                        this.f66231f = c32487o3;
                                        this.f66232g = null;
                                        this.f66226a = 5;
                                        obj = c32487o5.getConfig(this);
                                        if (obj != coroutine_suspended) {
                                            c32487o4 = c32487o3;
                                        }
                                        return coroutine_suspended;
                                    }
                                    strM69770a = strM69377a;
                                    KProperty[] kPropertyArr2 = C32487O0.f66261v;
                                    C32557s c32557s = new C32557s(strM69770a, c32487o3.m71160e().f66411a);
                                    C28936t c28936t = c32487o3.f66270i;
                                    KProperty kProperty = C32487O0.f66261v[1];
                                    c28936t.f58834a.set(c28936t.f58835b, c32557s);
                                    this.f66230e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    this.f66228c.showProgress(false);
                                    return Unit.INSTANCE;
                                }
                            } else {
                                thM103847exceptionOrNullimpl = (Throwable) this.f66231f;
                                obj2 = this.f66227b;
                                ResultKt.throwOnFailure(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "request code failed", thM103847exceptionOrNullimpl);
                                    c32487o2 = this.f66230e;
                                    this.f66227b = obj2;
                                    this.f66231f = thM103847exceptionOrNullimpl;
                                    this.f66232g = c32487o2;
                                    this.f66226a = 4;
                                    strings = c32487o2.getStrings(this);
                                    if (strings != coroutine_suspended) {
                                        Throwable th3 = thM103847exceptionOrNullimpl;
                                        c32487o3 = c32487o2;
                                        obj = strings;
                                        th2 = th3;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o6 = this.f66230e;
                                            this.f66227b = obj2;
                                            this.f66231f = c32487o3;
                                            this.f66232g = null;
                                            this.f66226a = 5;
                                            obj = c32487o6.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o4 = c32487o3;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr3 = C32487O0.f66261v;
                                        C32557s c32557s2 = new C32557s(strM69770a, c32487o3.m71160e().f66411a);
                                        C28936t c28936t2 = c32487o3.f66270i;
                                        KProperty kProperty2 = C32487O0.f66261v[1];
                                        c28936t2.f58834a.set(c28936t2.f58835b, c32557s2);
                                        this.f66230e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                    return coroutine_suspended;
                                }
                                this.f66228c.showProgress(false);
                                return Unit.INSTANCE;
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            objM103844constructorimpl = Result.m103844constructorimpl((C29848F) obj);
                            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                                c29848f = (C29848F) objM103844constructorimpl;
                                C28936t c28936t3 = this.f66230e.f66278q;
                                kPropertyArr = C32487O0.f66261v;
                                KProperty kProperty3 = kPropertyArr[5];
                                c28936t3.f58834a.set(c28936t3.f58835b, c29848f);
                                c32487o0 = this.f66230e;
                                if (!c32487o0.f66280s) {
                                    c32487o0.f66280s = true;
                                    C28936t c28936t4 = c32487o0.f66267f;
                                    KProperty kProperty4 = kPropertyArr[0];
                                    i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t4.m69705a()).ordinal()];
                                    if (i11 != 1) {
                                        if (i11 == 2 && i11 != 3) {
                                            if (i11 != 4) {
                                                if (i11 == 5) {
                                                    screen = Screen.SumsubIdProfileScreen;
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                screen = Screen.SumsubIdAgreementScreen;
                                            }
                                        } else {
                                            screen = Screen.SumsubIdReuseScreen;
                                        }
                                    } else {
                                        screen = Screen.SumsubIdEmailScreen;
                                    }
                                    String text = screen.getText();
                                    C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                    c28368gM69266a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text)}));
                                    c28368gM69266a.m69267a(false);
                                }
                                if (c29848f != null) {
                                    num = c29848f.f59936b;
                                } else {
                                    num = null;
                                }
                                c32487o1 = this.f66230e;
                                if (num == null) {
                                    AbstractC32493S.m71164a("requestOtp, code length is 0");
                                    c32487o1.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                } else {
                                    str = c32487o1.m71160e().f66411a;
                                    if (str == null) {
                                        str = "";
                                    }
                                    c32487o1.fireEvent(new C32523g(num.intValue(), null, str, null));
                                }
                                if (this.f66229d != null && num != null) {
                                    this.f66230e.f66266e.m71293a(this.f66229d, System.currentTimeMillis() + 60000);
                                }
                            }
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                C32487O0 c32487o7 = this.f66230e;
                                this.f66227b = objM103844constructorimpl;
                                this.f66231f = thM103847exceptionOrNullimpl;
                                this.f66226a = 3;
                                KProperty[] kPropertyArr4 = C32487O0.f66261v;
                                objM71154a = c32487o7.m71154a(thM103847exceptionOrNullimpl, this);
                                if (objM71154a == coroutine_suspended) {
                                    obj2 = objM103844constructorimpl;
                                    obj = objM71154a;
                                    if (((Boolean) obj).booleanValue()) {
                                        C33272c.f67816e.f67810a.mo68956e("SnsId", "request code failed", thM103847exceptionOrNullimpl);
                                        c32487o2 = this.f66230e;
                                        this.f66227b = obj2;
                                        this.f66231f = thM103847exceptionOrNullimpl;
                                        this.f66232g = c32487o2;
                                        this.f66226a = 4;
                                        strings = c32487o2.getStrings(this);
                                        if (strings != coroutine_suspended) {
                                            Throwable th4 = thM103847exceptionOrNullimpl;
                                            c32487o3 = c32487o2;
                                            obj = strings;
                                            th2 = th4;
                                            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                            if (strM69377a == null) {
                                                C32487O0 c32487o8 = this.f66230e;
                                                this.f66227b = obj2;
                                                this.f66231f = c32487o3;
                                                this.f66232g = null;
                                                this.f66226a = 5;
                                                obj = c32487o8.getConfig(this);
                                                if (obj != coroutine_suspended) {
                                                    c32487o4 = c32487o3;
                                                }
                                            } else {
                                                strM69770a = strM69377a;
                                            }
                                            KProperty[] kPropertyArr5 = C32487O0.f66261v;
                                            C32557s c32557s3 = new C32557s(strM69770a, c32487o3.m71160e().f66411a);
                                            C28936t c28936t5 = c32487o3.f66270i;
                                            KProperty kProperty5 = C32487O0.f66261v[1];
                                            c28936t5.f58834a.set(c28936t5.f58835b, c32557s3);
                                            this.f66230e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                            this.f66228c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    c29124h = (C29124h) obj;
                    if (c29124h != null) {
                        strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                    }
                    c32487o3 = c32487o4;
                    KProperty[] kPropertyArr6 = C32487O0.f66261v;
                    C32557s c32557s4 = new C32557s(strM69770a, c32487o3.m71160e().f66411a);
                    C28936t c28936t6 = c32487o3.f66270i;
                    KProperty kProperty6 = C32487O0.f66261v[1];
                    c28936t6.f58834a.set(c28936t6.f58835b, c32557s4);
                    this.f66230e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                    this.f66228c.showProgress(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                AbstractC32493S.m71164a("request code, email=" + this.f66229d);
                C32487O0 c32487o9 = this.f66230e;
                String str2 = this.f66229d;
                this.f66226a = 1;
                obj = C32487O0.m71151a(c32487o9, str2, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
                if (((Boolean) obj).booleanValue()) {
                    C32487O0 c32487o10 = this.f66230e;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC30056e interfaceC30056e = c32487o10.f66263b;
                    String str3 = this.f66229d;
                    this.f66226a = 2;
                    obj = ((C30059h) interfaceC30056e).m70083a(str3, this);
                    if (obj != coroutine_suspended) {
                        objM103844constructorimpl = Result.m103844constructorimpl((C29848F) obj);
                        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                            c29848f = (C29848F) objM103844constructorimpl;
                            C28936t c28936t7 = this.f66230e.f66278q;
                            kPropertyArr = C32487O0.f66261v;
                            KProperty kProperty7 = kPropertyArr[5];
                            c28936t7.f58834a.set(c28936t7.f58835b, c29848f);
                            c32487o0 = this.f66230e;
                            if (!c32487o0.f66280s) {
                                c32487o0.f66280s = true;
                                C28936t c28936t8 = c32487o0.f66267f;
                                KProperty kProperty8 = kPropertyArr[0];
                                i11 = AbstractC32530i0.f66358a[((SNSSumsubIdStep) c28936t8.m69705a()).ordinal()];
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        screen = Screen.SumsubIdReuseScreen;
                                    } else {
                                        screen = Screen.SumsubIdReuseScreen;
                                    }
                                } else {
                                    screen = Screen.SumsubIdEmailScreen;
                                }
                                String text2 = screen.getText();
                                C28368g c28368gM69266a2 = new C28368g().m69266a(StepAction.Started, "SumsubId");
                                c28368gM69266a2.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("screenName", text2)}));
                                c28368gM69266a2.m69267a(false);
                            }
                            if (c29848f != null) {
                                num = c29848f.f59936b;
                            } else {
                                num = null;
                            }
                            c32487o1 = this.f66230e;
                            if (num == null) {
                                AbstractC32493S.m71164a("requestOtp, code length is 0");
                                c32487o1.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                            } else {
                                str = c32487o1.m71160e().f66411a;
                                if (str == null) {
                                    str = "";
                                }
                                c32487o1.fireEvent(new C32523g(num.intValue(), null, str, null));
                            }
                            if (this.f66229d != null) {
                                this.f66230e.f66266e.m71293a(this.f66229d, System.currentTimeMillis() + 60000);
                            }
                        }
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            C32487O0 c32487o11 = this.f66230e;
                            this.f66227b = objM103844constructorimpl;
                            this.f66231f = thM103847exceptionOrNullimpl;
                            this.f66226a = 3;
                            KProperty[] kPropertyArr7 = C32487O0.f66261v;
                            objM71154a = c32487o11.m71154a(thM103847exceptionOrNullimpl, this);
                            if (objM71154a == coroutine_suspended) {
                                obj2 = objM103844constructorimpl;
                                obj = objM71154a;
                                if (((Boolean) obj).booleanValue()) {
                                    C33272c.f67816e.f67810a.mo68956e("SnsId", "request code failed", thM103847exceptionOrNullimpl);
                                    c32487o2 = this.f66230e;
                                    this.f66227b = obj2;
                                    this.f66231f = thM103847exceptionOrNullimpl;
                                    this.f66232g = c32487o2;
                                    this.f66226a = 4;
                                    strings = c32487o2.getStrings(this);
                                    if (strings != coroutine_suspended) {
                                        Throwable th5 = thM103847exceptionOrNullimpl;
                                        c32487o3 = c32487o2;
                                        obj = strings;
                                        th2 = th5;
                                        strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                                        if (strM69377a == null) {
                                            C32487O0 c32487o12 = this.f66230e;
                                            this.f66227b = obj2;
                                            this.f66231f = c32487o3;
                                            this.f66232g = null;
                                            this.f66226a = 5;
                                            obj = c32487o12.getConfig(this);
                                            if (obj != coroutine_suspended) {
                                                c32487o4 = c32487o3;
                                                c29124h = (C29124h) obj;
                                                if (c29124h != null) {
                                                    strM69770a = AbstractC29130i.m69770a("sumsubid.confirmationFailure.title", c29124h.f59089v);
                                                }
                                                c32487o3 = c32487o4;
                                            }
                                        } else {
                                            strM69770a = strM69377a;
                                        }
                                        KProperty[] kPropertyArr8 = C32487O0.f66261v;
                                        C32557s c32557s5 = new C32557s(strM69770a, c32487o3.m71160e().f66411a);
                                        C28936t c28936t9 = c32487o3.f66270i;
                                        KProperty kProperty9 = C32487O0.f66261v[1];
                                        c28936t9.f58834a.set(c28936t9.f58835b, c32557s5);
                                        this.f66230e.m71156a(SNSSumsubIdStep.ENTER_EMAIL);
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            } catch (Throwable th6) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th6));
            }
            this.f66228c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th7) {
            this.f66228c.showProgress(false);
            throw th7;
        }
    }
}
