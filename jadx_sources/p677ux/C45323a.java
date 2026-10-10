package p677ux;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.route.config.model.RouteEntry;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p645tx.C45077a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ux.a */
/* JADX INFO: compiled from: RouteQueryTrack.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lux/a;", "", "", "externalUrl", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "Lcom/kubi/route/config/model/RouteEntry;", DbParams.KEY_CHANNEL_RESULT, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/route/config/model/RouteEntry;)V", "c", "d", "Ljava/lang/String;", "", "J", "callStart", "callEnd", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteQueryTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteQueryTrack.kt\ncom/kubi/route/config/utils/RequestTrack\n+ 2 RouteQueryTrack.kt\ncom/kubi/route/config/utils/RouteQueryTrackKt\n+ 3 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n*L\n1#1,53:1\n49#2:54\n49#2:55\n51#2:74\n52#3,5:56\n48#3,13:61\n*S KotlinDebug\n*F\n+ 1 RouteQueryTrack.kt\ncom/kubi/route/config/utils/RequestTrack\n*L\n19#1:54\n23#1:55\n39#1:74\n31#1:56,5\n31#1:61,13\n*E\n"})
public final class C45323a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String externalUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long callEnd;

    public C45323a(@NotNull String externalUrl) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        this.externalUrl = externalUrl;
    }

    /* JADX INFO: renamed from: d */
    public final void m100193d(RouteEntry result) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", result != null);
        jSONObject.put("externalUrl", this.externalUrl);
        jSONObject.put("duration1", Math.max(0L, Math.min(180000L, this.callEnd - this.callStart)));
        if (result != null) {
            jSONObject.put("internalUrl", result.getPath());
        }
        C43852m.m96605q("query_route_config", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m100190a(@Nullable RouteEntry result) {
        this.callEnd = System.currentTimeMillis();
        m100192c(result);
    }

    /* JADX INFO: renamed from: b */
    public final void m100191b() {
        this.callStart = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public final void m100192c(RouteEntry result) {
        try {
            m100193d(result);
        } catch (Throwable th2) {
            C45077a.m99683b(th2, "RequestTrack");
        }
    }
}
