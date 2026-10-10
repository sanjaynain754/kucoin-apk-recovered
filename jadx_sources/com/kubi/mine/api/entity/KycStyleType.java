package com.kubi.mine.api.entity;

import androidx.annotation.Keep;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KycStatusEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mine/api/entity/KycStyleType;", "", "<init>", "(Ljava/lang/String;I)V", AppConstants.AB_TEST_SUCCESS, "WARN", "ERROR", "equalString", "", "type", "", "MineApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum KycStyleType {
    SUCCESS,
    WARN,
    ERROR;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<KycStyleType> getEntries() {
        return $ENTRIES;
    }

    public final boolean equalString(@Nullable String type) {
        return StringsKt.equals(name(), type, true);
    }
}
