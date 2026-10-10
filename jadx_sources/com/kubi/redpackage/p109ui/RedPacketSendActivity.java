package com.kubi.redpackage.p109ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.BeepHelper;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.host.HostManager;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$drawable;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$mipmap;
import com.kubi.redpackage.R$raw;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.redpackage.entity.CommonConfigs;
import com.kubi.redpackage.entity.CurrenciesConfig;
import com.kubi.redpackage.entity.RedConfig;
import com.kubi.redpackage.entity.RedPackageResponse;
import com.kubi.redpackage.entity.RedPacketErrorResourceEntity;
import com.kubi.redpackage.entity.WelfareExtend;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.redpackage.utils.StringsExtKt;
import com.kubi.redpackage.view.AccountLabelView;
import com.kubi.redpackage.view.SingleAccountTypeView;
import com.kubi.redpackage.view.TextInputWithTitleView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.PassWordGridView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.user.api.IUserService;
import com.kubi.utils.BackgroundSpan;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27052h0;
import com.kubi.utils.C27056j0;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27086s0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.NumberUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37758j;
import g00.InterfaceC37759k;
import g00.InterfaceC37766r;
import g00.InterfaceC37767s;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p011a9.C0206f;
import p402kf.C41014a;
import p402kf.C41016c;
import p569qq.C43852m;
import p675uv.C45316b;
import p703vv.InterfaceC45656a;
import p752x8.AbstractC46099a;
import p845zv.C46928a;
import p845zv.C46929b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45678b;
import y70.C46392a;

