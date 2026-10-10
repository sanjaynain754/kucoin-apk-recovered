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

/* JADX INFO: renamed from: l50.m */
/* JADX INFO: compiled from: BtradingBotKitFuturesGirdStopReasonLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42081m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93040a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93041b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f93042c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f93043d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f93044e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f93045f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f93046g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f93047h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f93048i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f93049j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f93050k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f93051l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f93052m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f93053n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f93054o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f93055p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f93056q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f93057r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42081m m92315a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier_end;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.group_detail;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                i11 = R$id.iv_close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_strategy_type;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_detail_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView != null) {
                            i11 = R$id.tv_leverage;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.tv_over_text;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    i11 = R$id.tv_returned_currency_account;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView4 != null) {
                                        i11 = R$id.tv_stop_price_number;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView5 != null) {
                                            i11 = R$id.tv_stop_price_text;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView6 != null) {
                                                i11 = R$id.tv_symbol_info;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView7 != null) {
                                                    i11 = R$id.tv_total_invest_number;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView8 != null) {
                                                        i11 = R$id.tv_total_invest_text;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView9 != null) {
                                                            i11 = R$id.tv_total_profit_number;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView10 != null) {
                                                                i11 = R$id.tv_total_profit_number_rate;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView11 != null) {
                                                                    i11 = R$id.tv_total_profit_text;
                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView12 != null) {
                                                                        return new C42081m((ConstraintLayout) view, barrier, group, viewFindChildViewById, appCompatImageView, textView, appCompatTextView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
        return this.f93040a;
    }

    public C42081m(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Group group, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12) {
        this.f93040a = constraintLayout;
        this.f93041b = barrier;
        this.f93042c = group;
        this.f93043d = view;
        this.f93044e = appCompatImageView;
        this.f93045f = textView;
        this.f93046g = appCompatTextView;
        this.f93047h = textView2;
        this.f93048i = textView3;
        this.f93049j = textView4;
        this.f93050k = textView5;
        this.f93051l = textView6;
        this.f93052m = textView7;
        this.f93053n = textView8;
        this.f93054o = textView9;
        this.f93055p = textView10;
        this.f93056q = textView11;
        this.f93057r = textView12;
    }
}
