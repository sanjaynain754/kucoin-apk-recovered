package androidx.savedstate.serialization.serializers;

import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: BuiltInSerializer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"", "serialName", "Lwg0/c;", "encoder", "encoderErrorMessage", "(Ljava/lang/String;Lwg0/c;)Ljava/lang/String;", "Lkotlinx/serialization/encoding/b;", "decoder", "decoderErrorMessage", "(Ljava/lang/String;Lkotlinx/serialization/encoding/b;)Ljava/lang/String;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BuiltInSerializerKt {
    @NotNull
    public static final String decoderErrorMessage(@NotNull String serialName, @NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + Reflection.getOrCreateKotlinClass(decoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    @NotNull
    public static final String encoderErrorMessage(@NotNull String serialName, @NotNull InterfaceC45830c encoder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + Reflection.getOrCreateKotlinClass(encoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
