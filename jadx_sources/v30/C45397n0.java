package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.n0 */
/* JADX INFO: compiled from: TradeCoreViewRiskTipBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45397n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f102237a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f102238b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102239c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45397n0 m100328a(@NonNull View view) {
        int i11 = R$id.ivClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvRiskTip;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C45397n0((ShapeLinearLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f102237a;
    }

    public C45397n0(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f102237a = shapeLinearLayout;
        this.f102238b = appCompatImageView;
        this.f102239c = baseTextView;
    }
}
