package s30;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.tradetype.ITradeTypeBizInfo;
import com.kubi.tradebase.tradetype.ITradeTypePlatform;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s30.e0 */
/* JADX INFO: compiled from: TrailingTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0011H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0011H\u0096\u0001J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001J\t\u0010\u0017\u001a\u00020\fH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/TrailingTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "refreshViewByType", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBuy", "", "context", "Landroid/content/Context;", "isConditionalMarket", "isFutures", "pageId", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44286e0 implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97878a;

    public C44286e0(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97878a = platformInfo;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m97719k(C44286e0 c44286e0) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, c44286e0.m63388h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97878a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "orderIntroTrailingStopTab");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97878a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97878a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97878a.mo63365g();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97878a.pageId();
    }

    /* JADX INFO: renamed from: l */
    public static final void m97720l(C44286e0 c44286e0, View view, RadioGroup radioGroup, int i11) {
        boolean z11;
        Intrinsics.checkNotNull(view);
        if (i11 == R$id.rbBuy) {
            z11 = true;
        } else {
            z11 = false;
        }
        c44286e0.m97721m(view, z11);
    }

    /* JADX INFO: renamed from: m */
    private final void m97721m(View view, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (mo63364f()) {
            ((TextView) view.findViewById(R$id.tvDesc)).setText(mo63363e().getString(R$string.kumex_tso_order_desc));
            TextView textView = (TextView) view.findViewById(R$id.tvDescDetail);
            Context contextMo63363e = mo63363e();
            if (z11) {
                i14 = R$string.kumex_tso_order_buy_desc;
            } else {
                i14 = R$string.kumex_tso_order_sell_desc;
            }
            textView.setText(contextMo63363e.getString(i14));
            ((TextView) view.findViewById(R$id.tvNoteDetail)).setText(mo63363e().getString(R$string.kumex_tso_order_buy_sell_desc_note));
            ImageView imageView = (ImageView) view.findViewById(R$id.ivType);
            if (z11) {
                i15 = R$mipmap.trade_ordertype_kumex_tso_desc_buy;
            } else {
                i15 = R$mipmap.trade_ordertype_kumex_tso_desc_sell;
            }
            imageView.setImageResource(i15);
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R$id.tvDesc);
        textView2.setText(mo63363e().getString(R$string.trade_ordertype_introduce_tsorder_title_new));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView2);
        highlightTextHelper.m54116a(textView2, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(mo63363e(), R$color.brandRed)));
        TextView textView3 = (TextView) view.findViewById(R$id.tvDescDetail);
        Context contextMo63363e2 = mo63363e();
        if (z11) {
            i11 = R$string.trade_ordertype_introduce_tsorder_scence_des;
        } else {
            i11 = R$string.trade_ordertype_introduce_tsorder_sell_scence_des;
        }
        textView3.setText(contextMo63363e2.getString(i11));
        TextView textView4 = (TextView) view.findViewById(R$id.tvNoteDetail);
        Context contextMo63363e3 = mo63363e();
        if (z11) {
            i12 = R$string.trade_ordertype_introduce_tsorder_scence_note;
        } else {
            i12 = R$string.trade_ordertype_introduce_tsorder_scence_note_sell;
        }
        textView4.setText(contextMo63363e3.getString(i12));
        ImageView imageView2 = (ImageView) view.findViewById(R$id.ivType);
        if (z11) {
            i13 = R$mipmap.trade_ordertype_ts_buy;
        } else {
            i13 = R$mipmap.trade_ordertype_ts_sell;
        }
        imageView2.setImageResource(i13);
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        int i11;
        Context contextMo63363e = mo63363e();
        if (mo63364f()) {
            i11 = R$string.kumex_tso_order;
        } else {
            i11 = R$string.kc_spot_trailing_stop;
        }
        String string = contextMo63363e.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        final View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_tralling_trade_info, (ViewGroup) null);
        SuffixTextView suffixTextView = (SuffixTextView) viewInflate.findViewById(R$id.tvDesc);
        Intrinsics.checkNotNull(suffixTextView);
        C27046k.m66711z(suffixTextView, 0L, new Function0() { // from class: s30.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44286e0.m97719k(this.f97873b);
            }
        }, 1, null);
        View viewFindViewById = viewInflate.findViewById(R$id.llNote);
        boolean zMo63364f = mo63364f();
        Intrinsics.checkNotNull(viewFindViewById);
        if (zMo63364f) {
            ViewExtKt.m66577h(viewFindViewById);
        } else {
            ViewExtKt.m66594y(viewFindViewById);
        }
        View viewFindViewById2 = viewInflate.findViewById(R$id.llNoteFuture);
        boolean zMo63364f2 = mo63364f();
        Intrinsics.checkNotNull(viewFindViewById2);
        if (zMo63364f2) {
            ViewExtKt.m66594y(viewFindViewById2);
        } else {
            ViewExtKt.m66577h(viewFindViewById2);
        }
        ((RadioGroup) viewInflate.findViewById(R$id.rgGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s30.d0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                C44286e0.m97720l(this.f97875b, viewInflate, radioGroup, i11);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        m97721m(viewInflate, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
