package com.kubi.advert.service;

import android.content.Intent;
import android.net.Uri;
import com.kubi.advert.OnelinkUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p668un.InterfaceC45266c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OneLinkHockSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n0\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/advert/service/OneLinkHockSPI;", "Lcom/kubi/launch/spi/IOneLinkHockSPI;", "<init>", "()V", "getOneLinkPath", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOneLink", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "router", "matchOneLink", "", "intent", "Landroid/content/Intent;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OneLinkHockSPI implements InterfaceC45266c {
    @Override // p668un.InterfaceC45266c
    /* JADX INFO: renamed from: a */
    public boolean mo14808a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        OnelinkUtil onelinkUtil = OnelinkUtil.f15184a;
        Uri data = intent.getData();
        return onelinkUtil.m14838c(data != null ? data.toString() : null);
    }
}
