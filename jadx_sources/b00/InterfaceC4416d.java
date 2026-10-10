package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
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

/* JADX INFO: renamed from: b00.d */
/* JADX INFO: compiled from: KCFlutterBridgeBasicCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0010\u0010\u000eJ=\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0012\u0010\u000eJ=\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0014\u0010\u000eJ=\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0016\u0010\u000eJK\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJI\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u001d2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u001f\u0010 J?\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\"\u0010\u000eJE\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b$\u0010%J5\u0010&\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b&\u0010\n¨\u0006'"}, m90084d2 = {"Lb00/d;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "j", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "", "bizType", "d", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "uiSpmId", "e", "type", "c", "url", "i", "msg", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "datas", "", "selectedIndex", "f", "(Landroid/content/Context;Ljava/util/List;JLkotlin/jvm/functions/Function2;)V", "", ReportDataTable.COLUMN_PARAMS, "g", "(Landroid/content/Context;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "shortcutId", "showAddHomePageDialog", "eventId", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "b", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4416d {
    /* JADX INFO: renamed from: a */
    void mo4099a(@NotNull Context ctx, @NotNull String eventId, @NotNull String params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4100b(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4101c(@NotNull Context ctx, @NotNull String type, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4102d(@NotNull Context ctx, @Nullable String bizType, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4103e(@NotNull Context ctx, @NotNull String uiSpmId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4104f(@NotNull Context ctx, @NotNull List<String> datas, long selectedIndex, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo4105g(@NotNull Context ctx, @NotNull Map<String, ? extends Object> params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo4106h(@NotNull Context ctx, @NotNull String msg, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo4107i(@NotNull Context ctx, @NotNull String url, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo4108j(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void showAddHomePageDialog(@NotNull Context ctx, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
