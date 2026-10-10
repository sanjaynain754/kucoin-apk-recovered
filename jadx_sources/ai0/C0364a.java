package ai0;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.UnifyAssetData;

/* JADX INFO: renamed from: ai0.a */
/* JADX INFO: compiled from: RepayAssetIconAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lrepayment/adapter/RepayAssetIconAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lrepayment/adapter/RepayAssetIconAdapter$ImageViewHolder;", "<init>", "()V", "iconList", "", "Lrepayment/adapter/RepayAssetIconAdapter$IconRes;", "clearData", "", "setData", "assets", "", "Lrepayment/UnifyAssetData;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getDisplayIconList", "IconRes", "ImageViewHolder", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRepayAssetIconAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayAssetIconAdapter.kt\nrepayment/adapter/RepayAssetIconAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1563#2:75\n1634#2,3:76\n1563#2:79\n1634#2,3:80\n*S KotlinDebug\n*F\n+ 1 RepayAssetIconAdapter.kt\nrepayment/adapter/RepayAssetIconAdapter\n*L\n57#1:75\n57#1:76,3\n60#1:79\n60#1:80,3\n*E\n"})
public final class C0364a extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<a> f1079i = new ArrayList();

    /* JADX INFO: renamed from: ai0.a$a */
    /* JADX INFO: compiled from: RepayAssetIconAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lrepayment/adapter/RepayAssetIconAdapter$IconRes;", "", "IconResId", "IconResUrl", "Lrepayment/adapter/RepayAssetIconAdapter$IconRes$IconResId;", "Lrepayment/adapter/RepayAssetIconAdapter$IconRes$IconResUrl;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ai0.a$a$a, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: RepayAssetIconAdapter.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lrepayment/adapter/RepayAssetIconAdapter$IconRes$IconResId;", "Lrepayment/adapter/RepayAssetIconAdapter$IconRes;", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class IconResId implements a {

            /* JADX INFO: renamed from: a, reason: from toString */
            public final int id;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconResId) && this.id == ((IconResId) other).id;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.id);
            }

            @NotNull
            public String toString() {
                return "IconResId(id=" + this.id + ')';
            }

            public IconResId(int i11) {
                this.id = i11;
            }
        }

        /* JADX INFO: renamed from: ai0.a$a$b, reason: from toString */
        /* JADX INFO: compiled from: RepayAssetIconAdapter.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lrepayment/adapter/RepayAssetIconAdapter$IconRes$IconResUrl;", "Lrepayment/adapter/RepayAssetIconAdapter$IconRes;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class IconResUrl implements a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String url;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconResUrl) && Intrinsics.areEqual(this.url, ((IconResUrl) other).url);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return "IconResUrl(url=" + this.url + ')';
            }

            public IconResUrl(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }
        }
    }

    /* JADX INFO: renamed from: ai0.a$b */
    /* JADX INFO: compiled from: RepayAssetIconAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lrepayment/adapter/RepayAssetIconAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ImageView f1082g;

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF1082g() {
            return this.f1082g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(R$id.viCurrency);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f1082g = (ImageView) viewFindViewById;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1432g() {
        this.f1079i.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1079i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        a aVar = this.f1079i.get(i11);
        if (aVar instanceof a.IconResId) {
            holder.getF1082g().setImageResource(((a.IconResId) aVar).getId());
        } else {
            if (!(aVar instanceof a.IconResUrl)) {
                throw new NoWhenBranchMatchedException();
            }
            C24277v.m58542g(holder.getF1082g(), ((a.IconResUrl) aVar).getUrl());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.unify_item_currency_icon, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: k */
    public final void m1436k(@NotNull List<UnifyAssetData> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f1079i.clear();
        this.f1079i.addAll(m1433h(assets));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h */
    public final List<a> m1433h(List<UnifyAssetData> list) {
        if (list.size() <= 4) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String iconUrl = ((UnifyAssetData) it.next()).getIconUrl();
                if (iconUrl == null) {
                    iconUrl = "";
                }
                arrayList.add(new a.IconResUrl(iconUrl));
            }
            return arrayList;
        }
        List listTake = CollectionsKt.take(list, 3);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it2 = listTake.iterator();
        while (it2.hasNext()) {
            String iconUrl2 = ((UnifyAssetData) it2.next()).getIconUrl();
            if (iconUrl2 == null) {
                iconUrl2 = "";
            }
            arrayList2.add(new a.IconResUrl(iconUrl2));
        }
        return CollectionsKt.plus((Collection<? extends a.IconResId>) arrayList2, new a.IconResId(R$drawable.ic_more_16));
    }
}
