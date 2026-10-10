package v30;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.spot.view.SpotImportantNoticeView;
import com.kubi.core.spot.view.SpotTradeRiskTipView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.e */
/* JADX INFO: compiled from: BkcoinCoreSpotNoticeLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45378e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102045a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f102046b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SpotImportantNoticeView f102047c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f102048d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SpotTradeRiskTipView f102049e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f102050f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102051g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45378e m100286a(@NonNull View view) {
        int i11 = R$id.fl_etf;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.importantNoticeView;
            SpotImportantNoticeView spotImportantNoticeView = (SpotImportantNoticeView) ViewBindings.findChildViewById(view, i11);
            if (spotImportantNoticeView != null) {
                i11 = R$id.iv_close_tips;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.riskTipView;
                    SpotTradeRiskTipView spotTradeRiskTipView = (SpotTradeRiskTipView) ViewBindings.findChildViewById(view, i11);
                    if (spotTradeRiskTipView != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i11 = R$id.tv_etf_tips;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C45378e(linearLayout2, linearLayout, spotImportantNoticeView, imageView, spotTradeRiskTipView, linearLayout2, baseTextView);
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
        return this.f102045a;
    }

    public C45378e(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SpotImportantNoticeView spotImportantNoticeView, @NonNull ImageView imageView, @NonNull SpotTradeRiskTipView spotTradeRiskTipView, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView) {
        this.f102045a = linearLayout;
        this.f102046b = linearLayout2;
        this.f102047c = spotImportantNoticeView;
        this.f102048d = imageView;
        this.f102049e = spotTradeRiskTipView;
        this.f102050f = linearLayout3;
        this.f102051g = baseTextView;
    }
}
