package p689vb;

import com.kubi.clean.api.entity.IPLimitConfig;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: vb.a */
/* JADX INFO: compiled from: IAutoCleanApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/clean/api/IAutoCleanApi;", "", "getIPLimitConfig", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "bizType", DropFrameTable.COLUMN_SCENE, "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45486a {
    @GET("v1/dismiss/ip-notice")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Map<String, IPLimitConfig>> m100450a(@Nullable @Query("bizType") String str, @Nullable @Query(DropFrameTable.COLUMN_SCENE) String str2);
}
