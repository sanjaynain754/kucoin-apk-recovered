package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;

/* JADX INFO: renamed from: ft.d0 */
/* JADX INFO: compiled from: BotcFragmentThirdQuoteBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37607d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83761a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C37609d2 f83762b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FilterEmojiEditText f83763c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f83764d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f83765e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f83766f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83767g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83768h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83769i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f83770j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83771k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83772l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83773m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83774n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f83775o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f83776p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f83777q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f83778r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final RecyclerView f83779s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final View f83780t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ConstraintLayout f83781u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final View f83782v;

    public C37607d0(@NonNull ConstraintLayout constraintLayout, @NonNull C37609d2 c37609d2, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view3) {
        this.f83761a = constraintLayout;
        this.f83762b = c37609d2;
        this.f83763c = filterEmojiEditText;
        this.f83764d = imageView;
        this.f83765e = imageView2;
        this.f83766f = frameLayout;
        this.f83767g = baseTextView;
        this.f83768h = baseTextView2;
        this.f83769i = baseTextView3;
        this.f83770j = baseTextView4;
        this.f83771k = baseTextView5;
        this.f83772l = baseTextView6;
        this.f83773m = baseTextView7;
        this.f83774n = baseTextView8;
        this.f83775o = baseTextView9;
        this.f83776p = baseTextView10;
        this.f83777q = baseTextView11;
        this.f83778r = view;
        this.f83779s = recyclerView;
        this.f83780t = view2;
        this.f83781u = constraintLayout2;
        this.f83782v = view3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37607d0 m84796a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.banner;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById4 != null) {
            C37609d2 c37609d2M84800a = C37609d2.m84800a(viewFindChildViewById4);
            i11 = R$id.et_input;
            FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
            if (filterEmojiEditText != null) {
                i11 = R$id.iv_paytype;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_second;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.layout_banner;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            i11 = R$id.tv_amount_title;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_channel_title;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_coin_title;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_confirm;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_currency;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_currency_name;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_fiat;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_fiat_limit_error;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tv_pay_type_title;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.tv_paytype;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.tv_tip;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_amount_bg))) != null) {
                                                                        i11 = R$id.view_channel;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                                        if (recyclerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_coin_bg))) != null) {
                                                                            i11 = R$id.view_detail;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                            if (constraintLayout != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_pay_type_bg))) != null) {
                                                                                return new C37607d0((ConstraintLayout) view, c37609d2M84800a, filterEmojiEditText, imageView, imageView2, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, viewFindChildViewById, recyclerView, viewFindChildViewById2, constraintLayout, viewFindChildViewById3);
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
        return this.f83761a;
    }
}
