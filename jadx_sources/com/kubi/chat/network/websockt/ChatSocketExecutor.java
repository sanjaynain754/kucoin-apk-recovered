package com.kubi.chat.network.websockt;

import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.protobuf.InvalidProtocolBufferException;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.chat.entity.ChatToken;
import com.kubi.chat.proto.ImProtocol$Instrument;
import com.kubi.chat.proto.ImProtocol$InstrumentType;
import com.kubi.chat.proto.ImProtocol$ProtocolFrame;
import com.kubi.chat.proto.ImProtocol$ProtocolHeader;
import com.kubi.chat.proto.ImProtocol$ProtocolType;
import com.kubi.chat.proto.InstrumentKt$Dsl;
import com.kubi.chat.proto.ProtocolFrameKt$Dsl;
import com.kubi.chat.proto.ProtocolHeaderKt$Dsl;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p531pb.C43430b;
import p554qb.C43682b;
import p554qb.C43683c;
import p591rb.InterfaceC43966b;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ChatSocketExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001A\u0018\u0000 D2\u00020\u0001:\u0006EFGH\u001b\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u00060#R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u00060+R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u00060/R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006I"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor;", "Lqb/c;", "Lrb/b;", "config", "Lcom/kubi/chat/network/websockt/ChatWebSocketClient;", "client", "<init>", "(Lrb/b;Lcom/kubi/chat/network/websockt/ChatWebSocketClient;)V", "", "Y", "()V", "Lcom/kubi/chat/network/websockt/IStatusCallback;", TUIConstants.TUIChat.CALL_BACK, "X", "(Lcom/kubi/chat/network/websockt/IStatusCallback;)V", "Lokio/ByteString;", "request", "", ExifInterface.LONGITUDE_WEST, "(Lokio/ByteString;)Z", "", "code", ExifInterface.GPS_DIRECTION_TRUE, "(I)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", ExifInterface.LATITUDE_SOUTH, "d", "Lrb/b;", "e", "Lcom/kubi/chat/network/websockt/ChatWebSocketClient;", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$c;", "f", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$c;", "defaultState", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;", "g", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;", "idleState", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;", "paramsState", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$b;", "i", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$b;", "connectingState", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$a;", "j", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$a;", "connectedState", "k", "Lcom/kubi/chat/network/websockt/IStatusCallback;", "statusCallback", CmcdData.Factory.STREAM_TYPE_LIVE, "I", "retryTimes", "Lokhttp3/OkHttpClient;", "m", "Lokhttp3/OkHttpClient;", "okhttpClient", "Lokhttp3/WebSocket;", "n", "Lokhttp3/WebSocket;", "socket", "com/kubi/chat/network/websockt/ChatSocketExecutor$f", "o", "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$f;", "p", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ChatSocketExecutor extends C43683c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43966b config;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ChatWebSocketClient client;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C11378c defaultState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C11379d idleState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C11380e paramsState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C11377b connectingState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C11376a connectedState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public IStatusCallback statusCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int retryTimes;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public OkHttpClient okhttpClient;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public volatile WebSocket socket;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C11381f callback;

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$a */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor$a;", "Lqb/b;", "<init>", "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "Lokio/ByteString;", "byteString", "d", "(Lokio/ByteString;)Z", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class C11376a extends C43682b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatSocketExecutor f19359a;

        /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$a$a */
        /* JADX INFO: compiled from: ChatSocketExecutor.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ImProtocol$ProtocolType.values().length];
                iArr[ImProtocol$ProtocolType.INSTRUMENT.ordinal()] = 1;
                iArr[ImProtocol$ProtocolType.MESSAGE.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ImProtocol$InstrumentType.values().length];
                iArr2[ImProtocol$InstrumentType.HEARTBEAT.ordinal()] = 1;
                iArr2[ImProtocol$InstrumentType.ACK.ordinal()] = 2;
                iArr2[ImProtocol$InstrumentType.MESSAGE_READ.ordinal()] = 3;
                iArr2[ImProtocol$InstrumentType.RATE_LIMIT.ordinal()] = 4;
                iArr2[ImProtocol$InstrumentType.TEXT_ERROR.ordinal()] = 5;
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public C11376a(ChatSocketExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f19359a = this$0;
        }

        @Override // p554qb.C43682b
        /* JADX INFO: renamed from: c */
        public boolean mo20322c(@NotNull Message msg) throws InvalidProtocolBufferException {
            ByteString byteString;
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 != 3) {
                if (i11 == 4) {
                    Object obj = msg.obj;
                    byteString = obj instanceof ByteString ? (ByteString) obj : null;
                    if (byteString != null && !m20323d(byteString)) {
                        this.f19359a.m20317T(4);
                    }
                } else if (i11 == 5) {
                    Object obj2 = msg.obj;
                    byteString = obj2 instanceof ByteString ? (ByteString) obj2 : null;
                    if (byteString == null) {
                        return true;
                    }
                    ImProtocol$ProtocolFrame protocolFrame = ImProtocol$ProtocolFrame.parseFrom(byteString.asByteBuffer());
                    ImProtocol$ProtocolType type = protocolFrame.getHeader().getType();
                    int i12 = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
                    if (i12 == 1) {
                        ImProtocol$InstrumentType type2 = protocolFrame.getInstrument().getType();
                        int i13 = type2 != null ? a.$EnumSwitchMapping$1[type2.ordinal()] : -1;
                        if (i13 == 1) {
                            this.f19359a.m96164v(4, byteString);
                        } else if (i13 == 2) {
                            ChatWebSocketClient chatWebSocketClient = this.f19359a.client;
                            Intrinsics.checkNotNullExpressionValue(protocolFrame, "protocolFrame");
                            chatWebSocketClient.m20336j(new ChatMessage(protocolFrame));
                        } else if (i13 == 3) {
                            ChatWebSocketClient chatWebSocketClient2 = this.f19359a.client;
                            Intrinsics.checkNotNullExpressionValue(protocolFrame, "protocolFrame");
                            chatWebSocketClient2.m20338l(new ChatMessage(protocolFrame));
                        } else if (i13 == 4 || i13 == 5) {
                            Intrinsics.checkNotNullExpressionValue(protocolFrame, "protocolFrame");
                            ChatMessage chatMessage = new ChatMessage(protocolFrame);
                            String msg2 = protocolFrame.getInstrument().getMsg();
                            Intrinsics.checkNotNullExpressionValue(msg2, "protocolFrame.instrument.msg");
                            chatMessage.setFailedInfo(msg2);
                            this.f19359a.client.m20337k(chatMessage);
                        } else {
                            C44128b.m97268l("chat.socket", "UN_KNOW");
                        }
                    } else if (i12 != 2) {
                        C44128b.m97268l("chat.socket", "UN_KNOW");
                    } else {
                        ChatWebSocketClient chatWebSocketClient3 = this.f19359a.client;
                        Intrinsics.checkNotNullExpressionValue(protocolFrame, "protocolFrame");
                        chatWebSocketClient3.m20339m(new ChatMessage(protocolFrame));
                        ProtocolFrameKt$Dsl.Companion companion = ProtocolFrameKt$Dsl.INSTANCE;
                        ImProtocol$ProtocolFrame.C11390a c11390aNewBuilder = ImProtocol$ProtocolFrame.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c11390aNewBuilder, "newBuilder()");
                        ProtocolFrameKt$Dsl protocolFrameKt$Dsl_create = companion._create(c11390aNewBuilder);
                        ImProtocol$ProtocolHeader header = protocolFrame.getHeader();
                        Intrinsics.checkNotNullExpressionValue(header, "protocolFrame.header");
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
                        instrumentKt$Dsl_create.m20365b(ImProtocol$InstrumentType.ACK);
                        protocolFrameKt$Dsl_create.m20373c(instrumentKt$Dsl_create.m20364a());
                        ImProtocol$ProtocolFrame imProtocol$ProtocolFrameM20371a = protocolFrameKt$Dsl_create.m20371a();
                        ByteString.Companion companion4 = ByteString.INSTANCE;
                        byte[] byteArray = imProtocol$ProtocolFrameM20371a.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "ackData.toByteArray()");
                        m20323d(ByteString.Companion.of$default(companion4, byteArray, 0, 0, 3, null));
                    }
                } else if (i11 == 6) {
                    this.f19359a.socket = null;
                    ChatSocketExecutor chatSocketExecutor = this.f19359a;
                    chatSocketExecutor.m96168z(chatSocketExecutor.idleState);
                    this.f19359a.m96163u(0, msg.arg1);
                }
            } else {
                this.f19359a.m20315R();
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m20323d(ByteString byteString) {
            WebSocket webSocket = this.f19359a.socket;
            return webSocket != null && webSocket.send(byteString);
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$b */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor$b;", "Lqb/b;", "<init>", "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V", "Lokio/ByteString;", "byteString", "", "d", "(Lokio/ByteString;)Z", "Landroid/os/Message;", "msg", "c", "(Landroid/os/Message;)Z", "", "b", "()V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class C11377b extends C43682b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatSocketExecutor f19360a;

        public C11377b(ChatSocketExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f19360a = this$0;
        }

        /* JADX INFO: renamed from: d */
        private final boolean m20324d(ByteString byteString) {
            WebSocket webSocket = this.f19360a.socket;
            return C45148b.m99792b(webSocket == null ? null : Boolean.valueOf(webSocket.send(byteString)));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p554qb.C43682b
        /* JADX INFO: renamed from: c */
        public boolean mo20322c(@NotNull Message msg) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            WebSocket webSocketNewWebSocket = null;
            if (i11 == 2) {
                Object obj = msg.obj;
                ChatToken chatToken = obj instanceof ChatToken ? (ChatToken) obj : null;
                if (chatToken == null) {
                    return true;
                }
                WebSocket webSocket = this.f19360a.socket;
                if (webSocket != null) {
                    webSocket.close(1000, "user close");
                }
                try {
                    ChatSocketExecutor chatSocketExecutor = this.f19360a;
                    OkHttpClient okHttpClient = chatSocketExecutor.okhttpClient;
                    if (okHttpClient != null) {
                        webSocketNewWebSocket = okHttpClient.newWebSocket(new Request.Builder().url(chatToken.getWsPath(this.f19360a.config.mo20398a())).build(), this.f19360a.callback);
                    }
                    chatSocketExecutor.socket = webSocketNewWebSocket;
                    TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire.m42393d("type", "socketDisconnect");
                    eventParametersBuilderAcquire.m42393d("code", "200");
                    eventParametersBuilderAcquire.m42394e("success", true);
                    TechnologyEvent.m42388d("payment_im", eventParametersBuilderAcquire);
                } catch (Exception e11) {
                    TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire2.m42393d("type", "socketDisconnect");
                    eventParametersBuilderAcquire2.m42393d("error_message", C45148b.m99794d(e11.getMessage()));
                    eventParametersBuilderAcquire2.m42393d("code", OtcAd.KYC_NOT_PASS);
                    eventParametersBuilderAcquire2.m42394e("success", false);
                    TechnologyEvent.m42388d("payment_im", eventParametersBuilderAcquire2);
                    ChatSocketExecutor chatSocketExecutor2 = this.f19360a;
                    chatSocketExecutor2.m96168z(chatSocketExecutor2.idleState);
                    this.f19360a.m96162t(0);
                }
            } else if (i11 == 4) {
                Object obj2 = msg.obj;
                ByteString byteString = obj2 instanceof ByteString ? (ByteString) obj2 : null;
                if (byteString != null && !m20324d(byteString)) {
                    this.f19360a.m20317T(4);
                }
            } else if (i11 == 5) {
                Object obj3 = msg.obj;
                ByteString byteString2 = obj3 instanceof ByteString ? (ByteString) obj3 : null;
                if (byteString2 == null) {
                    return true;
                }
                ImProtocol$ProtocolFrame from = ImProtocol$ProtocolFrame.parseFrom(byteString2.asByteBuffer());
                if (from.getInstrument().getType() == ImProtocol$InstrumentType.HEARTBEAT) {
                    if (from.getHeader().getSeqId() == 4) {
                        ChatSocketExecutor chatSocketExecutor3 = this.f19360a;
                        chatSocketExecutor3.m96168z(chatSocketExecutor3.connectedState);
                        this.f19360a.m96162t(3);
                        return true;
                    }
                    this.f19360a.m96164v(4, byteString2);
                }
            } else if (i11 == 6) {
                this.f19360a.socket = null;
                ChatSocketExecutor chatSocketExecutor4 = this.f19360a;
                chatSocketExecutor4.m96168z(chatSocketExecutor4.idleState);
                this.f19360a.m96162t(0);
            }
            return true;
        }

        @Override // p554qb.C43682b
        /* JADX INFO: renamed from: b */
        public void mo20325b() {
            super.mo20325b();
            this.f19360a.m96161s(6);
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$c */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor$c;", "Lqb/b;", "<init>", "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class C11378c extends C43682b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatSocketExecutor f19361a;

        public C11378c(ChatSocketExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f19361a = this$0;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$d */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;", "Lqb/b;", "<init>", "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class C11379d extends C43682b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatSocketExecutor f19362a;

        public C11379d(ChatSocketExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f19362a = this$0;
        }

        @Override // p554qb.C43682b
        /* JADX INFO: renamed from: c */
        public boolean mo20322c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 != -1) {
                if (i11 == 0) {
                    this.f19362a.m20316S();
                    int i12 = msg.arg1;
                    if (i12 == 3) {
                        this.f19362a.m96162t(1);
                        ChatSocketExecutor chatSocketExecutor = this.f19362a;
                        chatSocketExecutor.m96168z(chatSocketExecutor.paramsState);
                    } else if (i12 != 1 && i12 != 5) {
                        this.f19362a.m96165w(-1, 3000L);
                    }
                    TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire.m42393d("type", "socketDisconnect");
                    eventParametersBuilderAcquire.m42393d("code", "-2");
                    eventParametersBuilderAcquire.m42391b("error_message", msg.arg1);
                    eventParametersBuilderAcquire.m42394e("success", false);
                    TechnologyEvent.m42388d("payment_im", eventParametersBuilderAcquire);
                } else if (i11 == 4 || i11 == 6) {
                    if (this.f19362a.retryTimes >= 3) {
                        this.f19362a.retryTimes = 0;
                    }
                    this.f19362a.m96162t(-1);
                }
            } else if (this.f19362a.retryTimes < 3) {
                this.f19362a.retryTimes++;
                if (NetworkUtils.m6063k()) {
                    ChatSocketExecutor chatSocketExecutor2 = this.f19362a;
                    chatSocketExecutor2.m96168z(chatSocketExecutor2.paramsState);
                    this.f19362a.m96162t(1);
                } else {
                    C44128b.m97268l("chat.socket", "Socket建立连接[无网络]");
                }
            } else {
                C44128b.m97268l("chat.socket", "Socket建立连接[大于3次]");
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$e */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;", "Lqb/b;", "<init>", "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V", "Landroid/os/Message;", "msg", "", "c", "(Landroid/os/Message;)Z", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public final class C11380e extends C43682b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatSocketExecutor f19363a;

        public C11380e(ChatSocketExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f19363a = this$0;
        }

        @Override // p554qb.C43682b
        /* JADX INFO: renamed from: c */
        public boolean mo20322c(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 1) {
                try {
                    ChatToken chatTokenBody = C43430b.f95881a.m95623c().m95619c().execute().body();
                    if (chatTokenBody == null) {
                        ChatSocketExecutor chatSocketExecutor = this.f19363a;
                        chatSocketExecutor.m96168z(chatSocketExecutor.idleState);
                        this.f19363a.m96163u(0, 5);
                    } else {
                        this.f19363a.m96164v(2, chatTokenBody);
                        ChatSocketExecutor chatSocketExecutor2 = this.f19363a;
                        chatSocketExecutor2.m96168z(chatSocketExecutor2.connectingState);
                    }
                } catch (Exception unused) {
                    ChatSocketExecutor chatSocketExecutor3 = this.f19363a;
                    chatSocketExecutor3.m96168z(chatSocketExecutor3.idleState);
                    this.f19363a.m96163u(0, 5);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.network.websockt.ChatSocketExecutor$f */
    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"com/kubi/chat/network/websockt/ChatSocketExecutor$f", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokio/ByteString;", "bytes", "", "onMessage", "(Lokhttp3/WebSocket;Lokio/ByteString;)V", "", "t", "Lokhttp3/Response;", "response", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "code", "", "reason", "onClosing", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C11381f extends WebSocketListener {
        public C11381f() {
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            super.onClosing(webSocket, code, reason);
            if (Intrinsics.areEqual(webSocket, ChatSocketExecutor.this.socket)) {
                if (code == 401) {
                    ChatSocketExecutor.this.m20317T(3);
                } else {
                    ChatSocketExecutor.this.m20317T(2);
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t11, @Nullable Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t11, "t");
            if (Intrinsics.areEqual(webSocket, ChatSocketExecutor.this.socket)) {
                if (response != null && response.code() == 401) {
                    ChatSocketExecutor.this.m20317T(3);
                } else {
                    ChatSocketExecutor.this.m20317T(2);
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (Intrinsics.areEqual(webSocket, ChatSocketExecutor.this.socket)) {
                ChatSocketExecutor.this.m96164v(5, bytes);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m20314U(ChatSocketExecutor chatSocketExecutor, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        chatSocketExecutor.m20317T(i11);
    }

    /* JADX INFO: renamed from: R */
    public final void m20315R() {
        this.retryTimes = 0;
        IStatusCallback.INSTANCE.setConnected$ImSDK_release(true);
        IStatusCallback iStatusCallback = this.statusCallback;
        if (iStatusCallback == null) {
            return;
        }
        iStatusCallback.onConnected();
    }

    /* JADX INFO: renamed from: T */
    public final void m20317T(int code) {
        m96163u(6, code);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSocketExecutor(@NotNull InterfaceC43966b config, @NotNull ChatWebSocketClient client) {
        super("ChatSocketExecutor");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(client, "client");
        this.config = config;
        this.client = client;
        C11378c c11378c = new C11378c(this);
        this.defaultState = c11378c;
        C11379d c11379d = new C11379d(this);
        this.idleState = c11379d;
        C11380e c11380e = new C11380e(this);
        this.paramsState = c11380e;
        C11377b c11377b = new C11377b(this);
        this.connectingState = c11377b;
        C11376a c11376a = new C11376a(this);
        this.connectedState = c11376a;
        this.callback = new C11381f();
        m20318V();
        m96146d(c11378c);
        m96147e(c11379d, c11378c);
        m96147e(c11380e, c11378c);
        m96147e(c11377b, c11378c);
        m96147e(c11376a, c11378c);
    }

    /* JADX INFO: renamed from: S */
    public final void m20316S() {
        IStatusCallback.INSTANCE.setConnected$ImSDK_release(false);
        IStatusCallback iStatusCallback = this.statusCallback;
        if (iStatusCallback == null) {
            return;
        }
        iStatusCallback.onDisconnect();
    }

    /* JADX INFO: renamed from: V */
    public final void m20318V() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okhttpClient = builder.writeTimeout(5L, timeUnit).pingInterval(30L, timeUnit).readTimeout(5L, timeUnit).connectTimeout(10L, timeUnit).build();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m20319W(@NotNull ByteString request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (IStatusCallback.INSTANCE.isConnected() && Intrinsics.areEqual(m96148f(), this.connectedState)) {
            m96164v(4, request);
            return true;
        }
        m96168z(this.idleState);
        m96162t(4);
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final void m20320X(@NotNull IStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.statusCallback = callback;
    }

    /* JADX INFO: renamed from: Y */
    public final void m20321Y() {
        m96166x(this.defaultState);
        m96167y();
        m96168z(this.idleState);
        m96162t(-1);
    }
}
