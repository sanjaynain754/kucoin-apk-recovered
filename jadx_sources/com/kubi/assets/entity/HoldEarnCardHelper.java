package com.kubi.assets.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HoldEarnCardHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/entity/HoldEarnCardHelper;", "", "<init>", "()V", "CATEGORY", "", "TEN_DAYS_MS", "", "utaStorageId", "Lcom/kubi/utils/storage/StorageId;", "userId", "classicStorageId", "futuresStorageId", "shouldShow", "", "storageId", "recordDismiss", "", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldEarnCardHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldEarnCardHelper.kt\ncom/kubi/assets/entity/HoldEarnCardHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,47:1\n84#2:48\n75#2,2:49\n*S KotlinDebug\n*F\n+ 1 HoldEarnCardHelper.kt\ncom/kubi/assets/entity/HoldEarnCardHelper\n*L\n37#1:48\n44#1:49,2\n*E\n"})
public final class HoldEarnCardHelper {

    @NotNull
    private static final String CATEGORY = "hold_earn_card";

    @NotNull
    public static final HoldEarnCardHelper INSTANCE = new HoldEarnCardHelper();
    private static final long TEN_DAYS_MS = 864000000;

    @NotNull
    public final StorageId<Long> classicStorageId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new StorageId<>(CATEGORY, userId + "_classic_dismiss_time", null, false, 12, null);
    }

    @NotNull
    public final StorageId<Long> futuresStorageId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new StorageId<>(CATEGORY, userId + "_futures_dismiss_time", null, false, 12, null);
    }

    public final void recordDismiss(@NotNull StorageId<Long> storageId) {
        Intrinsics.checkNotNullParameter(storageId, "storageId");
        C46392a.m102330m(storageId, System.currentTimeMillis());
    }

    public final boolean shouldShow(@NotNull StorageId<Long> storageId) {
        Intrinsics.checkNotNullParameter(storageId, "storageId");
        long jM102324f = C46392a.m102324f(storageId, 0L);
        return jM102324f <= 0 || System.currentTimeMillis() - jM102324f >= TEN_DAYS_MS;
    }

    @NotNull
    public final StorageId<Long> utaStorageId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new StorageId<>(CATEGORY, userId + "_unified_dismiss_time", null, false, 12, null);
    }

    private HoldEarnCardHelper() {
    }
}
