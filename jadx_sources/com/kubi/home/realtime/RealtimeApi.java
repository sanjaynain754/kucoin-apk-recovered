package com.kubi.home.realtime;

import com.kubi.home.realtime.model.SymbolInfo;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.home.realtime.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RealtimeApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/realtime/RealtimeApi;", "", "getNewListings", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/home/realtime/model/SymbolInfo;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface RealtimeApi {
    @GET("discover-new/dynamic_card/new_crypto")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<SymbolInfo>> m30051a();
}
