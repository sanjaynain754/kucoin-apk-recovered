package bv;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;

/* JADX INFO: renamed from: bv.p0 */
/* JADX INFO: compiled from: QuoteViewTradechanceGemboxCurrencyBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4687p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4485a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4486b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f4487c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f4488d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f4489e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ChanceMarqueeView f4490f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4491g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4492h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4493i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4687p0 m4686a(@NonNull View view) {
        int i11 = R$id.ivGembox;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivLogo;
            CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView != null) {
                i11 = R$id.layoutNameRate;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.listHeat;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.marqueView;
                        ChanceMarqueeView chanceMarqueeView = (ChanceMarqueeView) ViewBindings.findChildViewById(view, i11);
                        if (chanceMarqueeView != null) {
                            i11 = R$id.tvCoinName;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_coin_price;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvCoinRate;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        return new C4687p0((ConstraintLayout) view, imageView, coinAvatarView, linearLayoutCompat, recyclerView, chanceMarqueeView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f4485a;
    }

    public C4687p0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull ChanceMarqueeView chanceMarqueeView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f4485a = constraintLayout;
        this.f4486b = imageView;
        this.f4487c = coinAvatarView;
        this.f4488d = linearLayoutCompat;
        this.f4489e = recyclerView;
        this.f4490f = chanceMarqueeView;
        this.f4491g = baseTextView;
        this.f4492h = baseTextView2;
        this.f4493i = baseTextView3;
    }
}
