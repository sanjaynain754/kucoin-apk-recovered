package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.UByte;
import p852kotlin.jvm.internal.ByteCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.g3 */
/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/serialization/internal/g3;", "Ltg0/d;", "Lkotlin/UByte;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "b", "(Lwg0/c;B)V", "Lkotlinx/serialization/encoding/b;", "decoder", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/encoding/b;)B", "Lvg0/f;", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41822g3 implements InterfaceC44951d<UByte> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41822g3 f91935a = new C41822g3();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC45533f descriptor = C41879s0.m91713a("kotlin.UByte", C45236a.serializer(ByteCompanionObject.INSTANCE));

    /* JADX INFO: renamed from: a */
    public byte m91558a(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m103862constructorimpl(decoder.decodeInline(getDescriptor()).decodeByte());
    }

    /* JADX INFO: renamed from: b */
    public void m91559b(@NotNull InterfaceC45830c encoder, byte value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(value);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public /* bridge */ /* synthetic */ void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        m91559b(interfaceC45830c, ((UByte) obj).getData());
    }

    @Override // tg0.InterfaceC44949c
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC41787b interfaceC41787b) {
        return UByte.m103856boximpl(m91558a(interfaceC41787b));
    }
}
