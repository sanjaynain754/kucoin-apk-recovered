package com.kubi.spot.dialog.order;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.gson.Gson;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.TradeInputLayoutEditor;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.TradePasswordExtensionsKt;
import com.kubi.safe.api.service.TradePasswordExtensionsKt$executeTradePassword$1;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.AmendParams;
import com.kubi.spot.dialog.order.model.OrderEntity;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.tradebase.BizType;
import com.kubi.tradebase.OrderType;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.math.RoundingMode;
import l10.C42025b;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import t20.C44671v0;
import t30.C44685e;
import w00.C45681e;
import w20.C45700a;

/* JADX INFO: compiled from: AmendOrderDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00105\u001a\u00020\u001fH\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\b\u00107\u001a\u00020\u001fH\u0002J\u0006\u00108\u001a\u00020\u001fJ\u0012\u00109\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001bH\u0002J\u0012\u0010A\u001a\u00020B2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010C\u001a\u00020\u001fH\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\u001c\u0010E\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\u001b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010=H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b(\u0010)¨\u0006I"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/AmendOrderDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/SpotDialogAmendOrderBinding;", "getBinding", "()Lcom/kubi/spot/databinding/SpotDialogAmendOrderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/spot/dialog/order/AmendOrderViewModel;", "getViewModel", "()Lcom/kubi/spot/dialog/order/AmendOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "api", "Lcom/kubi/spot/dialog/order/AmendApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/dialog/order/AmendApi;", "api$delegate", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/spot/entity/DelegationEntity;", "bizType", "Lcom/kubi/tradebase/BizType;", "modifyStatus", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "getCallback", "()Lkotlin/jvm/functions/Function2;", "setCallback", "(Lkotlin/jvm/functions/Function2;)V", "count", "", "symbolEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolEntity", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolEntity$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "onStop", "initObserve", "initView", "initEditConfig", "getInitValue", "Ljava/math/BigDecimal;", "priceIncrement", "", "initListener", "handleFirstClickAndAdjustNum", "isSub", "buildAmendContext", "Lcom/kubi/spot/dialog/order/model/AmendContext;", "showLoading", "hideLoading", "amendTrackEvent", "isSuccess", "code", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAmendOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,403:1\n143#2,20:404\n106#3,15:424\n1#4:439\n65#5,16:440\n93#5,3:456\n*S KotlinDebug\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog\n*L\n73#1:404,20\n74#1:424,15\n304#1:440,16\n304#1:456,3\n*E\n"})
public final class AmendOrderDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ KProperty<Object>[] f50493A0 = {Reflection.property1(new PropertyReference1Impl(AmendOrderDialog.class, "binding", "getBinding()Lcom/kubi/spot/databinding/SpotDialogAmendOrderBinding;", 0))};

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f50494z0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f50495q0 = C45681e.m100799e(this, new Function1<AmendOrderDialog, C44671v0>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44671v0 invoke(@NotNull AmendOrderDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44671v0.m98818a(fragment.requireView());
        }
    }, new Function1<C44671v0, Unit>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44671v0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44671v0 c44671v0) {
            invoke(c44671v0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f50496r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f50497s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public DelegationEntity f50498t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public BizType f50499u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f50500v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public Function2<? super Boolean, ? super ProtocolException, Unit> f50501w0;

    /* JADX INFO: renamed from: x0 */
    public int f50502x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f50503y0;

    /* JADX INFO: compiled from: AmendOrderDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/AmendOrderDialog$Companion;", "", "<init>", "()V", "TAG", "", "EVENT_ORDER_REFRESH", "BIZ_TYPE", "newInstance", "Lcom/kubi/spot/dialog/order/AmendOrderDialog;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "bizType", "Lcom/kubi/tradebase/BizType;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AmendOrderDialog newInstance(@Nullable DelegationEntity item, @NotNull BizType bizType) {
            Intrinsics.checkNotNullParameter(bizType, "bizType");
            AmendOrderDialog amendOrderDialog = new AmendOrderDialog();
            amendOrderDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", item), TuplesKt.m90091to("biz_type", bizType.name()), TuplesKt.m90091to("type", 8)));
            return amendOrderDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n305#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C25273a implements TextWatcher {
        public C25273a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (TextUtils.isEmpty(String.valueOf(s11))) {
                AmendOrderDialog.this.f50502x0 = 0;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderDialog$b */
    /* JADX INFO: compiled from: AmendOrderDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/dialog/order/AmendOrderDialog$initListener$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "click", "", "isSub", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAmendOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initListener$1\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,403:1\n43#2,7:404\n*S KotlinDebug\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initListener$1\n*L\n300#1:404,7\n*E\n"})
    public static final class C25274b implements TradeInputLayoutEditor.InterfaceC22960b {
        public C25274b() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.InterfaceC22960b
        /* JADX INFO: renamed from: a */
        public void mo22972a(boolean z11) {
            Object objM103844constructorimpl;
            AmendOrderDialog amendOrderDialog = AmendOrderDialog.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                amendOrderDialog.m61662L4(z11);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C45700a.m100877c(thM103847exceptionOrNullimpl, "handleFirstClickAndAdjustNum");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderDialog$c */
    /* JADX INFO: compiled from: AmendOrderDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25275c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50506b;

        public C25275c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50506b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50506b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50506b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m61664O4(DelegationEntity delegationEntity, AmendOrderDialog amendOrderDialog) {
        BigDecimal targetPrice;
        TradeInputLayoutProxy tradeInputLayoutProxy;
        if ((delegationEntity != null ? delegationEntity.getTargetPrice() : null) == null) {
            targetPrice = delegationEntity != null ? delegationEntity.getPrice() : null;
        } else {
            targetPrice = delegationEntity.getTargetPrice();
        }
        BigDecimal bigDecimalM89922G = C41014a.m89922G(targetPrice, null, 1, null);
        C44671v0 c44671v0M61697H4 = amendOrderDialog.m61697H4();
        if (c44671v0M61697H4 == null || (tradeInputLayoutProxy = c44671v0M61697H4.f99406c) == null) {
            return;
        }
        tradeInputLayoutProxy.mo54627b(bigDecimalM89922G, true);
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m61665P4(DelegationEntity delegationEntity, AmendOrderDialog amendOrderDialog) {
        TradeInputLayoutProxy tradeInputLayoutProxy;
        BigDecimal bigDecimalSubtract = C41014a.m89922G(delegationEntity != null ? delegationEntity.getSize() : null, null, 1, null).subtract(C41014a.m89922G(delegationEntity != null ? delegationEntity.getDealSize() : null, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        BigDecimal bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
        C44671v0 c44671v0M61697H4 = amendOrderDialog.m61697H4();
        if (c44671v0M61697H4 == null || (tradeInputLayoutProxy = c44671v0M61697H4.f99405b) == null) {
            return;
        }
        Intrinsics.checkNotNull(bigDecimal);
        tradeInputLayoutProxy.mo54627b(bigDecimal, true);
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m61660D4(AmendOrderDialog amendOrderDialog, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = null;
        }
        amendOrderDialog.m61694C4(z11, str);
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m61669T4(final AmendOrderDialog amendOrderDialog) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        C43852m.m96591c("B5orderList", "ModifyLimitOrder", "1", null, 8, null);
        final AmendContext amendContextM61695F4 = amendOrderDialog.m61695F4(amendOrderDialog.f50498t0);
        final TradeSecurityScene tradeSecurityScene = amendContextM61695F4.getBizType() == BizType.MARGIN ? TradeSecurityScene.MARGIN_AMEND : TradeSecurityScene.SPOT_AMEND;
        C44671v0 c44671v0M61697H4 = amendOrderDialog.m61697H4();
        if (c44671v0M61697H4 != null && (kcPrimaryButton = c44671v0M61697H4.f99410g) != null) {
            C44685e.m98843b(kcPrimaryButton, new Action() { // from class: com.kubi.spot.dialog.order.k
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AmendOrderDialog.m61670U4(this.f50524b, tradeSecurityScene, amendContextM61695F4);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m61671V4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m61672W4(AmendOrderDialog amendOrderDialog, Throwable error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ApiException) {
            amendOrderDialog.m61694C4(false, ((ApiException) error).code);
        }
        if (amendOrderDialog.isVisible()) {
            ToastCompat.m66441G(error.getMessage(), new Object[0]);
            amendOrderDialog.m61663M4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m61673X4(AmendOrderDialog amendOrderDialog, int i11) {
        if (i11 <= 0) {
            View view = amendOrderDialog.getView();
            if (view != null) {
                view.setFocusable(true);
            }
            View view2 = amendOrderDialog.getView();
            if (view2 != null) {
                view2.setFocusableInTouchMode(true);
            }
            View view3 = amendOrderDialog.getView();
            if (view3 != null) {
                view3.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m61674Y4(AmendOrderDialog amendOrderDialog, DialogInterface dialogInterface) {
        Function2<? super Boolean, ? super ProtocolException, Unit> function2 = amendOrderDialog.f50501w0;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(amendOrderDialog.f50500v0), null);
        }
        C43852m.m96591c("B5orderList", "ModifyLimitOrder", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: b5 */
    public static final SymbolInfoEntity m61676b5(AmendOrderDialog amendOrderDialog) {
        C37890n c37890n = C37890n.f85269a;
        DelegationEntity delegationEntity = amendOrderDialog.f50498t0;
        return c37890n.m85601B(delegationEntity != null ? delegationEntity.getSymbol() : null);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m61694C4(boolean z11, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        BizType bizType = this.f50499u0;
        jSONObject.put("trade_service_type", bizType != null ? bizType.name() : null);
        DelegationEntity delegationEntity = this.f50498t0;
        jSONObject.put("trade_pair", delegationEntity != null ? delegationEntity.getSymbol() : null);
        jSONObject.put("is_success", z11);
        if (z11) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        DelegationEntity delegationEntity2 = this.f50498t0;
        jSONObject.put("trade_type", delegationEntity2 != null ? delegationEntity2.getSide() : null);
        jSONObject.put("pricing_type", TUIConstants.TUIContact.LIMIT);
        C43852m.m96605q("modify_order_result", jSONObject);
    }

    /* JADX INFO: renamed from: F4 */
    public final AmendContext m61695F4(DelegationEntity delegationEntity) {
        TradeInputLayoutProxy tradeInputLayoutProxy;
        BigDecimal value;
        TradeInputLayoutProxy tradeInputLayoutProxy2;
        BigDecimal value2;
        BizType bizType = this.f50499u0;
        if (bizType == null) {
            bizType = BizType.SPOT;
        }
        String plainString = null;
        String symbol = delegationEntity != null ? delegationEntity.getSymbol() : null;
        if (symbol == null) {
            symbol = "";
        }
        OrderType orderType = OrderType.LIMIT;
        OrderEntity orderEntity = new OrderEntity(delegationEntity != null ? delegationEntity.getOrderId() : null, delegationEntity != null ? delegationEntity.getSymbol() : null, null, delegationEntity != null ? delegationEntity.getPrice() : null, delegationEntity != null ? delegationEntity.getSize() : null, delegationEntity != null ? delegationEntity.getDealSize() : null, 4, null);
        String orderId = delegationEntity != null ? delegationEntity.getOrderId() : null;
        String symbol2 = delegationEntity != null ? delegationEntity.getSymbol() : null;
        C44671v0 c44671v0M61697H4 = m61697H4();
        String plainString2 = (c44671v0M61697H4 == null || (tradeInputLayoutProxy2 = c44671v0M61697H4.f99406c) == null || (value2 = tradeInputLayoutProxy2.getValue()) == null) ? null : value2.toPlainString();
        C44671v0 c44671v0M61697H5 = m61697H4();
        if (c44671v0M61697H5 != null && (tradeInputLayoutProxy = c44671v0M61697H5.f99405b) != null && (value = tradeInputLayoutProxy.getValue()) != null) {
            plainString = value.toPlainString();
        }
        return new AmendContext(bizType, symbol, orderType, orderEntity, new AmendParams(orderId, symbol2, plainString2, plainString));
    }

    /* JADX INFO: renamed from: G4 */
    public final AmendApi m61696G4() {
        return (AmendApi) this.f50497s0.getValue();
    }

    /* JADX INFO: renamed from: H4 */
    public final C44671v0 m61697H4() {
        return (C44671v0) this.f50495q0.getValue(this, f50493A0[0]);
    }

    /* JADX INFO: renamed from: J4 */
    public final SymbolInfoEntity m61699J4() {
        return (SymbolInfoEntity) this.f50503y0.getValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final AmendOrderViewModel m61700K4() {
        return (AmendOrderViewModel) this.f50496r0.getValue();
    }

    /* JADX INFO: renamed from: a5 */
    public final void m61702a5(@Nullable Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        this.f50501w0 = function2;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.spot_dialog_amend_order, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43852m.m96594f("B5orderList", "ModifyOrder", "ModifyDialog", TuplesKt.m90091to("pricing_type", TUIConstants.TUIContact.LIMIT));
        Bundle arguments = getArguments();
        this.f50498t0 = arguments != null ? (DelegationEntity) RouteExKt.m56274t(arguments, "data") : null;
        Bundle arguments2 = getArguments();
        this.f50499u0 = BizType.valueOf(C27041f.m66669i(arguments2 != null ? RouteExKt.m56284y(arguments2, "biz_type") : null, "SPOT"));
        initView();
        m61667R4();
        m61666Q4();
    }

    public AmendOrderDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f50496r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AmendOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.dialog.order.AmendOrderDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f50497s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.dialog.order.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AmendOrderDialog.m61661E4();
            }
        });
        this.f50503y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.dialog.order.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AmendOrderDialog.m61676b5(this.f50518b);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static final AmendApi m61661E4() {
        return (AmendApi) C42597a.m93388d().create(AmendApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public final void m61662L4(boolean z11) {
        BigDecimal value;
        BigDecimal value2;
        int i11;
        BigDecimal bigDecimalMultiply;
        String strSubstringAfter$default;
        Integer numValueOf;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        TradeInputLayoutProxy tradeInputLayoutProxy;
        String baseIncrement;
        TradeInputLayoutProxy tradeInputLayoutProxy2;
        String symbol;
        TradeInputLayoutProxy tradeInputLayoutProxy3;
        TradeInputLayoutProxy tradeInputLayoutProxy4;
        C44671v0 c44671v0M61697H4 = m61697H4();
        if (c44671v0M61697H4 != null && (tradeInputLayoutProxy4 = c44671v0M61697H4.f99406c) != null) {
            value = tradeInputLayoutProxy4.getValue();
        } else {
            value = null;
        }
        C44671v0 c44671v0M61697H5 = m61697H4();
        if (c44671v0M61697H5 != null && (tradeInputLayoutProxy3 = c44671v0M61697H5.f99405b) != null) {
            value2 = tradeInputLayoutProxy3.getValue();
        } else {
            value2 = null;
        }
        if (!C41014a.m89919D(value) && !z11 && (i11 = this.f50502x0) == 0) {
            this.f50502x0 = i11 + 1;
            if (value != null) {
                bigDecimalMultiply = value.multiply(C41014a.m89922G(value2, null, 1, null));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                bigDecimalMultiply = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalMultiply, null, 1, null);
            C37890n c37890n = C37890n.f85269a;
            DelegationEntity delegationEntity = this.f50498t0;
            if (delegationEntity != null && (symbol = delegationEntity.getSymbol()) != null) {
                strSubstringAfter$default = StringsKt.substringAfter$default(symbol, C33820nf.f71144W, (String) null, 2, (Object) null);
            } else {
                strSubstringAfter$default = null;
            }
            BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(c37890n.m85618z(strSubstringAfter$default)));
            if (bigDecimalM89922G.compareTo(bigDecimal3) < 0 && value != null) {
                C44671v0 c44671v0M61697H6 = m61697H4();
                if (c44671v0M61697H6 != null && (tradeInputLayoutProxy2 = c44671v0M61697H6.f99405b) != null) {
                    numValueOf = Integer.valueOf(tradeInputLayoutProxy2.getF44119f());
                } else {
                    numValueOf = null;
                }
                int iM66651k = C27039d.m66651k(numValueOf, 8);
                BigDecimal bigDecimalDivide = bigDecimal3.divide(value, iM66651k, RoundingMode.UP);
                SymbolInfoEntity symbolInfoEntityM61699J4 = m61699J4();
                if (symbolInfoEntityM61699J4 != null) {
                    bigDecimal = new BigDecimal(String.valueOf(symbolInfoEntityM61699J4.getBaseMinSize()));
                } else {
                    bigDecimal = null;
                }
                BigDecimal scale = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalDivide, C41014a.m89922G(bigDecimal, null, 1, null));
                SymbolInfoEntity symbolInfoEntityM61699J5 = m61699J4();
                if (symbolInfoEntityM61699J5 != null && (baseIncrement = symbolInfoEntityM61699J5.getBaseIncrement()) != null) {
                    bigDecimal2 = new BigDecimal(baseIncrement);
                } else {
                    bigDecimal2 = BigDecimal.ZERO;
                }
                if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0) {
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    scale = scale.divide(bigDecimal2, 0, roundingMode).multiply(bigDecimal2).setScale(iM66651k, roundingMode);
                    if (scale.multiply(value).compareTo(bigDecimal3) < 0) {
                        scale = scale.add(bigDecimal2).setScale(iM66651k, roundingMode);
                    }
                }
                C44671v0 c44671v0M61697H7 = m61697H4();
                if (c44671v0M61697H7 != null && (tradeInputLayoutProxy = c44671v0M61697H7.f99405b) != null) {
                    Intrinsics.checkNotNull(scale);
                    tradeInputLayoutProxy.setValue(scale);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public final void m61663M4() {
        KcPrimaryButton kcPrimaryButton;
        View view;
        C44671v0 c44671v0M61697H4 = m61697H4();
        if (c44671v0M61697H4 != null && (kcPrimaryButton = c44671v0M61697H4.f99410g) != null) {
            kcPrimaryButton.mo28851l();
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setCancelable(true);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(true);
            }
            C44671v0 c44671v0M61697H5 = m61697H4();
            if (c44671v0M61697H5 != null && (view = c44671v0M61697H5.f99408e) != null) {
                ViewExtKt.m66577h(view);
            }
            kcPrimaryButton.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    private final void m61666Q4() {
        TradeInputLayoutProxy tradeInputLayoutProxy;
        EditText editText;
        TradeInputLayoutProxy tradeInputLayoutProxy2;
        C44671v0 c44671v0M61697H4 = m61697H4();
        if (c44671v0M61697H4 != null && (tradeInputLayoutProxy2 = c44671v0M61697H4.f99405b) != null) {
            tradeInputLayoutProxy2.setSubOrAddClickListener(new C25274b());
        }
        C44671v0 c44671v0M61697H5 = m61697H4();
        if (c44671v0M61697H5 != null && (tradeInputLayoutProxy = c44671v0M61697H5.f99405b) != null && (editText = tradeInputLayoutProxy.getEditText()) != null) {
            editText.addTextChangedListener(new C25273a());
        }
    }

    /* JADX INFO: renamed from: R4 */
    private final void m61667R4() {
        m61700K4().m61717z().observe(this, new C25275c(new Function1() { // from class: com.kubi.spot.dialog.order.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AmendOrderDialog.m61668S4(this.f50519b, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m61668S4(AmendOrderDialog amendOrderDialog, String str) {
        C44671v0 c44671v0M61697H4;
        TradeInputLayoutProxy tradeInputLayoutProxy;
        BaseTextView baseTextView;
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        C44671v0 c44671v0M61697H5 = amendOrderDialog.m61697H4();
        if (c44671v0M61697H5 != null && (baseTextView = c44671v0M61697H5.f99412i) != null) {
            String strM85579c = null;
            if (bigDecimalM66536f != null) {
                DelegationEntity delegationEntity = amendOrderDialog.f50498t0;
                if (delegationEntity != null) {
                    strM85579c = delegationEntity.getSymbol();
                }
                strM85579c = C37886j.m85579c(bigDecimalM66536f, strM85579c, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            baseTextView.setText(C27041f.m66669i(strM85579c, "--"));
        }
        if (bigDecimalM66536f != null && (c44671v0M61697H4 = amendOrderDialog.m61697H4()) != null && (tradeInputLayoutProxy = c44671v0M61697H4.f99406c) != null) {
            tradeInputLayoutProxy.setInitValue(bigDecimalM66536f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m61670U4(final AmendOrderDialog amendOrderDialog, TradeSecurityScene tradeSecurityScene, AmendContext amendContext) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(amendOrderDialog);
        String json = new Gson().toJson(amendContext.getNewParams());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        TradePasswordExtensionsKt.m56335d(amendOrderDialog, tradeSecurityScene, lifecycleScope, (504 & 4) != 0 ? "" : json, (504 & 8) != 0 ? null : null, (504 & 16) != 0 ? false : false, (504 & 32) != 0, (504 & 64) != 0 ? false : false, (504 & 128) != 0 ? new TradePasswordExtensionsKt$executeTradePassword$1(null) : null, (504 & 256) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56337f();
            }
        } : null, new AmendOrderDialog$initView$4$1$1(amendOrderDialog, amendContext, null), (504 & 1024) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePasswordExtensionsKt.m56338g();
            }
        } : new Function0() { // from class: com.kubi.spot.dialog.order.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AmendOrderDialog.m61671V4();
            }
        }, (504 & 2048) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradePasswordExtensionsKt.m56339h((Throwable) obj);
            }
        } : new Function1() { // from class: com.kubi.spot.dialog.order.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AmendOrderDialog.m61672W4(this.f50517b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m61675Z4(AmendOrderDialog amendOrderDialog) {
        amendOrderDialog.dismissAllowingStateLoss();
        C43852m.m96591c("B5orderList", "ModifyLimitOrder", "3", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        KcPrimaryButton kcPrimaryButton;
        View view;
        C44671v0 c44671v0M61697H4 = m61697H4();
        if (c44671v0M61697H4 != null && (kcPrimaryButton = c44671v0M61697H4.f99410g) != null) {
            kcPrimaryButton.m55043o();
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(false);
            }
            C44671v0 c44671v0M61697H5 = m61697H4();
            if (c44671v0M61697H5 != null && (view = c44671v0M61697H5.f99408e) != null) {
                ViewExtKt.m66594y(view);
            }
            kcPrimaryButton.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final BigDecimal m61698I4(String str) {
        BigDecimal bigDecimalM66535e;
        String value = m61700K4().m61717z().getValue();
        if (Intrinsics.areEqual(value, "--")) {
            value = null;
        }
        String str2 = value;
        if (str2 != null && (bigDecimalM66535e = DowngradeExKt.m66535e(str2, null, 1, null)) != null) {
            return bigDecimalM66535e;
        }
        return DowngradeExKt.m66535e(str, null, 1, null);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m61701N4(final DelegationEntity delegationEntity) {
        TradeInputLayoutProxy tradeInputLayoutProxy;
        TradeInputLayoutProxy tradeInputLayoutProxy2;
        TradeInputLayoutProxy tradeInputLayoutProxy3;
        TradeInputLayoutProxy tradeInputLayoutProxy4;
        SymbolInfoEntity symbolInfoEntityM61699J4 = m61699J4();
        if (symbolInfoEntityM61699J4 != null) {
            C44671v0 c44671v0M61697H4 = m61697H4();
            if (c44671v0M61697H4 != null && (tradeInputLayoutProxy4 = c44671v0M61697H4.f99406c) != null) {
                tradeInputLayoutProxy4.setHint(getString(R$string.limit_price_stub, symbolInfoEntityM61699J4.getQuoteCurrencyName()));
                ITradeInputLayoutOperations.m55172d(tradeInputLayoutProxy4, DowngradeExKt.m66535e(symbolInfoEntityM61699J4.getPriceIncrement(), null, 1, null), symbolInfoEntityM61699J4.getPriceIncrementPrecisionTrade(), false, 4, null);
                tradeInputLayoutProxy4.setLowValue(DowngradeExKt.m66535e(symbolInfoEntityM61699J4.getPriceIncrement(), null, 1, null));
                String priceIncrement = symbolInfoEntityM61699J4.getPriceIncrement();
                Intrinsics.checkNotNullExpressionValue(priceIncrement, "getPriceIncrement(...)");
                tradeInputLayoutProxy4.setInitValue(m61698I4(priceIncrement));
                tradeInputLayoutProxy4.setStatusEnabled(true);
            }
            C44671v0 c44671v0M61697H5 = m61697H4();
            if (c44671v0M61697H5 != null && (tradeInputLayoutProxy3 = c44671v0M61697H5.f99405b) != null) {
                tradeInputLayoutProxy3.setHint(getString(R$string.amount_stub, symbolInfoEntityM61699J4.getBaseCurrencyName()));
                ITradeInputLayoutOperations.m55172d(tradeInputLayoutProxy3, DowngradeExKt.m66535e(symbolInfoEntityM61699J4.getBaseIncrement(), null, 1, null), symbolInfoEntityM61699J4.getBaseIncrementPrecisionTrade(), false, 4, null);
                tradeInputLayoutProxy3.setLowValue(new BigDecimal(String.valueOf(symbolInfoEntityM61699J4.getBaseMinSize())));
                tradeInputLayoutProxy3.setInitValue(new BigDecimal(String.valueOf(symbolInfoEntityM61699J4.getBaseMinSize())));
                tradeInputLayoutProxy3.setStatusEnabled(true);
            }
            C44671v0 c44671v0M61697H6 = m61697H4();
            if (c44671v0M61697H6 != null && (tradeInputLayoutProxy2 = c44671v0M61697H6.f99406c) != null) {
                tradeInputLayoutProxy2.post(new Runnable() { // from class: com.kubi.spot.dialog.order.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AmendOrderDialog.m61664O4(delegationEntity, this);
                    }
                });
            }
            C44671v0 c44671v0M61697H7 = m61697H4();
            if (c44671v0M61697H7 != null && (tradeInputLayoutProxy = c44671v0M61697H7.f99405b) != null) {
                tradeInputLayoutProxy.post(new Runnable() { // from class: com.kubi.spot.dialog.order.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AmendOrderDialog.m61665P4(delegationEntity, this);
                    }
                });
            }
        }
    }

    public final void initView() {
        KcPrimaryButton kcPrimaryButton;
        ImageView imageView;
        ShapeTextView shapeTextView;
        C42025b shapeDrawableBuilder;
        C42025b c42025bM92151m;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        String typeString;
        ShapeTextView shapeTextView4;
        String string;
        BaseTextView baseTextView;
        String strReplace$default;
        String symbol;
        C44671v0 c44671v0M61697H4 = m61697H4();
        String str = "";
        String side = null;
        if (c44671v0M61697H4 != null && (baseTextView = c44671v0M61697H4.f99416m) != null) {
            DelegationEntity delegationEntity = this.f50498t0;
            if (delegationEntity != null && (symbol = delegationEntity.getSymbol()) != null) {
                strReplace$default = StringsKt.replace$default(symbol, C33820nf.f71144W, "", false, 4, (Object) null);
            } else {
                strReplace$default = null;
            }
            if (strReplace$default == null) {
                strReplace$default = "";
            }
            baseTextView.setText(strReplace$default);
        }
        C44671v0 c44671v0M61697H5 = m61697H4();
        if (c44671v0M61697H5 != null && (shapeTextView4 = c44671v0M61697H5.f99415l) != null) {
            DelegationEntity delegationEntity2 = this.f50498t0;
            if (delegationEntity2 != null) {
                string = getString(delegationEntity2.getSideString());
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            shapeTextView4.setText(string);
        }
        C44671v0 c44671v0M61697H6 = m61697H4();
        if (c44671v0M61697H6 != null && (shapeTextView3 = c44671v0M61697H6.f99411h) != null) {
            DelegationEntity delegationEntity3 = this.f50498t0;
            if (delegationEntity3 != null) {
                typeString = delegationEntity3.getTypeString(1);
            } else {
                typeString = null;
            }
            if (typeString != null) {
                str = typeString;
            }
            shapeTextView3.setText(str);
        }
        Context context = getContext();
        if (context != null) {
            DelegationEntity delegationEntity4 = this.f50498t0;
            if (delegationEntity4 != null) {
                side = delegationEntity4.getSide();
            }
            int iM54281f = C22890g.m54281f(context, Intrinsics.areEqual(side, "buy"));
            C44671v0 c44671v0M61697H7 = m61697H4();
            if (c44671v0M61697H7 != null && (shapeTextView2 = c44671v0M61697H7.f99415l) != null) {
                shapeTextView2.setTextColor(iM54281f);
            }
            int alphaComponent = ColorUtils.setAlphaComponent(iM54281f, 20);
            C44671v0 c44671v0M61697H8 = m61697H4();
            if (c44671v0M61697H8 != null && (shapeTextView = c44671v0M61697H8.f99415l) != null && (shapeDrawableBuilder = shapeTextView.getShapeDrawableBuilder()) != null && (c42025bM92151m = shapeDrawableBuilder.m92151m(alphaComponent)) != null) {
                c42025bM92151m.m92143e();
            }
        }
        C44671v0 c44671v0M61697H9 = m61697H4();
        if (c44671v0M61697H9 != null && (imageView = c44671v0M61697H9.f99407d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.spot.dialog.order.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AmendOrderDialog.m61675Z4(this.f50520b);
                }
            }, 1, null);
        }
        C44671v0 c44671v0M61697H10 = m61697H4();
        if (c44671v0M61697H10 != null && (kcPrimaryButton = c44671v0M61697H10.f99410g) != null) {
            C27046k.m66710y(kcPrimaryButton, 1000L, new Function0() { // from class: com.kubi.spot.dialog.order.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AmendOrderDialog.m61669T4(this.f50521b);
                }
            });
        }
        m61701N4(this.f50498t0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m6038j(activity, new KeyboardUtils.InterfaceC5235b() { // from class: com.kubi.spot.dialog.order.i
                @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
                /* JADX INFO: renamed from: a */
                public final void mo6045a(int i11) {
                    AmendOrderDialog.m61673X4(this.f50522b, i11);
                }
            });
        }
        m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.spot.dialog.order.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AmendOrderDialog.m61674Y4(this.f50523b, dialogInterface);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        String symbol;
        super.onStart();
        AmendOrderViewModel amendOrderViewModelM61700K4 = m61700K4();
        DelegationEntity delegationEntity = this.f50498t0;
        if (delegationEntity != null) {
            symbol = delegationEntity.getSymbol();
        } else {
            symbol = null;
        }
        amendOrderViewModelM61700K4.m61712A(symbol);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m61700K4().m61715x();
    }
}
