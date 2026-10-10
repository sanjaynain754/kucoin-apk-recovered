package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.s3 */
/* JADX INFO: compiled from: BkumexHeaderPanelHedgeKLineBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36839s3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81037a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81038b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AnimateDrawableEndView f81039c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AnimateDrawableEndView f81040d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81041e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f81042f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81043g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36839s3 m82542a(@NonNull View view) {
        int i11 = R$id.close;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.leverage;
            AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
            if (animateDrawableEndView != null) {
                i11 = R$id.marginMode;
                AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                if (animateDrawableEndView2 != null) {
                    i11 = R$id.open;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.rbToggleGroup;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new C36839s3(constraintLayout, baseTextView, animateDrawableEndView, animateDrawableEndView2, baseTextView2, linearLayoutCompat, constraintLayout);
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
        return this.f81037a;
    }

    public C36839s3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2) {
        this.f81037a = constraintLayout;
        this.f81038b = baseTextView;
        this.f81039c = animateDrawableEndView;
        this.f81040d = animateDrawableEndView2;
        this.f81041e = baseTextView2;
        this.f81042f = linearLayoutCompat;
        this.f81043g = constraintLayout2;
    }
}
