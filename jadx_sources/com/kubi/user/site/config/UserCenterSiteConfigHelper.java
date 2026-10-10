package com.kubi.user.site.config;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.user.site.config.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UserCenterSiteConfigHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/user/site/config/UserCenterSiteConfigHelper;", "", "<init>", "()V", "TAG", "", "isShowThirdAccountEntrance", "", "isSupportPasskeyLogin", "isSupportRCode", "isShowRegisterRetainDialog", "isShowFingerIntroduction", "isShowPasskeyIntroduction", "fetchTermId", "termCode", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterSiteConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterSiteConfigHelper.kt\ncom/kubi/user/site/config/UserCenterSiteConfigHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public final class UserCenterSiteConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserCenterSiteConfigHelper f53818a = new UserCenterSiteConfigHelper();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m65778a(@NotNull String termCode) {
        Object next;
        String termId;
        Intrinsics.checkNotNullParameter(termCode, "termCode");
        List<Term> userTermConfig = UserCenterSiteConfigRepository.f53816a.m65773i().getUserTermConfig();
        if (userTermConfig != null) {
            Iterator<T> it = userTermConfig.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((Term) next).getTermCode(), termCode));
            Term term = (Term) next;
            if (term != null && (termId = term.getTermId()) != null) {
                return termId;
            }
            return "";
        }
        return "";
    }
}
