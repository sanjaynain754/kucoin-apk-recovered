package com.kubi.p110rn.receiver;

import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.modules.RNPublishSubject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import u80.InterfaceC45136a;

/* JADX INFO: compiled from: RnSessionUpdateReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/rn/receiver/RnSessionUpdateReceiver;", "Lcom/kubi/widget/web/service/ISessionUpdateReceiver;", "<init>", "()V", "onUpdateSession", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnSessionUpdateReceiver implements InterfaceC45136a {
    @Override // u80.InterfaceC45136a
    public void onUpdateSession() {
        RNPublishSubject.INSTANCE.getNativeNotifyRn().onNext(new Pair<>(RNH5InterActionHelperKt.EVENT_LOGIN_SUCCESS, null));
    }
}
