package com.tencent.rmonitor.base.config;

import com.tencent.bugly.proguard.C33547af;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.rmonitor.base.config.c */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public interface InterfaceC35102c {

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.c$a */
    /* JADX INFO: compiled from: BUGLY */
    public enum a {
        LAUNCH,
        CONFIG_CHANGE,
        APPLY_PARAM_CHANGE
    }

    /* JADX INFO: renamed from: a */
    void mo73909a(@NotNull C33547af c33547af);

    /* JADX INFO: renamed from: a */
    void mo73910a(@NotNull C33547af c33547af, a aVar);
}
