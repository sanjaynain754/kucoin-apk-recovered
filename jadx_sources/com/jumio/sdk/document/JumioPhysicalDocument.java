package com.jumio.sdk.document;

import com.jumio.sdk.enums.JumioCredentialPart;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioPhysicalDocument;", "Lcom/jumio/sdk/document/JumioDocument;", "type", "Lcom/jumio/sdk/document/JumioDocumentType;", "variant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "parts", "", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "<init>", "(Lcom/jumio/sdk/document/JumioDocumentType;Lcom/jumio/sdk/document/JumioDocumentVariant;Ljava/util/List;)V", "getType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "getVariant", "()Lcom/jumio/sdk/document/JumioDocumentVariant;", "getParts", "()Ljava/util/List;", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioPhysicalDocument implements JumioDocument {

    /* JADX INFO: renamed from: a */
    public final JumioDocumentType f14698a;

    /* JADX INFO: renamed from: b */
    public final JumioDocumentVariant f14699b;

    /* JADX INFO: renamed from: c */
    public final List f14700c;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioPhysicalDocument)) {
            return false;
        }
        JumioPhysicalDocument jumioPhysicalDocument = (JumioPhysicalDocument) other;
        return this.f14698a == jumioPhysicalDocument.f14698a && this.f14699b == jumioPhysicalDocument.f14699b && Intrinsics.areEqual(this.f14700c, jumioPhysicalDocument.f14700c);
    }

    public JumioPhysicalDocument(@NotNull JumioDocumentType type, @NotNull JumioDocumentVariant variant, @NotNull List<? extends JumioCredentialPart> parts) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f14698a = type;
        this.f14699b = variant;
        this.f14700c = parts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JumioPhysicalDocument copy$default(JumioPhysicalDocument jumioPhysicalDocument, JumioDocumentType jumioDocumentType, JumioDocumentVariant jumioDocumentVariant, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jumioDocumentType = jumioPhysicalDocument.f14698a;
        }
        if ((i11 & 2) != 0) {
            jumioDocumentVariant = jumioPhysicalDocument.f14699b;
        }
        if ((i11 & 4) != 0) {
            list = jumioPhysicalDocument.f14700c;
        }
        return jumioPhysicalDocument.copy(jumioDocumentType, jumioDocumentVariant, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JumioDocumentType getF14698a() {
        return this.f14698a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JumioDocumentVariant getF14699b() {
        return this.f14699b;
    }

    @NotNull
    public final List<JumioCredentialPart> component3() {
        return this.f14700c;
    }

    @NotNull
    public final JumioPhysicalDocument copy(@NotNull JumioDocumentType type, @NotNull JumioDocumentVariant variant, @NotNull List<? extends JumioCredentialPart> parts) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(parts, "parts");
        return new JumioPhysicalDocument(type, variant, parts);
    }

    @NotNull
    public final List<JumioCredentialPart> getParts() {
        return this.f14700c;
    }

    @NotNull
    public final JumioDocumentType getType() {
        return this.f14698a;
    }

    @NotNull
    public final JumioDocumentVariant getVariant() {
        return this.f14699b;
    }

    public int hashCode() {
        return this.f14700c.hashCode() + ((this.f14699b.hashCode() + (this.f14698a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return this.f14698a.name() + " - " + this.f14699b.name() + " (" + this.f14700c + ')';
    }
}
