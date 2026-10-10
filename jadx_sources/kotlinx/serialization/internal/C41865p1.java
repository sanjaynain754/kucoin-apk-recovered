package kotlinx.serialization.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;
import wg0.AbstractC45828a;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.p1 */
/* JADX INFO: compiled from: NoOpEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m90084d2 = {"Lkotlinx/serialization/internal/p1;", "Lwg0/a;", "<init>", "()V", "", "value", "", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "Lvg0/f;", "enumDescriptor", "index", "encodeEnum", "(Lvg0/f;I)V", "Lyg0/a;", "b", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41865p1 extends AbstractC45828a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41865p1 f92000a = new C41865p1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC46494a serializersModule = C46495b.m102577a();

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return serializersModule;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // wg0.AbstractC45828a
    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeNull() {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeBoolean(boolean value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeByte(byte value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeChar(char value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeDouble(double value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeFloat(float value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeInt(int value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeLong(long value) {
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeShort(short value) {
    }
}
