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
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29007H;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.features.domain.C30078L;
import com.sumsub.sns.internal.features.domain.C30081O;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
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
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.a2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31243a2 extends AbstractC31275i2 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ KProperty[] f63220x = {AbstractC28639a.m69485a(C31243a2.class, "currentLevelName", "getCurrentLevelName()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31243a2.class, "isSDKPrepared", "isSDKPrepared()Z", 0)};

    /* JADX INFO: renamed from: d */
    public final C30078L f63221d;

    /* JADX INFO: renamed from: e */
    public final C30182f f63222e;

    /* JADX INFO: renamed from: f */
    public final C30081O f63223f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC29953a f63224g;

    /* JADX INFO: renamed from: h */
    public final C30034c f63225h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC29984m f63226i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC30035a f63227j;

    /* JADX INFO: renamed from: k */
    public final C31288j2 f63228k;

    /* JADX INFO: renamed from: l */
    public final C31283h f63229l;

    /* JADX INFO: renamed from: m */
    public final C31318n f63230m;

    /* JADX INFO: renamed from: n */
    public final C28936t f63231n;

    /* JADX INFO: renamed from: o */
    public final C28936t f63232o;

    /* JADX INFO: renamed from: p */
    public InterfaceC41775x1 f63233p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41669n f63234q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41669n f63235r;

    /* JADX INFO: renamed from: s */
    public final C31292k2 f63236s;

    /* JADX INFO: renamed from: t */
    public final C31292k2 f63237t;

    /* JADX INFO: renamed from: u */
    public final C31252d f63238u;

    /* JADX INFO: renamed from: v */
    public Function0 f63239v;

    /* JADX INFO: renamed from: w */
    public final C31332p0 f63240w;

    public C31243a2(SavedStateHandle savedStateHandle, C30078L c30078l, C30182f c30182f, C30081O c30081o, C30099f c30099f, InterfaceC29953a interfaceC29953a, C30034c c30034c, InterfaceC29984m interfaceC29984m, InterfaceC30035a interfaceC30035a, InterfaceC29921d interfaceC29921d, C31288j2 c31288j2, C31283h c31283h, C31318n c31318n) {
        super(savedStateHandle, interfaceC29953a, interfaceC29984m);
        this.f63221d = c30078l;
        this.f63222e = c30182f;
        this.f63223f = c30081o;
        this.f63224g = interfaceC29953a;
        this.f63225h = c30034c;
        this.f63226i = interfaceC29984m;
        this.f63227j = interfaceC30035a;
        this.f63228k = c31288j2;
        this.f63229l = c31283h;
        this.f63230m = c31318n;
        this.f63231n = new C28936t(savedStateHandle, "KEY_CURRENT_LEVEL", null, false);
        Boolean bool = Boolean.FALSE;
        this.f63232o = new C28936t(savedStateHandle, "KEY_SDK_PREPARED", bool, false);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(bool);
        this.f63234q = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(0);
        this.f63235r = interfaceC41669nM91009a2;
        C31292k2 c31292k2 = new C31292k2();
        this.f63236s = c31292k2;
        this.f63237t = c31292k2;
        this.f63238u = new C31252d(this);
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        C31165A1 c31165a1 = new C31165A1(this);
        C31168B1 c31168b1 = new C31168B1(this);
        C31171C1 c31171c1 = new C31171C1(this);
        C31174D1 c31174d1 = new C31174D1(this);
        this.f63240w = new C31332p0(viewModelScope, c30099f, interfaceC29984m, interfaceC29921d, c30034c, c31292k2, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31243a2.m70613a(this.f63536b);
            }
        }, c31165a1, c31168b1, new C31177E1(this), c31174d1, c31171c1, new C31186H1(this, null), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31243a2.m70618b(this.f63540b);
            }
        }, new C31180F1(this), new C31183G1(this), savedStateHandle);
        AbstractC28421U.m69303a(C41636g.m90939v(new C31239Z1(C41636g.m90938u(C41636g.m90934q(getViewModelInternalState(), interfaceC41669nM91009a, interfaceC41669nM91009a2, new C31207O1(this, null)), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.u2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(C31243a2.m70612a((Pair) obj));
            }
        }))), ViewModelKt.getViewModelScope(this), new C31299m1(this, null));
        AbstractC28421U.m69303a(c31318n.f63479d, ViewModelKt.getViewModelScope(this), new C31303n1(this));
        if (m70665h()) {
            return;
        }
        onLoad();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70614a(C31243a2 c31243a2, ContinuationImpl continuationImpl) {
        C31333p1 c31333p1;
        AbstractC29172p abstractC29172p;
        C29124h c29124h;
        ReviewStatusType reviewStatusType;
        if (continuationImpl instanceof C31333p1) {
            c31333p1 = (C31333p1) continuationImpl;
            int i11 = c31333p1.f63514d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31333p1.f63514d = i11 - Integer.MIN_VALUE;
            } else {
                c31333p1 = new C31333p1(c31243a2, continuationImpl);
            }
        } else {
            c31333p1 = new C31333p1(c31243a2, continuationImpl);
        }
        Object objM70042a = c31333p1.f63512b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31333p1.f63514d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = c31243a2.f63226i;
            c31333p1.f63514d = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31333p1);
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
            abstractC29172p = c31333p1.f63511a;
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
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Check init applicant status: completed and approved, closing sdk", null);
                c31243a2.fireEvent(C31342s.f63531c);
            }
        }
        return Unit.INSTANCE;
        AbstractC29172p abstractC29172p2 = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        InterfaceC29984m interfaceC29984m2 = c31243a2.f63226i;
        c31333p1.f63511a = abstractC29172p2;
        c31333p1.f63514d = 2;
        Object objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c31333p1);
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
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Check init applicant status: completed and approved, closing sdk", null);
                    c31243a2.fireEvent(C31342s.f63531c);
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: b */
    public static final String m70618b(C31243a2 c31243a2) {
        C28936t c28936t = c31243a2.f63231n;
        KProperty kProperty = f63220x[0];
        return (String) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28492s0
    /* JADX INFO: renamed from: c */
    public final void mo69384c() {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Restrictions check passed. Continuing SDK init...", null);
        if (C33048a.f67467b0.m71434a()) {
            m70625a((Function2) new C31210P1(this, null));
            return;
        }
        Function0 function0 = this.f63239v;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: e */
    public final void mo70632e(boolean z11) {
        this.f63234q.setValue(Boolean.valueOf(z11));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: f */
    public final C31252d mo70633f() {
        return this.f63238u;
    }

    public final void handleDataUpdated(C29980i c29980i) {
        String strMo69754e;
        C29140j3 c29140j3Mo69761l;
        C29140j3 c29140j3Mo69761l2;
        C29118g c29118g;
        FlowActionType flowActionType;
        if (c29980i == null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31356v1(this, null), 3, null);
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
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Action state: " + str + ", " + value + ", " + c29082a.f59025f.f59165b, null);
            }
        }
        C28936t c28936t = this.f63231n;
        KProperty[] kPropertyArr = f63220x;
        KProperty kProperty = kPropertyArr[0];
        if (((String) c28936t.m69705a()) == null) {
            String str2 = (abstractC29172p == null || (c29140j3Mo69761l2 = abstractC29172p.mo69761l()) == null) ? null : c29140j3Mo69761l2.f59117a.f59182a;
            C28936t c28936t2 = this.f63231n;
            KProperty kProperty2 = kPropertyArr[0];
            c28936t2.f58834a.set(c28936t2.f58835b, str2);
        }
        String str3 = (abstractC29172p == null || (c29140j3Mo69761l = abstractC29172p.mo69761l()) == null) ? null : c29140j3Mo69761l.f59117a.f59182a;
        C28936t c28936t3 = this.f63231n;
        KProperty kProperty3 = kPropertyArr[0];
        boolean z11 = (Intrinsics.areEqual((String) c28936t3.m69705a(), str3) || str3 == null) ? false : true;
        C28936t c28936t4 = this.f63231n;
        KProperty kProperty4 = kPropertyArr[0];
        c28936t4.f58834a.set(c28936t4.f58835b, str3);
        if (z11) {
            this.f63236s.f63411a.clear();
            if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31344s1(this, strMo69754e, null), 3, null);
            }
            if (C33048a.f67467b0.m71434a()) {
                m70625a((Function2) new C31348t1(this, null));
            }
        }
        C28936t c28936t5 = this.f63231n;
        KProperty kProperty5 = kPropertyArr[0];
        String str4 = (String) c28936t5.m69705a();
        boolean z12 = this.f63240w.f63508r != null;
        AbstractC29172p abstractC29172p3 = (AbstractC29172p) c29980i.f60239a.m70051c();
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Data updated: levelChanged=" + z11 + ", level=" + str4 + ", isWaitingForLevelChange=" + z12 + ", applicant.status=" + (abstractC29172p3 != null ? abstractC29172p3.mo69762m().f59165b : null), null);
        if (C33048a.f67467b0.m71434a()) {
            return;
        }
        C31332p0 c31332p0 = this.f63240w;
        if (c31332p0.f63508r == null || !z11) {
            return;
        }
        c31332p0.m70692a();
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31352u1(this, abstractC29172p, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2, com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C28366e.f57838g = null;
        if (!C33048a.f67467b0.m71434a()) {
            this.f63240w.m70692a();
        }
        C29967J c29967j = (C29967J) this.f63226i;
        c29967j.f60202j.m70057a();
        c29967j.f60203k.m70057a();
        c29967j.f60204l.m70057a();
        c29967j.f60200h.setValue(null);
        super.onCleared();
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: d */
    public final void mo70630d(boolean z11) {
        m70625a((Function2) new C31364x1(this, z11, null));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: e */
    public final void mo70631e() {
        this.f63229l.f63388b.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m70634f(boolean z11) {
        InterfaceC41669n interfaceC41669n = this.f63235r;
        interfaceC41669n.setValue(Integer.valueOf(((Number) interfaceC41669n.getValue()).intValue() + (z11 ? 1 : -1)));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void fireEvent(InterfaceC28145r interfaceC28145r) {
        C29697t2 c29697t2;
        if (!(interfaceC28145r instanceof AbstractC31234Y) || (c29697t2 = ((AbstractC31234Y) interfaceC28145r).f63190a) == null) {
            super.fireEvent(interfaceC28145r);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31218S1(this, c29697t2, (Parcelable) interfaceC28145r, null, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: g */
    public final C31292k2 mo70635g() {
        return this.f63237t;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31263f2();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onLoad() {
        ((C29957e) this.f63224g).m70036a(SNSSDKState.Ready.INSTANCE);
        m70625a((Function2) new C31195K1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        C31201M1 c31201m1;
        if (continuation instanceof C31201M1) {
            c31201m1 = (C31201M1) continuation;
            int i11 = c31201m1.f63097c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31201m1.f63097c = i11 - Integer.MIN_VALUE;
            } else {
                c31201m1 = new C31201M1(this, (ContinuationImpl) continuation);
            }
        } else {
            c31201m1 = new C31201M1(this, (ContinuationImpl) continuation);
        }
        Object obj = c31201m1.f63095a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31201m1.f63097c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31201m1.f63097c = 1;
            if (AbstractC31275i2.m70663a(this, c31201m1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC28073M0.updateState$default(this, false, new C31204N1(this, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70627b(ContinuationImpl continuationImpl) {
        C31227V1 c31227v1;
        if (continuationImpl instanceof C31227V1) {
            c31227v1 = (C31227V1) continuationImpl;
            int i11 = c31227v1.f63175c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31227v1.f63175c = i11 - Integer.MIN_VALUE;
            } else {
                c31227v1 = new C31227V1(this, continuationImpl);
            }
        } else {
            c31227v1 = new C31227V1(this, continuationImpl);
        }
        Object objM70042a = c31227v1.f63173a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31227v1.f63175c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63226i;
            c31227v1.f63175c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31227v1);
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
                ((C29957e) this.f63224g).m70036a(sNSSDKStateM69729a);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: c */
    public final void mo70629c(boolean z11) {
        AbstractC31245b0 abstractC31245b0M70669a = this.f63229l.m70669a(z11);
        if (abstractC31245b0M70669a == null) {
            return;
        }
        fireEvent(abstractC31245b0M70669a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: b */
    public final void mo70628b(String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31230W1(this, null, this, str), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70623a(final C29124h c29124h, C29586o0 c29586o0) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Postponing SDK init for restrictions prompt: restriction=" + c29586o0.f59609a, null);
        this.f63239v = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31243a2.m70615a(this.f63549b, c29124h);
            }
        };
        fireEvent(new C31225V(c29586o0));
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70622a(C29070X c29070x) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "A user has uploaded document: " + c29070x.f59014a, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
    }

    /* JADX INFO: renamed from: a */
    public static final void m70617a(C31243a2 c31243a2, Throwable th2) {
        c31243a2.getClass();
        if (th2 instanceof CancellationException) {
            return;
        }
        AbstractC28052C.throwError$default(c31243a2, new C29107e0(th2, null, null, 6), "TYPE_UNKNOWN", false, null, 12, null);
        c31243a2.f63234q.setValue(Boolean.FALSE);
        C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel2", "An error while preparing the sdk...", th2);
    }

    /* JADX INFO: renamed from: a */
    public static final C29124h m70613a(C31243a2 c31243a2) {
        return c31243a2.getConfig();
    }

    /* JADX INFO: renamed from: a */
    public static final long m70612a(Pair pair) {
        return ((Number) pair.getSecond()).longValue();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70615a(C31243a2 c31243a2, C29124h c29124h) {
        c31243a2.getClass();
        c31243a2.m70625a((Function2) new C31337q1(c31243a2, c29124h, null));
        c31243a2.f63239v = null;
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70620a(SNSCompletionResult sNSCompletionResult, boolean z11) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Cancel verification with reason - " + sNSCompletionResult, new Throwable("onCancel"));
        showProgress(true);
        C28368g c28368g = new C28368g();
        SdkEvent sdkEvent = SdkEvent.Dismiss;
        c28368g.f57846b.add(Domain.Sdk);
        c28368g.f57846b.add(sdkEvent);
        c28368g.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{TuplesKt.m90091to("isDismissMethodCalled", Boolean.valueOf(z11))}));
        c28368g.m69267a(true);
        if (!C33048a.f67467b0.m71434a()) {
            this.f63240w.m70692a();
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31189I1(this, sNSCompletionResult, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70624a(C29697t2 c29697t2, Parcelable parcelable, String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31218S1(this, c29697t2, parcelable, str, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70619a(boolean z11, C29124h c29124h, ContinuationImpl continuationImpl) {
        C31213Q1 c31213q1;
        Object objM70689a;
        Object objM70678b;
        if (continuationImpl instanceof C31213Q1) {
            c31213q1 = (C31213Q1) continuationImpl;
            int i11 = c31213q1.f63127e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31213q1.f63127e = i11 - Integer.MIN_VALUE;
            } else {
                c31213q1 = new C31213Q1(this, continuationImpl);
            }
        } else {
            c31213q1 = new C31213Q1(this, continuationImpl);
        }
        Object obj = c31213q1.f63125c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31213q1.f63127e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "SDK is prepared. Applicant - " + c29124h.f59068a + ", type=" + c29124h.f59069b, null);
            AbstractC28073M0.updateState$default(this, false, new C31215R1(null), 1, null);
            C28936t c28936t = this.f63232o;
            KProperty kProperty = f63220x[1];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            m70616a(new SNSEvent.VerificationStarted(c29124h.f59068a));
            c31213q1.f63124b = c29124h;
            c31213q1.f63123a = z11;
            c31213q1.f63127e = 1;
            if (m70627b(c31213q1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM70678b = ((Result) obj).getValue();
            Result.m103847exceptionOrNullimpl(objM70678b);
            return Unit.INSTANCE;
        }
        z11 = c31213q1.f63123a;
        c29124h = c31213q1.f63124b;
        ResultKt.throwOnFailure(obj);
        if (!z11) {
            if (C33048a.f67467b0.m71434a()) {
                C31318n c31318n = this.f63230m;
                c31213q1.f63124b = null;
                c31213q1.f63127e = 2;
                objM70678b = c31318n.m70678b(c31213q1);
            } else {
                C31332p0 c31332p0 = this.f63240w;
                c31213q1.f63124b = null;
                c31213q1.f63127e = 3;
                c31332p0.getClass();
                if (AbstractC29130i.m69785k(c29124h)) {
                    objM70689a = c31332p0.m70684a(c29124h, c31213q1);
                    if (objM70689a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM70689a = Unit.INSTANCE;
                    }
                } else {
                    objM70689a = c31332p0.m70689a(false, c29124h, (ContinuationImpl) c31213q1);
                    if (objM70689a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM70689a = Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m70616a(SNSEvent sNSEvent) {
        try {
            SNSEventHandler eventHandler = SNSMobileSDK.INSTANCE.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(sNSEvent);
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel2", "Can't fire sns event " + sNSEvent, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70625a(Function2 function2) {
        m70634f(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31360w1(function2, this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70626a(boolean z11, boolean z12) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31198L1(this, null, z11, this, z12), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2
    /* JADX INFO: renamed from: a */
    public final void mo70621a(AbstractC28503w abstractC28503w, long j11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31340r1(this, null, j11, abstractC28503w, this), 3, null);
    }
}
