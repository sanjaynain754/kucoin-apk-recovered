package com.kubi.assets;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.dialog.payment.AssetPaymentListConfig;
import com.kubi.assets.dialog.payment.AssetPaymentListConfigReq;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.AccountDetailFreezeEntity;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.AccountOrderEntity;
import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.assets.entity.AlphaTopTokenInfo;
import com.kubi.assets.entity.AssetCoinDetailEntity;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.assets.entity.AssetData;
import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.assets.entity.AssetSingleCurrencyBalance;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.B2CConfig;
import com.kubi.assets.entity.B2CLoanEntity;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.entity.ContactAddrAddEntity;
import com.kubi.assets.entity.ContactAddrdeleteEntity;
import com.kubi.assets.entity.ContactSuccessEntity;
import com.kubi.assets.entity.ContactsAddrEntity;
import com.kubi.assets.entity.CurrencyAssetsEntity;
import com.kubi.assets.entity.DelistCoinListResp;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.ExchangeRecordEntity;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.assets.entity.FinanceConfig;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.entity.FinanceRecommendEntity;
import com.kubi.assets.entity.FuturesTrialDetailsEntity;
import com.kubi.assets.entity.FuturesTrialEntity;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.assets.entity.LiteCurrencyDetail;
import com.kubi.assets.entity.MainRecommendDataItem;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.entity.MaxWithdrawData;
import com.kubi.assets.entity.ModifyTradeHoldingCostBody;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OnGoingEntity;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.assets.entity.ProfitLossAnalysisApiResponse;
import com.kubi.assets.entity.PwmProductEntity;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.assets.entity.SaveAccountOrderConfigBody;
import com.kubi.assets.entity.SetAccountSortEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.entity.SymbolResponse;
import com.kubi.assets.entity.TransferHistoryEntity;
import com.kubi.assets.entity.UnifiedAccountDetailEntity;
import com.kubi.assets.entity.UnifiedAccountOverview;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.entity.UnifiedOverviewEntity;
import com.kubi.assets.entity.UnifyPageEntity;
import com.kubi.assets.entity.UserAssetCostDetailEntity;
import com.kubi.assets.entity.WithdrawAddrAddEntity;
import com.kubi.assets.entity.WithdrawAddrInnerEntity;
import com.kubi.assets.entity.WithdrawAddrValidError;
import com.kubi.assets.entity.WithdrawAddrValidParam;
import com.kubi.assets.entity.WithdrawAddressBookEntity;
import com.kubi.assets.exchange.model.ConvertEntity;
import com.kubi.assets.exchange.model.ExchangeRequest;
import com.kubi.assets.freeze.entity.WithdrawPreFreezeEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.UnifiedMarginCurrencySettingEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: com.kubi.assets.h0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetV2Api.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000æ\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\bH'J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u00192\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000eH'J0\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00030\u00192\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010 H'J0\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00030\u00192\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010 H'J:\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00030\u00192\b\b\u0001\u0010#\u001a\u00020\u000e2\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010 H'JD\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00030\u00192\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'JD\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00030\u00192\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J0\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00030\u00192\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010*\u001a\u00020\u000eH'J(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0,0\b2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000eH'J\u001c\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0,0\bH'J\u001e\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\b2\b\b\u0003\u00102\u001a\u000203H'JM\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\u00030\u00192\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u00107\u001a\u00020\u000e2\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0002\u00109J(\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00192\b\b\u0001\u0010;\u001a\u00020\u000e2\b\b\u0003\u00107\u001a\u00020\u000eH'J0\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u001d0\u00030\u00192\u0014\b\u0001\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 H'J0\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u001d0\u00030\u00192\u0014\b\u0001\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\b2\b\b\u0001\u0010B\u001a\u00020\u000eH'J\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\b2\b\b\u0001\u0010B\u001a\u00020\u000eH'J \u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00032\b\b\u0001\u0010B\u001a\u00020\u000eH§@¢\u0006\u0002\u0010EJ \u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00032\b\b\u0001\u0010B\u001a\u00020\u000eH§@¢\u0006\u0002\u0010EJ \u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00032\b\b\u0001\u0010\u0011\u001a\u00020HH§@¢\u0006\u0002\u0010IJ\u0016\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u0003H§@¢\u0006\u0002\u0010\u0006J \u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00032\b\b\u0001\u0010\u0011\u001a\u00020MH§@¢\u0006\u0002\u0010NJ\"\u0010O\u001a\b\u0012\u0004\u0012\u00020A0\b2\b\b\u0001\u0010B\u001a\u00020\u000e2\b\b\u0003\u0010P\u001a\u00020\u0017H'J\u001c\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0,0\bH'J\u001e\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u000eH'J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u000eH§@¢\u0006\u0002\u0010EJ(\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U000\b2\b\b\u0003\u0010V\u001a\u0002032\b\b\u0003\u0010W\u001a\u00020\u000eH'J*\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00040\b2\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170 H'J(\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=000\b2\b\b\u0003\u0010[\u001a\u0002032\b\b\u0003\u0010\\\u001a\u000203H'J&\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u000eH'J\u0014\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_000\bH'J\u001e\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00030\u00192\b\b\u0001\u0010;\u001a\u00020\u000eH'J(\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00030\u00192\b\b\u0001\u0010b\u001a\u00020\u000e2\b\b\u0003\u0010\\\u001a\u000203H'J7\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\u00030\u00192\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0002\u0010eJ1\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0002\u0010gJ2\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00030\u00192\b\b\u0001\u00106\u001a\u00020\u000e2\b\b\u0001\u0010j\u001a\u00020\u000e2\b\b\u0001\u0010k\u001a\u00020\u000eH'J$\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m000\u00030\u00192\b\b\u0001\u0010n\u001a\u00020oH'J(\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00192\b\b\u0001\u0010q\u001a\u00020r2\b\b\u0003\u00107\u001a\u00020\u000eH'J4\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00192\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010q\u001a\u00020r2\b\b\u0003\u00107\u001a\u00020\u000eH'J>\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00030\u00192\b\b\u0001\u0010j\u001a\u00020\u000e2\b\b\u0001\u0010k\u001a\u00020\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010v\u001a\u00020\u000eH'J&\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\n\b\u0003\u0010x\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010y\u001a\u0004\u0018\u00010\u000eH'J\u001a\u0010z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{000\u00030\u0019H'J(\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00192\b\b\u0001\u0010q\u001a\u00020}2\b\b\u0003\u00107\u001a\u00020\u000eH'J)\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f000\b2\t\b\u0001\u0010q\u001a\u00030\u0080\u00012\b\b\u0003\u00107\u001a\u00020\u000eH'J6\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f000\b2\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u000e2\t\b\u0001\u0010q\u001a\u00030\u0080\u00012\b\b\u0003\u00107\u001a\u00020\u000eH'J!\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u0001000\b2\t\b\u0003\u0010\u0084\u0001\u001a\u00020\u0017H'J\u0016\u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0086\u00010\u00030\u0019H'J\u000f\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH'J \u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u0001000\b2\b\b\u0003\u0010\\\u001a\u000203H'J2\u0010\u008a\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010\u001d0\u00030\u00192\u0014\b\u0001\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 H'J(\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000eH'J&\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u00107\u001a\u00020\u000eH'J&\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u00107\u001a\u00020\u000eH'J \u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000f\b\u0001\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H'J#\u0010\u0093\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0094\u00010\u00040\b2\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000eH'J\u0016\u0010\u0096\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0097\u0001000\bH'J+\u0010\u0098\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\b2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010*\u001a\u00020\u000eH'J#\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00010\u00040\b2\u000b\b\u0003\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000eH'J#\u0010\u009c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u00040\b2\u000b\b\u0003\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\bH'J,\u0010 \u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u0001000\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010#\u001a\u00020\u000eH'J\u0010\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\bH'J%\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\t\b\u0001\u0010¥\u0001\u001a\u00020\u000e2\t\b\u0001\u0010¦\u0001\u001a\u000203H'J(\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\b2\t\b\u0003\u0010©\u0001\u001a\u00020\u000e2\u000b\b\u0003\u0010ª\u0001\u001a\u0004\u0018\u00010\u000eH'J)\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010\b2\u000b\b\u0003\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\u000eH'J\u0016\u0010®\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¯\u00010\u00040\bH'J\u0010\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\bH'J\u001a\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010\b2\b\b\u0003\u0010\u001b\u001a\u00020\u000eH'J&\u0010´\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030µ\u00010\u00040\u00030\u00192\b\b\u0003\u0010\u001b\u001a\u00020\u000eH'J\u001b\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\b2\t\b\u0001\u0010¸\u0001\u001a\u00020\u000eH'J\u001b\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030º\u00010\b2\t\b\u0001\u0010¸\u0001\u001a\u00020\u000eH'J\u0010\u0010»\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010\bH'J\u0010\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\bH'J\u0010\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\bH'J\u0010\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\bH'J2\u0010Â\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ã\u00010\u001d0\u00030\u00192\t\b\u0003\u0010Ä\u0001\u001a\u00020\u000e2\t\b\u0003\u0010Å\u0001\u001a\u000203H'J\u0010\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010\bH'J\u0010\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030È\u00010\bH'J\u001a\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00010\b2\b\b\u0001\u0010\u001b\u001a\u00020\u000eH'J\"\u0010Ë\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00010\u00030\u00192\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000eH'J\u0019\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020=0\b2\b\b\u0001\u0010;\u001a\u00020\u000eH'J!\u0010Î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ï\u0001000\b2\t\b\u0003\u0010Ð\u0001\u001a\u00020\u000eH'J'\u0010Ñ\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\t\b\u0001\u0010Ò\u0001\u001a\u00020\u000e2\t\b\u0003\u0010Ð\u0001\u001a\u00020\u000eH'J=\u0010Ó\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u001d0\u00030\u00192\t\b\u0001\u0010Å\u0001\u001a\u0002032\t\b\u0001\u0010Õ\u0001\u001a\u0002032\t\b\u0003\u0010Ð\u0001\u001a\u00020\u000eH'J2\u0010Ö\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00040\u00030\u00192\t\b\u0001\u0010×\u0001\u001a\u00020\u000e2\t\b\u0003\u0010Ð\u0001\u001a\u00020\u000eH'J\u0016\u0010Ø\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ù\u0001000\bH'J#\u0010Ú\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\t\b\u0001\u0010\u0011\u001a\u00030Û\u0001H§@¢\u0006\u0003\u0010Ü\u0001J2\u0010Ý\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u001d0\u00030\u00192\t\b\u0001\u0010Å\u0001\u001a\u0002032\t\b\u0001\u0010Õ\u0001\u001a\u000203H'J'\u0010Þ\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00040\u00030\u00192\t\b\u0001\u0010×\u0001\u001a\u00020\u000eH'J&\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\b2\t\b\u0001\u0010á\u0001\u001a\u00020\u000e2\t\b\u0003\u0010â\u0001\u001a\u00020\u0017H'J\u001b\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030ä\u00010\b2\t\b\u0001\u0010å\u0001\u001a\u00020\u000eH'J9\u0010æ\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\b2\b\b\u0001\u0010B\u001a\u00020\u000e2\t\b\u0001\u0010è\u0001\u001a\u00020\u000e2\f\b\u0003\u0010é\u0001\u001a\u0005\u0018\u00010ê\u0001H'¢\u0006\u0003\u0010ë\u0001J\u001e\u0010ì\u0001\u001a\u0005\u0018\u00010í\u00012\t\b\u0001\u0010\u0011\u001a\u00030î\u0001H§@¢\u0006\u0003\u0010ï\u0001J\u0018\u0010ð\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030ñ\u0001\u0018\u0001000\bH'J\u0018\u0010ò\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030ó\u0001\u0018\u0001000\bH'J\u000f\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\bH'J#\u0010õ\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030ö\u0001\u0018\u0001000\b2\t\b\u0003\u0010÷\u0001\u001a\u00020\u000eH'J\u001a\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u00010\b2\b\b\u0001\u0010B\u001a\u00020\u000eH'J\u0016\u0010ú\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030û\u00010\u00040\bH'J\u0012\u0010ü\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ý\u00010\bH'Jk\u0010þ\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0080\u00020ÿ\u00010\u00030\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u000e2\t\b\u0001\u0010\u0081\u0002\u001a\u00020\u000e2\t\b\u0001\u0010Õ\u0001\u001a\u0002032\t\b\u0001\u0010\u0082\u0002\u001a\u00020\u000e2\t\b\u0001\u0010Å\u0001\u001a\u0002032\n\b\u0001\u0010\u0083\u0002\u001a\u00030ê\u00012\n\b\u0001\u0010\u0084\u0002\u001a\u00030ê\u0001H'J \u0010\u0085\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0086\u00020\u00030\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u000eH'J \u0010\u0087\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u00020\u00030\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u000eH'J@\u0010\u0089\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008a\u00020\b2\t\b\u0001\u0010\u008b\u0002\u001a\u00020\u000e2\t\b\u0001\u0010Õ\u0001\u001a\u0002032\t\b\u0001\u0010Å\u0001\u001a\u0002032\u000b\b\u0003\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u000eH'J\u001b\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u008e\u00020\b2\t\b\u0001\u0010\u008f\u0002\u001a\u00020\u000eH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0090\u0002À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Api;", "", "suspendFetchB2cCurrencies", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/B2CLoanEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchB2cConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/assets/entity/B2CConfig;", "mainBalances", "Lcom/kubi/assets/entity/AccountItemEntity;", "tradeBalances", "digitCurrency", "", "fiatCurrency", "modifyTradeHoldingCost", TtmlNode.TAG_BODY, "Lcom/kubi/assets/entity/ModifyTradeHoldingCostBody;", "getSmallCoin", "Lcom/kubi/assets/entity/SmallEntity;", "accountSubBalanceSave", "showFlag", "", "fetchEtfCoin", "Lio/reactivex/Observable;", "Lcom/kubi/data/entity/EtfCoinEntity;", FirebaseAnalytics.Param.CURRENCY, "getMainDetail", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "hashMap", "Ljava/util/HashMap;", "getTradeDetail", "getLeverAccountDetail", "accountType", "getCurrencyBalance", "Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;", "getCurrencyAssetBalance", "getTradeDataBySymbols", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "getBizType", "", "type", "getUnifiedBizType", "fetchCovertFromCoin", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "isFiat", "", "getMultiChain", "Lcom/kubi/assets/entity/MultiChainEntity;", "chainId", "platFrom", "supportLightningNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "cancelWithdraw", "withdrawId", "getUserDepositlist", "Lcom/kubi/assets/entity/HistoryRecordEntity;", "pa", "getUserWithdrawList", "getAccountAsset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "balanceCurrency", "getAccountOrder", "suspendGetAccountAsset", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendGetAccountOrder", "suspendSetAccountOrder", "Lcom/kubi/assets/entity/SetAccountSortEntity;", "(Lcom/kubi/assets/entity/SetAccountSortEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountOrderConfig", "Lcom/kubi/assets/entity/AccountOrderEntity;", "saveAccountOrderConfig", "Lcom/kubi/assets/entity/SaveAccountOrderConfigBody;", "(Lcom/kubi/assets/entity/SaveAccountOrderConfigBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubAccountOrderedValue", "netAssets", "fetchFlashTradeConfig", "fetchFlashTradeByCurrency", "suspendFetchFlashTradeByCurrency", "fetchFinanceRecommend", "Lcom/kubi/assets/entity/FinanceRecommendEntity;", "products_limit", "lang", "getStakingProducts", "Lcom/kubi/assets/entity/EarnAccountItem;", "getRecentTransactions", "size", "version", "setUserConfig", "updateCurrencyList", "Lcom/kubi/data/entity/FiatCurrencyEntity;", "getWithdrawRecord", "getDepositRecord", "depositId", "getUniversalChainInfo", "hasEvm", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "queryUniversalChainList", "(Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "validateUniversalAddr", "Lcom/kubi/assets/entity/WithdrawAddrInnerEntity;", "address", "memo", "validatePreAdd", "Lcom/kubi/assets/entity/WithdrawAddrValidError;", "param", "Lcom/kubi/assets/entity/WithdrawAddrValidParam;", "addWithdrawAddr", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/assets/entity/WithdrawAddrAddEntity;", "addWithdrawAddrNew", "validationToken", "verifyInnerAddr", "header", "getGrayReleased", "function", "functionPlatform", "getContractAddr", "Lcom/kubi/assets/entity/ContactsAddrEntity;", "deleteContractAAddr", "Lcom/kubi/assets/entity/ContactAddrdeleteEntity;", "addContractAddr", "Lcom/kubi/assets/entity/ContactSuccessEntity;", "Lcom/kubi/assets/entity/ContactAddrAddEntity;", "addContractAddrNew", "getRollbackList", "Lcom/kubi/assets/entity/RollbackEntity;", "arrears", "checkWithdrawLimit", "Lcom/kubi/assets/entity/BlackGroupResponse;", "getLockAmount", "getMainRecommend", "Lcom/kubi/assets/entity/MainRecommendDataItem;", "queryTransferHistory", "Lcom/kubi/assets/entity/TransferHistoryEntity;", "getFreezeReason", "Lcom/kubi/assets/entity/AccountDetailFreezeEntity;", "getWithdrawAddress", "Lcom/kubi/assets/entity/WithdrawAddressBookEntity;", "getWithdrawAddress2", "deleteUserWithdrawAddress", "ids", "getAssetListByCurrency", "Lcom/kubi/assets/entity/AssetCoinEntity;", "legalCurrency", "getDelistCoinList", "Lcom/kubi/assets/entity/DelistCoinListResp;", "getSpotDataBySymbols", "getFinancialCurrencies", "Lcom/kubi/assets/entity/FinanceCoinEntity;", "productZone", "getFinancialProducts", "Lcom/kubi/assets/entity/FinanceProductEntity;", "getFinancialDefaultProducts", "Lcom/kubi/assets/entity/PwmProductEntity;", "getWithdrawSupportAccounts", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "getFinancialConfig", "Lcom/kubi/assets/entity/FinanceConfig;", "switchUserRelock", "lockId", "isUserRelock", "fetchMarginPnl", "Lcom/kubi/assets/entity/MarginPnlEntity;", "baseCurrency", "positionType", "fetchOnGoingData", "Lcom/kubi/assets/entity/OnGoingEntity;", "businessLine", "fetchDynamicsData", "Lcom/kubi/assets/entity/DynamicsEntity;", "getHoldEarnInfo", "Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "fetchOptionOverview", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "fetchOptionSymbol", "Lcom/kubi/assets/entity/SymbolResponse;", "getNewPointByRange", "Lcom/kubi/assets/entity/ProfitLossAnalysisApiResponse;", "rangeV2", "getNewOverview", "Lcom/kubi/assets/entity/NewOverviewEntity;", "getOverview", "Lcom/kubi/assets/entity/OldOverviewEntity;", "fetchSpotAccountOverview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "fetchUnifiedOverviewPnlData", "Lcom/kubi/assets/entity/UnifiedOverviewEntity;", "fetchFuturesAccountOverview", "fetchOptionPositionList", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "positionId", "pageSize", "isWithdrawLimit", "isWithdrawFreeze", "Lcom/kubi/assets/freeze/entity/WithdrawPreFreezeEntity;", "getAssetCoinDetail", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "getLiteCurrencyDetail", "Lcom/kubi/assets/entity/LiteCurrencyDetail;", "fetchWithdrawRecord", "queryRedeemableList", "Lcom/kubi/assets/entity/RedeemableEntity;", "userAccountType", "convertSmallAssets", "currencys", "exchangeGhostCoinHistory", "Lcom/kubi/assets/entity/ExchangeRecordEntity;", "currentPage", "getExchangeDetails", "exchangeId", "querySmallAssets", "Lcom/kubi/assets/exchange/model/ConvertEntity;", "exchangeSmallAssets", "Lcom/kubi/assets/exchange/model/ExchangeRequest;", "(Lcom/kubi/assets/exchange/model/ExchangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySmallAssetsExchangeRecord", "querySmallAssetsExchangeDetail", "fetchAssetFutures", "Lcom/kubi/assets/entity/AssetFuturesEntity;", "conversionUnit", "includeTrialFund", "fetchTrialDetailsFlow", "Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;", "id", "fetchTotalAssets", "Lcom/kubi/assets/entity/AssetData;", "trendRangeV2", "cacheTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "fetchAssetAggregateConfig", "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfigReq;", "(Lcom/kubi/assets/dialog/payment/AssetPaymentListConfigReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlphaCoinList", "Lcom/kubi/assets/entity/AlphaAssetEntity;", "getAlphaNetworkList", "Lcom/kubi/assets/entity/AlphaChainInfo;", "isAlphaEnabled", "getRecommendedCoins", "Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "topN", "fetchUnifyOverview", "Lcom/kubi/assets/entity/UnifiedAccountOverview;", "unifiedAccountList", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "fetchUnifiedMarginCurrencyList", "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "getUnifyAccountDetail", "Lcom/kubi/assets/entity/UnifyPageEntity;", "Lcom/kubi/assets/entity/UnifiedAccountDetailEntity;", "direction", "bizType", "startAt", "endAt", "queryMaxWithdraw", "Lcom/kubi/assets/entity/MaxWithdrawData;", "queryByCurrency", "Lcom/kubi/assets/entity/CurrencyAssetsEntity;", "fetchTrialList", "Lcom/kubi/assets/entity/FuturesTrialEntity;", "status", "prizeType", "getUserAssetCostDetail", "Lcom/kubi/assets/entity/UserAssetCostDetailEntity;", AppsFlyerProperties.CURRENCY_CODE, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AssetV2Api {
    @GET("ultra-account/unified/inner/account/query-by-currency")
    @NotNull
    /* JADX INFO: renamed from: A0 */
    Observable<BaseEntity<CurrencyAssetsEntity>> m17072A0(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:withdraw-address-add"})
    @POST("payment/v4/withdraw-address/batch-add")
    @NotNull
    /* JADX INFO: renamed from: A1 */
    Observable<BaseEntity<Object>> m17073A1(@Header("X-VALIDATION-TOKEN") @Nullable String str, @Body @NotNull WithdrawAddrAddEntity withdrawAddrAddEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    @GET("asset-front/assets/saving-recommend")
    @NotNull
    /* JADX INFO: renamed from: B0 */
    InterfaceC41634e<List<MainRecommendDataItem>> m17074B0(@Query("version") int i11);

    @FormUrlEncoded
    @POST("v1/account/show-sub-account-balance/save")
    @NotNull
    /* JADX INFO: renamed from: C */
    InterfaceC41634e<Object> m17075C(@Field("showFlag") boolean z11);

    @GET("v1/api-reaper/flash-trade/config")
    @NotNull
    /* JADX INFO: renamed from: C0 */
    InterfaceC41634e<Map<String, String>> m17076C0();

    @GET("v1/asset/currency/chain-info")
    @NotNull
    /* JADX INFO: renamed from: C1 */
    Observable<BaseEntity<ArrayList<MultiChainEntity>>> m17077C1(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("chainId") String str2, @Header("X-SERVICE-PLATFORM") @NotNull String str3, @Nullable @Query("supportLightningNetwork") Boolean bool);

    @GET("v1/api-reaper/flash-trade/valid-enter/{currency}")
    @Nullable
    /* JADX INFO: renamed from: D0 */
    Object m17078D0(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull Continuation<? super BaseEntity<Boolean>> continuation);

    @GET("v1/ghost-coin/exchange-history")
    @NotNull
    /* JADX INFO: renamed from: D1 */
    Observable<BaseEntity<BasePageEntity<ExchangeRecordEntity>>> m17079D1(@Query("pageSize") int i11, @Query("currentPage") int i12, @NotNull @Query("userAccountType") String str);

    @GET("v1/asset/freeze-reason/get")
    @NotNull
    /* JADX INFO: renamed from: E */
    InterfaceC41634e<AccountDetailFreezeEntity> m17080E(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("accountType") String str2);

    @GET("v1/ghost-coin/config")
    @NotNull
    /* JADX INFO: renamed from: F */
    InterfaceC41634e<SmallEntity> m17081F();

    @GET("ultra-account/unified/inner/account/account-overview")
    @NotNull
    /* JADX INFO: renamed from: F1 */
    InterfaceC41634e<UnifiedAccountOverview> m17082F1(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @GET("v1/mobile/alpha/networks")
    @NotNull
    /* JADX INFO: renamed from: G */
    InterfaceC41634e<List<AlphaChainInfo>> m17083G();

    @GET("ultra-account/unified/inner/account/query-max-withdraw")
    @NotNull
    /* JADX INFO: renamed from: G0 */
    Observable<BaseEntity<MaxWithdrawData>> m17084G0(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @GET("v1/asset/account/query/type-sort")
    @Nullable
    /* JADX INFO: renamed from: H0 */
    Object m17085H0(@NotNull Continuation<? super BaseEntity<AccountOrderEntity>> continuation);

    @GET("v1/asset/deposit/list")
    @NotNull
    /* JADX INFO: renamed from: I */
    Observable<BaseEntity<BasePageEntity<HistoryRecordEntity>>> m17086I(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v1/asset/lite/currency/detail")
    @NotNull
    /* JADX INFO: renamed from: I0 */
    Observable<BaseEntity<LiteCurrencyDetail>> m17087I0(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @GET("v2/currency-unit")
    @NotNull
    /* JADX INFO: renamed from: J0 */
    InterfaceC41634e<List<FiatCurrencyEntity>> m17088J0();

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: K */
    InterfaceC41634e<ArrayList<TradeItemBean>> m17089K(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @GET("payment/inner-withdraw-contract/list")
    @NotNull
    /* JADX INFO: renamed from: K0 */
    Observable<BaseEntity<List<ContactsAddrEntity>>> m17090K0();

    @GET("earn/v4/hold-currencies/assets")
    @NotNull
    /* JADX INFO: renamed from: L0 */
    InterfaceC41634e<ArrayList<FinanceCoinEntity>> m17091L0(@Nullable @Query("product_zone") String str);

    @GET("v1/loan-b2c/condition-currencies")
    @Nullable
    /* JADX INFO: renamed from: M */
    Object m17092M(@NotNull Continuation<? super BaseEntity<ArrayList<B2CLoanEntity>>> continuation);

    @GET("v1/margin/today-pnl")
    @NotNull
    /* JADX INFO: renamed from: M0 */
    InterfaceC41634e<MarginPnlEntity> m17093M0(@NotNull @Query("baseCurrency") String str, @Nullable @Query("positionType") String str2);

    @Headers({"HEADER_FINGER_EVENT:withdraw-address-get"})
    @GET("v2/asset/withdraw-coll-address/get")
    @NotNull
    /* JADX INFO: renamed from: N */
    InterfaceC41634e<WithdrawAddressBookEntity> m17094N(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    @GET("discover-new/assert/alpha/all_tradable/default_sort/top_n")
    @NotNull
    /* JADX INFO: renamed from: N0 */
    InterfaceC41634e<List<AlphaTopTokenInfo>> m17095N0(@NotNull @Query("topN") String str);

    @GET("payment/deposit/get")
    @NotNull
    /* JADX INFO: renamed from: O0 */
    Observable<BaseEntity<HistoryRecordEntity>> m17096O0(@NotNull @Query("depositId") String str, @Query("version") int i11);

    @GET("asset-front/user-asset-cost/detail")
    @NotNull
    /* JADX INFO: renamed from: Q */
    InterfaceC41634e<UserAssetCostDetailEntity> m17097Q(@NotNull @Query(AppsFlyerProperties.CURRENCY_CODE) String str);

    @GET("earn/v1/config")
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    InterfaceC41634e<FinanceConfig> m17098Q0();

    @POST("v1/staking/products")
    @NotNull
    /* JADX INFO: renamed from: R */
    InterfaceC41634e<ArrayList<EarnAccountItem>> m17099R(@Body @NotNull HashMap<String, Boolean> map);

    @Headers({"HEADER_FINGER_EVENT:inner-withdraw-delFav"})
    @POST("payment/inner-withdraw-contract/batch-delete")
    @NotNull
    /* JADX INFO: renamed from: R0 */
    Observable<BaseEntity<Object>> m17100R0(@Body @NotNull ContactAddrdeleteEntity contactAddrdeleteEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str);

    @GET("v1/asset/ongoing")
    @NotNull
    /* JADX INFO: renamed from: S */
    InterfaceC41634e<OnGoingEntity> m17101S(@Nullable @Query("businessLine") String str, @Nullable @Query("balanceCurrency") String str2);

    @GET("v6/asset/account/total-balance-order")
    @NotNull
    /* JADX INFO: renamed from: S0 */
    InterfaceC41634e<AssetV2OverviewEntity> m17102S0(@NotNull @Query("balanceCurrency") String str);

    @GET("payment/withdraw-address/chain-info")
    @NotNull
    /* JADX INFO: renamed from: T */
    InterfaceC41634e<ArrayList<MultiChainEntity>> m17103T(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("hasEvm") Boolean bool);

    @FormUrlEncoded
    @POST("v1/withdraw/cancel")
    @NotNull
    /* JADX INFO: renamed from: T0 */
    Observable<BaseEntity<Object>> m17104T0(@Field("withdrawId") @NotNull String str, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    @POST("v1/asset/accountType/sort-config")
    @Nullable
    /* JADX INFO: renamed from: U */
    Object m17105U(@Body @NotNull SaveAccountOrderConfigBody saveAccountOrderConfigBody, @NotNull Continuation<? super BaseEntity<String>> continuation);

    @GET("v1/asset/overview")
    @NotNull
    /* JADX INFO: renamed from: U0 */
    InterfaceC41634e<NewOverviewEntity> m17106U0(@NotNull @Query("rangeV2") String str);

    @GET("v1/asset/withdrawAndDeposit/list")
    @NotNull
    /* JADX INFO: renamed from: V */
    InterfaceC41634e<List<HistoryRecordEntity>> m17107V(@Query("size") int i11, @Query("version") int i12);

    @GET("v1/mobile/alpha/alpha-balances")
    @NotNull
    /* JADX INFO: renamed from: V0 */
    InterfaceC41634e<List<AlphaAssetEntity>> m17108V0();

    @GET("ultra-account/unified/inner/account/account-list")
    @NotNull
    /* JADX INFO: renamed from: W0 */
    InterfaceC41634e<ArrayList<UnifiedAssetsEntity>> m17109W0() throws Throwable;

    @GET("v1/earn/app/hold-earn/recommendations")
    @NotNull
    /* JADX INFO: renamed from: X */
    InterfaceC41634e<HoldEarnInfoEntity> m17110X();

    @GET("asset-front/account/currency-balances")
    @NotNull
    /* JADX INFO: renamed from: Y */
    InterfaceC41634e<List<SingleCurrencyBalance>> m17111Y(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("accountType") String str2);

    @GET("v5/asset/account/total-balance-order")
    @Nullable
    /* JADX INFO: renamed from: Y0 */
    Object m17112Y0(@NotNull @Query("balanceCurrency") String str, @NotNull Continuation<? super BaseEntity<AssetV2OverviewEntity>> continuation);

    @GET("v1/spot/account/data/overview")
    @NotNull
    /* JADX INFO: renamed from: Z */
    InterfaceC41634e<SpotAccountOverviewEntity> m17113Z();

    @GET("v1/margin/position/small-assets-exchange-detail")
    @NotNull
    /* JADX INFO: renamed from: Z0 */
    Observable<BaseEntity<ArrayList<ExchangeRecordEntity>>> m17114Z0(@NotNull @Query("exchangeId") String str);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m17115a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v1/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: a0 */
    Observable<BaseEntity<AssetSingleCurrencyBalance>> m17116a0(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2, @Field("digitCurrency") @Nullable String str3, @Field("fiatCurrency") @Nullable String str4);

    @POST("payment/withdraw-address/add-address/pre-validate")
    @NotNull
    /* JADX INFO: renamed from: a1 */
    Observable<BaseEntity<List<WithdrawAddrValidError>>> m17117a1(@Body @NotNull WithdrawAddrValidParam withdrawAddrValidParam);

    @GET("v1/account/biz-type")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Map<String, String>> m17118b(@Nullable @Query("type") String str);

    @GET("earn/v4/hold-categories/assets")
    @NotNull
    /* JADX INFO: renamed from: b0 */
    InterfaceC41634e<ArrayList<FinanceProductEntity>> m17119b0(@Nullable @Query("product_zone") String str);

    @GET("v1/ghost-coin/exchange-details")
    @NotNull
    /* JADX INFO: renamed from: b1 */
    Observable<BaseEntity<ArrayList<ExchangeRecordEntity>>> m17120b1(@NotNull @Query("exchangeId") String str, @NotNull @Query("userAccountType") String str2);

    @GET("payment/v2/withdraw/get")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<HistoryRecordEntity>> m17121c(@NotNull @Query("withdrawId") String str);

    @FormUrlEncoded
    @POST("v2/asset/withdraw-address/verify-inner")
    @NotNull
    /* JADX INFO: renamed from: c0 */
    Observable<BaseEntity<WithdrawAddrInnerEntity>> m17122c0(@Field("address") @NotNull String str, @Field("memo") @NotNull String str2, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str3, @Header("X-SERVICE-PLATFORM") @NotNull String str4);

    @GET("ultra-account/unified/inner/config/biz-types")
    @NotNull
    /* JADX INFO: renamed from: c1 */
    InterfaceC41634e<Map<String, String>> m17123c1();

    @GET("v2/account/main-balances")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<ArrayList<AccountItemEntity>> m17124d();

    @GET("asset-front/gray-released")
    @NotNull
    /* JADX INFO: renamed from: d0 */
    InterfaceC41634e<Boolean> m17125d0(@Nullable @Query("function") String str, @Nullable @Query("functionPlatform") String str2);

    @GET("v1/api-reaper/flash-trade/valid-enter/{currency}")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<Boolean>> m17126e(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str);

    @GET("v2/kumex-account/account-total-equity")
    @NotNull
    /* JADX INFO: renamed from: e1 */
    InterfaceC41634e<AssetFuturesEntity> m17127e1(@NotNull @Query("conversionUnit") String str, @Query("includeTrialFund") boolean z11) throws Throwable;

    @GET("v1/trial/getUserTrialCouponList")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<FuturesTrialEntity> m17128f(@NotNull @Query("status") String str, @Query("currentPage") int i11, @Query("pageSize") int i12, @Nullable @Query("prizeType") String str2) throws Throwable;

    @POST("v1/asset/query/transfer-order/page")
    @NotNull
    /* JADX INFO: renamed from: f0 */
    Observable<BaseEntity<BasePageEntity<TransferHistoryEntity>>> m17129f0(@Body @NotNull HashMap<String, String> map);

    @GET("v1/account/trade-main-balances")
    @NotNull
    /* JADX INFO: renamed from: f1 */
    InterfaceC41634e<List<CoinInfoEntity>> m17130f1(@Query("isFiat") int i11);

    @GET("v1/user/black-group/withdraw")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<BlackGroupResponse>> m17131g();

    @GET("v1/asset/dynamics/list")
    @NotNull
    /* JADX INFO: renamed from: g0 */
    InterfaceC41634e<ArrayList<DynamicsEntity>> m17132g0();

    @GET("ultra-account/unified/inner/account/account-tx-by-condition")
    @NotNull
    /* JADX INFO: renamed from: g1 */
    Observable<BaseEntity<UnifyPageEntity<UnifiedAccountDetailEntity>>> m17133g1(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("direction") String str2, @Query("currentPage") int i11, @NotNull @Query("bizType") String str3, @Query("pageSize") int i12, @Query("startAt") long j11, @Query("endAt") long j12) throws Throwable;

    @GET("payment/deposit/rollback/list")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<List<RollbackEntity>> m17134h(@Query("arrears") boolean z11);

    @FormUrlEncoded
    @POST("v1/account/detail")
    @NotNull
    /* JADX INFO: renamed from: h0 */
    Observable<BaseEntity<BasePageEntity<AccountDetailEntity>>> m17135h0(@Field("accountType") @NotNull String str, @FieldMap @NotNull HashMap<String, Object> map);

    @GET("v1/asset/trend")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<ProfitLossAnalysisApiResponse> m17136i(@NotNull @Query("rangeV2") String str);

    @GET("asset-delisting/asset/offline-currency/user-balance-query")
    @NotNull
    /* JADX INFO: renamed from: i0 */
    InterfaceC41634e<List<DelistCoinListResp>> m17137i0();

    @GET("v2/account/trade-balances")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<ArrayList<AccountItemEntity>> m17138j(@Nullable @Query("digitCurrency") String str, @Nullable @Query("fiatCurrency") String str2);

    @GET("v1/loan-b2c/configs")
    @NotNull
    /* JADX INFO: renamed from: j0 */
    InterfaceC41634e<B2CConfig> m17139j0();

    @GET("v1/margin/position/query-small-assets")
    @NotNull
    /* JADX INFO: renamed from: j1 */
    InterfaceC41634e<List<ConvertEntity>> m17140j1();

    @GET("payment/lock-amount")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<String> m17141k();

    @Headers({"HEADER_FINGER_EVENT:withdraw-address-delete"})
    @POST("v1/withdraw-address/delete")
    @NotNull
    /* JADX INFO: renamed from: k0 */
    InterfaceC41634e<Object> m17142k0(@Body @NotNull ArrayList<String> arrayList);

    @GET("payment/withdraw-address/universal-address/validate")
    @NotNull
    /* JADX INFO: renamed from: k1 */
    Observable<BaseEntity<WithdrawAddrInnerEntity>> m17143k1(@NotNull @Query("chainId") String str, @NotNull @Query("address") String str2, @NotNull @Query("memo") String str3);

    @FormUrlEncoded
    @POST("v2/auth/user-locale")
    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC41634e<Object> m17144l(@Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str, @Field("balanceCurrency") @Nullable String str2);

    @POST("pmtapi/payment/method/aggregate")
    @Nullable
    /* JADX INFO: renamed from: l1 */
    Object m17145l1(@Body @NotNull AssetPaymentListConfigReq assetPaymentListConfigReq, @NotNull Continuation<? super AssetPaymentListConfig> continuation) throws Throwable;

    @GET("v1/margin-fund/fund/currency/info")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<EtfCoinEntity>> m17146m(@Nullable @Query(AppsFlyerProperties.CURRENCY_CODE) String str);

    @GET("v1/mobile/alpha/enabled")
    @NotNull
    /* JADX INFO: renamed from: m0 */
    InterfaceC41634e<Boolean> m17147m0();

    @GET("v1/user/black-group/withdraw")
    @NotNull
    /* JADX INFO: renamed from: m1 */
    InterfaceC41634e<BlackGroupResponse> m17148m1();

    @GET("v2/withdraw/list")
    @NotNull
    /* JADX INFO: renamed from: n0 */
    Observable<BaseEntity<BasePageEntity<HistoryRecordEntity>>> m17149n0(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v2/products/recommendations")
    @NotNull
    /* JADX INFO: renamed from: n1 */
    InterfaceC41634e<List<FinanceRecommendEntity>> m17150n1(@Query("products_limit") int i11, @NotNull @Query("lang") String str);

    @POST("v1/ghost-coin/exchange")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<Object> m17151o(@NotNull @Query("currencys") String str, @NotNull @Query("userAccountType") String str2);

    @POST("v1/asset/account/display/mode")
    @Nullable
    /* JADX INFO: renamed from: o0 */
    Object m17152o0(@Body @NotNull SetAccountSortEntity setAccountSortEntity, @NotNull Continuation<? super BaseEntity<AssetV2OverviewEntity>> continuation);

    @GET("v1/margin-option/user/positions")
    @NotNull
    /* JADX INFO: renamed from: o1 */
    Observable<BaseEntity<BasePageEntity<OptionsPositionEntity>>> m17153o1(@NotNull @Query("positionId") String str, @Query("pageSize") int i11);

    @GET("asset-front/asset/currency/detail")
    @NotNull
    /* JADX INFO: renamed from: p */
    InterfaceC41634e<AssetCoinDetailEntity> m17154p(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @Headers({"HEADER_FINGER_EVENT:withdraw-address-add"})
    @POST("payment/withdraw-address/batch-add")
    @NotNull
    /* JADX INFO: renamed from: p1 */
    Observable<BaseEntity<Object>> m17155p1(@Body @NotNull WithdrawAddrAddEntity withdrawAddrAddEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str);

    @GET("v1/asset/detail-in-currency")
    @NotNull
    /* JADX INFO: renamed from: q */
    InterfaceC41634e<ArrayList<AssetCoinEntity>> m17156q(@Nullable @Query("legalCurrency") String str);

    @FormUrlEncoded
    @POST("v1/account/main-detail")
    @NotNull
    /* JADX INFO: renamed from: q0 */
    Observable<BaseEntity<BasePageEntity<AccountDetailEntity>>> m17157q0(@FieldMap @NotNull HashMap<String, Object> map);

    @GET("v1/margin-option/user/trade")
    @NotNull
    /* JADX INFO: renamed from: q1 */
    Observable<BaseEntity<ArrayList<SymbolResponse>>> m17158q1(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @FormUrlEncoded
    @POST("v1/asset/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<AssetSingleCurrencyBalance>> m17159r(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2, @Field("digitCurrency") @Nullable String str3, @Field("fiatCurrency") @Nullable String str4);

    @GET("payment/v2/withdraw/get")
    @NotNull
    /* JADX INFO: renamed from: r0 */
    InterfaceC41634e<HistoryRecordEntity> m17160r0(@NotNull @Query("withdrawId") String str);

    @FormUrlEncoded
    @POST("v1/earn/app/user-relock/switch")
    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC41634e<Object> m17161s(@Field("lock_id") @NotNull String str, @Field("is_user_relock") int i11);

    @Headers({"HEADER_FINGER_EVENT:withdraw-address-get"})
    @GET("v1/asset/withdraw-coll-address/get")
    @NotNull
    /* JADX INFO: renamed from: s0 */
    InterfaceC41634e<WithdrawAddressBookEntity> m17162s0(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    @POST("asset-front/user-asset-cost/update")
    @NotNull
    /* JADX INFO: renamed from: s1 */
    InterfaceC41634e<Object> m17163s1(@Body @NotNull ModifyTradeHoldingCostBody modifyTradeHoldingCostBody);

    @GET("v1/km/pnl-analysis/overview")
    @NotNull
    /* JADX INFO: renamed from: t */
    InterfaceC41634e<SpotAccountOverviewEntity> m17164t();

    @GET("ultra-account/asset/data/overview")
    @NotNull
    /* JADX INFO: renamed from: t0 */
    InterfaceC41634e<UnifiedOverviewEntity> m17165t0();

    @FormUrlEncoded
    @POST("v1/account/trade-detail")
    @NotNull
    /* JADX INFO: renamed from: t1 */
    Observable<BaseEntity<BasePageEntity<AccountDetailEntity>>> m17166t1(@FieldMap @NotNull HashMap<String, Object> map);

    @GET("v1/asset/account/total-balance-order/sub-over-limit")
    @NotNull
    /* JADX INFO: renamed from: u0 */
    InterfaceC41634e<AssetV2OverviewEntity> m17167u0(@NotNull @Query("balanceCurrency") String str, @Query("netAssets") boolean z11);

    @GET("v1/margin-option/user/assets")
    @NotNull
    /* JADX INFO: renamed from: u1 */
    InterfaceC41634e<OptionsOverviewEntity> m17168u1(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @GET("payment/withdraw-address/chain-info")
    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<BaseEntity<ArrayList<MultiChainEntity>>> m17169v(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("hasEvm") Boolean bool);

    @GET("v5/asset/account/total-balance-order")
    @NotNull
    /* JADX INFO: renamed from: v0 */
    InterfaceC41634e<AssetV2OverviewEntity> m17170v0(@NotNull @Query("balanceCurrency") String str);

    @Headers({"HEADER_FINGER_EVENT:inner-withdraw-addFav"})
    @POST("payment/v2/inner-withdraw-contract/batch-add")
    @NotNull
    /* JADX INFO: renamed from: v1 */
    InterfaceC41634e<List<ContactSuccessEntity>> m17171v1(@Header("X-VALIDATION-TOKEN") @Nullable String str, @Body @NotNull ContactAddrAddEntity contactAddrAddEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    @POST("v1/margin/position/small-assets-exchange")
    @Nullable
    /* JADX INFO: renamed from: w0 */
    Object m17172w0(@Body @NotNull ExchangeRequest exchangeRequest, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/trial/getUserTrialCouponById")
    @NotNull
    /* JADX INFO: renamed from: w1 */
    InterfaceC41634e<FuturesTrialDetailsEntity> m17173w1(@NotNull @Query("code") String str) throws Throwable;

    @GET("ultra-account/unified/inner/margin-currency/list")
    @NotNull
    /* JADX INFO: renamed from: x0 */
    InterfaceC41634e<UnifiedMarginCurrencySettingEntity> m17174x0() throws Throwable;

    @GET("v1/wealth-manage/recommend-products")
    @NotNull
    /* JADX INFO: renamed from: x1 */
    InterfaceC41634e<PwmProductEntity> m17175x1();

    @GET("v1/margin/position/small-assets-exchange-record")
    @NotNull
    /* JADX INFO: renamed from: y */
    Observable<BaseEntity<BasePageEntity<ExchangeRecordEntity>>> m17176y(@Query("size") int i11, @Query("page") int i12);

    @GET("payment/asset/user/withdraw/frozen/status")
    @NotNull
    /* JADX INFO: renamed from: y0 */
    InterfaceC41634e<WithdrawPreFreezeEntity> m17177y0();

    @GET("v6/asset/account/total-balance-order")
    @Nullable
    /* JADX INFO: renamed from: y1 */
    Object m17178y1(@NotNull @Query("balanceCurrency") String str, @NotNull Continuation<? super BaseEntity<AssetV2OverviewEntity>> continuation);

    @GET("v1/asset/home-page/asset/overview")
    @NotNull
    /* JADX INFO: renamed from: z */
    InterfaceC41634e<AssetData> m17179z(@NotNull @Query("balanceCurrency") String str, @NotNull @Query("trendRangeV2") String str2, @Header("Cache-Time") @Nullable Long l11);

    @Headers({"HEADER_FINGER_EVENT:inner-withdraw-addFav"})
    @POST("payment/inner-withdraw-contract/batch-add")
    @NotNull
    /* JADX INFO: renamed from: z0 */
    InterfaceC41634e<List<ContactSuccessEntity>> m17180z0(@Body @NotNull ContactAddrAddEntity contactAddrAddEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str);

    @GET("v1/ghost-coin/redeemable-list")
    @NotNull
    /* JADX INFO: renamed from: z1 */
    InterfaceC41634e<List<RedeemableEntity>> m17181z1(@NotNull @Query("userAccountType") String str);

    /* JADX INFO: renamed from: A */
    static /* synthetic */ Observable m17046A(AssetV2Api assetV2Api, ContactAddrdeleteEntity contactAddrdeleteEntity, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteContractAAddr");
        }
        if ((i11 & 2) != 0) {
            str = "KUCOIN";
        }
        return assetV2Api.m17100R0(contactAddrdeleteEntity, str);
    }

    /* JADX INFO: renamed from: B */
    static /* synthetic */ InterfaceC41634e m17047B(AssetV2Api assetV2Api, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMainRecommend");
        }
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return assetV2Api.m17074B0(i11);
    }

    /* JADX INFO: renamed from: B1 */
    static /* synthetic */ InterfaceC41634e m17048B1(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSpotDataBySymbols");
        }
        if ((i11 & 2) != 0) {
            str2 = "android/trade_info";
        }
        return assetV2Api.m17089K(str, str2);
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ InterfaceC41634e m17049D(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOnGoingData");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        }
        return assetV2Api.m17101S(str, str2);
    }

    /* JADX INFO: renamed from: E0 */
    static /* synthetic */ InterfaceC41634e m17050E0(AssetV2Api assetV2Api, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryRedeemableList");
        }
        if ((i11 & 1) != 0) {
            str = "TRADE";
        }
        return assetV2Api.m17181z1(str);
    }

    /* JADX INFO: renamed from: E1 */
    static /* synthetic */ Observable m17051E1(AssetV2Api assetV2Api, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOptionSymbol");
        }
        if ((i11 & 1) != 0) {
            str = C38184b.f85884a.m86146a();
        }
        return assetV2Api.m17158q1(str);
    }

    /* JADX INFO: renamed from: F0 */
    static /* synthetic */ InterfaceC41634e m17052F0(AssetV2Api assetV2Api, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendedCoins");
        }
        if ((i11 & 1) != 0) {
            str = "3";
        }
        return assetV2Api.m17095N0(str);
    }

    /* JADX INFO: renamed from: H */
    static /* synthetic */ InterfaceC41634e m17053H(AssetV2Api assetV2Api, ContactAddrAddEntity contactAddrAddEntity, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addContractAddr");
        }
        if ((i11 & 2) != 0) {
            str = "KUCOIN";
        }
        return assetV2Api.m17180z0(contactAddrAddEntity, str);
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ InterfaceC41634e m17054J(AssetV2Api assetV2Api, String str, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUniversalChainList");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        return assetV2Api.m17103T(str, bool);
    }

    /* JADX INFO: renamed from: L */
    static /* synthetic */ InterfaceC41634e m17055L(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawAddress2");
        }
        if ((i11 & 2) != 0) {
            str2 = "KUCOIN";
        }
        return assetV2Api.m17094N(str, str2);
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ InterfaceC41634e m17056O(AssetV2Api assetV2Api, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecentTransactions");
        }
        if ((i13 & 1) != 0) {
            i11 = 11;
        }
        if ((i13 & 2) != 0) {
            i12 = 3;
        }
        return assetV2Api.m17107V(i11, i12);
    }

    /* JADX INFO: renamed from: P */
    static /* synthetic */ InterfaceC41634e m17057P(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawAddress");
        }
        if ((i11 & 2) != 0) {
            str2 = "KUCOIN";
        }
        return assetV2Api.m17162s0(str, str2);
    }

    /* JADX INFO: renamed from: P0 */
    static /* synthetic */ InterfaceC41634e m17058P0(AssetV2Api assetV2Api, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetListByCurrency");
        }
        if ((i11 & 1) != 0) {
            str = C41016c.m89965c();
        }
        return assetV2Api.m17156q(str);
    }

    /* JADX INFO: renamed from: W */
    static /* synthetic */ Observable m17059W(AssetV2Api assetV2Api, String str, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDepositRecord");
        }
        if ((i12 & 2) != 0) {
            i11 = 3;
        }
        return assetV2Api.m17096O0(str, i11);
    }

    /* JADX INFO: renamed from: X0 */
    static /* synthetic */ InterfaceC41634e m17060X0(AssetV2Api assetV2Api, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCovertFromCoin");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return assetV2Api.m17130f1(i11);
    }

    /* JADX INFO: renamed from: d1 */
    static /* synthetic */ Observable m17061d1(AssetV2Api assetV2Api, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultiChain");
        }
        if ((i11 & 4) != 0) {
            str3 = "KUCOIN";
        }
        if ((i11 & 8) != 0) {
            bool = Boolean.TRUE;
        }
        return assetV2Api.m17077C1(str, str2, str3, bool);
    }

    /* JADX INFO: renamed from: e0 */
    static /* synthetic */ InterfaceC41634e m17062e0(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGrayReleased");
        }
        if ((i11 & 1) != 0) {
            str = "INNER_WITHDRAW";
        }
        if ((i11 & 2) != 0) {
            str2 = "ANDROID";
        }
        return assetV2Api.m17125d0(str, str2);
    }

    /* JADX INFO: renamed from: h1 */
    static /* synthetic */ InterfaceC41634e m17063h1(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertSmallAssets");
        }
        if ((i11 & 2) != 0) {
            str2 = "TRADE";
        }
        return assetV2Api.m17151o(str, str2);
    }

    /* JADX INFO: renamed from: i1 */
    static /* synthetic */ Observable m17064i1(AssetV2Api assetV2Api, String str, String str2, String str3, String str4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyBalance");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return assetV2Api.m17116a0(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: l0 */
    static /* synthetic */ InterfaceC41634e m17065l0(AssetV2Api assetV2Api, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFinanceRecommend");
        }
        if ((i12 & 1) != 0) {
            i11 = 3;
        }
        if ((i12 & 2) != 0) {
            str = MultiLanguageManager.f46811g.getLocalString();
        }
        return assetV2Api.m17150n1(i11, str);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Observable m17066n(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExchangeDetails");
        }
        if ((i11 & 2) != 0) {
            str2 = "TRADE";
        }
        return assetV2Api.m17120b1(str, str2);
    }

    /* JADX INFO: renamed from: p0 */
    static /* synthetic */ Observable m17067p0(AssetV2Api assetV2Api, int i11, int i12, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeGhostCoinHistory");
        }
        if ((i13 & 4) != 0) {
            str = "TRADE";
        }
        return assetV2Api.m17079D1(i11, i12, str);
    }

    /* JADX INFO: renamed from: r1 */
    static /* synthetic */ InterfaceC41634e m17068r1(AssetV2Api assetV2Api, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubAccountOrderedValue");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return assetV2Api.m17167u0(str, z11);
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ InterfaceC41634e m17069u(AssetV2Api assetV2Api, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMarginPnl");
        }
        if ((i11 & 1) != 0) {
            str = "BTC";
        }
        if ((i11 & 2) != 0) {
            str2 = "MARGIN";
        }
        return assetV2Api.m17093M0(str, str2);
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ Observable m17070w(AssetV2Api assetV2Api, String str, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUniversalChainInfo");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        return assetV2Api.m17169v(str, bool);
    }

    /* JADX INFO: renamed from: x */
    static /* synthetic */ InterfaceC41634e m17071x(AssetV2Api assetV2Api, String str, ContactAddrAddEntity contactAddrAddEntity, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addContractAddrNew");
        }
        if ((i11 & 4) != 0) {
            str2 = "KUCOIN";
        }
        return assetV2Api.m17171v1(str, contactAddrAddEntity, str2);
    }
}
