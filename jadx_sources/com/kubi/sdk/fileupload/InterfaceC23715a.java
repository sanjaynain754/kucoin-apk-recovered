package com.kubi.sdk.fileupload;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: renamed from: com.kubi.sdk.fileupload.a */
/* JADX INFO: compiled from: UploadApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/a;", "", "", Constants.BIZ, "fileName", "uploadType", "Lretrofit2/Call;", "Lcom/kubi/sdk/fileupload/TokenResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "Lokhttp3/MultipartBody$Part;", "file", "Lokhttp3/RequestBody;", InterfaceC33826o0.f71244p, "Lcom/kubi/sdk/fileupload/UploadResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;)Lretrofit2/Call;", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC23715a {

    /* JADX INFO: renamed from: com.kubi.sdk.fileupload.a$a */
    /* JADX INFO: compiled from: UploadApi.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Call m56651a(InterfaceC23715a interfaceC23715a, String str, String str2, String str3, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateToken");
            }
            if ((i11 & 4) != 0) {
                str3 = "0";
            }
            return interfaceC23715a.m56650b(str, str2, str3);
        }
    }

    @POST("/app/v1/files/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: a */
    Call<UploadResponse> m56649a(@NotNull @Part MultipartBody.Part file, @NotNull @Part(InterfaceC33826o0.f71244p) RequestBody token);

    @FormUrlEncoded
    @POST("/app/v1/files/generate-token")
    @NotNull
    /* JADX INFO: renamed from: b */
    Call<TokenResponse> m56650b(@Field(Constants.BIZ) @NotNull String biz, @Field("fileName") @NotNull String fileName, @Field("uploadType") @NotNull String uploadType);
}
