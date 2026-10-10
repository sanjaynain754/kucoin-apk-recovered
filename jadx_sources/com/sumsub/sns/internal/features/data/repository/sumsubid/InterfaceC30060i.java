package com.sumsub.sns.internal.features.data.repository.sumsubid;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29844B;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29848F;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29851I;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29858d;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29872m;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29875p;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29884y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0005\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH§@¢\u0006\u0004\b\u000f\u0010\fJ\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\b\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0005\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;", "", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;", "email", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/F;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;", TtmlNode.TAG_BODY, "Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;", "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/y;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/d;", "b", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;", "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC30060i {
    @POST("resources/snsId/sdk/profile/auth")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70084a(@Body @NotNull C29844B c29844b, @NotNull Continuation<? super C29848F> continuation);

    @POST("resources/snsId/sdk/profile/reuse")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70085a(@Body @NotNull C29851I c29851i, @NotNull Continuation<? super C29227I> continuation);

    @POST("resources/snsId/sdk/profile/auth/confirm")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70086a(@Body @NotNull C29875p c29875p, @NotNull Continuation<? super C29872m> continuation);

    @POST("resources/snsId/sdk/profile/reuse/preview")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70087a(@NotNull Continuation<? super C29884y> continuation);

    @POST("resources/snsId/sdk/profile/oauthCode")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m70088b(@NotNull Continuation<? super Response<C29858d>> continuation);

    @PUT("resources/snsId/sdk/profile/agreement/accept")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m70089c(@NotNull Continuation<? super Unit> continuation);
}
