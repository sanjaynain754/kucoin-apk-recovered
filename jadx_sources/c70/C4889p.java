package c70;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.p */
/* JADX INFO: compiled from: BusercenterFragmentSignupResultBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4889p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5266a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5267b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f5268c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f5269d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f5270e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f5271f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4889p m5057a(@NonNull View view) {
        int i11 = R$id.btnGotoKyc;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.guideLinePercent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
            if (guideline != null) {
                i11 = R$id.signupResultTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.signupRewardDesc;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.signupSuccessLottieView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            return new C4889p((ConstraintLayout) view, kcPrimaryButton, guideline, baseTextView, baseTextView2, imageView);
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
    public ConstraintLayout getRoot() {
        return this.f5266a;
    }

    public C4889p(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull Guideline guideline, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ImageView imageView) {
        this.f5266a = constraintLayout;
        this.f5267b = kcPrimaryButton;
        this.f5268c = guideline;
        this.f5269d = baseTextView;
        this.f5270e = baseTextView2;
        this.f5271f = imageView;
    }
}
