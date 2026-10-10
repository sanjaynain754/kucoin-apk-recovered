package p538pq;

import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: pq.e */
/* JADX INFO: compiled from: MineStoreId.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mine/lib/util/MineStoreId;", "", "<init>", "()V", "multiAccountSwitchTips", "Lcom/kubi/utils/storage/StorageId;", "", "getMultiAccountSwitchTips", "()Lcom/kubi/utils/storage/StorageId;", "multiAccountSwitchClick", "getMultiAccountSwitchClick", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43525e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43525e f96060a = new C43525e();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m95787a() {
        return new StorageId<>("CATE_KV_MINE", UserInfo.c().id + "multi_account_switch_click", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m95788b() {
        return new StorageId<>("CATE_KV_MINE", UserInfo.c().id + "multi_account_switch_tips", null, false, 12, null);
    }
}
