package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.t */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/serialization/internal/t;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/s2;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Ltg0/d;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/reflect/KClass;)Ltg0/d;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/serialization/internal/v;", "Lkotlinx/serialization/internal/m;", "Lkotlinx/serialization/internal/v;", "classValue", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
public final class C41882t<T> implements InterfaceC41881s2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<KClass<?>, InterfaceC44951d<T>> compute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C41890v<C41848m<T>> classValue;

    /* JADX INFO: renamed from: kotlinx.serialization.internal.t$a */
    /* JADX INFO: compiled from: Caching.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,89:1\n52#2:90\n*E\n"})
    public static final class a implements Function0<T> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ KClass f92029c;

        public a(KClass kClass) {
            this.f92029c = kClass;
        }

        @Override // p852kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C41848m(C41882t.this.m91715b().invoke(this.f92029c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41882t(@NotNull Function1<? super KClass<?>, ? extends InterfaceC44951d<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new C41890v<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC41881s2
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC44951d<T> mo91714a(@NotNull KClass<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.classValue.get(JvmClassMappingKt.getJavaClass((KClass) key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C41845l1 c41845l1 = (C41845l1) obj;
        T t11 = c41845l1.reference.get();
        if (t11 == null) {
            t11 = (T) c41845l1.m91634a(new a(key));
        }
        return t11.serializer;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<KClass<?>, InterfaceC44951d<T>> m91715b() {
        return this.compute;
    }
}
