package com.kubi.mart.sidebar.spot;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotSidebarContract.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchMenus", "SearchInput", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent$FetchMenus;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent$SearchInput;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SpotSidebarContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: SpotSidebarContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent$FetchMenus;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent;", "sidebarType", "", "symbolCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSidebarType", "()Ljava/lang/String;", "getSymbolCode", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchMenus extends SpotSidebarContract$UIIntent {

        @NotNull
        private final String sidebarType;

        @NotNull
        private final String symbolCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchMenus(@NotNull String sidebarType, @NotNull String symbolCode) {
            super(null);
            Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            this.sidebarType = sidebarType;
            this.symbolCode = symbolCode;
        }

        @NotNull
        public final String getSidebarType() {
            return this.sidebarType;
        }

        @NotNull
        public final String getSymbolCode() {
            return this.symbolCode;
        }
    }

    /* JADX INFO: compiled from: SpotSidebarContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent$SearchInput;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIIntent;", "sidebarType", "", "keyWord", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSidebarType", "()Ljava/lang/String;", "getKeyWord", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SearchInput extends SpotSidebarContract$UIIntent {

        @NotNull
        private final String keyWord;

        @NotNull
        private final String sidebarType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchInput(@NotNull String sidebarType, @NotNull String keyWord) {
            super(null);
            Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
            Intrinsics.checkNotNullParameter(keyWord, "keyWord");
            this.sidebarType = sidebarType;
            this.keyWord = keyWord;
        }

        @NotNull
        public final String getKeyWord() {
            return this.keyWord;
        }

        @NotNull
        public final String getSidebarType() {
            return this.sidebarType;
        }
    }

    public /* synthetic */ SpotSidebarContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpotSidebarContract$UIIntent() {
    }
}
