package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import b00.InterfaceC4422g;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.protocol.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeDebugCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\fH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeDebugCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeDebugCall;", "<init>", "()V", "getMockUrl", "", "ctx", "Landroid/content/Context;", "path", "", "queries", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeDebugCallImpl implements InterfaceC4422g {
    @Override // b00.InterfaceC4422g
    /* JADX INFO: renamed from: a */
    public void mo4126a(@NotNull Context ctx, @NotNull String path, @NotNull String queries, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(queries, "queries");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null, null);
    }
}
