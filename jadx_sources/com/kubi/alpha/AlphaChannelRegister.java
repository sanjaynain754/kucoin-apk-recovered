package com.kubi.alpha;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaChannelRegister.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\u001f\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0016\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/alpha/AlphaChannelRegister;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "onShowAgain", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "resetCurrency", "currencySeq", "", "isBuy", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "updateCoin", "notifyLogout", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaChannelRegister.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaChannelRegister.kt\ncom/kubi/alpha/AlphaChannelRegister\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class AlphaChannelRegister implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f15337b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f15338a;

    /* JADX INFO: compiled from: AlphaChannelRegister.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/alpha/AlphaChannelRegister$Companion;", "", "<init>", "()V", "TAG", "", "KC_ALPHA_CHANNEL_NAME", "KC_ALPHA_CHANNEL_RESET_METHOD", "KC_ALPHA_CHANNEL_ALPHA_APPEAR", "KC_ALPHA_CHANNEL_ALPHA_DISAPPEAR", "KC_ALPHA_CHANNEL_ALPHA_COIN_UPDATE", "KC_ALPHA_CHANNEL_USER_LOGOUT", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14959a() {
        C44128b.m97266j("AlphaLifecycleChannel", "AlphaLifecycleChannel.notifyLogout");
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel == null) {
            C44128b.m97261e("AlphaLifecycleChannel", "AlphaLifecycleChannel be called before register!");
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("KCAlphaChannelUserLogout", null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14960b() {
        C44128b.m97266j("AlphaLifecycleChannel", "AlphaLifecycleChannel.onHide");
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel == null) {
            C44128b.m97261e("AlphaLifecycleChannel", "AlphaLifecycleChannel be called before register!");
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("KCAlphaChannelAlphaDisappear", null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14961c() {
        C44128b.m97266j("AlphaLifecycleChannel", "AlphaLifecycleChannel.onShowAgain");
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel == null) {
            C44128b.m97261e("AlphaLifecycleChannel", "AlphaLifecycleChannel be called before register!");
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("KCAlphaChannelAlphaAppear", null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14962d(@Nullable String str, @Nullable Boolean bool) {
        C44128b.m97266j("AlphaLifecycleChannel", "AlphaLifecycleChannel.resetCurrency currencySeq=" + str + ", isBuy=" + bool);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("currencySeq", str);
        }
        if (bool != null) {
            linkedHashMap.put("isBuy", bool);
        }
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel == null) {
            C44128b.m97261e("AlphaLifecycleChannel", "AlphaLifecycleChannel be called before register!");
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("KCAlphaChannelResetMethod", linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14963e(@Nullable String str) {
        C44128b.m97266j("AlphaLifecycleChannel", "AlphaLifecycleChannel.coin.update");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("seq", str);
        }
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel == null) {
            C44128b.m97261e("AlphaLifecycleChannel", "AlphaLifecycleChannel be called before register!");
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("KCAlphaChannelCoinUpdate", linkedHashMap);
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f15338a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kc.alpha", StandardMethodCodec.INSTANCE);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f15338a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f15338a = null;
    }
}
