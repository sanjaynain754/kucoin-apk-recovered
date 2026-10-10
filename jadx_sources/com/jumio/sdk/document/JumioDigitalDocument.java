package com.jumio.sdk.document;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/sdk/document/JumioDigitalDocument;", "Lcom/jumio/sdk/document/JumioDocument;", "type", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class JumioDigitalDocument implements JumioDocument {

    /* JADX INFO: renamed from: a */
    public final String f14691a;

    /* JADX INFO: renamed from: b */
    public final String f14692b;

    public JumioDigitalDocument(@NotNull String type, @NotNull String title) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f14691a = type;
        this.f14692b = title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioDigitalDocument)) {
            return false;
        }
        JumioDigitalDocument jumioDigitalDocument = (JumioDigitalDocument) other;
        return Intrinsics.areEqual(this.f14691a, jumioDigitalDocument.f14691a) && Intrinsics.areEqual(this.f14692b, jumioDigitalDocument.f14692b);
    }

    public static /* synthetic */ JumioDigitalDocument copy$default(JumioDigitalDocument jumioDigitalDocument, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jumioDigitalDocument.f14691a;
        }
        if ((i11 & 2) != 0) {
            str2 = jumioDigitalDocument.f14692b;
        }
        return jumioDigitalDocument.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14691a() {
        return this.f14691a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF14692b() {
        return this.f14692b;
    }

    @NotNull
    public final JumioDigitalDocument copy(@NotNull String type, @NotNull String title) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        return new JumioDigitalDocument(type, title);
    }

    @NotNull
    public final String getTitle() {
        return this.f14692b;
    }

    @NotNull
    public final String getType() {
        return this.f14691a;
    }

    public int hashCode() {
        return this.f14692b.hashCode() + (this.f14691a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "JumioDigitalDocument(type=" + this.f14691a + ", title=" + this.f14692b + ')';
    }

    public /* synthetic */ JumioDigitalDocument(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? str : str2);
    }
}
