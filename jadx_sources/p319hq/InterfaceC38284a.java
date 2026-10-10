package p319hq;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.mine.lib.entity.AppUpgradeEntity;
import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: hq.a */
/* JADX INFO: compiled from: AppUpgradeApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bH'J\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mine/lib/api/AppUpgradeApi;", "", "getUpgradeInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/mine/lib/entity/AppUpgradeEntity;", "type", "", "notifiedAppVersion", "notifiedCount", "", "notifiedDate", "", "getUpgradeInfoV2", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", AppsFlyerProperties.CHANNEL, "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38284a {
    @GET("v1/app-version/upgrade/notice")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<AppUpgradeEntity> m86404a(@NotNull @Query("type") String str, @Nullable @Query("notifiedAppVersion") String str2, @Query("notifiedCount") int i11, @Query("notifiedDate") long j11);

    @GET("v1/app-version/upgrade/popup")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<AppUpgradeEntityV2> m86405c(@Nullable @Query(AppsFlyerProperties.CHANNEL) String str);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC41634e m86403b(InterfaceC38284a interfaceC38284a, String str, String str2, int i11, long j11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpgradeInfo");
        }
        if ((i12 & 1) != 0) {
            str = "CHECK";
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            j11 = 0;
        }
        int i13 = i11;
        return interfaceC38284a.m86404a(str, str2, i13, j11);
    }
}
