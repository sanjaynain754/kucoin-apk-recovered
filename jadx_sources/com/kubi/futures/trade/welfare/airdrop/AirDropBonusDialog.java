package com.kubi.futures.trade.welfare.airdrop;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bi.C4609a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.welfare.FuturesTradeProUnavailableDialog;
import com.kubi.futures.trade.welfare.distribution.DistributionRetentionDialog;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36745d;
import f00.C37304a;
import fm.C37567b;
import g00.InterfaceC37752d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k10.DialogC40864b;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p836zl.C46894j;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AirDropBonusDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J \u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020)H\u0002J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u000bH\u0002J\b\u0010;\u001a\u00020)H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirDropBonusDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "getEntity", "()Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "entity$delegate", "Lkotlin/Lazy;", "trialCode", "", "getTrialCode", "()Ljava/lang/String;", "trialCode$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogAirdropBonusBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogAirdropBonusBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "countDownTimer", "Landroid/os/CountDownTimer;", "viewModel", "Lcom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel;", "viewModel$delegate", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleKlineFlatten", "", "", "setCountDownString", "days", "hours", "minutes", "startTimeCountDownText", "formatLong", "time", "", "showLoading", "hideLoading", "recordAirdrop", "activeAirdrop", "side", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirDropBonusDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirDropBonusDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropBonusDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,477:1\n143#2,20:478\n106#3,15:498\n1563#4:513\n1634#4,3:514\n67#5:517\n58#5,2:518\n*S KotlinDebug\n*F\n+ 1 AirDropBonusDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropBonusDialog\n*L\n105#1:478,20\n108#1:498,15\n291#1:513\n291#1:514,3\n352#1:517\n355#1:518,2\n*E\n"})
public final class AirDropBonusDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f24542q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirDropBonusDialog.m28311w4(this.f24606b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24543r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirDropBonusDialog.m28298P4(this.f24608b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f24544s0 = C45681e.m100799e(this, new Function1<AirDropBonusDialog, C36745d>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36745d invoke(@NotNull AirDropBonusDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36745d.m82341a(fragment.requireView());
        }
    }, new Function1<C36745d, Unit>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36745d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36745d c36745d) {
            invoke(c36745d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public CountDownTimer f24545t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24546u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public DialogC40864b f24547v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f24541x0 = {Reflection.property1(new PropertyReference1Impl(AirDropBonusDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAirdropBonusBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f24540w0 = new Companion(null);

    /* JADX INFO: compiled from: AirDropBonusDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirDropBonusDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "trialCode", "", "AIRDROP_BONUS_DIALOG_KEY", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @Nullable AirdropBonusEntity entity, @Nullable String trialCode) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            AirDropBonusDialog airDropBonusDialog = new AirDropBonusDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", entity);
            bundle.putString("data_1", trialCode);
            airDropBonusDialog.setArguments(bundle);
            airDropBonusDialog.show(manager, "AirDropBonusDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$a */
    /* JADX INFO: compiled from: AirDropBonusDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14195a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24548b;

        public C14195a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24548b = function;
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
            return this.f24548b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24548b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$b */
    /* JADX INFO: compiled from: AirDropBonusDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/futures/trade/welfare/airdrop/AirDropBonusDialog$startTimeCountDownText$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC14196b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AirDropBonusDialog f24549a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC14196b(long j11, AirDropBonusDialog airDropBonusDialog) {
            super(j11, 1000L);
            this.f24549a = airDropBonusDialog;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f24549a.m28317N4("00", "00", "00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long days = timeUnit.toDays(millisUntilFinished);
            long hours = timeUnit.toHours(millisUntilFinished) % ((long) 24);
            long minutes = timeUnit.toMinutes(millisUntilFinished) % ((long) 60);
            AirDropBonusDialog airDropBonusDialog = this.f24549a;
            airDropBonusDialog.m28317N4(airDropBonusDialog.m28320x4(days), this.f24549a.m28320x4(hours), this.f24549a.m28320x4(minutes));
        }
    }

    /* JADX INFO: renamed from: D4 */
    private final void m28289D4() {
        DialogC40864b dialogC40864b = this.f24547v0;
        if (dialogC40864b != null) {
            dialogC40864b.m89436a(true);
        }
        this.f24547v0 = null;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m28291F4(ContractEntity contractEntity) {
        InterfaceC37752d.a.m85122a(C37304a.f82764a, C27041f.m66668h(contractEntity.getSymbol()), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m28292G4(AirDropBonusDialog airDropBonusDialog) {
        AirdropRuleDialog.Companion companion = AirdropRuleDialog.f24579u0;
        FragmentManager childFragmentManager = airDropBonusDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, C27041f.m66668h(airDropBonusDialog.m28312z4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m28294I4(AirDropBonusDialog airDropBonusDialog) {
        C43852m.m96591c("B6futures", "AirDropPositionOpenActive", "1", null, 8, null);
        airDropBonusDialog.m28319v4("buy");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m28295J4(AirDropBonusDialog airDropBonusDialog) {
        C43852m.m96591c("B6futures", "AirDropPositionOpenActive", "2", null, 8, null);
        airDropBonusDialog.m28319v4("sell");
        return Unit.INSTANCE;
    }

    private final void showLoading() {
        DialogC40864b dialogC40864b = this.f24547v0;
        if (dialogC40864b != null) {
            dialogC40864b.m89436a(true);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DialogC40864b dialogC40864b2 = new DialogC40864b(contextRequireContext, false, 2, null);
        dialogC40864b2.show();
        this.f24547v0 = dialogC40864b2;
    }

    /* JADX INFO: renamed from: z4 */
    private final String m28312z4() {
        return (String) this.f24543r0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final C36745d m28313A4() {
        return (C36745d) this.f24544s0.getValue(this, f24541x0[0]);
    }

    /* JADX INFO: renamed from: B4 */
    public final AirDropBonusViewModel m28314B4() {
        return (AirDropBonusViewModel) this.f24546u0.getValue();
    }

    /* JADX INFO: renamed from: M4 */
    public final void m28316M4() {
        C46894j c46894j = C46894j.f104736a;
        C46392a.m102329l(c46894j.m103265e(C27041f.m66668h(m28312z4())), C46392a.m102323e(c46894j.m103265e(C27041f.m66668h(m28312z4())), 0) + 1);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m28318O4() {
        long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v();
        AirdropBonusEntity airdropBonusEntityM28321y4 = m28321y4();
        long jMax = Math.max(C27039d.m66653m(airdropBonusEntityM28321y4 != null ? airdropBonusEntityM28321y4.getExpireTime() : null, jMo25031v) - jMo25031v, 0L);
        if (jMax <= 0) {
            return;
        }
        CountDownTimer countDownTimer = this.f24545t0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC14196b countDownTimerC14196b = new CountDownTimerC14196b(jMax, this);
        this.f24545t0 = countDownTimerC14196b;
        countDownTimerC14196b.start();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_airdrop_bonus, container, false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CountDownTimer countDownTimer = this.f24545t0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f24545t0 = null;
        super.onDestroyView();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        int iM66512a;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36745d c36745dM28313A4 = m28313A4();
        if (c36745dM28313A4 == null) {
            return;
        }
        final AirdropBonusEntity airdropBonusEntityM28321y4 = m28321y4();
        if (airdropBonusEntityM28321y4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        Context context = c36745dM28313A4.getRoot().getContext();
        c36745dM28313A4.f79843j.setText("🎉 " + getString(R$string.kumex_airdrop_get_title));
        c36745dM28313A4.f79842i.setText(getString(R$string.kumex_distribution_dialog_desc));
        final ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(airdropBonusEntityM28321y4.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null) {
            dismissAllowingStateLoss();
            return;
        }
        C43852m.m96595g("B6futures", "AirDropPosition", null, null, 12, null);
        m28316M4();
        final String strM66669i = C27041f.m66669i(contractEntityM99529O.getSettleCurrency(), "USDT");
        final int iM84623m = C37567b.m84623m(contractEntityM99529O);
        C46340c<Drawable> c46340cMo6634v = C46338a.m102152b(c36745dM28313A4.f79846m).mo6634v(C27041f.m66668h(airdropBonusEntityM28321y4.getContractIcon()));
        int i11 = R$mipmap.ic_placeholder;
        c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(c36745dM28313A4.f79846m);
        c36745dM28313A4.f79850q.setText(Intrinsics.areEqual(airdropBonusEntityM28321y4.getMarginMode(), "CROSS") ? getString(R$string.kumex_cross_position) : getString(R$string.kumex_isolate_position));
        c36745dM28313A4.f79847n.setText(C42180b.m92647l(C17054k0.m36529c(airdropBonusEntityM28321y4.getLeverage(), false)));
        c36745dM28313A4.f79835b.setText(getString(R$string.kumex_airdrop_card_title));
        c36745dM28313A4.f79857x.setText(FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O));
        AppCompatTextView appCompatTextView = c36745dM28313A4.f79852s;
        BigDecimal price = airdropBonusEntityM28321y4.getPrice();
        appCompatTextView.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C37567b.m84618h(contractEntityM99529O), false, false, false, 0, null, 125, null) : null));
        AppCompatTextView appCompatTextView2 = c36745dM28313A4.f79853t;
        BigDecimal priceChgPct = airdropBonusEntityM28321y4.getPriceChgPct();
        appCompatTextView2.setText(priceChgPct != null ? C42180b.m92642g(priceChgPct, null, null, 0, false, false, false, 63, null) : null);
        AppCompatTextView appCompatTextView3 = c36745dM28313A4.f79853t;
        Context context2 = appCompatTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView3.setTextColor(C22890g.m54282g(context2, C27039d.m66656p(airdropBonusEntityM28321y4.getPriceChgPct()), 0, 2, null));
        c36745dM28313A4.f79833A.setText(getString(R$string.kumex_airdrop_es_value, strM66669i));
        BigDecimal bigDecimalMultiply = C27039d.m66656p(airdropBonusEntityM28321y4.getLeverage()).multiply(C27039d.m66656p(airdropBonusEntityM28321y4.getTrialAmount()));
        BaseTextView baseTextView = c36745dM28313A4.f79859z;
        Intrinsics.checkNotNull(bigDecimalMultiply);
        baseTextView.setText(C42180b.m92640e(bigDecimalMultiply, null, iM84623m, false, false, false, 0, null, 125, null));
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(new BigDecimal("0.1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        c36745dM28313A4.f79844k.setText(getString(R$string.kumex_airdrop_es_pnl_tips, "10%", C42828b.m93906g(C42180b.m92640e(bigDecimalMultiply2, null, iM84623m, false, false, false, 0, null, 125, null), strM66669i, true, false, 4, null)));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        ShapeTextView hint = c36745dM28313A4.f79844k;
        Intrinsics.checkNotNullExpressionValue(hint, "hint");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        highlightTextHelper.m54120f(hint, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(c27017c.m66512a(R$color.primary))));
        c36745dM28313A4.f79838e.setText(getString(R$string.kumex_distribution_order_dialog_up) + '/' + getString(R$string.contract_long));
        c36745dM28313A4.f79855v.setText(getString(R$string.kumex_distribution_order_dialog_down) + '/' + getString(R$string.contract_short));
        KcPrimaryButton kcPrimaryButton = c36745dM28313A4.f79838e;
        int i12 = R$color.c_text_white;
        kcPrimaryButton.setTextColor(c27017c.m66512a(i12));
        c36745dM28313A4.f79855v.setTextColor(c27017c.m66512a(i12));
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        boolean z11 = C27039d.m66656p(airdropBonusEntityM28321y4.getPriceChgPct()).compareTo(BigDecimal.ZERO) >= 0;
        if (zM33189n) {
            iM66512a = z11 ? c27017c.m66512a(R$color.primary20) : c27017c.m66512a(R$color.secondary20);
        } else {
            iM66512a = z11 ? c27017c.m66512a(R$color.secondary20) : c27017c.m66512a(R$color.primary20);
        }
        Intrinsics.checkNotNull(context);
        int iM54291p = C22890g.m54291p(context);
        int iM54289n = C22890g.m54289n(context);
        c36745dM28313A4.f79839f.m54911a(m28315C4(), z11 ? iM54291p : iM54289n, iM66512a);
        c36745dM28313A4.f79838e.setBackgroundColorInt(iM54291p);
        c36745dM28313A4.f79855v.setBackgroundColorInt(iM54289n);
        m28317N4("00", "00", "00");
        m28318O4();
        AppCompatTextView price2 = c36745dM28313A4.f79852s;
        Intrinsics.checkNotNullExpressionValue(price2, "price");
        C27046k.m66711z(price2, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropBonusDialog.m28291F4(contractEntityM99529O);
            }
        }, 1, null);
        BaseTextView rule = c36745dM28313A4.f79854u;
        Intrinsics.checkNotNullExpressionValue(rule, "rule");
        C27046k.m66711z(rule, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropBonusDialog.m28292G4(this.f24588b);
            }
        }, 1, null);
        ImageView close = c36745dM28313A4.f79840g;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropBonusDialog.m28293H4(this.f24590b);
            }
        }, 1, null);
        KcPrimaryButton buy = c36745dM28313A4.f79838e;
        Intrinsics.checkNotNullExpressionValue(buy, "buy");
        C27046k.m66711z(buy, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropBonusDialog.m28294I4(this.f24592b);
            }
        }, 1, null);
        KcPrimaryButton sell = c36745dM28313A4.f79855v;
        Intrinsics.checkNotNullExpressionValue(sell, "sell");
        C27046k.m66711z(sell, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropBonusDialog.m28295J4(this.f24594b);
            }
        }, 1, null);
        m28314B4().m28329A().observe(getViewLifecycleOwner(), new C14195a(new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirDropBonusDialog.m28296K4(this.f24596b, strM66669i, (Pair) obj);
            }
        }));
        m28314B4().m28330B().observe(getViewLifecycleOwner(), new C14195a(new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirDropBonusDialog.m28297L4(this.f24599b, (Boolean) obj);
            }
        }));
        m28314B4().m28334y().observe(getViewLifecycleOwner(), new C14195a(new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirDropBonusDialog.m28290E4(airdropBonusEntityM28321y4, iM84623m, strM66669i, this, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m28319v4(String str) {
        if (!KuMexDepend.f30378a.m35906h()) {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
            return;
        }
        AirDropBonusViewModel airDropBonusViewModelM28314B4 = m28314B4();
        String strM28312z4 = m28312z4();
        if (strM28312z4 == null) {
            strM28312z4 = "";
        }
        airDropBonusViewModelM28314B4.m28331t(strM28312z4, str);
    }

    /* JADX INFO: renamed from: x4 */
    public final String m28320x4(long j11) {
        if (j11 >= 10) {
            return String.valueOf(j11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('0');
        sb2.append(j11);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: y4 */
    public final AirdropBonusEntity m28321y4() {
        return (AirdropBonusEntity) this.f24542q0.getValue();
    }

    public AirDropBonusDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewModels$default$2
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
        this.f24546u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AirDropBonusViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m28290E4(AirdropBonusEntity airdropBonusEntity, int i11, String str, AirDropBonusDialog airDropBonusDialog, Pair pair) {
        String strM92640e;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            BigDecimal trialAmount = airdropBonusEntity.getTrialAmount();
            if (trialAmount != null) {
                strM92640e = C42180b.m92640e(trialAmount, null, i11, false, false, false, 0, null, 125, null);
            } else {
                strM92640e = null;
            }
            String name = C4609a.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            C12572a.m23695d(name, new C4609a(strM92640e + ' ' + str, C27041f.m66668h(airDropBonusDialog.m28312z4())), 0L, 4, null);
            airDropBonusDialog.dismiss();
        } else {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) pair.getSecond();
            if (futuresWelfareTrialItemEntity != null && futuresWelfareTrialItemEntity.isTradeProTrial()) {
                FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog = new FuturesTradeProUnavailableDialog();
                Bundle bundle = new Bundle();
                bundle.putParcelable("data", (Parcelable) pair.getSecond());
                futuresTradeProUnavailableDialog.setArguments(bundle);
                FragmentManager childFragmentManager = airDropBonusDialog.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                futuresTradeProUnavailableDialog.show(childFragmentManager, "FuturesTradeProUnavailableDialog");
                return Unit.INSTANCE;
            }
            airDropBonusDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m28293H4(AirDropBonusDialog airDropBonusDialog) {
        airDropBonusDialog.showLoading();
        airDropBonusDialog.m28314B4().m28333x(C27041f.m66668h(airDropBonusDialog.m28312z4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m28296K4(AirDropBonusDialog airDropBonusDialog, String str, Pair pair) {
        airDropBonusDialog.m28289D4();
        DistributionRetentionEntity distributionRetentionEntity = (DistributionRetentionEntity) pair.getSecond();
        if (distributionRetentionEntity != null) {
            DistributionRetentionDialog.Companion companion = DistributionRetentionDialog.f24705g0;
            FragmentManager childFragmentManager = airDropBonusDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            distributionRetentionEntity.setCurrency(str);
            Unit unit = Unit.INSTANCE;
            companion.show(childFragmentManager, distributionRetentionEntity, R$string.kumex_distribution_retention_dialog_desc, true);
        } else {
            airDropBonusDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m28297L4(AirDropBonusDialog airDropBonusDialog, Boolean bool) {
        if (bool.booleanValue()) {
            airDropBonusDialog.showLoading();
        } else {
            airDropBonusDialog.m28289D4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final String m28298P4(AirDropBonusDialog airDropBonusDialog) {
        Bundle arguments = airDropBonusDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public static final AirdropBonusEntity m28311w4(AirDropBonusDialog airDropBonusDialog) {
        Bundle arguments = airDropBonusDialog.getArguments();
        if (arguments != null) {
            return (AirdropBonusEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public final List<Double> m28315C4() {
        List<List<Double>> klineData;
        AirdropBonusEntity airdropBonusEntityM28321y4 = m28321y4();
        if (airdropBonusEntityM28321y4 != null && (klineData = airdropBonusEntityM28321y4.getKlineData()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(klineData, 10));
            Iterator<T> it = klineData.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((Number) ((List) it.next()).get(1)).doubleValue()));
            }
            List<Double> listReversed = CollectionsKt.reversed(arrayList);
            if (listReversed != null) {
                return listReversed;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: N4 */
    public final void m28317N4(String str, String str2, String str3) {
        C36745d c36745dM28313A4 = m28313A4();
        if (c36745dM28313A4 == null) {
            return;
        }
        c36745dM28313A4.f79841h.setText(str);
        c36745dM28313A4.f79845l.setText(str2);
        c36745dM28313A4.f79851r.setText(str3);
    }
}
