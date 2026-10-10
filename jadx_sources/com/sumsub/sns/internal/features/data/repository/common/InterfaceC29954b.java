package com.sumsub.sns.internal.features.data.repository.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.internal.features.data.model.common.remote.C29277S0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29559i;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29609u;
import com.sumsub.sns.internal.p125ff.model.C33055c;
import com.sumsub.sns.internal.p125ff.model.C33058f;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.common.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J$\u0010\u0003\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0004J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0003\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0004J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0003\u0010\u0017J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H§@¢\u0006\u0004\b\r\u0010\u0004¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/common/b;", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/i;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/u;", "e", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "", "language", "Lcom/sumsub/sns/internal/features/data/model/common/remote/S0;", "(Lcom/sumsub/sns/core/data/model/SNSInitConfig;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "", "Lcom/sumsub/sns/internal/features/data/model/common/remote/i;", "c", "Lcom/sumsub/sns/internal/ff/model/f;", "requestedFlags", "Lcom/sumsub/sns/internal/ff/model/c;", "(Lcom/sumsub/sns/internal/ff/model/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC29954b {
    @POST("/resources/sdkIntegrations/msdkInit")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70026a(@Body @NotNull SNSInitConfig sNSInitConfig, @NotNull @Query("lang") String str, @NotNull Continuation<? super C29277S0> continuation);

    @POST("/resources/featureFlags/msdk")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70027a(@Body @NotNull C33058f c33058f, @NotNull Continuation<? super Map<String, C33055c>> continuation);

    @GET("/resources/msdk/i18n")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70028a(@NotNull @Query("lang") String str, @NotNull Continuation<? super Map<String, ? extends Object>> continuation);

    @GET("/resources/sdk/applicantAction/withIdDocsStatus")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70029a(@NotNull Continuation<? super C29559i> continuation);

    @POST("/resources/sdkIntegrations/msdkReinit")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m70030b(@NotNull @Query("lang") String str, @NotNull Continuation<? super C29277S0> continuation);

    @GET("/resources/sdk/state/restriction")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m70031b(@NotNull Continuation<? super Response<C29586o0>> continuation);

    @GET("/resources/sdkIntegrations/agreements")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m70032c(@NotNull Continuation<? super List<C29380i>> continuation);

    @GET("resources/sdkIntegrations/-/clientIntegrationSettings")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m70033d(@NotNull Continuation<? super Map<String, ? extends Object>> continuation);

    @GET("/resources/sdk/applicant/withIdDocsStatus")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m70034e(@NotNull Continuation<? super C29609u> continuation);
}
