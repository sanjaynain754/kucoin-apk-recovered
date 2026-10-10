package com.kubi.tradefacade.api;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ITradeFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradefacade/api/ITradeFacadeService;", "", "getTradeFragment", "Lcom/kubi/sdk/BaseFragment;", "handleKlineInMaintenance", "", "tradeFragment", TIMPushProvider.f75062n, "", "isFirstShow", "refresh", "setFirstShow", "syncTradeRoute", "args", "Landroid/os/Bundle;", "getCurrentTradeType", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "Companion", "TradeFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeFacadeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51878a = Companion.f51879a;

    /* JADX INFO: compiled from: ITradeFacadeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/tradefacade/api/ITradeFacadeService;", "TradeFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51879a = new Companion();

        @NotNull
        public final ITradeFacadeService get() {
            return (ITradeFacadeService) Router.f46192a.m56192n(ITradeFacadeService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo63585a(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: b */
    int mo63586b(@NotNull FragmentActivity fragmentActivity);

    /* JADX INFO: renamed from: c */
    void mo63587c(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: d */
    void mo63588d(@NotNull BaseFragment baseFragment, @Nullable Bundle bundle);

    /* JADX INFO: renamed from: e */
    void mo63589e(@NotNull BaseFragment baseFragment, boolean z11);

    @NotNull
    /* JADX INFO: renamed from: f */
    BaseFragment mo63590f();

    /* JADX INFO: renamed from: i */
    void mo63591i(@NotNull BaseFragment baseFragment, boolean z11);
}
