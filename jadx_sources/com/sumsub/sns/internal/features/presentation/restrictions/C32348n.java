package com.sumsub.sns.internal.features.presentation.restrictions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28349n;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/restrictions/n;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/n;", "Lcom/sumsub/sns/internal/features/presentation/restrictions/t;", "Lcom/sumsub/sns/internal/features/presentation/restrictions/C;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSRestrictionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSRestrictionsFragment.kt\ncom/sumsub/sns/internal/features/presentation/restrictions/SNSRestrictionsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,85:1\n106#2,15:86\n256#3,2:101\n*S KotlinDebug\n*F\n+ 1 SNSRestrictionsFragment.kt\ncom/sumsub/sns/internal/features/presentation/restrictions/SNSRestrictionsFragment\n*L\n29#1:86,15\n64#1:101,2\n*E\n"})
public final class C32348n extends AbstractC28058F<C28349n, AbstractC32354t, C32333C> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f65910U = 0;

    /* JADX INFO: renamed from: a */
    public final Screen f65911a = Screen.RestrictionsScreen;

    /* JADX INFO: renamed from: b */
    public final String f65912b = "Status";

    /* JADX INFO: renamed from: c */
    public final Lazy f65913c;

    /* JADX INFO: renamed from: a */
    public static final void m71102a(C32348n c32348n, C32349o c32349o, View view) {
        ((C32333C) c32348n.f65913c.getValue()).intent(c32349o.f65915b);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF66519e() {
        return this.f65912b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF63626a() {
        return this.f65911a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32333C) this.f65913c.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        AbstractC32354t abstractC32354t = (AbstractC32354t) abstractC28081V;
        C28349n viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        if (!(abstractC32354t instanceof C32353s)) {
            throw new NoWhenBranchMatchedException();
        }
        C32353s c32353s = (C32353s) abstractC32354t;
        viewBinding.f57772d.setText(c32353s.f65918a);
        viewBinding.f57771c.setText(c32353s.f65919b);
        viewBinding.f57770b.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c32353s.f65920c.getImageName()));
        m71103a(viewBinding.f57773e, c32353s.f65921d);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_restrictions, viewGroup, false);
        int i11 = R$id.sns_error_icon;
        SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSImageView != null) {
            i11 = R$id.sns_error_subtitle;
            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSSubtitle2TextView != null) {
                i11 = R$id.sns_error_title;
                SNSH2TextView sNSH2TextView = (SNSH2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSH2TextView != null) {
                    i11 = R$id.sns_guideline_end;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_guideline_start;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                            i11 = R$id.sns_primary_button;
                            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSPrimaryButton != null) {
                                i11 = R$id.sns_toolbar;
                                if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                    return new C28349n((SNSBackgroundConstraintLayout) viewInflate, sNSImageView, sNSSubtitle2TextView, sNSH2TextView, sNSPrimaryButton);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C32348n() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.restrictions.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32348n.m71101a(this.f65892b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32344j(new C32343i(this)));
        this.f65913c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32333C.class), new C32345k(lazy), new C32346l(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSImageView sNSImageView;
        super.onViewCreated(view, bundle);
        C28349n viewBinding = getViewBinding();
        if (viewBinding != null && (sNSImageView = viewBinding.f57770b) != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageView, SNSStepState.REJECTED);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71101a(C32348n c32348n) {
        return new C32342h(c32348n, c32348n.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c32348n.getArguments(), c32348n.getAppListener$idensic_mobile_sdk_aar_defaultRelease(), c32348n.f65912b);
    }

    /* JADX INFO: renamed from: a */
    public final void m71103a(SNSPrimaryButton sNSPrimaryButton, final C32349o c32349o) {
        sNSPrimaryButton.setVisibility(0);
        sNSPrimaryButton.setText(c32349o.f65914a);
        sNSPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.restrictions.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C32348n.m71102a(this.f65908b, c32349o, view);
            }
        });
    }
}
