package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: WithdrawHintInfoEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/entity/ReturnStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_RETURN", "PROCESSING", AppConstants.AB_TEST_SUCCESS, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ReturnStatus {
    NOT_RETURN,
    PROCESSING,
    SUCCESS;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<ReturnStatus> getEntries() {
        return $ENTRIES;
    }
}
