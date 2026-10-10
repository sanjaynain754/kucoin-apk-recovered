package m00;

import com.kubi.sdk.site.config.data.SiteTypeEntity;
import com.kubi.sdk.site.info.data.SiteInfoEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: m00.b */
/* JADX INFO: compiled from: SiteInfoApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H§@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/site/info/data/SiteInfoApi;", "", "fetchSiteType", "Lcom/kubi/sdk/site/info/data/BaseEntity;", "Lcom/kubi/sdk/site/info/data/SiteInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSupportSiteConfig", "", "Lcom/kubi/sdk/site/config/data/SiteTypeEntity;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42346b {
    @GET("site-type")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m92917a(@NotNull Continuation<? super C42345a<SiteInfoEntity>> continuation);

    @GET("v1/kucoin-supported-sites")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m92918b(@NotNull Continuation<? super C42345a<List<SiteTypeEntity>>> continuation);
}
