package com.kubi.user.flutter;

import com.kubi.user.model.LoginUserEntity;
import io.flutter.plugin.common.MethodChannel;
import io.reactivex.functions.Consumer;

/* JADX INFO: renamed from: com.kubi.user.flutter.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes53.dex */
public final /* synthetic */ class C26706a implements Consumer {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MethodChannel.Result f53658b;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        FlutterRefreshTokenTransmit.q(this.f53658b, (LoginUserEntity) obj);
    }
}
