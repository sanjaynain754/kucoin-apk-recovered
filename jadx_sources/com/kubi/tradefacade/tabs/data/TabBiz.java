package com.kubi.tradefacade.tabs.data;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.search.searchresult.SearchCategory$Companion;
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

/* JADX INFO: compiled from: TabBiz.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz;", "", "key", "", "getKey", "()Ljava/lang/String;", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, "Margin", "Alpha", "Bot", "Fiat", "Convert", "Companion", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Alpha;", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Bot;", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Convert;", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Fiat;", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Margin;", "Lcom/kubi/tradefacade/tabs/data/TabBiz$Spot;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TabBiz {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51995a = Companion.f51996a;

    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "fromKey", "key", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTabBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabBiz.kt\ncom/kubi/tradefacade/tabs/data/TabBiz$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1208#2,2:56\n1236#2,4:58\n*S KotlinDebug\n*F\n+ 1 TabBiz.kt\ncom/kubi/tradefacade/tabs/data/TabBiz$Companion\n*L\n51#1:56,2\n51#1:58,4\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51996a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Map<String, TabBiz> f51997b;

        static {
            List listListOf = CollectionsKt.listOf((Object[]) new TabBiz[]{C26000f.f52008b, C25999e.f52006b, C25995a.f51998b, C25996b.f52000b, C25998d.f52004b, C25997c.f52002b});
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
            for (Object obj : listListOf) {
                linkedHashMap.put(((TabBiz) obj).getKey(), obj);
            }
            f51997b = linkedHashMap;
        }

        @Nullable
        public final TabBiz fromKey(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return f51997b.get(key);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$a */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Alpha;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C25995a implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C25995a f51998b = new C25995a();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f51999c = "alpha";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C25995a);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f51999c;
        }

        @NotNull
        public String toString() {
            return "Alpha";
        }

        public int hashCode() {
            return 1609064290;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$b */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Bot;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C25996b implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C25996b f52000b = new C25996b();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f52001c = "bot";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C25996b);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f52001c;
        }

        @NotNull
        public String toString() {
            return "Bot";
        }

        public int hashCode() {
            return 1333517515;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$c */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Convert;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C25997c implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C25997c f52002b = new C25997c();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f52003c = "convert";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C25997c);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f52003c;
        }

        @NotNull
        public String toString() {
            return "Convert";
        }

        public int hashCode() {
            return 1982028471;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$d */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Fiat;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C25998d implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C25998d f52004b = new C25998d();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f52005c = "fiat";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C25998d);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f52005c;
        }

        @NotNull
        public String toString() {
            return "Fiat";
        }

        public int hashCode() {
            return -1610517070;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$e */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Margin;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C25999e implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C25999e f52006b = new C25999e();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f52007c = ViewProps.MARGIN;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C25999e);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f52007c;
        }

        @NotNull
        public String toString() {
            return "Margin";
        }

        public int hashCode() {
            return -1325164502;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.TabBiz$f */
    /* JADX INFO: compiled from: TabBiz.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TabBiz$Spot;", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C26000f implements TabBiz {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C26000f f52008b = new C26000f();

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final String f52009c = SearchCategory$Companion.SPOT;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C26000f);
        }

        @Override // com.kubi.tradefacade.tabs.data.TabBiz
        @NotNull
        public String getKey() {
            return f52009c;
        }

        @NotNull
        public String toString() {
            return IQuoteFacadeService.Companion.TRADE_TYPE_SPOT;
        }

        public int hashCode() {
            return -1610122626;
        }
    }

    @NotNull
    String getKey();
}
