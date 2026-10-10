package i70;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.utils.g0;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i70.e */
/* JADX INFO: compiled from: RouteUserCenterInterceptor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\fH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/user/interceptor/ResetPasswordAccountPageInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "extractResetPasswordParams", "Lkotlin/Triple;", "", "", "Lcom/kubi/router/model/Postcard;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38478e implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        Triple<Boolean, String, Integer> tripleM87074a = m87074a(postcard);
        if (g0.f(tripleM87074a.component1().booleanValue(), tripleM87074a.component2(), tripleM87074a.component3().intValue())) {
            return true;
        }
        return chain.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: a */
    public final Triple<Boolean, String, Integer> m87074a(C4400a c4400a) {
        boolean zM56252i;
        Integer intOrNull;
        int iIntValue = 0;
        if (c4400a.getBundle().containsKey("type")) {
            zM56252i = RouteExKt.m56252i(c4400a.getBundle(), "type", false);
        } else {
            String queryParameter = c4400a.getUri().getQueryParameter("type");
            if (queryParameter != null && StringsKt.equals(queryParameter, CredentialEntry.TRUE_STRING, true)) {
                zM56252i = true;
            } else {
                zM56252i = false;
            }
        }
        String string = c4400a.getBundle().getString("data");
        if (string == null) {
            string = c4400a.getUri().getQueryParameter("data");
        }
        String string2 = c4400a.getBundle().getString("loginSource");
        if (string2 == null) {
            string2 = c4400a.getUri().getQueryParameter("loginSource");
        }
        if (string2 != null && (intOrNull = StringsKt.toIntOrNull(string2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return new Triple<>(Boolean.valueOf(zM56252i), string, Integer.valueOf(iIntValue));
    }
}
