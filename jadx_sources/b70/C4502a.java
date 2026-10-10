package b70;

import com.kubi.user.model.UserTag;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: b70.a */
/* JADX INFO: compiled from: LUserStorageIds.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/user/cache/LUserStorageIds;", "", "<init>", "()V", "USER_CENTER_CATEGORY", "", "userTagListSid", "Lcom/kubi/utils/storage/StorageId;", "", "Lcom/kubi/user/model/UserTag;", "getUserTagListSid", "()Lcom/kubi/utils/storage/StorageId;", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4502a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4502a f3917a = new C4502a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<List<UserTag>> f3918b = new StorageId<>("UserCenter", "userTagList", StorageType.Shared, false, 8, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<List<UserTag>> m4308a() {
        return f3918b;
    }
}
