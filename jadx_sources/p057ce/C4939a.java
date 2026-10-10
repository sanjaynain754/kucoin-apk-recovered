package p057ce;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ce.a */
/* JADX INFO: compiled from: OrderRole.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/constant/OrderRole;", "", "<init>", "()V", "TAKER", "", "MAKER", "getDisplayStr", "", ViewProps.ROLE, "(Ljava/lang/String;)Ljava/lang/Integer;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4939a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4939a f5493a = new C4939a();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m5171a(@Nullable String str) {
        if (StringsKt.equals("TAKER", str, true)) {
            return Integer.valueOf(R$string.unify_order_detail_role_taker);
        }
        if (StringsKt.equals("MAKER", str, true)) {
            return Integer.valueOf(R$string.unify_order_detail_role_maker);
        }
        return null;
    }
}
