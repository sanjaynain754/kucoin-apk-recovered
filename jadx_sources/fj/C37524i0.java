package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownColorTextView;

/* JADX INFO: renamed from: fj.i0 */
/* JADX INFO: compiled from: KucoinHomeItemNewCoinRankBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37524i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83332a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShowHideTextView f83333b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f83334c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f83335d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f83336e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83337f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f83338g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final UpDownColorTextView f83339h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83340i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37524i0 m84508a(@NonNull View view) {
        int i11 = R$id.coin_full_name_new;
        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
        if (showHideTextView != null) {
            i11 = R$id.coin_icon_new;
            CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView != null) {
                i11 = R$id.tv_24_change_rate_new;
                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView2 != null) {
                    i11 = R$id.tv_change_rate_new;
                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView3 != null) {
                        i11 = R$id.tv_currency_new;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_money_price_new;
                            ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView4 != null) {
                                i11 = R$id.tv_price_new;
                                UpDownColorTextView upDownColorTextView = (UpDownColorTextView) ViewBindings.findChildViewById(view, i11);
                                if (upDownColorTextView != null) {
                                    i11 = R$id.tv_time_new;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        return new C37524i0((LinearLayout) view, showHideTextView, coinAvatarView, showHideTextView2, showHideTextView3, baseTextView, showHideTextView4, upDownColorTextView, baseTextView2);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37524i0 m84509c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_home_item_new_coin_rank, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84508a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83332a;
    }

    public C37524i0(@NonNull LinearLayout linearLayout, @NonNull ShowHideTextView showHideTextView, @NonNull CoinAvatarView coinAvatarView, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView4, @NonNull UpDownColorTextView upDownColorTextView, @NonNull BaseTextView baseTextView2) {
        this.f83332a = linearLayout;
        this.f83333b = showHideTextView;
        this.f83334c = coinAvatarView;
        this.f83335d = showHideTextView2;
        this.f83336e = showHideTextView3;
        this.f83337f = baseTextView;
        this.f83338g = showHideTextView4;
        this.f83339h = upDownColorTextView;
        this.f83340i = baseTextView2;
    }
}
