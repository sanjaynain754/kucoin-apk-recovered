package com.kubi.chat.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.C33577c3;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FBu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\b\u00108\u001a\u00020\u0003H\u0016J\b\u00109\u001a\u00020\u0003H\u0016J\b\u0010:\u001a\u00020\u0003H\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\b\u0010<\u001a\u00020\u0006H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\b\u0010>\u001a\u00020\u0006H\u0016J\b\u0010?\u001a\u00020\u0003H\u0016J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0003H\u0016J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001b¨\u0006G"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatMessages;", "Lcom/kubi/chat/entity/IProtoMessage;", "msgUniqueId", "", "msgSid", "msgSeqId", "", "createdAt", "from", TypedValues.TransitionType.S_TO, "msgContent", "msgType", C33577c3.f69334H, "additionalData", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdditionalData", "()Ljava/util/Map;", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDeviceId", "()Ljava/lang/String;", "getFrom", "setFrom", "(Ljava/lang/String;)V", "getMsgContent", "setMsgContent", "getMsgSeqId", "setMsgSeqId", "getMsgSid", "setMsgSid", "getMsgType", "setMsgType", "getMsgUniqueId", "setMsgUniqueId", "getTo", "setTo", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/chat/entity/ChatMessages;", "equals", "", "other", "", "getMContent", "getMDeviceId", "getMFrom", "getMMetadata", "getMSeqId", "getMSid", "getMTimestamp", "getMTo", "getMType", "Lcom/kubi/chat/entity/MsgTypeEnum;", "getMUniqueId", "hashCode", "", "toString", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ChatMessages implements IProtoMessage {

    @NotNull
    public static final String TYPE_IMAGE = "2";

    @NotNull
    public static final String TYPE_TEXT = "1";

    @Nullable
    private final Map<String, String> additionalData;

    @Nullable
    private Long createdAt;

    @Nullable
    private final String deviceId;

    @Nullable
    private String from;

    @Nullable
    private String msgContent;

    @Nullable
    private Long msgSeqId;

    @Nullable
    private String msgSid;

    @Nullable
    private String msgType;

    @Nullable
    private String msgUniqueId;

    @Nullable
    private String to;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessages)) {
            return false;
        }
        ChatMessages chatMessages = (ChatMessages) other;
        return Intrinsics.areEqual(this.msgUniqueId, chatMessages.msgUniqueId) && Intrinsics.areEqual(this.msgSid, chatMessages.msgSid) && Intrinsics.areEqual(this.msgSeqId, chatMessages.msgSeqId) && Intrinsics.areEqual(this.createdAt, chatMessages.createdAt) && Intrinsics.areEqual(this.from, chatMessages.from) && Intrinsics.areEqual(this.to, chatMessages.to) && Intrinsics.areEqual(this.msgContent, chatMessages.msgContent) && Intrinsics.areEqual(this.msgType, chatMessages.msgType) && Intrinsics.areEqual(this.deviceId, chatMessages.deviceId) && Intrinsics.areEqual(this.additionalData, chatMessages.additionalData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatMessages copy$default(ChatMessages chatMessages, String str, String str2, Long l11, Long l12, String str3, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatMessages.msgUniqueId;
        }
        if ((i11 & 2) != 0) {
            str2 = chatMessages.msgSid;
        }
        if ((i11 & 4) != 0) {
            l11 = chatMessages.msgSeqId;
        }
        if ((i11 & 8) != 0) {
            l12 = chatMessages.createdAt;
        }
        if ((i11 & 16) != 0) {
            str3 = chatMessages.from;
        }
        if ((i11 & 32) != 0) {
            str4 = chatMessages.to;
        }
        if ((i11 & 64) != 0) {
            str5 = chatMessages.msgContent;
        }
        if ((i11 & 128) != 0) {
            str6 = chatMessages.msgType;
        }
        if ((i11 & 256) != 0) {
            str7 = chatMessages.deviceId;
        }
        if ((i11 & 512) != 0) {
            map = chatMessages.additionalData;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        String str11 = str3;
        String str12 = str4;
        return chatMessages.copy(str, str2, l11, l12, str11, str12, str9, str10, str8, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsgUniqueId() {
        return this.msgUniqueId;
    }

    @Nullable
    public final Map<String, String> component10() {
        return this.additionalData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsgSid() {
        return this.msgSid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getMsgSeqId() {
        return this.msgSeqId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMsgContent() {
        return this.msgContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final ChatMessages copy(@Nullable String msgUniqueId, @Nullable String msgSid, @Nullable Long msgSeqId, @Nullable Long createdAt, @Nullable String from, @Nullable String to2, @Nullable String msgContent, @Nullable String msgType, @Nullable String deviceId, @Nullable Map<String, String> additionalData) {
        return new ChatMessages(msgUniqueId, msgSid, msgSeqId, createdAt, from, to2, msgContent, msgType, deviceId, additionalData);
    }

    @Nullable
    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMContent() {
        return C45148b.m99794d(this.msgContent);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMDeviceId() {
        return C45148b.m99794d(this.deviceId);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMFrom() {
        return C45148b.m99794d(this.from);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public Map<String, String> getMMetadata() {
        Map<String, String> map = this.additionalData;
        return map == null ? MapsKt.emptyMap() : map;
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    public long getMSeqId() {
        return C45148b.m99793c(this.msgSeqId);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMSid() {
        return C45148b.m99794d(this.msgSid);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    public long getMTimestamp() {
        return C45148b.m99793c(this.createdAt);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMTo() {
        return C45148b.m99794d(this.to);
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public MsgTypeEnum getMType() {
        String str = this.msgType;
        if (Intrinsics.areEqual(str, "1")) {
            return MsgTypeEnum.TEXT;
        }
        return Intrinsics.areEqual(str, "2") ? MsgTypeEnum.IMAGE : MsgTypeEnum.UNDEF;
    }

    @Override // com.kubi.chat.entity.IProtoMessage
    @NotNull
    public String getMUniqueId() {
        return C45148b.m99794d(this.msgUniqueId);
    }

    @Nullable
    public final String getMsgContent() {
        return this.msgContent;
    }

    @Nullable
    public final Long getMsgSeqId() {
        return this.msgSeqId;
    }

    @Nullable
    public final String getMsgSid() {
        return this.msgSid;
    }

    @Nullable
    public final String getMsgType() {
        return this.msgType;
    }

    @Nullable
    public final String getMsgUniqueId() {
        return this.msgUniqueId;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.msgUniqueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msgSid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.msgSeqId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.from;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.to;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.msgContent;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.msgType;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setFrom(@Nullable String str) {
        this.from = str;
    }

    public final void setMsgContent(@Nullable String str) {
        this.msgContent = str;
    }

    public final void setMsgSeqId(@Nullable Long l11) {
        this.msgSeqId = l11;
    }

    public final void setMsgSid(@Nullable String str) {
        this.msgSid = str;
    }

    public final void setMsgType(@Nullable String str) {
        this.msgType = str;
    }

    public final void setMsgUniqueId(@Nullable String str) {
        this.msgUniqueId = str;
    }

    public final void setTo(@Nullable String str) {
        this.to = str;
    }

    @NotNull
    public String toString() {
        return "ChatMessages(msgUniqueId=" + ((Object) this.msgUniqueId) + ", msgSid=" + ((Object) this.msgSid) + ", msgSeqId=" + this.msgSeqId + ", createdAt=" + this.createdAt + ", from=" + ((Object) this.from) + ", to=" + ((Object) this.to) + ", msgContent=" + ((Object) this.msgContent) + ", msgType=" + ((Object) this.msgType) + ", deviceId=" + ((Object) this.deviceId) + ", additionalData=" + this.additionalData + ')';
    }

    public ChatMessages(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, String> map) {
        this.msgUniqueId = str;
        this.msgSid = str2;
        this.msgSeqId = l11;
        this.createdAt = l12;
        this.from = str3;
        this.to = str4;
        this.msgContent = str5;
        this.msgType = str6;
        this.deviceId = str7;
        this.additionalData = map;
    }
}
