package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: DeserializedClassDataFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDeserializedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedClassDataFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class DeserializedClassDataFinder implements ClassDataFinder {

    @NotNull
    private final PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.packageFragmentProvider = packageFragmentProvider;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        ClassData classDataFindClassData;
        Intrinsics.checkNotNullParameter(classId, "classId");
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.packageFragments(this.packageFragmentProvider, classId.getPackageFqName())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataFindClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return classDataFindClassData;
            }
        }
        return null;
    }
}
