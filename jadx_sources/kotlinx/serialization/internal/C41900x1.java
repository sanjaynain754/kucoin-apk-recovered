package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.PublishedApi;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.x1 */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/serialization/internal/x1;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/serialization/internal/y0;", "Lkotlin/Pair;", "Ltg0/d;", "keySerializer", "valueSerializer", "<init>", "(Ltg0/d;Ltg0/d;)V", "key", "value", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lvg0/f;", "c", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/Pair;)Ljava/lang/Object;", "i", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41900x1<K, V> extends AbstractC41903y0<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41900x1(@NotNull final InterfaceC44951d<K> keySerializer, @NotNull final InterfaceC44951d<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = C45540m.m100544e("kotlin.Pair", new InterfaceC45533f[0], new Function1() { // from class: kotlinx.serialization.internal.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41900x1.m91747g(keySerializer, valueSerializer, (C45528a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m91747g(InterfaceC44951d interfaceC44951d, InterfaceC44951d interfaceC44951d2, C45528a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C45528a.m100517b(buildClassSerialDescriptor, "first", interfaceC44951d.getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildClassSerialDescriptor, "second", interfaceC44951d2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public K mo91595a(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public V mo91596c(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> mo91597e(K key, V value) {
        return TuplesKt.m90091to(key, value);
    }
}
