package s30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
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

/* JADX INFO: renamed from: s30.d */
/* JADX INFO: compiled from: ConditionalTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0015\u001a\u00020\fH\u0096\u0001J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ConditionalTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "handleMarketLimitView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "context", "Landroid/content/Context;", "isConditionalMarket", "", "isFutures", "pageId", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44283d implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97874a;

    /* JADX INFO: renamed from: n */
    public static final Unit m97714n(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ImageView imageView, TextView textView, View view, TextView textView2, View view2) {
        shapeTextView.setSelected(true);
        shapeTextView2.setSelected(false);
        imageView.setImageResource(R$mipmap.trade_ordertype_conditional_limit);
        textView.setText(view.getResources().getString(R$string.trade_ordertype_introduce_limit_stop_scence_descption_kumex));
        textView2.setText(view.getResources().getString(R$string.trade_ordertype_introduce_limit_stop_scence_note_kumex));
        Intrinsics.checkNotNull(view2);
        ViewExtKt.m66594y(view2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m97715o(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ImageView imageView, TextView textView, View view, TextView textView2, View view2) {
        shapeTextView.setSelected(false);
        shapeTextView2.setSelected(true);
        imageView.setImageResource(R$mipmap.trade_ordertype_condition_market);
        textView.setText(view.getResources().getString(R$string.trade_ordertype_introduce_market_stop_scence_description_kumex));
        textView2.setText(view.getResources().getString(R$string.trade_ordertype_introduce_market_scence_note_kumex));
        Intrinsics.checkNotNull(view2);
        ViewExtKt.m66577h(view2);
        return Unit.INSTANCE;
    }

    public C44283d(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97874a = platformInfo;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m97713l(C44283d c44283d) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, c44283d.m63388h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97874a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "conditional");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97874a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97874a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97874a.mo63365g();
    }

    /* JADX INFO: renamed from: m */
    public final void m97716m(final View view) {
        if (view != null) {
            final ShapeTextView shapeTextView = (ShapeTextView) view.findViewById(R$id.conditionLimit);
            final ShapeTextView shapeTextView2 = (ShapeTextView) view.findViewById(R$id.conditionMarket);
            final TextView textView = (TextView) view.findViewById(R$id.tvDescDetail);
            final TextView textView2 = (TextView) view.findViewById(R$id.tvNoteDetail);
            final ImageView imageView = (ImageView) view.findViewById(R$id.ivType);
            final View viewFindViewById = view.findViewById(R$id.tvC);
            Intrinsics.checkNotNull(shapeTextView);
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: s30.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44283d.m97714n(shapeTextView, shapeTextView2, imageView, textView, view, textView2, viewFindViewById);
                }
            }, 1, null);
            Intrinsics.checkNotNull(shapeTextView2);
            C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: s30.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44283d.m97715o(shapeTextView, shapeTextView2, imageView, textView, view, textView2, viewFindViewById);
                }
            }, 1, null);
            if (this.f97874a.mo63365g()) {
                shapeTextView2.performClick();
            } else {
                shapeTextView.performClick();
            }
        }
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97874a.pageId();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        String string = mo63363e().getString(R$string.kumex_order_conditional);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_conditional_trade_info, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.tvDesc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: s30.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44283d.m97713l(this.f97826b);
            }
        }, 1, null);
        m97716m(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
