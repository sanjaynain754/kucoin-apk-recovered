package p494ob;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.InstrumentTypeEnum;
import com.kubi.chat.proto.ImProtocol$Instrument;
import com.kubi.chat.proto.ImProtocol$InstrumentType;
import com.kubi.chat.proto.ImProtocol$ProtocolFrame;
import com.kubi.chat.proto.ImProtocol$ProtocolHeader;
import com.kubi.chat.proto.ImProtocol$ProtocolType;
import com.kubi.chat.proto.InstrumentKt$Dsl;
import com.kubi.chat.proto.ProtocolFrameKt$Dsl;
import com.kubi.chat.proto.ProtocolHeaderKt$Dsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ob.a */
/* JADX INFO: compiled from: InstrumentBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lob/a;", "", "Lcom/kubi/chat/entity/ChatMessage;", "chatMessage", "<init>", "(Lcom/kubi/chat/entity/ChatMessage;)V", "Lcom/kubi/chat/entity/InstrumentTypeEnum;", "type", "c", "(Lcom/kubi/chat/entity/InstrumentTypeEnum;)Lob/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/entity/ChatMessage;", "Lcom/kubi/chat/entity/ChatMessage;", "b", "Lcom/kubi/chat/entity/InstrumentTypeEnum;", "instrumentType", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43006a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ChatMessage chatMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public InstrumentTypeEnum instrumentType;

    /* JADX INFO: renamed from: ob.a$a */
    /* JADX INFO: compiled from: InstrumentBuilder.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentTypeEnum.values().length];
            iArr[InstrumentTypeEnum.MESSAGE_READ.ordinal()] = 1;
            iArr[InstrumentTypeEnum.ACK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C43006a(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        this.chatMessage = chatMessage;
        this.instrumentType = InstrumentTypeEnum.UNRECOGNIZED;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ChatMessage m94442a() {
        ImProtocol$InstrumentType imProtocol$InstrumentType;
        if (this.instrumentType == InstrumentTypeEnum.UNRECOGNIZED) {
            return null;
        }
        ProtocolFrameKt$Dsl.Companion companion = ProtocolFrameKt$Dsl.INSTANCE;
        ImProtocol$ProtocolFrame.C11390a c11390aNewBuilder = ImProtocol$ProtocolFrame.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11390aNewBuilder, "newBuilder()");
        ProtocolFrameKt$Dsl protocolFrameKt$Dsl_create = companion._create(c11390aNewBuilder);
        ImProtocol$ProtocolHeader header = getChatMessage().getProtoMessage().getHeader();
        Intrinsics.checkNotNullExpressionValue(header, "chatMessage.getDataPro().header");
        ProtocolHeaderKt$Dsl.Companion companion2 = ProtocolHeaderKt$Dsl.INSTANCE;
        ImProtocol$ProtocolHeader.C11391a builder = header.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ProtocolHeaderKt$Dsl protocolHeaderKt$Dsl_create = companion2._create(builder);
        protocolHeaderKt$Dsl_create.m20382h(ImProtocol$ProtocolType.INSTRUMENT);
        protocolFrameKt$Dsl_create.m20372b(protocolHeaderKt$Dsl_create.m20375a());
        InstrumentKt$Dsl.Companion companion3 = InstrumentKt$Dsl.INSTANCE;
        ImProtocol$Instrument.C11383a c11383aNewBuilder = ImProtocol$Instrument.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c11383aNewBuilder, "newBuilder()");
        InstrumentKt$Dsl instrumentKt$Dsl_create = companion3._create(c11383aNewBuilder);
        int i11 = a.$EnumSwitchMapping$0[this.instrumentType.ordinal()];
        if (i11 != 1) {
            imProtocol$InstrumentType = i11 != 2 ? ImProtocol$InstrumentType.UNRECOGNIZED : ImProtocol$InstrumentType.ACK;
        } else {
            imProtocol$InstrumentType = ImProtocol$InstrumentType.MESSAGE_READ;
        }
        instrumentKt$Dsl_create.m20365b(imProtocol$InstrumentType);
        protocolFrameKt$Dsl_create.m20373c(instrumentKt$Dsl_create.m20364a());
        return new ChatMessage(protocolFrameKt$Dsl_create.m20371a());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChatMessage getChatMessage() {
        return this.chatMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C43006a m94444c(@NotNull InstrumentTypeEnum type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.instrumentType = type;
        return this;
    }
}
