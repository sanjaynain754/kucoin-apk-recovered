package com.kubi.assets.finance.coin;

import android.view.View;
import android.widget.TextView;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.finance.FinanceAnalyticsReporter;
import com.kubi.assets.finance.FinanceAutoRenewBinder;
import com.kubi.assets.finance.FinanceSettable;
import com.kubi.assets.finance.FinanceSettableKt;
import com.kubi.assets.finance.ProductType;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FinanceCoinChildAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B!\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/assets/entity/ProductChildEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lcom/kubi/assets/finance/FinanceSettable;", "data", "", "hideSubNumber", "", "<init>", "(Ljava/util/List;Z)V", "convert", "", "helper", "item", "isShowEndDate", "getIncomeAmountColor", "", "getReturnStr", "", "bindCommonFields", "bindRevenueName", "itemClick", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceCoinChildAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCoinChildAdapter.kt\ncom/kubi/assets/finance/coin/FinanceCoinChildAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1869#2,2:212\n*S KotlinDebug\n*F\n+ 1 FinanceCoinChildAdapter.kt\ncom/kubi/assets/finance/coin/FinanceCoinChildAdapter\n*L\n38#1:212,2\n*E\n"})
public class FinanceCoinChildAdapter extends BaseMultiItemQuickAdapter<ProductChildEntity, BaseViewHolder> implements FinanceSettable {

    /* JADX INFO: renamed from: i */
    public boolean f17421i;

