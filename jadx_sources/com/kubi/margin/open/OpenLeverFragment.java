package com.kubi.margin.open;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.entity.LeverOpen;
import com.kubi.margin.entity.OpenLeverExam;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37052c;
import f00.C37304a;
import f30.C37330a;
import g00.InterfaceC37766r;
import gp.InterfaceC37977a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36910e0;
import p569qq.C43852m;
import p698vp.C45618h;
import p768xo.InterfaceC46305f;
import p768xo.InterfaceC46306g;
import p830zf.InterfaceC46815o0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import t30.C44683c;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: OpenLeverFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0014J\u001a\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u000206H\u0002J\b\u0010<\u001a\u000206H\u0016J\b\u0010=\u001a\u000206H\u0016J\"\u0010>\u001a\u0002062\u0006\u0010?\u001a\u0002022\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u000206H\u0002J\u0006\u0010D\u001a\u000206J\b\u0010E\u001a\u000206H\u0002J\b\u0010F\u001a\u000206H\u0002J\b\u0010G\u001a\u00020\u001fH\u0002R#\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0015R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001e\u0010 R\u001b\u0010\"\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b\"\u0010 R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b$\u0010 R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b(\u0010)R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, m90084d2 = {"Lcom/kubi/margin/open/OpenLeverFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "mBind", "Lcom/kubi/margin/databinding/BmarginFragmentOpenLeverBinding;", "getMBind$annotations", "getMBind", "()Lcom/kubi/margin/databinding/BmarginFragmentOpenLeverBinding;", "mBind$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/margin/api/MarginApi;", "api$delegate", "Lkotlin/Lazy;", "page", "", "getPage", "()Ljava/lang/String;", "page$delegate", "block", "getBlock", "block$delegate", FirebaseAnalytics.Param.LOCATION, "getLocation", "location$delegate", "leverUrl", "isEtf", "", "()Z", "isEtf$delegate", "isMarginExam", "isMarginExam$delegate", "isAuMarginExam", "isAuMarginExam$delegate", "adapter", "Lcom/kubi/margin/open/OpenLeverExamAdapter;", "getAdapter", "()Lcom/kubi/margin/open/OpenLeverExamAdapter;", "adapter$delegate", "list", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/OpenLeverExam;", "Lkotlin/collections/ArrayList;", "wrapperLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLayout", "", "examErrorCooldownTime", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "jumpAgreementUrl", "showContent", "showLoading", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "fetchExam", "checkEnable", "handleExamError", "handleEuExamError", "isInExamErrorCooldown", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOpenLeverFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenLeverFragment.kt\ncom/kubi/margin/open/OpenLeverFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,344:1\n147#2,16:345\n17#3,2:361\n17#3,2:376\n17#3,2:378\n1#4:363\n1788#5,4:364\n1788#5,4:368\n1788#5,4:380\n84#6:372\n75#6,2:373\n84#6:375\n160#7,4:384\n*S KotlinDebug\n*F\n+ 1 OpenLeverFragment.kt\ncom/kubi/margin/open/OpenLeverFragment\n*L\n60#1:345,16\n109#1:361,2\n80#1:376,2\n83#1:378,2\n270#1:364,4\n271#1:368,4\n142#1:380,4\n315#1:372\n322#1:373,2\n340#1:375\n239#1:384,4\n*E\n"})
public final class OpenLeverFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f33599h0 = {Reflection.property1(new PropertyReference1Impl(OpenLeverFragment.class, "mBind", "getMBind()Lcom/kubi/margin/databinding/BmarginFragmentOpenLeverBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f33605Z;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public WrapperLoadingView f33611f0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33600U = C45681e.m100799e(this, new Function1<OpenLeverFragment, C36910e0>() { // from class: com.kubi.margin.open.OpenLeverFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36910e0 invoke(@NotNull OpenLeverFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36910e0.m82689a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36910e0, Unit>() { // from class: com.kubi.margin.open.OpenLeverFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36910e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36910e0 c36910e0) {
            invoke(c36910e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33601V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenLeverFragment.m39482X3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33602W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenLeverFragment.m39481W4(this.f33630b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33603X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenLeverFragment.m39483Y3(this.f33642b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33604Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenLeverFragment.m39445E4(this.f33622b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f33606a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OpenLeverFragment.m39506v4(this.f33623b));
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f33607b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OpenLeverFragment.m39510y4());
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33608c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OpenLeverFragment.m39503t4());
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f33609d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.open.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenLeverFragment.m39480W3(this.f33627b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final ArrayList<OpenLeverExam> f33610e0 = new ArrayList<>();

    /* JADX INFO: renamed from: g0 */
    public final long f33612g0 = 600000;

    /* JADX INFO: renamed from: com.kubi.margin.open.OpenLeverFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C18120a extends TypeToken<List<? extends OpenLeverExam>> {
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m39455J4(OpenLeverFragment openLeverFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m39463N4(OpenLeverFragment openLeverFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m39469Q4(OpenLeverFragment openLeverFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m39477U4(OpenLeverFragment openLeverFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m39441C4(Throwable th2) {
        C44128b.m97260d("获取信息失败：" + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m39453I4(OpenLeverFragment openLeverFragment, Object obj) {
        C42579a.f94275a.m93347g().g();
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        openLeverFragment.preformBackPressed();
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m39459L4(OpenLeverFragment openLeverFragment, LeverOpen leverOpen) {
        C42579a.f94275a.m93347g().Q();
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        openLeverFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m39467P4(OpenLeverFragment openLeverFragment, Object obj) {
        C42579a.f94275a.m93347g().g();
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        openLeverFragment.preformBackPressed();
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m39473S4(OpenLeverFragment openLeverFragment, LeverOpen leverOpen) {
        C42579a.f94275a.m93347g().Q();
        BaseFragment.hideLoadingDialog$default(openLeverFragment, false, 1, null);
        openLeverFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final OpenLeverExamAdapter m39480W3(OpenLeverFragment openLeverFragment) {
        return new OpenLeverExamAdapter(openLeverFragment, openLeverFragment.m39525x4());
    }

    /* JADX INFO: renamed from: b4 */
    public static final List m39484b4(String it) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(it, "it");
        String strM66668h = C27041f.m66668h(it);
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C18120a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        return (List) objM66914d;
    }

    /* JADX INFO: renamed from: c4 */
    public static final List m39485c4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m39488f4(OpenLeverFragment openLeverFragment, List list) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        openLeverFragment.f33610e0.clear();
        openLeverFragment.f33610e0.addAll(C27024b.m66560c(list));
        openLeverFragment.m39514k4().replaceData(openLeverFragment.f33610e0);
        C36910e0 c36910e0M39518o4 = openLeverFragment.m39518o4();
        if (c36910e0M39518o4 != null && (baseTextView2 = c36910e0M39518o4.f81679g) != null) {
            baseTextView2.setText(openLeverFragment.getString(R$string.open_margin_trade_answered, " 0/" + openLeverFragment.f33610e0.size()));
        }
        C36910e0 c36910e0M39518o5 = openLeverFragment.m39518o4();
        if (c36910e0M39518o5 != null && (baseTextView = c36910e0M39518o5.f81679g) != null) {
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(openLeverFragment.getColorRes(R$color.c_text))));
        }
        if (openLeverFragment.f33610e0.isEmpty()) {
            openLeverFragment.showEmpty();
        } else {
            openLeverFragment.showContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m39490h4(final OpenLeverFragment openLeverFragment, Throwable th2) {
        openLeverFragment.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.margin.open.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenLeverFragment.m39491i4(this.f33620b, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final boolean m39503t4() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37977a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37977a) objM56186h).mo85832c();
        }
        return false;
    }

