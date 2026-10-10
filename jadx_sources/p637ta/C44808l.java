package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.autoearn.views.AutoEarnCoinEntryView;
import com.kubi.assets.overview.detail.CoinDetailAllocationView;
import com.kubi.assets.overview.detail.CoinDetailButtonView;
import com.kubi.assets.overview.detail.CoinDetailHeadView;
import com.kubi.assets.overview.detail.CoinDetailPerformanceView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;

/* JADX INFO: renamed from: ta.l */
/* JADX INFO: compiled from: AssetCoinDetailLayoutBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44808l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100318a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AutoEarnCoinEntryView f100319b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinDetailAllocationView f100320c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinDetailButtonView f100321d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100322e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CoinDetailHeadView f100323f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CoinDetailPerformanceView f100324g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ScrollView f100325h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f100326i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f100327j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final CoinAvatarView f100328k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ImageView f100329l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f100330m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayout f100331n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f100332o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f100333p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44808l m99136a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.autoEarnEntry;
        AutoEarnCoinEntryView autoEarnCoinEntryView = (AutoEarnCoinEntryView) ViewBindings.findChildViewById(view, i11);
        if (autoEarnCoinEntryView != null) {
            i11 = R$id.coin_allocation_view;
            CoinDetailAllocationView coinDetailAllocationView = (CoinDetailAllocationView) ViewBindings.findChildViewById(view, i11);
            if (coinDetailAllocationView != null) {
                i11 = R$id.coin_button_view;
                CoinDetailButtonView coinDetailButtonView = (CoinDetailButtonView) ViewBindings.findChildViewById(view, i11);
                if (coinDetailButtonView != null) {
                    i11 = R$id.coinEarnContainer;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.coin_head_view;
                        CoinDetailHeadView coinDetailHeadView = (CoinDetailHeadView) ViewBindings.findChildViewById(view, i11);
                        if (coinDetailHeadView != null) {
                            i11 = R$id.coin_performance_view;
                            CoinDetailPerformanceView coinDetailPerformanceView = (CoinDetailPerformanceView) ViewBindings.findChildViewById(view, i11);
                            if (coinDetailPerformanceView != null) {
                                i11 = R$id.content_layout;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i11);
                                if (scrollView != null) {
                                    i11 = R$id.fl_loading;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout != null) {
                                        i11 = R$id.iv_close;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView != null) {
                                            i11 = R$id.iv_icon;
                                            CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                                            if (coinAvatarView != null) {
                                                i11 = R$id.iv_kline;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadView))) != null) {
                                                    i11 = R$id.toolBar;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayout != null) {
                                                        i11 = R$id.tvCoinEarn;
                                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView != null) {
                                                            i11 = R$id.tv_title;
                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView2 != null) {
                                                                return new C44808l((ConstraintLayout) view, autoEarnCoinEntryView, coinDetailAllocationView, coinDetailButtonView, linearLayoutCompat, coinDetailHeadView, coinDetailPerformanceView, scrollView, frameLayout, imageView, coinAvatarView, imageView2, viewFindChildViewById, linearLayout, baseTextView, baseTextView2);
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
        return this.f100318a;
    }

    public C44808l(@NonNull ConstraintLayout constraintLayout, @NonNull AutoEarnCoinEntryView autoEarnCoinEntryView, @NonNull CoinDetailAllocationView coinDetailAllocationView, @NonNull CoinDetailButtonView coinDetailButtonView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull CoinDetailHeadView coinDetailHeadView, @NonNull CoinDetailPerformanceView coinDetailPerformanceView, @NonNull ScrollView scrollView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100318a = constraintLayout;
        this.f100319b = autoEarnCoinEntryView;
        this.f100320c = coinDetailAllocationView;
        this.f100321d = coinDetailButtonView;
        this.f100322e = linearLayoutCompat;
        this.f100323f = coinDetailHeadView;
        this.f100324g = coinDetailPerformanceView;
        this.f100325h = scrollView;
        this.f100326i = frameLayout;
        this.f100327j = imageView;
        this.f100328k = coinAvatarView;
        this.f100329l = imageView2;
        this.f100330m = view;
        this.f100331n = linearLayout;
        this.f100332o = baseTextView;
        this.f100333p = baseTextView2;
    }
}
