package v30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.p0 */
/* JADX INFO: compiled from: TradeCoreViewTradeComplianceInfoBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45401p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102282a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102283b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeLinearLayout f102284c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f102285d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f102286e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f102287f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45401p0 m100339a(@NonNull View view) {
        int i11 = R$id.ivQuestion;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.layoutP30;
            ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
            if (shapeLinearLayout != null) {
                i11 = R$id.tvC;
                ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView != null) {
                    i11 = R$id.tvMN;
                    ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                    if (shapeTextView2 != null) {
                        i11 = R$id.tvN;
                        ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView3 != null) {
                            return new C45401p0((LinearLayoutCompat) view, imageView, shapeLinearLayout, shapeTextView, shapeTextView2, shapeTextView3);
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
        return this.f102282a;
    }

    public C45401p0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull ShapeTextView shapeTextView3) {
        this.f102282a = linearLayoutCompat;
        this.f102283b = imageView;
        this.f102284c = shapeLinearLayout;
        this.f102285d = shapeTextView;
        this.f102286e = shapeTextView2;
        this.f102287f = shapeTextView3;
    }
}
