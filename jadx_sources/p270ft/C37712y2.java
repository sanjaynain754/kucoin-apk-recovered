package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.y2 */
/* JADX INFO: compiled from: PaymentViewConfirmRecurringBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37712y2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84937a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f84938b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84939c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f84940d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84941e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84942f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84943g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84944h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84945i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84946j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84947k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84948l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84949m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84950n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37712y2 m85010a(@NonNull View view) {
        int i11 = R$id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.iv_recurring_fee_question;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.iv_recurring_price_question;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.tv_frequency;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_frequency_tip;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_next_payment_time_tip;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_recurring_amount;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_recurring_amount_tip;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_recurring_fee;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tv_recurring_fee_tip;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tv_recurring_price;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.tv_recurring_price_tip;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.tv_tv_next_payment_time;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            return new C37712y2(view, viewFindChildViewById, appCompatImageView, appCompatImageView2, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
    public View getRoot() {
        return this.f84937a;
    }

    public C37712y2(@NonNull View view, @NonNull View view2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f84937a = view;
        this.f84938b = view2;
        this.f84939c = appCompatImageView;
        this.f84940d = appCompatImageView2;
        this.f84941e = baseTextView;
        this.f84942f = baseTextView2;
        this.f84943g = baseTextView3;
        this.f84944h = baseTextView4;
        this.f84945i = baseTextView5;
        this.f84946j = baseTextView6;
        this.f84947k = baseTextView7;
        this.f84948l = baseTextView8;
        this.f84949m = baseTextView9;
        this.f84950n = baseTextView10;
    }
}
