package dm;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.r3 */
/* JADX INFO: compiled from: BkumexHeaderPanelHedgeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36833r3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80980a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80981b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f80982c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AnimateDrawableEndView f80983d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AnimateDrawableEndView f80984e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80985f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f80986g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f80987h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AnimateDrawableEndView f80988i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f80989j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36833r3 m82529a(@NonNull View view) {
        int i11 = R$id.close;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.ivTradeTypeInfo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
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
                                i11 = R$id.tradeType;
                                AnimateDrawableEndView animateDrawableEndView3 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                if (animateDrawableEndView3 != null) {
                                    i11 = R$id.tradeTypeFl;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout != null) {
                                        return new C36833r3(constraintLayout, baseTextView, appCompatImageView, animateDrawableEndView, animateDrawableEndView2, baseTextView2, linearLayoutCompat, constraintLayout, animateDrawableEndView3, frameLayout);
                                    }
                                }
                            }
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
        return this.f80980a;
    }

    public C36833r3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull AnimateDrawableEndView animateDrawableEndView3, @NonNull FrameLayout frameLayout) {
        this.f80980a = constraintLayout;
        this.f80981b = baseTextView;
        this.f80982c = appCompatImageView;
        this.f80983d = animateDrawableEndView;
        this.f80984e = animateDrawableEndView2;
        this.f80985f = baseTextView2;
        this.f80986g = linearLayoutCompat;
        this.f80987h = constraintLayout2;
        this.f80988i = animateDrawableEndView3;
        this.f80989j = frameLayout;
    }
}
