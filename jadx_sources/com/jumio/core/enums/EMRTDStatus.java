package com.jumio.core.enums;

import com.sensorsdata.abtest.entity.AppConstants;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/enums/EMRTDStatus;", "Ljava/io/Serializable;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_PERFORMED", "READER_UNAVAILABLE", "COUNTRY_UNAVAILABLE", "TECHNICAL_ERROR", "SKIPPED", "SKIPPED_MAX_RETRIES", "FAILED", AppConstants.AB_TEST_SUCCESS, "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum EMRTDStatus implements Serializable {
    NOT_PERFORMED,
    READER_UNAVAILABLE,
    COUNTRY_UNAVAILABLE,
    TECHNICAL_ERROR,
    SKIPPED,
    SKIPPED_MAX_RETRIES,
    FAILED,
    SUCCESS;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<EMRTDStatus> getEntries() {
        return $ENTRIES;
    }
}
