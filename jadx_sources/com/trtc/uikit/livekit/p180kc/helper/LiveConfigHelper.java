package com.trtc.uikit.livekit.p180kc.helper;

import com.kubi.unify.api.IUnifyAccountService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.helper.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiveConfigHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/helper/LiveConfigHelper;", "", "<init>", "()V", "shouldShowFutureCard", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiveConfigHelper f79160a = new LiveConfigHelper();

    /* JADX INFO: renamed from: a */
    public final boolean m81515a() {
        return !IUnifyAccountService.f53155a.get().mo64979C();
    }
}
