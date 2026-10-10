package com.sumsub.sns.internal.features.presentation.consent;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28338c;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.features.presentation.country.AbstractC30878c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.C30915a;
import java.util.List;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/consent/f;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/c;", "Lcom/sumsub/sns/internal/features/presentation/consent/n;", "Lcom/sumsub/sns/internal/features/presentation/consent/u;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSAgreementSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAgreementSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/consent/SNSAgreementSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,188:1\n106#2,15:189\n277#3,2:204\n256#3,2:213\n298#3,2:215\n1878#4,3:206\n53#5,4:209\n*S KotlinDebug\n*F\n+ 1 SNSAgreementSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/consent/SNSAgreementSelectorFragment\n*L\n34#1:189,15\n112#1:204,2\n169#1:213,2\n171#1:215,2\n124#1:206,3\n164#1:209,4\n*E\n"})
public final class C30855f extends AbstractC28058F<C28338c, C30863n, C30870u> {

    /* JADX INFO: renamed from: a */
    public final Lazy f62315a;

    /* JADX INFO: renamed from: b */
    public final String f62316b;

    /* JADX INFO: renamed from: c */
    public List f62317c;

    /* JADX INFO: renamed from: a */
    public static final void m70496a(C30855f c30855f, C30857h c30857h, CompoundButton compoundButton, boolean z11) {
        if (z11) {
            ((C30870u) c30855f.f62315a.getValue()).intent(new C30859j(c30857h.f62320a));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70497b(C30855f c30855f) {
        return new C30871v(c30855f, c30855f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30855f.getArguments());
    }

    /* JADX INFO: renamed from: b */
    public final void m70499b(C30863n c30863n) {
        C28338c viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57698d.setText(c30863n.f62329d);
            viewBinding.f57696b.setText(c30863n.f62330e);
            viewBinding.f57701g.setText(c30863n.f62327b);
            AbstractC28458h.m69341a(viewBinding.f57700f, c30863n.f62328c);
            AbstractC28485q.m69381a(viewBinding.f57696b, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.consent.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30855f.m70495a(this.f62368b, (String) obj);
                }
            });
            viewBinding.f57698d.setEnabled(c30863n.f62326a != null);
            viewBinding.f57696b.setVisibility(c30863n.f62326a == null ? 4 : 0);
            viewBinding.f57696b.setGravity(c30863n.f62332g ? GravityCompat.START : 1);
        }
        m70498a(c30863n);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF63628c() {
        return this.f62316b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30870u) this.f62315a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C30862m)) {
            if (!(interfaceC28145r instanceof C30856g)) {
                super.handleEvent(interfaceC28145r);
                return;
            } else {
                C30856g c30856g = (C30856g) interfaceC28145r;
                C28367f.m69257a(getAnalyticsDelegate(), getF63626a(), this.f62316b, Control.AcceptButton, MapsKt.mapOf(TuplesKt.m90091to("agreementCountry", c30856g.f62318a), TuplesKt.m90091to("agreementTitleKey", c30856g.f62319b)), 16);
                return;
            }
        }
        String str = ((C30862m) interfaceC28145r).f62325a;
        C30915a c30915a = new C30915a();
        Bundle bundle = new Bundle();
        bundle.putString("ARGS_DATA", str);
        c30915a.setArguments(bundle);
        c30915a.show(getChildFragmentManager(), "TermsAndConditionsBottomSheet");
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m70499b((C30863n) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!(abstractC28503w instanceof C28497u)) {
            return super.onFinishCalled(abstractC28503w);
        }
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, new C28500v(), null, null, 6, null);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_agreement_selector, viewGroup, false);
        int i11 = R$id.sns_barrier_start;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_footer;
            SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSBodyTextView != null) {
                i11 = R$id.sns_guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i11 = R$id.sns_powered))) != null) {
                            i11 = R$id.sns_primary_button;
                            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSPrimaryButton != null) {
                                i11 = R$id.sns_radiogroup;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(viewInflate, i11);
                                if (radioGroup != null) {
                                    i11 = R$id.sns_scroller;
                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        i11 = R$id.sns_subtitle;
                                        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                        if (sNSSubtitle2TextView != null) {
                                            i11 = R$id.sns_title;
                                            SNSH2TextView sNSH2TextView = (SNSH2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                            if (sNSH2TextView != null) {
                                                i11 = R$id.sns_toolbar;
                                                if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                                    return new C28338c((SNSBackgroundConstraintLayout) viewInflate, sNSBodyTextView, imageView, sNSPrimaryButton, radioGroup, sNSSubtitle2TextView, sNSH2TextView);
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

    public C30855f() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.consent.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30855f.m70497b(this.f62369b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30851b(new C30850a(this)));
        this.f62315a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30870u.class), new C30852c(lazy), new C30853d(lazy), function0);
        this.f62316b = "Agreements";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62317c = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C28338c viewBinding = getViewBinding();
        if (viewBinding != null) {
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.consent.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30855f.m70494a(this.f62314b);
                }
            }, viewBinding.f57698d);
            viewBinding.f57697c.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.PICTURE_AGREEMENT.getImageName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70495a(C30855f c30855f, String str) {
        ((C30870u) c30855f.f62315a.getValue()).intent(new C30860k(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70494a(C30855f c30855f) {
        ((C30870u) c30855f.f62315a.getValue()).intent(C30858i.f62322a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70498a(C30863n c30863n) {
        RadioGroup radioGroup;
        RadioGroup radioGroup2;
        RadioGroup radioGroup3;
        Drawable drawableM70503a;
        RadioGroup radioGroup4;
        RadioGroup radioGroup5;
        if (Intrinsics.areEqual(this.f62317c, c30863n.f62331f)) {
            return;
        }
        if (c30863n.f62331f.size() > 1) {
            C28338c viewBinding = getViewBinding();
            if (viewBinding != null && (radioGroup5 = viewBinding.f57699e) != null) {
                radioGroup5.removeAllViews();
            }
            int i11 = 0;
            for (Object obj : c30863n.f62331f) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final C30857h c30857h = (C30857h) obj;
                C30877b c30877b = c30857h.f62321b;
                SNSCardRadioButton sNSCardRadioButton = new SNSCardRadioButton(requireContext(), null, 0, 0, null, 30, null);
                sNSCardRadioButton.setText(c30877b.f62374b);
                sNSCardRadioButton.setTag(Integer.valueOf(c30857h.f62320a));
                if (c30877b.f62373a.length() == 0) {
                    drawableM70503a = C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.COUNTRY_OTHER.getImageName());
                } else {
                    drawableM70503a = AbstractC30878c.m70503a(c30877b, requireContext());
                }
                SNSCardRadioButton.setStartDrawable$default(sNSCardRadioButton, drawableM70503a, false, 2, null);
                sNSCardRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.internal.features.presentation.consent.y
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        C30855f.m70496a(this.f62370b, c30857h, compoundButton, z11);
                    }
                });
                C28338c viewBinding2 = getViewBinding();
                if (viewBinding2 != null && (radioGroup4 = viewBinding2.f57699e) != null) {
                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small_plus));
                    Unit unit = Unit.INSTANCE;
                    radioGroup4.addView(sNSCardRadioButton, layoutParams);
                }
                i11 = i12;
            }
            C28338c viewBinding3 = getViewBinding();
            if (viewBinding3 != null && (radioGroup3 = viewBinding3.f57699e) != null) {
                int childCount = radioGroup3.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = radioGroup3.getChildAt(i13);
                    SNSCardRadioButton sNSCardRadioButton2 = childAt instanceof SNSCardRadioButton ? (SNSCardRadioButton) childAt : null;
                    if (sNSCardRadioButton2 != null) {
                        sNSCardRadioButton2.setChecked(Intrinsics.areEqual(sNSCardRadioButton2.getTag(), c30863n.f62326a));
                    }
                }
            }
            C28338c viewBinding4 = getViewBinding();
            if (viewBinding4 != null && (radioGroup2 = viewBinding4.f57699e) != null) {
                radioGroup2.setVisibility(0);
            }
        } else {
            C28338c viewBinding5 = getViewBinding();
            if (viewBinding5 != null && (radioGroup = viewBinding5.f57699e) != null) {
                radioGroup.setVisibility(8);
            }
        }
        this.f62317c = c30863n.f62331f;
    }
}
