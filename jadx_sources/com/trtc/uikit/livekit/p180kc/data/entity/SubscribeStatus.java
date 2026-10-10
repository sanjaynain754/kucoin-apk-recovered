package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubscribeStatus.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/SubscribeStatus;", "", "subscribed", "", "<init>", "(Ljava/lang/Integer;)V", "getSubscribed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/trtc/uikit/livekit/kc/data/entity/SubscribeStatus;", "equals", "", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubscribeStatus {

    @SerializedName(alternate = {"subscribe"}, value = "subscribed")
    @Nullable
    private final Integer subscribed;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubscribeStatus) && Intrinsics.areEqual(this.subscribed, ((SubscribeStatus) other).subscribed);
    }

    public static /* synthetic */ SubscribeStatus copy$default(SubscribeStatus subscribeStatus, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = subscribeStatus.subscribed;
        }
        return subscribeStatus.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSubscribed() {
        return this.subscribed;
    }

    @NotNull
    public final SubscribeStatus copy(@Nullable Integer subscribed) {
        return new SubscribeStatus(subscribed);
    }

    @Nullable
    public final Integer getSubscribed() {
        return this.subscribed;
    }

    public int hashCode() {
        Integer num = this.subscribed;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubscribeStatus(subscribed=" + this.subscribed + ')';
    }

    public SubscribeStatus(@Nullable Integer num) {
        this.subscribed = num;
    }
}
