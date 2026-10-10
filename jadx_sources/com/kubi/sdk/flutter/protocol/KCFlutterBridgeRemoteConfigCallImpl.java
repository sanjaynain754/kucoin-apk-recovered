package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import b00.InterfaceC4440w;
import com.google.firebase.messaging.Constants;
import com.kubi.config.RemoteConfig;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.protocol.ProtocolException;
import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.SensorsABTest;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.protocol.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeRemoteConfigCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\fH\u0016J6\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\fH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeRemoteConfigCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeRemoteConfigCall;", "<init>", "()V", "fastFetchAbTest", "", "ctx", "Landroid/content/Context;", "paramName", "", "defaultValue", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getRemoteConfig", "key", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeRemoteConfigCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeRemoteConfigCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeRemoteConfigCallImpl\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,52:1\n44#2,15:53\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeRemoteConfigCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeRemoteConfigCallImpl\n*L\n35#1:53,15\n*E\n"})
public final class KCFlutterBridgeRemoteConfigCallImpl implements InterfaceC4440w {
    /* JADX INFO: renamed from: d */
    public static final void m56915d(Function2 function2, String str) {
        function2.invoke(str, null);
    }

    @Override // b00.InterfaceC4440w
    /* JADX INFO: renamed from: a */
    public void mo4223a(@NotNull Context ctx, @NotNull String paramName, @NotNull String defaultValue, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (paramName.length() == 0) {
            callback.invoke(null, null);
            return;
        }
        try {
            SensorsABTest.shareInstance().fastFetchABTest(paramName, defaultValue, new OnABTestReceivedData() { // from class: com.kubi.sdk.flutter.protocol.l
                @Override // com.sensorsdata.abtest.OnABTestReceivedData
                public final void onResult(Object obj) {
                    KCFlutterBridgeRemoteConfigCallImpl.m56915d(callback, (String) obj);
                }
            });
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(e11, "FastFetchAbTestHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(e11, "FastFetchAbTestHandler", true, null, 8, null), null, 2, null);
            }
            callback.invoke(null, new ProtocolException(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4440w
    /* JADX INFO: renamed from: b */
    public void mo4224b(@NotNull Context ctx, @NotNull String key, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (key.length() == 0) {
            callback.invoke(null, null);
        } else {
            callback.invoke(RemoteConfig.m20458b(key), null);
        }
    }
}
