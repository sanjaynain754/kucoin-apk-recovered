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

/* JADX INFO: renamed from: kotlinx.serialization.internal.j1 */
/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010*\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u001dR\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0001\u0002/0¨\u00061"}, m90084d2 = {"Lkotlinx/serialization/internal/j1;", "Lvg0/f;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lvg0/f;Lvg0/f;)V", "", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "i", "(I)Z", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Lvg0/f;", "getKeyDescriptor", "()Lvg0/f;", "getValueDescriptor", "I", "e", "elementsCount", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "Lkotlinx/serialization/internal/n0;", "Lkotlinx/serialization/internal/z0;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class AbstractC41835j1 implements InterfaceC45533f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f keyDescriptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f valueDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int elementsCount;

    public /* synthetic */ AbstractC41835j1(String str, InterfaceC45533f interfaceC45533f, InterfaceC45533f interfaceC45533f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC45533f, interfaceC45533f2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbstractC41835j1)) {
            return false;
        }
        AbstractC41835j1 abstractC41835j1 = (AbstractC41835j1) other;
        return Intrinsics.areEqual(getSerialName(), abstractC41835j1.getSerialName()) && Intrinsics.areEqual(this.keyDescriptor, abstractC41835j1.keyDescriptor) && Intrinsics.areEqual(this.valueDescriptor, abstractC41835j1.valueDescriptor);
    }

    public AbstractC41835j1(String str, InterfaceC45533f interfaceC45533f, InterfaceC45533f interfaceC45533f2) {
        this.serialName = str;
        this.keyDescriptor = interfaceC45533f;
        this.valueDescriptor = interfaceC45533f2;
        this.elementsCount = 2;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        if (index >= 0) {
            int i11 = index % 2;
            if (i11 == 0) {
                return this.keyDescriptor;
            }
            if (i11 == 1) {
                return this.valueDescriptor;
            }
            throw new IllegalStateException("Unreached");
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
        return AbstractC45542o.c.f102632a;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
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
        return getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
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

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.keyDescriptor.hashCode()) * 31) + this.valueDescriptor.hashCode();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return InterfaceC45533f.a.m100529b(this);
    }
}
