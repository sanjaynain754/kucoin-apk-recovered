package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.q0 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lkotlinx/serialization/internal/q0;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/serialization/internal/x;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ltg0/d;", "eSerializer", "<init>", "(Ltg0/d;)V", "q", "()Ljava/util/HashSet;", "", "r", "(Ljava/util/HashSet;)I", "v", "(Ljava/util/HashSet;)Ljava/util/Set;", "u", "(Ljava/util/Set;)Ljava/util/HashSet;", "size", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/util/HashSet;I)V", "index", "element", "t", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lvg0/f;", "b", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41869q0<E> extends AbstractC41898x<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41869q0(@NotNull InterfaceC44951d<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.descriptor = new C41864p0(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet<E> mo91423a() {
        return new HashSet<>();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo91424b(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo91425c(@NotNull HashSet<E> hashSet, int i11) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo91507n(@NotNull HashSet<E> hashSet, int i11, E e11) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e11);
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet<E> mo91432k(@NotNull Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<E> mo91433l(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
