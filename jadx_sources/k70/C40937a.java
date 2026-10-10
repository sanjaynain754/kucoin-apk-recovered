package k70;

import com.kubi.user.site.config.UserCenterSiteConfigRepository;
import n00.InterfaceC42695a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: k70.a */
/* JADX INFO: compiled from: SitConfigSPI.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/user/spi/SitConfigSPI;", "Lcom/kubi/sdk/site/spi/ISitConfigSPI;", "<init>", "()V", "isCacheFileExist", "", "context", "Landroid/content/Context;", "targetSite", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserCenterSiteConfigFromServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40937a implements InterfaceC42695a {
    @Override // n00.InterfaceC42695a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo89708a(@NotNull Continuation<? super Boolean> continuation) {
        return UserCenterSiteConfigRepository.f53816a.m65771g(continuation);
    }
}
