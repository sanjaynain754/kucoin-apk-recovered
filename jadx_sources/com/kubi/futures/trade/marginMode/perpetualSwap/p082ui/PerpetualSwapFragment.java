package com.kubi.futures.trade.marginMode.perpetualSwap.p082ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.adapter.PerpetualSwapFailedViewHolderProxy;
import com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.adapter.QuoteViewHolderProxy;
import com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorAggregationModel;
import com.kubi.kumex.data.platform.model.SwitchFailedAggregationInfo;
import com.kubi.kumex.record.EmptyView;
import com.kubi.kumex.record.OrderEmptyProxy;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Log;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36874y2;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p011a9.C0206f;
import p534pi.C43483b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PerpetualSwapFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\u0018\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\"H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/ui/PerpetualSwapFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentPerpetualSwapBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentPerpetualSwapBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "perpetualSwapViewModel", "Lcom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel;", "getPerpetualSwapViewModel", "()Lcom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel;", "perpetualSwapViewModel$delegate", "Lkotlin/Lazy;", "isTrial", "", "()Z", "isTrial$delegate", "recyclerViewAdapter", "Lcom/kubi/sdk/BaseAdapter;", "", "curSoftKeyboardHeight", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initObserver", "updateViewBySoftKeyboardHeight", "setCountNumDesc", "context", "Landroid/content/Context;", "countNum", "onDestroy", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPerpetualSwapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapFragment.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/ui/PerpetualSwapFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n147#2,16:410\n106#3,15:426\n808#4,11:441\n1740#4,3:452\n2756#4:455\n808#4,11:457\n1#5:456\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapFragment.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/ui/PerpetualSwapFragment\n*L\n67#1:410,16\n70#1:426,15\n212#1:441,11\n213#1:452,3\n221#1:455\n283#1:457,11\n221#1:456\n*E\n"})
public final class PerpetualSwapFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23818U = C45681e.m100799e(this, new Function1<PerpetualSwapFragment, C36874y2>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36874y2 invoke(@NotNull PerpetualSwapFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36874y2.m82616a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36874y2, Unit>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36874y2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36874y2 c36874y2) {
            invoke(c36874y2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23819V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f23820W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public BaseAdapter<Object> f23821X;

    /* JADX INFO: renamed from: Y */
    public int f23822Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f23817a0 = {Reflection.property1(new PropertyReference1Impl(PerpetualSwapFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentPerpetualSwapBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f23816Z = new Companion(null);

    /* JADX INFO: compiled from: PerpetualSwapFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/ui/PerpetualSwapFragment$Companion;", "", "<init>", "()V", "LOG_TAG", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$a */
    /* JADX INFO: compiled from: PerpetualSwapFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/marginMode/perpetualSwap/ui/PerpetualSwapFragment$initView$4", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "quoteModel", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13751a implements ItemCallBack<QuoteModel> {
        public C13751a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, final int i11, final QuoteModel quoteModel) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(quoteModel, "quoteModel");
            int id2 = view.getId();
            if (id2 == R$id.rootCl || id2 == R$id.selectStatusTv) {
                PerpetualSwapViewModel perpetualSwapViewModelM27087L3 = PerpetualSwapFragment.this.m27087L3();
                final PerpetualSwapFragment perpetualSwapFragment = PerpetualSwapFragment.this;
                perpetualSwapViewModelM27087L3.m27103A(quoteModel, new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerpetualSwapFragment.C13751a.m27091d(quoteModel, perpetualSwapFragment, i11);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m27091d(QuoteModel quoteModel, PerpetualSwapFragment perpetualSwapFragment, int i11) throws JSONException {
            String str;
            boolean zIsSelected = quoteModel.isSelected();
            quoteModel.setSelected(!zIsSelected);
            BaseAdapter baseAdapter = perpetualSwapFragment.f23821X;
            if (baseAdapter != null) {
                baseAdapter.notifyItemChanged(i11);
            }
            perpetualSwapFragment.m27087L3().m27106k(quoteModel, !zIsSelected);
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObjectPut = new JSONObject().put("isTrialFunds", String.valueOf(perpetualSwapFragment.m27037E0()));
            if (zIsSelected) {
                str = "2";
            } else {
                str = "1";
            }
            C43852m.m96589a(strM36552b, "MaginModeMulti", "2", jSONObjectPut.put("select", str));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$b */
    /* JADX INFO: compiled from: PerpetualSwapFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13752b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23824b;

        public C13752b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23824b = function;
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
            return this.f23824b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23824b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static final boolean m27068j4(PerpetualSwapFragment perpetualSwapFragment, TextView textView, int i11, KeyEvent keyEvent) {
        String string;
        ClearEditText clearEditText;
        Editable text;
        if (i11 != 3) {
            return false;
        }
        PerpetualSwapViewModel perpetualSwapViewModelM27087L3 = perpetualSwapFragment.m27087L3();
        C36874y2 c36874y2M27086K3 = perpetualSwapFragment.m27086K3();
        if (c36874y2M27086K3 == null || (clearEditText = c36874y2M27086K3.f81380i) == null || (text = clearEditText.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        perpetualSwapViewModelM27087L3.m27118y(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final boolean m27037E0() {
        return ((Boolean) this.f23820W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m27055X3(final PerpetualSwapFragment perpetualSwapFragment, final SwitchFailedAggregationInfo switchFailedAggregationInfo) {
        if (switchFailedAggregationInfo != null) {
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bkumex_dialog_perpetual_swap_failed, true).m54237f4(new Function2() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.n
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerpetualSwapFragment.m27056Y3(this.f23837b, switchFailedAggregationInfo, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            FragmentManager childFragmentManager = perpetualSwapFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, "PerpetualSwapFailedDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m27056Y3(final PerpetualSwapFragment perpetualSwapFragment, SwitchFailedAggregationInfo switchFailedAggregationInfo, BaseViewHolder viewHolder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        View view = viewHolder.getView(R$id.confirmBtn);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualSwapFragment.m27057Z3(dialog, perpetualSwapFragment);
            }
        }, 1, null);
        ((TextView) viewHolder.getView(R$id.titleTv)).setText(perpetualSwapFragment.getString(R$string.kumex_batch_switch_success, String.valueOf(C27039d.m66651k(Integer.valueOf(switchFailedAggregationInfo.getTotalCountsNum()), 0))));
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(perpetualSwapFragment.getActivity(), 1, false));
        Context context = perpetualSwapFragment.getContext();
        if (context != null) {
            recyclerView.addItemDecoration(new C43483b(context));
        }
        BaseAdapter baseAdapterM57324a = BaseAdapter.a.m57323c(new BaseAdapter.a(), ModifyMarginModeErrorAggregationModel.class, PerpetualSwapFailedViewHolderProxy.class, null, null, 12, null).m57324a();
        List<ModifyMarginModeErrorAggregationModel> aggregationErrors = switchFailedAggregationInfo.getAggregationErrors();
        baseAdapterM57324a.mo32194p(aggregationErrors != null ? CollectionsKt.toMutableList((Collection) aggregationErrors) : null);
        recyclerView.setAdapter(baseAdapterM57324a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m27058a4(PerpetualSwapFragment perpetualSwapFragment, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            List<QuoteModel> value = perpetualSwapFragment.m27087L3().m27108o().getValue();
            if (value != null) {
                if (value.isEmpty()) {
                    BaseAdapter<Object> baseAdapter = perpetualSwapFragment.f23821X;
                    if (baseAdapter != null) {
                        baseAdapter.mo32194p(CollectionsKt.mutableListOf(new EmptyView()));
                    }
                } else {
                    BaseAdapter<Object> baseAdapter2 = perpetualSwapFragment.f23821X;
                    if (baseAdapter2 != null) {
                        baseAdapter2.mo32194p(CollectionsKt.toMutableList((Collection) value));
                    }
                }
            }
            PerpetualSwapViewModel perpetualSwapViewModelM27087L3 = perpetualSwapFragment.m27087L3();
            if (value == null) {
                value = new ArrayList<>();
            }
            perpetualSwapViewModelM27087L3.m27104B(value);
        } else {
            perpetualSwapFragment.m27087L3().m27118y(charSequence.toString());
        }
        perpetualSwapFragment.m27089m4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m27060c4(Throwable th2) {
        Log.f30813a.m36617c("PerpetualSwapFragment", "subscribe searchCet.doOnTextChanged cause error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public static final Unit m27064g4(PerpetualSwapFragment perpetualSwapFragment) {
        List<QuoteModel> listEmptyList;
        BaseTextView baseTextView;
        List<Object> data;
        BaseAdapter<Object> baseAdapter = perpetualSwapFragment.f23821X;
        if (baseAdapter == null || (data = baseAdapter.getData()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof QuoteModel) {
                    listEmptyList.add(obj);
                }
            }
        }
        if (!listEmptyList.isEmpty()) {
            if (listEmptyList == null || !listEmptyList.isEmpty()) {
                Iterator it = listEmptyList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((QuoteModel) it.next()).getSwitchable());
            }
            return Unit.INSTANCE;
        }
        C36874y2 c36874y2M27086K3 = perpetualSwapFragment.m27086K3();
        boolean zIsSelected = (c36874y2M27086K3 == null || (baseTextView = c36874y2M27086K3.f81386o) == null) ? false : baseTextView.isSelected();
        for (QuoteModel quoteModel : listEmptyList) {
            quoteModel.setSelected(quoteModel.getSwitchable() && !zIsSelected);
        }
        BaseAdapter<Object> baseAdapter2 = perpetualSwapFragment.f23821X;
        if (baseAdapter2 != null) {
            baseAdapter2.mo32194p(CollectionsKt.toMutableList((Collection) listEmptyList));
        }
        perpetualSwapFragment.m27087L3().m27105C(listEmptyList, !zIsSelected);
        C43852m.m96589a(C17060n0.m36552b(), "MaginModeMulti", "3", new JSONObject().put("selectall", !zIsSelected ? "1" : "2").put("isTrialFunds", String.valueOf(perpetualSwapFragment.m27037E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m27065h4(PerpetualSwapFragment perpetualSwapFragment, int i11) {
        perpetualSwapFragment.f23822Y = i11;
        perpetualSwapFragment.m27089m4();
    }

    /* JADX INFO: renamed from: i4 */
    public static final void m27066i4(PerpetualSwapFragment perpetualSwapFragment, View view, boolean z11) {
        if (z11) {
            C43852m.m96589a(C17060n0.m36552b(), "MaginModeMulti", "4", new JSONObject().put("isTrialFunds", String.valueOf(perpetualSwapFragment.m27037E0())));
        }
    }

    private final void initView() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        Window window;
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            KeyboardUtils.m6038j(activity2, new KeyboardUtils.InterfaceC5235b() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.b
                @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
                /* JADX INFO: renamed from: a */
                public final void mo6045a(int i11) {
                    PerpetualSwapFragment.m27065h4(this.f23826b, i11);
                }
            });
        }
        C36874y2 c36874y2M27086K3 = m27086K3();
        if (c36874y2M27086K3 != null && (clearEditText2 = c36874y2M27086K3.f81380i) != null) {
            clearEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.c
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    PerpetualSwapFragment.m27066i4(this.f23827b, view, z11);
                }
            });
        }
        C36874y2 c36874y2M27086K4 = m27086K3();
        if (c36874y2M27086K4 != null && (clearEditText = c36874y2M27086K4.f81380i) != null) {
            clearEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.d
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    return PerpetualSwapFragment.m27068j4(this.f23828b, textView, i11, keyEvent);
                }
            });
        }
        C36874y2 c36874y2M27086K5 = m27086K3();
        if (c36874y2M27086K5 != null && (recyclerView2 = c36874y2M27086K5.f81377f) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
        this.f23821X = BaseAdapter.a.m57323c(BaseAdapter.a.m57323c(new BaseAdapter.a(), EmptyView.class, OrderEmptyProxy.class, null, null, 12, null), QuoteModel.class, QuoteViewHolderProxy.class, new C13751a(), null, 8, null).m57324a();
        C36874y2 c36874y2M27086K6 = m27086K3();
        if (c36874y2M27086K6 != null && (recyclerView = c36874y2M27086K6.f81377f) != null) {
            recyclerView.setAdapter(this.f23821X);
        }
        C36874y2 c36874y2M27086K7 = m27086K3();
        if (c36874y2M27086K7 != null) {
            Observable<CharSequence> observableObserveOn = C0206f.m784d(c36874y2M27086K7.f81380i).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerpetualSwapFragment.m27058a4(this.f23829b, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PerpetualSwapFragment.m27059b4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerpetualSwapFragment.m27060c4((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PerpetualSwapFragment.m27061d4(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
        C36874y2 c36874y2M27086K8 = m27086K3();
        if (c36874y2M27086K8 != null && (baseTextView4 = c36874y2M27086K8.f81388q) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualSwapFragment.m27062e4(this.f23832b);
                }
            }, 1, null);
        }
        C36874y2 c36874y2M27086K9 = m27086K3();
        if (c36874y2M27086K9 != null && (baseTextView3 = c36874y2M27086K9.f81387p) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualSwapFragment.m27063f4(this.f23833b);
                }
            }, 1, null);
        }
        Function0 function0 = new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualSwapFragment.m27064g4(this.f23834b);
            }
        };
        C36874y2 c36874y2M27086K10 = m27086K3();
        if (c36874y2M27086K10 != null && (baseTextView2 = c36874y2M27086K10.f81386o) != null) {
            C27046k.m66711z(baseTextView2, 0L, function0, 1, null);
        }
        C36874y2 c36874y2M27086K11 = m27086K3();
        if (c36874y2M27086K11 == null || (baseTextView = c36874y2M27086K11.f81382k) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, function0, 1, null);
    }

    /* JADX INFO: renamed from: K3 */
    public final C36874y2 m27086K3() {
        return (C36874y2) this.f23818U.getValue(this, f23817a0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final PerpetualSwapViewModel m27087L3() {
        return (PerpetualSwapViewModel) this.f23819V.getValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final void m27088l4(Context context, int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        String stringRes = getStringRes(R$string.kumex_batch_total_stub, Integer.valueOf(i11));
        C36874y2 c36874y2M27086K3 = m27086K3();
        if (c36874y2M27086K3 != null && (baseTextView4 = c36874y2M27086K3.f81389r) != null) {
            baseTextView4.setText(stringRes);
        }
        C36874y2 c36874y2M27086K4 = m27086K3();
        if (c36874y2M27086K4 != null && (baseTextView3 = c36874y2M27086K4.f81389r) != null) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(baseTextView3, new Pair(textTagEnum, new StyleSpan(1)), new Pair(textTagEnum, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text))));
        }
        C36874y2 c36874y2M27086K5 = m27086K3();
        if (c36874y2M27086K5 != null && (baseTextView2 = c36874y2M27086K5.f81385n) != null) {
            baseTextView2.setText(stringRes);
        }
        C36874y2 c36874y2M27086K6 = m27086K3();
        if (c36874y2M27086K6 == null || (baseTextView = c36874y2M27086K6.f81385n) == null) {
            return;
        }
        HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper2.m54120f(baseTextView, new Pair(textTagEnum2, new StyleSpan(1)), new Pair(textTagEnum2, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text))));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_perpetual_swap, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m27044M3();
        m27087L3().m27107n(m27037E0());
        C43852m.m96593e(C17060n0.m36552b(), "MaginModeMulti", "1", new JSONObject().put("isTrialFunds", String.valueOf(m27037E0())));
    }

    public PerpetualSwapFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewModels$default$2
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
        this.f23819V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PerpetualSwapViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.PerpetualSwapFragment$special$$inlined$viewModels$default$5
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
        this.f23820W = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PerpetualSwapFragment.m27070k4(this.f23836b));
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    private final void m27044M3() {
        m27087L3().m27109p().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27045N3(this.f23825b, (Boolean) obj);
            }
        }));
        m27087L3().m27110q().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27046O3(this.f23835b, (Boolean) obj);
            }
        }));
        m27087L3().m27116w().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27048Q3(this.f23842b, (Boolean) obj);
            }
        }));
        m27087L3().m27108o().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27049R3(this.f23843b, (List) obj);
            }
        }));
        m27087L3().m27111r().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27050S3(this.f23844b, (List) obj);
            }
        }));
        m27087L3().m27112s().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27051T3(this.f23845b, (Set) obj);
            }
        }));
        m27087L3().m27115v().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27052U3(this.f23846b, (Boolean) obj);
            }
        }));
        m27087L3().m27117x().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27053V3(this.f23847b, (Boolean) obj);
            }
        }));
        m27087L3().m27113t().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27054W3(this.f23848b, (Boolean) obj);
            }
        }));
        m27087L3().m27114u().observe(getViewLifecycleOwner(), new C13752b(new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualSwapFragment.m27055X3(this.f23849b, (SwitchFailedAggregationInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m27045N3(PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showEmptyView$default(perpetualSwapFragment, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m27046O3(final PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showFailView$default(perpetualSwapFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PerpetualSwapFragment.m27047P3(this.f23839b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m27047P3(PerpetualSwapFragment perpetualSwapFragment, View view) {
        perpetualSwapFragment.m27087L3().m27107n(perpetualSwapFragment.m27037E0());
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m27048Q3(PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C36874y2 c36874y2M27086K3 = perpetualSwapFragment.m27086K3();
        if (c36874y2M27086K3 != null && (baseTextView2 = c36874y2M27086K3.f81386o) != null) {
            Intrinsics.checkNotNull(bool);
            baseTextView2.setSelected(bool.booleanValue());
        }
        C36874y2 c36874y2M27086K4 = perpetualSwapFragment.m27086K3();
        if (c36874y2M27086K4 != null && (baseTextView = c36874y2M27086K4.f81382k) != null) {
            Intrinsics.checkNotNull(bool);
            baseTextView.setSelected(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m27049R3(PerpetualSwapFragment perpetualSwapFragment, List list) {
        int size;
        if (list.isEmpty()) {
            BaseAdapter<Object> baseAdapter = perpetualSwapFragment.f23821X;
            if (baseAdapter != null) {
                baseAdapter.mo32194p(CollectionsKt.mutableListOf(new EmptyView()));
            }
        } else {
            BaseAdapter<Object> baseAdapter2 = perpetualSwapFragment.f23821X;
            if (baseAdapter2 != null) {
                Intrinsics.checkNotNull(list);
                baseAdapter2.mo32194p(CollectionsKt.toMutableList((Collection) list));
            }
        }
        PerpetualSwapViewModel perpetualSwapViewModelM27087L3 = perpetualSwapFragment.m27087L3();
        Intrinsics.checkNotNull(list);
        perpetualSwapViewModelM27087L3.m27104B(list);
        Context context = perpetualSwapFragment.getContext();
        if (context != null) {
            Set<QuoteModel> value = perpetualSwapFragment.m27087L3().m27112s().getValue();
            if (value != null) {
                size = value.size();
            } else {
                size = 0;
            }
            perpetualSwapFragment.m27088l4(context, size);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m27050S3(PerpetualSwapFragment perpetualSwapFragment, List list) {
        if (list.isEmpty()) {
            BaseAdapter<Object> baseAdapter = perpetualSwapFragment.f23821X;
            if (baseAdapter != null) {
                baseAdapter.mo32194p(CollectionsKt.mutableListOf(new EmptyView()));
            }
        } else {
            BaseAdapter<Object> baseAdapter2 = perpetualSwapFragment.f23821X;
            if (baseAdapter2 != null) {
                Intrinsics.checkNotNull(list);
                baseAdapter2.mo32194p(CollectionsKt.toMutableList((Collection) list));
            }
        }
        perpetualSwapFragment.m27089m4();
        PerpetualSwapViewModel perpetualSwapViewModelM27087L3 = perpetualSwapFragment.m27087L3();
        Intrinsics.checkNotNull(list);
        perpetualSwapViewModelM27087L3.m27104B(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static final Unit m27051T3(PerpetualSwapFragment perpetualSwapFragment, Set set) {
        List listEmptyList;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        List<Object> data;
        Context context = perpetualSwapFragment.getContext();
        if (context != null) {
            perpetualSwapFragment.m27088l4(context, set.size());
        }
        BaseAdapter<Object> baseAdapter = perpetualSwapFragment.f23821X;
        if (baseAdapter != null && (data = baseAdapter.getData()) != null) {
            listEmptyList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof QuoteModel) {
                    listEmptyList.add(obj);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        perpetualSwapFragment.m27087L3().m27104B(listEmptyList);
        C36874y2 c36874y2M27086K3 = perpetualSwapFragment.m27086K3();
        if (c36874y2M27086K3 != null && (baseTextView2 = c36874y2M27086K3.f81387p) != null) {
            Intrinsics.checkNotNull(set);
            baseTextView2.setEnabled(!set.isEmpty());
        }
        C36874y2 c36874y2M27086K4 = perpetualSwapFragment.m27086K3();
        if (c36874y2M27086K4 != null && (baseTextView = c36874y2M27086K4.f81388q) != null) {
            Intrinsics.checkNotNull(set);
            baseTextView.setEnabled(!set.isEmpty());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m27052U3(PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Context context = perpetualSwapFragment.getContext();
            if (context != null) {
                Toast.makeText(context, R$string.success, 0).show();
            }
            FragmentActivity activity = perpetualSwapFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m27053V3(PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            perpetualSwapFragment.showLoadingDialog();
        } else {
            perpetualSwapFragment.hideLoadingDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m27054W3(PerpetualSwapFragment perpetualSwapFragment, Boolean bool) {
        if (bool.booleanValue()) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_modify_margin_mode_failed_title).m54153J4(R$string.kumex_modify_margin_mode_failed_desc).m54162S4(R$string.i_already_know, null).m54172c5(perpetualSwapFragment.getChildFragmentManager());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m27057Z3(DialogFragmentHelper dialogFragmentHelper, PerpetualSwapFragment perpetualSwapFragment) {
        dialogFragmentHelper.dismiss();
        perpetualSwapFragment.m27087L3().m27107n(perpetualSwapFragment.m27037E0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m27059b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m27061d4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m27062e4(PerpetualSwapFragment perpetualSwapFragment) {
        perpetualSwapFragment.m27087L3().m27119z(SharedPositionInfo.MARGIN_MODE_ISOLATED, perpetualSwapFragment.m27037E0());
        C43852m.m96589a(C17060n0.m36552b(), "MaginModeMulti", "5", new JSONObject().put("changemode", "1").put("isTrialFunds", String.valueOf(perpetualSwapFragment.m27037E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m27063f4(PerpetualSwapFragment perpetualSwapFragment) {
        perpetualSwapFragment.m27087L3().m27119z("CROSS", perpetualSwapFragment.m27037E0());
        C43852m.m96589a(C17060n0.m36552b(), "MaginModeMulti", "5", new JSONObject().put("changemode", "2").put("isTrialFunds", String.valueOf(perpetualSwapFragment.m27037E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final boolean m27070k4(PerpetualSwapFragment perpetualSwapFragment) {
        Boolean boolValueOf;
        Bundle arguments = perpetualSwapFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m27089m4() {
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        ClearEditText clearEditText;
        Editable text;
        BaseTextView baseTextView2;
        LinearLayout linearLayout2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout3;
        Group group;
        BaseTextView baseTextView4;
        LinearLayout linearLayout4;
        ClearEditText clearEditText2;
        Editable text2;
        BaseTextView baseTextView5;
        LinearLayout linearLayout5;
        BaseTextView baseTextView6;
        LinearLayout linearLayout6;
        if (getView() != null && getHost() != null) {
            if (this.f23822Y > 0) {
                C36874y2 c36874y2M27086K3 = m27086K3();
                if (c36874y2M27086K3 != null && (clearEditText2 = c36874y2M27086K3.f81380i) != null && (text2 = clearEditText2.getText()) != null && text2.length() > 0) {
                    List<QuoteModel> value = m27087L3().m27111r().getValue();
                    if (value != null && (!value.isEmpty())) {
                        C36874y2 c36874y2M27086K4 = m27086K3();
                        if (c36874y2M27086K4 != null && (linearLayout6 = c36874y2M27086K4.f81381j) != null) {
                            C27046k.m66685H(linearLayout6);
                        }
                        C36874y2 c36874y2M27086K5 = m27086K3();
                        if (c36874y2M27086K5 != null && (baseTextView6 = c36874y2M27086K5.f81385n) != null) {
                            C27046k.m66685H(baseTextView6);
                            return;
                        }
                        return;
                    }
                    C36874y2 c36874y2M27086K6 = m27086K3();
                    if (c36874y2M27086K6 != null && (linearLayout5 = c36874y2M27086K6.f81381j) != null) {
                        C27046k.m66700o(linearLayout5);
                    }
                    C36874y2 c36874y2M27086K7 = m27086K3();
                    if (c36874y2M27086K7 != null && (baseTextView5 = c36874y2M27086K7.f81385n) != null) {
                        C27046k.m66685H(baseTextView5);
                        return;
                    }
                    return;
                }
                C36874y2 c36874y2M27086K8 = m27086K3();
                if (c36874y2M27086K8 != null && (linearLayout4 = c36874y2M27086K8.f81381j) != null) {
                    C27046k.m66685H(linearLayout4);
                }
                C36874y2 c36874y2M27086K9 = m27086K3();
                if (c36874y2M27086K9 != null && (baseTextView4 = c36874y2M27086K9.f81385n) != null) {
                    C27046k.m66685H(baseTextView4);
                    return;
                }
                return;
            }
            C36874y2 c36874y2M27086K10 = m27086K3();
            if (c36874y2M27086K10 != null && (group = c36874y2M27086K10.f81384m) != null) {
                C27046k.m66700o(group);
            }
            C36874y2 c36874y2M27086K11 = m27086K3();
            if (c36874y2M27086K11 != null && (clearEditText = c36874y2M27086K11.f81380i) != null && (text = clearEditText.getText()) != null && text.length() > 0) {
                List<QuoteModel> value2 = m27087L3().m27111r().getValue();
                if (value2 != null && (!value2.isEmpty())) {
                    C36874y2 c36874y2M27086K12 = m27086K3();
                    if (c36874y2M27086K12 != null && (linearLayout3 = c36874y2M27086K12.f81378g) != null) {
                        C27046k.m66685H(linearLayout3);
                    }
                    C36874y2 c36874y2M27086K13 = m27086K3();
                    if (c36874y2M27086K13 != null && (baseTextView3 = c36874y2M27086K13.f81389r) != null) {
                        C27046k.m66685H(baseTextView3);
                        return;
                    }
                    return;
                }
                C36874y2 c36874y2M27086K14 = m27086K3();
                if (c36874y2M27086K14 != null && (linearLayout2 = c36874y2M27086K14.f81378g) != null) {
                    C27046k.m66700o(linearLayout2);
                }
                C36874y2 c36874y2M27086K15 = m27086K3();
                if (c36874y2M27086K15 != null && (baseTextView2 = c36874y2M27086K15.f81389r) != null) {
                    C27046k.m66685H(baseTextView2);
                    return;
                }
                return;
            }
            C36874y2 c36874y2M27086K16 = m27086K3();
            if (c36874y2M27086K16 != null && (linearLayout = c36874y2M27086K16.f81378g) != null) {
                C27046k.m66685H(linearLayout);
            }
            C36874y2 c36874y2M27086K17 = m27086K3();
            if (c36874y2M27086K17 != null && (baseTextView = c36874y2M27086K17.f81389r) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Window window;
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            KeyboardUtils.m6044p(window);
        }
    }
}
