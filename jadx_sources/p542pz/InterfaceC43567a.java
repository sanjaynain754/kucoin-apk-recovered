package p542pz;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.log.realtime.network.LogResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* JADX INFO: renamed from: pz.a */
/* JADX INFO: compiled from: RealTimeLogApi.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J9\u0010\b\u001a\u00020\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lpz/a;", "", "", "", "headers", "logs", "encoding", "Lcom/kubi/sdk/log/realtime/network/LogResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/log/realtime/network/LogResponse;", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC43567a {

    /* JADX INFO: renamed from: pz.a$a */
    /* JADX INFO: compiled from: RealTimeLogApi.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ LogResponse m95843a(InterfaceC43567a interfaceC43567a, Map map, String str, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportLog");
            }
            if ((i11 & 4) != 0) {
                str2 = "base64";
            }
            return interfaceC43567a.m95842a(map, str, str2);
        }
    }

    @FormUrlEncoded
    @POST("/app/v1/slicelogs/up")
    @NotNull
    /* JADX INFO: renamed from: a */
    LogResponse m95842a(@HeaderMap @NotNull Map<String, String> headers, @Field("logs") @NotNull String logs, @Field("encoding") @NotNull String encoding);
}
