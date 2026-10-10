package s30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.tradetype.ITradeTypeBizInfo;
import com.kubi.tradebase.tradetype.ITradeTypePlatform;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s30.q */
/* JADX INFO: compiled from: LimitTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0011H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0011H\u0096\u0001J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001J\t\u0010\u0017\u001a\u00020\fH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/LimitTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "refreshViewByType", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBuy", "", "context", "Landroid/content/Context;", "isConditionalMarket", "isFutures", "pageId", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44301q implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97910a;

    public C44301q(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97910a = platformInfo;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m97748k(C44301q c44301q) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, c44301q.m63388h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final void m97750m(View view, boolean z11) {
        ((TextView) view.findViewById(R$id.tvDescDetail)).setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_llimit_buy_order_description : R$string.trade_ordertype_introduce_llimit_sell_order_description));
        ((ImageView) view.findViewById(R$id.ivType)).setImageResource(z11 ? R$mipmap.trade_ordertype_limit_buy : R$mipmap.trade_ordertype_limit_sell);
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97910a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "orderIntroLimitTab");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97910a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97910a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97910a.mo63365g();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97910a.pageId();
    }

    /* JADX INFO: renamed from: l */
    public static final void m97749l(C44301q c44301q, View view, RadioGroup radioGroup, int i11) {
        boolean z11;
        Intrinsics.checkNotNull(view);
        if (i11 == R$id.rbBuy) {
            z11 = true;
        } else {
            z11 = false;
        }
        c44301q.m97750m(view, z11);
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        String string = mo63363e().getString(R$string.limit_price_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        final View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_limit_trade_info, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.tvDesc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: s30.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44301q.m97748k(this.f97907b);
            }
        }, 1, null);
        ((RadioGroup) viewInflate.findViewById(R$id.rgGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s30.p
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                C44301q.m97749l(this.f97908b, viewInflate, radioGroup, i11);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        m97750m(viewInflate, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
