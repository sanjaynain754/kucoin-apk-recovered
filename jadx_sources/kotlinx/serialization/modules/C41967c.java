package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41791a2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.modules.c */
/* JADX INFO: compiled from: SerializersModuleBuilders.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJX\u0010\u0013\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062/\u0010\u0012\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u001a\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u0004\"\b\b\u0001\u0010\u0016*\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001f\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001e\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0014JT\u0010$\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\rH\u0016¢\u0006\u0004\b$\u0010\u0014J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J9\u0010-\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0012\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.JZ\u0010/\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001e\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\r2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b/\u00100J\\\u00101\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\r2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b1\u00100JW\u00104\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u0004\"\b\b\u0001\u0010\u0016*\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020%H\u0001¢\u0006\u0004\b6\u00107R$\u0010:\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020*088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00109R8\u0010;\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b08088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R<\u0010=\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001d0\rj\u0006\u0012\u0002\b\u0003`<088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109R4\u0010>\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b08088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109RO\u0010@\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\"0\rj\u0006\u0012\u0002\b\u0003`?088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010A¨\u0006C"}, m90084d2 = {"Lkotlinx/serialization/modules/c;", "Lkotlinx/serialization/modules/d;", "<init>", "()V", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "Ltg0/d;", "serializer", "", "b", "(Lkotlin/reflect/KClass;Ltg0/d;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "c", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ltg0/d;)V", "value", "Ltg0/p;", "defaultSerializerProvider", "d", "", "className", "Ltg0/c;", "defaultDeserializerProvider", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lyg0/a;", "module", "g", "(Lyg0/a;)V", "forClass", "Lkotlinx/serialization/modules/a;", "", "allowOverwrite", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/reflect/KClass;Lkotlinx/serialization/modules/a;Z)V", "i", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Z)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "concreteClass", "concreteSerializer", "j", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ltg0/d;Z)V", "f", "()Lyg0/a;", "", "Ljava/util/Map;", "class2ContextualProvider", "polyBase2Serializers", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "Z", "hasInterfaceContextualSerializers", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n381#2,7:273\n381#2,7:280\n1#3:287\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n197#1:273,7\n199#1:280,7\n*E\n"})
public final class C41967c implements InterfaceC41968d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, AbstractC41965a> class2ContextualProvider = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Map<KClass<?>, InterfaceC44951d<?>>> polyBase2Serializers = new HashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Function1<?, InterfaceC44963p<?>>> polyBase2DefaultSerializerProvider = new HashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Map<String, InterfaceC44951d<?>>> polyBase2NamedSerializers = new HashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Function1<String, InterfaceC44949c<?>>> polyBase2DefaultDeserializerProvider = new HashMap();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasInterfaceContextualSerializers;

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m92033k(C41967c c41967c, KClass kClass, KClass kClass2, InterfaceC44951d interfaceC44951d, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        c41967c.m92039j(kClass, kClass2, interfaceC44951d, z11);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m92034m(C41967c c41967c, KClass kClass, AbstractC41965a abstractC41965a, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c41967c.m92040l(kClass, abstractC41965a, z11);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: a */
    public <Base> void mo91988a(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends InterfaceC44949c<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        m92037h(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: b */
    public <T> void mo91989b(@NotNull KClass<T> kClass, @NotNull InterfaceC44951d<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        m92034m(this, kClass, new AbstractC41965a.a(serializer), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: c */
    public <Base, Sub extends Base> void mo91990c(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull InterfaceC44951d<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        m92033k(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: d */
    public <Base> void mo91991d(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends InterfaceC44963p<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        m92038i(baseClass, defaultSerializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: e */
    public <T> void mo91992e(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends InterfaceC44951d<?>>, ? extends InterfaceC44951d<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        m92034m(this, kClass, new AbstractC41965a.b(provider), false, 4, null);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: f */
    public final AbstractC46494a m92035f() {
        return new C41966b(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }

    /* JADX INFO: renamed from: g */
    public final void m92036g(@NotNull AbstractC46494a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.mo92028a(this);
    }

    @JvmName(name = "registerDefaultPolymorphicDeserializer")
    /* JADX INFO: renamed from: h */
    public final <Base> void m92037h(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends InterfaceC44949c<? extends Base>> defaultDeserializerProvider, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1<String, InterfaceC44949c<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultDeserializerProvider) || allowOverwrite) {
            this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @JvmName(name = "registerDefaultPolymorphicSerializer")
    /* JADX INFO: renamed from: i */
    public final <Base> void m92038i(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends InterfaceC44963p<? super Base>> defaultSerializerProvider, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1<?, InterfaceC44963p<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultSerializerProvider) || allowOverwrite) {
            this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    @JvmName(name = "registerPolymorphicSerializer")
    /* JADX INFO: renamed from: j */
    public final <Base, Sub extends Base> void m92039j(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> concreteClass, @NotNull InterfaceC44951d<Sub> concreteSerializer, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map<KClass<?>, Map<KClass<?>, InterfaceC44951d<?>>> map = this.polyBase2Serializers;
        Map<KClass<?>, InterfaceC44951d<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<KClass<?>, InterfaceC44951d<?>> map3 = map2;
        InterfaceC44951d<?> interfaceC44951d = map3.get(concreteClass);
        Map<KClass<?>, Map<String, InterfaceC44951d<?>>> map4 = this.polyBase2NamedSerializers;
        Map<String, InterfaceC44951d<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, InterfaceC44951d<?>> map6 = map5;
        if (allowOverwrite) {
            if (interfaceC44951d != null) {
                map6.remove(interfaceC44951d.getDescriptor().getSerialName());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        if (interfaceC44951d != null) {
            if (!Intrinsics.areEqual(interfaceC44951d, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
            map6.remove(interfaceC44951d.getDescriptor().getSerialName());
        }
        InterfaceC44951d<?> interfaceC44951d2 = map6.get(serialName);
        if (interfaceC44951d2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        Map<KClass<?>, InterfaceC44951d<?>> map7 = this.polyBase2Serializers.get(baseClass);
        Intrinsics.checkNotNull(map7);
        for (Object obj : MapsKt.asSequence(map7)) {
            if (((Map.Entry) obj).getValue() == interfaceC44951d2) {
                throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + serialName + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
            }
        }
        obj = null;
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + serialName + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
    }

    @JvmName(name = "registerSerializer")
    /* JADX INFO: renamed from: l */
    public final <T> void m92040l(@NotNull KClass<T> forClass, @NotNull AbstractC41965a provider, boolean allowOverwrite) {
        AbstractC41965a abstractC41965a;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (allowOverwrite || (abstractC41965a = this.class2ContextualProvider.get(forClass)) == null || Intrinsics.areEqual(abstractC41965a, provider)) {
            this.class2ContextualProvider.put(forClass, provider);
            if (C41791a2.m91457l(forClass)) {
                this.hasInterfaceContextualSerializers = true;
                return;
            }
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }

    @PublishedApi
    public C41967c() {
    }
}
