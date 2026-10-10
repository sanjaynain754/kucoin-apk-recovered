package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: BuiltInSerializer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/SavedStateSerializer;", "Ltg0/d;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Landroid/os/Bundle;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Landroid/os/Bundle;", "Lvg0/f;", "descriptor", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,87:1\n106#2:88\n106#2:89\n90#2:90\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n*L\n55#1:88\n57#1:89\n70#1:90\n*E\n"})
public final class SavedStateSerializer implements InterfaceC44951d<Bundle> {

    @NotNull
    public static final SavedStateSerializer INSTANCE = new SavedStateSerializer();

    @NotNull
    private static final InterfaceC45533f descriptor = C45540m.m100545f("androidx.savedstate.SavedState", new InterfaceC45533f[0], null, 4, null);

    @Override // tg0.InterfaceC44949c
    @NotNull
    public Bundle deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return Intrinsics.areEqual(savedStateDecoder.getKey(), "") ? savedStateDecoder.getSavedState() : SavedStateReader.m103646getSavedStateimpl(SavedStateReader.m103589constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull Bundle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        if (Intrinsics.areEqual(savedStateEncoder.getKey(), "")) {
            SavedStateWriter.m103679putAllimpl(SavedStateWriter.m103675constructorimpl(savedStateEncoder.getSavedState()), value);
        } else {
            SavedStateWriter.m103702putSavedStateimpl(SavedStateWriter.m103675constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
        }
    }

    private SavedStateSerializer() {
    }
}
