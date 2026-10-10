package com.kubi.resources.dialog;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.messaging.Constants;
import com.kubi.resources.dialog.TradeTypePopupWindow;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: TradeTypePopupWindow.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000f\u0018\u00002\u00020\u0001:\u0001\u0018B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/resources/dialog/TradeTypePopupWindow;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "width", "", "dataList", "", "Lcom/kubi/resources/dialog/TradeTypePopupWindow$SelectEntity;", "callBack", "Lio/reactivex/functions/BiConsumer;", "", "<init>", "(Landroid/content/Context;ILjava/util/List;Lio/reactivex/functions/BiConsumer;)V", "adapter", "com/kubi/resources/dialog/TradeTypePopupWindow$adapter$2$1", "getAdapter", "()Lcom/kubi/resources/dialog/TradeTypePopupWindow$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", "showAsDropDown", "", "anchor", "Landroid/view/View;", "SelectEntity", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypePopupWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypePopupWindow.kt\ncom/kubi/resources/dialog/TradeTypePopupWindow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,71:1\n1#2:72\n44#3,2:73\n*S KotlinDebug\n*F\n+ 1 TradeTypePopupWindow.kt\ncom/kubi/resources/dialog/TradeTypePopupWindow\n*L\n64#1:73,2\n*E\n"})
public final class TradeTypePopupWindow extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Lazy f43596D;

    /* JADX INFO: renamed from: com.kubi.resources.dialog.TradeTypePopupWindow$a, reason: from toString */
    /* JADX INFO: compiled from: TradeTypePopupWindow.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/resources/dialog/TradeTypePopupWindow$SelectEntity;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "isChecked", "", "<init>", "(Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "()Z", "setChecked", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SelectEntity {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: b, reason: from toString */
        public boolean isChecked;

        /* JADX WARN: Multi-variable type inference failed */
        public SelectEntity() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectEntity)) {
                return false;
            }
            SelectEntity selectEntity = (SelectEntity) other;
            return Intrinsics.areEqual(this.label, selectEntity.label) && this.isChecked == selectEntity.isChecked;
        }

        public SelectEntity(@NotNull String label, boolean z11) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.isChecked = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + Boolean.hashCode(this.isChecked);
        }

        @NotNull
        public String toString() {
            return "SelectEntity(label=" + this.label + ", isChecked=" + this.isChecked + ')';
        }

        public /* synthetic */ SelectEntity(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11);
        }
    }

    public TradeTypePopupWindow(@NotNull final Context context, int i11, @NotNull final List<SelectEntity> dataList, @NotNull final BiConsumer<String, Integer> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f43596D = LazyKt.lazy(new Function0() { // from class: bw.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeTypePopupWindow.m54252l0(dataList, context, callBack, this);
            }
        });
        m96308R(context, R$layout.view_trade_type_selected).m96316Z(true).m96306P(true).m96312V(0.0f).m96317a0(i11 + C5275i0.m6236a(8.0f)).m96322p();
        RecyclerView recyclerView = (RecyclerView) m96292A().findViewById(R$id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setAdapter(m54254m0());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final TradeTypePopupWindow$adapter$2$1 m54252l0(List list, Context context, BiConsumer biConsumer, TradeTypePopupWindow tradeTypePopupWindow) {
        return new TradeTypePopupWindow$adapter$2$1(list, context, biConsumer, tradeTypePopupWindow, R$layout.item_trade_type_selected);
    }

    @Override // qe0.AbstractC43723a
    /* JADX INFO: renamed from: b0 */
    public void mo54253b0(@Nullable View view) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.m96318c0(view, C5303w0.m6511a() ? C5275i0.m6236a(4.0f) : -C5275i0.m6236a(4.0f), 0);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new ComponentException(thM103847exceptionOrNullimpl, "TradeTypePopupWindow", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final TradeTypePopupWindow$adapter$2$1 m54254m0() {
        return (TradeTypePopupWindow$adapter$2$1) this.f43596D.getValue();
    }
}
