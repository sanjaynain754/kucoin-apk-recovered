package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSWarningView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28495t0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.screen.C28942c;
import com.sumsub.sns.internal.core.presentation.screen.C28943d;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.esign.C29783s;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.otp.C31375c;
import com.sumsub.sns.internal.features.presentation.otp.C31382j;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/esign/h;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/esign/x;", "Lcom/sumsub/sns/internal/features/presentation/esign/n0;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/esign/b", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSESignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSESignFragment.kt\ncom/sumsub/sns/internal/features/presentation/esign/SNSESignFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,310:1\n106#2,15:311\n28#3,12:326\n50#3,12:338\n50#3,12:350\n256#4,2:362\n298#4,2:364\n298#4,2:366\n256#4,2:368\n256#4,2:370\n*S KotlinDebug\n*F\n+ 1 SNSESignFragment.kt\ncom/sumsub/sns/internal/features/presentation/esign/SNSESignFragment\n*L\n43#1:311,15\n209#1:326,12\n218#1:338,12\n236#1:350,12\n249#1:362,2\n270#1:364,2\n273#1:366,2\n292#1:368,2\n260#1:370,2\n*E\n"})
public final class C30984h extends AbstractC28064I<C31014x, C30997n0> implements InterfaceC28797d {

    /* JADX INFO: renamed from: a */
    public final Lazy f62609a;

    /* JADX INFO: renamed from: b */
    public final C28404L f62610b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f62611c;

    /* JADX INFO: renamed from: d */
    public final C28404L f62612d;

    /* JADX INFO: renamed from: e */
    public final C28404L f62613e;

