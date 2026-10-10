package com.kubi.sdk.site;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.sdk.site.issue.SiteConfigMessage;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.site.config.LoginConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SiteConfigKey.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u008a\u0001\b\u0086\u0081\u0002\u0018\u0000 \u008c\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u008c\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001¨\u0006\u008d\u0001"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteVisibleConfigKey;", "", "configKey", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getConfigKey", "()Ljava/lang/String;", "None", "UCenter", "Kyc", "Kyb", "PersonalCenter", "HomePage", "MessageCenter", "KLine", "Feed", "Search", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, "Margin", "Option", "CLOUD_MINING", "Convert", "Futures", "Alpha", "Lite", "VolumeBoard", "Hot", "NewBoard", "Gainers", "Losers", "MarketCap", "Financing", "EARN_SAVINGS", "EARN_HOLD_TO_EARN", "ONGOING", "KCS", "CopyTrading", "TradingBot", "BotSpotGrid", "BotFuturesContractGrid", "Api", "Currency", "SpotGrowth", "PlatformGrowth", "PlatformGrowthRedPacket", "ActivityBench", "BasicBench", "Seo", "RebateBusiness", "InviteRebate", "ReferralCard", "FriendShare", "Affiliate", "ApiBroker", "NdBroker", "Payment", "KucoinPay", "KuCard", "Express", FastQuoteModel.PAY_P2P, "FastTrade", "ThirdParty", "FiatDeposit", "Web3Wallet", "ComplianceExhibitionPlatform", "TaxPlatform", "CustomerServiceSystem", "RiskSystem", "FinancialSystem", "ThirdLoginParty", "ThirdLoginTG", "PassKey", "SignUp", "SignUpMail", "SignUpPhone", "SignUpThirdTg", "TermsConditions", "MarketTermsConditions", "Login", "LoginMail", "LoginPhone", "LoginThirdTg", "Welfare", "Kcs", "KcsDiscount", "MyRewards", "SecurityGuard", "Vip", "SecurityPassword", "SecurityTradePassword", "SecurityPhone", "SecurityMail", "SecurityPhishing", "SecurityGa", "SecurityBiometrics", "SecurityPattern", "AppLockSettings", "KycEntry", "KycVerification", "KycAdvance", "KybEntry", "ReconciliationSystem", "UNIFIED", "ETF", "LOAN", "LEND", "HOME_FEED", "DataCenter", "TradeSetups", "MarginLend", "MarginKcsConvert", "MarginBonus", "EstFee", "SpotVoucher", "SentimentOverview", "CoinInfo", "RelateTrading", "LeverageIndex", "AiRanking", "AiTrendsAbnormal", "AiAssets", "DelistingCoinClaimRecord", "Opportunity", "AiSearchEntry", "PositionLineDisplay", "OrderLineDisplay", "TpslOrderModify", "IntelligentMonitoring", "MarketWidget", "SwitchAccount", "ReferralInputbox", "FeedTradeCoin", "MarginOneClickClose", "MarketOrderBaseQuote", "MaxBuyOrSell", "PriceAlert", "AverageCostPriceEditEnable", "TradingInfoIndexPrice", "TradingInfoIndexPriceSpotPrice", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SiteVisibleConfigKey {
    None("none"),
    UCenter("ucenter"),
    Kyc("kyc"),
    Kyb("kyb"),
    PersonalCenter("personal_center"),
    HomePage("home_page"),
    MessageCenter("message_center"),
    KLine("k_line"),
    Feed("feed"),
    Search(FirebaseAnalytics.Event.SEARCH),
    Spot(SearchCategory$Companion.SPOT),
    Margin(ViewProps.MARGIN),
    Option(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT),
    CLOUD_MINING("cloud_mining"),
    Convert("convert"),
    Futures(SearchCategory$Companion.FUTURES),
    Alpha("alpha"),
    Lite("lite"),
    VolumeBoard("volume_board"),
    Hot("hot"),
    NewBoard("new_board"),
    Gainers("gainers"),
    Losers("losers"),
    MarketCap("market_cap"),
    Financing("financing"),
    EARN_SAVINGS("earn_savings"),
    EARN_HOLD_TO_EARN("earn_hold_to_earn"),
    ONGOING("ongoing"),
    KCS("kcs"),
    CopyTrading("copy_trading"),
    TradingBot("trading_bot"),
    BotSpotGrid("bot_spot_grid"),
    BotFuturesContractGrid("bot_futures_contract_grid"),
    Api("api"),
    Currency(FirebaseAnalytics.Param.CURRENCY),
    SpotGrowth("spot_growth"),
    PlatformGrowth("platform_growth"),
    PlatformGrowthRedPacket("red_packet"),
    ActivityBench("activity_bench"),
    BasicBench("basic_bench"),
    Seo("seo"),
    RebateBusiness("rebate_business"),
    InviteRebate("invite_rebate"),
    ReferralCard("referral_card"),
    FriendShare("friend_share"),
    Affiliate("affiliate"),
    ApiBroker("api_broker"),
    NdBroker("nd_broker"),
    Payment("payment"),
    KucoinPay("kucoin_pay"),
    KuCard("kucard"),
    Express("express"),
    P2P("p2p"),
    FastTrade("fast_trade"),
    ThirdParty("3rd_party"),
    FiatDeposit("fiat_deposit"),
    Web3Wallet("web3_wallet"),
    ComplianceExhibitionPlatform("compliance_exhibition_platform"),
    TaxPlatform("tax_platform"),
    CustomerServiceSystem("customer_service_system"),
    RiskSystem("risk_control_system"),
    FinancialSystem("financial_system"),
    ThirdLoginParty("third_party"),
    ThirdLoginTG("3rd_tg"),
    PassKey(LoginConfig.PASSKEY),
    SignUp("signup"),
    SignUpMail("signup_mail"),
    SignUpPhone("signup_phone"),
    SignUpThirdTg("3rd_tg_reg"),
    TermsConditions("terms_conditions"),
    MarketTermsConditions("market_terms_conditions"),
    Login(FirebaseAnalytics.Event.LOGIN),
    LoginMail("login_mail"),
    LoginPhone("login_phone"),
    LoginThirdTg("3rd_tg_login"),
    Welfare("welfare"),
    Kcs("kcs"),
    KcsDiscount("kcs_discount"),
    MyRewards("my_rewards"),
    SecurityGuard("security_guard"),
    Vip("vip"),
    SecurityPassword("security_password"),
    SecurityTradePassword("security_trade_password"),
    SecurityPhone("security_phone"),
    SecurityMail("security_mail"),
    SecurityPhishing("security_phishing"),
    SecurityGa("security_ga"),
    SecurityBiometrics("security_biometrics"),
    SecurityPattern("security_pattern"),
    AppLockSettings("app_lock_settings"),
    KycEntry("kyc_entry"),
    KycVerification("kyc_verification"),
    KycAdvance("kyc_advance"),
    KybEntry("kyb_entry"),
    ReconciliationSystem("reconciliation_system"),
    UNIFIED("unified"),
    ETF("etf"),
    LOAN("loan"),
    LEND("lend"),
    HOME_FEED("app_homepage_feed"),
    DataCenter("data_center"),
    TradeSetups("trade_setups"),
    MarginLend("margin_Interestfreecoupons"),
    MarginKcsConvert("kcs_convert"),
    MarginBonus("voucher_margintrail"),
    EstFee("est_fee"),
    SpotVoucher("voucher"),
    SentimentOverview("sentiment_overview"),
    CoinInfo("coin_info"),
    RelateTrading("relate_trading"),
    LeverageIndex("margin_index_price"),
    AiRanking("ai_rankingentrance"),
    AiTrendsAbnormal("ai_trends_abnormal"),
    AiAssets("ai_assert_entry"),
    DelistingCoinClaimRecord("delisted_coin_claim_record"),
    Opportunity("opportunity"),
    AiSearchEntry("ai_search_entry"),
    PositionLineDisplay("position_line_display"),
    OrderLineDisplay("order_line_display"),
    TpslOrderModify("tpsl_order_modify"),
    IntelligentMonitoring("intelligent_monitoring"),
    MarketWidget("market_widget"),
    SwitchAccount("switch_account"),
    ReferralInputbox("referral_Inputbox"),
    FeedTradeCoin("feed_trade_tag"),
    MarginOneClickClose("margintrading_positions_closeall"),
    MarketOrderBaseQuote("market_order_base_quote"),
    MaxBuyOrSell("max_buy_or_sell"),
    PriceAlert("price_alert"),
    AverageCostPriceEditEnable("average_cost_price"),
    TradingInfoIndexPrice("tradinginfo_indexprice"),
    TradingInfoIndexPriceSpotPrice("tradinginfo_indexprice_spotprice");


    @NotNull
    private final String configKey;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f47824c = EnumEntriesKt.enumEntries(m58027a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SiteConfigKey.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteVisibleConfigKey$Companion;", "", "<init>", "()V", "tryParse", "Lcom/kubi/sdk/site/SiteVisibleConfigKey;", "configKey", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSiteConfigKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteVisibleConfigKey$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n*L\n1#1,540:1\n295#2,2:541\n48#3,2:543\n*S KotlinDebug\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteVisibleConfigKey$Companion\n*L\n430#1:541,2\n432#1:543,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SiteVisibleConfigKey tryParse(@NotNull String configKey) {
            SiteVisibleConfigKey next;
            Intrinsics.checkNotNullParameter(configKey, "configKey");
            Iterator<SiteVisibleConfigKey> it = SiteVisibleConfigKey.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getConfigKey(), configKey));
            SiteVisibleConfigKey siteVisibleConfigKey = next;
            if (siteVisibleConfigKey != null) {
                return siteVisibleConfigKey;
            }
            C43846g.m96568c(new SiteConfigMessage("SiteVisibleConfigKey", "未找到SiteVisibleConfigKey: " + configKey, false, 4, null), null, 2, null);
            return SiteVisibleConfigKey.None;
        }
    }

    @NotNull
    public static EnumEntries<SiteVisibleConfigKey> getEntries() {
        return f47824c;
    }

    @NotNull
    public final String getConfigKey() {
        return this.configKey;
    }

    SiteVisibleConfigKey(String str) {
        this.configKey = str;
    }
}
