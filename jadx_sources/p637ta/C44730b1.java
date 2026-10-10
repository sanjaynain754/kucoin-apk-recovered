package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: ta.b1 */
/* JADX INFO: compiled from: AssetItemDynamicsCardBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44730b1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f99607a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeConstraintLayout f99608b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99609c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99610d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99611e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44730b1 m98970a(@NonNull View view) {
        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) view;
        int i11 = R$id.tvApy;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvName;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvProfitLossName;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C44730b1(shapeConstraintLayout, shapeConstraintLayout, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f99607a;
    }

    public C44730b1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99607a = shapeConstraintLayout;
        this.f99608b = shapeConstraintLayout2;
        this.f99609c = baseTextView;
        this.f99610d = baseTextView2;
        this.f99611e = baseTextView3;
    }
}
