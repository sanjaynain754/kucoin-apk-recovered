package o50;

import com.kubi.router.model.IRedirect;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.user.api.IUserService;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o50.f */
/* JADX INFO: compiled from: LoginExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u0004"}, m90084d2 = {"checkLogin", "", "f", "Lkotlin/Function0;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42972f {
    /* JADX INFO: renamed from: b */
    public static final void m94366b(@NotNull final Function0<Unit> f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        IUserService.O(TradingBotKitDepend.m64273f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: o50.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42972f.m94367c(f11);
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m94367c(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
