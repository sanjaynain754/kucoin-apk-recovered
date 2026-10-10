package androidx.savedstate.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: MutableStateFlowSerializer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "Lkotlinx/coroutines/flow/n;", "valueSerializer", "<init>", "(Ltg0/d;)V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Lkotlinx/coroutines/flow/n;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Lkotlinx/coroutines/flow/n;", "Ltg0/d;", "Lvg0/f;", "descriptor", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "getDescriptor$annotations", "()V", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MutableStateFlowSerializer<T> implements InterfaceC44951d<InterfaceC41669n<T>> {

    @NotNull
    private final InterfaceC45533f descriptor;

    @NotNull
    private final InterfaceC44951d<T> valueSerializer;

    @Override // tg0.InterfaceC44949c
    @NotNull
    public InterfaceC41669n<T> deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return C41679x.m91009a(decoder.decodeSerializableValue(this.valueSerializer));
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull InterfaceC41669n<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.valueSerializer, value.getValue());
    }

    public MutableStateFlowSerializer(@NotNull InterfaceC44951d<T> valueSerializer) {
        InterfaceC45533f interfaceC45533fM100543d;
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        AbstractC45541n kind = valueSerializer.getDescriptor().getKind();
        if (kind instanceof AbstractC45532e) {
            interfaceC45533fM100543d = C45540m.m100542c("kotlinx.coroutines.flow.MutableStateFlow", (AbstractC45532e) kind);
        } else {
            interfaceC45533fM100543d = C45540m.m100543d("kotlinx.coroutines.flow.MutableStateFlow", valueSerializer.getDescriptor());
        }
        this.descriptor = interfaceC45533fM100543d;
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }
}
