package ud0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ud0.e */
/* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0010\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "videoQualityLists", "", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "cancelButton", "Landroid/widget/TextView;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$OnVideoQualitySelectedListener;", "liveListListener", "com/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$liveListListener$1", "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$liveListListener$1;", "setOnVideoQualitySelectedListener", "", "onStart", "onStop", "initView", "setupRecyclerView", "setupCancelButton", "OnVideoQualitySelectedListener", "ResolutionAdapter", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogC45191e extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<VideoQuality> f101687m;

    /* JADX INFO: renamed from: n */
    public RecyclerView f101688n;

    /* JADX INFO: renamed from: o */
    public TextView f101689o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public a f101690p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final c f101691q;

    /* JADX INFO: renamed from: ud0.e$a */
    /* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$OnVideoQualitySelectedListener;", "", "onVideoQualitySelected", "", "videoQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo80689a(@NotNull VideoQuality videoQuality);
    }

    /* JADX INFO: renamed from: ud0.e$b */
    /* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$ResolutionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$ResolutionAdapter$ViewHolder;", "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel;", "data", "", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "<init>", "(Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel;Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "videoQualityToString", "", C33757kf.f70665k, "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final List<VideoQuality> f101692i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DialogC45191e f101693j;

        /* JADX INFO: renamed from: ud0.e$b$a */
        /* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$ResolutionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$ResolutionAdapter;Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "divider", "getDivider", "()Landroid/view/View;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: g */
            @NotNull
            public final TextView f101694g;

            /* JADX INFO: renamed from: h */
            @NotNull
            public final View f101695h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ b f101696i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f101696i = bVar;
                View viewFindViewById = itemView.findViewById(R$id.tv_resolution_text);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f101694g = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(R$id.divider);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.f101695h = viewFindViewById2;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final View getF101695h() {
                return this.f101695h;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final TextView getF101694g() {
                return this.f101694g;
            }
        }

        /* JADX INFO: renamed from: ud0.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class C47031b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoQuality.values().length];
                try {
                    iArr[VideoQuality.QUALITY_1080P.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoQuality.QUALITY_720P.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoQuality.QUALITY_540P.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VideoQuality.QUALITY_360P.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull DialogC45191e dialogC45191e, List<? extends VideoQuality> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f101693j = dialogC45191e;
            this.f101692i = data;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f101692i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull a holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final VideoQuality videoQuality = this.f101692i.get(i11);
            holder.getF101694g().setText(m99851k(videoQuality));
            if (i11 == this.f101692i.size() - 1) {
                holder.getF101695h().setVisibility(8);
            } else {
                holder.getF101695h().setVisibility(0);
            }
            TextView f101694g = holder.getF101694g();
            final DialogC45191e dialogC45191e = this.f101693j;
            f101694g.setOnClickListener(new View.OnClickListener() { // from class: ud0.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC45191e.b.m99848i(dialogC45191e, videoQuality, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_recycler_item_video_quality, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new a(this, viewInflate);
        }

        /* JADX INFO: renamed from: k */
        public final String m99851k(VideoQuality videoQuality) {
            int i11 = C47031b.$EnumSwitchMapping$0[videoQuality.ordinal()];
            if (i11 == 1) {
                return "1080P";
            }
            if (i11 == 2) {
                return "720P";
            }
            if (i11 == 3) {
                return "540P";
            }
            if (i11 == 4) {
                return "360P";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: i */
        public static final void m99848i(DialogC45191e dialogC45191e, VideoQuality videoQuality, View view) {
            a aVar = dialogC45191e.f101690p;
            if (aVar != null) {
                aVar.mo80689a(videoQuality);
            }
            dialogC45191e.dismiss();
        }
    }

    /* JADX INFO: renamed from: ud0.e$c */
    /* JADX INFO: compiled from: VideoQualitySelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends LiveListListener {
        public c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            DialogC45191e.this.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC45191e(@NotNull Context context, @NotNull List<? extends VideoQuality> videoQualityLists) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoQualityLists, "videoQualityLists");
        this.f101687m = videoQualityLists;
        this.f101691q = new c();
        m99843E();
    }

    /* JADX INFO: renamed from: F */
    private final void m99844F() {
        TextView textView = this.f101689o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelButton");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: ud0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC45191e.m99845G(this.f101686b, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    private final void m99846H() {
        RecyclerView recyclerView = this.f101688n;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        b bVar = new b(this, this.f101687m);
        RecyclerView recyclerView3 = this.f101688n;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(bVar);
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStop() {
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f101691q);
        super.onStop();
    }

    public final void setOnVideoQualitySelectedListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f101690p = listener;
    }

    /* JADX INFO: renamed from: E */
    private final void m99843E() {
        View viewInflate = View.inflate(getContext(), R$layout.livekit_layout_video_quality_select_panel, null);
        View viewFindViewById = viewInflate.findViewById(R$id.rv_resolution_options);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f101688n = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f101689o = (TextView) viewFindViewById2;
        m99846H();
        m99844F();
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: G */
    public static final void m99845G(DialogC45191e dialogC45191e, View view) {
        dialogC45191e.dismiss();
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStart() {
        super.onStart();
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f101691q);
    }
}
