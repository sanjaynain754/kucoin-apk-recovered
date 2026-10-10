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
import com.kubi.resources.widget.round.widget.RoundTextView;

/* JADX INFO: renamed from: ta.b5 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawResultDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44734b5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99624a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99625b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99626c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99627d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RoundTextView f99628e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99629f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlignTopTextView f99630g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f99631h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AlignTopTextView f99632i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99633j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcSecondaryButton f99634k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44734b5 m98978a(@NonNull View view) {
        int i11 = R$id.iv_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_withdraw_result;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ll_info;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.tv_address;
                    RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                    if (roundTextView != null) {
                        i11 = R$id.tv_address_tip;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
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
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tv_view_detail;
                                            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                            if (kcSecondaryButton != null) {
                                                return new C44734b5((ConstraintLayout) view, imageView, imageView2, linearLayout, roundTextView, baseTextView, alignTopTextView, kcPrimaryButton, alignTopTextView2, baseTextView2, kcSecondaryButton);
                                            }
                                        }
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
        return this.f99624a;
    }

    public C44734b5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RoundTextView roundTextView, @NonNull BaseTextView baseTextView, @NonNull AlignTopTextView alignTopTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlignTopTextView alignTopTextView2, @NonNull BaseTextView baseTextView2, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f99624a = constraintLayout;
        this.f99625b = imageView;
        this.f99626c = imageView2;
        this.f99627d = linearLayout;
        this.f99628e = roundTextView;
        this.f99629f = baseTextView;
        this.f99630g = alignTopTextView;
        this.f99631h = kcPrimaryButton;
        this.f99632i = alignTopTextView2;
        this.f99633j = baseTextView2;
        this.f99634k = kcSecondaryButton;
    }
}
