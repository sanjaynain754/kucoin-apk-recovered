package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.serialization.modules.InterfaceC41968d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import vg0.AbstractC45531d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.q0 */
/* JADX INFO: compiled from: PolymorphismValidator.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JX\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2/\u0010\u0012\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001b\u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b\"\b\b\u0001\u0010\u0017*\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010 \u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2)\u0010\u001f\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\fH\u0016¢\u0006\u0004\b \u0010\u0015JT\u0010$\u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\fH\u0016¢\u0006\u0004\b$\u0010\u0015J#\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m90084d2 = {"Lkotlinx/serialization/json/internal/q0;", "Lkotlinx/serialization/modules/d;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Ltg0/d;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "c", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ltg0/d;)V", "value", "Ltg0/p;", "defaultSerializerProvider", "d", "className", "Ltg0/c;", "defaultDeserializerProvider", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lvg0/f;", "descriptor", "g", "(Lvg0/f;Lkotlin/reflect/KClass;)V", "f", "Z", "b", "Ljava/lang/String;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41946q0 implements InterfaceC41968d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String discriminator;

    public C41946q0(boolean z11, @NotNull String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.useArrayPolymorphism = z11;
        this.discriminator = discriminator;
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: a */
    public <Base> void mo91988a(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends InterfaceC44949c<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: c */
    public <Base, Sub extends Base> void mo91990c(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull InterfaceC44951d<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        InterfaceC45533f descriptor = actualSerializer.getDescriptor();
        m91994g(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        m91993f(descriptor, actualClass);
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: d */
    public <Base> void mo91991d(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends InterfaceC44963p<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: e */
    public <T> void mo91992e(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends InterfaceC44951d<?>>, ? extends InterfaceC44951d<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // kotlinx.serialization.modules.InterfaceC41968d
    /* JADX INFO: renamed from: b */
    public <T> void mo91989b(@NotNull KClass<T> kClass, @NotNull InterfaceC44951d<T> interfaceC44951d) {
        InterfaceC41968d.a.m92042b(this, kClass, interfaceC44951d);
    }

    /* JADX INFO: renamed from: f */
    public final void m91993f(InterfaceC45533f descriptor, KClass<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            String strMo91527f = descriptor.mo91527f(i11);
            if (Intrinsics.areEqual(strMo91527f, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strMo91527f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m91994g(InterfaceC45533f descriptor, KClass<?> actualClass) {
        AbstractC45541n kind = descriptor.getKind();
        if (!(kind instanceof AbstractC45531d) && !Intrinsics.areEqual(kind, AbstractC45541n.a.f102628a)) {
            if (!this.useArrayPolymorphism) {
                if (!Intrinsics.areEqual(kind, AbstractC45542o.b.f102631a) && !Intrinsics.areEqual(kind, AbstractC45542o.c.f102632a) && !(kind instanceof AbstractC45532e) && !(kind instanceof AbstractC45541n.b)) {
                    return;
                }
                throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
