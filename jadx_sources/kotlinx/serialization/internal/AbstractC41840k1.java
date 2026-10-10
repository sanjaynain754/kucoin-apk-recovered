package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntProgression;
import p852kotlin.ranges.RangesKt;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.k1 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0002*+¨\u0006,"}, m90084d2 = {"Lkotlinx/serialization/internal/k1;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/a;", "", "Ltg0/d;", "keySerializer", "valueSerializer", "<init>", "(Ltg0/d;Ltg0/d;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "", SpellCheckPlugin.START_INDEX_KEY, "size", "", "o", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "Lwg0/c;", "encoder", "value", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltg0/d;", "m", "()Ltg0/d;", "b", "n", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "Lkotlinx/serialization/internal/o0;", "Lkotlinx/serialization/internal/a1;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
public abstract class AbstractC41840k1<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC41788a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<Key> keySerializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<Value> valueSerializer;

    public /* synthetic */ AbstractC41840k1(InterfaceC44951d interfaceC44951d, InterfaceC44951d interfaceC44951d2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44951d, interfaceC44951d2);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public abstract InterfaceC45533f getDescriptor();

    public AbstractC41840k1(InterfaceC44951d<Key> interfaceC44951d, InterfaceC44951d<Value> interfaceC44951d2) {
        super(null);
        this.keySerializer = interfaceC44951d;
        this.valueSerializer = interfaceC44951d2;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC44951d<Key> m91623m() {
        return this.keySerializer;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC44951d<Value> m91624n() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void mo91429g(@NotNull CompositeDecoder decoder, @NotNull Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, size * 2), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            mo91430h(decoder, startIndex + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo91430h(@NotNull CompositeDecoder decoder, int index, @NotNull Builder builder, boolean checkIndex) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objM91414c = CompositeDecoder.C41785a.m91414c(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != index + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + iDecodeElementIndex).toString());
            }
        } else {
            iDecodeElementIndex = index + 1;
        }
        int i11 = iDecodeElementIndex;
        builder.put(objM91414c, (!builder.containsKey(objM91414c) || (this.valueSerializer.getDescriptor().getKind() instanceof AbstractC45532e)) ? CompositeDecoder.C41785a.m91414c(decoder, getDescriptor(), i11, this.valueSerializer, null, 8, null) : decoder.decodeSerializableElement(getDescriptor(), i11, this.valueSerializer, MapsKt.getValue(builder, objM91414c)));
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMo91427e = mo91427e(value);
        InterfaceC45533f descriptor = getDescriptor();
        InterfaceC45829b interfaceC45829bBeginCollection = encoder.beginCollection(descriptor, iMo91427e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itMo91426d = mo91426d(value);
        int i11 = 0;
        while (itMo91426d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itMo91426d.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i12 = i11 + 1;
            interfaceC45829bBeginCollection.encodeSerializableElement(getDescriptor(), i11, m91623m(), key);
            i11 += 2;
            interfaceC45829bBeginCollection.encodeSerializableElement(getDescriptor(), i12, m91624n(), value2);
        }
        interfaceC45829bBeginCollection.endStructure(descriptor);
    }
}
