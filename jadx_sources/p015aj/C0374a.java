package p015aj;

import com.kubi.mine.api.service.IMineService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: aj.a */
/* JADX INFO: compiled from: HelpCenterDepend.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/helpcenter/service/HelpCenterDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "mineService", "Lcom/kubi/mine/api/service/IMineService;", "hasLogin", "", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenterDepend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterDepend.kt\ncom/kubi/helpcenter/service/HelpCenterDepend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class C0374a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0374a f1118a = new C0374a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public final IMineService m1470b() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IMineService.f35025a.get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (IMineService) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final IUserService m1471c() {
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
    public final boolean m1469a() {
        Boolean boolValueOf;
        IUserService iUserServiceM1471c = m1471c();
        if (iUserServiceM1471c != null) {
            boolValueOf = Boolean.valueOf(iUserServiceM1471c.c());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }
}
