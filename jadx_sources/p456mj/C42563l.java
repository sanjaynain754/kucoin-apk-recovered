package p456mj;

import com.kubi.utils.storage.StorageType;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: mj.l */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "homeRealTimeCacheIds", "Lcom/kubi/utils/storage/StorageId;", "", "getHomeRealTimeCacheIds", "()Lcom/kubi/utils/storage/StorageId;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42563l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42563l f94254a = new C42563l();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Set<String>> f94255b = new StorageId<>("HomeRealTime", "home_real_time_removed_ids", StorageType.LocalSite, false);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Set<String>> m93331a() {
        return f94255b;
    }
}
