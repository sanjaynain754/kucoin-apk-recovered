package com.kubi.home.api;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: HomeWidgetCode.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/api/HomeWidgetCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Search", "NewUser", "Learn", "UserStatus", "Menu", "Banner", "Gembox", "RankingList", "RecommendedPosition", "ChangeDistribution", "FearAndGreedIndex", "HotSections", "RealTime", "HomeFeed", "CopyTrading", "TradingRobot", "Calendar", "KuMining", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum HomeWidgetCode {
    Search(FirebaseAnalytics.Event.SEARCH),
    NewUser("noLoginedWelfare"),
    Learn("learnBanner"),
    UserStatus("userStatus"),
    Menu("menu"),
    Banner("banner"),
    Gembox("gembox"),
    RankingList("rankingList"),
    RecommendedPosition("recommendedPosition"),
    ChangeDistribution("changeDistribution"),
    FearAndGreedIndex("fearAndGreedIndex"),
    HotSections("hotSections"),
    RealTime("activity"),
    HomeFeed("homeFeed"),
    CopyTrading("copyTrading"),
    TradingRobot("tradingBot"),
    Calendar("calendar"),
    KuMining("KuMining");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String code;

    @NotNull
    public static EnumEntries<HomeWidgetCode> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    HomeWidgetCode(String str) {
        this.code = str;
    }
}
