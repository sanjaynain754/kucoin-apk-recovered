package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcCoordinatorLayout;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.button.KcTextButton;

/* JADX INFO: renamed from: gq.o */
/* JADX INFO: compiled from: KucoinFragmentSettingsBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37994o implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final KcTextButton f85556A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f85557B;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f85558a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f85559b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f85560c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f85561d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f85562e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f85563f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f85564g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f85565h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f85566i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f85567j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FrameLayout f85568k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f85569l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FrameLayout f85570m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final FrameLayout f85571n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FrameLayout f85572o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final FrameLayout f85573p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final FrameLayout f85574q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ConstraintLayout f85575r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ImageView f85576s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final LinearLayout f85577t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f85578u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f85579v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f85580w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f85581x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f85582y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f85583z;

    public C37994o(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull FrameLayout frameLayout7, @NonNull FrameLayout frameLayout8, @NonNull FrameLayout frameLayout9, @NonNull FrameLayout frameLayout10, @NonNull FrameLayout frameLayout11, @NonNull FrameLayout frameLayout12, @NonNull FrameLayout frameLayout13, @NonNull FrameLayout frameLayout14, @NonNull FrameLayout frameLayout15, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull KcTextButton kcTextButton, @NonNull BaseTextView baseTextView7) {
        this.f85558a = kcCoordinatorLayout;
        this.f85559b = kcSecondaryButton;
        this.f85560c = frameLayout;
        this.f85561d = frameLayout2;
        this.f85562e = frameLayout3;
        this.f85563f = frameLayout4;
        this.f85564g = frameLayout5;
        this.f85565h = frameLayout6;
        this.f85566i = frameLayout7;
        this.f85567j = frameLayout8;
        this.f85568k = frameLayout9;
        this.f85569l = frameLayout10;
        this.f85570m = frameLayout11;
        this.f85571n = frameLayout12;
        this.f85572o = frameLayout13;
        this.f85573p = frameLayout14;
        this.f85574q = frameLayout15;
        this.f85575r = constraintLayout;
        this.f85576s = imageView;
        this.f85577t = linearLayout;
        this.f85578u = baseTextView;
        this.f85579v = baseTextView2;
        this.f85580w = baseTextView3;
        this.f85581x = baseTextView4;
        this.f85582y = baseTextView5;
        this.f85583z = baseTextView6;
        this.f85556A = kcTextButton;
        this.f85557B = baseTextView7;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37994o m85863a(@NonNull View view) {
        int i11 = R$id.btn_switch_account;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.deal_amount_unit;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.fl_about_us;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout2 != null) {
                    i11 = R$id.fl_beep;
                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout3 != null) {
                        i11 = R$id.fl_clear_cache;
                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout4 != null) {
                            i11 = R$id.fl_clipboard;
                            FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout5 != null) {
                                i11 = R$id.fl_currency;
                                FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout6 != null) {
                                    i11 = R$id.fl_dayNightTheme_seting;
                                    FrameLayout frameLayout7 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout7 != null) {
                                        i11 = R$id.fl_feed_back;
                                        FrameLayout frameLayout8 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                        if (frameLayout8 != null) {
                                            i11 = R$id.fl_join_test;
                                            FrameLayout frameLayout9 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                            if (frameLayout9 != null) {
                                                i11 = R$id.fl_language;
                                                FrameLayout frameLayout10 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout10 != null) {
                                                    i11 = R$id.fl_notice_manage;
                                                    FrameLayout frameLayout11 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (frameLayout11 != null) {
                                                        i11 = R$id.fl_qa_request;
                                                        FrameLayout frameLayout12 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (frameLayout12 != null) {
                                                            i11 = R$id.fl_system_permission;
                                                            FrameLayout frameLayout13 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (frameLayout13 != null) {
                                                                i11 = R$id.fl_time_tracking;
                                                                FrameLayout frameLayout14 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (frameLayout14 != null) {
                                                                    i11 = R$id.fl_toggle_net;
                                                                    FrameLayout frameLayout15 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (frameLayout15 != null) {
                                                                        i11 = R$id.fl_up_down;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                        if (constraintLayout != null) {
                                                                            i11 = R$id.iv_up_down;
                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                                            if (imageView != null) {
                                                                                i11 = R$id.ll_account_actions;
                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                                if (linearLayout != null) {
                                                                                    i11 = R$id.tv_cache;
                                                                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView != null) {
                                                                                        i11 = R$id.tv_currency;
                                                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView2 != null) {
                                                                                            i11 = R$id.tv_current_line;
                                                                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView3 != null) {
                                                                                                i11 = R$id.tv_dayNightTheme_mode;
                                                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView4 != null) {
                                                                                                    i11 = R$id.tv_deal_vol_unit;
                                                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView5 != null) {
                                                                                                        i11 = R$id.tv_language_status;
                                                                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView6 != null) {
                                                                                                            i11 = R$id.tv_logout;
                                                                                                            KcTextButton kcTextButton = (KcTextButton) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (kcTextButton != null) {
                                                                                                                i11 = R$id.tv_up_down;
                                                                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (baseTextView7 != null) {
                                                                                                                    return new C37994o((KcCoordinatorLayout) view, kcSecondaryButton, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, frameLayout7, frameLayout8, frameLayout9, frameLayout10, frameLayout11, frameLayout12, frameLayout13, frameLayout14, frameLayout15, constraintLayout, imageView, linearLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, kcTextButton, baseTextView7);
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
    public KcCoordinatorLayout getRoot() {
        return this.f85558a;
    }
}
