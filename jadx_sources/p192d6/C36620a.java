package p192d6;

import android.os.Trace;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d6.a */
/* JADX INFO: compiled from: DefaultFrescoSystrace.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Ld6/a;", "Ld6/b$c;", "<init>", "()V", "", "name", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "b", "", "isTracing", "()Z", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C36620a implements C36621b.c {
    @Override // p192d6.C36621b.c
    public boolean isTracing() {
        return false;
    }

    @Override // p192d6.C36621b.c
    /* JADX INFO: renamed from: a */
    public void mo81955a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // p192d6.C36621b.c
    /* JADX INFO: renamed from: b */
    public void mo81956b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }
}
