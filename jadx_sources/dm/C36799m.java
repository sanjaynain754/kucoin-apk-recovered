package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.m */
/* JADX INFO: compiled from: BkumexDialogDistributionRetentionBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36799m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80504a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f80505b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80506c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f80507d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f80508e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80509f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36799m m82459a(@NonNull View view) {
        int i11 = R$id.confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.desc;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.ivClose;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.quit;
                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton2 != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C36799m((ConstraintLayout) view, kcPrimaryButton, baseTextView, appCompatImageView, kcPrimaryButton2, baseTextView2);
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
        return this.f80504a;
    }

    public C36799m(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView2) {
        this.f80504a = constraintLayout;
        this.f80505b = kcPrimaryButton;
        this.f80506c = baseTextView;
        this.f80507d = appCompatImageView;
        this.f80508e = kcPrimaryButton2;
        this.f80509f = baseTextView2;
    }
}
