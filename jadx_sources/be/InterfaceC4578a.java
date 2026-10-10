package be;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: be.a */
/* JADX INFO: compiled from: TradeBiz.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz;", "", "ETF", "KLine", "BottomBizContainer", "OpenOrders", "SymbolBar", "SpotBanner", "ImportantNotice", "ComplianceInfo", "CallAuction", "TradeSubmitBiz", "TradeHorizontalSubmitBiz", "TradeVerticalSubmitBiz", "MarginInfoBiz", "Lcom/kubi/core/config/TradeBiz$BottomBizContainer;", "Lcom/kubi/core/config/TradeBiz$CallAuction;", "Lcom/kubi/core/config/TradeBiz$ComplianceInfo;", "Lcom/kubi/core/config/TradeBiz$ETF;", "Lcom/kubi/core/config/TradeBiz$ImportantNotice;", "Lcom/kubi/core/config/TradeBiz$KLine;", "Lcom/kubi/core/config/TradeBiz$MarginInfoBiz;", "Lcom/kubi/core/config/TradeBiz$OpenOrders;", "Lcom/kubi/core/config/TradeBiz$SpotBanner;", "Lcom/kubi/core/config/TradeBiz$SymbolBar;", "Lcom/kubi/core/config/TradeBiz$TradeHorizontalSubmitBiz;", "Lcom/kubi/core/config/TradeBiz$TradeSubmitBiz;", "Lcom/kubi/core/config/TradeBiz$TradeVerticalSubmitBiz;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4578a {

    /* JADX INFO: renamed from: be.a$a */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$BottomBizContainer;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f4046a = new a();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "BottomBizContainer";
        }

        public int hashCode() {
            return 996554571;
        }
    }

    /* JADX INFO: renamed from: be.a$b */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$CallAuction;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f4047a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "CallAuction";
        }

        public int hashCode() {
            return -897392269;
        }
    }

    /* JADX INFO: renamed from: be.a$c */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$ComplianceInfo;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f4048a = new c();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public String toString() {
            return "ComplianceInfo";
        }

        public int hashCode() {
            return -666339013;
        }
    }

    /* JADX INFO: renamed from: be.a$d */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$ImportantNotice;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class d implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f4049a = new d();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof d);
        }

        @NotNull
        public String toString() {
            return "ImportantNotice";
        }

        public int hashCode() {
            return -1498427896;
        }
    }

    /* JADX INFO: renamed from: be.a$e */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$KLine;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class e implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final e f4050a = new e();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof e);
        }

        @NotNull
        public String toString() {
            return "KLine";
        }

        public int hashCode() {
            return 388713709;
        }
    }

    /* JADX INFO: renamed from: be.a$f */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$MarginInfoBiz;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class f implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final f f4051a = new f();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof f);
        }

        @NotNull
        public String toString() {
            return "MarginInfoBiz";
        }

        public int hashCode() {
            return 672838629;
        }
    }

    /* JADX INFO: renamed from: be.a$g */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$OpenOrders;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class g implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final g f4052a = new g();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof g);
        }

        @NotNull
        public String toString() {
            return "OpenOrders";
        }

        public int hashCode() {
            return -593738591;
        }
    }

    /* JADX INFO: renamed from: be.a$h */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$SpotBanner;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class h implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final h f4053a = new h();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof h);
        }

        @NotNull
        public String toString() {
            return "SpotBanner";
        }

        public int hashCode() {
            return -489076320;
        }
    }

    /* JADX INFO: renamed from: be.a$i */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$SymbolBar;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class i implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final i f4054a = new i();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof i);
        }

        @NotNull
        public String toString() {
            return "SymbolBar";
        }

        public int hashCode() {
            return 1783051849;
        }
    }

    /* JADX INFO: renamed from: be.a$j */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$TradeHorizontalSubmitBiz;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class j implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final j f4055a = new j();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof j);
        }

        @NotNull
        public String toString() {
            return "TradeHorizontalSubmitBiz";
        }

        public int hashCode() {
            return 2025420133;
        }
    }

    /* JADX INFO: renamed from: be.a$k */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$TradeSubmitBiz;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class k implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final k f4056a = new k();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof k);
        }

        @NotNull
        public String toString() {
            return "TradeSubmitBiz";
        }

        public int hashCode() {
            return -1799052631;
        }
    }

    /* JADX INFO: renamed from: be.a$l */
    /* JADX INFO: compiled from: TradeBiz.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/config/TradeBiz$TradeVerticalSubmitBiz;", "Lcom/kubi/core/config/TradeBiz;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class l implements InterfaceC4578a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final l f4057a = new l();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof l);
        }

        @NotNull
        public String toString() {
            return "TradeVerticalSubmitBiz";
        }

        public int hashCode() {
            return -1456098861;
        }
    }
}
