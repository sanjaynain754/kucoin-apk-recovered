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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.o */
/* JADX INFO: compiled from: BtradingBotKitFuturesGridNotTradingOrderBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42085o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93096a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93097b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93098c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Barrier f93099d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f93100e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f93101f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f93102g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f93103h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f93104i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f93105j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatImageView f93106k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f93107l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatTextView f93108m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f93109n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f93110o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f93111p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatTextView f93112q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f93113r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f93114s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final TextView f93115t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final TextView f93116u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final TextView f93117v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final TextView f93118w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f93119x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42085o m92323a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.barrier_end;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_start;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                i11 = R$id.barrier_top;
                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i11);
                if (barrier3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.end_view;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
                    if (viewFindChildViewById4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                        i11 = R$id.iv_shutdown;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.iv_strategy_type;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.ll_shutdown;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.lottie_view;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.start_view))) != null) {
                                        i11 = R$id.tv_last_price_number;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView != null) {
                                            i11 = R$id.tv_leverage;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView2 != null) {
                                                i11 = R$id.tv_not_trading_order;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView3 != null) {
                                                    i11 = R$id.tv_running_time;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView4 != null) {
                                                        i11 = R$id.tv_shutdown;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatTextView2 != null) {
                                                            i11 = R$id.tv_symbol_info;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView5 != null) {
                                                                i11 = R$id.tv_total_invest_number;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView6 != null) {
                                                                    i11 = R$id.tv_total_invest_text;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView7 != null) {
                                                                        i11 = R$id.tv_total_profit_number;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (textView8 != null) {
                                                                            i11 = R$id.tv_total_profit_text;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (textView9 != null) {
                                                                                i11 = R$id.tv_trading_order_price;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (textView10 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_center_content_bg))) != null) {
                                                                                    return new C42085o(constraintLayout, barrier, barrier2, barrier3, constraintLayout, viewFindChildViewById4, viewFindChildViewById, imageView, textView, linearLayout, appCompatImageView, viewFindChildViewById2, appCompatTextView, textView2, textView3, textView4, appCompatTextView2, textView5, textView6, textView7, textView8, textView9, textView10, viewFindChildViewById3);
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
        return this.f93096a;
    }

    public C42085o(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull Barrier barrier3, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull View view3, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull View view4) {
        this.f93096a = constraintLayout;
        this.f93097b = barrier;
        this.f93098c = barrier2;
        this.f93099d = barrier3;
        this.f93100e = constraintLayout2;
        this.f93101f = view;
        this.f93102g = view2;
        this.f93103h = imageView;
        this.f93104i = textView;
        this.f93105j = linearLayout;
        this.f93106k = appCompatImageView;
        this.f93107l = view3;
        this.f93108m = appCompatTextView;
        this.f93109n = textView2;
        this.f93110o = textView3;
        this.f93111p = textView4;
        this.f93112q = appCompatTextView2;
        this.f93113r = textView5;
        this.f93114s = textView6;
        this.f93115t = textView7;
        this.f93116u = textView8;
        this.f93117v = textView9;
        this.f93118w = textView10;
        this.f93119x = view4;
    }
}
