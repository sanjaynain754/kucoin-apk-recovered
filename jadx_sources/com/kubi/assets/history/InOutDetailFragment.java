package com.kubi.assets.history;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.C2711C;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.AssetHelperDialog;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.withdraw.r6;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.CoinProperty;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37885i;
import gf.C37886j;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p569qq.C43852m;
import p637ta.C44825n2;
import p637ta.C44862s4;
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
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: InOutDetailFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002EFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0017J\b\u0010(\u001a\u00020#H\u0016J$\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010-\u001a\u00020+H\u0007J\"\u0010.\u001a\u0004\u0018\u00010\r2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001002\u0006\u00101\u001a\u00020\rH\u0002J$\u00102\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u00104\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u00105\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u00106\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u00107\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0003J\u0012\u00108\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u00109\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0003J\u0012\u0010:\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010;\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010<\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010=\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\"\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0002J\u0012\u0010@\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010?\u001a\u00020\rH\u0002J\b\u0010B\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020#H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\n \u0011*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, m90084d2 = {"Lcom/kubi/assets/history/InOutDetailFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentInoutDeitalBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentInoutDeitalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "fromPageId", "", "url", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "Lkotlin/Lazy;", "api", "Lcom/kubi/assets/withdraw/chain/WithdrawChainApi;", "getApi", "()Lcom/kubi/assets/withdraw/chain/WithdrawChainApi;", "api$delegate", "mHistoryRecordEntity", "Lcom/kubi/assets/entity/HistoryRecordEntity;", "historyHelper", "Lcom/kubi/assets/history/HistoryHelper;", "refreshTimer", "Ljava/util/Timer;", "cancelRefreshTimer", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAgainShow", "setData", "isWithDraw", "", "hisRecord", "showLoading", "formatTaxesWithCurrency", "taxes", "", FirebaseAnalytics.Param.CURRENCY, "getChainInfo", "setPageId", "checkoutStatus", "buildSubStatus", "buildWithdrawalAccountName", "toWithdrawalProcessing", "buildDepositAccountName", "toDepositProcessing", "toDefault", "cancelWithdraw", "buildWithdrawKcsRewardTip", "loadWithdrawKcsRewardTip", "loadData", "id", "isIncompleteStatus", "startRefreshStatusTimer", "stopRefreshStatusTimer", "startRefreshCancelTimer", "onDestroyView", "MyClickableSpan", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInOutDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InOutDetailFragment.kt\ncom/kubi/assets/history/InOutDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n147#2,16:670\n774#3:686\n865#3,2:687\n774#3:690\n865#3,2:691\n1803#3,3:693\n1#4:689\n*S KotlinDebug\n*F\n+ 1 InOutDetailFragment.kt\ncom/kubi/assets/history/InOutDetailFragment\n*L\n79#1:670,16\n268#1:686\n268#1:687,2\n392#1:690\n392#1:691,2\n394#1:693,3\n*E\n"})
public final class InOutDetailFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    @Nullable
    public String f17610W;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public HistoryRecordEntity f17613Z;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public Timer f17615b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public Timer f17616c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f17607e0 = {Reflection.property1(new PropertyReference1Impl(InOutDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentInoutDeitalBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f17606d0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17608U = C45681e.m100799e(this, new Function1<InOutDetailFragment, C44862s4>() { // from class: com.kubi.assets.history.InOutDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44862s4 invoke(@NotNull InOutDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44862s4.m99248a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44862s4, Unit>() { // from class: com.kubi.assets.history.InOutDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44862s4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44862s4 c44862s4) {
            invoke(c44862s4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f17609V = "none";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17611X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.history.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InOutDetailFragment.m17213U3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f17612Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.history.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InOutDetailFragment.m17212T3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HistoryHelper f17614a0 = new HistoryHelper();

    /* JADX INFO: compiled from: InOutDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/history/InOutDetailFragment$Companion;", "", "<init>", "()V", "time", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.history.InOutDetailFragment$a */
    /* JADX INFO: compiled from: InOutDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/history/InOutDetailFragment$MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "activity", "Landroidx/fragment/app/FragmentActivity;", "color", "", "id", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getColor", "()I", "getId", "()Ljava/lang/String;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "onClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10133a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final FragmentActivity f17617b;

        /* JADX INFO: renamed from: c */
        public final int f17618c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final String f17619d;

        public C10133a(@NotNull FragmentActivity activity, int i11, @NotNull String id2) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f17617b = activity;
            this.f17618c = i11;
            this.f17619d = id2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C43852m.m96591c(this.f17619d, "contactCS", null, null, 12, null);
            AssetsHelper.f18684a.m19154H(this.f17617b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(this.f17618c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.history.InOutDetailFragment$b */
    /* JADX INFO: compiled from: InOutDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/history/InOutDetailFragment$getChainInfo$4", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10134b extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ HistoryRecordEntity f17621e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10134b(HistoryRecordEntity historyRecordEntity) {
            super(InOutDetailFragment.this);
            this.f17621e = historyRecordEntity;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            InOutDetailFragment.this.m17252O4(this.f17621e);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.history.InOutDetailFragment$c */
    /* JADX INFO: compiled from: InOutDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/assets/history/InOutDetailFragment$startRefreshCancelTimer$timerTask$1", "Ljava/util/TimerTask;", "run", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10135c extends TimerTask {
        public C10135c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = new Handler(Looper.getMainLooper());
            final InOutDetailFragment inOutDetailFragment = InOutDetailFragment.this;
            handler.post(new Runnable() { // from class: com.kubi.assets.history.j0
                @Override // java.lang.Runnable
                public final void run() {
                    InOutDetailFragment.C10135c.m17271b(inOutDetailFragment);
                }
            });
            HistoryRecordEntity historyRecordEntity = InOutDetailFragment.this.f17613Z;
            if (Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getCancelType() : null), "CANCELING")) {
                return;
            }
            Timer timer = InOutDetailFragment.this.f17616c0;
            if (timer != null) {
                timer.cancel();
            }
            InOutDetailFragment.this.f17616c0 = null;
        }

        /* JADX INFO: renamed from: b */
        public static final void m17271b(InOutDetailFragment inOutDetailFragment) {
            String str;
            HistoryRecordEntity historyRecordEntity = inOutDetailFragment.f17613Z;
            if (historyRecordEntity != null) {
                str = historyRecordEntity.id;
            } else {
                str = null;
            }
            inOutDetailFragment.m17267r4(C27041f.m66668h(str), true, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.history.InOutDetailFragment$d */
    /* JADX INFO: compiled from: InOutDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/assets/history/InOutDetailFragment$startRefreshStatusTimer$timerTask$1", "Ljava/util/TimerTask;", "run", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10136d extends TimerTask {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17624c;

        /* JADX INFO: renamed from: b */
        public static final void m17273b(InOutDetailFragment inOutDetailFragment, String str) {
            inOutDetailFragment.m17267r4(str, true, false);
        }

        public C10136d(String str) {
            this.f17624c = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = new Handler(Looper.getMainLooper());
            final InOutDetailFragment inOutDetailFragment = InOutDetailFragment.this;
            final String str = this.f17624c;
            handler.post(new Runnable() { // from class: com.kubi.assets.history.k0
                @Override // java.lang.Runnable
                public final void run() {
                    InOutDetailFragment.C10136d.m17273b(inOutDetailFragment, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m17256W3(HistoryRecordEntity historyRecordEntity) {
        HistoryRecordEntity historyRecordEntity2;
        String statusString$default;
        C44825n2 c44825n2;
        BaseTextView baseTextView;
        C44825n2 c44825n3;
        BaseTextView baseTextView2;
        C44825n2 c44825n4;
        BaseTextView baseTextView3;
        C44825n2 c44825n5;
        BaseTextView baseTextView4;
        if (historyRecordEntity != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            historyRecordEntity2 = historyRecordEntity;
            statusString$default = HistoryRecordEntity.getStatusString$default(historyRecordEntity2, mContext, true, historyRecordEntity, false, 8, null);
        } else {
            historyRecordEntity2 = historyRecordEntity;
            statusString$default = null;
        }
        if (Intrinsics.areEqual(statusString$default, getString(R$string.deposit_withdraw_processing))) {
            C44862s4 c44862s4M17264k4 = m17264k4();
            if (c44862s4M17264k4 == null || (c44825n5 = c44862s4M17264k4.f100817W) == null || (baseTextView4 = c44825n5.f100499k) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView4);
            return;
        }
        C44862s4 c44862s4M17264k5 = m17264k4();
        if (c44862s4M17264k5 != null && (c44825n4 = c44862s4M17264k5.f100817W) != null && (baseTextView3 = c44825n4.f100499k) != null) {
            baseTextView3.setText(statusString$default);
        }
        C44862s4 c44862s4M17264k6 = m17264k4();
        if (c44862s4M17264k6 != null && (c44825n3 = c44862s4M17264k6.f100817W) != null && (baseTextView2 = c44825n3.f100499k) != null) {
            baseTextView2.setTextColor(getColorRes(historyRecordEntity2 != null ? HistoryRecordEntity.getStatusColor$default(historyRecordEntity2, true, null, 2, null) : R$color.c_text60));
        }
        C44862s4 c44862s4M17264k7 = m17264k4();
        if (c44862s4M17264k7 == null || (c44825n2 = c44862s4M17264k7.f100817W) == null || (baseTextView = c44825n2.f100499k) == null) {
            return;
        }
        ViewExtKt.m66594y(baseTextView);
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m17260f4(HistoryRecordEntity historyRecordEntity) {
        if (!Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.status : null), "PROCESSING")) {
            if (!Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.status : null), "REVIEW")) {
                if (!Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.status : null), "WALLET_PROCESSING")) {
                    return false;
                }
            }
        }
        if (C27025c.m66566d(historyRecordEntity != null ? Boolean.valueOf(historyRecordEntity.isInner) : null)) {
            return false;
        }
        return !Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getSubStatus() : null, "COMPLIANCE_PENDING");
    }

    /* JADX INFO: renamed from: g4 */
    public final String m17261g4(List<String> list, final String str) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (DowngradeExKt.m66535e((String) obj, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                return CollectionsKt.joinToString$default(arrayList2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, new Function1() { // from class: com.kubi.assets.history.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return InOutDetailFragment.m17219h4(str, (String) obj2);
                    }
                }, 30, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m17183A4(InOutDetailFragment inOutDetailFragment) {
        HistoryRecordEntity historyRecordEntity = inOutDetailFragment.f17613Z;
        if (Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getCancelType() : null, "CANCELING")) {
            inOutDetailFragment.m17249L4();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m17186C4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(C27017c.f54310a.m66516f(R$string.asset_withdraw_tax_tip1, new Object[0])).m54156M4(historyRecordEntity != null ? historyRecordEntity.getTaxDescription() : null).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = inOutDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "AlertDialogFragmentHelper");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m17188D4(boolean z11) {
        if (z11) {
            C43852m.m96591c("withdrawRecordDetail", "statButton", "1", null, 8, null);
        } else {
            C43852m.m96591c("depositRecordDetail", "statButton", "1", null, 8, null);
        }
        AssetsHelper.f18684a.m19155I();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m17190E4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        C27057k.m66746b(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getMemo() : null));
        ToastCompat.m66441G(inOutDetailFragment.getString(R$string.copy_success), new Object[0]);
        Object systemService = inOutDetailFragment.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m17192F4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        C27057k.m66746b(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.id : null));
        ToastCompat.m66441G(inOutDetailFragment.getString(R$string.copy_success), new Object[0]);
        C43852m.m96591c(C27041f.m66668h(inOutDetailFragment.getF34283V()), "copyOrderId", null, null, 12, null);
        Object systemService = inOutDetailFragment.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m17194G4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        C27057k.m66746b(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getAddress() : null));
        ToastCompat.m66441G(inOutDetailFragment.getString(R$string.copy_success), new Object[0]);
        C43852m.m96591c(C27041f.m66668h(inOutDetailFragment.getF34283V()), "copyAddress", null, null, 12, null);
        Object systemService = inOutDetailFragment.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m17196H4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        C27057k.m66746b(historyRecordEntity != null ? historyRecordEntity.getWalletTxIdStr() : null);
        ToastCompat.m66441G(inOutDetailFragment.getString(R$string.copy_success), new Object[0]);
        C43852m.m96591c(C27041f.m66668h(inOutDetailFragment.getF34283V()), "copyHash", null, null, 12, null);
        Object systemService = inOutDetailFragment.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m17198I4(HistoryRecordEntity historyRecordEntity, InOutDetailFragment inOutDetailFragment) {
        C27057k.m66746b(historyRecordEntity != null ? historyRecordEntity.getWalletTxIdStr() : null);
        ToastCompat.m66441G(inOutDetailFragment.getString(R$string.copy_success), new Object[0]);
        C43852m.m96591c(C27041f.m66668h(inOutDetailFragment.getF34283V()), "copyHash", null, null, 12, null);
        Object systemService = inOutDetailFragment.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m17200J4(InOutDetailFragment inOutDetailFragment, HistoryRecordEntity historyRecordEntity) {
        String str = inOutDetailFragment.f17610W;
        if (str == null || str.length() == 0) {
            inOutDetailFragment.m17252O4(historyRecordEntity);
        } else {
            C37304a c37304a = C37304a.f82764a;
            String str2 = inOutDetailFragment.f17610W;
            Intrinsics.checkNotNull(str2);
            InterfaceC37766r.a.m85190a(c37304a, str2, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Z3 */
    public static final CharSequence m17214Z3(InOutDetailFragment inOutDetailFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.hashCode()) {
            case -2027980370:
                if (it.equals("MARGIN")) {
                    String string = inOutDetailFragment.getString(R$string.margin_whole_account);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
                break;
            case -1704036199:
                if (it.equals("SAVINGS")) {
                    String string2 = inOutDetailFragment.getString(R$string.kc_asset_earn_account);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
                break;
            case 2358713:
                if (it.equals("MAIN")) {
                    String string3 = inOutDetailFragment.getString(R$string.save_account);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                }
                break;
            case 80083268:
                if (it.equals("TRADE")) {
                    String string4 = inOutDetailFragment.getString(R$string.trade_account);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                }
                break;
            case 215679250:
                if (it.equals("CONTRACT")) {
                    String string5 = inOutDetailFragment.getString(R$string.futures_account);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    return string5;
                }
                break;
            case 2053881305:
                if (it.equals("TRADE_HF")) {
                    String string6 = inOutDetailFragment.getString(R$string.deposit_account_high);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    return string6;
                }
                break;
        }
        String string7 = inOutDetailFragment.getString(R$string.deposit_other_account);
        Intrinsics.checkNotNull(string7);
        return string7;
    }

    /* JADX INFO: renamed from: h4 */
    public static final CharSequence m17219h4(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C37885i.m85569h(it, str, (126 & 2) != 0 ? RoundingMode.DOWN : null, (126 & 4) != 0 ? false : false, (126 & 8) != 0 ? false : false, (126 & 16) == 0 ? false : false, (126 & 32) != 0, (126 & 64) != 0 ? "0.00" : null) + ' ' + str;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m17223m4(boolean z11, InOutDetailFragment inOutDetailFragment, Disposable disposable) {
        if (z11) {
            inOutDetailFragment.showDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m17227o4(boolean z11, InOutDetailFragment inOutDetailFragment) {
        if (z11) {
            inOutDetailFragment.hideDialogLoading();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static /* synthetic */ void m17233s4(InOutDetailFragment inOutDetailFragment, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        inOutDetailFragment.m17267r4(str, z11, z12);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m17235t4(boolean z11, InOutDetailFragment inOutDetailFragment, Disposable disposable) {
        if (z11) {
            inOutDetailFragment.showDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m17239v4(boolean z11, InOutDetailFragment inOutDetailFragment) {
        if (z11) {
            inOutDetailFragment.hideDialogLoading();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m17244y4(InOutDetailFragment inOutDetailFragment) {
        AssetHelperDialog assetHelperDialog = AssetHelperDialog.f16924a;
        FragmentManager childFragmentManager = inOutDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        assetHelperDialog.m15980o(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:218:0x02c9  */
    @SuppressLint({"SetTextI18n", "KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: B4 */
    public final void m17247B4(boolean z11, @Nullable final HistoryRecordEntity historyRecordEntity, boolean z12) {
        final boolean z13;
        ImageView imageView;
        ImageView imageView2;
        C44862s4 c44862s4M17264k4;
        C44862s4 c44862s4M17264k5;
        ImageView imageView3;
        ImageView imageView4;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        TextPaint paint;
        BaseTextView baseTextView3;
        TextPaint paint2;
        ImageView imageView5;
        ImageView imageView6;
        ShapeLinearLayout shapeLinearLayout;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        RelativeLayout relativeLayout;
        ImageView imageView7;
        BaseTextView baseTextView9;
        ImageView imageView8;
        ImageView imageView9;
        BaseTextView baseTextView10;
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        BaseTextView baseTextView11;
        String remark;
        BaseTextView baseTextView12;
        String chainName;
        ImageView imageView10;
        BaseTextView baseTextView13;
        RelativeLayout relativeLayout2;
        BaseTextView baseTextView14;
        BaseTextView baseTextView15;
        String statusString$default;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        AutoTextView autoTextView;
        BigDecimal bigDecimal;
        C44862s4 c44862s4M17264k6 = m17264k4();
        if (c44862s4M17264k6 != null && (autoTextView = c44862s4M17264k6.f100840w) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((historyRecordEntity == null || (bigDecimal = historyRecordEntity.amount) == null) ? null : C37886j.m85578b(bigDecimal, C27041f.m66668h(historyRecordEntity.code), null, false, false, false, 0, null, 0, 254, null));
            sb2.append(' ');
            sb2.append(C27041f.m66677q(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.currencyName : null)));
            autoTextView.setText(sb2.toString());
        }
        C44862s4 c44862s4M17264k7 = m17264k4();
        if (c44862s4M17264k7 != null && (baseTextView17 = c44862s4M17264k7.f100838u) != null) {
            baseTextView17.setText(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getAddress() : null));
        }
        C44862s4 c44862s4M17264k8 = m17264k4();
        if (c44862s4M17264k8 != null && (baseTextView16 = c44862s4M17264k8.f100810P) != null) {
            baseTextView16.setTextColor(getColorRes(historyRecordEntity != null ? historyRecordEntity.getStatusColor(true, historyRecordEntity) : R$color.c_text60));
        }
        C44862s4 c44862s4M17264k9 = m17264k4();
        if (c44862s4M17264k9 == null || (baseTextView15 = c44862s4M17264k9.f100810P) == null) {
            z13 = z11;
        } else {
            if (historyRecordEntity != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                z13 = z11;
                statusString$default = HistoryRecordEntity.getStatusString$default(historyRecordEntity, mContext, z13, historyRecordEntity, false, 8, null);
            } else {
                z13 = z11;
                statusString$default = null;
            }
            baseTextView15.setText(statusString$default);
        }
        C44862s4 c44862s4M17264k10 = m17264k4();
        if (c44862s4M17264k10 != null && (baseTextView14 = c44862s4M17264k10.f100814T) != null) {
            baseTextView14.setText(C42179a.m92633f(historyRecordEntity != null ? historyRecordEntity.getTime() : System.currentTimeMillis(), null, false, false, null, 15, null));
        }
        String memo = historyRecordEntity != null ? historyRecordEntity.getMemo() : null;
        if (memo != null && memo.length() != 0) {
            C44862s4 c44862s4M17264k11 = m17264k4();
            if (c44862s4M17264k11 != null && (relativeLayout2 = c44862s4M17264k11.f100832o) != null) {
                ViewExtKt.m66594y(relativeLayout2);
            }
            C44862s4 c44862s4M17264k12 = m17264k4();
            if (c44862s4M17264k12 != null && (baseTextView13 = c44862s4M17264k12.f100804J) != null) {
                baseTextView13.setText(historyRecordEntity != null ? historyRecordEntity.getMemo() : null);
            }
            C44862s4 c44862s4M17264k13 = m17264k4();
            if (c44862s4M17264k13 != null && (imageView10 = c44862s4M17264k13.f100821d) != null) {
                C27046k.m66711z(imageView10, 0L, new Function0() { // from class: com.kubi.assets.history.g0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InOutDetailFragment.m17190E4(historyRecordEntity, this);
                    }
                }, 1, null);
            }
        }
        C44862s4 c44862s4M17264k14 = m17264k4();
        if (c44862s4M17264k14 != null && (baseTextView12 = c44862s4M17264k14.f100806L) != null) {
            if (TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getChainName() : null)) {
                chainName = "--";
            } else {
                chainName = historyRecordEntity != null ? historyRecordEntity.getChainName() : null;
            }
            baseTextView12.setText(chainName);
        }
        C44862s4 c44862s4M17264k15 = m17264k4();
        if (c44862s4M17264k15 != null && (baseTextView11 = c44862s4M17264k15.f100807M) != null) {
            String remark2 = historyRecordEntity != null ? historyRecordEntity.getRemark() : null;
            if (remark2 == null || remark2.length() == 0) {
                remark = "--";
            } else {
                remark = historyRecordEntity != null ? historyRecordEntity.getRemark() : null;
            }
            baseTextView11.setText(remark);
        }
        if (!TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getAddressRemark() : null)) {
            C44862s4 c44862s4M17264k16 = m17264k4();
            if (c44862s4M17264k16 != null && (shapeTextView2 = c44862s4M17264k16.f100839v) != null) {
                ViewExtKt.m66594y(shapeTextView2);
            }
            C44862s4 c44862s4M17264k17 = m17264k4();
            if (c44862s4M17264k17 != null && (shapeTextView = c44862s4M17264k17.f100839v) != null) {
                shapeTextView.setText(historyRecordEntity != null ? historyRecordEntity.getAddressRemark() : null);
            }
        }
        if (z13) {
            m17254Q4(historyRecordEntity);
        } else {
            m17253P4(historyRecordEntity);
        }
        C44862s4 c44862s4M17264k18 = m17264k4();
        if (c44862s4M17264k18 != null && (baseTextView10 = c44862s4M17264k18.f100802H) != null) {
            baseTextView10.setText(C27041f.m66669i(historyRecordEntity != null ? historyRecordEntity.id : null, "--"));
        }
        if (TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.id : null)) {
            C44862s4 c44862s4M17264k19 = m17264k4();
            if (c44862s4M17264k19 != null && (imageView9 = c44862s4M17264k19.f100825h) != null) {
                ViewExtKt.m66577h(imageView9);
            }
        } else {
            C44862s4 c44862s4M17264k20 = m17264k4();
            if (c44862s4M17264k20 != null && (imageView2 = c44862s4M17264k20.f100825h) != null) {
                ViewExtKt.m66594y(imageView2);
            }
            C44862s4 c44862s4M17264k21 = m17264k4();
            if (c44862s4M17264k21 != null && (imageView = c44862s4M17264k21.f100825h) != null) {
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.history.h0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InOutDetailFragment.m17192F4(historyRecordEntity, this);
                    }
                }, 1, null);
            }
        }
        C44862s4 c44862s4M17264k22 = m17264k4();
        if (c44862s4M17264k22 != null && (imageView8 = c44862s4M17264k22.f100820c) != null) {
            C27046k.m66711z(imageView8, 0L, new Function0() { // from class: com.kubi.assets.history.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InOutDetailFragment.m17194G4(historyRecordEntity, this);
                }
            }, 1, null);
        }
        C44862s4 c44862s4M17264k23 = m17264k4();
        if (c44862s4M17264k23 != null && (baseTextView9 = c44862s4M17264k23.f100815U) != null) {
            baseTextView9.setText(historyRecordEntity != null ? historyRecordEntity.getWalletTxIdStr() : null);
        }
        if (Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getWalletTxIdStr() : null, "--")) {
            C44862s4 c44862s4M17264k24 = m17264k4();
            if (c44862s4M17264k24 != null && (imageView7 = c44862s4M17264k24.f100822e) != null) {
                imageView7.setVisibility(8);
            }
        } else {
            if (Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.status : null), "FAILURE")) {
                c44862s4M17264k4 = m17264k4();
                if (c44862s4M17264k4 != null && (imageView4 = c44862s4M17264k4.f100822e) != null) {
                    imageView4.setVisibility(0);
                }
                c44862s4M17264k5 = m17264k4();
                if (c44862s4M17264k5 != null && (imageView3 = c44862s4M17264k5.f100822e) != null) {
                    C27046k.m66711z(imageView3, 0L, new Function0() { // from class: com.kubi.assets.history.h
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InOutDetailFragment.m17196H4(historyRecordEntity, this);
                        }
                    }, 1, null);
                }
            } else {
                if (C27025c.m66566d(historyRecordEntity != null ? Boolean.valueOf(historyRecordEntity.isInner) : null)) {
                    c44862s4M17264k4 = m17264k4();
                    if (c44862s4M17264k4 != null) {
                        imageView4.setVisibility(0);
                    }
                    c44862s4M17264k5 = m17264k4();
                    if (c44862s4M17264k5 != null) {
                        C27046k.m66711z(imageView3, 0L, new Function0() { // from class: com.kubi.assets.history.h
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InOutDetailFragment.m17196H4(historyRecordEntity, this);
                            }
                        }, 1, null);
                    }
                } else {
                    C44862s4 c44862s4M17264k25 = m17264k4();
                    if (c44862s4M17264k25 != null && (imageView6 = c44862s4M17264k25.f100822e) != null) {
                        imageView6.setVisibility(0);
                    }
                    C44862s4 c44862s4M17264k26 = m17264k4();
                    if (c44862s4M17264k26 != null && (imageView5 = c44862s4M17264k26.f100822e) != null) {
                        C27046k.m66711z(imageView5, 0L, new Function0() { // from class: com.kubi.assets.history.i
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InOutDetailFragment.m17198I4(historyRecordEntity, this);
                            }
                        }, 1, null);
                    }
                    C44862s4 c44862s4M17264k27 = m17264k4();
                    if (c44862s4M17264k27 != null && (baseTextView3 = c44862s4M17264k27.f100815U) != null && (paint2 = baseTextView3.getPaint()) != null) {
                        paint2.setFlags(8);
                    }
                    C44862s4 c44862s4M17264k28 = m17264k4();
                    if (c44862s4M17264k28 != null && (baseTextView2 = c44862s4M17264k28.f100815U) != null && (paint = baseTextView2.getPaint()) != null) {
                        paint.setAntiAlias(true);
                    }
                    C44862s4 c44862s4M17264k29 = m17264k4();
                    if (c44862s4M17264k29 != null && (baseTextView = c44862s4M17264k29.f100815U) != null) {
                        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.history.j
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InOutDetailFragment.m17200J4(this.f17671b, historyRecordEntity);
                            }
                        }, 1, null);
                    }
                }
            }
        }
        String strM17261g4 = m17261g4(historyRecordEntity != null ? historyRecordEntity.getTaxes() : null, C27041f.m66668h(C27041f.m66677q(historyRecordEntity != null ? historyRecordEntity.currencyName : null)));
        C44862s4 c44862s4M17264k30 = m17264k4();
        if (c44862s4M17264k30 != null && (relativeLayout = c44862s4M17264k30.f100833p) != null) {
            AssetExKt.m15138z(relativeLayout, strM17261g4 != null);
        }
        C44862s4 c44862s4M17264k31 = m17264k4();
        if (c44862s4M17264k31 != null && (baseTextView8 = c44862s4M17264k31.f100812R) != null) {
            baseTextView8.setText(strM17261g4);
        }
        if (!TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getTaxDescription() : null)) {
            C44862s4 c44862s4M17264k32 = m17264k4();
            if (c44862s4M17264k32 != null && (baseTextView7 = c44862s4M17264k32.f100813S) != null) {
                C27046k.m66694i(baseTextView7, R$drawable.ic_question_16, C5275i0.m6236a(2.0f), 0, 4, null);
            }
            C44862s4 c44862s4M17264k33 = m17264k4();
            if (c44862s4M17264k33 != null && (baseTextView6 = c44862s4M17264k33.f100813S) != null) {
                C27046k.m66702q(baseTextView6, C27017c.f54310a.m66512a(R$color.c_icon60));
            }
            C44862s4 c44862s4M17264k34 = m17264k4();
            if (c44862s4M17264k34 != null && (baseTextView5 = c44862s4M17264k34.f100813S) != null) {
                C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.assets.history.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InOutDetailFragment.m17186C4(historyRecordEntity, this);
                    }
                }, 1, null);
            }
        }
        m17265l4(historyRecordEntity, z13, z12);
        C44862s4 c44862s4M17264k35 = m17264k4();
        if (c44862s4M17264k35 != null && (baseTextView4 = c44862s4M17264k35.f100824g) != null) {
            baseTextView4.setText(z13 ? R$string.kc_inout_stats_withdraw_stats : R$string.kc_inout_stats_deposit_stats);
        }
        if (z13) {
            C43852m.m96595g("withdrawRecordDetail", "statButton", "1", null, 8, null);
        } else {
            C43852m.m96595g("depositRecordDetail", "statButton", "1", null, 8, null);
        }
        C44862s4 c44862s4M17264k36 = m17264k4();
        if (c44862s4M17264k36 == null || (shapeLinearLayout = c44862s4M17264k36.f100823f) == null) {
            return;
        }
        C27046k.m66711z(shapeLinearLayout, 0L, new Function0() { // from class: com.kubi.assets.history.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InOutDetailFragment.m17188D4(z13);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m17248K4(boolean z11) {
        setPageId(z11 ? "depositRecordDetail" : "withdrawRecordDetail");
    }

    /* JADX INFO: renamed from: L4 */
    public final void m17249L4() {
        Timer timer = this.f17616c0;
        if (timer != null) {
            timer.cancel();
        }
        this.f17616c0 = new Timer();
        C10135c c10135c = new C10135c();
        Timer timer2 = this.f17616c0;
        if (timer2 != null) {
            timer2.schedule(c10135c, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m17251N4() {
        Timer timer = this.f17615b0;
        if (timer != null) {
            timer.cancel();
        }
        this.f17615b0 = null;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m17252O4(HistoryRecordEntity historyRecordEntity) {
        CoinProperty properties;
        String strReplace$default = null;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.code : null));
        String txUrl = (coinInfoEntityM85613u == null || (properties = coinInfoEntityM85613u.getProperties()) == null) ? null : properties.getTxUrl();
        if (txUrl != null) {
            strReplace$default = StringsKt.replace$default(txUrl, "{txId}", C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getWalletTxIdStr() : null), false, 4, (Object) null);
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C27041f.m66668h(strReplace$default), null, null, null, null, null, null, 126, null);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: Q4 */
    public final void m17254Q4(final HistoryRecordEntity historyRecordEntity) {
        BigDecimal bigDecimal;
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        KcSecondaryButton kcSecondaryButton4;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        KcSecondaryButton kcSecondaryButton5;
        KcSecondaryButton kcSecondaryButton6;
        KcSecondaryButton kcSecondaryButton7;
        KcSecondaryButton kcSecondaryButton8;
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        List<String> taxes;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        C44825n2 c44825n2;
        BaseTextView baseTextView9;
        C44825n2 c44825n3;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        RelativeLayout relativeLayout2;
        C44825n2 c44825n4;
        ShapeConstraintLayout root;
        boolean zM17260f4 = m17260f4(historyRecordEntity);
        C44862s4 c44862s4M17264k4 = m17264k4();
        if (c44862s4M17264k4 != null && (c44825n4 = c44862s4M17264k4.f100817W) != null && (root = c44825n4.getRoot()) != null) {
            AssetExKt.m15138z(root, zM17260f4);
        }
        C44862s4 c44862s4M17264k5 = m17264k4();
        if (c44862s4M17264k5 != null && (relativeLayout2 = c44862s4M17264k5.f100828k) != null) {
            ViewExtKt.m66577h(relativeLayout2);
        }
        C44862s4 c44862s4M17264k6 = m17264k4();
        if (c44862s4M17264k6 != null && (baseTextView11 = c44862s4M17264k6.f100810P) != null) {
            AssetExKt.m15138z(baseTextView11, !zM17260f4);
        }
        C44862s4 c44862s4M17264k7 = m17264k4();
        if (c44862s4M17264k7 != null && (c44825n3 = c44862s4M17264k7.f100817W) != null && (baseTextView10 = c44825n3.f100496h) != null) {
            baseTextView10.setText(C42179a.m92633f(historyRecordEntity != null ? historyRecordEntity.getCreatedAt() : System.currentTimeMillis(), null, false, false, null, 15, null));
        }
        C44862s4 c44862s4M17264k8 = m17264k4();
        if (c44862s4M17264k8 != null && (c44825n2 = c44862s4M17264k8.f100817W) != null && (baseTextView9 = c44825n2.f100497i) != null) {
            baseTextView9.setText(getString(R$string.deposit_withdraw_processing));
        }
        m17256W3(historyRecordEntity);
        if (historyRecordEntity != null) {
            int statusIcon = historyRecordEntity.getStatusIcon();
            C44862s4 c44862s4M17264k9 = m17264k4();
            if (c44862s4M17264k9 != null && (baseTextView8 = c44862s4M17264k9.f100810P) != null) {
                C27046k.m66693h(baseTextView8, statusIcon, C5275i0.m6236a(4.0f), GravityCompat.START);
            }
        }
        C44862s4 c44862s4M17264k10 = m17264k4();
        if (c44862s4M17264k10 != null && (baseTextView7 = c44862s4M17264k10.f100810P) != null) {
            C27046k.m66702q(baseTextView7, getColorRes(historyRecordEntity != null ? HistoryRecordEntity.getStatusColor$default(historyRecordEntity, true, null, 2, null) : R$color.c_text60));
        }
        C44862s4 c44862s4M17264k11 = m17264k4();
        if (c44862s4M17264k11 != null && (relativeLayout = c44862s4M17264k11.f100834q) != null) {
            ViewExtKt.m66594y(relativeLayout);
        }
        BigDecimal bigDecimalAdd = C41014a.m89922G(historyRecordEntity != null ? historyRecordEntity.amount : null, null, 1, null).add(C41014a.m89922G(historyRecordEntity != null ? historyRecordEntity.getFee() : null, null, 1, null));
        if (historyRecordEntity == null || (taxes = historyRecordEntity.getTaxes()) == null) {
            bigDecimal = bigDecimalAdd;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : taxes) {
                if (DowngradeExKt.m66535e((String) obj, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                BigDecimal bigDecimalAdd2 = bigDecimalAdd;
                while (it.hasNext()) {
                    bigDecimalAdd2 = bigDecimalAdd2.add(DowngradeExKt.m66535e((String) it.next(), null, 1, null));
                }
                if (bigDecimalAdd2 != null) {
                    bigDecimal = bigDecimalAdd2;
                } else {
                    bigDecimal = bigDecimalAdd;
                }
            } else {
                bigDecimal = bigDecimalAdd;
            }
        }
        C44862s4 c44862s4M17264k12 = m17264k4();
        if (c44862s4M17264k12 != null && (baseTextView6 = c44862s4M17264k12.f100816V) != null) {
            StringBuilder sb2 = new StringBuilder();
            Intrinsics.checkNotNull(bigDecimal);
            sb2.append(C37886j.m85578b(bigDecimal, C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.code : null), null, false, false, false, 0, null, 0, 254, null));
            sb2.append(' ');
            sb2.append(C27041f.m66677q(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.currencyName : null)));
            baseTextView6.setText(sb2.toString());
        }
        C44862s4 c44862s4M17264k13 = m17264k4();
        if (c44862s4M17264k13 != null && (baseTextView5 = c44862s4M17264k13.f100798D) != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C37885i.m85563b(C41014a.m89922G(historyRecordEntity != null ? historyRecordEntity.getFee() : null, null, 1, null), historyRecordEntity != null ? historyRecordEntity.code : null, 0, 2, null));
            sb3.append(' ');
            sb3.append(C27041f.m66677q(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.currencyName : null)));
            baseTextView5.setText(sb3.toString());
        }
        C44862s4 c44862s4M17264k14 = m17264k4();
        if (c44862s4M17264k14 != null && (baseTextView4 = c44862s4M17264k14.f100837t) != null) {
            baseTextView4.setText(getString(R$string.asset_detail_from_account));
        }
        C44862s4 c44862s4M17264k15 = m17264k4();
        if (c44862s4M17264k15 != null && (baseTextView3 = c44862s4M17264k15.f100836s) != null) {
            baseTextView3.setText(m17258Y3(historyRecordEntity));
        }
        if (!Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getType() : null, "ADDRESS")) {
            if (TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getAddressRemark() : null)) {
                C44862s4 c44862s4M17264k16 = m17264k4();
                if (c44862s4M17264k16 != null && (shapeTextView2 = c44862s4M17264k16.f100839v) != null) {
                    ViewExtKt.m66594y(shapeTextView2);
                }
                C44862s4 c44862s4M17264k17 = m17264k4();
                if (c44862s4M17264k17 != null && (shapeTextView = c44862s4M17264k17.f100839v) != null) {
                    shapeTextView.setText(getStringRes(R$string.asset_inner_user, new Object[0]));
                }
            }
        }
        if (Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getCancelType() : null), "CANCELABLE")) {
            C44862s4 c44862s4M17264k18 = m17264k4();
            if (c44862s4M17264k18 != null && (kcSecondaryButton8 = c44862s4M17264k18.f100819b) != null) {
                kcSecondaryButton8.setVisibility(0);
            }
            C44862s4 c44862s4M17264k19 = m17264k4();
            if (c44862s4M17264k19 != null && (kcSecondaryButton7 = c44862s4M17264k19.f100819b) != null) {
                C27046k.m66711z(kcSecondaryButton7, 0L, new Function0() { // from class: com.kubi.assets.history.s
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InOutDetailFragment.m17209R4(this.f17698b, historyRecordEntity);
                    }
                }, 1, null);
            }
            C44862s4 c44862s4M17264k20 = m17264k4();
            if (c44862s4M17264k20 != null && (kcSecondaryButton6 = c44862s4M17264k20.f100819b) != null) {
                kcSecondaryButton6.setEnabled(true);
            }
            C44862s4 c44862s4M17264k21 = m17264k4();
            if (c44862s4M17264k21 != null && (kcSecondaryButton5 = c44862s4M17264k21.f100819b) != null) {
                kcSecondaryButton5.setText(getString(R$string.asset_detail_cancel_withdraw));
            }
            r6.a.h();
        } else if (Intrinsics.areEqual(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getCancelType() : null), "CANCELING")) {
            C44862s4 c44862s4M17264k22 = m17264k4();
            if (c44862s4M17264k22 != null && (kcSecondaryButton4 = c44862s4M17264k22.f100819b) != null) {
                kcSecondaryButton4.setVisibility(0);
            }
            C44862s4 c44862s4M17264k23 = m17264k4();
            if (c44862s4M17264k23 != null && (kcSecondaryButton3 = c44862s4M17264k23.f100819b) != null) {
                kcSecondaryButton3.setEnabled(false);
            }
            C44862s4 c44862s4M17264k24 = m17264k4();
            if (c44862s4M17264k24 != null && (kcSecondaryButton2 = c44862s4M17264k24.f100819b) != null) {
                kcSecondaryButton2.setText(getString(R$string.kc_asset_withdraw_canceling));
            }
            r6.a.h();
        } else {
            C44862s4 c44862s4M17264k25 = m17264k4();
            if (c44862s4M17264k25 != null && (kcSecondaryButton = c44862s4M17264k25.f100819b) != null) {
                kcSecondaryButton.setVisibility(8);
            }
        }
        C44862s4 c44862s4M17264k26 = m17264k4();
        if (c44862s4M17264k26 != null && (baseTextView2 = c44862s4M17264k26.f100797C) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.assets.history.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InOutDetailFragment.m17211S4(this.f17700b);
                }
            }, 1, null);
        }
        C44862s4 c44862s4M17264k27 = m17264k4();
        if (c44862s4M17264k27 != null && (baseTextView = c44862s4M17264k27.f100797C) != null) {
            baseTextView.setVisibility(TextUtils.isEmpty(C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.getFailureReason() : null)) ? 8 : 0);
        }
        this.f17614a0.m17328k(m17264k4(), historyRecordEntity, zM17260f4, this.f17609V, this);
        m17257X3(historyRecordEntity);
    }

    /* JADX INFO: renamed from: V3 */
    public final String m17255V3(HistoryRecordEntity historyRecordEntity) {
        AccountType accountTypeOfName = AccountType.INSTANCE.ofName(historyRecordEntity != null ? historyRecordEntity.getAccountType() : null);
        Integer numValueOf = accountTypeOfName != null ? Integer.valueOf(accountTypeOfName.getStrRes()) : null;
        String string = getString(numValueOf != null ? numValueOf.intValue() : AccountType.UNKNOWN.getStrRes());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String toSubUserId = historyRecordEntity != null ? historyRecordEntity.getToSubUserId() : null;
        if (toSubUserId == null || toSubUserId.length() == 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(AccountType.SUB.getStrRes()));
        sb2.append(' ');
        sb2.append(string);
        sb2.append('(');
        sb2.append(historyRecordEntity != null ? historyRecordEntity.getToSubUserName() : null);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m17257X3(HistoryRecordEntity historyRecordEntity) {
        String returnStatus;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        DashTextView dashTextView3;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        DashTextView dashTextView4;
        DashTextView dashTextView5;
        DashTextView dashTextView6;
        RelativeLayout relativeLayout3;
        RelativeLayout relativeLayout4;
        if (historyRecordEntity == null || historyRecordEntity.getReturnStatus() == null || (returnStatus = historyRecordEntity.getReturnStatus()) == null) {
            return;
        }
        int iHashCode = returnStatus.hashCode();
        if (iHashCode == -1149187101) {
            if (returnStatus.equals(AppConstants.AB_TEST_SUCCESS)) {
                C44862s4 c44862s4M17264k4 = m17264k4();
                if (c44862s4M17264k4 != null && (relativeLayout2 = c44862s4M17264k4.f100830m) != null) {
                    ViewExtKt.m66594y(relativeLayout2);
                }
                C44862s4 c44862s4M17264k5 = m17264k4();
                if (c44862s4M17264k5 != null && (relativeLayout = c44862s4M17264k5.f100831n) != null) {
                    ViewExtKt.m66594y(relativeLayout);
                }
                C44862s4 c44862s4M17264k6 = m17264k4();
                if (c44862s4M17264k6 != null && (dashTextView3 = c44862s4M17264k6.f100801G) != null) {
                    dashTextView3.setTextColor(getColorRes(R$color.brandGreen));
                }
                C44862s4 c44862s4M17264k7 = m17264k4();
                if (c44862s4M17264k7 != null && (dashTextView2 = c44862s4M17264k7.f100801G) != null) {
                    dashTextView2.setDashColor(getColorRes(R$color.brandGreen));
                }
                C44862s4 c44862s4M17264k8 = m17264k4();
                if (c44862s4M17264k8 != null && (dashTextView = c44862s4M17264k8.f100801G) != null) {
                    dashTextView.setText(getString(R$string.kc_asset_kcs_return_already));
                }
                m17268x4(historyRecordEntity);
                return;
            }
            return;
        }
        if (iHashCode != 907287315) {
            if (iHashCode != 1991417916) {
                return;
            }
            returnStatus.equals("NOT_RETURN");
            return;
        }
        if (returnStatus.equals("PROCESSING")) {
            C44862s4 c44862s4M17264k9 = m17264k4();
            if (c44862s4M17264k9 != null && (relativeLayout4 = c44862s4M17264k9.f100830m) != null) {
                ViewExtKt.m66594y(relativeLayout4);
            }
            C44862s4 c44862s4M17264k10 = m17264k4();
            if (c44862s4M17264k10 != null && (relativeLayout3 = c44862s4M17264k10.f100831n) != null) {
                ViewExtKt.m66594y(relativeLayout3);
            }
            C44862s4 c44862s4M17264k11 = m17264k4();
            if (c44862s4M17264k11 != null && (dashTextView6 = c44862s4M17264k11.f100801G) != null) {
                dashTextView6.setTextColor(getColorRes(R$color.complementary));
            }
            C44862s4 c44862s4M17264k12 = m17264k4();
            if (c44862s4M17264k12 != null && (dashTextView5 = c44862s4M17264k12.f100801G) != null) {
                dashTextView5.setDashColor(getColorRes(R$color.complementary));
            }
            C44862s4 c44862s4M17264k13 = m17264k4();
            if (c44862s4M17264k13 != null && (dashTextView4 = c44862s4M17264k13.f100801G) != null) {
                dashTextView4.setText(getString(R$string.deposit_withdraw_processing));
            }
            m17268x4(historyRecordEntity);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final String m17258Y3(HistoryRecordEntity historyRecordEntity) {
        List<String> accountTypes;
        String strJoinToString$default = (historyRecordEntity == null || (accountTypes = historyRecordEntity.getAccountTypes()) == null) ? null : CollectionsKt.joinToString$default(accountTypes, null, null, null, 0, null, new Function1() { // from class: com.kubi.assets.history.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InOutDetailFragment.m17214Z3(this.f17713b, (String) obj);
            }
        }, 31, null);
        String string = getString(R$string.deposit_other_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return C27041f.m66669i(strJoinToString$default, string);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m17259a4(final HistoryRecordEntity historyRecordEntity) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_asset_withdraw_cancel_confirm).m54153J4(R$string.kc_asset_withdraw_cancel_content).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.history.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                InOutDetailFragment.m17215b4(this.f17703b, historyRecordEntity, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
        r6.a.b();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_inout_deital;
    }

    /* JADX INFO: renamed from: i4 */
    public final com.kubi.assets.withdraw.chain.a m17262i4() {
        return (com.kubi.assets.withdraw.chain.a) this.f17612Y.getValue();
    }

    /* JADX INFO: renamed from: j4 */
    public final AssetV2Api m17263j4() {
        return (AssetV2Api) this.f17611X.getValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final C44862s4 m17264k4() {
        return (C44862s4) this.f17608U.getValue(this, f17607e0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m17266q4(HistoryRecordEntity historyRecordEntity) {
        String strM66668h = C27041f.m66668h(historyRecordEntity != null ? historyRecordEntity.status : null);
        return Intrinsics.areEqual(strM66668h, "PROCESSING") || Intrinsics.areEqual(strM66668h, "REVIEW") || Intrinsics.areEqual(strM66668h, "WALLET_PROCESSING");
    }

    /* JADX INFO: renamed from: r4 */
    public final void m17267r4(final String str, final boolean z11, final boolean z12) {
        Observable<R> observableCompose = (z11 ? m17263j4().m17121c(str) : AssetV2Api.m17059W(m17263j4(), str, 0, 2, null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.history.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InOutDetailFragment.m17235t4(z12, this, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.assets.history.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17237u4(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.assets.history.c0
            @Override // io.reactivex.functions.Action
            public final void run() {
                InOutDetailFragment.m17239v4(z12, this);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.assets.history.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17241w4(this.f17654b, z11, z12, str, (HistoryRecordEntity) obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m17209R4(InOutDetailFragment inOutDetailFragment, HistoryRecordEntity historyRecordEntity) {
        inOutDetailFragment.m17259a4(historyRecordEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m17211S4(InOutDetailFragment inOutDetailFragment) {
        C43852m.m96591c(C27041f.m66668h(inOutDetailFragment.getF34283V()), "faq", null, null, 12, null);
        IHelpCenterService.m28903c(IHelpCenterService.f25326a.get(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final com.kubi.assets.withdraw.chain.a m17212T3() {
        return (com.kubi.assets.withdraw.chain.a) C42597a.m93387c().create(com.kubi.assets.withdraw.chain.a.class);
    }

    /* JADX INFO: renamed from: U3 */
    public static final AssetV2Api m17213U3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m17215b4(final InOutDetailFragment inOutDetailFragment, HistoryRecordEntity historyRecordEntity, DialogInterface dialogInterface, int i11) {
        String str;
        String str2;
        AssetV2Api assetV2ApiM17263j4 = inOutDetailFragment.m17263j4();
        Boolean boolValueOf = null;
        if (historyRecordEntity != null) {
            str = historyRecordEntity.id;
        } else {
            str = null;
        }
        String strM66668h = C27041f.m66668h(str);
        if (historyRecordEntity != null) {
            boolValueOf = Boolean.valueOf(historyRecordEntity.getIsContract());
        }
        if (C27025c.m66566d(boolValueOf)) {
            str2 = "KUMEX";
        } else {
            str2 = "KUCOIN";
        }
        Observable<R> observableCompose = assetV2ApiM17263j4.m17104T0(strM66668h, str2).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.history.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InOutDetailFragment.m17216c4(this.f17716b, (Disposable) obj);
            }
        };
        inOutDetailFragment.addSubscription(observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.assets.history.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17217d4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.assets.history.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17218e4(this.f17646b, obj);
            }
        }, new C24223c1(inOutDetailFragment)));
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m17216c4(InOutDetailFragment inOutDetailFragment, Disposable disposable) {
        inOutDetailFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m17217d4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m17218e4(InOutDetailFragment inOutDetailFragment, Object obj) {
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        inOutDetailFragment.hideDialogLoading();
        C44862s4 c44862s4M17264k4 = inOutDetailFragment.m17264k4();
        if (c44862s4M17264k4 != null && (kcSecondaryButton2 = c44862s4M17264k4.f100819b) != null) {
            kcSecondaryButton2.setEnabled(false);
        }
        C44862s4 c44862s4M17264k5 = inOutDetailFragment.m17264k4();
        if (c44862s4M17264k5 != null && (kcSecondaryButton = c44862s4M17264k5.f100819b) != null) {
            kcSecondaryButton.setText(inOutDetailFragment.getString(R$string.kc_asset_withdraw_canceling));
        }
        HistoryRecordEntity historyRecordEntity = inOutDetailFragment.f17613Z;
        if (historyRecordEntity != null) {
            historyRecordEntity.setCancelType("CANCELING");
        }
        inOutDetailFragment.m17249L4();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m17225n4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX INFO: renamed from: p4 */
    public static final void m17229p4(boolean z11, InOutDetailFragment inOutDetailFragment, HistoryRecordEntity historyRecordEntity, ArrayList arrayList) {
        Object next;
        boolean zAreEqual;
        String walletTxIdStr;
        String strReplace$default;
        String txUrl;
        BaseTextView baseTextView;
        String withdrawPredictTime;
        C44825n2 c44825n2;
        BaseTextView baseTextView2;
        boolean z12;
        C44825n2 c44825n3;
        BaseTextView baseTextView3;
        String chainId;
        String chainId2;
        Intrinsics.checkNotNull(arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    chainId = ((MultiChainEntity) next).getChainId();
                    if (historyRecordEntity != null) {
                        chainId2 = historyRecordEntity.getChainId();
                    } else {
                        chainId2 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(chainId, chainId2));
            MultiChainEntity multiChainEntity = (MultiChainEntity) next;
            if (z11) {
                FilterTimeHelper filterTimeHelper = FilterTimeHelper.f17645a;
                if (multiChainEntity != null) {
                    withdrawPredictTime = multiChainEntity.getWithdrawPredictTime();
                } else {
                    withdrawPredictTime = null;
                }
                String strM17310a = filterTimeHelper.m17310a(C27041f.m66668h(withdrawPredictTime));
                C44862s4 c44862s4M17264k4 = inOutDetailFragment.m17264k4();
                if (c44862s4M17264k4 != null && (c44825n3 = c44862s4M17264k4.f100817W) != null && (baseTextView3 = c44825n3.f100495g) != null) {
                    baseTextView3.setText('(' + strM17310a + ')');
                }
                C44862s4 c44862s4M17264k5 = inOutDetailFragment.m17264k4();
                if (c44862s4M17264k5 != null && (c44825n2 = c44862s4M17264k5.f100817W) != null && (baseTextView2 = c44825n2.f100495g) != null) {
                    if (strM17310a.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AssetExKt.m15138z(baseTextView2, z12);
                }
            }
            if (multiChainEntity != null) {
                zAreEqual = Intrinsics.areEqual(multiChainEntity.isInvoiceChain(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                C44862s4 c44862s4M17264k6 = inOutDetailFragment.m17264k4();
                if (c44862s4M17264k6 != null && (baseTextView = c44862s4M17264k6.f100795A) != null) {
                    baseTextView.setText(inOutDetailFragment.getString(R$string.kc_asset_invoice_tip));
                }
                if (historyRecordEntity != null) {
                    walletTxIdStr = historyRecordEntity.getAddress();
                } else {
                    walletTxIdStr = null;
                }
            } else if (historyRecordEntity == null) {
                walletTxIdStr = null;
            } else {
                walletTxIdStr = historyRecordEntity.getWalletTxIdStr();
            }
            if (multiChainEntity != null && (txUrl = multiChainEntity.getTxUrl()) != null) {
                if (StringsKt.contains$default((CharSequence) txUrl, (CharSequence) "{txId}", false, 2, (Object) null)) {
                    strReplace$default = StringsKt.replace$default(txUrl, "{txId}", C27041f.m66668h(walletTxIdStr), false, 4, (Object) null);
                } else {
                    strReplace$default = txUrl + walletTxIdStr;
                }
                if (strReplace$default == null) {
                    strReplace$default = "";
                }
            } else {
                strReplace$default = "";
            }
            inOutDetailFragment.f17610W = strReplace$default;
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m17237u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m17241w4(InOutDetailFragment inOutDetailFragment, boolean z11, boolean z12, String str, HistoryRecordEntity historyRecordEntity) {
        String cancelType;
        inOutDetailFragment.m17247B4(z11, historyRecordEntity, z12);
        inOutDetailFragment.f17613Z = historyRecordEntity;
        if (z11 && inOutDetailFragment.m17266q4(historyRecordEntity)) {
            if (historyRecordEntity != null) {
                cancelType = historyRecordEntity.getCancelType();
            } else {
                cancelType = null;
            }
            if (!Intrinsics.areEqual(C27041f.m66668h(cancelType), "CANCELING")) {
                inOutDetailFragment.m17250M4(str);
                return;
            }
        }
        inOutDetailFragment.m17251N4();
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m17246z4(InOutDetailFragment inOutDetailFragment, Ref.ObjectRef objectRef, HistoryRecordEntity historyRecordEntity) {
        LifecycleOwnerKt.getLifecycleScope(inOutDetailFragment).launchWhenStarted(new InOutDetailFragment$loadWithdrawKcsRewardTip$2$1(objectRef, inOutDetailFragment, historyRecordEntity, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m17250M4(String str) {
        m17251N4();
        this.f17615b0 = new Timer();
        C10136d c10136d = new C10136d(str);
        Timer timer = this.f17615b0;
        if (timer != null) {
            timer.schedule(c10136d, 5000L, 5000L);
        }
    }

    @SuppressLint({"SetTextI18n", "KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: P4 */
    public final void m17253P4(HistoryRecordEntity historyRecordEntity) {
        BigDecimal fee;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BigDecimal fee2;
        BaseTextView baseTextView3;
        RelativeLayout relativeLayout2;
        BaseTextView baseTextView4;
        String confirmationStr;
        String confirmationCountStr;
        C44862s4 c44862s4M17264k4 = m17264k4();
        if (c44862s4M17264k4 != null && (baseTextView4 = c44862s4M17264k4.f100842y) != null) {
            StringBuilder sb2 = new StringBuilder();
            if (historyRecordEntity != null) {
                confirmationStr = historyRecordEntity.getConfirmationStr();
            } else {
                confirmationStr = null;
            }
            sb2.append(confirmationStr);
            sb2.append('/');
            if (historyRecordEntity != null) {
                confirmationCountStr = historyRecordEntity.getConfirmationCountStr();
            } else {
                confirmationCountStr = null;
            }
            sb2.append(confirmationCountStr);
            baseTextView4.setText(sb2.toString());
        }
        if (historyRecordEntity != null) {
            fee = historyRecordEntity.getFee();
        } else {
            fee = null;
        }
        if (fee != null && ((fee2 = historyRecordEntity.getFee()) == null || fee2.compareTo(BigDecimal.ZERO) != 0)) {
            C44862s4 c44862s4M17264k5 = m17264k4();
            if (c44862s4M17264k5 != null && (relativeLayout2 = c44862s4M17264k5.f100829l) != null) {
                ViewExtKt.m66594y(relativeLayout2);
            }
            C44862s4 c44862s4M17264k6 = m17264k4();
            if (c44862s4M17264k6 != null && (baseTextView3 = c44862s4M17264k6.f100798D) != null) {
                baseTextView3.setText(C37885i.m85563b(new BigDecimal(String.valueOf(C27039d.m66647g(historyRecordEntity.getFee()))), historyRecordEntity.code, 0, 2, null) + ' ' + C27041f.m66677q(C27041f.m66668h(historyRecordEntity.currencyName)));
            }
        } else {
            C44862s4 c44862s4M17264k7 = m17264k4();
            if (c44862s4M17264k7 != null && (relativeLayout = c44862s4M17264k7.f100829l) != null) {
                ViewExtKt.m66577h(relativeLayout);
            }
        }
        C44862s4 c44862s4M17264k8 = m17264k4();
        if (c44862s4M17264k8 != null && (baseTextView2 = c44862s4M17264k8.f100837t) != null) {
            baseTextView2.setText(getString(R$string.asset_detail_to_account));
        }
        C44862s4 c44862s4M17264k9 = m17264k4();
        if (c44862s4M17264k9 != null && (baseTextView = c44862s4M17264k9.f100836s) != null) {
            baseTextView.setText(m17255V3(historyRecordEntity));
        }
        this.f17614a0.m17325e(m17264k4(), historyRecordEntity, getF34283V(), this.f17609V, this);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m17265l4(final HistoryRecordEntity historyRecordEntity, final boolean z11, final boolean z12) {
        String str;
        String chainId;
        String str2;
        AssetV2Api assetV2ApiM17263j4 = m17263j4();
        Boolean boolValueOf = null;
        if (historyRecordEntity != null) {
            str = historyRecordEntity.code;
        } else {
            str = null;
        }
        if (historyRecordEntity != null) {
            chainId = historyRecordEntity.getChainId();
        } else {
            chainId = null;
        }
        if (historyRecordEntity != null) {
            boolValueOf = Boolean.valueOf(historyRecordEntity.getIsContract());
        }
        if (C27025c.m66566d(boolValueOf)) {
            str2 = "KUMEX";
        } else {
            str2 = "KUCOIN";
        }
        Observable observableCompose = AssetV2Api.m17061d1(assetV2ApiM17263j4, str, chainId, str2, null, 8, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.history.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InOutDetailFragment.m17223m4(z12, this, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.assets.history.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17225n4(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.assets.history.o
            @Override // io.reactivex.functions.Action
            public final void run() {
                InOutDetailFragment.m17227o4(z12, this);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.assets.history.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InOutDetailFragment.m17229p4(z11, this, historyRecordEntity, (ArrayList) obj);
            }
        }, new C10134b(historyRecordEntity));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        String strM56284y;
        super.onAgainShow();
        Bundle arguments = getArguments();
        String strM56284y2 = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "id");
        } else {
            strM56284y = null;
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments2, "type");
        }
        boolean zAreEqual = Intrinsics.areEqual(C27041f.m66668h(strM56284y2), "1");
        if (strM66668h.length() > 0) {
            m17267r4(strM66668h, zAreEqual, false);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m17251N4();
        Timer timer = this.f17616c0;
        if (timer != null) {
            timer.cancel();
        }
        this.f17616c0 = null;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String strM56284y;
        String strM56284y2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String strM56284y3 = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "id");
        } else {
            strM56284y = null;
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments2, "type");
        } else {
            strM56284y2 = null;
        }
        String strM66668h2 = C27041f.m66668h(strM56284y2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            strM56284y3 = RouteExKt.m56284y(arguments3, "spm");
        }
        this.f17609V = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) C27041f.m66668h(strM56284y3), new String[]{C33978va.f72339h}, false, 0, 6, (Object) null), 1);
        boolean zAreEqual = Intrinsics.areEqual(strM66668h2, "1");
        m17248K4(zAreEqual);
        if (strM66668h.length() > 0) {
            m17233s4(this, strM66668h, zAreEqual, false, 4, null);
            if (zAreEqual) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.assets.history.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        InOutDetailFragment.m17183A4(this.f17660b);
                    }
                }, 3000L);
                return;
            }
            return;
        }
        preformBackPressed();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m17268x4(final HistoryRecordEntity historyRecordEntity) {
        DashTextView dashTextView;
        DashTextView dashTextView2;
        BaseTextView baseTextView;
        String returnAmount;
        String strM85563b;
        String str;
        C44862s4 c44862s4M17264k4 = m17264k4();
        if (c44862s4M17264k4 != null && (baseTextView = c44862s4M17264k4.f100799E) != null) {
            StringBuilder sb2 = new StringBuilder();
            String returnCurrency = null;
            if (historyRecordEntity != null) {
                returnAmount = historyRecordEntity.getReturnAmount();
            } else {
                returnAmount = null;
            }
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(returnAmount);
            if (bigDecimalM66536f != null) {
                if (historyRecordEntity != null) {
                    str = historyRecordEntity.code;
                } else {
                    str = null;
                }
                strM85563b = C37885i.m85563b(bigDecimalM66536f, str, 0, 2, null);
            } else {
                strM85563b = null;
            }
            sb2.append(C27041f.m66669i(strM85563b, "--"));
            sb2.append(' ');
            if (historyRecordEntity != null) {
                returnCurrency = historyRecordEntity.getReturnCurrency();
            }
            sb2.append(C27041f.m66677q(C27041f.m66668h(returnCurrency)));
            baseTextView.setText(sb2.toString());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C44862s4 c44862s4M17264k5 = m17264k4();
        if (c44862s4M17264k5 != null && (dashTextView2 = c44862s4M17264k5.f100801G) != null) {
            C27046k.m66711z(dashTextView2, 0L, new Function0() { // from class: com.kubi.assets.history.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InOutDetailFragment.m17244y4(this.f17706b);
                }
            }, 1, null);
        }
        C44862s4 c44862s4M17264k6 = m17264k4();
        if (c44862s4M17264k6 != null && (dashTextView = c44862s4M17264k6.f100800F) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.history.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InOutDetailFragment.m17246z4(this.f17708b, objectRef, historyRecordEntity);
                }
            }, 1, null);
        }
    }
}
