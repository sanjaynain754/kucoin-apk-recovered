package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/models/ExtractionModeModel;", "Lcom/jumio/core/model/StaticModel;", "docFinderEnabled", "", "<init>", "(Z)V", "getDocFinderEnabled", "()Z", "setDocFinderEnabled", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ExtractionModeModel")
public final /* data */ class ExtractionModeModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public boolean f14242a;

    public ExtractionModeModel() {
        this(false, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtractionModeModel) && this.f14242a == ((ExtractionModeModel) other).f14242a;
    }

    public ExtractionModeModel(boolean z11) {
        this.f14242a = z11;
    }

    public static /* synthetic */ ExtractionModeModel copy$default(ExtractionModeModel extractionModeModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = extractionModeModel.f14242a;
        }
        return extractionModeModel.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getF14242a() {
        return this.f14242a;
    }

    @NotNull
    public final ExtractionModeModel copy(boolean docFinderEnabled) {
        return new ExtractionModeModel(docFinderEnabled);
    }

    public final boolean getDocFinderEnabled() {
        return this.f14242a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14242a);
    }

    public final void setDocFinderEnabled(boolean z11) {
        this.f14242a = z11;
    }

    @NotNull
    public String toString() {
        return "ExtractionModeModel(docFinderEnabled=" + this.f14242a + ')';
    }

    public /* synthetic */ ExtractionModeModel(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
