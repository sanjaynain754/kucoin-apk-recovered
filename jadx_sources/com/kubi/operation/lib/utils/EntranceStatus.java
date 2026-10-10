package com.kubi.operation.lib.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OperationExt.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/EntranceStatus;", "", "<init>", "()V", "isEntranceOpen", "", "closeEntrance", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EntranceStatus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EntranceStatus f36860a = new EntranceStatus();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m43661a() {
        C46392a.m102329l(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_COUNT", null, false, 12, null), C46392a.m102323e(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_COUNT", null, false, 12, null), 0) + 1);
        C46392a.m102330m(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_LAST_TIME", null, false, 12, null), System.currentTimeMillis());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m43662b() {
        int iM102323e = C46392a.m102323e(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_COUNT", null, false, 12, null), 0);
        long jM102324f = C46392a.m102324f(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_LAST_TIME", null, false, 12, null), 0L);
        if (iM102323e <= 2) {
            return System.currentTimeMillis() - jM102324f >= 86400000;
        }
        if (iM102323e == 3) {
            if (System.currentTimeMillis() - jM102324f < 345600000) {
                return false;
            }
            C46392a.m102329l(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_COUNT", null, false, 12, null), 0);
            C46392a.m102330m(new StorageId("KV_CATE_Operation", "KV_KEY_CARD_CLOSE_LAST_TIME", null, false, 12, null), 0L);
        }
        return true;
    }
}
