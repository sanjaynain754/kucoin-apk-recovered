package zc0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioReverbType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zc0.d */
/* JADX INFO: compiled from: ReverbAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audioeffect/view/ReverbAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/audioeffect/view/ReverbAdapter$ViewHolder;", "context", "Landroid/content/Context;", "audioEffectStore", "Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;)V", "data", "", "Lcom/trtc/uikit/livekit/component/audioeffect/view/ReverbAdapter$ReverbItem;", "selectedPosition", "", "initData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "ReverbItem", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46759d extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f104609i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AudioEffectStore f104610j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<a> f104611k;

    /* JADX INFO: renamed from: l */
    public int f104612l;

    /* JADX INFO: renamed from: zc0.d$a */
    /* JADX INFO: compiled from: ReverbAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audioeffect/view/ReverbAdapter$ReverbItem;", "", "title", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "type", "Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;", "<init>", "(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "getType", "()Lio/trtc/tuikit/atomicxcore/api/device/AudioReverbType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f104613a;

        /* JADX INFO: renamed from: b */
        public final int f104614b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final AudioReverbType f104615c;

        public a(@NotNull String title, int i11, @NotNull AudioReverbType type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f104613a = title;
            this.f104614b = i11;
            this.f104615c = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF104614b() {
            return this.f104614b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF104613a() {
            return this.f104613a;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AudioReverbType getF104615c() {
            return this.f104615c;
        }
    }

    /* JADX INFO: renamed from: zc0.d$b */
    /* JADX INFO: compiled from: ReverbAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audioeffect/view/ReverbAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "layoutRoot", "Landroid/widget/LinearLayout;", "getLayoutRoot", "()Landroid/widget/LinearLayout;", "textTitle", "Landroid/widget/TextView;", "getTextTitle", "()Landroid/widget/TextView;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f104616g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f104617h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f104618i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f104616g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f104617h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f104618i = (ImageView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF104618i() {
            return this.f104618i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF104616g() {
            return this.f104616g;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF104617h() {
            return this.f104617h;
        }
    }

    public C46759d(@NotNull Context context, @NotNull AudioEffectStore audioEffectStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audioEffectStore, "audioEffectStore");
        this.f104609i = context;
        this.f104610j = audioEffectStore;
        this.f104611k = new ArrayList();
        m103032h();
    }

    /* JADX INFO: renamed from: h */
    private final void m103032h() {
        List<a> list = this.f104611k;
        String string = this.f104609i.getString(R$string.common_reverb_none);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new a(string, R$drawable.audio_effect_select_none, AudioReverbType.NONE));
        List<a> list2 = this.f104611k;
        String string2 = this.f104609i.getString(R$string.common_reverb_karaoke);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(new a(string2, R$drawable.audio_effect_reverb_ktv, AudioReverbType.KTV));
        List<a> list3 = this.f104611k;
        String string3 = this.f104609i.getString(R$string.common_reverb_metallic_sound);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list3.add(new a(string3, R$drawable.audio_effect_reverb_metallic_sound, AudioReverbType.METALLIC));
        List<a> list4 = this.f104611k;
        String string4 = this.f104609i.getString(R$string.common_reverb_low);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        list4.add(new a(string4, R$drawable.audio_effect_reverb_low, AudioReverbType.DEEP));
        List<a> list5 = this.f104611k;
        String string5 = this.f104609i.getString(R$string.common_reverb_loud_and_loud);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        list5.add(new a(string5, R$drawable.audio_effect_reverb_loud_and_loud, AudioReverbType.LOUD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104611k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final b holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final a aVar = this.f104611k.get(i11);
        holder.getF104617h().setText(aVar.getF104613a());
        holder.getF104618i().setImageResource(aVar.getF104614b());
        if (aVar.getF104615c() == this.f104610j.getAudioEffectState().getAudioReverbType().getValue()) {
            holder.getF104618i().setBackgroundResource(R$drawable.audio_effect_settings_item_select_background);
            this.f104612l = this.f104611k.indexOf(aVar);
        } else {
            holder.getF104618i().setBackgroundResource(R$drawable.audio_effect_settings_item_not_select_background);
        }
        holder.getF104616g().setOnClickListener(new View.OnClickListener() { // from class: zc0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C46759d.m103033j(holder, this, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.audio_effect_layout_reverb_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    /* JADX INFO: renamed from: j */
    public static final void m103033j(b bVar, C46759d c46759d, a aVar, View view) {
        int bindingAdapterPosition = bVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            c46759d.f104610j.setAudioReverbType(aVar.getF104615c());
            c46759d.notifyItemChanged(bindingAdapterPosition);
            c46759d.notifyItemChanged(c46759d.f104612l);
        }
    }
}
