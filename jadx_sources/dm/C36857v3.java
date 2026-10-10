package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.v3 */
/* JADX INFO: compiled from: BkumexHeaderPanelOnewayTogetherBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36857v3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81244a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81245b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AnimateDrawableEndView f81246c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AnimateDrawableEndView f81247d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f81248e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AnimateDrawableEndView f81249f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f81250g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36857v3 m82579a(@NonNull View view) {
        int i11 = R$id.ivTradeTypeInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.leverage;
            AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
            if (animateDrawableEndView != null) {
                i11 = R$id.marginMode;
                AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                if (animateDrawableEndView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.tradeType;
                    AnimateDrawableEndView animateDrawableEndView3 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                    if (animateDrawableEndView3 != null) {
                        i11 = R$id.tradeTypeFl;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            return new C36857v3(constraintLayout, appCompatImageView, animateDrawableEndView, animateDrawableEndView2, constraintLayout, animateDrawableEndView3, frameLayout);
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
    public ConstraintLayout getRoot() {
        return this.f81244a;
    }

    public C36857v3(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull ConstraintLayout constraintLayout2, @NonNull AnimateDrawableEndView animateDrawableEndView3, @NonNull FrameLayout frameLayout) {
        this.f81244a = constraintLayout;
        this.f81245b = appCompatImageView;
        this.f81246c = animateDrawableEndView;
        this.f81247d = animateDrawableEndView2;
        this.f81248e = constraintLayout2;
        this.f81249f = animateDrawableEndView3;
        this.f81250g = frameLayout;
    }
}
