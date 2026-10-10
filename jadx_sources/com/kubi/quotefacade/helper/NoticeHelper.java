package com.kubi.quotefacade.helper;

import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.s1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NoticeHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/NoticeHelper;", "", "<init>", "()V", "hasQuotesNotice", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoticeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NoticeHelper f42099a = new NoticeHelper();

    /* JADX INFO: renamed from: a */
    public final boolean m52111a() {
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        return bQuoteFacadeDepend.m53025e().c() && !bQuoteFacadeDepend.m53025e().d0().isHasOpenContract();
    }
}
