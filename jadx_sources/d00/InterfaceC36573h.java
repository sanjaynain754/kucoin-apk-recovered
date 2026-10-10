package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiHomeFeedFeedTabItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.h */
/* JADX INFO: compiled from: KCJSApiHomeFeedModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JM\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJO\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJG\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ[\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010 2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Ld00/h;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiHomeFeedFeedTabItem;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "updatedTabsJson", "", "selectedIndex", "", "f", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function2;)V", "e", ViewProps.POSITION, "g", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;JLkotlin/jvm/functions/Function2;)V", "", "velocity", "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;DLkotlin/jvm/functions/Function2;)V", "b", CmcdData.Factory.STREAMING_FORMAT_HLS, "", ReportDataTable.COLUMN_PARAMS, "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36573h {
    /* JADX INFO: renamed from: a */
    void mo81864a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiHomeFeedFeedTabItem>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo81865b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo81866c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, double velocity, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo81867d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo81868e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo81869f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String updatedTabsJson, long selectedIndex, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo81870g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, long position, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo81871h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
