package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006,"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;", "", "totalDuration", "", "totalViewers", "", "totalGiftsSent", "totalGiftUniqueSenders", "totalGiftCoins", "totalLikesReceived", "totalMessageSent", "(JIIIIII)V", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "getTotalGiftCoins", "()I", "setTotalGiftCoins", "(I)V", "getTotalGiftUniqueSenders", "setTotalGiftUniqueSenders", "getTotalGiftsSent", "setTotalGiftsSent", "getTotalLikesReceived", "setTotalLikesReceived", "getTotalMessageSent", "setTotalMessageSent", "getTotalViewers", "setTotalViewers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LiveSummaryData {
    private long totalDuration;
    private int totalGiftCoins;
    private int totalGiftUniqueSenders;
    private int totalGiftsSent;
    private int totalLikesReceived;
    private int totalMessageSent;
    private int totalViewers;

    public LiveSummaryData() {
        this(0L, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSummaryData)) {
            return false;
        }
        LiveSummaryData liveSummaryData = (LiveSummaryData) other;
        return this.totalDuration == liveSummaryData.totalDuration && this.totalViewers == liveSummaryData.totalViewers && this.totalGiftsSent == liveSummaryData.totalGiftsSent && this.totalGiftUniqueSenders == liveSummaryData.totalGiftUniqueSenders && this.totalGiftCoins == liveSummaryData.totalGiftCoins && this.totalLikesReceived == liveSummaryData.totalLikesReceived && this.totalMessageSent == liveSummaryData.totalMessageSent;
    }

    public LiveSummaryData(long j11, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.totalDuration = j11;
        this.totalViewers = i11;
        this.totalGiftsSent = i12;
        this.totalGiftUniqueSenders = i13;
        this.totalGiftCoins = i14;
        this.totalLikesReceived = i15;
        this.totalMessageSent = i16;
    }

    public static /* synthetic */ LiveSummaryData copy$default(LiveSummaryData liveSummaryData, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            j11 = liveSummaryData.totalDuration;
        }
        long j12 = j11;
        if ((i17 & 2) != 0) {
            i11 = liveSummaryData.totalViewers;
        }
        int i18 = i11;
        if ((i17 & 4) != 0) {
            i12 = liveSummaryData.totalGiftsSent;
        }
        int i19 = i12;
        if ((i17 & 8) != 0) {
            i13 = liveSummaryData.totalGiftUniqueSenders;
        }
        int i21 = i13;
        if ((i17 & 16) != 0) {
            i14 = liveSummaryData.totalGiftCoins;
        }
        return liveSummaryData.copy(j12, i18, i19, i21, i14, (i17 & 32) != 0 ? liveSummaryData.totalLikesReceived : i15, (i17 & 64) != 0 ? liveSummaryData.totalMessageSent : i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalViewers() {
        return this.totalViewers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalGiftsSent() {
        return this.totalGiftsSent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalGiftUniqueSenders() {
        return this.totalGiftUniqueSenders;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalGiftCoins() {
        return this.totalGiftCoins;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalLikesReceived() {
        return this.totalLikesReceived;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalMessageSent() {
        return this.totalMessageSent;
    }

    @NotNull
    public final LiveSummaryData copy(long totalDuration, int totalViewers, int totalGiftsSent, int totalGiftUniqueSenders, int totalGiftCoins, int totalLikesReceived, int totalMessageSent) {
        return new LiveSummaryData(totalDuration, totalViewers, totalGiftsSent, totalGiftUniqueSenders, totalGiftCoins, totalLikesReceived, totalMessageSent);
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final int getTotalGiftCoins() {
        return this.totalGiftCoins;
    }

    public final int getTotalGiftUniqueSenders() {
        return this.totalGiftUniqueSenders;
    }

    public final int getTotalGiftsSent() {
        return this.totalGiftsSent;
    }

    public final int getTotalLikesReceived() {
        return this.totalLikesReceived;
    }

    public final int getTotalMessageSent() {
        return this.totalMessageSent;
    }

    public final int getTotalViewers() {
        return this.totalViewers;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalMessageSent) + AbstractC39396a.m88225a(this.totalLikesReceived, AbstractC39396a.m88225a(this.totalGiftCoins, AbstractC39396a.m88225a(this.totalGiftUniqueSenders, AbstractC39396a.m88225a(this.totalGiftsSent, AbstractC39396a.m88225a(this.totalViewers, Long.hashCode(this.totalDuration) * 31, 31), 31), 31), 31), 31);
    }

    public final void setTotalDuration(long j11) {
        this.totalDuration = j11;
    }

    public final void setTotalGiftCoins(int i11) {
        this.totalGiftCoins = i11;
    }

    public final void setTotalGiftUniqueSenders(int i11) {
        this.totalGiftUniqueSenders = i11;
    }

    public final void setTotalGiftsSent(int i11) {
        this.totalGiftsSent = i11;
    }

    public final void setTotalLikesReceived(int i11) {
        this.totalLikesReceived = i11;
    }

    public final void setTotalMessageSent(int i11) {
        this.totalMessageSent = i11;
    }

    public final void setTotalViewers(int i11) {
        this.totalViewers = i11;
    }

    @NotNull
    public String toString() {
        return "LiveSummaryData(totalDuration=" + this.totalDuration + ", totalViewers=" + this.totalViewers + ", totalGiftsSent=" + this.totalGiftsSent + ", totalGiftUniqueSenders=" + this.totalGiftUniqueSenders + ", totalGiftCoins=" + this.totalGiftCoins + ", totalLikesReceived=" + this.totalLikesReceived + ", totalMessageSent=" + this.totalMessageSent + ')';
    }

    public /* synthetic */ LiveSummaryData(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0L : j11, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }
}
