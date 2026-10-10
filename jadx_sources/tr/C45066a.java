package tr;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tr.a */
/* JADX INFO: compiled from: DefaultTokenProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Ltr/a;", "", "", "url", "", "fields", "headers", "wsParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45066a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> fields;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> wsParams;

    public C45066a(@NotNull String url, @NotNull Map<String, String> fields, @NotNull Map<String, String> headers, @NotNull Map<String, String> wsParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(wsParams, "wsParams");
        this.url = url;
        this.fields = fields;
        this.headers = headers;
        this.wsParams = wsParams;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m99658a() {
        return this.fields;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m99659b() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, String> m99661d() {
        return this.wsParams;
    }

    public /* synthetic */ C45066a(String str, Map map, Map map2, Map map3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? MapsKt.emptyMap() : map, (i11 & 4) != 0 ? MapsKt.emptyMap() : map2, (i11 & 8) != 0 ? MapsKt.mapOf(TuplesKt.m90091to("EIO", "4"), TuplesKt.m90091to("source", "android"), TuplesKt.m90091to(NotificationCompat.CATEGORY_TRANSPORT, "websocket")) : map3);
    }
}
