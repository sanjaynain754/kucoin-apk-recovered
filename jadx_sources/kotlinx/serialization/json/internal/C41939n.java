package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.n */
/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R*\u00100\u001a\u00020&2\u0006\u0010)\u001a\u00020&8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b+\u0010.\"\u0004\b/\u0010(¨\u00061"}, m90084d2 = {"Lkotlinx/serialization/json/internal/n;", "", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;)V", "", "b", "()V", "q", "c", "d", "p", "", "v", "f", "(C)V", "", "k", "(Ljava/lang/String;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(F)V", "", "g", "(D)V", "", "e", "(B)V", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(S)V", "", "i", "(I)V", "", "j", "(J)V", "", "m", "(Z)V", "value", "n", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Z", "()Z", "o", "writingFirst", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C41939n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final InternalJsonWriter writer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean writingFirst;

    /* JADX INFO: renamed from: b */
    public void mo91965b() {
        this.writingFirst = true;
    }

    /* JADX INFO: renamed from: c */
    public void mo91966c() {
        this.writingFirst = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo91967d() {
        this.writingFirst = false;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    /* JADX INFO: renamed from: e */
    public void mo91968e(byte v11) {
        this.writer.writeLong(v11);
    }

    /* JADX INFO: renamed from: f */
    public final void m91969f(char v11) {
        this.writer.mo91791a(v11);
    }

    /* JADX INFO: renamed from: g */
    public void m91970g(double v11) {
        this.writer.mo91793c(String.valueOf(v11));
    }

    /* JADX INFO: renamed from: h */
    public void m91971h(float v11) {
        this.writer.mo91793c(String.valueOf(v11));
    }

    /* JADX INFO: renamed from: i */
    public void mo91972i(int v11) {
        this.writer.writeLong(v11);
    }

    /* JADX INFO: renamed from: j */
    public void mo91973j(long v11) {
        this.writer.writeLong(v11);
    }

    /* JADX INFO: renamed from: l */
    public void mo91975l(short v11) {
        this.writer.writeLong(v11);
    }

    /* JADX INFO: renamed from: m */
    public void m91976m(boolean v11) {
        this.writer.mo91793c(String.valueOf(v11));
    }

    /* JADX INFO: renamed from: o */
    public final void m91978o(boolean z11) {
        this.writingFirst = z11;
    }

    public C41939n(@NotNull InternalJsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m91974k(@NotNull String v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        this.writer.mo91793c(v11);
    }

    /* JADX INFO: renamed from: n */
    public void mo91977n(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.mo91792b(value);
    }

    /* JADX INFO: renamed from: p */
    public void mo91979p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo91980q() {
    }
}
