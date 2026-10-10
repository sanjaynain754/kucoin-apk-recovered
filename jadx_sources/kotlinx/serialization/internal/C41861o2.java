package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.o2 */
/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"", "serialName", "Lvg0/e;", C33612dh.f69618m, "Lvg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lvg0/e;)Lvg0/f;", "", "c", "(Ljava/lang/String;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "Ltg0/d;", "b", "(Lkotlin/reflect/KClass;)Ltg0/d;", "", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class C41861o2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<KClass<?>, InterfaceC44951d<?>> f91996a = C41791a2.m91454i();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC45533f m91671a(@NotNull String serialName, @NotNull AbstractC45532e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        m91673c(serialName);
        return new PrimitiveDescriptor(serialName, kind);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC44951d<T> m91672b(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (InterfaceC44951d) f91996a.get(kClass);
    }

    /* JADX INFO: renamed from: c */
    public static final void m91673c(String str) {
        for (InterfaceC44951d<?> interfaceC44951d : f91996a.values()) {
            if (Intrinsics.areEqual(str, interfaceC44951d.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + Reflection.getOrCreateKotlinClass(interfaceC44951d.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
