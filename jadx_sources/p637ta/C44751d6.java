package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: ta.d6 */
/* JADX INFO: compiled from: ViewIsolatedAssetsPositionBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44751d6 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final DashTextView f99757A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final ShowHideTextView f99758B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final BaseTextView f99759C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final BaseTextView f99760D;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99761a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f99762b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99763c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinAvatarView f99764d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99765e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f99766f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99767g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99768h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f99769i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f99770j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99771k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f99772l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f99773m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99774n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99775o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99776p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f99777q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final DashTextView f99778r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f99779s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final DashTextView f99780t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ShowHideTextView f99781u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ShowHideTextView f99782v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f99783w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final ShowHideTextView f99784x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ShowHideTextView f99785y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f99786z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44751d6 m99016a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.ivBaseIcon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.iv_question;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivQuoteIcon;
                CoinAvatarView coinAvatarView2 = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.lineBase))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.lineQuote))) != null) {
                    i11 = R$id.ll_profit;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.tvBase;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_base_debt;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                i11 = R$id.tv_base_freeze_balance;
                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView2 != null) {
                                    i11 = R$id.tvBaseMarkPrice;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvBaseMarkPriceLabel;
                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                        if (dashTextView != null) {
                                            i11 = R$id.tv_base_total_balance;
                                            ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView3 != null) {
                                                i11 = R$id.tv_debt;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tv_debt_1;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tv_freeze_balance;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            i11 = R$id.tv_freeze_balance_base;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.tv_liquid;
                                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (dashTextView2 != null) {
                                                                    i11 = R$id.tv_liquid_price;
                                                                    ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView4 != null) {
                                                                        i11 = R$id.tv_profit;
                                                                        DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (dashTextView3 != null) {
                                                                            i11 = R$id.tv_profit_value;
                                                                            ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (showHideTextView5 != null) {
                                                                                i11 = R$id.tv_profit_value_legal;
                                                                                ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (showHideTextView6 != null) {
                                                                                    i11 = R$id.tvQuote;
                                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView7 != null) {
                                                                                        i11 = R$id.tv_quote_debt;
                                                                                        ShowHideTextView showHideTextView7 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (showHideTextView7 != null) {
                                                                                            i11 = R$id.tv_quote_freeze_balance;
                                                                                            ShowHideTextView showHideTextView8 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (showHideTextView8 != null) {
                                                                                                i11 = R$id.tvQuoteMarkPrice;
                                                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView8 != null) {
                                                                                                    i11 = R$id.tvQuoteMarkPriceLabel;
                                                                                                    DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (dashTextView4 != null) {
                                                                                                        i11 = R$id.tv_quote_total_balance;
                                                                                                        ShowHideTextView showHideTextView9 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (showHideTextView9 != null) {
                                                                                                            i11 = R$id.tv_total_balance;
                                                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView9 != null) {
                                                                                                                i11 = R$id.tv_total_balance_base;
                                                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (baseTextView10 != null) {
                                                                                                                    return new C44751d6((LinearLayout) view, coinAvatarView, imageView, coinAvatarView2, viewFindChildViewById, viewFindChildViewById2, linearLayout, baseTextView, showHideTextView, showHideTextView2, baseTextView2, dashTextView, showHideTextView3, baseTextView3, baseTextView4, baseTextView5, baseTextView6, dashTextView2, showHideTextView4, dashTextView3, showHideTextView5, showHideTextView6, baseTextView7, showHideTextView7, showHideTextView8, baseTextView8, dashTextView4, showHideTextView9, baseTextView9, baseTextView10);
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
        return this.f99761a;
    }

    public C44751d6(@NonNull LinearLayout linearLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView2, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView4, @NonNull DashTextView dashTextView3, @NonNull ShowHideTextView showHideTextView5, @NonNull ShowHideTextView showHideTextView6, @NonNull BaseTextView baseTextView7, @NonNull ShowHideTextView showHideTextView7, @NonNull ShowHideTextView showHideTextView8, @NonNull BaseTextView baseTextView8, @NonNull DashTextView dashTextView4, @NonNull ShowHideTextView showHideTextView9, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f99761a = linearLayout;
        this.f99762b = coinAvatarView;
        this.f99763c = imageView;
        this.f99764d = coinAvatarView2;
        this.f99765e = view;
        this.f99766f = view2;
        this.f99767g = linearLayout2;
        this.f99768h = baseTextView;
        this.f99769i = showHideTextView;
        this.f99770j = showHideTextView2;
        this.f99771k = baseTextView2;
        this.f99772l = dashTextView;
        this.f99773m = showHideTextView3;
        this.f99774n = baseTextView3;
        this.f99775o = baseTextView4;
        this.f99776p = baseTextView5;
        this.f99777q = baseTextView6;
        this.f99778r = dashTextView2;
        this.f99779s = showHideTextView4;
        this.f99780t = dashTextView3;
        this.f99781u = showHideTextView5;
        this.f99782v = showHideTextView6;
        this.f99783w = baseTextView7;
        this.f99784x = showHideTextView7;
        this.f99785y = showHideTextView8;
        this.f99786z = baseTextView8;
        this.f99757A = dashTextView4;
        this.f99758B = showHideTextView9;
        this.f99759C = baseTextView9;
        this.f99760D = baseTextView10;
    }
}
