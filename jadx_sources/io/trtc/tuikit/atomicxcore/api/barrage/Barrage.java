package io.trtc.tuikit.atomicxcore.api.barrage;

import androidx.core.app.FrameMetricsAggregator;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003Jo\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(¨\u0006="}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "", "liveID", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", JPushConstants.Operation.KEY_SEQUENCE, "", "timestampInSecond", "messageType", "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;", "textContent", "extensionInfo", "", "businessID", "data", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JJLio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessID", "()Ljava/lang/String;", "setBusinessID", "(Ljava/lang/String;)V", "getData", "setData", "getExtensionInfo", "()Ljava/util/Map;", "setExtensionInfo", "(Ljava/util/Map;)V", "getLiveID", "setLiveID", "getMessageType", "()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;", "setMessageType", "(Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageType;)V", "getSender", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "setSender", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V", "getSequence", "()J", "setSequence", "(J)V", "getTextContent", "setTextContent", "getTimestampInSecond", "setTimestampInSecond", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class Barrage {

    @NotNull
    private String businessID;

    @NotNull
    private String data;

    @NotNull
    private Map<String, String> extensionInfo;

    @NotNull
    private String liveID;

    @NotNull
    private BarrageType messageType;

    @NotNull
    private LiveUserInfo sender;
    private long sequence;

    @NotNull
    private String textContent;
    private long timestampInSecond;

    public Barrage() {
        this(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Barrage)) {
            return false;
        }
        Barrage barrage = (Barrage) other;
        return Intrinsics.areEqual(this.liveID, barrage.liveID) && Intrinsics.areEqual(this.sender, barrage.sender) && this.sequence == barrage.sequence && this.timestampInSecond == barrage.timestampInSecond && this.messageType == barrage.messageType && Intrinsics.areEqual(this.textContent, barrage.textContent) && Intrinsics.areEqual(this.extensionInfo, barrage.extensionInfo) && Intrinsics.areEqual(this.businessID, barrage.businessID) && Intrinsics.areEqual(this.data, barrage.data);
    }

    public Barrage(@NotNull String liveID, @NotNull LiveUserInfo sender, long j11, long j12, @NotNull BarrageType messageType, @NotNull String textContent, @NotNull Map<String, String> extensionInfo, @NotNull String businessID, @NotNull String data) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        Intrinsics.checkNotNullParameter(businessID, "businessID");
        Intrinsics.checkNotNullParameter(data, "data");
        this.liveID = liveID;
        this.sender = sender;
        this.sequence = j11;
        this.timestampInSecond = j12;
        this.messageType = messageType;
        this.textContent = textContent;
        this.extensionInfo = extensionInfo;
        this.businessID = businessID;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Barrage copy$default(Barrage barrage, String str, LiveUserInfo liveUserInfo, long j11, long j12, BarrageType barrageType, String str2, Map map, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = barrage.liveID;
        }
        if ((i11 & 2) != 0) {
            liveUserInfo = barrage.sender;
        }
        if ((i11 & 4) != 0) {
            j11 = barrage.sequence;
        }
        if ((i11 & 8) != 0) {
            j12 = barrage.timestampInSecond;
        }
        if ((i11 & 16) != 0) {
            barrageType = barrage.messageType;
        }
        if ((i11 & 32) != 0) {
            str2 = barrage.textContent;
        }
        if ((i11 & 64) != 0) {
            map = barrage.extensionInfo;
        }
        if ((i11 & 128) != 0) {
            str3 = barrage.businessID;
        }
        if ((i11 & 256) != 0) {
            str4 = barrage.data;
        }
        String str5 = str4;
        Map map2 = map;
        BarrageType barrageType2 = barrageType;
        long j13 = j12;
        long j14 = j11;
        return barrage.copy(str, liveUserInfo, j14, j13, barrageType2, str2, map2, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLiveID() {
        return this.liveID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LiveUserInfo getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestampInSecond() {
        return this.timestampInSecond;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BarrageType getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTextContent() {
        return this.textContent;
    }

    @NotNull
    public final Map<String, String> component7() {
        return this.extensionInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBusinessID() {
        return this.businessID;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Barrage copy(@NotNull String liveID, @NotNull LiveUserInfo sender, long sequence, long timestampInSecond, @NotNull BarrageType messageType, @NotNull String textContent, @NotNull Map<String, String> extensionInfo, @NotNull String businessID, @NotNull String data) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        Intrinsics.checkNotNullParameter(businessID, "businessID");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Barrage(liveID, sender, sequence, timestampInSecond, messageType, textContent, extensionInfo, businessID, data);
    }

    @NotNull
    public final String getBusinessID() {
        return this.businessID;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Map<String, String> getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final String getLiveID() {
        return this.liveID;
    }

    @NotNull
    public final BarrageType getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final LiveUserInfo getSender() {
        return this.sender;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getTextContent() {
        return this.textContent;
    }

    public final long getTimestampInSecond() {
        return this.timestampInSecond;
    }

    public int hashCode() {
        return this.data.hashCode() + AbstractC39391a.m88220a(this.businessID, (this.extensionInfo.hashCode() + AbstractC39391a.m88220a(this.textContent, (this.messageType.hashCode() + ((Long.hashCode(this.timestampInSecond) + ((Long.hashCode(this.sequence) + ((this.sender.hashCode() + (this.liveID.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final void setBusinessID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessID = str;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setExtensionInfo(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extensionInfo = map;
    }

    public final void setLiveID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveID = str;
    }

    public final void setMessageType(@NotNull BarrageType barrageType) {
        Intrinsics.checkNotNullParameter(barrageType, "<set-?>");
        this.messageType = barrageType;
    }

    public final void setSender(@NotNull LiveUserInfo liveUserInfo) {
        Intrinsics.checkNotNullParameter(liveUserInfo, "<set-?>");
        this.sender = liveUserInfo;
    }

    public final void setSequence(long j11) {
        this.sequence = j11;
    }

    public final void setTextContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textContent = str;
    }

    public final void setTimestampInSecond(long j11) {
        this.timestampInSecond = j11;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Barrage(liveID=");
        sb2.append(this.liveID);
        sb2.append(", sender=");
        sb2.append(this.sender);
        sb2.append(", sequence=");
        sb2.append(this.sequence);
        sb2.append(", timestampInSecond=");
        sb2.append(this.timestampInSecond);
        sb2.append(", messageType=");
        sb2.append(this.messageType);
        sb2.append(", textContent=");
        sb2.append(this.textContent);
        sb2.append(", extensionInfo=");
        sb2.append(this.extensionInfo);
        sb2.append(", businessID=");
        sb2.append(this.businessID);
        sb2.append(", data=");
        return AbstractC39392b.m88221a(sb2, this.data, ')');
    }

    public /* synthetic */ Barrage(String str, LiveUserInfo liveUserInfo, long j11, long j12, BarrageType barrageType, String str2, Map map, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new LiveUserInfo(null, null, null, 7, null) : liveUserInfo, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) == 0 ? j12 : 0L, (i11 & 16) != 0 ? BarrageType.TEXT : barrageType, (i11 & 32) != 0 ? "" : str2, (i11 & 64) != 0 ? MapsKt.emptyMap() : map, (i11 & 128) != 0 ? "" : str3, (i11 & 256) != 0 ? "" : str4);
    }
}
