package p531pb;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.chat.entity.ChatHasUnreadRequest;
import com.kubi.chat.entity.ChatHistory;
import com.kubi.chat.entity.ChatHistoryRequest;
import com.kubi.chat.entity.ChatToken;
import com.kubi.chat.entity.UploadImage;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: renamed from: pb.a */
/* JADX INFO: compiled from: ChatApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lpb/a;", "", "Lcom/kubi/chat/entity/ChatHistoryRequest;", ReportDataTable.COLUMN_PARAMS, "Lretrofit2/Call;", "Lcom/kubi/chat/entity/ChatHistory;", "b", "(Lcom/kubi/chat/entity/ChatHistoryRequest;)Lretrofit2/Call;", "Lcom/kubi/chat/entity/ChatHasUnreadRequest;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/chat/entity/ChatHasUnreadRequest;)Lretrofit2/Call;", "Lokhttp3/MultipartBody$Part;", "part", "Lcom/kubi/chat/entity/UploadImage;", "d", "(Lokhttp3/MultipartBody$Part;)Lretrofit2/Call;", "Lcom/kubi/chat/entity/ChatToken;", "c", "()Lretrofit2/Call;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface InterfaceC43429a {
    @POST("payment_mobile_gateway/v1/message/unread")
    @NotNull
    /* JADX INFO: renamed from: a */
    Call<Boolean> m95617a(@Body @NotNull ChatHasUnreadRequest params);

    @POST("payment_mobile_gateway/v1/message/history")
    @NotNull
    /* JADX INFO: renamed from: b */
    Call<ChatHistory> m95618b(@Body @NotNull ChatHistoryRequest params);

    @GET("payment_mobile_gateway/v1/im/inner/login")
    @NotNull
    /* JADX INFO: renamed from: c */
    Call<ChatToken> m95619c();

    @POST("payment_mobile_gateway/v1/im/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: d */
    Call<UploadImage> m95620d(@NotNull @Part MultipartBody.Part part);
}
