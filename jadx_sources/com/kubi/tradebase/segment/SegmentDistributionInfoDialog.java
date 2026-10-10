package com.kubi.tradebase.segment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.segment.SegmentDistributionInfoDialog;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import n30.C42740p;
import n30.C42741q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import t30.C44682b;
import w00.C45681e;

/* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionInfoBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentTab", "Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$Tab;", "uniformRows", "", "Lkotlin/Triple;", "", "increasingRows", "decreasingRows", "tableAdapter", "Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$ExampleTableAdapter;", "initType", "", "isBottomSheet", "", "onStart", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupRecyclerView", "setupTabs", "selectTab", "tab", "Companion", "Tab", "ExampleTableAdapter", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentDistributionInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentDistributionInfoDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionInfoDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,175:1\n143#2,20:176\n*S KotlinDebug\n*F\n+ 1 SegmentDistributionInfoDialog.kt\ncom/kubi/tradebase/segment/SegmentDistributionInfoDialog\n*L\n33#1:176,20\n*E\n"})
public final class SegmentDistributionInfoDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f51621q0 = C45681e.m100799e(this, new Function1<SegmentDistributionInfoDialog, C42740p>() { // from class: com.kubi.tradebase.segment.SegmentDistributionInfoDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42740p invoke(@NotNull SegmentDistributionInfoDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42740p.m93654a(fragment.requireView());
        }
    }, new Function1<C42740p, Unit>() { // from class: com.kubi.tradebase.segment.SegmentDistributionInfoDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42740p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42740p c42740p) {
            invoke(c42740p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public Tab f51622r0 = Tab.UNIFORM;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final List<Triple<String, String, String>> f51623s0 = CollectionsKt.listOf((Object[]) new Triple[]{new Triple("57,000", "0.25 BTC", "25%"), new Triple("58,000", "0.25 BTC", "25%"), new Triple("59,000", "0.25 BTC", "25%"), new Triple("60,000", "0.25 BTC", "25%")});

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final List<Triple<String, String, String>> f51624t0 = CollectionsKt.listOf((Object[]) new Triple[]{new Triple("57,000", "0.1 BTC", "10%"), new Triple("58,000", "0.2 BTC", "20%"), new Triple("59,000", "0.3 BTC", "30%"), new Triple("60,000", "0.4 BTC", "40%")});

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final List<Triple<String, String, String>> f51625u0 = CollectionsKt.listOf((Object[]) new Triple[]{new Triple("57,000", "0.4 BTC", "40%"), new Triple("58,000", "0.3 BTC", "30%"), new Triple("59,000", "0.2 BTC", "20%"), new Triple("60,000", "0.1 BTC", "10%")});

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final C25917a f51626v0 = new C25917a();

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f51620x0 = {Reflection.property1(new PropertyReference1Impl(SegmentDistributionInfoDialog.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/TradebaseDialogSegmentDistributionInfoBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f51619w0 = new Companion(null);

    /* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SegmentDistributionInfoDialog newInstance() {
            return new SegmentDistributionInfoDialog();
        }
    }

    /* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$Tab;", "", "<init>", "(Ljava/lang/String;I)V", "UNIFORM", "INCREASING", "DECREASING", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Tab {
        UNIFORM,
        INCREASING,
        DECREASING;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f51628c = EnumEntriesKt.enumEntries(m63330a());

        @NotNull
        public static EnumEntries<Tab> getEntries() {
            return f51628c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionInfoDialog$a */
    /* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$ExampleTableAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$ExampleTableAdapter$VH;", "<init>", "()V", "rows", "", "Lkotlin/Triple;", "", "submit", "", "data", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "VH", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25917a extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public List<Triple<String, String, String>> f51629i = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionInfoDialog$a$a */
        /* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradebase/segment/SegmentDistributionInfoDialog$ExampleTableAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/kubi/tradebase/databinding/TradebaseItemSegmentDistInfoRowBinding;", "<init>", "(Lcom/kubi/tradebase/databinding/TradebaseItemSegmentDistInfoRowBinding;)V", "getB", "()Lcom/kubi/tradebase/databinding/TradebaseItemSegmentDistInfoRowBinding;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: g */
            @NotNull
            public final C42741q f51630g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull C42741q b11) {
                super(b11.getRoot());
                Intrinsics.checkNotNullParameter(b11, "b");
                this.f51630g = b11;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final C42741q getF51630g() {
                return this.f51630g;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull a holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Triple<String, String, String> triple = this.f51629i.get(i11);
            String strComponent1 = triple.component1();
            String strComponent2 = triple.component2();
            String strComponent3 = triple.component3();
            holder.getF51630g().f94683c.setText(strComponent1);
            holder.getF51630g().f94682b.setText(strComponent2);
            holder.getF51630g().f94684d.setText(strComponent3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f51629i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            C42741q c42741qM93657c = C42741q.m93657c(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(c42741qM93657c, "inflate(...)");
            return new a(c42741qM93657c);
        }

        /* JADX INFO: renamed from: i */
        public final void m63333i(@NotNull List<Triple<String, String, String>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f51629i = data;
            notifyDataSetChanged();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.segment.SegmentDistributionInfoDialog$b */
    /* JADX INFO: compiled from: SegmentDistributionInfoDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25918b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.UNIFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.INCREASING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tab.DECREASING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m63324q4(SegmentDistributionInfoDialog segmentDistributionInfoDialog) {
        segmentDistributionInfoDialog.m63328n4(Tab.UNIFORM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m63325r4(SegmentDistributionInfoDialog segmentDistributionInfoDialog) {
        segmentDistributionInfoDialog.m63328n4(Tab.INCREASING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m63326s4(SegmentDistributionInfoDialog segmentDistributionInfoDialog) {
        segmentDistributionInfoDialog.m63328n4(Tab.DECREASING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final C42740p m63327m4() {
        return (C42740p) this.f51621q0.getValue(this, f51620x0[0]);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m63328n4(Tab tab) {
        this.f51622r0 = tab;
        C42740p c42740pM63327m4 = m63327m4();
        if (c42740pM63327m4 == null) {
            return;
        }
        c42740pM63327m4.f94675f.setSelected(tab == Tab.UNIFORM);
        c42740pM63327m4.f94674e.setSelected(tab == Tab.INCREASING);
        c42740pM63327m4.f94676g.setSelected(tab == Tab.DECREASING);
        int i11 = C25918b.$EnumSwitchMapping$0[tab.ordinal()];
        if (i11 == 1) {
            c42740pM63327m4.f94671b.setImageResource(R$mipmap.trade_ordertype_segment_uniform);
            c42740pM63327m4.f94677h.setText(C27017c.f54310a.m66516f(R$string.kumex_segmented_distribution_desc_average, new Object[0]));
            C25917a c25917a = this.f51626v0;
            List<Triple<String, String, String>> list = this.f51623s0;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            c25917a.m63333i(C44682b.m98839d(list, contextRequireContext));
        } else if (i11 == 2) {
            c42740pM63327m4.f94671b.setImageResource(R$mipmap.trade_ordertype_segment_increasing);
            c42740pM63327m4.f94677h.setText(C27017c.f54310a.m66516f(R$string.kumex_segmented_distribution_desc_increasing, new Object[0]));
            C25917a c25917a2 = this.f51626v0;
            List<Triple<String, String, String>> list2 = this.f51624t0;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            c25917a2.m63333i(C44682b.m98839d(list2, contextRequireContext2));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c42740pM63327m4.f94671b.setImageResource(R$mipmap.trade_ordertype_segment_decreasing);
            c42740pM63327m4.f94677h.setText(C27017c.f54310a.m66516f(R$string.kumex_segmented_distribution_desc_decreasing, new Object[0]));
            C25917a c25917a3 = this.f51626v0;
            List<Triple<String, String, String>> list3 = this.f51625u0;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            c25917a3.m63333i(C44682b.m98839d(list3, contextRequireContext3));
        }
        ImageView ivType = c42740pM63327m4.f94671b;
        Intrinsics.checkNotNullExpressionValue(ivType, "ivType");
        C44682b.m98836a(ivType);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.tradebase_dialog_segment_distribution_info, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42740p c42740pM63327m4 = m63327m4();
        if (c42740pM63327m4 != null && (baseTextView = c42740pM63327m4.f94680k) != null) {
            baseTextView.setText(getString(R$string.price_order, "USDT"));
        }
        m63323o4();
        m63329p4();
        m63328n4(Tab.UNIFORM);
    }

    /* JADX INFO: renamed from: o4 */
    private final void m63323o4() {
        C42740p c42740pM63327m4 = m63327m4();
        if (c42740pM63327m4 == null) {
            return;
        }
        c42740pM63327m4.f94673d.setLayoutManager(new LinearLayoutManager(requireContext()));
        c42740pM63327m4.f94673d.setAdapter(this.f51626v0);
        c42740pM63327m4.f94673d.setNestedScrollingEnabled(false);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d() - C5275i0.m6236a(64.0f);
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iM6182d;
                frameLayout.setLayoutParams(layoutParams);
            }
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            bottomSheetBehaviorFrom.setMaxHeight(iM6182d);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m63329p4() {
        C42740p c42740pM63327m4 = m63327m4();
        if (c42740pM63327m4 == null) {
            return;
        }
        ShapeTextView tvAvg = c42740pM63327m4.f94675f;
        Intrinsics.checkNotNullExpressionValue(tvAvg, "tvAvg");
        C27046k.m66711z(tvAvg, 0L, new Function0() { // from class: r30.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SegmentDistributionInfoDialog.m63324q4(this.f97085b);
            }
        }, 1, null);
        ShapeTextView tvAsc = c42740pM63327m4.f94674e;
        Intrinsics.checkNotNullExpressionValue(tvAsc, "tvAsc");
        C27046k.m66711z(tvAsc, 0L, new Function0() { // from class: r30.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SegmentDistributionInfoDialog.m63325r4(this.f97086b);
            }
        }, 1, null);
        ShapeTextView tvDesc = c42740pM63327m4.f94676g;
        Intrinsics.checkNotNullExpressionValue(tvDesc, "tvDesc");
        C27046k.m66711z(tvDesc, 0L, new Function0() { // from class: r30.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SegmentDistributionInfoDialog.m63326s4(this.f97087b);
            }
        }, 1, null);
    }
}
