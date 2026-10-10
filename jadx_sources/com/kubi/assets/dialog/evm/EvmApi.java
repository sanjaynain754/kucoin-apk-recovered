package com.kubi.assets.dialog.evm;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.EvmChainEntity;
import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import com.kubi.assets.entity.ReqEvmRepeatEntity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.assets.dialog.evm.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EvmApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmApi;", "", "queryEvmChainList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EvmChainEntity;", FirebaseAnalytics.Param.CURRENCY, "", "getEvmRepeatAddressList", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "param", "Lcom/kubi/assets/entity/ReqEvmRepeatEntity;", "deleteEvmRepeatAddress", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface EvmApi {
    @POST("payment/withdraw/address/evm/repeat")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<EvmRepeatAddressResponseEntity>> m16289a(@Body @NotNull ReqEvmRepeatEntity reqEvmRepeatEntity);

    @POST("payment/withdraw/address/evm/repeat/del")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Boolean> m16290b(@Body @NotNull ReqEvmRepeatEntity reqEvmRepeatEntity);

    @GET("payment/evm/chain")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<ArrayList<EvmChainEntity>> m16291d(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC41634e m16288c(EvmApi evmApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryEvmChainList");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return evmApi.m16291d(str);
    }
}
