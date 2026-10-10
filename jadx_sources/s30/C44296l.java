package s30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
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

/* JADX INFO: renamed from: s30.l */
/* JADX INFO: compiled from: LimitAdvanceTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\t\u0010\u0019\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u001a\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u001b\u001a\u00020\fH\u0096\u0001J\t\u0010\u001c\u001a\u00020\fH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/LimitAdvanceTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "handleAdvancedLimitView", "", "advancedLimitView", "refreshViewByType", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBuy", "", "bindIOCStyle", "bindFokStyle", "bindPostOnlyStyle", "context", "Landroid/content/Context;", "isConditionalMarket", "isFutures", "pageId", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44296l implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97904a;

    /* JADX INFO: renamed from: t */
    public static final Unit m97736t(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, C44296l c44296l) {
        shapeTextView.setSelected(true);
        shapeTextView2.setSelected(false);
        shapeTextView3.setSelected(false);
        textView.setText(view.getResources().getString(R$string.kc_advanced_limit_order_postonly_desc));
        c44296l.m97743w(view, ((RadioGroup) view.findViewById(R$id.rgGroup)).getCheckedRadioButtonId() == R$id.rbBuy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m97737u(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, C44296l c44296l) {
        shapeTextView.setSelected(false);
        shapeTextView2.setSelected(true);
        shapeTextView3.setSelected(false);
        textView.setText(view.getResources().getString(R$string.kc_advanced_limit_order_fok_desc));
        c44296l.m97743w(view, ((RadioGroup) view.findViewById(R$id.rgGroup)).getCheckedRadioButtonId() == R$id.rbBuy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m97738v(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, C44296l c44296l) {
        shapeTextView.setSelected(false);
        shapeTextView2.setSelected(false);
        shapeTextView3.setSelected(true);
        textView.setText(view.getResources().getString(R$string.kc_advanced_limit_order_fokioc_desc));
        c44296l.m97743w(view, ((RadioGroup) view.findViewById(R$id.rgGroup)).getCheckedRadioButtonId() == R$id.rbBuy);
        return Unit.INSTANCE;
    }

    public C44296l(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97904a = platformInfo;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m97734q(C44296l c44296l) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, c44296l.m63388h(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97904a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "orderIntroAdvancedLimitTab");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97904a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97904a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97904a.mo63365g();
    }

    /* JADX INFO: renamed from: n */
    public final void m97739n(View view, boolean z11) {
        ImageView imageView = (ImageView) view.findViewById(R$id.ivBIcon);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.ivBShape);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.ivCShape);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvB);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvC);
        ImageView imageView4 = (ImageView) view.findViewById(R$id.ivType);
        BaseTextView baseTextView3 = (BaseTextView) view.findViewById(R$id.tvDescDetail);
        imageView4.setPadding(0, 0, 0, C5275i0.m6236a(8.0f));
        imageView4.setImageResource(z11 ? R$mipmap.trade_ordertype_alimit_buy_fok : R$mipmap.trade_ordertype_alimit_sell_fok);
        baseTextView2.setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_sketch_al_c1c2_buyamount : R$string.trade_ordertype_introduce_sketch_al_c1c2_sellamount));
        baseTextView.setText(mo63363e().getString(R$string.trade_ordertype_introduce_sketch_al_b_blimitprice));
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66577h(imageView);
        Intrinsics.checkNotNull(imageView2);
        C27046k.m66701p(imageView2, mo63363e().getResources().getColor(R$color.complementary));
        imageView2.setImageResource(R$drawable.bg_dot_8_primary);
        imageView3.setImageResource(R$drawable.bg_ring_8_complementary);
        baseTextView3.setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_advance_limit_FOK_buy_des : R$string.trade_ordertype_introduce_advance_limit_FOK_sell_des));
    }

    /* JADX INFO: renamed from: o */
    public final void m97740o(View view, boolean z11) {
        ImageView imageView = (ImageView) view.findViewById(R$id.ivBIcon);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.ivBShape);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.ivCShape);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvB);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvC);
        ImageView imageView4 = (ImageView) view.findViewById(R$id.ivType);
        BaseTextView baseTextView3 = (BaseTextView) view.findViewById(R$id.tvDescDetail);
        imageView4.setPadding(0, 0, 0, C5275i0.m6236a(8.0f));
        imageView4.setImageResource(z11 ? R$mipmap.trade_ordertype_alimit_buy_ioc : R$mipmap.trade_ordertype_alimit_sell_ioc);
        baseTextView2.setText(mo63363e().getString(R$string.trade_ordertype_introduce_sketch_al_enter_orderbook));
        baseTextView2.setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_sketch_al_c1c2_buyamount : R$string.trade_ordertype_introduce_sketch_al_c1c2_sellamount));
        baseTextView.setText(mo63363e().getString(R$string.trade_ordertype_introduce_sketch_al_b_blimitprice));
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66577h(imageView);
        Intrinsics.checkNotNull(imageView2);
        C27046k.m66701p(imageView2, mo63363e().getResources().getColor(R$color.complementary));
        imageView2.setImageResource(R$drawable.bg_dot_8_primary);
        imageView3.setImageResource(R$drawable.bg_ring_8_complementary);
        baseTextView3.setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_advance_limit_IOC_buy_des : R$string.trade_ordertype_introduce_advance_limit_IOC_sell_des));
    }

    /* JADX INFO: renamed from: p */
    public final void m97741p(View view, boolean z11) {
        ImageView imageView = (ImageView) view.findViewById(R$id.ivBIcon);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.ivBShape);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.ivCShape);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvB);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvC);
        ImageView imageView4 = (ImageView) view.findViewById(R$id.ivType);
        imageView4.setPadding(0, 0, 0, 0);
        BaseTextView baseTextView3 = (BaseTextView) view.findViewById(R$id.tvDescDetail);
        imageView4.setImageResource(z11 ? R$mipmap.trade_ordertype_adcamce_limit_buy : R$mipmap.trade_ordertype_adcamce_limit_sell);
        baseTextView2.setText(mo63363e().getString(R$string.trade_ordertype_introduce_sketch_al_enter_orderbook));
        baseTextView.setText(mo63363e().getString(R$string.trade_ordertype_introduce_sketch_bc_triggerprice));
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66594y(imageView);
        imageView2.clearColorFilter();
        imageView2.setImageResource(R$drawable.bg_ring_8_primary);
        imageView3.setImageResource(R$drawable.bg_trade_type_ext_area);
        baseTextView3.setText(mo63363e().getString(z11 ? R$string.trade_ordertype_introduce_advance_limit_postonly_buy_des : R$string.trade_ordertype_introduce_advance_limit_postonly_sell_des));
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97904a.pageId();
    }

    /* JADX INFO: renamed from: s */
    public final void m97742s(final View view) {
        if (view != null) {
            final ShapeTextView shapeTextView = (ShapeTextView) view.findViewById(R$id.tvPostOnly);
            final ShapeTextView shapeTextView2 = (ShapeTextView) view.findViewById(R$id.tvFOK);
            final ShapeTextView shapeTextView3 = (ShapeTextView) view.findViewById(R$id.tvIOC);
            final TextView textView = (TextView) view.findViewById(R$id.tvTypeDesc);
            Intrinsics.checkNotNull(shapeTextView);
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: s30.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44296l.m97736t(shapeTextView, shapeTextView2, shapeTextView3, textView, view, this);
                }
            }, 1, null);
            Intrinsics.checkNotNull(shapeTextView2);
            C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: s30.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44296l.m97737u(shapeTextView, shapeTextView2, shapeTextView3, textView, view, this);
                }
            }, 1, null);
            Intrinsics.checkNotNull(shapeTextView3);
            C27046k.m66711z(shapeTextView3, 0L, new Function0() { // from class: s30.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44296l.m97738v(shapeTextView, shapeTextView2, shapeTextView3, textView, view, this);
                }
            }, 1, null);
            shapeTextView.performClick();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m97743w(View view, boolean z11) {
        boolean zIsSelected = ((ShapeTextView) view.findViewById(R$id.tvPostOnly)).isSelected();
        boolean zIsSelected2 = ((ShapeTextView) view.findViewById(R$id.tvFOK)).isSelected();
        if (zIsSelected) {
            m97741p(view, z11);
        } else if (zIsSelected2) {
            m97739n(view, z11);
        } else {
            m97740o(view, z11);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m97735r(C44296l c44296l, View view, RadioGroup radioGroup, int i11) {
        boolean z11;
        Intrinsics.checkNotNull(view);
        if (i11 == R$id.rbBuy) {
            z11 = true;
        } else {
            z11 = false;
        }
        c44296l.m97743w(view, z11);
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        String string = mo63363e().getString(R$string.kc_advanced_limit_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        final View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_limit_advance_trade_info, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.tvDesc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: s30.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44296l.m97734q(this.f97880b);
            }
        }, 1, null);
        ((RadioGroup) viewInflate.findViewById(R$id.rgGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s30.h
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                C44296l.m97735r(this.f97883b, viewInflate, radioGroup, i11);
            }
        });
        m97742s(viewInflate);
        Intrinsics.checkNotNull(viewInflate);
        m97743w(viewInflate, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
