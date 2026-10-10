package com.kubi.network.socket.socketio;

import com.kubi.network.api.model.NetworkRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p570qr.C43865k;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.c */
/* JADX INFO: compiled from: ISocketIOCodec.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/c;", "Lcom/kubi/network/socket/socketio/a;", "<init>", "()V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lcom/kubi/network/socket/socketio/d;", "d", "(Lcom/kubi/network/api/model/NetworkRequest;)Lcom/kubi/network/socket/socketio/d;", "packet", "Lqr/k;", "c", "(Lcom/kubi/network/socket/socketio/d;)Lqr/k;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19372c extends AbstractC19370a {
    @Override // com.kubi.network.socket.socketio.AbstractC19370a
    @NotNull
    /* JADX INFO: renamed from: c */
    public C43865k<?> mo42992c(@NotNull C19373d<?> packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        return new C43865k<>(String.valueOf(packet.getId()), String.valueOf(packet.getType()), packet.m42997b());
    }

    @Override // com.kubi.network.socket.socketio.AbstractC19370a
    @NotNull
    /* JADX INFO: renamed from: d */
    public C19373d<?> mo42993d(@NotNull NetworkRequest request) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        JSONArray jSONArray = new JSONArray();
        Map<String, Object> params = request.getParams();
        if (params == null || (obj = params.get("event")) == null) {
            obj = "message";
        }
        jSONArray.put(obj);
        Map<String, Object> params2 = request.getParams();
        Object obj2 = params2 != null ? params2.get("args") : null;
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray.put(obj2);
        }
        return new C19373d<>(null, null, 2, jSONArray, null, 19, null);
    }
}
