package com.kubi.sdk.site.migration;

import androidx.annotation.Keep;
import com.sensorsdata.abtest.entity.AppConstants;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteMigrationAPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteMigrationStatusResponse;", "", "<init>", "()V", "transferStatus", "", "getTransferStatus", "()Ljava/lang/String;", "originalSiteType", "getOriginalSiteType", "targetSiteType", "getTargetSiteType", "status", "getStatus", "alreadyDisplayed", "", "getAlreadyDisplayed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isNeedShowStatus", "getStatusType", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteMigrationStatusResponse {

    @Nullable
    private final Boolean alreadyDisplayed;

    @Nullable
    private final String originalSiteType;

    @Nullable
    private final String status;

    @Nullable
    private final String targetSiteType;

    @Nullable
    private final String transferStatus;

    @Nullable
    public final Boolean getAlreadyDisplayed() {
        return this.alreadyDisplayed;
    }

    @Nullable
    public final String getOriginalSiteType() {
        return this.originalSiteType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStatusType() {
        String str;
        String str2 = this.transferStatus;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                if (Intrinsics.areEqual(upperCase, "TRANSFERRING")) {
                    return "TRANSFERRING";
                }
                return (!Intrinsics.areEqual(upperCase, "FINISH") || (str = this.status) == null) ? "NOT_EXIST" : str;
            }
        }
        return "NOT_EXIST";
    }

    @Nullable
    public final String getTargetSiteType() {
        return this.targetSiteType;
    }

    @Nullable
    public final String getTransferStatus() {
        return this.transferStatus;
    }

    public final boolean isNeedShowStatus() {
        String upperCase;
        String str = this.transferStatus;
        if (str != null) {
            Locale locale = Locale.ROOT;
            String upperCase2 = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (upperCase2 != null) {
                String str2 = this.status;
                if (str2 != null) {
                    upperCase = str2.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    upperCase = null;
                }
                if (Intrinsics.areEqual(upperCase2, "TRANSFERRING")) {
                    return true;
                }
                if (Intrinsics.areEqual(upperCase2, "FINISH") && Intrinsics.areEqual(upperCase, AppConstants.AB_TEST_SUCCESS) && !Intrinsics.areEqual(this.alreadyDisplayed, Boolean.TRUE)) {
                    return true;
                }
                return Intrinsics.areEqual(upperCase2, "FINISH") && Intrinsics.areEqual(upperCase, "FAIL");
            }
        }
        return false;
    }
}
