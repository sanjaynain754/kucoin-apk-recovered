package com.sumsub.sns.internal.features.data.model.common;

import androidx.autofill.HintConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/FieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/sumsub/sns/internal/features/data/model/common/e2", "text", "textArea", HintConstants.AUTOFILL_HINT_PHONE, "date", "dateTime", "bool", "select", "selectDropdown", "multiSelect", "countrySelect", "countryMultiSelect", "fileAttachment", "multiFileAttachments", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum FieldType {
    text,
    textArea,
    phone,
    date,
    dateTime,
    bool,
    select,
    selectDropdown,
    multiSelect,
    countrySelect,
    countryMultiSelect,
    fileAttachment,
    multiFileAttachments;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C29109e2 Companion = new C29109e2();

    @NotNull
    public static EnumEntries<FieldType> getEntries() {
        return $ENTRIES;
    }
}
