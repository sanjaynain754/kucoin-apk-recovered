package sa;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: sa.a */
/* JADX INFO: compiled from: AssetConstant.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/constant/AssetConstant;", "", "<init>", "()V", "TAB_FROM", "", "EVENT_SHOW_DEPOSIT_DISABLE_DIALOG", "EVENT_OVERVIEW_CUSTOM_ORDER", "CATEGORY", "KEY_OVERVIEW_CUSTOM_ORDER", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_OVERVIEW_CUSTOM_ORDER", "()Lcom/kubi/utils/storage/StorageId;", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44370a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44370a f98030a = new C44370a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f98031b = new StorageId<>("asset", "key_overview_custom_order", StorageType.Shared, true);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m97869a() {
        return f98031b;
    }
}
