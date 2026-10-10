package y10;

import com.google.android.gms.common.internal.ImagesContract;
import com.kubi.share.api.entity.PageTextConfigEntity;
import com.kubi.share.api.entity.ShareReferralEntity;
import com.kubi.share.lib.entity.ShareGalleryEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: y10.a */
/* JADX INFO: compiled from: ShareApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\f\u001a\u00020\t2\b\b\u0003\u0010\r\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/share/lib/api/ShareApi;", "", "shareInvitation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/share/api/entity/ShareReferralEntity;", "galleryImgs", "", "Lcom/kubi/share/lib/entity/ShareGalleryEntity;", "type", "", "pageTextConfig", "Lcom/kubi/share/api/entity/PageTextConfigEntity;", "businessLine", "code", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46364a {
    @Headers({"Cache-Time: 10000"})
    @GET("v1/promotion/configCode")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<PageTextConfigEntity> m102251a(@NotNull @Query("businessLine") String str, @NotNull @Query("code") String str2);

    @GET("v1/invitation/posters/list")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<ShareGalleryEntity>> m102252b(@Nullable @Query(ImagesContract.LOCAL) String str);

    @Headers({"Cache-Time: 10000"})
    @GET("v1/promotion/share-to-friends")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<ShareReferralEntity> m102253c();

    /* JADX INFO: renamed from: d */
    static /* synthetic */ InterfaceC41634e m102250d(InterfaceC46364a interfaceC46364a, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pageTextConfig");
        }
        if ((i11 & 1) != 0) {
            str = "toc";
        }
        if ((i11 & 2) != 0) {
            str2 = "SharePosterTxt";
        }
        return interfaceC46364a.m102251a(str, str2);
    }
}
