package com.kubi.network.socket;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.credentials.provider.CredentialEntry;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C2711C;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.socket.bus.InterfaceC19345a;
import com.kubi.network.socket.bus.MessageBus;
import com.kubi.network.socket.core.Dispatcher;
import com.kubi.network.socket.core.InterfaceC19356b;
import com.kubi.network.socket.core.NetworkCall;
import com.kubi.network.socket.exception.ConnectNetworkException;
import com.kubi.network.socket.exception.ConnectUserException;
import com.kubi.network.socket.socketio.SocketIOConnection;
import com.kubi.network.socket.socketkc.C19384d;
import com.kubi.network.socket.socketkc.SocketKCConnection;
import com.kubi.network.socket.utils.C19388d;
import com.kubi.network.socket.utils.C19391g;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.InterfaceC37236a;
import fr.InterfaceC37581b;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42917g;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p570qr.C43859e;
import p570qr.InterfaceC43860f;
import p570qr.InterfaceC43861g;
import p672ur.C45291a;
import p672ur.C45292b;
import p672ur.C45293c;
import p672ur.C45298h;
import p672ur.InterfaceC45294d;
import p672ur.InterfaceC45295e;
import p672ur.InterfaceC45297g;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tr.C45066a;
import tr.C45067b;
import tr.InterfaceC45068c;

