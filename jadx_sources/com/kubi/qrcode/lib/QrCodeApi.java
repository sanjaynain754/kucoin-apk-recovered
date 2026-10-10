package com.kubi.qrcode.lib;

import com.kubi.sdk.protocol.router.protocol.KCRouterBridgeSafeCenterScanTokenEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QrCodeApi.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/qrcode/lib/QrCodeApi;", "", "checkScanToken", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/sdk/protocol/router/protocol/KCRouterBridgeSafeCenterScanTokenEntity;", "qrToken", "", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface QrCodeApi {
    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:qrcode-web-scan"})
    @POST("v2/mobile/qr-token/verify")
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<KCRouterBridgeSafeCenterScanTokenEntity> m50100a(@Field("qrToken") @Nullable String str);
}
