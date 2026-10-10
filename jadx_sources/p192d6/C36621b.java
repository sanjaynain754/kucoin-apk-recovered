package p192d6;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d6.b */
/* JADX INFO: compiled from: FrescoSystrace.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0007\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Ld6/b;", "", "<init>", "()V", "", "name", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "b", "", "d", "()Z", "Ld6/b$a;", "Ld6/b$a;", "NO_OP_ARGS_BUILDER", "Ld6/b$c;", "c", "Ld6/b$c;", "_instance", "()Ld6/b$c;", "instance", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C36621b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36621b f79431a = new C36621b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final a NO_OP_ARGS_BUILDER = new b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static c _instance;

    /* JADX INFO: renamed from: d6.b$a */
    /* JADX INFO: compiled from: FrescoSystrace.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"Ld6/b$a;", "", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface a {
    }

    /* JADX INFO: renamed from: d6.b$b */
    /* JADX INFO: compiled from: FrescoSystrace.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Ld6/b$b;", "Ld6/b$a;", "<init>", "()V", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b implements a {
    }

    /* JADX INFO: renamed from: d6.b$c */
    /* JADX INFO: compiled from: FrescoSystrace.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Ld6/b$c;", "", "", "name", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "b", "()V", "", "isTracing", "()Z", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo81955a(@NotNull String name);

        /* JADX INFO: renamed from: b */
        void mo81956b();

        boolean isTracing();
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m81957a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f79431a.m81960c().mo81955a(name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m81958b() {
        f79431a.m81960c().mo81956b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m81959d() {
        return f79431a.m81960c().isTracing();
    }

    /* JADX INFO: renamed from: c */
    public final c m81960c() {
        C36620a c36620a;
        c cVar = _instance;
        if (cVar != null) {
            return cVar;
        }
        synchronized (C36621b.class) {
            c36620a = new C36620a();
            _instance = c36620a;
        }
        return c36620a;
    }
}
