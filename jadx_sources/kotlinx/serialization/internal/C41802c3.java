package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.c3 */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m90084d2 = {"Lkotlinx/serialization/internal/c3;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "Ltg0/d;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Ltg0/d;Ltg0/d;Ltg0/d;)V", "Lwg0/c;", "encoder", "value", "", "f", "(Lwg0/c;Lkotlin/Triple;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "e", "(Lkotlinx/serialization/encoding/b;)Lkotlin/Triple;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "composite", "b", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Lkotlin/Triple;", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltg0/d;", "Lvg0/f;", "d", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41802c3<A, B, C> implements InterfaceC44951d<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<A> aSerializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<B> bSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<C> cSerializer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    public C41802c3(@NotNull InterfaceC44951d<A> aSerializer, @NotNull InterfaceC44951d<B> bSerializer, @NotNull InterfaceC44951d<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = C45540m.m100544e("kotlin.Triple", new InterfaceC45533f[0], new Function1() { // from class: kotlinx.serialization.internal.b3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41802c3.m91516d(this.f91900b, (C45528a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m91516d(C41802c3 c41802c3, C45528a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C45528a.m100517b(buildClassSerialDescriptor, "first", c41802c3.aSerializer.getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildClassSerialDescriptor, "second", c41802c3.bSerializer.getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildClassSerialDescriptor, "third", c41802c3.cSerializer.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        return compositeDecoderBeginStructure.decodeSequentially() ? m91517b(compositeDecoderBeginStructure) : m91518c(compositeDecoderBeginStructure);
    }

    @Override // tg0.InterfaceC44963p
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC45829b interfaceC45829bBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC45829bBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.getFirst());
        interfaceC45829bBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.getSecond());
        interfaceC45829bBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.getThird());
        interfaceC45829bBeginStructure.endStructure(getDescriptor());
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: renamed from: b */
    public final Triple<A, B, C> m91517b(CompositeDecoder composite) {
        Object objM91414c = CompositeDecoder.C41785a.m91414c(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object objM91414c2 = CompositeDecoder.C41785a.m91414c(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object objM91414c3 = CompositeDecoder.C41785a.m91414c(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(getDescriptor());
        return new Triple<>(objM91414c, objM91414c2, objM91414c3);
    }

    /* JADX INFO: renamed from: c */
    public final Triple<A, B, C> m91518c(CompositeDecoder composite) {
        CompositeDecoder compositeDecoder;
        Object objM91414c = C41807d3.f91913a;
        Object objM91414c2 = C41807d3.f91913a;
        Object objM91414c3 = C41807d3.f91913a;
        while (true) {
            int iDecodeElementIndex = composite.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != -1) {
                if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex != 1) {
                        if (iDecodeElementIndex == 2) {
                            objM91414c3 = CompositeDecoder.C41785a.m91414c(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
                        } else {
                            throw new SerializationException("Unexpected index " + iDecodeElementIndex);
                        }
                    } else {
                        compositeDecoder = composite;
                        objM91414c2 = CompositeDecoder.C41785a.m91414c(compositeDecoder, getDescriptor(), 1, this.bSerializer, null, 8, null);
                    }
                } else {
                    compositeDecoder = composite;
                    objM91414c = CompositeDecoder.C41785a.m91414c(compositeDecoder, getDescriptor(), 0, this.aSerializer, null, 8, null);
                }
                composite = compositeDecoder;
            } else {
                composite.endStructure(getDescriptor());
                if (objM91414c != C41807d3.f91913a) {
                    if (objM91414c2 != C41807d3.f91913a) {
                        if (objM91414c3 != C41807d3.f91913a) {
                            return new Triple<>(objM91414c, objM91414c2, objM91414c3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }
}
