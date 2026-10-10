package l50;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.q0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListItemStopReasonLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42090q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93234a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93235b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93236c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f93237d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f93238e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f93239f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f93240g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f93241h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f93242i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f93243j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f93244k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f93245l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f93246m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f93247n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f93248o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f93249p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f93250q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42090q0 m92333a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier_end;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_start;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                i11 = R$id.group_detail;
                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                    i11 = R$id.iv_close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.tv_detail_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView != null) {
                            i11 = R$id.tv_over_text;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.tv_returned_currency_account;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView2 != null) {
                                    i11 = R$id.tv_stop_price_number;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView3 != null) {
                                        i11 = R$id.tv_stop_price_text;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView4 != null) {
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
                                                            i11 = R$id.tv_total_profit_number_rate;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView9 != null) {
                                                                i11 = R$id.tv_total_profit_text;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView10 != null) {
                                                                    return new C42090q0((ConstraintLayout) view, barrier, barrier2, group, viewFindChildViewById, appCompatImageView, appCompatTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
        return this.f93234a;
    }

    public C42090q0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull Group group, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f93234a = constraintLayout;
        this.f93235b = barrier;
        this.f93236c = barrier2;
        this.f93237d = group;
        this.f93238e = view;
        this.f93239f = appCompatImageView;
        this.f93240g = appCompatTextView;
        this.f93241h = textView;
        this.f93242i = textView2;
        this.f93243j = textView3;
        this.f93244k = textView4;
        this.f93245l = textView5;
        this.f93246m = textView6;
        this.f93247n = textView7;
        this.f93248o = textView8;
        this.f93249p = textView9;
        this.f93250q = textView10;
    }
}
