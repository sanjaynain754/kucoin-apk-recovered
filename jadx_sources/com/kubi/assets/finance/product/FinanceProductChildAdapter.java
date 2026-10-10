package com.kubi.assets.finance.product;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.finance.FinanceAnalyticsReporter;
import com.kubi.assets.finance.FinanceAutoRenewBinder;
import com.kubi.assets.finance.FinanceSettable;
import com.kubi.assets.finance.FinanceSettableKt;
import com.kubi.assets.finance.ProductType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
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

/* JADX INFO: compiled from: FinanceProductChildAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\r*\u00020\u00032\n\u0010\u0013\u001a\u00020\u0014\"\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00032\n\u0010\u0013\u001a\u00020\u0014\"\u00020\u0015H\u0002J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductChildAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/ProductChildEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lcom/kubi/assets/finance/FinanceSettable;", "data", "", "isShowCategory", "", "hideSubNumber", "<init>", "(Ljava/util/List;ZZ)V", "convert", "", "helper", "item", "setCommonFields", "bindRevenueName", "setGoneFields", "viewIds", "", "", "setVisibleFields", "bindCommonFields", "isShowEndDate", "getIncomeAmountColor", "getReturnStr", "", "setCoinIcon", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "handleOldIconLogic", "itemClick", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceProductChildAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceProductChildAdapter.kt\ncom/kubi/assets/finance/product/FinanceProductChildAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class FinanceProductChildAdapter extends BaseQuickAdapter<ProductChildEntity, BaseViewHolder> implements FinanceSettable {

    /* JADX INFO: renamed from: i */
    public boolean f17461i;

    /* JADX INFO: renamed from: j */
    public boolean f17462j;

    /* JADX INFO: renamed from: q */
    public static final Unit m16801q(final ProductChildEntity productChildEntity, final BaseViewHolder baseViewHolder) throws JSONException {
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, EarnAccountItem.STATUS_DUAL_PENDING)) {
            ToastCompat.m66437C(R$string.earn_purchaseing);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "LOAN_PLEDGE")) {
            FinanceSettableKt.m16696a(productChildEntity, new Function0() { // from class: com.kubi.assets.finance.product.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceProductChildAdapter.m16802r(baseViewHolder, productChildEntity);
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
        FinanceAnalyticsReporter.f17418a.m16762h(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final String m16807m(ProductChildEntity productChildEntity) {
        if (!Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "SHARKFIN")) {
            if (productChildEntity != null) {
                return productChildEntity.getTotalReturnStr();
            }
            return null;
        }
        return productChildEntity.getMinReturnStr() + '-' + productChildEntity.getMaxReturnStr();
    }

    /* JADX INFO: renamed from: n */
    public final String m16808n(ProductChildEntity productChildEntity) {
        if (!TextUtils.isEmpty(productChildEntity != null ? productChildEntity.getIcon() : null)) {
            return C27041f.m66668h(productChildEntity != null ? productChildEntity.getIcon() : null);
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(productChildEntity != null ? productChildEntity.getCurrency() : null));
        return C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
    }

    /* JADX INFO: renamed from: u */
    public final void m16813u(BaseViewHolder baseViewHolder, int... iArr) {
        for (int i11 : iArr) {
            baseViewHolder.setGone(i11, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m16814v(BaseViewHolder baseViewHolder, int... iArr) {
        for (int i11 : iArr) {
            baseViewHolder.setVisible(i11, true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductChildAdapter$a */
    /* JADX INFO: compiled from: FinanceProductChildAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C10008a {
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
                iArr[ProductType.LOAN_PLEDGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProductType.DISCOUNT_BUY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinanceProductChildAdapter(@Nullable List<ProductChildEntity> list, boolean z11, boolean z12) {
        super(R$layout.asset_item_finance_product_child, list);
        this.f17461i = z11;
        this.f17462j = z12;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m16802r(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) throws JSONException {
        FinanceAnalyticsReporter.f17418a.m16762h(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m16803i(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        String personalLockPeriod;
        BaseViewHolder text = baseViewHolder.setText(R$id.tvName, C27041f.m66669i(productChildEntity != null ? productChildEntity.getName() : null, "--")).setText(R$id.tvAmount, productChildEntity != null ? productChildEntity.getLockAmountWithCurrencyStr() : null);
        int i11 = R$id.tvCategory;
        text.setText(i11, C27041f.m66669i(productChildEntity != null ? productChildEntity.getCategoryText() : null, "--"));
        Double dValueOf = (productChildEntity == null || (personalLockPeriod = productChildEntity.getPersonalLockPeriod()) == null) ? null : Double.valueOf(DowngradeExKt.m66538h(personalLockPeriod, 0.0d, 1, null));
        if (dValueOf == null) {
            baseViewHolder.setGone(R$id.tvLabel, false);
        } else if (dValueOf.doubleValue() > 0.0d) {
            int i12 = R$id.tvLabel;
            baseViewHolder.setGone(i12, true);
            baseViewHolder.setText(i12, productChildEntity.getPersonalLockPeriod() + 'D');
        } else if (Intrinsics.areEqual(dValueOf, 0.0d)) {
            int i13 = R$id.tvLabel;
            baseViewHolder.setGone(i13, true);
            baseViewHolder.setText(i13, R$string.soft_staking);
        } else {
            baseViewHolder.setGone(R$id.tvLabel, false);
        }
        if (productChildEntity == null || !productChildEntity.getManualRedeemLocked()) {
            if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, "SETTLING")) {
                int i14 = R$id.tvStatusLabel;
                baseViewHolder.setText(i14, R$string.kc_earn_setting_state).setVisible(i14, true);
            } else {
                int i15 = R$id.tvStatusLabel;
                baseViewHolder.setText(i15, C33627eb.f69716f).setVisible(i15, false);
            }
        } else {
            int i16 = R$id.tvStatusLabel;
            baseViewHolder.setText(i16, R$string.kc_asset_staking_lock).setVisible(i16, true);
        }
        m16764d(productChildEntity, baseViewHolder);
        m16811s(productChildEntity, baseViewHolder);
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "DISCOUNT_BUY")) {
            baseViewHolder.setText(R$id.tvEndDateName, R$string.deadtime);
        } else {
            baseViewHolder.setText(R$id.tvEndDateName, R$string.earn_end_date);
        }
        baseViewHolder.setGone(i11, this.f17461i).setGone(R$id.tvLeverageName, false).setGone(R$id.tvLeverage, false).setGone(R$id.tvAnnualizedName, false).setGone(R$id.tvAnnualized, false).setGone(R$id.tvRedemptionPeriodName, false).setGone(R$id.tvRedemptionPeriod, false).setGone(R$id.tvEndDateName, false).setGone(R$id.tvEndDate, false).setGone(R$id.tvRevenueName, false).setGone(R$id.tvRevenue, false).setGone(R$id.tvTargetBuyPriceName, false).setGone(R$id.tvTargetBuyPrice, false).setGone(R$id.tvKoPriceName, false).setGone(R$id.tvKoPrice, false).setGone(R$id.tvKoAprName, false).setGone(R$id.tvKoApr, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m16804j(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
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

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable ProductChildEntity productChildEntity) {
        String str;
        BigDecimal leverage;
        BigDecimal bigDecimalM11724a;
        String plainString;
        Intrinsics.checkNotNullParameter(helper, "helper");
        ProductType productTypeFromCategory = ProductType.INSTANCE.fromCategory(productChildEntity != null ? productChildEntity.getCategory() : null);
        m16803i(helper, productChildEntity);
        m16810p(helper, productChildEntity);
        switch (C10008a.$EnumSwitchMapping$0[productTypeFromCategory.ordinal()]) {
            case 1:
            case 2:
                m16812t(helper, productChildEntity);
                m16813u(helper, R$id.tvAnnualizedName, R$id.tvRevenueName, R$id.tvAnnualized, R$id.tvRevenue);
                break;
            case 3:
            case 4:
            case 5:
                m16812t(helper, productChildEntity);
                int i11 = R$id.tvRedemptionPeriod;
                BaseViewHolder text = helper.setText(i11, productChildEntity != null ? productChildEntity.getUnLockPeriodStr() : null);
                Intrinsics.checkNotNullExpressionValue(text, "setText(...)");
                m16813u(text, R$id.tvAnnualizedName, R$id.tvRedemptionPeriodName, R$id.tvRevenueName, R$id.tvAnnualized, i11, R$id.tvRevenue);
                break;
            case 6:
                m16812t(helper, productChildEntity);
                boolean zM16809o = m16809o(productChildEntity);
                int i12 = R$id.tvEndDate;
                BaseViewHolder gone = helper.setText(i12, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null).setGone(R$id.tvEndDateName, zM16809o).setGone(i12, zM16809o);
                Intrinsics.checkNotNullExpressionValue(gone, "setGone(...)");
                m16813u(gone, R$id.tvAnnualizedName, R$id.tvRevenueName, R$id.tvAnnualized, R$id.tvRevenue);
                break;
            case 7:
                int i13 = R$id.tvEndDate;
                BaseViewHolder text2 = helper.setText(i13, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                Intrinsics.checkNotNullExpressionValue(text2, "setText(...)");
                m16813u(text2, R$id.tvEndDateName, i13);
                break;
            case 8:
            case 9:
                int i14 = R$id.tvLeverage;
                if (productChildEntity == null || (leverage = productChildEntity.getLeverage()) == null || (bigDecimalM11724a = C6447a.m11724a(leverage)) == null || (plainString = bigDecimalM11724a.toPlainString()) == null) {
                    str = null;
                } else {
                    str = plainString + 'x';
                }
                BaseViewHolder text3 = helper.setText(i14, C27041f.m66669i(str, "--"));
                int i15 = R$id.tvEndDate;
                BaseViewHolder text4 = text3.setText(i15, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                Intrinsics.checkNotNullExpressionValue(text4, "setText(...)");
                m16813u(text4, R$id.tvLeverageName, i14, R$id.tvEndDateName, i15);
                break;
            case 10:
                break;
            case 11:
                m16812t(helper, productChildEntity);
                int i16 = R$id.tvTargetBuyPrice;
                BaseViewHolder text5 = helper.setText(i16, productChildEntity != null ? productChildEntity.getTargetPriceStr() : null);
                int i17 = R$id.tvKoPrice;
                BaseViewHolder text6 = text5.setText(i17, productChildEntity != null ? productChildEntity.getKoPriceStr() : null);
                int i18 = R$id.tvKoApr;
                BaseViewHolder text7 = text6.setText(i18, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
                int i19 = R$id.tvEndDate;
                text7.setText(i19, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                helper.setTextColor(i18, C27017c.f54310a.m66512a(R$color.brandGreen));
                m16814v(helper, i16, R$id.tvTargetBuyPriceName, i17, R$id.tvKoPriceName, i18, R$id.tvKoAprName, i19, R$id.tvEndDateName);
                break;
            default:
                int i21 = R$id.tvAnnualized;
                BaseViewHolder text8 = helper.setText(i21, m16807m(productChildEntity));
                int i22 = R$id.tvEndDate;
                BaseViewHolder text9 = text8.setText(i22, productChildEntity != null ? productChildEntity.getLockEndTimeStr() : null);
                Intrinsics.checkNotNullExpressionValue(text9, "setText(...)");
                m16813u(text9, R$id.tvAnnualizedName, i21, R$id.tvEndDateName, i22);
                break;
        }
        FinanceAutoRenewBinder financeAutoRenewBinder = FinanceAutoRenewBinder.f17374a;
        financeAutoRenewBinder.m16619h(helper, productChildEntity);
        financeAutoRenewBinder.m16618f(helper, productChildEntity);
        ShowHideTextView.m54778d(helper.itemView, this.f17462j);
    }

    /* JADX INFO: renamed from: l */
    public final int m16806l(ProductChildEntity productChildEntity) {
        return productChildEntity != null ? productChildEntity.getIncomeAmountColor() : C27017c.f54310a.m66512a(R$color.c_text);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16809o(ProductChildEntity productChildEntity) {
        if (productChildEntity != null) {
            return productChildEntity.isShowEndDate();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m16810p(final BaseViewHolder baseViewHolder, final ProductChildEntity productChildEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.finance.product.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceProductChildAdapter.m16801q(productChildEntity, baseViewHolder);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m16811s(ProductChildEntity productChildEntity, BaseViewHolder baseViewHolder) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.iv_icon);
        CoinAvatarView coinAvatarView2 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon1);
        CoinAvatarView coinAvatarView3 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon2);
        coinAvatarView3.setStrokeColor(coinAvatarView3.getResources().getColor(R$color.c_overlay));
        if ((productChildEntity != null ? productChildEntity.getBigCurrencyIcon() : null) == null || productChildEntity.getSmallCurrencyIcon() == null) {
            C24277v.m58542g(coinAvatarView, C27041f.m66669i(productChildEntity != null ? productChildEntity.getBigCurrencyIcon() : null, m16808n(productChildEntity)));
            Intrinsics.checkNotNullExpressionValue(coinAvatarView, "apply(...)");
            ViewExtKt.m66594y(coinAvatarView);
            Intrinsics.checkNotNull(coinAvatarView2);
            ViewExtKt.m66577h(coinAvatarView2);
            Intrinsics.checkNotNull(coinAvatarView3);
            ViewExtKt.m66577h(coinAvatarView3);
            return;
        }
        Intrinsics.checkNotNull(coinAvatarView);
        ViewExtKt.m66577h(coinAvatarView);
        C24277v.m58542g(coinAvatarView2, productChildEntity.getBigCurrencyIcon());
        Intrinsics.checkNotNullExpressionValue(coinAvatarView2, "apply(...)");
        ViewExtKt.m66594y(coinAvatarView2);
        C24277v.m58542g(coinAvatarView3, productChildEntity.getSmallCurrencyIcon());
        Intrinsics.checkNotNullExpressionValue(coinAvatarView3, "apply(...)");
        ViewExtKt.m66594y(coinAvatarView3);
    }

    /* JADX INFO: renamed from: t */
    public final void m16812t(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        BaseViewHolder text = baseViewHolder.setText(R$id.tvAnnualized, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
        int i11 = R$id.tvRevenue;
        text.setText(i11, productChildEntity != null ? productChildEntity.getIncomeSumStr() : null).setTextColor(i11, m16806l(productChildEntity));
        m16804j(baseViewHolder, productChildEntity);
    }
}
