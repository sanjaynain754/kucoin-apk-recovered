package er;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: er.b */
/* JADX INFO: compiled from: KCWebSocketClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0011R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0015j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Ler/b;", "", "<init>", "()V", "", "type", "Ler/a;", "client", "", "g", "(Ljava/lang/String;Ler/a;)V", "", "f", "(Ljava/lang/String;)Z", "e", "(Ljava/lang/String;)Ler/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ler/a;", "b", "d", "c", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sClientMap", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37237b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37237b f82567a = new C37237b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, InterfaceC37236a> sClientMap = new HashMap<>();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC37236a m83278a() throws RuntimeException {
        return m83282e("network/channel_default");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC37236a m83279b() throws RuntimeException {
        return m83282e("network/channel_futures");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC37236a m83280c() throws RuntimeException {
        return m83282e("network/channel_message");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC37236a m83281d() throws RuntimeException {
        return m83282e("network/channel_wallet");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC37236a m83282e(@NotNull String type) throws RuntimeException {
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC37236a interfaceC37236a = sClientMap.get(type);
        if (interfaceC37236a != null) {
            return interfaceC37236a;
        }
        throw new RuntimeException("WebSocketClient[" + type + "] not initialized");
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m83283f(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return sClientMap.containsKey(type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m83284g(@NotNull String type, @NotNull InterfaceC37236a client) throws RuntimeException {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(client, "client");
        HashMap<String, InterfaceC37236a> map = sClientMap;
        if (!map.containsKey(type)) {
            map.put(type, client);
            return;
        }
        throw new RuntimeException("WebSocketClient[" + type + "] is initialized");
    }
}
