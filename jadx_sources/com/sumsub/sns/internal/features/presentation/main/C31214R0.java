package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29083a0;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.domain.C30078L;
import com.sumsub.sns.internal.features.domain.C30079M;
import com.sumsub.sns.internal.features.domain.C30081O;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31214R0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30079M f63128a;

    /* JADX INFO: renamed from: b */
    public C31251c2 f63129b;

    /* JADX INFO: renamed from: c */
    public String f63130c;

    /* JADX INFO: renamed from: d */
    public int f63131d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31251c2 f63132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31214R0(C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63132e = c31251c2;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70597a(C31251c2 c31251c2, SNSTrackEvents sNSTrackEvents) {
        SNSEvent.SNSEventAnalytics sNSEventAnalytics = new SNSEvent.SNSEventAnalytics(sNSTrackEvents);
        C31363x0 c31363x0 = C31251c2.f63266C;
        c31251c2.getClass();
        C31251c2.m70641a(sNSEventAnalytics);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31214R0(this.f63132e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31214R0(this.f63132e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70105a;
        AbstractC29083a0 abstractC29083a0;
        C30079M c30079m;
        C31251c2 c31251c2;
        Object objM70075b;
        C30079M c30079m2;
        C31251c2 c31251c3;
        C31251c2 c31251c4;
        Throwable th2;
        String str;
        Object objM70074a;
        String str2;
        C31251c2 c31251c5;
        C29124h c29124h;
        C29586o0 c29586o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63131d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "onLoad", null);
            C30078L c30078l = this.f63132e.f63270d;
            this.f63131d = 1;
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
                    c31251c4 = this.f63132e;
                    th2 = (Throwable) ((C29074Y) abstractC29083a0).f59016a;
                    C31363x0 c31363x0 = C31251c2.f63266C;
                    if (!(th2 instanceof CancellationException)) {
                        AbstractC28052C.throwError$default(c31251c4, new C29107e0(th2, null, null, 6), "TYPE_UNKNOWN", false, null, 12, null);
                        c31251c4.f63289w.setValue(Boolean.FALSE);
                        C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel", "An error while preparing the sdk...", th2);
                    }
                    this.f63132e.onPrepareError();
                    return Unit.INSTANCE;
                }
                c30079m = (C30079M) ((C29078Z) abstractC29083a0).f59019a;
                c31251c2 = this.f63132e;
                C30034c c30034c = c31251c2.f63275i;
                this.f63128a = c30079m;
                this.f63129b = c31251c2;
                this.f63131d = 3;
                objM70075b = c30034c.m70075b(this);
                if (objM70075b != coroutine_suspended) {
                    c30079m2 = c30079m;
                    c31251c3 = c31251c2;
                    str = (String) objM70075b;
                    C30034c c30034c2 = this.f63132e.f63275i;
                    this.f63128a = c30079m2;
                    this.f63129b = c31251c3;
                    this.f63130c = str;
                    this.f63131d = 4;
                    objM70074a = c30034c2.m70074a(this);
                    if (objM70074a != coroutine_suspended) {
                        str2 = str;
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 3) {
                c31251c3 = this.f63129b;
                c30079m2 = this.f63128a;
                ResultKt.throwOnFailure(obj);
                objM70075b = obj;
                str = (String) objM70075b;
                C30034c c30034c3 = this.f63132e.f63275i;
                this.f63128a = c30079m2;
                this.f63129b = c31251c3;
                this.f63130c = str;
                this.f63131d = 4;
                objM70074a = c30034c3.m70074a(this);
                if (objM70074a != coroutine_suspended) {
                    str2 = str;
                }
                return coroutine_suspended;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f63130c;
            c31251c3 = this.f63129b;
            c30079m2 = this.f63128a;
            ResultKt.throwOnFailure(obj);
            objM70074a = obj;
        }
        SNSEvent.SNSEventApplicantLoaded sNSEventApplicantLoaded = new SNSEvent.SNSEventApplicantLoaded(str2, (String) objM70074a);
        C31363x0 c31363x1 = C31251c2.f63266C;
        c31251c3.getClass();
        C31251c2.m70641a(sNSEventApplicantLoaded);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this.f63132e), null, null, new C31212Q0(this.f63132e, c30079m2, null), 3, null);
        c31251c5 = this.f63132e;
        c29124h = c30079m2.f60443a;
        c29586o0 = c29124h.f59085r;
        if (c29586o0 != null) {
            c31251c5.m70650a(c29124h, c29586o0);
        } else {
            c31251c5.m70648a((Function2) new C31164A0(c31251c5, c29124h, null));
        }
        return Unit.INSTANCE;
        C29903a c29903a = C28366e.f57832a;
        final C31251c2 c31251c6 = this.f63132e;
        C28366e.f57838g = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.n2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C31214R0.m70597a(c31251c6, (SNSTrackEvents) obj2);
            }
        };
        C30081O c30081o = this.f63132e.f63272f;
        this.f63131d = 2;
        objM70105a = c30081o.m70105a(this);
        if (objM70105a != coroutine_suspended) {
            abstractC29083a0 = (AbstractC29083a0) objM70105a;
            abstractC29083a0.getClass();
            if (abstractC29083a0 instanceof C29074Y) {
                c31251c4 = this.f63132e;
                th2 = (Throwable) ((C29074Y) abstractC29083a0).f59016a;
                C31363x0 c31363x2 = C31251c2.f63266C;
                if (!(th2 instanceof CancellationException)) {
                    AbstractC28052C.throwError$default(c31251c4, new C29107e0(th2, null, null, 6), "TYPE_UNKNOWN", false, null, 12, null);
                    c31251c4.f63289w.setValue(Boolean.FALSE);
                    C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel", "An error while preparing the sdk...", th2);
                }
                this.f63132e.onPrepareError();
                return Unit.INSTANCE;
            }
            c30079m = (C30079M) ((C29078Z) abstractC29083a0).f59019a;
            c31251c2 = this.f63132e;
            C30034c c30034c4 = c31251c2.f63275i;
            this.f63128a = c30079m;
            this.f63129b = c31251c2;
            this.f63131d = 3;
            objM70075b = c30034c4.m70075b(this);
            if (objM70075b != coroutine_suspended) {
                c30079m2 = c30079m;
                c31251c3 = c31251c2;
                str = (String) objM70075b;
                C30034c c30034c5 = this.f63132e.f63275i;
                this.f63128a = c30079m2;
                this.f63129b = c31251c3;
                this.f63130c = str;
                this.f63131d = 4;
                objM70074a = c30034c5.m70074a(this);
                if (objM70074a != coroutine_suspended) {
                    str2 = str;
                    SNSEvent.SNSEventApplicantLoaded sNSEventApplicantLoaded2 = new SNSEvent.SNSEventApplicantLoaded(str2, (String) objM70074a);
                    C31363x0 c31363x3 = C31251c2.f63266C;
                    c31251c3.getClass();
                    C31251c2.m70641a(sNSEventApplicantLoaded2);
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this.f63132e), null, null, new C31212Q0(this.f63132e, c30079m2, null), 3, null);
                    c31251c5 = this.f63132e;
                    c29124h = c30079m2.f60443a;
                    c29586o0 = c29124h.f59085r;
                    if (c29586o0 != null) {
                        c31251c5.m70650a(c29124h, c29586o0);
                    } else {
                        c31251c5.m70648a((Function2) new C31164A0(c31251c5, c29124h, null));
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return coroutine_suspended;
    }
}
