package com.kubi.otc.otc.paytype;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.entity.PayTypeName;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.otc.paytype.add.PayTypeAddFragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37602c0;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PayTypeWayFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000*\u0001 \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0014J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0002J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020\u0006H\u0002J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u0010H\u0002J\u001a\u00108\u001a\u00020.2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0006H\u0002J\"\u0010<\u001a\u00020.2\u0018\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0>H\u0002J\b\u0010?\u001a\u00020.H\u0016J\b\u0010@\u001a\u00020.H\u0002J\u0018\u0010A\u001a\u00020.2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010CH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR)\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeWayFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "configIcons", "", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "adPayTypes", "Ljava/util/ArrayList;", "Lcom/kubi/otc/entity/AdPayType;", "kotlin.jvm.PlatformType", "getAdPayTypes", "()Ljava/util/ArrayList;", "adPayTypes$delegate", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "wrapperLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getWrapperLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "wrapperLoadingView$delegate", "adapter", "com/kubi/otc/otc/paytype/PayTypeWayFragment$adapter$2$1", "getAdapter", "()Lcom/kubi/otc/otc/paytype/PayTypeWayFragment$adapter$2$1;", "adapter$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "payTypeName", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadPayTypeName", "updateUserPayTypeName", "name", "onClickItem", "item", "deleteItem", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "ids", "gotoSafeValidation", "block", "Lkotlin/Function2;", "onResume", "getList", "checkIsOnly", "it", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeWayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeWayFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWayFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,357:1\n147#2,16:358\n35#3,4:374\n39#3:380\n44#4,2:378\n1208#5,2:381\n1236#5,4:383\n1011#5,2:389\n774#5:391\n865#5:392\n1563#5:393\n1634#5,3:394\n866#5:397\n44#6,2:387\n*S KotlinDebug\n*F\n+ 1 PayTypeWayFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWayFragment\n*L\n127#1:358,16\n71#1:374,4\n71#1:380\n71#1:378,2\n168#1:381,2\n168#1:383,4\n338#1:389,2\n340#1:391\n340#1:392\n340#1:393\n340#1:394,3\n340#1:397\n312#1:387,2\n*E\n"})
public final class PayTypeWayFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f37870c0 = {Reflection.property1(new PropertyReference1Impl(PayTypeWayFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentReceivedWayBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @Nullable
    public Map<String, PayTypeEntity> f37871U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37872V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWayFragment.m45060k4();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37873W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWayFragment.m45041J3(this.f37976b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f37874X = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(PayTypeWayFragment.m45062l4());
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f37875Y = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWayFragment.m45071q4(this.f37990b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37876Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.paytype.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayTypeWayFragment.m45042K3(this.f37992b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f37877a0 = C45681e.m100799e(this, new Function1<PayTypeWayFragment, C37602c0>() { // from class: com.kubi.otc.otc.paytype.PayTypeWayFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37602c0 invoke(@NotNull PayTypeWayFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37602c0.m84787a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37602c0, Unit>() { // from class: com.kubi.otc.otc.paytype.PayTypeWayFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37602c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37602c0 c37602c0) {
            invoke(c37602c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f37878b0 = "";

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeWayFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PayTypeWayFragment.kt\ncom/kubi/otc/otc/paytype/PayTypeWayFragment\n*L\n1#1,328:1\n338#2:329\n*E\n"})
    public static final class C20095a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((AdPayType) t11).getPayTypeCode(), ((AdPayType) t12).getPayTypeCode());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeWayFragment$b */
    /* JADX INFO: compiled from: PayTypeWayFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/otc/otc/paytype/PayTypeWayFragment$loadPayTypeName$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "onNetError", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20096b extends C24223c1 {
        public C20096b() {
            super(PayTypeWayFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            BaseTextView baseTextView;
            BaseTextView baseTextView2;
            super.mo32077c();
            C37602c0 c37602c0M45085S3 = PayTypeWayFragment.this.m45085S3();
            if (c37602c0M45085S3 != null && (baseTextView2 = c37602c0M45085S3.f83738e) != null) {
                baseTextView2.setText(PayTypeWayFragment.this.getStringRes(R$string.payment_paytype_need_kyc, new Object[0]));
            }
            C37602c0 c37602c0M45085S4 = PayTypeWayFragment.this.m45085S3();
            if (c37602c0M45085S4 != null && (baseTextView = c37602c0M45085S4.f83738e) != null) {
                baseTextView.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.PayTypeWayFragment$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20097c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: K3 */
    public static final PayTypeWayFragment$adapter$2$1 m45042K3(PayTypeWayFragment payTypeWayFragment) {
        return new PayTypeWayFragment$adapter$2$1(payTypeWayFragment, R$layout.botc_item_pay_way);
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m45043N3(final PayTypeWayFragment payTypeWayFragment, final String str, final BaseViewHolder baseViewHolder, DialogInterface dialogInterface, int i11) throws JSONException {
        payTypeWayFragment.m45087Y3(new Function2() { // from class: com.kubi.otc.otc.paytype.j0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PayTypeWayFragment.m45044O3(this.f37998b, str, baseViewHolder, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m45044O3(final PayTypeWayFragment payTypeWayFragment, String str, final BaseViewHolder baseViewHolder, String url, String validationToken) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        payTypeWayFragment.showDialogLoading();
        Disposable disposableSubscribe = payTypeWayFragment.m45047V3().m83315E(url, str, validationToken).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45045P3(this.f38027b, baseViewHolder, obj);
            }
        }, new C24223c1(payTypeWayFragment));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = payTypeWayFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m45046U3(PayTypeWayFragment payTypeWayFragment, ArrayList arrayList) {
        KcPrimaryButton kcPrimaryButton;
        if (arrayList == null || arrayList.isEmpty()) {
            payTypeWayFragment.m45049X3().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        } else {
            payTypeWayFragment.m45081L3(arrayList);
            payTypeWayFragment.m45049X3().showContent();
        }
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C20095a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AdPayType adPayType = (AdPayType) obj;
            ArrayList<AdPayType> arrayListM45083Q3 = payTypeWayFragment.m45083Q3();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM45083Q3, 10));
            Iterator<T> it = arrayListM45083Q3.iterator();
            while (it.hasNext()) {
                arrayList3.add(((AdPayType) it.next()).getId());
            }
            if (arrayList3.contains(adPayType.getId())) {
                arrayList2.add(obj);
            }
        }
        payTypeWayFragment.m45083Q3().clear();
        payTypeWayFragment.m45083Q3().addAll(arrayList2);
        payTypeWayFragment.m45084R3().replaceData(arrayList);
        C37602c0 c37602c0M45085S3 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S3 == null || (kcPrimaryButton = c37602c0M45085S3.f83735b) == null) {
            return;
        }
        kcPrimaryButton.setVisibility(arrayList.size() < 10 ? 0 : 8);
    }

    /* JADX INFO: renamed from: V3 */
    private final InterfaceC37241c m45047V3() {
        Object value = this.f37872V.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC37241c) value;
    }

    /* JADX INFO: renamed from: W3 */
    private final boolean m45048W3() {
        return ((Boolean) this.f37874X.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: X3 */
    private final WrapperLoadingView m45049X3() {
        return (WrapperLoadingView) this.f37875Y.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m45050Z3(Function2 function2, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            function2.invoke("v3/otc/pay-type/delete", str2);
        } else if (i11 == 78858) {
            function2.invoke("v1/otc/pay-type/delete", "");
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map), "payment_p2p_delete", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m45052c4(String str, final PayTypeWayFragment payTypeWayFragment, String str2) {
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, CollectionsKt.listOf((Object[]) new SelectEntity[]{new SelectEntity(null, str, null, null, null, null, null, null, null, false, Intrinsics.areEqual(payTypeWayFragment.f37878b0, str), null, 3069, null), new SelectEntity(null, str2, null, null, null, null, null, null, null, false, Intrinsics.areEqual(payTypeWayFragment.f37878b0, str2), null, 3069, null)}), new BiConsumer() { // from class: com.kubi.otc.otc.paytype.x
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeWayFragment.m45053d4(this.f38036b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, payTypeWayFragment.getString(R$string.payment_paytype_verify_name), false, 12, null);
        FragmentManager childFragmentManager = payTypeWayFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "payment_p2p_paymentMethod_name");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final boolean m45062l4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20097c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_payment_delete", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m45069p4(PayTypeWayFragment payTypeWayFragment, String str, Object obj) {
        BaseTextView baseTextView;
        payTypeWayFragment.f37878b0 = str;
        C37602c0 c37602c0M45085S3 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S3 != null && (baseTextView = c37602c0M45085S3.f83738e) != null) {
            baseTextView.setText(str);
        }
        payTypeWayFragment.hideDialogLoading();
        ToastCompat.m66441G(payTypeWayFragment.getStringRes(R$string.payment_paytype_edit_succ, new Object[0]), new Object[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m45081L3(List<AdPayType> list) {
        if (list == null || list.size() != 1 || C27025c.m66566d(list.get(0).isDefault())) {
            return;
        }
        m45089e4(list.get(0));
    }

    /* JADX INFO: renamed from: M3 */
    public final void m45082M3(final BaseViewHolder baseViewHolder, final String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(getString(R$string.confirm_delete)).m54156M4(getString(R$string.delete_receive_way)).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.otc.paytype.i0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) throws JSONException {
                PayTypeWayFragment.m45043N3(this.f37994b, str, baseViewHolder, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: Q3 */
    public final ArrayList<AdPayType> m45083Q3() {
        return (ArrayList) this.f37873W.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final PayTypeWayFragment$adapter$2$1 m45084R3() {
        return (PayTypeWayFragment$adapter$2$1) this.f37876Z.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final C37602c0 m45085S3() {
        return (C37602c0) this.f37877a0.getValue(this, f37870c0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_received_way;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        TextView tvNavigationTitle;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null && (tvNavigationTitle = navigationBar.getTvNavigationTitle()) != null) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(tvNavigationTitle, 12, 18, 2, 2);
        }
        C37602c0 c37602c0M45085S3 = m45085S3();
        if (c37602c0M45085S3 != null && (kcPrimaryButton2 = c37602c0M45085S3.f83735b) != null) {
            kcPrimaryButton2.setText(getString(R$string.add_received_way));
        }
        C37602c0 c37602c0M45085S4 = m45085S3();
        if (c37602c0M45085S4 != null && (kcPrimaryButton = c37602c0M45085S4.f83735b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayTypeWayFragment.m45057i4(this.f38016b);
                }
            }, 1, null);
        }
        PayTypeWayFragment$adapter$2$1 payTypeWayFragment$adapter$2$1M45084R3 = m45084R3();
        C37602c0 c37602c0M45085S5 = m45085S3();
        payTypeWayFragment$adapter$2$1M45084R3.bindToRecyclerView(c37602c0M45085S5 != null ? c37602c0M45085S5.f83737d : null);
        m45049X3().showLoading();
        m45088a4();
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.paytype.a0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                PayTypeWayFragment.m45058j4(this.f37896b, (Boolean) obj, (List) obj2);
            }
        });
    }

    public PayTypeWayFragment() {
        setPageId("B7P2PPaymentlist");
    }

    /* JADX INFO: renamed from: J3 */
    public static final ArrayList m45041J3(PayTypeWayFragment payTypeWayFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = payTypeWayFragment.getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("payTypes")) != null) {
            return parcelableArrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m45045P3(PayTypeWayFragment payTypeWayFragment, BaseViewHolder baseViewHolder, Object obj) {
        KcPrimaryButton kcPrimaryButton;
        int i11;
        payTypeWayFragment.hideDialogLoading();
        payTypeWayFragment.showToast(payTypeWayFragment.getString(R$string.delete_success));
        if (baseViewHolder == null) {
            payTypeWayFragment.m45086T3();
        } else {
            payTypeWayFragment.m45084R3().getData().remove(baseViewHolder.getAdapterPosition());
            payTypeWayFragment.m45084R3().notifyDataSetChanged();
            payTypeWayFragment.m45081L3(payTypeWayFragment.m45084R3().getData());
        }
        if (payTypeWayFragment.m45084R3().getData().isEmpty()) {
            payTypeWayFragment.m45049X3().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        } else {
            payTypeWayFragment.m45049X3().showContent();
        }
        C37602c0 c37602c0M45085S3 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S3 != null && (kcPrimaryButton = c37602c0M45085S3.f83735b) != null) {
            if (payTypeWayFragment.m45084R3().getData().size() < 10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kcPrimaryButton.setVisibility(i11);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m45051b4(final PayTypeWayFragment payTypeWayFragment, PayTypeName payTypeName) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        boolean zM66566d = C27025c.m66566d(payTypeName.getKybPass());
        final String strM66668h = C27041f.m66668h(payTypeName.getUserName());
        final String strM66668h2 = C27041f.m66668h(payTypeName.getCompanyName());
        if (C27025c.m66566d(payTypeName.getKycPass())) {
            C37602c0 c37602c0M45085S3 = payTypeWayFragment.m45085S3();
            if (c37602c0M45085S3 != null && (baseTextView6 = c37602c0M45085S3.f83739f) != null) {
                ViewExtKt.m66594y(baseTextView6);
            }
            payTypeWayFragment.f37878b0 = C27041f.m66668h(payTypeName.getDefaultName());
            C37602c0 c37602c0M45085S4 = payTypeWayFragment.m45085S3();
            if (c37602c0M45085S4 != null && (baseTextView5 = c37602c0M45085S4.f83738e) != null) {
                baseTextView5.setTextColor(ContextCompat.getColor(payTypeWayFragment.mContext, R$color.c_text));
            }
        } else {
            C37602c0 c37602c0M45085S5 = payTypeWayFragment.m45085S3();
            if (c37602c0M45085S5 != null && (baseTextView2 = c37602c0M45085S5.f83739f) != null) {
                ViewExtKt.m66577h(baseTextView2);
            }
            payTypeWayFragment.f37878b0 = payTypeWayFragment.getStringRes(R$string.payment_paytype_need_kyc, new Object[0]);
            C37602c0 c37602c0M45085S6 = payTypeWayFragment.m45085S3();
            if (c37602c0M45085S6 != null && (baseTextView = c37602c0M45085S6.f83738e) != null) {
                baseTextView.setTextColor(ContextCompat.getColor(payTypeWayFragment.mContext, R$color.c_text40));
            }
        }
        C37602c0 c37602c0M45085S7 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S7 != null && (baseTextView4 = c37602c0M45085S7.f83738e) != null) {
            baseTextView4.setText(payTypeWayFragment.f37878b0);
        }
        if (zM66566d) {
            C37602c0 c37602c0M45085S8 = payTypeWayFragment.m45085S3();
            if (c37602c0M45085S8 != null && (linearLayout = c37602c0M45085S8.f83736c) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.paytype.v
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PayTypeWayFragment.m45052c4(strM66668h, payTypeWayFragment, strM66668h2);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        C37602c0 c37602c0M45085S9 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S9 != null && (baseTextView3 = c37602c0M45085S9.f83738e) != null) {
            baseTextView3.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m45053d4(PayTypeWayFragment payTypeWayFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        payTypeWayFragment.m45090m4(C27041f.m66668h(interfaceC24339a.getLabel().toString()));
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m45054f4(PayTypeWayFragment payTypeWayFragment, Disposable disposable) {
        payTypeWayFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m45055g4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m45056h4(PayTypeWayFragment payTypeWayFragment, AdPayType adPayType, Object obj) {
        payTypeWayFragment.hideDialogLoading();
        adPayType.setDefault(Boolean.valueOf(!C27025c.m66566d(adPayType.isDefault())));
        payTypeWayFragment.m45084R3().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m45057i4(PayTypeWayFragment payTypeWayFragment) {
        BaseFragmentActivity.m56574n0(payTypeWayFragment.getContext(), payTypeWayFragment.getString(R$string.add_received_way), PayTypeAddFragment.class.getName(), new C27051h().m66724h("data_1", payTypeWayFragment.f37878b0).m66717a());
        C43852m.m96591c("B7P2PPaymentlist", "paymethodAbutton", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m45058j4(PayTypeWayFragment payTypeWayFragment, Boolean bool, List list) {
        Intrinsics.checkNotNull(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(C27041f.m66668h(((PayTypeEntity) obj).getTypeCode()), obj);
        }
        payTypeWayFragment.f37871U = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public static final InterfaceC37241c m45060k4() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m45065n4(PayTypeWayFragment payTypeWayFragment, Disposable disposable) {
        payTypeWayFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m45067o4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    public static final WrapperLoadingView m45071q4(PayTypeWayFragment payTypeWayFragment) {
        RecyclerView recyclerView;
        C37602c0 c37602c0M45085S3 = payTypeWayFragment.m45085S3();
        if (c37602c0M45085S3 != null) {
            recyclerView = c37602c0M45085S3.f83737d;
        } else {
            recyclerView = null;
        }
        return WrapperLoadingView.injectView(recyclerView);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m45086T3() {
        Disposable disposableSubscribe = m45047V3().m83318H().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45046U3(this.f37972b, (ArrayList) obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m45087Y3(final Function2<? super String, ? super String, Unit> function2) throws JSONException {
        if (!m45048W3()) {
            function2.invoke("v1/otc/pay-type/delete", "");
            return;
        }
        ISafeService iSafeService = ISafeService.f46324a.get();
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operationType", "delete");
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, mContext, viewLifecycleOwner, "RV_P2P_CHANNEL_EDIT", string, 0, true, new Function7() { // from class: com.kubi.otc.otc.paytype.w
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return PayTypeWayFragment.m45050Z3(function2, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, null);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m45088a4() {
        Disposable disposableSubscribe = m45047V3().m83321K().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45051b4(this.f38017b, (PayTypeName) obj);
            }
        }, new C20096b());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m45089e4(final AdPayType adPayType) {
        Observable<R> observableCompose = m45047V3().m83327e(C27041f.m66668h(adPayType.getId()), !C27025c.m66566d(adPayType.isDefault())).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.paytype.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWayFragment.m45054f4(this.f38019b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45055g4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45056h4(this.f38024b, adPayType, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m45090m4(final String str) {
        Observable<R> observableCompose = m45047V3().m83331i(str).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.paytype.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayTypeWayFragment.m45065n4(this.f38038b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45067o4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayTypeWayFragment.m45069p4(this.f37967b, str, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m45086T3();
    }
}
