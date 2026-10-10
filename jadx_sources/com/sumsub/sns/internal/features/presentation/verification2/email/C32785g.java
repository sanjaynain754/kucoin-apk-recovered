package com.sumsub.sns.internal.features.presentation.verification2.email;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
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
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28356u;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28945b;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32828l;
import java.util.regex.Pattern;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/u;", "Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;", "Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmailVerificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/email/EmailVerificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n106#2,15:95\n49#3:110\n65#3,16:111\n93#3,3:127\n256#4,2:130\n*S KotlinDebug\n*F\n+ 1 EmailVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/email/EmailVerificationFragment\n*L\n24#1:95,15\n38#1:110\n38#1:111,16\n38#1:127,3\n76#1:130,2\n*E\n"})
public final class C32785g extends AbstractC28058F<C28356u, C32794p, C32774D> {

    /* JADX INFO: renamed from: a */
    public final Lazy f67090a;

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71339a(C32785g c32785g) {
        return new C32775E(c32785g);
    }

    /* JADX INFO: renamed from: a */
    public final void m71343a(final C32794p c32794p) {
        Editable text;
        Editable text2;
        C28356u viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        SNSH1TextView sNSH1TextView = viewBinding.f57803g;
        CharSequence charSequence = c32794p.f67102a;
        sNSH1TextView.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        SNSSubtitle2TextView sNSSubtitle2TextView = viewBinding.f57802f;
        CharSequence charSequence2 = c32794p.f67103b;
        sNSSubtitle2TextView.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null);
        viewBinding.f57798b.setError(c32794p.f67104c.f67100c);
        viewBinding.f57798b.setEnabled(!c32794p.f67104c.f67101d);
        CharSequence charSequence3 = c32794p.f67104c.f67098a;
        if (charSequence3 != null && (!StringsKt.isBlank(charSequence3)) && ((text2 = viewBinding.f57799c.getText()) == null || StringsKt.isBlank(text2))) {
            viewBinding.f57799c.setText(c32794p.f67104c.f67098a);
            viewBinding.f57799c.setSelection(c32794p.f67104c.f67098a.length());
        }
        viewBinding.f57799c.setHint(c32794p.f67104c.f67099b);
        viewBinding.f57799c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sumsub.sns.internal.features.presentation.verification2.email.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return C32785g.m71342a(c32794p, this, textView, i11, keyEvent);
            }
        });
        if (!c32794p.f67104c.f67101d && ((text = viewBinding.f57799c.getText()) == null || StringsKt.isBlank(text))) {
            AbstractC28458h.m69356f(viewBinding.f57799c);
        } else if (c32794p.f67104c.f67101d) {
            SNSTextInputEditText sNSTextInputEditText = viewBinding.f57799c;
            ((InputMethodManager) sNSTextInputEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(sNSTextInputEditText.getWindowToken(), 0);
        }
        AbstractC28458h.m69341a(viewBinding.f57800d, c32794p.f67105d);
        viewBinding.f57800d.setVisibility(c32794p.f67105d == null ? 8 : 0);
        AbstractC28485q.m69381a(viewBinding.f57800d, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.verification2.email.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32785g.m71340a((String) obj);
            }
        });
        viewBinding.f57801e.setText(c32794p.f67106e.f67094a);
        viewBinding.f57801e.setEnabled(c32794p.f67106e.f67095b);
        viewBinding.f57801e.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification2.email.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C32785g.m71341a(this.f67083b, view);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66531c() {
        return "EMAIL_VERIFICATION";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65169b() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32774D) this.f67090a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m71343a((C32794p) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_verify_email2, viewGroup, false);
        int i11 = R$id.sns_email;
        SNSTextInputLayout sNSTextInputLayout = (SNSTextInputLayout) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSTextInputLayout != null) {
            i11 = R$id.sns_email_id;
            SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSTextInputEditText != null) {
                i11 = R$id.sns_footer;
                SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSCaptionTextView != null) {
                    i11 = R$id.sns_guideline_end;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_guideline_start;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
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
                                            return new C28356u((ConstraintLayout) viewInflate, sNSTextInputLayout, sNSTextInputEditText, sNSCaptionTextView, sNSPrimaryButton, sNSSubtitle2TextView, sNSH1TextView);
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

    public C32785g() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.email.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32785g.m71339a(this.f67085b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32780c(new C32778b(this)));
        this.f67090a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32774D.class), new C32782d(lazy), new C32783e(lazy), function0);
    }

    /* JADX INFO: renamed from: f */
    public final void m71344f() {
        C28356u viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57801e.setEnabled(false);
        }
        C32774D c32774d = (C32774D) this.f67090a.getValue();
        String str = (String) c32774d.f67078c.getValue();
        if (str != null) {
            if (!Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches()) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(c32774d), null, null, new C32798t(c32774d, null), 3, null);
            } else {
                C32814J c32814j = (C32814J) c32774d.f67076a;
                c32814j.f67154j.m71346a(C32828l.f67176a);
                c32814j.f58833c.m69697b(new C28945b(str, c32814j.f67148d));
            }
        }
        C28356u viewBinding2 = getViewBinding();
        if (viewBinding2 != null) {
            AbstractC28458h.m69339a((View) viewBinding2.f57799c);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C28356u viewBinding = getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57799c.addTextChangedListener(new C32776a(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71340a(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71341a(C32785g c32785g, View view) {
        c32785g.m71344f();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71342a(C32794p c32794p, C32785g c32785g, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 || !c32794p.f67106e.f67095b) {
            return false;
        }
        c32785g.m71344f();
        return true;
    }
}
