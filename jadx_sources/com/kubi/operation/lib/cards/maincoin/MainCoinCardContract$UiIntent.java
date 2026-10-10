package com.kubi.operation.lib.cards.maincoin;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MainCoinCardContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UiIntent$LoadData;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MainCoinCardContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: MainCoinCardContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UiIntent$LoadData;", "Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UiIntent;", "ignoreCacheTime", "", "<init>", "(Z)V", "getIgnoreCacheTime", "()Z", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LoadData extends MainCoinCardContract$UiIntent {
        private final boolean ignoreCacheTime;

        public LoadData() {
            this(false, 1, null);
        }

        public LoadData(boolean z11) {
            super(null);
            this.ignoreCacheTime = z11;
        }

        public final boolean getIgnoreCacheTime() {
            return this.ignoreCacheTime;
        }

        public /* synthetic */ LoadData(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    public /* synthetic */ MainCoinCardContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MainCoinCardContract$UiIntent() {
    }
}
