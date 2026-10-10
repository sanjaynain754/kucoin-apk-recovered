package kd0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kd0.a */
/* JADX INFO: compiled from: StreamInfoAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/dashboard/view/StreamInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/dashboard/view/StreamInfoAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "mDataList", "", "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "updateRemoteVideoStatus", "statisticsList", "", "getItemCount", "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41009a extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f91219i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<AVStatistics> f91220j;

    /* JADX INFO: renamed from: kd0.a$a */
    /* JADX INFO: compiled from: StreamInfoAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/dashboard/view/StreamInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mUserInfoLayout", "Landroid/widget/LinearLayout;", "getMUserInfoLayout", "()Landroid/widget/LinearLayout;", "mTextUserId", "Landroid/widget/TextView;", "getMTextUserId", "()Landroid/widget/TextView;", "mTextVideoResolution", "getMTextVideoResolution", "mTextVideoBitrate", "getMTextVideoBitrate", "mTextVideoFps", "getMTextVideoFps", "mTextAudioSampleRate", "getMTextAudioSampleRate", "mTextAudioBitrate", "getMTextAudioBitrate", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f91221g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f91222h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f91223i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final TextView f91224j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final TextView f91225k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final TextView f91226l;

        /* JADX INFO: renamed from: m */
        @NotNull
        public final TextView f91227m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_user_info);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f91221g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_user_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f91222h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_video_resolution);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f91223i = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.tv_video_bitrate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f91224j = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R$id.tv_video_fps);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.f91225k = (TextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R$id.tv_audio_sample_rate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.f91226l = (TextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R$id.tv_audio_bitrate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.f91227m = (TextView) viewFindViewById7;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF91227m() {
            return this.f91227m;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF91226l() {
            return this.f91226l;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF91222h() {
            return this.f91222h;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF91224j() {
            return this.f91224j;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF91225k() {
            return this.f91225k;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextView getF91223i() {
            return this.f91223i;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final LinearLayout getF91221g() {
            return this.f91221g;
        }
    }

    public C41009a(@NotNull Context mContext, @NotNull List<AVStatistics> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.f91219i = mContext;
        this.f91220j = mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        String string;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AVStatistics aVStatistics = this.f91220j.get(i11);
        if (aVStatistics.getUserID().length() == 0) {
            string = this.f91219i.getString(R$string.common_dashboard_local_user);
            holder.getF91221g().setVisibility(getItemCount() == 1 ? 8 : 0);
        } else {
            string = this.f91219i.getString(R$string.common_dashboard_remote_user) + " : " + aVStatistics.getUserID();
            holder.getF91221g().setVisibility(0);
        }
        Intrinsics.checkNotNull(string);
        holder.getF91222h().setText(string);
        TextView f91223i = holder.getF91223i();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVStatistics.getVideoWidth());
        sb2.append('*');
        sb2.append(aVStatistics.getVideoHeight());
        f91223i.setText(sb2.toString());
        holder.getF91224j().setText(aVStatistics.getVideoBitrate() + " kbps");
        holder.getF91225k().setText(aVStatistics.getFrameRate() + " FPS");
        holder.getF91226l().setText(aVStatistics.getAudioSampleRate() + " HZ");
        holder.getF91227m().setText(aVStatistics.getAudioBitrate() + " kbps");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91220j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_adapter_item_stream_info, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i */
    public final void m89895i(@NotNull List<AVStatistics> statisticsList) {
        Intrinsics.checkNotNullParameter(statisticsList, "statisticsList");
        this.f91220j.clear();
        Iterator<AVStatistics> it = statisticsList.iterator();
        while (it.hasNext()) {
            this.f91220j.add(it.next());
        }
        notifyDataSetChanged();
    }
}