    /* JADX INFO: renamed from: y4 */
    public static final boolean m39510y4() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37977a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37977a) objM56186h).mo85831b();
        }
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_open_lever;
    }

    /* JADX INFO: renamed from: k4 */
    public final OpenLeverExamAdapter m39514k4() {
        return (OpenLeverExamAdapter) this.f33609d0.getValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final InterfaceC46305f m39515l4() {
        return (InterfaceC46305f) this.f33601V.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final String m39516m4() {
        return (String) this.f33603X.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final String m39517n4() {
        return (String) this.f33604Y.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final C36910e0 m39518o4() {
        return (C36910e0) this.f33600U.getValue(this, f33599h0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36910e0 c36910e0M39518o4 = m39518o4();
        if (c36910e0M39518o4 != null) {
            c36910e0M39518o4.f81680h.setText(getString(m39523u4() ? R$string.open_etf_trade_risk_title : R$string.open_margin_trade_risk_title));
            c36910e0M39518o4.f81678f.setText(getString(m39523u4() ? R$string.open_etf_trade_risk_detail : R$string.open_margin_trade_risk_detail));
            c36910e0M39518o4.f81675c.setText(getString(m39523u4() ? R$string.open_etf_trade_read_rule : R$string.open_margin_trade_read_rule));
            c36910e0M39518o4.f81674b.setText(getString(m39523u4() ? R$string.open_etf_trade_submit : R$string.open_margin_trade_submit));
            BaseTextView tvWarning = c36910e0M39518o4.f81681i;
            Intrinsics.checkNotNullExpressionValue(tvWarning, "tvWarning");
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
            C37330a.m83912d(tvWarning, (objM56186h != null ? Boolean.valueOf(((InterfaceC46815o0) objM56186h).mo102977a()) : Boolean.FALSE).booleanValue());
            c36910e0M39518o4.f81677e.setAdapter(m39514k4());
            this.f33611f0 = WrapperLoadingView.injectView(c36910e0M39518o4.f81677e);
            c36910e0M39518o4.f81679g.setText(getString(R$string.open_margin_trade_answered, " 0/0"));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView tvProgress = c36910e0M39518o4.f81679g;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(tvProgress, new Pair(textTagEnum, new ForegroundColorSpan(getColorRes(R$color.c_text))));
            c36910e0M39518o4.f81675c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.margin.open.k0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    OpenLeverFragment.m39447F4(this.f33629b, compoundButton, z11);
                }
            });
            c36910e0M39518o4.f81675c.setMovementMethod(LinkMovementMethod.getInstance());
            CheckBox cbCheck = c36910e0M39518o4.f81675c;
            Intrinsics.checkNotNullExpressionValue(cbCheck, "cbCheck");
            highlightTextHelper.m54120f(cbCheck, new Pair(textTagEnum, new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.margin.open.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OpenLeverFragment.m39449G4(this.f33631b, view2);
                }
            })));
            KcPrimaryButton btnOpen = c36910e0M39518o4.f81674b;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.margin.open.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenLeverFragment.m39451H4(this.f33614b);
                }
            }, 1, null);
            m39513a4();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final String m39519p4() {
        return (String) this.f33602W.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m39522s4() {
        return ((Boolean) this.f33608c0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m39523u4() {
        return ((Boolean) this.f33606a0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m39525x4() {
        return ((Boolean) this.f33607b0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m39526z4() {
        if (!TextUtils.isEmpty(this.f33605Z)) {
            String str = this.f33605Z;
            if (str != null) {
                InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
                return;
            }
            return;
        }
        Observable<R> observableCompose = IMarginService.f32724a.get().mo37935f().compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.open.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39437A4(this.f33616b, (LeverBalance) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.open.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenLeverFragment.m39439B4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.open.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39441C4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.open.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenLeverFragment.m39443D4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m39437A4(OpenLeverFragment openLeverFragment, LeverBalance leverBalance) {
        String str;
        boolean z11;
        String strM98841a;
        String agreementUrl = leverBalance.getAgreementUrl();
        String str2 = null;
        if (agreementUrl != null && (strM98841a = C44683c.m98841a(agreementUrl)) != null) {
            str = strM98841a + "?appNeedLang=true";
        } else {
            str = null;
        }
        if (str != null && !StringsKt.isBlank(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            str2 = str;
        }
        if (str2 == null) {
            if (MultiLanguageManager.m56979h()) {
                str2 = InterfaceC46306g.f103877d;
            } else {
                str2 = InterfaceC46306g.f103876c;
            }
        }
        String str3 = str2;
        openLeverFragment.f33605Z = str3;
        if (str3 != null) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str3, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m39439B4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m39443D4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static final String m39445E4(OpenLeverFragment openLeverFragment) {
        Bundle arguments = openLeverFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "locationId");
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m39447F4(OpenLeverFragment openLeverFragment, CompoundButton compoundButton, boolean z11) {
        openLeverFragment.m39512Z3();
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m39449G4(OpenLeverFragment openLeverFragment, View view) {
        String str;
        if (openLeverFragment.m39523u4()) {
            Router router = Router.f46192a;
            if (MultiLanguageManager.m56979h()) {
                str = InterfaceC37052c.f82306d;
            } else {
                str = InterfaceC37052c.f82305c;
            }
            Intrinsics.checkNotNull(str);
            router.m56184f(str).m4048k();
            return;
        }
        openLeverFragment.m39526z4();
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m39451H4(final OpenLeverFragment openLeverFragment) {
        String strM39516m4;
        String strM39517n4;
        String strM39519p4 = openLeverFragment.m39519p4();
        if (strM39519p4 != null && strM39519p4.length() != 0 && (strM39516m4 = openLeverFragment.m39516m4()) != null && strM39516m4.length() != 0 && (strM39517n4 = openLeverFragment.m39517n4()) != null && strM39517n4.length() != 0) {
            C43852m.m96591c(C27041f.m66668h(openLeverFragment.m39519p4()), C27041f.m66668h(openLeverFragment.m39516m4()), C27041f.m66668h(openLeverFragment.m39517n4()), null, 8, null);
        }
        if (openLeverFragment.m39525x4()) {
            ArrayList<OpenLeverExam> arrayList = openLeverFragment.f33610e0;
            int i11 = 0;
            if (arrayList == null || !arrayList.isEmpty()) {
                for (OpenLeverExam openLeverExam : arrayList) {
                    if (Intrinsics.areEqual(openLeverExam.getChoose(), openLeverExam.getRight()) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i11 == openLeverFragment.f33610e0.size() && !openLeverFragment.m39524w4()) {
                openLeverFragment.showLoadingDialog();
                if (openLeverFragment.m39523u4()) {
                    Observable<R> observableCompose = openLeverFragment.m39515l4().m102096g().compose(C24217a1.m58389m());
                    Consumer consumer = new Consumer() { // from class: com.kubi.margin.open.p
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            OpenLeverFragment.m39453I4(this.f33635b, obj);
                        }
                    };
                    final Function1 function1 = new Function1() { // from class: com.kubi.margin.open.u
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OpenLeverFragment.m39455J4(this.f33640b, (Throwable) obj);
                        }
                    };
                    Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.open.v
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            OpenLeverFragment.m39457K4(function1, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                    DisposableKt.addTo(disposableSubscribe, openLeverFragment.getDestroyDisposable());
                } else {
                    Observable<R> observableCompose2 = openLeverFragment.m39515l4().m102113z().compose(C24217a1.m58389m());
                    final Function1 function2 = new Function1() { // from class: com.kubi.margin.open.x
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OpenLeverFragment.m39459L4(this.f33643b, (LeverOpen) obj);
                        }
                    };
                    Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.open.y
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            OpenLeverFragment.m39461M4(function2, obj);
                        }
                    };
                    final Function1 function3 = new Function1() { // from class: com.kubi.margin.open.z
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OpenLeverFragment.m39463N4(this.f33645b, (Throwable) obj);
                        }
                    };
                    Disposable disposableSubscribe2 = observableCompose2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.open.a0
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            OpenLeverFragment.m39465O4(function3, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
                    DisposableKt.addTo(disposableSubscribe2, openLeverFragment.getDestroyDisposable());
                }
            } else {
                openLeverFragment.m39521r4();
                Unit unit = Unit.INSTANCE;
            }
        } else {
            openLeverFragment.showLoadingDialog();
            if (openLeverFragment.m39523u4()) {
                Observable<R> observableCompose3 = openLeverFragment.m39515l4().m102096g().compose(C24217a1.m58389m());
                Consumer consumer3 = new Consumer() { // from class: com.kubi.margin.open.b0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        OpenLeverFragment.m39467P4(this.f33615b, obj);
                    }
                };
                final Function1 function4 = new Function1() { // from class: com.kubi.margin.open.c0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpenLeverFragment.m39469Q4(this.f33617b, (Throwable) obj);
                    }
                };
                Disposable disposableSubscribe3 = observableCompose3.subscribe(consumer3, new Consumer() { // from class: com.kubi.margin.open.d0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        OpenLeverFragment.m39471R4(function4, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe3, openLeverFragment.getDestroyDisposable());
            } else {
                Observable<R> observableCompose4 = openLeverFragment.m39515l4().m102113z().compose(C24217a1.m58389m());
                final Function1 function5 = new Function1() { // from class: com.kubi.margin.open.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpenLeverFragment.m39473S4(this.f33636b, (LeverOpen) obj);
                    }
                };
                Consumer consumer4 = new Consumer() { // from class: com.kubi.margin.open.r
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        OpenLeverFragment.m39475T4(function5, obj);
                    }
                };
                final Function1 function6 = new Function1() { // from class: com.kubi.margin.open.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OpenLeverFragment.m39477U4(this.f33638b, (Throwable) obj);
                    }
                };
                Disposable disposableSubscribe4 = observableCompose4.subscribe(consumer4, new Consumer() { // from class: com.kubi.margin.open.t
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        OpenLeverFragment.m39479V4(function6, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe4, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe4, openLeverFragment.getDestroyDisposable());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m39457K4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m39461M4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m39465O4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R4 */
    public static final void m39471R4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static final void m39475T4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m39479V4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W4 */
    public static final String m39481W4(OpenLeverFragment openLeverFragment) {
        Bundle arguments = openLeverFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "pageId");
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public static final InterfaceC46305f m39482X3() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final String m39483Y3(OpenLeverFragment openLeverFragment) {
        Bundle arguments = openLeverFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56239b0(arguments, "blockId");
        }
        return null;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m39486d4(OpenLeverFragment openLeverFragment, Disposable disposable) {
        openLeverFragment.showLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m39487e4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m39489g4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i4 */
    public static final void m39491i4(OpenLeverFragment openLeverFragment, View view) {
        openLeverFragment.m39513a4();
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m39492j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static final boolean m39506v4(OpenLeverFragment openLeverFragment) {
        Bundle arguments = openLeverFragment.getArguments();
        if (arguments == null || RouteExKt.m56260m(arguments, "type") != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m39512Z3() {
        C36910e0 c36910e0M39518o4;
        int i11;
        int i12;
        boolean z11;
        if (getView() != null && (c36910e0M39518o4 = m39518o4()) != null) {
            ArrayList<OpenLeverExam> arrayList = this.f33610e0;
            boolean z12 = false;
            if (arrayList != null && arrayList.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (OpenLeverExam openLeverExam : arrayList) {
                    if (Intrinsics.areEqual(openLeverExam.getChoose(), openLeverExam.getRight()) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            ArrayList<OpenLeverExam> arrayList2 = this.f33610e0;
            if (arrayList2 != null && arrayList2.isEmpty()) {
                i12 = 0;
            } else {
                Iterator<T> it = arrayList2.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    String choose = ((OpenLeverExam) it.next()).getChoose();
                    if (choose != null && choose.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11 && (i12 = i12 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (m39525x4()) {
                BaseTextView baseTextView = c36910e0M39518o4.f81679g;
                int i13 = R$string.margin_trade_answered;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                sb2.append(i12);
                sb2.append('/');
                sb2.append(this.f33610e0.size());
                baseTextView.setText(getString(i13, sb2.toString()));
                KcPrimaryButton kcPrimaryButton = c36910e0M39518o4.f81674b;
                if (i12 == this.f33610e0.size() && c36910e0M39518o4.f81675c.isChecked()) {
                    z12 = true;
                }
                kcPrimaryButton.setEnabled(z12);
            } else {
                BaseTextView baseTextView2 = c36910e0M39518o4.f81679g;
                int i14 = R$string.open_margin_trade_answered;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(' ');
                sb3.append(i11);
                sb3.append('/');
                sb3.append(this.f33610e0.size());
                baseTextView2.setText(getString(i14, sb3.toString()));
                KcPrimaryButton kcPrimaryButton2 = c36910e0M39518o4.f81674b;
                if (i11 == this.f33610e0.size() && c36910e0M39518o4.f81675c.isChecked()) {
                    z12 = true;
                }
                kcPrimaryButton2.setEnabled(z12);
            }
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView tvProgress = c36910e0M39518o4.f81679g;
            Intrinsics.checkNotNullExpressionValue(tvProgress, "tvProgress");
            highlightTextHelper.m54120f(tvProgress, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(getColorRes(R$color.c_text))));
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m39513a4() {
        Observable<BaseEntity<String>> observableM102072G;
        if (m39523u4()) {
            observableM102072G = m39515l4().m102081Q();
        } else {
            observableM102072G = m39515l4().m102072G();
        }
        Observable<R> observableCompose = observableM102072G.compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.open.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39484b4((String) obj);
            }
        };
        Observable observableObserveOn = observableCompose.map(new Function() { // from class: com.kubi.margin.open.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OpenLeverFragment.m39485c4(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.open.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39486d4(this.f33625b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.open.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenLeverFragment.m39487e4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.open.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39488f4(this.f33628b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.open.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenLeverFragment.m39489g4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.open.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenLeverFragment.m39490h4(this.f33633b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.open.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OpenLeverFragment.m39492j4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m39520q4() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C45618h c45618h = C45618h.f102740a;
        long jM102324f = C46392a.m102324f(c45618h.m100723k(), 0L);
        if (jCurrentTimeMillis - jM102324f > this.f33612g0) {
            jM102324f = jCurrentTimeMillis;
        }
        C46392a.m102330m(c45618h.m100723k(), jM102324f);
        ToastCompat.m66441G(getString(R$string.margin_trade_answer_time, String.valueOf(RangesKt.coerceAtLeast(1, RangesKt.coerceAtMost(10, (int) (((this.f33612g0 - (jCurrentTimeMillis - jM102324f)) + ((long) 59999)) / ((long) 60000)))))), new Object[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public final void m39521r4() {
        if (m39522s4()) {
            ToastCompat.m66441G(getString(R$string.kc_marign_anser_error_tip), new Object[0]);
        } else {
            m39520q4();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        WrapperLoadingView wrapperLoadingView = this.f33611f0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        super.showContent();
        WrapperLoadingView wrapperLoadingView = this.f33611f0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(res1, res2, onClickListener);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        super.showContentView();
        WrapperLoadingView wrapperLoadingView = this.f33611f0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final boolean m39524w4() {
        if (m39522s4()) {
            return false;
        }
        if (System.currentTimeMillis() - C46392a.m102324f(C45618h.f102740a.m100723k(), 0L) >= this.f33612g0) {
            return false;
        }
        return true;
    }
}
