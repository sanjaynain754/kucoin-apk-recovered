package b00;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeUserCenterUserPoliciesInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.h0 */
/* JADX INFO: compiled from: KCFlutterBridgeUserCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\r\u0010\u000bJ?\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lb00/h0;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeUserCenterUserPoliciesInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "d", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "", "c", "", "spmId", "b", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4425h0 {
    /* JADX INFO: renamed from: b */
    void mo4132b(@NotNull Context ctx, @Nullable String spmId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4133c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4134d(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeUserCenterUserPoliciesInfo>, ? super ProtocolException, Unit> callback);
}
