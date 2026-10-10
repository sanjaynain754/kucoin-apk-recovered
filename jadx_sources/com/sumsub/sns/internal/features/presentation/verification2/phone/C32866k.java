package com.sumsub.sns.internal.features.presentation.verification2.phone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28357v;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/v;", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;", "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPhoneVerificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/phone/PhoneVerificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n106#2,15:71\n256#3,2:86\n*S KotlinDebug\n*F\n+ 1 PhoneVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/phone/PhoneVerificationFragment\n*L\n20#1:71,15\n52#1:86,2\n*E\n"})
public final class C32866k extends AbstractC28058F<C28357v, C32873r, C32847F> {

    /* JADX INFO: renamed from: a */
    public final Lazy f67246a;

    /* JADX INFO: renamed from: a */
    public final void m71362a(C32873r c32873r) {
        C28357v viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        viewBinding.f57809f.setText(c32873r.f67253a);
        viewBinding.f57808e.setText(c32873r.f67254b);
        AbstractC28458h.m69341a(viewBinding.f57805b, c32873r.f67255c);
        viewBinding.f57805b.setVisibility(c32873r.f67255c != null ? 0 : 8);
        AbstractC28485q.m69381a(viewBinding.f57805b, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32866k.m71358a((String) obj);
            }
        });
        SNSPrimaryButton sNSPrimaryButton = viewBinding.f57807d;
        C32870o c32870o = c32873r.f67256d;
        sNSPrimaryButton.setText(c32870o != null ? c32870o.f67250a : null);
        SNSPrimaryButton sNSPrimaryButton2 = viewBinding.f57807d;
        C32870o c32870o2 = c32873r.f67256d;
        sNSPrimaryButton2.setEnabled(c32870o2 != null ? c32870o2.f67251b : false);
        AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32866k.m71357a(this.f67242b);
            }
        }, viewBinding.f57807d);
    }

    /* JADX INFO: renamed from: b */
    public static final C32853c m71359b(C32866k c32866k) {
        return ((C32847F) c32866k.f67246a.getValue()).f67209e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final Unit m71360c(C32866k c32866k) {
        C32847F c32847f = (C32847F) c32866k.f67246a.getValue();
        C32849a c32849a = (C32849a) c32847f.f67209e.f67225k.getValue();
        if (c32849a != null) {
            ((C32814J) c32847f.f67205a).m71349b(c32849a.f67214a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final ViewModelProvider.Factory m71361d(C32866k c32866k) {
        return new C32848G(c32866k);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65912b() {
        return "PHONE_VERIFICATION";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65911a() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32847F) this.f67246a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71362a((C32873r) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_verify_phone2, viewGroup, false);
        int i11 = R$id.sns_footer;
        SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSCaptionTextView != null) {
            i11 = R$id.sns_guideline_end;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_guideline_start;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_phone;
                    if (((SNSFlaggedInputLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_phone_id;
                        SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSTextInputEditText != null) {
                            i11 = R$id.sns_primary_button;
                            SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSPrimaryButton != null) {
                                i11 = R$id.sns_subtitle;
                                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSSubtitle2TextView != null) {
                                    i11 = R$id.sns_title;
                                    SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                    if (sNSH1TextView != null) {
                                        i11 = R$id.sns_toolbar;
                                        if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                            return new C28357v((ConstraintLayout) viewInflate, sNSCaptionTextView, sNSTextInputEditText, sNSPrimaryButton, sNSSubtitle2TextView, sNSH1TextView);
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

    public C32866k() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32866k.m71361d(this.f67227b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32861g(new C32859f(this)));
        this.f67246a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32847F.class), new C32863h(lazy), new C32864i(lazy), function0);
        new C32857e(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32866k.m71359b(this.f67229b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32866k.m71360c(this.f67239b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71358a(String str) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Unit m71357a(C32866k c32866k) {
        C28357v viewBinding = c32866k.getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57807d.setEnabled(false);
        }
        C32847F c32847f = (C32847F) c32866k.f67246a.getValue();
        C32849a c32849a = (C32849a) c32847f.f67209e.f67225k.getValue();
        if (c32849a != null) {
            ((C32814J) c32847f.f67205a).m71349b(c32849a.f67214a);
        }
        C28357v viewBinding2 = c32866k.getViewBinding();
        if (viewBinding2 != null) {
            AbstractC28458h.m69339a((View) viewBinding2.f57806c);
        }
        return Unit.INSTANCE;
    }
}
