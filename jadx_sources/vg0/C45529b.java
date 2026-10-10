package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.internal.C41871q2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44951d;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: vg0.b */
/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"$\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m90084d2 = {"Lyg0/a;", "Lvg0/f;", "descriptor", "b", "(Lyg0/a;Lvg0/f;)Lvg0/f;", "Lkotlin/reflect/KClass;", "context", "c", "(Lvg0/f;Lkotlin/reflect/KClass;)Lvg0/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(Lvg0/f;)V", "capturedKClass", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1557#3:113\n1628#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
public final class C45529b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final KClass<?> m100525a(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        if (interfaceC45533f instanceof ContextDescriptor) {
            return ((ContextDescriptor) interfaceC45533f).kClass;
        }
        if (interfaceC45533f instanceof C41871q2) {
            return m100525a(((C41871q2) interfaceC45533f).getOriginal());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f m100526b(@NotNull AbstractC46494a abstractC46494a, @NotNull InterfaceC45533f descriptor) {
        InterfaceC44951d interfaceC44951dM102576c;
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> kClassM100525a = m100525a(descriptor);
        if (kClassM100525a == null || (interfaceC44951dM102576c = AbstractC46494a.m102576c(abstractC46494a, kClassM100525a, null, 2, null)) == null) {
            return null;
        }
        return interfaceC44951dM102576c.getDescriptor();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC45533f m100527c(@NotNull InterfaceC45533f interfaceC45533f, @NotNull KClass<?> context) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContextDescriptor(interfaceC45533f, context);
    }
}
