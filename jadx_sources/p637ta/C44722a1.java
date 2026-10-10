package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.a1 */
/* JADX INFO: compiled from: AssetHoldEarnTipViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44722a1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f99544a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f99545b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f99546c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeLinearLayout f99547d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99548e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44722a1 m98954a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivIcon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) view;
                i11 = R$id.tvText;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C44722a1(shapeLinearLayout, appCompatImageView, appCompatImageView2, shapeLinearLayout, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f99544a;
    }

    public C44722a1(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull BaseTextView baseTextView) {
        this.f99544a = shapeLinearLayout;
        this.f99545b = appCompatImageView;
        this.f99546c = appCompatImageView2;
        this.f99547d = shapeLinearLayout2;
        this.f99548e = baseTextView;
    }
}
