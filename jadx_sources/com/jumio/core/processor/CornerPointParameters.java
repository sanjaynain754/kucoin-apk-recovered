package com.jumio.core.processor;

import com.jumio.core.data.document.CornerPoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/processor/CornerPointParameters;", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "<init>", "(Lcom/jumio/core/data/document/CornerPoints;)V", "getCorners", "()Lcom/jumio/core/data/document/CornerPoints;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CornerPointParameters implements ProcessorParameterInterface {

    /* JADX INFO: renamed from: a */
    public final CornerPoints f14467a;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CornerPointParameters) && Intrinsics.areEqual(this.f14467a, ((CornerPointParameters) other).f14467a);
    }

    public CornerPointParameters(@NotNull CornerPoints corners) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        this.f14467a = corners;
    }

    public static /* synthetic */ CornerPointParameters copy$default(CornerPointParameters cornerPointParameters, CornerPoints cornerPoints, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerPoints = cornerPointParameters.f14467a;
        }
        return cornerPointParameters.copy(cornerPoints);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CornerPoints getF14467a() {
        return this.f14467a;
    }

    @NotNull
    public final CornerPointParameters copy(@NotNull CornerPoints corners) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        return new CornerPointParameters(corners);
    }

    @NotNull
    public final CornerPoints getCorners() {
        return this.f14467a;
    }

    public int hashCode() {
        return this.f14467a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CornerPointParameters(corners=" + this.f14467a + ')';
    }
}
