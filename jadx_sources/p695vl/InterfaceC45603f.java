package p695vl;

import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/* JADX INFO: renamed from: vl.f */
/* JADX INFO: compiled from: UpLoadApi.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H'J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/widget/upload/UpLoadApi;", "", "uploadFile", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "part", "Lokhttp3/MultipartBody$Part;", "loginToken", "kycUpload", "kycType", "", "photoType", "kycSimpleUpload", "uploadAvatar", "LAppWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45603f {
    @POST("v1/file/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<String>> m100686a(@NotNull @Part MultipartBody.Part part, @NotNull @Query("loginToken") String str);

    @POST("v1/apply/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<String>> m100687b(@NotNull @Part MultipartBody.Part part);

    @POST("v2/kyc/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<String>> m100688c(@NotNull @Part MultipartBody.Part part, @Query("kycType") int i11, @Query("photoType") int i12);

    @POST("v1/user/avatar/upload")
    @NotNull
    @Multipart
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<String>> m100689d(@NotNull @Part MultipartBody.Part part);
}
