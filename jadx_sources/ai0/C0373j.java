package ai0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.C44044f;
import repayment.UnifyLiabilityData;

/* JADX INFO: renamed from: ai0.j */
/* JADX INFO: compiled from: UnifyLiabilityDialogAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J2\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lrepayment/adapter/UnifyLiabilityDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lrepayment/adapter/UnifyLiabilityDialogAdapter$ViewHolder;", "<init>", "()V", "itemList", "", "Lrepayment/UnifyLiabilityData;", "selectedIndex", "", "Ljava/lang/Integer;", "selectedListener", "Lkotlin/Function1;", "", "getSelected", "notifyDataChange", "source", "", "selectedCurrencyCode", "", "selectedChangeListener", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyLiabilityDialogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLiabilityDialogAdapter.kt\nrepayment/adapter/UnifyLiabilityDialogAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n360#3,7:105\n*S KotlinDebug\n*F\n+ 1 UnifyLiabilityDialogAdapter.kt\nrepayment/adapter/UnifyLiabilityDialogAdapter\n*L\n68#1:105,7\n*E\n"})
public final class C0373j extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<UnifyLiabilityData> f1109i = new ArrayList();

    /* JADX INFO: renamed from: j */
    @Nullable
    public Integer f1110j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super UnifyLiabilityData, Unit> f1111k;

    /* JADX INFO: renamed from: ai0.j$a */
    /* JADX INFO: compiled from: UnifyLiabilityDialogAdapter.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m90084d2 = {"Lrepayment/adapter/UnifyLiabilityDialogAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "cbSelect", "Landroid/widget/CheckBox;", "getCbSelect", "()Landroid/widget/CheckBox;", "coinIcon", "Landroid/widget/ImageView;", "getCoinIcon", "()Landroid/widget/ImageView;", "tvCurrency", "Landroid/widget/TextView;", "getTvCurrency", "()Landroid/widget/TextView;", "tvPrice", "getTvPrice", "tvMoneyPrice", "getTvMoneyPrice", "clickRect", "getClickRect", "()Landroid/view/View;", "setData", "", "isChecked", "", "data", "Lrepayment/UnifyLiabilityData;", "onChecked", "Lkotlin/Function0;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final CheckBox f1112g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final ImageView f1113h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f1114i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final TextView f1115j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final TextView f1116k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final View f1117l;

        /* JADX INFO: renamed from: d */
        public static final Unit m1466d(a aVar, Function0 function0) {
            if (!aVar.f1112g.isChecked()) {
                aVar.f1112g.setChecked(true);
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m1467e(a aVar, Function0 function0) {
            if (!aVar.f1112g.isChecked()) {
                aVar.f1112g.setChecked(true);
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public final void m1468c(boolean z11, @NotNull UnifyLiabilityData data, @NotNull final Function0<Unit> onChecked) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onChecked, "onChecked");
            this.f1112g.setChecked(z11);
            C24277v.m58542g(this.f1113h, data.getIconUrl());
            this.f1114i.setText(data.getCurrencyName());
            this.f1115j.setText(C44044f.m97125c(data));
            this.f1116k.setText(C44044f.m97128f(data, false, 1, null));
            C27046k.m66711z(this.f1112g, 0L, new Function0() { // from class: ai0.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0373j.a.m1466d(this.f1105b, onChecked);
                }
            }, 1, null);
            C27046k.m66711z(this.f1117l, 0L, new Function0() { // from class: ai0.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0373j.a.m1467e(this.f1107b, onChecked);
                }
            }, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(R$id.cb_select);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f1112g = (CheckBox) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.coin_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f1113h = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.tv_currency);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f1114i = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.tv_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f1115j = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R$id.tv_money_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.f1116k = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R$id.click_rect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.f1117l = viewFindViewById6;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1109i.size();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final UnifyLiabilityData m1460h() {
        Integer num = this.f1110j;
        if (num == null) {
            return null;
        }
        return (UnifyLiabilityData) CollectionsKt.getOrNull(this.f1109i, num.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final UnifyLiabilityData unifyLiabilityData = this.f1109i.get(i11);
        Integer num = this.f1110j;
        holder.m1468c(num != null && i11 == num.intValue(), unifyLiabilityData, new Function0() { // from class: ai0.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0373j.m1459k(holder, this, unifyLiabilityData);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.unify_item_coin_list_view, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m1459k(a aVar, C0373j c0373j, UnifyLiabilityData unifyLiabilityData) {
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return Unit.INSTANCE;
        }
        Integer num = c0373j.f1110j;
        if (num == null || num.intValue() != bindingAdapterPosition) {
            Integer num2 = c0373j.f1110j;
            c0373j.f1110j = Integer.valueOf(bindingAdapterPosition);
            if (num2 != null) {
                c0373j.notifyItemChanged(num2.intValue());
            }
            c0373j.notifyItemChanged(bindingAdapterPosition);
            Function1<? super UnifyLiabilityData, Unit> function1 = c0373j.f1111k;
            if (function1 != null) {
                function1.invoke(UnifyLiabilityData.copy$default(unifyLiabilityData, null, null, null, null, 15, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m1461i(@NotNull List<UnifyLiabilityData> source, @NotNull String selectedCurrencyCode, @NotNull Function1<? super UnifyLiabilityData, Unit> selectedChangeListener) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        Intrinsics.checkNotNullParameter(selectedChangeListener, "selectedChangeListener");
        this.f1111k = selectedChangeListener;
        Iterator<UnifyLiabilityData> it = source.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!Intrinsics.areEqual(it.next().getCurrencyCode(), selectedCurrencyCode)) {
                i11++;
            } else {
                this.f1110j = Integer.valueOf(i11);
                this.f1109i.clear();
                this.f1109i.addAll(source);
                notifyItemRangeChanged(0, this.f1109i.size());
            }
        }
        i11 = -1;
        this.f1110j = Integer.valueOf(i11);
        this.f1109i.clear();
        this.f1109i.addAll(source);
        notifyItemRangeChanged(0, this.f1109i.size());
    }
}
