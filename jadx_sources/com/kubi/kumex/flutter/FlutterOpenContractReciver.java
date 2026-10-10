package com.kubi.kumex.flutter;

import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import f00.C37304a;
import g00.InterfaceC37752d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45949i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.flutter.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterBridgeReciver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/flutter/FlutterOpenContractReciver;", "Lcom/kubi/sdk/flutter/transmit/IKumexoOpenContractTransmit;", "<init>", "()V", "handleMethod", "", "context", "Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterOpenContractReciver implements InterfaceC45949i {
    @Override // p741wy.InterfaceC45949i
    /* JADX INFO: renamed from: c */
    public void mo33749c(@NotNull FlutterEntryActivity context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC37752d.a.m85123b(C37304a.f82764a, "B2MyBonus", Boolean.FALSE, null, null, null, null, 56, null);
    }
}
