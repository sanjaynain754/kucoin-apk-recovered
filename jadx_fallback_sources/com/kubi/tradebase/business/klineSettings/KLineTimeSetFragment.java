package com.kubi.tradebase.business.klineSettings;

/* JADX INFO: compiled from: KLineTimeSetFragment.kt */
/* JADX INFO: loaded from: classes48.dex */
@kotlin.Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u000e\u0010\u001c\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetAdapter;", "selectedMap", "", "", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "", "view", "initView", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConfirm", "handleReset", "handleItemClick", "position", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKLineTimeSetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineTimeSetFragment.kt\ncom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n147#2,16:157\n1869#3,2:173\n1869#3,2:175\n1869#3,2:177\n*S KotlinDebug\n*F\n+ 1 KLineTimeSetFragment.kt\ncom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment\n*L\n28#1:157,16\n73#1:173,2\n91#1:175,2\n110#1:177,2\n*E\n"})
public final class KLineTimeSetFragment extends com.kubi.sdk.BaseFragment {

    /* JADX INFO: renamed from: X */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.Companion f51517X = null;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] f51518Y = null;

    /* JADX INFO: renamed from: U */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a f51519U;

    /* JADX INFO: renamed from: V */
    @org.jetbrains.annotations.Nullable
    public com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter f51520V;

    /* JADX INFO: renamed from: W */
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, java.lang.Boolean> f51521W;

    /* JADX INFO: compiled from: KLineTimeSetFragment.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetFragment$Companion;", "", "<init>", "()V", "MAX_SELECTED_COUNTS", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4 */
    /* JADX INFO: compiled from: KLineTimeSetFragment.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4", m90122f = "KLineTimeSetFragment.kt", m90123i = {}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C258594 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment this$0;

        public C258594(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r1, kotlin.coroutines.Continuation<? super com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.C258594> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4 r2 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4
                com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0 = r1.this$0
                r2.<init>(r0, r3)
                return r2
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4 r1 = (com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.C258594) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L25
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r4 = r3.this$0
                r3.label = r2
                java.lang.Object r4 = com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.m63135m3(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r1 = "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseFragmentKlineTimeSetBinding;"
            r2 = 0
            java.lang.Class<com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment> r3 = com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.class
            java.lang.String r4 = "binding"
            r0.<init>(r3, r4, r1, r2)
            kotlin.reflect.KProperty1 r0 = kotlin.jvm.internal.Reflection.property1(r0)
            r1 = 1
            kotlin.reflect.KProperty[] r1 = new kotlin.reflect.KProperty[r1]
            r1[r2] = r0
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.f51518Y = r1
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$Companion r0 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$Companion
            r1 = 0
            r0.<init>(r1)
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.f51517X = r0
            return
    }

    public KLineTimeSetFragment() {
            r2 = this;
            r2.<init>()
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$1 r0 = com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$1.INSTANCE
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$2 r1 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$special$$inlined$viewBindingFragment$2
            r1.<init>(r2)
            com.kubi.sdk.viewbindingdelegate.base.a r0 = w00.C45681e.m100799e(r2, r1, r0)
            r2.f51519U = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f51521W = r0
            return
    }

    private final void initView() {
            r7 = this;
            n30.g r0 = r7.m63139n3()
            if (r0 == 0) goto L2e
            com.kubi.resources.widget.BaseTextView r0 = r0.f94614e
            if (r0 == 0) goto L2e
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r1 = com.kubi.tradebase.R$string.kc_kline_default_timecycle_show
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 2
            java.lang.String r3 = "5"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r3}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.setText(r1)
        L2e:
            n30.g r0 = r7.m63139n3()
            if (r0 == 0) goto L44
            com.kubi.resources.widget.button.KcSecondaryButton r1 = r0.f94613d
            if (r1 == 0) goto L44
            com.kubi.tradebase.business.klineSettings.b r4 = new com.kubi.tradebase.business.klineSettings.b
            r4.<init>(r7)
            r5 = 1
            r6 = 0
            r2 = 0
            com.kubi.utils.extensions.C27046k.m66711z(r1, r2, r4, r5, r6)
        L44:
            n30.g r0 = r7.m63139n3()
            if (r0 == 0) goto L5a
            com.kubi.resources.widget.button.KcPrimaryButton r1 = r0.f94612c
            if (r1 == 0) goto L5a
            com.kubi.tradebase.business.klineSettings.c r4 = new com.kubi.tradebase.business.klineSettings.c
            r4.<init>(r7)
            r5 = 1
            r6 = 0
            r2 = 0
            com.kubi.utils.extensions.C27046k.m66711z(r1, r2, r4, r5, r6)
        L5a:
            n30.g r0 = r7.m63139n3()
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView r0 = r0.f94611b
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r7.getContext()
            r3 = 3
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
        L71:
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r0 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter
            r0.<init>()
            r7.f51520V = r0
            n30.g r0 = r7.m63139n3()
            if (r0 == 0) goto L87
            androidx.recyclerview.widget.RecyclerView r0 = r0.f94611b
            if (r0 == 0) goto L87
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r1 = r7.f51520V
            r0.setAdapter(r1)
        L87:
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r0 = r7.f51520V
            if (r0 == 0) goto L93
            com.kubi.tradebase.business.klineSettings.d r1 = new com.kubi.tradebase.business.klineSettings.d
            r1.<init>(r7)
            r0.setOnItemClickListener(r1)
        L93:
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4 r1 = new com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment$initView$4
            r2 = 0
            r1.<init>(r7, r2)
            r0.launchWhenStarted(r1)
            return
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ kotlin.Unit m63132j3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0) {
            kotlin.Unit r0 = m63136s3(r0)
            return r0
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m63133k3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0, io.chad.library.adapter.base.BaseQuickAdapter r1, android.view.View r2, int r3) {
            m63138u3(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ kotlin.Unit m63134l3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0) {
            kotlin.Unit r0 = m63137t3(r0)
            return r0
    }

    /* JADX INFO: renamed from: m3 */
    public static final /* synthetic */ java.lang.Object m63135m3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m63143r3(r1)
            return r0
    }

    /* JADX INFO: renamed from: s3 */
    public static final kotlin.Unit m63136s3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0) {
            r0.m63142q3()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: t3 */
    public static final kotlin.Unit m63137t3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0) {
            r0.m63140o3()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m63138u3(com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment r0, io.chad.library.adapter.base.BaseQuickAdapter r1, android.view.View r2, int r3) {
            r0.m63141p3(r3)
            return
    }

    /* JADX INFO: renamed from: n3 */
    public final n30.C42731g m63139n3() {
            r3 = this;
            com.kubi.sdk.viewbindingdelegate.base.a r0 = r3.f51519U
            kotlin.reflect.KProperty<java.lang.Object>[] r1 = com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment.f51518Y
            r2 = 0
            r1 = r1[r2]
            androidx.viewbinding.ViewBinding r0 = r0.getValue(r3, r1)
            n30.g r0 = (n30.C42731g) r0
            return r0
    }

    /* JADX INFO: renamed from: o3 */
    public final void m63140o3() {
            r4 = this;
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r0 = r4.f51520V
            if (r0 == 0) goto L3b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r0.getData()
            java.lang.String r2 = "getData(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            com.kubi.tradebase.business.klineSettings.KLineTimeEntity r2 = (com.kubi.tradebase.business.klineSettings.KLineTimeEntity) r2
            boolean r3 = r2.isSelected()
            if (r3 == 0) goto L16
            r3 = 0
            r2.setSelected(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.add(r2)
            goto L16
        L33:
            com.kubi.tradebase.business.klineSettings.KLineSettingsManager r0 = com.kubi.tradebase.business.klineSettings.KLineSettingsManager.f51515a
            r0.m63126k(r1)
            r4.preformBackPressed()
        L3b:
            return
    }

    @Override // com.kubi.sdk.BaseFragment
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup r3) {
            r0 = this;
            java.lang.String r2 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = com.kubi.tradebase.R$layout.btradebase_fragment_kline_time_set
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            java.lang.String r2 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            super.onViewCreated(r2, r3)
            r1.initView()
            return
    }

    /* JADX INFO: renamed from: p3 */
    public final void m63141p3(int r11) {
            r10 = this;
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r0 = r10.f51520V
            if (r0 == 0) goto Lb7
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = r10.f51521W
            int r1 = r1.size()
            java.util.List r2 = r0.getData()
            java.lang.Object r2 = r2.get(r11)
            com.kubi.tradebase.business.klineSettings.KLineTimeEntity r2 = (com.kubi.tradebase.business.klineSettings.KLineTimeEntity) r2
            boolean r3 = r2.isSelected()
            java.lang.String r4 = "format(...)"
            java.lang.String r5 = "5"
            java.lang.String r6 = "getString(...)"
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L33
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = r10.f51521W
            int r3 = r2.getTag()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.remove(r3)
            r2.setSelected(r8)
            goto L68
        L33:
            r3 = 5
            if (r1 >= r3) goto L49
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = r10.f51521W
            int r3 = r2.getTag()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r1.put(r3, r9)
            r2.setSelected(r7)
            goto L68
        L49:
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r1 = com.kubi.tradebase.R$string.kc_kline_timecycle_toast
            java.lang.String r1 = r10.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r7)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.kubi.utils.ToastCompat.m66441G(r1, r2)
        L68:
            n30.g r1 = r10.m63139n3()
            r2 = 2
            if (r1 == 0) goto L83
            com.kubi.resources.widget.button.KcPrimaryButton r1 = r1.f94612c
            if (r1 == 0) goto L83
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r10.f51521W
            int r3 = r3.size()
            if (r2 > r3) goto L7f
            r9 = 6
            if (r3 >= r9) goto L7f
            goto L80
        L7f:
            r7 = r8
        L80:
            r1.setEnabled(r7)
        L83:
            n30.g r1 = r10.m63139n3()
            if (r1 == 0) goto Lb4
            com.kubi.resources.widget.BaseTextView r1 = r1.f94614e
            if (r1 == 0) goto Lb4
            kotlin.jvm.internal.StringCompanionObject r3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r3 = com.kubi.tradebase.R$string.kc_kline_default_timecycle_show
            java.lang.String r3 = r10.getString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r6 = r10.f51521W
            int r6 = r6.size()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r1.setText(r2)
        Lb4:
            r0.notifyItemChanged(r11)
        Lb7:
            return
    }

    /* JADX INFO: renamed from: q3 */
    public final void m63142q3() {
            r4 = this;
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r4.f51521W
            r0.clear()
            com.kubi.tradebase.business.klineSettings.KLineTimeSetAdapter r0 = r4.f51520V
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.List r2 = r0.getData()
            java.lang.String r3 = "getData(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            com.kubi.tradebase.business.klineSettings.KLineTimeEntity r3 = (com.kubi.tradebase.business.klineSettings.KLineTimeEntity) r3
            r3.setSelected(r1)
            goto L17
        L27:
            r0.notifyDataSetChanged()
        L2a:
            n30.g r0 = r4.m63139n3()
            if (r0 == 0) goto L37
            com.kubi.resources.widget.button.KcPrimaryButton r0 = r0.f94612c
            if (r0 == 0) goto L37
            r0.setEnabled(r1)
        L37:
            n30.g r0 = r4.m63139n3()
            if (r0 == 0) goto L67
            com.kubi.resources.widget.BaseTextView r0 = r0.f94614e
            if (r0 == 0) goto L67
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r1 = com.kubi.tradebase.R$string.kc_kline_default_timecycle_show
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "0"
            java.lang.String r3 = "5"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r3 = 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.setText(r1)
        L67:
            return
    }

    /* JADX INFO: renamed from: r3 */
    public final java.lang.Object m63143r3(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            kotlin.ResultKt.throwOnFailure(r12)
            goto L83
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L44:
            kotlin.ResultKt.throwOnFailure(r12)
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
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$1 = r10
            r0.L$2 = r6
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
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
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
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
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }
}
