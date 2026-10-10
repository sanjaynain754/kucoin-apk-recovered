package e00;

import android.content.Context;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCommonAppCpsInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: e00.c */
/* JADX INFO: compiled from: KCBridgeCommonCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ?\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0010\u0010\nJ?\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0012\u0010\u000fJ?\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0014\u0010\u000fJ5\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0016\u0010\nJ?\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u0018\u0010\u000fJI\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Le00/c;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "refreshAppUserInfo", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "reload", "", "qrCodeUrl", "sharePageView", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "vibrate", "subPath", RNConstantKt.SEND_PAGE_MOUNT, "shortcutId", "showAddHomePageDialog", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCommonAppCpsInfo;", "syncCpsFromApp", "dialogId", "closeDialog", "data", "submitData", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37011c {
    void closeDialog(@NotNull Context ctx, @Nullable String dialogId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void onPageMount(@NotNull Context ctx, @Nullable String subPath, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void refreshAppUserInfo(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void reload(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void sharePageView(@NotNull Context ctx, @Nullable String qrCodeUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void showAddHomePageDialog(@NotNull Context ctx, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void submitData(@NotNull Context ctx, @Nullable String dialogId, @Nullable String data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void syncCpsFromApp(@NotNull Context ctx, @NotNull Function2<? super KCBridgeCommonAppCpsInfo, ? super ProtocolException, Unit> callback);

    void vibrate(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
