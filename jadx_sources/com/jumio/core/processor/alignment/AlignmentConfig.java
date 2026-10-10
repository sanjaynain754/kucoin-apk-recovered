package com.jumio.core.processor.alignment;

import com.jumio.core.models.DocfinderSettingsModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentConfig;", "", "horizontalMargin", "", "verticalMargin", "docfinderSettingsModel", "Lcom/jumio/core/models/DocfinderSettingsModel;", "<init>", "(FFLcom/jumio/core/models/DocfinderSettingsModel;)V", "getHorizontalMargin", "()F", "getVerticalMargin", "getDocfinderSettingsModel", "()Lcom/jumio/core/models/DocfinderSettingsModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlignmentConfig {

    @NotNull
    private final DocfinderSettingsModel docfinderSettingsModel;
    private final float horizontalMargin;
    private final float verticalMargin;

    public AlignmentConfig() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlignmentConfig)) {
            return false;
        }
        AlignmentConfig alignmentConfig = (AlignmentConfig) other;
        return Float.compare(this.horizontalMargin, alignmentConfig.horizontalMargin) == 0 && Float.compare(this.verticalMargin, alignmentConfig.verticalMargin) == 0 && Intrinsics.areEqual(this.docfinderSettingsModel, alignmentConfig.docfinderSettingsModel);
    }

    public AlignmentConfig(float f11, float f12, @NotNull DocfinderSettingsModel docfinderSettingsModel) {
        Intrinsics.checkNotNullParameter(docfinderSettingsModel, "docfinderSettingsModel");
        this.horizontalMargin = f11;
        this.verticalMargin = f12;
        this.docfinderSettingsModel = docfinderSettingsModel;
    }

    public static /* synthetic */ AlignmentConfig copy$default(AlignmentConfig alignmentConfig, float f11, float f12, DocfinderSettingsModel docfinderSettingsModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = alignmentConfig.horizontalMargin;
        }
        if ((i11 & 2) != 0) {
            f12 = alignmentConfig.verticalMargin;
        }
        if ((i11 & 4) != 0) {
            docfinderSettingsModel = alignmentConfig.docfinderSettingsModel;
        }
        return alignmentConfig.copy(f11, f12, docfinderSettingsModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHorizontalMargin() {
        return this.horizontalMargin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getVerticalMargin() {
        return this.verticalMargin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocfinderSettingsModel getDocfinderSettingsModel() {
        return this.docfinderSettingsModel;
    }

    @NotNull
    public final AlignmentConfig copy(float horizontalMargin, float verticalMargin, @NotNull DocfinderSettingsModel docfinderSettingsModel) {
        Intrinsics.checkNotNullParameter(docfinderSettingsModel, "docfinderSettingsModel");
        return new AlignmentConfig(horizontalMargin, verticalMargin, docfinderSettingsModel);
    }

    @NotNull
    public final DocfinderSettingsModel getDocfinderSettingsModel() {
        return this.docfinderSettingsModel;
    }

    public final float getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final float getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return this.docfinderSettingsModel.hashCode() + ((Float.hashCode(this.verticalMargin) + (Float.hashCode(this.horizontalMargin) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AlignmentConfig(horizontalMargin=" + this.horizontalMargin + ", verticalMargin=" + this.verticalMargin + ", docfinderSettingsModel=" + this.docfinderSettingsModel + ')';
    }

    public /* synthetic */ AlignmentConfig(float f11, float f12, DocfinderSettingsModel docfinderSettingsModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) == 0 ? f12 : 0.0f, (i11 & 4) != 0 ? new DocfinderSettingsModel(0, 0L, 0, 0L, 0.0d, 0.0d, null, 127, null) : docfinderSettingsModel);
    }
}
