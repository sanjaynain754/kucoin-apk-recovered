package ai0;

import android.annotation.SuppressLint;
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
import repayment.UnifyAssetData;

/* JADX INFO: renamed from: ai0.f */
/* JADX INFO: compiled from: UnifyAssetSelectAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0012\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007JO\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2)\u0010\u0017\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0007J$\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u000f2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\t\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lrepayment/adapter/UnifyAssetSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lrepayment/adapter/UnifyAssetSelectAdapter$ViewHolder;", "<init>", "()V", TUIConstants.TUIContact.SELECTED_LIST, "", "Lrepayment/UnifyAssetData;", "itemList", "notifySelectChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "selectList", "", "getSelectedList", "changeSelectedListForAll", "isReverse", "", "setData", "source", "initSelectedList", "notifySelectedChange", "resetData", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyAssetSelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAssetSelectAdapter.kt\nrepayment/adapter/UnifyAssetSelectAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n774#2:133\n865#2:134\n866#2:136\n1#3:135\n*S KotlinDebug\n*F\n+ 1 UnifyAssetSelectAdapter.kt\nrepayment/adapter/UnifyAssetSelectAdapter\n*L\n72#1:133\n72#1:134\n72#1:136\n*E\n"})
public final class C0369f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<UnifyAssetData> f1092i = new ArrayList();

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<UnifyAssetData> f1093j = new ArrayList();

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super List<UnifyAssetData>, Unit> f1094k;

    /* JADX INFO: renamed from: ai0.f$a */
    /* JADX INFO: compiled from: UnifyAssetSelectAdapter.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lrepayment/adapter/UnifyAssetSelectAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Lrepayment/adapter/UnifyAssetSelectAdapter;Landroid/view/View;)V", "cbSelect", "Landroid/widget/CheckBox;", "coinIcon", "Landroid/widget/ImageView;", "tvCurrency", "Landroid/widget/TextView;", "tvPrice", "tvMoneyPrice", "clickRect", "bindItem", "", "data", "Lrepayment/UnifyAssetData;", "isSelected", "", "onChecked", "Lkotlin/Function1;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final CheckBox f1095g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final ImageView f1096h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f1097i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final TextView f1098j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final TextView f1099k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final View f1100l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C0369f f1101m;

        /* JADX INFO: renamed from: d */
        public static final Unit m1455d(Function1 function1, a aVar) {
            function1.invoke(Boolean.valueOf(aVar.f1095g.isChecked()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m1456e(a aVar) {
            aVar.f1095g.performClick();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public final void m1457c(@NotNull UnifyAssetData data, boolean z11, @NotNull final Function1<? super Boolean, Unit> onChecked) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onChecked, "onChecked");
            C24277v.m58542g(this.f1096h, data.getIconUrl());
            this.f1097i.setText(data.getCurrencyName());
            this.f1098j.setText(C44044f.m97124b(data));
            this.f1099k.setText(C44044f.m97126d(data));
            this.f1095g.setChecked(z11);
            C27046k.m66711z(this.f1095g, 0L, new Function0() { // from class: ai0.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0369f.a.m1455d(onChecked, this);
                }
            }, 1, null);
            C27046k.m66711z(this.f1100l, 0L, new Function0() { // from class: ai0.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C0369f.a.m1456e(this.f1091b);
                }
            }, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C0369f c0369f, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f1101m = c0369f;
            View viewFindViewById = view.findViewById(R$id.cb_select);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f1095g = (CheckBox) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.coin_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f1096h = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.tv_currency);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f1097i = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.tv_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f1098j = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R$id.tv_money_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.f1099k = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R$id.click_rect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.f1100l = viewFindViewById6;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m1446k(C0369f c0369f, UnifyAssetData unifyAssetData, boolean z11) {
        if (!z11 || c0369f.f1092i.contains(unifyAssetData)) {
            c0369f.f1092i.remove(unifyAssetData);
        } else {
            c0369f.f1092i.add(unifyAssetData);
        }
        Function1<? super List<UnifyAssetData>, Unit> function1 = c0369f.f1094k;
        if (function1 != null) {
            function1.invoke(c0369f.f1092i);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1093j.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h */
    public final void m1447h(boolean z11) {
        this.f1092i.clear();
        this.f1092i.addAll(z11 ? CollectionsKt.emptyList() : CollectionsKt.toList(this.f1093j));
        Function1<? super List<UnifyAssetData>, Unit> function1 = this.f1094k;
        if (function1 != null) {
            function1.invoke(this.f1092i);
        }
        notifyDataSetChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<UnifyAssetData> m1448i() {
        return this.f1092i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Object next;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final UnifyAssetData unifyAssetData = this.f1093j.get(i11);
        Iterator<T> it = this.f1092i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((UnifyAssetData) next).getCurrencyCode(), unifyAssetData.getCurrencyCode()));
        holder.m1457c(unifyAssetData, next != null, new Function1() { // from class: ai0.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0369f.m1446k(this.f1087b, unifyAssetData, ((Boolean) obj).booleanValue());
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
        return new a(this, viewInflate);
    }

    /* JADX INFO: renamed from: m */
    public final void m1451m(List<UnifyAssetData> list, List<UnifyAssetData> list2) {
        Object next;
        List<UnifyAssetData> list3 = this.f1093j;
        list3.clear();
        list3.addAll(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            UnifyAssetData unifyAssetData = (UnifyAssetData) obj;
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((UnifyAssetData) next).getCurrencyCode(), unifyAssetData.getCurrencyCode()));
            if (next != null) {
                arrayList.add(obj);
            }
        }
        this.f1092i.clear();
        this.f1092i.addAll(arrayList);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: n */
    public final void m1452n(@NotNull List<UnifyAssetData> source, @NotNull List<UnifyAssetData> initSelectedList, @Nullable Function1<? super List<UnifyAssetData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(initSelectedList, "initSelectedList");
        m1451m(source, initSelectedList);
        this.f1094k = function1;
        if (function1 != null) {
            function1.invoke(this.f1092i);
        }
        notifyDataSetChanged();
    }
}
