package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PackagePartProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PackagePartProvider {

    /* JADX INFO: compiled from: PackagePartProvider.kt */
    public static final class Empty implements PackagePartProvider {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        @NotNull
        public List<String> findPackageParts(@NotNull String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return CollectionsKt.emptyList();
        }

        private Empty() {
        }
    }

    @NotNull
    List<String> findPackageParts(@NotNull String str);
}
