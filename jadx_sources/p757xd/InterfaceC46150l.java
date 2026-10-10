package p757xd;

import com.kubi.quotefacade.api.IQuoteFacadeService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: xd.l */
/* JADX INFO: compiled from: SymbolBarType.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, "CrossMargin", "IsolatedMargin", "Lcom/kubi/core/biz/symbolbar/SymbolBarType$CrossMargin;", "Lcom/kubi/core/biz/symbolbar/SymbolBarType$IsolatedMargin;", "Lcom/kubi/core/biz/symbolbar/SymbolBarType$Spot;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46150l {

    /* JADX INFO: renamed from: xd.l$a */
    /* JADX INFO: compiled from: SymbolBarType.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarType$CrossMargin;", "Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC46150l {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f103654a = new a();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "CrossMargin";
        }

        public int hashCode() {
            return -1783255128;
        }
    }

    /* JADX INFO: renamed from: xd.l$b */
    /* JADX INFO: compiled from: SymbolBarType.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarType$IsolatedMargin;", "Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements InterfaceC46150l {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f103655a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "IsolatedMargin";
        }

        public int hashCode() {
            return 14564429;
        }
    }

    /* JADX INFO: renamed from: xd.l$c */
    /* JADX INFO: compiled from: SymbolBarType.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarType$Spot;", "Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c implements InterfaceC46150l {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f103656a = new c();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public String toString() {
            return IQuoteFacadeService.Companion.TRADE_TYPE_SPOT;
        }

        public int hashCode() {
            return -823862104;
        }
    }
}
