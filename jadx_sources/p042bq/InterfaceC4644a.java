package p042bq;

import com.kubi.mart.entity.SidebarDataEntity;
import com.kubi.mart.entity.SidebarDataItemEntity;
import com.kubi.mart.entity.SidebarMenuEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: bq.a */
/* JADX INFO: compiled from: MartApi.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH'J8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00072\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH'J \u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mart/api/MartApi;", "", "spotSidebarMenuTrade", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/mart/entity/SidebarMenuEntity;", "spotSidebarMenuKLine", "dynamicMenuKeyword", "", "spotSidebarFavorite", "Lcom/kubi/mart/entity/SidebarDataEntity;", "category", "pageNum", "", "pageSize", "spotSidebarTabList", "concept", "spotSidebarSearch", "", "Lcom/kubi/mart/entity/SidebarDataItemEntity;", "keyWord", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4644a {
    @GET("discover-new/side_bar/crypto_nav/flat_spot/menu/app")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SidebarMenuEntity> m4587a(@NotNull @Query("dynamicMenuKeyword") String str);

    @GET("discover-new/side_bar/trading_area/flat_spot/menu/app")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<SidebarMenuEntity> m4588b();

    @GET("discover-new/side_bar/menu_item/search/spot")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<SidebarDataItemEntity>> m4589c(@NotNull @Query("searchKeyword") String str);

    @GET("discover-new/side_bar/favorite/menu_item")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<SidebarDataEntity> m4590d(@NotNull @Query("l1Keyword") String str, @Query("pageNum") int i11, @Query("pageSize") int i12);

    @GET("discover-new/side_bar/flat_spot/menu_item")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<SidebarDataEntity> m4591e(@NotNull @Query("l1Keyword") String str, @Nullable @Query("dynamicMenuKeyword") String str2, @Query("pageNum") int i11, @Query("pageSize") int i12);
}
