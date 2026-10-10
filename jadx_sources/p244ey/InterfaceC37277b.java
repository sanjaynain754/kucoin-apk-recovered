package p244ey;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: ey.b */
/* JADX INFO: compiled from: TradeLoadingHost.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;", "", "showLoading", "", "hideLoading", "force", "", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37277b {
    /* JADX INFO: renamed from: a */
    void mo83446a(boolean z11);

    void showLoading();

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m83449b(InterfaceC37277b interfaceC37277b, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideLoading");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        interfaceC37277b.mo83446a(z11);
    }
}
