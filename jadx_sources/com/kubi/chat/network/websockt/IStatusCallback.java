package com.kubi.chat.network.websockt;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ChatSocketExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/IStatusCallback;", "", "", "onConnected", "()V", "onDisconnect", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IStatusCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f19373a;

    /* JADX INFO: compiled from: ChatSocketExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;", "", "<init>", "()V", "", "<set-?>", "b", "Z", "isConnected", "()Z", "setConnected$ImSDK_release", "(Z)V", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19373a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static volatile boolean isConnected;

        public final boolean isConnected() {
            return isConnected;
        }

        public final void setConnected$ImSDK_release(boolean z11) {
            isConnected = z11;
        }
    }

    void onConnected();

    void onDisconnect();
}
