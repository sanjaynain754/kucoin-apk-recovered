package com.kubi.quotefacade.rank;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RankContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchNewAllList", "CheckToShowNewTabRedDot", "FetchMarket", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent$CheckToShowNewTabRedDot;", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchMarket;", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchNewAllList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class RankContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: RankContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankContract$UiIntent$CheckToShowNewTabRedDot;", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CheckToShowNewTabRedDot extends RankContract$UiIntent {
        public CheckToShowNewTabRedDot() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RankContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchMarket;", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchMarket extends RankContract$UiIntent {
        public FetchMarket() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: RankContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankContract$UiIntent$FetchNewAllList;", "Lcom/kubi/quotefacade/rank/RankContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchNewAllList extends RankContract$UiIntent {
        public FetchNewAllList() {
            super(null);
        }
    }

    public /* synthetic */ RankContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RankContract$UiIntent() {
    }
}
