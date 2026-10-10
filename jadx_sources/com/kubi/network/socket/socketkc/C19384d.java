package com.kubi.network.socket.socketkc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.utils.extensions.C27041f;
import java.util.Map;
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

/* JADX INFO: renamed from: com.kubi.network.socket.socketkc.d */
/* JADX INFO: compiled from: ISocketKCCodec.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/socketkc/d;", "Lqr/f;", "<init>", "()V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Ljava/lang/Object;", "message", "Lqr/k;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lqr/k;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19384d implements InterfaceC43860f {
    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: a */
    public C43865k<?> mo42990a(@NotNull Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message instanceof String ? (String) message : null;
        if (str == null) {
            throw new ClassCastException("仅支持String类型,请自定义消息解析器");
        }
        JSONObject jSONObject = new JSONObject(str);
        String type = jSONObject.optString("type");
        Object objM43041c = Intrinsics.areEqual(type, Constants.IPC_BUNDLE_KEY_SEND_ERROR) ? m43041c(TuplesKt.m90091to("code", Integer.valueOf(jSONObject.optInt("code")))) : jSONObject.optString("data");
        String strM66668h = C27041f.m66668h(jSONObject.optString("id"));
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return new C43865k<>(strM66668h, type, objM43041c);
    }

    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: b */
    public Object mo42991b(@NotNull NetworkRequest request) throws JSONException {
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
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …  }\n\n        }.toString()");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public JSONObject m43041c(@NotNull Pair<String, ? extends Object>... pairArr) {
        return InterfaceC43860f.a.m96631a(this, pairArr);
    }
}
