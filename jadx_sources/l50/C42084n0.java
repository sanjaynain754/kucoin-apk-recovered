package l50;

import android.view.View;
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

/* JADX INFO: renamed from: l50.n0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListItemNotTradingOrderLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42084n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93076a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93077b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93078c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f93079d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f93080e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f93081f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f93082g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f93083h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatTextView f93084i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f93085j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f93086k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f93087l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f93088m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f93089n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f93090o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f93091p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f93092q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f93093r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f93094s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final View f93095t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42084n0 m92321a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.barrier_end;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_start;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.end_view))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                i11 = R$id.iv_shutdown;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.ll_shutdown;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.lottie_view;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.tv_last_price_number;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView != null) {
                                i11 = R$id.tv_not_trading_order_info;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.tv_running_time;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView2 != null) {
                                        i11 = R$id.tv_shutdown;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView3 != null) {
                                            i11 = R$id.tv_symbol_info;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView4 != null) {
                                                i11 = R$id.tv_total_invest_number;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView5 != null) {
                                                    i11 = R$id.tv_total_invest_text;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView6 != null) {
                                                        i11 = R$id.tv_total_profit_number;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView7 != null) {
                                                            i11 = R$id.tv_total_profit_number_rate;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView8 != null) {
                                                                i11 = R$id.tv_total_profit_text;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView9 != null) {
                                                                    i11 = R$id.tv_trading_order_price;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView10 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_center_content_bg))) != null) {
                                                                        return new C42084n0((ConstraintLayout) view, barrier, barrier2, viewFindChildViewById, viewFindChildViewById2, appCompatImageView, linearLayout, appCompatImageView2, appCompatTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewFindChildViewById3);
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
        return this.f93076a;
    }

    public C42084n0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull View view, @NonNull View view2, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull View view3) {
        this.f93076a = constraintLayout;
        this.f93077b = barrier;
        this.f93078c = barrier2;
        this.f93079d = view;
        this.f93080e = view2;
        this.f93081f = appCompatImageView;
        this.f93082g = linearLayout;
        this.f93083h = appCompatImageView2;
        this.f93084i = appCompatTextView;
        this.f93085j = textView;
        this.f93086k = textView2;
        this.f93087l = textView3;
        this.f93088m = textView4;
        this.f93089n = textView5;
        this.f93090o = textView6;
        this.f93091p = textView7;
        this.f93092q = textView8;
        this.f93093r = textView9;
        this.f93094s = textView10;
        this.f93095t = view3;
    }
}
