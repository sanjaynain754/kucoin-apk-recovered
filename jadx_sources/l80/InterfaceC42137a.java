package l80;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.welfare.api.entity.EncourageRecordItemEntity;
import com.kubi.welfare.api.entity.InvitationEntity;
import com.kubi.welfare.api.entity.InviteRecordItemEntity;
import com.kubi.welfare.api.entity.OtherRecordItemEntity;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import com.kubi.welfare.api.entity.WelfareInfoEntity;
import io.reactivex.Observable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: l80.a */
/* JADX INFO: compiled from: WelfareApi.kt */
/* JADX INFO: loaded from: classes58.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J.\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003H'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003H'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'JU\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\bH'¢\u0006\u0002\u0010\u0018J.\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001a0\u00040\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0015H'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/welfare/api/remote/WelfareApi;", "", "getInviteRecord", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;", "page", "", "size", "getEncourageRecord", "Lcom/kubi/welfare/api/entity/EncourageRecordItemEntity;", "welfareInfo", "Lcom/kubi/welfare/api/entity/WelfareInfoEntity;", "drawAllInvitation", "remainAwardNum", "Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "drawAllEncourage", "getOtherRecord", "Lcom/kubi/welfare/api/entity/OtherRecordItemEntity;", "startAt", "", "endAt", "type", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Observable;", "getBizType", "", "fetchInvitationSummary", "Lcom/kubi/welfare/api/entity/InvitationEntity;", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42137a {
    @GET("v1/promotion/not-received-num")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<RemainAwardNumEntity>> m92468a();

    @GET("v1/account/biz-type")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<Map<String, String>>> m92469b(@Nullable @Query("type") String str);

    @POST("v1/encouragement/draw-all")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<Object>> m92470c();

    @GET("v1/promotion/welfare-info")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<WelfareInfoEntity>> m92471d();

    @GET("v1/promotion/invite-record")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BasePageEntity<InviteRecordItemEntity>>> m92472e(@Query("page") int i11, @Query("size") int i12);

    @GET("v1/invitation/summary")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<InvitationEntity>> m92473f();

    @POST("v1/invitation/receive-all")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<Object>> m92474g();

    @GET("v1/promotion/surplus-record")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<BasePageEntity<OtherRecordItemEntity>>> m92475h(@Query("page") int i11, @Query("size") int i12, @Nullable @Query("startAt") String str, @NotNull @Query("endAt") String str2, @Nullable @Query("type") Integer num);

    @GET("v1/promotion/encourage-record")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<BasePageEntity<EncourageRecordItemEntity>>> m92476i(@Query("page") int i11, @Query("size") int i12);
}
