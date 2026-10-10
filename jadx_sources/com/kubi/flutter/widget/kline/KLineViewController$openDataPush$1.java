package com.kubi.flutter.widget.kline;

import com.google.android.gms.wallet.WalletConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {414, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE}, m90125m = "openDataPush", m90126n = {"from", "session", "refresh", "from", "session", "refresh"}, m90127s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
public final class KLineViewController$openDataPush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$openDataPush$1(KLineViewController kLineViewController, Continuation<? super KLineViewController$openDataPush$1> continuation) {
        super(continuation);
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m24226P(null, this);
    }
}
