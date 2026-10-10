package com.kubi.otc.view;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.contrarywind.view.WheelView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.WheelOneViewDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import mt.SelectWheelEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p629t2.InterfaceC44627a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WheelViewDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/view/WheelOneViewDialog;", "Lcom/kubi/otc/view/BaseWheelViewDialog;", "title", "", "selectValue", "listData", "", "Lcom/kubi/otc/view/SelectWheelEntity;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WheelOneViewDialog extends BaseWheelViewDialog {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f38188u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final String f38189q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final String f38190r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final List<SelectWheelEntity> f38191s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public final Function1<SelectWheelEntity, Unit> f38192t0;

    /* JADX INFO: compiled from: WheelViewDialog.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/otc/view/WheelOneViewDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/otc/view/WheelOneViewDialog;", "title", "", "selectValue", "data", "", "Lcom/kubi/otc/view/SelectWheelEntity;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WheelOneViewDialog newInstance$default(Companion companion, String str, String str2, List list, Function1 function1, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                function1 = null;
            }
            return companion.newInstance(str, str2, list, function1);
        }

        @NotNull
        public final WheelOneViewDialog newInstance(@Nullable String title, @Nullable String selectValue, @Nullable List<SelectWheelEntity> data, @Nullable Function1<? super SelectWheelEntity, Unit> action) {
            WheelOneViewDialog wheelOneViewDialog = new WheelOneViewDialog(C27041f.m66668h(title), C27041f.m66668h(selectValue), C27024b.m66560c(data), action);
            wheelOneViewDialog.setArguments(new C27051h().m66720d(TtmlNode.TAG_LAYOUT, R$layout.botc_view_one_wheel_dialog).m66717a());
            return wheelOneViewDialog;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WheelOneViewDialog(@NotNull String title, @NotNull String selectValue, @NotNull List<SelectWheelEntity> listData, @Nullable Function1<? super SelectWheelEntity, Unit> function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectValue, "selectValue");
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.f38189q0 = title;
        this.f38190r0 = selectValue;
        this.f38191s0 = listData;
        this.f38192t0 = function1;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m45603m4(WheelOneViewDialog wheelOneViewDialog, InterfaceC44627a interfaceC44627a, WheelView wheelView) {
        Function1<SelectWheelEntity, Unit> function1 = wheelOneViewDialog.f38192t0;
        if (function1 != null) {
            Object item = interfaceC44627a.getItem(wheelView.getCurrentItem());
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            function1.invoke((SelectWheelEntity) item);
        }
        wheelOneViewDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tv_one_title, this.f38189q0);
        final InterfaceC44627a<SelectWheelEntity> interfaceC44627aM45494j4 = m45494j4(this.f38191s0);
        final WheelView wheelView = (WheelView) viewHolder.getView(R$id.view_one_wheel);
        wheelView.setCyclic(false);
        wheelView.setAdapter(interfaceC44627aM45494j4);
        wheelView.setCurrentItem(interfaceC44627aM45494j4.indexOf(new SelectWheelEntity(this.f38190r0, null, 2, null)));
        wheelView.m6991m();
        View view = viewHolder.getView(R$id.tv_one_ensure);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: mt.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelOneViewDialog.m45603m4(this.f94359b, interfaceC44627aM45494j4, wheelView);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_one_cancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: mt.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelOneViewDialog.m45604n4(this.f94363b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m45604n4(WheelOneViewDialog wheelOneViewDialog) {
        wheelOneViewDialog.dismiss();
        return Unit.INSTANCE;
    }
}
