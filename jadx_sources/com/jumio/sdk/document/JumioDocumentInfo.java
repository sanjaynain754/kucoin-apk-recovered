package com.jumio.sdk.document;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioDocumentInfo;", "Ljava/io/Serializable;", "issuingCountry", "", "documentType", "Lcom/jumio/sdk/document/JumioDocumentType;", "<init>", "(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocumentType;)V", "getIssuingCountry", "()Ljava/lang/String;", "getDocumentType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioDocumentInfo implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f14693a;

    /* JADX INFO: renamed from: b */
    public final JumioDocumentType f14694b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioDocumentInfo)) {
            return false;
        }
        JumioDocumentInfo jumioDocumentInfo = (JumioDocumentInfo) other;
        return Intrinsics.areEqual(this.f14693a, jumioDocumentInfo.f14693a) && this.f14694b == jumioDocumentInfo.f14694b;
    }

    public static /* synthetic */ JumioDocumentInfo copy$default(JumioDocumentInfo jumioDocumentInfo, String str, JumioDocumentType jumioDocumentType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jumioDocumentInfo.f14693a;
        }
        if ((i11 & 2) != 0) {
            jumioDocumentType = jumioDocumentInfo.f14694b;
        }
        return jumioDocumentInfo.copy(str, jumioDocumentType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14693a() {
        return this.f14693a;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JumioDocumentType getF14694b() {
        return this.f14694b;
    }

    @NotNull
    public final JumioDocumentInfo copy(@Nullable String issuingCountry, @Nullable JumioDocumentType documentType) {
        return new JumioDocumentInfo(issuingCountry, documentType);
    }

    @Nullable
    public final JumioDocumentType getDocumentType() {
        return this.f14694b;
    }

    @Nullable
    public final String getIssuingCountry() {
        return this.f14693a;
    }

    public int hashCode() {
        String str = this.f14693a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JumioDocumentType jumioDocumentType = this.f14694b;
        return iHashCode + (jumioDocumentType != null ? jumioDocumentType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JumioDocumentInfo(issuingCountry=" + this.f14693a + ", documentType=" + this.f14694b + ')';
    }

    public JumioDocumentInfo(@Nullable String str, @Nullable JumioDocumentType jumioDocumentType) {
        this.f14693a = str;
        this.f14694b = jumioDocumentType;
    }
}
