package com.kubi.assets.knb;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import b00.InterfaceC4414c;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetsLog;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsCoinInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAsset;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexChain;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexWithdrawResult;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.knb.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeAssets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JD\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J4\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J<\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JF\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/knb/KCFlutterBridgeAssets;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsCall;", "<init>", "()V", "checkLogin", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getAddress", "coinName", "", "chainName", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAddress;", "getAssets", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAsset;", "getChains", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexChain;", "requestWithdraw", "address", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexWithdrawResult;", "getCoinInfo", "code", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsCoinInfo;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeAssets implements InterfaceC4414c {
    /* JADX INFO: renamed from: m */
    public static final Unit m17529m(Function2 function2, List list) {
        function2.invoke(list, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m17530n(Function2 function2, List list) {
        function2.invoke(list, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m17531o(Function2 function2, List list) {
        function2.invoke(list, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17528l(Function2 function2) {
        function2.invoke(Boolean.TRUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m17532p(Function2 function2, KCFlutterBridgeAssetsWalletCexWithdrawResult kCFlutterBridgeAssetsWalletCexWithdrawResult) {
        AssetsLog assetsLog = AssetsLog.Withdraw;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("数据回调给web3-----amount:");
        sb2.append(kCFlutterBridgeAssetsWalletCexWithdrawResult != null ? kCFlutterBridgeAssetsWalletCexWithdrawResult.getAmount() : null);
        sb2.append(", applicationTime:");
        sb2.append(kCFlutterBridgeAssetsWalletCexWithdrawResult != null ? kCFlutterBridgeAssetsWalletCexWithdrawResult.getApplicationTime() : null);
        assetsLog.m15236i(sb2.toString());
        function2.invoke(kCFlutterBridgeAssetsWalletCexWithdrawResult, null);
        return Unit.INSTANCE;
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: a */
    public void mo4092a(@NotNull Context ctx, @NotNull String code, @NotNull Function2<? super KCFlutterBridgeAssetsCoinInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(null, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
            return;
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(code);
        if (coinInfoEntityM85613u == null) {
            callback.invoke(null, new ProtocolException("Invalid or Missing Coin Info", null, null, false, 14, null));
            return;
        }
        String code2 = coinInfoEntityM85613u.getCode();
        if (code2 == null) {
            code2 = "";
        }
        String currency = coinInfoEntityM85613u.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String name = coinInfoEntityM85613u.getName();
        if (name == null) {
            name = "";
        }
        String iconUrl = coinInfoEntityM85613u.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        callback.invoke(new KCFlutterBridgeAssetsCoinInfo(code2, currency, name, iconUrl, true ^ C27025c.m66567e(Boolean.valueOf(coinInfoEntityM85613u.isDigital()), true), C27039d.m66651k(Integer.valueOf(coinInfoEntityM85613u.getPrecision()), 8)), null);
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: b */
    public void mo4093b(@NotNull Context ctx, @NotNull final Function2<? super List<KCFlutterBridgeAssetsWalletCexAsset>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity == null) {
            callback.invoke(null, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
        } else {
            AssetWeb3BridgeManager.f17841a.m17509y(fragmentActivity, new Function1() { // from class: com.kubi.assets.knb.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCFlutterBridgeAssets.m17530n(callback, (List) obj);
                }
            });
        }
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: c */
    public void mo4094c(@NotNull Context ctx, @NotNull String coinName, @NotNull String chainName, @NotNull String address, @NotNull final Function2<? super KCFlutterBridgeAssetsWalletCexWithdrawResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity == null) {
            callback.invoke(null, new ProtocolException("Invalid or Missing FragmentActivity", null, null, false, 14, null));
            return;
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(coinName);
        if (AssetExKt.m15116d(coinName, chainName, address) || coinInfoEntityM85613u == null) {
            callback.invoke(null, new ProtocolException("Missing or Empty Parameter(s)", null, null, false, 14, null));
            return;
        }
        AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
        String code = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null;
        if (code == null) {
            code = "";
        }
        assetWeb3BridgeManager.m17497H(fragmentActivity, code, chainName, address, new Function1() { // from class: com.kubi.assets.knb.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgeAssets.m17532p(callback, (KCFlutterBridgeAssetsWalletCexWithdrawResult) obj);
            }
        });
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: d */
    public void mo4095d(@NotNull Context ctx, @NotNull String coinName, @NotNull final Function2<? super List<KCFlutterBridgeAssetsWalletCexChain>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity == null) {
            callback.invoke(null, new ProtocolException("Invalid or Missing FragmentActivity", null, null, false, 14, null));
            return;
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(coinName);
        if (TextUtils.isEmpty(coinName) || coinInfoEntityM85613u == null) {
            callback.invoke(null, new ProtocolException("Missing or Empty Parameter(s)", null, null, false, 14, null));
            return;
        }
        AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
        String code = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null;
        if (code == null) {
            code = "";
        }
        assetWeb3BridgeManager.m17494D(fragmentActivity, code, new Function1() { // from class: com.kubi.assets.knb.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgeAssets.m17531o(callback, (List) obj);
            }
        });
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: e */
    public void mo4096e(@NotNull Context ctx, @NotNull String coinName, @NotNull String chainName, @NotNull final Function2<? super List<KCFlutterBridgeAssetsWalletCexAddress>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(coinName, "coinName");
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity == null) {
            callback.invoke(null, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
            return;
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(coinName);
        if (AssetExKt.m15116d(coinName, chainName) || coinInfoEntityM85613u == null) {
            callback.invoke(null, new ProtocolException("Missing or Empty Parameter(s)", null, null, false, 14, null));
            return;
        }
        AssetWeb3BridgeManager assetWeb3BridgeManager = AssetWeb3BridgeManager.f17841a;
        String code = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null;
        if (code == null) {
            code = "";
        }
        assetWeb3BridgeManager.m17508x(fragmentActivity, code, chainName, new Function1() { // from class: com.kubi.assets.knb.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgeAssets.m17529m(callback, (List) obj);
            }
        });
    }

    @Override // b00.InterfaceC4414c
    /* JADX INFO: renamed from: f */
    public void mo4097f(@NotNull Context ctx, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.assets.knb.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCFlutterBridgeAssets.m17528l(callback);
            }
        }, 1, (Object) null);
    }
}
