package com.kubi.core.biz.bottomtab;

import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeBottomContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/Tabs;", "", "titleRes", "", "getTitleRes", "()I", "TodoDelegation", "TradeFunds", "Lcom/kubi/core/biz/bottomtab/Tabs$TodoDelegation;", "Lcom/kubi/core/biz/bottomtab/Tabs$TradeFunds;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Tabs {

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.b$a */
    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/Tabs$TodoDelegation;", "Lcom/kubi/core/biz/bottomtab/Tabs;", "<init>", "()V", "titleRes", "", "getTitleRes", "()I", "equals", "", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements Tabs {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f20192a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f20193b = R$string.todo_delegation;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @Override // com.kubi.core.biz.bottomtab.Tabs
        /* JADX INFO: renamed from: b */
        public int mo21360b() {
            return f20193b;
        }

        @NotNull
        public String toString() {
            return "TodoDelegation";
        }

        public int hashCode() {
            return 395433568;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.b$b */
    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/Tabs$TradeFunds;", "Lcom/kubi/core/biz/bottomtab/Tabs;", "<init>", "()V", "titleRes", "", "getTitleRes", "()I", "equals", "", "other", "", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements Tabs {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f20194a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f20195b = R$string.main_asset;

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @Override // com.kubi.core.biz.bottomtab.Tabs
        /* JADX INFO: renamed from: b */
        public int mo21360b() {
            return f20195b;
        }

        @NotNull
        public String toString() {
            return "TradeFunds";
        }

        public int hashCode() {
            return 515739804;
        }
    }

    /* JADX INFO: renamed from: b */
    int mo21360b();
}
