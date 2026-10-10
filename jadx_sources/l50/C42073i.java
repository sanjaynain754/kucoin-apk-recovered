package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.i */
/* JADX INFO: compiled from: BtradingBotKitFragmentBotAssetsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42073i implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f92868A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f92869B;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f92870a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f92871b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f92872c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatCheckBox f92873d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f92874e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CoordinatorLayout f92875f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Group f92876g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Guideline f92877h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f92878i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f92879j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ImageView f92880k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayoutCompat f92881l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RecyclerView f92882m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KuCoinRefreshLayout f92883n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RelativeLayout f92884o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f92885p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f92886q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f92887r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f92888s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ShowHideTextView f92889t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f92890u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f92891v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ShowHideTextView f92892w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final ShowHideTextView f92893x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ShowHideTextView f92894y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final ShowHideTextView f92895z;

    public C42073i(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull Group group, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull ShowHideTextView showHideTextView5, @NonNull ShowHideTextView showHideTextView6, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f92870a = kuCoinRefreshLayout;
        this.f92871b = appBarLayout;
        this.f92872c = kcSecondaryButton;
        this.f92873d = appCompatCheckBox;
        this.f92874e = constraintLayout;
        this.f92875f = coordinatorLayout;
        this.f92876g = group;
        this.f92877h = guideline;
        this.f92878i = imageView;
        this.f92879j = imageView2;
        this.f92880k = imageView3;
        this.f92881l = linearLayoutCompat;
        this.f92882m = recyclerView;
        this.f92883n = kuCoinRefreshLayout2;
        this.f92884o = relativeLayout;
        this.f92885p = view;
        this.f92886q = baseTextView;
        this.f92887r = baseTextView2;
        this.f92888s = showHideTextView;
        this.f92889t = showHideTextView2;
        this.f92890u = baseTextView3;
        this.f92891v = baseTextView4;
        this.f92892w = showHideTextView3;
        this.f92893x = showHideTextView4;
        this.f92894y = showHideTextView5;
        this.f92895z = showHideTextView6;
        this.f92868A = baseTextView5;
        this.f92869B = baseTextView6;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42073i m92297a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.bt_bots_homepage;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.cbHideOrShow;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
                if (appCompatCheckBox != null) {
                    i11 = R$id.cl_assets;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.coordinator_layout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                        if (coordinatorLayout != null) {
                            i11 = R$id.group_expend_list;
                            Group group = (Group) ViewBindings.findChildViewById(view, i11);
                            if (group != null) {
                                i11 = R$id.guide_line_percent_50;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
                                if (guideline != null) {
                                    i11 = R$id.iv_asset_expend;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView != null) {
                                        i11 = R$id.iv_assets_tip;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView2 != null) {
                                            i11 = R$id.iv_show_detail;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView3 != null) {
                                                i11 = R$id.llTotalAsset;
                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayoutCompat != null) {
                                                    i11 = R$id.recycler_view;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                    if (recyclerView != null) {
                                                        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                                        i11 = R$id.rl_expend;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (relativeLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.split_view))) != null) {
                                                            i11 = R$id.tv_bots_list_title;
                                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView != null) {
                                                                i11 = R$id.tvSecondUnit;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    i11 = R$id.tv_today_profit_about;
                                                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView != null) {
                                                                        i11 = R$id.tv_today_profit_number;
                                                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView2 != null) {
                                                                            i11 = R$id.tv_today_profit_text;
                                                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView3 != null) {
                                                                                i11 = R$id.tvTotalAsset;
                                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView4 != null) {
                                                                                    i11 = R$id.tvTotalAssetLegalValue;
                                                                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (showHideTextView3 != null) {
                                                                                        i11 = R$id.tvTotalAssetValue;
                                                                                        ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (showHideTextView4 != null) {
                                                                                            i11 = R$id.tv_total_profit_about;
                                                                                            ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (showHideTextView5 != null) {
                                                                                                i11 = R$id.tv_total_profit_number;
                                                                                                ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (showHideTextView6 != null) {
                                                                                                    i11 = R$id.tv_total_profit_text;
                                                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView5 != null) {
                                                                                                        i11 = R$id.tvUnit;
                                                                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView6 != null) {
                                                                                                            return new C42073i(kuCoinRefreshLayout, appBarLayout, kcSecondaryButton, appCompatCheckBox, constraintLayout, coordinatorLayout, group, guideline, imageView, imageView2, imageView3, linearLayoutCompat, recyclerView, kuCoinRefreshLayout, relativeLayout, viewFindChildViewById, baseTextView, baseTextView2, showHideTextView, showHideTextView2, baseTextView3, baseTextView4, showHideTextView3, showHideTextView4, showHideTextView5, showHideTextView6, baseTextView5, baseTextView6);
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
    public KuCoinRefreshLayout getRoot() {
        return this.f92870a;
    }
}
