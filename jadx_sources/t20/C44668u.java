package t20;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.u */
/* JADX INFO: compiled from: BkucoinLayoutMarketDetailTickBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44668u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99367a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99368b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99369c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FixAutoSizeTextView f99370d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99371e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f99372f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99373g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99374h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final UpDownTextView f99375i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99376j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99377k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99378l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99379m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99380n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ConstraintLayout f99381o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f99382p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayout f99383q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final FlexboxLayout f99384r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShapeTextView f99385s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44668u m98812a(@NonNull View view) {
        int i11 = R$id.coin_low_price;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.coin_low_price_label;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.coin_price;
                FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                if (fixAutoSizeTextView != null) {
                    i11 = R$id.coin_rank_info;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.coin_rank_more;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.coin_top_price;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.coin_top_price_label;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.coin_turnover;
                                    UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                                    if (upDownTextView != null) {
                                        i11 = R$id.coin_unit;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.coin_vol_base;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.coin_vol_base_label;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.coin_vol_quote;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.coin_vol_quote_label;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.info_left;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (constraintLayout != null) {
                                                                i11 = R$id.info_right;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout2 != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) view;
                                                                    i11 = R$id.ll_unit;
                                                                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (flexboxLayout != null) {
                                                                        i11 = R$id.tvLabel;
                                                                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (shapeTextView != null) {
                                                                            return new C44668u(linearLayout, baseTextView, baseTextView2, fixAutoSizeTextView, baseTextView3, imageView, baseTextView4, baseTextView5, upDownTextView, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, constraintLayout, constraintLayout2, linearLayout, flexboxLayout, shapeTextView);
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
        return this.f99367a;
    }

    public C44668u(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull BaseTextView baseTextView3, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull UpDownTextView upDownTextView, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout2, @NonNull FlexboxLayout flexboxLayout, @NonNull ShapeTextView shapeTextView) {
        this.f99367a = linearLayout;
        this.f99368b = baseTextView;
        this.f99369c = baseTextView2;
        this.f99370d = fixAutoSizeTextView;
        this.f99371e = baseTextView3;
        this.f99372f = imageView;
        this.f99373g = baseTextView4;
        this.f99374h = baseTextView5;
        this.f99375i = upDownTextView;
        this.f99376j = baseTextView6;
        this.f99377k = baseTextView7;
        this.f99378l = baseTextView8;
        this.f99379m = baseTextView9;
        this.f99380n = baseTextView10;
        this.f99381o = constraintLayout;
        this.f99382p = constraintLayout2;
        this.f99383q = linearLayout2;
        this.f99384r = flexboxLayout;
        this.f99385s = shapeTextView;
    }
}
