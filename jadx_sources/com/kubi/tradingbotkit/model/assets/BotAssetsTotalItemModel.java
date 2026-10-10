package com.kubi.tradingbotkit.model.assets;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.utils.C27096v0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BotAssetsTotalItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\bH\n\u0002\u0010\u0002\n\u0002\b\"\b\u0086\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0000J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0016HÆ\u0003J\t\u0010x\u001a\u00020\u0016HÆ\u0003J\t\u0010y\u001a\u00020\u0016HÆ\u0003J\t\u0010z\u001a\u00020\u0016HÆ\u0003J\t\u0010{\u001a\u00020\u0016HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010WJ\t\u0010}\u001a\u00020\fHÆ\u0003J\t\u0010~\u001a\u00020\u0016HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0002\u0010\u0081\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0082\u0001J\u0014\u0010\u0083\u0001\u001a\u00020\u00162\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\fHÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR\u001a\u0010\u0018\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010K\"\u0004\bS\u0010MR\u001a\u0010\u001a\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010K\"\u0004\bU\u0010MR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010K\"\u0004\b_\u0010MR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010$\"\u0004\ba\u0010&R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010$\"\u0004\bc\u0010&¨\u0006\u0087\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "", "name", "", "symbol", "foldName", "Lcom/kubi/utils/StyledText;", "desc", TUIConstants.TUIChat.INPUT_MORE_ICON, "jumpLink1", "jumpLink2", "subListItemNumber", "", "totalAssets", "totalAssetsShow", "totalAssetsText", "todayTotalProfitsText", "todayProfitsShow", "todayProfits", "totalProfitShow", "totalProfit", "lastItem", "", "firstItem", "expand", "canExpend", "hideNumber", "itemId", "", "itemType", "isNewAipVersion", "newAipVersionTip", "totalCost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;ZZZZZLjava/lang/Long;IZLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getFoldName", "()Lcom/kubi/utils/StyledText;", "setFoldName", "(Lcom/kubi/utils/StyledText;)V", "getDesc", "setDesc", "getIcon", "setIcon", "getJumpLink1", "setJumpLink1", "getJumpLink2", "setJumpLink2", "getSubListItemNumber", "()Ljava/lang/Integer;", "setSubListItemNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalAssets", "setTotalAssets", "getTotalAssetsShow", "setTotalAssetsShow", "getTotalAssetsText", "setTotalAssetsText", "getTodayTotalProfitsText", "setTodayTotalProfitsText", "getTodayProfitsShow", "setTodayProfitsShow", "getTodayProfits", "setTodayProfits", "getTotalProfitShow", "setTotalProfitShow", "getTotalProfit", "setTotalProfit", "getLastItem", "()Z", "setLastItem", "(Z)V", "getFirstItem", "setFirstItem", "getExpand", "setExpand", "getCanExpend", "setCanExpend", "getHideNumber", "setHideNumber", "getItemId", "()Ljava/lang/Long;", "setItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getItemType", "()I", "setItemType", "(I)V", "setNewAipVersion", "getNewAipVersionTip", "setNewAipVersionTip", "getTotalCost", "setTotalCost", "bind", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;Lcom/kubi/utils/StyledText;Ljava/lang/String;ZZZZZLjava/lang/Long;IZLjava/lang/String;Ljava/lang/String;)Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "equals", "hashCode", "toString", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BotAssetsTotalItemModel {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Companion f52459A = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public String name;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public String symbol;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public C27096v0 foldName;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public String desc;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public String icon;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public String jumpLink1;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public String jumpLink2;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public Integer subListItemNumber;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public String totalAssets;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public String totalAssetsShow;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public String totalAssetsText;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public String todayTotalProfitsText;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public C27096v0 todayProfitsShow;

    /* JADX INFO: renamed from: n, reason: from toString */
    @Nullable
    public String todayProfits;

    /* JADX INFO: renamed from: o, reason: from toString */
    @Nullable
    public C27096v0 totalProfitShow;

    /* JADX INFO: renamed from: p, reason: from toString */
    @Nullable
    public String totalProfit;

    /* JADX INFO: renamed from: q, reason: from toString */
    public boolean lastItem;

    /* JADX INFO: renamed from: r, reason: from toString */
    public boolean firstItem;

    /* JADX INFO: renamed from: s, reason: from toString */
    public boolean expand;

    /* JADX INFO: renamed from: t, reason: from toString */
    public boolean canExpend;

    /* JADX INFO: renamed from: u, reason: from toString */
    public boolean hideNumber;

    /* JADX INFO: renamed from: v, reason: from toString */
    @Nullable
    public Long itemId;

    /* JADX INFO: renamed from: w, reason: from toString */
    public int itemType;

    /* JADX INFO: renamed from: x, reason: from toString */
    public boolean isNewAipVersion;

    /* JADX INFO: renamed from: y, reason: from toString */
    @Nullable
    public String newAipVersionTip;

    /* JADX INFO: renamed from: z, reason: from toString */
    @Nullable
    public String totalCost;

    /* JADX INFO: compiled from: BotAssetsTotalItemModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel$Companion;", "", "<init>", "()V", "STRATEGY_TYPE", "", "RUNNING_ROBOT_TYPE", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public BotAssetsTotalItemModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, 0, false, null, null, 67108863, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotAssetsTotalItemModel)) {
            return false;
        }
        BotAssetsTotalItemModel botAssetsTotalItemModel = (BotAssetsTotalItemModel) other;
        return Intrinsics.areEqual(this.name, botAssetsTotalItemModel.name) && Intrinsics.areEqual(this.symbol, botAssetsTotalItemModel.symbol) && Intrinsics.areEqual(this.foldName, botAssetsTotalItemModel.foldName) && Intrinsics.areEqual(this.desc, botAssetsTotalItemModel.desc) && Intrinsics.areEqual(this.icon, botAssetsTotalItemModel.icon) && Intrinsics.areEqual(this.jumpLink1, botAssetsTotalItemModel.jumpLink1) && Intrinsics.areEqual(this.jumpLink2, botAssetsTotalItemModel.jumpLink2) && Intrinsics.areEqual(this.subListItemNumber, botAssetsTotalItemModel.subListItemNumber) && Intrinsics.areEqual(this.totalAssets, botAssetsTotalItemModel.totalAssets) && Intrinsics.areEqual(this.totalAssetsShow, botAssetsTotalItemModel.totalAssetsShow) && Intrinsics.areEqual(this.totalAssetsText, botAssetsTotalItemModel.totalAssetsText) && Intrinsics.areEqual(this.todayTotalProfitsText, botAssetsTotalItemModel.todayTotalProfitsText) && Intrinsics.areEqual(this.todayProfitsShow, botAssetsTotalItemModel.todayProfitsShow) && Intrinsics.areEqual(this.todayProfits, botAssetsTotalItemModel.todayProfits) && Intrinsics.areEqual(this.totalProfitShow, botAssetsTotalItemModel.totalProfitShow) && Intrinsics.areEqual(this.totalProfit, botAssetsTotalItemModel.totalProfit) && this.lastItem == botAssetsTotalItemModel.lastItem && this.firstItem == botAssetsTotalItemModel.firstItem && this.expand == botAssetsTotalItemModel.expand && this.canExpend == botAssetsTotalItemModel.canExpend && this.hideNumber == botAssetsTotalItemModel.hideNumber && Intrinsics.areEqual(this.itemId, botAssetsTotalItemModel.itemId) && this.itemType == botAssetsTotalItemModel.itemType && this.isNewAipVersion == botAssetsTotalItemModel.isNewAipVersion && Intrinsics.areEqual(this.newAipVersionTip, botAssetsTotalItemModel.newAipVersionTip) && Intrinsics.areEqual(this.totalCost, botAssetsTotalItemModel.totalCost);
    }

    public BotAssetsTotalItemModel(@Nullable String str, @Nullable String str2, @Nullable C27096v0 c27096v0, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable C27096v0 c27096v1, @Nullable String str11, @Nullable C27096v0 c27096v2, @Nullable String str12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable Long l11, int i11, boolean z16, @Nullable String str13, @Nullable String str14) {
        this.name = str;
        this.symbol = str2;
        this.foldName = c27096v0;
        this.desc = str3;
        this.icon = str4;
        this.jumpLink1 = str5;
        this.jumpLink2 = str6;
        this.subListItemNumber = num;
        this.totalAssets = str7;
        this.totalAssetsShow = str8;
        this.totalAssetsText = str9;
        this.todayTotalProfitsText = str10;
        this.todayProfitsShow = c27096v1;
        this.todayProfits = str11;
        this.totalProfitShow = c27096v2;
        this.totalProfit = str12;
        this.lastItem = z11;
        this.firstItem = z12;
        this.expand = z13;
        this.canExpend = z14;
        this.hideNumber = z15;
        this.itemId = l11;
        this.itemType = i11;
        this.isNewAipVersion = z16;
        this.newAipVersionTip = str13;
        this.totalCost = str14;
    }

    /* JADX INFO: renamed from: A */
    public final void m64220A(@Nullable C27096v0 c27096v0) {
        this.foldName = c27096v0;
    }

    /* JADX INFO: renamed from: B */
    public final void m64221B(boolean z11) {
        this.hideNumber = z11;
    }

    /* JADX INFO: renamed from: C */
    public final void m64222C(@Nullable String str) {
        this.icon = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m64223D(@Nullable Long l11) {
        this.itemId = l11;
    }

    /* JADX INFO: renamed from: E */
    public final void m64224E(int i11) {
        this.itemType = i11;
    }

    /* JADX INFO: renamed from: F */
    public final void m64225F(@Nullable String str) {
        this.jumpLink1 = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m64226G(@Nullable String str) {
        this.jumpLink2 = str;
    }

    /* JADX INFO: renamed from: H */
    public final void m64227H(boolean z11) {
        this.lastItem = z11;
    }

    /* JADX INFO: renamed from: I */
    public final void m64228I(@Nullable String str) {
        this.name = str;
    }

    /* JADX INFO: renamed from: J */
    public final void m64229J(boolean z11) {
        this.isNewAipVersion = z11;
    }

    /* JADX INFO: renamed from: K */
    public final void m64230K(@Nullable String str) {
        this.newAipVersionTip = str;
    }

    /* JADX INFO: renamed from: L */
    public final void m64231L(@Nullable Integer num) {
        this.subListItemNumber = num;
    }

    /* JADX INFO: renamed from: M */
    public final void m64232M(@Nullable String str) {
        this.symbol = str;
    }

    /* JADX INFO: renamed from: N */
    public final void m64233N(@Nullable String str) {
        this.todayProfits = str;
    }

    /* JADX INFO: renamed from: O */
    public final void m64234O(@Nullable C27096v0 c27096v0) {
        this.todayProfitsShow = c27096v0;
    }

    /* JADX INFO: renamed from: P */
    public final void m64235P(@Nullable String str) {
        this.todayTotalProfitsText = str;
    }

    /* JADX INFO: renamed from: Q */
    public final void m64236Q(@Nullable String str) {
        this.totalAssets = str;
    }

    /* JADX INFO: renamed from: R */
    public final void m64237R(@Nullable String str) {
        this.totalAssetsShow = str;
    }

    /* JADX INFO: renamed from: S */
    public final void m64238S(@Nullable String str) {
        this.totalAssetsText = str;
    }

    /* JADX INFO: renamed from: T */
    public final void m64239T(@Nullable String str) {
        this.totalProfit = str;
    }

    /* JADX INFO: renamed from: U */
    public final void m64240U(@Nullable C27096v0 c27096v0) {
        this.totalProfitShow = c27096v0;
    }

    /* JADX INFO: renamed from: a */
    public final void m64241a(@NotNull BotAssetsTotalItemModel other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.name = other.name;
        this.symbol = other.symbol;
        this.foldName = other.foldName;
        this.desc = other.desc;
        this.icon = other.icon;
        this.subListItemNumber = other.subListItemNumber;
        this.totalAssets = other.totalAssets;
        this.totalAssetsShow = other.totalAssetsShow;
        this.todayProfitsShow = other.todayProfitsShow;
        this.todayProfits = other.todayProfits;
        this.totalProfitShow = other.totalProfitShow;
        this.totalProfit = other.totalProfit;
        this.lastItem = other.lastItem;
        this.expand = other.expand;
        this.hideNumber = other.hideNumber;
        this.itemId = other.itemId;
        this.itemType = other.itemType;
        this.totalAssetsText = other.totalAssetsText;
        this.todayTotalProfitsText = other.todayTotalProfitsText;
        this.firstItem = other.firstItem;
        this.canExpend = other.canExpend;
        this.jumpLink1 = other.jumpLink1;
        this.jumpLink2 = other.jumpLink2;
        this.isNewAipVersion = other.isNewAipVersion;
        this.newAipVersionTip = other.newAipVersionTip;
        this.totalCost = other.totalCost;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanExpend() {
        return this.canExpend;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFirstItem() {
        return this.firstItem;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27096v0 getFoldName() {
        return this.foldName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHideNumber() {
        return this.hideNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C27096v0 c27096v0 = this.foldName;
        int iHashCode3 = (iHashCode2 + (c27096v0 == null ? 0 : c27096v0.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink1;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jumpLink2;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.subListItemNumber;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.totalAssets;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.totalAssetsShow;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.totalAssetsText;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.todayTotalProfitsText;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C27096v0 c27096v1 = this.todayProfitsShow;
        int iHashCode13 = (iHashCode12 + (c27096v1 == null ? 0 : c27096v1.hashCode())) * 31;
        String str11 = this.todayProfits;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        C27096v0 c27096v2 = this.totalProfitShow;
        int iHashCode15 = (iHashCode14 + (c27096v2 == null ? 0 : c27096v2.hashCode())) * 31;
        String str12 = this.totalProfit;
        int iHashCode16 = (((((((((((iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31) + Boolean.hashCode(this.lastItem)) * 31) + Boolean.hashCode(this.firstItem)) * 31) + Boolean.hashCode(this.expand)) * 31) + Boolean.hashCode(this.canExpend)) * 31) + Boolean.hashCode(this.hideNumber)) * 31;
        Long l11 = this.itemId;
        int iHashCode17 = (((((iHashCode16 + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.itemType)) * 31) + Boolean.hashCode(this.isNewAipVersion)) * 31;
        String str13 = this.newAipVersionTip;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.totalCost;
        return iHashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getJumpLink1() {
        return this.jumpLink1;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getJumpLink2() {
        return this.jumpLink2;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getLastItem() {
        return this.lastItem;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNewAipVersionTip() {
        return this.newAipVersionTip;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getSubListItemNumber() {
        return this.subListItemNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final C27096v0 getTodayProfitsShow() {
        return this.todayProfitsShow;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTodayTotalProfitsText() {
        return this.todayTotalProfitsText;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTotalAssetsShow() {
        return this.totalAssetsShow;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTotalAssetsText() {
        return this.totalAssetsText;
    }

    @NotNull
    public String toString() {
        return "BotAssetsTotalItemModel(name=" + this.name + ", symbol=" + this.symbol + ", foldName=" + ((Object) this.foldName) + ", desc=" + this.desc + ", icon=" + this.icon + ", jumpLink1=" + this.jumpLink1 + ", jumpLink2=" + this.jumpLink2 + ", subListItemNumber=" + this.subListItemNumber + ", totalAssets=" + this.totalAssets + ", totalAssetsShow=" + this.totalAssetsShow + ", totalAssetsText=" + this.totalAssetsText + ", todayTotalProfitsText=" + this.todayTotalProfitsText + ", todayProfitsShow=" + ((Object) this.todayProfitsShow) + ", todayProfits=" + this.todayProfits + ", totalProfitShow=" + ((Object) this.totalProfitShow) + ", totalProfit=" + this.totalProfit + ", lastItem=" + this.lastItem + ", firstItem=" + this.firstItem + ", expand=" + this.expand + ", canExpend=" + this.canExpend + ", hideNumber=" + this.hideNumber + ", itemId=" + this.itemId + ", itemType=" + this.itemType + ", isNewAipVersion=" + this.isNewAipVersion + ", newAipVersionTip=" + this.newAipVersionTip + ", totalCost=" + this.totalCost + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final C27096v0 getTotalProfitShow() {
        return this.totalProfitShow;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsNewAipVersion() {
        return this.isNewAipVersion;
    }

    /* JADX INFO: renamed from: w */
    public final void m64263w(boolean z11) {
        this.canExpend = z11;
    }

    /* JADX INFO: renamed from: x */
    public final void m64264x(@Nullable String str) {
        this.desc = str;
    }

    /* JADX INFO: renamed from: y */
    public final void m64265y(boolean z11) {
        this.expand = z11;
    }

    /* JADX INFO: renamed from: z */
    public final void m64266z(boolean z11) {
        this.firstItem = z11;
    }

    public /* synthetic */ BotAssetsTotalItemModel(String str, String str2, C27096v0 c27096v0, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, C27096v0 c27096v1, String str11, C27096v0 c27096v2, String str12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Long l11, int i11, boolean z16, String str13, String str14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : c27096v0, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : str8, (i12 & 1024) != 0 ? null : str9, (i12 & 2048) != 0 ? null : str10, (i12 & 4096) != 0 ? null : c27096v1, (i12 & 8192) != 0 ? null : str11, (i12 & 16384) != 0 ? null : c27096v2, (i12 & 32768) != 0 ? null : str12, (i12 & 65536) != 0 ? false : z11, (i12 & 131072) != 0 ? false : z12, (i12 & 262144) != 0 ? true : z13, (i12 & 524288) != 0 ? true : z14, (i12 & 1048576) != 0 ? IAssetsCenterService.f16464a.get().mo15359y() : z15, (i12 & 2097152) != 0 ? null : l11, (i12 & 4194304) == 0 ? i11 : 1, (i12 & 8388608) == 0 ? z16 : false, (i12 & 16777216) != 0 ? null : str13, (i12 & 33554432) != 0 ? null : str14);
    }
}
