package com.otaliastudios.transcoder.internal.thumbnails;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.internal.C27335a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import q90.C43671b;
import v90.C45483a;
import w90.C45770i;

/* JADX INFO: compiled from: ThumbnailsEngine.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class ThumbnailsEngine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C45770i f55765b = new C45770i("ThumbnailsEngine");

    /* JADX INFO: compiled from: ThumbnailsEngine.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/thumbnails/ThumbnailsEngine$Companion;", "", "<init>", "()V", "Lq90/b;", "options", "", "thumbnails", "(Lq90/b;)V", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Z", "Lw90/i;", "log", "Lw90/i;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m68058a(Throwable th2) {
            Throwable cause;
            if (th2 instanceof InterruptedException) {
                return true;
            }
            if (Intrinsics.areEqual(th2, th2.getCause()) || (cause = th2.getCause()) == null) {
                return false;
            }
            return m68058a(cause);
        }

        @JvmStatic
        public final void thumbnails(@NotNull C43671b options) throws Exception {
            Intrinsics.checkNotNullParameter(options, "options");
            ThumbnailsEngine.f55765b.m101066c("thumbnails(): called...");
            C45483a c45483a = new C45483a(options);
            try {
                new C27335a(options);
                throw null;
            } catch (Exception e11) {
                if (m68058a(e11)) {
                    ThumbnailsEngine.f55765b.m101067d("Transcode canceled.", e11);
                    c45483a.m100438b();
                } else {
                    ThumbnailsEngine.f55765b.m101065b("Unexpected error while transcoding.", e11);
                    c45483a.m100439c(e11);
                    throw e11;
                }
            }
        }
    }
}
