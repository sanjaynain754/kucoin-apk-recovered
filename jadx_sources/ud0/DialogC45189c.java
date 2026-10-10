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
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ud0.c */
/* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0010\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "mirrorTypeList", "", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "cancelButton", "Landroid/widget/TextView;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$OnMirrorTypeSelectedListener;", "liveListListener", "com/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$liveListListener$1", "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$liveListListener$1;", "setOnMirrorTypeSelectedListener", "", "onStart", "onStop", "initView", "setupRecyclerView", "setupCancelButton", "OnMirrorTypeSelectedListener", "MirrorAdapter", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogC45189c extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<MirrorType> f101675m;

    /* JADX INFO: renamed from: n */
    public RecyclerView f101676n;

    /* JADX INFO: renamed from: o */
    public TextView f101677o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public b f101678p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final c f101679q;

    /* JADX INFO: renamed from: ud0.c$a */
    /* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$MirrorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$MirrorAdapter$ViewHolder;", "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel;", "data", "", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "<init>", "(Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel;Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "mirrorTypeToString", "", "mirrorType", "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.Adapter<C47030a> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final List<MirrorType> f101680i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DialogC45189c f101681j;

        /* JADX INFO: renamed from: ud0.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$MirrorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$MirrorAdapter;Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "divider", "getDivider", "()Landroid/view/View;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public final class C47030a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: g */
            @NotNull
            public final TextView f101682g;

            /* JADX INFO: renamed from: h */
            @NotNull
            public final View f101683h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ a f101684i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C47030a(@NotNull a aVar, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f101684i = aVar;
                View viewFindViewById = itemView.findViewById(R$id.tv_resolution_text);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f101682g = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(R$id.divider);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.f101683h = viewFindViewById2;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final View getF101683h() {
                return this.f101683h;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final TextView getF101682g() {
                return this.f101682g;
            }
        }

        /* JADX INFO: renamed from: ud0.c$a$b */
        /* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MirrorType.values().length];
                try {
                    iArr[MirrorType.AUTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MirrorType.ENABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MirrorType.DISABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull DialogC45189c dialogC45189c, List<? extends MirrorType> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f101681j = dialogC45189c;
            this.f101680i = data;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f101680i.size();
        }

        /* JADX INFO: renamed from: h */
        public final String m99836h(MirrorType mirrorType) {
            int i11 = b.$EnumSwitchMapping$0[mirrorType.ordinal()];
            if (i11 == 1) {
                String string = this.f101681j.getContext().getString(R$string.mirror_type_auto);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (i11 == 2) {
                String string2 = this.f101681j.getContext().getString(R$string.mirror_type_enable);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String string3 = this.f101681j.getContext().getString(R$string.mirror_type_disable);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C47030a holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final MirrorType mirrorType = this.f101680i.get(i11);
            holder.getF101682g().setText(m99836h(mirrorType));
            if (i11 == this.f101680i.size() - 1) {
                holder.getF101683h().setVisibility(8);
            } else {
                holder.getF101683h().setVisibility(0);
            }
            TextView f101682g = holder.getF101682g();
            final DialogC45189c dialogC45189c = this.f101681j;
            f101682g.setOnClickListener(new View.OnClickListener() { // from class: ud0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC45189c.a.m99835j(dialogC45189c, mirrorType, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C47030a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_recycler_item_mirror_type, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new C47030a(this, viewInflate);
        }

        /* JADX INFO: renamed from: j */
        public static final void m99835j(DialogC45189c dialogC45189c, MirrorType mirrorType, View view) {
            b bVar = dialogC45189c.f101678p;
            if (bVar != null) {
                bVar.mo80595a(mirrorType);
            }
            dialogC45189c.dismiss();
        }
    }

    /* JADX INFO: renamed from: ud0.c$b */
    /* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$OnMirrorTypeSelectedListener;", "", "onVideoQualitySelected", "", "mirrorType", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo80595a(@NotNull MirrorType mirrorType);
    }

    /* JADX INFO: renamed from: ud0.c$c */
    /* JADX INFO: compiled from: LocalMirrorSelectPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends LiveListListener {
        public c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            DialogC45189c.this.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC45189c(@NotNull Context context, @NotNull List<? extends MirrorType> mirrorTypeList) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mirrorTypeList, "mirrorTypeList");
        this.f101675m = mirrorTypeList;
        this.f101679q = new c();
        m99830E();
    }

    /* JADX INFO: renamed from: H */
    private final void m99832H() {
        RecyclerView recyclerView = this.f101676n;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        a aVar = new a(this, this.f101675m);
        RecyclerView recyclerView3 = this.f101676n;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(aVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m99833F() {
        TextView textView = this.f101677o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelButton");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: ud0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC45189c.m99831G(this.f101672b, view);
            }
        });
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStop() {
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f101679q);
        super.onStop();
    }

    public final void setOnMirrorTypeSelectedListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f101678p = listener;
    }

    /* JADX INFO: renamed from: E */
    private final void m99830E() {
        View viewInflate = View.inflate(getContext(), R$layout.livekit_layout_mirror_type_select_panel, null);
        View viewFindViewById = viewInflate.findViewById(R$id.rv_mirror_options);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f101676n = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f101677o = (TextView) viewFindViewById2;
        m99832H();
        m99833F();
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: G */
    public static final void m99831G(DialogC45189c dialogC45189c, View view) {
        dialogC45189c.dismiss();
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStart() {
        super.onStart();
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f101679q);
    }
}
