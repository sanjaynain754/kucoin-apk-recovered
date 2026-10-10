package com.jumio.core.processor.challenge;

import com.jumio.commons.camera.CaptureSettings;
import com.jumio.core.processor.ProcessorState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState;", "Lcom/jumio/core/processor/ProcessorState;", "ApplyCaptureSettings", "Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CameraChallengeProcessorState extends ProcessorState {

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;", "Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState;", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "<init>", "(Lcom/jumio/commons/camera/CaptureSettings;)V", "getSettings", "()Lcom/jumio/commons/camera/CaptureSettings;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ApplyCaptureSettings implements CameraChallengeProcessorState {

        /* JADX INFO: renamed from: a */
        public final CaptureSettings f14512a;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApplyCaptureSettings) && Intrinsics.areEqual(this.f14512a, ((ApplyCaptureSettings) other).f14512a);
        }

        public ApplyCaptureSettings(@NotNull CaptureSettings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f14512a = settings;
        }

        public static /* synthetic */ ApplyCaptureSettings copy$default(ApplyCaptureSettings applyCaptureSettings, CaptureSettings captureSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                captureSettings = applyCaptureSettings.f14512a;
            }
            return applyCaptureSettings.copy(captureSettings);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CaptureSettings getF14512a() {
            return this.f14512a;
        }

        @NotNull
        public final ApplyCaptureSettings copy(@NotNull CaptureSettings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new ApplyCaptureSettings(settings);
        }

        @NotNull
        public final CaptureSettings getSettings() {
            return this.f14512a;
        }

        public int hashCode() {
            return this.f14512a.hashCode();
        }

        @NotNull
        public String toString() {
            return "ApplyCaptureSettings(settings=" + this.f14512a + ')';
        }
    }
}
