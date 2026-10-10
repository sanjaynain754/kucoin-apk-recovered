package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import vg0.AbstractC45542o;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.v1 */
/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/serialization/internal/v1;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "", "", "b", "Ljava/util/List;", "_annotations", "Lvg0/f;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n570#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
public final class C41892v1<T> implements InterfaceC44951d<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final T objectInstance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy descriptor;

    public C41892v1(@NotNull final String serialName, @NotNull T objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: kotlinx.serialization.internal.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41892v1.m91736c(serialName, this);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC45533f m91736c(String str, final C41892v1 c41892v1) {
        return C45540m.m100547h(str, AbstractC45542o.d.f102633a, new InterfaceC45533f[0], new Function1() { // from class: kotlinx.serialization.internal.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41892v1.m91737d(this.f92039b, (C45528a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m91737d(C41892v1 c41892v1, C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.m100524h(c41892v1._annotations);
        return Unit.INSTANCE;
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    public T deserialize(@NotNull InterfaceC41787b decoder) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC45533f descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially() || (iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor())) == -1) {
            Unit unit = Unit.INSTANCE;
            compositeDecoderBeginStructure.endStructure(descriptor);
            return this.objectInstance;
        }
        throw new SerializationException("Unexpected index " + iDecodeElementIndex);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return (InterfaceC45533f) this.descriptor.getValue();
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
