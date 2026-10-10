package com.kubi.user.flutter;

import com.kubi.router.model.IRedirect;
import com.kubi.user.api.IUserService;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p741wy.InterfaceC45958r;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.user.flutter.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterUserServiceTransmit.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/user/flutter/FlutterUserServiceTransmit;", "Lcom/kubi/sdk/flutter/transmit/IUserServiceTransmit;", "<init>", "()V", "checkLogin", "", "redirect", "Lcom/kubi/router/model/IRedirect;", "setThisTimeReferralCode", "rcode", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterUserServiceTransmit implements InterfaceC45958r {
    @Override // p741wy.InterfaceC45958r
    /* JADX INFO: renamed from: b */
    public void mo65474b(@Nullable String str) {
        IUserService.a.get().b(str);
    }

    @Override // p741wy.InterfaceC45958r
    /* JADX INFO: renamed from: i */
    public void mo65475i(@Nullable IRedirect iRedirect) {
        IUserService.O(IUserService.a.get(), (Map) null, iRedirect, 1, (Object) null);
    }
}
