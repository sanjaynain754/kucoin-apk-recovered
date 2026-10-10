package com.kubi.qrcode.lib.jsapi;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleAbs;
import com.kubi.p110rn.core.turbo.ScanQrCodeResult;
import com.kubi.qrcode.lib.jsapi.KCTurboQrScanModuleImpl;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeQrScanScanQrCodeResult;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p737wu.C45930c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboQrScanModuleImpl.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J4\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/qrcode/lib/jsapi/KCTurboQrScanModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeQrScanTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "openQrScan", "", "bizType", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "scanQrCode", "supportedTypes", "", "", "callerHandlesUnknownCode", "", "Lcom/kubi/rn/core/turbo/ScanQrCodeResult;", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeQrScanTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboQrScanModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboQrScanModuleImpl.kt\ncom/kubi/qrcode/lib/jsapi/KCTurboQrScanModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1563#2:53\n1634#2,3:54\n*S KotlinDebug\n*F\n+ 1 KCTurboQrScanModuleImpl.kt\ncom/kubi/qrcode/lib/jsapi/KCTurboQrScanModuleImpl\n*L\n37#1:53\n37#1:54,3\n*E\n"})
public final class KCTurboQrScanModuleImpl extends NativeQrScanTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboQrScanModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openQrScan$lambda$1(String str, final Function1 function1, FragmentActivity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        new C45930c().mo4220b(ctx, str, new Function2() { // from class: vu.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboQrScanModuleImpl.openQrScan$lambda$1$lambda$0(function1, (String) obj, (ProtocolException) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scanQrCode$lambda$6(final List list, final boolean z11, final Function1 function1) {
        C42899b.m94073c(new Function1() { // from class: vu.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboQrScanModuleImpl.scanQrCode$lambda$6$lambda$5(list, z11, function1, (FragmentActivity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scanQrCode$lambda$6$lambda$5(List list, boolean z11, final Function1 function1, FragmentActivity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf((long) ((Number) it.next()).doubleValue()));
        }
        new C45930c().mo4219a(ctx, arrayList, z11, new Function2() { // from class: vu.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboQrScanModuleImpl.scanQrCode$lambda$6$lambda$5$lambda$4(function1, (KCFlutterBridgeQrScanScanQrCodeResult) obj, (ProtocolException) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scanQrCode$lambda$6$lambda$5$lambda$4(Function1 function1, KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult, ProtocolException protocolException) {
        function1.invoke(kCFlutterBridgeQrScanScanQrCodeResult != null ? new ScanQrCodeResult(Boolean.valueOf(kCFlutterBridgeQrScanScanQrCodeResult.getHandled()), kCFlutterBridgeQrScanScanQrCodeResult.getQrCodeOriginString()) : null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleAbs
    public void openQrScan(@Nullable final String bizType, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: vu.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboQrScanModuleImpl.openQrScan$lambda$1(bizType, callback, (FragmentActivity) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeQrScanTurboModuleAbs
    public void scanQrCode(@NotNull final List<Double> supportedTypes, final boolean callerHandlesUnknownCode, @NotNull final Function1<? super ScanQrCodeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C27100x0.m66923d(new Function0() { // from class: vu.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboQrScanModuleImpl.scanQrCode$lambda$6(supportedTypes, callerHandlesUnknownCode, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openQrScan$lambda$1$lambda$0(Function1 function1, String str, ProtocolException protocolException) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}
