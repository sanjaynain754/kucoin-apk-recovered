package p427ld;

import com.tencent.qcloud.tuicore.TUIConstants;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ld.a */
/* JADX INFO: compiled from: ICallAuctionSocketRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J*\u0010\b\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;", "", "getCallAuctionOrderBookList", "Lokhttp3/Request;", "symbol", "", TUIConstants.TUIContact.LIMIT, "precision", "getOrderBookList", "requestCurrentStage", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42170a {
    @GET("v1/kc/call-auction/level2")
    @NotNull
    /* JADX INFO: renamed from: a */
    Request m92591a(@Nullable @Query("symbol") String str, @NotNull @Query(TUIConstants.TUIContact.LIMIT) String str2, @Nullable @Query("precision") String str3);

    @GET("v1/market/orderbook-level2")
    @NotNull
    /* JADX INFO: renamed from: b */
    Request m92592b(@Nullable @Query("symbol") String str, @NotNull @Query(TUIConstants.TUIContact.LIMIT) String str2, @Nullable @Query("precision") String str3);

    @GET("v1/kc/call-auction/info")
    @NotNull
    /* JADX INFO: renamed from: c */
    Request m92593c(@NotNull @Query("symbol") String str);

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Request m92589d(InterfaceC42170a interfaceC42170a, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBookList");
        }
        if ((i11 & 2) != 0) {
            str2 = "50";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC42170a.m92592b(str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Request m92590e(InterfaceC42170a interfaceC42170a, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallAuctionOrderBookList");
        }
        if ((i11 & 2) != 0) {
            str2 = "50";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC42170a.m92591a(str, str2, str3);
    }
}
