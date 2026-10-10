package com.jumio.core.processor;

import com.jumio.commons.camera.CaptureSettings;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.models.FlashSettings;
import com.jumio.core.models.TiltRange;
import java.io.Serializable;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00122\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage;", "Ljava/io/Serializable;", DocumentClassifier.KEY_SIDE, "", "getClassifier", "()Ljava/lang/String;", "holdStillTime", "", "getHoldStillTime", "()J", "usabilityExpected", "", "getUsabilityExpected", "()Z", "BaseImage", "FlashImage", "TiltedImage", "ChallengeImage", "Companion", "Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;", "Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ProcessorImage extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f14485a;
    public static final long DEFAULT_HOLD_STILL_TIME = 1500;

    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "Lcom/jumio/core/processor/ProcessorImage;", DocumentClassifier.KEY_SIDE, "", "holdStillTime", "", "usabilityExpected", "", "<init>", "(Ljava/lang/String;JZ)V", "getClassifier", "()Ljava/lang/String;", "getHoldStillTime", "()J", "getUsabilityExpected", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BaseImage implements ProcessorImage {

        /* JADX INFO: renamed from: a */
        public final String f14476a;

        /* JADX INFO: renamed from: b */
        public final long f14477b;

        /* JADX INFO: renamed from: c */
        public final boolean f14478c;

        public BaseImage(@NotNull String classifier, long j11, boolean z11) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            this.f14476a = classifier;
            this.f14477b = j11;
            this.f14478c = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseImage)) {
                return false;
            }
            BaseImage baseImage = (BaseImage) other;
            return Intrinsics.areEqual(this.f14476a, baseImage.f14476a) && this.f14477b == baseImage.f14477b && this.f14478c == baseImage.f14478c;
        }

        public static /* synthetic */ BaseImage copy$default(BaseImage baseImage, String str, long j11, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = baseImage.f14476a;
            }
            if ((i11 & 2) != 0) {
                j11 = baseImage.f14477b;
            }
            if ((i11 & 4) != 0) {
                z11 = baseImage.f14478c;
            }
            return baseImage.copy(str, j11, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getF14476a() {
            return this.f14476a;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getF14477b() {
            return this.f14477b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getF14478c() {
            return this.f14478c;
        }

        @NotNull
        public final BaseImage copy(@NotNull String classifier, long holdStillTime, boolean usabilityExpected) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            return new BaseImage(classifier, holdStillTime, usabilityExpected);
        }

        @Override // com.jumio.core.processor.ProcessorImage
        @NotNull
        public String getClassifier() {
            return this.f14476a;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public long getHoldStillTime() {
            return this.f14477b;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public boolean getUsabilityExpected() {
            return this.f14478c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14478c) + AbstractC40749x1.m89269a(this.f14477b, this.f14476a.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "BaseImage(classifier=" + this.f14476a + ", holdStillTime=" + this.f14477b + ", usabilityExpected=" + this.f14478c + ')';
        }

        public /* synthetic */ BaseImage(String str, long j11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 1500L : j11, (i11 & 4) != 0 ? false : z11);
        }
    }

    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;", "Lcom/jumio/core/processor/ProcessorImage;", DocumentClassifier.KEY_SIDE, "", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "setupThreshold", "", "coolDownThreshold", "holdStillTime", "", "usabilityExpected", "", "<init>", "(Ljava/lang/String;Lcom/jumio/commons/camera/CaptureSettings;FFJZ)V", "getClassifier", "()Ljava/lang/String;", "getSettings", "()Lcom/jumio/commons/camera/CaptureSettings;", "getSetupThreshold", "()F", "getCoolDownThreshold", "getHoldStillTime", "()J", "getUsabilityExpected", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChallengeImage implements ProcessorImage {

        /* JADX INFO: renamed from: a */
        public final String f14479a;

        /* JADX INFO: renamed from: b */
        public final CaptureSettings f14480b;

        /* JADX INFO: renamed from: c */
        public final float f14481c;

        /* JADX INFO: renamed from: d */
        public final float f14482d;

        /* JADX INFO: renamed from: e */
        public final long f14483e;

        /* JADX INFO: renamed from: f */
        public final boolean f14484f;

        public ChallengeImage(@NotNull String classifier, @NotNull CaptureSettings settings, float f11, float f12, long j11, boolean z11) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f14479a = classifier;
            this.f14480b = settings;
            this.f14481c = f11;
            this.f14482d = f12;
            this.f14483e = j11;
            this.f14484f = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChallengeImage)) {
                return false;
            }
            ChallengeImage challengeImage = (ChallengeImage) other;
            return Intrinsics.areEqual(this.f14479a, challengeImage.f14479a) && Intrinsics.areEqual(this.f14480b, challengeImage.f14480b) && Float.compare(this.f14481c, challengeImage.f14481c) == 0 && Float.compare(this.f14482d, challengeImage.f14482d) == 0 && this.f14483e == challengeImage.f14483e && this.f14484f == challengeImage.f14484f;
        }

        public static /* synthetic */ ChallengeImage copy$default(ChallengeImage challengeImage, String str, CaptureSettings captureSettings, float f11, float f12, long j11, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = challengeImage.f14479a;
            }
            if ((i11 & 2) != 0) {
                captureSettings = challengeImage.f14480b;
            }
            if ((i11 & 4) != 0) {
                f11 = challengeImage.f14481c;
            }
            if ((i11 & 8) != 0) {
                f12 = challengeImage.f14482d;
            }
            if ((i11 & 16) != 0) {
                j11 = challengeImage.f14483e;
            }
            if ((i11 & 32) != 0) {
                z11 = challengeImage.f14484f;
            }
            boolean z12 = z11;
            long j12 = j11;
            return challengeImage.copy(str, captureSettings, f11, f12, j12, z12);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getF14479a() {
            return this.f14479a;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CaptureSettings getF14480b() {
            return this.f14480b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getF14481c() {
            return this.f14481c;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getF14482d() {
            return this.f14482d;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getF14483e() {
            return this.f14483e;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getF14484f() {
            return this.f14484f;
        }

        @NotNull
        public final ChallengeImage copy(@NotNull String classifier, @NotNull CaptureSettings settings, float setupThreshold, float coolDownThreshold, long holdStillTime, boolean usabilityExpected) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new ChallengeImage(classifier, settings, setupThreshold, coolDownThreshold, holdStillTime, usabilityExpected);
        }

        @Override // com.jumio.core.processor.ProcessorImage
        @NotNull
        public String getClassifier() {
            return this.f14479a;
        }

        public final float getCoolDownThreshold() {
            return this.f14482d;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public long getHoldStillTime() {
            return this.f14483e;
        }

        @NotNull
        public final CaptureSettings getSettings() {
            return this.f14480b;
        }

        public final float getSetupThreshold() {
            return this.f14481c;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public boolean getUsabilityExpected() {
            return this.f14484f;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14484f) + AbstractC40749x1.m89269a(this.f14483e, (Float.hashCode(this.f14482d) + ((Float.hashCode(this.f14481c) + ((this.f14480b.hashCode() + (this.f14479a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ChallengeImage(classifier=" + this.f14479a + ", settings=" + this.f14480b + ", setupThreshold=" + this.f14481c + ", coolDownThreshold=" + this.f14482d + ", holdStillTime=" + this.f14483e + ", usabilityExpected=" + this.f14484f + ')';
        }

        public /* synthetic */ ChallengeImage(String str, CaptureSettings captureSettings, float f11, float f12, long j11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, captureSettings, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? false : z11);
        }
    }

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage$Companion;", "", "<init>", "()V", "DEFAULT_HOLD_STILL_TIME", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static final long DEFAULT_HOLD_STILL_TIME = 1500;

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f14485a = new Companion();
    }

    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "Lcom/jumio/core/processor/ProcessorImage;", DocumentClassifier.KEY_SIDE, "", "holdStillTime", "", "usabilityExpected", "", "settings", "Lcom/jumio/core/models/FlashSettings;", "<init>", "(Ljava/lang/String;JZLcom/jumio/core/models/FlashSettings;)V", "getClassifier", "()Ljava/lang/String;", "getHoldStillTime", "()J", "getUsabilityExpected", "()Z", "getSettings", "()Lcom/jumio/core/models/FlashSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FlashImage implements ProcessorImage {

        /* JADX INFO: renamed from: a */
        public final String f14486a;

        /* JADX INFO: renamed from: b */
        public final long f14487b;

        /* JADX INFO: renamed from: c */
        public final boolean f14488c;

        /* JADX INFO: renamed from: d */
        public final FlashSettings f14489d;

        public FlashImage(@NotNull String classifier, long j11, boolean z11, @NotNull FlashSettings settings) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f14486a = classifier;
            this.f14487b = j11;
            this.f14488c = z11;
            this.f14489d = settings;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlashImage)) {
                return false;
            }
            FlashImage flashImage = (FlashImage) other;
            return Intrinsics.areEqual(this.f14486a, flashImage.f14486a) && this.f14487b == flashImage.f14487b && this.f14488c == flashImage.f14488c && Intrinsics.areEqual(this.f14489d, flashImage.f14489d);
        }

        public static /* synthetic */ FlashImage copy$default(FlashImage flashImage, String str, long j11, boolean z11, FlashSettings flashSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = flashImage.f14486a;
            }
            if ((i11 & 2) != 0) {
                j11 = flashImage.f14487b;
            }
            if ((i11 & 4) != 0) {
                z11 = flashImage.f14488c;
            }
            if ((i11 & 8) != 0) {
                flashSettings = flashImage.f14489d;
            }
            return flashImage.copy(str, j11, z11, flashSettings);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getF14486a() {
            return this.f14486a;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getF14487b() {
            return this.f14487b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getF14488c() {
            return this.f14488c;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final FlashSettings getF14489d() {
            return this.f14489d;
        }

        @NotNull
        public final FlashImage copy(@NotNull String classifier, long holdStillTime, boolean usabilityExpected, @NotNull FlashSettings settings) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new FlashImage(classifier, holdStillTime, usabilityExpected, settings);
        }

        @Override // com.jumio.core.processor.ProcessorImage
        @NotNull
        public String getClassifier() {
            return this.f14486a;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public long getHoldStillTime() {
            return this.f14487b;
        }

        @NotNull
        public final FlashSettings getSettings() {
            return this.f14489d;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public boolean getUsabilityExpected() {
            return this.f14488c;
        }

        public int hashCode() {
            return this.f14489d.hashCode() + AbstractC40637b0.m89251a(this.f14488c, AbstractC40749x1.m89269a(this.f14487b, this.f14486a.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "FlashImage(classifier=" + this.f14486a + ", holdStillTime=" + this.f14487b + ", usabilityExpected=" + this.f14488c + ", settings=" + this.f14489d + ')';
        }

        public /* synthetic */ FlashImage(String str, long j11, boolean z11, FlashSettings flashSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? false : z11, flashSettings);
        }
    }

    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorImage$TiltedImage;", "Lcom/jumio/core/processor/ProcessorImage;", DocumentClassifier.KEY_SIDE, "", "flash", "", "tiltRange", "Lcom/jumio/core/models/TiltRange;", "holdStillTime", "", "usabilityExpected", "<init>", "(Ljava/lang/String;ZLcom/jumio/core/models/TiltRange;JZ)V", "getClassifier", "()Ljava/lang/String;", "getFlash", "()Z", "getTiltRange", "()Lcom/jumio/core/models/TiltRange;", "getHoldStillTime", "()J", "getUsabilityExpected", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TiltedImage implements ProcessorImage {

        /* JADX INFO: renamed from: a */
        public final String f14490a;

        /* JADX INFO: renamed from: b */
        public final boolean f14491b;

        /* JADX INFO: renamed from: c */
        public final TiltRange f14492c;

        /* JADX INFO: renamed from: d */
        public final long f14493d;

        /* JADX INFO: renamed from: e */
        public final boolean f14494e;

        public TiltedImage(@NotNull String classifier, boolean z11, @NotNull TiltRange tiltRange, long j11, boolean z12) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(tiltRange, "tiltRange");
            this.f14490a = classifier;
            this.f14491b = z11;
            this.f14492c = tiltRange;
            this.f14493d = j11;
            this.f14494e = z12;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TiltedImage)) {
                return false;
            }
            TiltedImage tiltedImage = (TiltedImage) other;
            return Intrinsics.areEqual(this.f14490a, tiltedImage.f14490a) && this.f14491b == tiltedImage.f14491b && Intrinsics.areEqual(this.f14492c, tiltedImage.f14492c) && this.f14493d == tiltedImage.f14493d && this.f14494e == tiltedImage.f14494e;
        }

        public static /* synthetic */ TiltedImage copy$default(TiltedImage tiltedImage, String str, boolean z11, TiltRange tiltRange, long j11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tiltedImage.f14490a;
            }
            if ((i11 & 2) != 0) {
                z11 = tiltedImage.f14491b;
            }
            if ((i11 & 4) != 0) {
                tiltRange = tiltedImage.f14492c;
            }
            if ((i11 & 8) != 0) {
                j11 = tiltedImage.f14493d;
            }
            if ((i11 & 16) != 0) {
                z12 = tiltedImage.f14494e;
            }
            boolean z13 = z12;
            TiltRange tiltRange2 = tiltRange;
            return tiltedImage.copy(str, z11, tiltRange2, j11, z13);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getF14490a() {
            return this.f14490a;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getF14491b() {
            return this.f14491b;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TiltRange getF14492c() {
            return this.f14492c;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getF14493d() {
            return this.f14493d;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getF14494e() {
            return this.f14494e;
        }

        @NotNull
        public final TiltedImage copy(@NotNull String classifier, boolean flash, @NotNull TiltRange tiltRange, long holdStillTime, boolean usabilityExpected) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(tiltRange, "tiltRange");
            return new TiltedImage(classifier, flash, tiltRange, holdStillTime, usabilityExpected);
        }

        @Override // com.jumio.core.processor.ProcessorImage
        @NotNull
        public String getClassifier() {
            return this.f14490a;
        }

        public final boolean getFlash() {
            return this.f14491b;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public long getHoldStillTime() {
            return this.f14493d;
        }

        @NotNull
        public final TiltRange getTiltRange() {
            return this.f14492c;
        }

        @Override // com.jumio.core.processor.ProcessorImage
        public boolean getUsabilityExpected() {
            return this.f14494e;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14494e) + AbstractC40749x1.m89269a(this.f14493d, (this.f14492c.hashCode() + AbstractC40637b0.m89251a(this.f14491b, this.f14490a.hashCode() * 31, 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "TiltedImage(classifier=" + this.f14490a + ", flash=" + this.f14491b + ", tiltRange=" + this.f14492c + ", holdStillTime=" + this.f14493d + ", usabilityExpected=" + this.f14494e + ')';
        }

        public /* synthetic */ TiltedImage(String str, boolean z11, TiltRange tiltRange, long j11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z11, tiltRange, j11, (i11 & 16) != 0 ? false : z12);
        }
    }

    @NotNull
    String getClassifier();

    long getHoldStillTime();

    boolean getUsabilityExpected();
}
