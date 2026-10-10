package com.kubi.network.subscribe.codec;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kucoin.push.client.proto.MessagePayloadProto$MessagePayload;
import gr.C38001c;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p570qr.C43865k;
import p570qr.InterfaceC43860f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import tr.InterfaceC45068c;

/* JADX INFO: compiled from: SubscribeChannelCodec.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/network/subscribe/codec/SubscribeSocketKCCodec;", "Lqr/f;", "Ltr/c;", "tokenProvider", "", "", "privateTopics", "<init>", "(Ltr/c;Ljava/util/List;)V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Ljava/lang/Object;", "message", "Lqr/k;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lqr/k;", "d", "(Ljava/lang/String;)Lqr/k;", "Lokio/ByteString;", "e", "(Lokio/ByteString;)Lqr/k;", "topic", "", "f", "(Ljava/lang/String;)Z", "Ltr/c;", "Ljava/util/List;", "c", "Companion", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SubscribeSocketKCCodec implements InterfaceC43860f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45068c tokenProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> privateTopics;

    public SubscribeSocketKCCodec(@NotNull InterfaceC45068c tokenProvider, @NotNull List<String> privateTopics) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(privateTopics, "privateTopics");
        this.tokenProvider = tokenProvider;
        this.privateTopics = privateTopics;
    }

    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: a */
    public C43865k<?> mo42990a(@NotNull Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof ByteString) {
            return m43076e((ByteString) message);
        }
        if (message instanceof byte[]) {
            byte[] bArr = (byte[]) message;
            return m43076e(ByteString.INSTANCE.m94738of(bArr, 0, bArr.length));
        }
        if (message instanceof String) {
            return m43075d((String) message);
        }
        throw new ClassCastException("不支持的消息类型: " + message.getClass().getName());
    }

    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: b */
    public Object mo42991b(@NotNull NetworkRequest request) throws JSONException, ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", request.getId());
        Map<String, Object> params = request.getParams();
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        if (request instanceof SubscribeRequest) {
            SubscribeRequest subscribeRequest = (SubscribeRequest) request;
            boolean zM43077f = m43077f(subscribeRequest.getTopic());
            if (zM43077f && !this.tokenProvider.getPrivateChannel()) {
                throw new ProtocolException("public channel not supported private topic");
            }
            jSONObject.put("type", subscribeRequest.getType());
            jSONObject.put("topic", subscribeRequest.getTopic());
            jSONObject.put("response", true);
            jSONObject.put("privateChannel", zM43077f);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …  }\n\n        }.toString()");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final C43865k<?> m43075d(String message) {
        Object subscribeMessage;
        JSONObject jSONObject = new JSONObject(message);
        String id2 = jSONObject.optString("id");
        String type = jSONObject.optString("type");
        if (Intrinsics.areEqual(type, Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            subscribeMessage = m43074c(TuplesKt.m90091to("code", Integer.valueOf(jSONObject.optInt("code"))));
        } else {
            Intrinsics.checkNotNullExpressionValue(id2, "id");
            String strOptString = jSONObject.optString("userId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(\"userId\")");
            String strOptString2 = jSONObject.optString("topic");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObj.optString(\"topic\")");
            String strOptString3 = jSONObject.optString("subject");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "jsonObj.optString(\"subject\")");
            subscribeMessage = new SubscribeMessage(id2, strOptString, strOptString2, strOptString3, jSONObject.optString("data"), message, System.currentTimeMillis());
        }
        Intrinsics.checkNotNullExpressionValue(id2, "id");
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return new C43865k<>(id2, type, subscribeMessage);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[RETURN] */
    /* JADX INFO: renamed from: f */
    public final boolean m43077f(String topic) {
        for (Object obj : this.privateTopics) {
            if (Pattern.matches(StringsKt.replace$default((String) obj, "%s", ".*", false, 4, (Object) null), topic)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public JSONObject m43074c(@NotNull Pair<String, ? extends Object>... pairArr) {
        return InterfaceC43860f.a.m96631a(this, pairArr);
    }

    /* JADX INFO: renamed from: e */
    public final C43865k<?> m43076e(ByteString message) throws Exception {
        String str;
        String stringUtf8;
        try {
            MessagePayloadProto$MessagePayload from = MessagePayloadProto$MessagePayload.parseFrom(message.toByteArray());
            String id2 = from.getId();
            if (id2 == null) {
                str = "";
            } else {
                str = id2;
            }
            String type = from.getType();
            if (type == null) {
                type = "";
            }
            String userId = from.getUserId();
            if (userId == null) {
                userId = "";
            }
            String topic = from.getTopic();
            if (topic == null) {
                topic = "";
            }
            String subject = from.getSubject();
            if (subject == null) {
                subject = "";
            }
            com.google.protobuf.ByteString data = from.getData();
            if (data != null) {
                stringUtf8 = data.toStringUtf8();
            } else {
                stringUtf8 = null;
            }
            if (stringUtf8 == null) {
                stringUtf8 = "";
            }
            return new C43865k<>(str, type, new SubscribeMessage(str, userId, topic, subject, stringUtf8, from, System.currentTimeMillis()));
        } catch (Exception e11) {
            C44128b.m97262f("SubscribeCodec", "pb_decode_fail: frameSize=" + message.size() + " error=" + e11.getClass().getSimpleName() + " msg=" + e11.getMessage(), e11);
            C38001c.f85602a.m85875a();
            throw e11;
        }
    }
}
