package com.kubi.operation.lib.utils;

import com.kubi.operation.lib.entity.LearnVideoEntity;
import com.kubi.operation.lib.entity.NewUserVideoEntity;
import com.kubi.operation.lib.entity.UserStatusInfoResponseEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.w, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OperationStoreId.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/OperationStoreId;", "", "<init>", "()V", "KV_CATE", "", "KEY_NEW_USER_INFO", "Lcom/kubi/utils/storage/StorageId;", "Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "getKEY_NEW_USER_INFO", "()Lcom/kubi/utils/storage/StorageId;", "KEY_LEARN_INFO", "Lcom/kubi/operation/lib/entity/LearnVideoEntity;", "getKEY_LEARN_INFO", "KEY_USER_STATUS_INFO", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "getKEY_USER_STATUS_INFO", "KEY_USER_STATUS_INFO_V3", "Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "getKEY_USER_STATUS_INFO_V3", "KEY_USER_GUIDE_FINISHED", "", "getKEY_USER_GUIDE_FINISHED", "USER_STATUS_HEIGHT", "", "getUSER_STATUS_HEIGHT", "NEW_USER_VIDEO", "Lcom/kubi/operation/lib/entity/NewUserVideoEntity;", "getNEW_USER_VIDEO", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OperationStoreId {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OperationStoreId f36892a = new OperationStoreId();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<WidgetNewUserEntity> f36893b = new StorageId<>("kv_cate_operation", "KEY_NEW_USER_INFO_V1", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<LearnVideoEntity> f36894c = new StorageId<>("kv_cate_operation", "KEY_LEARN_INFO", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Integer> f36895d = new StorageId<>("kv_cate_operation", "user_status_height", null, false, 12, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<NewUserVideoEntity> f36896e = new StorageId<>("kv_cate_operation", "new_user_video", null, false, 12, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<LearnVideoEntity> m43680a() {
        return f36894c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<WidgetNewUserEntity> m43681b() {
        return f36893b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m43682c() {
        StorageId storageId = new StorageId("kv_cate_operation", "KEY_USER_GUIDE_FINISHED", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<WelfareTaskInfoEntity> m43683d() {
        return new StorageId("kv_cate_operation", "KEY_USER_STATUS_INFO_V1", null, false, 12, null).m102384f(UserInfo.a.i());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<UserStatusInfoResponseEntity> m43684e() {
        return new StorageId("kv_cate_operation", "KEY_USER_STATUS_INFO_V3", null, false, 12, null).m102384f(UserInfo.a.i());
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<NewUserVideoEntity> m43685f() {
        return f36896e;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Integer> m43686g() {
        return f36895d;
    }
}
