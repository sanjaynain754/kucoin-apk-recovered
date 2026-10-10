package com.kubi.flutter.security;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.flutter.security.channel.C12740a;
import com.kubi.flutter.security.channel.SecurityChannel;
import com.kubi.flutter.security.channel.SecurityClient;
import com.kubi.flutter.security.keychain.KeyChainClient;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.C41030a;
import org.jetbrains.annotations.NotNull;
import p369jg.C40402a;
import p430lg.C42188a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SecurityPlugin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/flutter/security/SecurityPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lcom/kubi/flutter/security/channel/SecurityChannel;", "b", "Lcom/kubi/flutter/security/channel/SecurityChannel;", AppsFlyerProperties.CHANNEL, "", "Lcom/kubi/flutter/security/channel/SecurityClient;", "c", "Ljava/util/List;", "clients", "d", "Companion", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSecurityPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityPlugin.kt\ncom/kubi/flutter/security/SecurityPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1863#2,2:47\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 SecurityPlugin.kt\ncom/kubi/flutter/security/SecurityPlugin\n*L\n31#1:47,2\n36#1:49,2\n*E\n"})
public final class SecurityPlugin implements FlutterPlugin {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SecurityChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<SecurityClient> clients;

    /* JADX INFO: compiled from: SecurityPlugin.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/security/SecurityPlugin$Companion;", "", "<init>", "()V", "registerWith", "", "engine", "Lio/flutter/embedding/engine/FlutterEngine;", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void registerWith(@NotNull FlutterEngine engine) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            engine.getPlugins().add(new SecurityPlugin());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m24066b(binding);
        Iterator<T> it = this.clients.iterator();
        while (it.hasNext()) {
            ((SecurityClient) it.next()).m24071c(binding);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.channel.m24067c(binding);
        Iterator<T> it = this.clients.iterator();
        while (it.hasNext()) {
            ((SecurityClient) it.next()).m24072d(binding);
        }
    }

    public SecurityPlugin() {
        SecurityChannel securityChannel = new SecurityChannel();
        this.channel = securityChannel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyChainClient(new C12740a("keychain", securityChannel)));
        arrayList.add(new C42188a(new C12740a("cipher", securityChannel)));
        arrayList.add(new C41030a(new C12740a("biometric", securityChannel)));
        arrayList.add(new C40402a(new C12740a("app_info", securityChannel)));
        this.clients = arrayList;
    }
}
