package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.y0 */
/* JADX INFO: compiled from: AssetHeaderFilterAvailableBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44900y0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101166a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f101167b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44900y0 m99324a(@NonNull View view) {
        int i11 = R$id.tvAssetFilterTip;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            return new C44900y0((ConstraintLayout) view, baseTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f101166a;
    }

    public C44900y0(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView) {
        this.f101166a = constraintLayout;
        this.f101167b = baseTextView;
    }
}
