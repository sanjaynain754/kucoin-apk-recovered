package w30;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.SpotKycLeadView;

/* JADX INFO: renamed from: w30.b */
/* JADX INFO: compiled from: KucoinFragmentTradeBinding.java */
/* JADX INFO: loaded from: classes50.dex */
public final class C45715b implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final TextView f103058A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final TextView f103059B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final View f103060C;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f103061a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f103062b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f103063c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f103064d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final HorizontalScrollView f103065e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f103066f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f103067g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f103068h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f103069i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final SpotKycLeadView f103070j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f103071k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RadioButton f103072l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f103073m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RadioButton f103074n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f103075o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final RadioGroupPlus f103076p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final RadioButton f103077q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final RadioButton f103078r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final FrameLayout f103079s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ConstraintLayout f103080t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ConstraintLayout f103081u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final LinearLayoutCompat f103082v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final FrameLayout f103083w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f103084x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final FrameLayout f103085y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final ConstraintLayout f103086z;

    public C45715b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull HorizontalScrollView horizontalScrollView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull SpotKycLeadView spotKycLeadView, @NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull TextView textView, @NonNull RadioButton radioButton2, @NonNull TextView textView2, @NonNull RadioGroupPlus radioGroupPlus, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull FrameLayout frameLayout4, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout5, @NonNull View view, @NonNull FrameLayout frameLayout6, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view2) {
        this.f103061a = constraintLayout;
        this.f103062b = frameLayout;
        this.f103063c = frameLayout2;
        this.f103064d = frameLayout3;
        this.f103065e = horizontalScrollView;
        this.f103066f = imageView;
        this.f103067g = imageView2;
        this.f103068h = appCompatImageView;
        this.f103069i = appCompatImageView2;
        this.f103070j = spotKycLeadView;
        this.f103071k = linearLayout;
        this.f103072l = radioButton;
        this.f103073m = textView;
        this.f103074n = radioButton2;
        this.f103075o = textView2;
        this.f103076p = radioGroupPlus;
        this.f103077q = radioButton3;
        this.f103078r = radioButton4;
        this.f103079s = frameLayout4;
        this.f103080t = constraintLayout2;
        this.f103081u = constraintLayout3;
        this.f103082v = linearLayoutCompat;
        this.f103083w = frameLayout5;
        this.f103084x = view;
        this.f103085y = frameLayout6;
        this.f103086z = constraintLayout4;
        this.f103058A = textView3;
        this.f103059B = textView4;
        this.f103060C = view2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45715b m100913a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.flCash;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.flLever;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.fl_main_container;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout3 != null) {
                    i11 = R$id.hsl;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                    if (horizontalScrollView != null) {
                        i11 = R$id.iv_back;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.iv_bonus;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.ivPreShadowSettings;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView != null) {
                                    i11 = R$id.ivTabSettings;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView2 != null) {
                                        i11 = R$id.kycLeadView;
                                        SpotKycLeadView spotKycLeadView = (SpotKycLeadView) ViewBindings.findChildViewById(view, i11);
                                        if (spotKycLeadView != null) {
                                            i11 = R$id.lever_gift_view;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout != null) {
                                                i11 = R$id.rb_alpha;
                                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                if (radioButton != null) {
                                                    i11 = R$id.rb_cash;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView != null) {
                                                        i11 = R$id.rb_coin;
                                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                        if (radioButton2 != null) {
                                                            i11 = R$id.rb_coin_convert;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView2 != null) {
                                                                i11 = R$id.rb_group;
                                                                RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                                                if (radioGroupPlus != null) {
                                                                    i11 = R$id.rb_lever;
                                                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (radioButton3 != null) {
                                                                        i11 = R$id.rb_robot;
                                                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                                        if (radioButton4 != null) {
                                                                            i11 = R$id.robotFl;
                                                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                            if (frameLayout4 != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                i11 = R$id.trade_header_container;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                if (constraintLayout2 != null) {
                                                                                    i11 = R$id.tradeKlineContainer;
                                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                    if (linearLayoutCompat != null) {
                                                                                        i11 = R$id.tradeKlineContent;
                                                                                        FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                                        if (frameLayout5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.tradeKlineLine))) != null) {
                                                                                            i11 = R$id.tradeKlineToggle;
                                                                                            FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                                            if (frameLayout6 != null) {
                                                                                                i11 = R$id.trade_top_header;
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                if (constraintLayout3 != null) {
                                                                                                    i11 = R$id.tradeTvKlineStatusTrade;
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (textView3 != null) {
                                                                                                        i11 = R$id.tv_activity;
                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                                                                            return new C45715b(constraintLayout, frameLayout, frameLayout2, frameLayout3, horizontalScrollView, imageView, imageView2, appCompatImageView, appCompatImageView2, spotKycLeadView, linearLayout, radioButton, textView, radioButton2, textView2, radioGroupPlus, radioButton3, radioButton4, frameLayout4, constraintLayout, constraintLayout2, linearLayoutCompat, frameLayout5, viewFindChildViewById, frameLayout6, constraintLayout3, textView3, textView4, viewFindChildViewById2);
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
        return this.f103061a;
    }
}
