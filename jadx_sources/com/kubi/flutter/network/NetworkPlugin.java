package com.kubi.flutter.network;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.network.channel.InterfaceC12605c;
import com.kubi.flutter.network.channel.NetworkChannel;
import com.kubi.flutter.network.http.HttpExternalClient;
import com.kubi.flutter.network.http.HttpInternalClient;
import com.kubi.flutter.network.socket.C12627l;
import com.kubi.flutter.network.socket.SocketIOClient;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p263fg.C37454c;
import p263fg.C37456e;
import p263fg.C37459h;
import p263fg.C37461j;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkPlugin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/flutter/network/NetworkPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "b", "Lcom/kubi/flutter/network/channel/NetworkChannel;", AppsFlyerProperties.CHANNEL, "", "Lcom/kubi/flutter/network/channel/c;", "c", "Ljava/util/List;", "clients", "d", "Companion", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkPlugin.kt\ncom/kubi/flutter/network/NetworkPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1863#2,2:61\n1863#2,2:63\n*S KotlinDebug\n*F\n+ 1 NetworkPlugin.kt\ncom/kubi/flutter/network/NetworkPlugin\n*L\n40#1:61,2\n45#1:63,2\n*E\n"})
public final class NetworkPlugin implements FlutterPlugin {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC12605c> clients;

    /* JADX INFO: compiled from: NetworkPlugin.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/network/NetworkPlugin$Companion;", "", "<init>", "()V", "registerWith", "", "engine", "Lio/flutter/embedding/engine/FlutterEngine;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void registerWith(@NotNull FlutterEngine engine) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            engine.getPlugins().add(new NetworkPlugin());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m23802b(binding);
        Iterator<T> it = this.clients.iterator();
        while (it.hasNext()) {
            ((InterfaceC12605c) it.next()).onAttachedToEngine(binding);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m23803c(binding);
        Iterator<T> it = this.clients.iterator();
        while (it.hasNext()) {
            ((InterfaceC12605c) it.next()).onDetachedFromEngine(binding);
        }
    }

    public NetworkPlugin() {
        NetworkChannel networkChannel = new NetworkChannel();
        this.channel = networkChannel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpInternalClient("network/channel_http_internal", new C37456e(), networkChannel));
        arrayList.add(new HttpExternalClient("network/channel_http_external", new C37454c(), networkChannel));
        arrayList.add(new C12627l("network/channel_default", new C37461j(), networkChannel));
        arrayList.add(new C12627l("network/channel_futures", new C37461j(), networkChannel));
        arrayList.add(new C12627l("network/channel_wallet", new C37461j(), networkChannel));
        arrayList.add(new SocketIOClient("network/channel_message", new C37459h(), networkChannel));
        this.clients = arrayList;
    }
}
