package com.kubi.kumex.record;

/* JADX INFO: compiled from: DelegationOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@kotlin.Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0014J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0014J\u001a\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0006H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/kumex/record/DelegationOrderDetailFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "<init>", "()V", "orderItem", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getOrderItem", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "orderItem$delegate", "Lkotlin/Lazy;", "lastPage", "Lcom/kubi/sdk/PageEntity;", "getItemLayout", "", "refreshData", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindHeaderData", "baseViewHolder", "entity", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelegationOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationOrderDetailFragment.kt\ncom/kubi/kumex/record/DelegationOrderDetailFragment\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,365:1\n55#2:366\n55#2:367\n28#3:368\n20#3:369\n28#3:370\n20#3:371\n*S KotlinDebug\n*F\n+ 1 DelegationOrderDetailFragment.kt\ncom/kubi/kumex/record/DelegationOrderDetailFragment\n*L\n209#1:366\n214#1:367\n349#1:368\n349#1:369\n358#1:370\n358#1:371\n*E\n"})
public final class DelegationOrderDetailFragment extends com.kubi.sdk.base.p113ui.BasePagingFragment<com.kubi.kumex.data.assets.model.TradeRecordEntity> {

    /* JADX INFO: renamed from: Z */
    @org.jetbrains.annotations.NotNull
    public final kotlin.Lazy f29890Z;

    /* JADX INFO: renamed from: a0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.sdk.PageEntity<com.kubi.kumex.data.assets.model.TradeRecordEntity> f29891a0;

    public DelegationOrderDetailFragment() {
            r1 = this;
            r1.<init>()
            com.kubi.kumex.record.k r0 = new com.kubi.kumex.record.k
            r0.<init>(r1)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.f29890Z = r0
            return
    }

    /* JADX INFO: renamed from: H3 */
    public static /* synthetic */ com.kubi.sdk.base.entity.BasePageEntity m35150H3(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            com.kubi.sdk.base.entity.BasePageEntity r0 = m35162V3(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: I3 */
    public static /* synthetic */ void m35151I3(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            m35160T3(r0, r1)
            return
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ kotlin.Unit m35152J3(com.kubi.kumex.data.trade.model.OrderEntity r0, com.kubi.kumex.record.DelegationOrderDetailFragment r1) {
            kotlin.Unit r0 = m35157Q3(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ kotlin.Unit m35153K3(com.kubi.kumex.record.DelegationOrderDetailFragment r0, com.kubi.sdk.PageEntity r1) {
            kotlin.Unit r0 = m35159S3(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ com.kubi.kumex.data.trade.model.OrderEntity m35154L3(com.kubi.kumex.record.DelegationOrderDetailFragment r0) {
            com.kubi.kumex.data.trade.model.OrderEntity r0 = m35163X3(r0)
            return r0
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ com.kubi.sdk.PageEntity m35155M3(com.kubi.kumex.record.DelegationOrderDetailFragment r0, int r1, int r2) {
            com.kubi.sdk.PageEntity r0 = m35158R3(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ com.kubi.sdk.base.entity.BasePageEntity m35156N3(com.kubi.sdk.PageEntity r0) {
            com.kubi.sdk.base.entity.BasePageEntity r0 = m35161U3(r0)
            return r0
    }

    /* JADX INFO: renamed from: Q3 */
    public static final kotlin.Unit m35157Q3(com.kubi.kumex.data.trade.model.OrderEntity r7, com.kubi.kumex.record.DelegationOrderDetailFragment r8) {
            java.lang.String r0 = r7.getCancelReason()
            if (r0 == 0) goto L47
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto L47
        Ld:
            java.lang.String r1 = com.kubi.kumex.utils.C17060n0.m36552b()
            r5 = 12
            r6 = 0
            java.lang.String r2 = "cancelReason"
            r3 = 0
            r4 = 0
            p569qq.C43852m.m96591c(r1, r2, r3, r4, r5, r6)
            com.kubi.resources.dialog.AlertDialogFragmentHelper$Companion r0 = com.kubi.resources.dialog.AlertDialogFragmentHelper.f43512a1
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r0.newInstanceAlert()
            int r1 = com.kubi.kumex.R$string.cancel_reason_title
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r0.m54167X4(r1)
            java.lang.String r7 = r7.getCancelReason()
            com.kubi.resources.dialog.AlertDialogFragmentHelper r7 = r0.m54156M4(r7)
            int r0 = com.kubi.kumex.R$string.i_know
            r1 = 0
            com.kubi.resources.dialog.AlertDialogFragmentHelper r7 = r7.m54162S4(r0, r1)
            androidx.fragment.app.FragmentManager r8 = r8.getChildFragmentManager()
            java.lang.String r0 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.lang.String r0 = "onStatusViewClick"
            r7.show(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L47:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    /* JADX INFO: renamed from: R3 */
    public static final com.kubi.sdk.PageEntity m35158R3(com.kubi.kumex.record.DelegationOrderDetailFragment r16, int r17, int r18) {
            r0 = r16
            com.kubi.broker.m r1 = com.kubi.broker.C11369m.f19232a
            com.kubi.kumex.data.trade.model.OrderEntity r2 = r0.m35166W3()
            if (r2 == 0) goto L10
            com.kubi.broker.MultiBizType r2 = r2.getMultiBizType()
            if (r2 != 0) goto L12
        L10:
            com.kubi.broker.MultiBizType r2 = com.kubi.broker.MultiBizType.CLASSIC
        L12:
            rg.b r1 = r1.m20272m(r2)
            com.kubi.sdk.PageEntity<com.kubi.kumex.data.assets.model.TradeRecordEntity> r2 = r0.f29891a0
            r3 = 0
            if (r2 == 0) goto L24
            int r2 = r2.getOffset()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L25
        L24:
            r2 = r3
        L25:
            int r10 = com.kubi.utils.extensions.C27039d.m66650j(r2)
            com.kubi.sdk.PageEntity<com.kubi.kumex.data.assets.model.TradeRecordEntity> r2 = r0.f29891a0
            if (r2 == 0) goto L36
            int r2 = r2.getTrialOffset()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L37
        L36:
            r2 = r3
        L37:
            int r13 = com.kubi.utils.extensions.C27039d.m66650j(r2)
            com.kubi.kumex.data.trade.model.OrderEntity r2 = r0.m35166W3()
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.getId()
            goto L47
        L46:
            r2 = r3
        L47:
            if (r2 != 0) goto L4b
            java.lang.String r2 = ""
        L4b:
            r7 = r2
            com.kubi.kumex.data.trade.model.OrderEntity r0 = r0.m35166W3()
            if (r0 == 0) goto L56
            java.lang.Long r3 = r0.getCreatedAt()
        L56:
            r11 = r3
            am.d r4 = new am.d
            r14 = 131(0x83, float:1.84E-43)
            r15 = 0
            r5 = 0
            r6 = 0
            r12 = 0
            r8 = r17
            r9 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.kubi.sdk.PageEntity r0 = r1.mo83053O0(r4)
            return r0
    }

    /* JADX INFO: renamed from: S3 */
    public static final kotlin.Unit m35159S3(com.kubi.kumex.record.DelegationOrderDetailFragment r0, com.kubi.sdk.PageEntity r1) {
            r0.f29891a0 = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m35160T3(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }

    /* JADX INFO: renamed from: U3 */
    public static final com.kubi.sdk.base.entity.BasePageEntity m35161U3(com.kubi.sdk.PageEntity r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.kubi.sdk.base.entity.BasePageEntity r0 = new com.kubi.sdk.base.entity.BasePageEntity
            r0.<init>()
            java.util.List r1 = r2.getItems()
            r0.setItems(r1)
            boolean r2 = r2.getHasNext()
            r0.setHasNext(r2)
            return r0
    }

    /* JADX INFO: renamed from: V3 */
    public static final com.kubi.sdk.base.entity.BasePageEntity m35162V3(kotlin.jvm.functions.Function1 r1, java.lang.Object r2) {
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r1 = r1.invoke(r2)
            com.kubi.sdk.base.entity.BasePageEntity r1 = (com.kubi.sdk.base.entity.BasePageEntity) r1
            return r1
    }

    /* JADX INFO: renamed from: X3 */
    public static final com.kubi.kumex.data.trade.model.OrderEntity m35163X3(com.kubi.kumex.record.DelegationOrderDetailFragment r1) {
            android.os.Bundle r1 = r1.getArguments()
            if (r1 == 0) goto Lf
            java.lang.String r0 = "data"
            android.os.Parcelable r1 = com.kubi.router.utils.RouteExKt.m56274t(r1, r0)
            com.kubi.kumex.data.trade.model.OrderEntity r1 = (com.kubi.kumex.data.trade.model.OrderEntity) r1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
            r1 = this;
            r0 = 0
            r1.f29891a0 = r0
            super.mo15906F3()
            return
    }

    /* JADX INFO: renamed from: O3 */
    public void m35164O3(@org.jetbrains.annotations.NotNull io.chad.library.adapter.base.BaseViewHolder r19, @org.jetbrains.annotations.NotNull com.kubi.kumex.data.assets.model.TradeRecordEntity r20) {
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "helper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.kubi.kumex.record.u1 r2 = new com.kubi.kumex.record.u1
            r2.<init>(r1)
            java.math.BigDecimal r3 = r1.getTax()
            boolean r3 = p402kf.C41014a.m89917B(r3)
            r4 = 1
            r3 = r3 ^ r4
            java.math.BigDecimal r5 = r1.getFillPnl()
            r6 = 0
            if (r5 == 0) goto L26
            r5 = r4
            goto L27
        L26:
            r5 = r6
        L27:
            java.lang.String r7 = r2.m35829e()
            if (r7 == 0) goto L2e
            r6 = r4
        L2e:
            int r7 = com.kubi.kumex.R$id.tv_time
            java.lang.Long r8 = r1.getCreatedAt()
            r9 = 0
            if (r8 == 0) goto L48
            long r10 = r8.longValue()
            r16 = 15
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r8 = p429lf.C42179a.m92633f(r10, r12, r13, r14, r15, r16, r17)
            goto L49
        L48:
            r8 = r9
        L49:
            java.lang.String r8 = p429lf.C42180b.m92647l(r8)
            io.chad.library.adapter.base.BaseViewHolder r7 = r0.setText(r7, r8)
            int r8 = com.kubi.kumex.R$id.tv_amount
            java.lang.String r10 = r2.m35825a()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r8, r10)
            int r8 = com.kubi.kumex.R$id.tv_price
            java.lang.String r10 = r2.m35831g()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r8, r10)
            int r8 = com.kubi.kumex.R$id.tv_deal_amount
            java.lang.String r10 = r2.m35841q()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r8, r10)
            int r8 = com.kubi.kumex.R$id.tv_realised_pnl
            java.lang.String r10 = r2.m35833i()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r8, r10)
            int r10 = com.kubi.kumex.R$id.tv_fee
            java.lang.String r11 = r2.m35827c()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r10, r11)
            int r10 = com.kubi.kumex.R$id.tv_tax
            java.lang.String r11 = r2.m35837m()
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r10, r11)
            int r11 = com.kubi.kumex.R$id.tv_tax_currency
            java.lang.String r12 = r1.getTaxCurrency()
            java.lang.String r12 = com.kubi.utils.extensions.C27041f.m66677q(r12)
            java.lang.String r13 = r1.getFeeCurrency()
            java.lang.String r13 = com.kubi.utils.extensions.C27041f.m66677q(r13)
            java.lang.String r13 = com.kubi.utils.extensions.C27041f.m66668h(r13)
            java.lang.String r12 = com.kubi.utils.extensions.C27041f.m66669i(r12, r13)
            io.chad.library.adapter.base.BaseViewHolder r7 = r7.setText(r11, r12)
            int r12 = com.kubi.kumex.R$id.tvRoleValue
            java.lang.String r2 = r2.m35829e()
            io.chad.library.adapter.base.BaseViewHolder r2 = r7.setText(r12, r2)
            int r7 = com.kubi.kumex.R$id.tvRole
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r7, r6)
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r12, r6)
            int r6 = com.kubi.kumex.R$id.tv_currency
            java.lang.String r7 = r1.getFeeCurrency()
            java.lang.String r7 = com.kubi.utils.extensions.C27041f.m66677q(r7)
            java.lang.String r7 = p429lf.C42180b.m92647l(r7)
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setText(r6, r7)
            int r6 = com.kubi.kumex.R$id.tv_realised_pnl_name
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r6, r5)
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r8, r5)
            int r5 = com.kubi.kumex.R$id.tv_tax_name
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r5, r3)
            io.chad.library.adapter.base.BaseViewHolder r2 = r2.setGone(r10, r3)
            r2.setGone(r11, r3)
            android.view.View r0 = r0.getView(r8)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r2 = r18.requireContext()
            java.lang.String r3 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.math.BigDecimal r1 = r1.getFillPnl()
            java.math.BigDecimal r1 = p402kf.C41014a.m89922G(r1, r9, r4, r9)
            int r3 = com.kubi.kumex.R$color.c_text
            int r1 = com.kubi.resources.C22890g.m54280e(r2, r1, r3)
            r0.setTextColor(r1)
            return
    }

    /* JADX INFO: renamed from: P3 */
    public final void m35165P3(io.chad.library.adapter.base.BaseViewHolder r28, com.kubi.kumex.data.trade.model.OrderEntity r29) {
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            com.kubi.broker.r r0 = com.kubi.broker.C11374r.f19236a
            th.d r0 = r0.m20288g()
            java.lang.String r4 = r3.getSymbol()
            java.lang.String r4 = com.kubi.utils.extensions.C27041f.m66668h(r4)
            r10 = 0
            r11 = 2
            r12 = 0
            com.kubi.kumex.data.platform.model.ContractEntity r4 = th.InterfaceC44980d.m99529O(r0, r4, r10, r11, r12)
            int r0 = com.kubi.kumex.R$id.tv_symbols
            if (r4 == 0) goto L26
            com.kubi.futures.a r5 = com.kubi.futures.C12824a.f22525a
            com.kubi.utils.v0 r5 = r5.m24440e(r4)
            goto L27
        L26:
            r5 = r12
        L27:
            java.lang.String r6 = r3.getSymbol()
            java.lang.String r6 = com.kubi.utils.extensions.C27041f.m66668h(r6)
            java.lang.CharSequence r5 = com.kubi.utils.extensions.C27041f.m66667g(r5, r6)
            r2.setText(r0, r5)
            r13 = 4
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L54
            java.math.BigDecimal r0 = r3.getDealSize()     // Catch: java.lang.Throwable -> L54
            java.math.BigDecimal r0 = com.kubi.utils.extensions.C27039d.m66656p(r0)     // Catch: java.lang.Throwable -> L54
            java.math.BigDecimal r5 = r3.getSize()     // Catch: java.lang.Throwable -> L54
            java.math.BigDecimal r5 = com.kubi.utils.extensions.C27039d.m66656p(r5)     // Catch: java.lang.Throwable -> L54
            java.math.RoundingMode r6 = java.math.RoundingMode.DOWN     // Catch: java.lang.Throwable -> L54
            java.math.BigDecimal r0 = r0.divide(r5, r13, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)     // Catch: java.lang.Throwable -> L54
            goto L5f
        L54:
            r0 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)
        L5f:
            boolean r5 = kotlin.Result.m103850isFailureimpl(r0)
            if (r5 == 0) goto L66
            r0 = r12
        L66:
            r14 = r0
            java.math.BigDecimal r14 = (java.math.BigDecimal) r14
            if (r14 == 0) goto L7f
            r21 = 63
            r22 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r0 = p429lf.C42180b.m92642g(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L80
        L7f:
            r0 = r12
        L80:
            java.math.BigDecimal r14 = java.math.BigDecimal.ZERO
            java.lang.String r5 = "ZERO"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r5)
            r21 = 63
            r22 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r5 = p429lf.C42180b.m92642g(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = com.kubi.utils.extensions.C27041f.m66669i(r0, r5)
            int r5 = com.kubi.kumex.R$id.tv_status
            android.view.View r6 = r2.getView(r5)
            r14 = r6
            com.kubi.resources.widget.DashTextView r14 = (com.kubi.resources.widget.DashTextView) r14
            java.lang.String r6 = r3.getCancelReason()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 1
            r6 = r6 ^ r7
            r14.setNeedDash(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            com.kubi.kumex.record.j r6 = new com.kubi.kumex.record.j
            r6.<init>(r3, r1)
            r18 = 1
            r19 = 0
            r15 = 0
            r17 = r6
            com.kubi.utils.extensions.C27046k.m66711z(r14, r15, r17, r18, r19)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Boolean r8 = r3.getCancelExist()
            boolean r8 = com.kubi.utils.extensions.C27025c.m66566d(r8)
            if (r8 == 0) goto Leb
            java.math.BigDecimal r8 = r3.getDealSize()
            boolean r8 = p402kf.C41014a.m89917B(r8)
            if (r8 == 0) goto Leb
            com.kubi.utils.c r8 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.canceled
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.String r8 = r8.m66516f(r9, r14)
            goto L12d
        Leb:
            java.lang.Boolean r8 = r3.getStopTriggered()
            boolean r8 = com.kubi.utils.extensions.C27025c.m66566d(r8)
            if (r8 == 0) goto L10a
            java.math.BigDecimal r8 = r3.getDealSize()
            boolean r8 = p402kf.C41014a.m89917B(r8)
            if (r8 == 0) goto L10a
            com.kubi.utils.c r8 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.order_has_trigger
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.String r8 = r8.m66516f(r9, r14)
            goto L12d
        L10a:
            java.math.BigDecimal r8 = r3.getDealSize()
            java.math.BigDecimal r9 = r3.getSize()
            boolean r8 = com.kubi.kumex.utils.C17054k0.m36528b(r8, r9)
            if (r8 == 0) goto L123
            com.kubi.utils.c r8 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.full_deal
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.String r8 = r8.m66516f(r9, r14)
            goto L12d
        L123:
            com.kubi.utils.c r8 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.partial_deal
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.String r8 = r8.m66516f(r9, r14)
        L12d:
            r6.append(r8)
            r8 = 40
            r6.append(r8)
            java.lang.String r0 = nf.C42828b.m93915p(r0)
            r6.append(r0)
            r0 = 41
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.setText(r5, r6)
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.side
            android.view.View r5 = r5.findViewById(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            android.content.Context r6 = r5.getContext()
            java.lang.String r14 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)
            java.lang.String r6 = com.kubi.kumex.record.C16700e0.m35734n(r3, r6)
            r5.setText(r6)
            android.content.Context r6 = r5.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)
            java.lang.String r9 = r3.getSide()
            java.lang.String r15 = "buy"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r15)
            int r6 = com.kubi.resources.C22890g.m54281f(r6, r9)
            r5.setTextColor(r6)
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.close
            android.view.View r5 = r5.findViewById(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            boolean r6 = com.kubi.kumex.record.C16700e0.m35733m(r3)
            com.kubi.utils.extensions.C27046k.m66684G(r5, r6)
            android.content.Context r6 = r5.getContext()
            int r9 = com.kubi.kumex.R$string.kumex_close_position_brief
            java.lang.String r6 = r6.getString(r9)
            r5.setText(r6)
            android.content.Context r6 = r5.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)
            java.lang.String r9 = r3.getSide()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r15)
            int r6 = com.kubi.resources.C22890g.m54281f(r6, r9)
            r5.setTextColor(r6)
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.tradeType
            android.view.View r5 = r5.findViewById(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            java.lang.String r6 = com.kubi.kumex.record.C16700e0.m35730j(r3)
            if (r6 != 0) goto L1c9
            java.lang.String r6 = r3.getAdvancedDisplayType()
            java.lang.String r6 = com.kubi.utils.extensions.C27041f.m66668h(r6)
        L1c9:
            int r9 = r6.length()
            if (r9 != 0) goto L1d6
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            com.kubi.utils.extensions.C27046k.m66684G(r5, r10)
            goto L1df
        L1d6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            com.kubi.utils.extensions.C27046k.m66684G(r5, r7)
            r5.setText(r6)
        L1df:
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.marginMode
            android.view.View r5 = r5.findViewById(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            boolean r6 = fm.C37568c.m84634e(r3)
            if (r6 == 0) goto L1fa
            com.kubi.utils.c r6 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.kumex_cross_position
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.String r6 = r6.m66516f(r9, r15)
            goto L204
        L1fa:
            com.kubi.utils.c r6 = com.kubi.utils.C27017c.f54310a
            int r9 = com.kubi.kumex.R$string.kumex_isolate_position
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.String r6 = r6.m66516f(r9, r15)
        L204:
            r5.setText(r6)
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.leverage
            android.view.View r5 = r5.findViewById(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            java.math.BigDecimal r6 = r3.getLeverage()
            java.lang.String r6 = com.kubi.kumex.utils.C17054k0.m36530d(r6, r10, r7, r12)
            r5.setText(r6)
            android.view.View r5 = r2.itemView
            int r6 = com.kubi.kumex.R$id.trialTag
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            boolean r6 = r3.isTrialFunds()
            com.kubi.utils.extensions.C27046k.m66684G(r5, r6)
            java.lang.String r6 = r3.getPrizeType()
            java.lang.String r6 = com.kubi.utils.C27092t0.m66896a(r6)
            r5.setText(r6)
            int r5 = com.kubi.kumex.R$id.tv_amount_name
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r9 = com.kubi.kumex.R$string.dealed
            java.lang.String r9 = r1.getString(r9)
            r6.append(r9)
            r9 = 47
            r6.append(r9)
            int r15 = com.kubi.kumex.R$string.delegation_amount_stub
            com.kubi.futures.a r13 = com.kubi.futures.C12824a.f22525a
            java.lang.String r13 = r13.m24439d(r4)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r13 = r1.getString(r15, r13)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r2.setText(r5, r6)
            int r5 = com.kubi.kumex.R$id.tv_price_name
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r13 = com.kubi.kumex.R$string.deal_avg_price
            java.lang.String r13 = r1.getString(r13)
            r6.append(r13)
            r6.append(r9)
            int r9 = com.kubi.kumex.R$string.delegation_price
            java.lang.String r9 = r1.getString(r9)
            r6.append(r9)
            r6.append(r8)
            java.lang.String r9 = fm.C37567b.m84619i(r4)
            r6.append(r9)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r2.setText(r5, r6)
            int r13 = com.kubi.kumex.R$id.tv_do_price_label
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = com.kubi.kumex.R$string.trigger_price
            java.lang.String r6 = r1.getString(r6)
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = fm.C37567b.m84619i(r4)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.setText(r13, r0)
            ki.b r0 = ki.C41050b.f91264a
            ki.a r5 = r0.m90019b(r4)
            boolean r0 = fm.C37568c.m84640k(r3)
            if (r0 != 0) goto L2d0
            boolean r0 = fm.C37568c.m84641l(r3)
            if (r0 == 0) goto L2d2
        L2d0:
            r15 = r7
            goto L2ed
        L2d2:
            int r0 = com.kubi.kumex.R$id.tv_deal_amount
            r2.setVisible(r0, r7)
            int r6 = com.kubi.kumex.R$id.tv1
            r2.setVisible(r6, r7)
            java.math.BigDecimal r6 = r3.getDealSize()
            r8 = 8
            r9 = 0
            r15 = r7
            r7 = 0
            java.lang.String r6 = com.kubi.kumex.record.C16700e0.m35722b(r3, r4, r5, r6, r7, r8, r9)
            r2.setText(r0, r6)
            goto L2f7
        L2ed:
            int r0 = com.kubi.kumex.R$id.tv_deal_amount
            r2.setVisible(r0, r10)
            int r0 = com.kubi.kumex.R$id.tv1
            r2.setVisible(r0, r10)
        L2f7:
            int r0 = com.kubi.kumex.R$id.tv_amount
            java.math.BigDecimal r6 = r3.getSize()
            java.lang.String r5 = com.kubi.kumex.record.C16700e0.m35721a(r3, r4, r5, r6, r15)
            r2.setText(r0, r5)
            int r0 = com.kubi.kumex.R$id.tv_avg_price
            java.lang.String r5 = com.kubi.kumex.record.C16700e0.m35725e(r3, r4)
            java.lang.String r6 = fm.C37569d.m84684y()
            java.lang.String r5 = com.kubi.utils.extensions.C27041f.m66669i(r5, r6)
            r2.setText(r0, r5)
            int r0 = com.kubi.kumex.R$id.tv_price
            java.lang.CharSequence r5 = com.kubi.kumex.record.C16700e0.m35726f(r3, r4)
            r2.setText(r0, r5)
            java.lang.String r0 = com.kubi.kumex.record.C16700e0.m35723c(r3, r4)
            int r5 = com.kubi.kumex.R$id.tv_do_price
            r2.setText(r5, r0)
            int r6 = com.kubi.kumex.R$id.rl_stop_price
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r15
            r2.setGone(r6, r0)
            android.view.View r0 = r2.itemView
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r14)
            java.lang.String r7 = " / "
            java.lang.CharSequence r0 = com.kubi.kumex.record.C16700e0.m35728h(r3, r0, r7)
            int r7 = com.kubi.kumex.R$id.tvPassiveDelegation
            r2.setText(r7, r0)
            int r7 = com.kubi.kumex.R$id.rlDelegationModel
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r15
            r2.setGone(r7, r0)
            android.view.View r0 = r2.itemView
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r14)
            java.lang.CharSequence r0 = com.kubi.kumex.record.C16700e0.m35727g(r3, r4, r0)
            int r7 = com.kubi.kumex.R$id.profitLossValue
            r2.setText(r7, r0)
            int r8 = com.kubi.kumex.R$id.rlProfit
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r15
            r2.setGone(r8, r0)
            int r0 = com.kubi.kumex.R$id.tv_time
            java.lang.Long r9 = r3.getCreatedAt()
            if (r9 == 0) goto L388
            long r17 = r9.longValue()
            r23 = 15
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r9 = p429lf.C42179a.m92633f(r17, r19, r20, r21, r22, r23, r24)
            goto L389
        L388:
            r9 = r12
        L389:
            java.lang.String r14 = fm.C37569d.m84684y()
            java.lang.String r9 = com.kubi.utils.extensions.C27041f.m66669i(r9, r14)
            r2.setText(r0, r9)
            java.lang.String r0 = r3.getAdvancedType()
            java.lang.String r9 = "trailing_stop"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L3e4
            int r0 = com.kubi.kumex.R$string.trailing_stop_trailing_delta
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r13, r0)
            java.math.BigDecimal r17 = r3.getCallbackRate()
            if (r17 == 0) goto L3c4
            r24 = 59
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r0 = p429lf.C42180b.m92642g(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L3c5
        L3c4:
            r0 = r12
        L3c5:
            java.lang.String r0 = p429lf.C42180b.m92649n(r0)
            r2.setText(r5, r0)
            r2.setGone(r6, r15)
            int r0 = com.kubi.kumex.R$id.profitLossLabel
            int r5 = com.kubi.kumex.R$string.kumex_tso_activie_price
            java.lang.String r5 = r1.getString(r5)
            r2.setText(r0, r5)
            java.lang.CharSequence r0 = com.kubi.kumex.record.C16700e0.m35732l(r3)
            r2.setText(r7, r0)
            r2.setGone(r8, r15)
        L3e4:
            int r0 = com.kubi.kumex.R$id.rlFee
            java.math.BigDecimal r5 = r3.getFee()
            java.math.BigDecimal r5 = p402kf.C41014a.m89922G(r5, r12, r15, r12)
            boolean r5 = p402kf.C41014a.m89919D(r5)
            r5 = r5 ^ r15
            r2.setGone(r0, r5)
            int r0 = com.kubi.kumex.R$id.rlTax
            java.math.BigDecimal r5 = r3.getTax()
            java.math.BigDecimal r5 = p402kf.C41014a.m89922G(r5, r12, r15, r12)
            boolean r5 = p402kf.C41014a.m89919D(r5)
            r5 = r5 ^ r15
            r2.setGone(r0, r5)
            int r0 = com.kubi.kumex.R$id.rlPnl
            java.math.BigDecimal r5 = r3.getPnl()
            java.math.BigDecimal r5 = p402kf.C41014a.m89922G(r5, r12, r15, r12)
            boolean r5 = p402kf.C41014a.m89919D(r5)
            r5 = r5 ^ r15
            r2.setGone(r0, r5)
            java.lang.String r0 = r3.getFeeCurrency()
            if (r0 != 0) goto L441
            if (r4 == 0) goto L42b
            boolean r0 = r4.isInverse()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L42c
        L42b:
            r0 = r12
        L42c:
            boolean r0 = com.kubi.utils.extensions.C27025c.m66566d(r0)
            if (r0 == 0) goto L43b
            if (r4 == 0) goto L439
            java.lang.String r0 = r4.getDisplayBaseCurrency()
            goto L441
        L439:
            r0 = r12
            goto L441
        L43b:
            if (r4 == 0) goto L439
            java.lang.String r0 = r4.getQuoteCurrency()
        L441:
            int r5 = com.kubi.kumex.R$id.dealValue
            java.math.BigDecimal r17 = r3.getDealValue()
            if (r17 == 0) goto L466
            com.kubi.kumex.data.platform.model.ContractEntity r6 = fm.C37568c.m84630a(r3)
            int r19 = fm.C37567b.m84623m(r6)
            java.math.RoundingMode r18 = java.math.RoundingMode.UP
            r25 = 116(0x74, float:1.63E-43)
            r26 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.String r6 = p429lf.C42180b.m92640e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L467
        L466:
            r6 = r12
        L467:
            java.lang.String r17 = p429lf.C42180b.m92647l(r6)
            java.lang.String r0 = com.kubi.utils.extensions.C27041f.m66677q(r0)
            java.lang.String r18 = p429lf.C42180b.m92647l(r0)
            r21 = 4
            r22 = 0
            r19 = 1
            r20 = 0
            java.lang.String r0 = nf.C42828b.m93906g(r17, r18, r19, r20, r21, r22)
            r2.setText(r5, r0)
            int r0 = com.kubi.kumex.R$id.tvPnl
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.math.BigDecimal r7 = r3.getPnl()
            java.math.BigDecimal r7 = p402kf.C41014a.m89922G(r7, r12, r15, r12)
            java.lang.String r7 = com.kubi.utils.extensions.C27039d.m66644d(r7)
            r6.append(r7)
            java.math.BigDecimal r17 = r3.getPnl()
            if (r17 == 0) goto L4c0
            com.kubi.kumex.data.platform.model.ContractEntity r7 = fm.C37568c.m84630a(r3)
            int r19 = fm.C37567b.m84623m(r7)
            r25 = 117(0x75, float:1.64E-43)
            r26 = 0
            r18 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.String r7 = p429lf.C42180b.m92640e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L4c1
        L4c0:
            r7 = r12
        L4c1:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = p429lf.C42180b.m92647l(r6)
            r5.append(r6)
            r6 = 32
            r5.append(r6)
            if (r4 == 0) goto L4db
            java.lang.String r4 = r4.getSettleCurrency()
            goto L4dc
        L4db:
            r4 = r12
        L4dc:
            java.lang.String r4 = com.kubi.utils.extensions.C27041f.m66677q(r4)
            java.lang.String r4 = p429lf.C42180b.m92647l(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.setText(r0, r4)
            android.content.Context r4 = r1.requireContext()
            java.lang.String r5 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.math.BigDecimal r5 = r3.getPnl()
            java.math.BigDecimal r5 = p402kf.C41014a.m89922G(r5, r12, r15, r12)
            int r4 = com.kubi.resources.C22890g.m54282g(r4, r5, r10, r11, r12)
            r2.setTextColor(r0, r4)
            int r0 = com.kubi.kumex.R$id.tvTax
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.math.BigDecimal r5 = r3.getTax()
            java.lang.String r7 = "multiply(...)"
            java.lang.String r8 = "negate(...)"
            java.lang.String r9 = "ONE"
            if (r5 == 0) goto L56b
            java.math.BigDecimal r13 = java.math.BigDecimal.ONE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r9)
            java.math.BigDecimal r13 = r13.negate()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r8)
            java.math.BigDecimal r5 = r5.multiply(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            if (r5 == 0) goto L56b
            java.lang.String r13 = r3.getTaxCurrency()
            com.kubi.broker.r r14 = com.kubi.broker.C11374r.f19236a
            th.d r14 = r14.m20288g()
            java.lang.String r13 = com.kubi.utils.extensions.C27041f.m66668h(r13)
            com.kubi.kumex.data.platform.model.CoinEntity r13 = th.InterfaceC44980d.m99528E(r14, r13, r10, r11, r12)
            if (r13 == 0) goto L54e
            com.kubi.kumex.data.platform.model.PropertyEntity r13 = r13.getProperties()
            if (r13 == 0) goto L54e
            java.lang.Integer r13 = r13.getShortDisplayPrecision()
        L54c:
            r14 = 4
            goto L550
        L54e:
            r13 = r12
            goto L54c
        L550:
            int r19 = com.kubi.utils.extensions.C27039d.m66651k(r13, r14)
            r25 = 117(0x75, float:1.64E-43)
            r26 = 0
            r18 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r5
            java.lang.String r5 = p429lf.C42180b.m92640e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L56c
        L56b:
            r5 = r12
        L56c:
            java.lang.String r5 = p429lf.C42180b.m92647l(r5)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = r3.getTaxCurrency()
            java.lang.String r5 = com.kubi.utils.extensions.C27041f.m66677q(r5)
            java.lang.String r5 = p429lf.C42180b.m92647l(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.setText(r0, r4)
            int r0 = com.kubi.kumex.R$id.tvFee
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.math.BigDecimal r5 = r3.getFee()
            if (r5 == 0) goto L5e7
            java.math.BigDecimal r13 = java.math.BigDecimal.ONE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r9)
            java.math.BigDecimal r9 = r13.negate()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            java.math.BigDecimal r5 = r5.multiply(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            if (r5 == 0) goto L5e7
            java.lang.String r7 = r3.getFeeCurrency()
            com.kubi.broker.r r8 = com.kubi.broker.C11374r.f19236a
            th.d r8 = r8.m20288g()
            java.lang.String r7 = com.kubi.utils.extensions.C27041f.m66668h(r7)
            com.kubi.kumex.data.platform.model.CoinEntity r7 = th.InterfaceC44980d.m99528E(r8, r7, r10, r11, r12)
            if (r7 == 0) goto L5cc
            com.kubi.kumex.data.platform.model.PropertyEntity r7 = r7.getProperties()
            if (r7 == 0) goto L5cc
            java.lang.Integer r12 = r7.getShortDisplayPrecision()
        L5cc:
            r14 = 4
            int r19 = com.kubi.utils.extensions.C27039d.m66651k(r12, r14)
            r25 = 117(0x75, float:1.64E-43)
            r26 = 0
            r18 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r5
            java.lang.String r12 = p429lf.C42180b.m92640e(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L5e7:
            java.lang.String r5 = p429lf.C42180b.m92647l(r12)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r3 = r3.getFeeCurrency()
            java.lang.String r3 = com.kubi.utils.extensions.C27041f.m66677q(r3)
            java.lang.String r3 = p429lf.C42180b.m92647l(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.setText(r0, r3)
            return
    }

    /* JADX INFO: renamed from: W3 */
    public final com.kubi.kumex.data.trade.model.OrderEntity m35166W3() {
            r1 = this;
            kotlin.Lazy r0 = r1.f29890Z
            java.lang.Object r0 = r0.getValue()
            com.kubi.kumex.data.trade.model.OrderEntity r0 = (com.kubi.kumex.data.trade.model.OrderEntity) r0
            return r0
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: o3 */
    public /* bridge */ /* synthetic */ void mo16439o3(io.chad.library.adapter.base.BaseViewHolder r1, android.os.Parcelable r2) {
            r0 = this;
            com.kubi.kumex.data.assets.model.TradeRecordEntity r2 = (com.kubi.kumex.data.assets.model.TradeRecordEntity) r2
            r0.m35164O3(r1, r2)
            return
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            super.onViewCreated(r3, r4)
            com.kubi.resources.widget.SwipeRefreshRecyclerView r3 = r2.f46496X
            android.content.Context r4 = r2.mContext
            int r0 = com.kubi.kumex.R$color.c_overlay
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
            r3.setBackgroundColor(r4)
            com.kubi.resources.widget.SwipeRefreshRecyclerView r3 = r2.f46496X
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            android.content.Context r4 = r2.mContext
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
            r3.setBackgroundColor(r4)
            com.kubi.kumex.data.trade.model.OrderEntity r3 = r2.m35166W3()
            if (r3 == 0) goto L40
            android.content.Context r4 = r2.mContext
            int r0 = com.kubi.kumex.R$layout.bkumex_item_delegation_header
            r1 = 0
            android.view.View r4 = android.view.View.inflate(r4, r0, r1)
            io.chad.library.adapter.base.BaseViewHolder r0 = new io.chad.library.adapter.base.BaseViewHolder
            r0.<init>(r4)
            r2.m35165P3(r0, r3)
            io.chad.library.adapter.base.BaseQuickAdapter<T extends android.os.Parcelable, io.chad.library.adapter.base.BaseViewHolder> r3 = r2.f46495W
            r3.addHeaderView(r4)
        L40:
            return
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: r3 */
    public io.reactivex.Observable<com.kubi.sdk.base.entity.BasePageEntity<com.kubi.kumex.data.assets.model.TradeRecordEntity>> mo16440r3(int r3, int r4) {
            r2 = this;
            com.kubi.utils.FlowableCompat r0 = com.kubi.utils.FlowableCompat.f54248a
            com.kubi.kumex.record.l r1 = new com.kubi.kumex.record.l
            r1.<init>(r2, r4, r3)
            io.reactivex.Flowable r3 = r0.m66385b(r1)
            io.reactivex.Observable r3 = r3.toObservable()
            io.reactivex.Scheduler r4 = o00.C42916f.m94127f()
            io.reactivex.Observable r3 = r3.subscribeOn(r4)
            io.reactivex.Scheduler r4 = o00.C42916f.m94128g()
            io.reactivex.Observable r3 = r3.observeOn(r4)
            com.kubi.kumex.record.m r4 = new com.kubi.kumex.record.m
            r4.<init>(r2)
            com.kubi.kumex.record.n r0 = new com.kubi.kumex.record.n
            r0.<init>(r4)
            io.reactivex.Observable r3 = r3.doOnNext(r0)
            com.kubi.kumex.record.o r4 = new com.kubi.kumex.record.o
            r4.<init>()
            com.kubi.kumex.record.p r0 = new com.kubi.kumex.record.p
            r0.<init>(r4)
            io.reactivex.Observable r3 = r3.map(r0)
            java.lang.String r4 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
            r1 = this;
            int r0 = com.kubi.kumex.R$layout.bkumex_item_delegation_detail
            return r0
    }
}
