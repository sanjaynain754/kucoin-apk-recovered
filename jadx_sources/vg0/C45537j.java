package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: renamed from: vg0.j */
/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, m90084d2 = {"Lvg0/f;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lvg0/f;)V", "elementDescriptors", "", "b", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C45537j {

    /* JADX INFO: renamed from: vg0.j$a */
    /* JADX INFO: compiled from: SerialDescriptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"vg0/j$a", "", "Lvg0/f;", "", "hasNext", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lvg0/f;", "", "b", "I", "elementsLeft", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements Iterator<InterfaceC45533f>, KMappedMarker {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int elementsLeft;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC45533f f102623c;

        public a(InterfaceC45533f interfaceC45533f) {
            this.f102623c = interfaceC45533f;
            this.elementsLeft = interfaceC45533f.getElementsCount();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC45533f next() {
            InterfaceC45533f interfaceC45533f = this.f102623c;
            int elementsCount = interfaceC45533f.getElementsCount();
            int i11 = this.elementsLeft;
            this.elementsLeft = i11 - 1;
            return interfaceC45533f.mo91525d(elementsCount - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: vg0.j$b */
    /* JADX INFO: compiled from: SerialDescriptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"vg0/j$b", "", "", "", "hasNext", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "b", "I", "elementsLeft", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b implements Iterator<String>, KMappedMarker {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int elementsLeft;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC45533f f102625c;

        public b(InterfaceC45533f interfaceC45533f) {
            this.f102625c = interfaceC45533f;
            this.elementsLeft = interfaceC45533f.getElementsCount();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            InterfaceC45533f interfaceC45533f = this.f102625c;
            int elementsCount = interfaceC45533f.getElementsCount();
            int i11 = this.elementsLeft;
            this.elementsLeft = i11 - 1;
            return interfaceC45533f.mo91527f(elementsCount - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.elementsLeft > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: vg0.j$c */
    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, m90084d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n293#2,8:18\n*E\n"})
    public static final class c implements Iterable<InterfaceC45533f>, KMappedMarker {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45533f f102626b;

        public c(InterfaceC45533f interfaceC45533f) {
            this.f102626b = interfaceC45533f;
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC45533f> iterator() {
            return new a(this.f102626b);
        }
    }

    /* JADX INFO: renamed from: vg0.j$d */
    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, m90084d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n309#2,8:18\n*E\n"})
    public static final class d implements Iterable<String>, KMappedMarker {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45533f f102627b;

        public d(InterfaceC45533f interfaceC45533f) {
            this.f102627b = interfaceC45533f;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f102627b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Iterable<InterfaceC45533f> m100536a(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return new c(interfaceC45533f);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Iterable<String> m100537b(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return new d(interfaceC45533f);
    }
}
