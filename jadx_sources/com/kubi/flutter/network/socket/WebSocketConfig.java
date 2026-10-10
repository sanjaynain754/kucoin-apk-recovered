package com.kubi.flutter.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: SocketClientHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/flutter/network/socket/WebSocketConfig;", "", "", "baseUrl", "userId", "", "privateTopics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Companion", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class WebSocketConfig {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String baseUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> privateTopics;

    /* JADX INFO: compiled from: SocketClientHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/flutter/network/socket/WebSocketConfig$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/flutter/network/socket/WebSocketConfig;", "args", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WebSocketConfig create(@Nullable Object args) {
            Map map = args instanceof Map ? (Map) args : null;
            Object obj = map != null ? map.get("baseUrl") : null;
            String strM66669i = C27041f.m66669i(obj instanceof String ? (String) obj : null, "https://appapi-v2.xcoinsystem.com/app/");
            Object obj2 = map != null ? map.get("userId") : null;
            String strM66668h = C27041f.m66668h(obj2 instanceof String ? (String) obj2 : null);
            Object obj3 = map != null ? map.get("privateTopics") : null;
            List arrayList = TypeIntrinsics.isMutableList(obj3) ? (List) obj3 : null;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            return new WebSocketConfig(strM66669i, strM66668h, arrayList);
        }
    }

    public WebSocketConfig(@NotNull String baseUrl, @NotNull String userId, @NotNull List<String> privateTopics) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(privateTopics, "privateTopics");
        this.baseUrl = baseUrl;
        this.userId = userId;
        this.privateTopics = privateTopics;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m23839b() {
        return this.privateTopics;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }
}
