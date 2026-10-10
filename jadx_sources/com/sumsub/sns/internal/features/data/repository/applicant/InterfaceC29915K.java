package com.sumsub.sns.internal.features.data.repository.applicant;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29192B;
import com.sumsub.sns.internal.features.data.model.common.remote.C29212F;
import com.sumsub.sns.internal.features.data.model.common.remote.C29218G0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.model.common.remote.C29248M0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29310Y3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29349e0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import com.sumsub.sns.internal.features.data.model.common.remote.C29429o1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29675y;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29468E0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29515Y;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29550g0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29614v0;
import com.sumsub.sns.internal.features.data.model.esign.C29733E;
import com.sumsub.sns.internal.features.data.model.esign.C29736H;
import com.sumsub.sns.internal.features.data.model.esign.C29742N;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.geo.C29794d;
import com.sumsub.sns.internal.features.data.repository.applicant.data.C29924c;
import com.sumsub.sns.internal.features.data.repository.applicant.data.C29927f;
import com.tencent.qcloud.tuicore.TUIConstants;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0005\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0007\u0010\u000bJ$\u0010\u0007\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0007\u0010\u000fJ$\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u000fJ.\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0015J.\u0010\u0007\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00192\b\b\u0001\u0010\r\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0007\u0010\u001aJ\u001a\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\r\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0012\u0010\u001aJ\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u001bH§@¢\u0006\u0004\b\u0012\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\bJ\u0010\u0010\u001f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020 H§@¢\u0006\u0004\b\u0012\u0010!J\u001a\u0010\u0012\u001a\u00020\"2\b\b\u0001\u0010\r\u001a\u00020\tH§@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0005\u0010\bJ.\u0010\u0012\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020$H§@¢\u0006\u0004\b\u0012\u0010&J.\u0010\u0012\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020(H§@¢\u0006\u0004\b\u0012\u0010)J\u001a\u0010\u001f\u001a\u00020*2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0006J\u0010\u0010,\u001a\u00020+H§@¢\u0006\u0004\b,\u0010\bJ\u001a\u0010\u0012\u001a\u00020/2\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b\u0012\u00100J$\u0010\u0012\u001a\u00020/2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b\u0012\u00101J\u001a\u0010\u0012\u001a\u0002022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J$\u0010\u0012\u001a\u0002022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u000203H§@¢\u0006\u0004\b\u0012\u00105J$\u0010\u0012\u001a\u0002022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u000206H§@¢\u0006\u0004\b\u0012\u00107J$\u0010\u0012\u001a\u0002022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u000208H§@¢\u0006\u0004\b\u0012\u00109J\u001a\u0010\u001e\u001a\u00020;2\b\b\u0001\u0010:\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0006J\u0010\u0010=\u001a\u00020<H§@¢\u0006\u0004\b=\u0010\bJ\u0010\u0010\u0012\u001a\u00020<H§@¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010?\u001a\u00020>H§@¢\u0006\u0004\b\u0007\u0010@J\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010?\u001a\u00020>H§@¢\u0006\u0004\b\u0012\u0010@J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010B\u001a\u00020AH§@¢\u0006\u0004\b\u0007\u0010CJ\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010B\u001a\u00020AH§@¢\u0006\u0004\b\u0012\u0010C¨\u0006D"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/applicant/K;", "", "", "applicantId", "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "applicantAndLanguage", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;", "data", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, "requestCode", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionnaireId", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/g0;", "Lcom/sumsub/sns/internal/features/data/model/common/W2;", "", "(Lcom/sumsub/sns/internal/features/data/model/common/W2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/E0;", "d", "e", "Lcom/sumsub/sns/internal/features/data/model/common/remote/M0;", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/M0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/geo/d;", "idDocSetType", "Lcom/sumsub/sns/internal/features/data/model/common/remote/B;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmationId", "Lcom/sumsub/sns/internal/features/data/model/common/remote/m;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/v0;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/F;", "g", "Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;", "agreements", "Lcom/sumsub/sns/internal/features/data/repository/applicant/data/f;", "(Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/data/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/esign/Y;", "Lcom/sumsub/sns/internal/features/data/model/esign/H;", "request", "(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/H;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/esign/E;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/E;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/esign/N;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/N;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "poaStepSettingId", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/Y;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/y;", "f", "Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;", "applicantDataForm", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;", "info", "(Lcom/sumsub/sns/internal/features/data/model/common/remote/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC29915K {
    @POST("/resources/sdk/questionnaires")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69963a(@Body @NotNull C29069W2 c29069w2, @NotNull Continuation<? super Unit> continuation);

    @POST("/resources/sdk/applicantActions/paymentSource/info")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69964a(@Body @NotNull C29218G0 c29218g0, @NotNull Continuation<? super C29227I> continuation);

    @PUT("/resources/sdk/applicant/proofOfResidence/gps/address")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69965a(@Body @NotNull C29248M0 c29248m0, @NotNull Continuation<Object> continuation);

    @PUT("/resources/sdk/applicantAction/applicantData")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69966a(@Body @NotNull C29310Y3 c29310y3, @NotNull Continuation<? super C29227I> continuation);

    @POST("/resources/sdk/applicant/nfc")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69967a(@Body @NotNull C29349e0 c29349e0, @NotNull Continuation<? super C29227I> continuation);

    @POST("resources/sdk/applicant/agreement")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69968a(@Body @NotNull C29924c c29924c, @NotNull Continuation<? super C29927f> continuation);

    @POST("resources/applicantActions/{actionId}/identifierConfirmation/-/request")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69969a(@Path(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID) @NotNull String str, @Body @NotNull C29429o1 c29429o1, @NotNull Continuation<? super C29570k0> continuation);

    @POST("/resources/applicants/{applicantId}/esign/confirm")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69970a(@Path("applicantId") @NotNull String str, @Body @NotNull C29733E c29733e, @NotNull Continuation<? super C29752Y> continuation);

    @POST("/resources/applicants/{applicantId}/esign/request")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69971a(@Path("applicantId") @NotNull String str, @Body @NotNull C29736H c29736h, @NotNull Continuation<? super C29752Y> continuation);

    @POST("/resources/applicants/{applicantId}/esign/provideData")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69972a(@Path("applicantId") @NotNull String str, @Body @NotNull C29742N c29742n, @NotNull Continuation<? super C29752Y> continuation);

    @POST("resources/applicantActions/{actionId}/agreements")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69973a(@Path(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID) @NotNull String str, @Body @NotNull C29924c c29924c, @NotNull Continuation<? super C29927f> continuation);

    @POST("resources/applicants/{applicantId}/ekyc/submit")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69974a(@Path("applicantId") @NotNull String str, @NotNull @Query("idDocSetType") String str2, @Body @NotNull C29192B c29192b, @NotNull Continuation<? super C29456A0> continuation);

    @POST("resources/applicants/{applicantId}/ekyc/confirm/{confirmationId}")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69975a(@Path("applicantId") @NotNull String str, @Path("confirmationId") @NotNull String str2, @Body @NotNull C29412m c29412m, @NotNull Continuation<? super C29456A0> continuation);

    @POST("resources/applicants/{applicantId}/identifierConfirmation/{verificationId}/verify")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69976a(@Path("applicantId") @NotNull String str, @Path("verificationId") @NotNull String str2, @NotNull @Query("code") String str3, @NotNull Continuation<? super C29570k0> continuation);

    @POST("/resources/applicants/{applicantId}/esign/init")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69977a(@Path("applicantId") @NotNull String str, @NotNull Continuation<? super C29752Y> continuation);

    @GET("/resources/sdk/applicantAction/applicantData")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69978a(@NotNull Continuation<? super C29675y> continuation);

    @POST("/resources/sdk/info/gpsLocation")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69979a(@Body @NotNull RequestBody requestBody, @NotNull Continuation<? super C29794d> continuation);

    @POST("/resources/sdk/applicantAction/questionnaires")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69980b(@Body @NotNull C29069W2 c29069w2, @NotNull Continuation<? super Unit> continuation);

    @POST("/resources/sdk/applicants/paymentSource/info")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69981b(@Body @NotNull C29218G0 c29218g0, @NotNull Continuation<? super C29227I> continuation);

    @PUT("/resources/sdk/applicant/applicantData")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69982b(@Body @NotNull C29310Y3 c29310y3, @NotNull Continuation<? super C29227I> continuation);

    @POST("resources/applicants/{applicantId}/identifierConfirmation/-/request")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69983b(@Path("applicantId") @NotNull String str, @Body @NotNull C29429o1 c29429o1, @NotNull Continuation<? super C29570k0> continuation);

    @POST("resources/applicantActions/{actionId}/identifierConfirmation/{verificationId}/verify")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69984b(@Path(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID) @NotNull String str, @Path("verificationId") @NotNull String str2, @NotNull @Query("code") String str3, @NotNull Continuation<? super C29570k0> continuation);

    @GET("/resources/questionnaires/-;id={questionnaireId}/one")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69985b(@Path("questionnaireId") @NotNull String str, @NotNull Continuation<? super C29550g0> continuation);

    @POST("/resources/sdk/applicantAction/status/pending")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69986b(@NotNull Continuation<? super C29227I> continuation);

    @PATCH("resources/applicantActions")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m69987b(@Body @NotNull RequestBody requestBody, @NotNull Continuation<? super C29227I> continuation);

    @POST("/resources/applicants/{applicantId}/status/pending")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m69988c(@Path("applicantId") @NotNull String str, @NotNull Continuation<? super C29227I> continuation);

    @POST("/resources/applicants/info/location/skip")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m69989c(@NotNull Continuation<? super C29227I> continuation);

    @PATCH("resources/applicants")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m69990c(@Body @NotNull RequestBody requestBody, @NotNull Continuation<? super C29227I> continuation);

    @GET("/resources/sdk/poaStepSettings/{poaStepSettingId}")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m69991d(@Path("poaStepSettingId") @NotNull String str, @NotNull Continuation<? super C29515Y> continuation);

    @POST("/resources/sdk/videoIdent/apply")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m69992d(@NotNull Continuation<? super C29468E0> continuation);

    @POST("resources/applicants/{applicantId}/ekyc/skip")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m69993e(@Path("applicantId") @NotNull String str, @NotNull Continuation<? super C29614v0> continuation);

    @POST("/resources/sdk/videoIdent/confirm")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m69994e(@NotNull Continuation<? super C29227I> continuation);

    @GET("/resources/sdk/applicant/applicantData")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m69995f(@NotNull Continuation<? super C29675y> continuation);

    @GET("resources/sdk/videoIdent/availableLanguages")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m69996g(@NotNull Continuation<? super C29212F> continuation);
}
