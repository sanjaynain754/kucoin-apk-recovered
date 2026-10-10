package com.kubi.assets.alpha;

import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaContract.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetAlphaCoinList", "HideOrShowNumber", "HideSmallOrFilter", "GetNetworkList", "SelectNetwork", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent$GetAlphaCoinList;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent$GetNetworkList;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent$HideSmallOrFilter;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent$SelectNetwork;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AlphaContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AlphaContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent$GetAlphaCoinList;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetAlphaCoinList extends AlphaContract$UiIntent {

        @NotNull
        public static final GetAlphaCoinList INSTANCE = new GetAlphaCoinList();

        private GetAlphaCoinList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof GetAlphaCoinList);
        }

        @NotNull
        public String toString() {
            return "GetAlphaCoinList";
        }

        public int hashCode() {
            return 1741307692;
        }
    }

    /* JADX INFO: compiled from: AlphaContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent$GetNetworkList;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetNetworkList extends AlphaContract$UiIntent {

        @NotNull
        public static final GetNetworkList INSTANCE = new GetNetworkList();

        private GetNetworkList() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof GetNetworkList);
        }

        @NotNull
        public String toString() {
            return "GetNetworkList";
        }

        public int hashCode() {
            return -1224103797;
        }
    }

    /* JADX INFO: compiled from: AlphaContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent$HideOrShowNumber;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HideOrShowNumber extends AlphaContract$UiIntent {
        private final boolean isChecked;

        public HideOrShowNumber(boolean z11) {
            super(null);
            this.isChecked = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HideOrShowNumber) && this.isChecked == ((HideOrShowNumber) other).isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            return "HideOrShowNumber(isChecked=" + this.isChecked + ')';
        }
    }

    /* JADX INFO: compiled from: AlphaContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent$HideSmallOrFilter;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "checked", "", "keyword", "", "isManual", "<init>", "(ZLjava/lang/String;Z)V", "getChecked", "()Z", "getKeyword", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HideSmallOrFilter extends AlphaContract$UiIntent {
        private final boolean checked;
        private final boolean isManual;

        @NotNull
        private final String keyword;

        public /* synthetic */ HideSmallOrFilter(boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, str, (i11 & 4) != 0 ? false : z12);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HideSmallOrFilter(boolean z11, @NotNull String keyword, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            this.checked = z11;
            this.keyword = keyword;
            this.isManual = z12;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        @NotNull
        public final String getKeyword() {
            return this.keyword;
        }

        /* JADX INFO: renamed from: isManual, reason: from getter */
        public final boolean getIsManual() {
            return this.isManual;
        }
    }

    /* JADX INFO: compiled from: AlphaContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UiIntent$SelectNetwork;", "Lcom/kubi/assets/alpha/AlphaContract$UiIntent;", "network", "Lcom/kubi/assets/entity/AlphaChainInfo;", "<init>", "(Lcom/kubi/assets/entity/AlphaChainInfo;)V", "getNetwork", "()Lcom/kubi/assets/entity/AlphaChainInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SelectNetwork extends AlphaContract$UiIntent {

        @Nullable
        private final AlphaChainInfo network;

        public SelectNetwork(@Nullable AlphaChainInfo alphaChainInfo) {
            super(null);
            this.network = alphaChainInfo;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectNetwork) && Intrinsics.areEqual(this.network, ((SelectNetwork) other).network);
        }

        @Nullable
        public final AlphaChainInfo getNetwork() {
            return this.network;
        }

        public int hashCode() {
            AlphaChainInfo alphaChainInfo = this.network;
            if (alphaChainInfo == null) {
                return 0;
            }
            return alphaChainInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "SelectNetwork(network=" + this.network + ')';
        }
    }

    public /* synthetic */ AlphaContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlphaContract$UiIntent() {
    }
}
