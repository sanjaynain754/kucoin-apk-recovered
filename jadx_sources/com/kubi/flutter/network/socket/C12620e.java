package com.kubi.flutter.network.socket;

import android.app.Application;
import android.content.Context;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.flutter.network.http.C12611a;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.socketio.C19372c;
import com.kubi.network.subscribe.codec.SubscribeSocketKCCodec;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.p110rn.Constants;
import er.C37237b;
import er.InterfaceC37236a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p672ur.C45292b;
import p672ur.C45293c;
import p700vr.C45623a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tr.C45066a;
import tr.C45067b;

/* JADX INFO: renamed from: com.kubi.flutter.network.socket.e */
/* JADX INFO: compiled from: SocketClientHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/flutter/network/socket/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "channelName", "args", "", "m", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V", "Ler/a;", "d", "(Ljava/lang/String;)Ler/a;", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/kubi/flutter/network/socket/WebSocketConfig;", "config", "e", "(Landroid/app/Application;Lcom/kubi/flutter/network/socket/WebSocketConfig;)V", "g", "j", "i", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketClientHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketClientHelper.kt\ncom/kubi/flutter/network/socket/SocketClientHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class C12620e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12620e f22041a = new C12620e();

    @Nullable
    /* JADX INFO: renamed from: d */
    public final InterfaceC37236a m23852d(@NotNull String channelName) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        if (C37237b.m83283f(channelName)) {
            return C37237b.m83282e(channelName);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m23853e(Application application, final WebSocketConfig config) {
        if (C37237b.m83283f("network/channel_default")) {
            return;
        }
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(config.getBaseUrl(), null, null, null, new Function0() { // from class: com.kubi.flutter.network.socket.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12620e.m23849f(config);
            }
        }, 14, null), null, 2, 0 == true ? 1 : 0);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, config.m23839b())).m42890x(new C45292b("push")).m42892z(new C45293c("push")).m42866B(subscribeTokenProvider).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_default", webSocketClientM42867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m23854g(Application application, final WebSocketConfig config) {
        if (C37237b.m83283f("network/channel_futures")) {
            return;
        }
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(config.getBaseUrl(), null, MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING), TuplesKt.m90091to(Constants.BIZ, "kumex")), null, new Function0() { // from class: com.kubi.flutter.network.socket.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12620e.m23850h(config);
            }
        }, 10, null), null, 2, 0 == true ? 1 : 0);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42866B(subscribeTokenProvider).m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, config.m23839b())).m42890x(new C45292b("contract")).m42892z(new C45293c("contract")).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_futures", webSocketClientM42867a);
    }

    /* JADX INFO: renamed from: i */
    public final void m23855i(Application application, WebSocketConfig config) {
        if (C37237b.m83283f("network/channel_message")) {
            return;
        }
        C37237b.m83284g("network/channel_message", new WebSocketClient.C19339a().m42866B(new C45067b(null, new C45066a("v1/chat/token", MapsKt.emptyMap(), MapsKt.emptyMap(), null, 8, null), 1, null)).m42889w("socket_io_protocol").m42888v(new C19372c()).m42890x(new C45292b("platformim")).m42892z(new C45293c("platformim")).m42867a(application));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m23856j(Application application, final WebSocketConfig config) {
        if (C37237b.m83283f("network/channel_wallet")) {
            return;
        }
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(config.getBaseUrl(), null, MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING), TuplesKt.m90091to(Constants.BIZ, "wallet")), null, new Function0() { // from class: com.kubi.flutter.network.socket.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12620e.m23851k(config);
            }
        }, 10, null), null, 2, 0 == true ? 1 : 0);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42866B(subscribeTokenProvider).m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, config.m23839b())).m42890x(new C45292b("wallet")).m42892z(new C45293c("wallet")).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_wallet", webSocketClientM42867a);
    }

    /* JADX INFO: renamed from: m */
    public final void m23858m(@Nullable Context context, @NotNull String channelName, @Nullable Object args) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        C12611a.f22021a.m23825b(args);
        Application application = context instanceof Application ? (Application) context : null;
        if (application == null) {
            return;
        }
        m23857l(application, channelName, args);
    }

    /* JADX INFO: renamed from: f */
    public static final String m23849f(WebSocketConfig webSocketConfig) {
        return webSocketConfig.getUserId();
    }

    /* JADX INFO: renamed from: h */
    public static final String m23850h(WebSocketConfig webSocketConfig) {
        return webSocketConfig.getUserId();
    }

    /* JADX INFO: renamed from: k */
    public static final String m23851k(WebSocketConfig webSocketConfig) {
        return webSocketConfig.getUserId();
    }

    /* JADX INFO: renamed from: l */
    public final void m23857l(Application application, String channelName, Object args) {
        int iHashCode = channelName.hashCode();
        if (iHashCode != -1294821901) {
            if (iHashCode != 163670762) {
                if (iHashCode == 564756662 && channelName.equals("network/channel_wallet")) {
                    m23856j(application, WebSocketConfig.INSTANCE.create(args));
                    return;
                }
            } else if (channelName.equals("network/channel_message")) {
                m23855i(application, WebSocketConfig.INSTANCE.create(args));
                return;
            }
        } else if (channelName.equals("network/channel_futures")) {
            m23854g(application, WebSocketConfig.INSTANCE.create(args));
            return;
        }
        m23853e(application, WebSocketConfig.INSTANCE.create(args));
    }
}
