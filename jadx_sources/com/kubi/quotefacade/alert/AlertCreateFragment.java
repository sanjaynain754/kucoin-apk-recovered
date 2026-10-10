package com.kubi.quotefacade.alert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4657c0;
import bv.C4663e0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.AlertAddEntity;
import com.kubi.quotefacade.entity.AlertEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27020d0;
import com.kubi.utils.C27080p0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import dz.C36993c;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.UUID;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p844zu.InterfaceC46924a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: AlertCreateFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0003J\b\u0010)\u001a\u00020!H\u0002J \u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u0016H\u0002J\u0018\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0016H\u0002J\u0018\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001fH\u0002J \u00104\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001f2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006:"}, m90084d2 = {"Lcom/kubi/quotefacade/alert/AlertCreateFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "headerBinding", "Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", "getHeaderBinding", "()Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", "headerBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "binding", "Lcom/kubi/quotefacade/databinding/KucoinFragmentAlertCreateBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/KucoinFragmentAlertCreateBinding;", "binding$delegate", "mHeaderView", "Lcom/kubi/quotefacade/alert/AlertHeaderView;", "mAdapter", "Lcom/kubi/quotefacade/alert/AlertAddAdapter;", "mTradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "mSymbol", "", "mTradeApi", "Lcom/kubi/quotefacade/api/AlertApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/quotefacade/api/AlertApi;", "mTradeApi$delegate", "Lkotlin/Lazy;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onResume", "initView", "getAllNotifies", "addPriceNotify", "symbol", "warnType", "amount", "addAmplitudeNotify", "threshold", "deleteNotify", "item", "Lcom/kubi/quotefacade/entity/AlertEntity;", ViewProps.POSITION, "changeNotifyStatus", "isOpen", "", "onDestroy", "looperTradeData", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlertCreateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertCreateFragment.kt\ncom/kubi/quotefacade/alert/AlertCreateFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n147#2,16:338\n147#2,16:354\n1#3:370\n*S KotlinDebug\n*F\n+ 1 AlertCreateFragment.kt\ncom/kubi/quotefacade/alert/AlertCreateFragment\n*L\n55#1:338,16\n61#1:354,16\n*E\n"})
public final class AlertCreateFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    public AlertHeaderView f41070W;

    /* JADX INFO: renamed from: X */
    public AlertAddAdapter f41071X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public TradeItemBean f41072Y;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f41067c0 = {Reflection.property1(new PropertyReference1Impl(AlertCreateFragment.class, "headerBinding", "getHeaderBinding()Lcom/kubi/quotefacade/databinding/KucoinViewAlertHeaderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AlertCreateFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/KucoinFragmentAlertCreateBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f41066b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41068U = C45681e.m100799e(this, new Function1<AlertCreateFragment, C4663e0>() { // from class: com.kubi.quotefacade.alert.AlertCreateFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4663e0 invoke(@NotNull AlertCreateFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AlertHeaderView alertHeaderView = this.this$0.f41070W;
            if (alertHeaderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
                alertHeaderView = null;
            }
            return C4663e0.m4638a(alertHeaderView);
        }

        {
            super(1);
        }
    }, new Function1<C4663e0, Unit>() { // from class: com.kubi.quotefacade.alert.AlertCreateFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4663e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4663e0 c4663e0) {
            invoke(c4663e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f41069V = C45681e.m100799e(this, new Function1<AlertCreateFragment, C4657c0>() { // from class: com.kubi.quotefacade.alert.AlertCreateFragment$special$$inlined$viewBindingFragment$4
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4657c0 invoke(@NotNull AlertCreateFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4657c0.m4626a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4657c0, Unit>() { // from class: com.kubi.quotefacade.alert.AlertCreateFragment$special$$inlined$viewBindingFragment$3
        public final void invoke(@NotNull C4657c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4657c0 c4657c0) {
            invoke(c4657c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f41073Z = "";

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f41074a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alert.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlertCreateFragment.m50262k4();
        }
    });

    /* JADX INFO: compiled from: AlertCreateFragment.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/alert/AlertCreateFragment$Companion;", "", "<init>", "()V", "TAB_PRICE", "", "TAB_AMPLITUDE", "RN_BIZ", "", "RN_ENTRY", "RN_COMPONENT", "RN_ROUTE", "RN_BIZ_V2", "RN_COMPONENT_V2", "REMOTE_CONFIG_MARKET_ALERT_RN_ENABLE", "REMOTE_CONFIG_MARKET_ALERT_RN_ENABLE_V2", "launchFragment", "", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "tradeType", "launchRnFragment", "launchRnV2Fragment", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAlertCreateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertCreateFragment.kt\ncom/kubi/quotefacade/alert/AlertCreateFragment$Companion\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,337:1\n35#2,4:338\n39#2:344\n44#3,2:342\n*S KotlinDebug\n*F\n+ 1 AlertCreateFragment.kt\ncom/kubi/quotefacade/alert/AlertCreateFragment$Companion\n*L\n87#1:338,4\n87#1:344\n87#1:342,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.quotefacade.alert.AlertCreateFragment$Companion$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C21571a extends TypeToken<Boolean> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launchFragment$default(Companion companion, TradeItemBean tradeItemBean, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = IQuoteFacadeService.Companion.TRADE_TYPE_SPOT;
            }
            companion.launchFragment(tradeItemBean, str);
        }

        /* JADX INFO: renamed from: a */
        public final void m50287a(TradeItemBean tradeItemBean) {
            String strEncode = Uri.encode("AlertPricePage?symbol=" + C27041f.m66668h(tradeItemBean.getSymbol()));
            Router.f46192a.m56184f("/krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&disableAddHome=1&route=" + strEncode).m4048k();
        }

        /* JADX INFO: renamed from: b */
        public final void m50288b(TradeItemBean tradeItemBean, String str) {
            String strEncode = Uri.encode("AlertPricePage?symbol=" + C27041f.m66668h(tradeItemBean.getSymbol()) + "&tradeType=" + C27041f.m66669i(str, IQuoteFacadeService.Companion.TRADE_TYPE_SPOT));
            Router router = Router.f46192a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("/krn/router?biz=marketstab&entry=main&component=kucoin_markets_tab_rn&disableAddHome=1&route=");
            sb2.append(strEncode);
            router.m56184f(sb2.toString()).m4048k();
        }

        public final void launchFragment(@NotNull TradeItemBean tradeItem, @NotNull String tradeType) {
            Object objM20457a;
            Intrinsics.checkNotNullParameter(tradeItem, "tradeItem");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C21571a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("market_alert_rn_enable_v2", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, true)) {
                m50288b(tradeItem, tradeType);
            } else {
                m50287a(tradeItem);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alert.AlertCreateFragment$a */
    /* JADX INFO: compiled from: AlertCreateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/alert/AlertCreateFragment$changeNotifyStatus$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21572a extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f41076e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21572a(int i11) {
            super(AlertCreateFragment.this);
            this.f41076e = i11;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            AlertAddAdapter alertAddAdapter = AlertCreateFragment.this.f41071X;
            if (alertAddAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                alertAddAdapter = null;
            }
            alertAddAdapter.notifyItemChanged(this.f41076e);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m50247V3(AlertCreateFragment alertCreateFragment, int i11, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        alertCreateFragment.m50279J3(alertCreateFragment.f41073Z, i11, content);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m50248W3(AlertCreateFragment alertCreateFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alertCreateFragment.m50278H3(alertCreateFragment.f41073Z, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m50249X3(AlertCreateFragment alertCreateFragment, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alertCreateFragment.f41072Y = it;
        alertCreateFragment.f41073Z = C27041f.m66668h(it != null ? it.getSymbol() : null);
        KuCoinLooper.INSTANCE.removeTask("getTradeData");
        alertCreateFragment.m50286e4(alertCreateFragment.f41073Z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m50250Y3(AlertCreateFragment alertCreateFragment, AlertEntity item, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        alertCreateFragment.m50281N3(item, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m50251Z3(AlertCreateFragment alertCreateFragment, AlertEntity item, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(item, "item");
        alertCreateFragment.m50280L3(item, i11, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m50255d4(AlertCreateFragment alertCreateFragment) {
        C27020d0 c27020d0 = C27020d0.f54313a;
        Context mContext = alertCreateFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        c27020d0.m66521b(mContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m50256f4(final String str, final AlertCreateFragment alertCreateFragment) {
        if (str == null || str.length() == 0) {
            return;
        }
        Observable observableCompose = InterfaceC46924a.m103334e(alertCreateFragment.m50285T3(), str, null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.alert.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertCreateFragment.m50257g4(this.f41111b, str, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.quotefacade.alert.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50258h4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.alert.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertCreateFragment.m50259i4((Throwable) obj);
            }
        };
        observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.alert.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50260j4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m50257g4(AlertCreateFragment alertCreateFragment, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            FragmentActivity activity = alertCreateFragment.getActivity();
            AlertAddAdapter alertAddAdapter = null;
            if (!C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null) && Intrinsics.areEqual(alertCreateFragment.f41073Z, str)) {
                alertCreateFragment.f41072Y = (TradeItemBean) arrayList.get(0);
                AlertHeaderView alertHeaderView = alertCreateFragment.f41070W;
                if (alertHeaderView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
                    alertHeaderView = null;
                }
                AlertHeaderView.m50301s(alertHeaderView, alertCreateFragment.f41072Y, false, 2, null);
                AlertHeaderView alertHeaderView2 = alertCreateFragment.f41070W;
                if (alertHeaderView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
                    alertHeaderView2 = null;
                }
                AlertAddAdapter alertAddAdapter2 = alertCreateFragment.f41071X;
                if (alertAddAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    alertAddAdapter = alertAddAdapter2;
                }
                alertHeaderView2.setNotifyNum(alertAddAdapter.getData().size());
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        RadioGroup radioGroup;
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        BaseTextView baseTextView;
        this.f41071X = new AlertAddAdapter();
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        AlertHeaderView alertHeaderView = new AlertHeaderView(mContext);
        this.f41070W = alertHeaderView;
        alertHeaderView.m50305k(this.f41072Y);
        AlertHeaderView alertHeaderView2 = this.f41070W;
        AlertAddAdapter alertAddAdapter = null;
        if (alertHeaderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView2 = null;
        }
        alertHeaderView2.setNotifyNum(0);
        AlertAddAdapter alertAddAdapter2 = this.f41071X;
        if (alertAddAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            alertAddAdapter2 = null;
        }
        AlertHeaderView alertHeaderView3 = this.f41070W;
        if (alertHeaderView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView3 = null;
        }
        alertAddAdapter2.addHeaderView(alertHeaderView3);
        C4657c0 c4657c0M50283R3 = m50283R3();
        if (c4657c0M50283R3 != null && (baseTextView = c4657c0M50283R3.f4253h) != null) {
            Context context = getContext();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.mContext.getString(R$string.alert_authority_tips));
            Context context2 = this.mContext;
            int i11 = R$string.go_open;
            sb2.append(context2.getString(i11));
            String string = sb2.toString();
            String string2 = this.mContext.getString(i11);
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            baseTextView.setText(C27080p0.m66827d(context, string, string2, C27046k.m66699n(mContext2, R$color.primary)));
        }
        C4657c0 c4657c0M50283R4 = m50283R3();
        if (c4657c0M50283R4 != null && (recyclerView2 = c4657c0M50283R4.f4252g) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext));
            AlertAddAdapter alertAddAdapter3 = this.f41071X;
            if (alertAddAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                alertAddAdapter3 = null;
            }
            recyclerView2.setAdapter(alertAddAdapter3);
        }
        C4657c0 c4657c0M50283R5 = m50283R3();
        if (c4657c0M50283R5 != null && (recyclerView = c4657c0M50283R5.f4252g) != null) {
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.kubi.quotefacade.alert.n
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AlertCreateFragment.m50252a4(this.f41114b, view, motionEvent);
                }
            });
        }
        C4657c0 c4657c0M50283R6 = m50283R3();
        if (c4657c0M50283R6 != null && (imageView2 = c4657c0M50283R6.f4247b) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertCreateFragment.m50253b4(this.f41116b);
                }
            }, 1, null);
        }
        C4657c0 c4657c0M50283R7 = m50283R3();
        if (c4657c0M50283R7 != null && (imageView = c4657c0M50283R7.f4248c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertCreateFragment.m50254c4(this.f41117b);
                }
            }, 1, null);
        }
        C4657c0 c4657c0M50283R8 = m50283R3();
        if (c4657c0M50283R8 != null && (linearLayout = c4657c0M50283R8.f4254i) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.alert.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertCreateFragment.m50255d4(this.f41118b);
                }
            }, 1, null);
        }
        C4657c0 c4657c0M50283R9 = m50283R3();
        if (c4657c0M50283R9 != null && (radioGroup = c4657c0M50283R9.f4249d) != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.quotefacade.alert.s
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                    AlertCreateFragment.m50246U3(this.f41119b, radioGroup2, i12);
                }
            });
        }
        AlertHeaderView alertHeaderView4 = this.f41070W;
        if (alertHeaderView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView4 = null;
        }
        alertHeaderView4.setAddPriceNotifyListener(new Function2() { // from class: com.kubi.quotefacade.alert.t
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertCreateFragment.m50247V3(this.f41120b, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        AlertHeaderView alertHeaderView5 = this.f41070W;
        if (alertHeaderView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView5 = null;
        }
        alertHeaderView5.setAddAmplitudeNotifyListener(new Function1() { // from class: com.kubi.quotefacade.alert.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertCreateFragment.m50248W3(this.f41121b, (String) obj);
            }
        });
        AlertHeaderView alertHeaderView6 = this.f41070W;
        if (alertHeaderView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView6 = null;
        }
        alertHeaderView6.setAddNotifySymboleListener(new Function1() { // from class: com.kubi.quotefacade.alert.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertCreateFragment.m50249X3(this.f41122b, (TradeItemBean) obj);
            }
        });
        AlertAddAdapter alertAddAdapter4 = this.f41071X;
        if (alertAddAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            alertAddAdapter4 = null;
        }
        alertAddAdapter4.m50233m(new Function2() { // from class: com.kubi.quotefacade.alert.w
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertCreateFragment.m50250Y3(this.f41123b, (AlertEntity) obj, ((Integer) obj2).intValue());
            }
        });
        AlertAddAdapter alertAddAdapter5 = this.f41071X;
        if (alertAddAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            alertAddAdapter = alertAddAdapter5;
        }
        alertAddAdapter.m50232l(new Function3() { // from class: com.kubi.quotefacade.alert.d
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertCreateFragment.m50251Z3(this.f41100b, (AlertEntity) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        m50286e4(this.f41073Z);
        m50282P3();
    }

    /* JADX INFO: renamed from: R3 */
    public final C4657c0 m50283R3() {
        return (C4657c0) this.f41069V.getValue(this, f41067c0[1]);
    }

    /* JADX INFO: renamed from: S3 */
    public final C4663e0 m50284S3() {
        return (C4663e0) this.f41068U.getValue(this, f41067c0[0]);
    }

    /* JADX INFO: renamed from: T3 */
    public final InterfaceC46924a m50285T3() {
        return (InterfaceC46924a) this.f41074a0.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m50286e4(final String str) {
        KuCoinLooper.INSTANCE.addTask(new C36993c.b("getTradeData").m82826f(new Runnable() { // from class: com.kubi.quotefacade.alert.j
            @Override // java.lang.Runnable
            public final void run() {
                AlertCreateFragment.m50256f4(str, this);
            }
        }).m82829i(5L).m82827g(this).m82828h());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_alert_create;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m50241I3(AlertCreateFragment alertCreateFragment, Object obj) {
        alertCreateFragment.hideDialogLoading();
        AlertHeaderView alertHeaderView = alertCreateFragment.f41070W;
        AlertAddAdapter alertAddAdapter = null;
        if (alertHeaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView = null;
        }
        alertHeaderView.m50303h();
        AlertHeaderView alertHeaderView2 = alertCreateFragment.f41070W;
        if (alertHeaderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView2 = null;
        }
        AlertAddAdapter alertAddAdapter2 = alertCreateFragment.f41071X;
        if (alertAddAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            alertAddAdapter = alertAddAdapter2;
        }
        alertHeaderView2.setNotifyNum(alertAddAdapter.getData().size());
        alertCreateFragment.showToast(alertCreateFragment.getString(R$string.add_alert_success));
        alertCreateFragment.m50282P3();
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m50242K3(AlertCreateFragment alertCreateFragment, Object obj) {
        alertCreateFragment.hideDialogLoading();
        AlertHeaderView alertHeaderView = alertCreateFragment.f41070W;
        AlertAddAdapter alertAddAdapter = null;
        if (alertHeaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView = null;
        }
        alertHeaderView.m50303h();
        AlertHeaderView alertHeaderView2 = alertCreateFragment.f41070W;
        if (alertHeaderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView2 = null;
        }
        AlertAddAdapter alertAddAdapter2 = alertCreateFragment.f41071X;
        if (alertAddAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            alertAddAdapter = alertAddAdapter2;
        }
        alertHeaderView2.setNotifyNum(alertAddAdapter.getData().size());
        alertCreateFragment.showToast(alertCreateFragment.getString(R$string.add_alert_success));
        alertCreateFragment.m50282P3();
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m50243M3(AlertEntity alertEntity, boolean z11, AlertCreateFragment alertCreateFragment, Object obj) {
        alertEntity.setStatus(z11);
        alertCreateFragment.hideDialogLoading();
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m50244O3(AlertCreateFragment alertCreateFragment, int i11, Object obj) {
        alertCreateFragment.hideDialogLoading();
        AlertAddAdapter alertAddAdapter = alertCreateFragment.f41071X;
        AlertAddAdapter alertAddAdapter2 = null;
        if (alertAddAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            alertAddAdapter = null;
        }
        alertAddAdapter.remove(i11);
        AlertHeaderView alertHeaderView = alertCreateFragment.f41070W;
        if (alertHeaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            alertHeaderView = null;
        }
        AlertAddAdapter alertAddAdapter3 = alertCreateFragment.f41071X;
        if (alertAddAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            alertAddAdapter2 = alertAddAdapter3;
        }
        alertHeaderView.setNotifyNum(alertAddAdapter2.getData().size());
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m50245Q3(AlertCreateFragment alertCreateFragment, ArrayList arrayList) {
        alertCreateFragment.hideDialogLoading();
        if (arrayList != null && !arrayList.isEmpty()) {
            AlertAddAdapter alertAddAdapter = alertCreateFragment.f41071X;
            AlertHeaderView alertHeaderView = null;
            if (alertAddAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                alertAddAdapter = null;
            }
            alertAddAdapter.replaceData(arrayList);
            AlertHeaderView alertHeaderView2 = alertCreateFragment.f41070W;
            if (alertHeaderView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
            } else {
                alertHeaderView = alertHeaderView2;
            }
            alertHeaderView.setNotifyNum(arrayList.size());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m50246U3(AlertCreateFragment alertCreateFragment, RadioGroup radioGroup, int i11) {
        int i12;
        int i13;
        C4657c0 c4657c0M50283R3 = alertCreateFragment.m50283R3();
        if (c4657c0M50283R3 != null) {
            RadioButton radioButton = c4657c0M50283R3.f4250e;
            Context context = c4657c0M50283R3.f4249d.getContext();
            int i14 = R$id.rb_one;
            if (i11 == i14) {
                i12 = R$font.semi;
            } else {
                i12 = R$font.medium;
            }
            radioButton.setTypeface(ResourcesCompat.getFont(context, i12));
            RadioButton radioButton2 = c4657c0M50283R3.f4251f;
            Context context2 = c4657c0M50283R3.f4249d.getContext();
            int i15 = R$id.rb_two;
            if (i11 == i15) {
                i13 = R$font.semi;
            } else {
                i13 = R$font.medium;
            }
            radioButton2.setTypeface(ResourcesCompat.getFont(context2, i13));
            AlertHeaderView alertHeaderView = null;
            if (i11 == i14) {
                AlertHeaderView alertHeaderView2 = alertCreateFragment.f41070W;
                if (alertHeaderView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
                } else {
                    alertHeaderView = alertHeaderView2;
                }
                alertHeaderView.m50302g(1);
                return;
            }
            if (i11 == i15) {
                AlertHeaderView alertHeaderView3 = alertCreateFragment.f41070W;
                if (alertHeaderView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderView");
                } else {
                    alertHeaderView = alertHeaderView3;
                }
                alertHeaderView.m50302g(2);
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final boolean m50252a4(AlertCreateFragment alertCreateFragment, View view, MotionEvent motionEvent) {
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        ClearEditText clearEditText3;
        C4663e0 c4663e0M50284S3 = alertCreateFragment.m50284S3();
        if (c4663e0M50284S3 != null && (clearEditText3 = c4663e0M50284S3.f4295d) != null) {
            clearEditText3.clearFocus();
        }
        C4663e0 c4663e0M50284S4 = alertCreateFragment.m50284S3();
        if (c4663e0M50284S4 != null && (clearEditText2 = c4663e0M50284S4.f4296e) != null) {
            clearEditText2.clearFocus();
        }
        C4663e0 c4663e0M50284S5 = alertCreateFragment.m50284S3();
        if (c4663e0M50284S5 != null && (clearEditText = c4663e0M50284S5.f4295d) != null) {
            KeyboardUtils.m6034f(clearEditText);
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m50253b4(AlertCreateFragment alertCreateFragment) {
        alertCreateFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m50254c4(AlertCreateFragment alertCreateFragment) {
        LinearLayout linearLayout;
        C4657c0 c4657c0M50283R3 = alertCreateFragment.m50283R3();
        if (c4657c0M50283R3 != null && (linearLayout = c4657c0M50283R3.f4254i) != null) {
            linearLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m50258h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m50259i4(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m50260j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static final InterfaceC46924a m50262k4() {
        return (InterfaceC46924a) C42597a.m93386b().create(InterfaceC46924a.class);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m50278H3(String str, String str2) {
        showDialogLoading();
        addSubscription(m50285T3().m103336b(str, str2).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50241I3(this.f41101b, obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m50279J3(String str, int i11, String str2) {
        showDialogLoading();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        AlertAddEntity alertAddEntity = new AlertAddEntity(StringsKt.replace$default(string, C33820nf.f71144W, "", false, 4, (Object) null), new ArrayList());
        AlertAddEntity.AlertAddItem alertAddItem = new AlertAddEntity.AlertAddItem(0, str, str2, Integer.valueOf(i11));
        ArrayList<AlertAddEntity.AlertAddItem> warns = alertAddEntity.getWarns();
        if (warns != null) {
            warns.add(alertAddItem);
        }
        addSubscription(m50285T3().m103340g(alertAddEntity).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50242K3(this.f41106b, obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: renamed from: L3 */
    public final void m50280L3(final AlertEntity alertEntity, int i11, final boolean z11) {
        showDialogLoading();
        addSubscription(m50285T3().m103338d(C27041f.m66668h(alertEntity.getId()), z11, C27039d.m66650j(alertEntity.getType())).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50243M3(alertEntity, z11, this, obj);
            }
        }, new C21572a(i11)));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m50281N3(AlertEntity alertEntity, final int i11) {
        showDialogLoading();
        addSubscription(m50285T3().m103337c(C27041f.m66668h(alertEntity.getId()), C27039d.m66650j(alertEntity.getType())).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50244O3(this.f41107b, i11, obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m50282P3() {
        showDialogLoading();
        addSubscription(m50285T3().m103339f().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alert.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlertCreateFragment.m50245Q3(this.f41102b, (ArrayList) obj);
            }
        }, new C24223c1(this)));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TradeItemBean tradeItemBean;
        Window window;
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        Bundle arguments = getArguments();
        String symbol = null;
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) RouteExKt.m56274t(arguments, "data");
        } else {
            tradeItemBean = null;
        }
        this.f41072Y = tradeItemBean;
        if (tradeItemBean == null) {
            this.f41072Y = C37890n.f85269a.m85603D("BTC-USDT");
        }
        TradeItemBean tradeItemBean2 = this.f41072Y;
        if (tradeItemBean2 != null) {
            symbol = tradeItemBean2.getSymbol();
        }
        this.f41073Z = C27041f.m66668h(symbol);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KuCoinLooper.INSTANCE.removeTask("getTradeData");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LinearLayout linearLayout;
        int i11;
        super.onResume();
        C4657c0 c4657c0M50283R3 = m50283R3();
        if (c4657c0M50283R3 != null && (linearLayout = c4657c0M50283R3.f4254i) != null) {
            C27020d0 c27020d0 = C27020d0.f54313a;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            if (c27020d0.m66520a(mContext)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }
    }
}
