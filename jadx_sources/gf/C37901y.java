package gf;

import com.kubi.data.coin.BizType;
import com.kubi.data.coin.PushDelay;
import com.kubi.data.coin.QueryRet;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gf.y */
/* JADX INFO: compiled from: SymbolsTechEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m90084d2 = {"techEvent", "", "bizType", "Lcom/kubi/data/coin/BizType;", "ret", "Lcom/kubi/data/coin/QueryRet;", "Lcom/kubi/data/coin/PushDelay;", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37901y {
    /* JADX INFO: renamed from: a */
    public static final void m85656a(@NotNull BizType bizType, @NotNull QueryRet ret) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(ret, "ret");
        C43847h.m96575d(bizType.getKunlunEvent(), ret.ordinal());
    }

    /* JADX INFO: renamed from: b */
    public static final void m85657b(@NotNull PushDelay ret) {
        Intrinsics.checkNotNullParameter(ret, "ret");
        C43847h.m96575d(KunlunTechEventEnum.CATE_SYMBOLS_PUSH_DELAY, ret.ordinal());
    }
}
