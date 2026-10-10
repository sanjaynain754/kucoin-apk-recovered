package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: KotlinTypePreparator.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1563#3:78\n1634#3,3:79\n1563#3:82\n1634#3,3:83\n1563#3:92\n1634#3,2:93\n1636#3:102\n98#4,6:86\n104#4:95\n105#4,5:97\n112#4,7:103\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:102\n48#1:86,6\n48#1:95\n48#1:97,5\n48#1:103,7\n48#1:96\n*E\n"})
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$prepareType$1 */
    /* JADX INFO: compiled from: KotlinTypePreparator.kt */
    public static final /* synthetic */ class C414401 extends FunctionReferenceImpl implements Function1<KotlinTypeMarker, UnwrappedType> {
        public C414401(Object obj) {
            super(1, obj, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final UnwrappedType invoke(KotlinTypeMarker p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return ((KotlinTypePreparator) this.receiver).prepareType(p11);
        }
    }

    /* JADX INFO: compiled from: KotlinTypePreparator.kt */
    public static final class Default extends KotlinTypePreparator {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    @NotNull
    public UnwrappedType prepareType(@NotNull KotlinTypeMarker type) {
        UnwrappedType unwrappedTypeFlexibleType;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedTypeUnwrap = ((KotlinType) type).unwrap();
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            unwrappedTypeFlexibleType = transformToNewType((SimpleType) unwrappedTypeUnwrap);
        } else {
            if (!(unwrappedTypeUnwrap instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            SimpleType simpleTypeTransformToNewType = transformToNewType(flexibleType.getLowerBound());
            SimpleType simpleTypeTransformToNewType2 = transformToNewType(flexibleType.getUpperBound());
            unwrappedTypeFlexibleType = (simpleTypeTransformToNewType == flexibleType.getLowerBound() && simpleTypeTransformToNewType2 == flexibleType.getUpperBound()) ? unwrappedTypeUnwrap : KotlinTypeFactory.flexibleType(simpleTypeTransformToNewType, simpleTypeTransformToNewType2);
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeFlexibleType, unwrappedTypeUnwrap, new C414401(this));
    }

    private final SimpleType transformToNewType(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor constructor = simpleType.getConstructor();
        IntersectionTypeConstructor alternative = null;
        unwrappedTypeUnwrap = null;
        UnwrappedType unwrappedTypeUnwrap = null;
        KotlinType kotlinTypeMakeNullable = null;
        if (constructor instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) constructor;
            TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.getProjectionKind() != Variance.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                unwrappedTypeUnwrap = type.unwrap();
            }
            UnwrappedType unwrappedType = unwrappedTypeUnwrap;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                Collection<KotlinType> collectionMo105127getSupertypes = capturedTypeConstructorImpl.mo105127getSupertypes();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo105127getSupertypes, 10));
                Iterator<T> it = collectionMo105127getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new NewCapturedTypeConstructor(projection2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            Intrinsics.checkNotNull(newTypeConstructor);
            return new NewCapturedType(captureStatus, newTypeConstructor, unwrappedType, simpleType.getAttributes(), simpleType.isMarkedNullable(), false, 32, null);
        }
        boolean z11 = false;
        if (constructor instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> collectionMo105127getSupertypes2 = ((IntegerValueTypeConstructor) constructor).mo105127getSupertypes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo105127getSupertypes2, 10));
            Iterator<T> it2 = collectionMo105127getSupertypes2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeMakeNullableAsSpecified = TypeUtils.makeNullableAsSpecified((KotlinType) it2.next(), simpleType.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableAsSpecified, "makeNullableAsSpecified(...)");
                arrayList2.add(kotlinTypeMakeNullableAsSpecified);
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAttributes(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.emptyList(), false, simpleType.getMemberScope());
        }
        if ((constructor instanceof IntersectionTypeConstructor) && simpleType.isMarkedNullable()) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
            Collection<KotlinType> collectionMo105127getSupertypes3 = intersectionTypeConstructor.mo105127getSupertypes();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo105127getSupertypes3, 10));
            Iterator<T> it3 = collectionMo105127getSupertypes3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TypeUtilsKt.makeNullable((KotlinType) it3.next()));
                z11 = true;
            }
            if (z11) {
                KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
                if (alternativeType != null) {
                    kotlinTypeMakeNullable = TypeUtilsKt.makeNullable(alternativeType);
                }
                alternative = new IntersectionTypeConstructor(arrayList3).setAlternative(kotlinTypeMakeNullable);
            }
            if (alternative != null) {
                intersectionTypeConstructor = alternative;
            }
            return intersectionTypeConstructor.createType();
        }
        return simpleType;
    }
}
