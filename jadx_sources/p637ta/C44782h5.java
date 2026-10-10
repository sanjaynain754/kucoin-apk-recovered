package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.withdraw.view.WithdrawFeeView;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.h5 */
/* JADX INFO: compiled from: KucoinViewWithdrawBottomBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44782h5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100075a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100076b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final WithdrawFeeView f100077c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100078d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AutoTextView f100079e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100080f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100081g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100082h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44782h5 m99081a(@NonNull View view) {
        WithdrawFeeView withdrawFeeViewFindChildViewById;
        int i11 = R$id.btn_withdraw;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null && (withdrawFeeViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.feeView))) != null) {
            i11 = R$id.ivFeeTip;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tv_actual_credit;
                AutoTextView autoTextView = (AutoTextView) ViewBindings.findChildViewById(view, i11);
                if (autoTextView != null) {
                    i11 = R$id.tv_actual_credit_title;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_actual_credit_unit;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvChangeAmount;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C44782h5((ConstraintLayout) view, kcPrimaryButton, withdrawFeeViewFindChildViewById, imageView, autoTextView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f100075a;
    }

    public C44782h5(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull WithdrawFeeView withdrawFeeView, @NonNull ImageView imageView, @NonNull AutoTextView autoTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100075a = constraintLayout;
        this.f100076b = kcPrimaryButton;
        this.f100077c = withdrawFeeView;
        this.f100078d = imageView;
        this.f100079e = autoTextView;
        this.f100080f = baseTextView;
        this.f100081g = baseTextView2;
        this.f100082h = baseTextView3;
    }
}
