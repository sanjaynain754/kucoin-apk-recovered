package com.sumsub.sns.internal.features.data.repository.analytics;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.analytics.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/analytics/b;", "", "", "sessionId", "Lokhttp3/RequestBody;", "encryptedEventsList", "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC29904b {
    @POST("/resources/tracking/trackEventsComp")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m69948a(@Header("X-Session-Id") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super C29227I> continuation);
}
