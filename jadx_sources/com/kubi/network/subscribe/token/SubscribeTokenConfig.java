package com.kubi.network.subscribe.token;

import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27041f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubscribeTokenProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;", "", "", "baseUrl", "", "fields", "headers", "wsParams", "Lkotlin/Function0;", "userId", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "b", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "d", "f", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SubscribeTokenConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String baseUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> fields;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> wsParams;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<String> userId;

    public SubscribeTokenConfig(@NotNull String baseUrl, @NotNull Map<String, String> fields, @NotNull Map<String, String> headers, @NotNull Map<String, String> wsParams, @NotNull Function0<String> userId) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(wsParams, "wsParams");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.baseUrl = baseUrl;
        this.fields = fields;
        this.headers = headers;
        this.wsParams = wsParams;
        this.userId = userId;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m43091b() {
        return C27041f.m66668h(this.headers.get(Constants.BIZ));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, String> m43092c() {
        return this.fields;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, String> m43093d() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Function0<String> m43094e() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Map<String, String> m43095f() {
        return this.wsParams;
    }

    public /* synthetic */ SubscribeTokenConfig(String str, Map map, Map map2, Map map3, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "https://appapi-v2.xcoinsystem.com/app/" : str, (i11 & 2) != 0 ? MapsKt.mapOf(TuplesKt.m90091to("encrypt", CredentialEntry.TRUE_STRING), TuplesKt.m90091to("protocol", "websocket"), TuplesKt.m90091to("source", "android")) : map, (i11 & 4) != 0 ? MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING)) : map2, (i11 & 8) != 0 ? MapsKt.mapOf(TuplesKt.m90091to("acceptUserMessage", CredentialEntry.FALSE_STRING)) : map3, (i11 & 16) != 0 ? new Function0<String>() { // from class: com.kubi.network.subscribe.token.SubscribeTokenConfig.1
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "";
            }
        } : function0);
    }
}
