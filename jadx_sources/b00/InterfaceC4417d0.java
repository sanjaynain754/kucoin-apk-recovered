package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.d0 */
/* JADX INFO: compiled from: KCFlutterBridgeShareCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ_\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lb00/d0;", "", "Landroid/content/Context;", "ctx", "", "utmSource", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "c", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "imageData", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", "shareLink", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4417d0 {
    /* JADX INFO: renamed from: a */
    void mo4109a(@NotNull Context ctx, @NotNull String imageData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4110b(@NotNull Context ctx, @NotNull String imageData, @NotNull String utmSource, boolean needQrCode, boolean onlyDarkMode, @Nullable String shareLink, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4111c(@NotNull Context ctx, @NotNull String utmSource, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);
}
