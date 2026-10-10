package com.kubi.assets.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.Phrases;
import com.kubi.assets.entity.WithdrawConfirmEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44890w4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawConfirmDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\fH\u0002J\u0016\u0010'\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\b\u0010,\u001a\u00020\fH\u0002J\b\u0010-\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\u0012H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentWithdrawConfirmDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawConfirmDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onConfirmCallback", "Lkotlin/Function0;", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function0;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function0;)V", "isFrom", "", "()Ljava/lang/Boolean;", "isFrom$delegate", "Lkotlin/Lazy;", "data", "Lcom/kubi/assets/entity/WithdrawConfirmEntity;", "getData", "()Lcom/kubi/assets/entity/WithdrawConfirmEntity;", "data$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "showTip", "noIcon", "showList", "", "Lcom/kubi/assets/entity/Phrases;", "filterShowList", "handleNotFromUI", "handleFromUI", "initListener", "isBottomSheet", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawConfirmDialog.kt\ncom/kubi/assets/dialog/WithdrawConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,157:1\n143#2,20:158\n1617#3,9:178\n1869#3:187\n1870#3:189\n1626#3:190\n1878#3,3:194\n774#3:197\n865#3,2:198\n1#4:188\n51#5,3:191\n*S KotlinDebug\n*F\n+ 1 WithdrawConfirmDialog.kt\ncom/kubi/assets/dialog/WithdrawConfirmDialog\n*L\n31#1:158,20\n89#1:178,9\n89#1:187\n89#1:189\n89#1:190\n105#1:194,3\n124#1:197\n124#1:198,2\n89#1:188\n96#1:191,3\n*E\n"})
public final class WithdrawConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f16972r0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f16970v0 = {Reflection.property1(new PropertyReference1Impl(WithdrawConfirmDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawConfirmDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f16969u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16971q0 = C45681e.m100799e(this, new Function1<WithdrawConfirmDialog, C44890w4>() { // from class: com.kubi.assets.dialog.WithdrawConfirmDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44890w4 invoke(@NotNull WithdrawConfirmDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44890w4.m99304a(fragment.requireView());
        }
    }, new Function1<C44890w4, Unit>() { // from class: com.kubi.assets.dialog.WithdrawConfirmDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44890w4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44890w4 c44890w4) {
            invoke(c44890w4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16973s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawConfirmDialog.m16093y4(this.f17140b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16974t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawConfirmDialog.m16087n4(this.f17143b);
        }
    });

    /* JADX INFO: compiled from: WithdrawConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawConfirmDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: x4 */
    private final Boolean m16092x4() {
        return (Boolean) this.f16973s0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m16094A4(@Nullable Function0<Unit> function0) {
        this.f16972r0 = function0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kucoin_fragment_withdraw_confirm_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16091w4();
        m16088t4();
    }

    /* JADX INFO: renamed from: p4 */
    public final C44890w4 m16097p4() {
        return (C44890w4) this.f16971q0.getValue(this, f16970v0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final WithdrawConfirmEntity m16098q4() {
        return (WithdrawConfirmEntity) this.f16974t0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public static final WithdrawConfirmEntity m16087n4(WithdrawConfirmDialog withdrawConfirmDialog) {
        Bundle arguments = withdrawConfirmDialog.getArguments();
        if (arguments != null) {
            return (WithdrawConfirmEntity) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: t4 */
    private final void m16088t4() {
        KcPrimaryButton kcPrimaryButton;
        ImageView imageView;
        C44890w4 c44890w4M16097p4 = m16097p4();
        if (c44890w4M16097p4 != null && (imageView = c44890w4M16097p4.f101062b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.dialog.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawConfirmDialog.m16089u4(this.f17145b);
                }
            }, 1, null);
        }
        C44890w4 c44890w4M16097p5 = m16097p4();
        if (c44890w4M16097p5 != null && (kcPrimaryButton = c44890w4M16097p5.f101077q) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawConfirmDialog.m16090v4(this.f17198b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m16089u4(WithdrawConfirmDialog withdrawConfirmDialog) {
        withdrawConfirmDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m16090v4(WithdrawConfirmDialog withdrawConfirmDialog) {
        withdrawConfirmDialog.dismiss();
        Function0<Unit> function0 = withdrawConfirmDialog.f16972r0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    private final void m16091w4() {
        String remark;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        String strJoinToString$default;
        String account;
        List<String> listSplit$default;
        String string;
        BaseTextView baseTextView4;
        int i11;
        BaseTextView baseTextView5;
        String fee;
        String currency;
        BaseTextView baseTextView6;
        String amount;
        String currency2;
        BaseTextView baseTextView7;
        String address;
        BaseTextView baseTextView8;
        String currency3;
        BaseTextView baseTextView9;
        String receivedAmount;
        C44890w4 c44890w4M16097p4 = m16097p4();
        String remark2 = null;
        if (c44890w4M16097p4 != null && (baseTextView9 = c44890w4M16097p4.f101072l) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q4 = m16098q4();
            if (withdrawConfirmEntityM16098q4 != null) {
                receivedAmount = withdrawConfirmEntityM16098q4.getReceivedAmount();
            } else {
                receivedAmount = null;
            }
            baseTextView9.setText(receivedAmount);
        }
        C44890w4 c44890w4M16097p5 = m16097p4();
        if (c44890w4M16097p5 != null && (baseTextView8 = c44890w4M16097p5.f101084x) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q5 = m16098q4();
            if (withdrawConfirmEntityM16098q5 != null) {
                currency3 = withdrawConfirmEntityM16098q5.getCurrency();
            } else {
                currency3 = null;
            }
            baseTextView8.setText(currency3);
        }
        C44890w4 c44890w4M16097p6 = m16097p4();
        if (c44890w4M16097p6 != null && (baseTextView7 = c44890w4M16097p6.f101070j) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q6 = m16098q4();
            if (withdrawConfirmEntityM16098q6 != null) {
                address = withdrawConfirmEntityM16098q6.getAddress();
            } else {
                address = null;
            }
            baseTextView7.setText(address);
        }
        C44890w4 c44890w4M16097p7 = m16097p4();
        if (c44890w4M16097p7 != null && (baseTextView6 = c44890w4M16097p7.f101085y) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q7 = m16098q4();
            if (withdrawConfirmEntityM16098q7 != null) {
                amount = withdrawConfirmEntityM16098q7.getAmount();
            } else {
                amount = null;
            }
            WithdrawConfirmEntity withdrawConfirmEntityM16098q8 = m16098q4();
            if (withdrawConfirmEntityM16098q8 != null) {
                currency2 = withdrawConfirmEntityM16098q8.getCurrency();
            } else {
                currency2 = null;
            }
            baseTextView6.setText(C42828b.m93906g(amount, C27041f.m66668h(currency2), true, false, 4, null));
        }
        C44890w4 c44890w4M16097p8 = m16097p4();
        if (c44890w4M16097p8 != null && (baseTextView5 = c44890w4M16097p8.f101078r) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q9 = m16098q4();
            if (withdrawConfirmEntityM16098q9 != null) {
                fee = withdrawConfirmEntityM16098q9.getFee();
            } else {
                fee = null;
            }
            String strM66669i = C27041f.m66669i(fee, "0");
            WithdrawConfirmEntity withdrawConfirmEntityM16098q10 = m16098q4();
            if (withdrawConfirmEntityM16098q10 != null) {
                currency = withdrawConfirmEntityM16098q10.getCurrency();
            } else {
                currency = null;
            }
            baseTextView5.setText(C42828b.m93906g(strM66669i, C27041f.m66668h(currency), true, false, 4, null));
        }
        C44890w4 c44890w4M16097p9 = m16097p4();
        if (c44890w4M16097p9 != null && (baseTextView4 = c44890w4M16097p9.f101079s) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q11 = m16098q4();
            if (withdrawConfirmEntityM16098q11 != null && withdrawConfirmEntityM16098q11.getHasTax()) {
                i11 = R$string.asset_withdraw_tax_tip3;
            } else {
                i11 = R$string.fee;
            }
            baseTextView4.setText(getString(i11));
        }
        if (Intrinsics.areEqual(m16092x4(), Boolean.TRUE)) {
            m16099r4();
        } else {
            m16100s4();
        }
        C44890w4 c44890w4M16097p10 = m16097p4();
        if (c44890w4M16097p10 != null && (baseTextView3 = c44890w4M16097p10.f101069i) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q12 = m16098q4();
            if (withdrawConfirmEntityM16098q12 != null && (account = withdrawConfirmEntityM16098q12.getAccount()) != null && (listSplit$default = StringsKt.split$default((CharSequence) account, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : listSplit$default) {
                    if (Intrinsics.areEqual(str, "MAIN")) {
                        string = getString(R$string.save_account);
                    } else if (Intrinsics.areEqual(str, "TRADE")) {
                        string = getString(R$string.trade_account);
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                strJoinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
            } else {
                strJoinToString$default = null;
            }
            baseTextView3.setText(strJoinToString$default);
        }
        WithdrawConfirmEntity withdrawConfirmEntityM16098q13 = m16098q4();
        if (withdrawConfirmEntityM16098q13 != null && (remark = withdrawConfirmEntityM16098q13.getRemark()) != null && !TextUtils.isEmpty(remark)) {
            C44890w4 c44890w4M16097p11 = m16097p4();
            if (c44890w4M16097p11 != null && (baseTextView2 = c44890w4M16097p11.f101071k) != null) {
                WithdrawConfirmEntity withdrawConfirmEntityM16098q14 = m16098q4();
                if (withdrawConfirmEntityM16098q14 != null) {
                    remark2 = withdrawConfirmEntityM16098q14.getRemark();
                }
                baseTextView2.setText(remark2);
            }
            C44890w4 c44890w4M16097p12 = m16097p4();
            if (c44890w4M16097p12 != null && (baseTextView = c44890w4M16097p12.f101071k) != null) {
                ViewExtKt.m66594y(baseTextView);
            }
        }
        m16095B4();
    }

    /* JADX INFO: renamed from: y4 */
    public static final Boolean m16093y4(WithdrawConfirmDialog withdrawConfirmDialog) {
        Bundle arguments = withdrawConfirmDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("isFrom", true));
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m16095B4() {
        AlignTopTextView alignTopTextView;
        AlignTopTextView alignTopTextView2;
        C44890w4 c44890w4M16097p4;
        AlignTopTextView alignTopTextView3;
        List<Phrases> listM16096o4 = m16096o4();
        int i11 = 0;
        for (Object obj : CollectionsKt.take(listM16096o4, 3)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Phrases phrases = (Phrases) obj;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 && (c44890w4M16097p4 = m16097p4()) != null && (alignTopTextView3 = c44890w4M16097p4.f101076p) != null) {
                        AssetExKt.m15133u(alignTopTextView3, phrases.getPhrase());
                    }
                } else {
                    C44890w4 c44890w4M16097p5 = m16097p4();
                    if (c44890w4M16097p5 != null && (alignTopTextView2 = c44890w4M16097p5.f101075o) != null) {
                        AssetExKt.m15133u(alignTopTextView2, phrases.getPhrase());
                    }
                }
            } else {
                C44890w4 c44890w4M16097p6 = m16097p4();
                if (c44890w4M16097p6 != null && (alignTopTextView = c44890w4M16097p6.f101074n) != null) {
                    AssetExKt.m15133u(alignTopTextView, phrases.getPhrase());
                }
                m16101z4(listM16096o4);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final List<Phrases> m16096o4() {
        List<Phrases> listEmptyList;
        WithdrawConfirmEntity withdrawConfirmEntityM16098q4 = m16098q4();
        if (withdrawConfirmEntityM16098q4 != null) {
            listEmptyList = withdrawConfirmEntityM16098q4.getPhrases();
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            Phrases phrases = (Phrases) obj;
            if (!Intrinsics.areEqual(phrases.getType(), "MEMO") || !TextUtils.isEmpty(phrases.getPhrase())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* JADX INFO: renamed from: r4 */
    public final void m16099r4() {
        String memo;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String memo2;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView3;
        String chainName;
        C44890w4 c44890w4M16097p4 = m16097p4();
        String memoName = null;
        if (c44890w4M16097p4 != null && (baseTextView3 = c44890w4M16097p4.f101082v) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q4 = m16098q4();
            if (withdrawConfirmEntityM16098q4 != null) {
                chainName = withdrawConfirmEntityM16098q4.getChainName();
            } else {
                chainName = null;
            }
            baseTextView3.setText(chainName);
        }
        WithdrawConfirmEntity withdrawConfirmEntityM16098q5 = m16098q4();
        if (withdrawConfirmEntityM16098q5 != null) {
            memo = withdrawConfirmEntityM16098q5.getMemo();
        } else {
            memo = null;
        }
        if (TextUtils.isEmpty(memo)) {
            C44890w4 c44890w4M16097p5 = m16097p4();
            if (c44890w4M16097p5 != null && (relativeLayout = c44890w4M16097p5.f101065e) != null) {
                ViewExtKt.m66577h(relativeLayout);
                return;
            }
            return;
        }
        C44890w4 c44890w4M16097p6 = m16097p4();
        if (c44890w4M16097p6 != null && (baseTextView2 = c44890w4M16097p6.f101080t) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q6 = m16098q4();
            if (withdrawConfirmEntityM16098q6 != null) {
                memo2 = withdrawConfirmEntityM16098q6.getMemo();
            } else {
                memo2 = null;
            }
            baseTextView2.setText(memo2);
        }
        C44890w4 c44890w4M16097p7 = m16097p4();
        if (c44890w4M16097p7 != null && (baseTextView = c44890w4M16097p7.f101081u) != null) {
            WithdrawConfirmEntity withdrawConfirmEntityM16098q7 = m16098q4();
            if (withdrawConfirmEntityM16098q7 != null) {
                memoName = withdrawConfirmEntityM16098q7.getMemoName();
            }
            baseTextView.setText(memoName);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m16100s4() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        C44890w4 c44890w4M16097p4 = m16097p4();
        if (c44890w4M16097p4 != null && (relativeLayout2 = c44890w4M16097p4.f101066f) != null) {
            ViewExtKt.m66577h(relativeLayout2);
        }
        C44890w4 c44890w4M16097p5 = m16097p4();
        if (c44890w4M16097p5 != null && (relativeLayout = c44890w4M16097p5.f101065e) != null) {
            ViewExtKt.m66577h(relativeLayout);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m16101z4(List<Phrases> list) {
        C44890w4 c44890w4M16097p4;
        AlignTopTextView alignTopTextView;
        if (list.size() == 1 && (c44890w4M16097p4 = m16097p4()) != null && (alignTopTextView = c44890w4M16097p4.f101074n) != null) {
            C27046k.m66694i(alignTopTextView, 0, 0, GravityCompat.START, 2, null);
        }
    }
}
