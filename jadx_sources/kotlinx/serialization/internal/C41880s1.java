package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.s1 */
/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/serialization/internal/s1;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "serializer", "<init>", "(Ltg0/d;)V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltg0/d;", "Lvg0/f;", "b", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41880s1<T> implements InterfaceC44951d<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<T> serializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && C41880s1.class == other.getClass() && Intrinsics.areEqual(this.serializer, ((C41880s1) other).serializer);
    }

    public C41880s1(@NotNull InterfaceC44951d<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.serializer = serializer;
        this.descriptor = new C41871q2(serializer.getDescriptor());
    }

    @Override // tg0.InterfaceC44949c
    @Nullable
    public T deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? (T) decoder.decodeSerializableValue(this.serializer) : (T) decoder.decodeNull();
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @Nullable T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.serializer, value);
        }
    }
}
