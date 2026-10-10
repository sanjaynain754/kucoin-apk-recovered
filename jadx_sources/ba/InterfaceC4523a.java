package ba;

import com.kubi.p072ad.api.entity.ResAdEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: compiled from: AdApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/ad/api/AdApi;", "", "resourceAdvertising", "Lkotlinx/coroutines/flow/Flow;", "", "", "", "Lcom/kubi/ad/api/entity/ResAdEntity;", "code", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4523a {
    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Map<String, List<ResAdEntity>>> m4364a(@NotNull @Query("code") String str);
}
