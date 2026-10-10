package com.kubi.quotefacade.alert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bv.C4663e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.view.QuoteUpDownTextView;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.FocusEditTextLinearLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27056j0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37886j;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p402kf.C41014a;
import p429lf.C42180b;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.properties.Delegates;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AlertHeaderView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00103\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u000100H\u0007J\b\u00105\u001a\u00020$H\u0002J\u001c\u00106\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001002\b\b\u0002\u00107\u001a\u00020 H\u0007J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u0017H\u0002J\u000e\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020\rJ\u0006\u0010<\u001a\u00020$J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\rH\u0007J\u0010\u0010?\u001a\u00020$2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020 H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020$\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020$\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.¨\u0006B"}, m90084d2 = {"Lcom/kubi/quotefacade/alert/AlertHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "precision", "", "<set-?>", "", "curAmount", "getCurAmount", "()D", "setCurAmount", "(D)V", "curAmount$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "coinTypePair", "getCoinTypePair", "()Ljava/lang/String;", "setCoinTypePair", "(Ljava/lang/String;)V", "coinTypePair$delegate", "tab", "isAmountEnable", "", "isAmplitudeEnable", "addPriceNotifyListener", "Lkotlin/Function2;", "", "getAddPriceNotifyListener", "()Lkotlin/jvm/functions/Function2;", "setAddPriceNotifyListener", "(Lkotlin/jvm/functions/Function2;)V", "addAmplitudeNotifyListener", "Lkotlin/Function1;", "getAddAmplitudeNotifyListener", "()Lkotlin/jvm/functions/Function1;", "setAddAmplitudeNotifyListener", "(Lkotlin/jvm/functions/Function1;)V", "addNotifySymboleListener", "Lcom/kubi/data/entity/TradeItemBean;", "getAddNotifySymboleListener", "setAddNotifySymboleListener", "initDate", "tradeItem", "initClickEvents", "updateData", "isInitLoad", "refreshPriceAndButton", "input", "changeTab", "indexTab", "clearInputData", "setNotifyNum", "num", "setPrecision", "setEditTitleVisible", ViewProps.VISIBLE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlertHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertHeaderView.kt\ncom/kubi/quotefacade/alert/AlertHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,239:1\n41#2:240\n65#2:241\n80#2,7:242\n*S KotlinDebug\n*F\n+ 1 AlertHeaderView.kt\ncom/kubi/quotefacade/alert/AlertHeaderView\n*L\n51#1:240\n51#1:241\n51#1:242,7\n*E\n"})
public final class AlertHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f41077l = {Reflection.property1(new PropertyReference1Impl(AlertHeaderView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlertHeaderView.class, "curAmount", "getCurAmount()D", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AlertHeaderView.class, "coinTypePair", "getCoinTypePair()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f41078b;

    /* JADX INFO: renamed from: c */
    public int f41079c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ReadWriteProperty f41080d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ReadWriteProperty f41081e;

    /* JADX INFO: renamed from: f */
    public int f41082f;

    /* JADX INFO: renamed from: g */
    public boolean f41083g;

    /* JADX INFO: renamed from: h */
    public boolean f41084h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> f41085i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super String, Unit> f41086j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super TradeItemBean, Unit> f41087k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertHeaderView(@NotNull Context context) {
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41078b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4663e0>() { // from class: com.kubi.quotefacade.alert.AlertHeaderView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4663e0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4663e0.m4638a(C45682f.m100801b(viewGroup));
            }
        });
        this.f41079c = 8;
        Delegates delegates = Delegates.INSTANCE;
        this.f41080d = delegates.notNull();
        this.f41081e = delegates.notNull();
        this.f41082f = 1;
        LayoutInflater.from(context).inflate(R$layout.kucoin_view_alert_header, this);
        C4663e0 binding = getBinding();
        if (binding != null && (clearEditText2 = binding.f4295d) != null) {
            C27046k.m66683F(clearEditText2, C27017c.f54310a.m66516f(R$string.input_price, new Object[0]), 16);
        }
        C4663e0 binding2 = getBinding();
        if (binding2 == null || (clearEditText = binding2.f4296e) == null) {
            return;
        }
        C27046k.m66683F(clearEditText, C27017c.f54310a.m66516f(R$string.amplitude_period, 5), 16);
    }

    private final C4663e0 getBinding() {
        return (C4663e0) this.f41078b.getValue(this, f41077l[0]);
    }

    private final String getCoinTypePair() {
        return (String) this.f41081e.getValue(this, f41077l[2]);
    }

