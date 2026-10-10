package p852kotlin.reflect.jvm.internal.impl.descriptors.java;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: compiled from: JavaVisibilities.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaVisibilities {

    @NotNull
    public static final JavaVisibilities INSTANCE = new JavaVisibilities();

    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class PackageVisibility extends Visibility {

        @NotNull
        public static final PackageVisibility INSTANCE = new PackageVisibility();

        private PackageVisibility() {
            super(TPDownloadProxyEnum.DLPARAM_PACKAGE, false);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "public/*package*/";
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            if (Visibilities.INSTANCE.isPrivate(visibility)) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class ProtectedAndPackage extends Visibility {

        @NotNull
        public static final ProtectedAndPackage INSTANCE = new ProtectedAndPackage();

        private ProtectedAndPackage() {
            super("protected_and_package", true);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (Intrinsics.areEqual(this, visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.INSTANCE) {
                return null;
            }
            if (Visibilities.INSTANCE.isPrivate(visibility)) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: JavaVisibilities.kt */
    public static final class ProtectedStaticVisibility extends Visibility {

        @NotNull
        public static final ProtectedStaticVisibility INSTANCE = new ProtectedStaticVisibility();

        private ProtectedStaticVisibility() {
            super("protected_static", true);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    private JavaVisibilities() {
    }
}
