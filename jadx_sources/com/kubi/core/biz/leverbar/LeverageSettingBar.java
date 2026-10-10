package com.kubi.core.biz.leverbar;

import af.C0296a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37878b0;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p556qd.C43710a;
import p556qd.C43716g;
import p556qd.InterfaceC43711b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverageSettingBar.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0002./B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011JN\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010'\u001a\u00020$2\u0006\u0010&\u001a\u00020\nH\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*J\f\u0010+\u001a\u00020$*\u00020\nH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020$H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017¨\u00060"}, m90084d2 = {"Lcom/kubi/core/biz/leverbar/LeverageSettingBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewHolder", "Lcom/kubi/core/biz/leverbar/IViewHolder;", "clickListeners", "Lcom/kubi/core/biz/leverbar/LeverageSettingBar$ViewClickListeners;", "_settingData", "Lcom/kubi/core/biz/leverbar/LeverageSettingData;", "data", "getData", "()Lcom/kubi/core/biz/leverbar/LeverageSettingData;", "isVertical", "", "Ljava/lang/Boolean;", "bindData", "bindViewClickListener", "marginTypeClick", "Lkotlin/Function0;", "", "marginLeverClick", "rbModeClick", "rbClick", "updateUIDirection", "tradeType", "updateBRText", "textStr", "", "updateBRMode", "mode", "getRBModeText", "updateLeverage", "leverage", "Ljava/math/BigDecimal;", "getMarginTypeStr", "getOrCreateViewHolder", "getBRText", "Companion", "ViewClickListeners", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverageSettingBar extends FrameLayout {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f20426f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC43711b f20427b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C11920a f20428c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public LeverageSettingData f20429d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Boolean f20430e;

    /* JADX INFO: compiled from: LeverageSettingBar.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/leverbar/LeverageSettingBar$Companion;", "", "<init>", "()V", "TYPE_MARGIN", "", "TYPE_ISOLATE_MARGIN", "BorrowMode", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.leverbar.LeverageSettingBar$a */
    /* JADX INFO: compiled from: LeverageSettingBar.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/leverbar/LeverageSettingBar$ViewClickListeners;", "", "marginTypeClick", "Lkotlin/Function0;", "", "marginLeverClick", "repayModeClick", "borrowAndRepayClick", "<init>", "(Lcom/kubi/core/biz/leverbar/LeverageSettingBar;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getMarginTypeClick", "()Lkotlin/jvm/functions/Function0;", "getMarginLeverClick", "getRepayModeClick", "getBorrowAndRepayClick", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C11920a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Function0<Unit> f20431a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Function0<Unit> f20432b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Function0<Unit> f20433c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final Function0<Unit> f20434d;

        public C11920a(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, Function0<Unit> function3) {
            this.f20431a = function0;
            this.f20432b = function1;
            this.f20433c = function2;
            this.f20434d = function3;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Function0<Unit> m21833a() {
            return this.f20434d;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final Function0<Unit> m21834b() {
            return this.f20432b;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Function0<Unit> m21835c() {
            return this.f20431a;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Function0<Unit> m21836d() {
            return this.f20433c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverageSettingBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20429d = new LeverageSettingData(0, null, 0, false, 15, null);
    }

    /* JADX INFO: renamed from: h */
    public final String m21827h(int i11) {
        if (i11 == 1) {
            String string = getContext().getString(R$string.margin_cross_title);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getContext().getString(R$string.margin_isolated_title);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ LeverageSettingBar m21820g(LeverageSettingBar leverageSettingBar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        if ((i11 & 8) != 0) {
            function3 = null;
        }
        return leverageSettingBar.m21826f(function0, function1, function2, function3);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m21821j(LeverageSettingBar leverageSettingBar, View it) {
        Function0<Unit> function0M21833a;
        Intrinsics.checkNotNullParameter(it, "it");
        C11920a c11920a = leverageSettingBar.f20428c;
        if (c11920a != null && (function0M21833a = c11920a.m21833a()) != null) {
            function0M21833a.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m21822k(LeverageSettingBar leverageSettingBar, View it) {
        Function0<Unit> function0M21835c;
        Intrinsics.checkNotNullParameter(it, "it");
        C11920a c11920a = leverageSettingBar.f20428c;
        if (c11920a != null && (function0M21835c = c11920a.m21835c()) != null) {
            function0M21835c.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m21823l(LeverageSettingBar leverageSettingBar, View it) {
        Function0<Unit> function0M21834b;
        Intrinsics.checkNotNullParameter(it, "it");
        C11920a c11920a = leverageSettingBar.f20428c;
        if (c11920a != null && (function0M21834b = c11920a.m21834b()) != null) {
            function0M21834b.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m21824m(LeverageSettingBar leverageSettingBar, View it) {
        Function0<Unit> function0M21836d;
        Intrinsics.checkNotNullParameter(it, "it");
        C11920a c11920a = leverageSettingBar.f20428c;
        if (c11920a != null && (function0M21836d = c11920a.m21836d()) != null) {
            function0M21836d.invoke();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final LeverageSettingBar m21825e(@NotNull LeverageSettingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC43711b interfaceC43711bM21828i = m21828i(data);
        if (interfaceC43711bM21828i != null) {
            removeAllViews();
            addView(interfaceC43711bM21828i.getF96633b());
        } else {
            interfaceC43711bM21828i = null;
        }
        this.f20427b = interfaceC43711bM21828i;
        if (interfaceC43711bM21828i != null) {
            interfaceC43711bM21828i.getF96634c().setText(m21827h(data.getTradeType()));
            m21832q(data.getLeverage());
            if (data.isUnifiedAccount()) {
                C0296a.m1042d(interfaceC43711bM21828i.getF96636e(), false);
                C0296a.m1042d(interfaceC43711bM21828i.getF96637f(), false);
                return this;
            }
            m21830o(data.getRbMode());
            m21831p(getBRText());
            C0296a.m1042d(interfaceC43711bM21828i.getF96636e(), true);
            C0296a.m1042d(interfaceC43711bM21828i.getF96637f(), true);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final LeverageSettingBar m21826f(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3) {
        this.f20428c = new C11920a(function0, function1, function2, function3);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final LeverageSettingData getF20429d() {
        return this.f20429d;
    }

    /* JADX INFO: renamed from: n */
    public final String m21829n(int i11) {
        String string;
        if (i11 == 0) {
            string = getContext().getString(R$string.auto_borrow);
        } else if (i11 != 1) {
            string = (i11 == 2 || i11 != 3) ? getContext().getString(R$string.margin_normal_mode) : getContext().getString(R$string.margin_model_auto_borrow_repay);
        } else {
            string = getContext().getString(R$string.auto_return);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX INFO: renamed from: o */
    public final void m21830o(int i11) {
        TextView f96635d;
        TextView f96636e;
        this.f20429d = LeverageSettingData.copy$default(this.f20429d, 0, null, i11, false, 11, null);
        InterfaceC43711b interfaceC43711b = this.f20427b;
        if (interfaceC43711b != null && (f96636e = interfaceC43711b.getF96636e()) != null) {
            f96636e.setText(m21829n(i11));
        }
        InterfaceC43711b interfaceC43711b2 = this.f20427b;
        if (interfaceC43711b2 == null || (f96635d = interfaceC43711b2.getF96635d()) == null) {
            return;
        }
        C0296a.m1042d(f96635d, i11 != 2);
    }

    /* JADX INFO: renamed from: p */
    public final void m21831p(@NotNull String textStr) {
        Intrinsics.checkNotNullParameter(textStr, "textStr");
        InterfaceC43711b interfaceC43711b = this.f20427b;
        if (interfaceC43711b != null) {
            interfaceC43711b.getF96637f().setText(textStr);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m21832q(@NotNull BigDecimal leverage) {
        BigDecimal bigDecimal;
        TextView f96635d;
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        InterfaceC43711b interfaceC43711b = this.f20427b;
        if (interfaceC43711b == null || (f96635d = interfaceC43711b.getF96635d()) == null) {
            bigDecimal = leverage;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            bigDecimal = leverage;
            stringBuffer.append(C42180b.m92640e(bigDecimal, null, 4, false, false, false, 0, null, 125, null));
            stringBuffer.append("x");
            f96635d.setText(stringBuffer.toString());
        }
        this.f20429d = LeverageSettingData.copy$default(getF20429d(), 0, bigDecimal, 0, false, 13, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverageSettingBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f20429d = new LeverageSettingData(0, null, 0, false, 15, null);
    }

    private final String getBRText() {
        if (MultiLanguageManager.m56980j()) {
            return "借/还";
        }
        return "B/R";
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC43711b m21828i(LeverageSettingData leverageSettingData) {
        boolean zM85527h;
        InterfaceC43711b c43710a;
        InterfaceC43711b interfaceC43711b;
        if (leverageSettingData.isUnifiedAccount()) {
            zM85527h = ISpotCommonService.f49644a.get().mo59968l();
        } else {
            zM85527h = C37878b0.f85252a.m85527h(leverageSettingData.getTradeType());
        }
        if (Intrinsics.areEqual(this.f20430e, Boolean.valueOf(zM85527h)) && (interfaceC43711b = this.f20427b) != null) {
            return interfaceC43711b;
        }
        if (zM85527h) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c43710a = new C43716g(context);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            c43710a = new C43710a(context2);
        }
        C0296a.m1042d(c43710a.getF96634c(), ISpotService.f49646a.get().mo59988E());
        ViewExtKt.m66575f(c43710a.getF96634c(), new Function1() { // from class: qd.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageSettingBar.m21822k(this.f96628b, (View) obj);
            }
        });
        ViewExtKt.m66575f(c43710a.getF96635d(), new Function1() { // from class: qd.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageSettingBar.m21823l(this.f96629b, (View) obj);
            }
        });
        ViewExtKt.m66575f(c43710a.getF96636e(), new Function1() { // from class: qd.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageSettingBar.m21824m(this.f96630b, (View) obj);
            }
        });
        ViewExtKt.m66575f(c43710a.getF96637f(), new Function1() { // from class: qd.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageSettingBar.m21821j(this.f96631b, (View) obj);
            }
        });
        return c43710a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverageSettingBar(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f20429d = new LeverageSettingData(0, null, 0, false, 15, null);
    }
}
