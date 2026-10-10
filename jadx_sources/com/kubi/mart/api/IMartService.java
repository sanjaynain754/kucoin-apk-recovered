package com.kubi.mart.api;

import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IMartService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/mart/api/IMartService;", "", "getSpotSideBarFragment", "Lcom/kubi/sdk/BaseFragment;", "type", "", "symbolCode", "Companion", "MartApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMartService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f34639a = Companion.f34640a;

    /* JADX INFO: compiled from: IMartService.kt */
    /* JADX INFO: loaded from: classes28.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mart/api/IMartService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/mart/api/IMartService;", "MartApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f34640a = new Companion();

        @NotNull
        public final IMartService get() {
            return (IMartService) Router.f46192a.m56192n(IMartService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    BaseFragment mo41418a(@NotNull String str, @NotNull String str2);
}
