package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.t2 */
/* JADX INFO: compiled from: PaymentP2pFragmentFallbackBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37689t2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84669a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84670b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84671c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f84672d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f84673e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84674f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37689t2 m84969a(@NonNull View view) {
        int i11 = R$id.ivStatus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvDescription;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvFastTrade;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tvHistoryOrder;
                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton2 != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C37689t2((ConstraintLayout) view, imageView, baseTextView, kcPrimaryButton, kcPrimaryButton2, baseTextView2);
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
        return this.f84669a;
    }

    public C37689t2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView2) {
        this.f84669a = constraintLayout;
        this.f84670b = imageView;
        this.f84671c = baseTextView;
        this.f84672d = kcPrimaryButton;
        this.f84673e = kcPrimaryButton2;
        this.f84674f = baseTextView2;
    }
}
