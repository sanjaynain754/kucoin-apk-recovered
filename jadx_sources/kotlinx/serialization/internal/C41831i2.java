package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.AbstractC45541n;
import vg0.C45537j;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.i2 */
/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lvg0/f;", "", "typeParams", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;[Lvg0/f;)I", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1797#3,3:136\n1797#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
public final class C41831i2 {
    /* JADX INFO: renamed from: a */
    public static final int m91601a(@NotNull InterfaceC45533f interfaceC45533f, @NotNull InterfaceC45533f[] typeParams) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (interfaceC45533f.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<InterfaceC45533f> iterableM100536a = C45537j.m100536a(interfaceC45533f);
        Iterator<InterfaceC45533f> it = iterableM100536a.iterator();
        int iHashCode2 = 1;
        int i11 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i12 = i11 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i11 = i12 + iHashCode3;
        }
        Iterator<InterfaceC45533f> it2 = iterableM100536a.iterator();
        while (it2.hasNext()) {
            int i13 = iHashCode2 * 31;
            AbstractC45541n kind = it2.next().getKind();
            iHashCode2 = i13 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i11) * 31) + iHashCode2;
    }
}
