package p793yc;

import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: yc.c */
/* JADX INFO: compiled from: RequestObserverHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Req", "Lcom/kubi/core/base/arch/api/IRequest;", "Resp", "Lcom/kubi/core/base/arch/api/IResponse;", "", "execute", "Lio/reactivex/Observable;", "req", "(Lcom/kubi/core/base/arch/api/IRequest;)Lio/reactivex/Observable;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46461c<Req extends InterfaceC45789a, Resp> {
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<Resp> mo66315a(@NotNull Req req);
}
