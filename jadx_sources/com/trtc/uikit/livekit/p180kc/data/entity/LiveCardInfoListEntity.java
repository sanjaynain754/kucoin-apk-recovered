package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveCardInfo.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity;", "", "cards", "", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity$LiveCardInfo;", "configs", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity$Configs;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "getConfigs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LiveCardInfo", "Configs", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiveCardInfoListEntity {

    @Nullable
    private final List<LiveCardInfo> cards;

    @Nullable
    private final List<Configs> configs;

    /* JADX INFO: compiled from: LiveCardInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity$Configs;", "", "cardType", "", "isEarningRateOpen", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCardType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity$Configs;", "equals", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Configs {

        @Nullable
        private final String cardType;

        @Nullable
        private final Boolean isEarningRateOpen;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configs)) {
                return false;
            }
            Configs configs = (Configs) other;
            return Intrinsics.areEqual(this.cardType, configs.cardType) && Intrinsics.areEqual(this.isEarningRateOpen, configs.isEarningRateOpen);
        }

        public static /* synthetic */ Configs copy$default(Configs configs, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = configs.cardType;
            }
            if ((i11 & 2) != 0) {
                bool = configs.isEarningRateOpen;
            }
            return configs.copy(str, bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsEarningRateOpen() {
            return this.isEarningRateOpen;
        }

        @NotNull
        public final Configs copy(@Nullable String cardType, @Nullable Boolean isEarningRateOpen) {
            return new Configs(cardType, isEarningRateOpen);
        }

        @Nullable
        public final String getCardType() {
            return this.cardType;
        }

        public int hashCode() {
            String str = this.cardType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isEarningRateOpen;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEarningRateOpen() {
            return this.isEarningRateOpen;
        }

        @NotNull
        public String toString() {
            return "Configs(cardType=" + this.cardType + ", isEarningRateOpen=" + this.isEarningRateOpen + ')';
        }

        public Configs(@Nullable String str, @Nullable Boolean bool) {
            this.cardType = str;
            this.isEarningRateOpen = bool;
        }
    }

    /* JADX INFO: compiled from: LiveCardInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity$LiveCardInfo;", "", "cardType", "", "businessId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardType", "()Ljava/lang/String;", "getBusinessId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LiveCardInfo {

        @Nullable
        private final String businessId;

        @Nullable
        private final String cardType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveCardInfo)) {
                return false;
            }
            LiveCardInfo liveCardInfo = (LiveCardInfo) other;
            return Intrinsics.areEqual(this.cardType, liveCardInfo.cardType) && Intrinsics.areEqual(this.businessId, liveCardInfo.businessId);
        }

        public static /* synthetic */ LiveCardInfo copy$default(LiveCardInfo liveCardInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = liveCardInfo.cardType;
            }
            if ((i11 & 2) != 0) {
                str2 = liveCardInfo.businessId;
            }
            return liveCardInfo.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBusinessId() {
            return this.businessId;
        }

        @NotNull
        public final LiveCardInfo copy(@Nullable String cardType, @Nullable String businessId) {
            return new LiveCardInfo(cardType, businessId);
        }

        @Nullable
        public final String getBusinessId() {
            return this.businessId;
        }

        @Nullable
        public final String getCardType() {
            return this.cardType;
        }

        public int hashCode() {
            String str = this.cardType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.businessId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LiveCardInfo(cardType=" + this.cardType + ", businessId=" + this.businessId + ')';
        }

        public LiveCardInfo(@Nullable String str, @Nullable String str2) {
            this.cardType = str;
            this.businessId = str2;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCardInfoListEntity)) {
            return false;
        }
        LiveCardInfoListEntity liveCardInfoListEntity = (LiveCardInfoListEntity) other;
        return Intrinsics.areEqual(this.cards, liveCardInfoListEntity.cards) && Intrinsics.areEqual(this.configs, liveCardInfoListEntity.configs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveCardInfoListEntity copy$default(LiveCardInfoListEntity liveCardInfoListEntity, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = liveCardInfoListEntity.cards;
        }
        if ((i11 & 2) != 0) {
            list2 = liveCardInfoListEntity.configs;
        }
        return liveCardInfoListEntity.copy(list, list2);
    }

    @Nullable
    public final List<LiveCardInfo> component1() {
        return this.cards;
    }

    @Nullable
    public final List<Configs> component2() {
        return this.configs;
    }

    @NotNull
    public final LiveCardInfoListEntity copy(@Nullable List<LiveCardInfo> cards, @Nullable List<Configs> configs) {
        return new LiveCardInfoListEntity(cards, configs);
    }

    @Nullable
    public final List<LiveCardInfo> getCards() {
        return this.cards;
    }

    @Nullable
    public final List<Configs> getConfigs() {
        return this.configs;
    }

    public int hashCode() {
        List<LiveCardInfo> list = this.cards;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Configs> list2 = this.configs;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiveCardInfoListEntity(cards=" + this.cards + ", configs=" + this.configs + ')';
    }

    public LiveCardInfoListEntity(@Nullable List<LiveCardInfo> list, @Nullable List<Configs> list2) {
        this.cards = list;
        this.configs = list2;
    }
}
