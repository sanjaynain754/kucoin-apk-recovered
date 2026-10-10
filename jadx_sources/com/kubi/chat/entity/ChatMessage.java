package com.kubi.chat.entity;

import com.kubi.chat.proto.ImProtocol$InstrumentType;
import com.kubi.chat.proto.ImProtocol$Message;
import com.kubi.chat.proto.ImProtocol$MessageType;
import com.kubi.chat.proto.ImProtocol$ProtocolFrame;
import com.kubi.chat.proto.ImProtocol$ProtocolHeader;
import com.kubi.chat.proto.ImProtocol$ProtocolType;
import com.kubi.chat.proto.MessageKt$Dsl;
import com.kubi.chat.proto.ProtocolFrameKt$Dsl;
import com.kubi.chat.proto.ProtocolHeaderKt$Dsl;
import java.util.Map;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468nb.C42792a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0001H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nJ\u0019\u0010/\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\nJ\u0017\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010,J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\nJ\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0002¢\u0006\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010C¨\u0006G"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatMessage;", "Lcom/kubi/chat/entity/IChatMessage;", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;", "data", "<init>", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;)V", "Lcom/kubi/chat/entity/IProtoMessage;", "(Lcom/kubi/chat/entity/IProtoMessage;)V", "", "getUniqueId", "()Ljava/lang/String;", "", "getSeqId", "()J", "getTimestamp", "", "getMetadata", "()Ljava/util/Map;", "getFromUid", "getToUid", "getContent", "Lcom/kubi/chat/entity/MsgTypeEnum;", "getMsgType", "()Lcom/kubi/chat/entity/MsgTypeEnum;", "Lcom/kubi/chat/entity/MsgStatusEnum;", "getStatus", "()Lcom/kubi/chat/entity/MsgStatusEnum;", "status", "", "setStatus", "(Lcom/kubi/chat/entity/MsgStatusEnum;)V", "uid", "", "isOutDirect", "(Ljava/lang/String;)Z", "message", "isTheSame", "(Lcom/kubi/chat/entity/IChatMessage;)Z", "Lnb/a;", "conversation", "isMsgRead", "(Lnb/a;)Z", "path", "setLocalPath", "(Ljava/lang/String;)V", "getLocalPath", "size", "setCompressSize", "(Ljava/lang/Long;)V", "getCompressSize", "()Ljava/lang/Long;", "hasPicUrl", "()Z", "getInstrumentMsg", "content", "setFailedInfo", "getFailedInfo", "Lokio/ByteString;", "getDataByte", "()Lokio/ByteString;", "getDataPro", "()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;", "protoMessage", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;", "messageStatus", "Lcom/kubi/chat/entity/MsgStatusEnum;", "localPath", "Ljava/lang/String;", "compressSize", "Ljava/lang/Long;", "failedInfo", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ChatMessage implements IChatMessage {

    @Nullable
    private Long compressSize;

    @Nullable
    private String failedInfo;

    @Nullable
    private String localPath;

    @NotNull
    private MsgStatusEnum messageStatus;

    @NotNull
    private ImProtocol$ProtocolFrame protoMessage;

    public ChatMessage(@NotNull ImProtocol$ProtocolFrame data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.messageStatus = MsgStatusEnum.UNDEF;
        this.protoMessage = data;
    }

    /* JADX INFO: compiled from: ChatMessage.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MsgTypeEnum.values().length];
            iArr[MsgTypeEnum.TEXT.ordinal()] = 1;
            iArr[MsgTypeEnum.IMAGE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImProtocol$MessageType.values().length];
            iArr2[ImProtocol$MessageType.TEXT.ordinal()] = 1;
            iArr2[ImProtocol$MessageType.IMAGE.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImProtocol$InstrumentType.values().length];
            iArr3[ImProtocol$InstrumentType.ACK.ordinal()] = 1;
            iArr3[ImProtocol$InstrumentType.MESSAGE_READ.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @Nullable
    public Long getCompressSize() {
        return this.compressSize;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getContent() {
        return C45148b.m99794d(this.protoMessage.getMessage().getContent());
    }

    @NotNull
    public final ByteString getDataByte() {
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] byteArray = this.protoMessage.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "protoMessage.toByteArray()");
        return ByteString.Companion.of$default(companion, byteArray, 0, 0, 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getDataPro, reason: from getter */
    public final ImProtocol$ProtocolFrame getProtoMessage() {
        return this.protoMessage;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getFailedInfo() {
        return C45148b.m99794d(this.failedInfo);
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getFromUid() {
        return C45148b.m99794d(this.protoMessage.getMessage().getFrom());
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getInstrumentMsg() {
        String msg = this.protoMessage.getInstrument().getMsg();
        Intrinsics.checkNotNullExpressionValue(msg, "protoMessage.instrument.msg");
        return msg;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getLocalPath() {
        return C45148b.m99794d(this.localPath);
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public Map<String, String> getMetadata() {
        Map<String, String> metadataMap = this.protoMessage.getHeader().getMetadataMap();
        return metadataMap == null ? MapsKt.emptyMap() : metadataMap;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public MsgTypeEnum getMsgType() {
        ImProtocol$MessageType type = this.protoMessage.getMessage().getType();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? MsgTypeEnum.UNDEF : MsgTypeEnum.IMAGE;
        }
        return MsgTypeEnum.TEXT;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public long getSeqId() {
        return C45148b.m99793c(Long.valueOf(this.protoMessage.getHeader().getSeqId()));
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public MsgStatusEnum getStatus() {
        ImProtocol$InstrumentType type = this.protoMessage.getInstrument().getType();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$2[type.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? this.messageStatus : MsgStatusEnum.READED;
        }
        return MsgStatusEnum.DELIVERED;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public long getTimestamp() {
        return C45148b.m99793c(Long.valueOf(this.protoMessage.getHeader().getTimestamp()));
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getToUid() {
        return C45148b.m99794d(this.protoMessage.getMessage().getTo());
    }

    @Override // com.kubi.chat.entity.IChatMessage
    @NotNull
    public String getUniqueId() {
        return C45148b.m99794d(this.protoMessage.getHeader().getUniqueId());
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public boolean isMsgRead(@NotNull C42792a conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        return getSeqId() <= conversation.getMyMessageHasReadId();
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public boolean isOutDirect(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return Intrinsics.areEqual(this.protoMessage.getHeader().getUid(), uid);
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public boolean isTheSame(@NotNull IChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return Intrinsics.areEqual(getUniqueId(), message.getUniqueId());
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public void setCompressSize(@Nullable Long size) {
        this.compressSize = size;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public void setFailedInfo(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.failedInfo = content;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public void setLocalPath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.localPath = path;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public void setStatus(@NotNull MsgStatusEnum status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.messageStatus = status;
    }

    @Override // com.kubi.chat.entity.IChatMessage
    public boolean hasPicUrl() {
        return StringsKt.startsWith$default(getContent(), "http", false, 2, (Object) null);
    }

    public ChatMessage(@NotNull IProtoMessage data) {
        ImProtocol$MessageType imProtocol$MessageType;
        Intrinsics.checkNotNullParameter(data, "data");
        this.messageStatus = MsgStatusEnum.UNDEF;
        ProtocolFrameKt$Dsl.Companion companion = ProtocolFrameKt$Dsl.INSTANCE;
        ImProtocol$ProtocolFrame.C11390a c11390aNewBuilder = ImProtocol$ProtocolFrame.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11390aNewBuilder, "newBuilder()");
        ProtocolFrameKt$Dsl protocolFrameKt$Dsl_create = companion._create(c11390aNewBuilder);
        ProtocolHeaderKt$Dsl.Companion companion2 = ProtocolHeaderKt$Dsl.INSTANCE;
        ImProtocol$ProtocolHeader.C11391a c11391aNewBuilder = ImProtocol$ProtocolHeader.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11391aNewBuilder, "newBuilder()");
        ProtocolHeaderKt$Dsl protocolHeaderKt$Dsl_create = companion2._create(c11391aNewBuilder);
        protocolHeaderKt$Dsl_create.m20385k(1);
        protocolHeaderKt$Dsl_create.m20384j(data.getMUniqueId());
        protocolHeaderKt$Dsl_create.m20383i(data.getMFrom());
        protocolHeaderKt$Dsl_create.m20380f(data.getMSid());
        protocolHeaderKt$Dsl_create.m20379e(data.getMSeqId());
        protocolHeaderKt$Dsl_create.m20382h(ImProtocol$ProtocolType.MESSAGE);
        protocolHeaderKt$Dsl_create.m20378d(data.getMDeviceId());
        protocolHeaderKt$Dsl_create.m20381g(data.getMTimestamp());
        protocolHeaderKt$Dsl_create.m20377c(protocolHeaderKt$Dsl_create.m20376b(), data.getMMetadata());
        protocolFrameKt$Dsl_create.m20372b(protocolHeaderKt$Dsl_create.m20375a());
        MessageKt$Dsl.Companion companion3 = MessageKt$Dsl.INSTANCE;
        ImProtocol$Message.C11386a c11386aNewBuilder = ImProtocol$Message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11386aNewBuilder, "newBuilder()");
        MessageKt$Dsl messageKt$Dsl_create = companion3._create(c11386aNewBuilder);
        messageKt$Dsl_create.m20368c(data.getMFrom());
        messageKt$Dsl_create.m20369d(data.getMTo());
        messageKt$Dsl_create.m20367b(data.getMContent());
        int i11 = WhenMappings.$EnumSwitchMapping$0[data.getMType().ordinal()];
        if (i11 == 1) {
            imProtocol$MessageType = ImProtocol$MessageType.TEXT;
        } else if (i11 != 2) {
            imProtocol$MessageType = ImProtocol$MessageType.UNRECOGNIZED;
        } else {
            imProtocol$MessageType = ImProtocol$MessageType.IMAGE;
        }
        messageKt$Dsl_create.m20370e(imProtocol$MessageType);
        protocolFrameKt$Dsl_create.m20374d(messageKt$Dsl_create.m20366a());
        this.protoMessage = protocolFrameKt$Dsl_create.m20371a();
    }
}
