package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ug0.C45236a;
import vg0.InterfaceC45533f;
import xg0.C46174i;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.t0 */
/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\n"}, m90084d2 = {"", "Lvg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Set;", "unsignedNumberDescriptors", "", "b", "(Lvg0/f;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41952t0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<InterfaceC45533f> f92163a = SetsKt.setOf((Object[]) new InterfaceC45533f[]{C45236a.serializer(UInt.INSTANCE).getDescriptor(), C45236a.serializer(ULong.INSTANCE).getDescriptor(), C45236a.serializer(UByte.INSTANCE).getDescriptor(), C45236a.serializer(UShort.INSTANCE).getDescriptor()});

    /* JADX INFO: renamed from: a */
    public static final boolean m92008a(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return interfaceC45533f.getIsInline() && Intrinsics.areEqual(interfaceC45533f, C46174i.m101824m());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92009b(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        return interfaceC45533f.getIsInline() && f92163a.contains(interfaceC45533f);
    }
}
