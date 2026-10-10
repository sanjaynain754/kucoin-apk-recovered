package f30;

import android.text.TextUtils;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f30.a */
/* JADX INFO: compiled from: ExUtils.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a$\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u0018\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a$\u0010\u000f\u001a\u00020\u0001*\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0011H\u0086\bø\u0001\u0000\u001a\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m90084d2 = {"visibleOrGone", "", "Landroid/view/View;", "isShow", "", "jumpSpotTab", "symbol", "", "isBuy", "spotType", "", "disabledTip", "kotlin.jvm.PlatformType", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "isNotEmpty", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", TtmlNode.TAG_DIV, "Ljava/math/BigDecimal;", "other", "scale", "roundingMode", "Ljava/math/RoundingMode;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37330a {
    /* JADX INFO: renamed from: b */
    public static final void m83910b(@Nullable String str, boolean z11, int i11) {
        if (str == null || str.length() == 0) {
            ToastCompat.m66437C(R$string.current_trade_pause);
            return;
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        if (symbolInfoEntityM85601B == null) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.current_trade_pause, new Object[0]), new Object[0]);
        } else if (symbolInfoEntityM85601B.isEnableTrading() || symbolInfoEntityM85601B.getEnableAuctionTrade().booleanValue()) {
            InterfaceC37754f.a.m85141m(C37304a.f82764a, Long.valueOf(i11), str, Boolean.valueOf(z11), null, null, null, null, null, 248, null);
        } else {
            ToastCompat.m66441G(m83909a(symbolInfoEntityM85601B), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m83911c(String str, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        m83910b(str, z11, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m83912d(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m83909a(SymbolInfoEntity symbolInfoEntity) {
        if (TextUtils.isEmpty(symbolInfoEntity.getDisabledTip())) {
            return C27017c.f54310a.m66516f(R$string.current_trade_pause, new Object[0]);
        }
        return symbolInfoEntity.getDisabledTip();
    }
}
