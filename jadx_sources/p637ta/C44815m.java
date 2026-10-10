package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: ta.m */
/* JADX INFO: compiled from: AssetCoinDetailPerformanceViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44815m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100432a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100433b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final DashTextView f100434c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100435d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100436e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100437f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100438g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100439h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100440i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f100441j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44815m m99151a(@NonNull View view) {
        int i11 = R$id.cost_price_content;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.cost_price_title;
            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
            if (dashTextView != null) {
                i11 = R$id.iv_edit_avg_cost;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.last_price_content;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.last_price_title;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.performance_title;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.pnl_content;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.pnl_title;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        return new C44815m(constraintLayout, baseTextView, dashTextView, appCompatImageView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, constraintLayout);
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
        return this.f100432a;
    }

    public C44815m(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull ConstraintLayout constraintLayout2) {
        this.f100432a = constraintLayout;
        this.f100433b = baseTextView;
        this.f100434c = dashTextView;
        this.f100435d = appCompatImageView;
        this.f100436e = baseTextView2;
        this.f100437f = baseTextView3;
        this.f100438g = baseTextView4;
        this.f100439h = baseTextView5;
        this.f100440i = baseTextView6;
        this.f100441j = constraintLayout2;
    }
}
