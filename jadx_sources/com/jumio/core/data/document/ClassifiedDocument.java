package com.jumio.core.data.document;

import com.jumio.sdk.document.JumioDocumentType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/core/data/document/ClassifiedDocument;", "", "country", "", "type", "Lcom/jumio/sdk/document/JumioDocumentType;", "<init>", "(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocumentType;)V", "getCountry", "()Ljava/lang/String;", "getType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClassifiedDocument {

    /* JADX INFO: renamed from: a */
    public final String f13778a;

    /* JADX INFO: renamed from: b */
    public final JumioDocumentType f13779b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassifiedDocument)) {
            return false;
        }
        ClassifiedDocument classifiedDocument = (ClassifiedDocument) other;
        return Intrinsics.areEqual(this.f13778a, classifiedDocument.f13778a) && this.f13779b == classifiedDocument.f13779b;
    }

    public ClassifiedDocument(@NotNull String country, @NotNull JumioDocumentType type) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f13778a = country;
        this.f13779b = type;
    }

    public static /* synthetic */ ClassifiedDocument copy$default(ClassifiedDocument classifiedDocument, String str, JumioDocumentType jumioDocumentType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = classifiedDocument.f13778a;
        }
        if ((i11 & 2) != 0) {
            jumioDocumentType = classifiedDocument.f13779b;
        }
        return classifiedDocument.copy(str, jumioDocumentType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF13778a() {
        return this.f13778a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JumioDocumentType getF13779b() {
        return this.f13779b;
    }

    @NotNull
    public final ClassifiedDocument copy(@NotNull String country, @NotNull JumioDocumentType type) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ClassifiedDocument(country, type);
    }

    @NotNull
    public final String getCountry() {
        return this.f13778a;
    }

    @NotNull
    public final JumioDocumentType getType() {
        return this.f13779b;
    }

    public int hashCode() {
        return this.f13779b.hashCode() + (this.f13778a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ClassifiedDocument(country=" + this.f13778a + ", type=" + this.f13779b + ')';
    }
}
