package com.kubi.otc.view;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.SelectLabelDialogView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p402kf.C41016c;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SelectLabelDialogView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0014\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002J.\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/otc/view/SelectLabelDialogView;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "datas", "", "Lcom/kubi/otc/view/SelectLabel;", "callBack", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "type", "", "headerView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getHeaderView", "()Landroid/view/View;", "headerView$delegate", "Lkotlin/Lazy;", "adapter", "com/kubi/otc/view/SelectLabelDialogView$adapter$2$1", "getAdapter", "()Lcom/kubi/otc/view/SelectLabelDialogView$adapter$2$1;", "adapter$delegate", "addItemData", "", "data", "bindItemData", "helper", "item", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectLabelDialogView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectLabelDialogView.kt\ncom/kubi/otc/view/SelectLabelDialogView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n865#2,2:198\n1#3:200\n*S KotlinDebug\n*F\n+ 1 SelectLabelDialogView.kt\ncom/kubi/otc/view/SelectLabelDialogView\n*L\n119#1:198,2\n*E\n"})
public final class SelectLabelDialogView extends DialogFragmentHelper {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f38176v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public List<SelectLabel> f38177q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public BiConsumer<BaseViewHolder, SelectLabel> f38178r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public String f38179s0 = "legal";

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f38180t0 = LazyKt.lazy(new Function0() { // from class: mt.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectLabelDialogView.m45562D4(this.f94383b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f38181u0 = LazyKt.lazy(new Function0() { // from class: mt.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectLabelDialogView.m45577x4(this.f94384b);
        }
    });

    /* JADX INFO: compiled from: SelectLabelDialogView.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/view/SelectLabelDialogView$Companion;", "", "<init>", "()V", "TYPE_LEGAL", "", "TYPE_COIN", "COIN_USDT", "COIN_BTC", "COIN_ETH", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "selectDatas", "", "Lcom/kubi/otc/view/SelectLabel;", "selectCallBack", "Lio/reactivex/functions/BiConsumer;", "Lio/chad/library/adapter/base/BaseViewHolder;", "selectType", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ DialogFragmentHelper newInstance$default(Companion companion, List list, BiConsumer biConsumer, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = "legal";
            }
            return companion.newInstance(list, biConsumer, str);
        }

        @NotNull
        public final DialogFragmentHelper newInstance(@NotNull List<SelectLabel> selectDatas, @NotNull BiConsumer<BaseViewHolder, SelectLabel> selectCallBack, @NotNull String selectType) {
            Intrinsics.checkNotNullParameter(selectDatas, "selectDatas");
            Intrinsics.checkNotNullParameter(selectCallBack, "selectCallBack");
            Intrinsics.checkNotNullParameter(selectType, "selectType");
            SelectLabelDialogView selectLabelDialogView = new SelectLabelDialogView();
            selectLabelDialogView.f38177q0 = selectDatas;
            selectLabelDialogView.f38178r0 = selectCallBack;
            selectLabelDialogView.f38179s0 = selectType;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.botc_dialog_select_label_view);
            bundle.putBoolean("isBottomSheet", true);
            selectLabelDialogView.setArguments(bundle);
            return selectLabelDialogView;
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m45560A4(BiConsumer biConsumer, BaseViewHolder baseViewHolder, SelectLabel selectLabel, SelectLabelDialogView selectLabelDialogView) throws Exception {
        if (biConsumer != null) {
            biConsumer.accept(baseViewHolder, selectLabel);
        }
        selectLabelDialogView.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    private final View m45561C4() {
        return (View) this.f38180t0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m45570q4(final SelectLabelDialogView selectLabelDialogView, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        List<SelectLabel> list;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        ClearEditText clearEditText = (ClearEditText) viewHolder.getView(R$id.et_search);
        final View view = viewHolder.getView(R$id.tv_empty);
        final SelectLabelDialogView$adapter$2$1 selectLabelDialogView$adapter$2$1M45578B4 = selectLabelDialogView.m45578B4();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        String str = selectLabelDialogView.f38179s0;
        Object obj = null;
        if (Intrinsics.areEqual(str, "coin")) {
            List<SelectLabel> list2 = selectLabelDialogView.f38177q0;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((SelectLabel) next).getValue(), "USDT"));
                SelectLabel selectLabel = (SelectLabel) next;
                if (selectLabel != null) {
                    selectLabelDialogView.m45579y4(selectLabel, selectLabelDialogView.f38178r0);
                    booleanRef.element = true;
                }
                Iterator<T> it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((SelectLabel) next2).getValue(), "BTC"));
                SelectLabel selectLabel2 = (SelectLabel) next2;
                if (selectLabel2 != null) {
                    selectLabelDialogView.m45579y4(selectLabel2, selectLabelDialogView.f38178r0);
                    booleanRef.element = true;
                }
                for (Object obj2 : list2) {
                    if (Intrinsics.areEqual(((SelectLabel) obj2).getValue(), "ETH")) {
                        obj = obj2;
                        break;
                    }
                }
                SelectLabel selectLabel3 = (SelectLabel) obj;
                if (selectLabel3 != null) {
                    selectLabelDialogView.m45579y4(selectLabel3, selectLabelDialogView.f38178r0);
                    booleanRef.element = true;
                }
            }
        } else if (Intrinsics.areEqual(str, "legal") && (list = selectLabelDialogView.f38177q0) != null) {
            for (Object obj3 : list) {
                if (Intrinsics.areEqual(((SelectLabel) obj3).getValue(), C41016c.m89965c())) {
                    obj = obj3;
                    break;
                }
            }
            SelectLabel selectLabel4 = (SelectLabel) obj;
            if (selectLabel4 != null) {
                selectLabelDialogView.m45579y4(selectLabel4, selectLabelDialogView.f38178r0);
                booleanRef.element = true;
            }
        }
        if (booleanRef.element) {
            selectLabelDialogView$adapter$2$1M45578B4.addHeaderView(selectLabelDialogView.m45561C4());
        }
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
        final Function1 function1 = new Function1() { // from class: mt.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return SelectLabelDialogView.m45568o4(booleanRef, selectLabelDialogView$adapter$2$1M45578B4, selectLabelDialogView, view, (CharSequence) obj4);
            }
        };
        Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: mt.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj4) {
                SelectLabelDialogView.m45567n4(function1, obj4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, selectLabelDialogView.getF43550U());
        recyclerView.setAdapter(selectLabelDialogView$adapter$2$1M45578B4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m45571r4(SelectLabelDialogView selectLabelDialogView, BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.getView(R$id.view_content);
        int iM6182d = (C5267e0.m6182d() * 4) / 5;
        view.getLayoutParams().height = iM6182d;
        Dialog dialog = selectLabelDialogView.getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.kubi.otc.view.SelectLabelDialogView$adapter$2$1] */
    /* JADX INFO: renamed from: x4 */
    public static final SelectLabelDialogView$adapter$2$1 m45577x4(final SelectLabelDialogView selectLabelDialogView) {
        final int i11 = R$layout.botc_item_select_label_view;
        return new BaseQuickAdapter<SelectLabel, BaseViewHolder>(i11) { // from class: com.kubi.otc.view.SelectLabelDialogView$adapter$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, SelectLabel item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                SelectLabelDialogView selectLabelDialogView2 = this.f38182i;
                selectLabelDialogView2.m45580z4(helper, item, selectLabelDialogView2.f38178r0);
            }
        };
    }

    /* JADX INFO: renamed from: B4 */
    public final SelectLabelDialogView$adapter$2$1 m45578B4() {
        return (SelectLabelDialogView$adapter$2$1) this.f38181u0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m45579y4(SelectLabel selectLabel, BiConsumer<BaseViewHolder, SelectLabel> biConsumer) {
        BaseViewHolder baseViewHolder = new BaseViewHolder(m45561C4());
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.botc_item_select_label_view, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R$id.view_recommend);
        m45580z4(new BaseViewHolder(viewInflate), selectLabel, biConsumer);
        linearLayout.addView(viewInflate);
    }

    public SelectLabelDialogView() {
        m54237f4(new Function2() { // from class: mt.x
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SelectLabelDialogView.m45570q4(this.f94385b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        m54238g4(new Function1() { // from class: mt.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectLabelDialogView.m45571r4(this.f94386b, (BaseViewHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final View m45562D4(SelectLabelDialogView selectLabelDialogView) {
        return LayoutInflater.from(selectLabelDialogView.requireContext()).inflate(R$layout.botc_view_select_label_header, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m45567n4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX INFO: renamed from: o4 */
    public static Unit m45568o4(Ref.BooleanRef booleanRef, SelectLabelDialogView$adapter$2$1 selectLabelDialogView$adapter$2$1, SelectLabelDialogView selectLabelDialogView, View view, CharSequence charSequence) {
        List<SelectLabel> list;
        Boolean boolValueOf;
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() == 0) {
            if (booleanRef.element && selectLabelDialogView$adapter$2$1.getHeaderLayoutCount() == 0) {
                selectLabelDialogView$adapter$2$1.addHeaderView(selectLabelDialogView.m45561C4());
            }
            list = selectLabelDialogView.f38177q0;
        } else {
            if (booleanRef.element) {
                selectLabelDialogView$adapter$2$1.removeHeaderView(selectLabelDialogView.m45561C4());
            }
            List<SelectLabel> list2 = selectLabelDialogView.f38177q0;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    String value = ((SelectLabel) obj).getValue();
                    if (value != null) {
                        Locale ROOT = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        String lowerCase = value.toLowerCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase != null) {
                            String string = charSequence.toString();
                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                            String lowerCase2 = string.toLowerCase(ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            boolValueOf = Boolean.valueOf(StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null));
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                    if (C27025c.m66566d(boolValueOf)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        selectLabelDialogView$adapter$2$1.replaceData(C27024b.m66560c(list));
        if (list != null && !list.isEmpty()) {
            Intrinsics.checkNotNull(view);
            C27046k.m66700o(view);
        } else {
            Intrinsics.checkNotNull(view);
            C27046k.m66685H(view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public final void m45580z4(final BaseViewHolder baseViewHolder, final SelectLabel selectLabel, final BiConsumer<BaseViewHolder, SelectLabel> biConsumer) {
        int i11;
        if (C27025c.m66566d(selectLabel.getIsIconText())) {
            int i12 = R$id.tv_icon;
            baseViewHolder.setText(i12, selectLabel.getIconValue());
            baseViewHolder.setVisible(i12, true);
        } else {
            C24277v.m58540e(requireActivity(), C27041f.m66668h(selectLabel.getIconValue()), (ImageView) baseViewHolder.getView(R$id.iv_icon));
        }
        baseViewHolder.setText(R$id.tv_name, C27041f.m66668h(selectLabel.getValue()));
        boolean zM66566d = C27025c.m66566d(selectLabel.getIsSelect());
        baseViewHolder.getView(R$id.view_item).setSelected(zM66566d);
        View view = baseViewHolder.getView(R$id.iv_select);
        if (zM66566d) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: mt.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectLabelDialogView.m45560A4(biConsumer, baseViewHolder, selectLabel, this);
            }
        }, 1, null);
    }
}
