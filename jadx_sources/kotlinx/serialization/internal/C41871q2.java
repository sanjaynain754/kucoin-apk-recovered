package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.q2 */
/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\rR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b\u001f\u0010)R\u0014\u0010,\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010+R\u0014\u00100\u001a\u00020-8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0014\u00103\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m90084d2 = {"Lkotlinx/serialization/internal/q2;", "Lvg0/f;", "Lkotlinx/serialization/internal/n;", "original", "<init>", "(Lvg0/f;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "i", "(I)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lvg0/f;", "j", "()Lvg0/f;", "b", "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "serialName", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "()Z", "isNullable", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "isInline", "e", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41871q2 implements InterfaceC45533f, InterfaceC41853n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f original;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> serialNames;

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C41871q2) && Intrinsics.areEqual(this.original, ((C41871q2) other).original);
    }

    public C41871q2(@NotNull InterfaceC45533f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.original = original;
        this.serialName = original.getSerialName() + '?';
        this.serialNames = C41796b2.m91496a(original);
    }

    @Override // kotlinx.serialization.internal.InterfaceC41853n
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<String> mo91580a() {
        return this.serialNames;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.original.mo91524c(name);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        return this.original.mo91525d(index);
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e */
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        return this.original.mo91527f(index);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        return this.original.mo91528g(index);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return this.original.getKind();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return this.original.hashCode() * 31;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: i */
    public boolean mo91529i(int index) {
        return this.original.mo91529i(index);
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return this.original.getIsInline();
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC45533f getOriginal() {
        return this.original;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.original);
        sb2.append('?');
        return sb2.toString();
    }
}