/* JADX INFO: compiled from: WebSocketClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u000236\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001a\u0010%\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R4\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107¨\u00069"}, m90084d2 = {"Lcom/kubi/network/socket/WebSocketClient;", "Ler/a;", "Lcom/kubi/network/socket/WebSocketClient$a;", "config", "<init>", "(Lcom/kubi/network/socket/WebSocketClient$a;)V", "", "connect", "()V", "g", "disconnect", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/model/NetworkMessage;", "d", "()Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lfr/b;", "f", "(Lcom/kubi/network/api/model/NetworkRequest;)Lfr/b;", "Lfr/c;", "e", "(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)Lfr/b;", "cancelAll", "Lcom/kubi/network/socket/WebSocketClient$a;", "Lcom/kubi/network/socket/core/Dispatcher;", "Lcom/kubi/network/socket/core/Dispatcher;", "j", "()Lcom/kubi/network/socket/core/Dispatcher;", "dispatcher", "Lqr/g;", "Lqr/g;", "k", "()Lqr/g;", "setSocketConnection$network_core_socket_release", "(Lqr/g;)V", "socketConnection", "Lcom/kubi/network/socket/bus/MessageBus;", "Lcom/kubi/network/socket/bus/MessageBus;", "messageBus", "Lqr/e;", "Lqr/e;", "externalCalls", "com/kubi/network/socket/WebSocketClient$b", "Lcom/kubi/network/socket/WebSocketClient$b;", "internalCall", "com/kubi/network/socket/WebSocketClient$networkReceiver$1", "Lcom/kubi/network/socket/WebSocketClient$networkReceiver$1;", "networkReceiver", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketClient.kt\ncom/kubi/network/socket/WebSocketClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"})
public final class WebSocketClient implements InterfaceC37236a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C19339a config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Dispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC43861g<NetworkRequest, NetworkMessage<?>> socketConnection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C43859e externalCalls;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C19340b internalCall;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient$networkReceiver$1 networkReceiver;

    /* JADX INFO: renamed from: com.kubi.network.socket.WebSocketClient$a */
    /* JADX INFO: compiled from: WebSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010=\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\"\u0010M\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010Q\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010=\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R\"\u0010W\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010S\u001a\u0004\bJ\u0010T\"\u0004\bU\u0010VR\"\u0010Z\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010=\u001a\u0004\bN\u0010>\"\u0004\bY\u0010@R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010e\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bF\u0010b\"\u0004\bc\u0010dR\"\u0010j\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010f\u001a\u0004\bB\u0010g\"\u0004\bh\u0010iR\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\b/\u0010m\"\u0004\bn\u0010oR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010p\u001a\u0004\bX\u0010q\"\u0004\br\u0010sR\"\u0010!\u001a\u00020t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bu\u0010w\"\u0004\bx\u0010yR)\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020{0z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010|\u001a\u0004\bk\u0010}\"\u0004\b~\u0010\u007fR+\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010z8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b\\\u0010|\u001a\u0004\b`\u0010}\"\u0005\b\u0082\u0001\u0010\u007f¨\u0006\u0084\u0001"}, m90084d2 = {"Lcom/kubi/network/socket/WebSocketClient$a;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "client", "y", "(Lokhttp3/OkHttpClient;)Lcom/kubi/network/socket/WebSocketClient$a;", "Lcom/kubi/network/socket/a;", "subscribeClient", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/kubi/network/socket/a;)Lcom/kubi/network/socket/WebSocketClient$a;", "Ltr/c;", "tokenProvider", "B", "(Ltr/c;)Lcom/kubi/network/socket/WebSocketClient$a;", "", "protocol", "w", "(Ljava/lang/String;)Lcom/kubi/network/socket/WebSocketClient$a;", "Lqr/f;", "codec", "v", "(Lqr/f;)Lcom/kubi/network/socket/WebSocketClient$a;", "Lur/d;", "activeTrack", "t", "(Lur/d;)Lcom/kubi/network/socket/WebSocketClient$a;", "Lur/e;", "connectTrack", "x", "(Lur/e;)Lcom/kubi/network/socket/WebSocketClient$a;", "Lur/g$a;", "requestTrack", "z", "(Lur/g$a;)Lcom/kubi/network/socket/WebSocketClient$a;", "Landroid/app/Application;", "context", "Lcom/kubi/network/socket/WebSocketClient;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Application;)Lcom/kubi/network/socket/WebSocketClient;", "Landroid/app/Application;", "c", "()Landroid/app/Application;", "u", "(Landroid/app/Application;)V", MimeTypes.BASE_TYPE_APPLICATION, "b", "Lokhttp3/OkHttpClient;", "m", "()Lokhttp3/OkHttpClient;", "setOkHttpClient$network_core_socket_release", "(Lokhttp3/OkHttpClient;)V", "okHttpClient", "Lcom/kubi/network/socket/a;", "q", "()Lcom/kubi/network/socket/a;", "setSubscribeClient$network_core_socket_release", "(Lcom/kubi/network/socket/a;)V", "", "d", "J", "()J", "setCallTimeout$network_core_socket_release", "(J)V", "callTimeout", "e", "o", "setRequestTimeout$network_core_socket_release", "requestTimeout", "f", "k", "setFlowTimeout$network_core_socket_release", "flowTimeout", "g", CmcdData.Factory.STREAMING_FORMAT_SS, "setTokenTimeout$network_core_socket_release", "tokenTimeout", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "setConnectTimeout$network_core_socket_release", "connectTimeout", "", "I", "()I", "setConnectRetryCount$network_core_socket_release", "(I)V", "connectRetryCount", "j", "setConnectRetryInterval$network_core_socket_release", "connectRetryInterval", "Ltr/c;", "r", "()Ltr/c;", "setTokenProvider$network_core_socket_release", "(Ltr/c;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/lang/String;", "()Ljava/lang/String;", "setChannelProtocol$network_core_socket_release", "(Ljava/lang/String;)V", "channelProtocol", "Lqr/f;", "()Lqr/f;", "setChannelCodec$network_core_socket_release", "(Lqr/f;)V", "channelCodec", "n", "Lur/d;", "()Lur/d;", "setActiveTrack$network_core_socket_release", "(Lur/d;)V", "Lur/e;", "()Lur/e;", "setConnectTrack$network_core_socket_release", "(Lur/e;)V", "Lur/h;", "p", "Lur/h;", "()Lur/h;", "setRequestTrack$network_core_socket_release", "(Lur/h;)V", "", "Lcom/kubi/network/socket/core/b;", "Ljava/util/List;", "()Ljava/util/List;", "setRequestInterceptors$network_core_socket_release", "(Ljava/util/List;)V", "requestInterceptors", "Lcom/kubi/network/socket/bus/a;", "setMessageInterceptors$network_core_socket_release", "messageInterceptors", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19339a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public Application application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public OkHttpClient okHttpClient;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC19342a subscribeClient;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long callTimeout;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public long requestTimeout;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long flowTimeout;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public long tokenTimeout;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public long connectTimeout;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int connectRetryCount;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public long connectRetryInterval;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public InterfaceC45068c tokenProvider;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public String channelProtocol;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public InterfaceC43860f channelCodec;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public InterfaceC45294d activeTrack;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public InterfaceC45295e connectTrack;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public C45298h requestTrack;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public List<InterfaceC19356b> requestInterceptors;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public List<InterfaceC19345a> messageInterceptors;

        @NotNull
        /* JADX INFO: renamed from: A */
        public final C19339a m42865A(@NotNull InterfaceC19342a subscribeClient) {
            Intrinsics.checkNotNullParameter(subscribeClient, "subscribeClient");
            this.subscribeClient = subscribeClient;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: B */
        public final C19339a m42866B(@NotNull InterfaceC45068c tokenProvider) {
            Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
            this.tokenProvider = tokenProvider;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WebSocketClient m42867a(@NotNull Application context) {
            Intrinsics.checkNotNullParameter(context, "context");
            m42887u(context);
            C19391g.f36153a.m43061d(context);
            C19388d.f36150a.m43052a(context);
            return new WebSocketClient(this);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC45294d getActiveTrack() {
            return this.activeTrack;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Application m42869c() {
            Application application = this.application;
            if (application != null) {
                return application;
            }
            Intrinsics.throwUninitializedPropertyAccessException(MimeTypes.BASE_TYPE_APPLICATION);
            return null;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getCallTimeout() {
            return this.callTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC43860f getChannelCodec() {
            return this.channelCodec;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getChannelProtocol() {
            return this.channelProtocol;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getConnectRetryCount() {
            return this.connectRetryCount;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getConnectRetryInterval() {
            return this.connectRetryInterval;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final long getConnectTimeout() {
            return this.connectTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC45295e getConnectTrack() {
            return this.connectTrack;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getFlowTimeout() {
            return this.flowTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final List<InterfaceC19345a> m42878l() {
            return this.messageInterceptors;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final List<InterfaceC19356b> m42880n() {
            return this.requestInterceptors;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final long getRequestTimeout() {
            return this.requestTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final C45298h getRequestTrack() {
            return this.requestTrack;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final InterfaceC19342a getSubscribeClient() {
            return this.subscribeClient;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final InterfaceC45068c getTokenProvider() {
            return this.tokenProvider;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final long getTokenTimeout() {
            return this.tokenTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C19339a m42886t(@NotNull InterfaceC45294d activeTrack) {
            Intrinsics.checkNotNullParameter(activeTrack, "activeTrack");
            this.activeTrack = activeTrack;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public final void m42887u(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "<set-?>");
            this.application = application;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final C19339a m42888v(@NotNull InterfaceC43860f codec) {
            Intrinsics.checkNotNullParameter(codec, "codec");
            this.channelCodec = codec;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final C19339a m42889w(@NotNull String protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.channelProtocol = protocol;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public final C19339a m42890x(@NotNull InterfaceC45295e connectTrack) {
            Intrinsics.checkNotNullParameter(connectTrack, "connectTrack");
            this.connectTrack = connectTrack;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: y */
        public final C19339a m42891y(@NotNull OkHttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.okHttpClient = client;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: z */
        public final C19339a m42892z(@NotNull InterfaceC45297g.a requestTrack) {
            Intrinsics.checkNotNullParameter(requestTrack, "requestTrack");
            this.requestTrack = new C45298h(requestTrack);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C19339a() {
            OkHttpClient okHttpClientM93389e = C42597a.m93389e();
            this.okHttpClient = okHttpClientM93389e;
            this.callTimeout = C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.requestTimeout = 10000L;
            this.flowTimeout = 30000L;
            this.tokenTimeout = C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.connectTimeout = 5000L;
            this.connectRetryCount = 3;
            this.tokenProvider = new C45067b(okHttpClientM93389e, new C45066a("v1/bullet-public", MapsKt.mapOf(TuplesKt.m90091to("encrypt", CredentialEntry.TRUE_STRING), TuplesKt.m90091to("protocol", "websocket"), TuplesKt.m90091to("source", "android")), MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING)), null, 8, null));
            this.channelProtocol = "socket_kc_protocol";
            this.channelCodec = new C19384d();
            String str = null;
            long j11 = 0;
            this.activeTrack = new C45291a(str, j11, 3, null);
            int i11 = 1;
            this.connectTrack = new C45292b(null, i11, 0 == true ? 1 : 0);
            this.requestTrack = new C45298h(new C45293c(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0));
            this.requestInterceptors = new ArrayList();
            this.messageInterceptors = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.WebSocketClient$b */
    /* JADX INFO: compiled from: WebSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m90084d2 = {"com/kubi/network/socket/WebSocketClient$b", "Lfr/d;", "", "onDisconnect", "()V", "onConnecting", "onConnected", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19340b implements InterfaceC37583d {
        public C19340b() {
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            WebSocketClient.this.externalCalls.m96625g();
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            WebSocketClient.this.externalCalls.m96626h();
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            WebSocketClient.this.externalCalls.m96627i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.kubi.network.socket.WebSocketClient$networkReceiver$1] */
    public WebSocketClient(@NotNull C19339a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.dispatcher = new Dispatcher();
        this.messageBus = new MessageBus(config.m42878l());
        this.externalCalls = new C43859e(C42917g.m94139e());
        this.internalCall = new C19340b();
        this.networkReceiver = new BroadcastReceiver() { // from class: com.kubi.network.socket.WebSocketClient$networkReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861gM42864k = this.f36009a.m42864k();
                if (interfaceC43861gM42864k != null) {
                    interfaceC43861gM42864k.mo42926d(new ConnectNetworkException());
                }
            }
        };
        InterfaceC19342a subscribeClient = config.getSubscribeClient();
        if (subscribeClient != null) {
            subscribeClient.mo42893a(new C19343b(config.getOkHttpClient(), this, config.m42880n(), new Function1<NetworkRequest, Unit>() { // from class: com.kubi.network.socket.WebSocketClient.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkRequest networkRequest) {
                    invoke2(networkRequest);
                    return Unit.INSTANCE;
                }

                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkRequest it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861gM42864k = WebSocketClient.this.m42864k();
                    if (interfaceC43861gM42864k != null) {
                        InterfaceC43861g.a.m96632a(interfaceC43861gM42864k, it, null, 2, null);
                    }
                }
            }, new Function1<NetworkMessage<?>, Unit>() { // from class: com.kubi.network.socket.WebSocketClient.2
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkMessage<?> networkMessage) {
                    invoke2(networkMessage);
                    return Unit.INSTANCE;
                }

                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkMessage<?> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WebSocketClient.this.messageBus.m42902c(it);
                }
            }));
        }
    }

    @Override // er.InterfaceC37236a
    /* JADX INFO: renamed from: a */
    public void mo42856a(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.externalCalls.m96624f(callback);
    }

    @Override // er.InterfaceC37236a
    /* JADX INFO: renamed from: b */
    public void mo42857b(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.externalCalls.m96630o(callback);
    }

    @Override // er.InterfaceC37236a
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo42858c() {
        String strMo42925c;
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g = this.socketConnection;
        return (interfaceC43861g == null || (strMo42925c = interfaceC43861g.mo42925c()) == null) ? "disconnect" : strMo42925c;
    }

    @Override // er.InterfaceC37236a
    public void cancelAll() {
        this.dispatcher.m42936a();
        InterfaceC19342a subscribeClient = this.config.getSubscribeClient();
        if (subscribeClient != null) {
            subscribeClient.cancelAll();
        }
    }

    @Override // er.InterfaceC37236a
    public void connect() {
        if (this.socketConnection != null) {
            disconnect();
        }
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> socketIOConnection = Intrinsics.areEqual(this.config.getChannelProtocol(), "socket_io_protocol") ? new SocketIOConnection(this, this.config) : new SocketKCConnection(this, this.config);
        this.socketConnection = socketIOConnection;
        socketIOConnection.mo42928f(new Function1<NetworkMessage<?>, Unit>() { // from class: com.kubi.network.socket.WebSocketClient.connect.1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NetworkMessage<?> networkMessage) {
                invoke2(networkMessage);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull NetworkMessage<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WebSocketClient.this.messageBus.m42902c(it);
            }
        });
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g = this.socketConnection;
        if (interfaceC43861g != null) {
            interfaceC43861g.mo42923a(this.internalCall);
        }
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g2 = this.socketConnection;
        if (interfaceC43861g2 != null) {
            interfaceC43861g2.connect();
        }
        InterfaceC19342a subscribeClient = this.config.getSubscribeClient();
        if (subscribeClient != null) {
            subscribeClient.connect();
        }
        this.config.m42869c().registerReceiver(this.networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // er.InterfaceC37236a
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<NetworkMessage<?>> mo42859d() {
        return this.messageBus.m42903d();
    }

    @Override // er.InterfaceC37236a
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC37581b mo42860e(@NotNull NetworkRequest request, @NotNull InterfaceC37582c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37581b interfaceC37581bMo42861f = mo42861f(request);
        interfaceC37581bMo42861f.mo42941a(callback);
        return interfaceC37581bMo42861f;
    }

    @Override // er.InterfaceC37236a
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC37581b mo42861f(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new NetworkCall(this, this.config, request);
    }

    @Override // er.InterfaceC37236a
    /* JADX INFO: renamed from: g */
    public void mo42862g() {
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g = this.socketConnection;
        if (interfaceC43861g != null) {
            interfaceC43861g.mo42926d(new ConnectUserException());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final InterfaceC43861g<NetworkRequest, NetworkMessage<?>> m42864k() {
        return this.socketConnection;
    }

    @Override // er.InterfaceC37236a
    public void disconnect() {
        cancelAll();
        InterfaceC19342a subscribeClient = this.config.getSubscribeClient();
        if (subscribeClient != null) {
            subscribeClient.disconnect();
        }
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g = this.socketConnection;
        if (interfaceC43861g != null) {
            interfaceC43861g.mo42924b(this.internalCall);
        }
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861g2 = this.socketConnection;
        if (interfaceC43861g2 != null) {
            interfaceC43861g2.disconnect();
        }
        this.socketConnection = null;
        this.config.m42869c().unregisterReceiver(this.networkReceiver);
    }
}
