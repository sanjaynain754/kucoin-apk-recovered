package jo;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: jo.j */
/* JADX INFO: compiled from: BloanLayoutBorrowOverviewBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40459j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f89810a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DashTextView f89811b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f89812c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f89813d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f89814e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f89815f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f89816g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f89817h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f89818i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f89819j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final DashTextView f89820k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f89821l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f89822m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f89823n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f89824o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40459j m89107a(@NonNull View view) {
        int i11 = R$id.maxLoanLabel;
        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
        if (dashTextView != null) {
            i11 = R$id.tv_account;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tv_asset;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    i11 = R$id.tv_borrow;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView3 != null) {
                        i11 = R$id.tvCouponsLabel;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView4 != null) {
                            i11 = R$id.tvCouponsValue;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView5 != null) {
                                i11 = R$id.tvDebtDesc;
                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView2 != null) {
                                    i11 = R$id.tvDebtDescGo;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView6 != null) {
                                        i11 = R$id.tv_lever;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView7 != null) {
                                            i11 = R$id.tv_lever_title;
                                            DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView3 != null) {
                                                i11 = R$id.tv_max_borrow;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView8 != null) {
                                                    i11 = R$id.tvNetAssets;
                                                    DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView4 != null) {
                                                        i11 = R$id.tv_rate;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView9 != null) {
                                                            i11 = R$id.tvRateLabel;
                                                            DashTextView dashTextView5 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView5 != null) {
                                                                return new C40459j((ConstraintLayout) view, dashTextView, textView, textView2, textView3, textView4, textView5, dashTextView2, textView6, textView7, dashTextView3, textView8, dashTextView4, textView9, dashTextView5);
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
        return this.f89810a;
    }

    public C40459j(@NonNull ConstraintLayout constraintLayout, @NonNull DashTextView dashTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull DashTextView dashTextView2, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull DashTextView dashTextView3, @NonNull TextView textView8, @NonNull DashTextView dashTextView4, @NonNull TextView textView9, @NonNull DashTextView dashTextView5) {
        this.f89810a = constraintLayout;
        this.f89811b = dashTextView;
        this.f89812c = textView;
        this.f89813d = textView2;
        this.f89814e = textView3;
        this.f89815f = textView4;
        this.f89816g = textView5;
        this.f89817h = dashTextView2;
        this.f89818i = textView6;
        this.f89819j = textView7;
        this.f89820k = dashTextView3;
        this.f89821l = textView8;
        this.f89822m = dashTextView4;
        this.f89823n = textView9;
        this.f89824o = dashTextView5;
    }
}
