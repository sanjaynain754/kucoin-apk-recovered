package com.sumsub.sns.internal.features.presentation.videoident.service;

import android.os.Binder;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSServiceBinder;", "Landroid/os/Binder;", "instance", "Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;", "<init>", "(Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;)V", NotificationCompat.CATEGORY_SERVICE, "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getService", "()Ljava/lang/ref/WeakReference;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSServiceBinder extends Binder {

    @NotNull
    private final WeakReference<SNSVideoChatService> service;

    @NotNull
    public final WeakReference<SNSVideoChatService> getService() {
        return this.service;
    }

    public SNSServiceBinder(@NotNull SNSVideoChatService sNSVideoChatService) {
        this.service = new WeakReference<>(sNSVideoChatService);
    }
}
