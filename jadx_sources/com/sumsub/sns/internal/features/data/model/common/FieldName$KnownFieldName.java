package com.sumsub.sns.internal.features.data.model.common;

import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, m90084d2 = {"com/sumsub/sns/internal/features/data/model/common/FieldName$KnownFieldName", "", "Lcom/sumsub/sns/internal/features/data/model/common/FieldName$KnownFieldName;", "Lcom/sumsub/sns/internal/features/data/model/common/d2;", "fieldName", "<init>", "(Ljava/lang/String;ILcom/sumsub/sns/internal/features/data/model/common/d2;)V", "Lcom/sumsub/sns/internal/features/data/model/common/d2;", "getFieldName", "()Lcom/sumsub/sns/internal/features/data/model/common/d2;", "setFieldName", "(Lcom/sumsub/sns/internal/features/data/model/common/d2;)V", "FIRST_NAME", "LAST_NAME", "MIDDLE_NAME", "EMAIL", "PHONE", "COUNTRY_OF_BIRTH", "STATE_OF_BIRTH", "DOB", "PLACE_OF_BIRTH", "LEGAL_NAME", "GENDER", "NATIONALITY", "COUNTRY", "TAX_RESIDENCE_COUNTRY", "STREET", "SUB_STREET", "BUILDING_NUMBER", "FLAT_NUMBER", "TOWN", "STATE", "POST_CODE", "TRANSACTION_AMOUNT", "INCOME_SOURCE_TYPE", "INVESTMENT_KNOWLEDGE_LEVEL", "ANNUAL_INCOME", "NET_WORTH", "TIN", "TINS", "NUMBER", "ISSUED_DATE", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@VisibleForTesting
public enum FieldName$KnownFieldName {
    FIRST_NAME(C29096c1.f59049b),
    LAST_NAME(C29168o1.f59172b),
    MIDDLE_NAME(C29691s1.f59738b),
    EMAIL(C29084a1.f59035b),
    PHONE(C28987C1.f58906b),
    COUNTRY_OF_BIRTH(C29067W0.f59009b),
    STATE_OF_BIRTH(C29021K1.f58964b),
    DOB(C29075Y0.f59017b),
    PLACE_OF_BIRTH(C28997E1.f58922b),
    LEGAL_NAME(C29179q1.f59175b),
    GENDER(C29120g1.f59067b),
    NATIONALITY(C29701u1.f59766b),
    COUNTRY(C29059U0.f59007b),
    TAX_RESIDENCE_COUNTRY(C29045Q1.f58981b),
    STREET(C29029M1.f58972b),
    SUB_STREET(C29037O1.f58977b),
    BUILDING_NUMBER(C29044Q0.f58980b),
    FLAT_NUMBER(C29108e1.f59058b),
    TOWN(C29085a2.f59036b),
    STATE(C29013I1.f58955b),
    POST_CODE(C29005G1.f58950b),
    TRANSACTION_AMOUNT(C29097c2.f59050b),
    INCOME_SOURCE_TYPE(C29132i1.f59096b),
    INVESTMENT_KNOWLEDGE_LEVEL(C29144k1.f59127b),
    ANNUAL_INCOME(C29036O0.f58976b),
    NET_WORTH(C29711w1.f59774b),
    TIN(C29052S1.f58989b),
    TINS(C29068W1.f59010b),
    NUMBER(C29721y1.f59790b),
    ISSUED_DATE(C29156m1.f59149b);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private AbstractC29103d2 fieldName;

    @NotNull
    public static EnumEntries<FieldName$KnownFieldName> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final AbstractC29103d2 getFieldName() {
        return this.fieldName;
    }

    public final void setFieldName(@NotNull AbstractC29103d2 abstractC29103d2) {
        this.fieldName = abstractC29103d2;
    }

    FieldName$KnownFieldName(AbstractC29103d2 abstractC29103d2) {
        this.fieldName = abstractC29103d2;
    }
}
