package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33590cg;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.y */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR*\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/serialization/internal/y;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/s2;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Ltg0/d;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/reflect/KClass;)Ltg0/d;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/m;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", C33590cg.f69440j, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
public final class C41902y<T> implements InterfaceC41881s2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<KClass<?>, InterfaceC44951d<T>> compute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Class<?>, C41848m<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public C41902y(@NotNull Function1<? super KClass<?>, ? extends InterfaceC44951d<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC41881s2
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC44951d<T> mo91714a(@NotNull KClass<Object> key) {
        C41848m<T> c41848mPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, C41848m<T>> concurrentHashMap = this.cache;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        C41848m<T> c41848m = concurrentHashMap.get(javaClass);
        if (c41848m == null && (c41848mPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (c41848m = new C41848m<>(this.compute.invoke(key))))) != null) {
            c41848m = c41848mPutIfAbsent;
        }
        return c41848m.serializer;
    }
}
