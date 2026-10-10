package com.kubi.quotefacade.widgets.fear;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FearGreedContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UiIntent$LoadData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FearGreedContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FearGreedContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UiIntent$LoadData;", "Lcom/kubi/quotefacade/widgets/fear/FearGreedContract$UiIntent;", "forceRefresh", "", "<init>", "(Z)V", "getForceRefresh", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LoadData extends FearGreedContract$UiIntent {
        private final boolean forceRefresh;

        public LoadData() {
            this(false, 1, null);
        }

        public LoadData(boolean z11) {
            super(null);
            this.forceRefresh = z11;
        }

        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        public /* synthetic */ LoadData(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    public /* synthetic */ FearGreedContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FearGreedContract$UiIntent() {
    }
}
