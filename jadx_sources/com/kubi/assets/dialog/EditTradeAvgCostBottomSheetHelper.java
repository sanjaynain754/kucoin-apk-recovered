package com.kubi.assets.dialog;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ModifyTradeHoldingCostBody;
import com.kubi.data.DataInitPlugins;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p311hf.C38185c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013JR\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper;", "", "<init>", "()V", "TAG", "", "api", "Lcom/kubi/assets/AssetV2Api;", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", TIMPushProvider.f75062n, "", "host", "Lcom/kubi/sdk/BaseFragment;", FirebaseAnalytics.Param.CURRENCY, "currentCost", "onSuccess", "Lkotlin/Function0;", "bindUi", C33954u6.f72238i, "Lio/chad/library/adapter/base/BaseViewHolder;", "helper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "unit", "precision", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditTradeAvgCostBottomSheetHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,198:1\n1#2:199\n58#3,23:200\n93#3,3:223\n*S KotlinDebug\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper\n*L\n151#1:200,23\n151#1:223,3\n*E\n"})
public final class EditTradeAvgCostBottomSheetHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EditTradeAvgCostBottomSheetHelper f16934a = new EditTradeAvgCostBottomSheetHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f16935b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EditTradeAvgCostBottomSheetHelper.m16010g();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n151#2:98\n71#3:99\n77#4:100\n*E\n"})
    public static final class C9710a implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FinancialInputEditText f16936b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ KcPrimaryButton f16937c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Ref.BooleanRef f16938d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TextView f16939e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Ref.ObjectRef f16940f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f16941g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f16942h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f16943i;

        public C9710a(FinancialInputEditText financialInputEditText, KcPrimaryButton kcPrimaryButton, Ref.BooleanRef booleanRef, TextView textView, Ref.ObjectRef objectRef, Context context, int i11, String str) {
            this.f16936b = financialInputEditText;
            this.f16937c = kcPrimaryButton;
            this.f16938d = booleanRef;
            this.f16939e = textView;
            this.f16940f = objectRef;
            this.f16941g = context;
            this.f16942h = i11;
            this.f16943i = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            EditTradeAvgCostBottomSheetHelper.m16013k(this.f16936b, this.f16937c, this.f16938d, this.f16939e, this.f16940f, this.f16941g, this.f16942h, this.f16943i);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$b */
    /* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$4", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9711b implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f16944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FinancialInputEditText f16945b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f16946c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ KcPrimaryButton f16947d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TextView f16948e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Ref.ObjectRef<BigDecimal> f16949f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f16950g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f16951h;

        public C9711b(Ref.BooleanRef booleanRef, FinancialInputEditText financialInputEditText, Context context, KcPrimaryButton kcPrimaryButton, TextView textView, Ref.ObjectRef<BigDecimal> objectRef, int i11, String str) {
            this.f16944a = booleanRef;
            this.f16945b = financialInputEditText;
            this.f16946c = context;
            this.f16947d = kcPrimaryButton;
            this.f16948e = textView;
            this.f16949f = objectRef;
            this.f16950g = i11;
            this.f16951h = str;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            if (z11) {
                Ref.BooleanRef booleanRef = this.f16944a;
                boolean z12 = i11 == R$id.rbModeAvg;
                booleanRef.element = z12;
                this.f16945b.setHint(this.f16946c.getString(z12 ? R$string.input_price : R$string.kc_tb_grid_input_quota_please));
                EditTradeAvgCostBottomSheetHelper.m16013k(this.f16945b, this.f16947d, this.f16944a, this.f16948e, this.f16949f, this.f16946c, this.f16950g, this.f16951h);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m16013k(FinancialInputEditText financialInputEditText, KcPrimaryButton kcPrimaryButton, Ref.BooleanRef booleanRef, TextView textView, Ref.ObjectRef<BigDecimal> objectRef, Context context, int i11, String str) {
        String rawInput = financialInputEditText.getRawInput();
        BigDecimal bigDecimalM66536f = null;
        if (rawInput != null) {
            if (rawInput.length() <= 0) {
                rawInput = null;
            }
            if (rawInput != null) {
                bigDecimalM66536f = DowngradeExKt.m66536f(rawInput);
            }
        }
        kcPrimaryButton.setEnabled(bigDecimalM66536f != null && bigDecimalM66536f.compareTo(BigDecimal.ZERO) >= 0);
        if (bigDecimalM66536f != null) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalM66536f.compareTo(bigDecimal) >= 0 && !booleanRef.element) {
                BigDecimal bigDecimal2 = objectRef.element;
                if (bigDecimal2 == null || bigDecimal2.compareTo(bigDecimal) <= 0) {
                    Intrinsics.checkNotNull(textView);
                    ViewExtKt.m66594y(textView);
                    textView.setText(context.getString(R$string.kc_cost_price_key) + " ≈ --");
                    return;
                }
                BigDecimal bigDecimalDivide = bigDecimalM66536f.divide(bigDecimal2, i11, RoundingMode.HALF_UP);
                Intrinsics.checkNotNull(textView);
                ViewExtKt.m66594y(textView);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getString(R$string.kc_cost_price_key));
                sb2.append(" ≈ ");
                Intrinsics.checkNotNull(bigDecimalDivide);
                sb2.append(C37886j.m85578b(bigDecimalDivide, str, null, false, false, false, 0, null, 0, 254, null));
                sb2.append(' ');
                sb2.append(str);
                textView.setText(sb2.toString());
                return;
            }
        }
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66577h(textView);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m16014n(BaseFragment baseFragment, String str, String str2, String str3, int i11, Function0 function0, BaseViewHolder holder, DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        f16934a.m16015h(holder, helper, baseFragment, str, str2, str3, i11, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0064  */
    /* JADX INFO: renamed from: h */
    public final void m16015h(BaseViewHolder baseViewHolder, final DialogFragmentHelper dialogFragmentHelper, final BaseFragment baseFragment, final String str, String str2, String str3, int i11, final Function0<Unit> function0) {
        String str4;
        BigDecimal bigDecimalOrNull;
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvCurrentCostValue);
        final FinancialInputEditText financialInputEditText = (FinancialInputEditText) baseViewHolder.getView(R$id.etCostInput);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tvApproxHint);
        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) baseViewHolder.getView(R$id.rgCostMode);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tvUnit);
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) baseViewHolder.getView(R$id.btnModify);
        Context context = textView.getContext();
        textView3.setText(str3);
        if (str2 == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2)) == null) {
            str4 = "--";
        } else {
            str4 = C38185c.m86151c(bigDecimalOrNull, false, 1, null) + ' ' + str3;
            if (str4 == null) {
                str4 = "--";
            }
        }
        textView.setText(str4);
        View view = baseViewHolder.getView(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.dialog.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditTradeAvgCostBottomSheetHelper.m16011i(dialogFragmentHelper);
            }
        }, 1, null);
        financialInputEditText.setHint(context.getString(R$string.input_price));
        financialInputEditText.setMaxDecimalPlaces(i11);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        radioGroupPlus.setOnCheckedChangeListener(new C9711b(booleanRef, financialInputEditText, context, kcPrimaryButton, textView2, objectRef, i11, str3));
        Intrinsics.checkNotNull(financialInputEditText);
        financialInputEditText.addTextChangedListener(new C9710a(financialInputEditText, kcPrimaryButton, booleanRef, textView2, objectRef, context, i11, str3));
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditTradeAvgCostBottomSheetHelper.m16012j(financialInputEditText, booleanRef, str, kcPrimaryButton, baseFragment, function0, dialogFragmentHelper);
            }
        }, 1, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), null, null, new EditTradeAvgCostBottomSheetHelper$bindUi$7(str, objectRef, financialInputEditText, kcPrimaryButton, booleanRef, textView2, context, i11, str3, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final AssetV2Api m16016l() {
        Object value = f16935b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AssetV2Api) value;
    }

    /* JADX INFO: renamed from: m */
    public final void m16017m(@NotNull final BaseFragment host, @NotNull final String currency, @Nullable final String str, @NotNull final Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        final String strM86148c = C38184b.f85884a.m86148c();
        Integer numM23685a = DataInitPlugins.f21489a.m23681b().m23685a(strM86148c);
        final int iIntValue = numM23685a != null ? numM23685a.intValue() : 8;
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.asset_dialog_edit_trade_avg_cost, true).m54237f4(new Function2() { // from class: com.kubi.assets.dialog.q
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EditTradeAvgCostBottomSheetHelper.m16014n(host, currency, str, strM86148c, iIntValue, onSuccess, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = host.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "asset_edit_trade_avg_cost");
    }

    /* JADX INFO: renamed from: g */
    public static final AssetV2Api m16010g() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16011i(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16012j(FinancialInputEditText financialInputEditText, Ref.BooleanRef booleanRef, String str, KcPrimaryButton kcPrimaryButton, BaseFragment baseFragment, Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        BigDecimal bigDecimalM66536f;
        BigDecimal bigDecimal;
        String rawInput = financialInputEditText.getRawInput();
        if (rawInput != null) {
            BigDecimal bigDecimal2 = null;
            if (rawInput.length() <= 0) {
                rawInput = null;
            }
            if (rawInput != null && (bigDecimalM66536f = DowngradeExKt.m66536f(rawInput)) != null) {
                if (bigDecimalM66536f.compareTo(BigDecimal.ZERO) < 0) {
                    bigDecimalM66536f = null;
                }
                if (bigDecimalM66536f != null) {
                    boolean z11 = booleanRef.element;
                    if (z11) {
                        bigDecimal = bigDecimalM66536f;
                    } else {
                        bigDecimal = null;
                    }
                    if (!z11) {
                        bigDecimal2 = bigDecimalM66536f;
                    }
                    ModifyTradeHoldingCostBody modifyTradeHoldingCostBody = new ModifyTradeHoldingCostBody(str, bigDecimal2, bigDecimal);
                    kcPrimaryButton.m55043o();
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), null, null, new EditTradeAvgCostBottomSheetHelper$bindUi$6$1(modifyTradeHoldingCostBody, function0, kcPrimaryButton, dialogFragmentHelper, null), 3, null);
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