    private final double getCurAmount() {
        return ((Number) this.f41080d.getValue(this, f41077l[1])).doubleValue();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m50295j(AlertHeaderView alertHeaderView, C4663e0 c4663e0) {
        double d11;
        Function1<? super String, Unit> function1;
        int i11 = alertHeaderView.f41082f;
        if (i11 == 1) {
            double dM66647g = 0.0d;
            try {
                d11 = Double.parseDouble(String.valueOf(c4663e0.f4295d.getText()));
            } catch (Exception unused) {
                c4663e0.f4295d.setText("0");
                d11 = 0.0d;
            }
            try {
                dM66647g = C27039d.m66647g(C42180b.m92637b(c4663e0.f4303l.getText().toString(), null, 1, null));
            } catch (Exception unused2) {
                c4663e0.f4303l.setText("0");
            }
            Function2<? super Integer, ? super String, Unit> function2 = alertHeaderView.f41085i;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(d11 > dM66647g ? 0 : 1), String.valueOf(c4663e0.f4295d.getText()));
            }
        } else if (i11 == 2 && (function1 = alertHeaderView.f41086j) != null) {
            function1.invoke(String.valueOf(c4663e0.f4296e.getText()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m50296l(C4663e0 c4663e0, AlertHeaderView alertHeaderView, CharSequence charSequence) {
        if (c4663e0.f4295d != null) {
            if (alertHeaderView.f41082f == 1) {
                Intrinsics.checkNotNull(charSequence);
                alertHeaderView.setEditTitleVisible(charSequence.length() > 0);
                c4663e0.f4294c.setText(C27017c.f54310a.m66516f(R$string.price, new Object[0]));
                alertHeaderView.m50306p(charSequence.toString());
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m50298n(AlertHeaderView alertHeaderView, C4663e0 c4663e0, CharSequence charSequence) {
        if (alertHeaderView.f41082f != 2) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(charSequence);
        boolean z11 = false;
        alertHeaderView.setEditTitleVisible(charSequence.length() > 0);
        c4663e0.f4294c.setText(C27017c.f54310a.m66516f(R$string.amplitude_period, 5));
        float fM66541k = charSequence.length() > 0 ? DowngradeExKt.m66541k(charSequence.toString(), 0.0f, 1, null) : 0.0f;
        if (charSequence.length() > 0 && fM66541k >= 1.0f) {
            z11 = true;
        }
        alertHeaderView.f41084h = z11;
        c4663e0.f4302k.setEnabled(z11);
        if (charSequence.length() > 0 && fM66541k > 100) {
            c4663e0.f4296e.setText(String.valueOf(100));
            ClearEditText clearEditText = c4663e0.f4296e;
            Editable text = clearEditText.getText();
            clearEditText.setSelection(C27039d.m66650j(text != null ? Integer.valueOf(text.length()) : null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m50301s(AlertHeaderView alertHeaderView, TradeItemBean tradeItemBean, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        alertHeaderView.m50307r(tradeItemBean, z11);
    }

    private final void setCoinTypePair(String str) {
        this.f41081e.setValue(this, f41077l[2], str);
    }

    private final void setCurAmount(double d11) {
        this.f41080d.setValue(this, f41077l[1], Double.valueOf(d11));
    }

    private final void setEditTitleVisible(boolean visible) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (visible) {
            C4663e0 binding = getBinding();
            if (binding == null || (baseTextView2 = binding.f4294c) == null) {
                return;
            }
            baseTextView2.setVisibility(0);
            return;
        }
        C4663e0 binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f4294c) == null) {
            return;
        }
        baseTextView.setVisibility(4);
    }

    private final void setPrecision(int precision) {
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        this.f41079c = precision;
        C4663e0 binding = getBinding();
        if (binding != null && (clearEditText2 = binding.f4295d) != null) {
            clearEditText2.setInputType(precision <= 0 ? 2 : 8194);
        }
        C4663e0 binding2 = getBinding();
        if (binding2 == null || (clearEditText = binding2.f4295d) == null) {
            return;
        }
        clearEditText.setFilters(new InputFilter[]{new C27056j0(precision)});
    }

    /* JADX INFO: renamed from: g */
    public final void m50302g(int i11) {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        FocusEditTextLinearLayout focusEditTextLinearLayout;
        FocusEditTextLinearLayout focusEditTextLinearLayout2;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        BaseTextView baseTextView4;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        FocusEditTextLinearLayout focusEditTextLinearLayout3;
        FocusEditTextLinearLayout focusEditTextLinearLayout4;
        ClearEditText clearEditText3;
        this.f41082f = i11;
        if (i11 != 1) {
            C4663e0 binding = getBinding();
            if (binding != null && (clearEditText = binding.f4296e) != null) {
                clearEditText.requestFocus();
            }
            C4663e0 binding2 = getBinding();
            if (binding2 != null && (focusEditTextLinearLayout2 = binding2.f4297f) != null) {
                focusEditTextLinearLayout2.setVisibility(8);
            }
            C4663e0 binding3 = getBinding();
            if (binding3 != null && (focusEditTextLinearLayout = binding3.f4298g) != null) {
                focusEditTextLinearLayout.setVisibility(0);
            }
            C4663e0 binding4 = getBinding();
            if (binding4 != null && (baseTextView3 = binding4.f4300i) != null) {
                baseTextView3.setVisibility(8);
            }
            C4663e0 binding5 = getBinding();
            if (binding5 != null && (baseTextView2 = binding5.f4306o) != null) {
                baseTextView2.setText(C27017c.f54310a.m66516f(R$string.alert_ampltude_range, new Object[0]));
            }
            C4663e0 binding6 = getBinding();
            if (binding6 != null && (kcPrimaryButton = binding6.f4302k) != null) {
                kcPrimaryButton.setEnabled(this.f41084h);
            }
            C4663e0 binding7 = getBinding();
            if (binding7 == null || (baseTextView = binding7.f4294c) == null) {
                return;
            }
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.amplitude_period, 5));
            return;
        }
        C4663e0 binding8 = getBinding();
        if (binding8 != null && (clearEditText3 = binding8.f4295d) != null) {
            clearEditText3.requestFocus();
        }
        C4663e0 binding9 = getBinding();
        if (binding9 != null && (focusEditTextLinearLayout4 = binding9.f4297f) != null) {
            focusEditTextLinearLayout4.setVisibility(0);
        }
        C4663e0 binding10 = getBinding();
        if (binding10 != null && (focusEditTextLinearLayout3 = binding10.f4298g) != null) {
            focusEditTextLinearLayout3.setVisibility(8);
        }
        C4663e0 binding11 = getBinding();
        if (binding11 != null && (baseTextView6 = binding11.f4300i) != null) {
            baseTextView6.setVisibility(0);
        }
        C4663e0 binding12 = getBinding();
        if (binding12 != null && (baseTextView5 = binding12.f4306o) != null) {
            baseTextView5.setText(C27017c.f54310a.m66516f(R$string.alert_price_range, new Object[0]));
        }
        C4663e0 binding13 = getBinding();
        if (binding13 != null && (kcPrimaryButton2 = binding13.f4302k) != null) {
            kcPrimaryButton2.setEnabled(this.f41083g);
        }
        C4663e0 binding14 = getBinding();
        if (binding14 != null && (baseTextView4 = binding14.f4294c) != null) {
            baseTextView4.setText(C27017c.f54310a.m66516f(R$string.price, new Object[0]));
        }
        C4663e0 binding15 = getBinding();
        m50306p(String.valueOf((binding15 == null || (clearEditText2 = binding15.f4295d) == null) ? null : clearEditText2.getText()));
    }

    @Nullable
    public final Function1<String, Unit> getAddAmplitudeNotifyListener() {
        return this.f41086j;
    }

    @Nullable
    public final Function1<TradeItemBean, Unit> getAddNotifySymboleListener() {
        return this.f41087k;
    }

    @Nullable
    public final Function2<Integer, String, Unit> getAddPriceNotifyListener() {
        return this.f41085i;
    }

    /* JADX INFO: renamed from: h */
    public final void m50303h() {
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        if (this.f41082f == 1) {
            C4663e0 binding = getBinding();
            if (binding == null || (clearEditText2 = binding.f4295d) == null) {
                return;
            }
            clearEditText2.setText("");
            return;
        }
        C4663e0 binding2 = getBinding();
        if (binding2 == null || (clearEditText = binding2.f4296e) == null) {
            return;
        }
        clearEditText.setText("");
    }

    /* JADX INFO: renamed from: p */
    public final void m50306p(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alert.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHeaderView.m50300q(this.f41124b, str);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    public final void m50307r(@Nullable TradeItemBean tradeItemBean, boolean z11) {
        SymbolInfoEntity symbolInfoEntity;
        Double changeRate;
        SymbolInfoEntity symbolInfoEntity2;
        C4663e0 binding = getBinding();
        if (binding != null) {
            Integer numValueOf = null;
            setCurAmount(C27039d.m66646f(tradeItemBean != null ? Double.valueOf(tradeItemBean.getLastDealPrice()) : null));
            setCoinTypePair(C27041f.m66668h((tradeItemBean == null || (symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getQuoteCurrency()));
            binding.f4305n.setText(tradeItemBean != null ? tradeItemBean.getShowSymbol() : null);
            binding.f4304m.setText(C42828b.m93906g(C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(getCurAmount(), getCoinTypePair()))), null, null, 0, false, false, true, 31, null), "≈", false, false, 2, null));
            QuoteUpDownTextView quoteUpDownTextView = binding.f4303l;
            String strM92647l = C42180b.m92647l(tradeItemBean != null ? C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null);
            Double dValueOf = tradeItemBean != null ? Double.valueOf(tradeItemBean.getLastDealPrice()) : null;
            Double changeRate2 = tradeItemBean != null ? tradeItemBean.getChangeRate() : null;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            quoteUpDownTextView.m53317e(strM92647l, dValueOf, changeRate2, C22890g.m54279d(context, C27039d.m66646f(tradeItemBean != null ? tradeItemBean.getChangeRate() : null), 0, 2, null));
            binding.f4293b.setText(C42180b.m92649n(C42828b.m93915p(C42828b.m93911l((tradeItemBean == null || (changeRate = tradeItemBean.getChangeRate()) == null) ? null : C42180b.m92642g(new BigDecimal(String.valueOf(changeRate.doubleValue())), null, null, 0, true, false, false, 55, null)))));
            QuoteUpDownTextView quoteUpDownTextView2 = binding.f4293b;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            quoteUpDownTextView2.setTextColor(C22890g.m54279d(context2, C27039d.m66646f(tradeItemBean != null ? tradeItemBean.getChangeRate() : null), 0, 2, null));
            if (tradeItemBean != null && (symbolInfoEntity = tradeItemBean.getSymbolInfoEntity()) != null) {
                numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
            }
            setPrecision(C27039d.m66650j(numValueOf));
            if (z11 || this.f41082f != 1) {
                return;
            }
            m50306p(String.valueOf(binding.f4295d.getText()));
        }
    }

    public final void setAddAmplitudeNotifyListener(@Nullable Function1<? super String, Unit> function1) {
        this.f41086j = function1;
    }

    public final void setAddNotifySymboleListener(@Nullable Function1<? super TradeItemBean, Unit> function1) {
        this.f41087k = function1;
    }

    public final void setAddPriceNotifyListener(@Nullable Function2<? super Integer, ? super String, Unit> function2) {
        this.f41085i = function2;
    }

    /* JADX INFO: renamed from: m */
    public static final void m50297m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final void m50299o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m50300q(AlertHeaderView alertHeaderView, String str) {
        double dDoubleValue;
        boolean z11;
        C4663e0 binding = alertHeaderView.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        BigDecimal bigDecimalM66671k = C27041f.m66671k(str);
        if (bigDecimalM66671k != null) {
            dDoubleValue = bigDecimalM66671k.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        binding.f4300i.setText(C42828b.m93915p(C42828b.m93906g(C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(dDoubleValue, alertHeaderView.getCoinTypePair()))), null, null, 0, false, false, true, 31, null), "≈", false, false, 2, null)));
        if (dDoubleValue > 0.0d && dDoubleValue != alertHeaderView.getCurAmount() && dDoubleValue <= alertHeaderView.getCurAmount() * ((double) 100)) {
            z11 = true;
        } else {
            z11 = false;
        }
        alertHeaderView.f41083g = z11;
        binding.f4302k.setEnabled(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m50304i() {
        final C4663e0 binding = getBinding();
        if (binding != null) {
            KcPrimaryButton tvCreateAlert = binding.f4302k;
            Intrinsics.checkNotNullExpressionValue(tvCreateAlert, "tvCreateAlert");
            C27046k.m66711z(tvCreateAlert, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertHeaderView.m50295j(this.f41098b, binding);
                }
            }, 1, null);
        }
    }

    @SuppressLint({"CheckResult", "SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m50305k(@Nullable TradeItemBean tradeItemBean) {
        final C4663e0 binding = getBinding();
        if (binding != null) {
            m50302g(this.f41082f);
            m50307r(tradeItemBean, true);
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(binding.f4295d);
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.alert.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHeaderView.m50296l(binding, this, (CharSequence) obj);
                }
            };
            abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.z
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AlertHeaderView.m50297m(function1, obj);
                }
            });
            AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(binding.f4296e);
            final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.alert.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHeaderView.m50298n(this.f41092b, binding, (CharSequence) obj);
                }
            };
            abstractC46099aM784d2.subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AlertHeaderView.m50299o(function2, obj);
                }
            });
            binding.f4296e.setFilters(new C27056j0[]{new C27056j0(2)});
            m50304i();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void setNotifyNum(int num) {
        BaseTextView baseTextView;
        C4663e0 binding = getBinding();
        if (binding != null && (baseTextView = binding.f4299h) != null) {
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.all_alert, new Object[0]) + '(' + C27041f.m66668h(String.valueOf(num)) + ')');
        }
    }
}
