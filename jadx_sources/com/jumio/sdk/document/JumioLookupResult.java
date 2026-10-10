package com.jumio.sdk.document;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioLookupResult;", "Ljava/io/Serializable;", "documentType", "Lcom/jumio/sdk/document/JumioDocumentType;", "legalStatement", "Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "<init>", "(Lcom/jumio/sdk/document/JumioDocumentType;Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;)V", "text", "", "(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/lang/String;)V", "getDocumentType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "getLegalStatement", "()Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "JumioLegalStatement", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioLookupResult implements Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioDocumentType f14695a;

    /* JADX INFO: renamed from: b */
    public final JumioLegalStatement f14696b;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "Ljava/io/Serializable;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class JumioLegalStatement implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f14697a;

        public JumioLegalStatement(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f14697a = text;
        }

        @NotNull
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final String getF14697a() {
            return this.f14697a;
        }
    }

    public JumioLookupResult(@NotNull JumioDocumentType documentType, @NotNull JumioLegalStatement legalStatement) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(legalStatement, "legalStatement");
        this.f14695a = documentType;
        this.f14696b = legalStatement;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioLookupResult)) {
            return false;
        }
        JumioLookupResult jumioLookupResult = (JumioLookupResult) other;
        return this.f14695a == jumioLookupResult.f14695a && Intrinsics.areEqual(this.f14696b, jumioLookupResult.f14696b);
    }

    public static /* synthetic */ JumioLookupResult copy$default(JumioLookupResult jumioLookupResult, JumioDocumentType jumioDocumentType, JumioLegalStatement jumioLegalStatement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jumioDocumentType = jumioLookupResult.f14695a;
        }
        if ((i11 & 2) != 0) {
            jumioLegalStatement = jumioLookupResult.f14696b;
        }
        return jumioLookupResult.copy(jumioDocumentType, jumioLegalStatement);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JumioDocumentType getF14695a() {
        return this.f14695a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JumioLegalStatement getF14696b() {
        return this.f14696b;
    }

    @NotNull
    public final JumioLookupResult copy(@NotNull JumioDocumentType documentType, @NotNull JumioLegalStatement legalStatement) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(legalStatement, "legalStatement");
        return new JumioLookupResult(documentType, legalStatement);
    }

    @NotNull
    public final JumioDocumentType getDocumentType() {
        return this.f14695a;
    }

    @NotNull
    public final JumioLegalStatement getLegalStatement() {
        return this.f14696b;
    }

    public int hashCode() {
        return this.f14696b.hashCode() + (this.f14695a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "JumioLookupResult(documentType=" + this.f14695a + ", legalStatement=" + this.f14696b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JumioLookupResult(@NotNull JumioDocumentType documentType, @NotNull String text) {
        this(documentType, new JumioLegalStatement(text));
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
