package com.kubi.assets;

import com.kubi.assets.dialog.payment.AssetPaymentListConfig;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.assets.a0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetStorageIds.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0015\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/AssetStorageIds;", "", "<init>", "()V", "CATEGORY", "", "MULTI_PAYMENT_CONFIG", "Lcom/kubi/utils/storage/StorageId;", "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "getMULTI_PAYMENT_CONFIG", "()Lcom/kubi/utils/storage/StorageId;", "WITHDRAW_ONLY_BOOK_ADDR", "", "getWITHDRAW_ONLY_BOOK_ADDR", "WITHDRAW_NEW_ADDR_LIMIT", "getWITHDRAW_NEW_ADDR_LIMIT", "WITHDRAW_SETTING_LEAD_RED_CLICKED", "getWITHDRAW_SETTING_LEAD_RED_CLICKED", "WITHDRAW_SETTING_NEW_CLICKED", "getWITHDRAW_SETTING_NEW_CLICKED", "paymentLastUseCode", "tradeType", "paymentLastUseTime", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetStorageIds {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetStorageIds f16425a = new AssetStorageIds();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<AssetPaymentListConfig> m15239a() {
        StorageId storageId = new StorageId("assets", "MULTI_PAYMENT_CONFIG", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m15240b() {
        StorageId storageId = new StorageId("assets", "WITHDRAW_NEW_ADDR_LIMIT", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m15241c() {
        StorageId storageId = new StorageId("assets", "WITHDRAW_ONLY_BOOK_ADDR", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Boolean> m15242d() {
        StorageId storageId = new StorageId("assets", "WITHDRAW_SETTING_LEAD_RED_CLICKED", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Boolean> m15243e() {
        StorageId storageId = new StorageId("assets", "WITHDRAW_SETTING_NEW_CLICKED", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<String> m15244f(@NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        StorageId storageId = new StorageId("assets", "payment_last_use_code_" + tradeType, null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Long> m15245g(@NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        StorageId storageId = new StorageId("assets", "payment_last_use_time_" + tradeType, null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }
}
