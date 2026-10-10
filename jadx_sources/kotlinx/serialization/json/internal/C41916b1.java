package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.AbstractC45531d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.C45529b;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.b1 */
/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lxg0/a;", "Lvg0/f;", "desc", "Lkotlinx/serialization/json/internal/WriteMode;", "b", "(Lxg0/a;Lvg0/f;)Lkotlinx/serialization/json/internal/WriteMode;", "Lyg0/a;", "module", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;Lyg0/a;)Lvg0/f;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
public final class C41916b1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC45533f m91874a(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46494a module) {
        InterfaceC45533f interfaceC45533fM91874a;
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(interfaceC45533f.getKind(), AbstractC45541n.a.f102628a)) {
            return interfaceC45533f.getIsInline() ? m91874a(interfaceC45533f.mo91525d(0), module) : interfaceC45533f;
        }
        InterfaceC45533f interfaceC45533fM100526b = C45529b.m100526b(module, interfaceC45533f);
        return (interfaceC45533fM100526b == null || (interfaceC45533fM91874a = m91874a(interfaceC45533fM100526b, module)) == null) ? interfaceC45533f : interfaceC45533fM91874a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final WriteMode m91875b(@NotNull AbstractC46162a abstractC46162a, @NotNull InterfaceC45533f desc) {
        Intrinsics.checkNotNullParameter(abstractC46162a, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        AbstractC45541n kind = desc.getKind();
        if (kind instanceof AbstractC45531d) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, AbstractC45542o.b.f102631a)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(kind, AbstractC45542o.c.f102632a)) {
            return WriteMode.OBJ;
        }
        InterfaceC45533f interfaceC45533fM91874a = m91874a(desc.mo91525d(0), abstractC46162a.getSerializersModule());
        AbstractC45541n kind2 = interfaceC45533fM91874a.getKind();
        if ((kind2 instanceof AbstractC45532e) || Intrinsics.areEqual(kind2, AbstractC45541n.b.f102629a)) {
            return WriteMode.MAP;
        }
        if (abstractC46162a.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw C41915b0.m91864d(interfaceC45533fM91874a);
    }
}
