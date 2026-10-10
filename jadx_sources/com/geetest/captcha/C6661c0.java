package com.geetest.captcha;

import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.c0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6661c0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ArrayList<InterfaceC6663d0> f11146a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m12528a(@Nullable InterfaceC6663d0 interfaceC6663d0) {
        synchronized (this.f11146a) {
            if (this.f11146a.contains(interfaceC6663d0)) {
                throw new IllegalStateException(("Observer " + interfaceC6663d0 + " is already registered.").toString());
            }
            this.f11146a.add(interfaceC6663d0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12529a(@NotNull String errorCode, @NotNull String errorMsg, @NotNull JSONObject errorDesc) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        Iterator<InterfaceC6663d0> it = this.f11146a.iterator();
        while (it.hasNext()) {
            it.next().mo12524a(errorCode, errorMsg, errorDesc);
        }
    }
}
