package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import shark.HeapObject;

/* JADX INFO: renamed from: shark.internal.i */
/* JADX INFO: compiled from: PathFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\t"}, m90084d2 = {"", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "skippablePrimitiveWrapperArrayTypes", "Lshark/HeapObject$a;", "", "(Lshark/HeapObject$a;)Z", "isSkippablePrimitiveWrapperArray", "shark"}, m90085k = 2, m90086mv = {1, 4, 1})
public final class C44483i {

    /* JADX INFO: renamed from: a */
    public static final List<String> f98469a;

    static {
        Set of2 = SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(Boolean.TYPE), Reflection.getOrCreateKotlinClass(Character.TYPE), Reflection.getOrCreateKotlinClass(Float.TYPE), Reflection.getOrCreateKotlinClass(Double.TYPE), Reflection.getOrCreateKotlinClass(Byte.TYPE), Reflection.getOrCreateKotlinClass(Short.TYPE), Reflection.getOrCreateKotlinClass(Integer.TYPE), Reflection.getOrCreateKotlinClass(Long.TYPE)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        Iterator it = of2.iterator();
        while (it.hasNext()) {
            arrayList.add(JvmClassMappingKt.getJavaObjectType((KClass) it.next()).getName() + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        f98469a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m98402a(@NotNull HeapObject.C44426a c44426a) {
        return f98469a.contains(c44426a.m98043i());
    }
}
