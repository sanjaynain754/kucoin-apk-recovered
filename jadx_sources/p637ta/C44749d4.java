package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.d4 */
/* JADX INFO: compiled from: KucoinAssetWithdrawFreezeDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44749d4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99744a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99745b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99746c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99747d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AlignTopTextView f99748e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcPrimaryButton f99749f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlignTopTextView f99750g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99751h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcSecondaryButton f99752i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44749d4 m99012a(@NonNull View view) {
        int i11 = R$id.iv_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_withdraw_result;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ll_info;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.tv_contact_customer_service;
                    AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                    if (alignTopTextView != null) {
                        i11 = R$id.tv_determine;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            i11 = R$id.tv_info;
                            AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                            if (alignTopTextView2 != null) {
                                i11 = R$id.tv_title;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_view_detail;
                                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcSecondaryButton != null) {
                                        return new C44749d4((ConstraintLayout) view, imageView, imageView2, linearLayout, alignTopTextView, kcPrimaryButton, alignTopTextView2, baseTextView, kcSecondaryButton);
                                    }
                                }
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
        return this.f99744a;
    }

    public C44749d4(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull AlignTopTextView alignTopTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlignTopTextView alignTopTextView2, @NonNull BaseTextView baseTextView, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f99744a = constraintLayout;
        this.f99745b = imageView;
        this.f99746c = imageView2;
        this.f99747d = linearLayout;
        this.f99748e = alignTopTextView;
        this.f99749f = kcPrimaryButton;
        this.f99750g = alignTopTextView2;
        this.f99751h = baseTextView;
        this.f99752i = kcSecondaryButton;
    }
}
