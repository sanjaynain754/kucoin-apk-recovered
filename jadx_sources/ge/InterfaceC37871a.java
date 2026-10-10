package ge;

import com.kubi.core.spot.api.SpotWSEntity;
import hr.InterfaceC38288a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ge.a */
/* JADX INFO: compiled from: ISpotWSDynamicTopic.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/api/ISpotWSDynamicTopic;", "", "subQuoteFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/core/spot/api/SpotWSEntity;", "topic", "", "fetchEtfNavValueFlow", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37871a {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SpotWSEntity> m85488a(@InterfaceC38288a @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<String> m85489b(@InterfaceC38288a @NotNull String str);
}
