package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Domain;
import com.sumsub.sns.internal.core.analytics.SdkEvent;
import com.sumsub.sns.internal.core.analytics.StepAction;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29007H;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C28994D3;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.features.domain.C30078L;
import com.sumsub.sns.internal.features.domain.C30081O;
import com.sumsub.sns.internal.features.domain.appdata.C30096c;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32665p;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.c2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31251c2 extends AbstractC31275i2 {

    /* JADX INFO: renamed from: A */
    public final C31252d f63268A;

    /* JADX INFO: renamed from: B */
    public Function0 f63269B;

    /* JADX INFO: renamed from: d */
    public final C30078L f63270d;

    /* JADX INFO: renamed from: e */
    public final C30182f f63271e;

    /* JADX INFO: renamed from: f */
    public final C30081O f63272f;

    /* JADX INFO: renamed from: g */
    public final C30099f f63273g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29953a f63274h;

    /* JADX INFO: renamed from: i */
    public final C30034c f63275i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC29984m f63276j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC30035a f63277k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC29921d f63278l;

    /* JADX INFO: renamed from: m */
    public final C31288j2 f63279m;

    /* JADX INFO: renamed from: n */
    public final C31283h f63280n;

    /* JADX INFO: renamed from: o */
    public final long f63281o;

    /* JADX INFO: renamed from: p */
    public boolean f63282p;

    /* JADX INFO: renamed from: q */
    public InterfaceC41775x1 f63283q;

    /* JADX INFO: renamed from: r */
    public final C28936t f63284r;

    /* JADX INFO: renamed from: s */
    public final C28936t f63285s;

    /* JADX INFO: renamed from: t */
    public InterfaceC41775x1 f63286t;

    /* JADX INFO: renamed from: u */
    public final C28936t f63287u;

    /* JADX INFO: renamed from: v */
    public Document f63288v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC41669n f63289w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC41669n f63290x;

    /* JADX INFO: renamed from: y */
    public final C31292k2 f63291y;

    /* JADX INFO: renamed from: z */
    public final C31292k2 f63292z;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ KProperty[] f63267D = {AbstractC28639a.m69485a(C31251c2.class, "currentLevelName", "getCurrentLevelName()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31251c2.class, "isSDKPrepared", "isSDKPrepared()Z", 0), AbstractC28639a.m69485a(C31251c2.class, "verificationStarted", "getVerificationStarted()Z", 0)};

    /* JADX INFO: renamed from: C */
    public static final C31363x0 f63266C = new C31363x0();

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r10.m70642a(r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r10.m70656b(false, r0) == r1) goto L42;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m70637a(C31251c2 c31251c2, C29082a c29082a, List list, ContinuationImpl continuationImpl) {
        C31194K0 c31194k0;
        C29082a c29082a2;
        Document document;
        if (continuationImpl instanceof C31194K0) {
            c31194k0 = (C31194K0) continuationImpl;
            int i11 = c31194k0.f63069e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31194k0.f63069e = i11 - Integer.MIN_VALUE;
            } else {
                c31194k0 = new C31194K0(c31251c2, continuationImpl);
            }
        } else {
            c31194k0 = new C31194K0(c31251c2, continuationImpl);
        }
        Object obj = c31194k0.f63067c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31194k0.f63069e;
        if (i12 != 0) {
            if (i12 == 1) {
                document = c31194k0.f63066b;
                c29082a2 = c31194k0.f63065a;
                ResultKt.throwOnFailure(obj);
                c31251c2.m70649a(c29082a2, document);
                c31194k0.f63065a = null;
                c31194k0.f63066b = null;
                c31194k0.f63069e = 2;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ResultKt.throwOnFailure(obj);
                        c31194k0.f63069e = 4;
                    } else {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Document documentM70661a = AbstractC31259e2.m70661a(list, c29082a, c31251c2.f63291y);
        if (documentM70661a == null) {
            c31194k0.f63069e = 3;
            if (c31251c2.m70647a(false, (ContinuationImpl) c31194k0) != coroutine_suspended) {
                c31194k0.f63069e = 4;
            }
        } else {
            Document document2 = c31251c2.f63288v;
            if (Intrinsics.areEqual(document2 != null ? document2.getType() : null, documentM70661a.getType())) {
                c31194k0.f63069e = 3;
                if (c31251c2.m70647a(false, (ContinuationImpl) c31194k0) != coroutine_suspended) {
                    c31194k0.f63069e = 4;
                }
            } else {
                c31194k0.f63065a = c29082a;
                c31194k0.f63066b = documentM70661a;
                c31194k0.f63069e = 1;
                if (c31251c2.m70647a(false, (ContinuationImpl) c31194k0) != coroutine_suspended) {
                    c29082a2 = c29082a;
                    document = documentM70661a;
                    c31251c2.m70649a(c29082a2, document);
                    c31194k0.f63065a = null;
                    c31194k0.f63066b = null;
                    c31194k0.f63069e = 2;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (m70655b(r1, r2, r3) == r4) goto L30;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70656b(boolean z11, ContinuationImpl continuationImpl) {
        C31235Y0 c31235y0;
        boolean z12;
        if (continuationImpl instanceof C31235Y0) {
            c31235y0 = (C31235Y0) continuationImpl;
            int i11 = c31235y0.f63195d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31235y0.f63195d = i11 - Integer.MIN_VALUE;
            } else {
                c31235y0 = new C31235Y0(this, continuationImpl);
            }
        } else {
            c31235y0 = new C31235Y0(this, continuationImpl);
        }
        Object objM70045b = c31235y0.f63193b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31235y0.f63195d;
        if (i12 != 0) {
            if (i12 == 1) {
                z12 = c31235y0.f63192a;
                ResultKt.throwOnFailure(objM70045b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70045b);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM70045b);
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "onStepComplete, isCancelled=" + z11, null);
        InterfaceC29984m interfaceC29984m = this.f63276j;
        c31235y0.f63192a = z11;
        c31235y0.f63195d = 1;
        objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c31235y0);
        if (objM70045b != coroutine_suspended) {
            z12 = z11;
        }
        return coroutine_suspended;
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70045b;
        Throwable thMo70049a = abstractC29971N.mo70049a();
        if (thMo70049a != null) {
            if (!(thMo70049a instanceof CancellationException)) {
                AbstractC28052C.throwError$default(this, new C29107e0(thMo70049a, null, null, 6), "TYPE_UNKNOWN", false, null, 12, null);
                this.f63289w.setValue(Boolean.FALSE);
                C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel", "An error while preparing the sdk...", thMo70049a);
            }
            return Unit.INSTANCE;
        }
        C29124h c29124h = (C29124h) abstractC29971N.m70051c();
        c31235y0.f63195d = 2;
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28492s0
    /* JADX INFO: renamed from: c */
    public final void mo69384c() {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Restrictions check passed. Continuing SDK init...", null);
        Function0 function0 = this.f63269B;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: e */
    public final void mo70632e(boolean z11) {
        this.f63289w.setValue(Boolean.valueOf(z11));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: f */
    public final C31252d mo70633f() {
        return this.f63268A;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2, com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C28366e.f57838g = null;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "cancelWaitForLevelChange", null);
        InterfaceC41775x1 interfaceC41775x1 = this.f63283q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f63283q = null;
        this.f63282p = false;
        C29967J c29967j = (C29967J) this.f63276j;
        c29967j.f60202j.m70057a();
        c29967j.f60203k.m70057a();
        c29967j.f60204l.m70057a();
        c29967j.f60200h.setValue(null);
        super.onCleared();
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: d */
    public final void mo70630d(boolean z11) {
        m70648a((Function2) new C31197L0(this, z11, null));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: e */
    public final void mo70631e() {
        this.f63280n.f63388b.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m70658f(boolean z11) {
        InterfaceC41669n interfaceC41669n = this.f63290x;
        interfaceC41669n.setValue(Integer.valueOf(((Number) interfaceC41669n.getValue()).intValue() + (z11 ? 1 : -1)));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void fireEvent(InterfaceC28145r interfaceC28145r) {
        C29697t2 c29697t2;
        if (!(interfaceC28145r instanceof AbstractC31234Y) || (c29697t2 = ((AbstractC31234Y) interfaceC28145r).f63190a) == null) {
            super.fireEvent(interfaceC28145r);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31250c1(this, c29697t2, (Parcelable) interfaceC28145r, null, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: g */
    public final C31292k2 mo70635g() {
        return this.f63292z;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31263f2();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onLoad() {
        ((C29957e) this.f63274h).m70036a(SNSSDKState.Ready.INSTANCE);
        m70648a((Function2) new C31214R0(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        C31220T0 c31220t0;
        if (continuation instanceof C31220T0) {
            c31220t0 = (C31220T0) continuation;
            int i11 = c31220t0.f63155c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31220t0.f63155c = i11 - Integer.MIN_VALUE;
            } else {
                c31220t0 = new C31220T0(this, (ContinuationImpl) continuation);
            }
        } else {
            c31220t0 = new C31220T0(this, (ContinuationImpl) continuation);
        }
        Object obj = c31220t0.f63153a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31220t0.f63155c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31220t0.f63155c = 1;
            if (AbstractC31275i2.m70663a(this, c31220t0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC28073M0.updateState$default(this, false, new C31223U0(this, null), 1, null);
        return Unit.INSTANCE;
    }

    public C31251c2(SavedStateHandle savedStateHandle, C30078L c30078l, C30182f c30182f, C30081O c30081o, C30099f c30099f, InterfaceC29953a interfaceC29953a, C30034c c30034c, InterfaceC29984m interfaceC29984m, InterfaceC30035a interfaceC30035a, InterfaceC29921d interfaceC29921d, C31288j2 c31288j2, C31283h c31283h) {
        long jLongValue;
        String str;
        Long longOrNull;
        super(savedStateHandle, interfaceC29953a, interfaceC29984m);
        this.f63270d = c30078l;
        this.f63271e = c30182f;
        this.f63272f = c30081o;
        this.f63273g = c30099f;
        this.f63274h = interfaceC29953a;
        this.f63275i = c30034c;
        this.f63276j = interfaceC29984m;
        this.f63277k = interfaceC30035a;
        this.f63278l = interfaceC29921d;
        this.f63279m = c31288j2;
        this.f63280n = c31283h;
        C33050a c33050a = C33048a.f67449L;
        if (c33050a.m71434a() && (str = c33050a.m71435b().f67504b) != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            jLongValue = longOrNull.longValue();
        } else {
            jLongValue = 5000;
        }
        this.f63281o = jLongValue;
        this.f63284r = new C28936t(savedStateHandle, "KEY_CURRENT_LEVEL", null, false);
        Boolean bool = Boolean.FALSE;
        this.f63285s = new C28936t(savedStateHandle, "KEY_SDK_PREPARED", bool, false);
        this.f63287u = new C28936t(savedStateHandle, "VERIFICATION_STARTED", bool, false);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(bool);
        this.f63289w = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(0);
        this.f63290x = interfaceC41669nM91009a2;
        C31292k2 c31292k2 = new C31292k2();
        this.f63291y = c31292k2;
        this.f63292z = c31292k2;
        this.f63268A = new C31252d(this);
        AbstractC28421U.m69303a(C41636g.m90939v(new C31287j1(C41636g.m90938u(C41636g.m90934q(getViewModelInternalState(), interfaceC41669nM91009a, interfaceC41669nM91009a2, new C31226V0(this, null)), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(C31251c2.m70636a((Pair) obj));
            }
        }))), ViewModelKt.getViewModelScope(this), new C31359w0(this, null));
        if (!m70665h()) {
            onLoad();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70657c(ContinuationImpl continuationImpl) {
        C31262f1 c31262f1;
        if (continuationImpl instanceof C31262f1) {
            c31262f1 = (C31262f1) continuationImpl;
            int i11 = c31262f1.f63320c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31262f1.f63320c = i11 - Integer.MIN_VALUE;
            } else {
                c31262f1 = new C31262f1(this, continuationImpl);
            }
        } else {
            c31262f1 = new C31262f1(this, continuationImpl);
        }
        Object objM70042a = c31262f1.f63318a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31262f1.f63320c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63276j;
            c31262f1.f63320c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31262f1);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null) {
            C29140j3 c29140j3Mo69761l = abstractC29172p.mo69761l();
            List list = c29140j3Mo69761l.f59118b;
            C28984B3 c28984b3 = c29140j3Mo69761l.f59120d;
            SNSSDKState sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p, list, c28984b3 != null ? c28984b3.f58905a : null);
            if (sNSSDKStateM69729a != null) {
                ((C29957e) this.f63274h).m70036a(sNSSDKStateM69729a);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r14.m70642a(r2, r3) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r14.m70645a(r1, r3) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (r14.m70656b(false, r3) == r4) goto L56;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m70638a(C31251c2 c31251c2, AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType, boolean z11, ContinuationImpl continuationImpl) {
        C31200M0 c31200m0;
        Document documentM70661a;
        ReviewStatusType reviewStatusType2;
        boolean z12;
        AbstractC29172p abstractC29172p2;
        AbstractC29172p abstractC29172p3;
        ArrayList arrayListM69335a;
        List list2 = list;
        if (continuationImpl instanceof C31200M0) {
            c31200m0 = (C31200M0) continuationImpl;
            int i11 = c31200m0.f63094g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31200m0.f63094g = i11 - Integer.MIN_VALUE;
            } else {
                c31200m0 = new C31200M0(c31251c2, continuationImpl);
            }
        } else {
            c31200m0 = new C31200M0(c31251c2, continuationImpl);
        }
        Object obj = c31200m0.f63092e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31200m0.f63094g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            documentM70661a = AbstractC31259e2.m70661a(list2, abstractC29172p, c31251c2.f63291y);
            if (documentM70661a != null) {
                Document document = c31251c2.f63288v;
                if (!Intrinsics.areEqual(document != null ? document.getType() : null, documentM70661a.getType())) {
                    c31200m0.f63088a = abstractC29172p;
                    c31200m0.f63089b = documentM70661a;
                    c31200m0.f63094g = 1;
                    if (c31251c2.m70647a(false, (ContinuationImpl) c31200m0) != coroutine_suspended) {
                        abstractC29172p3 = abstractC29172p;
                        c31251c2.m70651a(abstractC29172p3, documentM70661a);
                        c31200m0.f63088a = null;
                        c31200m0.f63089b = null;
                        c31200m0.f63094g = 2;
                    }
                } else {
                    c31200m0.f63088a = abstractC29172p;
                    c31200m0.f63089b = list2;
                    reviewStatusType2 = reviewStatusType;
                    c31200m0.f63090c = reviewStatusType2;
                    z12 = z11;
                    c31200m0.f63091d = z12;
                    c31200m0.f63094g = 3;
                    if (c31251c2.m70647a(false, (ContinuationImpl) c31200m0) != coroutine_suspended) {
                        abstractC29172p2 = abstractC29172p;
                        arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p2);
                        if (arrayListM69335a.isEmpty()) {
                            c31200m0.f63088a = null;
                            c31200m0.f63089b = null;
                            c31200m0.f63090c = null;
                            c31200m0.f63094g = 5;
                        } else {
                            c31200m0.f63088a = null;
                            c31200m0.f63089b = null;
                            c31200m0.f63090c = null;
                            c31200m0.f63094g = 5;
                        }
                    }
                }
            } else {
                c31200m0.f63088a = abstractC29172p;
                c31200m0.f63089b = list2;
                reviewStatusType2 = reviewStatusType;
                c31200m0.f63090c = reviewStatusType2;
                z12 = z11;
                c31200m0.f63091d = z12;
                c31200m0.f63094g = 3;
                if (c31251c2.m70647a(false, (ContinuationImpl) c31200m0) != coroutine_suspended) {
                    abstractC29172p2 = abstractC29172p;
                    arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p2);
                    if (arrayListM69335a.isEmpty()) {
                        c31200m0.f63088a = null;
                        c31200m0.f63089b = null;
                        c31200m0.f63090c = null;
                        c31200m0.f63094g = 5;
                    } else {
                        c31200m0.f63088a = null;
                        c31200m0.f63089b = null;
                        c31200m0.f63090c = null;
                        c31200m0.f63094g = 5;
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Document document2 = (Document) c31200m0.f63089b;
            AbstractC29172p abstractC29172p4 = c31200m0.f63088a;
            ResultKt.throwOnFailure(obj);
            documentM70661a = document2;
            abstractC29172p3 = abstractC29172p4;
            c31251c2.m70651a(abstractC29172p3, documentM70661a);
            c31200m0.f63088a = null;
            c31200m0.f63089b = null;
            c31200m0.f63094g = 2;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                boolean z13 = c31200m0.f63091d;
                ReviewStatusType reviewStatusType3 = c31200m0.f63090c;
                List list3 = (List) c31200m0.f63089b;
                AbstractC29172p abstractC29172p5 = c31200m0.f63088a;
                ResultKt.throwOnFailure(obj);
                reviewStatusType2 = reviewStatusType3;
                list2 = list3;
                z12 = z13;
                abstractC29172p2 = abstractC29172p5;
                arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p2);
                if (arrayListM69335a.isEmpty() && AbstractC28458h.m69347a(abstractC29172p2, reviewStatusType2)) {
                    if (z12) {
                        c31200m0.f63088a = null;
                        c31200m0.f63089b = null;
                        c31200m0.f63090c = null;
                        c31200m0.f63094g = 4;
                    } else {
                        c31251c2.f63291y.f63411a.clear();
                        c31251c2.fireEvent(C31335q.f63516c);
                    }
                    return Unit.INSTANCE;
                }
                c31200m0.f63088a = null;
                c31200m0.f63089b = null;
                c31200m0.f63090c = null;
                c31200m0.f63094g = 5;
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: c */
    public final void mo70629c(boolean z11) {
        AbstractC31245b0 abstractC31245b0M70669a = this.f63280n.m70669a(z11);
        if (abstractC31245b0M70669a == null) {
            return;
        }
        fireEvent(abstractC31245b0M70669a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0196, code lost:
    
        if (m70644a(r15, r2, r3, r4, r5) == r6) goto L69;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70655b(boolean z11, C29124h c29124h, ContinuationImpl continuationImpl) {
        C31242a1 c31242a1;
        Object objM70111a;
        C29124h c29124h2;
        List list;
        ReviewStatusType reviewStatusType;
        C32641a c32641a;
        C29124h c29124h3;
        AbstractC29172p abstractC29172p;
        boolean z12;
        C29124h c29124h4;
        AbstractC29172p abstractC29172p2;
        List list2;
        Iterator it;
        Document document;
        boolean z13;
        C31292k2 c31292k2;
        C28994D3 c28994d3;
        boolean z14 = z11;
        if (continuationImpl instanceof C31242a1) {
            c31242a1 = (C31242a1) continuationImpl;
            int i11 = c31242a1.f63219k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31242a1.f63219k = i11 - Integer.MIN_VALUE;
            } else {
                c31242a1 = new C31242a1(this, continuationImpl);
            }
        } else {
            c31242a1 = new C31242a1(this, continuationImpl);
        }
        C31242a1 c31242a2 = c31242a1;
        Object strings = c31242a2.f63217i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31242a2.f63219k;
        if (i12 == 0) {
            ResultKt.throwOnFailure(strings);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "resolveApplicantStatus: isCancelled=" + z14, null);
            C30099f c30099f = this.f63273g;
            InterfaceC29921d interfaceC29921d = this.f63278l;
            c31242a2.f63210b = c29124h;
            c31242a2.f63209a = z14;
            c31242a2.f63219k = 1;
            objM70111a = c30099f.m70111a(false, interfaceC29921d, c31242a2);
            if (objM70111a != coroutine_suspended) {
                c29124h2 = c29124h;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z14 = c31242a2.f63209a;
            c29124h2 = c31242a2.f63210b;
            ResultKt.throwOnFailure(strings);
            objM70111a = ((Result) strings).getValue();
        } else if (i12 == 2) {
            boolean z15 = c31242a2.f63209a;
            abstractC29172p2 = c31242a2.f63216h;
            c29124h3 = c31242a2.f63215g;
            c32641a = c31242a2.f63214f;
            reviewStatusType = c31242a2.f63213e;
            list = c31242a2.f63212d;
            abstractC29172p = c31242a2.f63211c;
            C29124h c29124h5 = c31242a2.f63210b;
            ResultKt.throwOnFailure(strings);
            z12 = z15;
            c29124h4 = c29124h5;
            list2 = ((C29983l) strings).f60249b;
            c32641a.getClass();
            if (C32641a.m71260a(c29124h3, abstractC29172p2, list2)) {
                fireEvent(C31297m.f63422c);
                return Unit.INSTANCE;
            }
            if (list == null && list.isEmpty()) {
                z13 = false;
            } else {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        document = (Document) it.next();
                        if (document.isSubmitted()) {
                            c31292k2 = this.f63291y;
                            if (document.isRejected()) {
                                if (!c31292k2.f63411a.contains(document.getType())) {
                                }
                            }
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            }
            if (!abstractC29172p.mo69760k().f59152b && m70653a(abstractC29172p, list, reviewStatusType, z12)) {
                return Unit.INSTANCE;
            }
            c28994d3 = abstractC29172p.mo69761l().f59119c;
            if (!(c28994d3 != null ? Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true)) : false) && !z13) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "waiting for possible level change ...", null);
                fireEvent(C31241a0.f63208a);
                this.f63282p = true;
                this.f63283q = m70648a(new C31246b1(this, abstractC29172p, c29124h4, z12, null));
                return Unit.INSTANCE;
            }
            C29124h c29124h6 = c29124h4;
            c31242a2.f63210b = null;
            c31242a2.f63211c = null;
            c31242a2.f63212d = null;
            c31242a2.f63213e = null;
            c31242a2.f63214f = null;
            c31242a2.f63215g = null;
            c31242a2.f63216h = null;
            c31242a2.f63219k = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(strings);
        }
        return Unit.INSTANCE;
        if (c29124h2 != null && !Result.m103850isFailureimpl(objM70111a)) {
            if (this.f63282p) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "resolveApplicantStatus: waiting for level change, do nothing", null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM70111a);
            C30096c c30096c = (C30096c) objM70111a;
            AbstractC29172p abstractC29172p3 = c30096c.f60496a;
            list = c30096c.f60497b;
            reviewStatusType = c30096c.f60498c;
            c32641a = C32649e.f66642b;
            c31242a2.f63210b = c29124h2;
            c31242a2.f63211c = abstractC29172p3;
            c31242a2.f63212d = list;
            c31242a2.f63213e = reviewStatusType;
            c31242a2.f63214f = c32641a;
            c31242a2.f63215g = c29124h2;
            c31242a2.f63216h = abstractC29172p3;
            c31242a2.f63209a = z14;
            c31242a2.f63219k = 2;
            strings = getStrings(c31242a2);
            if (strings != coroutine_suspended) {
                c29124h3 = c29124h2;
                abstractC29172p = abstractC29172p3;
                z12 = z14;
                c29124h4 = c29124h3;
                abstractC29172p2 = abstractC29172p;
                list2 = ((C29983l) strings).f60249b;
                c32641a.getClass();
                if (C32641a.m71260a(c29124h3, abstractC29172p2, list2)) {
                    fireEvent(C31297m.f63422c);
                    return Unit.INSTANCE;
                }
                if (list == null) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            document = (Document) it.next();
                            if (document.isSubmitted()) {
                                c31292k2 = this.f63291y;
                                if (document.isRejected()) {
                                    if (!c31292k2.f63411a.contains(document.getType())) {
                                    }
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            document = (Document) it.next();
                            if (document.isSubmitted()) {
                                c31292k2 = this.f63291y;
                                if (document.isRejected()) {
                                    if (!c31292k2.f63411a.contains(document.getType())) {
                                    }
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                }
                if (!abstractC29172p.mo69760k().f59152b) {
                }
                c28994d3 = abstractC29172p.mo69761l().f59119c;
                if (!(c28994d3 != null ? Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true)) : false)) {
                }
                C29124h c29124h7 = c29124h4;
                c31242a2.f63210b = null;
                c31242a2.f63211c = null;
                c31242a2.f63212d = null;
                c31242a2.f63213e = null;
                c31242a2.f63214f = null;
                c31242a2.f63215g = null;
                c31242a2.f63216h = null;
                c31242a2.f63219k = 3;
            }
            return coroutine_suspended;
        }
        boolean z16 = c29124h2 == null;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Config is null (" + z16 + ") or applicant update result (" + Result.m103850isFailureimpl(objM70111a) + "), going to status screen", null);
        this.f63291y.f63411a.clear();
        fireEvent(C31335q.f63516c);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
    }

    /* JADX INFO: renamed from: a */
    public final void m70650a(final C29124h c29124h, C29586o0 c29586o0) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Postponing SDK init for restrictions prompt: restriction=" + c29586o0.f59609a, null);
        this.f63269B = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31251c2.m70640a(this.f63561b, c29124h);
            }
        };
        fireEvent(new C31225V(c29586o0));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70622a(C29070X c29070x) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "A user has uploaded document: " + c29070x.f59014a, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70639a(C31251c2 c31251c2, ContinuationImpl continuationImpl) {
        C31371z0 c31371z0;
        AbstractC29172p abstractC29172p;
        C29124h c29124h;
        ReviewStatusType reviewStatusType;
        if (continuationImpl instanceof C31371z0) {
            c31371z0 = (C31371z0) continuationImpl;
            int i11 = c31371z0.f63569d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31371z0.f63569d = i11 - Integer.MIN_VALUE;
            } else {
                c31371z0 = new C31371z0(c31251c2, continuationImpl);
            }
        } else {
            c31371z0 = new C31371z0(c31251c2, continuationImpl);
        }
        Object objM70042a = c31371z0.f63567b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31371z0.f63569d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = c31251c2.f63276j;
            c31371z0.f63569d = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31371z0);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70042a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC29172p = c31371z0.f63566a;
            ResultKt.throwOnFailure(objM70042a);
        }
        c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
        if (c29124h != null && !AbstractC29130i.m69785k(c29124h)) {
            if (abstractC29172p != null) {
                reviewStatusType = abstractC29172p.mo69762m().f59165b;
            } else {
                reviewStatusType = null;
            }
            if (reviewStatusType == ReviewStatusType.Completed && abstractC29172p.m69798n()) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Check init applicant status: completed and approved, closing sdk", null);
                c31251c2.fireEvent(C31342s.f63531c);
            }
        }
        return Unit.INSTANCE;
        AbstractC29172p abstractC29172p2 = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        InterfaceC29984m interfaceC29984m2 = c31251c2.f63276j;
        c31371z0.f63566a = abstractC29172p2;
        c31371z0.f63569d = 2;
        Object objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c31371z0);
        if (objM70045b != coroutine_suspended) {
            abstractC29172p = abstractC29172p2;
            objM70042a = objM70045b;
            c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
            if (c29124h != null) {
                if (abstractC29172p != null) {
                    reviewStatusType = abstractC29172p.mo69762m().f59165b;
                } else {
                    reviewStatusType = null;
                }
                if (reviewStatusType == ReviewStatusType.Completed) {
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Check init applicant status: completed and approved, closing sdk", null);
                    c31251c2.fireEvent(C31342s.f63531c);
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final long m70636a(Pair pair) {
        return ((Number) pair.getSecond()).longValue();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70640a(C31251c2 c31251c2, C29124h c29124h) {
        c31251c2.getClass();
        c31251c2.m70648a((Function2) new C31164A0(c31251c2, c29124h, null));
        c31251c2.f63269B = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70652a(C29980i c29980i) {
        String strMo69754e;
        C29140j3 c29140j3Mo69761l;
        C29140j3 c29140j3Mo69761l2;
        C29118g c29118g;
        FlowActionType flowActionType;
        if (c29980i == null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31185H0(this, null), 3, null);
            return;
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) c29980i.f60239a.m70051c();
        if (abstractC29172p != null) {
            AbstractC29172p abstractC29172p2 = abstractC29172p instanceof C29082a ? abstractC29172p : null;
            if (abstractC29172p2 != null) {
                C29082a c29082a = (C29082a) abstractC29172p2;
                C29124h c29124h = (C29124h) c29980i.f60240b.m70051c();
                String str = c29082a.f59033n;
                String value = (c29124h == null || (c29118g = c29124h.f59091x) == null || (flowActionType = c29118g.f59063b) == null) ? null : flowActionType.getValue();
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Action state: " + str + ", " + value + ", " + c29082a.f59025f.f59165b, null);
            }
        }
        C28936t c28936t = this.f63284r;
        KProperty[] kPropertyArr = f63267D;
        KProperty kProperty = kPropertyArr[0];
        if (((String) c28936t.m69705a()) == null) {
            String str2 = (abstractC29172p == null || (c29140j3Mo69761l2 = abstractC29172p.mo69761l()) == null) ? null : c29140j3Mo69761l2.f59117a.f59182a;
            C28936t c28936t2 = this.f63284r;
            KProperty kProperty2 = kPropertyArr[0];
            c28936t2.f58834a.set(c28936t2.f58835b, str2);
        }
        String str3 = (abstractC29172p == null || (c29140j3Mo69761l = abstractC29172p.mo69761l()) == null) ? null : c29140j3Mo69761l.f59117a.f59182a;
        C28936t c28936t3 = this.f63284r;
        KProperty kProperty3 = kPropertyArr[0];
        boolean z11 = (Intrinsics.areEqual((String) c28936t3.m69705a(), str3) || str3 == null) ? false : true;
        C28936t c28936t4 = this.f63284r;
        KProperty kProperty4 = kPropertyArr[0];
        c28936t4.f58834a.set(c28936t4.f58835b, str3);
        if (z11) {
            this.f63291y.f63411a.clear();
            if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31179F0(this, strMo69754e, null), 3, null);
            }
        }
        C28936t c28936t5 = this.f63284r;
        KProperty kProperty5 = kPropertyArr[0];
        String str4 = (String) c28936t5.m69705a();
        boolean z12 = this.f63282p;
        AbstractC29172p abstractC29172p3 = (AbstractC29172p) c29980i.f60239a.m70051c();
        String str5 = "Data updated: levelChanged=" + z11 + ", level=" + str4 + ", isWaitingForLevelChange=" + z12 + ", applicant.status=" + (abstractC29172p3 != null ? abstractC29172p3.mo69762m().f59165b : null);
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSAppViewModel", str5, null);
        if (this.f63282p && z11) {
            c33270a.f67810a.mo68955d("SNSAppViewModel", "cancelWaitForLevelChange", null);
            InterfaceC41775x1 interfaceC41775x1 = this.f63283q;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            this.f63283q = null;
            this.f63282p = false;
            m70648a((Function2) new C31182G0(this, abstractC29172p, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70654b(ContinuationImpl continuationImpl) {
        C31188I0 c31188i0;
        C29140j3 c29140j3Mo69761l;
        C28994D3 c28994d3;
        if (continuationImpl instanceof C31188I0) {
            c31188i0 = (C31188I0) continuationImpl;
            int i11 = c31188i0.f63053c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31188i0.f63053c = i11 - Integer.MIN_VALUE;
            } else {
                c31188i0 = new C31188I0(this, continuationImpl);
            }
        } else {
            c31188i0 = new C31188I0(this, continuationImpl);
        }
        Object objM70042a = c31188i0.f63051a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31188i0.f63053c;
        boolean zAreEqual = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63276j;
            c31188i0.f63053c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31188i0);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null && (c29140j3Mo69761l = abstractC29172p.mo69761l()) != null && (c28994d3 = c29140j3Mo69761l.f59119c) != null) {
            zAreEqual = Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true));
        }
        return Boxing.boxBoolean(zAreEqual);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: b */
    public final void mo70628b(String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31266g1(this, null, this, str), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70651a(AbstractC29172p abstractC29172p, Document document) {
        String str = "startStep for document: " + document.getType().f59014a;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSAppViewModel", str, null);
        c33270a.f67811b.m71625a();
        c33270a.f67810a.mo68955d("SNSAppViewModel", "startStep for document: " + document.getType().f59014a, null);
        this.f63289w.setValue(Boolean.FALSE);
        AbstractC31234Y abstractC31234YM71289a = AbstractC32665p.m71289a(document, abstractC29172p, false);
        c33270a.f67810a.mo68955d("SNSAppViewModel", "navigation event: " + abstractC31234YM71289a + "}", null);
        fireEvent(abstractC31234YM71289a);
    }

    /* JADX INFO: renamed from: a */
    public final void m70649a(C29082a c29082a, Document document) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "startActionStep: " + document, null);
        AbstractC31234Y abstractC31234YM71289a = AbstractC32665p.m71289a(document, c29082a, true);
        if (!abstractC31234YM71289a.f63191b) {
            AbstractC28052C.throwError$default(this, new IllegalArgumentException("Step " + document.getType().f59014a + " is NOT supported in actions"), document.getType().f59014a, null, 4, null);
            return;
        }
        fireEvent(abstractC31234YM71289a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70620a(SNSCompletionResult sNSCompletionResult, boolean z11) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSAppViewModel", "Cancel verification with reason - " + sNSCompletionResult, null);
        showProgress(true);
        C28368g c28368g = new C28368g();
        SdkEvent sdkEvent = SdkEvent.Dismiss;
        c28368g.f57846b.add(Domain.Sdk);
        c28368g.f57846b.add(sdkEvent);
        c28368g.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("isDismissMethodCalled", Boolean.valueOf(z11))}));
        c28368g.m69267a(true);
        c33270a.f67810a.mo68955d("SNSAppViewModel", "cancelWaitForLevelChange", null);
        InterfaceC41775x1 interfaceC41775x1 = this.f63283q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f63283q = null;
        this.f63282p = false;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31209P0(this, sNSCompletionResult, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70624a(C29697t2 c29697t2, Parcelable parcelable, String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31250c1(this, c29697t2, parcelable, str, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70646a(boolean z11, C29124h c29124h, ContinuationImpl continuationImpl) {
        C31229W0 c31229w0;
        Object objM70655b;
        if (continuationImpl instanceof C31229W0) {
            c31229w0 = (C31229W0) continuationImpl;
            int i11 = c31229w0.f63180e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31229w0.f63180e = i11 - Integer.MIN_VALUE;
            } else {
                c31229w0 = new C31229W0(this, continuationImpl);
            }
        } else {
            c31229w0 = new C31229W0(this, continuationImpl);
        }
        Object obj = c31229w0.f63178c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31229w0.f63180e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "SDK is prepared. Applicant - " + c29124h.f59068a + ", type=" + c29124h.f59069b, null);
            AbstractC28073M0.updateState$default(this, false, new C31232X0(null), 1, null);
            C28936t c28936t = this.f63285s;
            KProperty kProperty = f63267D[1];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            m70641a(new SNSEvent.VerificationStarted(c29124h.f59068a));
            c31229w0.f63177b = c29124h;
            c31229w0.f63176a = z11;
            c31229w0.f63180e = 1;
            if (m70657c(c31229w0) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = c31229w0.f63176a;
            c29124h = c31229w0.f63177b;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (z11) {
            return Unit.INSTANCE;
        }
        c31229w0.f63177b = null;
        c31229w0.f63180e = 2;
        if (AbstractC29130i.m69785k(c29124h)) {
            objM70655b = m70643a(c29124h, c31229w0);
            if (objM70655b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70655b = Unit.INSTANCE;
            }
        } else {
            objM70655b = m70655b(false, c29124h, c31229w0);
            if (objM70655b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70655b = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (m70655b(false, r7, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70643a(C29124h c29124h, ContinuationImpl continuationImpl) {
        C31176E0 c31176e0;
        if (continuationImpl instanceof C31176E0) {
            c31176e0 = (C31176E0) continuationImpl;
            int i11 = c31176e0.f63038d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31176e0.f63038d = i11 - Integer.MIN_VALUE;
            } else {
                c31176e0 = new C31176E0(this, continuationImpl);
            }
        } else {
            c31176e0 = new C31176E0(this, continuationImpl);
        }
        Object objM70042a = c31176e0.f63036b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31176e0.f63038d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63276j;
            c31176e0.f63035a = c29124h;
            c31176e0.f63038d = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31176e0);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29124h = c31176e0.f63035a;
            ResultKt.throwOnFailure(objM70042a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return Unit.INSTANCE;
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70042a;
        AbstractC29172p abstractC29172p = (AbstractC29172p) abstractC29971N.m70051c();
        if (abstractC29172p == null || !(abstractC29172p instanceof C29082a)) {
            mo70620a(new SNSCompletionResult.AbnormalTermination(abstractC29971N.mo70049a()), false);
            return Unit.INSTANCE;
        }
        if (c29124h != null) {
            if (((C29154m) CollectionsKt.firstOrNull(abstractC29172p.mo69760k().f59151a)) != null) {
                c31176e0.f63035a = null;
                c31176e0.f63038d = 2;
            } else {
                throw new InvalidParameterException("No doc set item found");
            }
        } else {
            throw new InvalidParameterException("Config for action is null");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70645a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        C31291k1 c31291k1;
        if (continuationImpl instanceof C31291k1) {
            c31291k1 = (C31291k1) continuationImpl;
            int i11 = c31291k1.f63410d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31291k1.f63410d = i11 - Integer.MIN_VALUE;
            } else {
                c31291k1 = new C31291k1(this, continuationImpl);
            }
        } else {
            c31291k1 = new C31291k1(this, continuationImpl);
        }
        Object obj = c31291k1.f63408b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31291k1.f63410d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "startVideoIdentification: docs " + arrayList.size(), null);
            if (AbstractC28409N0.m69294a("com.sumsub.sns.videoident.BuildConfig")) {
                C29070X.Companion.getClass();
                Document document = new Document(C29062V.m69739a("VIDEO_IDENT"), null);
                c31291k1.f63407a = arrayList;
                c31291k1.f63410d = 1;
                if (m70642a(document, c31291k1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f63289w.setValue(Boolean.FALSE);
                AbstractC28052C.throwError$default(this, new Exception("VideoIdent not available"), "VIDEO_IDENT", null, 4, null);
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = c31291k1.f63407a;
        ResultKt.throwOnFailure(obj);
        fireEvent(new C31231X(arrayList));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70642a(Document document, ContinuationImpl continuationImpl) {
        C31170C0 c31170c0;
        String str;
        Document document2;
        C31251c2 c31251c2;
        if (continuationImpl instanceof C31170C0) {
            c31170c0 = (C31170C0) continuationImpl;
            int i11 = c31170c0.f63027f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31170c0.f63027f = i11 - Integer.MIN_VALUE;
            } else {
                c31170c0 = new C31170C0(this, continuationImpl);
            }
        } else {
            c31170c0 = new C31170C0(this, continuationImpl);
        }
        Object obj = c31170c0.f63025d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31170c0.f63027f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f63288v = document;
            C28936t c28936t = this.f63287u;
            KProperty kProperty = f63267D[2];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            String str2 = document.getType().f59014a;
            C30034c c30034c = this.f63275i;
            c31170c0.f63022a = document;
            c31170c0.f63023b = str2;
            c31170c0.f63024c = this;
            c31170c0.f63027f = 1;
            Object objM70075b = c30034c.m70075b(c31170c0);
            if (objM70075b == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = objM70075b;
            document2 = document;
            c31251c2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31251c2 = c31170c0.f63024c;
            str = c31170c0.f63023b;
            document2 = c31170c0.f63022a;
            ResultKt.throwOnFailure(obj);
        }
        SNSEvent.SNSEventStepInitiated sNSEventStepInitiated = new SNSEvent.SNSEventStepInitiated((String) obj, str);
        c31251c2.getClass();
        m70641a(sNSEventStepInitiated);
        C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Started, document2.getType().f59014a);
        c28368gM69266a.f57847c = MapsKt.emptyMap();
        c28368gM69266a.m69267a(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70647a(boolean z11, ContinuationImpl continuationImpl) {
        C31173D0 c31173d0;
        Document document;
        C31251c2 c31251c2;
        if (continuationImpl instanceof C31173D0) {
            c31173d0 = (C31173D0) continuationImpl;
            int i11 = c31173d0.f63033f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31173d0.f63033f = i11 - Integer.MIN_VALUE;
            } else {
                c31173d0 = new C31173D0(this, continuationImpl);
            }
        } else {
            c31173d0 = new C31173D0(this, continuationImpl);
        }
        Object obj = c31173d0.f63031d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31173d0.f63033f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Document document2 = this.f63288v;
            if (document2 != null) {
                this.f63288v = null;
                C28936t c28936t = this.f63287u;
                KProperty kProperty = f63267D[2];
                c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
                C30034c c30034c = this.f63275i;
                c31173d0.f63029b = document2;
                c31173d0.f63030c = this;
                c31173d0.f63028a = z11;
                c31173d0.f63033f = 1;
                Object objM70075b = c30034c.m70075b(c31173d0);
                if (objM70075b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                document = document2;
                obj = objM70075b;
                c31251c2 = this;
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z11 = c31173d0.f63028a;
        c31251c2 = c31173d0.f63030c;
        document = c31173d0.f63029b;
        ResultKt.throwOnFailure(obj);
        String str = document.getType().f59014a;
        C28936t c28936t2 = this.f63284r;
        KProperty kProperty2 = f63267D[0];
        SNSEvent.SNSEventStepCompleted sNSEventStepCompleted = new SNSEvent.SNSEventStepCompleted((String) obj, str, z11, (String) c28936t2.m69705a());
        c31251c2.getClass();
        m70641a(sNSEventStepCompleted);
        if (!z11) {
            C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Completed, document.getType().f59014a);
            c28368gM69266a.f57847c = MapsKt.emptyMap();
            c28368gM69266a.m69267a(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m70641a(SNSEvent sNSEvent) {
        try {
            SNSEventHandler eventHandler = SNSMobileSDK.INSTANCE.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(sNSEvent);
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel", "Can't fire sns event " + sNSEvent, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70653a(AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType, boolean z11) {
        List list2;
        if (!AbstractC28458h.m69335a(list, abstractC29172p).isEmpty() && AbstractC28458h.m69347a(abstractC29172p, reviewStatusType)) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "resolveApplicantStatusWithVideoIdent: applicantStatus=" + abstractC29172p.mo69762m().f59165b + ", viStatus=" + reviewStatusType, null);
            if (z11 && !abstractC29172p.m69797d()) {
                mo70620a((SNSCompletionResult) SNSCompletionResult.SuccessTermination.INSTANCE, false);
                return true;
            }
            if (!abstractC29172p.m69797d()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Document document = (Document) obj;
                    if (abstractC29172p.mo69760k().f59152b && ((list2 = abstractC29172p.mo69760k().f59154d) == null || !list2.contains(document.getType().f59014a))) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        if (((Document) obj2).isRejected()) {
                        }
                    }
                }
            }
            this.f63291y.f63411a.clear();
            fireEvent(C31335q.f63516c);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70644a(AbstractC29172p abstractC29172p, C29124h c29124h, boolean z11, boolean z12, ContinuationImpl continuationImpl) {
        C31238Z0 c31238z0;
        if (continuationImpl instanceof C31238Z0) {
            c31238z0 = (C31238Z0) continuationImpl;
            int i11 = c31238z0.f63206g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31238z0.f63206g = i11 - Integer.MIN_VALUE;
            } else {
                c31238z0 = new C31238Z0(this, continuationImpl);
            }
        } else {
            c31238z0 = new C31238Z0(this, continuationImpl);
        }
        Object objM70654b = c31238z0.f63204e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31238z0.f63206g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70654b);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "proceedWithApplicantStatus: status=" + abstractC29172p.mo69762m().f59165b + ", isCancelled=" + z12, null);
            c31238z0.f63200a = abstractC29172p;
            c31238z0.f63201b = c29124h;
            c31238z0.f63202c = z11;
            c31238z0.f63203d = z12;
            c31238z0.f63206g = 1;
            objM70654b = m70654b(c31238z0);
            if (objM70654b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = c31238z0.f63203d;
            z11 = c31238z0.f63202c;
            c29124h = c31238z0.f63201b;
            abstractC29172p = c31238z0.f63200a;
            ResultKt.throwOnFailure(objM70654b);
        }
        boolean zBooleanValue = ((Boolean) objM70654b).booleanValue();
        ReviewStatusType reviewStatusType = abstractC29172p.mo69762m().f59165b;
        ReviewStatusType reviewStatusType2 = ReviewStatusType.Init;
        if (reviewStatusType == reviewStatusType2 && AbstractC29130i.m69778d(c29124h) && z11 && !abstractC29172p.m69797d()) {
            if (z12) {
                mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
            } else {
                mo70630d(false);
            }
        } else if (abstractC29172p.mo69762m().f59165b == reviewStatusType2 && AbstractC29130i.m69777c(c29124h) && !z11) {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        } else if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Pending && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        } else if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Prechecked && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        } else if ((abstractC29172p.mo69762m().f59165b == ReviewStatusType.RequiresAction || abstractC29172p.mo69762m().f59165b == ReviewStatusType.AwaitingService) && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        } else if (abstractC29172p.m69799o() && AbstractC29130i.m69775b(c29124h)) {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        } else if (!abstractC29172p.m69800p() || !AbstractC29130i.m69779e(c29124h)) {
            this.f63291y.f63411a.clear();
            fireEvent(C31335q.f63516c);
        } else if (z11 && !z12) {
            m70648a(new C31197L0(this, true, null));
        } else {
            mo70620a(SNSCompletionResult.SuccessTermination.INSTANCE, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC41775x1 m70648a(Function2 function2) {
        m70658f(true);
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31191J0(function2, this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70626a(boolean z11, boolean z12) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31217S0(this, null, z11, this, z12), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70621a(AbstractC28503w abstractC28503w, long j11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31167B0(this, null, j11, abstractC28503w, this), 3, null);
    }
}
