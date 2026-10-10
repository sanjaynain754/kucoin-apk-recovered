package com.kubi.quotefacade.rank.container;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "CheckToShowNewTabRedDot", "Lcom/kubi/quotefacade/rank/container/RankContainerContract$UiIntent$CheckToShowNewTabRedDot;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class RankContainerContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: RankContainerContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerContract$UiIntent$CheckToShowNewTabRedDot;", "Lcom/kubi/quotefacade/rank/container/RankContainerContract$UiIntent;", "subType", "", "<init>", "(Ljava/lang/String;)V", "getSubType", "()Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CheckToShowNewTabRedDot extends RankContainerContract$UiIntent {

        @NotNull
        private final String subType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckToShowNewTabRedDot(@NotNull String subType) {
            super(null);
            Intrinsics.checkNotNullParameter(subType, "subType");
            this.subType = subType;
        }

        @NotNull
        public final String getSubType() {
            return this.subType;
        }
    }

    public /* synthetic */ RankContainerContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RankContainerContract$UiIntent() {
    }
}
