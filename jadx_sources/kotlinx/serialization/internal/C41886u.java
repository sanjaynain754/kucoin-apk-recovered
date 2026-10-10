package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KType;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.u */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/serialization/internal/u;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/z1;", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Ltg0/d;", "compute", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "key", "types", "Lkotlin/Result;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", "Lkotlinx/serialization/internal/v;", "Lkotlinx/serialization/internal/y1;", "b", "Lkotlinx/serialization/internal/v;", "classValue", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1557#5:226\n1628#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
public final class C41886u<T> implements InterfaceC41908z1<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<KClass<Object>, List<? extends KType>, InterfaceC44951d<T>> compute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C41890v<C41904y1<T>> classValue;

    /* JADX INFO: renamed from: kotlinx.serialization.internal.u$a */
    /* JADX INFO: compiled from: Caching.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n1#1,89:1\n128#2:90\n*E\n"})
    public static final class a implements Function0<T> {
        @Override // p852kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C41904y1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41886u(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends InterfaceC44951d<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new C41890v<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC41908z1
    @NotNull
    /* JADX INFO: renamed from: a */
    public Object mo91720a(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.classValue.get(JvmClassMappingKt.getJavaClass((KClass) key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C41845l1 c41845l1 = (C41845l1) obj;
        T t11 = c41845l1.reference.get();
        if (t11 == null) {
            t11 = (T) c41845l1.m91634a(new a());
        }
        C41904y1 c41904y1 = t11;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new C41899x0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c41904y1.serializers;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Result resultM103843boximpl = Result.m103843boximpl(objM103844constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM103843boximpl);
            obj2 = objPutIfAbsent == null ? resultM103843boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).getValue();
    }
}
