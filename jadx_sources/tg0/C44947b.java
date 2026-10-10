package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41796b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import vg0.AbstractC45541n;
import vg0.C45528a;
import vg0.C45529b;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: tg0.b */
/* JADX INFO: compiled from: ContextualSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Ltg0/b;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "Lkotlin/reflect/KClass;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lkotlin/reflect/KClass;Ltg0/d;[Ltg0/d;)V", "Lyg0/a;", "serializersModule", "serializer", "(Lyg0/a;)Ltg0/d;", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/reflect/KClass;", "b", "Ltg0/d;", "", "c", "Ljava/util/List;", "Lvg0/f;", "d", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44947b<T> implements InterfaceC44951d<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KClass<T> serializableClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC44951d<T> fallbackSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC44951d<?>> typeArgumentsSerializers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    public C44947b(@NotNull KClass<T> serializableClass, @Nullable InterfaceC44951d<T> interfaceC44951d, @NotNull InterfaceC44951d<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.serializableClass = serializableClass;
        this.fallbackSerializer = interfaceC44951d;
        this.typeArgumentsSerializers = ArraysKt.asList(typeArgumentsSerializers);
        this.descriptor = C45529b.m100527c(C45540m.m100547h("kotlinx.serialization.ContextualSerializer", AbstractC45541n.a.f102628a, new InterfaceC45533f[0], new Function1() { // from class: tg0.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44947b.m99393b(this.f101339b, (C45528a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m99393b(C44947b c44947b, C45528a buildSerialDescriptor) {
        InterfaceC45533f descriptor;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        InterfaceC44951d<T> interfaceC44951d = c44947b.fallbackSerializer;
        List<Annotation> annotations = (interfaceC44951d == null || (descriptor = interfaceC44951d.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = CollectionsKt.emptyList();
        }
        buildSerialDescriptor.m100524h(annotations);
        return Unit.INSTANCE;
    }

    private final InterfaceC44951d<T> serializer(AbstractC46494a serializersModule) {
        InterfaceC44951d<T> interfaceC44951dMo92029b = serializersModule.mo92029b(this.serializableClass, this.typeArgumentsSerializers);
        if (interfaceC44951dMo92029b != null) {
            return interfaceC44951dMo92029b;
        }
        InterfaceC44951d<T> interfaceC44951d = this.fallbackSerializer;
        if (interfaceC44951d != null) {
            return interfaceC44951d;
        }
        C41796b2.m91501f(this.serializableClass);
        throw new KotlinNothingValueException();
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    public T deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.decodeSerializableValue(serializer(decoder.getSerializersModule()));
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), value);
    }
}
