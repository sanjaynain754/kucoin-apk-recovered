package com.kubi.network.socket.engineio;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.engineio.c */
/* JADX INFO: compiled from: EngineIOParser.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000ej\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/c;", "", "<init>", "()V", "Lcom/kubi/network/socket/engineio/b;", "", "b", "Lcom/kubi/network/socket/engineio/b;", "packetError", "", "", "c", "Ljava/util/Map;", "packetTypeValueMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "packetValueTypeMap", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19363c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19363c f36076a = new C19363c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C19362b<String> packetError = new C19362b<>(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "parser error");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Integer> packetTypeValueMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<Integer, String> packetValueTypeMap;

    /* JADX INFO: renamed from: com.kubi.network.socket.engineio.c$a */
    /* JADX INFO: compiled from: EngineIOParser.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/c$a;", "", "<init>", "()V", "data", "Lcom/kubi/network/socket/engineio/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lcom/kubi/network/socket/engineio/b;", "", "c", "(Ljava/lang/String;)Lcom/kubi/network/socket/engineio/b;", "Lokio/ByteString;", "", "b", "(Lokio/ByteString;)Lcom/kubi/network/socket/engineio/b;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f36080a = new a();

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public static final C19362b<String> m42965c(String data) {
            int numericValue;
            try {
                numericValue = Character.getNumericValue(data.charAt(0));
            } catch (IndexOutOfBoundsException unused) {
                numericValue = -1;
            }
            if (numericValue < 0 || numericValue >= C19363c.packetValueTypeMap.size()) {
                return C19363c.packetError;
            }
            String str = (String) C19363c.packetValueTypeMap.get(Integer.valueOf(numericValue));
            if (str == null) {
                return C19363c.packetError;
            }
            if (data.length() <= 1) {
                return new C19362b<>(str, null, 2, null);
            }
            String strSubstring = data.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new C19362b<>(str, strSubstring);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final C19362b<?> m42963a(@NotNull Object data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof String) {
                return m42965c((String) data);
            }
            if (data instanceof ByteString) {
                return m42964b((ByteString) data);
            }
            throw new IllegalStateException("Only String and ByteString data decode is supported");
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static final C19362b<byte[]> m42964b(ByteString data) {
            return new C19362b<>("message", data.toByteArray());
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.socket.engineio.c$b */
    /* JADX INFO: compiled from: EngineIOParser.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/c$b;", "", "<init>", "()V", "Lcom/kubi/network/socket/engineio/b;", "packet", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/socket/engineio/b;)Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f36081a = new b();

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final Object m42966a(@NotNull C19362b<?> packet) {
            Intrinsics.checkNotNullParameter(packet, "packet");
            if (packet.m42958a() instanceof byte[]) {
                return (Serializable) packet.m42958a();
            }
            return String.valueOf(C19363c.packetTypeValueMap.get(packet.getType())) + (packet.m42958a() != null ? String.valueOf(packet.m42958a()) : "");
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, 0);
        map.put("close", 1);
        map.put("ping", 2);
        map.put("pong", 3);
        map.put("message", 4);
        map.put("upgrade", 5);
        map.put("noop", 6);
        packetTypeValueMap = map;
        HashMap<Integer, String> map2 = new HashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        packetValueTypeMap = map2;
    }
}
