package com.trtc.uikit.livekit.component.barrage.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.barrage.view.EmojiLayout;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmojiLayout.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "emojiResIds", "", "", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "emojiView", "Landroidx/recyclerview/widget/RecyclerView;", "deleteView", "Landroidx/cardview/widget/CardView;", "emojiSpace", "emojiListener", "Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout$EmojiListener;", "", "initViews", "", "setDeleteViewEnable", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "setEmojiListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ImageViewHolder", "EmojiListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class EmojiLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RecyclerView f77656b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CardView f77657c;

    /* JADX INFO: renamed from: d */
    public final int f77658d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC35894a f77659e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<Integer> f77660f;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.EmojiLayout$a */
    /* JADX INFO: compiled from: EmojiLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout$EmojiListener;", "", "onDelete", "", "onAddEmoji", "resId", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35894a {
        /* JADX INFO: renamed from: b */
        void mo79532b(int i11);

        void onDelete();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.EmojiLayout$b */
    /* JADX INFO: compiled from: EmojiLayout.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", ViewProps.PADDING, "", "<init>", "(Landroid/view/View;I)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "bind", "", "resId", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35895b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final int f77661g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final ImageView f77662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35895b(@NotNull View itemView, int i11) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f77661g = i11;
            this.f77662h = (ImageView) itemView;
        }

        /* JADX INFO: renamed from: a */
        public final void m79539a(int i11) {
            Drawable drawable = ResourcesCompat.getDrawable(this.itemView.getResources(), i11, null);
            ImageView imageView = this.f77662h;
            int i12 = this.f77661g;
            imageView.setPadding(i12, i12, i12, i12);
            this.f77662h.setImageDrawable(drawable);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF77662h() {
            return this.f77662h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.EmojiLayout$c */
    /* JADX INFO: compiled from: EmojiLayout.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/component/barrage/view/EmojiLayout$initViews$1", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout$ImageViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35896c extends RecyclerView.Adapter<C35895b> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ int f77664j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ int f77665k;

        public C35896c(int i11, int i12) {
            this.f77664j = i11;
            this.f77665k = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return EmojiLayout.this.f77660f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C35895b holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final int iIntValue = ((Number) EmojiLayout.this.f77660f.get(i11)).intValue();
            ImageView f77662h = holder.getF77662h();
            final EmojiLayout emojiLayout = EmojiLayout.this;
            f77662h.setOnClickListener(new View.OnClickListener() { // from class: bd0.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmojiLayout.C35896c.m79542i(emojiLayout, iIntValue, view);
                }
            });
            holder.m79539a(iIntValue);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C35895b onCreateViewHolder(ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ViewParent parent2 = EmojiLayout.this.f77656b.getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            int width = ((ViewGroup) parent2).getWidth();
            int i12 = this.f77664j;
            int i13 = this.f77665k;
            int i14 = ((width - (((i12 + 1) * 2) * i13)) / i12) + (i13 * 2);
            ImageView imageView = new ImageView(EmojiLayout.this.getContext());
            imageView.setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
            return new C35895b(imageView, this.f77665k);
        }

        /* JADX INFO: renamed from: i */
        public static final void m79542i(EmojiLayout emojiLayout, int i11, View view) {
            InterfaceC35894a interfaceC35894a = emojiLayout.f77659e;
            if (interfaceC35894a != null) {
                interfaceC35894a.mo79532b(i11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiLayout(@NotNull Context context, @NotNull List<Integer> emojiResIds) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(emojiResIds, "emojiResIds");
        this.f77658d = ScreenUtil.dip2px(13.0f);
        this.f77660f = CollectionsKt.toMutableList((Collection) emojiResIds);
        View.inflate(context, R$layout.livekit_barrage_emoji_view, this);
        View viewFindViewById = findViewById(R$id.rv_emoji_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77656b = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cd_delete);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77657c = (CardView) viewFindViewById2;
        m79538e();
    }

    /* JADX INFO: renamed from: f */
    public static final void m79537f(EmojiLayout emojiLayout, View view) {
        InterfaceC35894a interfaceC35894a = emojiLayout.f77659e;
        if (interfaceC35894a != null) {
            interfaceC35894a.onDelete();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m79538e() {
        int i11 = this.f77658d / 2;
        this.f77656b.setPadding(i11, 0, i11, 0);
        this.f77656b.setLayoutManager(new GridLayoutManager(getContext(), 8));
        this.f77656b.setAdapter(new C35896c(8, i11));
        this.f77657c.setOnClickListener(new View.OnClickListener() { // from class: bd0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiLayout.m79537f(this.f4042b, view);
            }
        });
    }

    public final void setDeleteViewEnable(boolean enable) {
        this.f77657c.getChildAt(0).setEnabled(enable);
    }

    public final void setEmojiListener(@NotNull InterfaceC35894a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77659e = listener;
    }
}
