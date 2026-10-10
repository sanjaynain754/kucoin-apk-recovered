package com.kubi.spot.knb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import b00.InterfaceC4412b;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAlphaAlphaCurrencyInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.knb.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeAlpha.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J6\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J8\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J\f\u0010\u0015\u001a\u00020\u000e*\u00020\u0016H\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/spot/knb/KCFlutterBridgeAlpha;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAlphaCall;", "<init>", "()V", "getAlphaCurrencyInfo", "", "ctx", "Landroid/content/Context;", "currencySeq", "", "quoteCurrency", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAlphaAlphaCurrencyInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "setTopBarHidden", ViewProps.HIDDEN, "processKyc", "message", "", "toFlutterCurrencyInfo", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeAlpha implements InterfaceC4412b {
    @Override // b00.InterfaceC4412b
    /* JADX INFO: renamed from: a */
    public void mo4087a(@NotNull Context ctx, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // b00.InterfaceC4412b
    /* JADX INFO: renamed from: b */
    public void mo4088b(@NotNull Context ctx, long j11, boolean z11, @NotNull Function2<? super KCFlutterBridgeAlphaAlphaCurrencyInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(null, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
            return;
        }
        AlphaCurrencyInfoEntity alphaCurrencyInfoEntityM85611s = C37890n.f85269a.m85611s(Long.valueOf(j11), Boolean.valueOf(z11));
        if (alphaCurrencyInfoEntityM85611s != null) {
            callback.invoke(m62158d(alphaCurrencyInfoEntityM85611s), null);
        } else {
            callback.invoke(null, new ProtocolException("Missing or Empty Parameter(s)", null, null, false, 14, null));
        }
    }

    @Override // b00.InterfaceC4412b
    /* JADX INFO: renamed from: c */
    public void mo4089c(@NotNull Context ctx, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C12572a.m23695d("event_kyc_auth", str, 0L, 4, null);
        } else {
            callback.invoke(null, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public final KCFlutterBridgeAlphaAlphaCurrencyInfo m62158d(AlphaCurrencyInfoEntity alphaCurrencyInfoEntity) {
        long jLongValue;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long jIntValue;
        String str6;
        boolean zBooleanValue;
        long jLongValue2;
        String str7;
        Long currencySeq = alphaCurrencyInfoEntity.getCurrencySeq();
        long jLongValue3 = -1;
        if (currencySeq != null) {
            jLongValue = currencySeq.longValue();
        } else {
            jLongValue = -1;
        }
        Long chainSeq = alphaCurrencyInfoEntity.getChainSeq();
        if (chainSeq != null) {
            jLongValue3 = chainSeq.longValue();
        }
        long j11 = jLongValue3;
        String chainLogo = alphaCurrencyInfoEntity.getChainLogo();
        if (chainLogo == null) {
            str = "";
        } else {
            str = chainLogo;
        }
        String chainId = alphaCurrencyInfoEntity.getChainId();
        if (chainId == null) {
            str2 = "";
        } else {
            str2 = chainId;
        }
        String tokenIcon = alphaCurrencyInfoEntity.getTokenIcon();
        if (tokenIcon == null) {
            str3 = "";
        } else {
            str3 = tokenIcon;
        }
        String tokenName = alphaCurrencyInfoEntity.getTokenName();
        if (tokenName == null) {
            str4 = "";
        } else {
            str4 = tokenName;
        }
        String tokenFullName = alphaCurrencyInfoEntity.getTokenFullName();
        if (tokenFullName == null) {
            str5 = "";
        } else {
            str5 = tokenFullName;
        }
        Integer tokenDecimal = alphaCurrencyInfoEntity.getTokenDecimal();
        if (tokenDecimal != null) {
            jIntValue = tokenDecimal.intValue();
        } else {
            jIntValue = 8;
        }
        long j12 = jIntValue;
        String tokenAddress = alphaCurrencyInfoEntity.getTokenAddress();
        if (tokenAddress == null) {
            str6 = "";
        } else {
            str6 = tokenAddress;
        }
        Boolean boolIsQuoteCurrency = alphaCurrencyInfoEntity.isQuoteCurrency();
        if (boolIsQuoteCurrency != null) {
            zBooleanValue = boolIsQuoteCurrency.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z11 = zBooleanValue;
        Long openingTime = alphaCurrencyInfoEntity.getOpeningTime();
        long jIntValue2 = 0;
        if (openingTime != null) {
            jLongValue2 = openingTime.longValue();
        } else {
            jLongValue2 = 0;
        }
        Integer upgradeStatus = alphaCurrencyInfoEntity.getUpgradeStatus();
        if (upgradeStatus != null) {
            jIntValue2 = upgradeStatus.intValue();
        }
        long j13 = jIntValue2;
        String currencyType = alphaCurrencyInfoEntity.getCurrencyType();
        if (currencyType == null) {
            str7 = "";
        } else {
            str7 = currencyType;
        }
        return new KCFlutterBridgeAlphaAlphaCurrencyInfo(jLongValue, j11, str, str3, str4, str5, j12, str6, z11, str2, jLongValue2, j13, str7);
    }
}
