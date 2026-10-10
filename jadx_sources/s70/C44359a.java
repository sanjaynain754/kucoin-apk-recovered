package s70;

import ad.InterfaceC0239a;
import ad.InterfaceC0240b;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s70.a */
/* JADX INFO: compiled from: UtaBizRouterOperator.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/assets/UtaBizRouterOperator;", "Lcom/kubi/core/base/assets/IBizRouterOperator;", "<init>", "()V", "jumpToOrderRecordPage", "", "context", "Landroid/content/Context;", "symbol", "", "index", "Lcom/kubi/core/base/assets/OrderRecordIndex;", "utaTradeType", "jumpToTransfer", FirebaseAnalytics.Param.CURRENCY, "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44359a implements InterfaceC0239a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44359a f98026a = new C44359a();

    @Override // ad.InterfaceC0239a
    /* JADX INFO: renamed from: a */
    public void mo872a(@NotNull Context context, @Nullable String str, @NotNull InterfaceC0240b index, @NotNull String utaTradeType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(utaTradeType, "utaTradeType");
        if (index instanceof InterfaceC0240b.b) {
            UtaDelegationRecordFragment.f54097e0.start(context, str, 0, utaTradeType);
        } else {
            if (!(index instanceof InterfaceC0240b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            UtaDelegationRecordFragment.f54097e0.start(context, str, 1, utaTradeType);
        }
    }

    @Override // ad.InterfaceC0239a
    /* JADX INFO: renamed from: b */
    public void mo873b(@Nullable String str) {
        InterfaceC37749a.a.m85117l(C37304a.f82764a, C27041f.m66668h(str), "MAIN", "UNIFIED", null, null, null, null, 120, null);
    }
}
