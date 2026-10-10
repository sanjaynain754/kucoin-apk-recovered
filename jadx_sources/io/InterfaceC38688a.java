package io;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.loan.entity.LeverBorrowPayed;
import com.kubi.loan.entity.LeverBorrowPaying;
import com.kubi.loan.repo.trade.model.LeverManualBorrow;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import io.reactivex.Observable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: io.a */
/* JADX INFO: compiled from: LoanApi.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\bH'J<\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH'J>\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH'J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH'J&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\bH'J:\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/loan/api/LoanApi;", "", "getBorrowPayed", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/loan/entity/LeverBorrowPayed;", FirebaseAnalytics.Param.CURRENCY, "", "page", "", "size", "getBorrowPaying", "Lcom/kubi/loan/entity/LeverBorrowPaying;", "repay", "loanId", "isolatedBorrow", "Lcom/kubi/loan/repo/trade/model/LeverManualBorrow;", "symbol", "borrowStrategy", "isolateRepay", "fetchReferRate", "Ljava/math/BigDecimal;", "amount", "getIsolatePaying", "getIsolatePayed", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38688a {
    @GET("v1/margin/loan/order/query-refer-rate")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<BigDecimal>> m87467a(@Nullable @Query("amount") String str, @Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str2);

    @GET("v1/borrow/loan/payedoff")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<BasePageEntity<LeverBorrowPayed>>> m87468b(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Query("page") int i11, @Query("size") int i12);

    @GET("v1/margin/isolated/borrow/trade/paid-up")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<BasePageEntity<LeverBorrowPayed>>> m87469c(@Nullable @Query("symbol") String str, @Query("page") int i11, @Query("size") int i12);

    @FormUrlEncoded
    @POST("v1/margin/isolated/borrow/repay")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<Object>> m87470d(@Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @Field("size") @NotNull String str2, @Field("loanId") @Nullable String str3, @Field("symbol") @NotNull String str4);

    @FormUrlEncoded
    @POST("v1/margin/isolated/borrow/loan")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<LeverManualBorrow>> m87471e(@Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @Field("size") @NotNull String str2, @Field("symbol") @NotNull String str3, @Field("borrowStrategy") @NotNull String str4);

    @GET("v1/borrow/loan/repaying")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<BasePageEntity<LeverBorrowPaying>>> m87472f(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @FormUrlEncoded
    @POST("v1/borrow/repay")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<Object>> m87473h(@Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @Field("size") @NotNull String str2, @Field("loanId") @Nullable String str3);

    @GET("v1/margin/isolated/borrow/trade/repaying")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<BasePageEntity<LeverBorrowPaying>>> m87474i(@Nullable @Query("symbol") String str);

    /* JADX INFO: renamed from: g */
    static /* synthetic */ Observable m87466g(InterfaceC38688a interfaceC38688a, String str, String str2, String str3, String str4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isolatedBorrow");
        }
        if ((i11 & 8) != 0) {
            str4 = AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC;
        }
        return interfaceC38688a.m87471e(str, str2, str3, str4);
    }
}
