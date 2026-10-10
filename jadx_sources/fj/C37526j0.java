package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownColorTextView;

/* JADX INFO: renamed from: fj.j0 */
/* JADX INFO: compiled from: KucoinHomeItemRankBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37526j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83343a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f83344b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShowHideTextView f83345c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83346d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f83347e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final UpDownColorTextView f83348f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83349g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f83350h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37526j0 m84513a(@NonNull View view) {
        int i11 = R$id.coin_icon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.tv_change_rate;
            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
            if (showHideTextView != null) {
                i11 = R$id.tvCoinLabel;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_money_price;
                    ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView2 != null) {
                        i11 = R$id.tv_price;
                        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) ViewBindings.findChildViewById(view, i11);
                        if (upDownColorTextView != null) {
                            i11 = R$id.tv_symbol;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_value;
                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView3 != null) {
                                    return new C37526j0((LinearLayoutCompat) view, coinAvatarView, showHideTextView, baseTextView, showHideTextView2, upDownColorTextView, baseTextView2, showHideTextView3);
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
    public static C37526j0 m84514c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_home_item_rank, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84513a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83343a;
    }

    public C37526j0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull CoinAvatarView coinAvatarView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull UpDownColorTextView upDownColorTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView3) {
        this.f83343a = linearLayoutCompat;
        this.f83344b = coinAvatarView;
        this.f83345c = showHideTextView;
        this.f83346d = baseTextView;
        this.f83347e = showHideTextView2;
        this.f83348f = upDownColorTextView;
        this.f83349g = baseTextView2;
        this.f83350h = showHideTextView3;
    }
}
