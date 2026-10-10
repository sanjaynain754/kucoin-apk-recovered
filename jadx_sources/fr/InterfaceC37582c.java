package fr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkResponse;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fr.c */
/* JADX INFO: compiled from: ICall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lfr/c;", "", "", "exception", "", "onFailure", "(Ljava/lang/Throwable;)V", "Lcom/kubi/network/api/model/NetworkResponse;", "response", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkResponse;)V", "Ljava/util/concurrent/Executor;", "executor", "b", "(Ljava/util/concurrent/Executor;)Lfr/c;", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37582c {

    /* JADX INFO: renamed from: fr.c$a */
    /* JADX INFO: compiled from: ICall.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m84717a(@NotNull InterfaceC37582c interfaceC37582c, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        /* JADX INFO: renamed from: b */
        public static void m84718b(@NotNull InterfaceC37582c interfaceC37582c, @NotNull NetworkResponse<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public static InterfaceC37582c m84719c(@NotNull InterfaceC37582c interfaceC37582c, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            return new C37589h(interfaceC37582c, executor);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo23836a(@NotNull NetworkResponse<?> response);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC37582c mo23837b(@NotNull Executor executor);

    void onFailure(@NotNull Throwable exception);
}
