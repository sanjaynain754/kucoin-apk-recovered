package androidx.savedstate.serialization;

import kotlinx.serialization.encoding.AbstractC41786a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: compiled from: SavedStateDecoder.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Lkotlinx/serialization/encoding/a;", "<init>", "()V", "Lvg0/f;", "descriptor", "", "decodeElementIndex", "(Lvg0/f;)I", "Lyg0/a;", "serializersModule", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
final class EmptyArrayDecoder extends AbstractC41786a {

    @NotNull
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();

    @NotNull
    private static final AbstractC46494a serializersModule = C46495b.m102577a();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return serializersModule;
    }

    private EmptyArrayDecoder() {
    }
}
