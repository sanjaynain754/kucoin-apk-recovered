package l50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;

/* JADX INFO: renamed from: l50.k0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyItemSpotPositionItemBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42078k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f93013a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f93014b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f93015c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f93016d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f93017e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f93018f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f93019g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f93020h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f93021i;

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42078k0 m92308c(@NonNull LayoutInflater layoutInflater) {
        return m92309d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42078k0 m92307a(@NonNull View view) {
        int i11 = R$id.actualPercentTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.assetsTv;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.averagePriceTv;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.curPriceTv;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.pnlTv;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.presetTv;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.priceChangeTv;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.symbolTv;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        return new C42078k0((LinearLayoutCompat) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
    /* JADX INFO: renamed from: d */
    public static C42078k0 m92309d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.btrading_bot_kit_strategy_item_spot_position_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m92307a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f93013a;
    }

    public C42078k0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f93013a = linearLayoutCompat;
        this.f93014b = baseTextView;
        this.f93015c = baseTextView2;
        this.f93016d = baseTextView3;
        this.f93017e = baseTextView4;
        this.f93018f = baseTextView5;
        this.f93019g = baseTextView6;
        this.f93020h = baseTextView7;
        this.f93021i = baseTextView8;
    }
}
