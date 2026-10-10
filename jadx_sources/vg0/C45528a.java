package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: vg0.a */
/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0017R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b \u0010\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006("}, m90084d2 = {"Lvg0/a;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lvg0/f;", "descriptor", "", "", "annotations", "", "isOptional", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lvg0/f;Ljava/util/List;Z)V", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", "d", "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
public final class C45528a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends Annotation> annotations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> elementNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<String> uniqueNames;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC45533f> elementDescriptors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<List<Annotation>> elementAnnotations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<Boolean> elementOptionality;

    public C45528a(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = CollectionsKt.emptyList();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m100517b(C45528a c45528a, String str, InterfaceC45533f interfaceC45533f, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        c45528a.m100518a(str, interfaceC45533f, list, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m100518a(@NotNull String elementName, @NotNull InterfaceC45533f descriptor, @NotNull List<? extends Annotation> annotations, boolean isOptional) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.uniqueNames.add(elementName)) {
            this.elementNames.add(elementName);
            this.elementDescriptors.add(descriptor);
            this.elementAnnotations.add(annotations);
            this.elementOptionality.add(Boolean.valueOf(isOptional));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.serialName).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Annotation> m100519c() {
        return this.annotations;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<List<Annotation>> m100520d() {
        return this.elementAnnotations;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<InterfaceC45533f> m100521e() {
        return this.elementDescriptors;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m100522f() {
        return this.elementNames;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<Boolean> m100523g() {
        return this.elementOptionality;
    }

    /* JADX INFO: renamed from: h */
    public final void m100524h(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.annotations = list;
    }
}
