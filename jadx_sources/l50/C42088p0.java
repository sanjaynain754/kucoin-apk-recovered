package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.DashTextView;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.p0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListItemRunningLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42088p0 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final TextView f93176A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final TextView f93177B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final TextView f93178C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final DashTextView f93179D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final AppCompatTextView f93180E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final AppCompatTextView f93181F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final DashTextView f93182G;

    /* JADX INFO: renamed from: H */
    @NonNull
    public final TextView f93183H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public final TextView f93184I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public final TextView f93185J;

    /* JADX INFO: renamed from: K */
    @NonNull
    public final TextView f93186K;

    /* JADX INFO: renamed from: L */
    @NonNull
    public final TextView f93187L;

    /* JADX INFO: renamed from: M */
    @NonNull
    public final TextView f93188M;

    /* JADX INFO: renamed from: N */
    @NonNull
    public final TextView f93189N;

    /* JADX INFO: renamed from: O */
    @NonNull
    public final AppCompatTextView f93190O;

    /* JADX INFO: renamed from: P */
    @NonNull
    public final TextView f93191P;

    /* JADX INFO: renamed from: Q */
    @NonNull
    public final TextView f93192Q;

    /* JADX INFO: renamed from: R */
    @NonNull
    public final TextView f93193R;

    /* JADX INFO: renamed from: S */
    @NonNull
    public final TextView f93194S;

    /* JADX INFO: renamed from: T */
    @NonNull
    public final TextView f93195T;

    /* JADX INFO: renamed from: U */
    @NonNull
    public final TextView f93196U;

    /* JADX INFO: renamed from: V */
    @NonNull
    public final View f93197V;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93198a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93199b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93200c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f93201d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f93202e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Group f93203f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Barrier f93204g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f93205h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f93206i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatImageView f93207j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatImageView f93208k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ImageView f93209l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayout f93210m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayout f93211n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final LinearLayout f93212o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final LinearLayout f93213p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatImageView f93214q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AppCompatImageView f93215r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final View f93216s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final TextView f93217t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final AppCompatTextView f93218u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final DashTextView f93219v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final AppCompatTextView f93220w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final AppCompatTextView f93221x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final TextView f93222y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final DashTextView f93223z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42088p0 m92329a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.barrier_end;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_start;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.end_view;
                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
                if (viewFindChildViewById4 != null) {
                    i11 = R$id.group_coupons;
                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group != null) {
                        i11 = R$id.guide_percent_30;
                        Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i11);
                        if (barrier3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                            i11 = R$id.iv_detail;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.iv_edit_price_range;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView2 != null) {
                                    i11 = R$id.iv_shutdown;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView3 != null) {
                                        i11 = R$id.iv_strategy_coupons;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView != null) {
                                            i11 = R$id.ll_detail;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout != null) {
                                                i11 = R$id.ll_edit_price_range;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayout2 != null) {
                                                    i11 = R$id.ll_pending_order_content;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayout3 != null) {
                                                        i11 = R$id.ll_shutdown;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayout4 != null) {
                                                            i11 = R$id.lottie_view;
                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                            if (appCompatImageView4 != null) {
                                                                i11 = R$id.out_price_range;
                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatImageView5 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.split_view))) != null) {
                                                                    i11 = R$id.tv_arbitrage_times;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView != null) {
                                                                        i11 = R$id.tv_breakeven_number;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (appCompatTextView != null) {
                                                                            i11 = R$id.tv_breakeven_text;
                                                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (dashTextView != null) {
                                                                                i11 = R$id.tv_detail;
                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (appCompatTextView2 != null) {
                                                                                    i11 = R$id.tv_edit_price_range;
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (appCompatTextView3 != null) {
                                                                                        i11 = R$id.tv_float_amount_number;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (textView2 != null) {
                                                                                            i11 = R$id.tv_float_amount_text;
                                                                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (dashTextView2 != null) {
                                                                                                i11 = R$id.tv_grid_year_number;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (textView3 != null) {
                                                                                                    i11 = R$id.tv_gridyear_text;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (textView4 != null) {
                                                                                                        i11 = R$id.tv_income_number;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (textView5 != null) {
                                                                                                            i11 = R$id.tv_income_text;
                                                                                                            DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (dashTextView3 != null) {
                                                                                                                i11 = R$id.tv_last_price_number;
                                                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (appCompatTextView4 != null) {
                                                                                                                    i11 = R$id.tv_order_section_number;
                                                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (appCompatTextView5 != null) {
                                                                                                                        i11 = R$id.tv_order_section_text;
                                                                                                                        DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                        if (dashTextView4 != null) {
                                                                                                                            i11 = R$id.tv_pending_order_number_buy;
                                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i11 = R$id.tv_pending_order_number_sell;
                                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i11 = R$id.tv_pending_order_number_split;
                                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i11 = R$id.tv_pending_order_text;
                                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                        if (textView9 != null) {
                                                                                                                                            i11 = R$id.tv_remaining_rebate_time;
                                                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i11 = R$id.tv_running_time;
                                                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                if (textView11 != null) {
                                                                                                                                                    i11 = R$id.tv_save_handling_fee;
                                                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                        i11 = R$id.tv_shutdown;
                                                                                                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                        if (appCompatTextView6 != null) {
                                                                                                                                                            i11 = R$id.tv_symbol_info;
                                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                i11 = R$id.tv_total_invest_number;
                                                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                    i11 = R$id.tv_total_invest_text;
                                                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        i11 = R$id.tv_total_profit_number;
                                                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                            i11 = R$id.tv_total_profit_number_rate;
                                                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                i11 = R$id.tv_total_profit_text;
                                                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                                                                if (textView18 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_center_content_bg))) != null) {
                                                                                                                                                                                    return new C42088p0(constraintLayout, barrier, barrier2, constraintLayout, viewFindChildViewById4, group, barrier3, viewFindChildViewById, appCompatImageView, appCompatImageView2, appCompatImageView3, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, appCompatImageView4, appCompatImageView5, viewFindChildViewById2, textView, appCompatTextView, dashTextView, appCompatTextView2, appCompatTextView3, textView2, dashTextView2, textView3, textView4, textView5, dashTextView3, appCompatTextView4, appCompatTextView5, dashTextView4, textView6, textView7, textView8, textView9, textView10, textView11, textView12, appCompatTextView6, textView13, textView14, textView15, textView16, textView17, textView18, viewFindChildViewById3);
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
    public ConstraintLayout getRoot() {
        return this.f93198a;
    }

    public C42088p0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull Group group, @NonNull Barrier barrier3, @NonNull View view2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull View view3, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView, @NonNull DashTextView dashTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull TextView textView2, @NonNull DashTextView dashTextView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull DashTextView dashTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull DashTextView dashTextView4, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull AppCompatTextView appCompatTextView6, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView18, @NonNull View view4) {
        this.f93198a = constraintLayout;
        this.f93199b = barrier;
        this.f93200c = barrier2;
        this.f93201d = constraintLayout2;
        this.f93202e = view;
        this.f93203f = group;
        this.f93204g = barrier3;
        this.f93205h = view2;
        this.f93206i = appCompatImageView;
        this.f93207j = appCompatImageView2;
        this.f93208k = appCompatImageView3;
        this.f93209l = imageView;
        this.f93210m = linearLayout;
        this.f93211n = linearLayout2;
        this.f93212o = linearLayout3;
        this.f93213p = linearLayout4;
        this.f93214q = appCompatImageView4;
        this.f93215r = appCompatImageView5;
        this.f93216s = view3;
        this.f93217t = textView;
        this.f93218u = appCompatTextView;
        this.f93219v = dashTextView;
        this.f93220w = appCompatTextView2;
        this.f93221x = appCompatTextView3;
        this.f93222y = textView2;
        this.f93223z = dashTextView2;
        this.f93176A = textView3;
        this.f93177B = textView4;
        this.f93178C = textView5;
        this.f93179D = dashTextView3;
        this.f93180E = appCompatTextView4;
        this.f93181F = appCompatTextView5;
        this.f93182G = dashTextView4;
        this.f93183H = textView6;
        this.f93184I = textView7;
        this.f93185J = textView8;
        this.f93186K = textView9;
        this.f93187L = textView10;
        this.f93188M = textView11;
        this.f93189N = textView12;
        this.f93190O = appCompatTextView6;
        this.f93191P = textView13;
        this.f93192Q = textView14;
        this.f93193R = textView15;
        this.f93194S = textView16;
        this.f93195T = textView17;
        this.f93196U = textView18;
        this.f93197V = view4;
    }
}
