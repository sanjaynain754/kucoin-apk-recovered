package p852kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C33590cg;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00028\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/ConcurrentHashMapCache;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/CacheByClass;", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", C33590cg.f69440j, "Ljava/util/concurrent/ConcurrentHashMap;", "get", "key", "(Ljava/lang/Class;)Ljava/lang/Object;", "clear", "", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n72#2,2:99\n1#3:101\n*S KotlinDebug\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n*L\n92#1:99,2\n92#1:101\n*E\n"})
final class ConcurrentHashMapCache<V> extends CacheByClass<V> {

    @NotNull
    private final ConcurrentHashMap<Class<?>, V> cache;

    @NotNull
    private final Function1<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapCache(@NotNull Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // p852kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.cache.clear();
    }

    @Override // p852kotlin.reflect.jvm.internal.CacheByClass
    public V get(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v11 = (V) concurrentHashMap.get(key);
        if (v11 != null) {
            return v11;
        }
        V vInvoke = this.compute.invoke(key);
        V v12 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v12 == null ? vInvoke : v12;
    }
}
