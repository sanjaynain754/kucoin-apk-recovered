package com.geetest.captcha;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.q */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6686q implements InterfaceC6685p {

    /* JADX INFO: renamed from: a */
    @Nullable
    public AbstractC6686q f11196a;

    /* JADX INFO: renamed from: b */
    public final void m12551b(@NotNull C6704x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!request.m12591a()) {
            if (mo12519a() >= 0) {
                mo12520a(request);
                return;
            }
            AbstractC6686q abstractC6686q = this.f11196a;
            if (abstractC6686q != null) {
                abstractC6686q.m12551b(request);
            }
        }
    }
}
