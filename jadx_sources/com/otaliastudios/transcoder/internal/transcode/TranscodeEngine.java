package com.otaliastudios.transcoder.internal.transcode;

import androidx.media3.exoplayer.upstream.CmcdData;
import ca0.InterfaceC4920a;
import com.otaliastudios.transcoder.internal.C27335a;
import da0.InterfaceC36655b;
import ea0.InterfaceC37126b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import q90.C43674e;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45773l;
import x90.InterfaceC46104a;
import z90.InterfaceC46735a;

/* JADX INFO: compiled from: TranscodeEngine.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;", "", "<init>", "()V", "", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class TranscodeEngine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C45770i f55781b = new C45770i("TranscodeEngine");

    /* JADX INFO: compiled from: TranscodeEngine.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;", "", "<init>", "()V", "Lq90/e;", "options", "", "transcode", "(Lq90/e;)V", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Z", "Lw90/i;", "log", "Lw90/i;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m68067a(Throwable th2) {
            Throwable cause;
            if (th2 instanceof InterruptedException) {
                return true;
            }
            if (Intrinsics.areEqual(th2, th2.getCause()) || (cause = th2.getCause()) == null) {
                return false;
            }
            return m68067a(cause);
        }

        @JvmStatic
        public final void transcode(@NotNull C43674e options) throws Throwable {
            Exception exc;
            Throwable th2;
            Intrinsics.checkNotNullParameter(options, "options");
            TranscodeEngine.f55781b.m101066c("transcode(): called...");
            final C27364a c27364a = new C27364a(options);
            DefaultTranscodeEngine defaultTranscodeEngine = null;
            try {
                try {
                    C27335a c27335a = new C27335a(options);
                    InterfaceC46735a dataSink = options.m96114q();
                    InterfaceC45773l interfaceC45773lM101098c = C45774m.m101098c(options.m96121x(), options.m96113p());
                    InterfaceC37126b validator = options.m96118u();
                    int iM96120w = options.m96120w();
                    InterfaceC36655b timeInterpolator = options.m96117t();
                    InterfaceC4920a audioStretcher = options.m96112o();
                    InterfaceC46104a audioResampler = options.m96111n();
                    Intrinsics.checkNotNullExpressionValue(dataSink, "dataSink");
                    Intrinsics.checkNotNullExpressionValue(validator, "validator");
                    Intrinsics.checkNotNullExpressionValue(audioStretcher, "audioStretcher");
                    Intrinsics.checkNotNullExpressionValue(audioResampler, "audioResampler");
                    Intrinsics.checkNotNullExpressionValue(timeInterpolator, "timeInterpolator");
                    DefaultTranscodeEngine defaultTranscodeEngine2 = new DefaultTranscodeEngine(c27335a, dataSink, interfaceC45773lM101098c, validator, iM96120w, audioStretcher, audioResampler, timeInterpolator);
                    try {
                        if (!defaultTranscodeEngine2.m68064h()) {
                            c27364a.m68072e(1);
                        } else {
                            defaultTranscodeEngine2.m68063g(new Function1<Double, Unit>() { // from class: com.otaliastudios.transcoder.internal.transcode.TranscodeEngine$Companion$transcode$1
                                @Override // p852kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Double d11) {
                                    invoke(d11.doubleValue());
                                    return Unit.INSTANCE;
                                }

                                {
                                    super(1);
                                }

                                public final void invoke(double d11) {
                                    c27364a.m68071d(d11);
                                }
                            });
                            c27364a.m68072e(0);
                        }
                        defaultTranscodeEngine2.mo68061b();
                    } catch (Exception e11) {
                        exc = e11;
                        defaultTranscodeEngine = defaultTranscodeEngine2;
                        if (m68067a(exc)) {
                            TranscodeEngine.f55781b.m101067d("Transcode canceled.", exc);
                            c27364a.m68069b();
                            if (defaultTranscodeEngine != null) {
                                defaultTranscodeEngine.mo68061b();
                                return;
                            }
                            return;
                        }
                        TranscodeEngine.f55781b.m101065b("Unexpected error while transcoding.", exc);
                        c27364a.m68070c(exc);
                        throw exc;
                    } catch (Throwable th3) {
                        th2 = th3;
                        defaultTranscodeEngine = defaultTranscodeEngine2;
                        if (defaultTranscodeEngine != null) {
                            defaultTranscodeEngine.mo68061b();
                            throw th2;
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Exception e12) {
                exc = e12;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo68061b();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m68066c(@NotNull C43674e c43674e) {
        INSTANCE.transcode(c43674e);
    }
}
