package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsCoinInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAsset;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexChain;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexWithdrawResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.c */
/* JADX INFO: compiled from: KCFlutterBridgeAssetsCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JK\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u001a\u0010\u0011J=\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, m90084d2 = {"Lb00/c;", "", "Landroid/content/Context;", "ctx", "", "coinName", "chainName", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAddress;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAsset;", "b", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexChain;", "d", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "address", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexWithdrawResult;", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "f", "code", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsCoinInfo;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4414c {
    /* JADX INFO: renamed from: a */
    void mo4092a(@NotNull Context ctx, @NotNull String code, @NotNull Function2<? super KCFlutterBridgeAssetsCoinInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4093b(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeAssetsWalletCexAsset>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4094c(@NotNull Context ctx, @NotNull String coinName, @NotNull String chainName, @NotNull String address, @NotNull Function2<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4095d(@NotNull Context ctx, @NotNull String coinName, @NotNull Function2<? super List<KCFlutterBridgeAssetsWalletCexChain>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4096e(@NotNull Context ctx, @NotNull String coinName, @NotNull String chainName, @NotNull Function2<? super List<KCFlutterBridgeAssetsWalletCexAddress>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4097f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