/* JADX INFO: compiled from: RedPacketSendActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0015J\b\u00100\u001a\u00020-H\u0002J\u0018\u00101\u001a\u00020-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u00020-H\u0002J\u0012\u00106\u001a\u00020-2\b\u00107\u001a\u0004\u0018\u00010!H\u0002J\u0012\u00108\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010!H\u0002J\b\u0010C\u001a\u00020-H\u0002J\u0014\u0010D\u001a\u0004\u0018\u00010\u001d2\b\u00107\u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010E\u001a\u00020-2\b\u0010F\u001a\u0004\u0018\u00010\u001dH\u0003J\b\u0010G\u001a\u00020-H\u0002J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020-H\u0002J\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010N\u001a\u00020-2\u0006\u00107\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020\fH\u0002J\b\u0010R\u001a\u00020-H\u0002J\b\u0010S\u001a\u00020-H\u0002J\u0016\u0010T\u001a\u00020-2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020-0VH\u0002R#\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010*R+\u0010:\u001a\u0012\u0012\u0004\u0012\u0002030;j\b\u0012\u0004\u0012\u000203`<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0018\u001a\u0004\b=\u0010>R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedPacketSendActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "binding", "Lcom/kubi/redpackage/databinding/BredpackageActivitySendRedpacketBinding;", "getBinding$RedpackageLib_googleRelease$annotations", "getBinding$RedpackageLib_googleRelease", "()Lcom/kubi/redpackage/databinding/BredpackageActivitySendRedpacketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "getLayout", "", "redPackageApi", "Lcom/kubi/redpackage/RedPackageApi;", "getRedPackageApi", "()Lcom/kubi/redpackage/RedPackageApi;", "redPackageApi$delegate", "Lkotlin/Lazy;", "isRandom", "", "accountType", "coinConfig", "Lcom/kubi/redpackage/entity/CurrenciesConfig;", "totalSize", "", "redConfigRandom", "Lcom/kubi/redpackage/entity/RedConfig;", "redConfigStable", "amountSize", "coverInfo", "Lkotlin/Pair;", "hasAutoCheckForNew", "Ljava/util/concurrent/atomic/AtomicBoolean;", "autoCheckForNewUser", "getAutoCheckForNewUser", "()Z", "autoCheckForNewUser$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "selectCover", "checkErrorViewShow", "amount", "", "number", "getConfigList", "setAllConfigData", "it", "setCoverInitInfo", "redConfig", "titleList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTitleList", "()Ljava/util/ArrayList;", "titleList$delegate", "saveFragment", "Lcom/kubi/redpackage/ui/ListRedCoinFragment;", "tradeFragment", "showChooseRedCoinDialog", "getLastConfig", "setCurrentConfig", "currencyConfig", "sendRedPackage", "alertSetTradePasswordDialog", "callSend", "checkError", "throwable", "", "currentKeyWords", "sendOk", "Lcom/kubi/redpackage/entity/RedPackageResponse;", "showRedPackageDialog", "keyWords", "onTypeChanged", "chooseAccount", "checkPwd", "next", "Lkotlin/Function0;", "Companion", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPacketSendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPacketSendActivity.kt\ncom/kubi/redpackage/ui/RedPacketSendActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1054:1\n49#2,15:1055\n1#3:1070\n29#4:1071\n17#5,2:1072\n17#5,2:1074\n17#5,2:1077\n32#6:1076\n23#6,2:1079\n23#6,2:1081\n12637#7,2:1083\n*S KotlinDebug\n*F\n+ 1 RedPacketSendActivity.kt\ncom/kubi/redpackage/ui/RedPacketSendActivity\n*L\n131#1:1055,15\n366#1:1071\n617#1:1072,2\n664#1:1074,2\n517#1:1077,2\n668#1:1076\n593#1:1079,2\n604#1:1081,2\n740#1:1083,2\n*E\n"})
public final class RedPacketSendActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: A */
    @Nullable
    public CurrenciesConfig f43178A;

    /* JADX INFO: renamed from: B */
    public double f43179B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public RedConfig f43180C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public RedConfig f43181D;

    /* JADX INFO: renamed from: E */
    public double f43182E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public Pair<String, String> f43183F;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final ListRedCoinFragment f43187J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public final ListRedCoinFragment f43188K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public String f43189L;

    /* JADX INFO: renamed from: y */
    public boolean f43193y;

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ KProperty<Object>[] f43177N = {Reflection.property1(new PropertyReference1Impl(RedPacketSendActivity.class, "binding", "getBinding$RedpackageLib_googleRelease()Lcom/kubi/redpackage/databinding/BredpackageActivitySendRedpacketBinding;", 0))};

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final Companion f43176M = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f43190v = C45678b.m100788b(this, new Function1<C45316b, Unit>() { // from class: com.kubi.redpackage.ui.RedPacketSendActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C45316b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45316b c45316b) {
            invoke(c45316b);
            return Unit.INSTANCE;
        }
    }, new Function1<RedPacketSendActivity, C45316b>() { // from class: com.kubi.redpackage.ui.RedPacketSendActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45316b invoke(@NotNull RedPacketSendActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s2057000368(...)");
            return C45316b.m100186a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @Nullable
    public String f43191w = "B3redEnvelope";

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f43192x = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketSendActivity.m53878I3();
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public String f43194z = "MAIN";

    /* JADX INFO: renamed from: G */
    @NotNull
    public AtomicBoolean f43184G = new AtomicBoolean(false);

    /* JADX INFO: renamed from: H */
    @NotNull
    public final Lazy f43185H = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(RedPacketSendActivity.m53954g2(this.f43304b));
        }
    });

    /* JADX INFO: renamed from: I */
    @NotNull
    public final Lazy f43186I = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedPacketSendActivity.m53982m4(this.f43375b);
        }
    });

    /* JADX INFO: compiled from: RedPacketSendActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedPacketSendActivity$Companion;", "", "<init>", "()V", "PAGE_ID", "", "RESULT_CODE", "", "REDPACKAGE_COVER", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.RedPacketSendActivity$a */
    /* JADX INFO: compiled from: RedPacketSendActivity.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/redpackage/ui/RedPacketSendActivity$onCreate$16", "Lcom/kubi/utils/SimpleObserver;", "", "onNext", "", "o", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22734a extends C27086s0<Boolean> {
        public C22734a() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0047  */
        /* JADX INFO: renamed from: a */
        public void m54053a(boolean z11) {
            Button button;
            boolean z12;
            TextInputWithTitleView textInputWithTitleView;
            TextInputWithTitleView textInputWithTitleView2;
            C45316b c45316bM54038T2 = RedPacketSendActivity.this.m54038T2();
            if (c45316bM54038T2 != null && (button = c45316bM54038T2.f101890j) != null) {
                if (z11) {
                    C45316b c45316bM54038T3 = RedPacketSendActivity.this.m54038T2();
                    Boolean boolValueOf = null;
                    if (C27025c.m66566d((c45316bM54038T3 == null || (textInputWithTitleView2 = c45316bM54038T3.f101885e) == null) ? null : Boolean.valueOf(textInputWithTitleView2.isActivated()))) {
                        z12 = false;
                    } else {
                        C45316b c45316bM54038T4 = RedPacketSendActivity.this.m54038T2();
                        if (c45316bM54038T4 != null && (textInputWithTitleView = c45316bM54038T4.f101888h) != null) {
                            boolValueOf = Boolean.valueOf(textInputWithTitleView.isActivated());
                        }
                        if (C27025c.m66566d(boolValueOf)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                    }
                } else {
                    z12 = false;
                }
                button.setEnabled(z12);
            }
            if (z11) {
                C43852m.m96595g("B3redEnvelope", "insertMoney", null, null, 12, null);
            }
        }

        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m54053a(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.RedPacketSendActivity$b */
    /* JADX INFO: compiled from: RedPacketSendActivity.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/redpackage/ui/RedPacketSendActivity$showChooseRedCoinDialog$2$1$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22735b extends ViewPager.SimpleOnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            C43852m.m96591c("B3redEnvelope", position == 0 ? "mainAccount" : "tradingAccount", null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m53904Q3(final RedPacketSendActivity redPacketSendActivity, ArrayList arrayList) throws JSONException {
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        if (arrayList == null || arrayList.isEmpty()) {
            redPacketSendActivity.m54049h2();
        } else {
            Object obj = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((Object[]) obj).length == 0) {
                redPacketSendActivity.m54052x2(new Function0() { // from class: com.kubi.redpackage.ui.u1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedPacketSendActivity.m53911S3(this.f43346b);
                    }
                });
            } else {
                Object obj2 = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                for (Object obj3 : (Object[]) obj2) {
                    Locale ENGLISH = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String upperCase = ((String) obj3).toUpperCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String upperCase2 = "WITHDRAW_PASSWORD".toUpperCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (!Intrinsics.areEqual(upperCase, upperCase2)) {
                        IUserService.a.get().c0(MapsKt.mapOf(TuplesKt.m90091to("data", C27099x.m66919i(arrayList, false, 2, null)), TuplesKt.m90091to("validation", "SEND_RED_ENVELOPS")), new Function0() { // from class: com.kubi.redpackage.ui.t1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RedPacketSendActivity.m53908R3(this.f43340b);
                            }
                        });
                    }
                }
                redPacketSendActivity.m54052x2(new Function0() { // from class: com.kubi.redpackage.ui.u1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedPacketSendActivity.m53911S3(this.f43346b);
                    }
                });
            }
        }
        C46928a.m103398d(RedPkgCategory.SEND_GET_CHECKS, true, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m53917U3(RedPacketSendActivity redPacketSendActivity, Throwable th2) throws JSONException {
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        RedPkgCategory redPkgCategory = RedPkgCategory.SEND_GET_CHECKS;
        String strM66669i = C27041f.m66669i(th2.getMessage(), "--");
        ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
        C46928a.m103398d(redPkgCategory, false, strM66669i, C27041f.m66669i(apiException != null ? apiException.code : null, "--"), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k2 */
    public static final Unit m53970k2(RedPacketSendActivity redPacketSendActivity, RedPackageResponse redPackageResponse) throws JSONException {
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        Intrinsics.checkNotNull(redPackageResponse);
        redPacketSendActivity.m54035M3(redPackageResponse);
        C46928a.m103398d(RedPkgCategory.SEND_RESULT, true, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m54005s2(RedPacketSendActivity redPacketSendActivity, String str, Throwable th2, Map map) {
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            C19331c.m42836c(th2, null, 2, null);
        } else if (!redPacketSendActivity.isFinishing()) {
            RedPacketErrorResourceEntity redPacketErrorResourceEntity = (RedPacketErrorResourceEntity) CollectionsKt.firstOrNull(list);
            if (redPacketErrorResourceEntity == null || !redPacketErrorResourceEntity.isLegal()) {
                C19331c.m42836c(th2, null, 2, null);
            } else {
                RedPackageHelperKt.m53723l(redPacketSendActivity.getSupportFragmentManager(), (List) map.get(str));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m54013u2(RedPacketSendActivity redPacketSendActivity, Throwable th2, Throwable th3) {
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX INFO: renamed from: w2 */
    public final void m54051w2(CharSequence charSequence, CharSequence charSequence2) {
        TextInputWithTitleView textInputWithTitleView;
        C45316b c45316bM54038T2;
        TextInputWithTitleView textInputWithTitleView2;
        Double dValueOf;
        Double dValueOf2;
        int i11;
        String currencyMax;
        String currencyMin;
        String currencyMinNum;
        String currencyMaxNum;
        String currencyMinNum2;
        String currencyMax2;
        BigDecimal bigDecimalM54092d;
        String currencyMaxNum2;
        String currencyMin2;
        BigDecimal bigDecimalM54092d2;
        String currencyMinNum3;
        String currencyMax3;
        String currencyMin3;
        C45316b c45316bM54038T3 = m54038T2();
        if (c45316bM54038T3 == null || (textInputWithTitleView = c45316bM54038T3.f101885e) == null || (c45316bM54038T2 = m54038T2()) == null || (textInputWithTitleView2 = c45316bM54038T2.f101888h) == null) {
            return;
        }
        textInputWithTitleView.setActivated(false);
        textInputWithTitleView2.setActivated(false);
        CurrenciesConfig currenciesConfig = this.f43178A;
        double dM66646f = C27039d.m66646f((currenciesConfig == null || (currencyMin3 = currenciesConfig.getCurrencyMin()) == null) ? null : Double.valueOf(StringsExtKt.m54094f(currencyMin3, 0.0d, 1, null)));
        CurrenciesConfig currenciesConfig2 = this.f43178A;
        double dM66646f2 = C27039d.m66646f((currenciesConfig2 == null || (currencyMax3 = currenciesConfig2.getCurrencyMax()) == null) ? null : Double.valueOf(StringsExtKt.m54094f(currencyMax3, 0.0d, 1, null)));
        CurrenciesConfig currenciesConfig3 = this.f43178A;
        if (currenciesConfig3 == null || (currencyMin2 = currenciesConfig3.getCurrencyMin()) == null || (bigDecimalM54092d2 = StringsExtKt.m54092d(currencyMin2, null, 1, null)) == null) {
            dValueOf = null;
        } else {
            CurrenciesConfig currenciesConfig4 = this.f43178A;
            BigDecimal bigDecimalMultiply = bigDecimalM54092d2.multiply((currenciesConfig4 == null || (currencyMinNum3 = currenciesConfig4.getCurrencyMinNum()) == null) ? null : StringsExtKt.m54092d(currencyMinNum3, null, 1, null));
            if (bigDecimalMultiply != null) {
                dValueOf = Double.valueOf(bigDecimalMultiply.doubleValue());
            } else {
                dValueOf = null;
            }
        }
        double dM66646f3 = C27039d.m66646f(dValueOf);
        CurrenciesConfig currenciesConfig5 = this.f43178A;
        if (currenciesConfig5 == null || (currencyMax2 = currenciesConfig5.getCurrencyMax()) == null || (bigDecimalM54092d = StringsExtKt.m54092d(currencyMax2, null, 1, null)) == null) {
            dValueOf2 = null;
        } else {
            CurrenciesConfig currenciesConfig6 = this.f43178A;
            BigDecimal bigDecimalMultiply2 = bigDecimalM54092d.multiply((currenciesConfig6 == null || (currencyMaxNum2 = currenciesConfig6.getCurrencyMaxNum()) == null) ? null : StringsExtKt.m54092d(currencyMaxNum2, null, 1, null));
            if (bigDecimalMultiply2 != null) {
                dValueOf2 = Double.valueOf(bigDecimalMultiply2.doubleValue());
            } else {
                dValueOf2 = null;
            }
        }
        double dM66646f4 = C27039d.m66646f(dValueOf2);
        if (TextUtils.isEmpty(charSequence)) {
            i11 = 8;
        } else if (this.f43193y) {
            if (!NumberUtils.INSTANCE.range(this.f43182E, dM66646f3, dM66646f4)) {
                textInputWithTitleView.setActivated(true);
                if (this.f43182E < dM66646f3) {
                    int i12 = R$string.redpackage_qty_not_min;
                    StringBuilder sb2 = new StringBuilder();
                    CurrenciesConfig currenciesConfig7 = this.f43178A;
                    sb2.append(C41014a.m89941o(dM66646f3, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig7 != null ? Integer.valueOf(currenciesConfig7.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                    CurrenciesConfig currenciesConfig8 = this.f43178A;
                    sb2.append(currenciesConfig8 != null ? currenciesConfig8.getCurrencyName() : null);
                    textInputWithTitleView.setError(getString(i12, sb2.toString()));
                } else {
                    int i13 = R$string.redpackage_qty_not_max;
                    StringBuilder sb3 = new StringBuilder();
                    CurrenciesConfig currenciesConfig9 = this.f43178A;
                    sb3.append(C41014a.m89941o(dM66646f4, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig9 != null ? Integer.valueOf(currenciesConfig9.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                    CurrenciesConfig currenciesConfig10 = this.f43178A;
                    sb3.append(currenciesConfig10 != null ? currenciesConfig10.getCurrencyName() : null);
                    textInputWithTitleView.setError(getString(i13, sb3.toString()));
                }
            }
            i11 = 8;
        } else {
            i11 = 8;
            if (!NumberUtils.INSTANCE.range(this.f43182E, dM66646f, dM66646f2)) {
                textInputWithTitleView.setActivated(true);
                if (this.f43182E < dM66646f) {
                    int i14 = R$string.redpackage_qty_not_min;
                    StringBuilder sb4 = new StringBuilder();
                    CurrenciesConfig currenciesConfig11 = this.f43178A;
                    sb4.append(C41014a.m89941o(dM66646f, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig11 != null ? Integer.valueOf(currenciesConfig11.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                    CurrenciesConfig currenciesConfig12 = this.f43178A;
                    sb4.append(currenciesConfig12 != null ? currenciesConfig12.getCurrencyName() : null);
                    textInputWithTitleView.setError(getString(i14, sb4.toString()));
                } else {
                    int i15 = R$string.redpackage_qty_not_max;
                    StringBuilder sb5 = new StringBuilder();
                    CurrenciesConfig currenciesConfig13 = this.f43178A;
                    sb5.append(C41014a.m89941o(dM66646f2, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig13 != null ? Integer.valueOf(currenciesConfig13.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                    CurrenciesConfig currenciesConfig14 = this.f43178A;
                    sb5.append(currenciesConfig14 != null ? currenciesConfig14.getCurrencyName() : null);
                    textInputWithTitleView.setError(getString(i15, sb5.toString()));
                }
            }
        }
        if (!textInputWithTitleView.isActivated()) {
            textInputWithTitleView.setPrice("≈");
        }
        if (TextUtils.isEmpty(charSequence2)) {
            return;
        }
        NumberUtils.Companion companion = NumberUtils.INSTANCE;
        double dM54094f = StringsExtKt.m54094f(charSequence2.toString(), 0.0d, 1, null);
        CurrenciesConfig currenciesConfig15 = this.f43178A;
        double dM66646f5 = C27039d.m66646f((currenciesConfig15 == null || (currencyMinNum2 = currenciesConfig15.getCurrencyMinNum()) == null) ? null : Double.valueOf(StringsExtKt.m54094f(currencyMinNum2, 0.0d, 1, null)));
        CurrenciesConfig currenciesConfig16 = this.f43178A;
        if (!companion.range(dM54094f, dM66646f5, C27039d.m66646f((currenciesConfig16 == null || (currencyMaxNum = currenciesConfig16.getCurrencyMaxNum()) == null) ? null : Double.valueOf(StringsExtKt.m54094f(currencyMaxNum, 0.0d, 1, null))))) {
            textInputWithTitleView2.setActivated(true);
            double dM54094f2 = StringsExtKt.m54094f(charSequence2.toString(), 0.0d, 1, null);
            CurrenciesConfig currenciesConfig17 = this.f43178A;
            if (dM54094f2 < C27039d.m66646f((currenciesConfig17 == null || (currencyMinNum = currenciesConfig17.getCurrencyMinNum()) == null) ? null : Double.valueOf(StringsExtKt.m54094f(currencyMinNum, 0.0d, 1, null)))) {
                int i16 = R$string.redpackage_num_not_min;
                CurrenciesConfig currenciesConfig18 = this.f43178A;
                textInputWithTitleView2.setError(getString(i16, C27041f.m66668h(currenciesConfig18 != null ? currenciesConfig18.getCurrencyMinNum() : null)));
                return;
            } else {
                int i17 = R$string.redpackage_num_not_max;
                CurrenciesConfig currenciesConfig19 = this.f43178A;
                textInputWithTitleView2.setError(getString(i17, C27041f.m66668h(currenciesConfig19 != null ? currenciesConfig19.getCurrencyMaxNum() : null)));
                return;
            }
        }
        if (this.f43193y) {
            BigDecimal bigDecimalM54092d3 = StringsExtKt.m54092d(charSequence2.toString(), null, 1, null);
            CurrenciesConfig currenciesConfig20 = this.f43178A;
            BigDecimal bigDecimalMultiply3 = bigDecimalM54092d3.multiply((currenciesConfig20 == null || (currencyMin = currenciesConfig20.getCurrencyMin()) == null) ? null : StringsExtKt.m54092d(currencyMin, null, 1, null));
            double dM66646f6 = C27039d.m66646f(bigDecimalMultiply3 != null ? Double.valueOf(bigDecimalMultiply3.doubleValue()) : null);
            BigDecimal bigDecimalM54092d4 = StringsExtKt.m54092d(charSequence2.toString(), null, 1, null);
            CurrenciesConfig currenciesConfig21 = this.f43178A;
            BigDecimal bigDecimalMultiply4 = bigDecimalM54092d4.multiply((currenciesConfig21 == null || (currencyMax = currenciesConfig21.getCurrencyMax()) == null) ? null : StringsExtKt.m54092d(currencyMax, null, 1, null));
            double dM66646f7 = C27039d.m66646f(bigDecimalMultiply4 != null ? Double.valueOf(bigDecimalMultiply4.doubleValue()) : null);
            if (this.f43179B < dM66646f6) {
                textInputWithTitleView.setActivated(true);
                int i18 = R$string.redpackage_qty_not_min;
                StringBuilder sb6 = new StringBuilder();
                CurrenciesConfig currenciesConfig22 = this.f43178A;
                sb6.append(C41014a.m89941o(dM66646f6, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig22 != null ? Integer.valueOf(currenciesConfig22.getPrecision()) : null, i11), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                CurrenciesConfig currenciesConfig23 = this.f43178A;
                sb6.append(currenciesConfig23 != null ? currenciesConfig23.getCurrencyName() : null);
                textInputWithTitleView.setError(getString(i18, sb6.toString()));
            }
            if (this.f43179B > dM66646f7) {
                textInputWithTitleView.setActivated(true);
                int i19 = R$string.redpackage_qty_not_max;
                StringBuilder sb7 = new StringBuilder();
                CurrenciesConfig currenciesConfig24 = this.f43178A;
                sb7.append(C41014a.m89941o(dM66646f7, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig24 != null ? Integer.valueOf(currenciesConfig24.getPrecision()) : null, i11), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
                CurrenciesConfig currenciesConfig25 = this.f43178A;
                sb7.append(currenciesConfig25 != null ? currenciesConfig25.getCurrencyName() : null);
                textInputWithTitleView.setError(getString(i19, sb7.toString()));
            }
        }
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m53851B2(BaseViewHolder baseViewHolder, RedPacketSendActivity redPacketSendActivity, String str, TextView textView) {
        double dDoubleValue;
        ((AccountLabelView) baseViewHolder.getView(R$id.account_label_from)).setCurrentAccount(Intrinsics.areEqual("MAIN", redPacketSendActivity.f43194z) ? AccountType.MAIN : AccountType.TRADE);
        C27096v0 c27096v0Append = new C27096v0().append(str);
        if (Intrinsics.areEqual(redPacketSendActivity.f43194z, "TRADE")) {
            CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
            dDoubleValue = C41014a.m89924I(currenciesConfig != null ? currenciesConfig.getTradeCurrencyBalance() : null, 0.0d, 1, null).doubleValue();
        } else {
            CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
            dDoubleValue = C41014a.m89924I(currenciesConfig2 != null ? currenciesConfig2.getMainCurrencyBalance() : null, 0.0d, 1, null).doubleValue();
        }
        if (redPacketSendActivity.f43179B > dDoubleValue) {
            c27096v0Append.m66905e('(' + redPacketSendActivity.getString(R$string.balance_insufficient) + ')', C27046k.m66699n(redPacketSendActivity, R$color.secondary));
        }
        textView.setText(c27096v0Append);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m53852B3(final RedPacketSendActivity redPacketSendActivity, Boolean bool) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53856C3(this.f43261b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E2 */
    public static final void m53862E2(PassWordGridView passWordGridView) {
        if (passWordGridView == null || passWordGridView.getChildCount() <= 0) {
            return;
        }
        KeyboardUtils.m6041m(passWordGridView.getChildAt(0));
    }

    /* JADX INFO: renamed from: F2 */
    public static final void m53866F2(final View view, final RedPacketSendActivity redPacketSendActivity, final PassWordGridView passWordGridView, final DialogFragmentHelper dialogFragmentHelper, final Function0 function0, final BaseViewHolder baseViewHolder, String str) {
        if (view == null) {
            return;
        }
        CheckCodeParamsEntity checkCodeParamsEntity = new CheckCodeParamsEntity();
        checkCodeParamsEntity.setBizType("SEND_RED_ENVELOPS");
        HashMap<String, String> validations = checkCodeParamsEntity.getValidations();
        Intrinsics.checkNotNullExpressionValue(validations, "getValidations(...)");
        validations.put("WITHDRAW_PASSWORD", C27052h0.m66729d(str, 2));
        ViewExtKt.m66594y(view);
        Observable observableCompose = RedPackageApi.m53729o(redPacketSendActivity.m54045c3(), checkCodeParamsEntity, null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.e3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53870G2(view, passWordGridView, dialogFragmentHelper, function0, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.f3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53873H2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53877I2(view, passWordGridView, baseViewHolder, redPacketSendActivity, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.h3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53885K2(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, redPacketSendActivity.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: I2 */
    public static final Unit m53877I2(View view, PassWordGridView passWordGridView, BaseViewHolder baseViewHolder, final RedPacketSendActivity redPacketSendActivity, Throwable th2) throws JSONException {
        ViewExtKt.m66577h(view);
        passWordGridView.m54712c();
        baseViewHolder.setGone(R$id.tipTextView, true);
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            if (Intrinsics.areEqual(apiException.code, "230003")) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.balance_insufficient).m54156M4(redPacketSendActivity.getString(R$string.balence_insufficient_switch_account)).m54159P4(R$string.cancel, null).m54163T4(redPacketSendActivity.getString(R$string.switch_account), new DialogInterface.OnClickListener() { // from class: com.kubi.redpackage.ui.l3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        RedPacketSendActivity.m53881J2(this.f43290b, dialogInterface, i11);
                    }
                }).m54172c5(redPacketSendActivity.getSupportFragmentManager());
                C46928a.m103398d(RedPkgCategory.SEND_NOT_BALANCE, false, null, null, 7, null);
            } else if (!Intrinsics.areEqual(apiException.code, "401")) {
                ToastCompat.m66441G(apiException.getMessage(), new Object[0]);
                C46928a.m103398d(RedPkgCategory.SEND_PWD_CHECK, false, C27041f.m66669i(apiException.getMessage(), "--"), C27041f.m66669i(apiException.code, "--"), 1, null);
            }
        } else {
            C46928a.m103398d(RedPkgCategory.SEND_PWD_CHECK, false, C27041f.m66669i(th2 != null ? th2.getMessage() : null, "--"), "--", 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m53888L3(RedPacketSendActivity redPacketSendActivity, int i11, Intent intent) {
        String stringExtra;
        BaseTextView baseTextView;
        if (i11 != 100) {
            return;
        }
        String stringExtra2 = intent != null ? intent.getStringExtra("id") : null;
        if (intent == null || (stringExtra = intent.getStringExtra("name")) == null) {
            stringExtra = "";
        }
        C44128b.m97266j("RedPacket", "selectCover-result: id=" + stringExtra2 + ",name=" + stringExtra);
        redPacketSendActivity.f43183F = (stringExtra2 == null || stringExtra2.length() == 0) ? TuplesKt.m90091to(null, redPacketSendActivity.getString(R$string.default_escape)) : TuplesKt.m90091to(stringExtra2, stringExtra);
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 == null || (baseTextView = c45316bM54038T2.f101886f) == null) {
            return;
        }
        Pair<String, String> pair = redPacketSendActivity.f43183F;
        baseTextView.setText(pair != null ? pair.getSecond() : null);
    }

    /* JADX INFO: renamed from: M2 */
    public static final Unit m53890M2(final RedPacketSendActivity redPacketSendActivity, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.stv_dialog_account_save;
        SingleAccountTypeView singleAccountTypeView = (SingleAccountTypeView) viewHolder.getView(i11);
        double d11 = redPacketSendActivity.f43179B;
        CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
        BigDecimal mainCurrencyBalance = currenciesConfig != null ? currenciesConfig.getMainCurrencyBalance() : null;
        CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
        String currencyCode = currenciesConfig2 != null ? currenciesConfig2.getCurrencyCode() : null;
        CurrenciesConfig currenciesConfig3 = redPacketSendActivity.f43178A;
        singleAccountTypeView.m54103a(d11, mainCurrencyBalance, currencyCode, currenciesConfig3 != null ? currenciesConfig3.getCurrencyName() : null);
        int i12 = R$id.stv_dialog_account_trade;
        SingleAccountTypeView singleAccountTypeView2 = (SingleAccountTypeView) viewHolder.getView(i12);
        double d12 = redPacketSendActivity.f43179B;
        CurrenciesConfig currenciesConfig4 = redPacketSendActivity.f43178A;
        BigDecimal tradeCurrencyBalance = currenciesConfig4 != null ? currenciesConfig4.getTradeCurrencyBalance() : null;
        CurrenciesConfig currenciesConfig5 = redPacketSendActivity.f43178A;
        String currencyCode2 = currenciesConfig5 != null ? currenciesConfig5.getCurrencyCode() : null;
        CurrenciesConfig currenciesConfig6 = redPacketSendActivity.f43178A;
        singleAccountTypeView2.m54103a(d12, tradeCurrencyBalance, currencyCode2, currenciesConfig6 != null ? currenciesConfig6.getCurrencyName() : null);
        View view = viewHolder.getView(R$id.tv_dialog_account_gootc);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.redpackage.ui.m3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53893N2(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_dialog_account_cancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.redpackage.ui.o3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53896O2(dialogFragmentHelper);
            }
        }, 1, null);
        View view3 = viewHolder.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.redpackage.ui.p3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53903Q2(this.f43317b, dialogFragmentHelper);
            }
        }, 1, null);
        View view4 = viewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.redpackage.ui.q3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53907R2(this.f43326b, dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q2 */
    public static final Unit m53903Q2(RedPacketSendActivity redPacketSendActivity, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        redPacketSendActivity.f43194z = "MAIN";
        dialogFragmentHelper.dismiss();
        redPacketSendActivity.m54036N3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R2 */
    public static final Unit m53907R2(RedPacketSendActivity redPacketSendActivity, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        redPacketSendActivity.f43194z = "TRADE";
        dialogFragmentHelper.dismiss();
        redPacketSendActivity.m54036N3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V2 */
    public static final Boolean m53920V2(RedPacketSendActivity redPacketSendActivity, RedConfig t11, RedConfig t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        redPacketSendActivity.f43180C = t11;
        redPacketSendActivity.f43181D = t12;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45656a.class, SiteInfoManager.f47913a.m58109c());
        boolean zMo100781a = objM56186h != null ? ((InterfaceC45656a) objM56186h).mo100781a() : false;
        RedConfig redConfig = redPacketSendActivity.f43180C;
        if (redConfig != null) {
            ArrayList<CurrenciesConfig> currenciesConfigs = redConfig.getCurrenciesConfigs();
            redConfig.setCurrenciesConfigs(currenciesConfigs != null ? C46928a.m103396b(currenciesConfigs, zMo100781a, null, 2, null) : null);
        }
        RedConfig redConfig2 = redPacketSendActivity.f43181D;
        if (redConfig2 != null) {
            ArrayList<CurrenciesConfig> currenciesConfigs2 = redConfig2.getCurrenciesConfigs();
            redConfig2.setCurrenciesConfigs(currenciesConfigs2 != null ? C46928a.m103396b(currenciesConfigs2, zMo100781a, null, 2, null) : null);
        }
        redPacketSendActivity.m54040W3(redPacketSendActivity.f43193y ? redPacketSendActivity.f43180C : redPacketSendActivity.f43181D);
        if (t11.getWelfareExtend() == null) {
            t11 = t12;
        }
        redPacketSendActivity.m54041Y3(t11);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: W2 */
    public static final Boolean m53924W2(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Boolean) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m53938a4(C45316b c45316b, RedPacketSendActivity redPacketSendActivity) {
        BaseTextView baseTextView = c45316b.f101892l;
        C27096v0 c27096v0 = new C27096v0();
        double d11 = redPacketSendActivity.f43179B;
        CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
        C27096v0 c27096v0Append = c27096v0.append(C41014a.m89941o(d11, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig != null ? Integer.valueOf(currenciesConfig.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null)).append(C33627eb.f69716f);
        CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
        baseTextView.setText(c27096v0Append.m66904d(C27041f.m66668h(currenciesConfig2 != null ? currenciesConfig2.getCurrencyName() : null), 14));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m53943c4(RedPacketSendActivity redPacketSendActivity, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ViewPager viewPager = (ViewPager) viewHolder.getView(R$id.view_pager);
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) viewHolder.getView(R$id.tab_layout);
        FragmentManager childFragmentManager = dialogFragmentHelper.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        viewPager.setAdapter(new C27103z(childFragmentManager, CollectionsKt.arrayListOf(redPacketSendActivity.f43187J, redPacketSendActivity.f43188K), redPacketSendActivity.m54047d3()));
        viewPager.setOffscreenPageLimit(2);
        viewPager.addOnPageChangeListener(new C22735b());
        slidingTabLayout.setViewPager(viewPager);
        slidingTabLayout.m55291w();
        if (Intrinsics.areEqual(redPacketSendActivity.f43194z, "TRADE")) {
            viewPager.setCurrentItem(1);
        }
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.redpackage.ui.i2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53945d4(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e2 */
    public static final void m53947e2(BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        int i11 = R$id.tv_error_one;
        helper.setGone(i11, true).setText(i11, R$string.open_trade_pwd);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: e3 */
    public static final Unit m53948e3(RedPacketSendActivity redPacketSendActivity) throws JSONException {
        BigDecimal tradeCurrencyBalance;
        String str = "MAIN";
        if (Intrinsics.areEqual(redPacketSendActivity.f43194z, "MAIN")) {
            CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
            if (currenciesConfig != null) {
                tradeCurrencyBalance = currenciesConfig.getMainCurrencyBalance();
            } else {
                tradeCurrencyBalance = null;
            }
        } else {
            CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
            if (currenciesConfig2 != null) {
                tradeCurrencyBalance = currenciesConfig2.getTradeCurrencyBalance();
            } else {
                tradeCurrencyBalance = null;
            }
        }
        if (C27039d.m66647g(tradeCurrencyBalance) < redPacketSendActivity.f43179B) {
            CurrenciesConfig currenciesConfig3 = redPacketSendActivity.f43178A;
            if (C27039d.m66647g(currenciesConfig3 != null ? currenciesConfig3.getMainCurrencyBalance() : null) < redPacketSendActivity.f43179B) {
                CurrenciesConfig currenciesConfig4 = redPacketSendActivity.f43178A;
                str = C27039d.m66647g(currenciesConfig4 != null ? currenciesConfig4.getTradeCurrencyBalance() : null) >= redPacketSendActivity.f43179B ? "TRADE" : redPacketSendActivity.f43194z;
            }
            redPacketSendActivity.f43194z = str;
        }
        redPacketSendActivity.m54036N3();
        C43852m.m96591c("B3redEnvelope", "insertMoney", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f2 */
    public static final void m53950f2(DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: f3 */
    public static final Unit m53951f3(RedPacketSendActivity redPacketSendActivity) {
        BaseTextView baseTextView;
        List listSplit$default;
        BaseTextView baseTextView2;
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText2;
        String str = "،";
        redPacketSendActivity.f43193y = !redPacketSendActivity.f43193y;
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 != null && (textInputWithTitleView = c45316bM54038T2.f101885e) != null && (editText = textInputWithTitleView.getEditText()) != null) {
            C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
            editText.setText((c45316bM54038T3 == null || (textInputWithTitleView2 = c45316bM54038T3.f101885e) == null || (editText2 = textInputWithTitleView2.getEditText()) == null) ? null : editText2.getText());
        }
        String string = redPacketSendActivity.getString(redPacketSendActivity.f43193y ? R$string.switch_fixed_redpacket : R$string.switch_lucky_redpacket);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        try {
            if (Intrinsics.areEqual(MultiLanguageManager.f46811g.getLocalString(), "ur_PK")) {
                listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"۔"}, false, 0, 6, (Object) null);
                str = "۔";
            } else if (Intrinsics.areEqual(MultiLanguageManager.f46811g.getLocalString(), "ar_AE")) {
                listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"،"}, false, 0, 6, (Object) null);
            } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) "，", false, 2, (Object) null)) {
                listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{"，"}, false, 0, 6, (Object) null);
                str = "，";
            } else if (StringsKt.contains$default((CharSequence) string, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
                str = ". ";
                listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
            } else {
                listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                str = ", ";
            }
            C27096v0 c27096v0M66905e = new C27096v0().append(((String) listSplit$default.get(0)) + str).m66905e((CharSequence) listSplit$default.get(1), C27046k.m66699n(redPacketSendActivity, R$color.primary));
            C45316b c45316bM54038T4 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T4 != null && (baseTextView2 = c45316bM54038T4.f101891k) != null) {
                baseTextView2.setText(c27096v0M66905e);
            }
        } catch (Exception unused) {
            C45316b c45316bM54038T5 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T5 != null && (baseTextView = c45316bM54038T5.f101891k) != null) {
                baseTextView.setText(string);
            }
        }
        redPacketSendActivity.m54040W3(redPacketSendActivity.f43193y ? redPacketSendActivity.f43180C : redPacketSendActivity.f43181D);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m53952f4(final RedPacketSendActivity redPacketSendActivity, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        CheckBox checkBox;
        CheckBox checkBox2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tv_title;
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        Boolean boolValueOf = null;
        viewHolder.setText(i11, C27025c.m66566d((c45316bM54038T2 == null || (checkBox2 = c45316bM54038T2.f101882b) == null) ? null : Boolean.valueOf(checkBox2.isChecked())) ? R$string.newcomer_only_redpackage : R$string.red_package);
        int i12 = R$id.tv_copy;
        C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T3 != null && (checkBox = c45316bM54038T3.f101882b) != null) {
            boolValueOf = Boolean.valueOf(checkBox.isChecked());
        }
        viewHolder.setGone(i12, !C27025c.m66566d(boolValueOf));
        viewHolder.setText(R$id.tv_dialog_redpacket_content, redPacketSendActivity.f43189L);
        View view = viewHolder.getView(R$id.iv_dialog_redpacket_copy_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.redpackage.ui.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53956g4(dialogFragmentHelper, redPacketSendActivity);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.fl_share_media);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.redpackage.ui.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53959h4(this.f43341b);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.fl_share_sms);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.redpackage.ui.u2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53963i4(this.f43347b);
            }
        }, 1, null);
        View view4 = viewHolder.getView(R$id.fl_share_email);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.redpackage.ui.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53972k4(this.f43352b);
            }
        }, 1, null);
        View view5 = viewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.redpackage.ui.w2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53977l4(this.f43359b);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h3 */
    public static final boolean m53958h3(RedPacketSendActivity redPacketSendActivity, CharSequence it) {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        Intrinsics.checkNotNullParameter(it, "it");
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        return C27025c.m66566d((c45316bM54038T2 == null || (textInputWithTitleView = c45316bM54038T2.f101885e) == null || (editText = textInputWithTitleView.getEditText()) == null) ? null : Boolean.valueOf(editText.isFocused()));
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m53959h4(RedPacketSendActivity redPacketSendActivity) {
        IShareService iShareService = IShareService.f49268a.get();
        TextShareParam textShareParam = new TextShareParam("red_Share", null, null, null, 14, null);
        textShareParam.setContent(redPacketSendActivity.f43189L);
        IShareService.m59640c(iShareService, textShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i3 */
    public static final boolean m53962i3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m53963i4(final RedPacketSendActivity redPacketSendActivity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.k3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53967j4(this.f43286b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j3 */
    public static final Unit m53966j3(final RedPacketSendActivity redPacketSendActivity, final CharSequence charSequence) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53971k3(charSequence, redPacketSendActivity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m53967j4(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.startActivity(RedPackageHelperKt.m53722k(redPacketSendActivity.f43189L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m53972k4(RedPacketSendActivity redPacketSendActivity) {
        try {
            redPacketSendActivity.startActivity(RedPackageHelperKt.m53714c(redPacketSendActivity.f43189L));
        } catch (Exception unused) {
            ToastCompat.m66437C(R$string.redpacket_email_unavaiable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m53977l4(RedPacketSendActivity redPacketSendActivity) {
        C27057k.m66746b(redPacketSendActivity.f43189L);
        ToastCompat.m66441G(redPacketSendActivity.getString(R$string.pwd_copied_clipboard), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final ArrayList m53982m4(RedPacketSendActivity redPacketSendActivity) {
        ArrayList arrayList = new ArrayList();
        C27096v0 c27096v0 = new C27096v0();
        String str = MultiLanguageManager.m56979h() ? "储" : "Ma";
        C27017c c27017c = C27017c.f54310a;
        Drawable drawableM66510d = C27017c.m66510d(c27017c, R$drawable.shape_primary_2r, null, 2, null);
        int i11 = R$color.c_white;
        c27096v0.m66903c(str, new BackgroundSpan(drawableM66510d, c27017c.m66512a(i11), C27029c.m66599b(redPacketSendActivity, 1), 0.9f));
        c27096v0.append(C33627eb.f69716f);
        c27096v0.append(redPacketSendActivity.getString(R$string.save_account));
        arrayList.add(c27096v0);
        C27096v0 c27096v1 = new C27096v0();
        c27096v1.m66903c(MultiLanguageManager.m56979h() ? "币" : "Tr", new BackgroundSpan(C27017c.m66510d(c27017c, R$drawable.shape_supplementary_2r, null, 2, null), c27017c.m66512a(i11), C27029c.m66599b(redPacketSendActivity, 1), 0.9f));
        c27096v1.append(C33627eb.f69716f);
        c27096v1.append(redPacketSendActivity.getString(R$string.trade_account));
        arrayList.add(c27096v1);
        return arrayList;
    }

    /* JADX INFO: renamed from: o3 */
    public static final boolean m53990o3(RedPacketSendActivity redPacketSendActivity, CharSequence it) {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        Intrinsics.checkNotNullParameter(it, "it");
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        return C27025c.m66566d((c45316bM54038T2 == null || (textInputWithTitleView = c45316bM54038T2.f101884d) == null || (editText = textInputWithTitleView.getEditText()) == null) ? null : Boolean.valueOf(editText.isFocused()));
    }

    /* JADX INFO: renamed from: p3 */
    public static final boolean m53994p3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m53998q3(final RedPacketSendActivity redPacketSendActivity, final CharSequence charSequence) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m54002r3(charSequence, redPacketSendActivity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m54002r3(CharSequence charSequence, RedPacketSendActivity redPacketSendActivity) {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText2;
        if (TextUtils.isEmpty(charSequence)) {
            C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T2 != null && (textInputWithTitleView2 = c45316bM54038T2.f101885e) != null && (editText2 = textInputWithTitleView2.getEditText()) != null) {
                editText2.setText("");
            }
        } else {
            C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T3 != null && (textInputWithTitleView = c45316bM54038T3.f101885e) != null && (editText = textInputWithTitleView.getEditText()) != null) {
                BigDecimal bigDecimalM54092d = StringsExtKt.m54092d(charSequence.toString(), null, 1, null);
                CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(C41014a.m89938l(bigDecimalM54092d, currenciesConfig != null ? currenciesConfig.getCurrencyCode() : null)));
                CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
                editText.setText(C41014a.m89946t(bigDecimal, null, C27039d.m66651k(currenciesConfig2 != null ? Integer.valueOf(currenciesConfig2.getPrecision()) : null, 8), false, false, false, false, false, null, 0, 509, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX INFO: renamed from: v3 */
    public static final Boolean m54018v3(final RedPacketSendActivity redPacketSendActivity, final CharSequence amount, CharSequence legalAmount, final CharSequence number, CharSequence nickName, CharSequence wishTips) {
        boolean z11;
        double dDoubleValue;
        double dM54094f;
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(legalAmount, "legalAmount");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(wishTips, "wishTips");
        boolean z12 = false;
        if (TextUtils.isEmpty(amount) || TextUtils.isEmpty(legalAmount) || TextUtils.isEmpty(number) || TextUtils.isEmpty(StringsKt.trim((CharSequence) nickName.toString()).toString())) {
            z11 = false;
        } else {
            if (TextUtils.isEmpty(wishTips.toString())) {
                C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
                if (TextUtils.isEmpty(String.valueOf((c45316bM54038T2 == null || (textInputWithTitleView = c45316bM54038T2.f101893m) == null || (editText = textInputWithTitleView.getEditText()) == null) ? null : editText.getHint()))) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        try {
            if (redPacketSendActivity.f43193y) {
                dDoubleValue = StringsExtKt.m54094f(amount.toString(), 0.0d, 1, null);
            } else {
                BigDecimal bigDecimalM54092d = StringsExtKt.m54092d(amount.toString(), null, 1, null);
                CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
                dDoubleValue = bigDecimalM54092d.setScale(C27039d.m66651k(currenciesConfig != null ? Integer.valueOf(currenciesConfig.getPrecision()) : null, 8), RoundingMode.DOWN).multiply(StringsExtKt.m54092d(number.toString(), null, 1, null)).doubleValue();
            }
        } catch (Exception unused) {
            dDoubleValue = 0.0d;
        }
        redPacketSendActivity.f43179B = dDoubleValue;
        try {
            dM54094f = StringsExtKt.m54094f(amount.toString(), 0.0d, 1, null);
        } catch (Exception unused2) {
            dM54094f = 0.0d;
        }
        redPacketSendActivity.f43182E = dM54094f;
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m54021w3(this.f43252b, amount, number);
            }
        });
        if (z11 && redPacketSendActivity.f43179B > 0.0d) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m54021w3(RedPacketSendActivity redPacketSendActivity, CharSequence charSequence, CharSequence charSequence2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 != null && (baseTextView2 = c45316bM54038T2.f101892l) != null) {
            C27096v0 c27096v0 = new C27096v0();
            double d11 = redPacketSendActivity.f43179B;
            CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
            C27096v0 c27096v0Append = c27096v0.append(C41014a.m89941o(d11, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig != null ? Integer.valueOf(currenciesConfig.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null)).append(C33627eb.f69716f);
            CurrenciesConfig currenciesConfig2 = redPacketSendActivity.f43178A;
            baseTextView2.setText(c27096v0Append.m66904d(C27041f.m66668h(currenciesConfig2 != null ? currenciesConfig2.getCurrencyName() : null), 14));
        }
        C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T3 != null && (baseTextView = c45316bM54038T3.f101889i) != null) {
            double d12 = redPacketSendActivity.f43179B;
            CurrenciesConfig currenciesConfig3 = redPacketSendActivity.f43178A;
            baseTextView.setText(C41014a.m89948v(C41014a.m89939m(d12, currenciesConfig3 != null ? currenciesConfig3.getCurrencyCode() : null), null, RoundingMode.UP, 0, false, true, false, 45, null));
        }
        Intrinsics.checkNotNull(charSequence);
        Intrinsics.checkNotNull(charSequence2);
        redPacketSendActivity.m54051w2(charSequence, charSequence2);
        redPacketSendActivity.m54032G3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m54024x3() {
        InterfaceC37767s.a.m85194c(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m54027y2(final RedPacketSendActivity redPacketSendActivity, final Function0 function0, final BaseViewHolder viewHolder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        final View view = viewHolder.getView(R$id.loadingView);
        final TextView textView = (TextView) viewHolder.getView(R$id.tv_pay_way);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.redpackage.ui.j2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m54030z2(dialog, redPacketSendActivity);
            }
        }, 1, null);
        final String string = redPacketSendActivity.getString(Intrinsics.areEqual("MAIN", redPacketSendActivity.f43194z) ? R$string.save_account : R$string.trade_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.k2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53851B2(viewHolder, redPacketSendActivity, string, textView);
            }
        });
        viewHolder.setGone(R$id.rl_paytype, true);
        View view2 = viewHolder.getView(R$id.tv_forget_pwd);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.redpackage.ui.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53855C2(dialog);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.redpackage.ui.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53858D2(dialog);
            }
        }, 1, null);
        final PassWordGridView passWordGridView = (PassWordGridView) viewHolder.getView(R$id.password_toggle_view);
        passWordGridView.postDelayed(new Runnable() { // from class: com.kubi.redpackage.ui.n2
            @Override // java.lang.Runnable
            public final void run() {
                RedPacketSendActivity.m53862E2(passWordGridView);
            }
        }, 100L);
        passWordGridView.setCompleteCallBack(new Consumer() { // from class: com.kubi.redpackage.ui.o2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53866F2(view, redPacketSendActivity, passWordGridView, dialog, function0, viewHolder, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Boolean m54028y3(Function5 function5, Object p11, Object p12, Object p13, Object p14, Object p15) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p13, "p2");
        Intrinsics.checkNotNullParameter(p14, "p3");
        Intrinsics.checkNotNullParameter(p15, "p4");
        return (Boolean) function5.invoke(p11, p12, p13, p14, p15);
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m54031z3(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C43852m.m96591c("B3redEnvelope", "onlyNewUsers", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public final void m54032G3() {
        TextInputWithTitleView textInputWithTitleView;
        String currencyMaxNum;
        String currencyMinNum;
        TextInputWithTitleView textInputWithTitleView2;
        TextInputWithTitleView textInputWithTitleView3;
        TextView titleView;
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53874H3(this.f43376b);
            }
        });
        C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 != null && (textInputWithTitleView3 = c45316bM54038T2.f101885e) != null && (titleView = textInputWithTitleView3.getTitleView()) != null) {
            C27046k.m66695j(titleView, C5275i0.m6236a(260.0f));
        }
        C45316b c45316bM54038T3 = m54038T2();
        Integer numValueOf = null;
        if (c45316bM54038T3 != null && (textInputWithTitleView2 = c45316bM54038T3.f101885e) != null) {
            CurrenciesConfig currenciesConfig = this.f43178A;
            textInputWithTitleView2.setUnit(C27041f.m66668h(currenciesConfig != null ? currenciesConfig.getCurrencyName() : null));
        }
        C45316b c45316bM54038T4 = m54038T2();
        if (c45316bM54038T4 == null || (textInputWithTitleView = c45316bM54038T4.f101888h) == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        CurrenciesConfig currenciesConfig2 = this.f43178A;
        sb2.append(C27039d.m66650j((currenciesConfig2 == null || (currencyMinNum = currenciesConfig2.getCurrencyMinNum()) == null) ? null : Integer.valueOf(Integer.parseInt(currencyMinNum))));
        sb2.append('-');
        CurrenciesConfig currenciesConfig3 = this.f43178A;
        if (currenciesConfig3 != null && (currencyMaxNum = currenciesConfig3.getCurrencyMaxNum()) != null) {
            numValueOf = Integer.valueOf(Integer.parseInt(currencyMaxNum));
        }
        sb2.append(C27039d.m66650j(numValueOf));
        textInputWithTitleView.setHint(sb2.toString());
    }

    /* JADX INFO: renamed from: L2 */
    public final void m54034L2() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bredpackage_dialog_choose_account, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.j3
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketSendActivity.m53890M2(this.f43275b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "showRedPackageTypeDialog");
    }

    /* JADX INFO: renamed from: M3 */
    public final void m54035M3(RedPackageResponse redPackageResponse) {
        BeepHelper.m23642f("beep_outcome", R$raw.asset_out);
        m54048e4(C27041f.m66668h(redPackageResponse.getWords()));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m54036N3() throws JSONException {
        if (!IUserService.a.get().d0().isWithDrawPassword()) {
            m54046d2();
            C46928a.m103398d(RedPkgCategory.SEND_NOT_PWD, false, null, null, 7, null);
            return;
        }
        RedPackageApi redPackageApiM54045c3 = m54045c3();
        CurrenciesConfig currenciesConfig = this.f43178A;
        String strM66668h = C27041f.m66668h(currenciesConfig != null ? currenciesConfig.getCurrencyCode() : null);
        double d11 = this.f43179B;
        CurrenciesConfig currenciesConfig2 = this.f43178A;
        Observable observableCompose = RedPackageApi.m53727f(redPackageApiM54045c3, "SEND_RED_ENVELOPS", "", strM66668h, C41014a.m89941o(d11, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig2 != null ? Integer.valueOf(currenciesConfig2.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null), null, 16, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53897O3(this.f43300b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.redpackage.ui.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53900P3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53904Q3(this.f43315b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53914T3(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.redpackage.ui.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53917U3(this.f43331b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.s1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53921V3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m54037S2() {
        return ((Boolean) this.f43185H.getValue()).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: T2 */
    public final C45316b m54038T2() {
        return (C45316b) this.f43190v.getValue(this, f43177N[0]);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m54041Y3(RedConfig redConfig) {
        String extendName;
        BaseTextView baseTextView;
        if (redConfig == null) {
            return;
        }
        WelfareExtend welfareExtend = redConfig.getWelfareExtend();
        String id2 = welfareExtend != null ? welfareExtend.getId() : null;
        if (id2 == null || id2.length() == 0) {
            return;
        }
        WelfareExtend welfareExtend2 = redConfig.getWelfareExtend();
        String id3 = welfareExtend2 != null ? welfareExtend2.getId() : null;
        WelfareExtend welfareExtend3 = redConfig.getWelfareExtend();
        if (welfareExtend3 == null || (extendName = welfareExtend3.getExtendName()) == null) {
            extendName = "";
        }
        this.f43183F = TuplesKt.m90091to(id3, extendName);
        C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 == null || (baseTextView = c45316bM54038T2.f101886f) == null) {
            return;
        }
        Pair<String, String> pair = this.f43183F;
        baseTextView.setText(pair != null ? pair.getSecond() : null);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bredpackage_activity_send_redpacket;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Z3 */
    public final void m54042Z3(CurrenciesConfig currenciesConfig) {
        final C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 == null) {
            return;
        }
        this.f43178A = currenciesConfig;
        if (C27025c.m66566d(currenciesConfig != null ? currenciesConfig.getSupportNewBee() : null)) {
            CheckBox cbNewBee = c45316bM54038T2.f101882b;
            Intrinsics.checkNotNullExpressionValue(cbNewBee, "cbNewBee");
            ViewExtKt.m66594y(cbNewBee);
            if (this.f43184G.compareAndSet(false, true) && m54037S2()) {
                c45316bM54038T2.f101882b.setChecked(true);
            }
        } else {
            CheckBox cbNewBee2 = c45316bM54038T2.f101882b;
            Intrinsics.checkNotNullExpressionValue(cbNewBee2, "cbNewBee");
            ViewExtKt.m66577h(cbNewBee2);
            c45316bM54038T2.f101882b.setChecked(false);
        }
        c45316bM54038T2.f101885e.setUnit(C27041f.m66668h(currenciesConfig != null ? currenciesConfig.getCurrencyName() : null));
        c45316bM54038T2.f101884d.setTitle("   " + C41016c.m89966d());
        c45316bM54038T2.f101884d.setUnit(C41016c.m89965c());
        c45316bM54038T2.f101885e.getEndView().setText(C27041f.m66668h(currenciesConfig != null ? currenciesConfig.getCurrencyName() : null));
        c45316bM54038T2.f101885e.getEndView().setTextColor(C27046k.m66699n(this, R$color.c_text));
        TextView endView = c45316bM54038T2.f101885e.getEndView();
        Intrinsics.checkNotNullExpressionValue(endView, "getEndView(...)");
        ViewExtKt.m66573d(endView, true);
        TextView endView2 = c45316bM54038T2.f101885e.getEndView();
        Intrinsics.checkNotNullExpressionValue(endView2, "getEndView(...)");
        C27046k.m66694i(endView2, R$mipmap.ic_drop_triangle, 0, 0, 6, null);
        c45316bM54038T2.f101885e.getEditText().setText("");
        c45316bM54038T2.f101884d.getEditText().setText("");
        c45316bM54038T2.f101888h.getEditText().setText("");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53938a4(c45316bM54038T2, this);
            }
        });
        BaseTextView baseTextView = c45316bM54038T2.f101889i;
        double d11 = this.f43179B;
        CurrenciesConfig currenciesConfig2 = this.f43178A;
        baseTextView.setText(C41014a.m89948v(C41014a.m89939m(d11, currenciesConfig2 != null ? currenciesConfig2.getCurrencyCode() : null), null, RoundingMode.UP, 2, false, true, false, 41, null));
        c45316bM54038T2.f101885e.getEditText().setFilters(new InputFilter[]{new C27056j0(C27039d.m66651k(currenciesConfig != null ? Integer.valueOf(currenciesConfig.getPrecision()) : null, 8))});
        c45316bM54038T2.f101884d.getEditText().setFilters(new InputFilter[]{new C27056j0(2)});
        m54032G3();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX INFO: renamed from: b3 */
    public final CurrenciesConfig m54043b3(RedConfig redConfig) {
        ArrayList<CurrenciesConfig> currenciesConfigs;
        Object next;
        CurrenciesConfig currenciesConfig;
        String currencyCode;
        CurrenciesConfig currenciesConfig2;
        ArrayList<CurrenciesConfig> currenciesConfigs2;
        ArrayList<CurrenciesConfig> currenciesConfigs3;
        ArrayList<CurrenciesConfig> currenciesConfigs4;
        Object next2;
        CurrenciesConfig currenciesConfigMo100782b;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45656a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (currenciesConfigMo100782b = ((InterfaceC45656a) objM56186h).mo100782b(redConfig, this.f43178A)) != null) {
            return currenciesConfigMo100782b;
        }
        Object obj = null;
        if (this.f43178A == null) {
            if (redConfig == null || (currenciesConfigs4 = redConfig.getCurrenciesConfigs()) == null) {
                currenciesConfig = null;
            } else {
                Iterator<T> it = currenciesConfigs4.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.areEqual(((CurrenciesConfig) next2).getCurrencyCode(), C46392a.m102326h(C46929b.m103399a(), "")));
                currenciesConfig = (CurrenciesConfig) next2;
            }
        } else if (redConfig == null || (currenciesConfigs = redConfig.getCurrenciesConfigs()) == null) {
            currenciesConfig = null;
        } else {
            Iterator<T> it2 = currenciesConfigs.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                currencyCode = ((CurrenciesConfig) next).getCurrencyCode();
                currenciesConfig2 = this.f43178A;
            } while (!Intrinsics.areEqual(currencyCode, currenciesConfig2 != null ? currenciesConfig2.getCurrencyCode() : null));
            currenciesConfig = (CurrenciesConfig) next;
        }
        if (currenciesConfig == null) {
            currenciesConfig = (redConfig == null || (currenciesConfigs3 = redConfig.getCurrenciesConfigs()) == null) ? null : currenciesConfigs3.get(0);
        }
        if ((currenciesConfig != null ? currenciesConfig.getTradeCurrencyBalance() : null) != null && currenciesConfig.getTradeCurrencyBalance().doubleValue() != 0.0d) {
            return currenciesConfig;
        }
        if ((currenciesConfig != null ? currenciesConfig.getMainCurrencyBalance() : null) != null && currenciesConfig.getMainCurrencyBalance().doubleValue() != 0.0d) {
            return currenciesConfig;
        }
        if (redConfig == null || (currenciesConfigs2 = redConfig.getCurrenciesConfigs()) == null) {
            return null;
        }
        for (Object obj2 : currenciesConfigs2) {
            if (Intrinsics.areEqual(((CurrenciesConfig) obj2).getCurrencyCode(), "USDT")) {
                obj = obj2;
                break;
            }
        }
        return (CurrenciesConfig) obj;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m54044b4() {
        ArrayList<CurrenciesConfig> currenciesConfigs;
        RedConfig redConfig = this.f43193y ? this.f43180C : this.f43181D;
        ArrayList<CurrenciesConfig> currenciesConfigs2 = redConfig != null ? redConfig.getCurrenciesConfigs() : null;
        if (currenciesConfigs2 == null || currenciesConfigs2.isEmpty()) {
            return;
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC45656a.class, SiteInfoManager.f47913a.m58109c());
        boolean zMo100781a = objM56186h != null ? ((InterfaceC45656a) objM56186h).mo100781a() : false;
        if (redConfig != null && (currenciesConfigs = redConfig.getCurrenciesConfigs()) != null) {
            this.f43187J.m53768q3(C46928a.m103395a(currenciesConfigs, zMo100781a, Boolean.TRUE), this.f43178A);
            this.f43188K.m53768q3(C46928a.m103395a(currenciesConfigs, zMo100781a, Boolean.FALSE), this.f43178A);
        }
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bredpackage_dialog_choose_red_coin, true).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.w1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketSendActivity.m53943c4(this.f43358b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "chooseRedCoin");
    }

    /* JADX INFO: renamed from: c3 */
    public final RedPackageApi m54045c3() {
        Object value = this.f43192x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RedPackageApi) value;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m54046d2() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.rule_limit).m54153J4(R$string.open_trade_pwd_to_safe).m54148E4(R$layout.bredpackage_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.redpackage.ui.x1
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                RedPacketSendActivity.m53947e2(baseViewHolder, dialogFragmentHelper);
            }
        }).m54159P4(R$string.cancel, null).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: com.kubi.redpackage.ui.y1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                RedPacketSendActivity.m53950f2(dialogInterface, i11);
            }
        }).m54172c5(getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: d3 */
    public final ArrayList<CharSequence> m54047d3() {
        return (ArrayList) this.f43186I.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m54048e4(String str) {
        this.f43189L = str;
        C27057k.m66746b(str);
        ToastCompat.m66441G(getString(R$string.pwd_copied_clipboard), new Object[0]);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bredpackage_dialog_redpacket_copy, 7, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.p2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketSendActivity.m53952f4(this.f43316b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.setCancelable(false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "showRedPackage");
    }

    @Override // com.kubi.sdk.BaseActivity, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF43191w() {
        return this.f43191w;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m54049h2() {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        CheckBox checkBox;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText2;
        TextInputWithTitleView textInputWithTitleView3;
        FilterEmojiEditText editText3;
        C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 == null || (textInputWithTitleView = c45316bM54038T2.f101893m) == null || (editText = textInputWithTitleView.getEditText()) == null) {
            return;
        }
        RedPackageApi redPackageApiM54045c3 = m54045c3();
        String str = this.f43194z;
        String strValueOf = String.valueOf(!TextUtils.isEmpty(String.valueOf(editText.getText())) ? editText.getText() : editText.getHint());
        CurrenciesConfig currenciesConfig = this.f43178A;
        String strM66668h = C27041f.m66668h(currenciesConfig != null ? currenciesConfig.getCurrencyCode() : null);
        C45316b c45316bM54038T3 = m54038T2();
        String string = StringsKt.trim((CharSequence) String.valueOf((c45316bM54038T3 == null || (textInputWithTitleView3 = c45316bM54038T3.f101887g) == null || (editText3 = textInputWithTitleView3.getEditText()) == null) ? null : editText3.getText())).toString();
        double d11 = this.f43179B;
        CurrenciesConfig currenciesConfig2 = this.f43178A;
        String strM89941o = C41014a.m89941o(d11, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : null, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : C27039d.m66651k(currenciesConfig2 != null ? Integer.valueOf(currenciesConfig2.getPrecision()) : null, 8), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null);
        C45316b c45316bM54038T4 = m54038T2();
        String strValueOf2 = String.valueOf((c45316bM54038T4 == null || (textInputWithTitleView2 = c45316bM54038T4.f101888h) == null || (editText2 = textInputWithTitleView2.getEditText()) == null) ? null : editText2.getText());
        C45316b c45316bM54038T5 = m54038T2();
        boolean zM66566d = C27025c.m66566d((c45316bM54038T5 == null || (checkBox = c45316bM54038T5.f101882b) == null) ? null : Boolean.valueOf(checkBox.isChecked()));
        int i11 = !this.f43193y ? 1 : 0;
        Pair<String, String> pair = this.f43183F;
        Observable<R> observableCompose = redPackageApiM54045c3.m53731c(str, strValueOf, strM66668h, string, strM89941o, strValueOf2, zM66566d, i11, pair != null ? pair.getFirst() : null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.a2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53961i2(this.f43208b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.redpackage.ui.b2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53965j2(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53970k2(this.f43227b, (RedPackageResponse) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.d2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53975l2(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.redpackage.ui.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53980m2(this.f43240b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.f2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53985n2(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: o2 */
    public final boolean m54050o2(final Throwable th2) {
        final String resourceId;
        if (!(th2 instanceof ApiException)) {
            return false;
        }
        ApiException apiException = (ApiException) th2;
        if (!Intrinsics.areEqual(apiException.code, "285034")) {
            return false;
        }
        Object obj = apiException.data;
        RedPackageResponse redPackageResponse = obj instanceof RedPackageResponse ? (RedPackageResponse) obj : null;
        if (redPackageResponse == null || (resourceId = redPackageResponse.getResourceId()) == null) {
            return false;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.q2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedPacketSendActivity.m53993p2(this.f43323b, resourceId, th2);
            }
        });
        return true;
    }

    @Override // com.kubi.sdk.BaseActivity
    public void setPageId(@Nullable String str) {
        this.f43191w = str;
    }

    /* JADX INFO: renamed from: x2 */
    public final void m54052x2(final Function0<Unit> function0) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bredpackage_dialog_check_withdraw, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.redpackage.ui.h2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketSendActivity.m54027y2(this.f43262b, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "showPassword");
    }

    public RedPacketSendActivity() {
        ListRedCoinFragment listRedCoinFragment = new ListRedCoinFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isTrade", false);
        listRedCoinFragment.setArguments(bundle);
        listRedCoinFragment.m53767p3(new Consumer() { // from class: com.kubi.redpackage.ui.k1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53882J3(this.f43281b, (CurrenciesConfig) obj);
            }
        });
        this.f43187J = listRedCoinFragment;
        ListRedCoinFragment listRedCoinFragment2 = new ListRedCoinFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("isTrade", true);
        listRedCoinFragment2.setArguments(bundle2);
        listRedCoinFragment2.m53767p3(new Consumer() { // from class: com.kubi.redpackage.ui.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53987n4(this.f43351b, (CurrenciesConfig) obj);
            }
        });
        this.f43188K = listRedCoinFragment2;
        this.f43189L = "";
    }

    /* JADX INFO: renamed from: A2 */
    public static final void m53847A2(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.m54034L2();
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m53848A3(RedPacketSendActivity redPacketSendActivity, View view) {
        redPacketSendActivity.preformBackPressed();
    }

    /* JADX INFO: renamed from: C2 */
    public static final Unit m53855C2(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        IUserService.a.get().B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m53856C3(RedPacketSendActivity redPacketSendActivity) {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        Editable text;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText2;
        TextInputWithTitleView textInputWithTitleView3;
        FilterEmojiEditText editText3;
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 != null && (textInputWithTitleView = c45316bM54038T2.f101885e) != null && (editText = textInputWithTitleView.getEditText()) != null && (text = editText.getText()) != null) {
            if (TextUtils.isEmpty(text)) {
                return Unit.INSTANCE;
            }
            C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T3 != null && (textInputWithTitleView3 = c45316bM54038T3.f101885e) != null && (editText3 = textInputWithTitleView3.getEditText()) != null) {
                editText3.setText(text);
            }
            C45316b c45316bM54038T4 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T4 != null && (textInputWithTitleView2 = c45316bM54038T4.f101885e) != null && (editText2 = textInputWithTitleView2.getEditText()) != null) {
                editText2.setSelection(text.length());
            }
            redPacketSendActivity.m54032G3();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D2 */
    public static final Unit m53858D2(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m53859D3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m53863E3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m53867F3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G2 */
    public static final Unit m53870G2(View view, PassWordGridView passWordGridView, DialogFragmentHelper dialogFragmentHelper, Function0 function0, ArrayList arrayList) throws JSONException {
        ViewExtKt.m66577h(view);
        passWordGridView.m54712c();
        dialogFragmentHelper.dismiss();
        KeyboardUtils.m6034f(passWordGridView.getChildAt(0));
        function0.invoke();
        C46928a.m103398d(RedPkgCategory.SEND_PWD_CHECK, true, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H2 */
    public static final void m53873H2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m53874H3(RedPacketSendActivity redPacketSendActivity) {
        TextInputWithTitleView textInputWithTitleView;
        String string;
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 != null && (textInputWithTitleView = c45316bM54038T2.f101885e) != null) {
            C27096v0 c27096v0 = new C27096v0();
            if (!redPacketSendActivity.f43193y) {
                string = redPacketSendActivity.getString(R$string.single_amount);
            } else {
                string = redPacketSendActivity.getString(R$string.total_amount);
            }
            C27096v0 c27096v0Append = c27096v0.append(string);
            if (redPacketSendActivity.f43193y) {
                c27096v0Append.append("  ");
                String string2 = redPacketSendActivity.getString(R$string.random);
                C27017c c27017c = C27017c.f54310a;
                c27096v0Append.m66903c(string2, new BackgroundSpan(C27017c.m66510d(c27017c, R$drawable.shape_complementary_2r, null, 2, null), c27017c.m66512a(R$color.c_white), C27029c.m66599b(redPacketSendActivity, 1), 0.9f));
            }
            textInputWithTitleView.setTitle(c27096v0Append);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final RedPackageApi m53878I3() {
        return (RedPackageApi) C42597a.m93386b().create(RedPackageApi.class);
    }

    /* JADX INFO: renamed from: J2 */
    public static final void m53881J2(RedPacketSendActivity redPacketSendActivity, DialogInterface dialogInterface, int i11) {
        redPacketSendActivity.m54034L2();
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m53882J3(RedPacketSendActivity redPacketSendActivity, CurrenciesConfig currenciesConfig) {
        DialogFragment dialogFragment;
        String currencyCode = currenciesConfig.getCurrencyCode();
        if (currencyCode != null) {
            C46392a.m102333p(C46929b.m103399a(), currencyCode);
        }
        redPacketSendActivity.f43194z = "MAIN";
        redPacketSendActivity.m54042Z3(currenciesConfig);
        Fragment fragmentFindFragmentByTag = redPacketSendActivity.getSupportFragmentManager().findFragmentByTag("chooseRedCoin");
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static final void m53885K2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N2 */
    public static final Unit m53893N2(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O2 */
    public static final Unit m53896O2(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m53897O3(RedPacketSendActivity redPacketSendActivity, Disposable disposable) {
        redPacketSendActivity.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m53900P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m53908R3(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.m54049h2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m53911S3(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.m54049h2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m53914T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m53921V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X2 */
    public static final Unit m53927X2(RedPacketSendActivity redPacketSendActivity, Boolean bool) {
        redPacketSendActivity.showContentView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m53928X3(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.m54044b4();
        C43852m.m96591c("B3redEnvelope", "choseCoin", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final void m53931Y2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z2 */
    public static final Unit m53934Z2(RedPacketSendActivity redPacketSendActivity, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        redPacketSendActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a3 */
    public static final void m53937a3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m53945d4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g2 */
    public static final boolean m53954g2(RedPacketSendActivity redPacketSendActivity) {
        Intent intent = redPacketSendActivity.getIntent();
        if (intent == null) {
            return false;
        }
        return RouteExKt.m56248g(intent, "checkedForNew", false);
    }

    /* JADX INFO: renamed from: g3 */
    public static final Unit m53955g3(RedPacketSendActivity redPacketSendActivity) {
        redPacketSendActivity.m54033K3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m53956g4(DialogFragmentHelper dialogFragmentHelper, RedPacketSendActivity redPacketSendActivity) {
        dialogFragmentHelper.dismiss();
        redPacketSendActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m53961i2(RedPacketSendActivity redPacketSendActivity, Disposable disposable) {
        redPacketSendActivity.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j2 */
    public static final void m53965j2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k3 */
    public static final Unit m53971k3(CharSequence charSequence, RedPacketSendActivity redPacketSendActivity) {
        TextInputWithTitleView textInputWithTitleView;
        FilterEmojiEditText editText;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText2;
        if (TextUtils.isEmpty(charSequence)) {
            C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T2 != null && (textInputWithTitleView2 = c45316bM54038T2.f101884d) != null && (editText2 = textInputWithTitleView2.getEditText()) != null) {
                editText2.setText("");
            }
        } else {
            C45316b c45316bM54038T3 = redPacketSendActivity.m54038T2();
            if (c45316bM54038T3 != null && (textInputWithTitleView = c45316bM54038T3.f101884d) != null && (editText = textInputWithTitleView.getEditText()) != null) {
                String currencyCode = null;
                double dM54094f = StringsExtKt.m54094f(charSequence.toString(), 0.0d, 1, null);
                CurrenciesConfig currenciesConfig = redPacketSendActivity.f43178A;
                if (currenciesConfig != null) {
                    currencyCode = currenciesConfig.getCurrencyCode();
                }
                editText.setText(C41014a.m89941o(C41014a.m89939m(dM54094f, currencyCode), (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 1) != 0 ? RoundingMode.DOWN : RoundingMode.UP, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 2) != 0 ? 2 : 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 4) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 8) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 16) != 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 32) == 0 ? false : false, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 64) != 0, (ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR & 128) != 0 ? "0.00" : null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m53975l2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static final void m53976l3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m53980m2(RedPacketSendActivity redPacketSendActivity, Throwable th2) throws JSONException {
        ApiException apiException;
        Intrinsics.checkNotNull(th2);
        String str = null;
        if (!redPacketSendActivity.m54050o2(th2)) {
            C19331c.m42836c(th2, null, 2, null);
        }
        BaseActivity.hideLoadingDialog$default(redPacketSendActivity, false, 1, null);
        RedPkgCategory redPkgCategory = RedPkgCategory.SEND_RESULT;
        String strM66669i = C27041f.m66669i(th2.getMessage(), "--");
        if (th2 instanceof ApiException) {
            apiException = (ApiException) th2;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str = apiException.code;
        }
        C46928a.m103398d(redPkgCategory, false, strM66669i, C27041f.m66669i(str, "--"), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m53981m3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n2 */
    public static final void m53985n2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m53986n3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m53987n4(RedPacketSendActivity redPacketSendActivity, CurrenciesConfig currenciesConfig) {
        DialogFragment dialogFragment;
        String currencyCode = currenciesConfig.getCurrencyCode();
        if (currencyCode != null) {
            C46392a.m102333p(C46929b.m103399a(), currencyCode);
        }
        redPacketSendActivity.f43194z = "TRADE";
        redPacketSendActivity.m54042Z3(currenciesConfig);
        Fragment fragmentFindFragmentByTag = redPacketSendActivity.getSupportFragmentManager().findFragmentByTag("chooseRedCoin");
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static final Unit m53993p2(final RedPacketSendActivity redPacketSendActivity, final String str, final Throwable th2) {
        Observable<R> observableCompose = redPacketSendActivity.m54045c3().m53742r(str).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.x2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53997q2(this.f43362b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.redpackage.ui.y2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m54001r2(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m54005s2(this.f43377b, str, th2, (Map) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.a3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m54009t2(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.redpackage.ui.b3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m54013u2(this.f43219b, th2, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.d3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m54017v2(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, redPacketSendActivity.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q2 */
    public static final Unit m53997q2(RedPacketSendActivity redPacketSendActivity, Disposable disposable) {
        redPacketSendActivity.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r2 */
    public static final void m54001r2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m54006s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t2 */
    public static final void m54009t2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m54010t3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m54014u3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v2 */
    public static final void m54017v2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z2 */
    public static final Unit m54030z2(DialogFragmentHelper dialogFragmentHelper, final RedPacketSendActivity redPacketSendActivity) {
        ScrollView root;
        dialogFragmentHelper.dismiss();
        C45316b c45316bM54038T2 = redPacketSendActivity.m54038T2();
        if (c45316bM54038T2 != null && (root = c45316bM54038T2.getRoot()) != null) {
            root.postDelayed(new Runnable() { // from class: com.kubi.redpackage.ui.i3
                @Override // java.lang.Runnable
                public final void run() {
                    RedPacketSendActivity.m53847A2(this.f43270b);
                }
            }, 200L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m54033K3() {
        String hint;
        String first;
        C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 == null) {
            return;
        }
        String strM = HostManager.a.m();
        String content = c45316bM54038T2.f101893m.getContent();
        if (content != null && content.length() != 0) {
            hint = c45316bM54038T2.f101893m.getContent();
        } else {
            hint = c45316bM54038T2.f101893m.getHint();
        }
        Uri.Builder builderBuildUpon = Uri.parse(strM).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("redpacket-cover").appendQueryParameter("appNeedLang", CredentialEntry.TRUE_STRING).appendQueryParameter(FirebaseAnalytics.Param.CURRENCY, c45316bM54038T2.f101885e.getEndView().getText().toString()).appendQueryParameter("nickname", c45316bM54038T2.f101887g.getContent().toString());
        Pair<String, String> pair = this.f43183F;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        builderAppendQueryParameter.appendQueryParameter("cover", first).appendQueryParameter("blessing", hint);
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C44128b.m97266j("RedPacket", "selectCover-url: " + string);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, string, getString(R$string.redpackage_cover_title), null, null, null, null, new InterfaceC36555b() { // from class: com.kubi.redpackage.ui.l1
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                RedPacketSendActivity.m53888L3(this.f43288a, i11, intent);
            }
        }, 60, null);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m54039U2() {
        showLoadingView();
        Observable observableCompose = RedPackageApi.m53725b(m54045c3(), 0, 1, null).compose(C24217a1.m58389m());
        ObservableSource observableSourceCompose = m54045c3().m53733g(1).compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: com.kubi.redpackage.ui.y0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RedPacketSendActivity.m53920V2(this.f43369b, (RedConfig) obj, (RedConfig) obj2);
            }
        };
        Observable observableZip = Observable.zip(observableCompose, observableSourceCompose, new BiFunction() { // from class: com.kubi.redpackage.ui.a1
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return RedPacketSendActivity.m53924W2(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53927X2(this.f43217b, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53931Y2(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.redpackage.ui.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53934Z2(this.f43233b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableZip.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53937a3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: W3 */
    public final void m54040W3(RedConfig redConfig) {
        TextInputWithTitleView textInputWithTitleView;
        TextView endView;
        TextInputWithTitleView textInputWithTitleView2;
        FilterEmojiEditText editText;
        String bestWishes;
        CommonConfigs commonConfigs;
        m54042Z3(m54043b3(redConfig));
        C45316b c45316bM54038T2 = m54038T2();
        if (c45316bM54038T2 != null && (textInputWithTitleView2 = c45316bM54038T2.f101893m) != null && (editText = textInputWithTitleView2.getEditText()) != null) {
            editText.setShowToast(false);
            if (redConfig != null && (commonConfigs = redConfig.getCommonConfigs()) != null) {
                bestWishes = commonConfigs.getBestWishes();
            } else {
                bestWishes = null;
            }
            editText.setHint(StringsExtKt.m54090b(bestWishes, 0, 1, null));
            editText.setShowToast(true);
        }
        C45316b c45316bM54038T3 = m54038T2();
        if (c45316bM54038T3 != null && (textInputWithTitleView = c45316bM54038T3.f101885e) != null && (endView = textInputWithTitleView.getEndView()) != null) {
            C27046k.m66711z(endView, 0L, new Function0() { // from class: com.kubi.redpackage.ui.j1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketSendActivity.m53928X3(this.f43272b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        TextInputWithTitleView textInputWithTitleView;
        TextInputWithTitleView textInputWithTitleView2;
        TextInputWithTitleView textInputWithTitleView3;
        C45316b c45316bM54038T2;
        TextInputWithTitleView textInputWithTitleView4;
        C45316b c45316bM54038T3;
        TextInputWithTitleView textInputWithTitleView5;
        CheckBox checkBox;
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        TextInputWithTitleView textInputWithTitleView6;
        FilterEmojiEditText editText;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Button button;
        TextInputWithTitleView textInputWithTitleView7;
        FilterEmojiEditText editText2;
        TextInputWithTitleView textInputWithTitleView8;
        TextInputWithTitleView textInputWithTitleView9;
        TextView errorTv;
        TextInputWithTitleView textInputWithTitleView10;
        FilterEmojiEditText editText3;
        TextInputWithTitleView textInputWithTitleView11;
        FilterEmojiEditText editText4;
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra(BaseActivity.STATUS_BAR, CredentialEntry.TRUE_STRING);
        }
        super.onCreate(savedInstanceState);
        IUserService.Companion companion = IUserService.a;
        String second = null;
        if (!companion.get().c()) {
            IUserService.O(companion.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.redpackage.ui.g2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketSendActivity.m54024x3();
                }
            }), 1, (Object) null);
            finish();
            return;
        }
        setContentView(R$layout.bredpackage_activity_send_redpacket);
        this.f43183F = TuplesKt.m90091to(null, getString(R$string.default_escape));
        int iM66699n = C27046k.m66699n(this, R$color.c_background);
        EdgeToEdgeCompat.f48106a.m58267e(this, iM66699n);
        this.f46503o.setBackgroundColor(iM66699n);
        this.f46503o.setMainTitle(getString(R$string.red_package));
        this.f46503o.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.redpackage.ui.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedPacketSendActivity.m53848A3(this.f43280b, view);
            }
        });
        this.f46503o.getTvNavigationTitle().setTextColor(m56586Y(R$color.c_text));
        this.f46503o.getLeftIcon().getDrawable().setColorFilter(m56586Y(R$color.emphasis), PorterDuff.Mode.SRC_ATOP);
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53852B3(this.f43321b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.redpackage.ui.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53859D3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedPacketSendActivity.m53863E3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedPacketSendActivity.m53867F3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        C45316b c45316bM54038T4 = m54038T2();
        if (c45316bM54038T4 != null && (textInputWithTitleView11 = c45316bM54038T4.f101885e) != null && (editText4 = textInputWithTitleView11.getEditText()) != null) {
            editText4.setInputType(8194);
        }
        C45316b c45316bM54038T5 = m54038T2();
        if (c45316bM54038T5 != null && (textInputWithTitleView10 = c45316bM54038T5.f101884d) != null && (editText3 = textInputWithTitleView10.getEditText()) != null) {
            editText3.setInputType(8194);
        }
        C45316b c45316bM54038T6 = m54038T2();
        if (c45316bM54038T6 != null && (textInputWithTitleView9 = c45316bM54038T6.f101884d) != null && (errorTv = textInputWithTitleView9.getErrorTv()) != null) {
            ViewExtKt.m66577h(errorTv);
        }
        C45316b c45316bM54038T7 = m54038T2();
        if (c45316bM54038T7 != null && (textInputWithTitleView8 = c45316bM54038T7.f101888h) != null) {
            textInputWithTitleView8.setUnit(getString(R$string.widget_count, ""));
        }
        C45316b c45316bM54038T8 = m54038T2();
        if (c45316bM54038T8 != null && (textInputWithTitleView7 = c45316bM54038T8.f101888h) != null && (editText2 = textInputWithTitleView7.getEditText()) != null) {
            editText2.setInputType(2);
        }
        C45316b c45316bM54038T9 = m54038T2();
        if (c45316bM54038T9 != null && (button = c45316bM54038T9.f101890j) != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.redpackage.ui.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketSendActivity.m53948e3(this.f43345b);
                }
            }, 1, null);
        }
        C45316b c45316bM54038T10 = m54038T2();
        if (c45316bM54038T10 != null && (baseTextView3 = c45316bM54038T10.f101891k) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.redpackage.ui.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketSendActivity.m53951f3(this.f43350b);
                }
            }, 1, null);
        }
        C45316b c45316bM54038T11 = m54038T2();
        if (c45316bM54038T11 != null && (baseTextView2 = c45316bM54038T11.f101891k) != null) {
            baseTextView2.performClick();
        }
        C45316b c45316bM54038T12 = m54038T2();
        if (c45316bM54038T12 != null && (textInputWithTitleView6 = c45316bM54038T12.f101887g) != null && (editText = textInputWithTitleView6.getEditText()) != null) {
            editText.setShowToast(false);
            editText.setText(StringsExtKt.m54089a(RedPackageHelperKt.m53715d(), 24));
            editText.setShowToast(true);
        }
        C45316b c45316bM54038T13 = m54038T2();
        if (c45316bM54038T13 != null && (linearLayout = c45316bM54038T13.f101883c) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.redpackage.ui.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RedPacketSendActivity.m53955g3(this.f43357b);
                }
            }, 1, null);
        }
        C45316b c45316bM54038T14 = m54038T2();
        if (c45316bM54038T14 != null && (baseTextView = c45316bM54038T14.f101886f) != null) {
            Pair<String, String> pair = this.f43183F;
            if (pair != null) {
                second = pair.getSecond();
            }
            baseTextView.setText(second);
        }
        C45316b c45316bM54038T15 = m54038T2();
        if (c45316bM54038T15 != null && (textInputWithTitleView = c45316bM54038T15.f101885e) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(textInputWithTitleView.getEditText());
            final Function1 function3 = new Function1() { // from class: com.kubi.redpackage.ui.x0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(RedPacketSendActivity.m53958h3(this.f43361b, (CharSequence) obj));
                }
            };
            Observable<CharSequence> observableFilter = abstractC46099aM784d.filter(new Predicate() { // from class: com.kubi.redpackage.ui.r2
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return RedPacketSendActivity.m53962i3(function3, obj);
                }
            });
            final Function1 function4 = new Function1() { // from class: com.kubi.redpackage.ui.c3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RedPacketSendActivity.m53966j3(this.f43228b, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer2 = new Consumer() { // from class: com.kubi.redpackage.ui.n3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RedPacketSendActivity.m53976l3(function4, obj);
                }
            };
            final Function1 function5 = new Function1() { // from class: com.kubi.redpackage.ui.r3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RedPacketSendActivity.m53981m3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe2 = observableFilter.subscribe(consumer2, new Consumer() { // from class: com.kubi.redpackage.ui.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RedPacketSendActivity.m53986n3(function5, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
            C45316b c45316bM54038T16 = m54038T2();
            if (c45316bM54038T16 != null && (textInputWithTitleView2 = c45316bM54038T16.f101884d) != null) {
                AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(textInputWithTitleView2.getEditText());
                final Function1 function6 = new Function1() { // from class: com.kubi.redpackage.ui.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(RedPacketSendActivity.m53990o3(this.f43245b, (CharSequence) obj));
                    }
                };
                Observable<CharSequence> observableFilter2 = abstractC46099aM784d2.filter(new Predicate() { // from class: com.kubi.redpackage.ui.g0
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj) {
                        return RedPacketSendActivity.m53994p3(function6, obj);
                    }
                });
                final Function1 function7 = new Function1() { // from class: com.kubi.redpackage.ui.h0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RedPacketSendActivity.m53998q3(this.f43260b, (CharSequence) obj);
                    }
                };
                Consumer<? super CharSequence> consumer3 = new Consumer() { // from class: com.kubi.redpackage.ui.i0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        RedPacketSendActivity.m54006s3(function7, obj);
                    }
                };
                final Function1 function8 = new Function1() { // from class: com.kubi.redpackage.ui.j0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RedPacketSendActivity.m54010t3((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe3 = observableFilter2.subscribe(consumer3, new Consumer() { // from class: com.kubi.redpackage.ui.l0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        RedPacketSendActivity.m54014u3(function8, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe3, getDestroyDisposable());
                C45316b c45316bM54038T17 = m54038T2();
                if (c45316bM54038T17 != null && (textInputWithTitleView3 = c45316bM54038T17.f101888h) != null && (c45316bM54038T2 = m54038T2()) != null && (textInputWithTitleView4 = c45316bM54038T2.f101887g) != null && (c45316bM54038T3 = m54038T2()) != null && (textInputWithTitleView5 = c45316bM54038T3.f101893m) != null) {
                    AbstractC46099a<CharSequence> abstractC46099aM784d3 = C0206f.m784d(textInputWithTitleView.getEditText());
                    AbstractC46099a<CharSequence> abstractC46099aM784d4 = C0206f.m784d(textInputWithTitleView2.getEditText());
                    AbstractC46099a<CharSequence> abstractC46099aM784d5 = C0206f.m784d(textInputWithTitleView3.getEditText());
                    AbstractC46099a<CharSequence> abstractC46099aM784d6 = C0206f.m784d(textInputWithTitleView4.getEditText());
                    AbstractC46099a<CharSequence> abstractC46099aM784d7 = C0206f.m784d(textInputWithTitleView5.getEditText());
                    final Function5 function9 = new Function5() { // from class: com.kubi.redpackage.ui.m0
                        @Override // p852kotlin.jvm.functions.Function5
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            return RedPacketSendActivity.m54018v3(this.f43293b, (CharSequence) obj, (CharSequence) obj2, (CharSequence) obj3, (CharSequence) obj4, (CharSequence) obj5);
                        }
                    };
                    Observable.combineLatest(abstractC46099aM784d3, abstractC46099aM784d4, abstractC46099aM784d5, abstractC46099aM784d6, abstractC46099aM784d7, new io.reactivex.functions.Function5() { // from class: com.kubi.redpackage.ui.n0
                        @Override // io.reactivex.functions.Function5
                        public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            return RedPacketSendActivity.m54028y3(function9, obj, obj2, obj3, obj4, obj5);
                        }
                    }).subscribe(new C22734a());
                    C45316b c45316bM54038T18 = m54038T2();
                    if (c45316bM54038T18 != null && (checkBox = c45316bM54038T18.f101882b) != null) {
                        C27046k.m66708w(checkBox, new Function2() { // from class: com.kubi.redpackage.ui.p0
                            @Override // p852kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RedPacketSendActivity.m54031z3((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                    m54039U2();
                }
            }
        }
    }
}
