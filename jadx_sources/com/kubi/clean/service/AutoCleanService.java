package com.kubi.clean.service;

import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.clean.api.constant.MainTabPage;
import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.event.api.C12572a;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p720wb.C45785a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.clean.service.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AutoCleanService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/clean/service/AutoCleanService;", "Lcom/kubi/clean/api/service/IAutoCleanService;", "<init>", "()V", "showNotice", "Lkotlin/Result;", "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;", "config", "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;", "showNotice-YNEx5aM", "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissAutoLimitView", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "queryLimitMessage", "", "", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "bizTypeList", "", "Lcom/kubi/clean/api/entity/AutoCleanBizType;", "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindEvent", "refreshTopMsg", "onMainTabChanged", "mainTabPage", "Lcom/kubi/clean/api/constant/MainTabPage;", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AutoCleanService implements IAutoCleanService {
    @Override // com.kubi.clean.api.service.IAutoCleanService
    /* JADX INFO: renamed from: b */
    public void mo20402b() {
        AutoCleanNoticeManager.f19567a.m20423e();
    }

    @Override // com.kubi.clean.api.service.IAutoCleanService
    /* JADX INFO: renamed from: c */
    public void mo20403c(@NotNull MainTabPage mainTabPage) {
        Intrinsics.checkNotNullParameter(mainTabPage, "mainTabPage");
        AutoCleanNoticeManager.f19567a.m20427m(mainTabPage);
    }

    @Override // com.kubi.clean.api.service.IAutoCleanService
    /* JADX INFO: renamed from: d */
    public void mo20404d(@Nullable ViewGroup viewGroup) throws Throwable {
        AutoCleanNoticeManager.f19567a.m20424j(viewGroup);
    }

    @Override // com.kubi.clean.api.service.IAutoCleanService
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo20405e(@NotNull AutoCleanBizType[] autoCleanBizTypeArr, @NotNull Continuation<? super Map<String, IPLimitConfig>> continuation) {
        return AutoCleanNoticeManager.f19567a.m20425k((AutoCleanBizType[]) Arrays.copyOf(autoCleanBizTypeArr, autoCleanBizTypeArr.length), continuation);
    }

    @Override // com.kubi.clean.api.service.IAutoCleanService
    /* JADX INFO: renamed from: a */
    public void mo20401a() {
        C45785a.m101113a("接收到刷新事件");
        C12572a.m23695d("event_refresh_top_msg", null, 0L, 6, null);
    }
}
