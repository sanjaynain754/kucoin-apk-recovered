package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcLabelView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.i4 */
/* JADX INFO: compiled from: KucoinFragmentDepositCoinTextAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44789i4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100133a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100134b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100135c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100136d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f100137e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcLabelView f100138f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100139g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AlertTipsTextView f100140h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44789i4 m99096a(@NonNull View view) {
        int i11 = R$id.address_title;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.copy_address;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.ivSelectAddress;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.selectAddressLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.tv_address_remark;
                        KcLabelView kcLabelView = (KcLabelView) ViewBindings.findChildViewById(view, i11);
                        if (kcLabelView != null) {
                            i11 = R$id.tv_coin_address;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_coin_address_tip;
                                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                if (alertTipsTextView != null) {
                                    return new C44789i4((ConstraintLayout) view, baseTextView, kcPrimaryButton, imageView, constraintLayout, kcLabelView, baseTextView2, alertTipsTextView);
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
        return this.f100133a;
    }

    public C44789i4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull KcLabelView kcLabelView, @NonNull BaseTextView baseTextView2, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f100133a = constraintLayout;
        this.f100134b = baseTextView;
        this.f100135c = kcPrimaryButton;
        this.f100136d = imageView;
        this.f100137e = constraintLayout2;
        this.f100138f = kcLabelView;
        this.f100139g = baseTextView2;
        this.f100140h = alertTipsTextView;
    }
}
