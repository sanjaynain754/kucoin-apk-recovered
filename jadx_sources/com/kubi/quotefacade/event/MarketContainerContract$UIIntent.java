package com.kubi.quotefacade.event;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MarketContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketContainerContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchMenuList", "Lcom/kubi/quotefacade/event/MarketContainerContract$UIIntent$FetchMenuList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MarketContainerContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MarketContainerContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/event/MarketContainerContract$UIIntent$FetchMenuList;", "Lcom/kubi/quotefacade/event/MarketContainerContract$UIIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchMenuList extends MarketContainerContract$UIIntent {

        @NotNull
        public static final FetchMenuList INSTANCE = new FetchMenuList();

        private FetchMenuList() {
            super(null);
        }
    }

    public /* synthetic */ MarketContainerContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarketContainerContract$UIIntent() {
    }
}
