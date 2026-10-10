package com.sumsub.sns.internal.features.presentation.status;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28150t0;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.base.adapter.C28095e;
import com.sumsub.sns.core.presentation.intro.C28236b;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSSumsubIdBanner;
import com.sumsub.sns.databinding.C28359x;
import com.sumsub.sns.internal.core.analytics.Block;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.ControlAction;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28451e1;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.C30915a;
import com.sumsub.sns.internal.features.presentation.exitsurvey.C31023g;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.status.model.C32437a;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32490Q;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32608z;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/status/m;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/status/T;", "Lcom/sumsub/sns/internal/features/presentation/status/L;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/status/c", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantStatusFragment.kt\ncom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,458:1\n106#2,15:459\n298#3,2:474\n256#3,2:476\n256#3,2:478\n*S KotlinDebug\n*F\n+ 1 SNSApplicantStatusFragment.kt\ncom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusFragment\n*L\n56#1:459,15\n196#1:474,2\n231#1:476,2\n295#1:478,2\n*E\n"})
public final class C32435m extends AbstractC28064I<AbstractC32410T, C32403L> {

    /* JADX INFO: renamed from: a */
    public final Lazy f66110a;

    /* JADX INFO: renamed from: b */
    public final String f66111b;

    /* JADX INFO: renamed from: c */
    public final C28404L f66112c;

    /* JADX INFO: renamed from: d */
    public final C28404L f66113d;

    /* JADX INFO: renamed from: e */
    public final C28404L f66114e;

    /* JADX INFO: renamed from: f */
    public final C28404L f66115f;

    /* JADX INFO: renamed from: g */
    public final C28404L f66116g;

    /* JADX INFO: renamed from: h */
    public final C28404L f66117h;

    /* JADX INFO: renamed from: i */
    public final C28404L f66118i;

    /* JADX INFO: renamed from: j */
    public final C28404L f66119j;

    /* JADX INFO: renamed from: k */
    public AlertDialog f66120k;

    /* JADX INFO: renamed from: l */
    public SNSApplicantStatusAnalyticsState f66121l;

    /* JADX INFO: renamed from: m */
    public boolean f66122m;

    /* JADX INFO: renamed from: n */
    public final C32490Q f66123n;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f66109p = {AbstractC28118g.m69077a(C32435m.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32435m.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32435m.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32435m.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C32435m.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), AbstractC28118g.m69077a(C32435m.class, "contentContainer", "getContentContainer()Landroidx/core/widget/NestedScrollView;", 0), AbstractC28118g.m69077a(C32435m.class, "sumsubId", "getSumsubId()Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;", 0), AbstractC28118g.m69077a(C32435m.class, "agreementBottomSheetView", "getAgreementBottomSheetView()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", 0)};

    /* JADX INFO: renamed from: o */
    public static final C32416c f66108o = new C32416c();

