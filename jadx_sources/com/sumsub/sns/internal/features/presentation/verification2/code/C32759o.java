package com.sumsub.sns.internal.features.presentation.verification2.code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSLinkButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.databinding.C28355t;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28945b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/t;", "Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;", "Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtpInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/code/OtpInputFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Extensions.kt\ncom/sumsub/sns/internal/core/common/ExtensionsKt\n*L\n1#1,121:1\n106#2,15:122\n27#3,4:137\n256#4,2:141\n119#5:143\n133#5,3:144\n*S KotlinDebug\n*F\n+ 1 OtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/code/OtpInputFragment\n*L\n31#1:122,15\n27#1:137,4\n83#1:141,2\n108#1:143\n108#1:144,3\n*E\n"})
public final class C32759o extends AbstractC28058F<C28355t, C32761q, C32767w> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f67020U = 0;

    /* JADX INFO: renamed from: a */
    public final Lazy f67021a;

    /* JADX INFO: renamed from: b */
    public boolean f67022b;

    /* JADX INFO: renamed from: a */
    public static final void m71335a(C32759o c32759o, View view) {
        C32767w c32767w = (C32767w) c32759o.f67021a.getValue();
        String str = c32767w.f67060b;
        String type = c32767w.f67061c.getType();
        if (StringsKt.isBlank(str) || StringsKt.isBlank(type)) {
            return;
        }
        c32767w.showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c32767w), C41782z0.m91392b(), null, new C32765u(c32767w, null, c32767w, type, str), 2, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65169b() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32767w) this.f67021a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71336a((C32761q) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_verify_code2, viewGroup, false);
        int i11 = R$id.sns_guideline_end;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_guideline_start;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_otp_error;
                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSSubtitle2TextView != null) {
                    i11 = R$id.sns_pin_code;
                    SNSPinView sNSPinView = (SNSPinView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSPinView != null) {
                        i11 = R$id.sns_resend_verification_code;
                        SNSLinkButton sNSLinkButton = (SNSLinkButton) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSLinkButton != null) {
                            i11 = R$id.sns_subtitle;
                            SNSSubtitle2TextView sNSSubtitle2TextView2 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSSubtitle2TextView2 != null) {
                                i11 = R$id.sns_title;
                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewInflate, i11);
                                if (sNSH1TextView != null) {
                                    i11 = R$id.sns_toolbar;
                                    if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                        return new C28355t((ConstraintLayout) viewInflate, sNSSubtitle2TextView, sNSPinView, sNSLinkButton, sNSSubtitle2TextView2, sNSH1TextView);
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

    public C32759o() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.code.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32759o.m71334a(this.f67069b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32755k(new C32754j(this)));
        this.f67021a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32767w.class), new C32756l(lazy), new C32757m(lazy), function0);
        this.f67022b = true;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66531c() {
        Bundle arguments = getArguments();
        C28945b c28945b = null;
        if (arguments != null) {
            c28945b = (C28945b) AbstractC28437b.m69320a(arguments, "otp_screen", C28945b.class, null);
        }
        if (c28945b != null) {
            int i11 = AbstractC32750f.f67008a[c28945b.f58849b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "PHONE_VERIFICATION";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "EMAIL_VERIFICATION";
        }
        throw new IllegalArgumentException("OtpInputFragment requires CodeInput in arguments");
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC28421U.m69305b(((C32767w) this.f67021a.getValue()).f67066h, getViewLifecycleOwner(), new C32752h(this, null));
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71334a(C32759o c32759o) {
        Bundle arguments = c32759o.getArguments();
        C28945b c28945b = arguments != null ? (C28945b) AbstractC28437b.m69320a(arguments, "otp_screen", C28945b.class, null) : null;
        if (c28945b != null) {
            return new C32768x(c32759o, c28945b);
        }
        throw new IllegalArgumentException("OtpInputFragment requires CodeInput in arguments");
    }

    /* JADX INFO: renamed from: a */
    public final void m71336a(C32761q c32761q) {
        C28355t viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        if (this.f67022b) {
            this.f67022b = false;
            AbstractC28458h.m69356f(viewBinding.f57793c);
        }
        SNSH1TextView sNSH1TextView = viewBinding.f57796f;
        CharSequence charSequence = c32761q.f67024a;
        sNSH1TextView.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        SNSSubtitle2TextView sNSSubtitle2TextView = viewBinding.f57795e;
        CharSequence charSequence2 = c32761q.f67025b;
        sNSSubtitle2TextView.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null);
        viewBinding.f57793c.setItemCount(c32761q.f67026c);
        viewBinding.f57793c.setOnTextCompleteListener(new C32751g(this, viewBinding));
        viewBinding.f57792b.setText(c32761q.f67030g);
        viewBinding.f57792b.setVisibility(c32761q.f67030g != null ? 0 : 8);
        viewBinding.f57793c.setError(c32761q.f67030g != null);
        if (c32761q.f67027d != null) {
            viewBinding.f57794d.setEnabled(false);
            viewBinding.f57794d.setText(c32761q.f67027d);
            viewBinding.f57794d.setOnClickListener(null);
        } else if (c32761q.f67029f) {
            viewBinding.f57794d.setEnabled(true);
            viewBinding.f57794d.setText(c32761q.f67028e);
            viewBinding.f57794d.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification2.code.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32759o.m71335a(this.f67019b, view);
                }
            });
        } else {
            viewBinding.f57794d.setEnabled(false);
            viewBinding.f57794d.setText(c32761q.f67028e);
            viewBinding.f57794d.setOnClickListener(null);
        }
        viewBinding.f57793c.requestFocus();
    }
}
