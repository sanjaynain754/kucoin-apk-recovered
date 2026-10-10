package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: dm.l1 */
/* JADX INFO: compiled from: BkumexEuropeUnlockLeverageTipsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36795l1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f80476a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f80477b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80478c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36795l1 m82450a(@NonNull View view) {
        int i11 = R$id.unlockLeverageClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.unlockLeverageTips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C36795l1((ShapeLinearLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f80476a;
    }

    public C36795l1(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f80476a = shapeLinearLayout;
        this.f80477b = appCompatImageView;
        this.f80478c = baseTextView;
    }
}
