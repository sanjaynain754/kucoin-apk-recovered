package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.y */
/* JADX INFO: compiled from: BkumexDialogFuturesCouponRulesBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36871y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f81342a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81343b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f81344c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81345d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81346e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81347f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81348g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81349h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f81350i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81351j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f81352k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f81353l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81354m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81355n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcPrimaryButton f81356o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36871y m82610a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.amountLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.amountLayout;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.amountValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.condition;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.deductionLabel;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.deductionRatio;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.expireLabel;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.expireLayout;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat2 != null) {
                                        i11 = R$id.expireValue;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line3))) != null) {
                                            i11 = R$id.ruleDetails;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                i11 = R$id.ruleUrl;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.tv_confirm;
                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcPrimaryButton != null) {
                                                        return new C36871y((LinearLayoutCompat) view, baseTextView, linearLayoutCompat, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, linearLayoutCompat2, baseTextView7, viewFindChildViewById, viewFindChildViewById2, baseTextView8, baseTextView9, kcPrimaryButton);
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
    public LinearLayoutCompat getRoot() {
        return this.f81342a;
    }

    public C36871y(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull BaseTextView baseTextView7, @NonNull View view, @NonNull View view2, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f81342a = linearLayoutCompat;
        this.f81343b = baseTextView;
        this.f81344c = linearLayoutCompat2;
        this.f81345d = baseTextView2;
        this.f81346e = baseTextView3;
        this.f81347f = baseTextView4;
        this.f81348g = baseTextView5;
        this.f81349h = baseTextView6;
        this.f81350i = linearLayoutCompat3;
        this.f81351j = baseTextView7;
        this.f81352k = view;
        this.f81353l = view2;
        this.f81354m = baseTextView8;
        this.f81355n = baseTextView9;
        this.f81356o = kcPrimaryButton;
    }
}
