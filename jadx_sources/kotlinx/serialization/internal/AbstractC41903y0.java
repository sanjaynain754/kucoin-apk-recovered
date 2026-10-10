package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.y0 */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, m90084d2 = {"Lkotlinx/serialization/internal/y0;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "Ltg0/d;", "keySerializer", "valueSerializer", "<init>", "(Ltg0/d;Ltg0/d;)V", "key", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lwg0/c;", "encoder", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltg0/d;", "b", "()Ltg0/d;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "Lkotlinx/serialization/internal/i1;", "Lkotlinx/serialization/internal/x1;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
public abstract class AbstractC41903y0<K, V, R> implements InterfaceC44951d<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<K> keySerializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<V> valueSerializer;

    public /* synthetic */ AbstractC41903y0(InterfaceC44951d interfaceC44951d, InterfaceC44951d interfaceC44951d2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44951d, interfaceC44951d2);
    }

    /* JADX INFO: renamed from: a */
    public abstract K mo91595a(R r11);

    /* JADX INFO: renamed from: c */
    public abstract V mo91596c(R r11);

    /* JADX INFO: renamed from: e */
    public abstract R mo91597e(K key, V value);

    public AbstractC41903y0(InterfaceC44951d<K> interfaceC44951d, InterfaceC44951d<V> interfaceC44951d2) {
        this.keySerializer = interfaceC44951d;
        this.valueSerializer = interfaceC44951d2;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC44951d<K> m91751b() {
        return this.keySerializer;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC44951d<V> m91752d() {
        return this.valueSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tg0.InterfaceC44949c
    public R deserialize(@NotNull InterfaceC41787b decoder) {
        R r11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC45533f descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            r11 = (R) mo91597e(CompositeDecoder.C41785a.m91414c(compositeDecoderBeginStructure, getDescriptor(), 0, m91751b(), null, 8, null), CompositeDecoder.C41785a.m91414c(compositeDecoderBeginStructure, getDescriptor(), 1, m91752d(), null, 8, null));
        } else {
            Object objM91414c = C41807d3.f91913a;
            Object objM91414c2 = C41807d3.f91913a;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objM91414c == C41807d3.f91913a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objM91414c2 == C41807d3.f91913a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r11 = (R) mo91597e(objM91414c, objM91414c2);
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    objM91414c = CompositeDecoder.C41785a.m91414c(compositeDecoderBeginStructure, getDescriptor(), 0, m91751b(), null, 8, null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationException("Invalid index: " + iDecodeElementIndex);
                    }
                    objM91414c2 = CompositeDecoder.C41785a.m91414c(compositeDecoderBeginStructure, getDescriptor(), 1, m91752d(), null, 8, null);
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return r11;
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, R value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        InterfaceC45829b interfaceC45829bBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC45829bBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, mo91595a(value));
        interfaceC45829bBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, mo91596c(value));
        interfaceC45829bBeginStructure.endStructure(getDescriptor());
    }
}
