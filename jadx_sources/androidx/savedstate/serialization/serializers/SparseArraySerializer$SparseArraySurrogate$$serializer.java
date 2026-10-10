package androidx.savedstate.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.InterfaceC41849m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/m0;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "Ltg0/d;", "typeSerial0", "(Ltg0/d;)V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "", "childSerializers", "()[Ltg0/d;", "typeParametersSerializers", "Lvg0/f;", "descriptor", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements InterfaceC41849m0<SparseArraySerializer.SparseArraySurrogate<T>> {

    @NotNull
    private final InterfaceC45533f descriptor;
    private final /* synthetic */ InterfaceC44951d<?> typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        C41826h2 c41826h2 = new C41826h2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        c41826h2.m91581o("keys", false);
        c41826h2.m91581o("values", false);
        this.descriptor = c41826h2;
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(@NotNull InterfaceC41787b decoder) {
        List list;
        List list2;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC45533f interfaceC45533f = this.descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(interfaceC45533f);
        Lazy[] lazyArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, new C41813f(this.typeSerial0), null);
            i11 = 3;
        } else {
            boolean z11 = true;
            int i12 = 0;
            List list3 = null;
            List list4 = null;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(interfaceC45533f);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 0, (InterfaceC44949c) lazyArr[0].getValue(), list3);
                    i12 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(interfaceC45533f, 1, new C41813f(this.typeSerial0), list4);
                    i12 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i11 = i12;
        }
        compositeDecoderBeginStructure.endStructure(interfaceC45533f);
        return new SparseArraySerializer.SparseArraySurrogate<>(i11, list, list2, null);
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(@NotNull InterfaceC45830c encoder, @NotNull SparseArraySerializer.SparseArraySurrogate<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC45533f interfaceC45533f = this.descriptor;
        InterfaceC45829b interfaceC45829bBeginStructure = encoder.beginStructure(interfaceC45533f);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(value, interfaceC45829bBeginStructure, interfaceC45533f, this.typeSerial0);
        interfaceC45829bBeginStructure.endStructure(interfaceC45533f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(@NotNull InterfaceC44951d<T> typeSerial0) {
        this();
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }

    private final /* synthetic */ InterfaceC44951d getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public final InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    @NotNull
    public final InterfaceC44951d<?>[] typeParametersSerializers() {
        return new InterfaceC44951d[]{this.typeSerial0};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.InterfaceC41849m0
    @NotNull
    public final InterfaceC44951d<?>[] childSerializers() {
        return new InterfaceC44951d[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new C41813f(this.typeSerial0)};
    }
}
