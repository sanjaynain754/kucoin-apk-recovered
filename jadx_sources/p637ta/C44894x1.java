package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.view.ShapeImageView;

/* JADX INFO: renamed from: ta.x1 */
/* JADX INFO: compiled from: AssetOptionsOpenFragmentLayoutBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44894x1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101116a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeImageView f101117b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f101118c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101119d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101120e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44894x1 m99312a(@NonNull View view) {
        int i11 = R$id.iv_main_icon;
        ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
        if (shapeImageView != null) {
            i11 = R$id.tv_enable_now;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tv_subtitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44894x1((ConstraintLayout) view, shapeImageView, kcPrimaryButton, baseTextView, baseTextView2);
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
        return this.f101116a;
    }

    public C44894x1(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeImageView shapeImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f101116a = constraintLayout;
        this.f101117b = shapeImageView;
        this.f101118c = kcPrimaryButton;
        this.f101119d = baseTextView;
        this.f101120e = baseTextView2;
    }
}
