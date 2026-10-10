package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePostPostCoin;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.t */
/* JADX INFO: compiled from: KCFlutterBridgePostCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lb00/t;", "", "Landroid/content/Context;", "ctx", "", "keyword", "", BridgeParamKeyKt.MAX_COUNT, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePostPostCoin;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/lang/String;JLkotlin/jvm/functions/Function2;)V", "sence", "c", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "d", "(Landroid/content/Context;JLkotlin/jvm/functions/Function2;)V", "coins", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4437t {
    /* JADX INFO: renamed from: a */
    void mo4215a(@NotNull Context ctx, @NotNull List<String> coins, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4216b(@NotNull Context ctx, @NotNull String keyword, long maxCount, @NotNull Function2<? super List<KCFlutterBridgePostPostCoin>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4217c(@NotNull Context ctx, @NotNull String sence, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4218d(@NotNull Context ctx, long maxCount, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback);
}
