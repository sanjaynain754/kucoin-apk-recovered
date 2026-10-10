package com.kubi.quotefacade.favorites.edit;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.FavEditChildEntity;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavEditChildAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0003J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "favType", "", "onItemSelectedListener", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "getFavType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "convert", "helper", "item", "moveItemToTop", ViewProps.POSITION, "selectAll", "isSelect", "", "isFutureType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavEditChildAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditChildAdapter.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1869#2,2:85\n*S KotlinDebug\n*F\n+ 1 FavEditChildAdapter.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildAdapter\n*L\n74#1:85,2\n*E\n"})
public final class FavEditChildAdapter extends BaseItemDraggableAdapter<FavEditChildEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Integer f41789i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Function0<Unit> f41790j;

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable final FavEditChildEntity favEditChildEntity) {
        View view;
        CharSequence symbolName;
        CharSequence charSequenceM52122b;
        if (baseViewHolder != null) {
            int i11 = R$id.tvSymbolName;
            Integer numValueOf = favEditChildEntity != null ? Integer.valueOf(favEditChildEntity.getType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                charSequenceM52122b = IKuMexService.m33249T(IKuMexService.f28731a.get(), C27041f.m66668h(favEditChildEntity.getSymbol()), false, 2, null);
            } else if (numValueOf != null && numValueOf.intValue() == 5) {
                charSequenceM52122b = favEditChildEntity.getSymbol();
            } else {
                if (favEditChildEntity == null || (symbolName = favEditChildEntity.getSymbolName()) == null) {
                    symbolName = "";
                }
                charSequenceM52122b = C22218w1.m52122b(symbolName);
            }
            baseViewHolder.setText(i11, charSequenceM52122b);
        }
        final ImageView imageView = baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.ivSelect) : null;
        ImageView imageView2 = baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.ivTop) : null;
        if (imageView2 != null) {
            C27046k.m66701p(imageView2, C27017c.f54310a.m66512a(baseViewHolder.getLayoutPosition() == 0 ? R$color.c_icon40 : R$color.c_icon));
        }
        if (imageView != null) {
            imageView.setSelected(favEditChildEntity != null ? favEditChildEntity.isSelect() : false);
        }
        if (baseViewHolder != null && (view = baseViewHolder.itemView) != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.edit.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavEditChildAdapter.m51547j(imageView, favEditChildEntity, this);
                }
            }, 1, null);
        }
        if (imageView2 != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.edit.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavEditChildAdapter.m51548k(baseViewHolder, this);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditChildAdapter(@Nullable Integer num, @NotNull Function0<Unit> onItemSelectedListener) {
        super(R$layout.item_list_favorite_edit, null);
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        this.f41789i = num;
        this.f41790j = onItemSelectedListener;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m51547j(ImageView imageView, FavEditChildEntity favEditChildEntity, FavEditChildAdapter favEditChildAdapter) {
        if (imageView != null) {
            imageView.setSelected(!imageView.isSelected());
            if (favEditChildEntity != null) {
                favEditChildEntity.setSelect(imageView.isSelected());
            }
            favEditChildAdapter.f41790j.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m51548k(BaseViewHolder baseViewHolder, FavEditChildAdapter favEditChildAdapter) {
        if (baseViewHolder.getLayoutPosition() > 0 && baseViewHolder.getLayoutPosition() <= favEditChildAdapter.getData().size() - 1) {
            favEditChildAdapter.m51550l(baseViewHolder.getLayoutPosition());
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l */
    public final void m51550l(int i11) {
        getData().add(0, getData().remove(i11));
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: m */
    public final void m51551m(boolean z11) {
        List<FavEditChildEntity> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FavEditChildEntity) it.next()).setSelect(z11);
        }
        notifyDataSetChanged();
        this.f41790j.invoke();
    }
}
