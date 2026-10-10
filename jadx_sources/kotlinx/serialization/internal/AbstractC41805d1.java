package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.d1 */
/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0005*+,-.¨\u0006/"}, m90084d2 = {"Lkotlinx/serialization/internal/d1;", "Lvg0/f;", "elementDescriptor", "<init>", "(Lvg0/f;)V", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "i", "(I)Z", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lvg0/f;", "getElementDescriptor", "()Lvg0/f;", "b", "I", "e", "elementsCount", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "Lkotlinx/serialization/internal/d;", "Lkotlinx/serialization/internal/e;", "Lkotlinx/serialization/internal/p0;", "Lkotlinx/serialization/internal/b1;", "Lkotlinx/serialization/internal/l2;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class AbstractC41805d1 implements InterfaceC45533f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f elementDescriptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int elementsCount;

    public /* synthetic */ AbstractC41805d1(InterfaceC45533f interfaceC45533f, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC45533f);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbstractC41805d1)) {
            return false;
        }
        AbstractC41805d1 abstractC41805d1 = (AbstractC41805d1) other;
        return Intrinsics.areEqual(this.elementDescriptor, abstractC41805d1.elementDescriptor) && Intrinsics.areEqual(getSerialName(), abstractC41805d1.getSerialName());
    }

    public AbstractC41805d1(InterfaceC45533f interfaceC45533f) {
        this.elementDescriptor = interfaceC45533f;
        this.elementsCount = 1;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        if (index >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return AbstractC45542o.b.f102631a;
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: i */
    public boolean mo91529i(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @NotNull
    public String toString() {
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return InterfaceC45533f.a.m100530c(this);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        return String.valueOf(index);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        return InterfaceC45533f.a.m100528a(this);
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return InterfaceC45533f.a.m100529b(this);
    }
}
