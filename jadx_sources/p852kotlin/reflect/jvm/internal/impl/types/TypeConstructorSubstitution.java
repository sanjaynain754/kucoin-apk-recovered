package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    @SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1563#2:208\n1634#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull KotlinType kotlinType) {
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return companion.createByConstructorsMap(map, z11);
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> arguments) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.isCapturedFromOuterDeclaration()) {
                return new IndexedParametersSubstitution(parameters, arguments);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
            }
            return createByConstructorsMap$default(this, MapsKt.toMap(CollectionsKt.zip(arrayList, arguments)), false, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z11) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z11;
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    return map.get(key);
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }
            };
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: get */
    public TypeProjection mo105131get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key.getConstructor());
    }

    @Nullable
    public abstract TypeProjection get(@NotNull TypeConstructor typeConstructor);

    @JvmStatic
    @NotNull
    public static final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }
}
