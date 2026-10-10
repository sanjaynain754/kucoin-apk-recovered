package com.kubi.kucoin.manager;

import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import hr.InterfaceC38288a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketWsHelper.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/manager/IWsApi;", "", SearchCategory$Companion.SPOT, "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/kucoin/manager/SpotWSEntity;", "topic", "", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "alpha", "Lcom/kubi/kucoin/manager/AlphaWSEntity;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IWsApi {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SpotWSEntity> m32600a(@InterfaceC38288a @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<WsFutureSnapshotEntity> m32601b(@InterfaceC38288a @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<AlphaWSEntity> m32602c(@InterfaceC38288a @NotNull String str);
}
