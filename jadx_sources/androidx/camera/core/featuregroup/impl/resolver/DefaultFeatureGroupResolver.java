package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultFeatureGroupResolver.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J8\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;)V", "resolveFeatureGroup", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "sessionConfig", "Landroidx/camera/core/SessionConfig;", "getMissingUseCase", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "useCases", "", "Landroidx/camera/core/UseCase;", "getFeatureListResolvedByPriority", "orderedPreferredFeatures", "index", "", "currentOptionalFeatures", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultFeatureGroupResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFeatureGroupResolver.kt\nandroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1863#2,2:190\n1863#2,2:192\n774#2:194\n865#2,2:195\n1755#2,3:197\n1755#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 DefaultFeatureGroupResolver.kt\nandroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver\n*L\n79#1:190,2\n87#1:192,2\n94#1:194\n94#1:195,2\n110#1:197,3\n111#1:200,3\n*E\n"})
public final class DefaultFeatureGroupResolver implements FeatureGroupResolver {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "DefaultFeatureGroupResolver";

    @NotNull
    private final CameraInfoInternal cameraInfoInternal;

    /* JADX INFO: compiled from: DefaultFeatureGroupResolver.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver$Companion;", "", "<init>", "()V", "TAG", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    private final FeatureGroupResolutionResult.UseCaseMissing getMissingUseCase(GroupableFeature groupableFeature, List<? extends UseCase> list) {
        boolean z11;
        String string;
        boolean z12 = false;
        if (list != null && list.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (((UseCase) it.next()) instanceof ImageCapture) {
                z11 = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            for (UseCase useCase : list) {
                if ((useCase instanceof Preview) || CameraUseCaseAdapter.isVideoCapture(useCase)) {
                    z12 = true;
                    break;
                }
            }
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[groupableFeature.getFeatureTypeInternal().ordinal()];
        if (i11 == 1) {
            string = UseCaseType.IMAGE_CAPTURE.toString();
            if (z11) {
                string = null;
            }
        } else {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = UseCaseType.PREVIEW + " or " + UseCaseType.VIDEO_CAPTURE;
            if (z12) {
                string = null;
            }
        }
        if (string != null) {
            return new FeatureGroupResolutionResult.UseCaseMissing(string, groupableFeature);
        }
        return null;
    }

    /* JADX INFO: compiled from: DefaultFeatureGroupResolver.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureTypeInternal.values().length];
            try {
                iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultFeatureGroupResolver(@NotNull CameraInfoInternal cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureGroupResolutionResult getFeatureListResolvedByPriority$default(DefaultFeatureGroupResolver defaultFeatureGroupResolver, SessionConfig sessionConfig, List list, int i11, List list2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return defaultFeatureGroupResolver.getFeatureListResolvedByPriority(sessionConfig, list, i11, list2);
    }

    private final FeatureGroupResolutionResult getFeatureListResolvedByPriority(SessionConfig sessionConfig, List<? extends GroupableFeature> orderedPreferredFeatures, int index, List<? extends GroupableFeature> currentOptionalFeatures) {
        if (index >= orderedPreferredFeatures.size()) {
            Set setPlus = SetsKt.plus((Set) sessionConfig.getRequiredFeatureGroup(), (Iterable) currentOptionalFeatures);
            Logger.m1866d(TAG, "getFeatureListResolvedByPriority: features = " + setPlus + ", useCases = " + sessionConfig.getUseCases());
            if (this.cameraInfoInternal.isResolvedFeatureGroupSupported(new ResolvedFeatureGroup(setPlus), sessionConfig)) {
                return new FeatureGroupResolutionResult.Supported(new ResolvedFeatureGroup(setPlus));
            }
            return FeatureGroupResolutionResult.Unsupported.INSTANCE;
        }
        int i11 = index + 1;
        FeatureGroupResolutionResult featureListResolvedByPriority = getFeatureListResolvedByPriority(sessionConfig, orderedPreferredFeatures, i11, CollectionsKt.plus((Collection<? extends GroupableFeature>) currentOptionalFeatures, orderedPreferredFeatures.get(index)));
        if (featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Supported) {
            return featureListResolvedByPriority;
        }
        return getFeatureListResolvedByPriority(sessionConfig, orderedPreferredFeatures, i11, currentOptionalFeatures);
    }

    @Override // androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver
    @NotNull
    public FeatureGroupResolutionResult resolveFeatureGroup(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<UseCase> useCases = sessionConfig.getUseCases();
        Set<GroupableFeature> requiredFeatureGroup = sessionConfig.getRequiredFeatureGroup();
        List<GroupableFeature> preferredFeatureGroup = sessionConfig.getPreferredFeatureGroup();
        if (requiredFeatureGroup.isEmpty() && preferredFeatureGroup.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (UseCase useCase : useCases) {
            if (UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                return new FeatureGroupResolutionResult.UnsupportedUseCase(useCase);
            }
        }
        Iterator<T> it = requiredFeatureGroup.iterator();
        while (it.hasNext()) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase = getMissingUseCase((GroupableFeature) it.next(), useCases);
            if (missingUseCase != null) {
                return missingUseCase;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : preferredFeatureGroup) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase2 = getMissingUseCase((GroupableFeature) obj, useCases);
            if (missingUseCase2 != null) {
                Logger.m1866d(TAG, "resolveFeatureGroup: filtered out preferred feature due to " + missingUseCase2);
            } else {
                missingUseCase2 = null;
            }
            if (missingUseCase2 == null) {
                arrayList.add(obj);
            }
        }
        Logger.m1866d(TAG, "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return getFeatureListResolvedByPriority$default(this, sessionConfig, arrayList, 0, null, 12, null);
    }
}