    /* JADX INFO: renamed from: a */
    public static final Unit m71131a(C32435m c32435m, CompoundButton compoundButton, boolean z11) {
        C32403L c32403l = (C32403L) c32435m.f66110a.getValue();
        C28936t c28936t = c32403l.f66055n;
        KProperty kProperty = C32403L.f66041o[0];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
        AbstractC28073M0.updateState$default(c32403l, false, new C32395D(z11, null), 1, null);
        if (z11) {
            C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
            Control control = Control.SumsubIdPromoCheckbox;
            Map mapEmptyMap = MapsKt.emptyMap();
            Screen screen = analyticsDelegate.f57840a;
            String str = analyticsDelegate.f57841b;
            if (screen != Screen.Other) {
                C28368g c28368gM69265a = new C28368g().m69265a(screen, str, null);
                c28368gM69265a.f57846b.add(control);
                c28368gM69265a.f57846b.add(ControlAction.Checked);
                c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(C28367f.m69252a(screen, str), mapEmptyMap));
                c28368gM69265a.m69267a(false);
            }
        } else {
            C28367f analyticsDelegate2 = c32435m.getAnalyticsDelegate();
            Control control2 = Control.SumsubIdPromoCheckbox;
            Map mapEmptyMap2 = MapsKt.emptyMap();
            Screen screen2 = analyticsDelegate2.f57840a;
            String str2 = analyticsDelegate2.f57841b;
            if (screen2 != Screen.Other) {
                C28368g c28368gM69265a2 = new C28368g().m69265a(screen2, str2, null);
                c28368gM69265a2.f57846b.add(control2);
                c28368gM69265a2.f57846b.add(ControlAction.Unchecked);
                c28368gM69265a2.f57847c = MapsKt.toMap(MapsKt.plus(C28367f.m69252a(screen2, str2), mapEmptyMap2));
                c28368gM69265a2.m69267a(false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m71139b(C32435m c32435m) {
        return new C32404M(c32435m, c32435m.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c32435m.getArguments());
    }

    /* JADX INFO: renamed from: b */
    public static final void m71141b(C32435m c32435m, View view) {
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Control control = Control.ContinueButton;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("screenState", c32435m.f66121l.getState());
        C28367f.m69257a(analyticsDelegate, f65911a, str, control, MapsKt.build(mapCreateMapBuilder), 16);
        ((C32403L) c32435m.f66110a.getValue()).m71123e();
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m71144c(C32435m c32435m, String str) {
        ((C32403L) c32435m.f66110a.getValue()).m71122b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m71150f() {
        SNSSumsubIdBanner sNSSumsubIdBanner = (SNSSumsubIdBanner) this.f66118i.getValue(this, f66109p[6]);
        if (sNSSumsubIdBanner != null) {
            sNSSumsubIdBanner.setOnCheckedChanged(new Function2() { // from class: com.sumsub.sns.internal.features.presentation.status.t0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C32435m.m71131a(this.f66144b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF66531c() {
        return this.f66111b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_applicant_status);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32403L) this.f66110a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C32446r) {
            String str = ((C32446r) interfaceC28145r).f66136a;
            C30915a c30915a = new C30915a();
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_DATA", str);
            c30915a.setArguments(bundle);
            c30915a.show(getChildFragmentManager(), "TermsAndConditionsBottomSheet");
            return;
        }
        if (interfaceC28145r instanceof C32444q) {
            m71149a((C32444q) interfaceC28145r);
            return;
        }
        if (interfaceC28145r instanceof C32440o) {
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, new C32608z().forResult("request_key_sumusb_id"), "SNSSumsubIdFragment", false, 4, null);
            return;
        }
        if (!(interfaceC28145r instanceof C32442p)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70630d(true);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m71146a((AbstractC32410T) interfaceC28147s);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!(abstractC28503w instanceof C28497u)) {
            m69084e();
            return true;
        }
        if (((AbstractC32410T) ((C32403L) this.f66110a.getValue()).currentState()).f66070f) {
            C31023g.f62702g.getClass();
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, new C31023g(), null, false, 6, null);
            return false;
        }
        AlertDialog alertDialog = this.f66120k;
        if (alertDialog != null) {
            SNSAlertDialogBuilder.INSTANCE.showWithThemeExtension(alertDialog);
            return false;
        }
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, new C28500v(), null, null, 6, null);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f66121l = SNSApplicantStatusAnalyticsState.Loading;
        super.onViewCreated(view, bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_key_sumusb_id", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.status.f0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C32435m.m71136a(this.f66091a, str, bundle2);
            }
        });
        AbstractC28421U.m69305b(((C32403L) this.f66110a.getValue()).f66049h, getViewLifecycleOwner(), new C32422f(this, null));
        AbstractC28421U.m69305b(((C32403L) this.f66110a.getValue()).f66050i, getViewLifecycleOwner(), new C32424g(this, null));
        m71150f();
    }

