package io.trtc.tuikit.atomicxcore.api.room;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;", "", "timestamp", "", "senderUserID", "", "senderUserName", "senderNameCard", "senderAvatarURL", "content", "device", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)V", "getContent", "()Ljava/lang/String;", "getDevice", "()Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;", "getSenderAvatarURL", "getSenderNameCard", "getSenderUserID", "getSenderUserName", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class DeviceRequestInfo {

    @NotNull
    private final String content;

    @NotNull
    private final DeviceType device;

    @NotNull
    private final String senderAvatarURL;

    @NotNull
    private final String senderNameCard;

    @NotNull
    private final String senderUserID;

    @NotNull
    private final String senderUserName;
    private final long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRequestInfo)) {
            return false;
        }
        DeviceRequestInfo deviceRequestInfo = (DeviceRequestInfo) other;
        return this.timestamp == deviceRequestInfo.timestamp && Intrinsics.areEqual(this.senderUserID, deviceRequestInfo.senderUserID) && Intrinsics.areEqual(this.senderUserName, deviceRequestInfo.senderUserName) && Intrinsics.areEqual(this.senderNameCard, deviceRequestInfo.senderNameCard) && Intrinsics.areEqual(this.senderAvatarURL, deviceRequestInfo.senderAvatarURL) && Intrinsics.areEqual(this.content, deviceRequestInfo.content) && this.device == deviceRequestInfo.device;
    }

    public DeviceRequestInfo(long j11, @NotNull String senderUserID, @NotNull String senderUserName, @NotNull String senderNameCard, @NotNull String senderAvatarURL, @NotNull String content, @NotNull DeviceType device) {
        Intrinsics.checkNotNullParameter(senderUserID, "senderUserID");
        Intrinsics.checkNotNullParameter(senderUserName, "senderUserName");
        Intrinsics.checkNotNullParameter(senderNameCard, "senderNameCard");
        Intrinsics.checkNotNullParameter(senderAvatarURL, "senderAvatarURL");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(device, "device");
        this.timestamp = j11;
        this.senderUserID = senderUserID;
        this.senderUserName = senderUserName;
        this.senderNameCard = senderNameCard;
        this.senderAvatarURL = senderAvatarURL;
        this.content = content;
        this.device = device;
    }

    public static /* synthetic */ DeviceRequestInfo copy$default(DeviceRequestInfo deviceRequestInfo, long j11, String str, String str2, String str3, String str4, String str5, DeviceType deviceType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = deviceRequestInfo.timestamp;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = deviceRequestInfo.senderUserID;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = deviceRequestInfo.senderUserName;
        }
        String str7 = str2;
        if ((i11 & 8) != 0) {
            str3 = deviceRequestInfo.senderNameCard;
        }
        String str8 = str3;
        if ((i11 & 16) != 0) {
            str4 = deviceRequestInfo.senderAvatarURL;
        }
        return deviceRequestInfo.copy(j12, str6, str7, str8, str4, (i11 & 32) != 0 ? deviceRequestInfo.content : str5, (i11 & 64) != 0 ? deviceRequestInfo.device : deviceType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSenderUserID() {
        return this.senderUserID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSenderUserName() {
        return this.senderUserName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSenderNameCard() {
        return this.senderNameCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSenderAvatarURL() {
        return this.senderAvatarURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DeviceType getDevice() {
        return this.device;
    }

    @NotNull
    public final DeviceRequestInfo copy(long timestamp, @NotNull String senderUserID, @NotNull String senderUserName, @NotNull String senderNameCard, @NotNull String senderAvatarURL, @NotNull String content, @NotNull DeviceType device) {
        Intrinsics.checkNotNullParameter(senderUserID, "senderUserID");
        Intrinsics.checkNotNullParameter(senderUserName, "senderUserName");
        Intrinsics.checkNotNullParameter(senderNameCard, "senderNameCard");
        Intrinsics.checkNotNullParameter(senderAvatarURL, "senderAvatarURL");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(device, "device");
        return new DeviceRequestInfo(timestamp, senderUserID, senderUserName, senderNameCard, senderAvatarURL, content, device);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final DeviceType getDevice() {
        return this.device;
    }

    @NotNull
    public final String getSenderAvatarURL() {
        return this.senderAvatarURL;
    }

    @NotNull
    public final String getSenderNameCard() {
        return this.senderNameCard;
    }

    @NotNull
    public final String getSenderUserID() {
        return this.senderUserID;
    }

    @NotNull
    public final String getSenderUserName() {
        return this.senderUserName;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.device.hashCode() + AbstractC39391a.m88220a(this.content, AbstractC39391a.m88220a(this.senderAvatarURL, AbstractC39391a.m88220a(this.senderNameCard, AbstractC39391a.m88220a(this.senderUserName, AbstractC39391a.m88220a(this.senderUserID, Long.hashCode(this.timestamp) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "DeviceRequestInfo(timestamp=" + this.timestamp + ", senderUserID=" + this.senderUserID + ", senderUserName=" + this.senderUserName + ", senderNameCard=" + this.senderNameCard + ", senderAvatarURL=" + this.senderAvatarURL + ", content=" + this.content + ", device=" + this.device + ')';
    }
}
