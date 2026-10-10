package com.kubi.futures.data.trial;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ITrialApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/data/trial/LeadTradingActivateTrialRequest;", "", "id", "", AppsFlyerProperties.CHANNEL, "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getChannel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingActivateTrialRequest {

    @NotNull
    private final String channel;
    private final long id;

    public LeadTradingActivateTrialRequest(long j11, @NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.id = j11;
        this.channel = channel;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingActivateTrialRequest)) {
            return false;
        }
        LeadTradingActivateTrialRequest leadTradingActivateTrialRequest = (LeadTradingActivateTrialRequest) other;
        return this.id == leadTradingActivateTrialRequest.id && Intrinsics.areEqual(this.channel, leadTradingActivateTrialRequest.channel);
    }

    public static /* synthetic */ LeadTradingActivateTrialRequest copy$default(LeadTradingActivateTrialRequest leadTradingActivateTrialRequest, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = leadTradingActivateTrialRequest.id;
        }
        if ((i11 & 2) != 0) {
            str = leadTradingActivateTrialRequest.channel;
        }
        return leadTradingActivateTrialRequest.copy(j11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final LeadTradingActivateTrialRequest copy(long id2, @NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new LeadTradingActivateTrialRequest(id2, channel);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.channel.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeadTradingActivateTrialRequest(id=" + this.id + ", channel=" + this.channel + ')';
    }

    public /* synthetic */ LeadTradingActivateTrialRequest(long j11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? "App" : str);
    }
}
