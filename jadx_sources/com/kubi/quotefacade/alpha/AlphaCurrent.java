package com.kubi.quotefacade.alpha;

import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.AlphaNetworks;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AlphaCurrent.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaCurrent;", "", "<init>", "()V", "premiumParams", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "onChainParams", "resetAllParams", "", "getCurrentParams", "alphaType", "", "resolveL1Keyword", "menu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", ReportDataTable.COLUMN_PARAMS, "AlphaCurrentParams", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaCurrent {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AlphaCurrent f41143a = new AlphaCurrent();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static a f41144b = new a();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static a f41145c = new a();

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.a$a */
    /* JADX INFO: compiled from: AlphaCurrent.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "", "<init>", "()V", "alphaType", "", "getAlphaType", "()Ljava/lang/String;", "setAlphaType", "(Ljava/lang/String;)V", "l1Keyword", "getL1Keyword", "setL1Keyword", "timePeriod", "Lcom/kubi/quotefacade/constant/TimeSelectedEnum;", "getTimePeriod", "()Lcom/kubi/quotefacade/constant/TimeSelectedEnum;", "setTimePeriod", "(Lcom/kubi/quotefacade/constant/TimeSelectedEnum;)V", "networkChain", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "getNetworkChain", "()Lcom/kubi/quotefacade/entity/AlphaNetworks;", "setNetworkChain", "(Lcom/kubi/quotefacade/entity/AlphaNetworks;)V", "sortName", "getSortName", "setSortName", "sortType", "getSortType", "setSortType", "dynamicSortItem", "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;", "getDynamicSortItem", "()Lcom/kubi/quotefacade/constant/ChainSortItemEnum;", "setDynamicSortItem", "(Lcom/kubi/quotefacade/constant/ChainSortItemEnum;)V", "chainFilterData", "Lcom/kubi/quotefacade/entity/ChainFilterData;", "getChainFilterData", "()Lcom/kubi/quotefacade/entity/ChainFilterData;", "setChainFilterData", "(Lcom/kubi/quotefacade/entity/ChainFilterData;)V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: d */
        @Nullable
        public AlphaNetworks f41149d;

        /* JADX INFO: renamed from: h */
        @NotNull
        public ChainFilterData f41153h;

        /* JADX INFO: renamed from: a */
        @NotNull
        public String f41146a = "alpha_premium";

        /* JADX INFO: renamed from: b */
        @NotNull
        public String f41147b = "";

        /* JADX INFO: renamed from: c */
        @NotNull
        public TimeSelectedEnum f41148c = TimeSelectedEnum.TIME_24_HOURS;

        /* JADX INFO: renamed from: e */
        @NotNull
        public String f41150e = "";

        /* JADX INFO: renamed from: f */
        @NotNull
        public String f41151f = "";

        /* JADX INFO: renamed from: g */
        @NotNull
        public ChainSortItemEnum f41152g = ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE;

        public a() {
            ChainFilterData chainFilterData = new ChainFilterData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
            chainFilterData.setOrderByRange(this.f41148c.getConstTimeTag());
            chainFilterData.setChainSortType("");
            this.f41153h = chainFilterData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChainFilterData getF41153h() {
            return this.f41153h;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ChainSortItemEnum getF41152g() {
            return this.f41152g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF41147b() {
            return this.f41147b;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final AlphaNetworks getF41149d() {
            return this.f41149d;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF41150e() {
            return this.f41150e;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getF41151f() {
            return this.f41151f;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final TimeSelectedEnum getF41148c() {
            return this.f41148c;
        }

        /* JADX INFO: renamed from: h */
        public final void m50353h(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f41146a = str;
        }

        /* JADX INFO: renamed from: i */
        public final void m50354i(@NotNull ChainFilterData chainFilterData) {
            Intrinsics.checkNotNullParameter(chainFilterData, "<set-?>");
            this.f41153h = chainFilterData;
        }

        /* JADX INFO: renamed from: j */
        public final void m50355j(@NotNull ChainSortItemEnum chainSortItemEnum) {
            Intrinsics.checkNotNullParameter(chainSortItemEnum, "<set-?>");
            this.f41152g = chainSortItemEnum;
        }

        /* JADX INFO: renamed from: k */
        public final void m50356k(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f41147b = str;
        }

        /* JADX INFO: renamed from: l */
        public final void m50357l(@Nullable AlphaNetworks alphaNetworks) {
            this.f41149d = alphaNetworks;
        }

        /* JADX INFO: renamed from: m */
        public final void m50358m(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f41150e = str;
        }

        /* JADX INFO: renamed from: n */
        public final void m50359n(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f41151f = str;
        }

        /* JADX INFO: renamed from: o */
        public final void m50360o(@NotNull TimeSelectedEnum timeSelectedEnum) {
            Intrinsics.checkNotNullParameter(timeSelectedEnum, "<set-?>");
            this.f41148c = timeSelectedEnum;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final a m50343a(@NotNull String alphaType) {
        Intrinsics.checkNotNullParameter(alphaType, "alphaType");
        a aVar = Intrinsics.areEqual("alpha_premium", alphaType) ? f41144b : f41145c;
        aVar.m50353h(alphaType);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m50344b() {
        f41144b = new a();
        f41145c = new a();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m50345c(@NotNull AlphaMenu menu, @NotNull a params) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(params, "params");
        return menu == AlphaMenu.ONDO ? "ONDO" : params.getF41147b();
    }
}
