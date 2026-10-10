package dm;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: dm.j4 */
/* JADX INFO: compiled from: BkumexPreMarketTipsLayoutBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36786j4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f80352a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f80353b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f80354c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80355d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeConstraintLayout f80356e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36786j4 m82430a(@NonNull View view) {
        int i11 = R$id.ivClosePreMarketTips;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivPreMarketTitleIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.preMarketTipsContent;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) view;
                    return new C36786j4(shapeConstraintLayout, imageView, imageView2, baseTextView, shapeConstraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f80352a;
    }

    public C36786j4(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull ShapeConstraintLayout shapeConstraintLayout2) {
        this.f80352a = shapeConstraintLayout;
        this.f80353b = imageView;
        this.f80354c = imageView2;
        this.f80355d = baseTextView;
        this.f80356e = shapeConstraintLayout2;
    }
}
