package com.kubi.assets.sort;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AccountTabSortData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00112\u00020\u0001:\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz;", "", "key", "", "getKey", "()Ljava/lang/String;", "Funding", "Trading", "Unified", "Margin", "Futures", "Alpha", "Bot", "Finance", "Option", "CopyTrading", "Mining", "Companion", "Lcom/kubi/assets/sort/AccountBiz$Alpha;", "Lcom/kubi/assets/sort/AccountBiz$Bot;", "Lcom/kubi/assets/sort/AccountBiz$CopyTrading;", "Lcom/kubi/assets/sort/AccountBiz$Finance;", "Lcom/kubi/assets/sort/AccountBiz$Funding;", "Lcom/kubi/assets/sort/AccountBiz$Futures;", "Lcom/kubi/assets/sort/AccountBiz$Margin;", "Lcom/kubi/assets/sort/AccountBiz$Mining;", "Lcom/kubi/assets/sort/AccountBiz$Option;", "Lcom/kubi/assets/sort/AccountBiz$Trading;", "Lcom/kubi/assets/sort/AccountBiz$Unified;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AccountBiz {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f18724a = Companion.f18725a;

    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/kubi/assets/sort/AccountBiz;", "fromKey", "key", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAccountTabSortData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortData.kt\ncom/kubi/assets/sort/AccountBiz$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1208#2,2:145\n1236#2,4:147\n*S KotlinDebug\n*F\n+ 1 AccountTabSortData.kt\ncom/kubi/assets/sort/AccountBiz$Companion\n*L\n73#1:145,2\n73#1:147,4\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f18725a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Map<String, AccountBiz> f18726b;

        static {
            List listListOf = CollectionsKt.listOf((Object[]) new AccountBiz[]{C10963e.f18735b, C10968j.f18745b, C10969k.f18747b, C10965g.f18739b, C10964f.f18737b, C10959a.f18727b, C10960b.f18729b, C10962d.f18733b, C10967i.f18743b, C10961c.f18731b});
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
            for (Object obj : listListOf) {
                linkedHashMap.put(((AccountBiz) obj).getKey(), obj);
            }
            f18726b = linkedHashMap;
        }

        @Nullable
        public final AccountBiz fromKey(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return f18726b.get(key);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$a */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Alpha;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10959a implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10959a f18727b = new C10959a();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18728c = "alpha";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10959a);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18728c;
        }

        @NotNull
        public String toString() {
            return "Alpha";
        }

        public int hashCode() {
            return -1833430101;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$b */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Bot;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10960b implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10960b f18729b = new C10960b();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18730c = "robot";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10960b);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18730c;
        }

        @NotNull
        public String toString() {
            return "Bot";
        }

        public int hashCode() {
            return -569503916;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$c */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$CopyTrading;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10961c implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10961c f18731b = new C10961c();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18732c = "copyTrading";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10961c);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18732c;
        }

        @NotNull
        public String toString() {
            return "CopyTrading";
        }

        public int hashCode() {
            return 434013305;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$d */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Finance;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10962d implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10962d f18733b = new C10962d();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18734c = SearchCategory$Companion.EARN;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10962d);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18734c;
        }

        @NotNull
        public String toString() {
            return "Finance";
        }

        public int hashCode() {
            return -935111961;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$e */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Funding;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10963e implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10963e f18735b = new C10963e();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18736c = "main";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10963e);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18736c;
        }

        @NotNull
        public String toString() {
            return "Funding";
        }

        public int hashCode() {
            return -591477238;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$f */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Futures;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10964f implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10964f f18737b = new C10964f();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18738c = "kumex";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10964f);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18738c;
        }

        @NotNull
        public String toString() {
            return "Futures";
        }

        public int hashCode() {
            return -585421283;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$g */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Margin;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10965g implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10965g f18739b = new C10965g();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18740c = ViewProps.MARGIN;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10965g);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18740c;
        }

        @NotNull
        public String toString() {
            return "Margin";
        }

        public int hashCode() {
            return -668308223;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$h */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Mining;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10966h implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10966h f18741b = new C10966h();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18742c = "mining";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10966h);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18742c;
        }

        @NotNull
        public String toString() {
            return "Mining";
        }

        public int hashCode() {
            return -661037149;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$i */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Option;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10967i implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10967i f18743b = new C10967i();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18744c = TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10967i);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18744c;
        }

        @NotNull
        public String toString() {
            return "Option";
        }

        public int hashCode() {
            return -597135416;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$j */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Trading;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10968j implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10968j f18745b = new C10968j();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18746c = "trade";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10968j);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18746c;
        }

        @NotNull
        public String toString() {
            return "Trading";
        }

        public int hashCode() {
            return -1149220818;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountBiz$k */
    /* JADX INFO: compiled from: AccountTabSortData.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountBiz$Unified;", "Lcom/kubi/assets/sort/AccountBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C10969k implements AccountBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C10969k f18747b = new C10969k();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f18748c = "unified";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C10969k);
        }

        @Override // com.kubi.assets.sort.AccountBiz
        @NotNull
        public String getKey() {
            return f18748c;
        }

        @NotNull
        public String toString() {
            return "Unified";
        }

        public int hashCode() {
            return -368786273;
        }
    }

    @NotNull
    String getKey();
}
