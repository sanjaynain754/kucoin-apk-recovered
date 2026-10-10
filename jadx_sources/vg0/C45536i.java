package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.C41796b2;
import kotlinx.serialization.internal.C41831i2;
import kotlinx.serialization.internal.InterfaceC41853n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: vg0.i */
/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\"R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b%\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00109R\u001b\u0010I\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\"¨\u0006J"}, m90084d2 = {"Lvg0/i;", "Lvg0/f;", "Lkotlinx/serialization/internal/n;", "", "serialName", "Lvg0/n;", C33612dh.f69618m, "", "elementsCount", "", "typeParameters", "Lvg0/a;", "builder", "<init>", "(Ljava/lang/String;Lvg0/n;ILjava/util/List;Lvg0/a;)V", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "i", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Lvg0/n;", "getKind", "()Lvg0/n;", "I", "e", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lvg0/f;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", CmcdData.Factory.STREAM_TYPE_LIVE, "Lkotlin/Lazy;", "m", "_hashCode", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,366:1\n37#2,2:367\n37#2,2:369\n1557#3:371\n1628#3,3:372\n16#4:375\n16#4:376\n16#4:377\n21#4:378\n111#5,10:379\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n336#1:367,2\n338#1:369,2\n340#1:371\n340#1:372,3\n344#1:375\n346#1:376\n347#1:377\n348#1:378\n351#1:379,10\n*E\n"})
public final class C45536i implements InterfaceC45533f, InterfaceC41853n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC45541n kind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int elementsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Annotation> annotations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Set<String> serialNames;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String[] elementNames;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f[] elementDescriptors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<Annotation>[] elementAnnotations;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final boolean[] elementOptionality;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Integer> name2Index;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f[] typeParametersDescriptors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy _hashCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C45536i)) {
            return false;
        }
        InterfaceC45533f interfaceC45533f = (InterfaceC45533f) other;
        if (!Intrinsics.areEqual(getSerialName(), interfaceC45533f.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((C45536i) other).typeParametersDescriptors) || getElementsCount() != interfaceC45533f.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!Intrinsics.areEqual(mo91525d(i11).getSerialName(), interfaceC45533f.mo91525d(i11).getSerialName()) || !Intrinsics.areEqual(mo91525d(i11).getCom.tencent.bugly.proguard.dh.m java.lang.String(), interfaceC45533f.mo91525d(i11).getCom.tencent.bugly.proguard.dh.m java.lang.String())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: vg0.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45536i.m100534n(this.f102609b, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public C45536i(@NotNull String serialName, @NotNull AbstractC45541n kind, int i11, @NotNull List<? extends InterfaceC45533f> typeParameters, @NotNull C45528a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i11;
        this.annotations = builder.m100519c();
        this.serialNames = CollectionsKt.toHashSet(builder.m100522f());
        String[] strArr = (String[]) builder.m100522f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = C41796b2.m91497b(builder.m100521e());
        this.elementAnnotations = (List[]) builder.m100520d().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(builder.m100523g());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.m90091to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.name2Index = MapsKt.toMap(arrayList);
        this.typeParametersDescriptors = C41796b2.m91497b(typeParameters);
        this._hashCode = LazyKt.lazy(new Function0() { // from class: vg0.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C45536i.m100533l(this.f102608b));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final int m100533l(C45536i c45536i) {
        return C41831i2.m91601a(c45536i, c45536i.typeParametersDescriptors);
    }

    /* JADX INFO: renamed from: n */
    public static final CharSequence m100534n(C45536i c45536i, int i11) {
        return c45536i.mo91527f(i11) + ": " + c45536i.mo91525d(i11).getSerialName();
    }

    @Override // kotlinx.serialization.internal.InterfaceC41853n
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<String> mo91580a() {
        return this.serialNames;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        return this.elementDescriptors[index];
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        return this.elementNames[index];
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        return this.elementAnnotations[index];
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: getKind, reason: from getter */
    public AbstractC45541n getCom.tencent.bugly.proguard.dh.m java.lang.String() {
        return this.kind;
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
        return this.elementOptionality[index];
    }

    /* JADX INFO: renamed from: m */
    public final int m100535m() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return InterfaceC45533f.a.m100530c(this);
    }

    public int hashCode() {
        return m100535m();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return InterfaceC45533f.a.m100529b(this);
    }
}
