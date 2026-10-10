package com.kubi.core.biz.notice;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import be.InterfaceC4578a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.spot.view.SpotImportantNoticeView;
import com.kubi.core.spot.view.SpotTradeRiskTipView;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import id.C38519a;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45378e;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0014J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0014J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, m90084d2 = {"Lcom/kubi/core/biz/notice/ImportNoticeFragmentBase;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/notice/ImportNoticeContract$UiIntent;", "Lcom/kubi/core/biz/notice/ImportNoticeContract$UiState;", "Lcom/kubi/core/biz/notice/ImportNoticeVM;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotNoticeLayoutBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotNoticeLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isFirstShow", "", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "onAgainShow", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "startCollectSymbolChange", "Lkotlinx/coroutines/Job;", "startCollectSymbolInfoChange", "refreshData", "bindState", "updateRiskTipsView", "tryShowEtfAndRiskTips", "showEtfStatus", "updateFragmentVisible", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImportNoticeFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportNoticeFragmentBase.kt\ncom/kubi/core/biz/notice/ImportNoticeFragmentBase\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,238:1\n143#2,20:239\n135#3,2:259\n126#3,2:261\n*S KotlinDebug\n*F\n+ 1 ImportNoticeFragmentBase.kt\ncom/kubi/core/biz/notice/ImportNoticeFragmentBase\n*L\n44#1:239,20\n193#1:259,2\n219#1:261,2\n*E\n"})
public final class ImportNoticeFragmentBase extends AbsTradeBaseBizFragment<ImportNoticeContract$UiIntent, UiState, ImportNoticeVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f20536Y = C45681e.m100799e(this, new Function1<ImportNoticeFragmentBase, C45378e>() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45378e invoke(@NotNull ImportNoticeFragmentBase fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45378e.m100286a(fragment.requireView());
        }
    }, new Function1<C45378e, Unit>() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45378e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45378e c45378e) {
            invoke(c45378e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public boolean f20537Z = true;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC4578a f20538a0 = InterfaceC4578a.d.f4049a;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f20535c0 = {Reflection.property1(new PropertyReference1Impl(ImportNoticeFragmentBase.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotNoticeLayoutBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f20534b0 = new Companion(null);

    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/notice/ImportNoticeFragmentBase$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/notice/ImportNoticeFragmentBase;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ImportNoticeFragmentBase newInstance() {
            return new ImportNoticeFragmentBase();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$a */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/core/biz/notice/ImportNoticeFragmentBase$showEtfStatus$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11980a extends ClickableSpan {
        public C11980a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            ISpotCommonService.f49644a.get().mo59955A();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ImportNoticeFragmentBase.this.getColorRes(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$2 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$2", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119822 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C119822(Continuation<? super C119822> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119822 c119822 = ImportNoticeFragmentBase.this.new C119822(continuation);
            c119822.L$0 = obj;
            return c119822;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C119822) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotImportantNoticeView spotImportantNoticeView;
            SpotImportantNoticeView spotImportantNoticeView2;
            LinearLayout linearLayout;
            SpotTradeRiskTipView spotTradeRiskTipView;
            SpotImportantNoticeView spotImportantNoticeView3;
            List<SpotBannerItemEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ImportNoticeFragmentBase.this.f20537Z = false;
            if (list == null || !(!list.isEmpty())) {
                C45378e c45378eM22012V3 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V3 != null && (spotImportantNoticeView = c45378eM22012V3.f102047c) != null) {
                    ViewExtKt.m66577h(spotImportantNoticeView);
                }
                ImportNoticeFragmentBase.this.m22016d4();
            } else {
                C45378e c45378eM22012V4 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V4 != null && (spotImportantNoticeView3 = c45378eM22012V4.f102047c) != null) {
                    final ImportNoticeFragmentBase importNoticeFragmentBase = ImportNoticeFragmentBase.this;
                    spotImportantNoticeView3.setData(list);
                    spotImportantNoticeView3.setOnViewHiddenListener(new Function0() { // from class: com.kubi.core.biz.notice.e
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ImportNoticeFragmentBase.C119822.m22021g(importNoticeFragmentBase);
                        }
                    });
                }
                C45378e c45378eM22012V5 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V5 != null && (spotTradeRiskTipView = c45378eM22012V5.f102049e) != null) {
                    ViewExtKt.m66577h(spotTradeRiskTipView);
                }
                C45378e c45378eM22012V6 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V6 != null && (linearLayout = c45378eM22012V6.f102046b) != null) {
                    ViewExtKt.m66577h(linearLayout);
                }
                C45378e c45378eM22012V7 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V7 != null && (spotImportantNoticeView2 = c45378eM22012V7.f102047c) != null) {
                    ViewExtKt.m66594y(spotImportantNoticeView2);
                }
            }
            ImportNoticeFragmentBase.this.m22017f4();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final Unit m22021g(final ImportNoticeFragmentBase importNoticeFragmentBase) {
            SpotTradeRiskTipView spotTradeRiskTipView;
            C45378e c45378eM22012V3 = importNoticeFragmentBase.m22012V3();
            if (c45378eM22012V3 != null && (spotTradeRiskTipView = c45378eM22012V3.f102049e) != null) {
                spotTradeRiskTipView.m23399d(ImportNoticeFragmentBase.m21999N3(importNoticeFragmentBase).getRiskTips(), ImportNoticeFragmentBase.m21999N3(importNoticeFragmentBase).getSymbol());
            }
            ISpotCommonService.f49644a.get().mo59976t(new Function0() { // from class: com.kubi.core.biz.notice.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImportNoticeFragmentBase.C119822.m22022h(importNoticeFragmentBase);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m22022h(ImportNoticeFragmentBase importNoticeFragmentBase) {
            importNoticeFragmentBase.m22013Z3();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$4 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$4", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119844 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        public C119844(Continuation<? super C119844> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImportNoticeFragmentBase.this.new C119844(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C119844) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ImportNoticeFragmentBase.this.m22018g4();
                ImportNoticeFragmentBase.this.m22017f4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$6 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$6", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119866 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C119866(Continuation<? super C119866> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImportNoticeFragmentBase.this.new C119866(continuation);
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C119866) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ImportNoticeFragmentBase.this.m22018g4();
                ImportNoticeFragmentBase.this.m22017f4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$8 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$bindState$8", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119888 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C119888(Continuation<? super C119888> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119888 c119888 = ImportNoticeFragmentBase.this.new C119888(continuation);
            c119888.Z$0 = ((Boolean) obj).booleanValue();
            return c119888;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C119888) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayout linearLayout;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z11) {
                ImportNoticeFragmentBase.this.m22013Z3();
            } else {
                C45378e c45378eM22012V3 = ImportNoticeFragmentBase.this.m22012V3();
                if (c45378eM22012V3 != null && (linearLayout = c45378eM22012V3.f102046b) != null) {
                    ViewExtKt.m66577h(linearLayout);
                }
            }
            ImportNoticeFragmentBase.this.m22017f4();
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: U3, reason: merged with bridge method [inline-methods] */
    public ImportNoticeVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new ImportNoticeVM(manager);
    }

    /* JADX INFO: renamed from: V3 */
    public final C45378e m22012V3() {
        return (C45378e) this.f20536Y.getValue(this, f20535c0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getImportantNoticeList();
            }
        }, new C119822(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getRiskTips();
            }
        }, new C119844(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getShowRiskTips());
            }
        }, new C119866(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.notice.ImportNoticeFragmentBase.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getShowEtfTips());
            }
        }, new C119888(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m22016d4() {
        SpotTradeRiskTipView spotTradeRiskTipView;
        ISpotCommonService.f49644a.get().mo59976t(new Function0() { // from class: com.kubi.core.biz.notice.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImportNoticeFragmentBase.m22010e4(this.f20549b);
            }
        });
        C45378e c45378eM22012V3 = m22012V3();
        if (c45378eM22012V3 == null || (spotTradeRiskTipView = c45378eM22012V3.f102049e) == null) {
            return;
        }
        spotTradeRiskTipView.m23399d(((UiState) getState()).getRiskTips(), ((UiState) getState()).getSymbol());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkcoin_core_spot_notice_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<ImportNoticeVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ImportNoticeVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22014b4();
        m22015c4();
        m22008Y3();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20887b0() {
        return this.f20538a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public static final /* synthetic */ UiState m21999N3(ImportNoticeFragmentBase importNoticeFragmentBase) {
        return (UiState) importNoticeFragmentBase.getState();
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m22006W3(ImportNoticeFragmentBase importNoticeFragmentBase) {
        importNoticeFragmentBase.m22016d4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m22007X3(ImportNoticeFragmentBase importNoticeFragmentBase) {
        importNoticeFragmentBase.m22013Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m22008Y3() {
        ImportNoticeVM importNoticeVMM21011A3 = m21011A3();
        if (importNoticeVMM21011A3 != null) {
            importNoticeVMM21011A3.m22045F(ImportNoticeContract$UiIntent.GetNoticeList.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m22009a4(ImportNoticeFragmentBase importNoticeFragmentBase) {
        LinearLayout linearLayout;
        C45378e c45378eM22012V3 = importNoticeFragmentBase.m22012V3();
        if (c45378eM22012V3 != null && (linearLayout = c45378eM22012V3.f102046b) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C46392a.m102328k(C38519a.f86479a.m87128c(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m22010e4(ImportNoticeFragmentBase importNoticeFragmentBase) {
        importNoticeFragmentBase.m22013Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m22013Z3() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i11;
        ImageView imageView;
        LinearLayout linearLayout3;
        ImageView imageView2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayout linearLayout4;
        SymbolInfoEntity symbolInfo = m21013D3().m22740t().getSymbolInfo();
        if (symbolInfo == null) {
            C45378e c45378eM22012V3 = m22012V3();
            if (c45378eM22012V3 != null && (linearLayout4 = c45378eM22012V3.f102046b) != null) {
                ViewExtKt.m66577h(linearLayout4);
                return;
            }
            return;
        }
        C45378e c45378eM22012V4 = m22012V3();
        if (c45378eM22012V4 != null && c45378eM22012V4.f102046b != null) {
            if (symbolInfo.isEtfSymbol() && !C46392a.m102322d(C38519a.f86479a.m87128c(), false)) {
                C37890n c37890n = C37890n.f85269a;
                String baseCurrency = symbolInfo.getBaseCurrency();
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
                    SpannableStringBuilder spannableStringBuilderM66705t = C27046k.m66705t(string2, string3, new C11980a(), null);
                    C45378e c45378eM22012V5 = m22012V3();
                    if (c45378eM22012V5 != null && (baseTextView2 = c45378eM22012V5.f102051g) != null) {
                        baseTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    C45378e c45378eM22012V6 = m22012V3();
                    if (c45378eM22012V6 != null && (baseTextView = c45378eM22012V6.f102051g) != null) {
                        baseTextView.setText(spannableStringBuilderM66705t);
                    }
                    C45378e c45378eM22012V7 = m22012V3();
                    if (c45378eM22012V7 != null && (imageView2 = c45378eM22012V7.f102048d) != null) {
                        ViewExtKt.m66594y(imageView2);
                    }
                    C45378e c45378eM22012V8 = m22012V3();
                    if (c45378eM22012V8 != null && (linearLayout3 = c45378eM22012V8.f102046b) != null) {
                        ViewExtKt.m66594y(linearLayout3);
                    }
                    C45378e c45378eM22012V9 = m22012V3();
                    if (c45378eM22012V9 != null && (imageView = c45378eM22012V9.f102048d) != null) {
                        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.core.biz.notice.b
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ImportNoticeFragmentBase.m22009a4(this.f20547b);
                            }
                        }, 1, null);
                        return;
                    }
                    return;
                }
                C45378e c45378eM22012V10 = m22012V3();
                if (c45378eM22012V10 != null && (linearLayout2 = c45378eM22012V10.f102046b) != null) {
                    ViewExtKt.m66577h(linearLayout2);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
            C45378e c45378eM22012V11 = m22012V3();
            if (c45378eM22012V11 != null && (linearLayout = c45378eM22012V11.f102046b) != null) {
                ViewExtKt.m66577h(linearLayout);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final InterfaceC41775x1 m22014b4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new ImportNoticeFragmentBase$startCollectSymbolChange$1(this, null));
    }

    /* JADX INFO: renamed from: c4 */
    public final InterfaceC41775x1 m22015c4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new ImportNoticeFragmentBase$startCollectSymbolInfoChange$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m22017f4() {
        boolean z11;
        if (!((UiState) getState()).getShowImportantNotice() && !((UiState) getState()).getShowEtfTips() && !((UiState) getState()).getShowRiskTips()) {
            z11 = false;
        } else {
            z11 = true;
        }
        m21015H3(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m22018g4() {
        SpotTradeRiskTipView spotTradeRiskTipView;
        SpotTradeRiskTipView spotTradeRiskTipView2;
        SpotTradeRiskTipView spotTradeRiskTipView3;
        if (((UiState) getState()).getShowRiskTips()) {
            C45378e c45378eM22012V3 = m22012V3();
            if (c45378eM22012V3 != null && (spotTradeRiskTipView3 = c45378eM22012V3.f102049e) != null) {
                ViewExtKt.m66594y(spotTradeRiskTipView3);
            }
            C45378e c45378eM22012V4 = m22012V3();
            if (c45378eM22012V4 != null && (spotTradeRiskTipView2 = c45378eM22012V4.f102049e) != null) {
                spotTradeRiskTipView2.m23399d(((UiState) getState()).getRiskTips(), ((UiState) getState()).getSymbol());
                return;
            }
            return;
        }
        C45378e c45378eM22012V5 = m22012V3();
        if (c45378eM22012V5 != null && (spotTradeRiskTipView = c45378eM22012V5.f102049e) != null) {
            ViewExtKt.m66577h(spotTradeRiskTipView);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        SpotImportantNoticeView spotImportantNoticeView;
        super.initView();
        C45378e c45378eM22012V3 = m22012V3();
        if (c45378eM22012V3 != null && (spotImportantNoticeView = c45378eM22012V3.f102047c) != null) {
            spotImportantNoticeView.setOnViewHiddenListener(new Function0() { // from class: com.kubi.core.biz.notice.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImportNoticeFragmentBase.m22006W3(this.f20546b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        m22008Y3();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m22008Y3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (!this.f20537Z) {
            List<SpotBannerItemEntity> importantNoticeList = ((UiState) getState()).getImportantNoticeList();
            if (importantNoticeList != null && !importantNoticeList.isEmpty()) {
                return;
            }
            ISpotCommonService.f49644a.get().mo59976t(new Function0() { // from class: com.kubi.core.biz.notice.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImportNoticeFragmentBase.m22007X3(this.f20548b);
                }
            });
        }
    }
}
