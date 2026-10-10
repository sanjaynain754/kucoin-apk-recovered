package com.kubi.share.lib.utils;

import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.share.lib.utils.v */
/* JADX INFO: compiled from: ShareKV.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"CATE_KV", "", "KEY_GOOGLE_PLAY_REVIEW", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_GOOGLE_PLAY_REVIEW", "()Lcom/kubi/utils/storage/StorageId;", "ShareLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24652v {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StorageId<Boolean> m59896a() {
        return new StorageId<>("CATE_KV_SHARE", "GooglePlayHelper" + UserInfo.a.i(), StorageType.Shared, false, 8, null);
    }
}
