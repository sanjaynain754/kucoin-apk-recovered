package p692vh;

import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: vh.b */
/* JADX INFO: compiled from: ITrialService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/trial/ITrialService;", "Lcom/kubi/futures/data/trial/ITrialApi;", "getFuturesWelfare2", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "observeFuturesWelfare2", "Lio/reactivex/Observable;", "loadRewardConfig", "", "getRewardConfig", "", "observeRewardConfig", "Lio/reactivex/Flowable;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45545b extends InterfaceC45544a {
    /* JADX INFO: renamed from: c */
    void mo100572c();

    /* JADX INFO: renamed from: l */
    boolean mo100573l();

    @NotNull
    /* JADX INFO: renamed from: u */
    FuturesWelfareComposeEntity mo100574u();

    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<FuturesWelfareComposeEntity> mo100575v();

    @NotNull
    /* JADX INFO: renamed from: y */
    Flowable<Boolean> mo100576y();
}
