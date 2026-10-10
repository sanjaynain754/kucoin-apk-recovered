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
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeImageView;

/* JADX INFO: renamed from: ta.p0 */
/* JADX INFO: compiled from: AssetFragmentDepositInvoiceBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44837p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100573a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100574b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f100575c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100576d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeImageView f100577e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f100578f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeLinearLayout f100579g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeConstraintLayout f100580h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100581i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100582j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100583k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100584l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44837p0 m99200a(@NonNull View view) {
        int i11 = R$id.btn_copy;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btn_save_address;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.ivCopy;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ivIcon;
                    ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                    if (shapeImageView != null) {
                        i11 = R$id.ivQr;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.ll1;
                            ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (shapeLinearLayout != null) {
                                i11 = R$id.root;
                                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (shapeConstraintLayout != null) {
                                    i11 = R$id.tvAmount;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvExpire;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvInvoice;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvSubTitle;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    return new C44837p0((ConstraintLayout) view, kcPrimaryButton, kcSecondaryButton, imageView, shapeImageView, imageView2, shapeLinearLayout, shapeConstraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100573a;
    }

    public C44837p0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull ImageView imageView, @NonNull ShapeImageView shapeImageView, @NonNull ImageView imageView2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f100573a = constraintLayout;
        this.f100574b = kcPrimaryButton;
        this.f100575c = kcSecondaryButton;
        this.f100576d = imageView;
        this.f100577e = shapeImageView;
        this.f100578f = imageView2;
        this.f100579g = shapeLinearLayout;
        this.f100580h = shapeConstraintLayout;
        this.f100581i = baseTextView;
        this.f100582j = baseTextView2;
        this.f100583k = baseTextView3;
        this.f100584l = baseTextView4;
    }
}
