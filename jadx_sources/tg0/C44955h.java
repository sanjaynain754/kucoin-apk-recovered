package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.AbstractC41793b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.text.Typography;
import ug0.C45236a;
import vg0.AbstractC45531d;
import vg0.AbstractC45541n;
import vg0.C45528a;
import vg0.C45529b;
import vg0.C45540m;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: tg0.h */
/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Ltg0/h;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/b;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "", "b", "Ljava/util/List;", "_annotations", "Lvg0/f;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44955h<T> extends AbstractC41793b<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KClass<T> baseClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy descriptor;

    public C44955h(@NotNull KClass<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: tg0.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44955h.m99412h(this.f101345b);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC45533f m99412h(final C44955h c44955h) {
        return C45529b.m100527c(C45540m.m100547h("kotlinx.serialization.Polymorphic", AbstractC45531d.a.f102597a, new InterfaceC45533f[0], new Function1() { // from class: tg0.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44955h.m99413i(this.f101346b, (C45528a) obj);
            }
        }), c44955h.mo91487e());
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m99413i(C44955h c44955h, C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C45528a.m100517b(buildSerialDescriptor, "type", C45236a.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "value", C45540m.m100548i("kotlinx.serialization.Polymorphic<" + c44955h.mo91487e().getSimpleName() + Typography.greater, AbstractC45541n.a.f102628a, new InterfaceC45533f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.m100524h(c44955h._annotations);
        return Unit.INSTANCE;
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

    @NotNull
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo91487e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public C44955h(@NotNull KClass<T> baseClass, @NotNull Annotation[] classAnnotations) {
        this(baseClass);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = ArraysKt.asList(classAnnotations);
    }
}
