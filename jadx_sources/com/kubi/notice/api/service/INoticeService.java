package com.kubi.notice.api.service;

import android.content.Context;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: INoticeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/notice/api/service/INoticeService;", "", "getNoticeDialogInfo", "", "getRedPoint", "context", "Landroid/content/Context;", "needRequestOTC", "", "clearDialogNoticeList", "showNoticeDialog", "module", "", "jumpMessageCenter", "jumpNoticeManage", "jumpToSystemNoticeSetting", "getPermission", "type", "Companion", "NoticeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface INoticeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f36364a = Companion.f36365a;

    /* JADX INFO: compiled from: INoticeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/notice/api/service/INoticeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/notice/api/service/INoticeService;", "NoticeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f36365a = new Companion();

        @NotNull
        public final INoticeService get() {
            return (INoticeService) Router.f46192a.m56192n(INoticeService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo43132a(@NotNull String str);

    /* JADX INFO: renamed from: b */
    void mo43133b();

    /* JADX INFO: renamed from: c */
    void mo43134c();

    /* JADX INFO: renamed from: d */
    void mo43135d(@NotNull String str);

    /* JADX INFO: renamed from: e */
    void mo43136e(@NotNull Context context, boolean z11);

    /* JADX INFO: renamed from: f */
    void mo43137f();

    /* JADX INFO: renamed from: g */
    void mo43138g();

    /* JADX INFO: renamed from: h */
    void mo43139h();
}
