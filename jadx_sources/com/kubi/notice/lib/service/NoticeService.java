package com.kubi.notice.lib.service;

import android.content.Context;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.notice.lib.api.MainRedPointManager;
import com.kubi.router.core.Router;
import ms.C42610l;
import org.jetbrains.annotations.NotNull;
import p512os.C43327a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.notice.lib.service.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NoticeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/notice/lib/service/NoticeService;", "Lcom/kubi/notice/api/service/INoticeService;", "<init>", "()V", "getNoticeDialogInfo", "", "getRedPoint", "context", "Landroid/content/Context;", "needRequestOTC", "", "clearDialogNoticeList", "showNoticeDialog", "module", "", "jumpMessageCenter", "jumpNoticeManage", "jumpToSystemNoticeSetting", "getPermission", "type", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoticeService implements INoticeService {
    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: a */
    public boolean mo43132a(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C43327a.f95643a.m95361a(type);
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: b */
    public void mo43133b() {
        C42610l.f94327a.m93431m();
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: c */
    public void mo43134c() {
        Router.f46192a.m56184f("krn/router?biz=message&entry=main&component=kucoin_message_rn&needLogin=true").m4048k();
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: d */
    public void mo43135d(@NotNull String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        C42610l.f94327a.m93433t(module);
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: e */
    public void mo43136e(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        MainRedPointManager.f36366a.m43151k(context, z11);
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: f */
    public void mo43137f() {
        C43327a.f95643a.m95362b();
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: g */
    public void mo43138g() {
        C42610l.f94327a.m93432r().clear();
    }

    @Override // com.kubi.notice.api.service.INoticeService
    /* JADX INFO: renamed from: h */
    public void mo43139h() {
        Router.f46192a.m56184f("krn/router?biz=message&entry=main&component=kucoin_message_rn&route=NotifyManagerPage&needLogin=true").m4048k();
    }
}
