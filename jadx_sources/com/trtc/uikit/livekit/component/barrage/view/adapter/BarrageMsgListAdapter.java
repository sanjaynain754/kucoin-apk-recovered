package com.trtc.uikit.livekit.component.barrage.view.adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cd0.InterfaceC4935a;
import cd0.InterfaceC4937c;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.component.barrage.BarrageStreamView;
import com.trtc.uikit.livekit.component.barrage.view.adapter.BarrageMsgListAdapter;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BarrageMsgListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\nH\u0017J\b\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "msgList", "", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "<init>", "(Ljava/util/List;)V", "adapterMap", "", "", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemAdapter;", "viewTypeDelegate", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemTypeDelegate;", "onMessageClickListener", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;", "setItemTypeDelegate", "", "delegate", "setItemAdapter", "itemType", "adapter", "setOnMessageClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "getItemViewType", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BarrageMsgListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f77666m = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<Barrage> f77667i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Map<Integer, InterfaceC4935a> f77668j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public InterfaceC4937c f77669k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public BarrageStreamView.InterfaceC35881a f77670l;

    /* JADX INFO: compiled from: BarrageMsgListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter$Companion;", "", "<init>", "()V", "TAG", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public BarrageMsgListAdapter(@NotNull List<Barrage> msgList) {
        Intrinsics.checkNotNullParameter(msgList, "msgList");
        this.f77667i = msgList;
        this.f77668j = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: h */
    public static final void m79546h(BarrageMsgListAdapter barrageMsgListAdapter, Barrage barrage, View view) {
        BarrageStreamView.InterfaceC35881a interfaceC35881a = barrageMsgListAdapter.f77670l;
        if (interfaceC35881a != null) {
            interfaceC35881a.mo79480a(barrage.getSender());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f77667i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        InterfaceC4937c interfaceC4937c = this.f77669k;
        if (interfaceC4937c != null) {
            return interfaceC4937c.mo5170a(position, this.f77667i.get(position));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m79547i(int i11, @NotNull InterfaceC4935a adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f77668j.put(Integer.valueOf(i11), adapter);
        Log.i("BarrageMsgListAdapter", "setItemAdapter: [itemType:" + i11 + ", adapter:" + adapter + ']');
    }

    /* JADX INFO: renamed from: j */
    public final void m79548j(@NotNull InterfaceC4937c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f77669k = delegate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Barrage barrage = this.f77667i.get(position);
        InterfaceC4935a interfaceC4935a = this.f77668j.get(Integer.valueOf(getItemViewType(position)));
        if (interfaceC4935a != null) {
            interfaceC4935a.mo5163b(holder, position, barrage);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: cd0.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BarrageMsgListAdapter.m79546h(this.f5491b, barrage, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolderMo5162a;
        Intrinsics.checkNotNullParameter(parent, "parent");
        InterfaceC4935a interfaceC4935a = this.f77668j.get(Integer.valueOf(viewType));
        if (interfaceC4935a != null && (viewHolderMo5162a = interfaceC4935a.mo5162a(parent)) != null) {
            return viewHolderMo5162a;
        }
        throw new IllegalArgumentException("No adapter found for viewType: " + viewType);
    }

    public final void setOnMessageClickListener(@Nullable BarrageStreamView.InterfaceC35881a interfaceC35881a) {
        this.f77670l = interfaceC35881a;
    }
}
