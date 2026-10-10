package sl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.resources.widget.KcSwitchButton;

/* JADX INFO: renamed from: sl.b */
/* JADX INFO: compiled from: FragmentFloatingCustomContentBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44513b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f98587a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f98588b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f98589c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f98590d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSwitchButton f98591e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSwitchButton f98592f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f98593g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcSwitchButton f98594h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcSwitchButton f98595i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f98596j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f98597k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44513b m98486a(@NonNull View view) {
        int i11 = R$id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.floating_window_action_bar;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.floating_window_action_bar_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.floating_window_action_bar_switch;
                    KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                    if (kcSwitchButton != null) {
                        i11 = R$id.floating_window_change_percent_switch;
                        KcSwitchButton kcSwitchButton2 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSwitchButton2 != null) {
                            i11 = R$id.floating_window_currency_name_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = R$id.floating_window_currency_name_switch;
                                KcSwitchButton kcSwitchButton3 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                if (kcSwitchButton3 != null) {
                                    i11 = R$id.floating_window_fiat_price_switch;
                                    KcSwitchButton kcSwitchButton4 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcSwitchButton4 != null) {
                                        i11 = R$id.floating_window_setting_title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView2 != null) {
                                            i11 = R$id.floating_window_switch_layout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                            if (constraintLayout3 != null) {
                                                return new C44513b((LinearLayoutCompat) view, viewFindChildViewById, textView, constraintLayout, kcSwitchButton, kcSwitchButton2, constraintLayout2, kcSwitchButton3, kcSwitchButton4, textView2, constraintLayout3);
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
    public LinearLayoutCompat getRoot() {
        return this.f98587a;
    }

    public C44513b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull KcSwitchButton kcSwitchButton, @NonNull KcSwitchButton kcSwitchButton2, @NonNull ConstraintLayout constraintLayout2, @NonNull KcSwitchButton kcSwitchButton3, @NonNull KcSwitchButton kcSwitchButton4, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout3) {
        this.f98587a = linearLayoutCompat;
        this.f98588b = view;
        this.f98589c = textView;
        this.f98590d = constraintLayout;
        this.f98591e = kcSwitchButton;
        this.f98592f = kcSwitchButton2;
        this.f98593g = constraintLayout2;
        this.f98594h = kcSwitchButton3;
        this.f98595i = kcSwitchButton4;
        this.f98596j = textView2;
        this.f98597k = constraintLayout3;
    }
}
