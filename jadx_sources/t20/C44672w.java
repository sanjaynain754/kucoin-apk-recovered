package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.w */
/* JADX INFO: compiled from: BspotViewRiskTipBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44672w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f99418a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f99419b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99420c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44672w m98820a(@NonNull View view) {
        int i11 = R$id.ivClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvRiskTip;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44672w((ShapeLinearLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f99418a;
    }

    public C44672w(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f99418a = shapeLinearLayout;
        this.f99419b = appCompatImageView;
        this.f99420c = baseTextView;
    }
}
