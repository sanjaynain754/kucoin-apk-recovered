package com.kubi.network.websocket.model;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/network/websocket/model/Request;", "", "", "Lcom/kubi/network/websocket/model/SocketRequest;", "socketRequest", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "heartbeatRequest", "<init>", "(Ljava/util/List;Lcom/kubi/network/websocket/model/HeartbeatRequest;)V", "Ljava/util/List;", "getSocketRequest", "()Ljava/util/List;", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "getHeartbeatRequest", "()Lcom/kubi/network/websocket/model/HeartbeatRequest;", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Request {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final HeartbeatRequest heartbeatRequest;

    @NotNull
    private final List<SocketRequest> socketRequest;

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\"\u00020\u0006¢\u0006\u0002\u0010\rJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\"\u00020\u0006¢\u0006\u0002\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\"\u00020\u0006¢\u0006\u0002\u0010\rJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\n\"\u00020\u0006¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/network/websocket/model/Request$Companion;", "", "()V", "create", "Lcom/kubi/network/websocket/model/Request;", "type", "", "request", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "topic", "", "(Ljava/lang/String;Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;", "subscribe", "(Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;", "Lokhttp3/Request;", "(Lokhttp3/Request;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;", "unsubscribe", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/kubi/network/websocket/model/Request$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n1#2:155\n13579#3,2:156\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/kubi/network/websocket/model/Request$Companion\n*L\n75#1:156,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Request subscribe(@NotNull okhttp3.Request request, @NotNull String... topic) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(topic, "topic");
            return create("subscribe", new HeartbeatRequest("subscribe", request, false, false, 0, 0, 60, null), topic);
        }

        @NotNull
        public final Request unsubscribe(@NotNull okhttp3.Request request, @NotNull String... topic) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(topic, "topic");
            return create("unsubscribe", new HeartbeatRequest("unsubscribe", request, false, false, 0, 0, 60, null), topic);
        }

        public Companion() {
        }

        public static /* synthetic */ Request create$default(Companion companion, String str, HeartbeatRequest heartbeatRequest, String[] strArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "subscribe";
            }
            return companion.create(str, heartbeatRequest, strArr);
        }

        @NotNull
        public final Request create(@NotNull String type, @Nullable HeartbeatRequest request, @NotNull String[] topic) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(topic, "topic");
            C19399a c19399a = new C19399a();
            if (request != null) {
                c19399a.m43116c(request);
            }
            for (String str : topic) {
                c19399a.m43114a(new SocketRequest(null, type, str, false, 9, null));
            }
            return c19399a.m43115b();
        }

        @NotNull
        public final Request subscribe(@NotNull HeartbeatRequest request, @NotNull String... topic) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(topic, "topic");
            return create("subscribe", request, topic);
        }

        @NotNull
        public final Request unsubscribe(@NotNull HeartbeatRequest request, @NotNull String... topic) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(topic, "topic");
            return create("unsubscribe", request, topic);
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.websocket.model.Request$a */
    /* JADX INFO: compiled from: Request.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/network/websocket/model/Request$a;", "", "<init>", "()V", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "request", "c", "(Lcom/kubi/network/websocket/model/HeartbeatRequest;)Lcom/kubi/network/websocket/model/Request$a;", "Lcom/kubi/network/websocket/model/SocketRequest;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/websocket/model/SocketRequest;)Lcom/kubi/network/websocket/model/Request$a;", "Lcom/kubi/network/websocket/model/Request;", "b", "()Lcom/kubi/network/websocket/model/Request;", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "heartbeatRequest", "", "Ljava/util/List;", "socketRequest", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19399a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public HeartbeatRequest heartbeatRequest;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<SocketRequest> socketRequest = new ArrayList();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C19399a m43114a(@NotNull SocketRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.socketRequest.add(request);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Request m43115b() {
            return new Request(this.socketRequest, this.heartbeatRequest);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C19399a m43116c(@NotNull HeartbeatRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.heartbeatRequest = request;
            return this;
        }
    }

    public Request(@NotNull List<SocketRequest> socketRequest, @Nullable HeartbeatRequest heartbeatRequest) {
        Intrinsics.checkNotNullParameter(socketRequest, "socketRequest");
        this.socketRequest = socketRequest;
        this.heartbeatRequest = heartbeatRequest;
    }

    @Nullable
    public final HeartbeatRequest getHeartbeatRequest() {
        return this.heartbeatRequest;
    }

    @NotNull
    public final List<SocketRequest> getSocketRequest() {
        return this.socketRequest;
    }

    public /* synthetic */ Request(List list, HeartbeatRequest heartbeatRequest, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : heartbeatRequest);
    }
}
