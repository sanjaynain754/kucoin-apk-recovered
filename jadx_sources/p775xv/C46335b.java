package p775xv;

import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: xv.b */
/* JADX INFO: compiled from: RouteRedPacketInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR-\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/redpackage/interceptor/RouteRedPacketInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "needLoginList", "", "", "getNeedLoginList", "()Ljava/util/List;", "statusTable", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getStatusTable", "()Ljava/util/HashMap;", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46335b implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<String> f103910a = CollectionsKt.listOf((Object[]) new String[]{"redpacket/send", "redpacket/receive", "redpacket/history"});

    /* JADX INFO: renamed from: b */
    @NotNull
    public final HashMap<String, Boolean> f103911b;

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String strM56216G = RouteExKt.m56216G(postcard.getUri());
        C44128b.m97259c("RouteRedPacketInterceptor", "uri = " + chain.getPostcard().getUri());
        if (!UserInfo.a.n() && this.f103910a.contains(strM56216G)) {
            IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: xv.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C46335b.m102149c(chain);
                }
            }), 1, (Object) null);
            return true;
        }
        if (this.f103911b.containsKey(strM56216G)) {
            Object objM56284y = RouteExKt.m56284y(postcard.getBundle(), BaseActivity.STATUS_BAR);
            if (objM56284y == null) {
                objM56284y = this.f103911b.get(strM56216G);
            }
            postcard.m4038a(BaseActivity.STATUS_BAR, objM56284y);
        }
        return chain.mo103413a(chain.getPostcard());
    }

    public C46335b() {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("redpacket/receive", Boolean.TRUE);
        this.f103911b = map;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m102149c(InterfaceC46935a interfaceC46935a) {
        interfaceC46935a.mo103413a(interfaceC46935a.getPostcard());
        return Unit.INSTANCE;
    }
}
