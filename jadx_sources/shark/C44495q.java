package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: renamed from: shark.q */
/* JADX INFO: compiled from: ObjectReporter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00020\n2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00062\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0011\u0010\u0012R'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0013j\b\u0012\u0004\u0012\u00020\u000f`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0015\u0010\"¨\u0006#"}, m90084d2 = {"Lshark/q;", "", "Lshark/HeapObject;", "heapObject", "<init>", "(Lshark/HeapObject;)V", "Lkotlin/reflect/KClass;", "expectedClass", "Lkotlin/Function2;", "Lshark/HeapObject$HeapInstance;", "", "Lkotlin/ExtensionFunctionType;", "block", "f", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function2;)V", "", "expectedClassName", "e", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/LinkedHashSet;", "b", "()Ljava/util/LinkedHashSet;", "labels", "", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "leakingReasons", "d", "notLeakingReasons", "Lshark/HeapObject;", "()Lshark/HeapObject;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44495q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<String> labels = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<String> leakingReasons = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> notLeakingReasons = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HeapObject heapObject;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeapObject getHeapObject() {
        return this.heapObject;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final LinkedHashSet<String> m98458b() {
        return this.labels;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m98459c() {
        return this.leakingReasons;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m98460d() {
        return this.notLeakingReasons;
    }

    /* JADX INFO: renamed from: e */
    public final void m98461e(@NotNull String expectedClassName, @NotNull Function2<? super C44495q, ? super HeapObject.HeapInstance, Unit> block) {
        HeapObject heapObject = this.heapObject;
        if ((heapObject instanceof HeapObject.HeapInstance) && ((HeapObject.HeapInstance) heapObject).m98035q(expectedClassName)) {
            block.invoke(this, heapObject);
        }
    }

    public C44495q(@NotNull HeapObject heapObject) {
        this.heapObject = heapObject;
    }

    /* JADX INFO: renamed from: f */
    public final void m98462f(@NotNull KClass<? extends Object> expectedClass, @NotNull Function2<? super C44495q, ? super HeapObject.HeapInstance, Unit> block) {
        String name = JvmClassMappingKt.getJavaClass((KClass) expectedClass).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "expectedClass.java.name");
        m98461e(name, block);
    }
}
