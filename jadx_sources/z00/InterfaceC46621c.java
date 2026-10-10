package z00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.sdk.web.tracker.model.WebPerformanceStageModel;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z00.c */
/* JADX INFO: compiled from: WebViewEventListener.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\u00072\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010%¨\u0006'"}, m90084d2 = {"Lz00/c;", "", "", "url", "", TUIConstantDefine.CREATE_TIME, "type", "", "e", "(Ljava/lang/String;JLjava/lang/String;)V", "Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;", "model", "g", "(Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;)V", "", "newProgress", "b", "(I)V", "c", "(Ljava/lang/String;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "", ReportDataTable.COLUMN_PARAMS, "f", "(Ljava/util/Map;)V", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/sdk/web/core/WebLoadError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "(Lcom/kubi/sdk/web/core/WebLoadError;)V", "onTimeout", "()V", "onClose", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC46621c {

    /* JADX INFO: renamed from: z00.c$a */
    /* JADX INFO: compiled from: WebViewEventListener.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m102790b(InterfaceC46621c interfaceC46621c, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadSuccess");
            }
            if ((i11 & 1) != 0) {
                map = null;
            }
            interfaceC46621c.mo58797f(map);
        }

        /* JADX INFO: renamed from: c */
        public static void m102791c(@NotNull InterfaceC46621c interfaceC46621c, @NotNull String url, long j11, @NotNull String type) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX INFO: renamed from: d */
        public static void m102792d(@NotNull InterfaceC46621c interfaceC46621c, @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        /* JADX INFO: renamed from: e */
        public static void m102793e(@NotNull InterfaceC46621c interfaceC46621c, @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        /* JADX INFO: renamed from: f */
        public static void m102794f(@NotNull InterfaceC46621c interfaceC46621c, @NotNull WebPerformanceStageModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
        }

        /* JADX INFO: renamed from: a */
        public static void m102789a(@NotNull InterfaceC46621c interfaceC46621c) {
        }

        /* JADX INFO: renamed from: g */
        public static void m102795g(@NotNull InterfaceC46621c interfaceC46621c, int i11) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo58792a(@NotNull String pageType, double dclTime, @NotNull String currentProjectName, @NotNull String currentProjectVersion);

    /* JADX INFO: renamed from: b */
    void mo58793b(int newProgress);

    /* JADX INFO: renamed from: c */
    void mo58794c(@NotNull String url);

    /* JADX INFO: renamed from: d */
    void mo58795d(@NotNull WebLoadError error);

    /* JADX INFO: renamed from: e */
    void mo58796e(@NotNull String url, long createTime, @NotNull String type);

    /* JADX INFO: renamed from: f */
    void mo58797f(@Nullable Map<String, ? extends Object> params);

    /* JADX INFO: renamed from: g */
    void mo58798g(@NotNull WebPerformanceStageModel model);

    /* JADX INFO: renamed from: h */
    void mo58799h(@NotNull String url);

    void onClose();

    void onTimeout();
}
