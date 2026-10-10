package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: dm.r2 */
/* JADX INFO: compiled from: BkumexFragmentMarketBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36832r2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80959a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f80960b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f80961c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80962d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80963e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80964f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80965g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f80966h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80967i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80968j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80969k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80970l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80971m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80972n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RadioButton f80973o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80974p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AnimateDrawableEndView f80975q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final RadioButton f80976r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final RadioGroupPlus f80977s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80978t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f80979u;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36832r2 m82527a(@NonNull View view) {
        int i11 = R$id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.bottomTradeInfoFl;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.coin_vol_quote;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.coin_vol_quote_label;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.high24hLabel;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.high24hValue;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.kline;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout2 != null) {
                                    i11 = R$id.lastPrice;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.lastPriceLegal;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.low24hLabel;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.low24hValue;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.markLabel;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.markPrice;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.orderBookRb;
                                                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                            if (radioButton != null) {
                                                                i11 = R$id.priceRate;
                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView11 != null) {
                                                                    i11 = R$id.priceType;
                                                                    AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                                                    if (animateDrawableEndView != null) {
                                                                        i11 = R$id.recentDealRb;
                                                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                                        if (radioButton2 != null) {
                                                                            i11 = R$id.rgp;
                                                                            RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                                                            if (radioGroupPlus != null) {
                                                                                i11 = R$id.trade24hLabel;
                                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView12 != null) {
                                                                                    i11 = R$id.trade24hValue;
                                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView13 != null) {
                                                                                        return new C36832r2((LinearLayout) view, appBarLayout, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, frameLayout2, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, radioButton, baseTextView11, animateDrawableEndView, radioButton2, radioGroupPlus, baseTextView12, baseTextView13);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f80959a;
    }

    public C36832r2(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull FrameLayout frameLayout2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull RadioButton radioButton, @NonNull BaseTextView baseTextView11, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull RadioButton radioButton2, @NonNull RadioGroupPlus radioGroupPlus, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13) {
        this.f80959a = linearLayout;
        this.f80960b = appBarLayout;
        this.f80961c = frameLayout;
        this.f80962d = baseTextView;
        this.f80963e = baseTextView2;
        this.f80964f = baseTextView3;
        this.f80965g = baseTextView4;
        this.f80966h = frameLayout2;
        this.f80967i = baseTextView5;
        this.f80968j = baseTextView6;
        this.f80969k = baseTextView7;
        this.f80970l = baseTextView8;
        this.f80971m = baseTextView9;
        this.f80972n = baseTextView10;
        this.f80973o = radioButton;
        this.f80974p = baseTextView11;
        this.f80975q = animateDrawableEndView;
        this.f80976r = radioButton2;
        this.f80977s = radioGroupPlus;
        this.f80978t = baseTextView12;
        this.f80979u = baseTextView13;
    }
}
