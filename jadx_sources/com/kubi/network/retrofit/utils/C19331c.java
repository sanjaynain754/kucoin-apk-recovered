package com.kubi.network.retrofit.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.retrofit.utils.c */
/* JADX INFO: compiled from: NetworkToast.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/network/retrofit/utils/c;", "", "<init>", "()V", "Lcom/kubi/network/retrofit/utils/b;", "handler", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/retrofit/utils/b;)V", "", "exception", "Lkotlin/Function1;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "Lcom/kubi/network/retrofit/utils/a;", "Lcom/kubi/network/retrofit/utils/a;", "DEFAULT_TOAST_HANDLER", "c", "Lcom/kubi/network/retrofit/utils/b;", "defaultToastHandler", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19331c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19331c f35969a = new C19331c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C19329a DEFAULT_TOAST_HANDLER = new C19329a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC19330b defaultToastHandler;

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m42834a(@NotNull InterfaceC19330b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        defaultToastHandler = handler;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m42835b(@NotNull Throwable exception, @Nullable Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        InterfaceC19330b interfaceC19330b = defaultToastHandler;
        if (interfaceC19330b == null) {
            DEFAULT_TOAST_HANDLER.mo33207a(exception, callback);
        } else if (interfaceC19330b != null) {
            interfaceC19330b.mo33207a(exception, callback);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m42836c(Throwable th2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        m42835b(th2, function1);
    }
}
