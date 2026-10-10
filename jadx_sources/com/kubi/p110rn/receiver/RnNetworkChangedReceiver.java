package com.kubi.p110rn.receiver;

import p764xk.InterfaceC46256d;
import p852kotlin.Metadata;
import p852kotlin.Unit;

/* JADX INFO: compiled from: RnNetworkChangedReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/receiver/RnNetworkChangedReceiver;", "Lcom/kubi/kucoin/callback/INetworkChangedReceiver;", "<init>", "()V", "invoke", "", "p1", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnNetworkChangedReceiver implements InterfaceC46256d {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public void invoke(boolean p11) {
        NetworkChangeReceiverDebounce.INSTANCE.getNetworkChangeObs().onNext(Boolean.TRUE);
    }
}
