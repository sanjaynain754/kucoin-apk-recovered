package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.d1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37608d1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83783a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f83784b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83785c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f83786d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f83787e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f83788f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f83789g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83790h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83791i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f83792j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83793k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83794l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83795m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83796n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f83797o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f83798p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayout f83799q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f83800r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final LinearLayout f83801s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37608d1 m84798a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.et_fast_buy_input;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.iv_coin;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_frequency;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_recurring_question;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.iv_switch;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView3 != null) {
                            i11 = R$id.ll_recurring;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.tv_coin_full_name;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_coin_name;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_confirm;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            i11 = R$id.tv_input_currency;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_limit;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_need_higher_limits;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_recurring;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tv_switch_name;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_coin_bg))) != null) {
                                                                i11 = R$id.view_input;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_input_line))) != null) {
                                                                    i11 = R$id.view_switch;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (linearLayout3 != null) {
                                                                        return new C37608d1((ConstraintLayout) view, filterEmojiEditText, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayout, baseTextView, baseTextView2, kcPrimaryButton, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, viewFindChildViewById, linearLayout2, viewFindChildViewById2, linearLayout3);
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
        return this.f83783a;
    }

    public C37608d1(@NonNull ConstraintLayout constraintLayout, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull View view2, @NonNull LinearLayout linearLayout3) {
        this.f83783a = constraintLayout;
        this.f83784b = filterEmojiEditText;
        this.f83785c = imageView;
        this.f83786d = appCompatImageView;
        this.f83787e = appCompatImageView2;
        this.f83788f = appCompatImageView3;
        this.f83789g = linearLayout;
        this.f83790h = baseTextView;
        this.f83791i = baseTextView2;
        this.f83792j = kcPrimaryButton;
        this.f83793k = baseTextView3;
        this.f83794l = baseTextView4;
        this.f83795m = baseTextView5;
        this.f83796n = baseTextView6;
        this.f83797o = baseTextView7;
        this.f83798p = view;
        this.f83799q = linearLayout2;
        this.f83800r = view2;
        this.f83801s = linearLayout3;
    }
}
