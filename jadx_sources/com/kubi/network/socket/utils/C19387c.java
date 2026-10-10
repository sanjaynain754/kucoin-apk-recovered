package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.socketio.C19371b;
import com.kubi.network.socket.socketio.C19373d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.c */
/* JADX INFO: compiled from: DeconstructedPacketUtils.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/network/socket/utils/c;", "", "<init>", "()V", "Lcom/kubi/network/socket/socketio/d;", "packet", "Lcom/kubi/network/socket/socketio/b;", "c", "(Lcom/kubi/network/socket/socketio/d;)Lcom/kubi/network/socket/socketio/b;", "", "", "buffers", "d", "(Lcom/kubi/network/socket/socketio/d;[[B)Lcom/kubi/network/socket/socketio/d;", "data", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;[[B)Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeconstructedPacketUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeconstructedPacketUtils.kt\ncom/kubi/network/socket/utils/DeconstructedPacketUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,122:1\n37#2,2:123\n*S KotlinDebug\n*F\n+ 1 DeconstructedPacketUtils.kt\ncom/kubi/network/socket/utils/DeconstructedPacketUtils\n*L\n27#1:123,2\n*E\n"})
public final class C19387c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19387c f36149a = new C19387c();

    /* JADX INFO: renamed from: a */
    public final Object m43048a(Object data, List<byte[]> buffers) {
        if (data == null) {
            return null;
        }
        if (data instanceof byte[]) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_placeholder", true);
                jSONObject.put("num", buffers.size());
                buffers.add(data);
                return jSONObject;
            } catch (JSONException e11) {
                C44128b.m97263g("An error occured while putting data to JSONObject", e11);
                return null;
            }
        }
        if (data instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            int length = ((JSONArray) data).length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    jSONArray.put(i11, m43048a(((JSONArray) data).get(i11), buffers));
                } catch (JSONException e12) {
                    C44128b.m97263g("An error occured while putting packet data to JSONObject", e12);
                    return null;
                }
            }
            return jSONArray;
        }
        if (!(data instanceof JSONObject)) {
            return data;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = ((JSONObject) data).keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                jSONObject2.put(str, m43048a(((JSONObject) data).get(str), buffers));
            } catch (JSONException e13) {
                C44128b.m97263g("An error occured while putting data to JSONObject", e13);
                return null;
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m43049b(Object data, byte[][] buffers) {
        if (data instanceof JSONArray) {
            int length = ((JSONArray) data).length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    ((JSONArray) data).put(i11, m43049b(((JSONArray) data).get(i11), buffers));
                } catch (JSONException e11) {
                    C44128b.m97263g("An error occured while putting packet data to JSONObject", e11);
                    return null;
                }
            }
            return data;
        }
        if (data instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) data;
            if (jSONObject.optBoolean("_placeholder")) {
                int iOptInt = jSONObject.optInt("num", -1);
                if (iOptInt < 0 || iOptInt >= buffers.length) {
                    return null;
                }
                return buffers[iOptInt];
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                try {
                    ((JSONObject) data).put(str, m43049b(((JSONObject) data).get(str), buffers));
                } catch (JSONException e12) {
                    C44128b.m97263g("An error occured while putting data to JSONObject", e12);
                    return null;
                }
            }
        }
        return data;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C19371b<?> m43050c(@NotNull C19373d<Object> packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        ArrayList arrayList = new ArrayList();
        packet.m43002g(m43048a(packet.m42997b(), arrayList));
        packet.m43001f(Integer.valueOf(arrayList.size()));
        return new C19371b<>(packet, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C19373d<Object> m43051d(@NotNull C19373d<Object> packet, @NotNull byte[][] buffers) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Intrinsics.checkNotNullParameter(buffers, "buffers");
        packet.m43002g(m43049b(packet.m42997b(), buffers));
        packet.m43001f(-1);
        return packet;
    }
}
