package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycAdvanceResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.m */
/* JADX INFO: compiled from: KCFlutterBridgeKycCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\t\u0010\nJE\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lb00/m;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "", AppsFlyerProperties.CHANNEL, "data", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycAdvanceResult;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4430m {
    /* JADX INFO: renamed from: a */
    void mo4177a(@NotNull Context ctx, @NotNull String channel, @NotNull String data, @NotNull Function2<? super KCFlutterBridgeKycKycAdvanceResult, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4178b(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
