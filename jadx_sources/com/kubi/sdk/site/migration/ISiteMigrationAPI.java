package com.kubi.sdk.site.migration;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.sdk.site.migration.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SiteMigrationAPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/ISiteMigrationAPI;", "", "getStatus", "Lcom/kubi/sdk/site/migration/SiteMigrationStatusResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCanTransfer", "Lcom/kubi/sdk/site/migration/SiteTransferUserResponse;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISiteMigrationAPI {
    @POST("/app/user-dismiss-front/web/siteTransfer/queryTransferStatus")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m58152a(@NotNull Continuation<? super SiteMigrationStatusResponse> continuation);

    @POST("/app/user-dismiss-front/web/siteTransfer/userTransferNotice")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m58153b(@NotNull Continuation<? super SiteTransferUserResponse> continuation);
}
