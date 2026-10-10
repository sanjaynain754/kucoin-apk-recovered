package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.h0 */
/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001b\u0010\u000b\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Lkotlinx/serialization/internal/h0;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lvg0/f;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lvg0/f;)V", "Lwg0/c;", "encoder", "value", "", "e", "(Lwg0/c;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "d", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)Lvg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/Enum;", "Lvg0/f;", "overriddenDescriptor", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lvg0/f;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13409#2,2:149\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n120#1:149,2\n*E\n"})
public final class C41824h0<T extends Enum<T>> implements InterfaceC44951d<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final T[] values;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC45533f overriddenDescriptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy descriptor;

    public C41824h0(@NotNull final String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.descriptor = LazyKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41824h0.m91566c(this.f91930b, serialName);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC45533f m91566c(C41824h0 c41824h0, String str) {
        InterfaceC45533f interfaceC45533f = c41824h0.overriddenDescriptor;
        return interfaceC45533f == null ? c41824h0.m91567b(str) : interfaceC45533f;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45533f m91567b(String serialName) {
        C41814f0 c41814f0 = new C41814f0(serialName, this.values.length);
        for (T t11 : this.values) {
            C41826h2.m91575p(c41814f0, t11.name(), false, 2, null);
        }
        return c41814f0;
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.values;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    @Override // tg0.InterfaceC44963p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf = ArraysKt.indexOf(this.values, value);
        if (iIndexOf != -1) {
            encoder.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().getSerialName());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return (InterfaceC45533f) this.descriptor.getValue();
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + Typography.greater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41824h0(@NotNull String serialName, @NotNull T[] values, @NotNull InterfaceC45533f descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }
}
