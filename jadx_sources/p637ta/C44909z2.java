package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.z2 */
/* JADX INFO: compiled from: BassetsItemMainRecommendSubBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44909z2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101236a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101237b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f101238c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101239d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f101240e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101241f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44909z2 m99342a(@NonNull View view) {
        int i11 = R$id.coinAvatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvAnnualized;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvAnnualizedName;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tvLabel;
                    ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                    if (shapeTextView != null) {
                        i11 = R$id.tvLabelLending;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C44909z2((ConstraintLayout) view, imageView, baseTextView, baseTextView2, shapeTextView, baseTextView3);
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
        return this.f101236a;
    }

    public C44909z2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView3) {
        this.f101236a = constraintLayout;
        this.f101237b = imageView;
        this.f101238c = baseTextView;
        this.f101239d = baseTextView2;
        this.f101240e = shapeTextView;
        this.f101241f = baseTextView3;
    }
}
