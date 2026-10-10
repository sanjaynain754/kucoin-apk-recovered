package com.kubi.spot.business.delegation;

import androidx.annotation.Keep;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeFundsListViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/AccountItemEntityWrapper;", "", "accountItemEntity", "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "labelText", "", "<init>", "(Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;Ljava/lang/String;)V", "getAccountItemEntity", "()Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "getLabelText", "()Ljava/lang/String;", "setLabelText", "(Ljava/lang/String;)V", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountItemEntityWrapper {

    @NotNull
    private final AccountItemEntity accountItemEntity;

    @NotNull
    private String labelText;

    public AccountItemEntityWrapper(@NotNull AccountItemEntity accountItemEntity, @NotNull String labelText) {
        Intrinsics.checkNotNullParameter(accountItemEntity, "accountItemEntity");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        this.accountItemEntity = accountItemEntity;
        this.labelText = labelText;
    }

    @NotNull
    public final AccountItemEntity getAccountItemEntity() {
        return this.accountItemEntity;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    public final void setLabelText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelText = str;
    }

    public /* synthetic */ AccountItemEntityWrapper(AccountItemEntity accountItemEntity, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountItemEntity, (i11 & 2) != 0 ? "" : str);
    }
}
