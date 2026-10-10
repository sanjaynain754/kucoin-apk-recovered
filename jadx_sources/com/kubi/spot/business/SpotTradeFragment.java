package com.kubi.spot.business;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.core.biz.menu.more.MultiTabBottomDialog;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.view.ComplianceNoticeView;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.api.IMarginService;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.mvi.C25044b;
import com.kubi.spot.business.mvi.SpotTradeContract$UiIntent;
import com.kubi.spot.business.mvi.SpotTradeViewModel;
import com.kubi.spot.business.mvi.UIState;
import com.kubi.spot.service.SpotDepend;
import com.kubi.spot.view.SpotImportantNoticeView;
import com.kubi.spot.view.SpotTradeComplianceInfoView;
import com.kubi.spot.view.SpotTradeRiskTipView;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import e20.InterfaceC37052c;
import eg.InterfaceC37174b;
import f00.C37304a;
import f20.C37326a;
import f20.C37328c;
import f20.InterfaceC37327b;
import f30.C37330a;
import g00.InterfaceC37766r;
import g10.C37787r;
import gf.C37890n;
import id.C38519a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p757xd.C46148j;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import ro.C44128b;
import t20.C44635d0;
import y70.C46392a;

/* JADX INFO: compiled from: SpotTradeFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0017J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,H\u0014J\u0018\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0010H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\u001f\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0010H\u0014J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0002J\u0018\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020'0&0%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006?"}, m90084d2 = {"Lcom/kubi/spot/business/SpotTradeFragment;", "Lcom/kubi/spot/business/BaseTradeFragment;", "<init>", "()V", "hasCoupons", "", "getHasCoupons", "()Z", "setHasCoupons", "(Z)V", "isFirstShow", "menuProvider", "Lcom/kubi/spot/business/MenuItemsProvider;", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "handleArguments", "bundle", "Landroid/os/Bundle;", "bindFlowEvent", "updateSymbolCompleted", "showEtfStatus", "needShowExtValue", "fetchExtValue", "showExtValueTips", "extValueLabel", "", "extValueWsDisposable", "Lio/reactivex/disposables/Disposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getMenuItems", "", "Lcom/kubi/resources/MenuItem;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;", "getVmClass", "()Lkotlin/reflect/KClass;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "updateDot", "itemId", "showDot", "onResume", "onChildRefresh", "setChangeP30", "isShowP30", "changeRate", "", "(ZLjava/lang/Double;)V", "bindState", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "refreshBannerDataAndStatus", "fillBannerItem", "bannerEntity", "Lcom/kubi/spot/business/banner/SpotDisplayBanner;", "itemView", "Landroid/view/View;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n17#2,2:421\n33#2:423\n17#2,2:424\n34#2,3:426\n17#2,2:435\n33#2:437\n17#2,2:438\n34#2,3:440\n158#3,2:429\n135#4,2:431\n126#4,2:443\n1869#5,2:433\n808#5,11:445\n1869#5,2:456\n808#5,11:458\n1869#5,2:469\n*S KotlinDebug\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment\n*L\n111#1:421,2\n146#1:423\n146#1:424,2\n146#1:426,3\n324#1:435,2\n107#1:437\n107#1:438,2\n107#1:440,3\n169#1:429,2\n186#1:431,2\n218#1:443,2\n302#1:433,2\n233#1:445,11\n234#1:456,2\n267#1:458,11\n268#1:469,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_spot")
public final class SpotTradeFragment extends BaseTradeFragment {

    /* JADX INFO: renamed from: o0 */
    public boolean f49752o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f49753p0;

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public MenuItemsProvider f49754q0;

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$a */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/spot/business/SpotTradeFragment$showEtfStatus$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24662a extends ClickableSpan {
        public C24662a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C37304a c37304a = C37304a.f82764a;
            String ETF_TERM = InterfaceC37052c.f82307e;
            Intrinsics.checkNotNullExpressionValue(ETF_TERM, "ETF_TERM");
            InterfaceC37766r.a.m85190a(c37304a, ETF_TERM, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(SpotTradeFragment.this.getColorRes(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$bindState$10 */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.SpotTradeFragment$bindState$10", m90122f = "SpotTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSpotTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment$bindState$10\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,420:1\n17#2,2:421\n*S KotlinDebug\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment$bindState$10\n*L\n364#1:421,2\n*E\n"})
    public static final class C2466410 extends SuspendLambda implements Function2<ComplianceInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ComplianceInfoEntity complianceInfoEntity, Continuation<? super Unit> continuation) {
            return ((C2466410) create(complianceInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C2466410(Continuation<? super C2466410> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2466410 c2466410 = SpotTradeFragment.this.new C2466410(continuation);
            c2466410.L$0 = obj;
            return c2466410;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotTradeComplianceInfoView spotTradeComplianceInfoView;
            SpotTradeComplianceInfoView spotTradeComplianceInfoView2;
            SpotTradeComplianceInfoView spotTradeComplianceInfoView3;
            SpotTradeComplianceInfoView spotTradeComplianceInfoView4;
            ComplianceInfoEntity complianceInfoEntity = (ComplianceInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83146f() : false) {
                C44635d0 c44635d0M60200m5 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m5 != null && (spotTradeComplianceInfoView4 = c44635d0M60200m5.f99020g) != null) {
                    ViewExtKt.m66594y(spotTradeComplianceInfoView4);
                }
                C44635d0 c44635d0M60200m6 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m6 != null && (spotTradeComplianceInfoView3 = c44635d0M60200m6.f99020g) != null) {
                    spotTradeComplianceInfoView3.m63096d(complianceInfoEntity);
                }
                C44635d0 c44635d0M60200m7 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m7 != null && (spotTradeComplianceInfoView2 = c44635d0M60200m7.f99020g) != null) {
                    FragmentManager childFragmentManager = SpotTradeFragment.this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    spotTradeComplianceInfoView2.setQuestionListener(childFragmentManager);
                }
            } else {
                C44635d0 c44635d0M60200m8 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m8 != null && (spotTradeComplianceInfoView = c44635d0M60200m8.f99020g) != null) {
                    ViewExtKt.m66577h(spotTradeComplianceInfoView);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$bindState$2 */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.SpotTradeFragment$bindState$2", m90122f = "SpotTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246652 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C246652(Continuation<? super C246652> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SpotTradeFragment.this.new C246652(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C246652) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SpotTradeFragment.this.m60256U7();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$bindState$4 */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.SpotTradeFragment$bindState$4", m90122f = "SpotTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSpotTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment$bindState$4\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,420:1\n33#2:421\n17#2,2:422\n34#2,3:424\n*S KotlinDebug\n*F\n+ 1 SpotTradeFragment.kt\ncom/kubi/spot/business/SpotTradeFragment$bindState$4\n*L\n344#1:421\n344#1:422,2\n344#1:424,3\n*E\n"})
    public static final class C246674 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C246674(Continuation<? super C246674> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246674 c246674 = SpotTradeFragment.this.new C246674(continuation);
            c246674.L$0 = obj;
            return c246674;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C246674) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotTradeRiskTipView spotTradeRiskTipView;
            SpotImportantNoticeView spotImportantNoticeView;
            LinearLayout linearLayout;
            SpotTradeRiskTipView spotTradeRiskTipView2;
            SpotImportantNoticeView spotImportantNoticeView2;
            List<SpotBannerItemEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotTradeFragment.this.f49753p0 = false;
            if (list == null || !(!list.isEmpty())) {
                C44635d0 c44635d0M60200m5 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m5 != null && (spotImportantNoticeView = c44635d0M60200m5.f99025l) != null) {
                    ViewExtKt.m66577h(spotImportantNoticeView);
                }
                SpotTradeFragment spotTradeFragment = SpotTradeFragment.this;
                Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
                if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83141a() : true) {
                    spotTradeFragment.m60257V7();
                }
                C44635d0 c44635d0M60200m6 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m6 != null && (spotTradeRiskTipView = c44635d0M60200m6.f99033t) != null) {
                    spotTradeRiskTipView.m63101d(SpotTradeFragment.m60278w7(SpotTradeFragment.this).getRiskWarningTips(), SpotTradeFragment.this.m60207q5().getSymbol());
                }
            } else {
                C44635d0 c44635d0M60200m7 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m7 != null && (spotImportantNoticeView2 = c44635d0M60200m7.f99025l) != null) {
                    spotImportantNoticeView2.setData(list);
                }
                C44635d0 c44635d0M60200m8 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m8 != null && (spotTradeRiskTipView2 = c44635d0M60200m8.f99033t) != null) {
                    ViewExtKt.m66577h(spotTradeRiskTipView2);
                }
                C44635d0 c44635d0M60200m9 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m9 != null && (linearLayout = c44635d0M60200m9.f99022i) != null) {
                    ViewExtKt.m66577h(linearLayout);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$bindState$6 */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.SpotTradeFragment$bindState$6", m90122f = "SpotTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246696 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C246696(Continuation<? super C246696> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246696 c246696 = SpotTradeFragment.this.new C246696(continuation);
            c246696.L$0 = obj;
            return c246696;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C246696) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ComplianceNoticeView complianceNoticeView;
            ComplianceNoticeView complianceNoticeView2;
            List<SpotBannerItemEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotTradeFragment.this.f49753p0 = false;
            if (list == null || !(!list.isEmpty())) {
                C44635d0 c44635d0M60200m5 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m5 != null && (complianceNoticeView = c44635d0M60200m5.f99021h) != null) {
                    ViewExtKt.m66577h(complianceNoticeView);
                }
            } else {
                C44635d0 c44635d0M60200m6 = SpotTradeFragment.this.m60200m5();
                if (c44635d0M60200m6 != null && (complianceNoticeView2 = c44635d0M60200m6.f99021h) != null) {
                    complianceNoticeView2.setData(list);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.SpotTradeFragment$bindState$8 */
    /* JADX INFO: compiled from: SpotTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.SpotTradeFragment$bindState$8", m90122f = "SpotTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C246718 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C246718(Continuation<? super C246718> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246718 c246718 = SpotTradeFragment.this.new C246718(continuation);
            c246718.L$0 = obj;
            return c246718;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C246718) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C44635d0 c44635d0M60200m5;
            SpotTradeRiskTipView spotTradeRiskTipView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<SpotBannerItemEntity> importantNoticeList = SpotTradeFragment.m60278w7(SpotTradeFragment.this).getImportantNoticeList();
            if ((importantNoticeList == null || importantNoticeList.isEmpty()) && (c44635d0M60200m5 = SpotTradeFragment.this.m60200m5()) != null && (spotTradeRiskTipView = c44635d0M60200m5.f99033t) != null) {
                spotTradeRiskTipView.m63101d(str, SpotTradeFragment.this.m60207q5().getSymbol());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final void m60284R7(Bundle bundle) {
        SlidingTabLayout slidingTabLayout;
        AppBarLayout appBarLayout;
        CustomViewPager customViewPager;
        PagerAdapter adapter;
        SlidingTabLayout slidingTabLayout2;
        AppBarLayout appBarLayout2;
        Integer numValueOf = null;
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "bottomTab") : null;
        if (Intrinsics.areEqual(strM56284y, "order")) {
            C44635d0 c44635d0M60200m5 = m60200m5();
            if (c44635d0M60200m5 != null && (appBarLayout2 = c44635d0M60200m5.f99017d) != null) {
                appBarLayout2.setExpanded(false);
            }
            C44635d0 c44635d0M60200m6 = m60200m5();
            if (c44635d0M60200m6 == null || (slidingTabLayout2 = c44635d0M60200m6.f99015b) == null) {
                return;
            }
            slidingTabLayout2.setCurrentTab(0);
            return;
        }
        if (Intrinsics.areEqual(strM56284y, "funds")) {
            C44635d0 c44635d0M60200m7 = m60200m5();
            if (c44635d0M60200m7 != null && (customViewPager = c44635d0M60200m7.f99029p) != null && (adapter = customViewPager.getAdapter()) != null) {
                numValueOf = Integer.valueOf(adapter.getCount());
            }
            if (C27039d.m66650j(numValueOf) >= 2) {
                C44635d0 c44635d0M60200m8 = m60200m5();
                if (c44635d0M60200m8 != null && (appBarLayout = c44635d0M60200m8.f99017d) != null) {
                    appBarLayout.setExpanded(false);
                }
                C44635d0 c44635d0M60200m9 = m60200m5();
                if (c44635d0M60200m9 == null || (slidingTabLayout = c44635d0M60200m9.f99015b) == null) {
                    return;
                }
                slidingTabLayout.setCurrentTab(1);
            }
        }
    }

    /* JADX INFO: renamed from: A7 */
    public static final boolean m60238A7(SpotTradeFragment spotTradeFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!spotTradeFragment.isVisible()) {
            return false;
        }
        String str = String.format("/margin-fund/nav:%s", Arrays.copyOf(new Object[]{spotTradeFragment.mo60189N().getBaseCurrency()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: B7 */
    public static final boolean m60239B7(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: C7 */
    public static final BigDecimal m60240C7(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        try {
            String strOptString = new JSONObject(s11.getData()).optString("netAssetValue");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new BigDecimal(strOptString);
        } catch (Exception e11) {
            C44128b.m97263g("SpotTradeFragment", e11);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalNegate = ONE.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            return bigDecimalNegate;
        }
    }

    /* JADX INFO: renamed from: D7 */
    public static final BigDecimal m60241D7(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: E7 */
    public static final boolean m60242E7(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.doubleValue() > 0.0d;
    }

    /* JADX INFO: renamed from: F7 */
    public static final boolean m60243F7(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: I7 */
    public static final Unit m60246I7(Throwable th2) {
        C44128b.m97263g("SpotTradeFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M7 */
    public static final Unit m60250M7(Throwable th2) {
        C44128b.m97263g("SpotTradeFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P7 */
    public static final Unit m60252P7(SpotTradeFragment spotTradeFragment, MarqueeTextView marqueeTextView) {
        try {
            Result.Companion companion = Result.INSTANCE;
            new C37326a(((UIState) spotTradeFragment.getState()).getBannerNoticeList()).m83899c(marqueeTextView.getCurrentIndex());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q7 */
    public static final Unit m60253Q7(SpotTradeFragment spotTradeFragment, InterfaceC37327b interfaceC37327b) {
        new C37326a(((UIState) spotTradeFragment.getState()).getBannerNoticeList()).m83897a(interfaceC37327b);
        spotTradeFragment.m60256U7();
        C43852m.m96591c("B5trading", "announceClosure", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S7 */
    public static final void m60254S7(SpotTradeFragment spotTradeFragment, BGABanner bGABanner, View itemView, InterfaceC37327b interfaceC37327b, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (interfaceC37327b != null) {
            spotTradeFragment.m60282O7(interfaceC37327b, itemView);
        }
    }

    @Override // com.kubi.spot.business.BaseTradeFragment
    /* JADX INFO: renamed from: J6 */
    public void mo60182J6() {
        C44635d0 c44635d0M60200m5;
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(m60207q5().getSymbol());
        if (symbolInfoEntityM85601B == null || (c44635d0M60200m5 = m60200m5()) == null || (symbolBarLayout = c44635d0M60200m5.f99035v) == null || (f20881c = symbolBarLayout.getF20881c()) == null) {
            return;
        }
        f20881c.m101741y(symbolInfoEntityM85601B.getMark() == 1);
    }

    /* JADX INFO: renamed from: O7 */
    public final void m60282O7(final InterfaceC37327b interfaceC37327b, View view) {
        final MarqueeTextView marqueeTextView = (MarqueeTextView) view.findViewById(R$id.marqueeView);
        marqueeTextView.setContentList(C37328c.m83905b(interfaceC37327b));
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.spot.business.d4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotTradeFragment.m60252P7(this.f49897b, marqueeTextView);
            }
        }, 1, null);
        View viewFindViewById = view.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.spot.business.e4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotTradeFragment.m60253Q7(this.f50146b, interfaceC37327b);
            }
        }, 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "handle_click_event".length();
        }
        C12572a.m23692a(this, true, new SpotTradeFragment$bindFlowEvent$$inlined$bindFlowEvent$1("handle_click_event", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.SpotTradeFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getBannerNoticeList();
            }
        }, new C246652(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.SpotTradeFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getImportantNoticeList();
            }
        }, new C246674(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.SpotTradeFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getComplianceNoticeList();
            }
        }, new C246696(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.SpotTradeFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRiskWarningTips();
            }
        }, new C246718(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.SpotTradeFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getComplianceInfo();
            }
        }, new C2466410(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C25044b) {
            boolean f50261a = ((C25044b) singleEvent).getF50261a();
            this.f49752o0 = f50261a;
            MenuItemsProvider menuItemsProvider = this.f49754q0;
            if (menuItemsProvider != null) {
                menuItemsProvider.m61088H0(f50261a);
            }
            m60286X7(108, this.f49752o0);
        }
    }

    @Override // com.kubi.spot.business.BaseTradeFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_spot_trade;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SpotTradeViewModel.class);
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: n0 */
    public void mo60287n0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.etf_value_intro).m54153J4(R$string.etf_value_intro_tips).m54162S4(R$string.i_know, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "showEtfValueTips");
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public Disposable mo60288q0(@NotNull C37787r wsDataHelper) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        if (!mo60189N().isEtfSymbol()) {
            return null;
        }
        String baseCurrency = mo60189N().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        PublishSubject<Message> publishSubjectM85233f = wsDataHelper.m85233f("/margin-fund/nav:%s", baseCurrency);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.f4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotTradeFragment.m60238A7(this.f50151b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.business.o3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotTradeFragment.m60239B7(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.p3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotTradeFragment.m60240C7((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.spot.business.q3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotTradeFragment.m60241D7(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.r3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotTradeFragment.m60242E7((BigDecimal) obj));
            }
        };
        Observable observableObserveOn = map.filter(new Predicate() { // from class: com.kubi.spot.business.s3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotTradeFragment.m60243F7(function3, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.t3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotTradeFragment.m60244G7(this.f50470b, (BigDecimal) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.u3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotTradeFragment.m60245H7(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.v3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotTradeFragment.m60246I7((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.w3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotTradeFragment.m60247J7(function5, obj);
            }
        });
    }

    @Override // com.kubi.spot.business.BaseTradeFragment
    @NotNull
    /* JADX INFO: renamed from: s5 */
    public List<MenuItem> mo60210s5() {
        MenuItemsProvider menuItemsProvider = new MenuItemsProvider(this, m60220x5(), m60208r5(), m60207q5());
        this.f49754q0 = menuItemsProvider;
        return C27024b.m66559b(menuItemsProvider.m61086E0());
    }

    @Override // com.kubi.spot.business.BaseTradeFragment
    /* JADX INFO: renamed from: t6 */
    public void mo60213t6(boolean z11, @Nullable Double d11) {
        SpotTradeComplianceInfoView spotTradeComplianceInfoView;
        SpotTradeComplianceInfoView spotTradeComplianceInfoView2;
        SpotTradeComplianceInfoView spotTradeComplianceInfoView3;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC37174b) objM56186h).m83146f() : false)) {
            C44635d0 c44635d0M60200m5 = m60200m5();
            if (c44635d0M60200m5 == null || (spotTradeComplianceInfoView = c44635d0M60200m5.f99020g) == null) {
                return;
            }
            ViewExtKt.m66577h(spotTradeComplianceInfoView);
            return;
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (spotTradeComplianceInfoView3 = c44635d0M60200m6.f99020g) != null) {
            ViewExtKt.m66594y(spotTradeComplianceInfoView3);
        }
        C44635d0 c44635d0M60200m7 = m60200m5();
        if (c44635d0M60200m7 == null || (spotTradeComplianceInfoView2 = c44635d0M60200m7.f99020g) == null) {
            return;
        }
        spotTradeComplianceInfoView2.m63095b(z11, d11);
    }

    public SpotTradeFragment() {
        setPageId("B5trading");
        this.f49753p0 = true;
    }

    /* JADX INFO: renamed from: G7 */
    public static final Unit m60244G7(SpotTradeFragment spotTradeFragment, BigDecimal bigDecimal) {
        List<Fragment> fragments = spotTradeFragment.m60220x5().getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60303m0(bigDecimal);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H7 */
    public static final void m60245H7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J7 */
    public static final void m60247J7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K7 */
    public static final Unit m60248K7(SpotTradeFragment spotTradeFragment, BigDecimal bigDecimal) {
        List<Fragment> fragments = spotTradeFragment.m60220x5().getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof ITradeChildBehavior) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ITradeChildBehavior) it.next()).mo60303m0(bigDecimal);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L7 */
    public static final void m60249L7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N7 */
    public static final void m60251N7(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T7 */
    public static final Unit m60255T7(SpotTradeFragment spotTradeFragment) {
        boolean zM83141a;
        SpotTradeRiskTipView spotTradeRiskTipView;
        C44635d0 c44635d0M60200m5 = spotTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (spotTradeRiskTipView = c44635d0M60200m5.f99033t) != null) {
            spotTradeRiskTipView.m63101d(((UIState) spotTradeFragment.getState()).getRiskWarningTips(), spotTradeFragment.m60207q5().getSymbol());
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zM83141a = ((InterfaceC37174b) objM56186h).m83141a();
        } else {
            zM83141a = true;
        }
        if (zM83141a) {
            spotTradeFragment.m60257V7();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U7 */
    public final void m60256U7() {
        BGABanner bGABanner;
        BGABanner bGABanner2;
        BGABanner bGABanner3;
        BGABanner bGABanner4;
        BGABanner bGABanner5;
        if (!isDetached()) {
            List<InterfaceC37327b> listM83898b = new C37326a(((UIState) getState()).getBannerNoticeList()).m83898b();
            if (!listM83898b.isEmpty()) {
                C44635d0 c44635d0M60200m5 = m60200m5();
                if (c44635d0M60200m5 != null && (bGABanner5 = c44635d0M60200m5.f99034u) != null) {
                    ViewExtKt.m66594y(bGABanner5);
                }
                C44635d0 c44635d0M60200m6 = m60200m5();
                if (c44635d0M60200m6 != null && (bGABanner4 = c44635d0M60200m6.f99034u) != null) {
                    boolean z11 = true;
                    if (listM83898b.size() == 1) {
                        z11 = false;
                    }
                    bGABanner4.setAutoPlayAble(z11);
                }
                C44635d0 c44635d0M60200m7 = m60200m5();
                if (c44635d0M60200m7 != null && (bGABanner3 = c44635d0M60200m7.f99034u) != null) {
                    bGABanner3.setData(R$layout.bspot_view_banner_item, listM83898b, (List<String>) null);
                }
                C44635d0 c44635d0M60200m8 = m60200m5();
                if (c44635d0M60200m8 != null && (bGABanner2 = c44635d0M60200m8.f99034u) != null) {
                    bGABanner2.startAutoPlay();
                    return;
                }
                return;
            }
            C44635d0 c44635d0M60200m9 = m60200m5();
            if (c44635d0M60200m9 != null && (bGABanner = c44635d0M60200m9.f99034u) != null) {
                ViewExtKt.m66577h(bGABanner);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V7 */
    public final void m60257V7() {
        LinearLayout linearLayout;
        int i11;
        AppCompatImageView appCompatImageView;
        LinearLayout linearLayout2;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C44635d0 c44635d0M60200m5 = m60200m5();
        if (c44635d0M60200m5 != null && c44635d0M60200m5.f99022i != null) {
            if (mo60189N().isEtfSymbol() && !C46392a.m102322d(C38519a.f86479a.m87128c(), false)) {
                C37890n c37890n = C37890n.f85269a;
                String baseCurrency = mo60189N().getBaseCurrency();
                Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
                EtfCoinEntity etfCoinEntityM85615w = c37890n.m85615w(baseCurrency);
                if (etfCoinEntityM85615w != null) {
                    int i12 = R$string.etf_trade_tips;
                    String strM66668h = C27041f.m66668h(etfCoinEntityM85615w.getCode());
                    if (Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L")) {
                        i11 = R$string.etf_label_times_long;
                    } else {
                        i11 = R$string.etf_label_times_short;
                    }
                    String string = getString(i11, etfCoinEntityM85615w.getMultiple());
                    String strM66668h2 = C27041f.m66668h(etfCoinEntityM85615w.getOriginalCurrency());
                    int i13 = R$string.etf_intro;
                    String string2 = getString(i12, strM66668h, string, strM66668h2, getString(i13));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = getString(i13);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    SpannableStringBuilder spannableStringBuilderM66705t = C27046k.m66705t(string2, string3, new C24662a(), null);
                    C44635d0 c44635d0M60200m6 = m60200m5();
                    if (c44635d0M60200m6 != null && (baseTextView2 = c44635d0M60200m6.f99037x) != null) {
                        baseTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    C44635d0 c44635d0M60200m7 = m60200m5();
                    if (c44635d0M60200m7 != null && (baseTextView = c44635d0M60200m7.f99037x) != null) {
                        baseTextView.setText(spannableStringBuilderM66705t);
                    }
                    C44635d0 c44635d0M60200m8 = m60200m5();
                    if (c44635d0M60200m8 != null && (appCompatImageView2 = c44635d0M60200m8.f99026m) != null) {
                        ViewExtKt.m66594y(appCompatImageView2);
                    }
                    C44635d0 c44635d0M60200m9 = m60200m5();
                    if (c44635d0M60200m9 != null && (linearLayout2 = c44635d0M60200m9.f99022i) != null) {
                        ViewExtKt.m66594y(linearLayout2);
                    }
                    C44635d0 c44635d0M60200m10 = m60200m5();
                    if (c44635d0M60200m10 != null && (appCompatImageView = c44635d0M60200m10.f99026m) != null) {
                        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.spot.business.c4
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SpotTradeFragment.m60258W7(this.f49800b);
                            }
                        }, 1, null);
                        return;
                    }
                    return;
                }
                return;
            }
            C44635d0 c44635d0M60200m11 = m60200m5();
            if (c44635d0M60200m11 != null && (linearLayout = c44635d0M60200m11.f99022i) != null) {
                ViewExtKt.m66577h(linearLayout);
            }
        }
    }

    /* JADX INFO: renamed from: W7 */
    public static final Unit m60258W7(SpotTradeFragment spotTradeFragment) {
        LinearLayout linearLayout;
        C44635d0 c44635d0M60200m5 = spotTradeFragment.m60200m5();
        if (c44635d0M60200m5 != null && (linearLayout = c44635d0M60200m5.f99022i) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C46392a.m102328k(C38519a.f86479a.m87128c(), true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w7 */
    public static final /* synthetic */ UIState m60278w7(SpotTradeFragment spotTradeFragment) {
        return (UIState) spotTradeFragment.getState();
    }

    @Override // com.kubi.spot.business.BaseTradeFragment
    /* JADX INFO: renamed from: K5 */
    public void mo60185K5() {
        super.mo60185K5();
        String symbol = m60207q5().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        sendIntent(new SpotTradeContract$UiIntent.GetNoticeList(symbol));
        String symbol2 = m60207q5().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        sendIntent(new SpotTradeContract$UiIntent.GetComplianceInfo(symbol2));
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: P1 */
    public boolean mo60283P1() {
        return mo60189N().isEtfSymbol();
    }

    @Override // com.kubi.spot.business.ITradeBehavior
    /* JADX INFO: renamed from: W */
    public void mo60285W() {
        if (!mo60189N().isEtfSymbol()) {
            return;
        }
        IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
        String baseCurrency = mo60189N().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        Observable<R> observableCompose = iMarginServiceM63033c.mo37943k(baseCurrency).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.n3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotTradeFragment.m60248K7(this.f50278b, (BigDecimal) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.x3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotTradeFragment.m60249L7(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.y3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotTradeFragment.m60250M7((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.z3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotTradeFragment.m60251N7(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: X7 */
    public final void m60286X7(int i11, boolean z11) {
        RecyclerView.Adapter adapter;
        List<MenuItem> data;
        RecyclerView recyclerView;
        MultiTabBottomDialog f49738g0;
        MultiTabBottomDialog f49738g1 = getF49738g0();
        if (f49738g1 != null && true == f49738g1.isVisible() && (f49738g0 = getF49738g0()) != null) {
            f49738g0.m21981w4(i11, z11);
        }
        DialogFragmentHelper f49737f0 = getF49737f0();
        if (f49737f0 != null && true == f49737f0.isVisible()) {
            DialogFragmentHelper f49737f1 = getF49737f0();
            Intrinsics.checkNotNull(f49737f1);
            View view = f49737f1.getView();
            BaseQuickAdapter baseQuickAdapter = null;
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(R$id.recycler_view)) != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof BaseQuickAdapter) {
                baseQuickAdapter = (BaseQuickAdapter) adapter;
            }
            if (baseQuickAdapter != null && (data = baseQuickAdapter.getData()) != null) {
                for (MenuItem menuItem : data) {
                    if (menuItem.getId() == i11) {
                        menuItem.m54363g(z11);
                        baseQuickAdapter.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        SpotImportantNoticeView spotImportantNoticeView;
        BGABanner bGABanner;
        BGABanner bGABanner2;
        super.initView();
        C44635d0 c44635d0M60200m5 = m60200m5();
        boolean zMo102977a = false;
        if (c44635d0M60200m5 != null && (bGABanner2 = c44635d0M60200m5.f99034u) != null) {
            bGABanner2.setUseHackyViews(false);
        }
        C44635d0 c44635d0M60200m6 = m60200m5();
        if (c44635d0M60200m6 != null && (bGABanner = c44635d0M60200m6.f99034u) != null) {
            bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.spot.business.a4
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner3, View view, Object obj, int i11) {
                    SpotTradeFragment.m60254S7(this.f49760a, bGABanner3, view, (InterfaceC37327b) obj, i11);
                }
            });
        }
        C44635d0 c44635d0M60200m7 = m60200m5();
        if (c44635d0M60200m7 != null && (spotImportantNoticeView = c44635d0M60200m7.f99025l) != null) {
            spotImportantNoticeView.setOnViewHiddenListener(new Function0() { // from class: com.kubi.spot.business.b4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotTradeFragment.m60255T7(this.f49766b);
                }
            });
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo102977a = ((InterfaceC46815o0) objM56186h).mo102977a();
        }
        C44635d0 c44635d0M60200m8 = m60200m5();
        if (c44635d0M60200m8 != null && (baseTextView3 = c44635d0M60200m8.f99013A) != null) {
            C37330a.m83912d(baseTextView3, zMo102977a);
        }
        C44635d0 c44635d0M60200m9 = m60200m5();
        if (c44635d0M60200m9 != null && (baseTextView2 = c44635d0M60200m9.f99039z) != null) {
            C37330a.m83912d(baseTextView2, zMo102977a);
        }
        C44635d0 c44635d0M60200m10 = m60200m5();
        if (c44635d0M60200m10 != null && (baseTextView = c44635d0M60200m10.f99039z) != null) {
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text)));
        }
    }

    @Override // com.kubi.spot.business.BaseTradeFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        C44635d0 c44635d0M60200m5;
        BGABanner bGABanner;
        if (getView() != null && (c44635d0M60200m5 = m60200m5()) != null && (bGABanner = c44635d0M60200m5.f99034u) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42470e("open_spot", "load_spot", "加载：交易页-现货");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.spot.business.BaseTradeFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    @SuppressLint({"SetTextI18n"})
    public void onShow() throws Exception {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        List<SpotBannerItemEntity> importantNoticeList;
        SymbolBarLayout symbolBarLayout2;
        C46148j f20881c2;
        super.onShow();
        boolean zIsMarginEnabled = mo60189N().isMarginEnabled();
        boolean zIsIsolatedMarginTradeEnabled = mo60189N().isIsolatedMarginTradeEnabled();
        boolean zM83141a = true;
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin) && (zIsMarginEnabled || zIsIsolatedMarginTradeEnabled)) {
            C44635d0 c44635d0M60200m5 = m60200m5();
            if (c44635d0M60200m5 != null && (symbolBarLayout2 = c44635d0M60200m5.f99035v) != null && (f20881c2 = symbolBarLayout2.getF20881c()) != null) {
                IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
                String symbol = m60207q5().getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                f20881c2.m101739w(true, iMarginServiceM63033c.mo37937g0(zIsIsolatedMarginTradeEnabled, symbol));
            }
        } else {
            C44635d0 c44635d0M60200m6 = m60200m5();
            if (c44635d0M60200m6 != null && (symbolBarLayout = c44635d0M60200m6.f99035v) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
                f20881c.m101739w(false, null);
            }
        }
        String symbol2 = m60207q5().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        sendIntent(new SpotTradeContract$UiIntent.GetNoticeList(symbol2));
        String symbol3 = m60207q5().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
        sendIntent(new SpotTradeContract$UiIntent.GetComplianceInfo(symbol3));
        if (!this.f49753p0 && ((importantNoticeList = ((UIState) getState()).getImportantNoticeList()) == null || importantNoticeList.isEmpty())) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null) {
                zM83141a = ((InterfaceC37174b) objM56186h).m83141a();
            }
            if (zM83141a) {
                m60257V7();
            }
        }
        C12572a.m23695d("NOTIFY_MAINTENANCE", m60207q5().getSymbol(), 0L, 4, null);
        m60284R7(getArguments());
    }
}
