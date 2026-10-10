package com.jumio.core.data.document;

import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/data/document/DocumentWrapper;", "Ljava/io/Serializable;", "physicalDocuments", "", "Lcom/jumio/core/data/document/PhysicalDocumentType;", "digitalDocuments", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPhysicalDocuments", "()Ljava/util/List;", "getDigitalDocuments", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DocumentWrapper implements Serializable {

    /* JADX INFO: renamed from: a */
    public final List f13812a;

    /* JADX INFO: renamed from: b */
    public final List f13813b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentWrapper)) {
            return false;
        }
        DocumentWrapper documentWrapper = (DocumentWrapper) other;
        return Intrinsics.areEqual(this.f13812a, documentWrapper.f13812a) && Intrinsics.areEqual(this.f13813b, documentWrapper.f13813b);
    }

    public DocumentWrapper(@NotNull List<PhysicalDocumentType> physicalDocuments, @NotNull List<DigitalDocumentType> digitalDocuments) {
        Intrinsics.checkNotNullParameter(physicalDocuments, "physicalDocuments");
        Intrinsics.checkNotNullParameter(digitalDocuments, "digitalDocuments");
        this.f13812a = physicalDocuments;
        this.f13813b = digitalDocuments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentWrapper copy$default(DocumentWrapper documentWrapper, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = documentWrapper.f13812a;
        }
        if ((i11 & 2) != 0) {
            list2 = documentWrapper.f13813b;
        }
        return documentWrapper.copy(list, list2);
    }

    @NotNull
    public final List<PhysicalDocumentType> component1() {
        return this.f13812a;
    }

    @NotNull
    public final List<DigitalDocumentType> component2() {
        return this.f13813b;
    }

    @NotNull
    public final DocumentWrapper copy(@NotNull List<PhysicalDocumentType> physicalDocuments, @NotNull List<DigitalDocumentType> digitalDocuments) {
        Intrinsics.checkNotNullParameter(physicalDocuments, "physicalDocuments");
        Intrinsics.checkNotNullParameter(digitalDocuments, "digitalDocuments");
        return new DocumentWrapper(physicalDocuments, digitalDocuments);
    }

    @NotNull
    public final List<DigitalDocumentType> getDigitalDocuments() {
        return this.f13813b;
    }

    @NotNull
    public final List<PhysicalDocumentType> getPhysicalDocuments() {
        return this.f13812a;
    }

    public int hashCode() {
        return this.f13813b.hashCode() + (this.f13812a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DocumentWrapper(physicalDocuments=" + this.f13812a + ", digitalDocuments=" + this.f13813b + ')';
    }
}
