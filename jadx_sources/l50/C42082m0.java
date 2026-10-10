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

/* JADX INFO: renamed from: l50.m0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListItemFailedLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42082m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93058a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93059b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f93060c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f93061d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f93062e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f93063f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f93064g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42082m0 m92317a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier_start;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.investment_amount_top))) != null) {
            i11 = R$id.iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tv_start_failed_reason_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_start_failed_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        i11 = R$id.tv_symbol_info;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView3 != null) {
                            return new C42082m0((ConstraintLayout) view, barrier, viewFindChildViewById, appCompatImageView, textView, textView2, textView3);
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
        return this.f93058a;
    }

    public C42082m0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f93058a = constraintLayout;
        this.f93059b = barrier;
        this.f93060c = view;
        this.f93061d = appCompatImageView;
        this.f93062e = textView;
        this.f93063f = textView2;
        this.f93064g = textView3;
    }
}
