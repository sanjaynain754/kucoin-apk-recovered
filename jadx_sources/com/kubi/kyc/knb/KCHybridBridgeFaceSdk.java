package com.kubi.kyc.knb;

import android.content.Context;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4756c;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeFaceSdkFaceInfo;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import kn.C41076a;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeFaceSdk.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JT\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2(\u0010\r\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kyc/knb/KCHybridBridgeFaceSdk;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeFaceSdkCall;", "<init>", "()V", "faceRecognition", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", AppsFlyerProperties.CHANNEL, "", "advanceToken", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeFaceSdkFaceInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "openAdvancedCertification", "data", "", "", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgeFaceSdk implements InterfaceC4756c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f31216a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeFaceSdk.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/knb/KCHybridBridgeFaceSdk$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_ADVANCE", "CHANNEL_JUMIO", "CHANNEL_SUMSUB", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4756c
    /* JADX INFO: renamed from: a */
    public void mo4801a(@NotNull Context ctx, @Nullable Object obj, @NotNull String channel, @NotNull String data, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(channel, "jumio")) {
            BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
            if (baseActivity != null) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeFaceSdk$openAdvancedCertification$1(data, channel, callback, baseActivity, null), 3, null);
                return;
            } else {
                C41076a.f91293a.m90059a("-200000");
                callback.invoke(MapsKt.mapOf(new Pair(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)), null);
                return;
            }
        }
        if (Intrinsics.areEqual(channel, "sumsub")) {
            BaseActivity baseActivity2 = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
            if (baseActivity2 != null) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity2), null, null, new KCHybridBridgeFaceSdk$openAdvancedCertification$2(data, channel, callback, baseActivity2, null), 3, null);
                return;
            } else {
                C41076a.f91293a.m90059a("-100000");
                callback.invoke(MapsKt.mapOf(new Pair(DbParams.KEY_CHANNEL_RESULT, CredentialEntry.FALSE_STRING)), null);
                return;
            }
        }
        C41076a.f91293a.m90059a("-999999");
        BaseActivity baseActivity3 = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity3 == null) {
            callback.invoke(null, null);
        } else {
            IKuFacadeService.f27711a.get().mo31924c(baseActivity3);
            callback.invoke(null, new ProtocolException("-4", null, "channel is not supported", false, 10, null));
        }
    }

    @Override // c00.InterfaceC4756c
    /* JADX INFO: renamed from: b */
    public void mo4802b(@NotNull Context ctx, @Nullable Object obj, @NotNull String channel, @NotNull String advanceToken, @NotNull Function2<? super KCHybridBridgeFaceSdkFaceInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(advanceToken, "advanceToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(channel, "advance")) {
            BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
            if (baseActivity == null) {
                callback.invoke(null, new ProtocolException("activity is null", null, null, false, 14, null));
                return;
            } else {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeFaceSdk$faceRecognition$1(baseActivity, advanceToken, callback, null), 3, null);
                return;
            }
        }
        BaseActivity baseActivity2 = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity2 == null) {
            callback.invoke(null, null);
        } else {
            IKuFacadeService.f27711a.get().mo31924c(baseActivity2);
            callback.invoke(null, new ProtocolException("channel is not supported", null, null, false, 14, null));
        }
    }
}