    /* JADX INFO: renamed from: m */
    private final String m16777m(ProductChildEntity productChildEntity) {
        if (!Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "SHARKFIN")) {
            if (productChildEntity != null) {
                return productChildEntity.getTotalReturnStr();
            }
            return null;
        }
        return productChildEntity.getMinReturnStr() + '-' + productChildEntity.getMaxReturnStr();
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m16780p(final ProductChildEntity productChildEntity, final BaseViewHolder baseViewHolder) throws JSONException {
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, EarnAccountItem.STATUS_DUAL_PENDING)) {
            ToastCompat.m66437C(R$string.earn_purchaseing);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "LOAN_PLEDGE")) {
            FinanceSettableKt.m16696a(productChildEntity, new Function0() { // from class: com.kubi.assets.finance.coin.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceCoinChildAdapter.m16781q(baseViewHolder, productChildEntity);
                }
            });
            return Unit.INSTANCE;
        }
        String jumpUrl = productChildEntity != null ? productChildEntity.getJumpUrl() : null;
        if (jumpUrl == null || jumpUrl.length() == 0) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(productChildEntity.getJumpType(), "H5")) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + C27041f.m66668h(productChildEntity.getJumpUrl()), null, 2L, Boolean.TRUE, null, null, null, 114, null);
        } else {
            Router.f46192a.m56184f(C27041f.m66668h(productChildEntity.getJumpUrl())).m4048k();
        }
        FinanceAnalyticsReporter.f17418a.m16757c(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getCategory()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.coin.FinanceCoinChildAdapter$a */
    /* JADX INFO: compiled from: FinanceCoinChildAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9973a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.DEMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.LENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.STAKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductType.ETH2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductType.KCS_STAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductType.ACTIVITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductType.POLKA_FUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductType.TWIN_WIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProductType.FUTURE_PLUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProductType.DISCOUNT_BUY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProductType.LOAN_PLEDGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m16774i(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        String personalLockPeriod;
        baseViewHolder.setText(R$id.tvName, C27041f.m66669i(productChildEntity != null ? productChildEntity.getCategoryText() : null, "--")).setText(R$id.tvAmount, productChildEntity != null ? productChildEntity.getLockAmountWithCurrencyStr() : null);
        Double dValueOf = (productChildEntity == null || (personalLockPeriod = productChildEntity.getPersonalLockPeriod()) == null) ? null : Double.valueOf(DowngradeExKt.m66538h(personalLockPeriod, 0.0d, 1, null));
        if (dValueOf == null) {
            baseViewHolder.setGone(R$id.tvLabel, false);
        } else if (dValueOf.doubleValue() > 0.0d) {
            int i11 = R$id.tvLabel;
            baseViewHolder.setGone(i11, true);
            baseViewHolder.setText(i11, productChildEntity.getPersonalLockPeriod() + 'D');
        } else if (Intrinsics.areEqual(dValueOf, 0.0d)) {
            int i12 = R$id.tvLabel;
            baseViewHolder.setGone(i12, true);
            baseViewHolder.setText(i12, R$string.soft_staking);
        } else {
            baseViewHolder.setGone(R$id.tvLabel, false);
        }
        if (productChildEntity == null || !productChildEntity.getManualRedeemLocked()) {
            if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, "SETTLING")) {
                int i13 = R$id.tvStatusLabel;
                baseViewHolder.setText(i13, R$string.kc_earn_setting_state).setVisible(i13, true);
            } else {
                int i14 = R$id.tvStatusLabel;
                baseViewHolder.setText(i14, C33627eb.f69716f).setVisible(i14, false);
            }
        } else {
            int i15 = R$id.tvStatusLabel;
            baseViewHolder.setText(i15, R$string.kc_asset_staking_lock).setVisible(i15, true);
        }
        m16775j(baseViewHolder, productChildEntity);
    }

    /* JADX INFO: renamed from: j */
    private final void m16775j(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.tvRevenueName);
        if (textView == null) {
            return;
        }
        String string = C27017c.f54310a.m66513b().getString(R$string.earn_total_profit);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (C27039d.m66650j(productChildEntity != null ? productChildEntity.getIncomeCurrencyCount() : null) > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append('(');
            sb2.append(productChildEntity != null ? productChildEntity.getIncomeCurrencyCount() : null);
            sb2.append(')');
            string = sb2.toString();
        }
        textView.setText(string);
    }

    /* JADX INFO: renamed from: l */
    private final int m16776l(ProductChildEntity productChildEntity) {
        return productChildEntity != null ? productChildEntity.getIncomeAmountColor() : C27017c.f54310a.m66512a(R$color.c_text);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m16778n(ProductChildEntity productChildEntity) {
        if (productChildEntity != null) {
            return productChildEntity.isShowEndDate();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private final void m16779o(final BaseViewHolder baseViewHolder, final ProductChildEntity productChildEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.finance.coin.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceCoinChildAdapter.m16780p(productChildEntity, baseViewHolder);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m16781q(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) throws JSONException {
        FinanceAnalyticsReporter.f17418a.m16757c(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getCategory()));
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable ProductChildEntity productChildEntity) {
        String str;
        BigDecimal leverage;
        BigDecimal bigDecimalM11724a;
        String plainString;
        Intrinsics.checkNotNullParameter(helper, "helper");
        ProductType productTypeFromCategory = ProductType.INSTANCE.fromCategory(productChildEntity != null ? productChildEntity.getCategory() : null);
        m16774i(helper, productChildEntity);
        m16779o(helper, productChildEntity);
        switch (C9973a.$EnumSwitchMapping$0[productTypeFromCategory.ordinal()]) {
            case 1:
            case 2:
                BaseViewHolder text = helper.setText(R$id.tvAnnualized, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
                int i11 = R$id.tvRevenue;
                text.setText(i11, productChildEntity != null ? productChildEntity.getIncomeSumStr() : null).setTextColor(i11, m16776l(productChildEntity));
                m16764d(productChildEntity, helper);
                Unit unit = Unit.INSTANCE;
                break;
            case 3:
            case 4:
            case 5:
                BaseViewHolder text2 = helper.setText(R$id.tvAnnualized, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null).setText(R$id.tvRedemptionPeriod, productChildEntity != null ? productChildEntity.getUnLockPeriodStr() : null);
                int i12 = R$id.tvRevenue;
                text2.setText(i12, productChildEntity != null ? productChildEntity.getIncomeSumStr() : null).setTextColor(i12, m16776l(productChildEntity));
                m16764d(productChildEntity, helper);
                Unit unit2 = Unit.INSTANCE;
                break;
            case 6:
                boolean zM16778n = m16778n(productChildEntity);
                BaseViewHolder text3 = helper.setText(R$id.tvAnnualized, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
                int i13 = R$id.tvEndDate;
                BaseViewHolder text4 = text3.setText(i13, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                int i14 = R$id.tvRevenue;
                text4.setText(i14, productChildEntity != null ? productChildEntity.getIncomeSumStr() : null).setTextColor(i14, m16776l(productChildEntity)).setGone(R$id.tvEndDateName, zM16778n).setGone(i13, zM16778n);
                m16764d(productChildEntity, helper);
                FinanceAutoRenewBinder financeAutoRenewBinder = FinanceAutoRenewBinder.f17374a;
                financeAutoRenewBinder.m16619h(helper, productChildEntity);
                financeAutoRenewBinder.m16618f(helper, productChildEntity);
                Unit unit3 = Unit.INSTANCE;
                break;
            case 7:
                helper.setText(R$id.tvEndDate, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                break;
            case 8:
            case 9:
                int i15 = R$id.tvLeverage;
                if (productChildEntity == null || (leverage = productChildEntity.getLeverage()) == null || (bigDecimalM11724a = C6447a.m11724a(leverage)) == null || (plainString = bigDecimalM11724a.toPlainString()) == null) {
                    str = null;
                } else {
                    str = plainString + 'x';
                }
                helper.setText(i15, C27041f.m66669i(str, "--")).setText(R$id.tvEndDate, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                break;
            case 10:
                helper.setText(R$id.tvTargetBuyPrice, productChildEntity != null ? productChildEntity.getTargetPriceStr() : null);
                helper.setText(R$id.tvKoPrice, productChildEntity != null ? productChildEntity.getKoPriceStr() : null);
                helper.setText(R$id.tvEndDate, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                int i16 = R$id.tvKoApr;
                helper.setText(i16, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
                helper.setTextColor(i16, C27017c.f54310a.m66512a(R$color.brandGreen));
                break;
            case 11:
                helper.setGone(R$id.tvAnnualizedName, false).setGone(R$id.tvAnnualized, false).setGone(R$id.tvRevenueName, false).setGone(R$id.tvRevenue, false);
                break;
            default:
                helper.setText(R$id.tvAnnualized, m16777m(productChildEntity)).setText(R$id.tvEndDate, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                break;
        }
        ShowHideTextView.m54778d(helper.itemView, this.f17421i);
    }

    public FinanceCoinChildAdapter(@Nullable List<ProductChildEntity> list, boolean z11) {
        super(list);
        this.f17421i = z11;
        for (ProductType productType : ProductType.getEntries()) {
            addItemType(productType.getLayoutResId(), productType.getLayoutResId());
        }
    }
}
