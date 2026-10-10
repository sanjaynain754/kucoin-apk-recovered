package com.kubi.mine.lib.p101ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.host.HostManager;
import com.kubi.kucoin.interceptor.ReplaceUrlInterceptor;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.log.upload.LogUploader;
import com.kubi.mine.R$drawable;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$mipmap;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.mine.lib.language.C18963d;
import com.kubi.mine.lib.language.LanguageRepository;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.button.KcTextButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.site.C24128a;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.user.api.IUserService;
import com.kubi.user.api.UserRestrictedStateBean;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37757i;
import gf.C37885i;
import gq.C37994o;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import iq.InterfaceC40165g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41016c;
import p538pq.C43524d;
import p538pq.C43526f;
import p569qq.C43852m;
import p799yj.C46510b;
import p835zk.C46884c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SettingsFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0003J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\u0012\u00101\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u000203H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001c\u0010\u0016¨\u00065"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/SettingsFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentSettingsBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentSettingsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mModel", "Lcom/kubi/mine/lib/ui/MineViewModel;", "getMModel", "()Lcom/kubi/mine/lib/ui/MineViewModel;", "mModel$delegate", "Lkotlin/Lazy;", "currencyDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "getLayout", "", "colorDialog", "getColorDialog", "()Lcom/kubi/resources/dialog/DialogFragmentHelper;", "colorDialog$delegate", "dealValUnitDialog", "getDealValUnitDialog", "dealValUnitDialog$delegate", "netToggleDialog", "getNetToggleDialog", "netToggleDialog$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "lazyLoad", "initViews", "updateInfo", "initMultiAccountSwitch", "bind", "updateAccountActionsVisibility", "showFeedbackDialog", "showClearChinaUsersDialog", "openNativeLanguageSetting", "openNativeCurrencySetting", "openNativeSoundSetting", "openNativeClipboardSetting", "restart", "isRestartHomePage", "", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsFragment.kt\ncom/kubi/mine/lib/ui/SettingsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n147#2,16:552\n106#3,15:568\n25#4,3:583\n25#4,3:605\n774#5:586\n865#5,2:587\n1563#5:589\n1634#5,3:590\n536#6:593\n521#6,6:594\n126#7:600\n153#7,3:601\n1#8:604\n*S KotlinDebug\n*F\n+ 1 SettingsFragment.kt\ncom/kubi/mine/lib/ui/SettingsFragment\n*L\n82#1:552,16\n86#1:568,15\n370#1:583,3\n274#1:605,3\n475#1:586\n475#1:587,2\n477#1:589\n477#1:590,3\n501#1:593\n501#1:594,6\n503#1:600\n503#1:601,3\n*E\n"})
public final class SettingsFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35238U = C45681e.m100799e(this, new Function1<SettingsFragment, C37994o>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37994o invoke(@NotNull SettingsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37994o.m85863a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37994o, Unit>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37994o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37994o c37994o) {
            invoke(c37994o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f35239V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public DialogFragmentHelper f35240W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f35241X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f35242Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f35243Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f35237b0 = {Reflection.property1(new PropertyReference1Impl(SettingsFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentSettingsBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f35236a0 = new Companion(null);

    /* JADX INFO: compiled from: SettingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/SettingsFragment$Companion;", "", "<init>", "()V", "TAG", "", "RN_EVENT_APP_INFO_CHANGE", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m42202N4(SettingsFragment settingsFragment) {
        m42197K4(settingsFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m42193H4(SettingsFragment settingsFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        LanguageRepository.m41679e(LanguageRepository.f35074a, interfaceC24339a.getValue(), false, 2, null);
        if (MultiLanguageManager.m56979h()) {
            settingsFragment.m42257L4();
        } else {
            settingsFragment.m42256J4(true);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static /* synthetic */ void m42197K4(SettingsFragment settingsFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        settingsFragment.m42256J4(z11);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m42200M4(IUserService iUserService, final SettingsFragment settingsFragment, UserRestrictedStateBean userRestrictedStateBean) {
        if (userRestrictedStateBean != null) {
            Context mContext = settingsFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            iUserService.p(userRestrictedStateBean, mContext, childFragmentManager, new Function0() { // from class: com.kubi.mine.lib.ui.p4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsFragment.m42202N4(this.f35335b);
                }
            });
        } else {
            m42197K4(settingsFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m42205P4(DialogInterface dialogInterface, int i11) {
        LogUploader.f32615a.m37865h();
        ToastCompat.m66437C(R$string.success);
    }

    /* JADX INFO: renamed from: T3 */
    public static final DialogFragmentHelper m42209T3(final SettingsFragment settingsFragment) {
        ArrayList arrayList = new ArrayList();
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        String string = settingsFragment.getString(R$string.green_up_red_down);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ImageView imageView = new ImageView(settingsFragment.getContext());
        imageView.setImageResource(R$mipmap.ic_green_up_red_down);
        arrayList.add(new SelectEntity(null, string, null, null, null, null, imageView, null, null, false, zM33189n, null, 3005, null));
        String string2 = settingsFragment.getString(R$string.red_up_green_down);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ImageView imageView2 = new ImageView(settingsFragment.getContext());
        imageView2.setImageResource(R$mipmap.ic_red_up_green_down);
        arrayList.add(new SelectEntity(null, string2, null, null, null, null, imageView2, null, null, false, !zM33189n, null, 3005, null));
        return BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.mine.lib.ui.g4
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                SettingsFragment.m42210U3(this.f35284b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m42210U3(SettingsFragment settingsFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        ImageView imageView;
        if (C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == baseViewHolder.getAdapterPosition()) {
            return;
        }
        C27063n.m66770h(baseViewHolder.getAdapterPosition(), KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN);
        C37994o c37994oM42261X3 = settingsFragment.m42261X3();
        if (c37994oM42261X3 != null && (imageView = c37994oM42261X3.f85576s) != null) {
            imageView.setImageResource(DayNightThemeManager.f28592a.m33189n() ? R$mipmap.ic_green_up_red_down : R$mipmap.ic_red_up_green_down);
        }
        m42197K4(settingsFragment, false, 1, null);
    }

    /* JADX INFO: renamed from: V3 */
    public static final DialogFragmentHelper m42211V3(final SettingsFragment settingsFragment) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = DataMapUtil.f54245a.m66371c(KCTurboSystemSettingsModuleImpl.DEAL_UNIT_KEY, 0) == 0;
        String string = settingsFragment.getString(R$string.charge_currency);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new SelectEntity(null, string, null, null, null, null, null, null, null, false, z11, null, 3069, null));
        String string2 = settingsFragment.getString(R$string.currency_type, C41016c.m89965c() + '(' + C41016c.m89966d() + ')');
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new SelectEntity(null, string2, null, null, null, null, null, null, null, false, z11 ^ true, null, 3069, null));
        return BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.mine.lib.ui.h4
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                SettingsFragment.m42212W3(this.f35291b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m42212W3(SettingsFragment settingsFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        BaseTextView baseTextView;
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        if (dataMapUtil.m66371c(KCTurboSystemSettingsModuleImpl.DEAL_UNIT_KEY, 0) == baseViewHolder.getAdapterPosition()) {
            return;
        }
        C37885i.m85576o(baseViewHolder.getAdapterPosition() == 0);
        dataMapUtil.m66378m(KCTurboSystemSettingsModuleImpl.DEAL_UNIT_KEY, baseViewHolder.getAdapterPosition());
        C37994o c37994oM42261X3 = settingsFragment.m42261X3();
        if (c37994oM42261X3 == null || (baseTextView = c37994oM42261X3.f85582y) == null) {
            return;
        }
        baseTextView.setText(interfaceC24339a.getLabel());
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m42213d4() {
        Router.f46192a.m56184f(IUserService.a.get().E()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    private final void m42214e4() {
        String string;
        final C37994o c37994oM42261X3 = m42261X3();
        if (c37994oM42261X3 == null) {
            return;
        }
        FrameLayout flLanguage = c37994oM42261X3.f85569l;
        Intrinsics.checkNotNullExpressionValue(flLanguage, "flLanguage");
        C27046k.m66711z(flLanguage, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.u4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42215f4(this.f35366b);
            }
        }, 1, null);
        c37994oM42261X3.f85580w.setText(Intrinsics.areEqual(HostManager.a.A(), "1") ? getString(R$string.route_2) : getString(R$string.route_1));
        if (C46510b.m102600d()) {
            FrameLayout flToggleNet = c37994oM42261X3.f85574q;
            Intrinsics.checkNotNullExpressionValue(flToggleNet, "flToggleNet");
            ViewExtKt.m66594y(flToggleNet);
        } else {
            FrameLayout flToggleNet2 = c37994oM42261X3.f85574q;
            Intrinsics.checkNotNullExpressionValue(flToggleNet2, "flToggleNet");
            ViewExtKt.m66577h(flToggleNet2);
        }
        FrameLayout flClearCache = c37994oM42261X3.f85563f;
        Intrinsics.checkNotNullExpressionValue(flClearCache, "flClearCache");
        C27046k.m66711z(flClearCache, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.v3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42216g4(this.f35396b, c37994oM42261X3);
            }
        }, 1, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new SettingsFragment$initViews$3(this, c37994oM42261X3, null), 2, null);
        FrameLayout flCurrency = c37994oM42261X3.f85565h;
        Intrinsics.checkNotNullExpressionValue(flCurrency, "flCurrency");
        C27046k.m66711z(flCurrency, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.w3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42217h4(this.f35401b);
            }
        }, 1, null);
        FrameLayout flSystemPermission = c37994oM42261X3.f85572o;
        Intrinsics.checkNotNullExpressionValue(flSystemPermission, "flSystemPermission");
        C27046k.m66711z(flSystemPermission, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.x3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42218i4(this.f35406b);
            }
        }, 1, null);
        FrameLayout flAboutUs = c37994oM42261X3.f85561d;
        Intrinsics.checkNotNullExpressionValue(flAboutUs, "flAboutUs");
        C27046k.m66711z(flAboutUs, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.y3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42219j4(this.f35417b);
            }
        }, 1, null);
        FrameLayout flNoticeManage = c37994oM42261X3.f85570m;
        Intrinsics.checkNotNullExpressionValue(flNoticeManage, "flNoticeManage");
        C27046k.m66711z(flNoticeManage, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.z3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42221k4();
            }
        }, 1, null);
        ImageView imageView = c37994oM42261X3.f85576s;
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        imageView.setImageResource(dayNightThemeManager.m33189n() ? R$mipmap.ic_green_up_red_down : R$mipmap.ic_red_up_green_down);
        ConstraintLayout flUpDown = c37994oM42261X3.f85575r;
        Intrinsics.checkNotNullExpressionValue(flUpDown, "flUpDown");
        C27046k.m66711z(flUpDown, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42223l4(this.f35257b);
            }
        }, 1, null);
        BaseTextView baseTextView = c37994oM42261X3.f85582y;
        int i11 = 0;
        if (DataMapUtil.f54245a.m66371c(KCTurboSystemSettingsModuleImpl.DEAL_UNIT_KEY, 0) == 0) {
            string = getString(R$string.charge_currency);
        } else {
            string = getString(R$string.currency_type, C41016c.m89965c() + '(' + C41016c.m89966d() + ')');
        }
        baseTextView.setText(string);
        FrameLayout dealAmountUnit = c37994oM42261X3.f85560c;
        Intrinsics.checkNotNullExpressionValue(dealAmountUnit, "dealAmountUnit");
        C27046k.m66711z(dealAmountUnit, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.c4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42225m4(this.f35265b);
            }
        }, 1, null);
        m42266c4(c37994oM42261X3);
        KcTextButton tvLogout = c37994oM42261X3.f85556A;
        Intrinsics.checkNotNullExpressionValue(tvLogout, "tvLogout");
        C27046k.m66711z(tvLogout, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.d4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42227n4(this.f35269b);
            }
        }, 1, null);
        FrameLayout flQaRequest = c37994oM42261X3.f85571n;
        Intrinsics.checkNotNullExpressionValue(flQaRequest, "flQaRequest");
        C27046k.m66711z(flQaRequest, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.e4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42231p4(this.f35276b);
            }
        }, 1, null);
        FrameLayout flFeedBack = c37994oM42261X3.f85567j;
        Intrinsics.checkNotNullExpressionValue(flFeedBack, "flFeedBack");
        C27046k.m66711z(flFeedBack, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.v4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42233q4(this.f35398b);
            }
        }, 1, null);
        FrameLayout flBeep = c37994oM42261X3.f85562e;
        Intrinsics.checkNotNullExpressionValue(flBeep, "flBeep");
        C27046k.m66711z(flBeep, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.w4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42235r4(this.f35402b);
            }
        }, 1, null);
        c37994oM42261X3.f85581x.setText(dayNightThemeManager.m33182g());
        FrameLayout flDayNightThemeSeting = c37994oM42261X3.f85566i;
        Intrinsics.checkNotNullExpressionValue(flDayNightThemeSeting, "flDayNightThemeSeting");
        C27046k.m66711z(flDayNightThemeSeting, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.q3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42237s4(this.f35340b);
            }
        }, 1, null);
        FrameLayout frameLayout = c37994oM42261X3.f85564g;
        if (C24128a.m58028a()) {
            FrameLayout flClipboard = c37994oM42261X3.f85564g;
            Intrinsics.checkNotNullExpressionValue(flClipboard, "flClipboard");
            C27046k.m66711z(flClipboard, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.r3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsFragment.m42239t4(this.f35345b);
                }
            }, 1, null);
        } else {
            i11 = 8;
        }
        frameLayout.setVisibility(i11);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40165g.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40165g) objM56186h).m88522a(c37994oM42261X3);
            return;
        }
        FrameLayout flToggleNet3 = c37994oM42261X3.f85574q;
        Intrinsics.checkNotNullExpressionValue(flToggleNet3, "flToggleNet");
        C27046k.m66711z(flToggleNet3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.s3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42241u4(this.f35356b);
            }
        }, 1, null);
        if (C24129b.m58030b(SiteVisibleConfigKey.MarketWidget)) {
            FrameLayout flTimeTracking = c37994oM42261X3.f85573p;
            Intrinsics.checkNotNullExpressionValue(flTimeTracking, "flTimeTracking");
            C27046k.m66685H(flTimeTracking);
            FrameLayout flTimeTracking2 = c37994oM42261X3.f85573p;
            Intrinsics.checkNotNullExpressionValue(flTimeTracking2, "flTimeTracking");
            C27046k.m66711z(flTimeTracking2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.t3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsFragment.m42243v4();
                }
            }, 1, null);
        } else {
            FrameLayout flTimeTracking3 = c37994oM42261X3.f85573p;
            Intrinsics.checkNotNullExpressionValue(flTimeTracking3, "flTimeTracking");
            ViewExtKt.m66577h(flTimeTracking3);
        }
        if (!C27025c.m66566d(JoinBetaFragment.f35186V.getBetaInfo().getEnable())) {
            FrameLayout flJoinTest = c37994oM42261X3.f85568k;
            Intrinsics.checkNotNullExpressionValue(flJoinTest, "flJoinTest");
            ViewExtKt.m66577h(flJoinTest);
        } else {
            FrameLayout flJoinTest2 = c37994oM42261X3.f85568k;
            Intrinsics.checkNotNullExpressionValue(flJoinTest2, "flJoinTest");
            C27046k.m66685H(flJoinTest2);
            FrameLayout flJoinTest3 = c37994oM42261X3.f85568k;
            Intrinsics.checkNotNullExpressionValue(flJoinTest3, "flJoinTest");
            C27046k.m66711z(flJoinTest3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.u3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingsFragment.m42245w4();
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m42216g4(SettingsFragment settingsFragment, C37994o c37994o) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "clearCache");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        try {
            settingsFragment.showLoadingDialog();
            IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
            Context mContext = settingsFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            iReactNativeService.cleanAll(mContext);
            HybridPackageManager.f47391a.m57714d();
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(settingsFragment), C42911a.m94120b(), null, new SettingsFragment$initViews$2$2(settingsFragment, c37994o, null), 2, null);
        } catch (Exception e11) {
            BaseFragment.hideLoadingDialog$default(settingsFragment, false, 1, null);
            C44128b.m97263g(settingsFragment.getTAG(), e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m42217h4(SettingsFragment settingsFragment) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", FirebaseAnalytics.Param.CURRENCY);
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        settingsFragment.m42253E4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m42218i4(SettingsFragment settingsFragment) throws JSONException {
        IUserService.Companion companion = IUserService.a;
        if (companion.get().A()) {
            BaseActivity.Companion companion2 = BaseActivity.INSTANCE;
            Context mContext = settingsFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            companion2.launch(mContext, PermissionSettingFragment.class, settingsFragment.getStringRes(R$string.settings_permission_management, new Object[0]));
        } else {
            Router.f46192a.m56184f(companion.get().H0()).m4048k();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "permission");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m42219j4(SettingsFragment settingsFragment) throws JSONException {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40165g.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            Context mContext = settingsFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            ((InterfaceC40165g) objM56186h).m88523b(mContext);
        } else {
            BaseFragmentActivity.m56573m0(settingsFragment.mContext, settingsFragment.getString(R$string.about_us), AboutUsFragment.class.getName());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "about");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m42221k4() throws JSONException {
        INoticeService.f36364a.get().mo43139h();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entry_name", "notification_management");
        C43852m.m96605q("app_set_notice_click", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("optionKey", "notifications");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m42227n4(final SettingsFragment settingsFragment) throws JSONException {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(settingsFragment.getString(R$string.notice_prompt)).m54156M4(settingsFragment.getString(R$string.logout_confirm)).m54146C4(R$drawable.ic2_close_withcircle_24).m54161R4(0).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.i4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SettingsFragment.m42229o4(this.f35295b, dialogInterface, i11);
            }
        }).m54172c5(settingsFragment.getChildFragmentManager());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "logOut");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m42231p4(SettingsFragment settingsFragment) throws JSONException {
        BaseFragmentActivity.m56573m0(settingsFragment.mContext, settingsFragment.getString(R$string.params_evn_test), QaParamsFragment.class.getName());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "environment");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m42237s4(SettingsFragment settingsFragment) {
        C46884c c46884c = C46884c.f104713a;
        FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c46884c.m103222c(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m42243v4() throws JSONException {
        if (MineDepend.f35159a.m41831j() != null) {
            InterfaceC37757i.a.m85150b(C37304a.f82764a, null, null, null, 7, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "marketTicker");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m42245w4() throws JSONException {
        InterfaceC37757i.a.m85149a(C37304a.f82764a, null, null, null, 7, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "beta");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final DialogFragmentHelper m42247x4(final SettingsFragment settingsFragment) {
        ArrayList arrayList = new ArrayList();
        String string = settingsFragment.getString(R$string.route_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        HostManager hostManager = HostManager.a;
        arrayList.add(new SelectEntity(null, string, "0", null, null, null, null, null, null, false, Intrinsics.areEqual(hostManager.A(), "0"), null, 3065, null));
        if (C46510b.m102600d()) {
            String string2 = settingsFragment.getString(R$string.route_2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new SelectEntity(null, string2, "1", null, null, null, null, null, null, false, Intrinsics.areEqual(hostManager.A(), "1"), null, 3065, null));
        }
        return BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.mine.lib.ui.f4
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                SettingsFragment.m42249y4(this.f35279b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m42252D4() {
        BaseFragmentActivity.m56573m0(this.mContext, getString(R$string.pasteboard), ClipboardSettingFragment.class.getName());
    }

    /* JADX INFO: renamed from: E4 */
    public final void m42253E4() {
        if (this.f35240W == null) {
            ConcurrentSkipListMap<String, FiatCurrencyEntity> currencyUnitMap = C41016c.f91251h;
            Intrinsics.checkNotNullExpressionValue(currencyUnitMap, "currencyUnitMap");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, FiatCurrencyEntity> entry : currencyUnitMap.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), "CNY")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                FiatCurrencyEntity fiatCurrencyEntity = (FiatCurrencyEntity) entry2.getValue();
                String icon = null;
                String strValueOf = String.valueOf(fiatCurrencyEntity != null ? fiatCurrencyEntity.getName() : null);
                boolean zAreEqual = Intrinsics.areEqual(C41016c.m89965c(), entry2.getKey());
                FiatCurrencyEntity fiatCurrencyEntity2 = (FiatCurrencyEntity) entry2.getValue();
                if (fiatCurrencyEntity2 != null) {
                    icon = fiatCurrencyEntity2.getIcon();
                }
                arrayList.add(new SelectEntity(null, strValueOf, null, null, icon, null, null, null, null, false, zAreEqual, null, 3053, null));
            }
            this.f35240W = BottomSheetDialogHelper.f48599a.m59006Y(C27017c.f54310a.m66516f(R$string.currency_rate, new Object[0]), arrayList, new BiConsumer() { // from class: com.kubi.mine.lib.ui.n4
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    SettingsFragment.m42190F4(this.f35327b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
                }
            }, true);
        }
        DialogFragmentHelper dialogFragmentHelper = this.f35240W;
        if (dialogFragmentHelper != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelper.show(childFragmentManager, FirebaseAnalytics.Param.CURRENCY);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m42254G4() {
        List<LanguageEntity> listM41684h = LanguageRepository.f35074a.m41684h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM41684h) {
            if (!Intrinsics.areEqual(((LanguageEntity) obj).getType(), MultiLanguageManager.f46811g.getLocalString())) {
                arrayList.add(obj);
            }
        }
        List<LanguageEntity> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(0, C18963d.m41692a(MultiLanguageManager.f46811g));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        for (LanguageEntity languageEntity : mutableList) {
            arrayList2.add(new SelectEntity(null, C27041f.m66668h(languageEntity.getName()), C27041f.m66668h(languageEntity.getType()), null, null, null, null, null, null, false, Intrinsics.areEqual(MultiLanguageManager.f46811g.getLocalString(), languageEntity.getType()), null, 3065, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58962Z = BottomSheetDialogHelper.m58962Z(BottomSheetDialogHelper.f48599a, C27017c.f54310a.m66516f(R$string.language, new Object[0]), arrayList2, new BiConsumer() { // from class: com.kubi.mine.lib.ui.m4
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                SettingsFragment.m42193H4(this.f35322b, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, 8, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58962Z.show(childFragmentManager, "language");
    }

    /* JADX INFO: renamed from: I4 */
    public final void m42255I4() {
        BaseFragmentActivity.m56573m0(this.mContext, getString(R$string.voice_vibrate), BeepSettingFragment.class.getName());
    }

    /* JADX INFO: renamed from: J4 */
    public final void m42256J4(boolean z11) {
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.valueOf(z11), null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m42257L4() {
        final IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
        if (iUserServiceM41834m == null) {
            m42197K4(this, false, 1, null);
        } else {
            iUserServiceM41834m.F(LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: com.kubi.mine.lib.ui.o4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SettingsFragment.m42200M4(iUserServiceM41834m, this, (UserRestrictedStateBean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final void m42258O4() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.help_center_log_upload).m54153J4(R$string.help_center_log_upload_content).m54159P4(R$string.cancel, null).m54162S4(R$string.submit, new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.j4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SettingsFragment.m42205P4(dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "FeedbackDialog");
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: R4 */
    public final void m42260R4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (Intrinsics.areEqual("CNY", C41016c.m89965c())) {
            C41016c.m89971i("USD");
            MineDepend mineDepend = MineDepend.f35159a;
            if (mineDepend.m41829h()) {
                mineDepend.m41826e().setCurrency("USD");
            }
        }
        C37994o c37994oM42261X3 = m42261X3();
        if (c37994oM42261X3 != null && (baseTextView2 = c37994oM42261X3.f85579v) != null) {
            baseTextView2.setText(C41016c.m89965c() + '(' + C41016c.m89966d() + ')');
        }
        C37994o c37994oM42261X4 = m42261X3();
        if (c37994oM42261X4 != null && (baseTextView = c37994oM42261X4.f85583z) != null) {
            baseTextView.setText(C18963d.m41692a(MultiLanguageManager.f46811g).getName());
        }
        m42259Q4();
    }

    /* JADX INFO: renamed from: X3 */
    public final C37994o m42261X3() {
        return (C37994o) this.f35238U.getValue(this, f35237b0[0]);
    }

    /* JADX INFO: renamed from: Y3 */
    public final DialogFragmentHelper m42262Y3() {
        return (DialogFragmentHelper) this.f35241X.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final DialogFragmentHelper m42263Z3() {
        return (DialogFragmentHelper) this.f35242Y.getValue();
    }

    /* JADX INFO: renamed from: a4 */
    public final MineViewModel m42264a4() {
        return (MineViewModel) this.f35239V.getValue();
    }

    /* JADX INFO: renamed from: b4 */
    public final DialogFragmentHelper m42265b4() {
        return (DialogFragmentHelper) this.f35243Z.getValue();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m42266c4(C37994o c37994o) {
        KcSecondaryButton btnSwitchAccount = c37994o.f85559b;
        Intrinsics.checkNotNullExpressionValue(btnSwitchAccount, "btnSwitchAccount");
        C27046k.m66711z(btnSwitchAccount, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.k4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42213d4();
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_settings;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m42214e4();
        Observable<LoginUserEntity> observableObserveOn = m42264a4().m42149F().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.q4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsFragment.m42186C4(this.f35341b, (LoginUserEntity) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.r4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingsFragment.m42251z4(function1, obj);
            }
        }));
        Observable<Boolean> observableObserveOn2 = m42264a4().m42158y().observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.mine.lib.ui.s4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsFragment.m42182A4(this.f35357b, (Boolean) obj);
            }
        };
        addSubscription(observableObserveOn2.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.t4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingsFragment.m42184B4(function2, obj);
            }
        }));
    }

    public SettingsFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewModels$default$2
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
        this.f35239V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MineViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.mine.lib.ui.SettingsFragment$special$$inlined$viewModels$default$5
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
        setPageId("B1mineSettings");
        this.f35241X = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.p3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42209T3(this.f35334b);
            }
        });
        this.f35242Y = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.a4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42211V3(this.f35251b);
            }
        });
        this.f35243Z = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.l4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettingsFragment.m42247x4(this.f35314b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m42182A4(SettingsFragment settingsFragment, Boolean bool) {
        BaseTextView baseTextView;
        C37994o c37994oM42261X3 = settingsFragment.m42261X3();
        if (c37994oM42261X3 != null && (baseTextView = c37994oM42261X3.f85579v) != null) {
            baseTextView.setText(C41016c.m89965c() + '(' + C41016c.m89966d() + ')');
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final void m42184B4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m42186C4(SettingsFragment settingsFragment, LoginUserEntity loginUserEntity) {
        settingsFragment.m42260R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m42190F4(SettingsFragment settingsFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        settingsFragment.m42264a4().m42152L(interfaceC24339a.getLabel().toString());
        IReactNativeService.nativeNotifyRn$default(IReactNativeService.INSTANCE.get(), "onAppInfoChange", null, 2, null);
        if (C41016c.m89971i(interfaceC24339a.getLabel().toString())) {
            m42197K4(settingsFragment, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m42215f4(SettingsFragment settingsFragment) throws JSONException {
        settingsFragment.m42254G4();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "language");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m42223l4(SettingsFragment settingsFragment) throws JSONException {
        DialogFragmentHelper dialogFragmentHelperM42262Y3 = settingsFragment.m42262Y3();
        FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM42262Y3.show(childFragmentManager, "up_down");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "colorPre");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m42225m4(SettingsFragment settingsFragment) throws JSONException {
        DialogFragmentHelper dialogFragmentHelperM42263Z3 = settingsFragment.m42263Z3();
        FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM42263Z3.show(childFragmentManager, "deal_unit");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "volumeUnit");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m42229o4(SettingsFragment settingsFragment, DialogInterface dialogInterface, int i11) {
        C44128b.m97261e(settingsFragment.getTAG(), "click tvLogout login out");
        IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
        if (iUserServiceM41834m != null) {
            IUserService.I0(iUserServiceM41834m, false, false, 2, (Object) null);
        }
        FragmentActivity activity = settingsFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m42233q4(SettingsFragment settingsFragment) {
        settingsFragment.m42258O4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m42235r4(SettingsFragment settingsFragment) throws JSONException {
        settingsFragment.m42255I4();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "sound");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m42239t4(SettingsFragment settingsFragment) throws JSONException {
        settingsFragment.m42252D4();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "clipboard");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m42241u4(SettingsFragment settingsFragment) throws JSONException {
        DialogFragmentHelper dialogFragmentHelperM42265b4 = settingsFragment.m42265b4();
        FragmentManager childFragmentManager = settingsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM42265b4.show(childFragmentManager, "netToggle");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionKey", "networkAccel");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mineSettings", "settingItem", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m42249y4(SettingsFragment settingsFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        BaseTextView baseTextView;
        C37994o c37994oM42261X3 = settingsFragment.m42261X3();
        if (c37994oM42261X3 != null && (baseTextView = c37994oM42261X3.f85580w) != null) {
            baseTextView.setText(interfaceC24339a.getLabel());
        }
        HostManager hostManager = HostManager.a;
        hostManager.C(interfaceC24339a.getValue());
        C27063n.m66772j(interfaceC24339a.getValue(), "netWorkType");
        ReplaceUrlInterceptor.a.setSBaseUrl(hostManager.z());
        m42197K4(settingsFragment, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public static final void m42251z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m42259Q4() {
        int i11;
        C37994o c37994oM42261X3 = m42261X3();
        if (c37994oM42261X3 == null) {
            return;
        }
        if (!MineDepend.f35159a.m41829h()) {
            LinearLayout llAccountActions = c37994oM42261X3.f85577t;
            Intrinsics.checkNotNullExpressionValue(llAccountActions, "llAccountActions");
            ViewExtKt.m66577h(llAccountActions);
            return;
        }
        LinearLayout llAccountActions2 = c37994oM42261X3.f85577t;
        Intrinsics.checkNotNullExpressionValue(llAccountActions2, "llAccountActions");
        ViewExtKt.m66594y(llAccountActions2);
        KcSecondaryButton kcSecondaryButton = c37994oM42261X3.f85559b;
        if (C43526f.m95789a()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        kcSecondaryButton.setVisibility(i11);
        KcTextButton tvLogout = c37994oM42261X3.f85556A;
        Intrinsics.checkNotNullExpressionValue(tvLogout, "tvLogout");
        ViewExtKt.m66594y(tvLogout);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        m42260R4();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTitleBar().m58934f();
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
    }
}
