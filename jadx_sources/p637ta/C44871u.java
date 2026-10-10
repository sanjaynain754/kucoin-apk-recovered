package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.u */
/* JADX INFO: compiled from: AssetDialogConfirmConvertBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44871u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100911a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeLinearLayout f100912b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f100913c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100914d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100915e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100916f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100917g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100918h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100919i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100920j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100921k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44871u m99266a(@NonNull View view) {
        int i11 = R$id.layout1;
        ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
        if (shapeLinearLayout != null) {
            i11 = R$id.tvCancel;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.tvConfirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tvConvertFee;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvConvertFeeName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvConvertTip;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvEstimatedConvertAmount;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvEstimatedConvertAmountName;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tvTitle;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvTotalConvertKCS;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                return new C44871u((LinearLayoutCompat) view, shapeLinearLayout, kcSecondaryButton, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
    public LinearLayoutCompat getRoot() {
        return this.f100911a;
    }

    public C44871u(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f100911a = linearLayoutCompat;
        this.f100912b = shapeLinearLayout;
        this.f100913c = kcSecondaryButton;
        this.f100914d = kcPrimaryButton;
        this.f100915e = baseTextView;
        this.f100916f = baseTextView2;
        this.f100917g = baseTextView3;
        this.f100918h = baseTextView4;
        this.f100919i = baseTextView5;
        this.f100920j = baseTextView6;
        this.f100921k = baseTextView7;
    }
}
