package l50;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.n */
/* JADX INFO: compiled from: BtradingBotKitFuturesGridFailedLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42083n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93065a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93066b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f93067c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f93068d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f93069e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f93070f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f93071g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f93072h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f93073i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f93074j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f93075k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42083n m92319a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.barrier_start;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_top;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
                i11 = R$id.iv_close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_strategy_type;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.start_view))) != null) {
                        i11 = R$id.tv_leverage;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.tv_start_failed_reason_text;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView3 != null) {
                                i11 = R$id.tv_start_failed_text;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView4 != null) {
                                    i11 = R$id.tv_symbol_info;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView5 != null) {
                                        return new C42083n((ConstraintLayout) view, barrier, barrier2, viewFindChildViewById, appCompatImageView, textView, viewFindChildViewById2, textView2, textView3, textView4, textView5);
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
        return this.f93065a;
    }

    public C42083n(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull View view2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f93065a = constraintLayout;
        this.f93066b = barrier;
        this.f93067c = barrier2;
        this.f93068d = view;
        this.f93069e = appCompatImageView;
        this.f93070f = textView;
        this.f93071g = view2;
        this.f93072h = textView2;
        this.f93073i = textView3;
        this.f93074j = textView4;
        this.f93075k = textView5;
    }
}
