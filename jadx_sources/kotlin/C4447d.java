package kotlin;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b1.d */
/* JADX INFO: compiled from: Logs.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lb1/g;", "", "tag", "", "throwable", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lb1/g;Ljava/lang/String;Ljava/lang/Throwable;)V", "coil-base_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
@JvmName(name = "-Logs")
public final class C4447d {
    /* JADX INFO: renamed from: a */
    public static final void m4236a(@NotNull InterfaceC4450g interfaceC4450g, @NotNull String tag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(interfaceC4450g, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (interfaceC4450g.getLevel() <= 6) {
            interfaceC4450g.m4240a(tag, 6, null, throwable);
        }
    }
}
