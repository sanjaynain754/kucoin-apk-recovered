package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.PasswordStrengthView;

/* JADX INFO: renamed from: c70.q */
/* JADX INFO: compiled from: BusercenterFragmentSubimitSignupBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4891q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5276a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4870f0 f5277b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f5278c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final PasswordStrengthView f5279d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f5280e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f5281f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5282g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4891q m5061a(@NonNull View view) {
        int i11 = R$id.bindingPwd;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4870f0 c4870f0M5018a = C4870f0.m5018a(viewFindChildViewById);
            i11 = R$id.btnConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.passwordStrengthView;
                PasswordStrengthView passwordStrengthView = (PasswordStrengthView) ViewBindings.findChildViewById(view, i11);
                if (passwordStrengthView != null) {
                    i11 = R$id.tvPwdRule1;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvPwdRule2;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvPwdRule3;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C4891q((LinearLayoutCompat) view, c4870f0M5018a, kcPrimaryButton, passwordStrengthView, baseTextView, baseTextView2, baseTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5276a;
    }

    public C4891q(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C4870f0 c4870f0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull PasswordStrengthView passwordStrengthView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5276a = linearLayoutCompat;
        this.f5277b = c4870f0;
        this.f5278c = kcPrimaryButton;
        this.f5279d = passwordStrengthView;
        this.f5280e = baseTextView;
        this.f5281f = baseTextView2;
        this.f5282g = baseTextView3;
    }
}
