package com.kubi.notice.lib.service;

import com.kubi.otc.api.IOtcService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.notice.lib.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NoticeDepend.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/notice/lib/service/NoticeDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "otcService", "Lcom/kubi/otc/api/IOtcService;", "safeService", "Lcom/kubi/safe/api/service/ISafeService;", "hasLogin", "", "otcMerchant", "isWithDrawPassword", "toCheckCodeFragment", "", "context", "Landroid/content/Context;", "title", "", "type", "Lcom/kubi/data/constance/ValidationBizEnum;", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeDepend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeDepend.kt\ncom/kubi/notice/lib/service/NoticeDepend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class NoticeDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NoticeDepend f36385a = new NoticeDepend();

    @Nullable
    /* JADX INFO: renamed from: c */
    public final IOtcService m43211c() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IOtcService.f37164a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IOtcService) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final IUserService m43212d() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IUserService.a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IUserService) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43209a() {
        Boolean boolValueOf;
        IUserService iUserServiceM43212d = m43212d();
        if (iUserServiceM43212d != null) {
            boolValueOf = Boolean.valueOf(iUserServiceM43212d.c());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43210b() {
        Boolean boolValueOf;
        IOtcService iOtcServiceM43211c = m43211c();
        if (iOtcServiceM43211c != null) {
            boolValueOf = Boolean.valueOf(iOtcServiceM43211c.mo43962i());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }
}
