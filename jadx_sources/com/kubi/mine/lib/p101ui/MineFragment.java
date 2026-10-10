package com.kubi.mine.lib.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.advert.api.entity.BackupValue;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.advert.api.entity.Property;
import com.kubi.app.bizcontrol.C9415b;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.api.entity.NoticeConfig;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.event.api.C12572a;
import com.kubi.home.api.IHomeService;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kyc.api.IKycService;
import com.kubi.mine.R$color;
import com.kubi.mine.R$drawable;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$mipmap;
import com.kubi.mine.R$string;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.mine.lib.entity.NPSQuestionEntity;
import com.kubi.mine.lib.entity.NewcomerConfigEntity;
import com.kubi.mine.lib.nps.NPSLite;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.mine.lib.util.MineStorageIds;
import com.kubi.mine.lib.view.AvatarStatus;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.qrcode.api.service.IQrCodeService;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcVipSmallSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcStrokeButton;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.C24128a;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.util.DrawerInject;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.user.api.d;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.utils.storage.StorageType;
import com.kubi.welfare.api.entity.InvitationEntity;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37753e;
import g00.InterfaceC37757i;
import g00.InterfaceC37759k;
import g00.InterfaceC37764p;
import g00.InterfaceC37766r;
import gq.C37981b;
import gq.C37982c;
import gq.C37983d;
import gq.C37984e;
import gq.C37992m;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import iq.InterfaceC40161c;
import iq.InterfaceC40164f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p319hq.InterfaceC38285b;
import p402kf.C41014a;
import p538pq.C43523c;
import p538pq.C43524d;
import p538pq.C43525e;
import p538pq.C43526f;
import p538pq.C43527g;
import p569qq.C43841b;
import p569qq.C43852m;
import p693vj.C45557b;
import p728wk.InterfaceC45851b;
import p778xy.C46338a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: MineFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001dJ$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\f\u0010)\u001a\u00020**\u00020*H\u0002J\f\u0010+\u001a\u00020**\u00020*H\u0002J\f\u0010,\u001a\u00020**\u00020*H\u0002J\f\u0010-\u001a\u00020**\u00020*H\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\u0019\u00100\u001a\u00020\u001d2\n\b\u0002\u00101\u001a\u0004\u0018\u000102H\u0000¢\u0006\u0002\b3J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u001dH\u0016J\b\u00108\u001a\u00020\u0019H\u0002J\b\u00109\u001a\u00020\u001dH\u0002J\b\u0010:\u001a\u00020\u001dH\u0002J\b\u0010;\u001a\u00020\u001dH\u0002J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010=\u001a\u00020\u001dH\u0002J\u0006\u0010>\u001a\u00020\u001dJ\b\u0010?\u001a\u00020\u0019H\u0002J\b\u0010@\u001a\u00020\u001dH\u0002J\u0012\u0010A\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u0019H\u0003J\u0018\u0010C\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020\u001dH\u0002J\b\u0010O\u001a\u00020\u0019H\u0016J\b\u0010P\u001a\u00020\u001dH\u0002J\b\u0010Q\u001a\u00020\u0019H\u0002J\b\u0010R\u001a\u00020\u0019H\u0002J\b\u0010S\u001a\u00020\u0019H\u0002J\b\u0010T\u001a\u00020\u0019H\u0002J\b\u0010U\u001a\u00020\u001dH\u0002J\u0012\u0010V\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u0019H\u0002J\u0010\u0010W\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020\u0019H\u0002JD\u0010Y\u001a\u00020\u001d2\b\b\u0002\u0010Z\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020[2\b\b\u0002\u0010]\u001a\u00020^2\b\b\u0002\u0010_\u001a\u00020`2\b\b\u0002\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020`H\u0002J\b\u0010c\u001a\u00020\u001dH\u0002J\u0010\u0010d\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010f\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010g\u001a\u00020\u001dH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010G\u001a\n I*\u0004\u0018\u00010H0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0017\u001a\u0004\bJ\u0010KR\u0016\u0010M\u001a\n I*\u0004\u0018\u00010N0NX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/MineFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentMineBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentMineBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "userinfoBinding", "Lcom/kubi/mine/databinding/BmineLayoutUserinfoBinding;", "referralBinding", "Lcom/kubi/mine/databinding/BmineLayoutReferralBinding;", "newcomerBinding", "Lcom/kubi/mine/databinding/BmineLayoutNewcomerBinding;", "kycGuideBinding", "Lcom/kubi/mine/databinding/BmineLayoutKycGuideBinding;", "mModel", "Lcom/kubi/mine/lib/ui/MineViewModel;", "getMModel", "()Lcom/kubi/mine/lib/ui/MineViewModel;", "mModel$delegate", "Lkotlin/Lazy;", "isLite", "", "drawerInject", "Lcom/kubi/sdk/util/DrawerInject;", "setDrawerInject", "", "removeDrawerInject", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "withLang", "", "lang2SubPath", "appendTransparentTitle", "adjustHost", "tryShowLayoutInvite", "isReferralAffiliate", "updateInviteInfo", "invitation", "Lcom/kubi/welfare/api/entity/InvitationEntity;", "updateInviteInfo$MineLib_googleRelease", "initObservers", "observeKycStatus", "observeKycGuide", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "isUseDrawerInject", "initViews", "gotoEditUserInfo", "updateUIOnGlobalSite", "setRewardHubEntrance", "loadVipIcon", "refreshData", "isSubAccountSession", "updateSubAccountTag", "updateInfo", "isInit", "configSwitchDeductFee", "loginUserEntity", "Lcom/kubi/user/model/LoginUserEntity;", "showGuide2KcsTrade", "assetApi", "Lcom/kubi/mine/lib/api/MineApi;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/mine/lib/api/MineApi;", "assetApi$delegate", "kcsBalance", "Ljava/math/BigDecimal;", "onBackPressed", "closeMineSlidePage", "isAccountBenefitTitleVisible", "isSecuritySettingVisible", "isRewardsCenterVisible", "isToolsHelpVisible", "getKcsBalance", "refreshHeadAndNickName", "configAvatarStatus", "showEdit", "startSecurityGuardShakeAnimation", "totalCycles", "", "shakesPerCycle", "swingDegrees", "", "durationPerShake", "", "pauseBetweenCycles", "startDelay", "hideLiteEntrance", "updateSwitchAccountEntrance", "updateMultiAccountRedDot", "hideMultiAccountRedDot", "showMultiAccountSwitchPop", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineFragment.kt\ncom/kubi/mine/lib/ui/MineFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1438:1\n147#2,16:1439\n106#3,15:1455\n1#4:1470\n32#5:1471\n23#5,2:1472\n135#5,2:1482\n126#5,2:1484\n135#5,2:1506\n126#5,2:1508\n25#6,3:1474\n25#6,3:1477\n25#6,2:1480\n27#6:1486\n25#6,3:1487\n25#6,3:1490\n25#6,3:1522\n25#6,3:1525\n296#7:1493\n296#7:1494\n296#7:1495\n296#7:1496\n296#7:1497\n296#7:1498\n296#7:1499\n296#7:1500\n296#7:1501\n296#7:1502\n296#7:1503\n296#7:1504\n296#7:1505\n326#7,4:1510\n326#7,4:1514\n326#7,4:1518\n*S KotlinDebug\n*F\n+ 1 MineFragment.kt\ncom/kubi/mine/lib/ui/MineFragment\n*L\n143#1:1439,16\n152#1:1455,15\n249#1:1471\n293#1:1472,2\n535#1:1482,2\n538#1:1484,2\n1404#1:1506,2\n1415#1:1508,2\n341#1:1474,3\n517#1:1477,3\n530#1:1480,2\n530#1:1486\n619#1:1487,3\n871#1:1490,3\n565#1:1522,3\n728#1:1525,3\n1152#1:1493\n1153#1:1494\n1154#1:1495\n1155#1:1496\n1156#1:1497\n1162#1:1498\n1163#1:1499\n1169#1:1500\n1170#1:1501\n1171#1:1502\n1177#1:1503\n1178#1:1504\n1179#1:1505\n411#1:1510,4\n503#1:1514,4\n507#1:1518,4\n*E\n"})
public final class MineFragment extends BaseFragment {

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public static Function1<? super LinearLayout, Unit> f35194i0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35195U = C45681e.m100799e(this, new Function1<MineFragment, C37992m>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37992m invoke(@NotNull MineFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37992m.m85859a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37992m, Unit>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37992m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37992m c37992m) {
            invoke(c37992m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public C37984e f35196V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public C37983d f35197W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public C37982c f35198X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public C37981b f35199Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f35200Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f35201a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public DrawerInject f35202b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f35203c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f35204d0;

    /* JADX INFO: renamed from: e0 */
    public BigDecimal f35205e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f35192g0 = {Reflection.property1(new PropertyReference1Impl(MineFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentMineBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f35191f0 = new Companion(null);

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final StorageId<Boolean> f35193h0 = new StorageId<>("MineFragment", "security_guard_show", StorageType.Shared, false, 8, null);

    /* JADX INFO: compiled from: MineFragment.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/MineFragment$Companion;", "", "<init>", "()V", "TOC_PAGE_ID", "", "PAGE_ID", "CATEGORY", "SUB_ACCOUNT_USER_TYPE", "", "SERVICE_PAGE_ID", "FRESHMAN_CLICK", "safeGuardShow", "Lcom/kubi/utils/storage/StorageId;", "", "getSafeGuardShow", "()Lcom/kubi/utils/storage/StorageId;", "SECURITY_GUARD_SHOW", "injectUI", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "", "getInjectUI", "()Lkotlin/jvm/functions/Function1;", "setInjectUI", "(Lkotlin/jvm/functions/Function1;)V", "newInstance", "Lcom/kubi/mine/lib/ui/MineFragment;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MineFragment newInstance() {
            return new MineFragment();
        }

        @Nullable
        public final Function1<LinearLayout, Unit> getInjectUI() {
            return MineFragment.f35194i0;
        }

        @NotNull
        public final StorageId<Boolean> getSafeGuardShow() {
            return MineFragment.f35193h0;
        }

        public final void setInjectUI(@Nullable Function1<? super LinearLayout, Unit> function1) {
            MineFragment.f35194i0 = function1;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineFragment$a */
    /* JADX INFO: compiled from: MineFragment.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19019a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f35206b;

        public C19019a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f35206b = function;
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
            return this.f35206b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35206b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineFragment$b */
    /* JADX INFO: compiled from: MineFragment.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/mine/lib/ui/MineFragment$startSecurityGuardShakeAnimation$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewDetachedFromWindow", "", "v", "Landroid/view/View;", "onViewAttachedToWindow", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnAttachStateChangeListenerC19020b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f35207b;

        public ViewOnAttachStateChangeListenerC19020b(Runnable runnable) {
            this.f35207b = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            v11.removeCallbacks(this.f35207b);
            v11.removeOnAttachStateChangeListener(this);
            v11.setTag(R$id.ivSecurityGuard, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineFragment$c */
    /* JADX INFO: compiled from: MineFragment.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/mine/lib/ui/MineFragment$startSecurityGuardShakeAnimation$delayedStart$1$startSingleSwingCycle$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationCancel", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19021c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.IntRef f35208a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f35209b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageView f35210c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f35211d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f35212e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f35213f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f35214g;

        public C19021c(Ref.IntRef intRef, int i11, ImageView imageView, long j11, int i12, long j12, float f11) {
            this.f35208a = intRef;
            this.f35209b = i11;
            this.f35210c = imageView;
            this.f35211d = j11;
            this.f35212e = i12;
            this.f35213f = j12;
            this.f35214g = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f35210c.setTag(R$id.ivSecurityGuard, null);
            this.f35210c.setRotation(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            final Ref.IntRef intRef = this.f35208a;
            int i11 = intRef.element + 1;
            intRef.element = i11;
            final int i12 = this.f35209b;
            if (i11 >= i12) {
                this.f35210c.setTag(R$id.ivSecurityGuard, null);
                this.f35210c.setRotation(0.0f);
                return;
            }
            final ImageView imageView = this.f35210c;
            final int i13 = this.f35212e;
            final long j11 = this.f35213f;
            final float f11 = this.f35214g;
            final long j12 = this.f35211d;
            imageView.postDelayed(new Runnable() { // from class: com.kubi.mine.lib.ui.y2
                @Override // java.lang.Runnable
                public final void run() {
                    MineFragment.C19021c.m42125b(imageView, i13, j11, f11, intRef, i12, j12);
                }
            }, this.f35211d);
        }

        /* JADX INFO: renamed from: b */
        public static final void m42125b(ImageView imageView, int i11, long j11, float f11, Ref.IntRef intRef, int i12, long j12) {
            MineFragment.m42024i6(imageView, i11, j11, f11, intRef, i12, j12);
        }
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m41972N5(MineFragment mineFragment, KycStatusEntity kycStatusEntity) {
        AppCompatTextView appCompatTextView;
        C43841b.m96557d("event_click_home_mine", "page_load_end", null, 4, null);
        C37984e c37984e = mineFragment.f35196V;
        if (c37984e == null || (appCompatTextView = c37984e.f85449q) == null) {
            return Unit.INSTANCE;
        }
        if (kycStatusEntity == null) {
            ViewExtKt.m66577h(appCompatTextView);
            return Unit.INSTANCE;
        }
        String displayText = kycStatusEntity.getDisplayText();
        if (displayText == null) {
            displayText = "";
        }
        appCompatTextView.setText(displayText);
        if (KycStyleType.WARN.equalString(kycStatusEntity.getDisplayType())) {
            ViewExtKt.m66594y(appCompatTextView);
            appCompatTextView.setBackgroundResource(R$drawable.shape_complementary8_4r);
            int i11 = R$color.complementary;
            appCompatTextView.setTextColor(mineFragment.getColorRes(i11));
            C27046k.m66702q(appCompatTextView, mineFragment.getColorRes(i11));
        } else if (KycStyleType.ERROR.equalString(kycStatusEntity.getDisplayType())) {
            ViewExtKt.m66594y(appCompatTextView);
            appCompatTextView.setBackgroundResource(R$drawable.shape_secondary8_4r);
            int i12 = R$color.brandRed;
            appCompatTextView.setTextColor(mineFragment.getColorRes(i12));
            C27046k.m66702q(appCompatTextView, mineFragment.getColorRes(i12));
        } else if (KycStyleType.SUCCESS.equalString(kycStatusEntity.getDisplayType())) {
            ViewExtKt.m66594y(appCompatTextView);
            appCompatTextView.setBackgroundResource(R$drawable.shape_cover4_4r);
            int i13 = R$color.c_text40;
            appCompatTextView.setTextColor(mineFragment.getColorRes(i13));
            C27046k.m66702q(appCompatTextView, mineFragment.getColorRes(i13));
        } else {
            ViewExtKt.m66577h(appCompatTextView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m41978P5(MineFragment mineFragment, LoginUserEntity loginUserEntity) {
        m42034l6(mineFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T5 */
    public static final Unit m41989T5(MineFragment mineFragment) {
        m42034l6(mineFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    public final String m42100G5(String str) {
        return d.d(str, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m42112X5() {
        this.f35202b0 = null;
    }

    /* JADX INFO: renamed from: B6 */
    public static final Unit m41950B6(MineFragment mineFragment) {
        C43852m.m96591c("B1mine", "scan", "1", null, 8, null);
        IQrCodeService.f40829a.get().handleScanCode(mineFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m41957G4(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m41959H4(MineFragment mineFragment, final C37992m c37992m, CompoundButton compoundButton, final boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        if (!MineDepend.f35159a.m41829h()) {
            return Unit.INSTANCE;
        }
        if (z11 && mineFragment.f35205e0.doubleValue() == 0.0d) {
            mineFragment.m42115b6();
            c37992m.f85548u.post(new Runnable() { // from class: com.kubi.mine.lib.ui.p2
                @Override // java.lang.Runnable
                public final void run() {
                    MineFragment.m41961I4(c37992m);
                }
            });
            return Unit.INSTANCE;
        }
        Disposable disposableSubscribe = mineFragment.m41988T4().m42150G(z11).subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.r2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineFragment.m41964J4(c37992m, z11, obj);
            }
        }, new C24223c1(null));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, mineFragment.getDestroyDisposable());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultType", C27025c.m66566d(Boolean.valueOf(c37992m.f85548u.isChecked())));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1mine", "payKCS", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m41961I4(C37992m c37992m) {
        c37992m.f85548u.setChecked(false);
    }

    /* JADX INFO: renamed from: I5 */
    public static final Unit m41962I5(String str) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, d.a.b(str), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m41964J4(C37992m c37992m, boolean z11, Object obj) {
        ToastCompat.m66437C(C27025c.m66566d(Boolean.valueOf(c37992m.f85548u.isChecked())) ? R$string.func_enable : R$string.func_disable);
        MineDepend.f35159a.m41826e().setDeductionEnabled(z11);
    }

    /* JADX INFO: renamed from: K5 */
    public static final Unit m41966K5(MineFragment mineFragment, final IPLimitConfig iPLimitConfig) throws JSONException {
        LinearLayoutCompat linearLayoutCompat;
        ImageView imageView;
        LinearLayoutCompat linearLayoutCompat2;
        ImageView imageView2;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        LinearLayoutCompat linearLayoutCompat7;
        ImageView imageView3;
        LinearLayoutCompat linearLayoutCompat8;
        LinearLayoutCompat linearLayoutCompat9;
        LinearLayoutCompat linearLayoutCompat10;
        ImageView imageView4;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayoutCompat linearLayoutCompat11;
        if (iPLimitConfig == null || mineFragment.f35201a0 || !C24129b.m58030b(SiteVisibleConfigKey.Kyc)) {
            C37981b c37981b = mineFragment.f35199Y;
            if (c37981b != null && (linearLayoutCompat = c37981b.f85415d) != null) {
                ViewExtKt.m66577h(linearLayoutCompat);
            }
            return Unit.INSTANCE;
        }
        final NoticeConfig notice = iPLimitConfig.getNotice();
        if (notice == null) {
            C37981b c37981b2 = mineFragment.f35199Y;
            if (c37981b2 != null && (linearLayoutCompat11 = c37981b2.f85415d) != null) {
                ViewExtKt.m66577h(linearLayoutCompat11);
            }
            return Unit.INSTANCE;
        }
        C37981b c37981b3 = mineFragment.f35199Y;
        if (c37981b3 != null && (baseTextView2 = c37981b3.f85417f) != null) {
            String title = notice.getTitle();
            if (title == null) {
                title = "";
            }
            if (StringsKt.isBlank(title)) {
                title = mineFragment.getString(R$string.dialog_title_text_tip);
                Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
            }
            baseTextView2.setText(title);
        }
        C37981b c37981b4 = mineFragment.f35199Y;
        if (c37981b4 != null && (baseTextView = c37981b4.f85416e) != null) {
            String topMessage = notice.getTopMessage();
            baseTextView.setText(topMessage != null ? topMessage : "");
        }
        final String buttonAgreeAppUrl = notice.getButtonAgreeAppUrl();
        if (buttonAgreeAppUrl == null || StringsKt.isBlank(buttonAgreeAppUrl)) {
            C37981b c37981b5 = mineFragment.f35199Y;
            if (c37981b5 != null && (imageView = c37981b5.f85413b) != null) {
                imageView.setVisibility(8);
            }
        } else {
            C37981b c37981b6 = mineFragment.f35199Y;
            if (c37981b6 != null && (imageView4 = c37981b6.f85413b) != null) {
                imageView4.setVisibility(0);
            }
            C37981b c37981b7 = mineFragment.f35199Y;
            if (c37981b7 != null && (linearLayoutCompat10 = c37981b7.f85415d) != null) {
                C27046k.m66710y(linearLayoutCompat10, 1000L, new Function0() { // from class: com.kubi.mine.lib.ui.s2
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m41968L5(buttonAgreeAppUrl, notice, iPLimitConfig);
                    }
                });
            }
        }
        if (KycStyleType.WARN.equalString(notice.getDisplayType())) {
            C37981b c37981b8 = mineFragment.f35199Y;
            if (c37981b8 != null && (linearLayoutCompat9 = c37981b8.f85415d) != null) {
                ViewExtKt.m66594y(linearLayoutCompat9);
            }
            C37981b c37981b9 = mineFragment.f35199Y;
            if (c37981b9 != null && (linearLayoutCompat8 = c37981b9.f85415d) != null) {
                linearLayoutCompat8.setBackgroundResource(R$drawable.shape_complementary8_12r);
            }
            C37981b c37981b10 = mineFragment.f35199Y;
            if (c37981b10 != null && (imageView3 = c37981b10.f85414c) != null) {
                C27046k.m66701p(imageView3, mineFragment.getColorRes(R$color.complementary));
            }
        } else if (KycStyleType.ERROR.equalString(notice.getDisplayType())) {
            C37981b c37981b11 = mineFragment.f35199Y;
            if (c37981b11 != null && (linearLayoutCompat4 = c37981b11.f85415d) != null) {
                ViewExtKt.m66594y(linearLayoutCompat4);
            }
            C37981b c37981b12 = mineFragment.f35199Y;
            if (c37981b12 != null && (linearLayoutCompat3 = c37981b12.f85415d) != null) {
                linearLayoutCompat3.setBackgroundResource(R$drawable.shape_secondary8_12r);
            }
            C37981b c37981b13 = mineFragment.f35199Y;
            if (c37981b13 != null && (imageView2 = c37981b13.f85414c) != null) {
                C27046k.m66701p(imageView2, mineFragment.getColorRes(R$color.brandRed));
            }
        } else {
            C37981b c37981b14 = mineFragment.f35199Y;
            if (c37981b14 != null && (linearLayoutCompat2 = c37981b14.f85415d) != null) {
                ViewExtKt.m66577h(linearLayoutCompat2);
            }
        }
        C37981b c37981b15 = mineFragment.f35199Y;
        if (C27025c.m66566d((c37981b15 == null || (linearLayoutCompat7 = c37981b15.f85415d) == null) ? null : Boolean.valueOf(ViewExtKt.m66581l(linearLayoutCompat7)))) {
            C43524d.m95781c(false, notice.getDisplayType(), iPLimitConfig.getBizType(), notice.getConfigCode());
            C37983d c37983d = mineFragment.f35197W;
            if (c37983d != null && (linearLayoutCompat6 = c37983d.f85428d) != null) {
                ViewGroup.LayoutParams layoutParams = linearLayoutCompat6.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C27029c.m66603f(mineFragment, 14);
                linearLayoutCompat6.setLayoutParams(marginLayoutParams);
            }
        } else {
            C37983d c37983d2 = mineFragment.f35197W;
            if (c37983d2 != null && (linearLayoutCompat5 = c37983d2.f85428d) != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayoutCompat5.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = C27029c.m66603f(mineFragment, 18);
                linearLayoutCompat5.setLayoutParams(marginLayoutParams2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L5 */
    public static final Unit m41968L5(String str, NoticeConfig noticeConfig, IPLimitConfig iPLimitConfig) throws JSONException {
        Router.f46192a.m56184f(str).m4048k();
        C43524d.m95781c(true, noticeConfig.getDisplayType(), iPLimitConfig.getBizType(), noticeConfig.getConfigCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final BigDecimal m41971N4(SingleCurrencyBalance t11, SingleCurrencyBalance t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        return t11.getTotalBalance().add(t12.getTotalBalance());
    }

    /* JADX INFO: renamed from: O4 */
    public static final BigDecimal m41974O4(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (BigDecimal) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m41977P4(MineFragment mineFragment, BigDecimal bigDecimal) {
        mineFragment.f35205e0 = bigDecimal;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S5 */
    public static final Unit m41986S5() {
        MineDepend.f35159a.m41832k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    private final MineViewModel m41988T4() {
        return (MineViewModel) this.f35200Z.getValue();
    }

    /* JADX INFO: renamed from: Y4 */
    private final void m41998Y4() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88513b(new Function0() { // from class: com.kubi.mine.lib.ui.f1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42000Z4(this.f35278b);
                }
            });
            return;
        }
        m41988T4().m42159z().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m42002a5(this.f35283b, (InvitationEntity) obj);
            }
        }));
        m41988T4().m42146C().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m42005b5(this.f35288b, (NewcomerConfigEntity) obj);
            }
        }));
        m42106M5();
        m42102J5();
        m41988T4().m42147D().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m42010d5(this.f35293b, (NPSQuestionEntity) obj);
            }
        }));
        m41988T4().m42148E().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m42012e5(this.f35302b, (PromotionConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m42003a6(MineFragment mineFragment) {
        String name = MineFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(mineFragment, name, null, 2, null);
        Router.f46192a.m56184f(C43523c.f96059a.m95778d()).m4048k();
        C43524d.m95783e("B1mine", "rewardsHub", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m42005b5(MineFragment mineFragment, NewcomerConfigEntity newcomerConfigEntity) {
        String strM89946t;
        BigDecimal displayTotalAmount;
        final C37982c c37982c = mineFragment.f35198X;
        if (c37982c != null) {
            LinearLayoutCompat clMineNewbie = c37982c.f85419b;
            Intrinsics.checkNotNullExpressionValue(clMineNewbie, "clMineNewbie");
            if (C9415b.m15004b(clMineNewbie, C43852m.m96601m("B1mine", "beginnerZone", "1"), 0, 2, null) == 8) {
                LinearLayoutCompat clMineNewbie2 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie2, "clMineNewbie");
                ViewExtKt.m66577h(clMineNewbie2);
                return Unit.INSTANCE;
            }
            if (mineFragment.f35201a0) {
                LinearLayoutCompat clMineNewbie3 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie3, "clMineNewbie");
                ViewExtKt.m66577h(clMineNewbie3);
                return Unit.INSTANCE;
            }
            if (!C24129b.m58030b(SiteVisibleConfigKey.Welfare)) {
                LinearLayoutCompat clMineNewbie4 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie4, "clMineNewbie");
                ViewExtKt.m66577h(clMineNewbie4);
            }
            final String rewardCenterUri = newcomerConfigEntity != null ? newcomerConfigEntity.getRewardCenterUri() : null;
            if (rewardCenterUri == null) {
                rewardCenterUri = "";
            }
            if (rewardCenterUri.length() == 0) {
                LinearLayoutCompat clMineNewbie5 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie5, "clMineNewbie");
                ViewExtKt.m66577h(clMineNewbie5);
                return Unit.INSTANCE;
            }
            MineDepend mineDepend = MineDepend.f35159a;
            if (!TextUtils.isEmpty(mineDepend.m41826e().id) && !mineDepend.m41829h()) {
                LinearLayoutCompat clMineNewbie6 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie6, "clMineNewbie");
                ViewExtKt.m66577h(clMineNewbie6);
                return Unit.INSTANCE;
            }
            C43524d.m95785g("B1mine", "rewardshub", "1", null, 8, null);
            LinearLayoutCompat clMineNewbie7 = c37982c.f85419b;
            Intrinsics.checkNotNullExpressionValue(clMineNewbie7, "clMineNewbie");
            ViewExtKt.m66594y(clMineNewbie7);
            LinearLayoutCompat clMineNewbie8 = c37982c.f85419b;
            Intrinsics.checkNotNullExpressionValue(clMineNewbie8, "clMineNewbie");
            C27046k.m66711z(clMineNewbie8, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.k2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42007c5(c37982c, rewardCenterUri);
                }
            }, 1, null);
            if (C27063n.m66763a(mineDepend.m41826e().id + "freshman_click", false)) {
                TextView tvNewbieTip = c37982c.f85423f;
                Intrinsics.checkNotNullExpressionValue(tvNewbieTip, "tvNewbieTip");
                ViewExtKt.m66577h(tvNewbieTip);
                ImageView ivNewbieEnter = c37982c.f85421d;
                Intrinsics.checkNotNullExpressionValue(ivNewbieEnter, "ivNewbieEnter");
                ViewExtKt.m66594y(ivNewbieEnter);
            } else {
                TextView tvNewbieTip2 = c37982c.f85423f;
                Intrinsics.checkNotNullExpressionValue(tvNewbieTip2, "tvNewbieTip");
                ViewExtKt.m66594y(tvNewbieTip2);
                ImageView ivNewbieEnter2 = c37982c.f85421d;
                Intrinsics.checkNotNullExpressionValue(ivNewbieEnter2, "ivNewbieEnter");
                ViewExtKt.m66577h(ivNewbieEnter2);
            }
            if (newcomerConfigEntity == null || (displayTotalAmount = newcomerConfigEntity.getDisplayTotalAmount()) == null || (strM89946t = C41014a.m89946t(displayTotalAmount, null, RangesKt.coerceAtMost(displayTotalAmount.scale(), 2), true, false, false, false, false, null, 0, 505, null)) == null) {
                strM89946t = "--";
            }
            c37982c.f85422e.setText(mineFragment.getString(R$string.mine_more_welfare_content, strM89946t));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            TextView tvNewbieSubtitle = c37982c.f85422e;
            Intrinsics.checkNotNullExpressionValue(tvNewbieSubtitle, "tvNewbieSubtitle");
            highlightTextHelper.m54116a(tvNewbieSubtitle, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.primary)));
            if (mineDepend.m41829h()) {
                LinearLayoutCompat clMineNewbie9 = c37982c.f85419b;
                Intrinsics.checkNotNullExpressionValue(clMineNewbie9, "clMineNewbie");
                if (C27025c.m66566d(Boolean.valueOf(ViewExtKt.m66581l(clMineNewbie9)))) {
                    LinearLayoutCompat clMineNewbie10 = c37982c.f85419b;
                    Intrinsics.checkNotNullExpressionValue(clMineNewbie10, "clMineNewbie");
                    ViewGroup.LayoutParams layoutParams = clMineNewbie10.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C27029c.m66603f(mineFragment, 18);
                    clMineNewbie10.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m42007c5(C37982c c37982c, String str) {
        C27063n.m66773k(true, MineDepend.f35159a.m41826e().id + "freshman_click");
        TextView tvNewbieTip = c37982c.f85423f;
        Intrinsics.checkNotNullExpressionValue(tvNewbieTip, "tvNewbieTip");
        ViewExtKt.m66577h(tvNewbieTip);
        ImageView ivNewbieEnter = c37982c.f85421d;
        Intrinsics.checkNotNullExpressionValue(ivNewbieEnter, "ivNewbieEnter");
        ViewExtKt.m66594y(ivNewbieEnter);
        Router.f46192a.m56184f(d.a.b(str)).m4048k();
        C43524d.m95783e("B1mine", "beginnerZone", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c6 */
    public static final void m42008c6(DialogInterface dialogInterface, int i11) {
        ISpotService iSpotServiceM41833l = MineDepend.f35159a.m41833l();
        if (iSpotServiceM41833l != null) {
            ISpotService.m59984g(iSpotServiceM41833l, "KCS-USDT", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m42012e5(MineFragment mineFragment, PromotionConfig promotionConfig) {
        List<Property> properties;
        Property property;
        BackupValue backupValues;
        String text;
        List<Property> properties2;
        Property property2;
        String value;
        if (mineFragment.f35203c0) {
            return Unit.INSTANCE;
        }
        C37983d c37983d = mineFragment.f35197W;
        if (c37983d != null) {
            if (promotionConfig != null && (properties2 = promotionConfig.getProperties()) != null && (property2 = (Property) CollectionsKt.firstOrNull((List) properties2)) != null && (value = property2.getValue()) != null) {
                c37983d.f85432h.setText(value);
            }
            if (promotionConfig != null && (properties = promotionConfig.getProperties()) != null && (property = (Property) CollectionsKt.firstOrNull((List) properties)) != null && (backupValues = property.getBackupValues()) != null && (text = backupValues.getText()) != null) {
                c37983d.f85430f.setText(text);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    private final void m42015f5() {
        String stringRes;
        final C37992m c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 != null) {
            if (m42099F5()) {
                LinearLayoutCompat llTitleBar = c37992mM42104L4.f85544q;
                Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
                ViewExtKt.m66585p(llTitleBar, 0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0, 13, null);
            }
            LinearLayout linearLayout = c37992mM42104L4.f85538k;
            Function1<? super LinearLayout, Unit> function1 = f35194i0;
            if (function1 != null) {
                Intrinsics.checkNotNull(linearLayout);
                function1.invoke(linearLayout);
            }
            View viewRedDot = c37992mM42104L4.f85527U;
            Intrinsics.checkNotNullExpressionValue(viewRedDot, "viewRedDot");
            ViewExtKt.m66577h(viewRedDot);
            BaseTextView tvProfitTip = c37992mM42104L4.f85512F;
            Intrinsics.checkNotNullExpressionValue(tvProfitTip, "tvProfitTip");
            ViewExtKt.m66577h(tvProfitTip);
            m42123x6(c37992mM42104L4);
            ImageView ivCustomer = c37992mM42104L4.f85534g;
            Intrinsics.checkNotNullExpressionValue(ivCustomer, "ivCustomer");
            C27046k.m66710y(ivCustomer, 1000L, new Function0() { // from class: com.kubi.mine.lib.ui.w2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42017g5(this.f35400b);
                }
            });
            ImageView ivMineBack = c37992mM42104L4.f85536i;
            Intrinsics.checkNotNullExpressionValue(ivMineBack, "ivMineBack");
            C27046k.m66711z(ivMineBack, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42020h5(this.f35394b);
                }
            }, 1, null);
            LinearLayout llSafeSetting = c37992mM42104L4.f85542o;
            Intrinsics.checkNotNullExpressionValue(llSafeSetting, "llSafeSetting");
            C27046k.m66711z(llSafeSetting, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42023i5();
                }
            }, 1, null);
            LinearLayoutCompat flInoutHis = c37992mM42104L4.f85531d;
            Intrinsics.checkNotNullExpressionValue(flInoutHis, "flInoutHis");
            C27046k.m66711z(flInoutHis, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42027j5();
                }
            }, 1, null);
            BaseTextView tvSettings = c37992mM42104L4.f85518L;
            Intrinsics.checkNotNullExpressionValue(tvSettings, "tvSettings");
            C27046k.m66711z(tvSettings, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42030k5();
                }
            }, 1, null);
            BaseTextView tvHelpCenter = c37992mM42104L4.f85553z;
            Intrinsics.checkNotNullExpressionValue(tvHelpCenter, "tvHelpCenter");
            C27046k.m66711z(tvHelpCenter, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42033l5();
                }
            }, 1, null);
            if (C24129b.m58030b(SiteVisibleConfigKey.Api)) {
                BaseTextView tvApi = c37992mM42104L4.f85550w;
                Intrinsics.checkNotNullExpressionValue(tvApi, "tvApi");
                C27046k.m66685H(tvApi);
                BaseTextView tvApi2 = c37992mM42104L4.f85550w;
                Intrinsics.checkNotNullExpressionValue(tvApi2, "tvApi");
                C27046k.m66711z(tvApi2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.b1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m42037m5();
                    }
                }, 1, null);
            } else {
                BaseTextView tvApi3 = c37992mM42104L4.f85550w;
                Intrinsics.checkNotNullExpressionValue(tvApi3, "tvApi");
                C27046k.m66700o(tvApi3);
            }
            Object objM56186h = Router.f46192a.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null) {
                ((InterfaceC40161c) objM56186h).m88515d(c37992mM42104L4);
            } else {
                m42114Z5(c37992mM42104L4);
                BaseTextView tvSurvey = c37992mM42104L4.f85521O;
                Intrinsics.checkNotNullExpressionValue(tvSurvey, "tvSurvey");
                C27046k.m66711z(tvSurvey, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.c1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m42041n5(this.f35262b);
                    }
                }, 1, null);
                ImageView ivCustomer2 = c37992mM42104L4.f85534g;
                Intrinsics.checkNotNullExpressionValue(ivCustomer2, "ivCustomer");
                ViewExtKt.m66594y(ivCustomer2);
                c37992mM42104L4.f85534g.setSelected(DayNightThemeManager.f28592a.m33187l());
            }
            boolean zM58028a = C24128a.m58028a();
            boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.FriendShare);
            if (zM58028a || zM58030b) {
                LinearLayout llSocialFriends = c37992mM42104L4.f85543p;
                Intrinsics.checkNotNullExpressionValue(llSocialFriends, "llSocialFriends");
                C9415b.m15004b(llSocialFriends, C43852m.m96601m("B1mine", "friends", "1"), 0, 2, null);
                BaseTextView baseTextView = c37992mM42104L4.f85520N;
                if (zM58028a && zM58030b) {
                    stringRes = getStringRes(R$string.mine_friend_social_detail, new Object[0]);
                } else {
                    stringRes = zM58028a ? getStringRes(R$string.red_package, new Object[0]) : "";
                }
                baseTextView.setText(stringRes);
            } else {
                LinearLayout llSocialFriends2 = c37992mM42104L4.f85543p;
                Intrinsics.checkNotNullExpressionValue(llSocialFriends2, "llSocialFriends");
                C27046k.m66700o(llSocialFriends2);
            }
            LinearLayout llSocialFriends3 = c37992mM42104L4.f85543p;
            Intrinsics.checkNotNullExpressionValue(llSocialFriends3, "llSocialFriends");
            C27046k.m66711z(llSocialFriends3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42049p5(this.f35268b);
                }
            }, 1, null);
            LinearLayout llProfit = c37992mM42104L4.f85540m;
            Intrinsics.checkNotNullExpressionValue(llProfit, "llProfit");
            C27046k.m66711z(llProfit, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.e1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42053q5(this.f35271b, c37992mM42104L4);
                }
            }, 1, null);
            m42089A6();
        }
        final C37984e c37984e = this.f35196V;
        if (c37984e != null) {
            UploadAvatarImageView imgHead = c37984e.f85438f;
            Intrinsics.checkNotNullExpressionValue(imgHead, "imgHead");
            C27046k.m66711z(imgHead, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.x2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42056r5(this.f35405b);
                }
            }, 1, null);
            ImageView ivEditUserInfo = c37984e.f85440h;
            Intrinsics.checkNotNullExpressionValue(ivEditUserInfo, "ivEditUserInfo");
            C27046k.m66711z(ivEditUserInfo, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42060s5(this.f35328b);
                }
            }, 1, null);
            ImageView icHeadAvatarVipIcon = c37984e.f85437e;
            Intrinsics.checkNotNullExpressionValue(icHeadAvatarVipIcon, "icHeadAvatarVipIcon");
            C27046k.m66711z(icHeadAvatarVipIcon, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42064t5();
                }
            }, 1, null);
            KcStrokeButton tvLogIn = c37984e.f85450r;
            Intrinsics.checkNotNullExpressionValue(tvLogIn, "tvLogIn");
            C27046k.m66711z(tvLogIn, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42068u5(this.f35336b);
                }
            }, 1, null);
            KcPrimaryButton tvSignUp = c37984e.f85452t;
            Intrinsics.checkNotNullExpressionValue(tvSignUp, "tvSignUp");
            C27046k.m66711z(tvSignUp, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42075w5();
                }
            }, 1, null);
            AppCompatTextView tvKycState = c37984e.f85449q;
            Intrinsics.checkNotNullExpressionValue(tvKycState, "tvKycState");
            C27046k.m66711z(tvKycState, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42078x5();
                }
            }, 1, null);
            LinearLayoutCompat llCopyUserId = c37984e.f85444l;
            Intrinsics.checkNotNullExpressionValue(llCopyUserId, "llCopyUserId");
            C27046k.m66711z(llCopyUserId, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42081y5(this.f35358b);
                }
            }, 1, null);
            ImageView ivCopyUid = c37984e.f85439g;
            Intrinsics.checkNotNullExpressionValue(ivCopyUid, "ivCopyUid");
            C27046k.m66711z(ivCopyUid, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42085z5(c37984e);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m42017g5(MineFragment mineFragment) {
        Router router = Router.f46192a;
        Object objM56186h = router.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88516e(mineFragment.getContext());
        } else {
            router.m56184f(IHomeService.f25434a.get().mo28946b()).m4048k();
            C43524d.m95783e("B1mine", "helpCenter", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g6 */
    public static /* synthetic */ void m42018g6(MineFragment mineFragment, int i11, int i12, float f11, long j11, long j12, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 2;
        }
        if ((i13 & 2) != 0) {
            i12 = 3;
        }
        if ((i13 & 4) != 0) {
            f11 = 10.0f;
        }
        if ((i13 & 8) != 0) {
            j11 = 300;
        }
        if ((i13 & 16) != 0) {
            j12 = 500;
        }
        if ((i13 & 32) != 0) {
            j13 = 800;
        }
        long j14 = j13;
        long j15 = j12;
        float f12 = f11;
        int i14 = i11;
        mineFragment.m42117f6(i14, i12, f12, j11, j15, j14);
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m42023i5() {
        C43852m.m96591c("B1mine", "security", null, null, 12, null);
        IUserService.Companion companion = IUserService.a;
        if (companion.get().B()) {
            InterfaceC37759k.a.m85172f(C37304a.f82764a, null, null, null, 7, null);
        } else {
            Router.f46192a.m56184f(companion.get().f0()).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m42027j5() {
        C43852m.m96591c("B1mine", "history", null, null, 12, null);
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m42030k5() {
        C43524d.m95783e("B1mine", "settings", "1", null, 8, null);
        InterfaceC37757i.a.m85151c(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m42033l5() {
        C43852m.m96591c("B1mine", "support", null, null, 12, null);
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l6 */
    public static /* synthetic */ void m42034l6(MineFragment mineFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mineFragment.m42119k6(z11);
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m42037m5() {
        C43524d.m95783e("B1mine", "api", "1", null, 8, null);
        MineDepend mineDepend = MineDepend.f35159a;
        if (mineDepend.m41829h()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C43523c.f96059a.m95775a(), null, null, null, null, null, null, 126, null);
        } else {
            IUserService iUserServiceM41834m = mineDepend.m41834m();
            if (iUserServiceM41834m != null) {
                IUserService.O(iUserServiceM41834m, (Map) null, (IRedirect) null, 3, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m6 */
    public static final Unit m42038m6(MineFragment mineFragment) {
        C27057k.m66746b(MineDepend.f35159a.m41826e().uid);
        ToastCompat.m66441G(mineFragment.getString(R$string.copied), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m42041n5(final MineFragment mineFragment) {
        new NPSLite(mineFragment).m41807w(mineFragment.m41988T4().m42147D().getValue(), new Function0() { // from class: com.kubi.mine.lib.ui.h2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragment.m42045o5(this.f35289b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n6 */
    public static final Unit m42042n6() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C43523c.f96059a.m95776b(), null, null, null, null, null, null, 126, null);
        C43852m.m96591c("B1mine", "KCS_level", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o6 */
    public static final Unit m42046o6(C37992m c37992m, LoginUserEntity loginUserEntity) {
        ImageView imageView = c37992m.f85535h;
        String kcsLevelIcon = loginUserEntity.getKcsLevelIcon();
        if (kcsLevelIcon == null || kcsLevelIcon.length() == 0) {
            imageView.setImageResource(0);
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66577h(imageView);
        } else if (C24277v.m58537b(imageView.getContext())) {
            C46338a.m102151a(imageView.getContext()).mo6634v(loginUserEntity.getKcsLevelIcon()).m6594E0(imageView);
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m42049p5(MineFragment mineFragment) {
        C43852m.m96591c("B1mine", "friends", null, null, 12, null);
        IUserService.Companion companion = IUserService.a;
        if (companion.get().X()) {
            Context context = mineFragment.getContext();
            if (context != null) {
                BaseActivity.INSTANCE.launch(context, SocialFriendsFragment.class, mineFragment.getStringRes(R$string.mine_friend_social, new Object[0]));
            }
        } else {
            Router.f46192a.m56184f(companion.get().t()).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p6 */
    public static final Unit m42050p6(MineFragment mineFragment) {
        ISafeService.f46324a.get().m56317k(mineFragment.getContext());
        C43852m.m96591c("B1mine", "security_score", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m42053q5(MineFragment mineFragment, C37992m c37992m) throws JSONException {
        String name = MineFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(mineFragment, name, null, 2, null);
        Router.f46192a.m56184f(C43523c.f96059a.m95777c()).m4048k();
        JSONObject jSONObject = new JSONObject();
        View viewRedDot = c37992m.f85527U;
        Intrinsics.checkNotNullExpressionValue(viewRedDot, "viewRedDot");
        jSONObject.put("yesOrNo", C27025c.m66566d(Boolean.valueOf(ViewExtKt.m66581l(viewRedDot))));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1mine", "bonus", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r6 */
    public static /* synthetic */ void m42057r6(MineFragment mineFragment, InvitationEntity invitationEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            invitationEntity = null;
        }
        mineFragment.m42120q6(invitationEntity);
    }

    /* JADX INFO: renamed from: s6 */
    public static final Unit m42061s6(MineFragment mineFragment) {
        C43852m.m96591c("B1mine", "referral", null, null, 12, null);
        C43852m.m96591c("B3SidebarPage", "tocInviteFriend", null, null, 12, null);
        C37304a c37304a = C37304a.f82764a;
        String INVITE_FRIEND = InterfaceC45851b.f103324f;
        Intrinsics.checkNotNullExpressionValue(INVITE_FRIEND, "INVITE_FRIEND");
        InterfaceC37766r.a.m85190a(c37304a, mineFragment.m42090B4(mineFragment.m42100G5(mineFragment.m42093C6(mineFragment.m42087A4(INVITE_FRIEND)))), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m42064t5() {
        MineDepend mineDepend = MineDepend.f35159a;
        boolean zM41829h = mineDepend.m41829h();
        String honorLevelRef = mineDepend.m41826e().getHonorLevelRef();
        if (honorLevelRef == null) {
            honorLevelRef = "";
        }
        String str = honorLevelRef;
        if (zM41829h && str.length() > 0) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t6 */
    public static final Unit m42065t6(MineFragment mineFragment) {
        C43852m.m96591c("B3SidebarPage", "tocPartner", null, null, 12, null);
        C37304a c37304a = C37304a.f82764a;
        String INVITE_PARTNER = InterfaceC45851b.f103325g;
        Intrinsics.checkNotNullExpressionValue(INVITE_PARTNER, "INVITE_PARTNER");
        InterfaceC37766r.a.m85190a(c37304a, mineFragment.m42090B4(mineFragment.m42100G5(mineFragment.m42093C6(INVITE_PARTNER))), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m42068u5(final MineFragment mineFragment) {
        IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
        if (iUserServiceM41834m != null) {
            iUserServiceM41834m.w(MapsKt.mapOf(TuplesKt.m90091to("preSpmId", "kcApp.B1mine.loginBtn.1")), IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.mine.lib.ui.l2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42072v5(this.f35312b);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u6 */
    public static final Unit m42069u6(MineFragment mineFragment) {
        C37304a c37304a = C37304a.f82764a;
        String INVITE_CN = InterfaceC45851b.f103326h;
        Intrinsics.checkNotNullExpressionValue(INVITE_CN, "INVITE_CN");
        InterfaceC37766r.a.m85190a(c37304a, mineFragment.m42090B4(mineFragment.m42100G5(mineFragment.m42093C6(INVITE_CN))), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m42075w5() {
        IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
        if (iUserServiceM41834m != null) {
            IUserService.G(iUserServiceM41834m, MapsKt.mapOf(TuplesKt.m90091to("preSpmId", "kcApp.B1mine.registerBtn.1")), (IRedirect) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m42078x5() {
        if (MineDepend.f35159a.m41830i()) {
            ToastCompat.m66437C(R$string.service_unavailable_in_country);
            return Unit.INSTANCE;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88517f();
        } else {
            IKycService.f31132a.get().mo36758b();
        }
        C43852m.m96590b("B1mine", "verification", "1", TuplesKt.m90091to("after_page_id", "B1KYCRealtimeResult"), TuplesKt.m90091to("norm_version", "1"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m42081y5(MineFragment mineFragment) {
        MineDepend mineDepend = MineDepend.f35159a;
        if (mineDepend.m41829h()) {
            C43852m.m96591c("B1mine", "copyUID", null, null, 12, null);
            C27057k.m66746b(mineDepend.m41826e().uid);
            ToastCompat.m66441G(mineFragment.getString(R$string.copy_success), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y6 */
    public static final Unit m42082y6(MineFragment mineFragment, C37992m c37992m) {
        MultiAccountSwitchPop.f35225a.m42160a();
        mineFragment.m42111X4(c37992m);
        Router.f46192a.m56184f(IUserService.a.get().E()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m42085z5(C37984e c37984e) {
        c37984e.f85454v.performClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z6 */
    public static final Unit m42086z6(MineFragment mineFragment) throws JSONException {
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        FragmentManager childFragmentManager = mineFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dayNightThemeManager.m33176a(childFragmentManager);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultType", dayNightThemeManager.m33187l() ? C33789m5.f70921k : "night");
        Unit unit = Unit.INSTANCE;
        C43524d.m95782d("B1mine", "colorModeSwitch", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final String m42087A4(String str) {
        return C27041f.m66668h(MineDepend.f35159a.m41831j() != null ? IHomeService.f25434a.get().mo28953i(str) : null);
    }

    /* JADX INFO: renamed from: A6 */
    public final void m42089A6() {
        C37992m c37992mM42104L4;
        ImageView imageView;
        if (!SiteInfoManager.f47913a.m58112f() || !AppMode.INSTANCE.isProMode() || (c37992mM42104L4 = m42104L4()) == null || (imageView = c37992mM42104L4.f85537j) == null) {
            return;
        }
        C27046k.m66685H(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragment.m41950B6(this.f35256b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: B4 */
    public final String m42090B4(String str) {
        return d.a.b(str);
    }

    /* JADX INFO: renamed from: C6 */
    public final String m42093C6(String str) {
        return d.a.a(str);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m42094D4() {
        String name = MineFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
        C12572a.m23695d("com.kubi.home.event.HomeEvent:switchDrawer", Boolean.FALSE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: D5 */
    public final boolean m42095D5() {
        MineDepend mineDepend = MineDepend.f35159a;
        return mineDepend.m41829h() && mineDepend.m41826e().getType() == 3;
    }

    /* JADX INFO: renamed from: E4 */
    public final void m42096E4(boolean z11) {
        ImageView imageView;
        FrameLayout frameLayout;
        ImageView imageView2;
        FrameLayout frameLayout2;
        ImageView imageView3;
        ImageView imageView4;
        UploadAvatarImageView uploadAvatarImageView;
        C37984e c37984e = this.f35196V;
        if (c37984e != null && (uploadAvatarImageView = c37984e.f85438f) != null) {
            uploadAvatarImageView.setAvatarStatus(AvatarStatus.NONE);
        }
        if (z11) {
            C37984e c37984e2 = this.f35196V;
            if (c37984e2 != null && (imageView4 = c37984e2.f85440h) != null) {
                C27046k.m66685H(imageView4);
            }
        } else {
            C37984e c37984e3 = this.f35196V;
            if (c37984e3 != null && (imageView = c37984e3.f85440h) != null) {
                ViewExtKt.m66577h(imageView);
            }
        }
        if (MineDepend.f35159a.m41826e().showVipIcon() && C24129b.m58030b(SiteVisibleConfigKey.Vip) && !m42095D5()) {
            C37984e c37984e4 = this.f35196V;
            if (c37984e4 != null && (imageView3 = c37984e4.f85437e) != null) {
                C27046k.m66685H(imageView3);
            }
            C37992m c37992mM42104L4 = m42104L4();
            if (c37992mM42104L4 == null || (frameLayout2 = c37992mM42104L4.f85533f) == null) {
                return;
            }
            C27046k.m66685H(frameLayout2);
            return;
        }
        C37984e c37984e5 = this.f35196V;
        if (c37984e5 != null && (imageView2 = c37984e5.f85437e) != null) {
            ViewExtKt.m66577h(imageView2);
        }
        C37992m c37992mM42104L5 = m42104L4();
        if (c37992mM42104L5 == null || (frameLayout = c37992mM42104L5.f85533f) == null) {
            return;
        }
        ViewExtKt.m66577h(frameLayout);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m42098F4(final C37992m c37992m, LoginUserEntity loginUserEntity) {
        c37992m.f85548u.updateVipLevel(loginUserEntity.getFeeLevel(), C24129b.m58030b(SiteVisibleConfigKey.Vip) && !m42095D5());
        KcVipSmallSwitchButton switchDeductFee = c37992m.f85548u;
        Intrinsics.checkNotNullExpressionValue(switchDeductFee, "switchDeductFee");
        C27046k.m66708w(switchDeductFee, new Function2() { // from class: com.kubi.mine.lib.ui.d2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MineFragment.m41957G4((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        if (c37992m.f85548u.isChecked() != loginUserEntity.isDeductionEnabled()) {
            c37992m.f85548u.setChecked(loginUserEntity.isDeductionEnabled());
        }
        KcVipSmallSwitchButton switchDeductFee2 = c37992m.f85548u;
        Intrinsics.checkNotNullExpressionValue(switchDeductFee2, "switchDeductFee");
        C27046k.m66708w(switchDeductFee2, new Function2() { // from class: com.kubi.mine.lib.ui.e2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MineFragment.m41959H4(this.f35273b, c37992m, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public final boolean m42099F5() {
        if (this.f35201a0) {
            return false;
        }
        return (C45557b.m100613d() && C45557b.m100614e()) ? false : true;
    }

    /* JADX INFO: renamed from: K4 */
    public final InterfaceC38285b m42103K4() {
        return (InterfaceC38285b) this.f35204d0.getValue();
    }

    /* JADX INFO: renamed from: L4 */
    public final C37992m m42104L4() {
        return (C37992m) this.f35195U.getValue(this, f35192g0[0]);
    }

    /* JADX INFO: renamed from: R5 */
    public final void m42107R5() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88514c(new Function0() { // from class: com.kubi.mine.lib.ui.f2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m41986S5();
                }
            }, new Function0() { // from class: com.kubi.mine.lib.ui.q2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m41989T5(this.f35339b);
                }
            });
            return;
        }
        MineDepend mineDepend = MineDepend.f35159a;
        if (mineDepend.m41829h()) {
            mineDepend.m41832k();
            Observable<Boolean> observableM42157v = m41988T4().m42157v();
            final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.u2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MineFragment.m41991U5(this.f35365b, (Boolean) obj);
                }
            };
            Disposable disposableSubscribe = observableM42157v.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.v2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MineFragment.m41994V5(function1, obj);
                }
            }, new C24223c1(null, false));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            m41988T4().m42154o();
        }
        m42034l6(this, false, 1, null);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m42108U4() {
        MineDepend mineDepend = MineDepend.f35159a;
        if (!mineDepend.m41829h()) {
            IUserService iUserServiceM41834m = mineDepend.m41834m();
            if (iUserServiceM41834m != null) {
                IUserService.O(iUserServiceM41834m, (Map) null, (IRedirect) null, 3, (Object) null);
            }
        } else if (mineDepend.m41826e().getCanModifyNickname()) {
            InterfaceC37764p.a.m85184e(C37304a.f82764a, null, null, null, 7, null);
        } else {
            String disableModificationTip = mineDepend.m41826e().getDisableModificationTip();
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4((disableModificationTip == null || disableModificationTip.length() == 0) ? getString(R$string.common_text_network_error) : mineDepend.m41826e().getDisableModificationTip()).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.g2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    MineFragment.m41993V4(dialogInterface, i11);
                }
            }).m54172c5(getChildFragmentManager());
        }
        C43852m.m96591c("B1mine", "avatar", null, null, 12, null);
    }

    /* JADX INFO: renamed from: W5 */
    public final void m42110W5(boolean z11) {
        C37984e c37984e;
        MineDepend mineDepend = MineDepend.f35159a;
        if (mineDepend.m41829h()) {
            if (z11 && (c37984e = this.f35196V) != null) {
                TextView textView = c37984e.f85448p;
                String nicknameShow = mineDepend.m41826e().getNicknameShow();
                if (nicknameShow == null) {
                    nicknameShow = "";
                }
                textView.setText(nicknameShow);
                c37984e.f85448p.requestLayout();
                UploadAvatarImageView.m42365m(c37984e.f85438f, mineDepend.m41826e().getAvatar(), false, false, 6, null);
                m42096E4(true);
            }
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new MineFragment$refreshHeadAndNickName$2(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final void m42111X4(C37992m c37992m) {
        C46392a.m102328k(C43525e.f96060a.m95787a(), true);
        View vSwitchAccountRedDot = c37992m.f85526T;
        Intrinsics.checkNotNullExpressionValue(vSwitchAccountRedDot, "vSwitchAccountRedDot");
        ViewExtKt.m66577h(vSwitchAccountRedDot);
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m42113Y5(@NotNull DrawerInject drawerInject) {
        Intrinsics.checkNotNullParameter(drawerInject, "drawerInject");
        this.f35202b0 = drawerInject;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m42114Z5(C37992m c37992m) {
        BaseTextView tvRewardhub = c37992m.f85513G;
        Intrinsics.checkNotNullExpressionValue(tvRewardhub, "tvRewardhub");
        if (C9415b.m15004b(tvRewardhub, C43852m.m96601m("B1mine", "newuser", "1"), 0, 2, null) != 0 || !C24129b.m58030b(SiteVisibleConfigKey.Welfare)) {
            BaseTextView tvRewardhub2 = c37992m.f85513G;
            Intrinsics.checkNotNullExpressionValue(tvRewardhub2, "tvRewardhub");
            ViewExtKt.m66577h(tvRewardhub2);
        } else {
            BaseTextView tvRewardhub3 = c37992m.f85513G;
            Intrinsics.checkNotNullExpressionValue(tvRewardhub3, "tvRewardhub");
            C27046k.m66685H(tvRewardhub3);
            BaseTextView tvRewardhub4 = c37992m.f85513G;
            Intrinsics.checkNotNullExpressionValue(tvRewardhub4, "tvRewardhub");
            C27046k.m66711z(tvRewardhub4, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.i2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42003a6(this.f35294b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: b6 */
    public final void m42115b6() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.kcs_trade_fee_balance_tips).m54163T4(getString(R$string.otc_buy_now, ""), new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.t2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                MineFragment.m42008c6(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: f6 */
    public final void m42117f6(final int i11, final int i12, final float f11, final long j11, final long j12, long j13) {
        final ImageView imageView;
        C37984e c37984e = this.f35196V;
        if (c37984e == null || (imageView = c37984e.f85441i) == null) {
            return;
        }
        int i13 = R$id.ivSecurityGuard;
        if (imageView.getTag(i13) != null) {
            return;
        }
        imageView.setTag(i13, Boolean.TRUE);
        Runnable runnable = new Runnable() { // from class: com.kubi.mine.lib.ui.s1
            @Override // java.lang.Runnable
            public final void run() {
                MineFragment.m42021h6(imageView, i12, j11, f11, i11, j12);
            }
        };
        imageView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC19020b(runnable));
        imageView.postDelayed(runnable, j13);
    }

    /* JADX INFO: renamed from: j6 */
    public final void m42118j6() {
        LinearLayoutCompat linearLayoutCompat;
        C37983d c37983d = this.f35197W;
        if (c37983d == null || (linearLayoutCompat = c37983d.f85428d) == null || C9415b.m15004b(linearLayoutCompat, C43852m.m96602n("B1mine", "referral", null, 4, null), 0, 2, null) != 0) {
            return;
        }
        String strM102326h = C46392a.m102326h(MineStorageIds.f35421a.getInviteDataSid(), "");
        if (TextUtils.isEmpty(strM102326h)) {
            m42057r6(this, null, 1, null);
        } else {
            m42120q6((InvitationEntity) C27099x.m66912b(strM102326h, InvitationEntity.class));
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e6  */
    @SuppressLint({"SetTextI18n", "StringFormatInvalid"})
    /* JADX INFO: renamed from: k6 */
    public final void m42119k6(boolean z11) {
        int i11;
        FrameLayout frameLayout;
        int i12;
        LinearLayout linearLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        LinearLayoutCompat linearLayoutCompat;
        FragmentActivity activity = getActivity();
        if (C27025c.m66567e(activity != null ? Boolean.valueOf(activity.isDestroyed()) : null, true)) {
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (C27025c.m66567e(activity2 != null ? Boolean.valueOf(activity2.isFinishing()) : null, true)) {
            return;
        }
        MineDepend mineDepend = MineDepend.f35159a;
        if (mineDepend.m41829h()) {
            final LoginUserEntity loginUserEntityM41826e = mineDepend.m41826e();
            C37984e c37984e = this.f35196V;
            if (c37984e != null) {
                LinearLayoutCompat llNoLogin = c37984e.f85446n;
                Intrinsics.checkNotNullExpressionValue(llNoLogin, "llNoLogin");
                ViewExtKt.m66577h(llNoLogin);
                TextView tvWelcome = c37984e.f85455w;
                Intrinsics.checkNotNullExpressionValue(tvWelcome, "tvWelcome");
                ViewExtKt.m66577h(tvWelcome);
                TextView tvUserUid = c37984e.f85454v;
                Intrinsics.checkNotNullExpressionValue(tvUserUid, "tvUserUid");
                ViewExtKt.m66594y(tvUserUid);
                ImageView ivCopyUid = c37984e.f85439g;
                Intrinsics.checkNotNullExpressionValue(ivCopyUid, "ivCopyUid");
                ViewExtKt.m66594y(ivCopyUid);
                LinearLayoutCompat llCopyUserId = c37984e.f85444l;
                Intrinsics.checkNotNullExpressionValue(llCopyUserId, "llCopyUserId");
                ViewExtKt.m66594y(llCopyUserId);
                LinearLayoutCompat llEditFirstName = c37984e.f85445m;
                Intrinsics.checkNotNullExpressionValue(llEditFirstName, "llEditFirstName");
                ViewExtKt.m66594y(llEditFirstName);
                LinearLayoutCompat llUserInfo = c37984e.f85447o;
                Intrinsics.checkNotNullExpressionValue(llUserInfo, "llUserInfo");
                ViewExtKt.m66594y(llUserInfo);
                c37984e.f85454v.setText("UID: " + loginUserEntityM41826e.uid);
                TextView tvUserUid2 = c37984e.f85454v;
                Intrinsics.checkNotNullExpressionValue(tvUserUid2, "tvUserUid");
                C27046k.m66711z(tvUserUid2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.o1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m42038m6(this.f35329b);
                    }
                }, 1, null);
                m42110W5(z11);
                m42122w6();
            }
            m42118j6();
            final C37992m c37992mM42104L4 = m42104L4();
            if (c37992mM42104L4 != null) {
                BaseTextView baseTextView = c37992mM42104L4.f85551x;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("VIP %s", Arrays.copyOf(new Object[]{Integer.valueOf(loginUserEntityM41826e.getFeeLevel())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView.setText(str);
                c37992mM42104L4.f85539l.setVisibility(C24129b.m58030b(SiteVisibleConfigKey.Kcs) ? 0 : 8);
                LinearLayoutCompat llKcsLevel = c37992mM42104L4.f85539l;
                Intrinsics.checkNotNullExpressionValue(llKcsLevel, "llKcsLevel");
                C27046k.m66711z(llKcsLevel, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.p1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m42042n6();
                    }
                }, 1, null);
                String kcsLevelDesc = loginUserEntityM41826e.getKcsLevelDesc();
                if (kcsLevelDesc == null || kcsLevelDesc.length() == 0) {
                    BaseTextView tvKcsLevel = c37992mM42104L4.f85509C;
                    Intrinsics.checkNotNullExpressionValue(tvKcsLevel, "tvKcsLevel");
                    ViewExtKt.m66577h(tvKcsLevel);
                } else {
                    c37992mM42104L4.f85509C.setText(loginUserEntityM41826e.getKcsLevelDesc());
                    c37992mM42104L4.f85509C.setTextColor(loginUserEntityM41826e.getKcsLevel() == 0 ? getColorRes(R$color.c_text30) : getColorRes(R$color.c_text40));
                    BaseTextView tvKcsLevel2 = c37992mM42104L4.f85509C;
                    Intrinsics.checkNotNullExpressionValue(tvKcsLevel2, "tvKcsLevel");
                    ViewExtKt.m66594y(tvKcsLevel2);
                }
                C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.ui.q1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineFragment.m42046o6(c37992mM42104L4, loginUserEntityM41826e);
                    }
                });
                if (C24129b.m58030b(SiteVisibleConfigKey.SecurityGuard)) {
                    C37984e c37984e2 = this.f35196V;
                    if (c37984e2 != null && (frameLayout3 = c37984e2.f85435c) != null) {
                        ViewExtKt.m66594y(frameLayout3);
                    }
                    C37984e c37984e3 = this.f35196V;
                    if (c37984e3 != null && (frameLayout2 = c37984e3.f85435c) != null) {
                        C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.r1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MineFragment.m42050p6(this.f35342b);
                            }
                        }, 1, null);
                    }
                    C43524d.m95785g("B1mine", "security_score", null, null, 12, null);
                } else {
                    C37984e c37984e4 = this.f35196V;
                    if (c37984e4 != null && (frameLayout = c37984e4.f85435c) != null) {
                        ViewExtKt.m66577h(frameLayout);
                    }
                }
                c37992mM42104L4.f85529b.setVisibility((m42095D5() || TextUtils.isEmpty(loginUserEntityM41826e.getHonorLevelRef()) || !C24129b.m58030b(SiteVisibleConfigKey.Vip)) ? 8 : 0);
                c37992mM42104L4.f85530c.setVisibility((loginUserEntityM41826e.isGlobalDeductionEnabled() && C24129b.m58030b(SiteVisibleConfigKey.KcsDiscount)) ? 0 : 8);
                m42098F4(c37992mM42104L4, loginUserEntityM41826e);
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new MineFragment$updateInfo$4$4(this, loginUserEntityM41826e, c37992mM42104L4, null), 2, null);
                if (!C24129b.m58030b(SiteVisibleConfigKey.ActivityBench) || (linearLayout = c37992mM42104L4.f85540m) == null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    if (C9415b.m15004b(linearLayout, C43852m.m96601m("B1mine", "bonus", "1"), 0, 2, null) == 0) {
                        LinearLayout llProfit = c37992mM42104L4.f85540m;
                        Intrinsics.checkNotNullExpressionValue(llProfit, "llProfit");
                        ViewExtKt.m66594y(llProfit);
                    }
                    LinearLayout llSafeSetting = c37992mM42104L4.f85542o;
                    Intrinsics.checkNotNullExpressionValue(llSafeSetting, "llSafeSetting");
                    ViewExtKt.m66594y(llSafeSetting);
                    LinearLayoutCompat flInoutHis = c37992mM42104L4.f85531d;
                    Intrinsics.checkNotNullExpressionValue(flInoutHis, "flInoutHis");
                    ViewExtKt.m66594y(flInoutHis);
                    BaseTextView baseTextView2 = c37992mM42104L4.f85549v;
                    if (m42088A5()) {
                        i12 = i11;
                    } else {
                        i12 = 8;
                    }
                    baseTextView2.setVisibility(i12);
                }
                LinearLayout llProfit2 = c37992mM42104L4.f85540m;
                Intrinsics.checkNotNullExpressionValue(llProfit2, "llProfit");
                ViewExtKt.m66577h(llProfit2);
                LinearLayout llSafeSetting2 = c37992mM42104L4.f85542o;
                Intrinsics.checkNotNullExpressionValue(llSafeSetting2, "llSafeSetting");
                ViewExtKt.m66594y(llSafeSetting2);
                LinearLayoutCompat flInoutHis2 = c37992mM42104L4.f85531d;
                Intrinsics.checkNotNullExpressionValue(flInoutHis2, "flInoutHis");
                ViewExtKt.m66594y(flInoutHis2);
                BaseTextView baseTextView3 = c37992mM42104L4.f85549v;
                if (m42088A5()) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                baseTextView3.setVisibility(i12);
            } else {
                i11 = 0;
            }
        } else {
            C37984e c37984e5 = this.f35196V;
            if (c37984e5 != null) {
                TextView tvWelcome2 = c37984e5.f85455w;
                Intrinsics.checkNotNullExpressionValue(tvWelcome2, "tvWelcome");
                ViewExtKt.m66594y(tvWelcome2);
                TextView tvUserUid3 = c37984e5.f85454v;
                Intrinsics.checkNotNullExpressionValue(tvUserUid3, "tvUserUid");
                ViewExtKt.m66577h(tvUserUid3);
                ImageView ivCopyUid2 = c37984e5.f85439g;
                Intrinsics.checkNotNullExpressionValue(ivCopyUid2, "ivCopyUid");
                ViewExtKt.m66577h(ivCopyUid2);
                LinearLayoutCompat llCopyUserId2 = c37984e5.f85444l;
                Intrinsics.checkNotNullExpressionValue(llCopyUserId2, "llCopyUserId");
                ViewExtKt.m66577h(llCopyUserId2);
                LinearLayoutCompat llEditFirstName2 = c37984e5.f85445m;
                Intrinsics.checkNotNullExpressionValue(llEditFirstName2, "llEditFirstName");
                ViewExtKt.m66577h(llEditFirstName2);
                LinearLayoutCompat llUserInfo2 = c37984e5.f85447o;
                Intrinsics.checkNotNullExpressionValue(llUserInfo2, "llUserInfo");
                ViewExtKt.m66577h(llUserInfo2);
                AppCompatTextView tvSubAccountTag = c37984e5.f85453u;
                Intrinsics.checkNotNullExpressionValue(tvSubAccountTag, "tvSubAccountTag");
                ViewExtKt.m66577h(tvSubAccountTag);
                LinearLayoutCompat llNoLogin2 = c37984e5.f85446n;
                Intrinsics.checkNotNullExpressionValue(llNoLogin2, "llNoLogin");
                ViewExtKt.m66594y(llNoLogin2);
                UploadAvatarImageView.m42365m(c37984e5.f85438f, "", false, false, 6, null);
                m42096E4(false);
            }
            C37992m c37992mM42104L5 = m42104L4();
            if (c37992mM42104L5 != null) {
                LinearLayoutCompat flDeductFee = c37992mM42104L5.f85530c;
                Intrinsics.checkNotNullExpressionValue(flDeductFee, "flDeductFee");
                ViewExtKt.m66577h(flDeductFee);
                LinearLayoutCompat llKcsLevel2 = c37992mM42104L5.f85539l;
                Intrinsics.checkNotNullExpressionValue(llKcsLevel2, "llKcsLevel");
                ViewExtKt.m66577h(llKcsLevel2);
                LinearLayoutCompat clVip = c37992mM42104L5.f85529b;
                Intrinsics.checkNotNullExpressionValue(clVip, "clVip");
                ViewExtKt.m66577h(clVip);
                LinearLayout llProfit3 = c37992mM42104L5.f85540m;
                Intrinsics.checkNotNullExpressionValue(llProfit3, "llProfit");
                ViewExtKt.m66577h(llProfit3);
                LinearLayoutCompat flInoutHis3 = c37992mM42104L5.f85531d;
                Intrinsics.checkNotNullExpressionValue(flInoutHis3, "flInoutHis");
                ViewExtKt.m66577h(flInoutHis3);
                LinearLayout llSafeSetting3 = c37992mM42104L5.f85542o;
                Intrinsics.checkNotNullExpressionValue(llSafeSetting3, "llSafeSetting");
                ViewExtKt.m66577h(llSafeSetting3);
                BaseTextView tvApi = c37992mM42104L5.f85550w;
                Intrinsics.checkNotNullExpressionValue(tvApi, "tvApi");
                ViewExtKt.m66577h(tvApi);
            }
            C37983d c37983d = this.f35197W;
            if (c37983d != null && (linearLayoutCompat = c37983d.f85428d) != null) {
                ViewExtKt.m66577h(linearLayoutCompat);
            }
            i11 = 0;
        }
        m42101H5();
        m42109W4();
        C37992m c37992mM42104L6 = m42104L4();
        if (c37992mM42104L6 != null) {
            c37992mM42104L6.f85549v.setVisibility(m42088A5() ? i11 : 8);
            c37992mM42104L6.f85517K.setVisibility(m42092C5() ? i11 : 8);
            c37992mM42104L6.f85514H.setVisibility(m42091B5() ? i11 : 8);
            c37992mM42104L6.f85546s.setVisibility(m42091B5() ? i11 : 8);
            BaseTextView baseTextView4 = c37992mM42104L6.f85522P;
            if (!m42097E5()) {
                i11 = 8;
            }
            baseTextView4.setVisibility(i11);
            m42123x6(c37992mM42104L6);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_mine, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f35196V = C37984e.m85843a(view.findViewById(R$id.ll_check_login));
        this.f35197W = C37983d.m85841a(view.findViewById(R$id.layoutInvite));
        this.f35198X = C37982c.m85839a(view.findViewById(R$id.cl_mine_newbie));
        this.f35199Y = C37981b.m85837a(view.findViewById(R$id.layoutKycGuide));
        m41998Y4();
        m42015f5();
        Observable<LoginUserEntity> observableObserveOn = m41988T4().m42149F().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m41978P5(this.f35408b, (LoginUserEntity) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineFragment.m41981Q5(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m42118j6();
        if (this.f35201a0) {
            m42107R5();
        }
        m42119k6(true);
    }

    /* JADX INFO: renamed from: q6 */
    public final void m42120q6(@Nullable InvitationEntity invitationEntity) {
        LinearLayoutCompat root;
        String string;
        String string2;
        TextView textView;
        View view;
        TextView textView2;
        TextView textView3;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        TextView textView4;
        LinearLayoutCompat linearLayoutCompat3;
        TextView textView5;
        LinearLayoutCompat linearLayoutCompat4;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayoutCompat linearLayoutCompat5;
        TextView textView9;
        LinearLayoutCompat linearLayoutCompat6;
        TextView textView10;
        TextView textView11;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BackupValue backupValues;
        List<Property> properties;
        View view2;
        LinearLayoutCompat root2;
        if (!C24129b.m58030b(SiteVisibleConfigKey.ReferralCard) || this.f35201a0) {
            C37983d c37983d = this.f35197W;
            if (c37983d == null || (root = c37983d.getRoot()) == null) {
                return;
            }
            C27046k.m66700o(root);
            return;
        }
        C37983d c37983d2 = this.f35197W;
        if (c37983d2 != null && (root2 = c37983d2.getRoot()) != null) {
            C27046k.m66685H(root2);
        }
        Property property = null;
        this.f35203c0 = C27025c.m66566d(invitationEntity != null ? invitationEntity.isAffiliate() : null);
        C37983d c37983d3 = this.f35197W;
        if (c37983d3 != null && (view2 = c37983d3.f85426b) != null) {
            C27046k.m66700o(view2);
        }
        PromotionConfig value = m41988T4().m42148E().getValue();
        if (value != null && (properties = value.getProperties()) != null) {
            property = (Property) CollectionsKt.firstOrNull((List) properties);
        }
        if (property == null || (string = property.getValue()) == null) {
            string = getString(R$string.invite_for_gift);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        if (property == null || (backupValues = property.getBackupValues()) == null || (string2 = backupValues.getText()) == null) {
            string2 = getString(R$string.invite_friends_desc);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        C37983d c37983d4 = this.f35197W;
        if (c37983d4 != null && (baseTextView4 = c37983d4.f85432h) != null) {
            baseTextView4.setText(string);
        }
        C37983d c37983d5 = this.f35197W;
        if (c37983d5 != null && (baseTextView3 = c37983d5.f85430f) != null) {
            baseTextView3.setText(string2);
        }
        C37983d c37983d6 = this.f35197W;
        if (c37983d6 != null && (textView11 = c37983d6.f85431g) != null) {
            textView11.setText("");
        }
        C37983d c37983d7 = this.f35197W;
        if (c37983d7 != null && (textView10 = c37983d7.f85431g) != null) {
            textView10.setBackgroundResource(R$drawable.bmine_img_invite_toc);
        }
        C37983d c37983d8 = this.f35197W;
        if (c37983d8 != null && (linearLayoutCompat6 = c37983d8.f85428d) != null) {
            C27046k.m66711z(linearLayoutCompat6, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.l1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42061s6(this.f35311b);
                }
            }, 1, null);
        }
        if (!MineDepend.f35159a.m41829h()) {
            C46392a.m102333p(MineStorageIds.f35421a.getInviteDataSid(), "");
            C37983d c37983d9 = this.f35197W;
            if (c37983d9 != null && (textView9 = c37983d9.f85431g) != null) {
                ViewExtKt.m66594y(textView9);
            }
            C37983d c37983d10 = this.f35197W;
            if (c37983d10 == null || (linearLayoutCompat5 = c37983d10.f85427c) == null) {
                return;
            }
            ViewExtKt.m66577h(linearLayoutCompat5);
            return;
        }
        if (invitationEntity != null) {
            if (!C27025c.m66566d(invitationEntity.isAffiliate()) || !C24129b.m58030b(SiteVisibleConfigKey.Affiliate)) {
                if (C27025c.m66566d(invitationEntity.isBlackRegion())) {
                    C37983d c37983d11 = this.f35197W;
                    if (c37983d11 == null || (linearLayoutCompat = c37983d11.f85428d) == null) {
                        return;
                    }
                    C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.n1
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MineFragment.m42069u6(this.f35324b);
                        }
                    }, 1, null);
                    return;
                }
                if (!C27025c.m66566d(invitationEntity.getHasAvailablePrize())) {
                    C37983d c37983d12 = this.f35197W;
                    if (c37983d12 == null || (textView = c37983d12.f85431g) == null) {
                        return;
                    }
                    textView.setText("");
                    return;
                }
                C37983d c37983d13 = this.f35197W;
                if (c37983d13 != null && (textView3 = c37983d13.f85431g) != null) {
                    textView3.setText("");
                }
                C37983d c37983d14 = this.f35197W;
                if (c37983d14 != null && (textView2 = c37983d14.f85431g) != null) {
                    textView2.setBackgroundResource(R$mipmap.ic_invite_bonus_box);
                }
                C37983d c37983d15 = this.f35197W;
                if (c37983d15 == null || (view = c37983d15.f85426b) == null) {
                    return;
                }
                ViewExtKt.m66594y(view);
                return;
            }
            C37983d c37983d16 = this.f35197W;
            if (c37983d16 != null && (baseTextView2 = c37983d16.f85432h) != null) {
                baseTextView2.setText(getString(R$string.invite_partner_plan));
            }
            C37983d c37983d17 = this.f35197W;
            if (c37983d17 != null && (baseTextView = c37983d17.f85430f) != null) {
                baseTextView.setText(getString(R$string.invite_partner_plan_desc));
            }
            C37983d c37983d18 = this.f35197W;
            if (c37983d18 != null && (textView8 = c37983d18.f85431g) != null) {
                textView8.setBackgroundResource(R$drawable.ic_invite_partner_mirrored);
            }
            C37983d c37983d19 = this.f35197W;
            if (c37983d19 != null && (textView7 = c37983d19.f85431g) != null) {
                textView7.setText("");
            }
            if (invitationEntity.getDailyRebate() != null) {
                C37983d c37983d20 = this.f35197W;
                if (c37983d20 != null && (textView6 = c37983d20.f85431g) != null) {
                    ViewExtKt.m66577h(textView6);
                }
                C37983d c37983d21 = this.f35197W;
                if (c37983d21 != null && (linearLayoutCompat4 = c37983d21.f85427c) != null) {
                    ViewExtKt.m66594y(linearLayoutCompat4);
                }
                C37983d c37983d22 = this.f35197W;
                if (c37983d22 != null && (textView5 = c37983d22.f85429e) != null) {
                    textView5.setText(C43524d.m95779a(invitationEntity.getDailyRebate()));
                }
            } else {
                C37983d c37983d23 = this.f35197W;
                if (c37983d23 != null && (textView4 = c37983d23.f85431g) != null) {
                    ViewExtKt.m66594y(textView4);
                }
                C37983d c37983d24 = this.f35197W;
                if (c37983d24 != null && (linearLayoutCompat2 = c37983d24.f85427c) != null) {
                    ViewExtKt.m66577h(linearLayoutCompat2);
                }
            }
            C37983d c37983d25 = this.f35197W;
            if (c37983d25 == null || (linearLayoutCompat3 = c37983d25.f85428d) == null) {
                return;
            }
            C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.m1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42065t6(this.f35316b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: v6 */
    public final void m42121v6(C37992m c37992m) {
        if (!MineDepend.f35159a.m41829h() || C46392a.m102322d(C43525e.f96060a.m95787a(), false)) {
            View vSwitchAccountRedDot = c37992m.f85526T;
            Intrinsics.checkNotNullExpressionValue(vSwitchAccountRedDot, "vSwitchAccountRedDot");
            ViewExtKt.m66577h(vSwitchAccountRedDot);
        } else {
            View vSwitchAccountRedDot2 = c37992m.f85526T;
            Intrinsics.checkNotNullExpressionValue(vSwitchAccountRedDot2, "vSwitchAccountRedDot");
            ViewExtKt.m66594y(vSwitchAccountRedDot2);
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final void m42122w6() {
        AppCompatTextView appCompatTextView;
        C37984e c37984e = this.f35196V;
        if (c37984e == null || (appCompatTextView = c37984e.f85453u) == null) {
            return;
        }
        if (!m42095D5()) {
            ViewExtKt.m66577h(appCompatTextView);
        } else {
            appCompatTextView.setText(getString(C43527g.f96062a.m95791a(MineDepend.f35159a.m41826e().getSubType())));
            ViewExtKt.m66594y(appCompatTextView);
        }
    }

    public MineFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewModels$default$2
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
        this.f35200Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MineViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.mine.lib.ui.MineFragment$special$$inlined$viewModels$default$5
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
        this.f35201a0 = AppMode.INSTANCE.isLiteMode();
        setPageId("B1mine");
        this.f35204d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragment.m41952C4();
            }
        });
        this.f35205e0 = BigDecimal.ZERO;
    }

    /* JADX INFO: renamed from: C4 */
    public static final InterfaceC38285b m41952C4() {
        return (InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class);
    }

    /* JADX INFO: renamed from: O5 */
    public static final Unit m41975O5(MineFragment mineFragment) {
        mineFragment.m41988T4().m42156u();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m41980Q4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q5 */
    public static final void m41981Q5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m41983R4(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m41985S4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U5 */
    public static final Unit m41991U5(MineFragment mineFragment, Boolean bool) {
        BaseTextView baseTextView;
        View view;
        BaseTextView baseTextView2;
        View view2;
        if (bool.booleanValue()) {
            C37992m c37992mM42104L4 = mineFragment.m42104L4();
            if (c37992mM42104L4 != null && (view2 = c37992mM42104L4.f85527U) != null) {
                ViewExtKt.m66594y(view2);
            }
            C37992m c37992mM42104L5 = mineFragment.m42104L4();
            if (c37992mM42104L5 != null && (baseTextView2 = c37992mM42104L5.f85512F) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
        } else {
            C37992m c37992mM42104L6 = mineFragment.m42104L4();
            if (c37992mM42104L6 != null && (view = c37992mM42104L6.f85527U) != null) {
                ViewExtKt.m66577h(view);
            }
            C37992m c37992mM42104L7 = mineFragment.m42104L4();
            if (c37992mM42104L7 != null && (baseTextView = c37992mM42104L7.f85512F) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V5 */
    public static final void m41994V5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m42000Z4(MineFragment mineFragment) {
        mineFragment.m42106M5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m42002a5(MineFragment mineFragment, InvitationEntity invitationEntity) {
        mineFragment.m42120q6(invitationEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m42010d5(MineFragment mineFragment, NPSQuestionEntity nPSQuestionEntity) {
        Boolean exist;
        C37992m c37992mM42104L4 = mineFragment.m42104L4();
        if (c37992mM42104L4 != null) {
            if (nPSQuestionEntity != null) {
                exist = nPSQuestionEntity.getExist();
            } else {
                exist = null;
            }
            if (C27025c.m66566d(exist) && !mineFragment.f35201a0) {
                BaseTextView tvSurvey = c37992mM42104L4.f85521O;
                Intrinsics.checkNotNullExpressionValue(tvSurvey, "tvSurvey");
                ViewExtKt.m66594y(tvSurvey);
            } else {
                BaseTextView tvSurvey2 = c37992mM42104L4.f85521O;
                Intrinsics.checkNotNullExpressionValue(tvSurvey2, "tvSurvey");
                ViewExtKt.m66577h(tvSurvey2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e6 */
    public static final void m42013e6(MineFragment mineFragment, FragmentActivity fragmentActivity, ImageView imageView) {
        if (mineFragment.isAdded() && !mineFragment.isDetached() && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            MultiAccountSwitchPop.f35225a.m42161b(fragmentActivity, imageView);
        }
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m42020h5(MineFragment mineFragment) {
        if (mineFragment.m42099F5()) {
            mineFragment.m42094D4();
        } else {
            FragmentActivity activity = mineFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h6 */
    public static final void m42021h6(ImageView imageView, int i11, long j11, float f11, int i12, long j12) {
        if (imageView.isAttachedToWindow() && imageView.getVisibility() == 0) {
            imageView.setPivotX(imageView.getWidth() / 2.0f);
            imageView.setPivotY(imageView.getHeight() / 2.0f);
            m42024i6(imageView, i11, j11, f11, new Ref.IntRef(), i12, j12);
            return;
        }
        imageView.setTag(R$id.ivSecurityGuard, null);
    }

    /* JADX INFO: renamed from: i6 */
    public static final void m42024i6(ImageView imageView, int i11, long j11, float f11, Ref.IntRef intRef, int i12, long j12) {
        boolean zIsAttachedToWindow = imageView.isAttachedToWindow();
        Float fValueOf = Float.valueOf(0.0f);
        if (zIsAttachedToWindow && imageView.getVisibility() == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(fValueOf);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList.add(Float.valueOf(-f11));
                arrayList.add(Float.valueOf(f11));
            }
            arrayList.add(fValueOf);
            float[] floatArray = CollectionsKt.toFloatArray(arrayList);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "rotation", Arrays.copyOf(floatArray, floatArray.length));
            objectAnimatorOfFloat.setDuration(((long) i11) * j11);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.addListener(new C19021c(intRef, i12, imageView, j12, i11, j11, f11));
            objectAnimatorOfFloat.start();
            return;
        }
        imageView.setTag(R$id.ivSecurityGuard, null);
        imageView.setRotation(0.0f);
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m42045o5(MineFragment mineFragment) {
        mineFragment.m41988T4().m42155t();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final Unit m42056r5(MineFragment mineFragment) {
        mineFragment.m42108U4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m42060s5(MineFragment mineFragment) {
        mineFragment.m42108U4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m42072v5(MineFragment mineFragment) {
        C44128b.m97259c(mineFragment.getTAG(), "login success redirect to mine");
        if (mineFragment.m42099F5()) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:switchDrawer", Boolean.TRUE, 0L, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A5 */
    public final boolean m42088A5() {
        C37992m c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 == null) {
            return false;
        }
        LinearLayoutCompat llKcsLevel = c37992mM42104L4.f85539l;
        Intrinsics.checkNotNullExpressionValue(llKcsLevel, "llKcsLevel");
        if (llKcsLevel.getVisibility() == 8) {
            LinearLayoutCompat clVip = c37992mM42104L4.f85529b;
            Intrinsics.checkNotNullExpressionValue(clVip, "clVip");
            if (clVip.getVisibility() == 8) {
                LinearLayoutCompat flDeductFee = c37992mM42104L4.f85530c;
                Intrinsics.checkNotNullExpressionValue(flDeductFee, "flDeductFee");
                if (flDeductFee.getVisibility() == 8) {
                    LinearLayoutCompat flInoutHis = c37992mM42104L4.f85531d;
                    Intrinsics.checkNotNullExpressionValue(flInoutHis, "flInoutHis");
                    if (flInoutHis.getVisibility() == 8) {
                        BaseTextView tvVipFee = c37992mM42104L4.f85523Q;
                        Intrinsics.checkNotNullExpressionValue(tvVipFee, "tvVipFee");
                        if (tvVipFee.getVisibility() == 8) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: B5 */
    public final boolean m42091B5() {
        C37992m c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 == null) {
            return false;
        }
        BaseTextView tvRewardhub = c37992mM42104L4.f85513G;
        Intrinsics.checkNotNullExpressionValue(tvRewardhub, "tvRewardhub");
        if (tvRewardhub.getVisibility() == 8) {
            LinearLayout llProfit = c37992mM42104L4.f85540m;
            Intrinsics.checkNotNullExpressionValue(llProfit, "llProfit");
            if (llProfit.getVisibility() == 8) {
                LinearLayout llSocialFriends = c37992mM42104L4.f85543p;
                Intrinsics.checkNotNullExpressionValue(llSocialFriends, "llSocialFriends");
                if (llSocialFriends.getVisibility() == 8) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: C5 */
    public final boolean m42092C5() {
        C37992m c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 == null) {
            return false;
        }
        LinearLayout llSafeSetting = c37992mM42104L4.f85542o;
        Intrinsics.checkNotNullExpressionValue(llSafeSetting, "llSafeSetting");
        if (llSafeSetting.getVisibility() == 8) {
            BaseTextView tvSettings = c37992mM42104L4.f85518L;
            Intrinsics.checkNotNullExpressionValue(tvSettings, "tvSettings");
            if (tvSettings.getVisibility() == 8) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: E5 */
    public final boolean m42097E5() {
        C37992m c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 == null) {
            return false;
        }
        BaseTextView tvHelpCenter = c37992mM42104L4.f85553z;
        Intrinsics.checkNotNullExpressionValue(tvHelpCenter, "tvHelpCenter");
        if (tvHelpCenter.getVisibility() == 8) {
            BaseTextView tvApi = c37992mM42104L4.f85550w;
            Intrinsics.checkNotNullExpressionValue(tvApi, "tvApi");
            if (tvApi.getVisibility() == 8) {
                BaseTextView tvSurvey = c37992mM42104L4.f85521O;
                Intrinsics.checkNotNullExpressionValue(tvSurvey, "tvSurvey");
                if (tvSurvey.getVisibility() == 8) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: H5 */
    public final void m42101H5() {
        FrameLayout frameLayout;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        FrameLayout frameLayout2;
        LinearLayoutCompat linearLayoutCompat5;
        if (m42095D5()) {
            C37992m c37992mM42104L4 = m42104L4();
            if (c37992mM42104L4 != null && (linearLayoutCompat5 = c37992mM42104L4.f85529b) != null) {
                ViewExtKt.m66577h(linearLayoutCompat5);
            }
            C37984e c37984e = this.f35196V;
            if (c37984e != null && (frameLayout2 = c37984e.f85436d) != null) {
                ViewExtKt.m66577h(frameLayout2);
                return;
            }
            return;
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Vip)) {
            MineDepend mineDepend = MineDepend.f35159a;
            boolean zM41829h = mineDepend.m41829h();
            final String honorLevelRef = mineDepend.m41826e().getHonorLevelRef();
            if (honorLevelRef == null) {
                honorLevelRef = "";
            }
            C37984e c37984e2 = this.f35196V;
            if (c37984e2 != null) {
                if (zM41829h) {
                    AppCompatTextView appCompatTextView = c37984e2.f85451s;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("VIP %s", Arrays.copyOf(new Object[]{Integer.valueOf(mineDepend.m41826e().getFeeLevel())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    appCompatTextView.setText(str);
                    ColorStateList colorStateList = null;
                    if (mineDepend.m41826e().getFeeLevel() > 0) {
                        c37984e2.f85451s.setBackgroundResource(R$drawable.shape_user_vip);
                        AppCompatTextView appCompatTextView2 = c37984e2.f85451s;
                        int i11 = R$color.c_C39838_55D186;
                        appCompatTextView2.setTextColor(getColorRes(i11));
                        AppCompatTextView tvLvDesc = c37984e2.f85451s;
                        Intrinsics.checkNotNullExpressionValue(tvLvDesc, "tvLvDesc");
                        C27046k.m66702q(tvLvDesc, getColorRes(i11));
                        ImageView imageView = c37984e2.f85442j;
                        Context context = getContext();
                        if (context != null) {
                            colorStateList = ContextCompat.getColorStateList(context, i11);
                        }
                        imageView.setImageTintList(colorStateList);
                    } else {
                        ImageView imageView2 = c37984e2.f85442j;
                        Context context2 = getContext();
                        if (context2 != null) {
                            colorStateList = ContextCompat.getColorStateList(context2, R$color.c_text40);
                        }
                        imageView2.setImageTintList(colorStateList);
                        c37984e2.f85451s.setBackgroundResource(R$drawable.shape_cover4_4r);
                        AppCompatTextView appCompatTextView3 = c37984e2.f85451s;
                        int i12 = R$color.c_text40;
                        appCompatTextView3.setTextColor(getColorRes(i12));
                        AppCompatTextView tvLvDesc2 = c37984e2.f85451s;
                        Intrinsics.checkNotNullExpressionValue(tvLvDesc2, "tvLvDesc");
                        C27046k.m66702q(tvLvDesc2, getColorRes(i12));
                    }
                } else {
                    LinearLayoutCompat llUserInfo = c37984e2.f85447o;
                    Intrinsics.checkNotNullExpressionValue(llUserInfo, "llUserInfo");
                    ViewExtKt.m66577h(llUserInfo);
                }
            }
            if (zM41829h && honorLevelRef.length() > 0) {
                C37992m c37992mM42104L5 = m42104L4();
                if (c37992mM42104L5 != null && (linearLayoutCompat4 = c37992mM42104L5.f85529b) != null) {
                    ViewExtKt.m66594y(linearLayoutCompat4);
                }
                C37992m c37992mM42104L6 = m42104L4();
                if (c37992mM42104L6 != null && (linearLayoutCompat3 = c37992mM42104L6.f85529b) != null) {
                    C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.o2
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MineFragment.m41962I5(honorLevelRef);
                        }
                    }, 1, null);
                }
                C37992m c37992mM42104L7 = m42104L4();
                if (c37992mM42104L7 != null && (baseTextView = c37992mM42104L7.f85551x) != null) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str2 = String.format("VIP %s", Arrays.copyOf(new Object[]{Integer.valueOf(mineDepend.m41826e().getFeeLevel())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    baseTextView.setText(str2);
                    return;
                }
                return;
            }
            C37992m c37992mM42104L8 = m42104L4();
            if (c37992mM42104L8 != null && (linearLayoutCompat2 = c37992mM42104L8.f85529b) != null) {
                ViewExtKt.m66577h(linearLayoutCompat2);
                return;
            }
            return;
        }
        C37992m c37992mM42104L9 = m42104L4();
        if (c37992mM42104L9 != null && (linearLayoutCompat = c37992mM42104L9.f85529b) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        C37984e c37984e3 = this.f35196V;
        if (c37984e3 != null && (frameLayout = c37984e3.f85436d) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m42102J5() {
        m41988T4().m42144A().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.j2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m41966K5(this.f35298b, (IPLimitConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M4 */
    public final void m42105M4() {
        ObservableSource observableSourceCompose = m42103K4().m86412f("TRADE", "KCS").compose(C24217a1.m58389m());
        ObservableSource observableSourceCompose2 = m42103K4().m86412f("MAIN", "KCS").compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: com.kubi.mine.lib.ui.v1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MineFragment.m41971N4((SingleCurrencyBalance) obj, (SingleCurrencyBalance) obj2);
            }
        };
        Observable observableZip = Observable.zip(observableSourceCompose2, observableSourceCompose, new BiFunction() { // from class: com.kubi.mine.lib.ui.w1
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MineFragment.m41974O4(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m41977P4(this.f35404b, (BigDecimal) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.mine.lib.ui.y1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineFragment.m41980Q4(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.mine.lib.ui.z1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m41983R4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableZip.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.ui.a2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineFragment.m41985S4(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: M5 */
    public final void m42106M5() {
        m41988T4().m42145B().observe(getViewLifecycleOwner(), new C19019a(new Function1() { // from class: com.kubi.mine.lib.ui.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineFragment.m41972N5(this.f35263b, (KycStatusEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W4 */
    public final void m42109W4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView4;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        FrameLayout frameLayout;
        C44128b.m97259c(getTAG(), "MineFragment hideLiteEntrance isLite=" + this.f35201a0 + ", AppMode.getCurrentMode() is " + AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null));
        if (this.f35201a0) {
            C37992m c37992mM42104L4 = m42104L4();
            if (c37992mM42104L4 != null && (frameLayout = c37992mM42104L4.f85532e) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
            C37982c c37982c = this.f35198X;
            if (c37982c != null && (linearLayoutCompat6 = c37982c.f85419b) != null) {
                C27046k.m66700o(linearLayoutCompat6);
            }
            C37983d c37983d = this.f35197W;
            if (c37983d != null && (linearLayoutCompat5 = c37983d.f85428d) != null) {
                C27046k.m66700o(linearLayoutCompat5);
            }
            C37981b c37981b = this.f35199Y;
            if (c37981b != null && (linearLayoutCompat4 = c37981b.f85415d) != null) {
                C27046k.m66700o(linearLayoutCompat4);
            }
            C37992m c37992mM42104L5 = m42104L4();
            if (c37992mM42104L5 != null && (linearLayoutCompat3 = c37992mM42104L5.f85539l) != null) {
                C27046k.m66700o(linearLayoutCompat3);
            }
            C37992m c37992mM42104L6 = m42104L4();
            if (c37992mM42104L6 != null && (baseTextView4 = c37992mM42104L6.f85523Q) != null) {
                C27046k.m66700o(baseTextView4);
            }
            C37992m c37992mM42104L7 = m42104L4();
            if (c37992mM42104L7 != null && (linearLayoutCompat2 = c37992mM42104L7.f85529b) != null) {
                C27046k.m66700o(linearLayoutCompat2);
            }
            C37992m c37992mM42104L8 = m42104L4();
            if (c37992mM42104L8 != null && (linearLayoutCompat = c37992mM42104L8.f85530c) != null) {
                C27046k.m66700o(linearLayoutCompat);
            }
            C37992m c37992mM42104L9 = m42104L4();
            if (c37992mM42104L9 != null && (linearLayout2 = c37992mM42104L9.f85540m) != null) {
                C27046k.m66700o(linearLayout2);
            }
            C37992m c37992mM42104L10 = m42104L4();
            if (c37992mM42104L10 != null && (linearLayout = c37992mM42104L10.f85543p) != null) {
                C27046k.m66700o(linearLayout);
            }
            C37992m c37992mM42104L11 = m42104L4();
            if (c37992mM42104L11 != null && (baseTextView3 = c37992mM42104L11.f85550w) != null) {
                C27046k.m66700o(baseTextView3);
            }
            C37992m c37992mM42104L12 = m42104L4();
            if (c37992mM42104L12 != null && (baseTextView2 = c37992mM42104L12.f85521O) != null) {
                C27046k.m66700o(baseTextView2);
            }
            if (MineDepend.f35159a.m41829h()) {
                C37992m c37992mM42104L13 = m42104L4();
                if (c37992mM42104L13 != null) {
                    m42114Z5(c37992mM42104L13);
                    return;
                }
                return;
            }
            C37992m c37992mM42104L14 = m42104L4();
            if (c37992mM42104L14 != null && (baseTextView = c37992mM42104L14.f85513G) != null) {
                C27046k.m66700o(baseTextView);
            }
        }
    }

    /* JADX INFO: renamed from: d6 */
    public final void m42116d6() {
        C37992m c37992mM42104L4;
        final ImageView imageView;
        if (C43526f.m95790b() && (c37992mM42104L4 = m42104L4()) != null && (imageView = c37992mM42104L4.f85547t) != null) {
            final FragmentActivity activity = getActivity();
            if (activity == null) {
                activity = null;
            }
            if (activity != null) {
                imageView.postDelayed(new Runnable() { // from class: com.kubi.mine.lib.ui.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MineFragment.m42013e6(this.f35359b, activity, imageView);
                    }
                }, 500L);
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        Boolean boolValueOf;
        if (m42099F5()) {
            DrawerInject drawerInject = this.f35202b0;
            if (drawerInject != null) {
                boolValueOf = Boolean.valueOf(drawerInject.m58436k());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                m42094D4();
                return true;
            }
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        String str;
        C37992m c37992mM42104L4;
        super.onShow();
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC40161c.class, siteInfoManager.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88512a(new Function0() { // from class: com.kubi.mine.lib.ui.u1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m41975O5(this.f35364b);
                }
            });
        } else {
            if (MineDepend.f35159a.m41829h()) {
                m42105M4();
                m41988T4().m42154o();
            }
            m41988T4().m42156u();
            m41988T4().m42153n();
            m41988T4().m42155t();
        }
        Object objM56186h2 = router.m56186h(InterfaceC40164f.class, siteInfoManager.m58109c());
        if (objM56186h2 != null) {
            ((InterfaceC40164f) objM56186h2).mo88521a(this.f35196V);
        } else {
            MineDepend mineDepend = MineDepend.f35159a;
            if (mineDepend.m41829h() && (str = mineDepend.m41826e().uid) != null && str.length() != 0) {
                StorageId<Boolean> storageId = f35193h0;
                if (!C46392a.m102322d(storageId.m102384f(str), false)) {
                    m42018g6(this, 0, 0, 0.0f, 0L, 0L, 0L, 63, null);
                    C46392a.m102328k(storageId.m102384f(str), true);
                }
            }
            m42116d6();
            c37992mM42104L4 = m42104L4();
            if (c37992mM42104L4 != null) {
                m42121v6(c37992mM42104L4);
            }
        }
        m42116d6();
        c37992mM42104L4 = m42104L4();
        if (c37992mM42104L4 != null) {
            m42121v6(c37992mM42104L4);
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final void m42123x6(final C37992m c37992m) {
        if (C43526f.m95790b()) {
            c37992m.f85547t.setImageResource(R$drawable.ic2_subaccount_switch_20);
            ImageView switchAccount = c37992m.f85547t;
            Intrinsics.checkNotNullExpressionValue(switchAccount, "switchAccount");
            C27046k.m66711z(switchAccount, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.m2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.m42082y6(this.f35317b, c37992m);
                }
            }, 1, null);
            m42121v6(c37992m);
            return;
        }
        c37992m.f85547t.setImageResource(R$drawable.kucoin_selector_switch_theme);
        c37992m.f85547t.setSelected(DayNightThemeManager.f28592a.m33187l());
        ImageView switchAccount2 = c37992m.f85547t;
        Intrinsics.checkNotNullExpressionValue(switchAccount2, "switchAccount");
        C27046k.m66711z(switchAccount2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.n2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragment.m42086z6(this.f35325b);
            }
        }, 1, null);
        View vSwitchAccountRedDot = c37992m.f85526T;
        Intrinsics.checkNotNullExpressionValue(vSwitchAccountRedDot, "vSwitchAccountRedDot");
        ViewExtKt.m66577h(vSwitchAccountRedDot);
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m41993V4(DialogInterface dialogInterface, int i11) {
    }
}
