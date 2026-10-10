package p260fd;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fd.d */
/* JADX INFO: compiled from: EtfInfoData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/quote/data/EtfInfoData;", "", "UnSupport", "Detail", "Lcom/kubi/core/base/quote/data/EtfInfoData$Detail;", "Lcom/kubi/core/base/quote/data/EtfInfoData$UnSupport;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37432d {

    /* JADX INFO: renamed from: fd.d$a, reason: from toString */
    /* JADX INFO: compiled from: EtfInfoData.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/base/quote/data/EtfInfoData$Detail;", "Lcom/kubi/core/base/quote/data/EtfInfoData;", "symbolCode", "", "etfValue", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSymbolCode", "()Ljava/lang/String;", "getEtfValue", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Detail implements InterfaceC37432d {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String symbolCode;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final BigDecimal etfValue;

        /* JADX WARN: Multi-variable type inference failed */
        public Detail() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) other;
            return Intrinsics.areEqual(this.symbolCode, detail.symbolCode) && Intrinsics.areEqual(this.etfValue, detail.etfValue);
        }

        public Detail(@Nullable String str, @Nullable BigDecimal bigDecimal) {
            this.symbolCode = str;
            this.etfValue = bigDecimal;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getEtfValue() {
            return this.etfValue;
        }

        public int hashCode() {
            String str = this.symbolCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            BigDecimal bigDecimal = this.etfValue;
            return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Detail(symbolCode=" + this.symbolCode + ", etfValue=" + this.etfValue + ')';
        }

        public /* synthetic */ Detail(String str, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal);
        }
    }

    /* JADX INFO: renamed from: fd.d$b */
    /* JADX INFO: compiled from: EtfInfoData.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/base/quote/data/EtfInfoData$UnSupport;", "Lcom/kubi/core/base/quote/data/EtfInfoData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC37432d {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f83034a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "UnSupport";
        }

        public int hashCode() {
            return 1395567619;
        }
    }
}
