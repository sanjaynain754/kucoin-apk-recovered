package p183cs;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.websocket.model.HeartbeatRequest;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cs.a */
/* JADX INFO: compiled from: ModelConverter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/network/websocket/model/Message;", "b", "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Lcom/kubi/network/websocket/model/Message;", "Lcom/kubi/network/api/model/NetworkMessage;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkMessage;)Lcom/kubi/network/websocket/model/Message;", "", "id", "d", "(Lcom/kubi/network/websocket/model/Message;Ljava/lang/String;)Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/network/websocket/model/SocketRequest;", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "e", "(Lcom/kubi/network/websocket/model/SocketRequest;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "", "waitHeartbeat", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "c", "(Lcom/kubi/network/websocket/model/HeartbeatRequest;Z)Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "network-adapter-subscribe-old_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C36524a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Message m81794a(@NotNull NetworkMessage<?> networkMessage) {
        Intrinsics.checkNotNullParameter(networkMessage, "<this>");
        Message message = new Message();
        Object data = networkMessage.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.kubi.network.api.subscribe.model.SubscribeMessage");
        SubscribeMessage subscribeMessage = (SubscribeMessage) data;
        message.setId(subscribeMessage.getId());
        message.setUserId(subscribeMessage.getUserId());
        message.setSource(subscribeMessage.isSocketMessage() ? "socket" : "heartbeat");
        message.setTopic(subscribeMessage.getTopic());
        message.setSubject(subscribeMessage.getSubject());
        message.setData(subscribeMessage.getData());
        message.setExtension(subscribeMessage.getExtension());
        message.setTimestamp(subscribeMessage.getTimestamp());
        return message;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Message m81795b(@NotNull SubscribeMessage subscribeMessage) {
        Intrinsics.checkNotNullParameter(subscribeMessage, "<this>");
        Message message = new Message();
        message.setId(subscribeMessage.getId());
        message.setUserId(subscribeMessage.getUserId());
        message.setSource(subscribeMessage.isSocketMessage() ? "socket" : "heartbeat");
        message.setTopic(subscribeMessage.getTopic());
        message.setSubject(subscribeMessage.getSubject());
        message.setData(subscribeMessage.getData());
        message.setExtension(subscribeMessage.getExtension());
        message.setTimestamp(subscribeMessage.getTimestamp());
        return message;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final PeriodRequest m81796c(@NotNull HeartbeatRequest heartbeatRequest, boolean z11) {
        Intrinsics.checkNotNullParameter(heartbeatRequest, "<this>");
        return new PeriodRequest(null, heartbeatRequest.getRequest(), heartbeatRequest.getSupportBackground(), heartbeatRequest.getRestfulRequest(), z11, heartbeatRequest.getConnectedPeriod(), heartbeatRequest.getDisconnectPeriod(), 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final SubscribeMessage m81797d(@NotNull Message message, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new SubscribeMessage(id2, message.getUserId(), message.getTopic(), message.getSubject(), message.getData(), message.getExtension(), message.getTimestamp());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final SubscribeRequest m81798e(@NotNull SocketRequest socketRequest) {
        Intrinsics.checkNotNullParameter(socketRequest, "<this>");
        return new SubscribeRequest(socketRequest.getType(), socketRequest.getTopic(), null, null, 12, null);
    }
}
