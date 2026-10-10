package com.kubi.quotefacade.alpha.container;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchMenuData", "FetchNewData", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent$FetchMenuData;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent$FetchNewData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AlphaContainerContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AlphaContainerContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent$FetchMenuData;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent;", "alphaType", "", "<init>", "(Ljava/lang/String;)V", "getAlphaType", "()Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchMenuData extends AlphaContainerContract$UiIntent {

        @NotNull
        private final String alphaType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchMenuData(@NotNull String alphaType) {
            super(null);
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            this.alphaType = alphaType;
        }

        @NotNull
        public final String getAlphaType() {
            return this.alphaType;
        }
    }

    /* JADX INFO: compiled from: AlphaContainerContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent$FetchNewData;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UiIntent;", "alphaType", "", "<init>", "(Ljava/lang/String;)V", "getAlphaType", "()Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchNewData extends AlphaContainerContract$UiIntent {

        @NotNull
        private final String alphaType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchNewData(@NotNull String alphaType) {
            super(null);
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            this.alphaType = alphaType;
        }

        @NotNull
        public final String getAlphaType() {
            return this.alphaType;
        }
    }

    public /* synthetic */ AlphaContainerContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlphaContainerContract$UiIntent() {
    }
}
