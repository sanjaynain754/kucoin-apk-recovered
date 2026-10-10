package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TrendChartView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.d */
/* JADX INFO: compiled from: BkumexDialogAirdropBonusBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36745d implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f79833A;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79834a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeTextView f79835b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f79836c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f79837d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f79838e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TrendChartView f79839f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f79840g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f79841h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f79842i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79843j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShapeTextView f79844k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f79845l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatImageView f79846m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShapeTextView f79847n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f79848o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final LinearLayout f79849p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShapeTextView f79850q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f79851r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final AppCompatTextView f79852s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final AppCompatTextView f79853t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f79854u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final KcPrimaryButton f79855v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ShapeConstraintLayout f79856w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f79857x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ImageView f79858y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f79859z;

    public C36745d(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeTextView shapeTextView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TrendChartView trendChartView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShapeTextView shapeTextView2, @NonNull BaseTextView baseTextView4, @NonNull AppCompatImageView appCompatImageView, @NonNull ShapeTextView shapeTextView3, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull ShapeTextView shapeTextView4, @NonNull BaseTextView baseTextView5, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull BaseTextView baseTextView6, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView7, @NonNull ImageView imageView3, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f79834a = constraintLayout;
        this.f79835b = shapeTextView;
        this.f79836c = textView;
        this.f79837d = imageView;
        this.f79838e = kcPrimaryButton;
        this.f79839f = trendChartView;
        this.f79840g = imageView2;
        this.f79841h = baseTextView;
        this.f79842i = baseTextView2;
        this.f79843j = baseTextView3;
        this.f79844k = shapeTextView2;
        this.f79845l = baseTextView4;
        this.f79846m = appCompatImageView;
        this.f79847n = shapeTextView3;
        this.f79848o = view;
        this.f79849p = linearLayout;
        this.f79850q = shapeTextView4;
        this.f79851r = baseTextView5;
        this.f79852s = appCompatTextView;
        this.f79853t = appCompatTextView2;
        this.f79854u = baseTextView6;
        this.f79855v = kcPrimaryButton2;
        this.f79856w = shapeConstraintLayout;
        this.f79857x = baseTextView7;
        this.f79858y = imageView3;
        this.f79859z = baseTextView8;
        this.f79833A = baseTextView9;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36745d m82341a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.airdrop;
        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
        if (shapeTextView != null) {
            i11 = R$id.bubble;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.bubbleImg;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.buy;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.chart;
                        TrendChartView trendChartView = (TrendChartView) ViewBindings.findChildViewById(view, i11);
                        if (trendChartView != null) {
                            i11 = R$id.close;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.day;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.dialogDesc;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.dialogTitle;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.hint;
                                            ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                            if (shapeTextView2 != null) {
                                                i11 = R$id.hour;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.icon;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatImageView != null) {
                                                        i11 = R$id.leverage;
                                                        ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (shapeTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                                            i11 = R$id.ll_container;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (linearLayout != null) {
                                                                i11 = R$id.marginMode;
                                                                ShapeTextView shapeTextView4 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (shapeTextView4 != null) {
                                                                    i11 = R$id.minute;
                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView5 != null) {
                                                                        i11 = R$id.price;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (appCompatTextView != null) {
                                                                            i11 = R$id.rate;
                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (appCompatTextView2 != null) {
                                                                                i11 = R$id.rule;
                                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView6 != null) {
                                                                                    i11 = R$id.sell;
                                                                                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                    if (kcPrimaryButton2 != null) {
                                                                                        i11 = R$id.shapelayout;
                                                                                        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                        if (shapeConstraintLayout != null) {
                                                                                            i11 = R$id.symbol;
                                                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView7 != null) {
                                                                                                i11 = R$id.top_img;
                                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (imageView3 != null) {
                                                                                                    i11 = R$id.value;
                                                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView8 != null) {
                                                                                                        i11 = R$id.valueLabel;
                                                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView9 != null) {
                                                                                                            return new C36745d((ConstraintLayout) view, shapeTextView, textView, imageView, kcPrimaryButton, trendChartView, imageView2, baseTextView, baseTextView2, baseTextView3, shapeTextView2, baseTextView4, appCompatImageView, shapeTextView3, viewFindChildViewById, linearLayout, shapeTextView4, baseTextView5, appCompatTextView, appCompatTextView2, baseTextView6, kcPrimaryButton2, shapeConstraintLayout, baseTextView7, imageView3, baseTextView8, baseTextView9);
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
    public ConstraintLayout getRoot() {
        return this.f79834a;
    }
}
