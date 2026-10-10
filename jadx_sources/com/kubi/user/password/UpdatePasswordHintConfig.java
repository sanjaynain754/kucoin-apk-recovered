package com.kubi.user.password;

import com.kubi.user.config.UserInfo;
import com.kubi.user.utils.l0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.user.password.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UpdatePasswordHintConfig.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/user/password/UpdatePasswordHintConfig;", "", "<init>", "()V", "ONE_DAY_MILLISECOND", "", "hasShowed", "", "updateShowedTimeStamp", "", "now", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUpdatePasswordHintConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatePasswordHintConfig.kt\ncom/kubi/user/password/UpdatePasswordHintConfig\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,32:1\n84#2:33\n75#2,2:34\n*S KotlinDebug\n*F\n+ 1 UpdatePasswordHintConfig.kt\ncom/kubi/user/password/UpdatePasswordHintConfig\n*L\n22#1:33\n30#1:34,2\n*E\n"})
public final class UpdatePasswordHintConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UpdatePasswordHintConfig f53722a = new UpdatePasswordHintConfig();

    /* JADX INFO: renamed from: a */
    public final void m65568a(long j11) {
        String strH = UserInfo.a.h();
        if (strH == null) {
            return;
        }
        C46392a.m102330m(l0.a.d().m102384f(strH), j11);
    }
}
