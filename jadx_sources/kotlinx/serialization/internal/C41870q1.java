package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.q1 */
/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016R\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006+"}, m90084d2 = {"Lkotlinx/serialization/internal/q1;", "Lvg0/f;", "<init>", "()V", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "i", "(I)Z", "d", "(I)Lvg0/f;", "", "", "g", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Void;", "Lvg0/n;", "b", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "serialName", "e", "elementsCount", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41870q1 implements InterfaceC45533f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41870q1 f92008a = new C41870q1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC45541n kind = AbstractC45542o.d.f102633a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String serialName = "kotlin.Nothing";

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e */
    public int getElementsCount() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final Void m91702a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m91702a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(@Nullable Object other) {
        return this == other;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return kind;
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: h */
    public String getSerialName() {
        return serialName;
    }

    @NotNull
    public String toString() {
        return "NothingSerialDescriptor";
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return InterfaceC45533f.a.m100530c(this);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        m91702a();
        throw new KotlinNothingValueException();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        m91702a();
        throw new KotlinNothingValueException();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        m91702a();
        throw new KotlinNothingValueException();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        return InterfaceC45533f.a.m100528a(this);
    }

    public int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: i */
    public boolean mo91529i(int index) {
        m91702a();
        throw new KotlinNothingValueException();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return InterfaceC45533f.a.m100529b(this);
    }
}
