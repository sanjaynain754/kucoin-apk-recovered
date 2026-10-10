package i70;

import android.net.Uri;
import com.blankj.utilcode.util.C5278k;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.config.UserInfo;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.helper.u;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.web.api.IWebService;
import d70.C36638a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: i70.i */
/* JADX INFO: compiled from: RouteUserCenterInterceptor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/interceptor/UserLoginInterceptorV2;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "fetchParamsFromUri", "", "", "", "uri", "Landroid/net/Uri;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteUserCenterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/UserLoginInterceptorV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,283:1\n1869#2,2:284\n1869#2:286\n1870#2:288\n1#3:287\n57#4,8:289\n*S KotlinDebug\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/UserLoginInterceptorV2\n*L\n102#1:284,2\n119#1:286\n119#1:288\n125#1:289,8\n*E\n"})
public final class C38482i implements InterfaceC46936b {
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m87077c(Uri uri) {
        Object objM103844constructorimpl;
        if (uri == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            for (String str : queryParameterNames) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(C5278k.m6256a(uri.getQueryParameter(str)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = "";
                }
                linkedHashMap.put(str, objM103844constructorimpl);
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                if (C36638a.m81972c(e11)) {
                    C43846g.m96568c(new UserCenterException(e11, "UserLoginInterceptor", true, null, 8, null), null, 2, null);
                } else {
                    C36638a.m81973d(e11, "UserLoginInterceptor");
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final Unit m87076d(Ref.ObjectRef objectRef) {
        String queryParameter = ((C4400a) objectRef.element).getUri().getQueryParameter("userLoginInterceptorCheckFromH5");
        if (C27025c.m66566d(queryParameter != null ? Boolean.valueOf(Boolean.parseBoolean(queryParameter)) : null)) {
            IWebService.m67011f(IWebService.f54644a.get(), null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, ay.a] */
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Set<Map.Entry<String, Object>> setEntrySet;
        Intrinsics.checkNotNullParameter(chain, "chain");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = chain.getPostcard();
        if (UserInfo.a.n()) {
            C27100x0.m66924e(new Function0() { // from class: i70.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38482i.m87076d(objectRef);
                }
            });
            int iM56260m = RouteExKt.m56260m(((C4400a) objectRef.element).getBundle(), "appLauncherType");
            if (iM56260m != 1 && iM56260m != 3) {
                return true;
            }
        } else {
            Map<String, Object> mapM87077c = m87077c(((C4400a) objectRef.element).getUri());
            if (mapM87077c != null && (setEntrySet = mapM87077c.entrySet()) != null) {
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C4400a) objectRef.element).m4038a((String) entry.getKey(), entry.getValue());
                }
            }
            if (u.a.h((C4400a) objectRef.element)) {
                return true;
            }
        }
        return chain.mo103413a((C4400a) objectRef.element);
    }
}
