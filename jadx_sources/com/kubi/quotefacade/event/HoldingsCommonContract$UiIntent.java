package com.kubi.quotefacade.event;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HoldingsCommonContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchHoldingsData", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent$FetchHoldingsData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class HoldingsCommonContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: HoldingsCommonContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent$FetchHoldingsData;", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent;", "holdingsType", "", "<init>", "(Ljava/lang/String;)V", "getHoldingsType", "()Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchHoldingsData extends HoldingsCommonContract$UiIntent {

        @Nullable
        private final String holdingsType;

        public FetchHoldingsData(@Nullable String str) {
            super(null);
            this.holdingsType = str;
        }

        @Nullable
        public final String getHoldingsType() {
            return this.holdingsType;
        }
    }

    public /* synthetic */ HoldingsCommonContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HoldingsCommonContract$UiIntent() {
    }
}
