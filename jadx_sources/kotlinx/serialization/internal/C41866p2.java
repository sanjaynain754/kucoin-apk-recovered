package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.p2 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000e*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\u00020\u001d*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Lkotlinx/serialization/internal/p2;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/w;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/reflect/KClass;", "kClass", "Ltg0/d;", "eSerializer", "<init>", "(Lkotlin/reflect/KClass;Ltg0/d;)V", "", CmcdData.Factory.STREAMING_FORMAT_SS, "([Ljava/lang/Object;)I", "", "r", "([Ljava/lang/Object;)Ljava/util/Iterator;", "o", "()Ljava/util/ArrayList;", "p", "(Ljava/util/ArrayList;)I", "v", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "u", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "", "q", "(Ljava/util/ArrayList;I)V", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "b", "Lkotlin/reflect/KClass;", "Lvg0/f;", "c", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41866p2<ElementKlass, Element extends ElementKlass> extends AbstractC41894w<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final KClass<ElementKlass> kClass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41866p2(@NotNull KClass<ElementKlass> kClass, @NotNull InterfaceC44951d<Element> eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.kClass = kClass;
        this.descriptor = new C41803d(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> mo91423a() {
        return new ArrayList<>();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo91424b(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo91425c(@NotNull ArrayList<Element> arrayList, int i11) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> mo91426d(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return ArrayIteratorKt.iterator(elementArr);
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int mo91427e(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo91507n(@NotNull ArrayList<Element> arrayList, int i11, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i11, element);
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> mo91432k(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(ArraysKt.asList(elementArr));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Element[] mo91433l(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (Element[]) C41791a2.m91463r(arrayList, this.kClass);
    }
}
