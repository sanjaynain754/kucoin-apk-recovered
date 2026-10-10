package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.t */
/* JADX INFO: compiled from: BtradingBotKitItemBotAssetsRunningBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42094t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93260a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f93261b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f93262c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LottieAnimationView f93263d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f93264e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f93265f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f93266g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f93267h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final DashTextView f93268i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatTextView f93269j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f93270k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f93271l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f93272m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42094t m92343a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fakeDivider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            i11 = R$id.iv_grid_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.lottie_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                if (lottieAnimationView != null) {
                    i11 = R$id.profit_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.split_view))) != null) {
                        i11 = R$id.spotAipPnlTips;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_assets_number;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                i11 = R$id.tv_assets_text;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    i11 = R$id.tv_symbol_name;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatTextView != null) {
                                        i11 = R$id.tv_today_profit_number;
                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView2 != null) {
                                            i11 = R$id.tv_today_profit_text;
                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView2 != null) {
                                                i11 = R$id.tv_total_profit_number;
                                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView3 != null) {
                                                    return new C42094t((ConstraintLayout) view, viewFindChildViewById2, imageView, lottieAnimationView, linearLayout, viewFindChildViewById, baseTextView, showHideTextView, dashTextView, appCompatTextView, showHideTextView2, dashTextView2, showHideTextView3);
                                                }
                                            }
                                        }
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
        return this.f93260a;
    }

    public C42094t(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull DashTextView dashTextView, @NonNull AppCompatTextView appCompatTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView3) {
        this.f93260a = constraintLayout;
        this.f93261b = view;
        this.f93262c = imageView;
        this.f93263d = lottieAnimationView;
        this.f93264e = linearLayout;
        this.f93265f = view2;
        this.f93266g = baseTextView;
        this.f93267h = showHideTextView;
        this.f93268i = dashTextView;
        this.f93269j = appCompatTextView;
        this.f93270k = showHideTextView2;
        this.f93271l = dashTextView2;
        this.f93272m = showHideTextView3;
    }
}
