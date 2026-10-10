package p852kotlin.reflect.jvm.internal.impl.incremental;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class UtilsKt {
    public static final void record(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation from, @NotNull ClassDescriptor scopeOwner, @NotNull Name name) {
        LocationInfo location;
        Intrinsics.checkNotNullParameter(lookupTracker, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION();
        String filePath = location.getFilePath();
        String strAsString = DescriptorUtils.getFqName(scopeOwner).asString();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String strAsString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
        lookupTracker.record(filePath, position, strAsString, scopeKind, strAsString2);
    }

    public static final void recordPackageLookup(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation from, @NotNull String packageFqName, @NotNull String name) {
        LocationInfo location;
        Intrinsics.checkNotNullParameter(lookupTracker, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        lookupTracker.record(location.getFilePath(), lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION(), packageFqName, ScopeKind.PACKAGE, name);
    }

    public static final void record(@NotNull LookupTracker lookupTracker, @NotNull LookupLocation from, @NotNull PackageFragmentDescriptor scopeOwner, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(lookupTracker, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = scopeOwner.getFqName().asString();
        String strAsString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
        recordPackageLookup(lookupTracker, from, strAsString, strAsString2);
    }
}
