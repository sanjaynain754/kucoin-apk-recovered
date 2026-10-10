package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33590cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KType;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.z */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/serialization/internal/z;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/z1;", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Ltg0/d;", "compute", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "key", "types", "Lkotlin/Result;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/y1;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", C33590cg.f69440j, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1557#5:224\n1628#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
public final class C41906z<T> implements InterfaceC41908z1<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<KClass<Object>, List<? extends KType>, InterfaceC44951d<T>> compute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Class<?>, C41904y1<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public C41906z(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends InterfaceC44951d<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC41908z1
    @NotNull
    /* JADX INFO: renamed from: a */
    public Object mo91720a(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
        Object objM103844constructorimpl;
        C41904y1<T> c41904y1PutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, C41904y1<T>> concurrentHashMap = this.cache;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        C41904y1<T> c41904y1 = concurrentHashMap.get(javaClass);
        if (c41904y1 == null && (c41904y1PutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (c41904y1 = new C41904y1<>()))) != null) {
            c41904y1 = c41904y1PutIfAbsent;
        }
        C41904y1<T> c41904y2 = c41904y1;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new C41899x0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c41904y2.serializers;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Result resultM103843boximpl = Result.m103843boximpl(objM103844constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultM103843boximpl);
            obj = objPutIfAbsent == null ? resultM103843boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).getValue();
    }
}
