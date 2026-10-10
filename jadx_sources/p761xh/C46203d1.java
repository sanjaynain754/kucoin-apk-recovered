package p761xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
import com.kubi.tradebase.R$font;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import n30.C42726b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: xh.d1 */
/* JADX INFO: compiled from: SelectTradeTypeOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "tradeType", "", "tradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/kubi/tradebase/databinding/BkumexSelectTradeTypeOfHistoryPopBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BkumexSelectTradeTypeOfHistoryPopBinding;", "binding$delegate", "Lkotlin/Lazy;", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "TradeTypeAdapter", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectTradeTypeOfHistoryPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectTradeTypeOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1869#2,2:119\n*S KotlinDebug\n*F\n+ 1 SelectTradeTypeOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup\n*L\n44#1:119,2\n*E\n"})
public final class C46203d1 extends C43724b {

    /* JADX INFO: renamed from: D */
    @Nullable
    public final String f103735D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final List<a.TradeTypeIndex> f103736E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Function1<String, Unit> f103737F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final Lazy f103738G;

    /* JADX INFO: renamed from: xh.d1$a */
    /* JADX INFO: compiled from: SelectTradeTypeOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeViewHolder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "font", "Landroid/graphics/Typeface;", "getFont", "()Landroid/graphics/Typeface;", "font$delegate", "Lkotlin/Lazy;", "setDatas", "datas", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "TradeTypeViewHolder", "TradeTypeIndex", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Function1<TradeTypeIndex, Unit> f103739i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ArrayList<TradeTypeIndex> f103740j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final Lazy f103741k;

        /* JADX INFO: renamed from: xh.d1$a$a, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: SelectTradeTypeOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "", "displayType", "", "type", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayType", "()Ljava/lang/String;", "getType", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class TradeTypeIndex {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String displayType;

            /* JADX INFO: renamed from: b, reason: from toString */
            @Nullable
            public final String type;

            /* JADX INFO: renamed from: c, reason: from toString */
            public boolean checked;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TradeTypeIndex)) {
                    return false;
                }
                TradeTypeIndex tradeTypeIndex = (TradeTypeIndex) other;
                return Intrinsics.areEqual(this.displayType, tradeTypeIndex.displayType) && Intrinsics.areEqual(this.type, tradeTypeIndex.type) && this.checked == tradeTypeIndex.checked;
            }

            public TradeTypeIndex(@NotNull String displayType, @Nullable String str, boolean z11) {
                Intrinsics.checkNotNullParameter(displayType, "displayType");
                this.displayType = displayType;
                this.type = str;
                this.checked = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDisplayType() {
                return this.displayType;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: d */
            public final void m101881d(boolean z11) {
                this.checked = z11;
            }

            public int hashCode() {
                int iHashCode = this.displayType.hashCode() * 31;
                String str = this.type;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.checked);
            }

            @NotNull
            public String toString() {
                return "TradeTypeIndex(displayType=" + this.displayType + ", type=" + this.type + ", checked=" + this.checked + ')';
            }
        }

        /* JADX INFO: renamed from: xh.d1$a$b */
        /* JADX INFO: compiled from: SelectTradeTypeOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super TradeTypeIndex, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f103739i = callback;
            this.f103740j = new ArrayList<>();
            this.f103741k = LazyKt.lazy(new Function0() { // from class: xh.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C46203d1.a.m101872i();
                }
            });
        }

        /* JADX INFO: renamed from: i */
        public static final Typeface m101872i() {
            return ResourcesCompat.getFont(C27017c.f54310a.m66513b(), R$font.medium);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f103740j.size();
        }

        /* JADX INFO: renamed from: j */
        public final Typeface m101874j() {
            return (Typeface) this.f103741k.getValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull b holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            TradeTypeIndex tradeTypeIndex = this.f103740j.get(i11);
            Intrinsics.checkNotNullExpressionValue(tradeTypeIndex, "get(...)");
            TradeTypeIndex tradeTypeIndex2 = tradeTypeIndex;
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            appCompatTextView.setText(tradeTypeIndex2.getDisplayType());
            if (tradeTypeIndex2.getChecked()) {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
            } else {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
            appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, C27029c.m66601d(appCompatTextView, 48)));
            appCompatTextView.setPaddingRelative(C27029c.m66601d(appCompatTextView, 16), 0, 0, 0);
            appCompatTextView.setTypeface(m101874j());
            appCompatTextView.setTextSize(14.0f);
            appCompatTextView.setGravity(16);
            appCompatTextView.setBackgroundResource(R$drawable.selector_darkoverlay_click);
            final b bVar = new b(appCompatTextView);
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: xh.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C46203d1.a.m101873m(bVar, this, view);
                }
            });
            return bVar;
        }

        /* JADX INFO: renamed from: n */
        public final void m101877n(@NotNull List<TradeTypeIndex> datas) {
            Intrinsics.checkNotNullParameter(datas, "datas");
            this.f103740j.clear();
            this.f103740j.addAll(datas);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: m */
        public static final void m101873m(b bVar, a aVar, View view) {
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            if (bindingAdapterPosition < 0) {
                return;
            }
            Function1<TradeTypeIndex, Unit> function1 = aVar.f103739i;
            TradeTypeIndex tradeTypeIndex = aVar.f103740j.get(bindingAdapterPosition);
            Intrinsics.checkNotNullExpressionValue(tradeTypeIndex, "get(...)");
            function1.invoke(tradeTypeIndex);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46203d1(@NotNull Context context, @Nullable String str, @NotNull List<a.TradeTypeIndex> tradeTypeList, @NotNull Function1<? super String, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeTypeList, "tradeTypeList");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f103735D = str;
        this.f103736E = tradeTypeList;
        this.f103737F = action;
        this.f103738G = LazyKt.lazy(new Function0() { // from class: xh.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46203d1.m101866n0(this.f103726b);
            }
        });
        m96317a0(-1);
        m96307Q(R$layout.bkumex_select_trade_type_of_history_pop);
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m101868q0(C46203d1 c46203d1, a.TradeTypeIndex it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c46203d1.f103737F.invoke(it.getType());
        c46203d1.m96331y();
        return Unit.INSTANCE;
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@NotNull View view, @NotNull C43724b popup) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(popup, "popup");
        super.mo25306H(view, popup);
        m101869o0().f94572c.setOnClickListener(new View.OnClickListener() { // from class: xh.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C46203d1.m101867p0(this.f103811b, view2);
            }
        });
        for (a.TradeTypeIndex tradeTypeIndex : this.f103736E) {
            tradeTypeIndex.m101881d(Intrinsics.areEqual(C27041f.m66668h(tradeTypeIndex.getType()), C27041f.m66668h(this.f103735D)));
        }
        m101869o0().f94571b.setLayoutManager(new LinearLayoutManager(view.getContext()));
        a aVar = new a(new Function1() { // from class: xh.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46203d1.m101868q0(this.f103813b, (C46203d1.a.TradeTypeIndex) obj);
            }
        });
        m101869o0().f94571b.setAdapter(aVar);
        aVar.m101877n(this.f103736E);
    }

    /* JADX INFO: renamed from: o0 */
    public final C42726b m101869o0() {
        return (C42726b) this.f103738G.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    public static final C42726b m101866n0(C46203d1 c46203d1) {
        return C42726b.m93623a(c46203d1.m96292A());
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m101867p0(C46203d1 c46203d1, View view) {
        c46203d1.m96331y();
    }
}
