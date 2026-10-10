package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vg0.p */
/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR\u0014\u0010!\u001a\u00020\u00148VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Lvg0/p;", "Lvg0/f;", "", "serialName", "original", "<init>", "(Ljava/lang/String;Lvg0/f;)V", "", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "i", "(I)Z", "b", "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "()Z", "isNullable", "isInline", "e", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C45543p implements InterfaceC45533f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC45533f f102634a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String serialName;

    public C45543p(@NotNull String serialName, @NotNull InterfaceC45533f original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f102634a = original;
        this.serialName = serialName;
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: b */
    public boolean mo91523b() {
        return this.f102634a.mo91523b();
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: c */
    public int mo91524c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f102634a.mo91524c(name);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        return this.f102634a.mo91525d(index);
    }

    @Override // vg0.InterfaceC45533f
    /* JADX INFO: renamed from: e */
    public int getElementsCount() {
        return this.f102634a.getElementsCount();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo91527f(int index) {
        return this.f102634a.mo91527f(index);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Annotation> mo91528g(int index) {
        return this.f102634a.mo91528g(index);
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f102634a.getAnnotations();
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return this.f102634a.getKind();
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
        return this.f102634a.mo91529i(index);
    }

    @Override // vg0.InterfaceC45533f
    public boolean isInline() {
        return this.f102634a.isInline();
    }
}
