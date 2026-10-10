package s30;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.tradetype.ITradeTypeBizInfo;
import com.kubi.tradebase.tradetype.ITradeTypePlatform;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s30.n */
/* JADX INFO: compiled from: LimitStopTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\t\u0010\r\u001a\u00020\u000eH\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u0012\u001a\u00020\fH\u0096\u0001J\t\u0010\u0013\u001a\u00020\fH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/LimitStopTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "isConditionalMarket", "", "isFutures", "pageId", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44298n implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97906a;

    public C44298n(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97906a = platformInfo;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m97745j(C44298n c44298n) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, c44298n.m63388h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97906a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "orderIntroStopLimitTab");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97906a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97906a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97906a.mo63365g();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97906a.pageId();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        int i11;
        Context contextMo63363e = mo63363e();
        if (mo63364f()) {
            i11 = R$string.condition_limit_price_order;
        } else {
            i11 = R$string.limit_price_stop;
        }
        String string = contextMo63363e.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        int i11;
        int i12;
        int i13;
        View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_limit_stop_trade_info, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tvDesc);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: s30.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44298n.m97745j(this.f97905b);
            }
        }, 1, null);
        Context contextMo63363e = mo63363e();
        if (mo63364f()) {
            i11 = R$string.trade_ordertype_introduce_limit_stop_title_kumex;
        } else {
            i11 = R$string.trade_ordertype_introduce_limit_stop_title_new;
        }
        textView.setText(contextMo63363e.getString(i11));
        if (!mo63364f()) {
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(mo63363e(), R$color.brandRed)));
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tvDescDetail);
        Context contextMo63363e2 = mo63363e();
        if (mo63364f()) {
            i12 = R$string.trade_ordertype_introduce_limit_stop_scence_descption_kumex;
        } else {
            i12 = R$string.trade_ordertype_introduce_limit_stop_scence_descption;
        }
        textView2.setText(contextMo63363e2.getString(i12));
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.tvNoteDetail);
        Context contextMo63363e3 = mo63363e();
        if (mo63364f()) {
            i13 = R$string.trade_ordertype_introduce_limit_stop_scence_note_kumex;
        } else {
            i13 = R$string.trade_ordertype_introduce_limit_stop_scence_note;
        }
        textView3.setText(contextMo63363e3.getString(i13));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
