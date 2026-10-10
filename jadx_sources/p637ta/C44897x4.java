package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.x4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawForbiddenBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44897x4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101135a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f101136b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101137c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101138d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101139e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101140f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44897x4 m99318a(@NonNull View view) {
        int i11 = R$id.contact_helper;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.flag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tv_24h_description;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_time;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tv_tips;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C44897x4((ConstraintLayout) view, kcPrimaryButton, imageView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f101135a;
    }

    public C44897x4(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f101135a = constraintLayout;
        this.f101136b = kcPrimaryButton;
        this.f101137c = imageView;
        this.f101138d = baseTextView;
        this.f101139e = baseTextView2;
        this.f101140f = baseTextView3;
    }
}
