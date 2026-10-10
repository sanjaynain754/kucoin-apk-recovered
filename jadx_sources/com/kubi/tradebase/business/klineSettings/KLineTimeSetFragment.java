package com.kubi.tradebase.business.klineSettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$string;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import n30.C42731g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: KLineTimeSetFragment.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u000e\u0010\u001c\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetAdapter;", "selectedMap", "", "", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConfirm", "handleReset", "handleItemClick", ViewProps.POSITION, "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineTimeSetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineTimeSetFragment.kt\ncom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n147#2,16:157\n1869#3,2:173\n1869#3,2:175\n1869#3,2:177\n*S KotlinDebug\n*F\n+ 1 KLineTimeSetFragment.kt\ncom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment\n*L\n28#1:157,16\n73#1:173,2\n91#1:175,2\n110#1:177,2\n*E\n"})
public final class KLineTimeSetFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @Nullable
    public KLineTimeSetAdapter f51520V;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f51518Y = {Reflection.property1(new PropertyReference1Impl(KLineTimeSetFragment.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f51517X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51519U = C45681e.m100799e(this, new Function1<KLineTimeSetFragment, C42731g>() { // from class: com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42731g invoke(@NotNull KLineTimeSetFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42731g.m93633a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42731g, Unit>() { // from class: com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42731g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42731g c42731g) {
            invoke(c42731g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Map<Integer, Boolean> f51521W = new LinkedHashMap();

    /* JADX INFO: compiled from: KLineTimeSetFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment$Companion;", "", "<init>", "()V", "MAX_SELECTED_COUNTS", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4 */
    /* JADX INFO: compiled from: KLineTimeSetFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4", m90122f = "KLineTimeSetFragment.kt", m90123i = {}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C258594 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C258594(Continuation<? super C258594> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KLineTimeSetFragment.this.new C258594(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C258594) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KLineTimeSetFragment kLineTimeSetFragment = KLineTimeSetFragment.this;
                this.label = 1;
                if (kLineTimeSetFragment.m63143r3(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final C42731g m63139n3() {
        return (C42731g) this.f51519U.getValue(this, f51518Y[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m63140o3() {
        KLineTimeSetAdapter kLineTimeSetAdapter = this.f51520V;
        if (kLineTimeSetAdapter != null) {
            ArrayList arrayList = new ArrayList();
            List<KLineTimeEntity> data = kLineTimeSetAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            for (KLineTimeEntity kLineTimeEntity : data) {
                if (kLineTimeEntity.isSelected()) {
                    kLineTimeEntity.setSelected(false);
                    Intrinsics.checkNotNull(kLineTimeEntity);
                    arrayList.add(kLineTimeEntity);
                }
            }
            KLineSettingsManager.f51515a.m63126k(arrayList);
            preformBackPressed();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btradebase_fragment_kline_time_set, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: p3 */
    public final void m63141p3(int i11) {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        KLineTimeSetAdapter kLineTimeSetAdapter = this.f51520V;
        if (kLineTimeSetAdapter != null) {
            int size = this.f51521W.size();
            KLineTimeEntity kLineTimeEntity = kLineTimeSetAdapter.getData().get(i11);
            if (kLineTimeEntity.isSelected()) {
                this.f51521W.remove(Integer.valueOf(kLineTimeEntity.getTag()));
                kLineTimeEntity.setSelected(false);
            } else if (size < 5) {
                this.f51521W.put(Integer.valueOf(kLineTimeEntity.getTag()), Boolean.TRUE);
                kLineTimeEntity.setSelected(true);
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R$string.kc_kline_timecycle_toast);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{"5"}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ToastCompat.m66441G(str, new Object[0]);
            }
            C42731g c42731gM63139n3 = m63139n3();
            if (c42731gM63139n3 != null && (kcPrimaryButton = c42731gM63139n3.f94612c) != null) {
                int size2 = this.f51521W.size();
                kcPrimaryButton.setEnabled(2 <= size2 && size2 < 6);
            }
            C42731g c42731gM63139n4 = m63139n3();
            if (c42731gM63139n4 != null && (baseTextView = c42731gM63139n4.f94614e) != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = getString(R$string.kc_kline_default_timecycle_show);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(this.f51521W.size()), "5"}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                baseTextView.setText(str2);
            }
            kLineTimeSetAdapter.notifyItemChanged(i11);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m63142q3() {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        this.f51521W.clear();
        KLineTimeSetAdapter kLineTimeSetAdapter = this.f51520V;
        if (kLineTimeSetAdapter != null) {
            List<KLineTimeEntity> data = kLineTimeSetAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                ((KLineTimeEntity) it.next()).setSelected(false);
            }
            kLineTimeSetAdapter.notifyDataSetChanged();
        }
        C42731g c42731gM63139n3 = m63139n3();
        if (c42731gM63139n3 != null && (kcPrimaryButton = c42731gM63139n3.f94612c) != null) {
            kcPrimaryButton.setEnabled(false);
        }
        C42731g c42731gM63139n4 = m63139n3();
        if (c42731gM63139n4 == null || (baseTextView = c42731gM63139n4.f94614e) == null) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R$string.kc_kline_default_timecycle_show);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{"0", "5"}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:20:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: r3 */
    public final java.lang.Object m63143r3(p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initData$1
            if (r0 == 0) goto L13
            r0 = r12
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initData$1 r0 = (com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initData$1 r0 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initData$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$4
            com.kubi.tradebase.business.klineSettings.KLineTimeEntity r5 = (com.kubi.tradebase.business.klineSettings.KLineTimeEntity) r5
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            p852kotlin.ResultKt.throwOnFailure(r12)
            goto L83
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L44:
            p852kotlin.ResultKt.throwOnFailure(r12)
            com.kubi.tradebase.business.klineSettings.KLineSettingsManager r12 = com.kubi.tradebase.business.klineSettings.KLineSettingsManager.f51515a
            java.util.List r12 = r12.m63121f()
            java.util.Iterator r2 = r12.iterator()
            r7 = r12
            r8 = r7
            r6 = r2
            r2 = r3
        L55:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto La4
            java.lang.Object r12 = r6.next()
            r5 = r12
            com.kubi.tradebase.business.klineSettings.KLineTimeEntity r5 = (com.kubi.tradebase.business.klineSettings.KLineTimeEntity) r5
            com.kubi.tradebase.business.klineSettings.KLineSettingsManager r9 = com.kubi.tradebase.business.klineSettings.KLineSettingsManager.f51515a
            r0.L$0 = r8
            java.lang.Object r10 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$1 = r10
            r0.L$2 = r6
            java.lang.Object r12 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r0.L$3 = r12
            r0.L$4 = r5
            r0.I$0 = r2
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r12 = r9.m63124i(r0)
            if (r12 != r1) goto L83
            return r1
        L83:
            java.util.List r12 = (java.util.List) r12
            boolean r12 = r12.contains(r5)
            if (r12 == 0) goto La0
            java.util.Map<java.lang.Integer, java.lang.Boolean> r12 = r11.f51521W
            int r9 = r5.getTag()
            java.lang.Integer r9 = p852kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            java.lang.Boolean r10 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r12.put(r9, r10)
            r5.setSelected(r4)
            goto L55
        La0:
            r5.setSelected(r3)
            goto L55
        La4:
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r12 = r11.f51520V
            if (r12 == 0) goto Lab
            r12.addData(r8)
        Lab:
            kotlin.Unit r12 = p852kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.m63143r3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
        BaseTextView baseTextView;
        C42731g c42731gM63139n3 = m63139n3();
        if (c42731gM63139n3 != null && (baseTextView = c42731gM63139n3.f94614e) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R$string.kc_kline_default_timecycle_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{"5", "5"}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            baseTextView.setText(str);
        }
        C42731g c42731gM63139n4 = m63139n3();
        if (c42731gM63139n4 != null && (kcSecondaryButton = c42731gM63139n4.f94613d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.tradebase.business.klineSettings.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineTimeSetFragment.m63136s3(this.f51529b);
                }
            }, 1, null);
        }
        C42731g c42731gM63139n5 = m63139n3();
        if (c42731gM63139n5 != null && (kcPrimaryButton = c42731gM63139n5.f94612c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.tradebase.business.klineSettings.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineTimeSetFragment.m63137t3(this.f51530b);
                }
            }, 1, null);
        }
        C42731g c42731gM63139n6 = m63139n3();
        if (c42731gM63139n6 != null && (recyclerView2 = c42731gM63139n6.f94611b) != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        this.f51520V = new KLineTimeSetAdapter();
        C42731g c42731gM63139n7 = m63139n3();
        if (c42731gM63139n7 != null && (recyclerView = c42731gM63139n7.f94611b) != null) {
            recyclerView.setAdapter(this.f51520V);
        }
        KLineTimeSetAdapter kLineTimeSetAdapter = this.f51520V;
        if (kLineTimeSetAdapter != null) {
            kLineTimeSetAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.tradebase.business.klineSettings.d
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    KLineTimeSetFragment.m63138u3(this.f51531a, baseQuickAdapter, view, i11);
                }
            });
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C258594(null));
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m63136s3(KLineTimeSetFragment kLineTimeSetFragment) {
        kLineTimeSetFragment.m63142q3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m63137t3(KLineTimeSetFragment kLineTimeSetFragment) {
        kLineTimeSetFragment.m63140o3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m63138u3(KLineTimeSetFragment kLineTimeSetFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        kLineTimeSetFragment.m63141p3(i11);
    }
}
