package com.kubi.assets.bill;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44785i0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010 \u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bJ&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\rH\u0002J\b\u0010-\u001a\u00020\rH\u0002J\b\u0010.\u001a\u00020\rH\u0002J\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020302¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFilterSearchCoinDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFilterSearchCoinDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "callBack", "Lkotlin/Function1;", "", "", "repository", "Lcom/kubi/assets/bill/AccountBillRepository;", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "accountType", "getAccountType", "accountType$delegate", "coinListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "selectCurrencyFLow", "filterFlow", "isBottomSheet", "", "setCallBack", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "filterText", "initObservers", "loadSearchCoinData", "filterData", "coinListCache", "adapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "getAdapter", "()Lio/chad/library/adapter/base/BaseQuickAdapter;", "Companion", "SearchCoinItemInfo", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillSearchCoinDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n143#2,20:284\n65#3,16:304\n93#3,3:320\n774#4:323\n865#4,2:324\n774#4:326\n865#4,2:327\n774#4:329\n865#4,2:330\n774#4:332\n865#4,2:333\n774#4:335\n865#4,2:336\n*S KotlinDebug\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog\n*L\n75#1:284,20\n107#1:304,16\n107#1:320,3\n197#1:323\n197#1:324,2\n202#1:326\n202#1:327,2\n207#1:329\n207#1:330,2\n212#1:332\n212#1:333,2\n217#1:335\n217#1:336,2\n*E\n"})
public final class AccountBillSearchCoinDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super String, Unit> f16660r0;

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ KProperty<Object>[] f16657B0 = {Reflection.property1(new PropertyReference1Impl(AccountBillSearchCoinDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFilterSearchCoinDialogBinding;", 0))};

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final Companion f16656A0 = new Companion(null);

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public static final List<SearchCoinItemInfo> f16658C0 = new ArrayList();

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16659q0 = C45681e.m100799e(this, new Function1<AccountBillSearchCoinDialog, C44785i0>() { // from class: com.kubi.assets.bill.AccountBillSearchCoinDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44785i0 invoke(@NotNull AccountBillSearchCoinDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44785i0.m99087a(fragment.requireView());
        }
    }, new Function1<C44785i0, Unit>() { // from class: com.kubi.assets.bill.AccountBillSearchCoinDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44785i0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44785i0 c44785i0) {
            invoke(c44785i0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final AccountBillRepository f16661s0 = new AccountBillRepository();

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16662t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.b1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountBillSearchCoinDialog.m15670w4(this.f16733b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f16663u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.c1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountBillSearchCoinDialog.m15669v4(this.f16738b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final InterfaceC41669n<List<SearchCoinItemInfo>> f16664v0 = C41679x.m91009a(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final InterfaceC41669n<String> f16665w0 = C41679x.m91009a(null);

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final InterfaceC41669n<String> f16666x0 = C41679x.m91009a(null);

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public String f16667y0 = "";

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final BaseQuickAdapter<SearchCoinItemInfo, BaseViewHolder> f16668z0 = new AccountBillSearchCoinDialog$adapter$1(this, R$layout.asset_filter_search_coin_item);

    /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion;", "", "<init>", "()V", "TAG", "", "coinListCache", "", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "create", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog;", FirebaseAnalytics.Param.CURRENCY, "accountType", "preloadCoinList", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAccountBillSearchCoinDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,283:1\n47#2,4:284\n*S KotlinDebug\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion\n*L\n63#1:284,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$Companion$a */
        /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
        @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion\n*L\n1#1,49:1\n63#2:50\n*E\n"})
        public static final class C9557a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public C9557a(CoroutineExceptionHandler.Companion companion) {
                super(companion);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext context, Throwable exception) {
            }
        }

        public Companion() {
        }

        @NotNull
        public final AccountBillSearchCoinDialog create(@Nullable String currency, @Nullable String accountType) {
            AccountBillSearchCoinDialog accountBillSearchCoinDialog = new AccountBillSearchCoinDialog();
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.CURRENCY, currency);
            bundle.putString("accountType", accountType);
            accountBillSearchCoinDialog.setArguments(bundle);
            return accountBillSearchCoinDialog;
        }

        public final void preloadCoinList(@NotNull InterfaceC41709m0 coroutineScope) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            C41696j.m91104d(coroutineScope, C42911a.m94120b().plus(new C9557a(CoroutineExceptionHandler.INSTANCE)), null, new AccountBillSearchCoinDialog$Companion$preloadCoinList$2(new AccountBillRepository(), null), 2, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$a, reason: from toString */
    /* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\bHÆ\u0003Jr\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\n\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u000b\u0010\u0014R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "isMarginEnabled", "", "isIsolatedEnabled", "isContractEnabled", "isEarnEnabled", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getName", "getIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SearchCoinItemInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String code;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String currency;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final Boolean isMarginEnabled;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final Boolean isIsolatedEnabled;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final Boolean isContractEnabled;

        /* JADX INFO: renamed from: h, reason: from toString */
        @Nullable
        public final Boolean isEarnEnabled;

        /* JADX INFO: renamed from: i, reason: from toString */
        public boolean isChecked;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchCoinItemInfo)) {
                return false;
            }
            SearchCoinItemInfo searchCoinItemInfo = (SearchCoinItemInfo) other;
            return Intrinsics.areEqual(this.code, searchCoinItemInfo.code) && Intrinsics.areEqual(this.currency, searchCoinItemInfo.currency) && Intrinsics.areEqual(this.name, searchCoinItemInfo.name) && Intrinsics.areEqual(this.iconUrl, searchCoinItemInfo.iconUrl) && Intrinsics.areEqual(this.isMarginEnabled, searchCoinItemInfo.isMarginEnabled) && Intrinsics.areEqual(this.isIsolatedEnabled, searchCoinItemInfo.isIsolatedEnabled) && Intrinsics.areEqual(this.isContractEnabled, searchCoinItemInfo.isContractEnabled) && Intrinsics.areEqual(this.isEarnEnabled, searchCoinItemInfo.isEarnEnabled) && this.isChecked == searchCoinItemInfo.isChecked;
        }

        public SearchCoinItemInfo(@NotNull String code, @NotNull String currency, @NotNull String name, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, boolean z11) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(name, "name");
            this.code = code;
            this.currency = currency;
            this.name = name;
            this.iconUrl = str;
            this.isMarginEnabled = bool;
            this.isIsolatedEnabled = bool2;
            this.isContractEnabled = bool3;
            this.isEarnEnabled = bool4;
            this.isChecked = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getIsContractEnabled() {
            return this.isContractEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getIsEarnEnabled() {
            return this.isEarnEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getIsIsolatedEnabled() {
            return this.isIsolatedEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Boolean getIsMarginEnabled() {
            return this.isMarginEnabled;
        }

        /* JADX INFO: renamed from: h */
        public final void m15684h(boolean z11) {
            this.isChecked = z11;
        }

        public int hashCode() {
            int iHashCode = ((((this.code.hashCode() * 31) + this.currency.hashCode()) * 31) + this.name.hashCode()) * 31;
            String str = this.iconUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isMarginEnabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isIsolatedEnabled;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isContractEnabled;
            int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isEarnEnabled;
            return ((iHashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked);
        }

        @NotNull
        public String toString() {
            return "SearchCoinItemInfo(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", isMarginEnabled=" + this.isMarginEnabled + ", isIsolatedEnabled=" + this.isIsolatedEnabled + ", isContractEnabled=" + this.isContractEnabled + ", isEarnEnabled=" + this.isEarnEnabled + ", isChecked=" + this.isChecked + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillSearchCoinDialog$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n108#2,3:98\n71#3:101\n77#4:102\n*E\n"})
    public static final class C9559b implements TextWatcher {
        public C9559b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            String string;
            C44128b.m97259c("SearchCoinDialog", "textChanged: " + ((Object) s11));
            AccountBillSearchCoinDialog.this.f16666x0.setValue((s11 == null || (string = s11.toString()) == null) ? null : StringsKt.trim((CharSequence) string).toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    private final String m15653B4() {
        return (String) this.f16662t0.getValue();
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m15656E4(AccountBillSearchCoinDialog accountBillSearchCoinDialog, View view) {
        Function1<? super String, Unit> function1 = accountBillSearchCoinDialog.f16660r0;
        if (function1 != null) {
            function1.invoke(null);
        }
        accountBillSearchCoinDialog.dismiss();
    }

    /* JADX INFO: renamed from: y4 */
    private final String m15671y4() {
        return (String) this.f16663u0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final C44785i0 m15672A4() {
        return (C44785i0) this.f16659q0.getValue(this, f16657B0[0]);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m15673F4() {
        List<SearchCoinItemInfo> list = f16658C0;
        if (list.isEmpty()) {
            this.f16668z0.setEmptyView(R$layout.view_loading);
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new AccountBillSearchCoinDialog$loadSearchCoinData$1(this, null), 2, null);
        } else {
            this.f16664v0.setValue(m15675x4(list));
            C44128b.m97258b("list size: " + this.f16664v0.getValue().size());
        }
        this.f16665w0.setValue(m15653B4());
    }

    @NotNull
    /* JADX INFO: renamed from: G4 */
    public final AccountBillSearchCoinDialog m15674G4(@NotNull Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f16660r0 = callBack;
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_filter_search_coin_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15655D4();
        m15654C4();
        m15673F4();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: x4 */
    public final List<SearchCoinItemInfo> m15675x4(@NotNull List<SearchCoinItemInfo> coinListCache) {
        Intrinsics.checkNotNullParameter(coinListCache, "coinListCache");
        String strM15671y4 = m15671y4();
        if (strM15671y4 != null) {
            switch (strM15671y4.hashCode()) {
                case -2027980370:
                    if (strM15671y4.equals("MARGIN")) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : coinListCache) {
                            SearchCoinItemInfo searchCoinItemInfo = (SearchCoinItemInfo) obj;
                            if (Intrinsics.areEqual(searchCoinItemInfo.getIsMarginEnabled(), Boolean.TRUE) && Intrinsics.areEqual(searchCoinItemInfo.getIsContractEnabled(), Boolean.FALSE)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    }
                    break;
                case -135275590:
                    if (strM15671y4.equals("FINANCE")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : coinListCache) {
                            SearchCoinItemInfo searchCoinItemInfo2 = (SearchCoinItemInfo) obj2;
                            if (Intrinsics.areEqual(searchCoinItemInfo2.getIsEarnEnabled(), Boolean.TRUE) && Intrinsics.areEqual(searchCoinItemInfo2.getIsContractEnabled(), Boolean.FALSE)) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                    }
                    break;
                case 215679250:
                    if (strM15671y4.equals("CONTRACT")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : coinListCache) {
                            if (Intrinsics.areEqual(((SearchCoinItemInfo) obj3).getIsContractEnabled(), Boolean.TRUE)) {
                                arrayList3.add(obj3);
                            }
                        }
                        return arrayList3;
                    }
                    break;
                case 1358406937:
                    if (strM15671y4.equals(SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : coinListCache) {
                            SearchCoinItemInfo searchCoinItemInfo3 = (SearchCoinItemInfo) obj4;
                            if (Intrinsics.areEqual(searchCoinItemInfo3.getIsIsolatedEnabled(), Boolean.TRUE) && Intrinsics.areEqual(searchCoinItemInfo3.getIsContractEnabled(), Boolean.FALSE)) {
                                arrayList4.add(obj4);
                            }
                        }
                        return arrayList4;
                    }
                    break;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : coinListCache) {
            if (Intrinsics.areEqual(((SearchCoinItemInfo) obj5).getIsContractEnabled(), Boolean.FALSE)) {
                arrayList5.add(obj5);
            }
        }
        return arrayList5;
    }

    @NotNull
    /* JADX INFO: renamed from: z4 */
    public final BaseQuickAdapter<SearchCoinItemInfo, BaseViewHolder> m15676z4() {
        return this.f16668z0;
    }

    /* JADX INFO: renamed from: C4 */
    private final void m15654C4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillSearchCoinDialog$initObservers$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillSearchCoinDialog$initObservers$2(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillSearchCoinDialog$initObservers$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: D4 */
    private final void m15655D4() {
        C44785i0 c44785i0M15672A4 = m15672A4();
        if (c44785i0M15672A4 != null) {
            ClearEditText etSearchBar = c44785i0M15672A4.f100102b;
            Intrinsics.checkNotNullExpressionValue(etSearchBar, "etSearchBar");
            etSearchBar.addTextChangedListener(new C9559b());
            c44785i0M15672A4.f100105e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillSearchCoinDialog.m15656E4(this.f16731b, view);
                }
            });
            this.f16668z0.bindToRecyclerView(c44785i0M15672A4.f100103c);
            c44785i0M15672A4.f100103c.setAdapter(this.f16668z0);
            this.f16668z0.setEmptyView(R$layout.view_loading);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final String m15669v4(AccountBillSearchCoinDialog accountBillSearchCoinDialog) {
        Bundle arguments = accountBillSearchCoinDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("accountType");
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public static final String m15670w4(AccountBillSearchCoinDialog accountBillSearchCoinDialog) {
        Bundle arguments = accountBillSearchCoinDialog.getArguments();
        if (arguments != null) {
            return arguments.getString(FirebaseAnalytics.Param.CURRENCY);
        }
        return null;
    }
}
