package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: ta.b6 */
/* JADX INFO: compiled from: ViewIsolatedAssetsDetailPositionBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44735b6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99635a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f99636b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99637c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinAvatarView f99638d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99639e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f99640f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99641g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f99642h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RecyclerView f99643i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99644j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final DashTextView f99645k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f99646l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f99647m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f99648n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f99649o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99650p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44735b6 m98980a(@NonNull View view) {
        int i11 = R$id.ivBaseIcon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.iv_question;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivQuoteIcon;
                CoinAvatarView coinAvatarView2 = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView2 != null) {
                    i11 = R$id.llBase;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.ll_profit;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.llQuote;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.recyclerViewBase;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (recyclerView != null) {
                                    i11 = R$id.recyclerViewQuote;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView2 != null) {
                                        i11 = R$id.tvBase;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_liquid;
                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView != null) {
                                                i11 = R$id.tv_liquid_price;
                                                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView != null) {
                                                    i11 = R$id.tv_profit;
                                                    DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView2 != null) {
                                                        i11 = R$id.tv_profit_value;
                                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView2 != null) {
                                                            i11 = R$id.tv_profit_value_legal;
                                                            ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView3 != null) {
                                                                i11 = R$id.tvQuote;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    return new C44735b6((LinearLayout) view, coinAvatarView, imageView, coinAvatarView2, linearLayout, linearLayout2, linearLayout3, recyclerView, recyclerView2, baseTextView, dashTextView, showHideTextView, dashTextView2, showHideTextView2, showHideTextView3, baseTextView2);
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
        return this.f99635a;
    }

    public C44735b6(@NonNull LinearLayout linearLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView2) {
        this.f99635a = linearLayout;
        this.f99636b = coinAvatarView;
        this.f99637c = imageView;
        this.f99638d = coinAvatarView2;
        this.f99639e = linearLayout2;
        this.f99640f = linearLayout3;
        this.f99641g = linearLayout4;
        this.f99642h = recyclerView;
        this.f99643i = recyclerView2;
        this.f99644j = baseTextView;
        this.f99645k = dashTextView;
        this.f99646l = showHideTextView;
        this.f99647m = dashTextView2;
        this.f99648n = showHideTextView2;
        this.f99649o = showHideTextView3;
        this.f99650p = baseTextView2;
    }
}
