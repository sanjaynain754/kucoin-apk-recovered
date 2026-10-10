package a70;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: a70.c */
/* JADX INFO: compiled from: MultiAccountStorageId.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/user/account/MultiAccountStorageId;", "", "<init>", "()V", "CATEGORY", "", "accountIdList", "Lcom/kubi/utils/storage/StorageId;", "getAccountIdList", "()Lcom/kubi/utils/storage/StorageId;", "accountIdListOrderV2", "", "getAccountIdListOrderV2", "accountInfo", "id", "currentAccountInfo", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0189c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0189c f558a = new C0189c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f559b = new StorageId<>("multi_account", "kc.multi.account.master.id.list", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f560c = new StorageId<>("multi_account", "kc.multi.account.master.id.list.order.v2", null, false, 12, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<String> m752a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new StorageId<>("multi_account", "kLoginUserCache_" + id2, StorageType.Shared, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m753b() {
        return new StorageId<>("multi_account", "kLoginCurrentUserCache", StorageType.Shared, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<String> m754c() {
        return f559b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Boolean> m755d() {
        return f560c;
    }
}
