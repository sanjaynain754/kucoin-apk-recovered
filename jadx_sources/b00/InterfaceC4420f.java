package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreApiInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreAppInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreHttpHeader;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreInitConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreUserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.f */
/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0012\u0010\u0010J5\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0014\u0010\u0010J5\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0016\u0010\u0010J;\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u000b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m90084d2 = {"Lb00/f;", "", "Landroid/content/Context;", "ctx", "", "", "types", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreInitConfig;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "d", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;", "c", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "e", "", "f", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreHttpHeader;", "b", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4420f {
    /* JADX INFO: renamed from: a */
    void mo4119a(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreUserInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4120b(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeCoreHttpHeader>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4121c(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreApiInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4122d(@NotNull Context ctx, @NotNull List<String> types, @NotNull Function2<? super KCFlutterBridgeCoreInitConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4123e(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreAppInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4124f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
