package com.kubi.operation.lib.api;

import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.operation.lib.api.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IGuidanceApi.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/operation/lib/api/IGuidanceApi;", "", "newcomerUserTask", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IGuidanceApi {
    @GET("/app/v2/kcop/newcomer/user-task/info2")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m43283a(@NotNull Continuation<? super WelfareTaskInfoEntity> continuation) throws Exception;
}
