package p761xh;

import androidx.annotation.IdRes;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.tradebase.R$id;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: xh.c */
/* JADX INFO: compiled from: SelectTimeOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/RangeTime;", "Lcom/kubi/futures/dialog/pop/BaseTime;", SessionDescription.ATTR_RANGE, "", "<init>", "(I)V", "getRange", "()I", "startTime", "", "endTime", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46198c implements InterfaceC46192a {

    /* JADX INFO: renamed from: a */
    public final int f103729a;

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF103729a() {
        return this.f103729a;
    }

    public C46198c(@IdRes int i11) {
        this.f103729a = i11;
    }

    @Override // p761xh.InterfaceC46192a
    /* JADX INFO: renamed from: a */
    public long getF103728b() {
        return System.currentTimeMillis();
    }

    @Override // p761xh.InterfaceC46192a
    /* JADX INFO: renamed from: b */
    public long getF103727a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = this.f103729a;
        long j11 = 604800000;
        if (i11 != R$id.sevenDay) {
            if (i11 == R$id.oneMonth) {
                j11 = 2592000000L;
            } else if (i11 == R$id.threeMonth) {
                j11 = 7776000000L;
            }
        }
        return jCurrentTimeMillis - j11;
    }
}
