package com.kubi.config.core;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IRemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/config/core/IRemoteConfig;", "", "Companion", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface IRemoteConfig {

    /* JADX INFO: compiled from: IRemoteConfig.kt */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/config/core/IRemoteConfig$Companion;", "", "<init>", "()V", "Lcom/kubi/config/core/IRemoteConfig;", "b", "Lcom/kubi/config/core/IRemoteConfig;", "getImplement", "()Lcom/kubi/config/core/IRemoteConfig;", "implement", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19643a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final IRemoteConfig implement = new FirebaseConfig();

        @NotNull
        public final IRemoteConfig getImplement() {
            return implement;
        }
    }
}
