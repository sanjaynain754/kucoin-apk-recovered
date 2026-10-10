package com.kubi.home.main;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HomeConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/main/HomeConfigEntity;", "", "<init>", "()V", "userLevelChange", "", "getUserLevelChange", "()Ljava/lang/Boolean;", "setUserLevelChange", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "customerServiceEntranceUrl", "", "getCustomerServiceEntranceUrl", "()Ljava/lang/String;", "setCustomerServiceEntranceUrl", "(Ljava/lang/String;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeConfigEntity {

    @Nullable
    private String customerServiceEntranceUrl;

    @Nullable
    private Boolean userLevelChange = Boolean.FALSE;

    @Nullable
    public final String getCustomerServiceEntranceUrl() {
        return this.customerServiceEntranceUrl;
    }

    @Nullable
    public final Boolean getUserLevelChange() {
        return this.userLevelChange;
    }

    public final void setCustomerServiceEntranceUrl(@Nullable String str) {
        this.customerServiceEntranceUrl = str;
    }

    public final void setUserLevelChange(@Nullable Boolean bool) {
        this.userLevelChange = bool;
    }
}
