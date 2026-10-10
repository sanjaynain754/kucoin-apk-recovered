package p275fy;

import p694vk.C45590s;
import p852kotlin.Metadata;
import ro.C44128b;

/* JADX INFO: renamed from: fy.b */
/* JADX INFO: compiled from: MultiItemAdapterEx.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/adapter/KCBaseDiffCallBack;", "Ljava/lang/Runnable;", "<init>", "()V", "diffStartTime", "", "run", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class RunnableC37729b implements Runnable {

    /* JADX INFO: renamed from: b */
    public final long f85007b = System.currentTimeMillis();

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f85007b;
        if (C45590s.f102687a.m100680e0()) {
            if (jCurrentTimeMillis <= 1000) {
                return;
            }
        } else if (jCurrentTimeMillis <= 16) {
            return;
        }
        C44128b.m97270n("KcBaseDiffCallBack", "DiffUtil calculateDiff cost " + jCurrentTimeMillis + " ms");
    }
}
