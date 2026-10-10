package p206dp;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dp.c */
/* JADX INFO: compiled from: BmarginDialogMarginAgreementBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36905c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81598a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81599b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f81600c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f81601d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81602e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81603f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81604g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36905c m82679a(@NonNull View view) {
        int i11 = R$id.ivCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvCancel;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.tvConfirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tvContent;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvTip;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C36905c((ConstraintLayout) view, imageView, kcSecondaryButton, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3);
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
    public ConstraintLayout getRoot() {
        return this.f81598a;
    }

    public C36905c(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81598a = constraintLayout;
        this.f81599b = imageView;
        this.f81600c = kcSecondaryButton;
        this.f81601d = kcPrimaryButton;
        this.f81602e = baseTextView;
        this.f81603f = baseTextView2;
        this.f81604g = baseTextView3;
    }
}
