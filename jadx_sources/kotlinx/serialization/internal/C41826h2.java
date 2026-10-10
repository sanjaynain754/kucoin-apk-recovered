package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import tg0.InterfaceC44951d;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.h2 */
/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070+H\u0002¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u0010(R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u000108058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010>R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010@R%\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0001058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010(R\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010W¨\u0006Y"}, m90084d2 = {"Lkotlinx/serialization/internal/h2;", "Lvg0/f;", "Lkotlinx/serialization/internal/n;", "", "serialName", "Lkotlinx/serialization/internal/m0;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V", "name", "", "isOptional", "", "o", "(Ljava/lang/String;Z)V", "", "annotation", "v", "(Ljava/lang/annotation/Annotation;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "w", "index", "d", "(I)Lvg0/f;", "i", "(I)Z", "", "g", "(I)Ljava/util/List;", "f", "(I)Ljava/lang/String;", "c", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "q", "()Ljava/util/Map;", "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Lkotlinx/serialization/internal/m0;", "I", "e", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Ltg0/d;", "j", "Lkotlin/Lazy;", CmcdData.Factory.STREAMING_FORMAT_SS, "()[Ltg0/d;", "childSerializers", "k", "t", "()[Lvg0/f;", "typeParameterDescriptors", CmcdData.Factory.STREAM_TYPE_LIVE, "u", "_hashCode", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n111#3,10:139\n11165#4:149\n11500#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
public class C41826h2 implements InterfaceC45533f, InterfaceC41853n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC41849m0<?> generatedSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int elementsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int added;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String[] names;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Annotation>[] propertiesAnnotations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public List<Annotation> classAnnotations;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final boolean[] elementsOptionality;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Map<String, Integer> indices;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy childSerializers;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy typeParameterDescriptors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy _hashCode;

    public C41826h2(@NotNull String serialName, @Nullable InterfaceC41849m0<?> interfaceC41849m0, int i11) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = interfaceC41849m0;
        this.elementsCount = i11;
        this.added = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i13 = this.elementsCount;
        this.propertiesAnnotations = new List[i13];
        this.elementsOptionality = new boolean[i13];
        this.indices = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.childSerializers = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.e2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41826h2.m91576r(this.f91919b);
            }
        });
        this.typeParameterDescriptors = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.f2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41826h2.m91579y(this.f91926b);
            }
        });
        this._hashCode = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.g2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C41826h2.m91574n(this.f91934b));
            }
        });
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41826h2)) {
            return false;
        }
        InterfaceC45533f interfaceC45533f = (InterfaceC45533f) other;
        if (!Intrinsics.areEqual(getSerialName(), interfaceC45533f.getSerialName()) || !Arrays.equals(m91584t(), ((C41826h2) other).m91584t()) || getElementsCount() != interfaceC45533f.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!Intrinsics.areEqual(mo91525d(i11).getSerialName(), interfaceC45533f.mo91525d(i11).getSerialName()) || !Intrinsics.areEqual(mo91525d(i11).getKind(), interfaceC45533f.mo91525d(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: kotlinx.serialization.internal.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41826h2.m91578x(this.f91912b, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m91575p(C41826h2 c41826h2, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c41826h2.m91581o(str, z11);
    }

    /* JADX INFO: renamed from: r */
    public static final InterfaceC44951d[] m91576r(C41826h2 c41826h2) {
        InterfaceC44951d<?>[] interfaceC44951dArrChildSerializers;
        InterfaceC41849m0<?> interfaceC41849m0 = c41826h2.generatedSerializer;
        return (interfaceC41849m0 == null || (interfaceC44951dArrChildSerializers = interfaceC41849m0.childSerializers()) == null) ? C41836j2.f91971a : interfaceC44951dArrChildSerializers;
    }

    /* JADX INFO: renamed from: u */
    private final int m91577u() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: renamed from: x */
    public static final CharSequence m91578x(C41826h2 c41826h2, int i11) {
        return c41826h2.mo91527f(i11) + ": " + c41826h2.mo91525d(i11).getSerialName();
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC45533f[] m91579y(C41826h2 c41826h2) {
        ArrayList arrayList;
        InterfaceC44951d<?>[] interfaceC44951dArrTypeParametersSerializers;
        InterfaceC41849m0<?> interfaceC41849m0 = c41826h2.generatedSerializer;
        if (interfaceC41849m0 == null || (interfaceC44951dArrTypeParametersSerializers = interfaceC41849m0.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC44951dArrTypeParametersSerializers.length);
            for (InterfaceC44951d<?> interfaceC44951d : interfaceC44951dArrTypeParametersSerializers) {
                arrayList.add(interfaceC44951d.getDescriptor());
            }
        }
        return C41796b2.m91497b(arrayList);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41853n
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<String> mo91580a() {
        return this.indices.keySet();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        return this.names[index];
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return AbstractC45542o.a.f102630a;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: i */
    public boolean mo91529i(int index) {
        return this.elementsOptionality[index];
    }

    /* JADX INFO: renamed from: o */
    public final void m91581o(@NotNull String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i11 = this.added + 1;
        this.added = i11;
        strArr[i11] = name;
        this.elementsOptionality[i11] = isOptional;
        this.propertiesAnnotations[i11] = null;
        if (i11 == this.elementsCount - 1) {
            this.indices = m91582q();
        }
    }

    /* JADX INFO: renamed from: q */
    public final Map<String, Integer> m91582q() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i11 = 0; i11 < length; i11++) {
            map.put(this.names[i11], Integer.valueOf(i11));
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC44951d<?>[] m91583s() {
        return (InterfaceC44951d[]) this.childSerializers.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC45533f[] m91584t() {
        return (InterfaceC45533f[]) this.typeParameterDescriptors.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final void m91585v(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    /* JADX INFO: renamed from: w */
    public final void m91586w(@NotNull Annotation a11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a11);
    }

    /* JADX INFO: renamed from: n */
    public static final int m91574n(C41826h2 c41826h2) {
        return C41831i2.m91601a(c41826h2, c41826h2.m91584t());
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return InterfaceC45533f.a.m100530c(this);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        return m91583s()[index].getDescriptor();
    }

    public int hashCode() {
        return m91577u();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return InterfaceC45533f.a.m100529b(this);
    }

    public /* synthetic */ C41826h2(String str, InterfaceC41849m0 interfaceC41849m0, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : interfaceC41849m0, i11);
    }
}
