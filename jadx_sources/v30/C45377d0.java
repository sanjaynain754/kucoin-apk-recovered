package v30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.d0 */
/* JADX INFO: compiled from: KucoinDelegationGuideTradeLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45377d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102040a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f102041b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f102042c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102043d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102044e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45377d0 m100284a(@NonNull View view) {
        int i11 = R$id.btnGuideTrade;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivEmptyIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tvAvailableAmount;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvTradeMinAmountGuide;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C45377d0((ConstraintLayout) view, kcPrimaryButton, imageView, baseTextView, baseTextView2);
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
        return this.f102040a;
    }

    public C45377d0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f102040a = constraintLayout;
        this.f102041b = kcPrimaryButton;
        this.f102042c = imageView;
        this.f102043d = baseTextView;
        this.f102044e = baseTextView2;
    }
}
