package com.kubi.abtest;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.abtest.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/abtest/KCABTestApiService;", "", "getKCABTest", "Lcom/kubi/abtest/KCABTest;", RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "", "distinctId", "isLoginId", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ABTest_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KCABTestApiService {
    @GET("v1/ab/assign")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m14641a(@NotNull @Query(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID) String str, @NotNull @Query("distinctId") String str2, @Query("isLoginId") boolean z11, @NotNull @Query("defaultValue") String str3, @NotNull Continuation<? super KCABTest> continuation) throws Exception;
}
