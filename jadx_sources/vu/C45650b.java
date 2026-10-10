package vu;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeQrScanScanQrCodeResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiQrScanScanQrCodeResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36584s;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p737wu.C45930c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vu.b */
/* JADX INFO: compiled from: KCJSApiQrScanModuleImpl.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JV\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/qrcode/lib/jsapi/KCJSApiQrScanModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiQrScanModule;", "<init>", "()V", "openQrScan", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "bizType", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "scanQrCode", "supportedTypes", "", "", "callerHandlesUnknownCode", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiQrScanScanQrCodeResult;", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45650b implements InterfaceC36584s {
    @Override // d00.InterfaceC36584s
    /* JADX INFO: renamed from: a */
    public void mo81876a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<Long> supportedTypes, boolean z11, @NotNull final Function2<? super KCJSApiQrScanScanQrCodeResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new C45930c().mo4219a(ctx, supportedTypes, z11, new Function2() { // from class: vu.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return C45650b.m100780d(callback, (KCFlutterBridgeQrScanScanQrCodeResult) obj2, (ProtocolException) obj3);
            }
        });
    }

    @Override // d00.InterfaceC36584s
    /* JADX INFO: renamed from: b */
    public void mo81877b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new C45930c().mo4220b(ctx, str, callback);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m100780d(Function2 function2, KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult, ProtocolException protocolException) {
        function2.invoke(kCFlutterBridgeQrScanScanQrCodeResult != null ? new KCJSApiQrScanScanQrCodeResult(kCFlutterBridgeQrScanScanQrCodeResult.getHandled(), kCFlutterBridgeQrScanScanQrCodeResult.getQrCodeOriginString()) : null, protocolException);
        return Unit.INSTANCE;
    }
}
