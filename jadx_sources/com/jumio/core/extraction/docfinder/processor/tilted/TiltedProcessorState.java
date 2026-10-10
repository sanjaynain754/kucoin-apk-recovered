package com.jumio.core.extraction.docfinder.processor.tilted;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.sdk.enums.JumioFlashState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState;", "Lcom/jumio/core/processor/ProcessorState;", "ReferenceCorners", "Tilt", ExifInterface.TAG_FLASH, "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Flash;", "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$ReferenceCorners;", "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TiltedProcessorState extends ProcessorState {

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Flash;", "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState;", "requestedState", "Lcom/jumio/sdk/enums/JumioFlashState;", "<init>", "(Lcom/jumio/sdk/enums/JumioFlashState;)V", "getRequestedState", "()Lcom/jumio/sdk/enums/JumioFlashState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Flash implements TiltedProcessorState {

        /* JADX INFO: renamed from: a */
        public final JumioFlashState f14096a;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Flash) && this.f14096a == ((Flash) other).f14096a;
        }

        public Flash(@NotNull JumioFlashState requestedState) {
            Intrinsics.checkNotNullParameter(requestedState, "requestedState");
            this.f14096a = requestedState;
        }

        public static /* synthetic */ Flash copy$default(Flash flash, JumioFlashState jumioFlashState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jumioFlashState = flash.f14096a;
            }
            return flash.copy(jumioFlashState);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JumioFlashState getF14096a() {
            return this.f14096a;
        }

        @NotNull
        public final Flash copy(@NotNull JumioFlashState requestedState) {
            Intrinsics.checkNotNullParameter(requestedState, "requestedState");
            return new Flash(requestedState);
        }

        @NotNull
        public final JumioFlashState getRequestedState() {
            return this.f14096a;
        }

        public int hashCode() {
            return this.f14096a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Flash(requestedState=" + this.f14096a + ')';
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$ReferenceCorners;", "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReferenceCorners implements TiltedProcessorState {

        @NotNull
        public static final ReferenceCorners INSTANCE = new ReferenceCorners();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ReferenceCorners);
        }

        @NotNull
        public String toString() {
            return "ReferenceCorners";
        }

        public int hashCode() {
            return -1723007317;
        }
    }

    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;", "Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState;", "currentAngle", "", "targetAngle", "<init>", "(II)V", "getCurrentAngle", "()I", "getTargetAngle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Tilt implements TiltedProcessorState {

        /* JADX INFO: renamed from: a */
        public final int f14097a;

        /* JADX INFO: renamed from: b */
        public final int f14098b;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tilt)) {
                return false;
            }
            Tilt tilt = (Tilt) other;
            return this.f14097a == tilt.f14097a && this.f14098b == tilt.f14098b;
        }

        public static /* synthetic */ Tilt copy$default(Tilt tilt, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = tilt.f14097a;
            }
            if ((i13 & 2) != 0) {
                i12 = tilt.f14098b;
            }
            return tilt.copy(i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getF14097a() {
            return this.f14097a;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getF14098b() {
            return this.f14098b;
        }

        @NotNull
        public final Tilt copy(int currentAngle, int targetAngle) {
            return new Tilt(currentAngle, targetAngle);
        }

        public final int getCurrentAngle() {
            return this.f14097a;
        }

        public final int getTargetAngle() {
            return this.f14098b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f14098b) + (Integer.hashCode(this.f14097a) * 31);
        }

        @NotNull
        public String toString() {
            return "Tilt(currentAngle=" + this.f14097a + ", targetAngle=" + this.f14098b + ')';
        }

        public Tilt(int i11, int i12) {
            this.f14097a = i11;
            this.f14098b = i12;
        }
    }
}
