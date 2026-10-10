package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DrawableDashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.r */
/* JADX INFO: compiled from: BkumexDialogFundingRateBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36829r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80918a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80919b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80920c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80921d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80922e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80923f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80924g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80925h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80926i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80927j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f80928k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DrawableDashTextView f80929l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f80930m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80931n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80932o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80933p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80934q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f80935r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KcPrimaryButton f80936s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final KcSecondaryButton f80937t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36829r m82521a(@NonNull View view) {
        int i11 = R$id.countdown;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.currencyTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.currentRate;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.currentRateLabel;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.desc;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.desc1;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.direction;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.learnMore;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.nextRate;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            i11 = R$id.nextRateContainer;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout != null) {
                                                i11 = R$id.nextRateLabel;
                                                DrawableDashTextView drawableDashTextView = (DrawableDashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (drawableDashTextView != null) {
                                                    i11 = R$id.nextRateLl;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat != null) {
                                                        i11 = R$id.previousRate;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.rateLimit;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.rateLimitLabel;
                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView12 != null) {
                                                                    i11 = R$id.settlementPeriod;
                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView13 != null) {
                                                                        i11 = R$id.title;
                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView14 != null) {
                                                                            i11 = R$id.tv_confirm;
                                                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                            if (kcPrimaryButton != null) {
                                                                                i11 = R$id.tv_confirm1;
                                                                                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                if (kcSecondaryButton != null) {
                                                                                    return new C36829r((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, linearLayout, drawableDashTextView, linearLayoutCompat, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, kcPrimaryButton, kcSecondaryButton);
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
    public LinearLayout getRoot() {
        return this.f80918a;
    }

    public C36829r(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull LinearLayout linearLayout2, @NonNull DrawableDashTextView drawableDashTextView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f80918a = linearLayout;
        this.f80919b = baseTextView;
        this.f80920c = baseTextView2;
        this.f80921d = baseTextView3;
        this.f80922e = baseTextView4;
        this.f80923f = baseTextView5;
        this.f80924g = baseTextView6;
        this.f80925h = baseTextView7;
        this.f80926i = baseTextView8;
        this.f80927j = baseTextView9;
        this.f80928k = linearLayout2;
        this.f80929l = drawableDashTextView;
        this.f80930m = linearLayoutCompat;
        this.f80931n = baseTextView10;
        this.f80932o = baseTextView11;
        this.f80933p = baseTextView12;
        this.f80934q = baseTextView13;
        this.f80935r = baseTextView14;
        this.f80936s = kcPrimaryButton;
        this.f80937t = kcSecondaryButton;
    }
}
