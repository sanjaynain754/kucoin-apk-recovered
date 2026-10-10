package p494ob;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.MsgTypeEnum;
import com.kubi.chat.proto.ImProtocol$Message;
import com.kubi.chat.proto.ImProtocol$MessageType;
import com.kubi.chat.proto.ImProtocol$ProtocolFrame;
import com.kubi.chat.proto.ImProtocol$ProtocolHeader;
import com.kubi.chat.proto.ImProtocol$ProtocolType;
import com.kubi.chat.proto.MessageKt$Dsl;
import com.kubi.chat.proto.ProtocolFrameKt$Dsl;
import com.kubi.chat.proto.ProtocolHeaderKt$Dsl;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ob.c */
/* JADX INFO: compiled from: MessageBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\"\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'¨\u0006)"}, m90084d2 = {"Lob/c;", "", "<init>", "()V", "", "from", "d", "(Ljava/lang/String;)Lob/c;", TypedValues.TransitionType.S_TO, CmcdData.Factory.STREAMING_FORMAT_HLS, "content", "c", "Lcom/kubi/chat/entity/MsgTypeEnum;", "type", "e", "(Lcom/kubi/chat/entity/MsgTypeEnum;)Lob/c;", "", "data", "f", "(Ljava/util/Map;)Lob/c;", "", "setId", "g", "(J)Lob/c;", "size", "b", "(Ljava/lang/Long;)Lob/c;", "Lcom/kubi/chat/entity/ChatMessage;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/entity/ChatMessage;", "Ljava/lang/String;", "messageFrom", "messageTo", TUIConstants.TUIChat.MESSAGE_CONTENT, "Ljava/lang/Long;", "messageSeqId", "msgPicCompressSize", "Ljava/util/Map;", "messageMeteData", "Lcom/kubi/chat/entity/MsgTypeEnum;", "messageType", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43008c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String messageFrom;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String messageTo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String messageContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Long messageSeqId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Long msgPicCompressSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public Map<String, String> messageMeteData = MapsKt.emptyMap();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public MsgTypeEnum messageType = MsgTypeEnum.UNDEF;

    /* JADX INFO: renamed from: ob.c$a */
    /* JADX INFO: compiled from: MessageBuilder.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgTypeEnum.values().length];
            iArr[MsgTypeEnum.TEXT.ordinal()] = 1;
            iArr[MsgTypeEnum.IMAGE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ChatMessage m94446a() {
        String str;
        String str2;
        ImProtocol$MessageType imProtocol$MessageType;
        String str3 = this.messageFrom;
        if (str3 == null || str3.length() == 0 || (str = this.messageTo) == null || str.length() == 0 || (str2 = this.messageContent) == null || str2.length() == 0 || this.messageType == MsgTypeEnum.UNDEF) {
            return null;
        }
        ProtocolFrameKt$Dsl.Companion companion = ProtocolFrameKt$Dsl.INSTANCE;
        ImProtocol$ProtocolFrame.C11390a c11390aNewBuilder = ImProtocol$ProtocolFrame.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11390aNewBuilder, "newBuilder()");
        ProtocolFrameKt$Dsl protocolFrameKt$Dsl_create = companion._create(c11390aNewBuilder);
        ProtocolHeaderKt$Dsl.Companion companion2 = ProtocolHeaderKt$Dsl.INSTANCE;
        ImProtocol$ProtocolHeader.C11391a c11391aNewBuilder = ImProtocol$ProtocolHeader.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11391aNewBuilder, "newBuilder()");
        ProtocolHeaderKt$Dsl protocolHeaderKt$Dsl_create = companion2._create(c11391aNewBuilder);
        protocolHeaderKt$Dsl_create.m20385k(1);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        protocolHeaderKt$Dsl_create.m20384j(string);
        protocolHeaderKt$Dsl_create.m20383i(C45148b.m99794d(this.messageFrom));
        protocolHeaderKt$Dsl_create.m20379e(C45148b.m99793c(this.messageSeqId));
        protocolHeaderKt$Dsl_create.m20382h(ImProtocol$ProtocolType.MESSAGE);
        protocolHeaderKt$Dsl_create.m20378d("ANDROID");
        protocolHeaderKt$Dsl_create.m20381g(System.currentTimeMillis());
        protocolHeaderKt$Dsl_create.m20377c(protocolHeaderKt$Dsl_create.m20376b(), this.messageMeteData);
        protocolFrameKt$Dsl_create.m20372b(protocolHeaderKt$Dsl_create.m20375a());
        MessageKt$Dsl.Companion companion3 = MessageKt$Dsl.INSTANCE;
        ImProtocol$Message.C11386a c11386aNewBuilder = ImProtocol$Message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11386aNewBuilder, "newBuilder()");
        MessageKt$Dsl messageKt$Dsl_create = companion3._create(c11386aNewBuilder);
        messageKt$Dsl_create.m20368c(C45148b.m99794d(this.messageFrom));
        messageKt$Dsl_create.m20369d(C45148b.m99794d(this.messageTo));
        messageKt$Dsl_create.m20367b(C45148b.m99794d(this.messageContent));
        int i11 = a.$EnumSwitchMapping$0[this.messageType.ordinal()];
        if (i11 != 1) {
            imProtocol$MessageType = i11 != 2 ? ImProtocol$MessageType.UNRECOGNIZED : ImProtocol$MessageType.IMAGE;
        } else {
            imProtocol$MessageType = ImProtocol$MessageType.TEXT;
        }
        messageKt$Dsl_create.m20370e(imProtocol$MessageType);
        protocolFrameKt$Dsl_create.m20374d(messageKt$Dsl_create.m20366a());
        ChatMessage chatMessage = new ChatMessage(protocolFrameKt$Dsl_create.m20371a());
        chatMessage.setCompressSize(this.msgPicCompressSize);
        return chatMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C43008c m94447b(@Nullable Long size) {
        this.msgPicCompressSize = size;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C43008c m94448c(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.messageContent = content;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C43008c m94449d(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.messageFrom = from;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C43008c m94450e(@NotNull MsgTypeEnum type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.messageType = type;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C43008c m94451f(@NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.messageMeteData = data;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C43008c m94453h(@NotNull String to2) {
        Intrinsics.checkNotNullParameter(to2, "to");
        this.messageTo = to2;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C43008c m94452g(long setId) {
        this.messageSeqId = Long.valueOf(setId);
        return this;
    }
}
