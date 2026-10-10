package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FeatureGroupResolutionResult.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "", RtspHeaders.SUPPORTED, "UseCaseMissing", "UnsupportedUseCase", "Unsupported", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface FeatureGroupResolutionResult {

    /* JADX INFO: compiled from: FeatureGroupResolutionResult.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "resolvedFeatureGroup", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "<init>", "(Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;)V", "getResolvedFeatureGroup", "()Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class Supported implements FeatureGroupResolutionResult {

        @NotNull
        private final ResolvedFeatureGroup resolvedFeatureGroup;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Supported) && Intrinsics.areEqual(this.resolvedFeatureGroup, ((Supported) other).resolvedFeatureGroup);
        }

        public static /* synthetic */ Supported copy$default(Supported supported, ResolvedFeatureGroup resolvedFeatureGroup, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                resolvedFeatureGroup = supported.resolvedFeatureGroup;
            }
            return supported.copy(resolvedFeatureGroup);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        @NotNull
        public final ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        public int hashCode() {
            return this.resolvedFeatureGroup.hashCode();
        }

        @NotNull
        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.resolvedFeatureGroup + ')';
        }

        public Supported(@NotNull ResolvedFeatureGroup resolvedFeatureGroup) {
            Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.resolvedFeatureGroup = resolvedFeatureGroup;
        }

        @NotNull
        public final Supported copy(@NotNull ResolvedFeatureGroup resolvedFeatureGroup) {
            Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "resolvedFeatureGroup");
            return new Supported(resolvedFeatureGroup);
        }
    }

    /* JADX INFO: compiled from: FeatureGroupResolutionResult.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "unsupportedUseCase", "Landroidx/camera/core/UseCase;", "<init>", "(Landroidx/camera/core/UseCase;)V", "getUnsupportedUseCase", "()Landroidx/camera/core/UseCase;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class UnsupportedUseCase implements FeatureGroupResolutionResult {

        @NotNull
        private final UseCase unsupportedUseCase;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedUseCase) && Intrinsics.areEqual(this.unsupportedUseCase, ((UnsupportedUseCase) other).unsupportedUseCase);
        }

        public static /* synthetic */ UnsupportedUseCase copy$default(UnsupportedUseCase unsupportedUseCase, UseCase useCase, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                useCase = unsupportedUseCase.unsupportedUseCase;
            }
            return unsupportedUseCase.copy(useCase);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UseCase getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        @NotNull
        public final UseCase getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        public int hashCode() {
            return this.unsupportedUseCase.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.unsupportedUseCase + ')';
        }

        public UnsupportedUseCase(@NotNull UseCase unsupportedUseCase) {
            Intrinsics.checkNotNullParameter(unsupportedUseCase, "unsupportedUseCase");
            this.unsupportedUseCase = unsupportedUseCase;
        }

        @NotNull
        public final UnsupportedUseCase copy(@NotNull UseCase unsupportedUseCase) {
            Intrinsics.checkNotNullParameter(unsupportedUseCase, "unsupportedUseCase");
            return new UnsupportedUseCase(unsupportedUseCase);
        }
    }

    /* JADX INFO: compiled from: FeatureGroupResolutionResult.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "requiredUseCases", "", "featureRequiring", "Landroidx/camera/core/featuregroup/GroupableFeature;", "<init>", "(Ljava/lang/String;Landroidx/camera/core/featuregroup/GroupableFeature;)V", "getRequiredUseCases", "()Ljava/lang/String;", "getFeatureRequiring", "()Landroidx/camera/core/featuregroup/GroupableFeature;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class UseCaseMissing implements FeatureGroupResolutionResult {

        @NotNull
        private final GroupableFeature featureRequiring;

        @NotNull
        private final String requiredUseCases;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UseCaseMissing)) {
                return false;
            }
            UseCaseMissing useCaseMissing = (UseCaseMissing) other;
            return Intrinsics.areEqual(this.requiredUseCases, useCaseMissing.requiredUseCases) && Intrinsics.areEqual(this.featureRequiring, useCaseMissing.featureRequiring);
        }

        public static /* synthetic */ UseCaseMissing copy$default(UseCaseMissing useCaseMissing, String str, GroupableFeature groupableFeature, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = useCaseMissing.requiredUseCases;
            }
            if ((i11 & 2) != 0) {
                groupableFeature = useCaseMissing.featureRequiring;
            }
            return useCaseMissing.copy(str, groupableFeature);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GroupableFeature getFeatureRequiring() {
            return this.featureRequiring;
        }

        @NotNull
        public final GroupableFeature getFeatureRequiring() {
            return this.featureRequiring;
        }

        @NotNull
        public final String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        public int hashCode() {
            return (this.requiredUseCases.hashCode() * 31) + this.featureRequiring.hashCode();
        }

        @NotNull
        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.requiredUseCases + ", featureRequiring=" + this.featureRequiring + ')';
        }

        public UseCaseMissing(@NotNull String requiredUseCases, @NotNull GroupableFeature featureRequiring) {
            Intrinsics.checkNotNullParameter(requiredUseCases, "requiredUseCases");
            Intrinsics.checkNotNullParameter(featureRequiring, "featureRequiring");
            this.requiredUseCases = requiredUseCases;
            this.featureRequiring = featureRequiring;
        }

        @NotNull
        public final UseCaseMissing copy(@NotNull String requiredUseCases, @NotNull GroupableFeature featureRequiring) {
            Intrinsics.checkNotNullParameter(requiredUseCases, "requiredUseCases");
            Intrinsics.checkNotNullParameter(featureRequiring, "featureRequiring");
            return new UseCaseMissing(requiredUseCases, featureRequiring);
        }
    }

    /* JADX INFO: compiled from: FeatureGroupResolutionResult.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "<init>", "()V", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Unsupported implements FeatureGroupResolutionResult {

        @NotNull
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
        }
    }
}
