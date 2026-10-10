package com.kubi.clean.api.service;

import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.clean.api.constant.MainTabPage;
import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.router.core.Router;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IAutoCleanService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/clean/api/service/IAutoCleanService;", "", "showNotice", "Lkotlin/Result;", "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;", "config", "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;", "showNotice-YNEx5aM", "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissAutoLimitView", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "queryLimitMessage", "", "", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "bizTypeList", "", "Lcom/kubi/clean/api/entity/AutoCleanBizType;", "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindEvent", "refreshTopMsg", "onMainTabChanged", "mainTabPage", "Lcom/kubi/clean/api/constant/MainTabPage;", "Companion", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAutoCleanService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f19482a = Companion.f19483a;

    /* JADX INFO: compiled from: IAutoCleanService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/clean/api/service/IAutoCleanService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/clean/api/service/IAutoCleanService;", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19483a = new Companion();

        @NotNull
        public final IAutoCleanService get() {
            return (IAutoCleanService) Router.f46192a.m56192n(IAutoCleanService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo20401a();

    /* JADX INFO: renamed from: b */
    void mo20402b();

    /* JADX INFO: renamed from: c */
    void mo20403c(@NotNull MainTabPage mainTabPage);

    /* JADX INFO: renamed from: d */
    void mo20404d(@Nullable ViewGroup viewGroup);

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo20405e(@NotNull AutoCleanBizType[] autoCleanBizTypeArr, @NotNull Continuation<? super Map<String, IPLimitConfig>> continuation);
}
