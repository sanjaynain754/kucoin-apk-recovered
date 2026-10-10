package p845zv;

import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: zv.b */
/* JADX INFO: compiled from: RedpkgKV.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"CATE_KV", "", "KEY_LAST_SELECTED_COIN", "Lcom/kubi/utils/storage/StorageId;", "getKEY_LAST_SELECTED_COIN", "()Lcom/kubi/utils/storage/StorageId;", "RedpackageLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46929b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StorageId<String> m103399a() {
        StorageId storageId = new StorageId("CATE_KV_REDPKG", "lastRedCoin", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }
}
