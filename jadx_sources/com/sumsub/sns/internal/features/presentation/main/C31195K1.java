package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29083a0;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.domain.C30078L;
import com.sumsub.sns.internal.features.domain.C30079M;
import com.sumsub.sns.internal.features.domain.C30081O;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import kotlinx.coroutines.C41696j;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.K1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31195K1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30079M f63070a;

    /* JADX INFO: renamed from: b */
    public C31243a2 f63071b;

    /* JADX INFO: renamed from: c */
    public String f63072c;

    /* JADX INFO: renamed from: d */
    public int f63073d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31243a2 f63074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31195K1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63074e = c31243a2;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70595a(C31243a2 c31243a2, SNSTrackEvents sNSTrackEvents) {
        SNSEvent.SNSEventAnalytics sNSEventAnalytics = new SNSEvent.SNSEventAnalytics(sNSTrackEvents);
        KProperty[] kPropertyArr = C31243a2.f63220x;
        c31243a2.getClass();
        C31243a2.m70616a(sNSEventAnalytics);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31195K1(this.f63074e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31195K1(this.f63074e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[PHI: r2
      0x00d7: PHI (r2v19 com.sumsub.sns.internal.features.domain.M) = (r2v15 com.sumsub.sns.internal.features.domain.M), (r2v21 com.sumsub.sns.internal.features.domain.M) binds: [B:27:0x00b5, B:32:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x012c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        if (r5 == r1) goto L41;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70105a;
        AbstractC29083a0 abstractC29083a0;
        C30079M c30079m;
        Object objM70676a;
        C31243a2 c31243a2;
        Object objM70075b;
        C30079M c30079m2;
        C31243a2 c31243a3;
        String str;
        Object objM70074a;
        String str2;
        C31243a2 c31243a4;
        C29124h c29124h;
        C29586o0 c29586o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63073d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "onLoad", null);
            C30078L c30078l = this.f63074e.f63221d;
            this.f63073d = 1;
            if (c30078l.m70103a(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 == 2) {
                ResultKt.throwOnFailure(obj);
                objM70105a = obj;
                abstractC29083a0 = (AbstractC29083a0) objM70105a;
                abstractC29083a0.getClass();
                if (abstractC29083a0 instanceof C29074Y) {
                    C31243a2.m70617a(this.f63074e, (Throwable) ((C29074Y) abstractC29083a0).f59016a);
                    this.f63074e.onPrepareError();
                    return Unit.INSTANCE;
                }
                c30079m = (C30079M) ((C29078Z) abstractC29083a0).f59019a;
                KProperty[] kPropertyArr = C31243a2.f63220x;
                if (C33048a.f67467b0.m71434a()) {
                    C31318n c31318n = this.f63074e.f63230m;
                    this.f63070a = c30079m;
                    this.f63073d = 3;
                    objM70676a = c31318n.m70676a(this);
                } else {
                    c31243a2 = this.f63074e;
                    C30034c c30034c = c31243a2.f63225h;
                    this.f63070a = c30079m;
                    this.f63071b = c31243a2;
                    this.f63073d = 4;
                    objM70075b = c30034c.m70075b(this);
                    if (objM70075b != coroutine_suspended) {
                        c30079m2 = c30079m;
                        c31243a3 = c31243a2;
                        str = (String) objM70075b;
                        C30034c c30034c2 = this.f63074e.f63225h;
                        this.f63070a = c30079m2;
                        this.f63071b = c31243a3;
                        this.f63072c = str;
                        this.f63073d = 5;
                        objM70074a = c30034c2.m70074a(this);
                        if (objM70074a != coroutine_suspended) {
                            str2 = str;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 3) {
                c30079m = this.f63070a;
                ResultKt.throwOnFailure(obj);
                objM70676a = ((Result) obj).getValue();
                C31243a2 c31243a5 = this.f63074e;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70676a);
                if (thM103847exceptionOrNullimpl != null) {
                    C31243a2.m70617a(c31243a5, thM103847exceptionOrNullimpl);
                    c31243a5.onPrepareError();
                    return Unit.INSTANCE;
                }
                c31243a2 = this.f63074e;
                C30034c c30034c3 = c31243a2.f63225h;
                this.f63070a = c30079m;
                this.f63071b = c31243a2;
                this.f63073d = 4;
                objM70075b = c30034c3.m70075b(this);
                if (objM70075b != coroutine_suspended) {
                    c30079m2 = c30079m;
                    c31243a3 = c31243a2;
                    str = (String) objM70075b;
                    C30034c c30034c4 = this.f63074e.f63225h;
                    this.f63070a = c30079m2;
                    this.f63071b = c31243a3;
                    this.f63072c = str;
                    this.f63073d = 5;
                    objM70074a = c30034c4.m70074a(this);
                    if (objM70074a != coroutine_suspended) {
                        str2 = str;
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 4) {
                c31243a3 = this.f63071b;
                C30079M c30079m3 = this.f63070a;
                ResultKt.throwOnFailure(obj);
                c30079m2 = c30079m3;
                objM70075b = obj;
                str = (String) objM70075b;
                C30034c c30034c5 = this.f63074e.f63225h;
                this.f63070a = c30079m2;
                this.f63071b = c31243a3;
                this.f63072c = str;
                this.f63073d = 5;
                objM70074a = c30034c5.m70074a(this);
                if (objM70074a != coroutine_suspended) {
                    str2 = str;
                }
                return coroutine_suspended;
            }
            if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f63072c;
            c31243a3 = this.f63071b;
            C30079M c30079m4 = this.f63070a;
            ResultKt.throwOnFailure(obj);
            c30079m2 = c30079m4;
            objM70074a = obj;
        }
        SNSEvent.SNSEventApplicantLoaded sNSEventApplicantLoaded = new SNSEvent.SNSEventApplicantLoaded(str2, (String) objM70074a);
        KProperty[] kPropertyArr2 = C31243a2.f63220x;
        c31243a3.getClass();
        C31243a2.m70616a(sNSEventApplicantLoaded);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this.f63074e), null, null, new C31192J1(this.f63074e, c30079m2, null), 3, null);
        c31243a4 = this.f63074e;
        c29124h = c30079m2.f60443a;
        c29586o0 = c29124h.f59085r;
        if (c29586o0 != null) {
            c31243a4.m70623a(c29124h, c29586o0);
        } else {
            c31243a4.m70625a((Function2) new C31337q1(c31243a4, c29124h, null));
        }
        return Unit.INSTANCE;
        C29903a c29903a = C28366e.f57832a;
        final C31243a2 c31243a6 = this.f63074e;
        C28366e.f57838g = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.l2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C31195K1.m70595a(c31243a6, (SNSTrackEvents) obj2);
            }
        };
        C30081O c30081o = this.f63074e.f63223f;
        this.f63073d = 2;
        objM70105a = c30081o.m70105a(this);
        if (objM70105a != coroutine_suspended) {
            abstractC29083a0 = (AbstractC29083a0) objM70105a;
            abstractC29083a0.getClass();
            if (abstractC29083a0 instanceof C29074Y) {
                C31243a2.m70617a(this.f63074e, (Throwable) ((C29074Y) abstractC29083a0).f59016a);
                this.f63074e.onPrepareError();
                return Unit.INSTANCE;
            }
            c30079m = (C30079M) ((C29078Z) abstractC29083a0).f59019a;
            KProperty[] kPropertyArr3 = C31243a2.f63220x;
            if (C33048a.f67467b0.m71434a()) {
                C31318n c31318n2 = this.f63074e.f63230m;
                this.f63070a = c30079m;
                this.f63073d = 3;
                objM70676a = c31318n2.m70676a(this);
            } else {
                c31243a2 = this.f63074e;
                C30034c c30034c6 = c31243a2.f63225h;
                this.f63070a = c30079m;
                this.f63071b = c31243a2;
                this.f63073d = 4;
                objM70075b = c30034c6.m70075b(this);
                if (objM70075b != coroutine_suspended) {
                    c30079m2 = c30079m;
                    c31243a3 = c31243a2;
                    str = (String) objM70075b;
                    C30034c c30034c7 = this.f63074e.f63225h;
                    this.f63070a = c30079m2;
                    this.f63071b = c31243a3;
                    this.f63072c = str;
                    this.f63073d = 5;
                    objM70074a = c30034c7.m70074a(this);
                    if (objM70074a != coroutine_suspended) {
                        str2 = str;
                        SNSEvent.SNSEventApplicantLoaded sNSEventApplicantLoaded2 = new SNSEvent.SNSEventApplicantLoaded(str2, (String) objM70074a);
                        KProperty[] kPropertyArr4 = C31243a2.f63220x;
                        c31243a3.getClass();
                        C31243a2.m70616a(sNSEventApplicantLoaded2);
                        C41696j.m91104d(ViewModelKt.getViewModelScope(this.f63074e), null, null, new C31192J1(this.f63074e, c30079m2, null), 3, null);
                        c31243a4 = this.f63074e;
                        c29124h = c30079m2.f60443a;
                        c29586o0 = c29124h.f59085r;
                        if (c29586o0 != null) {
                            c31243a4.m70623a(c29124h, c29586o0);
                        } else {
                            c31243a4.m70625a((Function2) new C31337q1(c31243a4, c29124h, null));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        return coroutine_suspended;
    }
}
