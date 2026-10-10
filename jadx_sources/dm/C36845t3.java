package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.t3 */
/* JADX INFO: compiled from: BkumexHeaderPanelOnewayKLineBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36845t3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81071a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AnimateDrawableEndView f81072b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AnimateDrawableEndView f81073c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f81074d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36845t3 m82555a(@NonNull View view) {
        int i11 = R$id.leverage;
        AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
        if (animateDrawableEndView != null) {
            i11 = R$id.marginMode;
            AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
            if (animateDrawableEndView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C36845t3(constraintLayout, animateDrawableEndView, animateDrawableEndView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81071a;
    }

    public C36845t3(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f81071a = constraintLayout;
        this.f81072b = animateDrawableEndView;
        this.f81073c = animateDrawableEndView2;
        this.f81074d = constraintLayout2;
    }
}
