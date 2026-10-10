package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.modules.b */
/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bî\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012A\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0019*\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u0019*\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 JA\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010+R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+RO\u0010\u0013\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, m90084d2 = {"Lkotlinx/serialization/modules/b;", "Lyg0/a;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/a;", "class2ContextualFactory", "Ltg0/d;", "polyBase2Serializers", "Lkotlin/Function1;", "Ltg0/p;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "Ltg0/c;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", ExifInterface.GPS_DIRECTION_TRUE, "baseClass", "value", "f", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ltg0/p;", "serializedClassName", "e", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ltg0/c;", "kClass", "", "typeArgumentsSerializers", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ltg0/d;", "Lkotlinx/serialization/modules/d;", "collector", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/modules/d;)V", "Ljava/util/Map;", "c", "d", "Z", "()Z", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
public final class C41966b extends AbstractC46494a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, AbstractC41965a> class2ContextualFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Map<KClass<?>, Map<KClass<?>, InterfaceC44951d<?>>> polyBase2Serializers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Function1<?, InterfaceC44963p<?>>> polyBase2DefaultSerializerProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Map<String, InterfaceC44951d<?>>> polyBase2NamedSerializers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Function1<String, InterfaceC44949c<?>>> polyBase2DefaultDeserializerProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean hasInterfaceContextualSerializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41966b(@NotNull Map<KClass<?>, ? extends AbstractC41965a> class2ContextualFactory, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends InterfaceC44951d<?>>> polyBase2Serializers, @NotNull Map<KClass<?>, ? extends Function1<?, ? extends InterfaceC44963p<?>>> polyBase2DefaultSerializerProvider, @NotNull Map<KClass<?>, ? extends Map<String, ? extends InterfaceC44951d<?>>> polyBase2NamedSerializers, @NotNull Map<KClass<?>, ? extends Function1<? super String, ? extends InterfaceC44949c<?>>> polyBase2DefaultDeserializerProvider, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z11;
    }

    @Override // yg0.AbstractC46494a
    /* JADX INFO: renamed from: a */
    public void mo92028a(@NotNull InterfaceC41968d collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<KClass<?>, AbstractC41965a> entry : this.class2ContextualFactory.entrySet()) {
            KClass<?> key = entry.getKey();
            AbstractC41965a value = entry.getValue();
            if (value instanceof AbstractC41965a.a) {
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC44951d<?> interfaceC44951dM92026b = ((AbstractC41965a.a) value).m92026b();
                Intrinsics.checkNotNull(interfaceC44951dM92026b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo91989b(key, interfaceC44951dM92026b);
            } else {
                if (!(value instanceof AbstractC41965a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.mo91992e(key, ((AbstractC41965a.b) value).m92027b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, InterfaceC44951d<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, InterfaceC44951d<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                InterfaceC44951d<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo91990c(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, InterfaceC44963p<?>>> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, InterfaceC44963p<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.mo91991d(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, InterfaceC44949c<?>>> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, InterfaceC44949c<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.mo91988a(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }

    @Override // yg0.AbstractC46494a
    @Nullable
    /* JADX INFO: renamed from: b */
    public <T> InterfaceC44951d<T> mo92029b(@NotNull KClass<T> kClass, @NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC41965a abstractC41965a = this.class2ContextualFactory.get(kClass);
        InterfaceC44951d<T> interfaceC44951d = abstractC41965a != null ? (InterfaceC44951d<T>) abstractC41965a.mo92025a(typeArgumentsSerializers) : null;
        if (interfaceC44951d instanceof InterfaceC44951d) {
            return interfaceC44951d;
        }
        return null;
    }

    @Override // yg0.AbstractC46494a
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getHasInterfaceContextualSerializers() {
        return this.hasInterfaceContextualSerializers;
    }

    @Override // yg0.AbstractC46494a
    @Nullable
    /* JADX INFO: renamed from: e */
    public <T> InterfaceC44949c<T> mo92031e(@NotNull KClass<? super T> baseClass, @Nullable String serializedClassName) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, InterfaceC44951d<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        InterfaceC44951d<?> interfaceC44951d = map != null ? map.get(serializedClassName) : null;
        if (!(interfaceC44951d instanceof InterfaceC44951d)) {
            interfaceC44951d = null;
        }
        if (interfaceC44951d != null) {
            return interfaceC44951d;
        }
        Function1<String, InterfaceC44949c<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1<String, InterfaceC44949c<?>> function2 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (InterfaceC44949c) function2.invoke(serializedClassName);
        }
        return null;
    }

    @Override // yg0.AbstractC46494a
    @Nullable
    /* JADX INFO: renamed from: f */
    public <T> InterfaceC44963p<T> mo92032f(@NotNull KClass<? super T> baseClass, @NotNull T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map<KClass<?>, InterfaceC44951d<?>> map = this.polyBase2Serializers.get(baseClass);
        InterfaceC44951d<?> interfaceC44951d = map != null ? map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        InterfaceC44951d<?> interfaceC44951d2 = interfaceC44951d instanceof InterfaceC44963p ? interfaceC44951d : null;
        if (interfaceC44951d2 != null) {
            return interfaceC44951d2;
        }
        Function1<?, InterfaceC44963p<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        Function1<?, InterfaceC44963p<?>> function2 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (InterfaceC44963p) function2.invoke(value);
        }
        return null;
    }
}
