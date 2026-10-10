package com.kubi.quotefacade.event;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ChainMarketContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchMenuList", "Lcom/kubi/quotefacade/event/ChainMarketContract$UIIntent$FetchMenuList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ChainMarketContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: ChainMarketContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketContract$UIIntent$FetchMenuList;", "Lcom/kubi/quotefacade/event/ChainMarketContract$UIIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchMenuList extends ChainMarketContract$UIIntent {

        @NotNull
        public static final FetchMenuList INSTANCE = new FetchMenuList();

        private FetchMenuList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FetchMenuList);
        }

        @NotNull
        public String toString() {
            return "FetchMenuList";
        }

        public int hashCode() {
            return 772973492;
        }
    }

    public /* synthetic */ ChainMarketContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChainMarketContract$UIIntent() {
    }
}
