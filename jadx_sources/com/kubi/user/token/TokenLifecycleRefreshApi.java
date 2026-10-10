package com.kubi.user.token;

import com.kubi.kucoin.token.TokenLifecycleRefreshTag;
import com.kubi.user.model.LoginUserEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Tag;

/* JADX INFO: renamed from: com.kubi.user.token.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecycleRefreshApi.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshApi;", "", "refreshToken", "Lcom/kubi/user/model/LoginUserEntity;", "refreshTag", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshTag;", "attributionToken", "", "(Lcom/kubi/kucoin/token/TokenLifecycleRefreshTag;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TokenLifecycleRefreshApi {
    @Nullable
    @FormUrlEncoded
    @Headers({"noNeedToken: true"})
    @POST("v1/auth/refresh-token")
    /* JADX INFO: renamed from: a */
    Object m65876a(@Tag @NotNull TokenLifecycleRefreshTag tokenLifecycleRefreshTag, @Header("X-KC-TOKEN-LIFECYCLE-ATTRIBUTION") @NotNull String str, @Field("refreshToken") @NotNull String str2, @NotNull Continuation<? super LoginUserEntity> continuation);
}
