package p319hq;

import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import com.kubi.mine.lib.entity.UserCommitAuditRequest;
import com.kubi.mine.lib.entity.UserCommitAuditResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: hq.d */
/* JADX INFO: compiled from: UserInfoApi.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/lib/api/UserInfoApi;", "", "queryAudit", "Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commitAudit", "Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;", "userCommitAuditRequest", "Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;", "(Lcom/kubi/mine/lib/entity/UserCommitAuditRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38287d {
    @POST("v1/user/profile/commit-audit")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m86418a(@Body @NotNull UserCommitAuditRequest userCommitAuditRequest, @NotNull Continuation<? super UserCommitAuditResponse> continuation) throws Exception;

    @POST("v1/user/profile/query-audit")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m86419b(@NotNull Continuation<? super QueryAuditInfoResponse> continuation) throws Exception;
}
