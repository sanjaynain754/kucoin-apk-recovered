package jumio.core;

import android.os.FileObserver;
import kotlinx.coroutines.channels.InterfaceC41574m;

/* JADX INFO: renamed from: jumio.core.J2 */
/* JADX INFO: loaded from: classes61.dex */
public final class FileObserverC40549J2 extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41574m f90017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40559L2 f90018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC40549J2(InterfaceC41574m interfaceC41574m, C40559L2 c40559l2, String str) {
        super(str, 2);
        this.f90017a = interfaceC41574m;
        this.f90018b = c40559l2;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i11, String str) {
        this.f90017a.mo90594e(Boolean.valueOf(this.f90018b.m89201a()));
    }
}
