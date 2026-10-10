package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.AbstractC41793b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.Grouping;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.text.Typography;
import ug0.C45236a;
import vg0.AbstractC45531d;
import vg0.AbstractC45541n;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: tg0.m */
/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R0\u0010,\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R(\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+¨\u0006."}, m90084d2 = {"Ltg0/m;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/b;", "", "serialName", "Lkotlin/reflect/KClass;", "baseClass", "", "subclasses", "Ltg0/d;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Ltg0/d;)V", "", "classAnnotations", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Ltg0/d;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "klassName", "Ltg0/c;", "c", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Ltg0/c;", "Lwg0/c;", "encoder", "value", "Ltg0/p;", "d", "(Lwg0/c;Ljava/lang/Object;)Ltg0/p;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "", "b", "Ljava/util/List;", "_annotations", "Lvg0/f;", "Lkotlin/Lazy;", "getDescriptor", "()Lvg0/f;", "descriptor", "", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n1544#2:155\n1246#2,4:165\n53#3:156\n80#3,6:157\n462#4:163\n412#4:164\n82#5:169\n216#6,2:170\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n109#1:170,2\n*E\n"})
public final class C44960m<T> extends AbstractC41793b<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KClass<T> baseClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy descriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<? extends T>, InterfaceC44951d<? extends T>> class2Serializer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC44951d<? extends T>> serialName2Serializer;

    /* JADX INFO: renamed from: tg0.m$a */
    /* JADX INFO: compiled from: _Collections.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b¸\u0006\u0000"}, m90084d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "sourceIterator", "()Ljava/util/Iterator;", "element", "keyOf", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n1#1,1546:1\n130#2:1547\n*E\n"})
    public static final class a implements Grouping<Map.Entry<? extends KClass<? extends T>, ? extends InterfaceC44951d<? extends T>>, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f101359a;

        public a(Iterable iterable) {
            this.f101359a = iterable;
        }

        @Override // p852kotlin.collections.Grouping
        public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends InterfaceC44951d<? extends T>> element) {
            return element.getValue().getDescriptor().getSerialName();
        }

        @Override // p852kotlin.collections.Grouping
        public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends InterfaceC44951d<? extends T>>> sourceIterator() {
            return this.f101359a.iterator();
        }
    }

    public C44960m(@NotNull final String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull InterfaceC44951d<? extends T>[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: tg0.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44960m.m99419i(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + mo91487e().getSimpleName() + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, InterfaceC44951d<? extends T>> map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.class2Serializer = map;
        Grouping aVar = new a(map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = aVar.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object objKeyOf = aVar.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + mo91487e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC44951d) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC45533f m99419i(String str, final C44960m c44960m) {
        return C45540m.m100547h(str, AbstractC45531d.b.f102598a, new InterfaceC45533f[0], new Function1() { // from class: tg0.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44960m.m99420j(this.f101352b, (C45528a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m99420j(final C44960m c44960m, C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C45528a.m100517b(buildSerialDescriptor, "type", C45236a.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "value", C45540m.m100547h("kotlinx.serialization.Sealed<" + c44960m.mo91487e().getSimpleName() + Typography.greater, AbstractC45541n.a.f102628a, new InterfaceC45533f[0], new Function1() { // from class: tg0.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44960m.m99421k(this.f101353b, (C45528a) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.m100524h(c44960m._annotations);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m99421k(C44960m c44960m, C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, InterfaceC44951d<? extends T>> entry : c44960m.serialName2Serializer.entrySet()) {
            C45528a.m100517b(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.AbstractC41793b
    @Nullable
    /* JADX INFO: renamed from: c */
    public InterfaceC44949c<T> mo91485c(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC44951d<? extends T> interfaceC44951d = this.serialName2Serializer.get(klassName);
        return interfaceC44951d != null ? interfaceC44951d : super.mo91485c(decoder, klassName);
    }

    @Override // kotlinx.serialization.internal.AbstractC41793b
    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC44963p<T> mo91486d(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC44951d<? extends T> interfaceC44951d = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        InterfaceC44951d<? extends T> interfaceC44951dMo91486d = interfaceC44951d != null ? interfaceC44951d : super.mo91486d(encoder, value);
        if (interfaceC44951dMo91486d != null) {
            return interfaceC44951dMo91486d;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractC41793b
    @NotNull
    /* JADX INFO: renamed from: e */
    public KClass<T> mo91487e() {
        return this.baseClass;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return (InterfaceC45533f) this.descriptor.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public C44960m(@NotNull String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull InterfaceC44951d<? extends T>[] subclassSerializers, @NotNull Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = ArraysKt.asList(classAnnotations);
    }
}
