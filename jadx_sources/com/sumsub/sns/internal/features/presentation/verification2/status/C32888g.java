package com.sumsub.sns.internal.features.presentation.verification2.status;

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
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28354s;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28927k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28947d;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28951h;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28954k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.InterfaceC28952i;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.presentation.verification2.host.AbstractC32816L;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.status.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/status/g;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/s;", "Lcom/sumsub/sns/internal/features/presentation/verification2/status/i;", "Lcom/sumsub/sns/internal/features/presentation/verification2/status/k;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVerificationResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationResultFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/status/VerificationResultFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n106#2,15:83\n27#3,4:98\n256#4,2:102\n256#4,2:104\n*S KotlinDebug\n*F\n+ 1 VerificationResultFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/status/VerificationResultFragment\n*L\n31#1:83,15\n27#1:98,4\n61#1:102,2\n68#1:104,2\n*E\n"})
public final class C32888g extends AbstractC28058F<C28354s, C32890i, C32892k> {

    /* JADX INFO: renamed from: a */
    public final Lazy f67285a;

    /* JADX INFO: renamed from: a */
    public static final void m71364a(C32888g c32888g, View view) {
        InterfaceC28952i interfaceC28952i;
        C32814J c32814j = (C32814J) ((C32892k) c32888g.f67285a.getValue()).f67292a;
        C28927k c28927k = c32814j.f58833c;
        int i11 = AbstractC32816L.f67159a[c32814j.f67148d.ordinal()];
        if (i11 == 1) {
            interfaceC28952i = C28947d.f58850a;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC28952i = C28951h.f58855a;
        }
        c28927k.m69693a(interfaceC28952i);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65911a() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32892k) this.f67285a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71365a((C32890i) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_verification_status2, viewGroup, false);
        int i11 = R$id.sns_guideline_center;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_guideline_end;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_guideline_start;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_primary_button;
                    SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSPrimaryButton != null) {
                        i11 = R$id.sns_status_comment;
                        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSubtitle2TextView != null) {
                            i11 = R$id.sns_status_icon;
                            SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(viewInflate, i11);
                            if (sNSImageView != null) {
                                i11 = R$id.sns_toolbar;
                                if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                    return new C28354s((ConstraintLayout) viewInflate, sNSPrimaryButton, sNSSubtitle2TextView, sNSImageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C32888g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.status.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32888g.m71363a(this.f67284b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32884c(new C32883b(this)));
        this.f67285a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32892k.class), new C32885d(lazy), new C32886e(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65912b() {
        Bundle arguments = getArguments();
        C28954k c28954k = null;
        if (arguments != null) {
            c28954k = (C28954k) AbstractC28437b.m69320a(arguments, "result_screen", C28954k.class, null);
        }
        if (c28954k != null) {
            int i11 = AbstractC32882a.f67279a[c28954k.f58857b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "PHONE_VERIFICATION";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "EMAIL_VERIFICATION";
        }
        throw new IllegalArgumentException("VerificationResultFragment requires Status in arguments");
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71363a(C32888g c32888g) {
        Bundle arguments = c32888g.getArguments();
        C28954k c28954k = arguments != null ? (C28954k) AbstractC28437b.m69320a(arguments, "result_screen", C28954k.class, null) : null;
        if (c28954k != null) {
            return new C32893l(c32888g, c28954k);
        }
        throw new IllegalArgumentException("VerificationResultFragment requires Status in arguments");
    }

    /* JADX INFO: renamed from: a */
    public final void m71365a(C32890i c32890i) {
        C28354s viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        SNSStepViewExtensionsKt.setSnsStepState(viewBinding.f57790d, c32890i.f67289d ? SNSStepState.REJECTED : SNSStepState.APPROVED);
        viewBinding.f57790d.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c32890i.f67287b));
        viewBinding.f57789c.setText(c32890i.f67286a);
        if (c32890i.f67288c != null) {
            viewBinding.f57788b.setVisibility(0);
            viewBinding.f57788b.setText(c32890i.f67288c);
            viewBinding.f57788b.setEnabled(true);
            viewBinding.f57788b.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification2.status.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32888g.m71364a(this.f67297b, view);
                }
            });
            return;
        }
        viewBinding.f57788b.setVisibility(8);
    }
}
