package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1740#2,3:182\n1761#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final Set<KotlinType> possibleTypes;

    @NotNull
    private final Lazy supertypes$delegate;

    @NotNull
    private final SimpleType type;
    private final long value;

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    @SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2783#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleType fold(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType != null && simpleType2 != null) {
                TypeConstructor constructor = simpleType.getConstructor();
                TypeConstructor constructor2 = simpleType2.getConstructor();
                boolean z11 = constructor instanceof IntegerLiteralTypeConstructor;
                if (z11 && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                    return fold((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, mode);
                }
                if (z11) {
                    return fold((IntegerLiteralTypeConstructor) constructor, simpleType2);
                }
                if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                    return fold((IntegerLiteralTypeConstructor) constructor2, simpleType);
                }
            }
            return null;
        }

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        private final SimpleType findCommonSuperTypeOrIntersectionType(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    SimpleType simpleType = (SimpleType) it.next();
                    next = IntegerLiteralTypeConstructor.Companion.fold((SimpleType) next, simpleType, mode);
                }
                return (SimpleType) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        @Nullable
        public final SimpleType findIntersectionType(@NotNull Collection<? extends SimpleType> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return findCommonSuperTypeOrIntersectionType(types, Mode.INTERSECTION_TYPE);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set setIntersect;
            int i11 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i11 == 1) {
                setIntersect = CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else if (i11 == 2) {
                setIntersect = CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, setIntersect, null), false);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j11, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, moduleDescriptor, set);
    }

    private final List<KotlinType> getSupertypes() {
        return (List) this.supertypes$delegate.getValue();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo105126getDeclarationDescriptor() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j11, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.type = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
        this.supertypes$delegate = LazyKt.lazy(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$$Lambda$0
            private final IntegerLiteralTypeConstructor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return IntegerLiteralTypeConstructor.supertypes_delegate$lambda$2(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.value = j11;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    private final boolean isContainsOnlyUnsignedTypes() {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if (allSignedLiteralTypes != null && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (this.possibleTypes.contains((KotlinType) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final String valueToString() {
        return '[' + CollectionsKt.joinToString$default(this.possibleTypes, ",", null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return IntegerLiteralTypeConstructor.valueToString$lambda$4((KotlinType) obj);
            }
        }, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence valueToString$lambda$4(KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @NotNull
    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getSupertypes, reason: collision with other method in class */
    public Collection<KotlinType> mo105127getSupertypes() {
        return getSupertypes();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public String toString() {
        return "IntegerLiteralType" + valueToString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supertypes_delegate$lambda$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        List listMutableListOf = CollectionsKt.mutableListOf(TypeSubstitutionKt.replace$default(defaultType, CollectionsKt.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.type)), null, 2, null));
        if (!integerLiteralTypeConstructor.isContainsOnlyUnsignedTypes()) {
            listMutableListOf.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
        }
        return listMutableListOf;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }
}
