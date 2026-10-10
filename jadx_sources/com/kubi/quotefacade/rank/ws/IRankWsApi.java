package com.kubi.quotefacade.rank.ws;

import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsRankFutureSnapshotEntity;
import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import hr.InterfaceC38288a;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.ws.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankWsHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&J \u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/ws/IRankWsApi;", "", SearchCategory$Companion.SPOT, "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "topic", "", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "Lcom/kubi/data/entity/WsRankFutureSnapshotEntity;", "alpha", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRankWsApi {
    @Nullable
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<WsRankMarketSnapshotEntity>> m52949a(@InterfaceC38288a @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<WsRankFutureSnapshotEntity>> m52950b(@InterfaceC38288a @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<WsAlphaSnapshotEntity>> m52951c(@InterfaceC38288a @NotNull String str);
}
