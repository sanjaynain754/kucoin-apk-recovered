package tz;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: tz.a */
/* JADX INFO: compiled from: ModeKV.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/mode/helper/ModeKV;", "", "<init>", "()V", "KV_CATE", "", "KEY_APP_MODE_SELECTOR", "Lcom/kubi/utils/storage/StorageId;", "getKEY_APP_MODE_SELECTOR", "()Lcom/kubi/utils/storage/StorageId;", "KEY_APP_LITE_REMOTE_ENABLED", "", "getKEY_APP_LITE_REMOTE_ENABLED", "KEY_APP_LITE_ENTRY_FINISH", "getKEY_APP_LITE_ENTRY_FINISH", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45079a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45079a f101482a = new C45079a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f101483b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f101484c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Boolean> f101485d;

    static {
        StorageType storageType = StorageType.Shared;
        f101483b = new StorageId<>("KV_CATE_APP_MODE", "KEY_APP_MODE_SELECTOR", storageType, false, 8, null);
        f101484c = new StorageId<>("KV_CATE_APP_MODE", "KEY_APP_LITE_REMOTE_ENABLED", storageType, false, 8, null);
        f101485d = new StorageId<>("KV_CATE_APP_MODE", "KEY_APP_LITE_ENTRY_FINISH", storageType, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m99687a() {
        return f101485d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m99688b() {
        return f101484c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<String> m99689c() {
        return f101483b;
    }
}
