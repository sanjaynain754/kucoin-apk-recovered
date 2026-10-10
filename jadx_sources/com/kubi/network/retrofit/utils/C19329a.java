package com.kubi.network.retrofit.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.retrofit.utils.a */
/* JADX INFO: compiled from: NetworkToast.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/network/retrofit/utils/a;", "Lcom/kubi/network/retrofit/utils/b;", "<init>", "()V", "", "throwable", "Lkotlin/Function1;", "", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19329a implements InterfaceC19330b {
    @Override // com.kubi.network.retrofit.utils.InterfaceC19330b
    /* JADX INFO: renamed from: a */
    public void mo33207a(@NotNull Throwable throwable, @Nullable Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof ApiException) {
            ToastCompat.m66441G(throwable.getMessage(), new Object[0]);
            return;
        }
        ToastCompat.m66441G("Network error, please check the connection.", new Object[0]);
        if (callback != null) {
            callback.invoke("Network error, please check the connection.");
        }
    }
}
