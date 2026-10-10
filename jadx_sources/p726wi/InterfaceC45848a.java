package p726wi;

import com.kubi.helpcenter.api.entity.UserLabelEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: wi.a */
/* JADX INFO: compiled from: HelpCenterApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/helpcenter/api/remote/HelpCenterApi;", "", "fetchUserLabel", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/helpcenter/api/entity/UserLabelEntity;", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45848a {
    @GET("v1/user/user-label")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<UserLabelEntity> m101274a();
}
