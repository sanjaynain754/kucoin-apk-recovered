package com.sumsub.sns.internal.features.presentation.poa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSBottomSheetHandleView;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSFileItemView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSLinkButton;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28347l;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30808G;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30823g;
import com.sumsub.sns.internal.features.presentation.common.C30843t;
import com.sumsub.sns.internal.features.presentation.common.C30844u;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.utils.C32663n;
import com.sumsub.sns.internal.features.presentation.utils.C32664o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/poa/g;", "Lcom/sumsub/sns/internal/features/presentation/common/g;", "Lcom/sumsub/sns/databinding/l;", "Lcom/sumsub/sns/internal/features/presentation/poa/l;", "Lcom/sumsub/sns/internal/features/presentation/poa/x;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSProofOfAddressFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSProofOfAddressFragmentV2.kt\ncom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressFragmentV2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,285:1\n106#2,15:286\n256#3,2:301\n256#3,2:303\n256#3,2:305\n256#3,2:307\n256#3,2:309\n256#3,2:311\n1869#4,2:313\n1869#4,2:315\n1869#4,2:317\n1#5:319\n27#6,4:320\n*S KotlinDebug\n*F\n+ 1 SNSProofOfAddressFragmentV2.kt\ncom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressFragmentV2\n*L\n38#1:286,15\n90#1:301,2\n102#1:303,2\n109#1:305,2\n110#1:307,2\n111#1:309,2\n112#1:311,2\n121#1:313,2\n205#1:315,2\n217#1:317,2\n40#1:320,4\n*E\n"})
public final class C31455g extends AbstractC30823g<C28347l, AbstractC31460l, C31472x> {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f63759V = 0;

    /* JADX INFO: renamed from: e */
    public final Lazy f63760e;

    /* JADX INFO: renamed from: f */
    public final String f63761f;

