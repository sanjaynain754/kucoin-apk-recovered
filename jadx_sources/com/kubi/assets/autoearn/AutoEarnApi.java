package com.kubi.assets.autoearn;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.autoearn.data.AutoEarnOpenRequest;
import com.kubi.assets.autoearn.data.AutoEarnOpenResp;
import com.kubi.assets.autoearn.data.AutoEarnStateResp;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.assets.autoearn.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AutoEarnApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\u0004\u0018\u00010\u00032$\b\u0003\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bH§@¢\u0006\u0002\u0010\fJ6\u0010\r\u001a\u0004\u0018\u00010\u00032$\b\u0003\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bH§@¢\u0006\u0002\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnApi;", "", "switchAutoEarnCurrencyState", "Lcom/kubi/assets/autoearn/data/AutoEarnOpenResp;", "autoEarnOpenRequest", "Lcom/kubi/assets/autoearn/data/AutoEarnOpenRequest;", "(Lcom/kubi/assets/autoearn/data/AutoEarnOpenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchAutoEarnAllOpen", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchAutoEarnAllClose", "getAutoEarnState", "Lcom/kubi/assets/autoearn/data/AutoEarnStateResp;", FirebaseAnalytics.Param.CURRENCY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AutoEarnApi {
    @GET("v1/earn/app/user-auto-lock")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m15433a(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull Continuation<? super AutoEarnStateResp> continuation);

    @POST("v1/earn/app/products/auto-lock")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m15434c(@Body @NotNull HashMap<String, String> map, @NotNull Continuation<? super AutoEarnOpenResp> continuation);

    @POST("v1/earn/app/products/auto-lock")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m15435d(@Body @NotNull AutoEarnOpenRequest autoEarnOpenRequest, @NotNull Continuation<? super AutoEarnOpenResp> continuation);

    @POST("v1/earn/app/products/auto-lock")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m15436f(@Body @NotNull HashMap<String, String> map, @NotNull Continuation<? super AutoEarnOpenResp> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m15430b(AutoEarnApi autoEarnApi, HashMap map, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchAutoEarnAllOpen");
        }
        if ((i11 & 1) != 0) {
            map = MapsKt.hashMapOf(TuplesKt.m90091to("is_all_open", "1"));
        }
        return autoEarnApi.m15434c(map, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m15431e(AutoEarnApi autoEarnApi, HashMap map, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchAutoEarnAllClose");
        }
        if ((i11 & 1) != 0) {
            map = MapsKt.hashMapOf(TuplesKt.m90091to("is_all_close", "0"));
        }
        return autoEarnApi.m15436f(map, continuation);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ Object m15432g(AutoEarnApi autoEarnApi, String str, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAutoEarnState");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        return autoEarnApi.m15433a(str, continuation);
    }
}
