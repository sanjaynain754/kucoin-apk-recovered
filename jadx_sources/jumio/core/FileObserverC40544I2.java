package jumio.core;

import android.os.FileObserver;
import java.io.File;
import kotlinx.coroutines.channels.InterfaceC41574m;

/* JADX INFO: renamed from: jumio.core.I2 */
/* JADX INFO: loaded from: classes61.dex */
public final class FileObserverC40544I2 extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41574m f90007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40559L2 f90008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC40544I2(InterfaceC41574m interfaceC41574m, C40559L2 c40559l2, File file) {
        super(file, 2);
        this.f90007a = interfaceC41574m;
        this.f90008b = c40559l2;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i11, String str) {
        this.f90007a.mo90594e(Boolean.valueOf(this.f90008b.m89201a()));
    }
}
