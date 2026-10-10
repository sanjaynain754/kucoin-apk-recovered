package com.kubi.otc.otc.paytype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.entity.PayTypeName;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37602c0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PayTypeWaySelectFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0014J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020)H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u0006H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020)H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR)\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001b\u001a\n \u0011*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeWaySelectFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "configIcons", "", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "adPayTypes", "Ljava/util/ArrayList;", "Lcom/kubi/otc/entity/AdPayType;", "kotlin.jvm.PlatformType", "getAdPayTypes", "()Ljava/util/ArrayList;", "adPayTypes$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "wrapperLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getWrapperLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "wrapperLoadingView$delegate", "adapter", "com/kubi/otc/otc/paytype/PayTypeWaySelectFragment$adapter$2$1", "getAdapter", "()Lcom/kubi/otc/otc/paytype/PayTypeWaySelectFragment$adapter$2$1;", "adapter$delegate", "userPayTypeName", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadPayTypeName", "updateUserPayTypeName", "name", "onClickItem", "item", "getList", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeWaySelectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeWaySelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWaySelectFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n147#2,16:215\n1208#3,2:231\n1236#3,4:233\n1011#3,2:237\n774#3:239\n865#3:240\n1563#3:241\n1634#3,3:242\n866#3:245\n*S KotlinDebug\n*F\n+ 1 PayTypeWaySelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWaySelectFragment\n*L\n52#1:215,16\n123#1:231,2\n123#1:233,4\n204#1:237,2\n206#1:239\n206#1:240\n206#1:241\n206#1:242,3\n206#1:245\n*E\n"})
public final class PayTypeWaySelectFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f37881b0 = {Reflection.property1(new PropertyReference1Impl(PayTypeWaySelectFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @Nullable
    public Map<String, PayTypeEntity> f37882U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37883V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWaySelectFragment.m45118R3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37884W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.t0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWaySelectFragment.m45103B3(this.f38026b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37885X = C45681e.m100799e(this, new Function1<PayTypeWaySelectFragment, C37602c0>() { // from class: com.kubi.otc.otc.paytype.PayTypeWaySelectFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37602c0 invoke(@NotNull PayTypeWaySelectFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37602c0.m84787a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37602c0, Unit>() { // from class: com.kubi.otc.otc.paytype.PayTypeWaySelectFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37602c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37602c0 c37602c0) {
            invoke(c37602c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f37886Y = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.u0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWaySelectFragment.m45123W3(this.f38029b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37887Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.v0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWaySelectFragment.m45104C3(this.f38033b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f37888a0 = "";

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeWaySelectFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PayTypeWaySelectFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWaySelectFragment\n*L\n1#1,328:1\n204#2:329\n*E\n"})
    public static final class C20098a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((AdPayType) t11).getPayTypeCode(), ((AdPayType) t12).getPayTypeCode());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeWaySelectFragment$b */
    /* JADX INFO: compiled from: PayTypeWaySelectFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeWaySelectFragment$loadPayTypeName$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "onNetError", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20099b extends C24223c1 {
        public C20099b() {
            super(PayTypeWaySelectFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            BaseTextView baseTextView;
            BaseTextView baseTextView2;
            super.mo32077c();
            C37602c0 c37602c0M45106F3 = PayTypeWaySelectFragment.this.m45106F3();
            if (c37602c0M45106F3 != null && (baseTextView2 = c37602c0M45106F3.f83738e) != null) {
                baseTextView2.setText(PayTypeWaySelectFragment.this.getStringRes(R$string.payment_paytype_need_kyc, new Object[0]));
            }
            C37602c0 c37602c0M45106F4 = PayTypeWaySelectFragment.this.m45106F3();
            if (c37602c0M45106F4 != null && (baseTextView = c37602c0M45106F4.f83738e) != null) {
                baseTextView.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final PayTypeWaySelectFragment$adapter$2$1 m45104C3(PayTypeWaySelectFragment payTypeWaySelectFragment) {
        return new PayTypeWaySelectFragment$adapter$2$1(payTypeWaySelectFragment, R$layout.botc_item_pay_way_select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public final ArrayList<AdPayType> m45105D3() {
        return (ArrayList) this.f37884W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public final C37602c0 m45106F3() {
        return (C37602c0) this.f37885X.getValue(this, f37881b0[0]);
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m45108H3(PayTypeWaySelectFragment payTypeWaySelectFragment, ArrayList arrayList) {
        KcPrimaryButton kcPrimaryButton;
        if (arrayList == null || arrayList.isEmpty()) {
            payTypeWaySelectFragment.m45110J3().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        } else {
            payTypeWaySelectFragment.m45110J3().showContent();
        }
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C20098a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AdPayType adPayType = (AdPayType) obj;
            ArrayList<AdPayType> arrayListM45105D3 = payTypeWaySelectFragment.m45105D3();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM45105D3, 10));
            Iterator<T> it = arrayListM45105D3.iterator();
            while (it.hasNext()) {
                arrayList3.add(((AdPayType) it.next()).getId());
            }
            if (arrayList3.contains(adPayType.getId())) {
                arrayList2.add(obj);
            }
        }
        payTypeWaySelectFragment.m45105D3().clear();
        payTypeWaySelectFragment.m45105D3().addAll(arrayList2);
        payTypeWaySelectFragment.m45140E3().replaceData(arrayList);
        C37602c0 c37602c0M45106F3 = payTypeWaySelectFragment.m45106F3();
        if (c37602c0M45106F3 == null || (kcPrimaryButton = c37602c0M45106F3.f83735b) == null) {
            return;
        }
        kcPrimaryButton.setVisibility(0);
    }

    /* JADX INFO: renamed from: I3 */
    private final InterfaceC37241c m45109I3() {
        Object value = this.f37883V.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC37241c) value;
    }

    /* JADX INFO: renamed from: J3 */
    private final WrapperLoadingView m45110J3() {
        return (WrapperLoadingView) this.f37886Y.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m45113M3(String str, final PayTypeWaySelectFragment payTypeWaySelectFragment, String str2) {
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, CollectionsKt.listOf((Object[]) new SelectEntity[]{new SelectEntity(null, str, null, null, null, null, null, null, null, false, Intrinsics.areEqual(payTypeWaySelectFragment.f37888a0, str), null, 3069, null), new SelectEntity(null, str2, null, null, null, null, null, null, null, false, Intrinsics.areEqual(payTypeWaySelectFragment.f37888a0, str2), null, 3069, null)}), new BiConsumer() { // from class: com.kubi.otc.otc.paytype.b1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeWaySelectFragment.m45114N3(this.f37969b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = payTypeWaySelectFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "payment_p2p_paymentMethod_name");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m45122V3(PayTypeWaySelectFragment payTypeWaySelectFragment, String str, Object obj) {
        BaseTextView baseTextView;
        payTypeWaySelectFragment.f37888a0 = str;
        C37602c0 c37602c0M45106F3 = payTypeWaySelectFragment.m45106F3();
        if (c37602c0M45106F3 != null && (baseTextView = c37602c0M45106F3.f83738e) != null) {
            baseTextView.setText(str);
        }
        payTypeWaySelectFragment.hideDialogLoading();
        ToastCompat.m66441G(payTypeWaySelectFragment.getStringRes(R$string.payment_paytype_edit_succ, new Object[0]), new Object[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public final PayTypeWaySelectFragment$adapter$2$1 m45140E3() {
        return (PayTypeWaySelectFragment$adapter$2$1) this.f37887Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_received_way;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37602c0 c37602c0M45106F3 = m45106F3();
        if (c37602c0M45106F3 != null && (kcPrimaryButton2 = c37602c0M45106F3.f83735b) != null) {
            kcPrimaryButton2.setText(getString(R$string.confirm));
        }
        C37602c0 c37602c0M45106F4 = m45106F3();
        if (c37602c0M45106F4 != null && (kcPrimaryButton = c37602c0M45106F4.f83735b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayTypeWaySelectFragment.m45116P3(this.f38035b);
                }
            }, 1, null);
        }
        PayTypeWaySelectFragment$adapter$2$1 payTypeWaySelectFragment$adapter$2$1M45140E3 = m45140E3();
        C37602c0 c37602c0M45106F5 = m45106F3();
        payTypeWaySelectFragment$adapter$2$1M45140E3.bindToRecyclerView(c37602c0M45106F5 != null ? c37602c0M45106F5.f83737d : null);
        m45110J3().showLoading();
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.x0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeWaySelectFragment.m45117Q3(this.f38037b, (Boolean) obj, (List) obj2);
            }
        });
        m45111K3();
        m45107G3();
    }

    /* JADX INFO: renamed from: B3 */
    public static final ArrayList m45103B3(PayTypeWaySelectFragment payTypeWaySelectFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = payTypeWaySelectFragment.getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("payTypes")) != null) {
            return parcelableArrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: G3 */
    private final void m45107G3() {
        Disposable disposableSubscribe = m45109I3().m83318H().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWaySelectFragment.m45108H3(this.f38041b, (ArrayList) obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: K3 */
    private final void m45111K3() {
        Disposable disposableSubscribe = m45109I3().m83321K().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWaySelectFragment.m45112L3(this.f38039b, (PayTypeName) obj);
            }
        }, new C20099b());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m45112L3(final PayTypeWaySelectFragment payTypeWaySelectFragment, PayTypeName payTypeName) {
        String stringRes;
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        BaseTextView baseTextView2;
        boolean zM66566d = C27025c.m66566d(payTypeName.getKybPass());
        final String strM66668h = C27041f.m66668h(payTypeName.getUserName());
        final String strM66668h2 = C27041f.m66668h(payTypeName.getCompanyName());
        if (C27025c.m66566d(payTypeName.getKycPass())) {
            stringRes = C27041f.m66668h(payTypeName.getDefaultName());
        } else {
            stringRes = payTypeWaySelectFragment.getStringRes(R$string.payment_paytype_need_kyc, new Object[0]);
        }
        payTypeWaySelectFragment.f37888a0 = stringRes;
        C37602c0 c37602c0M45106F3 = payTypeWaySelectFragment.m45106F3();
        if (c37602c0M45106F3 != null && (baseTextView2 = c37602c0M45106F3.f83738e) != null) {
            baseTextView2.setText(payTypeWaySelectFragment.f37888a0);
        }
        if (zM66566d) {
            C37602c0 c37602c0M45106F4 = payTypeWaySelectFragment.m45106F3();
            if (c37602c0M45106F4 != null && (linearLayout = c37602c0M45106F4.f83736c) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.a1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PayTypeWaySelectFragment.m45113M3(strM66668h, payTypeWaySelectFragment, strM66668h2);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        C37602c0 c37602c0M45106F5 = payTypeWaySelectFragment.m45106F3();
        if (c37602c0M45106F5 != null && (baseTextView = c37602c0M45106F5.f83738e) != null) {
            baseTextView.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m45114N3(PayTypeWaySelectFragment payTypeWaySelectFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        payTypeWaySelectFragment.m45119S3(C27041f.m66668h(interfaceC24339a.getLabel().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public final void m45115O3(AdPayType adPayType) {
        if (m45105D3().contains(adPayType)) {
            m45105D3().remove(adPayType);
        } else {
            m45105D3().add(adPayType);
        }
        m45140E3().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m45116P3(PayTypeWaySelectFragment payTypeWaySelectFragment) {
        FragmentActivity activity = payTypeWaySelectFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putParcelableArrayListExtra("payTypes", payTypeWaySelectFragment.m45105D3()));
        }
        FragmentActivity activity2 = payTypeWaySelectFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m45117Q3(PayTypeWaySelectFragment payTypeWaySelectFragment, Boolean bool, List list) {
        Intrinsics.checkNotNull(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(C27041f.m66668h(((PayTypeEntity) obj).getTypeCode()), obj);
        }
        payTypeWaySelectFragment.f37882U = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final InterfaceC37241c m45118R3() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: S3 */
    private final void m45119S3(final String str) {
        Observable<R> observableCompose = m45109I3().m83331i(str).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.paytype.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWaySelectFragment.m45120T3(this.f38018b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWaySelectFragment.m45121U3(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWaySelectFragment.m45122V3(this.f38022b, str, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m45120T3(PayTypeWaySelectFragment payTypeWaySelectFragment, Disposable disposable) {
        payTypeWaySelectFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m45121U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final WrapperLoadingView m45123W3(PayTypeWaySelectFragment payTypeWaySelectFragment) {
        RecyclerView recyclerView;
        C37602c0 c37602c0M45106F3 = payTypeWaySelectFragment.m45106F3();
        if (c37602c0M45106F3 != null) {
            recyclerView = c37602c0M45106F3.f83737d;
        } else {
            recyclerView = null;
        }
        return WrapperLoadingView.injectView(recyclerView);
    }
}
