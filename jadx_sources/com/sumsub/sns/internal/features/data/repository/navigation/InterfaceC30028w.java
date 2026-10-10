package com.sumsub.sns.internal.features.data.repository.navigation;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/repository/navigation/w;", "", "", "full", "Lcom/sumsub/sns/internal/features/data/repository/navigation/z;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/features/data/repository/navigation/r;", TtmlNode.TAG_BODY, "b", "(Lcom/sumsub/sns/internal/features/data/repository/navigation/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC30028w {
    @POST("/resources/sdk/back")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70071a(@Body @NotNull C30023r c30023r, @NotNull Continuation<? super C30031z> continuation);

    @GET("/resources/sdk/state")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m70072a(@Query("full") boolean z11, @NotNull Continuation<? super C30031z> continuation);

    @POST("/resources/sdk/next")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m70073b(@Body @NotNull C30023r c30023r, @NotNull Continuation<? super C30031z> continuation);
}
