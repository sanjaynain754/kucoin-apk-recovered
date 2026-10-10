package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: loaded from: classes61.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    int getIndex();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    TypeParameterDescriptor getOriginal();

    @NotNull
    StorageManager getStorageManager();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    TypeConstructor getTypeConstructor();

    @NotNull
    List<KotlinType> getUpperBounds();

    @NotNull
    Variance getVariance();

    boolean isCapturedFromOuterDeclaration();

    boolean isReified();
}
