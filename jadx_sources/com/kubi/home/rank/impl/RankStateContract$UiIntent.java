package com.kubi.home.rank.impl;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RankStateContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankStateContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "ListenRankData", "UpdateListenRankData", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$UpdateListenRankData;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class RankStateContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: RankStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent;", "type", "", "<init>", "(I)V", "getType", "()I", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ListenRankData extends RankStateContract$UiIntent {
        private final int type;

        public ListenRankData(int i11) {
            super(null);
            this.type = i11;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: RankStateContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$UpdateListenRankData;", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent;", "type", "", "<init>", "(I)V", "getType", "()I", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateListenRankData extends RankStateContract$UiIntent {
        private final int type;

        public UpdateListenRankData(int i11) {
            super(null);
            this.type = i11;
        }

        public final int getType() {
            return this.type;
        }
    }

    public /* synthetic */ RankStateContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RankStateContract$UiIntent() {
    }
}
