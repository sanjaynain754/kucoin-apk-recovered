package t20;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.x0 */
/* JADX INFO: compiled from: SpotViewTradeComplianceInfoBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44675x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99432a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99433b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeLinearLayout f99434c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f99435d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f99436e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f99437f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44675x0 m98826a(@NonNull View view) {
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
                            return new C44675x0((LinearLayoutCompat) view, imageView, shapeLinearLayout, shapeTextView, shapeTextView2, shapeTextView3);
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
        return this.f99432a;
    }

    public C44675x0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull ShapeTextView shapeTextView3) {
        this.f99432a = linearLayoutCompat;
        this.f99433b = imageView;
        this.f99434c = shapeLinearLayout;
        this.f99435d = shapeTextView;
        this.f99436e = shapeTextView2;
        this.f99437f = shapeTextView3;
    }
}
