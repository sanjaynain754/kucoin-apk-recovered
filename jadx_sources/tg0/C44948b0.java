package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41791a2;
import kotlinx.serialization.internal.C41796b2;
import kotlinx.serialization.internal.C41800c1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41859o0;
import kotlinx.serialization.internal.C41861o2;
import kotlinx.serialization.internal.C41869q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.PublishedApi;
import p852kotlin.Result;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeProjection;
import ug0.C45236a;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: renamed from: tg0.b0 */
/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001d\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\t\u001a=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0010\u001a!\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0011\u001aA\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0012\u001a#\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011\u001a-\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012\u001a9\u0010\u001a\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001\u0018\u00010\f*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0002\u0010\u001c\u001a+\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001c\u001aI\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\fH\u0002¢\u0006\u0004\b$\u0010%\u001aI\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0002¢\u0006\u0004\b&\u0010#\u001a3\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010*\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "serializer", "()Ltg0/d;", "Lyg0/a;", "(Lyg0/a;)Ltg0/d;", "Lkotlin/reflect/KType;", "type", "", "(Lkotlin/reflect/KType;)Ltg0/d;", "Lkotlin/reflect/KClass;", "kClass", "", "typeArgumentsSerializers", "", "isNullable", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ltg0/d;", "(Lyg0/a;Lkotlin/reflect/KType;)Ltg0/d;", "(Lyg0/a;Lkotlin/reflect/KClass;Ljava/util/List;Z)Ltg0/d;", "m", "failOnMissingTypeArgSerializer", "j", "(Lyg0/a;Lkotlin/reflect/KType;Z)Ltg0/d;", "rootClass", CmcdData.Factory.STREAMING_FORMAT_HLS, "typeArguments", "n", "(Lyg0/a;Ljava/util/List;Z)Ljava/util/List;", "(Lkotlin/reflect/KClass;)Ltg0/d;", CmcdData.Factory.STREAM_TYPE_LIVE, "serializers", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "elementClassifierIfArray", "g", "(Lkotlin/reflect/KClass;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ltg0/d;", "d", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ltg0/d;", "c", "shouldBeNullable", "f", "(Ltg0/d;Z)Ltg0/d;", "module", "e", "(Lyg0/a;Lkotlin/reflect/KClass;)Ltg0/d;", "kotlinx-serialization-core"}, m90085k = 5, m90086mv = {2, 0, 0}, m90088xi = 48, m90089xs = "kotlinx/serialization/SerializersKt")
@SourceDebugExtension({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,421:1\n78#2:422\n78#2:423\n78#2:430\n78#2:431\n1557#3:424\n1628#3,3:425\n1557#3:432\n1628#3,3:433\n1557#3:436\n1628#3,3:437\n78#4:428\n78#4:429\n37#5,2:440\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:422\n54#1:423\n232#1:430\n256#1:431\n190#1:424\n190#1:425,3\n267#1:432\n267#1:433,3\n269#1:436\n269#1:437,3\n223#1:428\n230#1:429\n334#1:440,2\n*E\n"})
public final /* synthetic */ class C44948b0 {
    /* JADX INFO: renamed from: d */
    public static final InterfaceC44951d<? extends Object> m99397d(KClass<Object> kClass, List<? extends InterfaceC44951d<Object>> list) {
        InterfaceC44951d[] interfaceC44951dArr = (InterfaceC44951d[]) list.toArray(new InterfaceC44951d[0]);
        return C41791a2.m91449d(kClass, (InterfaceC44951d[]) Arrays.copyOf(interfaceC44951dArr, interfaceC44951dArr.length));
    }

    /* JADX INFO: renamed from: k */
    public static final KClassifier m99404k(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final /* synthetic */ <T> InterfaceC44951d<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC44949c interfaceC44949cSerializer = C44971x.serializer((KType) null);
        Intrinsics.checkNotNull(interfaceC44949cSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (InterfaceC44951d) interfaceC44949cSerializer;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC44951d<? extends Object> m99396c(KClass<Object> kClass, List<? extends InterfaceC44951d<Object>> list, Function0<? extends KClassifier> function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new C41813f(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new C41869q0(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new C41800c1(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new C41859o0(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new C41790a1(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return C45236a.m99958j(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return C45236a.m99961m(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return C45236a.m99964p(list.get(0), list.get(1), list.get(2));
        }
        if (!C41791a2.m91460o(kClass)) {
            return null;
        }
        KClassifier kClassifierInvoke = function0.invoke();
        Intrinsics.checkNotNull(kClassifierInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return C45236a.m99949a((KClass) kClassifierInvoke, list.get(0));
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC44951d<?> m99398e(@NotNull AbstractC46494a module, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        InterfaceC44951d<?> interfaceC44951dM102576c = AbstractC46494a.m102576c(module, kClass, null, 2, null);
        if (interfaceC44951dM102576c != null) {
            return interfaceC44951dM102576c;
        }
        C41796b2.m91501f(kClass);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC44951d<T> m99399f(InterfaceC44951d<T> interfaceC44951d, boolean z11) {
        if (z11) {
            return C45236a.m99969u(interfaceC44951d);
        }
        Intrinsics.checkNotNull(interfaceC44951d, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return interfaceC44951d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final InterfaceC44951d<? extends Object> m99400g(@NotNull KClass<Object> kClass, @NotNull List<? extends InterfaceC44951d<Object>> serializers, @NotNull Function0<? extends KClassifier> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        InterfaceC44951d<? extends Object> interfaceC44951dM99396c = m99396c(kClass, serializers, elementClassifierIfArray);
        return interfaceC44951dM99396c == null ? m99397d(kClass, serializers) : interfaceC44951dM99396c;
    }

    /* JADX INFO: renamed from: i */
    public static final KClassifier m99402i() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final <T> InterfaceC44951d<T> m99405l(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        InterfaceC44951d<T> interfaceC44951dM91447b = C41791a2.m91447b(kClass);
        return interfaceC44951dM91447b == null ? C41861o2.m91672b(kClass) : interfaceC44951dM91447b;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final InterfaceC44951d<Object> m99406m(@NotNull AbstractC46494a abstractC46494a, @NotNull KType type) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return m99403j(abstractC46494a, type, false);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final List<InterfaceC44951d<Object>> m99407n(@NotNull AbstractC46494a abstractC46494a, @NotNull List<? extends KType> typeArguments, boolean z11) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z11) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10));
            Iterator<T> it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(C44971x.serializer(abstractC46494a, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeArguments, 10));
        Iterator<T> it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            InterfaceC44951d<Object> interfaceC44951dM99440e = C44971x.m99440e(abstractC46494a, (KType) it2.next());
            if (interfaceC44951dM99440e == null) {
                return null;
            }
            arrayList2.add(interfaceC44951dM99440e);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC44951d<Object> m99401h(AbstractC46494a abstractC46494a, KClass<Object> kClass, List<? extends InterfaceC44951d<Object>> list, boolean z11) {
        InterfaceC44951d<? extends Object> interfaceC44951dMo92029b;
        if (list.isEmpty()) {
            interfaceC44951dMo92029b = C44971x.m99438c(kClass);
            if (interfaceC44951dMo92029b == null) {
                interfaceC44951dMo92029b = AbstractC46494a.m102576c(abstractC46494a, kClass, null, 2, null);
            }
        } else {
            try {
                InterfaceC44951d<? extends Object> interfaceC44951dM99437b = C44971x.m99437b(kClass, list, new Function0() { // from class: tg0.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C44948b0.m99402i();
                    }
                });
                if (interfaceC44951dM99437b == null) {
                    interfaceC44951dMo92029b = abstractC46494a.mo92029b(kClass, list);
                } else {
                    interfaceC44951dMo92029b = interfaceC44951dM99437b;
                }
            } catch (IndexOutOfBoundsException e11) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e11);
            }
        }
        if (interfaceC44951dMo92029b == null) {
            return null;
        }
        return m99399f(interfaceC44951dMo92029b, z11);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC44951d<Object> m99403j(AbstractC46494a abstractC46494a, KType kType, boolean z11) {
        InterfaceC44951d<Object> interfaceC44951dM99434m;
        InterfaceC44951d<? extends Object> interfaceC44951dMo92029b;
        C44955h c44955h;
        KClass<Object> kClassM91498c = C41796b2.m91498c(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(C41796b2.m91502g((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (C41791a2.m91457l(kClassM91498c) && AbstractC46494a.m102576c(abstractC46494a, kClassM91498c, null, 2, null) != null) {
                interfaceC44951dM99434m = null;
            } else {
                interfaceC44951dM99434m = C44970w.m99434m(kClassM91498c, zIsMarkedNullable);
            }
        } else if (abstractC46494a.getHasInterfaceContextualSerializers()) {
            interfaceC44951dM99434m = null;
        } else {
            Object objM99435n = C44970w.m99435n(kClassM91498c, arrayList, zIsMarkedNullable);
            if (Result.m103850isFailureimpl(objM99435n)) {
                objM99435n = null;
            }
            interfaceC44951dM99434m = (InterfaceC44951d) objM99435n;
        }
        if (interfaceC44951dM99434m != null) {
            return interfaceC44951dM99434m;
        }
        if (arrayList.isEmpty()) {
            interfaceC44951dMo92029b = C44971x.m99438c(kClassM91498c);
            if (interfaceC44951dMo92029b == null && (interfaceC44951dMo92029b = AbstractC46494a.m102576c(abstractC46494a, kClassM91498c, null, 2, null)) == null) {
                if (C41791a2.m91457l(kClassM91498c)) {
                    c44955h = new C44955h(kClassM91498c);
                    interfaceC44951dMo92029b = c44955h;
                } else {
                    interfaceC44951dMo92029b = null;
                }
            }
        } else {
            List<InterfaceC44951d<Object>> listM99441f = C44971x.m99441f(abstractC46494a, arrayList, z11);
            if (listM99441f == null) {
                return null;
            }
            InterfaceC44951d<? extends Object> interfaceC44951dM99437b = C44971x.m99437b(kClassM91498c, listM99441f, new Function0() { // from class: tg0.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44948b0.m99404k(arrayList);
                }
            });
            if (interfaceC44951dM99437b == null) {
                interfaceC44951dMo92029b = abstractC46494a.mo92029b(kClassM91498c, listM99441f);
                if (interfaceC44951dMo92029b == null) {
                    if (!C41791a2.m91457l(kClassM91498c)) {
                        interfaceC44951dMo92029b = null;
                    } else {
                        c44955h = new C44955h(kClassM91498c);
                        interfaceC44951dMo92029b = c44955h;
                    }
                }
            } else {
                interfaceC44951dMo92029b = interfaceC44951dM99437b;
            }
        }
        if (interfaceC44951dMo92029b == null) {
            return null;
        }
        return m99399f(interfaceC44951dMo92029b, zIsMarkedNullable);
    }

    public static final /* synthetic */ <T> InterfaceC44951d<T> serializer(AbstractC46494a abstractC46494a) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC44949c interfaceC44949cSerializer = C44971x.serializer(abstractC46494a, (KType) null);
        Intrinsics.checkNotNull(interfaceC44949cSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (InterfaceC44951d) interfaceC44949cSerializer;
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C44971x.serializer(C46495b.m102577a(), type);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers, boolean z11) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return C44971x.serializer(C46495b.m102577a(), kClass, typeArgumentsSerializers, z11);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull KType type) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC44951d<Object> interfaceC44951dM99403j = m99403j(abstractC46494a, type, true);
        if (interfaceC44951dM99403j != null) {
            return interfaceC44951dM99403j;
        }
        C41791a2.m91461p(C41796b2.m91498c(type));
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull KClass<?> kClass, @NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers, boolean z11) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        InterfaceC44951d<Object> interfaceC44951dM99401h = m99401h(abstractC46494a, kClass, typeArgumentsSerializers, z11);
        if (interfaceC44951dM99401h != null) {
            return interfaceC44951dM99401h;
        }
        C41791a2.m91461p(kClass);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final <T> InterfaceC44951d<T> serializer(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        InterfaceC44951d<T> interfaceC44951dM99438c = C44971x.m99438c(kClass);
        if (interfaceC44951dM99438c != null) {
            return interfaceC44951dM99438c;
        }
        C41796b2.m91501f(kClass);
        throw new KotlinNothingValueException();
    }
}
