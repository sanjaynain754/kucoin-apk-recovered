package com.sumsub.sns.internal.features.presentation.videoident.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatServiceLauncher;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "session", "Lcom/sumsub/sns/internal/core/common/SNSSession;", InterfaceC33826o0.f71244p, "", InterfaceC33730j9.f70350a, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoChatServiceLauncher {

    @NotNull
    public static final SNSVideoChatServiceLauncher INSTANCE = new SNSVideoChatServiceLauncher();

    public final void launch(@NotNull Context context, @NotNull SNSSession session, @Nullable String token) {
        Intent intent = new Intent(context, (Class<?>) SNSVideoChatService.class);
        intent.setAction(SNSVideoChatService.ACTION_START_FOREGROUND);
        intent.putExtra(SNSVideoChatService.SNS_EXTRA_SESSION, session);
        intent.putExtra(SNSVideoChatService.SNS_EXTRA_TOKEN, token);
        ContextCompat.startForegroundService(context, intent);
    }

    public final void stop(@NotNull Context context) {
        Intent intent = new Intent(SNSVideoChatService.ACTION_INTERNAL_CLOSE);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    private SNSVideoChatServiceLauncher() {
    }
}
