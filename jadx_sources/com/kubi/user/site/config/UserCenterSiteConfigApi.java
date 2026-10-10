package com.kubi.user.site.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.user.site.config.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UserCenterSiteConfigApi.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/user/site/config/UserCenterSiteConfigApi;", "", "fetchUserCenterSiteConfig", "Lcom/kubi/user/site/config/UserCenterSiteConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface UserCenterSiteConfigApi {
    @GET("v1/site-config")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m65777a(@NotNull Continuation<? super UserCenterSiteConfig> continuation) throws Exception;
}
