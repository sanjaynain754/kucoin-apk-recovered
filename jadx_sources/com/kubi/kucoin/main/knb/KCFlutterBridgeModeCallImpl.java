package com.kubi.kucoin.main.knb;

import android.content.Context;
import b00.InterfaceC4433p;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeModeCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kucoin/main/knb/KCFlutterBridgeModeCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeModeCall;", "<init>", "()V", "switchMode", "", "ctx", "Landroid/content/Context;", "toMode", "", "animate", "", "route", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeModeCallImpl implements InterfaceC4433p {
    @Override // b00.InterfaceC4433p
    /* JADX INFO: renamed from: a */
    public void mo4192a(@NotNull Context ctx, @NotNull String toMode, @Nullable Boolean bool, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(toMode, "toMode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeModeCallImpl$switchMode$1(toMode, bool, callback, null));
    }
}
