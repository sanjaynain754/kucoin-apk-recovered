package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: dm.a */
/* JADX INFO: compiled from: BkucoinFragmentNewMexReadyBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36727a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79648a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatTextView f79649b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f79650c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f79651d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f79652e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f79653f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f79654g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeLinearLayout f79655h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeLinearLayout f79656i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeLinearLayout f79657j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShapeLinearLayout f79658k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f79659l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f79660m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f79661n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f79662o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f79663p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f79664q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f79665r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f79666s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f79667t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f79668u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f79669v;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36727a m82303a(@NonNull View view) {
        int i11 = R$id.TvPreMarketIntroduce;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
        if (appCompatTextView != null) {
            i11 = R$id.btMore;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.countdownContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.daysLabel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.hoursLabel;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.ivCoin;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.llDay;
                                ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (shapeLinearLayout != null) {
                                    i11 = R$id.llHour;
                                    ShapeLinearLayout shapeLinearLayout2 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (shapeLinearLayout2 != null) {
                                        i11 = R$id.llMin;
                                        ShapeLinearLayout shapeLinearLayout3 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (shapeLinearLayout3 != null) {
                                            i11 = R$id.llSec;
                                            ShapeLinearLayout shapeLinearLayout4 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (shapeLinearLayout4 != null) {
                                                i11 = R$id.minutesLabel;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView3 != null) {
                                                    i11 = R$id.secondsLabel;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView4 != null) {
                                                        i11 = R$id.separator1;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView5 != null) {
                                                            i11 = R$id.separator2;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView6 != null) {
                                                                i11 = R$id.separator3;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView7 != null) {
                                                                    i11 = R$id.tvDayValue;
                                                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView != null) {
                                                                        i11 = R$id.tvHourValue;
                                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView2 != null) {
                                                                            i11 = R$id.tvMinValue;
                                                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView3 != null) {
                                                                                i11 = R$id.tvOpeningTime;
                                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView4 != null) {
                                                                                    i11 = R$id.tvSecValue;
                                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView5 != null) {
                                                                                        i11 = R$id.tvSymbolName;
                                                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView6 != null) {
                                                                                            return new C36727a((LinearLayout) view, appCompatTextView, kcPrimaryButton, constraintLayout, textView, textView2, imageView, shapeLinearLayout, shapeLinearLayout2, shapeLinearLayout3, shapeLinearLayout4, textView3, textView4, textView5, textView6, textView7, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f79648a;
    }

    public C36727a(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull ShapeLinearLayout shapeLinearLayout3, @NonNull ShapeLinearLayout shapeLinearLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f79648a = linearLayout;
        this.f79649b = appCompatTextView;
        this.f79650c = kcPrimaryButton;
        this.f79651d = constraintLayout;
        this.f79652e = textView;
        this.f79653f = textView2;
        this.f79654g = imageView;
        this.f79655h = shapeLinearLayout;
        this.f79656i = shapeLinearLayout2;
        this.f79657j = shapeLinearLayout3;
        this.f79658k = shapeLinearLayout4;
        this.f79659l = textView3;
        this.f79660m = textView4;
        this.f79661n = textView5;
        this.f79662o = textView6;
        this.f79663p = textView7;
        this.f79664q = baseTextView;
        this.f79665r = baseTextView2;
        this.f79666s = baseTextView3;
        this.f79667t = baseTextView4;
        this.f79668u = baseTextView5;
        this.f79669v = baseTextView6;
    }
}