    /* JADX INFO: renamed from: g */
    public final Screen f63762g;

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g
    /* JADX INFO: renamed from: a */
    public final void mo70491a(int i11) {
        ((C31472x) this.f63760e.getValue()).intent(new C31457i(i11));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        return this.f63761f;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF64892v() {
        return this.f63762g;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31472x) this.f63760e.getValue();
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C31462n) {
            m70734a((C31462n) interfaceC28145r);
            return;
        }
        if (!(interfaceC28145r instanceof C31456h)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70608a(((C31456h) interfaceC28145r).f63763a.getType());
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC31460l abstractC31460l = (AbstractC31460l) abstractC28081V;
        if (!(abstractC31460l instanceof C31459k)) {
            throw new NoWhenBranchMatchedException();
        }
        m70733a((C31459k) abstractC31460l);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_poa, viewGroup, false);
        int i11 = R$id.sns_container;
        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_example_more;
            SNSLinkButton sNSLinkButton = (SNSLinkButton) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSLinkButton != null) {
                i11 = R$id.sns_example_title;
                SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSSubtitle1TextView != null) {
                    i11 = R$id.sns_examples_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i11);
                    if (linearLayout != null) {
                        i11 = R$id.sns_file1;
                        SNSFileItemView sNSFileItemView = (SNSFileItemView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSFileItemView != null) {
                            i11 = R$id.sns_file2;
                            SNSFileItemView sNSFileItemView2 = (SNSFileItemView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSFileItemView2 != null) {
                                i11 = R$id.sns_file_formats_text_view;
                                SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSCaptionTextView != null) {
                                    i11 = R$id.sns_form_placeholder;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, i11);
                                    if (frameLayout != null) {
                                        i11 = R$id.sns_guideline_end;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                            i11 = R$id.sns_guideline_start;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                i11 = R$id.sns_poa_bottom_sheet;
                                                SNSCommonBottomSheetView sNSCommonBottomSheetView = (SNSCommonBottomSheetView) ViewBindings.findChildViewById(viewInflate, i11);
                                                if (sNSCommonBottomSheetView != null) {
                                                    i11 = R$id.sns_primary_button;
                                                    SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                                                    if (sNSPrimaryButton != null) {
                                                        i11 = R$id.sns_scroller;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, i11);
                                                        if (scrollView != null) {
                                                            i11 = R$id.sns_subtitle;
                                                            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                                            if (sNSSubtitle2TextView != null) {
                                                                i11 = R$id.sns_title;
                                                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                                                if (sNSH1TextView != null) {
                                                                    i11 = R$id.sns_toolbar;
                                                                    if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                                        return new C28347l((SNSBackgroundView) viewInflate, sNSLinkButton, sNSSubtitle1TextView, linearLayout, sNSFileItemView, sNSFileItemView2, sNSCaptionTextView, frameLayout, sNSCommonBottomSheetView, sNSPrimaryButton, scrollView, sNSSubtitle2TextView, sNSH1TextView);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31455g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.poa.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31455g.m70726a(this.f63853b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31451c(new C31449b(this)));
        this.f63760e = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31472x.class), new C31452d(lazy), new C31453e(lazy), function0);
        this.f63761f = "PROOF_OF_RESIDENCE";
        this.f63762g = Screen.PoaUploadScreen;
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70726a(C31455g c31455g) {
        Bundle arguments = c31455g.getArguments();
        return new C31447a(arguments != null ? (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null) : null, c31455g, c31455g.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31455g.getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g
    /* JADX INFO: renamed from: f */
    public final SNSCommonBottomSheetView mo70492f() {
        C28347l c28347l = (C28347l) getViewBinding();
        if (c28347l != null) {
            return c28347l.f57761i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        SNSCommonBottomSheetView sNSCommonBottomSheetView;
        SNSCommonBottomSheetView sNSCommonBottomSheetView2;
        C28347l c28347l = (C28347l) getViewBinding();
        if (c28347l != null && (sNSCommonBottomSheetView = c28347l.f57761i) != null && !sNSCommonBottomSheetView.isHidden()) {
            C28347l c28347l2 = (C28347l) getViewBinding();
            if (c28347l2 != null && (sNSCommonBottomSheetView2 = c28347l2.f57761i) != null) {
                sNSCommonBottomSheetView2.hide();
                return false;
            }
            return false;
        }
        return super.onFinishCalled(abstractC28503w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30823g, com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSFileItemView sNSFileItemView;
        super.onViewCreated(view, bundle);
        C32664o c32664o = this.f62261c;
        C28347l c28347l = (C28347l) getViewBinding();
        SNSFileItemView sNSFileItemView2 = null;
        if (c28347l != null) {
            sNSFileItemView = c28347l.f57757e;
        } else {
            sNSFileItemView = null;
        }
        C28347l c28347l2 = (C28347l) getViewBinding();
        if (c28347l2 != null) {
            sNSFileItemView2 = c28347l2.f57758f;
        }
        c32664o.m71288a(sNSFileItemView, sNSFileItemView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m70733a(final C31459k c31459k) {
        final C28347l c28347l = (C28347l) getViewBinding();
        if (c28347l != null) {
            c28347l.f57765m.setVisibility(0);
            c28347l.f57764l.setVisibility(0);
            c28347l.f57763k.setVisibility(0);
            c28347l.f57760h.setVisibility(8);
            c28347l.f57765m.setText(c31459k.f63769a);
            c28347l.f57764l.setText(c31459k.f63770b);
            c28347l.f57755c.setText(c31459k.f63778j);
            LinearLayout linearLayout = c28347l.f57756d;
            linearLayout.removeAllViews();
            List<CharSequence> list = c31459k.f63779k;
            if (list != null) {
                for (CharSequence charSequence : list) {
                    SNSSubtitle2TextView sNSSubtitle2TextView = new SNSSubtitle2TextView(requireContext(), null, 0, 0, 14, null);
                    sNSSubtitle2TextView.setText(charSequence);
                    Integer numM69174a = AbstractC28234b.m69174a(sNSSubtitle2TextView, SNSColorElement.CONTENT_STRONG);
                    sNSSubtitle2TextView.setTextColor(numM69174a != null ? numM69174a.intValue() : sNSSubtitle2TextView.getContext().getColor(R$color.sns_contentStrong));
                    linearLayout.addView(sNSSubtitle2TextView);
                }
            }
            c28347l.f57754b.setText(c31459k.f63775g);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.poa.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31455g.m70728a(this.f63757b, c31459k);
                }
            }, c28347l.f57754b);
            c28347l.f57754b.setEnabled(c31459k.f63776h);
            c28347l.f57762j.setText(c31459k.f63773e);
            c28347l.f57762j.setEnabled(c31459k.f63774f);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.poa.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31455g.m70729a(this.f63850b, c31459k, c28347l);
                }
            }, c28347l.f57762j);
            c28347l.f57759g.setText(c31459k.f63785q);
            C32663n c32663n = new C32663n(c31459k.f63782n, c31459k.f63783o, c31459k.f63780l, c31459k.f63781m, c31459k.f63786r, c31459k.f63787s, c31459k.f63784p);
            SNSFileItemView sNSFileItemView = c28347l.f57757e;
            C31458j c31458j = c31459k.f63771c;
            this.f62261c.m71287a(sNSFileItemView, c31458j.f63765a, c31458j.f63768d, c31458j.f63767c, c32663n);
            sNSFileItemView.setVisibility(0);
            sNSFileItemView.setEnabled(c31458j.f63766b);
            SNSFileItemView sNSFileItemView2 = c28347l.f57758f;
            C31458j c31458j2 = c31459k.f63772d;
            if (c31458j2 == null) {
                sNSFileItemView2.setVisibility(8);
                return;
            }
            this.f62261c.m71287a(sNSFileItemView2, c31458j2.f63765a, c31458j2.f63768d, c31458j2.f63767c, c32663n);
            sNSFileItemView2.setVisibility(0);
            sNSFileItemView2.setEnabled(c31458j2.f63766b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70728a(C31455g c31455g, C31459k c31459k) {
        C28367f.m69256a(c31455g.getAnalyticsDelegate(), Control.InfoButton, (Map) null, (Popup) null, 6);
        ((C31472x) c31455g.f63760e.getValue()).intent(c31459k.f63777i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70729a(C31455g c31455g, C31459k c31459k, C28347l c28347l) {
        C28367f.m69256a(c31455g.getAnalyticsDelegate(), Control.ContinueButton, (Map) null, (Popup) null, 6);
        if (c31459k.f63771c.f63765a != null) {
            ((C31472x) c31455g.f63760e.getValue()).intent(C30844u.f62290a);
        } else {
            ((AbstractC30808G) c31455g.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).intent(new C30843t(c28347l.f57762j.getId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m70734a(C31462n c31462n) {
        final C28347l c28347l = (C28347l) getViewBinding();
        if (c28347l != null) {
            View viewInflate = c28347l.f57761i.inflate(R$layout.sns_poa_examples_bottom_sheet);
            int i11 = R$id.sns_poa_examples_button;
            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSPrimaryButton != null) {
                i11 = R$id.sns_poa_examples_divider;
                if (((SNSBottomSheetHandleView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_poa_examples_scroller;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_poa_examples_scroller_content;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, i11);
                        if (linearLayout != null) {
                            sNSPrimaryButton.setText(c31462n.f63797g);
                            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.poa.a0
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C31455g.m70727a(this.f63750b, c28347l);
                                }
                            }, sNSPrimaryButton);
                            List list = c31462n.f63793c;
                            if (list != null && (!list.isEmpty())) {
                                linearLayout.addView(m70731a(c31462n.f63791a, c31462n.f63792b, SNSStepState.APPROVED));
                                Iterator it = c31462n.f63793c.iterator();
                                while (it.hasNext()) {
                                    linearLayout.addView(m70732a((C31461m) it.next()));
                                }
                            }
                            List list2 = c31462n.f63796f;
                            if (list2 != null && (!list2.isEmpty())) {
                                linearLayout.addView(m70731a(c31462n.f63794d, c31462n.f63795e, SNSStepState.REJECTED));
                                Iterator it2 = c31462n.f63796f.iterator();
                                while (it2.hasNext()) {
                                    linearLayout.addView(m70732a((C31461m) it2.next()));
                                }
                            }
                            c28347l.f57761i.setStateCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.poa.b0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C31455g.m70730a(this.f63753b, ((Boolean) obj).booleanValue());
                                }
                            });
                            c28347l.f57761i.show();
                            return;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70727a(C31455g c31455g, C28347l c28347l) {
        C28367f.m69257a(c31455g.getAnalyticsDelegate(), Screen.PoaInstructionsScreen, c31455g.f63761f, Control.DismissButton, null, 24);
        c28347l.f57761i.hide();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70730a(C31455g c31455g, boolean z11) {
        if (z11) {
            C28367f.m69259a(c31455g.getAnalyticsDelegate(), Screen.PoaInstructionsScreen, c31455g.f63761f, (Map) null, 12);
        } else {
            C28367f.m69258a(c31455g.getAnalyticsDelegate(), Screen.PoaInstructionsScreen, c31455g.f63761f, (LinkedHashMap) null, 12);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayout m70731a(CharSequence charSequence, String str, SNSStepState sNSStepState) {
        View viewInflate = getLayoutInflater().inflate(R$layout.sns_poa_examples_bottom_sheet_title, (ViewGroup) null, false);
        int i11 = R$id.sns_image;
        SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSImageView != null) {
            i11 = R$id.sns_title;
            SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSSubtitle1TextView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                sNSSubtitle1TextView.setText(charSequence);
                if (str != null) {
                    sNSImageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), str));
                }
                SNSStepViewExtensionsKt.setSnsStepState(sNSImageView, sNSStepState);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout m70732a(C31461m c31461m) {
        View viewInflate = getLayoutInflater().inflate(R$layout.sns_poa_examples_bottom_sheet_item, (ViewGroup) null, false);
        int i11 = R$id.sns_bullet;
        if (((SNSH2TextView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_subtitle;
            SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSBodyTextView != null) {
                i11 = R$id.sns_text;
                SNSBodyTextView sNSBodyTextView2 = (SNSBodyTextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSBodyTextView2 != null) {
                    i11 = R$id.sns_title;
                    SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSSubtitle2TextView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        Integer numM69174a = AbstractC28234b.m69174a(constraintLayout, SNSColorElement.CONTENT_STRONG);
                        if (numM69174a != null) {
                            sNSSubtitle2TextView.setTextColor(numM69174a.intValue());
                        }
                        AbstractC28458h.m69341a(sNSSubtitle2TextView, c31461m.f63788a);
                        if (numM69174a != null) {
                            sNSBodyTextView2.setTextColor(numM69174a.intValue());
                        }
                        AbstractC28458h.m69341a(sNSBodyTextView2, c31461m.f63790c);
                        Integer numM69174a2 = AbstractC28234b.m69174a(sNSBodyTextView, SNSColorElement.CONTENT_WEAK);
                        if (numM69174a2 != null) {
                            sNSBodyTextView.setTextColor(numM69174a2.intValue());
                        }
                        AbstractC28458h.m69341a(sNSBodyTextView, c31461m.f63789b);
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
