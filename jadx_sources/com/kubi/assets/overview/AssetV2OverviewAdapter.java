package com.kubi.assets.overview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.CommonAccountEntity;
import com.kubi.assets.entity.EarnBalance;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.MarginEntity;
import com.kubi.assets.entity.OverviewAccountInfo;
import com.kubi.assets.entity.OverviewItemEntity;
import com.kubi.assets.overview.account.AssetAccountFragment;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.C11273q;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.entity.UnifiedAssetEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import gf.C37885i;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;
import rs.AbstractC44173c;
import rs.C44172b;
import sa.C44370a;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2OverviewAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0015J4\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 J\u0016\u0010!\u001a\u00020\"*\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/assets/entity/OverviewItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "fragment", "Lcom/kubi/assets/overview/account/AssetAccountFragment;", "<init>", "(Ljava/util/List;Lcom/kubi/assets/overview/account/AssetAccountFragment;)V", "getFragment", "()Lcom/kubi/assets/overview/account/AssetAccountFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "setAmountAndCurrency", "totalBalance", "Ljava/math/BigDecimal;", "execute", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "locationId", "", "setDataList", "it", "", "formatPercent", "", "total", "OverViewIntentListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2OverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2OverviewAdapter.kt\ncom/kubi/assets/overview/AssetV2OverviewAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,353:1\n1#2:354\n136#3:355\n*S KotlinDebug\n*F\n+ 1 AssetV2OverviewAdapter.kt\ncom/kubi/assets/overview/AssetV2OverviewAdapter\n*L\n278#1:355\n*E\n"})
public final class AssetV2OverviewAdapter extends BaseMultiItemQuickAdapter<OverviewItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetAccountFragment f18198i;

    /* JADX INFO: renamed from: j */
    public boolean f18199j;

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetV2OverviewAdapter$a */
    /* JADX INFO: compiled from: AssetV2OverviewAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "", "onHideZeroListener", "", TIMPushProvider.f75063o, "", "onEyesChangedListener", ViewProps.VISIBLE, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC10586a {
        /* JADX INFO: renamed from: T2 */
        void mo16633T2(boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2OverviewAdapter(@NotNull List<OverviewItemEntity> data, @NotNull AssetAccountFragment fragment) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18198i = fragment;
        addItemType(1, R$layout.item_overview);
        addItemType(2, R$layout.item_overview_transtion);
        int i11 = R$layout.overview_trans_header;
        addItemType(3, i11);
        addItemType(5, i11);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m18306i() {
        AssetsHelper.f18684a.m19157L();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"KCLongMethodCheck"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable OverviewItemEntity overviewItemEntity) {
        CommonAccountEntity mining;
        UnifiedAssetEntity unified;
        CommonAccountEntity alpha;
        SubAssetEntity copyTrading;
        CommonAccountEntity option;
        SubAssetEntity sub;
        EarnBalance earn;
        SubAssetEntity robot;
        AssetSingleEntity main;
        MarginEntity margin;
        AssetSingleEntity trade;
        EquityEntity kumex;
        Resources resources;
        Resources resources2;
        AssetV2OverviewAdapter assetV2OverviewAdapter = this;
        if (overviewItemEntity == null || baseViewHolder == null) {
            return;
        }
        AssetV2OverviewEntity assetV2OverviewEntityM18394G3 = assetV2OverviewAdapter.f18198i.getF18228W();
        int f38450c = overviewItemEntity.getF38450c();
        if (f38450c != 1) {
            ForegroundColorSpan foregroundColorSpan = null;
            if (f38450c == 2) {
                HistoryRecordEntity historyInfo = overviewItemEntity.getHistoryInfo();
                if (historyInfo != null) {
                    int i11 = R$id.tv_status;
                    BaseViewHolder text = baseViewHolder.setTextColor(i11, ContextCompat.getColor(assetV2OverviewAdapter.mContext, HistoryRecordEntity.getStatusColor$default(historyInfo, false, null, 2, null))).setText(R$id.tv_time, C42179a.m92633f(historyInfo.getTime(), null, true, true, null, 9, null));
                    int i12 = R$id.tv_amount;
                    Context mContext = assetV2OverviewAdapter.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    BaseViewHolder textColor = text.setTextColor(i12, C22890g.m54281f(mContext, !historyInfo.isWithdraw()));
                    Context mContext2 = assetV2OverviewAdapter.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    BaseViewHolder text2 = textColor.setText(i11, historyInfo.getStatusString(mContext2, historyInfo.isWithdraw(), overviewItemEntity.getHistoryInfo(), false)).setText(i12, historyInfo.getAmountTextString());
                    int i13 = R$id.tv_type;
                    Context mContext3 = assetV2OverviewAdapter.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                    text2.setText(i13, historyInfo.getTypeString(mContext3)).setVisible(i11, !historyInfo.isCompleted()).setBackgroundRes(i11, historyInfo.getStatusBackgroundRes());
                }
            } else if (f38450c == 5) {
                TextView textView = (TextView) baseViewHolder.getView(R$id.tv_recent_trans);
                Intrinsics.checkNotNull(textView);
                C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.assets.overview.k0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetV2OverviewAdapter.m18306i();
                    }
                }, 1, null);
                C27096v0 c27096v0 = new C27096v0();
                String string = assetV2OverviewAdapter.mContext.getString(R$string.assetv2_show_limit);
                Context context = assetV2OverviewAdapter.mContext;
                C27096v0 c27096v0M66903c = c27096v0.m66903c(string, (context == null || (resources2 = context.getResources()) == null) ? null : new ForegroundColorSpan(resources2.getColor(R$color.emphasis30)));
                String string2 = assetV2OverviewAdapter.mContext.getString(R$string.view_more);
                Context context2 = assetV2OverviewAdapter.mContext;
                if (context2 != null && (resources = context2.getResources()) != null) {
                    foregroundColorSpan = new ForegroundColorSpan(resources.getColor(R$color.primary));
                }
                c27096v0M66903c.m66903c(string2, foregroundColorSpan);
                Context mContext4 = assetV2OverviewAdapter.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
                int iM66565c = (int) C27025c.m66565c(mContext4, 16);
                Context mContext5 = assetV2OverviewAdapter.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext5, "mContext");
                ViewExtKt.m66585p(textView, 0, iM66565c, 0, (int) C27025c.m66565c(mContext5, 16), 5, null);
                textView.setTextSize(12.0f);
                textView.setGravity(1);
                textView.setText(c27096v0);
            }
        } else {
            OverviewAccountInfo accountInfo = overviewItemEntity.getAccountInfo();
            if (accountInfo != null && (kumex = accountInfo.getKumex()) != null) {
                baseViewHolder.setText(R$id.tv_name, assetV2OverviewAdapter.mContext.getString(R$string.futures));
                assetV2OverviewAdapter.m18309k(baseViewHolder, kumex.getTotalEquity(), C27025c.m66567e(kumex.getExecute(), true), assetV2OverviewEntityM18394G3, "futureAssetNo");
            }
            OverviewAccountInfo accountInfo2 = overviewItemEntity.getAccountInfo();
            if (accountInfo2 != null && (trade = accountInfo2.getTrade()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.trading);
                m18309k(baseViewHolder, trade.getTotalBalance(), C27025c.m66567e(trade.getExecute(), true), assetV2OverviewEntityM18394G3, "tradeAssetNo");
            }
            OverviewAccountInfo accountInfo3 = overviewItemEntity.getAccountInfo();
            if (accountInfo3 != null && (margin = accountInfo3.getMargin()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.lever_margin);
                m18309k(baseViewHolder, margin.getTotalBalanceIfExecuted(), C27025c.m66567e(margin.getExecute(), true), assetV2OverviewEntityM18394G3, "marginAssetNo");
            }
            OverviewAccountInfo accountInfo4 = overviewItemEntity.getAccountInfo();
            if (accountInfo4 != null && (main = accountInfo4.getMain()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.save_account_label);
                m18309k(baseViewHolder, main.getTotalBalance(), C27025c.m66567e(main.getExecute(), true), assetV2OverviewEntityM18394G3, "mainlAssetNo");
            }
            OverviewAccountInfo accountInfo5 = overviewItemEntity.getAccountInfo();
            if (accountInfo5 != null && (robot = accountInfo5.getRobot()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.kc_tb_asset_bot);
                m18309k(baseViewHolder, robot.getTotalBalance(), C27025c.m66567e(robot.getExecute(), true), assetV2OverviewEntityM18394G3, "botAssetNo");
            }
            OverviewAccountInfo accountInfo6 = overviewItemEntity.getAccountInfo();
            if (accountInfo6 != null && (earn = accountInfo6.getEarn()) != null) {
                baseViewHolder.setText(R$id.tv_name, AccountType.FINANCE.getNickNameRes());
                m18309k(baseViewHolder, earn.getTotalValue(), C27025c.m66567e(earn.getExecute(), true), assetV2OverviewEntityM18394G3, "earnAssetNo");
            }
            OverviewAccountInfo accountInfo7 = overviewItemEntity.getAccountInfo();
            if (accountInfo7 != null && (sub = accountInfo7.getSub()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.sub_account);
                m18309k(baseViewHolder, sub.getTotalBalance(), C27025c.m66567e(sub.getExecute(), true), assetV2OverviewEntityM18394G3, "subAssetNo");
            }
            OverviewAccountInfo accountInfo8 = overviewItemEntity.getAccountInfo();
            if (accountInfo8 != null && (option = accountInfo8.getOption()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.kc_options_title);
                m18309k(baseViewHolder, option.getTotalBalance(), C27025c.m66567e(option.getExecute(), true), assetV2OverviewEntityM18394G3, "optionsAssetNo");
            }
            OverviewAccountInfo accountInfo9 = overviewItemEntity.getAccountInfo();
            if (accountInfo9 != null && (copyTrading = accountInfo9.getCopyTrading()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.copytd_copy_trading);
                m18309k(baseViewHolder, copyTrading.getTotalBalance(), C27025c.m66567e(copyTrading.getExecute(), true), assetV2OverviewEntityM18394G3, "copyTradingAssetNo");
            }
            OverviewAccountInfo accountInfo10 = overviewItemEntity.getAccountInfo();
            if (accountInfo10 != null && (alpha = accountInfo10.getAlpha()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.asset_alpha_title);
                m18309k(baseViewHolder, alpha.getTotalBalance(), C27025c.m66567e(alpha.getExecute(), true), assetV2OverviewEntityM18394G3, "alphaAssetNo");
            }
            OverviewAccountInfo accountInfo11 = overviewItemEntity.getAccountInfo();
            if (accountInfo11 != null && (unified = accountInfo11.getUnified()) != null) {
                baseViewHolder.setText(R$id.tv_name, R$string.kc_unify_account);
                m18309k(baseViewHolder, unified.getTotalBalance(), C27025c.m66567e(unified.getExecute(), true), assetV2OverviewEntityM18394G3, "unifiedTradingAssetNo");
            }
            OverviewAccountInfo accountInfo12 = overviewItemEntity.getAccountInfo();
            if (accountInfo12 == null || (mining = accountInfo12.getMining()) == null) {
                assetV2OverviewAdapter = this;
            } else {
                baseViewHolder.setText(R$id.tv_name, R$string.kc_account_name_mining);
                boolean zM66567e = C27025c.m66567e(mining.getExecute(), true);
                BigDecimal totalBalance = mining.getTotalBalance();
                assetV2OverviewAdapter = this;
                assetV2OverviewAdapter.m18309k(baseViewHolder, totalBalance, zM66567e, assetV2OverviewEntityM18394G3, "miningAssetNo");
            }
        }
        ShowHideTextView.m54778d(baseViewHolder.itemView, assetV2OverviewAdapter.f18199j);
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m18308j(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C27096v0 c27096v0 = new C27096v0();
        if (bigDecimal2 == null || bigDecimal.doubleValue() == 0.0d || bigDecimal2.doubleValue() == 0.0d) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            c27096v0.append(C42180b.m92642g(ZERO, null, null, 0, false, false, false, 63, null));
            return c27096v0;
        }
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_UP);
        if (bigDecimalDivide != null) {
            if (bigDecimalDivide.doubleValue() == 0.0d) {
                if (C5303w0.m6511a()) {
                    StringBuilder sb2 = new StringBuilder();
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    sb2.append(C42180b.m92642g(ZERO2, null, null, 0, false, false, false, 63, null));
                    sb2.append(Typography.almostEqual);
                    c27096v0.append(sb2.toString());
                    return c27096v0;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Typography.almostEqual);
                BigDecimal ZERO3 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
                sb3.append(C42180b.m92642g(ZERO3, null, null, 0, false, false, false, 63, null));
                c27096v0.append(sb3.toString());
                return c27096v0;
            }
            c27096v0.append(C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 63, null));
        }
        return c27096v0;
    }

    /* JADX INFO: renamed from: k */
    public final void m18309k(BaseViewHolder baseViewHolder, BigDecimal bigDecimal, boolean z11, AssetV2OverviewEntity assetV2OverviewEntity, String str) {
        AssetSingleEntity total;
        BigDecimal totalAssetValue = assetV2OverviewEntity != null ? assetV2OverviewEntity.getTotalAssetValue() : null;
        String baseCurrency = assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null;
        int i11 = R$id.tv_amount;
        View view = baseViewHolder.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        boolean zAreEqual = false;
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i12 = R$id.tv_zero_show;
        View view2 = baseViewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        if (C27039d.m66647g(bigDecimal) > 0.0d || !z11) {
            baseViewHolder.getView(R$id.ll_amount_currency).setVisibility(0);
            baseViewHolder.getView(i12).setVisibility(8);
        } else {
            baseViewHolder.getView(R$id.ll_amount_currency).setVisibility(8);
            baseViewHolder.getView(i12).setVisibility(0);
        }
        CharSequence charSequenceM18308j = "--";
        if (!z11) {
            baseViewHolder.setText(i11, "--");
            baseViewHolder.setText(R$id.tv_currency, "--");
            C43852m.m96595g("B1overview", "errorTips", str, null, 8, null);
            Unit unit = Unit.INSTANCE;
        } else if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            baseViewHolder.setText(i11, C42828b.m93906g(C27041f.m66669i(bigDecimal != null ? C37885i.m85562a(bigDecimal, baseCurrency, C11273q.m20046b(baseCurrency)) : null, "--"), "≈", false, false, 6, null));
            baseViewHolder.setText(R$id.tv_currency, C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(bigDecimal), baseCurrency), null, null, 0, false, false, false, true, 63, null));
        } else {
            baseViewHolder.setText(R$id.tv_currency, C42828b.m93905f(C27041f.m66669i(bigDecimal != null ? C37885i.m85562a(bigDecimal, baseCurrency, C11273q.m20046b(baseCurrency)) : null, "--"), C27041f.m66668h(baseCurrency), true, true));
            baseViewHolder.setText(i11, C42828b.m93906g(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(bigDecimal), baseCurrency), null, null, 0, false, false, false, true, 63, null), "≈", false, false, 6, null));
        }
        int i13 = R$id.tv_percent;
        if (assetV2OverviewEntity != null && (total = assetV2OverviewEntity.getTotal()) != null) {
            zAreEqual = Intrinsics.areEqual(total.getExecute(), Boolean.FALSE);
        }
        if (!zAreEqual) {
            charSequenceM18308j = m18308j(C41014a.m89922G(bigDecimal, null, 1, null), totalAssetValue);
        }
        baseViewHolder.setText(i13, charSequenceM18308j);
    }

    /* JADX INFO: renamed from: l */
    public final void m18310l(boolean z11) {
        this.f18199j = z11;
    }
}
