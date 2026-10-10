package g60;

import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: g60.b */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/transfer/utils/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "MULTI_ACCOUNT_ORDERS", "Lcom/kubi/utils/storage/StorageId;", "getMULTI_ACCOUNT_ORDERS", "()Lcom/kubi/utils/storage/StorageId;", "MULTI_ACCOUNT_NOTICE_CLOSED", "", "getMULTI_ACCOUNT_NOTICE_CLOSED", "FINANCE_NOTICE_CLOSED", "getFINANCE_NOTICE_CLOSED", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37826b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37826b f85205a = new C37826b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m85380a() {
        return new StorageId<>("transfer", "multi_account_notice_closed_" + UserInfo.a.i(), null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m85381b() {
        return new StorageId<>("transfer", "multi_account_orders_" + UserInfo.a.i(), null, false, 12, null);
    }
}
