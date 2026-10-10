package com.kubi.otc.view;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.contrarywind.view.WheelView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.WheelTwoViewDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import mt.SelectWheelEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p629t2.InterfaceC44627a;
import p681v2.InterfaceC45364b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WheelViewDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0082.¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/view/WheelTwoViewDialog;", "Lcom/kubi/otc/view/BaseWheelViewDialog;", "title", "", "firstSelectValue", "secondSelectValue", "firstListData", "", "Lcom/kubi/otc/view/SelectWheelEntity;", "secondListData", "isCircle", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function2;)V", "secondView", "Lcom/contrarywind/view/WheelView;", "secondWheelAdapter", "Lcom/contrarywind/adapter/WheelAdapter;", "firstSelectAction", "Lkotlin/Function1;", "getFirstSelectAction", "()Lkotlin/jvm/functions/Function1;", "setFirstSelectAction", "(Lkotlin/jvm/functions/Function1;)V", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "notifySecondData", "data", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WheelTwoViewDialog extends BaseWheelViewDialog {

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final Companion f38193A0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final String f38194q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final String f38195r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final String f38196s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final List<SelectWheelEntity> f38197t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final List<SelectWheelEntity> f38198u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f38199v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public final Function2<SelectWheelEntity, SelectWheelEntity, Unit> f38200w0;

    /* JADX INFO: renamed from: x0 */
    public WheelView f38201x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC44627a<SelectWheelEntity> f38202y0;

    /* JADX INFO: renamed from: z0 */
    @Nullable
    public Function1<? super SelectWheelEntity, Unit> f38203z0;

    /* JADX INFO: compiled from: WheelViewDialog.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/otc/view/WheelTwoViewDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/otc/view/WheelTwoViewDialog;", "title", "", "firstSelectValue", "secondSelectValue", "firstListData", "", "Lcom/kubi/otc/view/SelectWheelEntity;", "secondListData", "isCircle", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)Lcom/kubi/otc/view/WheelTwoViewDialog;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WheelTwoViewDialog newInstance$default(Companion companion, String str, String str2, String str3, List list, List list2, Boolean bool, Function2 function2, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                bool = Boolean.FALSE;
            }
            return companion.newInstance(str, str2, str3, list, list2, bool, (i11 & 64) != 0 ? null : function2);
        }

        @NotNull
        public final WheelTwoViewDialog newInstance(@Nullable String title, @Nullable String firstSelectValue, @Nullable String secondSelectValue, @Nullable List<SelectWheelEntity> firstListData, @Nullable List<SelectWheelEntity> secondListData, @Nullable Boolean isCircle, @Nullable Function2<? super SelectWheelEntity, ? super SelectWheelEntity, Unit> action) {
            WheelTwoViewDialog wheelTwoViewDialog = new WheelTwoViewDialog(C27041f.m66668h(title), C27041f.m66668h(firstSelectValue), C27041f.m66668h(secondSelectValue), C27024b.m66560c(firstListData), C27024b.m66560c(secondListData), C27025c.m66566d(isCircle), action);
            wheelTwoViewDialog.setArguments(new C27051h().m66720d(TtmlNode.TAG_LAYOUT, R$layout.botc_view_two_wheel_dialog).m66717a());
            return wheelTwoViewDialog;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WheelTwoViewDialog(@NotNull String title, @NotNull String firstSelectValue, @NotNull String secondSelectValue, @NotNull List<SelectWheelEntity> firstListData, @NotNull List<SelectWheelEntity> secondListData, boolean z11, @Nullable Function2<? super SelectWheelEntity, ? super SelectWheelEntity, Unit> function2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstSelectValue, "firstSelectValue");
        Intrinsics.checkNotNullParameter(secondSelectValue, "secondSelectValue");
        Intrinsics.checkNotNullParameter(firstListData, "firstListData");
        Intrinsics.checkNotNullParameter(secondListData, "secondListData");
        this.f38194q0 = title;
        this.f38195r0 = firstSelectValue;
        this.f38196s0 = secondSelectValue;
        this.f38197t0 = firstListData;
        this.f38198u0 = secondListData;
        this.f38199v0 = z11;
        this.f38200w0 = function2;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m45608p4(WheelTwoViewDialog wheelTwoViewDialog, InterfaceC44627a interfaceC44627a, WheelView wheelView, int i11) {
        Function1<? super SelectWheelEntity, Unit> function1 = wheelTwoViewDialog.f38203z0;
        if (function1 != null) {
            Object item = interfaceC44627a.getItem(wheelView.getCurrentItem());
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            function1.invoke(item);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: q4 */
    public static final Unit m45609q4(WheelTwoViewDialog wheelTwoViewDialog, InterfaceC44627a interfaceC44627a, WheelView wheelView) {
        Function2<SelectWheelEntity, SelectWheelEntity, Unit> function2 = wheelTwoViewDialog.f38200w0;
        if (function2 != 0) {
            Object item = interfaceC44627a.getItem(C27039d.m66650j(Integer.valueOf(wheelView.getCurrentItem())));
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            InterfaceC44627a<SelectWheelEntity> interfaceC44627a2 = wheelTwoViewDialog.f38202y0;
            WheelView wheelView2 = null;
            if (interfaceC44627a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("secondWheelAdapter");
                interfaceC44627a2 = null;
            }
            WheelView wheelView3 = wheelTwoViewDialog.f38201x0;
            if (wheelView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("secondView");
            } else {
                wheelView2 = wheelView3;
            }
            SelectWheelEntity item2 = interfaceC44627a2.getItem(C27039d.m66650j(Integer.valueOf(wheelView2.getCurrentItem())));
            Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
            function2.invoke((SelectWheelEntity) item, item2);
        }
        wheelTwoViewDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tv_two_title, this.f38194q0);
        final InterfaceC44627a<SelectWheelEntity> interfaceC44627aM45494j4 = m45494j4(this.f38197t0);
        final WheelView wheelView = (WheelView) viewHolder.getView(R$id.view_two_wheel_first);
        if (wheelView != null) {
            wheelView.setCyclic(this.f38199v0);
            wheelView.setAdapter(interfaceC44627aM45494j4);
            wheelView.setOnItemSelectedListener(new InterfaceC45364b() { // from class: mt.l0
                @Override // p681v2.InterfaceC45364b
                /* JADX INFO: renamed from: a */
                public final void mo33596a(int i11) {
                    WheelTwoViewDialog.m45608p4(this.f94365a, interfaceC44627aM45494j4, wheelView, i11);
                }
            });
            wheelView.setCurrentItem(interfaceC44627aM45494j4.indexOf(new SelectWheelEntity(this.f38195r0, null, 2, null)));
            wheelView.m6991m();
        }
        this.f38202y0 = m45494j4(this.f38198u0);
        View view = viewHolder.getView(R$id.view_two_wheel_second);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        WheelView wheelView2 = (WheelView) view;
        this.f38201x0 = wheelView2;
        if (wheelView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondView");
            wheelView2 = null;
        }
        wheelView2.setCyclic(this.f38199v0);
        InterfaceC44627a<SelectWheelEntity> interfaceC44627a = this.f38202y0;
        if (interfaceC44627a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondWheelAdapter");
            interfaceC44627a = null;
        }
        wheelView2.setAdapter(interfaceC44627a);
        InterfaceC44627a<SelectWheelEntity> interfaceC44627a2 = this.f38202y0;
        if (interfaceC44627a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondWheelAdapter");
            interfaceC44627a2 = null;
        }
        wheelView2.setCurrentItem(C27039d.m66650j(Integer.valueOf(interfaceC44627a2.indexOf(new SelectWheelEntity(this.f38196s0, null, 2, null)))));
        wheelView2.m6991m();
        View view2 = viewHolder.getView(R$id.tv_two_ensure);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: mt.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelTwoViewDialog.m45609q4(this.f94369b, interfaceC44627aM45494j4, wheelView);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_two_cancel);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: mt.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelTwoViewDialog.m45610r4(this.f94373b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m45612o4(@Nullable Function1<? super SelectWheelEntity, Unit> function1) {
        this.f38203z0 = function1;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m45610r4(WheelTwoViewDialog wheelTwoViewDialog) {
        wheelTwoViewDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m45611n4(@Nullable List<SelectWheelEntity> list) {
        this.f38202y0 = m45494j4(C27024b.m66560c(list));
        WheelView wheelView = this.f38201x0;
        InterfaceC44627a<SelectWheelEntity> interfaceC44627a = null;
        if (wheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondView");
            wheelView = null;
        }
        InterfaceC44627a<SelectWheelEntity> interfaceC44627a2 = this.f38202y0;
        if (interfaceC44627a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondWheelAdapter");
        } else {
            interfaceC44627a = interfaceC44627a2;
        }
        wheelView.setAdapter(interfaceC44627a);
        wheelView.setCurrentItem(0);
        wheelView.m6991m();
    }
}
