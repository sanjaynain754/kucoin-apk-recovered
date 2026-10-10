package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.u */
/* JADX INFO: compiled from: BtradingBotKitItemBotAssetsStrategyBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42095u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93273a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f93274b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93275c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f93276d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f93277e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f93278f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f93279g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f93280h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f93281i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f93282j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f93283k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatTextView f93284l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f93285m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AppCompatTextView f93286n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f93287o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final AppCompatTextView f93288p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f93289q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42095u m92345a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.aggregate_assets;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.barrier_top;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier != null) {
                i11 = R$id.bt_create;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.group_strategy_assets;
                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group != null) {
                        i11 = R$id.iv_grid_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.ll_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.ll_grid_name;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.margin_top_view))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.split_view))) != null) {
                                    i11 = R$id.tv_assets_number;
                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView != null) {
                                        i11 = R$id.tv_assets_text;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView != null) {
                                            i11 = R$id.tv_grid_label;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView != null) {
                                                i11 = R$id.tv_grid_name;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatTextView2 != null) {
                                                    i11 = R$id.tv_today_profit_number;
                                                    ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (showHideTextView2 != null) {
                                                        i11 = R$id.tv_today_profit_text;
                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatTextView3 != null) {
                                                            i11 = R$id.tv_total_profit_number;
                                                            ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView3 != null) {
                                                                return new C42095u((ConstraintLayout) view, constraintLayout, barrier, kcSecondaryButton, group, imageView, linearLayout, linearLayout2, viewFindChildViewById, viewFindChildViewById2, showHideTextView, appCompatTextView, textView, appCompatTextView2, showHideTextView2, appCompatTextView3, showHideTextView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93273a;
    }

    public C42095u(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull Group group, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull View view2, @NonNull ShowHideTextView showHideTextView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView2, @NonNull ShowHideTextView showHideTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull ShowHideTextView showHideTextView3) {
        this.f93273a = constraintLayout;
        this.f93274b = constraintLayout2;
        this.f93275c = barrier;
        this.f93276d = kcSecondaryButton;
        this.f93277e = group;
        this.f93278f = imageView;
        this.f93279g = linearLayout;
        this.f93280h = linearLayout2;
        this.f93281i = view;
        this.f93282j = view2;
        this.f93283k = showHideTextView;
        this.f93284l = appCompatTextView;
        this.f93285m = textView;
        this.f93286n = appCompatTextView2;
        this.f93287o = showHideTextView2;
        this.f93288p = appCompatTextView3;
        this.f93289q = showHideTextView3;
    }
}
