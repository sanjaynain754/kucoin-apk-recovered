package com.kubi.kumex.record.filter;

import android.annotation.SuppressLint;
import android.view.View;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RecordFilterAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0015J\b\u0010\u0012\u001a\u00020\tH\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/record/filter/RecordFilterAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lcom/kubi/kumex/record/filter/IFilterDialogCallBack;", "list", "", "consumer", "Lio/reactivex/functions/Consumer;", "", "<init>", "([Lcom/kubi/resources/widget/drop/FilterType$IFilter;Lio/reactivex/functions/Consumer;)V", "getConsumer", "()Lio/reactivex/functions/Consumer;", "convert", "", "helper", "item", "getAdapterResult", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordFilterAdapter.kt\ncom/kubi/kumex/record/filter/RecordFilterAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n295#2,2:40\n1869#2,2:42\n*S KotlinDebug\n*F\n+ 1 RecordFilterAdapter.kt\ncom/kubi/kumex/record/filter/RecordFilterAdapter\n*L\n38#1:40,2\n31#1:42,2\n*E\n"})
public final class RecordFilterAdapter extends BaseQuickAdapter<FilterType.InterfaceC23033b, BaseViewHolder> implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Consumer<String> f30244i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordFilterAdapter(@NotNull FilterType.InterfaceC23033b[] list, @Nullable Consumer<String> consumer) {
        super(R$layout.bkumex_item_asset_account_check, ArraysKt.toList(list));
        Intrinsics.checkNotNullParameter(list, "list");
        this.f30244i = consumer;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final FilterType.InterfaceC23033b item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_label;
        helper.setText(i11, item.getF44544a()).setBackgroundRes(i11, item.getF44546c() ? R$drawable.shape_border_emphasis_20r : R$drawable.shape_border_divider8_20r).setTextColor(i11, helper.itemView.getResources().getColor(item.getF44546c() ? R$color.c_text : R$color.c_text60));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.kumex.record.filter.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecordFilterAdapter.m35757i(this.f30265b, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m35757i(RecordFilterAdapter recordFilterAdapter, FilterType.InterfaceC23033b interfaceC23033b) throws Exception {
        List<FilterType.InterfaceC23033b> data = recordFilterAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FilterType.InterfaceC23033b) it.next()).mo55155c(false);
        }
        interfaceC23033b.mo55155c(true);
        recordFilterAdapter.notifyDataSetChanged();
        Consumer<String> consumer = recordFilterAdapter.f30244i;
        if (consumer != null) {
            consumer.accept(interfaceC23033b.getF44545b());
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.record.filter.IFilterDialogCallBack
    @NotNull
    public String getAdapterResult() {
        Object next;
        String f44545b;
        List<FilterType.InterfaceC23033b> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!((FilterType.InterfaceC23033b) next).getF44546c());
        FilterType.InterfaceC23033b interfaceC23033b = (FilterType.InterfaceC23033b) next;
        if (interfaceC23033b != null && (f44545b = interfaceC23033b.getF44545b()) != null) {
            return f44545b;
        }
        return "";
    }
}
