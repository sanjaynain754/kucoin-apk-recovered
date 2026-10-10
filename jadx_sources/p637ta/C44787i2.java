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

/* JADX INFO: renamed from: ta.i2 */
/* JADX INFO: compiled from: AssetViewConvertBottomPanelBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44787i2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100121a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100122b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100123c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100124d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100125e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100126f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100127g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44787i2 m99092a(@NonNull View view) {
        int i11 = R$id.ivCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvCheck;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvConvertKCS;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tvEstimate;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvEstimateNum;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvEstimateUnit;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                return new C44787i2((ConstraintLayout) view, imageView, baseTextView, kcPrimaryButton, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f100121a;
    }

    public C44787i2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f100121a = constraintLayout;
        this.f100122b = imageView;
        this.f100123c = baseTextView;
        this.f100124d = kcPrimaryButton;
        this.f100125e = baseTextView2;
        this.f100126f = baseTextView3;
        this.f100127g = baseTextView4;
    }
}