    /* JADX INFO: renamed from: f */
    public C30988j f62614f;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f62608h = {AbstractC28118g.m69077a(C30984h.class, "bottomSheet", "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", 0), AbstractC28118g.m69077a(C30984h.class, "button", "getButton()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C30984h.class, "content", "getContent()Landroid/view/ViewGroup;", 0)};

    /* JADX INFO: renamed from: g */
    public static final C30973b f62607g = new C30973b();

    /* JADX INFO: renamed from: b */
    public static final void m70530b(C30984h c30984h, View view) {
        AbstractC28458h.m69339a(view);
        C28367f analyticsDelegate = c30984h.getAnalyticsDelegate();
        Screen screenM70556e = ((C30997n0) c30984h.f62609a.getValue()).m70556e();
        String idDocSetType = ((C30997n0) c30984h.f62609a.getValue()).getIdDocSetType();
        Control control = Control.ContinueButton;
        ((C30997n0) c30984h.f62609a.getValue()).getClass();
        C28367f.m69257a(analyticsDelegate, screenM70556e, idDocSetType, control, MapsKt.emptyMap(), 16);
        ((C30997n0) c30984h.f62609a.getValue()).m70559h();
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C30997n0) this.f62609a.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70527a(C30984h c30984h, boolean z11) {
        if (z11) {
            ((C30997n0) c30984h.f62609a.getValue()).getClass();
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onBottomSheetShown", null);
        } else {
            C30997n0 c30997n0 = (C30997n0) c30984h.f62609a.getValue();
            c30997n0.getClass();
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onBottomSheetDismissed", null);
            InterfaceC41775x1 interfaceC41775x1 = c30997n0.f62659s;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            c30997n0.f62659s = null;
            AbstractC28073M0.updateState$default(c30997n0, false, new C30993l0(c30997n0, null), 1, null);
            SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f = c30984h.m70535f();
            if (sNSCommonBottomSheetViewM70535f != null) {
                sNSCommonBottomSheetViewM70535f.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final SNSCommonBottomSheetView m70535f() {
        return (SNSCommonBottomSheetView) this.f62610b.getValue(this, f62608h[0]);
    }

    /* JADX INFO: renamed from: g */
    public final void m70536g() {
        C33272c.f67816e.f67810a.mo68955d("SNSESignFragment", "hideBottomSheet", null);
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f = m70535f();
        if (sNSCommonBottomSheetViewM70535f != null) {
            sNSCommonBottomSheetViewM70535f.setStateCallback(null);
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f2 = m70535f();
        if (sNSCommonBottomSheetViewM70535f2 != null) {
            sNSCommonBottomSheetViewM70535f2.hide();
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f3 = m70535f();
        if (sNSCommonBottomSheetViewM70535f3 != null) {
            sNSCommonBottomSheetViewM70535f3.setVisibility(8);
        }
        this.f62611c = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        ((C30997n0) this.f62609a.getValue()).getClass();
        return MapsKt.emptyMap();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65912b() {
        return ((C30997n0) this.f62609a.getValue()).getIdDocSetType();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_esign);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        ((C30997n0) this.f62609a.getValue()).getClass();
        return MapsKt.emptyMap();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65911a() {
        return ((C30997n0) this.f62609a.getValue()).m70556e();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30997n0) this.f62609a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        C33272c.f67816e.f67810a.mo68955d("SNSESignFragment", "handleEvent: " + interfaceC28145r, null);
        if (!(interfaceC28145r instanceof C31008t)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            C31008t c31008t = (C31008t) interfaceC28145r;
            AbstractC28495t0.m69386a(appListener$idensic_mobile_sdk_aar_defaultRelease, c31008t.f62669a, 0, ((C30997n0) this.f62609a.getValue()).getIdDocSetType(), Screen.ESignDocumentPreviewScreen, MapsKt.mapOf(TuplesKt.m90091to("docName", c31008t.f62670b)), 8);
        }
        m70536g();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70533a((C31014x) interfaceC28147s);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        C29752Y c29752y;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSESignFragment", "onFinishCalled: " + abstractC28503w, null);
        if (Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            C30997n0 c30997n0 = (C30997n0) this.f62609a.getValue();
            c30997n0.getClass();
            c33270a.f67810a.mo68955d("SNSESignViewModel", "onBackPress", null);
            if (!c30997n0.isFinishingWithResult() && (c29752y = c30997n0.f62653m) != null) {
                AbstractC31000p abstractC31000p = ((C31014x) c30997n0.currentState()).f62678a;
                if (abstractC31000p instanceof C30998o) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(c30997n0), null, null, new C30969Y(c30997n0, c29752y, null), 3, null);
                    return false;
                }
                if (abstractC31000p instanceof C30986i) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(c30997n0), null, null, new C30970Z(c30997n0, null), 3, null);
                    return false;
                }
                if (abstractC31000p instanceof C31010u) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(c30997n0), null, null, new C30972a0(c30997n0, null), 3, null);
                    return false;
                }
            }
        }
        m69084e();
        return true;
    }

    public C30984h() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.esign.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30984h.m70526a(this.f62661b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30977d(new C30975c(this)));
        this.f62609a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30997n0.class), new C30979e(lazy), new C30981f(lazy), function0);
        this.f62610b = new C28404L(R$id.sns_esign_bottom_sheet);
        this.f62612d = new C28404L(R$id.sns_button);
        this.f62613e = new C28404L(R$id.sns_content);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getParentFragmentManager().setFragmentResultListener("esign_otp", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.esign.q0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C30984h.m70529a(this.f62664a, str, bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m70534b(C31014x c31014x) {
        C30988j c30988j;
        C30988j c30988j2 = c31014x.f62681d;
        if (c30988j2 == null || (c30988j = this.f62614f) == null) {
            return;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSESignFragment", "Screen closed " + c30988j.f62619a + C33627eb.f69716f + c30988j.f62620b, null, 4, null);
        C33272c.f67816e.f67810a.mo68955d("SNSESignFragment", "Screen changed " + c30988j2.f62619a + C33627eb.f69716f + c30988j2.f62620b, null);
        C28367f.m69259a(getAnalyticsDelegate(), c30988j2.f62619a, ((C30997n0) this.f62609a.getValue()).getIdDocSetType(), c30988j2.f62620b, 8);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70528a(C30984h c30984h, View view) {
        C30997n0 c30997n0 = (C30997n0) c30984h.f62609a.getValue();
        c30997n0.getClass();
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onBottomSheetDismissClick", null);
        InterfaceC41775x1 interfaceC41775x1 = c30997n0.f62659s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        c30997n0.f62659s = null;
        AbstractC28073M0.updateState$default(c30997n0, false, new C30993l0(c30997n0, null), 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70526a(C30984h c30984h) {
        return new C30971a(c30984h, c30984h.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30984h.getArguments());
    }

    /* JADX INFO: renamed from: a */
    public final void m70533a(C31014x c31014x) {
        Button button;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        View view = getView();
        ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(R$id.sns_child_content) : null;
        if (!(parentFragmentManager.findFragmentById(viewGroup != null ? viewGroup.getId() : 0) instanceof C31382j) || !(c31014x.f62678a instanceof C31010u)) {
            C33272c.f67816e.f67810a.mo68955d("SNSESignFragment", String.valueOf(c31014x), null);
        }
        boolean z11 = (c31014x.f62678a instanceof C31006s) || c31014x.f62682e;
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(z11);
        }
        if (!Intrinsics.areEqual(c31014x.f62681d, this.f62614f)) {
            m70534b(c31014x);
            this.f62614f = c31014x.f62681d;
        }
        AbstractC31000p abstractC31000p = c31014x.f62678a;
        if (!abstractC31000p.f62662a) {
            m70536g();
        }
        if (!(abstractC31000p instanceof C30986i) && !(abstractC31000p instanceof C30998o) && !(abstractC31000p instanceof C30994m)) {
            if (abstractC31000p instanceof C31010u) {
                C31010u c31010u = (C31010u) abstractC31000p;
                FragmentManager parentFragmentManager2 = getParentFragmentManager();
                View view2 = getView();
                ViewGroup viewGroup2 = view2 != null ? (ViewGroup) view2.findViewById(R$id.sns_child_content) : null;
                Fragment fragmentFindFragmentById = parentFragmentManager2.findFragmentById(viewGroup2 != null ? viewGroup2.getId() : 0);
                if (!(fragmentFindFragmentById instanceof C31382j) || !((C31382j) fragmentFindFragmentById).isVisible()) {
                    Bundle bundle = ((C30997n0) this.f62609a.getValue()).f62641a;
                    Document document = bundle != null ? (Document) AbstractC28437b.m69320a(bundle, "ARG_DOCUMENT", Document.class, null) : null;
                    if (document != null) {
                        FragmentManager parentFragmentManager3 = getParentFragmentManager();
                        View view3 = getView();
                        ViewGroup viewGroup3 = view3 != null ? (ViewGroup) view3.findViewById(R$id.sns_child_content) : null;
                        Fragment fragmentFindFragmentById2 = parentFragmentManager3.findFragmentById(viewGroup3 != null ? viewGroup3.getId() : 0);
                        if (fragmentFindFragmentById2 != null) {
                            FragmentTransaction fragmentTransactionBeginTransaction = getParentFragmentManager().beginTransaction();
                            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentById2);
                            fragmentTransactionBeginTransaction.commitNow();
                        }
                        C31375c c31375c = C31382j.f63581g;
                        String str = c31010u.f62673b;
                        C29783s c29783s = c31010u.f62674c;
                        C28943d c28943d = new C28943d(str, c29783s != null ? new C28942c(c29783s.f59853b, c29783s.f59854c) : null, c31010u.f62675d, null);
                        c31375c.getClass();
                        C31382j c31382j = new C31382j();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("arg_strings_key", "esign");
                        bundle2.putString("arg_client_tag", "ESIGN");
                        bundle2.putParcelable("arg_doc", document);
                        bundle2.putParcelable("arg_otp_params", c28943d);
                        c31382j.setArguments(bundle2);
                        Fragment fragmentForResult = c31382j.forResult("esign_otp");
                        FragmentTransaction fragmentTransactionBeginTransaction2 = getParentFragmentManager().beginTransaction();
                        View view4 = getView();
                        ViewGroup viewGroup4 = view4 != null ? (ViewGroup) view4.findViewById(R$id.sns_child_content) : null;
                        fragmentTransactionBeginTransaction2.replace(viewGroup4 != null ? viewGroup4.getId() : 0, fragmentForResult, "SNSOtpInputFragment");
                        fragmentTransactionBeginTransaction2.addToBackStack("SNSOtpInputFragment");
                        fragmentTransactionBeginTransaction2.commit();
                    }
                }
            }
        } else {
            FragmentManager parentFragmentManager4 = getParentFragmentManager();
            View view5 = getView();
            ViewGroup viewGroup5 = view5 != null ? (ViewGroup) view5.findViewById(R$id.sns_child_content) : null;
            Fragment fragmentFindFragmentById3 = parentFragmentManager4.findFragmentById(viewGroup5 != null ? viewGroup5.getId() : 0);
            if (fragmentFindFragmentById3 != null) {
                FragmentTransaction fragmentTransactionBeginTransaction3 = getParentFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction3.remove(fragmentFindFragmentById3);
                fragmentTransactionBeginTransaction3.commitNow();
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            C28404L c28404l = this.f62613e;
            KProperty[] kPropertyArr = f62608h;
            ViewGroup viewGroup6 = (ViewGroup) c28404l.getValue(this, kPropertyArr[2]);
            Fragment fragmentFindFragmentById4 = childFragmentManager.findFragmentById(viewGroup6 != null ? viewGroup6.getId() : 0);
            if ((fragmentFindFragmentById4 instanceof C28169f ? (C28169f) fragmentFindFragmentById4 : null) == null) {
                FragmentTransaction fragmentTransactionBeginTransaction4 = getChildFragmentManager().beginTransaction();
                ViewGroup viewGroup7 = (ViewGroup) this.f62613e.getValue(this, kPropertyArr[2]);
                int id2 = viewGroup7 != null ? viewGroup7.getId() : 0;
                C28165b c28165b = C28169f.f57420o;
                String idDocSetType = ((C30997n0) this.f62609a.getValue()).getIdDocSetType();
                c28165b.getClass();
                fragmentTransactionBeginTransaction4.replace(id2, C28165b.m69096a("SNSESignFragment", idDocSetType));
                fragmentTransactionBeginTransaction4.commitNow();
            }
            if (abstractC31000p instanceof C30998o) {
                m70532a((C30998o) abstractC31000p);
            }
        }
        C28404L c28404l2 = this.f62612d;
        KProperty[] kPropertyArr2 = f62608h;
        Button button2 = (Button) c28404l2.getValue(this, kPropertyArr2[1]);
        if (button2 != null) {
            AbstractC28458h.m69341a(button2, c31014x.f62679b);
        }
        Button button3 = (Button) this.f62612d.getValue(this, kPropertyArr2[1]);
        if (button3 != null) {
            button3.setOnClickListener(null);
        }
        Button button4 = (Button) this.f62612d.getValue(this, kPropertyArr2[1]);
        if (button4 != null) {
            button4.setEnabled(c31014x.f62680c);
        }
        if (c31014x.f62679b == null || (button = (Button) this.f62612d.getValue(this, kPropertyArr2[1])) == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.esign.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                C30984h.m70530b(this.f62663b, view6);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m70529a(C30984h c30984h, String str, Bundle bundle) {
        c30984h.m70531a(bundle);
    }

    /* JADX INFO: renamed from: a */
    public final void m70531a(Bundle bundle) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSESignFragment", "handleOtpInputResult: " + bundle, null);
        AbstractC28133l.Companion.getClass();
        int i11 = bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY);
        if (i11 != 10) {
            if (i11 != 11) {
                return;
            }
            C30997n0 c30997n0 = (C30997n0) this.f62609a.getValue();
            c30997n0.getClass();
            c33270a.f67810a.mo68955d("SNSESignViewModel", "onResendCode", null);
            AbstractC28073M0.updateState$default(c30997n0, false, new C30987i0(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(c30997n0), null, null, new C30989j0(c30997n0, null), 3, null);
            return;
        }
        C30997n0 c30997n1 = (C30997n0) this.f62609a.getValue();
        String string = bundle.getString("result_key_code");
        if (string == null) {
            string = "";
        }
        c30997n1.getClass();
        c33270a.f67810a.mo68955d("SNSESignViewModel", "onCheckCode", null);
        AbstractC28073M0.updateState$default(c30997n1, false, new C30974b0(null), 1, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c30997n1), null, null, new C30976c0(c30997n1, string, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70532a(C30998o c30998o) {
        C30996n c30996n = c30998o.f62660b;
        if (c30996n == null) {
            m70536g();
            return;
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f = m70535f();
        if (sNSCommonBottomSheetViewM70535f != null) {
            sNSCommonBottomSheetViewM70535f.setVisibility(0);
        }
        if (this.f62611c == null) {
            SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f2 = m70535f();
            this.f62611c = (ViewGroup) (sNSCommonBottomSheetViewM70535f2 != null ? sNSCommonBottomSheetViewM70535f2.inflate(R$layout.sns_esign_bottom_sheet) : null);
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f3 = m70535f();
        if (sNSCommonBottomSheetViewM70535f3 != null) {
            sNSCommonBottomSheetViewM70535f3.setStateCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.esign.r0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30984h.m70527a(this.f62666b, ((Boolean) obj).booleanValue());
                }
            });
        }
        ViewGroup viewGroup = this.f62611c;
        Button button = viewGroup != null ? (Button) viewGroup.findViewById(R$id.sns_button) : null;
        ViewGroup viewGroup2 = this.f62611c;
        TextView textView = viewGroup2 != null ? (TextView) viewGroup2.findViewById(R$id.sns_title) : null;
        ViewGroup viewGroup3 = this.f62611c;
        SNSProgressBarView sNSProgressBarView = viewGroup3 != null ? (SNSProgressBarView) viewGroup3.findViewById(R$id.sns_esign_bottom_progress_bar) : null;
        ViewGroup viewGroup4 = this.f62611c;
        SNSWarningView sNSWarningView = viewGroup4 != null ? (SNSWarningView) viewGroup4.findViewById(R$id.sns_warning) : null;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c30996n.f62636a);
        }
        if (sNSProgressBarView != null) {
            sNSProgressBarView.setVisibility(!c30996n.f62638c ? 8 : 0);
        }
        if (sNSWarningView != null) {
            String str = c30996n.f62637b;
            sNSWarningView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        }
        if (sNSWarningView != null) {
            sNSWarningView.setSubtitle(c30996n.f62637b);
        }
        if (sNSWarningView != null) {
            sNSWarningView.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.WARNING.getImageName()));
        }
        if (button != null) {
            AbstractC28458h.m69341a(button, c30996n.f62639d);
        }
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.esign.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C30984h.m70528a(this.f62668b, view);
                }
            });
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70535f4 = m70535f();
        if (sNSCommonBottomSheetViewM70535f4 != null) {
            sNSCommonBottomSheetViewM70535f4.show();
        }
    }
}
