package com.geetest.captcha.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.text.SimpleDateFormat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.utils.a */
/* JADX INFO: loaded from: classes45.dex */
public final class HandlerC6691a extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LogUtils.C6690a f11211a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6691a(Looper looper, LogUtils.C6690a c6690a) {
        super(looper);
        this.f11211a = c6690a;
    }

    @Override // android.os.Handler
    public final void handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.handleMessage(msg);
        try {
            if (Thread.interrupted()) {
                return;
            }
            int i11 = msg.what;
            if (i11 != 0) {
                if (i11 != 1) {
                    return;
                }
                SimpleDateFormat simpleDateFormat = LogUtils.C6690a.f11205c;
                LogUtils.C6690a.a.m12570a();
                return;
            }
            Object obj = msg.obj;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item");
            }
            LogUtils.C6690a.b bVar = (LogUtils.C6690a.b) obj;
            LogUtils.C6690a.m12565a(this.f11211a, LogUtils.C6690a.a.m12569a(LogUtils.C6690a.f11205c, bVar.f11208a, bVar.f11209b, bVar.f11210c));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
