package com.kubi.home.realtime.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.dialog.DataListAdapter;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27023a;
import com.tencent.bugly.proguard.C33954u6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p456mj.C42562k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DialogViewAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB;\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem;", "onClearAllClickListener", "Lkotlin/Function0;", "", "onDataEmptyListener", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getItemViewType", "", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "getItemCount", "updateData", "newItems", "removeItem", "Lcom/kubi/home/realtime/IRealTimeData;", "Companion", "GroupViewHolder", "DataViewHolder", "DataListItem", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDialogViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogViewAdapter.kt\ncom/kubi/home/realtime/dialog/DataListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1761#2,3:227\n1761#2,3:230\n*S KotlinDebug\n*F\n+ 1 DialogViewAdapter.kt\ncom/kubi/home/realtime/dialog/DataListAdapter\n*L\n89#1:227,3\n108#1:230,3\n*E\n"})
public final class DataListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f26114l = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public List<? extends AbstractC14823a> f26115i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Function0<Unit> f26116j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Function0<Unit> f26117k;

    /* JADX INFO: compiled from: DialogViewAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_GROUP", "", "VIEW_TYPE_DATA", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.DataListAdapter$a */
    /* JADX INFO: compiled from: DialogViewAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem;", "", "<init>", "()V", "GroupHeader", "DataDetail", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem$DataDetail;", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem$GroupHeader;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC14823a {

        /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.DataListAdapter$a$a, reason: from toString */
        /* JADX INFO: compiled from: DialogViewAdapter.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem$DataDetail;", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem;", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "<init>", "(Lcom/kubi/home/realtime/IRealTimeData;)V", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class DataDetail extends AbstractC14823a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final IRealTimeData data;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DataDetail) && Intrinsics.areEqual(this.data, ((DataDetail) other).data);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataDetail(@NotNull IRealTimeData data) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final IRealTimeData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            @NotNull
            public String toString() {
                return "DataDetail(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.DataListAdapter$a$b, reason: from toString */
        /* JADX INFO: compiled from: DialogViewAdapter.kt */
        @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem$GroupHeader;", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem;", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "latestTime", "", "viewTypeV2", "", "<init>", "(Lcom/kubi/home/realtime/RealTimeViewType;JLjava/lang/String;)V", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "getLatestTime", "()J", "getViewTypeV2", "()Ljava/lang/String;", "getGroupText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class GroupHeader extends AbstractC14823a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final RealTimeViewType viewType;

            /* JADX INFO: renamed from: b, reason: from toString */
            public final long latestTime;

            /* JADX INFO: renamed from: c, reason: from toString */
            @NotNull
            public final String viewTypeV2;

            public /* synthetic */ GroupHeader(RealTimeViewType realTimeViewType, long j11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(realTimeViewType, j11, (i11 & 4) != 0 ? "" : str);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GroupHeader)) {
                    return false;
                }
                GroupHeader groupHeader = (GroupHeader) other;
                return this.viewType == groupHeader.viewType && this.latestTime == groupHeader.latestTime && Intrinsics.areEqual(this.viewTypeV2, groupHeader.viewTypeV2);
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final String m30102a() {
                RealTimeViewType realTimeViewType = this.viewType;
                if (realTimeViewType == RealTimeViewType.COMMON) {
                    return this.viewTypeV2;
                }
                return realTimeViewType.getStringId() == 0 ? "" : C27017c.f54310a.m66516f(this.viewType.getStringId(), new Object[0]);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getLatestTime() {
                return this.latestTime;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final RealTimeViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                return (((this.viewType.hashCode() * 31) + Long.hashCode(this.latestTime)) * 31) + this.viewTypeV2.hashCode();
            }

            @NotNull
            public String toString() {
                return "GroupHeader(viewType=" + this.viewType + ", latestTime=" + this.latestTime + ", viewTypeV2=" + this.viewTypeV2 + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GroupHeader(@NotNull RealTimeViewType viewType, long j11, @NotNull String viewTypeV2) {
                super(null);
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(viewTypeV2, "viewTypeV2");
                this.viewType = viewType;
                this.latestTime = j11;
                this.viewTypeV2 = viewTypeV2;
            }
        }

        public /* synthetic */ AbstractC14823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC14823a() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.DataListAdapter$b */
    /* JADX INFO: compiled from: DialogViewAdapter.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/kubi/home/realtime/dialog/DataListAdapter;Landroid/view/View;)V", "cardContainer", "Landroid/view/ViewGroup;", "bind", "", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "createCardViewForData", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C14824b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ViewGroup f26122g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ DataListAdapter f26123h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14824b(@NotNull DataListAdapter dataListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f26123h = dataListAdapter;
            this.f26122g = (ViewGroup) itemView;
        }

        /* JADX INFO: renamed from: a */
        public final void m30105a(@NotNull IRealTimeData data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f26122g.removeAllViews();
            View viewM30106b = m30106b(data);
            if (viewM30106b != null) {
                this.f26122g.addView(viewM30106b);
            }
            String viewTypeV2 = data.getViewTypeV2();
            if (viewTypeV2 == null || viewTypeV2.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", String.valueOf(data.getViewTypeV2()));
            String reportStatus = data.getReportStatus();
            if (reportStatus != null && reportStatus.length() != 0) {
                jSONObject.put("status", String.valueOf(data.getReportStatus()));
            }
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66556c(HomeCardViewHolderProxy.PAGE_ID, "realtimeUpdatesCardPop", "content", jSONObject);
        }

        /* JADX INFO: renamed from: b */
        public final View m30106b(IRealTimeData iRealTimeData) {
            C42562k.ViewInstance viewInstanceM93319r = C42562k.f94240a.m93319r(iRealTimeData.getUniqueId());
            if (viewInstanceM93319r == null) {
                return null;
            }
            IRealTimeAdapter<IRealTimeData> iRealTimeAdapterM93328c = viewInstanceM93319r.m93328c();
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AdapterViewType adapterViewType = AdapterViewType.DIALOG;
            View viewM30050f = iRealTimeAdapterM93328c.m30050f(context, iRealTimeData, adapterViewType, null);
            viewInstanceM93319r.m93328c().mo30049e(viewM30050f, iRealTimeData, adapterViewType);
            return viewM30050f;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.DataListAdapter$c */
    /* JADX INFO: compiled from: DialogViewAdapter.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/DataListAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/kubi/home/realtime/dialog/DataListAdapter;Landroid/view/View;)V", "tvGroupType", "Landroid/widget/TextView;", "btnClearAll", "bind", "", "group", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem$GroupHeader;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDialogViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogViewAdapter.kt\ncom/kubi/home/realtime/dialog/DataListAdapter$GroupViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n2746#2,3:227\n*S KotlinDebug\n*F\n+ 1 DialogViewAdapter.kt\ncom/kubi/home/realtime/dialog/DataListAdapter$GroupViewHolder\n*L\n130#1:227,3\n*E\n"})
    public final class C14825c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f26124g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final View f26125h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DataListAdapter f26126i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14825c(@NotNull DataListAdapter dataListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f26126i = dataListAdapter;
            View viewFindViewById = itemView.findViewById(R$id.tv_group_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f26124g = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.btn_clear_all);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f26125h = viewFindViewById2;
        }

        /* JADX INFO: renamed from: b */
        public final void m30109b(@NotNull AbstractC14823a.GroupHeader group) {
            boolean z11;
            Intrinsics.checkNotNullParameter(group, "group");
            this.f26124g.setText(group.m30102a());
            if (getAdapterPosition() == 0) {
                z11 = true;
            } else {
                if (getAdapterPosition() > 0) {
                    List listTake = CollectionsKt.take(this.f26126i.f26115i, getAdapterPosition());
                    if (listTake == null || !listTake.isEmpty()) {
                        Iterator it = listTake.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((AbstractC14823a) it.next()) instanceof AbstractC14823a.GroupHeader) {
                                }
                            }
                        }
                    }
                    z11 = true;
                }
                z11 = false;
            }
            this.f26125h.setVisibility(z11 ? 0 : 8);
            if (z11) {
                View view = this.f26125h;
                final DataListAdapter dataListAdapter = this.f26126i;
                view.setOnClickListener(new View.OnClickListener() { // from class: kj.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DataListAdapter.C14825c.m30108c(dataListAdapter, view2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m30108c(DataListAdapter dataListAdapter, View view) {
            Function0 function0 = dataListAdapter.f26116j;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public /* synthetic */ DataListAdapter(List list, Function0 function0, Function0 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? null : function0, (i11 & 4) != 0 ? null : function1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final IRealTimeData m30099i(int i11) {
        Function0<Unit> function0;
        if (i11 >= 0 && i11 < this.f26115i.size()) {
            AbstractC14823a abstractC14823a = this.f26115i.get(i11);
            if (abstractC14823a instanceof AbstractC14823a.DataDetail) {
                List<? extends AbstractC14823a> mutableList = CollectionsKt.toMutableList((Collection) this.f26115i);
                mutableList.remove(i11);
                this.f26115i = mutableList;
                notifyItemRemoved(i11);
                List<? extends AbstractC14823a> list = this.f26115i;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((AbstractC14823a) it.next()) instanceof AbstractC14823a.DataDetail) {
                        }
                    }
                    function0 = this.f26117k;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    function0 = this.f26117k;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return ((AbstractC14823a.DataDetail) abstractC14823a).getData();
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26115i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        AbstractC14823a abstractC14823a = this.f26115i.get(position);
        if (abstractC14823a instanceof AbstractC14823a.GroupHeader) {
            return 0;
        }
        if (abstractC14823a instanceof AbstractC14823a.DataDetail) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public final void m30100j(@NotNull List<? extends AbstractC14823a> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.f26115i = newItems;
        notifyDataSetChanged();
        List<? extends AbstractC14823a> list = this.f26115i;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((AbstractC14823a) it.next()) instanceof AbstractC14823a.DataDetail) {
                    return;
                }
            }
        }
        Function0<Unit> function0 = this.f26117k;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AbstractC14823a abstractC14823a = this.f26115i.get(position);
        if (abstractC14823a instanceof AbstractC14823a.GroupHeader) {
            ((C14825c) holder).m30109b((AbstractC14823a.GroupHeader) abstractC14823a);
        } else {
            if (!(abstractC14823a instanceof AbstractC14823a.DataDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            ((C14824b) holder).m30105a(((AbstractC14823a.DataDetail) abstractC14823a).getData());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R$layout.home_adapter_realtime_dialog_adapter_header, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new C14825c(this, viewInflate);
        }
        if (viewType == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R$layout.home_adapter_realtime_dialog_adapter_item, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new C14824b(this, viewInflate2);
        }
        throw new IllegalArgumentException("Unknown view type: " + viewType);
    }

    public DataListAdapter(@NotNull List<? extends AbstractC14823a> items, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f26115i = items;
        this.f26116j = function0;
        this.f26117k = function1;
    }
}
