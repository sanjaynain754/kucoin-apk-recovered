package androidx.media3.exoplayer.offline;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.media3.exoplayer.offline.k */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C3274k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
    }
}
