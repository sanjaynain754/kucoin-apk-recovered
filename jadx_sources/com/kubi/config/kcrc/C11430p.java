package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.Config;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.config.kcrc.p */
/* JADX INFO: compiled from: RemoteConfigKunlunTrack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/config/kcrc/p;", "", "<init>", "()V", "Lcom/kubi/config/kcrc/KCRCAllEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "", "b", "(Lcom/kubi/config/kcrc/KCRCAllEntity;)V", "Lcom/kubi/config/Config;", "config", "", "throwable", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/config/Config;Ljava/lang/Throwable;)V", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11430p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11430p f19709a = new C11430p();

    /* JADX INFO: renamed from: a */
    public final void m20572a(@NotNull Config config, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            ApiException apiException = throwable instanceof ApiException ? (ApiException) throwable : null;
            if (apiException == null) {
                return;
            }
            String str = apiException.code;
            Intrinsics.checkNotNullExpressionValue(str, "apiException.code");
            Integer intOrNull = StringsKt.toIntOrNull(str);
            C43847h.m96575d(KunlunTechEventEnum.CATE_REMOTE_CONFIG_FETCH_ALL, intOrNull != null ? intOrNull.intValue() : -3);
        } catch (Throwable th2) {
            config.m20447c().invoke(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20573b(@NotNull KCRCAllEntity entity) {
        int i11;
        Intrinsics.checkNotNullParameter(entity, "entity");
        KCRCDataAll data = entity.getData();
        if ((data != null ? data.getHasMore() : null) == null || data.getBeginId() == null || data.getVersion() == null || data.getValues() == null) {
            i11 = -2;
        } else {
            i11 = data.getValues().isEmpty() ? -1 : 200;
        }
        C43847h.m96575d(KunlunTechEventEnum.CATE_REMOTE_CONFIG_FETCH_ALL, i11);
    }
}