    public C32435m() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.status.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32435m.m71139b(this.f66107b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32428i(new C32426h(this)));
        this.f66110a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32403L.class), new C32430j(lazy), new C32432k(lazy), function0);
        this.f66111b = "Status";
        this.f66112c = new C28404L(R$id.sns_title);
        this.f66113d = new C28404L(R$id.sns_subtitle);
        this.f66114e = new C28404L(R$id.sns_footer);
        this.f66115f = new C28404L(R$id.sns_primary_button);
        this.f66116g = new C28404L(R$id.sns_list);
        this.f66117h = new C28404L(R$id.sns_content);
        this.f66118i = new C28404L(R$id.sns_id_flow);
        this.f66119j = new C28404L(R$id.sns_agreement_bottom_sheet);
        this.f66121l = SNSApplicantStatusAnalyticsState.Loading;
        this.f66123n = new C32490Q(this);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("screenState", this.f66121l.getState());
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71140b(C32435m c32435m, String str) {
        c32435m.f66123n.m69553r();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final void m71143b(C32435m c32435m, Map map, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Control control = Control.CancelButton;
        Popup popup = Popup.VerificationExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69253a(f65911a, str, control, map, popup);
    }

    /* JADX INFO: renamed from: b */
    public static final void m71142b(C32435m c32435m, Map map, DialogInterface dialogInterface) {
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Popup popup = Popup.VerificationExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69254a(f65911a, str, map, popup);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71132a(C32435m c32435m, String str) {
        ((C32403L) c32435m.f66110a.getValue()).m71122b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71130a(C32435m c32435m) {
        C32403L c32403l = (C32403L) c32435m.f66110a.getValue();
        AbstractC29172p abstractC29172p = c32403l.f66051j;
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68956e("SNSApplicantStatusViewModel", "onAgreementAcceptedFromBottomSheet: applicant is null", null);
        } else {
            C32393B c32393b = new C32393B(c32403l, abstractC29172p, null);
            c32403l.showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(c32403l), null, null, new C28451e1(c32393b, c32403l, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71146a(AbstractC32410T abstractC32410T) {
        C28404L c28404l = this.f66112c;
        KProperty[] kPropertyArr = f66109p;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[0]);
        if (textView != null) {
            CharSequence charSequence = abstractC32410T.f66065a;
            textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
            CharSequence charSequence2 = abstractC32410T.f66065a;
            textView.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, textView.getContext()) : null);
        }
        TextView textView2 = (TextView) this.f66113d.getValue(this, kPropertyArr[1]);
        if (textView2 != null) {
            CharSequence charSequence3 = abstractC32410T.f66066b;
            textView2.setVisibility((charSequence3 == null || charSequence3.length() == 0) ? 8 : 0);
            CharSequence charSequence4 = abstractC32410T.f66066b;
            textView2.setText(charSequence4 != null ? AbstractC28462i0.m69364a(charSequence4, textView2.getContext()) : null);
        }
        TextView textView3 = (TextView) this.f66114e.getValue(this, kPropertyArr[2]);
        if (textView3 != null) {
            CharSequence charSequence5 = abstractC32410T.f66067c;
            textView3.setVisibility((charSequence5 == null || charSequence5.length() == 0) ? 8 : 0);
            CharSequence charSequence6 = abstractC32410T.f66067c;
            textView3.setText(charSequence6 != null ? AbstractC28462i0.m69364a(charSequence6, textView3.getContext()) : null);
            AbstractC28485q.m69381a(textView3, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32435m.m71132a(this.f66130b, (String) obj);
                }
            });
        }
        Button button = (Button) this.f66115f.getValue(this, kPropertyArr[3]);
        if (button != null) {
            CharSequence charSequence7 = abstractC32410T.f66069e;
            button.setVisibility((charSequence7 == null || charSequence7.length() == 0) ? 8 : 0);
            button.setText(abstractC32410T.f66069e);
        }
        RecyclerView recyclerView = (RecyclerView) this.f66116g.getValue(this, kPropertyArr[4]);
        if (recyclerView != null) {
            recyclerView.setVisibility(abstractC32410T.f66068d.isEmpty() ? 8 : 0);
            if (!abstractC32410T.f66068d.isEmpty()) {
                if (recyclerView.getAdapter() == null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                    recyclerView.setAdapter(new C28095e(new C32418d(this)));
                    recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.status.p0
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                            C32435m.m71135a(this.f66132b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                        }
                    });
                }
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    C28095e c28095e = (C28095e) adapter;
                    List list = abstractC32410T.f66068d;
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(c28095e.mo69071a(c28095e.f57292a, list));
                    c28095e.f57292a.clear();
                    c28095e.f57292a.addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(c28095e);
                    this.f66122m = abstractC32410T instanceof C32408Q;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        this.f66120k = null;
        if (abstractC32410T instanceof C32409S) {
            m71145a((C32409S) abstractC32410T);
            return;
        }
        if (abstractC32410T instanceof C32407P) {
            NestedScrollView nestedScrollView = (NestedScrollView) this.f66117h.getValue(this, kPropertyArr[5]);
            if (nestedScrollView != null) {
                C28359x c28359xM69251a = C28359x.m69251a(getLayoutInflater().inflate(R$layout.sns_layout_applicant_status_reviewing_content, (ViewGroup) null, false));
                c28359xM69251a.f57817c.setText(abstractC32410T.f66065a);
                c28359xM69251a.f57816b.setText(abstractC32410T.f66066b);
                nestedScrollView.setFillViewport(true);
                nestedScrollView.setVisibility(0);
                nestedScrollView.removeAllViews();
                nestedScrollView.addView(c28359xM69251a.f57815a, new ViewGroup.MarginLayoutParams(-1, -1));
                return;
            }
            return;
        }
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.f66117h.getValue(this, kPropertyArr[5]);
        if (nestedScrollView2 != null) {
            nestedScrollView2.setVisibility(8);
        }
        Button button2 = (Button) this.f66115f.getValue(this, kPropertyArr[3]);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.status.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32435m.m71141b(this.f66135b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71148a(C32437a c32437a) {
        C28404L c28404l = this.f66118i;
        KProperty[] kPropertyArr = f66109p;
        SNSSumsubIdBanner sNSSumsubIdBanner = (SNSSumsubIdBanner) c28404l.getValue(this, kPropertyArr[6]);
        if (sNSSumsubIdBanner != null) {
            boolean z11 = (c32437a.f66125a == null || c32437a.f66126b) ? false : true;
            if (z11 && sNSSumsubIdBanner.getVisibility() != 0) {
                C28367f analyticsDelegate = getAnalyticsDelegate();
                Block block = Block.SumsubIdPromoBlock;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("screenState", this.f66121l.getState());
                C28367f.m69255a(analyticsDelegate, block, MapsKt.build(mapCreateMapBuilder));
            }
            sNSSumsubIdBanner.setVisibility(z11 ? 0 : 8);
            C32411U c32411u = c32437a.f66125a;
            if (c32411u != null) {
                CharSequence charSequence = c32411u.f66072a;
                CharSequence charSequence2 = c32411u.f66073b;
                sNSSumsubIdBanner.setText(charSequence, charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.s0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C32435m.m71140b(this.f66140b, (String) obj);
                    }
                });
                boolean z12 = c32411u.f66074c;
                SNSSumsubIdBanner sNSSumsubIdBanner2 = (SNSSumsubIdBanner) this.f66118i.getValue(this, kPropertyArr[6]);
                if (sNSSumsubIdBanner2 != null) {
                    sNSSumsubIdBanner2.setOnCheckedChanged(null);
                }
                SNSSumsubIdBanner sNSSumsubIdBanner3 = (SNSSumsubIdBanner) this.f66118i.getValue(this, kPropertyArr[6]);
                if (sNSSumsubIdBanner3 != null) {
                    sNSSumsubIdBanner3.setIsChecked(z12);
                }
                m71150f();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71149a(C32444q c32444q) {
        SNSCommonBottomSheetView sNSCommonBottomSheetView = (SNSCommonBottomSheetView) this.f66119j.getValue(this, f66109p[7]);
        if (sNSCommonBottomSheetView == null) {
            return;
        }
        C28150t0 value = ((C32403L) this.f66110a.getValue()).getViewModelInternalState().getValue();
        new C32412a(sNSCommonBottomSheetView, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.status.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32435m.m71130a(this.f66124b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32435m.m71144c(this.f66128b, (String) obj);
            }
        }).m71129a(c32444q.f66133a, c32444q.f66134b, value.f57392g, value.f57389d);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71135a(C32435m c32435m, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        RecyclerView recyclerView = (RecyclerView) view;
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int iCoerceAtLeast = c32435m.f66122m ? RangesKt.coerceAtLeast(MathKt.roundToInt(((((i14 - i12) - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom()) - childAt.getHeight()) * 0.25f), 0) : 0;
        if (marginLayoutParams.topMargin != iCoerceAtLeast) {
            marginLayoutParams.topMargin = iCoerceAtLeast;
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71145a(C32409S c32409s) {
        Button button;
        if (getView() != null) {
            C28404L c28404l = this.f66117h;
            KProperty[] kPropertyArr = f66109p;
            NestedScrollView nestedScrollView = (NestedScrollView) c28404l.getValue(this, kPropertyArr[5]);
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            SNSInstructionsViewHandler instructionsViewHandler = C28468k0.f57983a.getInstructionsViewHandler();
            View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), "VIDEO_IDENT", null, IntroScene.VIDEO_IDENT.getSceneName(), SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), null) : null;
            if (viewOnVerificationStep != null) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) this.f66117h.getValue(this, kPropertyArr[5]);
                if (nestedScrollView2 != null) {
                    nestedScrollView2.removeAllViews();
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
                    marginLayoutParams.setMarginStart(dimensionPixelSize);
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    Unit unit = Unit.INSTANCE;
                    nestedScrollView2.addView(viewOnVerificationStep, marginLayoutParams);
                }
                View view = getView();
                if (view != null && (button = (Button) view.findViewById(R$id.sns_primary_button)) != null) {
                    Object obj = c32409s.f66062h.get("actionTitle");
                    button.setText(obj instanceof String ? (String) obj : null);
                }
            } else {
                C28236b.m69184a(new C28236b(getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, getAppListener$idensic_mobile_sdk_aar_defaultRelease(), 0), requireView(), c32409s.f66062h, R$id.sns_content, R$id.sns_primary_button);
            }
        }
        Button button2 = (Button) this.f66115f.getValue(this, f66109p[3]);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.status.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C32435m.m71134a(this.f66137b, view2);
                }
            });
        }
        C32414b c32414b = c32409s.f66063i;
        if (c32414b != null) {
            m71147a(c32414b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71134a(C32435m c32435m, View view) {
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Control control = Control.ContinueButton;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("screenState", c32435m.f66121l.getState());
        C28367f.m69257a(analyticsDelegate, f65911a, str, control, MapsKt.build(mapCreateMapBuilder), 16);
        ((C32403L) c32435m.f66110a.getValue()).m71123e();
    }

    /* JADX INFO: renamed from: a */
    public final void m71147a(C32414b c32414b) {
        final Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", Screen.StatusScreen.getText()));
        AlertDialog alertDialogCreate = new SNSAlertDialogBuilder(requireContext()).setMessage(c32414b.f66080a).setPositiveButton(c32414b.f66081b, new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.status.g0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C32435m.m71138a(this.f66094b, mapMapOf, dialogInterface, i11);
            }
        }).setNegativeButton(c32414b.f66082c, new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.status.h0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C32435m.m71143b(this.f66097b, mapMapOf, dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sumsub.sns.internal.features.presentation.status.i0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C32435m.m71133a(this.f66100b, dialogInterface);
            }
        }).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.features.presentation.status.j0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C32435m.m71137a(this.f66102a, mapMapOf, dialogInterface);
            }
        });
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sumsub.sns.internal.features.presentation.status.k0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C32435m.m71142b(this.f66105b, mapMapOf, dialogInterface);
            }
        });
        this.f66120k = alertDialogCreate;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71138a(C32435m c32435m, Map map, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Control control = Control.ConfirmButton;
        Popup popup = Popup.VerificationExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69253a(f65911a, str, control, map, popup);
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = c32435m.getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70620a((SNSCompletionResult) SNSCompletionResult.SuccessTermination.INSTANCE, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71133a(C32435m c32435m, DialogInterface dialogInterface) {
        AlertDialog alertDialog = c32435m.f66120k;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71137a(C32435m c32435m, Map map, DialogInterface dialogInterface) {
        C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
        Screen f65911a = c32435m.getF65153b();
        String str = c32435m.f66111b;
        Popup popup = Popup.VerificationExitPopup;
        analyticsDelegate.getClass();
        C28367f.m69261b(f65911a, str, map, popup);
    }

    /* JADX INFO: renamed from: a */
    public static final void m71136a(C32435m c32435m, String str, Bundle bundle) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(c32435m.getViewLifecycleOwner()), C41782z0.m91393c(), null, new C32420e(bundle, c32435m, null), 2, null);
    }
}
