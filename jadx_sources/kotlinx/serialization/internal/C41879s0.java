package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.s0 */
/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "name", "Ltg0/d;", "primitiveSerializer", "Lvg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ltg0/d;)Lvg0/f;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41879s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.serialization.internal.s0$a */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"kotlinx/serialization/internal/s0$a", "Lkotlinx/serialization/internal/m0;", "", "Ltg0/d;", "childSerializers", "()[Ltg0/d;", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a<T> implements InterfaceC41849m0<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC44951d<T> f92023a;

        public a(InterfaceC44951d<T> interfaceC44951d) {
            this.f92023a = interfaceC44951d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.internal.InterfaceC41849m0
        public InterfaceC44951d<?>[] childSerializers() {
            return new InterfaceC44951d[]{this.f92023a};
        }

        @Override // tg0.InterfaceC44949c
        public T deserialize(InterfaceC41787b decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
        public InterfaceC45533f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // tg0.InterfaceC44963p
        public void serialize(InterfaceC45830c encoder, T value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.internal.InterfaceC41849m0
        public InterfaceC44951d<?>[] typeParametersSerializers() {
            return InterfaceC41849m0.a.m91640a(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC45533f m91713a(@NotNull String name, @NotNull InterfaceC44951d<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C41874r0(name, new a(primitiveSerializer));
    }
}
