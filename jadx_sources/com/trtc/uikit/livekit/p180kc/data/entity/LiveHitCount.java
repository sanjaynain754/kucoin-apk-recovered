package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveHitCount.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveHitCount;", "", "hotCount", "", "cardList", "", "Lcom/trtc/uikit/livekit/kc/data/entity/TradeCardInfo;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getHotCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/trtc/uikit/livekit/kc/data/entity/LiveHitCount;", "equals", "", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiveHitCount {

    @SerializedName("cardList")
    @Nullable
    private final List<TradeCardInfo> cardList;

    @SerializedName("hotCount")
    @Nullable
    private final Long hotCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveHitCount)) {
            return false;
        }
        LiveHitCount liveHitCount = (LiveHitCount) other;
        return Intrinsics.areEqual(this.hotCount, liveHitCount.hotCount) && Intrinsics.areEqual(this.cardList, liveHitCount.cardList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveHitCount copy$default(LiveHitCount liveHitCount, Long l11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = liveHitCount.hotCount;
        }
        if ((i11 & 2) != 0) {
            list = liveHitCount.cardList;
        }
        return liveHitCount.copy(l11, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getHotCount() {
        return this.hotCount;
    }

    @Nullable
    public final List<TradeCardInfo> component2() {
        return this.cardList;
    }

    @NotNull
    public final LiveHitCount copy(@Nullable Long hotCount, @Nullable List<TradeCardInfo> cardList) {
        return new LiveHitCount(hotCount, cardList);
    }

    @Nullable
    public final List<TradeCardInfo> getCardList() {
        return this.cardList;
    }

    @Nullable
    public final Long getHotCount() {
        return this.hotCount;
    }

    public int hashCode() {
        Long l11 = this.hotCount;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        List<TradeCardInfo> list = this.cardList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiveHitCount(hotCount=" + this.hotCount + ", cardList=" + this.cardList + ')';
    }

    public LiveHitCount(@Nullable Long l11, @Nullable List<TradeCardInfo> list) {
        this.hotCount = l11;
        this.cardList = list;
    }
}
