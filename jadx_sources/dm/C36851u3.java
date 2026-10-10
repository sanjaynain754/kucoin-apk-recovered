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

/* JADX INFO: renamed from: dm.u3 */
/* JADX INFO: compiled from: BkumexHeaderPanelOnewaySplitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36851u3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81141a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81142b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f81143c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AnimateDrawableEndView f81144d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AnimateDrawableEndView f81145e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f81146f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81147g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81148h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AnimateDrawableEndView f81149i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f81150j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36851u3 m82567a(@NonNull View view) {
        int i11 = R$id.buy;
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
                        i11 = R$id.rbToggleGroup;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.sell;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tradeType;
                                AnimateDrawableEndView animateDrawableEndView3 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                if (animateDrawableEndView3 != null) {
                                    i11 = R$id.tradeTypeFl;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout != null) {
                                        return new C36851u3(constraintLayout, baseTextView, appCompatImageView, animateDrawableEndView, animateDrawableEndView2, linearLayoutCompat, constraintLayout, baseTextView2, animateDrawableEndView3, frameLayout);
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
        return this.f81141a;
    }

    public C36851u3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull AnimateDrawableEndView animateDrawableEndView3, @NonNull FrameLayout frameLayout) {
        this.f81141a = constraintLayout;
        this.f81142b = baseTextView;
        this.f81143c = appCompatImageView;
        this.f81144d = animateDrawableEndView;
        this.f81145e = animateDrawableEndView2;
        this.f81146f = linearLayoutCompat;
        this.f81147g = constraintLayout2;
        this.f81148h = baseTextView2;
        this.f81149i = animateDrawableEndView3;
        this.f81150j = frameLayout;
    }
}
