package p697vo;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.log.upload.LogResponse;
import java.util.Map;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: renamed from: vo.a */
/* JADX INFO: compiled from: ILogUpload.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lvo/a;", "", "", "", "headers", "Lokhttp3/RequestBody;", "fileId", "Lretrofit2/Call;", "Lcom/kubi/log/upload/LogResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;Lokhttp3/RequestBody;)Lretrofit2/Call;", "Logger-Uploader_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC45609a {
    @NotNull
    @Headers({"HEADER_FINGER_EVENT:ku_mobilelog"})
    @POST("/app/v1/mobilelog/fileidup")
    @Multipart
    /* JADX INFO: renamed from: a */
    Call<LogResponse> m100693a(@HeaderMap @NotNull Map<String, String> headers, @NotNull @Part("fileId") RequestBody fileId);
}
