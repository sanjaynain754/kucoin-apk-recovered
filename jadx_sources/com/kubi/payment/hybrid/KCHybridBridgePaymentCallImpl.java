package com.kubi.payment.hybrid;

import android.content.Context;
import c00.InterfaceC4761h;
import com.kubi.payment.rnbridge.IPaymentBridge;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\fH\u0016J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\fH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/hybrid/KCHybridBridgePaymentCallImpl;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgePaymentCall;", "Lcom/kubi/payment/rnbridge/IPaymentBridge;", "<init>", "()V", "paymentJumpScanQrcode", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "paymentPickContactPhone", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgePaymentCallImpl implements InterfaceC4761h, IPaymentBridge {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f39547b = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgePaymentCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/hybrid/KCHybridBridgePaymentCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4761h
    /* JADX INFO: renamed from: b */
    public void mo4808b(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49507g(ctx, callback);
    }

    @Override // c00.InterfaceC4761h
    /* JADX INFO: renamed from: c */
    public void mo4809c(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49506e(ctx, callback);
    }
}
