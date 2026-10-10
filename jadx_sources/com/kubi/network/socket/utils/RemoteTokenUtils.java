package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.model.DefaultTokenEntity;
import java.util.Map;
import mr.C42597a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: RemoteTokenUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/network/socket/utils/RemoteTokenUtils;", "", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "", "url", "", "fields", "headers", "Lcom/kubi/network/socket/model/DefaultTokenEntity;", "c", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/kubi/network/socket/model/DefaultTokenEntity;", "map", "d", "(Ljava/util/Map;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/OkHttpClient;", "Lcom/kubi/network/socket/utils/e;", "b", "Lkotlin/Lazy;", "()Lcom/kubi/network/socket/utils/e;", "socketApi", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RemoteTokenUtils {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy socketApi;

    public RemoteTokenUtils(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.socketApi = LazyKt.lazy(new Function0<InterfaceC19389e>() { // from class: com.kubi.network.socket.utils.RemoteTokenUtils$socketApi$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            public final InterfaceC19389e invoke() {
                return (InterfaceC19389e) C42597a.m93392h(this.this$0.client).create(InterfaceC19389e.class);
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC19389e m43043b() {
        Object value = this.socketApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-socketApi>(...)");
        return (InterfaceC19389e) value;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DefaultTokenEntity m43044c(@NotNull String url, @NotNull Map<String, String> fields, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return m43043b().m43054a(url, fields, headers);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m43045d(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        StringBuffer stringBuffer = new StringBuffer();
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                stringBuffer.append(Typography.amp + entry.getKey() + '=' + entry.getValue());
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …       }\n    }.toString()");
        return string;
    }
}
