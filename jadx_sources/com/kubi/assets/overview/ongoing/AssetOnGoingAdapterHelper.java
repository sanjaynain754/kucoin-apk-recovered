package com.kubi.assets.overview.ongoing;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.entity.RiskViewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37890n;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44762f1;
import p637ta.C44786i1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetOnGoingAdapterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\tJ9\u0010\n\u001a\u00020\u0005*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J0\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020 J?\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010 2\u0006\u0010*\u001a\u00020\u0011¢\u0006\u0002\u0010+J&\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\r¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapterHelper;", "", "<init>", "()V", "setGoneFields", "", "views", "", "Lcom/kubi/resources/widget/BaseTextView;", "([Lcom/kubi/resources/widget/BaseTextView;)V", "updateVisibleFields", "Lcom/kubi/assets/databinding/AssetItemOngoingFinanceBinding;", "incomeAmount", "", "returnRate", "minLockEndTime", "incomeCurrencyCount", "", "(Lcom/kubi/assets/databinding/AssetItemOngoingFinanceBinding;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setImg", "root", "Landroid/widget/ImageView;", "backgroundResId", "showRiskView", "fragment", "Lcom/kubi/sdk/BaseFragment;", "riskView", "Landroid/widget/FrameLayout;", "riskViewEntity", "Lcom/kubi/assets/entity/RiskViewEntity;", "tag", "isIsolateMargin", "", "populateFundsInfoViews", "context", "Landroid/content/Context;", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", "fundsInfoList", "", "Lcom/kubi/assets/entity/FundsInfo;", "hasMore", "totalCount", "(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/util/List;Ljava/lang/Boolean;I)V", "calculateWidthForDisplay", "binding", "Lcom/kubi/assets/databinding/AssetItemOngoingContractBinding;", "formatSymbol", "", "side", "leverage", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOnGoingAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingAdapterHelper.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingAdapterHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n13472#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingAdapterHelper.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingAdapterHelper\n*L\n40#1:227,2\n*E\n"})
public final class AssetOnGoingAdapterHelper {
    /* JADX INFO: renamed from: d */
    public static final Unit m18762d() {
        IMarginService.m37900d0(AssetsDepend.f18689a.m19183d(), "", false, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m18763b(@NotNull C44762f1 binding, @NotNull CharSequence formatSymbol, @NotNull CharSequence side, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(formatSymbol, "formatSymbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Paint paint = new Paint();
        paint.setTextSize(C27040e.m66660d(13));
        float fMeasureText = paint.measureText(side.toString());
        float fMeasureText2 = paint.measureText(leverage);
        float fM6183e = (C5267e0.m6183e() - C27040e.m66658b(110)) - paint.measureText(formatSymbol.toString());
        float f11 = fMeasureText + fMeasureText2;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(binding.f99883d);
        if (f11 > fM6183e) {
            constraintSet.clear(binding.f99885f.getId(), 6);
            constraintSet.clear(binding.f99885f.getId(), 3);
            int id2 = binding.f99885f.getId();
            int i11 = R$id.tvName;
            constraintSet.connect(id2, 6, i11, 6);
            constraintSet.connect(binding.f99885f.getId(), 3, i11, 4);
            constraintSet.applyTo(binding.f99883d);
            View viewDivider = binding.f99895p;
            Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
            ViewExtKt.m66577h(viewDivider);
            return;
        }
        constraintSet.clear(binding.f99885f.getId(), 3);
        constraintSet.clear(binding.f99885f.getId(), 6);
        constraintSet.setMargin(binding.f99885f.getId(), 6, C27040e.m66658b(6));
        constraintSet.connect(binding.f99885f.getId(), 6, binding.f99895p.getId(), 7);
        constraintSet.connect(binding.f99885f.getId(), 3, binding.f99895p.getId(), 3);
        constraintSet.connect(binding.f99885f.getId(), 4, binding.f99895p.getId(), 4);
        constraintSet.applyTo(binding.f99883d);
        View viewDivider2 = binding.f99895p;
        Intrinsics.checkNotNullExpressionValue(viewDivider2, "viewDivider");
        ViewExtKt.m66594y(viewDivider2);
    }

    /* JADX INFO: renamed from: c */
    public final void m18764c(@NotNull Context context, @Nullable LinearLayout linearLayout, @Nullable List<FundsInfo> list, @Nullable Boolean bool, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        for (FundsInfo fundsInfo : list) {
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.asset_item_ongoing_liability, (ViewGroup) null);
            String currency = fundsInfo.getCurrency();
            if (currency == null) {
                currency = "";
            }
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(currency);
            C24277v.m58542g((ImageView) viewInflate.findViewById(R$id.ivIcon), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
            ((BaseTextView) viewInflate.findViewById(R$id.tvName)).setText(DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_coin_debt, new Object[0]), new Object[]{C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, currency)}, null, 2, null));
            ((BaseTextView) viewInflate.findViewById(R$id.tvNumber)).setText(AssetExKt.m15137y(fundsInfo.getLiability(), currency));
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            }
        }
        if (C27025c.m66566d(bool)) {
            View viewInflate2 = LayoutInflater.from(context).inflate(R$layout.asset_item_cross_load_more, (ViewGroup) null);
            ((BaseTextView) viewInflate2.findViewById(R$id.tvTitle)).setText(DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_view_more_num, new Object[0]), new Object[]{Integer.valueOf(i11)}, null, 2, null));
            Intrinsics.checkNotNull(viewInflate2);
            C27046k.m66711z(viewInflate2, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOnGoingAdapterHelper.m18762d();
                }
            }, 1, null);
            if (linearLayout != null) {
                linearLayout.addView(viewInflate2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18765e(@NotNull BaseTextView... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        for (BaseTextView baseTextView : views) {
            ViewExtKt.m66577h(baseTextView);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18766f(@NotNull ImageView root, int i11) {
        Intrinsics.checkNotNullParameter(root, "root");
        Drawable drawable = ContextCompat.getDrawable(root.getContext(), i11);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        root.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: g */
    public final void m18767g(@NotNull BaseFragment fragment, @NotNull FrameLayout riskView, @NotNull RiskViewEntity riskViewEntity, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(riskView, "riskView");
        Intrinsics.checkNotNullParameter(riskViewEntity, "riskViewEntity");
        AssetsDepend.f18689a.m19183d().mo37955q0(riskView, fragment, riskViewEntity.getStatus(), riskViewEntity.getLiabilityRate(), riskViewEntity.getRiskGrade(), str != null ? C37890n.f85269a.m85601B(str) : null, riskViewEntity.getTransferableAmountDebtRatio(), riskViewEntity.getLiquidationDebtRatio(), z11, riskViewEntity.getCurrency(), false);
    }

    /* JADX INFO: renamed from: h */
    public final void m18768h(@NotNull C44786i1 c44786i1, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(c44786i1, "<this>");
        if (str != null) {
            BaseTextView tvRevenueName = c44786i1.f100118m;
            Intrinsics.checkNotNullExpressionValue(tvRevenueName, "tvRevenueName");
            ViewExtKt.m66594y(tvRevenueName);
            ShowHideTextView tvRevenue = c44786i1.f100117l;
            Intrinsics.checkNotNullExpressionValue(tvRevenue, "tvRevenue");
            ViewExtKt.m66594y(tvRevenue);
            c44786i1.f100117l.setText(str);
            if ((num != null ? num.intValue() : 0) > 1) {
                String strM66516f = C27017c.f54310a.m66516f(R$string.earn_total_profit, new Object[0]);
                c44786i1.f100118m.setText(strM66516f + '(' + num + ')');
                return;
            }
            return;
        }
        if (str2 != null) {
            BaseTextView tvAnnualizedName = c44786i1.f100111f;
            Intrinsics.checkNotNullExpressionValue(tvAnnualizedName, "tvAnnualizedName");
            ViewExtKt.m66594y(tvAnnualizedName);
            ShowHideTextView tvAnnualized = c44786i1.f100110e;
            Intrinsics.checkNotNullExpressionValue(tvAnnualized, "tvAnnualized");
            ViewExtKt.m66594y(tvAnnualized);
            c44786i1.f100110e.setText(str2);
            return;
        }
        if (str3 != null) {
            BaseTextView tvEndDateName = c44786i1.f100113h;
            Intrinsics.checkNotNullExpressionValue(tvEndDateName, "tvEndDateName");
            ViewExtKt.m66594y(tvEndDateName);
            BaseTextView tvEndDate = c44786i1.f100112g;
            Intrinsics.checkNotNullExpressionValue(tvEndDate, "tvEndDate");
            ViewExtKt.m66594y(tvEndDate);
            c44786i1.f100112g.setText(str3);
        }
    }
}
