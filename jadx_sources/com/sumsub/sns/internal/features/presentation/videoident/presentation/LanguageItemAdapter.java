package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u001c\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bH\u0016R7\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;", "<init>", "()V", "selectionCallback", "Lkotlin/Function1;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "Lkotlin/ParameterName;", "name", "item", "", "getSelectionCallback", "()Lkotlin/jvm/functions/Function1;", "setSelectionCallback", "(Lkotlin/jvm/functions/Function1;)V", "value", "", FirebaseAnalytics.Param.ITEMS, "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "LanguageItemViewHolder", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class LanguageItemAdapter extends RecyclerView.Adapter<LanguageItemViewHolder> {

    @NotNull
    private List<LanguageSelectionViewModel.ViewState.Language> items = CollectionsKt.emptyList();

    @Nullable
    private Function1<? super LanguageSelectionViewModel.ViewState.Language, Unit> selectionCallback;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0012"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter;Landroid/view/View;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "status", "getStatus", "time", "getTime", "bind", "", "item", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState$Language;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class LanguageItemViewHolder extends RecyclerView.ViewHolder {
        public LanguageItemViewHolder(View view) {
            super(view);
        }

        private final TextView getStatus() {
            return (TextView) this.itemView.findViewById(R$id.sns_status);
        }

        private final TextView getTime() {
            return (TextView) this.itemView.findViewById(R$id.sns_time);
        }

        private final TextView getTitle() {
            return (TextView) this.itemView.findViewById(R$id.sns_item_title);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(LanguageItemAdapter languageItemAdapter, LanguageSelectionViewModel.ViewState.Language language, View view) {
            Function1<LanguageSelectionViewModel.ViewState.Language, Unit> selectionCallback = languageItemAdapter.getSelectionCallback();
            if (selectionCallback != null) {
                selectionCallback.invoke(language);
            }
        }

        public final void bind(@NotNull final LanguageSelectionViewModel.ViewState.Language item) {
            boolean zBooleanValue;
            TextView title = getTitle();
            if (title != null) {
                AbstractC28458h.m69341a(title, item.getTitle());
            }
            TextView status = getStatus();
            if (status != null) {
                AbstractC28458h.m69341a(status, item.getStatus());
            }
            TextView time = getTime();
            if (time != null) {
                AbstractC28458h.m69341a(time, item.getTime());
            }
            View view = this.itemView;
            Boolean selected = item.getSelected();
            if (selected != null) {
                zBooleanValue = selected.booleanValue();
            } else {
                zBooleanValue = false;
            }
            view.setSelected(zBooleanValue);
            View view2 = this.itemView;
            final LanguageItemAdapter languageItemAdapter = LanguageItemAdapter.this;
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    LanguageItemAdapter.LanguageItemViewHolder.bind$lambda$0(languageItemAdapter, item, view3);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @NotNull
    public final List<LanguageSelectionViewModel.ViewState.Language> getItems() {
        return this.items;
    }

    @Nullable
    public final Function1<LanguageSelectionViewModel.ViewState.Language, Unit> getSelectionCallback() {
        return this.selectionCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LanguageItemViewHolder holder, int position) {
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LanguageItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        SNSVideoIdentLanguageItemView sNSVideoIdentLanguageItemView = new SNSVideoIdentLanguageItemView(parent.getContext(), null, 0, 0, 14, null);
        sNSVideoIdentLanguageItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new LanguageItemViewHolder(sNSVideoIdentLanguageItemView);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<LanguageSelectionViewModel.ViewState.Language> list) {
        this.items = list;
        notifyDataSetChanged();
    }

    public final void setSelectionCallback(@Nullable Function1<? super LanguageSelectionViewModel.ViewState.Language, Unit> function1) {
        this.selectionCallback = function1;
    }
}
