package p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1563#2:154\n1634#2,3:155\n37#3:158\n36#3,3:159\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158\n127#1:159,3\n*E\n"})
public final class CapturedTypeConstructorKt {
    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection createCapturedIfNeeded(final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new Function0(typeProjection) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$$Lambda$0
            private final TypeProjection arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return CapturedTypeConstructorKt.createCapturedIfNeeded$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = typeProjection;
            }
        }));
    }

    public static final boolean isCaptured(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    @NotNull
    public static final TypeSubstitution wrapWithCapturingSubstitution(@NotNull TypeSubstitution typeSubstitution, final boolean z11) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
                @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z11;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: get */
                public TypeProjection mo105131get(KotlinType key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    TypeProjection typeProjectionMo105131get = super.mo105131get(key);
                    if (typeProjectionMo105131get == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = key.getConstructor().mo105126getDeclarationDescriptor();
                    return CapturedTypeConstructorKt.createCapturedIfNeeded(typeProjectionMo105131get, classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        List<Pair> listZip = ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            arrayList.add(createCapturedIfNeeded((TypeProjection) pair.getFirst(), (TypeParameterDescriptor) pair.getSecond()));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType createCapturedIfNeeded$lambda$1(TypeProjection typeProjection) {
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @NotNull
    public static final KotlinType createCapturedType(@NotNull TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }
}
