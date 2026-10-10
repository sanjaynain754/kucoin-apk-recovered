package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1669#3,8:292\n1617#3,9:300\n1869#3:309\n1870#3:311\n1626#3:312\n1740#3,3:313\n1563#3:316\n1634#3,3:317\n1634#3,3:320\n1563#3:323\n1634#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
public final class NewCapturedTypeKt {
    private static final List<TypeProjection> captureArguments(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        UnwrappedType unwrappedTypeUnwrap;
        if (unwrappedType.getArguments().size() != unwrappedType.getConstructor().getParameters().size()) {
            return null;
        }
        List<TypeProjection> arguments = unwrappedType.getArguments();
        if (arguments == null || !arguments.isEmpty()) {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    List<Pair> listZip = CollectionsKt.zip(arguments, parameters);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
                    for (Pair pair : listZip) {
                        TypeProjection typeProjectionAsTypeProjection = (TypeProjection) pair.component1();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
                        if (typeProjectionAsTypeProjection.getProjectionKind() != Variance.INVARIANT) {
                            if (!typeProjectionAsTypeProjection.isStarProjection() && typeProjectionAsTypeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                                unwrappedTypeUnwrap = typeProjectionAsTypeProjection.getType().unwrap();
                            } else {
                                unwrappedTypeUnwrap = null;
                            }
                            Intrinsics.checkNotNull(typeParameterDescriptor);
                            typeProjectionAsTypeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrappedTypeUnwrap, typeProjectionAsTypeProjection, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjectionAsTypeProjection);
                    }
                    TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create(unwrappedType.getConstructor(), arrayList).buildSubstitutor();
                    int size = arguments.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TypeProjection typeProjection = arguments.get(i11);
                        TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i11);
                        if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                            List<KotlinType> upperBounds = unwrappedType.getConstructor().getParameters().get(i11).getUpperBounds();
                            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) it2.next(), Variance.INVARIANT).unwrap()));
                            }
                            if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection.getType().unwrap()));
                            }
                            KotlinType type = typeProjection2.getType();
                            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((NewCapturedType) type).getConstructor().initializeSupertypes(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType type, @NotNull CaptureStatus status) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        List<TypeProjection> listCaptureArguments = captureArguments(type, status);
        if (listCaptureArguments != null) {
            return replaceArguments(type, listCaptureArguments);
        }
        return null;
    }

    private static final SimpleType replaceArguments(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.simpleType$default(unwrappedType.getAttributes(), unwrappedType.getConstructor(), list, unwrappedType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
