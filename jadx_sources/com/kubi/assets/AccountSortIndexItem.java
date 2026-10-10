package com.kubi.assets;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetSortPreviewAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/AccountSortIndexItem;", "", "sortKey", "", "accountName", "assetValue", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSortKey", "()Ljava/lang/String;", "getAccountName", "getAssetValue", "()Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountSortIndexItem {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f16605a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f16606b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BigDecimal f16607c;

    public AccountSortIndexItem(@NotNull String sortKey, @NotNull String accountName, @NotNull BigDecimal assetValue) {
        Intrinsics.checkNotNullParameter(sortKey, "sortKey");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(assetValue, "assetValue");
        this.f16605a = sortKey;
        this.f16606b = accountName;
        this.f16607c = assetValue;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF16606b() {
        return this.f16606b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getF16607c() {
        return this.f16607c;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF16605a() {
        return this.f16605a;
    }
}
