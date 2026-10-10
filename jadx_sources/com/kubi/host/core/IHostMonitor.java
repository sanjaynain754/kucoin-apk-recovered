package com.kubi.host.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IHostMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/host/core/IHostMonitor;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface IHostMonitor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f27113a;

    /* JADX INFO: compiled from: IHostMonitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/host/core/IHostMonitor$Companion;", "", "<init>", "()V", "Lcom/kubi/host/core/b;", "b", "Lcom/kubi/host/core/b;", "getImplement", "()Lcom/kubi/host/core/b;", "implement", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f27113a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final C15180b implement = new C15180b();

        @NotNull
        public final C15180b getImplement() {
            return implement;
        }
    }
}
