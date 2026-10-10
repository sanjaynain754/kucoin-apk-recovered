package p852kotlin.reflect.full;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.TypeCastException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KFunction;
import p852kotlin.reflect.KParameter;
import p852kotlin.reflect.KProperty0;
import p852kotlin.reflect.KProperty1;
import p852kotlin.reflect.KProperty2;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.jvm.internal.KCallableImpl;
import p852kotlin.reflect.jvm.internal.KClassImpl;
import p852kotlin.reflect.jvm.internal.KFunctionImpl;
import p852kotlin.reflect.jvm.internal.KTypeImpl;
import p852kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\u001a\u001c\u0010S\u001a\u00020D*\u0006\u0012\u0002\b\u00030\u00042\n\u0010T\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007\u001a\u001c\u0010U\u001a\u00020D*\u0006\u0012\u0002\b\u00030\u00042\n\u0010V\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007\u001a+\u0010W\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010X\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010Y\u001a-\u0010Z\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010X\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010Y\u001a!\u0010[\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\"6\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"$\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010\"\"\u0010\u0011\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0015\",\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u001b\",\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u001b\",\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u001b\",\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\u001b\",\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u001b\",\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u001b\",\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\u001b\",\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\u001b\",\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u001b\">\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u0003060\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\u001b\"B\u00109\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u0003\u0012\u0002\b\u00030:0\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\u001b\">\u0010=\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u0003060\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\u001b\"B\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u0003\u0012\u0002\b\u00030:0\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\u001b\"\u001c\u0010C\u001a\u00020D*\u0006\u0012\u0002\b\u00030E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010F\"\u001c\u0010G\u001a\u00020D*\u0006\u0012\u0002\b\u00030E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010F\",\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040I*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010L\"(\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\u001b\",\u0010P\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0017*\u0006\u0012\u0002\b\u00030\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\u001b¨\u0006\\"}, m90084d2 = {"primaryConstructor", "Lkotlin/reflect/KFunction;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KClass;", "getPrimaryConstructor$annotations", "(Lkotlin/reflect/KClass;)V", "getPrimaryConstructor", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;", "companionObject", "getCompanionObject$annotations", "getCompanionObject", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "companionObjectInstance", "getCompanionObjectInstance$annotations", "getCompanionObjectInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "defaultType", "Lkotlin/reflect/KType;", "getDefaultType$annotations", "getDefaultType", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "declaredMembers", "", "Lkotlin/reflect/KCallable;", "getDeclaredMembers$annotations", "getDeclaredMembers", "(Lkotlin/reflect/KClass;)Ljava/util/Collection;", "functions", "getFunctions$annotations", "getFunctions", "staticFunctions", "getStaticFunctions$annotations", "getStaticFunctions", "memberFunctions", "getMemberFunctions$annotations", "getMemberFunctions", "memberExtensionFunctions", "getMemberExtensionFunctions$annotations", "getMemberExtensionFunctions", "declaredFunctions", "getDeclaredFunctions$annotations", "getDeclaredFunctions", "declaredMemberFunctions", "getDeclaredMemberFunctions$annotations", "getDeclaredMemberFunctions", "declaredMemberExtensionFunctions", "getDeclaredMemberExtensionFunctions$annotations", "getDeclaredMemberExtensionFunctions", "staticProperties", "Lkotlin/reflect/KProperty0;", "getStaticProperties$annotations", "getStaticProperties", "memberProperties", "Lkotlin/reflect/KProperty1;", "getMemberProperties$annotations", "getMemberProperties", "memberExtensionProperties", "Lkotlin/reflect/KProperty2;", "getMemberExtensionProperties$annotations", "getMemberExtensionProperties", "declaredMemberProperties", "getDeclaredMemberProperties$annotations", "getDeclaredMemberProperties", "declaredMemberExtensionProperties", "getDeclaredMemberExtensionProperties$annotations", "getDeclaredMemberExtensionProperties", "isExtension", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;)Z", "isNotExtension", "superclasses", "", "getSuperclasses$annotations", "getSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "allSupertypes", "getAllSupertypes$annotations", "getAllSupertypes", "allSuperclasses", "getAllSuperclasses$annotations", "getAllSuperclasses", "isSubclassOf", TtmlNode.RUBY_BASE, "isSuperclassOf", "derived", "cast", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "createInstance", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KClasses")
@SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n295#2,2:280\n295#2,2:282\n808#2,11:284\n808#2,11:295\n774#2:306\n865#2,2:307\n774#2:309\n865#2,2:310\n808#2,11:312\n774#2:323\n865#2,2:324\n774#2:326\n865#2,2:327\n774#2:329\n865#2,2:330\n774#2:332\n865#2,2:333\n774#2:335\n865#2,2:336\n774#2:338\n865#2,2:339\n774#2:341\n865#2,2:342\n1617#2,9:344\n1869#2:353\n1870#2:355\n1626#2:356\n1563#2:357\n1634#2,3:358\n669#2,4:361\n1740#2,3:365\n673#2,7:368\n1563#2:375\n1634#2,3:376\n1#3:354\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:280,2\n47#1:282,2\n87#1:284,11\n94#1:295,11\n101#1:306\n101#1:307,2\n108#1:309\n108#1:310,2\n117#1:312,11\n124#1:323\n124#1:324,2\n131#1:326\n131#1:327,2\n139#1:329\n139#1:330,2\n146#1:332\n146#1:333,2\n153#1:335\n153#1:336,2\n160#1:338\n160#1:339,2\n167#1:341\n167#1:342,2\n182#1:344,9\n182#1:353\n182#1:355\n182#1:356\n221#1:357\n221#1:358,3\n274#1:361,4\n274#1:365,3\n274#1:368,7\n198#1:375\n198#1:376,3\n182#1:354\n*E\n"})
public final class KClasses {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Type _get_defaultType_$lambda$1(KClass kClass) {
        return ((KClassImpl) kClass).getJClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> T cast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (kClass.isInstance(obj)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast");
            return obj;
        }
        throw new TypeCastException("Value cannot be cast to " + kClass.getQualifiedName());
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> T createInstance(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = kClass.getConstructors().iterator();
        T t11 = null;
        boolean z11 = false;
        T t12 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z11) {
                    break;
                }
                t11 = t12;
                break;
            }
            T next = it.next();
            List<KParameter> parameters = ((KFunction) next).getParameters();
            if (parameters == null || !parameters.isEmpty()) {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((KParameter) it2.next()).isOptional()) {
                        }
                    }
                }
            }
            if (z11) {
                break;
            }
            z11 = true;
            t12 = next;
        }
        KFunction kFunction = (KFunction) t11;
        if (kFunction != null) {
            return (T) kFunction.callBy(MapsKt.emptyMap());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + kClass);
    }

    @NotNull
    public static final Collection<KClass<?>> getAllSuperclasses(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KType> allSupertypes = getAllSupertypes(kClass);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allSupertypes, 10));
        for (KType kType : allSupertypes) {
            KClassifier classifier = kType.getClassifier();
            KClass kClass2 = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass2 == null) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
            }
            arrayList.add(kClass2);
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KType> getAllSupertypes(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Object objDfs = DFS.dfs(kClass.getSupertypes(), new DFS.Neighbors() { // from class: kotlin.reflect.full.KClasses$$Lambda$1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return KClasses._get_allSupertypes_$lambda$14((KType) obj);
            }
        }, new DFS.VisitedWithSet(), new DFS.NodeHandlerWithListResult<KType, KType>() { // from class: kotlin.reflect.full.KClasses$allSupertypes$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(KType current) {
                Intrinsics.checkNotNullParameter(current, "current");
                ((LinkedList) this.result).add(current);
                return true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objDfs, "dfs(...)");
        return (Collection) objDfs;
    }

    @Nullable
    public static final KClass<?> getCompanionObject(@NotNull KClass<?> kClass) {
        Object next;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = kClass.getNestedClasses().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((KClass) next).isCompanion()) {
                return (KClass) next;
            }
        }
        next = null;
        return (KClass) next;
    }

    @Nullable
    public static final Object getCompanionObjectInstance(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KClass<?> companionObject = getCompanionObject(kClass);
        if (companionObject != null) {
            return companionObject.getObjectInstance();
        }
        return null;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredMembers) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredMemberExtensionFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty2<T, ?, ?>> getDeclaredMemberExtensionProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t11 : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t11;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredMemberFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty1<T, ?>> getDeclaredMemberProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t11 : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t11;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KCallable<?>> getDeclaredMembers(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
    }

    @NotNull
    public static final KType getDefaultType(@NotNull final KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        SimpleType defaultType = ((KClassImpl) kClass).getDescriptor().getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return new KTypeImpl(defaultType, new Function0(kClass) { // from class: kotlin.reflect.full.KClasses$$Lambda$0
            private final KClass arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KClasses._get_defaultType_$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = kClass;
            }
        });
    }

    @NotNull
    public static final Collection<KFunction<?>> getFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallable<?>> members = kClass.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getMemberExtensionFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty2<T, ?, ?>> getMemberExtensionProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t11 : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t11;
            if (isExtension(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getMemberFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty1<T, ?>> getMemberProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t11 : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t11;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final <T> KFunction<T> getPrimaryConstructor(@NotNull KClass<T> kClass) {
        T next;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = ((KClassImpl) kClass).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            KFunction kFunction = (KFunction) next;
            Intrinsics.checkNotNull(kFunction, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            FunctionDescriptor descriptor = ((KFunctionImpl) kFunction).getDescriptor();
            Intrinsics.checkNotNull(descriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((ConstructorDescriptor) descriptor).isPrimary()) {
                return (KFunction) next;
            }
        }
        next = null;
        return (KFunction) next;
    }

    @NotNull
    public static final Collection<KFunction<?>> getStaticFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KProperty0<?>> getStaticProperties(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (isNotExtension(kCallableImpl) && (kCallableImpl instanceof KProperty0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<KClass<?>> getSuperclasses(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        List<KType> supertypes = kClass.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            KClassifier classifier = ((KType) it.next()).getClassifier();
            KClass kClass2 = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSubclassOf(@NotNull KClass<?> kClass, @NotNull final KClass<?> base) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        if (Intrinsics.areEqual(kClass, base)) {
            return true;
        }
        List listListOf = CollectionsKt.listOf(kClass);
        final C412661 c412661 = new PropertyReference1Impl() { // from class: kotlin.reflect.full.KClasses.isSubclassOf.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return KClasses.getSuperclasses((KClass) obj);
            }
        };
        return DFS.ifAny(listListOf, new DFS.Neighbors(c412661) { // from class: kotlin.reflect.full.KClasses$$Lambda$2
            private final KProperty1 arg$0;

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return KClasses.isSubclassOf$lambda$16(this.arg$0, (KClass) obj);
            }

            {
                this.arg$0 = c412661;
            }
        }, new Function1(base) { // from class: kotlin.reflect.full.KClasses$$Lambda$3
            private final KClass arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return KClasses.isSubclassOf$lambda$17(this.arg$0, (KClass) obj);
            }

            {
                this.arg$0 = base;
            }
        }).booleanValue();
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSuperclassOf(@NotNull KClass<?> kClass, @NotNull KClass<?> derived) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(derived, "derived");
        return isSubclassOf(derived, kClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final <T> T safeCast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (!kClass.isInstance(obj)) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable _get_allSupertypes_$lambda$14(KType kType) {
        KClass kClass;
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            kClass = (KClass) classifier;
        } else {
            kClass = null;
        }
        if (kClass != null) {
            List<KType> supertypes = kClass.getSupertypes();
            if (kType.getArguments().isEmpty()) {
                return supertypes;
            }
            Intrinsics.checkNotNull(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(((KTypeImpl) kType).getType());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supertypes, 10));
            for (KType kType2 : supertypes) {
                Intrinsics.checkNotNull(kType2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                KotlinType kotlinTypeSubstitute = typeSubstitutorCreate.substitute(((KTypeImpl) kType2).getType(), Variance.INVARIANT);
                if (kotlinTypeSubstitute != null) {
                    arrayList.add(new KTypeImpl(kotlinTypeSubstitute, null, 2, null));
                } else {
                    throw new KotlinReflectionInternalError("Type substitution failed: " + kType2 + " (" + kType + ')');
                }
            }
            return arrayList;
        }
        throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
    }

    private static final boolean isExtension(KCallableImpl<?> kCallableImpl) {
        if (kCallableImpl.getDescriptor().getExtensionReceiverParameter() != null) {
            return true;
        }
        return false;
    }

    private static final boolean isNotExtension(KCallableImpl<?> kCallableImpl) {
        return !isExtension(kCallableImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable isSubclassOf$lambda$16(KProperty1 kProperty1, KClass kClass) {
        return (Iterable) kProperty1.invoke(kClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isSubclassOf$lambda$17(KClass kClass, KClass kClass2) {
        return Boolean.valueOf(Intrinsics.areEqual(kClass2, kClass));
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getAllSuperclasses$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getAllSupertypes$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getCompanionObject$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getCompanionObjectInstance$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberExtensionFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberExtensionProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMembers$annotations(KClass kClass) {
    }

    @Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDefaultType$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberExtensionFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberExtensionProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getPrimaryConstructor$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getStaticFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getStaticProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getSuperclasses$annotations(KClass kClass) {
    }
}
