package com.jumio.core.extraction.docfinder.calculator;

import com.p059BV.LinearGradient.LinearGradientManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/calculator/DocumentTilt;", "", LinearGradientManager.PROP_ANGLE, "", "horizontalDirection", "Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;", "verticalDirection", "<init>", "(ILcom/jumio/core/extraction/docfinder/calculator/TiltDirection;Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;)V", "getAngle", "()I", "getHorizontalDirection", "()Lcom/jumio/core/extraction/docfinder/calculator/TiltDirection;", "getVerticalDirection", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DocumentTilt {

    /* JADX INFO: renamed from: a */
    public final int f14023a;

    /* JADX INFO: renamed from: b */
    public final TiltDirection f14024b;

    /* JADX INFO: renamed from: c */
    public final TiltDirection f14025c;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTilt)) {
            return false;
        }
        DocumentTilt documentTilt = (DocumentTilt) other;
        return this.f14023a == documentTilt.f14023a && this.f14024b == documentTilt.f14024b && this.f14025c == documentTilt.f14025c;
    }

    public DocumentTilt(int i11, @NotNull TiltDirection horizontalDirection, @NotNull TiltDirection verticalDirection) {
        Intrinsics.checkNotNullParameter(horizontalDirection, "horizontalDirection");
        Intrinsics.checkNotNullParameter(verticalDirection, "verticalDirection");
        this.f14023a = i11;
        this.f14024b = horizontalDirection;
        this.f14025c = verticalDirection;
    }

    public static /* synthetic */ DocumentTilt copy$default(DocumentTilt documentTilt, int i11, TiltDirection tiltDirection, TiltDirection tiltDirection2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = documentTilt.f14023a;
        }
        if ((i12 & 2) != 0) {
            tiltDirection = documentTilt.f14024b;
        }
        if ((i12 & 4) != 0) {
            tiltDirection2 = documentTilt.f14025c;
        }
        return documentTilt.copy(i11, tiltDirection, tiltDirection2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF14023a() {
        return this.f14023a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TiltDirection getF14024b() {
        return this.f14024b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TiltDirection getF14025c() {
        return this.f14025c;
    }

    @NotNull
    public final DocumentTilt copy(int angle, @NotNull TiltDirection horizontalDirection, @NotNull TiltDirection verticalDirection) {
        Intrinsics.checkNotNullParameter(horizontalDirection, "horizontalDirection");
        Intrinsics.checkNotNullParameter(verticalDirection, "verticalDirection");
        return new DocumentTilt(angle, horizontalDirection, verticalDirection);
    }

    public final int getAngle() {
        return this.f14023a;
    }

    @NotNull
    public final TiltDirection getHorizontalDirection() {
        return this.f14024b;
    }

    @NotNull
    public final TiltDirection getVerticalDirection() {
        return this.f14025c;
    }

    public int hashCode() {
        return this.f14025c.hashCode() + ((this.f14024b.hashCode() + (Integer.hashCode(this.f14023a) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DocumentTilt(angle=" + this.f14023a + ", horizontalDirection=" + this.f14024b + ", verticalDirection=" + this.f14025c + ')';
    }
}
