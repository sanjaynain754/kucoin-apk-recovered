package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import kotlinx.serialization.internal.C41861o2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: vg0.m */
/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00132\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"", "serialName", "", "Lvg0/f;", "typeParameters", "Lkotlin/Function1;", "Lvg0/a;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "e", "(Ljava/lang/String;[Lvg0/f;Lkotlin/jvm/functions/Function1;)Lvg0/f;", "Lvg0/e;", C33612dh.f69618m, "c", "(Ljava/lang/String;Lvg0/e;)Lvg0/f;", "original", "d", "(Ljava/lang/String;Lvg0/f;)Lvg0/f;", "Lvg0/n;", "builder", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Lvg0/n;[Lvg0/f;Lkotlin/jvm/functions/Function1;)Lvg0/f;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class C45540m {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC45533f m100542c(@NotNull String serialName, @NotNull AbstractC45532e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return C41861o2.m91671a(serialName, kind);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC45533f m100543d(@NotNull String serialName, @NotNull InterfaceC45533f original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (original.getKind() instanceof AbstractC45532e) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!Intrinsics.areEqual(serialName, original.getSerialName())) {
            return new C45543p(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.getSerialName() + ')').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC45533f m100544e(@NotNull String serialName, @NotNull InterfaceC45533f[] typeParameters, @NotNull Function1<? super C45528a, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C45528a c45528a = new C45528a(serialName);
        builderAction.invoke(c45528a);
        return new C45536i(serialName, AbstractC45542o.a.f102630a, c45528a.m100522f().size(), ArraysKt.toList(typeParameters), c45528a);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC45533f m100545f(String str, InterfaceC45533f[] interfaceC45533fArr, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = new Function1() { // from class: vg0.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C45540m.m100546g((C45528a) obj2);
                }
            };
        }
        return m100544e(str, interfaceC45533fArr, function1);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m100546g(C45528a c45528a) {
        Intrinsics.checkNotNullParameter(c45528a, "<this>");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final InterfaceC45533f m100547h(@NotNull String serialName, @NotNull AbstractC45541n kind, @NotNull InterfaceC45533f[] typeParameters, @NotNull Function1<? super C45528a, Unit> builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, AbstractC45542o.a.f102630a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C45528a c45528a = new C45528a(serialName);
        builder.invoke(c45528a);
        return new C45536i(serialName, kind, c45528a.m100522f().size(), ArraysKt.toList(typeParameters), c45528a);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC45533f m100548i(String str, AbstractC45541n abstractC45541n, InterfaceC45533f[] interfaceC45533fArr, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = new Function1() { // from class: vg0.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C45540m.m100549j((C45528a) obj2);
                }
            };
        }
        return m100547h(str, abstractC45541n, interfaceC45533fArr, function1);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m100549j(C45528a c45528a) {
        Intrinsics.checkNotNullParameter(c45528a, "<this>");
        return Unit.INSTANCE;
    }
}
