package com.kubi.assets.entity;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/entity/CurrencyBusinessDistributionTypeEnum;", "", "nickNameRes", "", "colorString", "", "trackerName", "routeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNickNameRes", "()I", "getColorString", "()Ljava/lang/String;", "getTrackerName", "getRouteName", "FUNDING", "TRADING", "MARGIN", "FUTURES", "EARN", "OPTIONS", "COPY_TRADING", "ROBOT_ACCOUNT", "SUB_ACCOUNT", "UNIFIED", "MINING", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CurrencyBusinessDistributionTypeEnum {
    FUNDING(R$string.save_account_label, "#25D17F", "main", "main"),
    TRADING(R$string.trading, "#BAE63C", "trade", "trade"),
    MARGIN(R$string.lever_margin, "#71C1FA", ViewProps.MARGIN, ViewProps.MARGIN),
    FUTURES(R$string.futures, "#99C850", ClickCardReport.ReportData.CARD_TYPE_FUTURE, SearchCategory$Companion.FUTURES),
    EARN(AccountType.FINANCE.getNickNameRes(), "#B3A6FE", "finance", "finance"),
    OPTIONS(R$string.kc_options_title, "#4F73C5", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT),
    COPY_TRADING(R$string.kc_copytrading_account, "#CAD392", "copy", "copyTrading"),
    ROBOT_ACCOUNT(R$string.kc_tb_asset_bot, "#F8D34A", "robot", "bots"),
    SUB_ACCOUNT(R$string.sub_account, "#B0B0B0", "subaccount", "subaccount"),
    UNIFIED(R$string.kc_unify_account, "#F89317", "unified", "unified"),
    MINING(R$string.kc_account_name_mining, "#4F73C5", "mining", "mining");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String colorString;
    private final int nickNameRes;

    @NotNull
    private final String routeName;

    @NotNull
    private final String trackerName;

    @NotNull
    public static EnumEntries<CurrencyBusinessDistributionTypeEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getColorString() {
        return this.colorString;
    }

    public final int getNickNameRes() {
        return this.nickNameRes;
    }

    @NotNull
    public final String getRouteName() {
        return this.routeName;
    }

    @NotNull
    public final String getTrackerName() {
        return this.trackerName;
    }

    CurrencyBusinessDistributionTypeEnum(int i11, String str, String str2, String str3) {
        this.nickNameRes = i11;
        this.colorString = str;
        this.trackerName = str2;
        this.routeName = str3;
    }
}
