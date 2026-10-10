package com.sumsub.sns.internal.features.data.repository.applicant;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.internal.features.data.model.common.remote.C29350e1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29398k1;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JN\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\f\u0010\rJN\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\f\u0010\u0014J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/applicant/b;", "", "Lokhttp3/MultipartBody$Part;", "image", "Lokhttp3/RequestBody;", "meta", "", "", "headers", "idDocSetType", "Lretrofit2/Response;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/k1;", "b", "(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/e1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "imageId", "", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC29919b {
    @GET("/resources/sdk/applicant/resources/{imageId}?preview=false")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69998a(@Path("imageId") int i11, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/resources/sdk/applicantAction/resources")
    @Nullable
    @Multipart
    /* JADX INFO: renamed from: a */
    Object m69999a(@NotNull @Part MultipartBody.Part part, @NotNull @Part("metadata") RequestBody requestBody, @HeaderMap @NotNull Map<String, String> map, @Nullable @Query("idDocSetType") String str, @NotNull Continuation<? super Response<C29350e1>> continuation);

    @DELETE("/resources/sdk/applicantAction/resources/{resourceId}")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m70000b(@Path("resourceId") int i11, @NotNull Continuation<? super Unit> continuation);

    @POST("/resources/sdk/applicant/resources")
    @Nullable
    @Multipart
    /* JADX INFO: renamed from: b */
    Object m70001b(@NotNull @Part MultipartBody.Part part, @NotNull @Part("metadata") RequestBody requestBody, @HeaderMap @NotNull Map<String, String> map, @Nullable @Query("idDocSetType") String str, @NotNull Continuation<? super Response<C29398k1>> continuation);

    @DELETE("/resources/sdk/applicant/resources/{imageId}")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m70002c(@Path("imageId") int i11, @NotNull Continuation<? super Unit> continuation);
}
