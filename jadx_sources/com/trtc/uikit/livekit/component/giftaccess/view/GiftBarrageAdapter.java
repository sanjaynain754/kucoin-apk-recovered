package com.trtc.uikit.livekit.component.giftaccess.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cd0.InterfaceC4935a;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.material.navigation.NavigationBarView;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;
import p445m2.AbstractC42392c;
import p460n2.InterfaceC42704b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rd0.C43993c;

/* JADX INFO: compiled from: GiftBarrageAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter;", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemAdapter;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mDefaultGiftIcon", "Landroid/graphics/drawable/Drawable;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "", "barrage", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "Companion", "GiftViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftBarrageAdapter implements InterfaceC4935a {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f77881c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f77882a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Drawable f77883b;

    /* JADX INFO: compiled from: GiftBarrageAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter$Companion;", "", "<init>", "()V", "TAG", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.giftaccess.view.GiftBarrageAdapter$a */
    /* JADX INFO: compiled from: GiftBarrageAdapter.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter$GiftViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "defaultGiftIcon", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "textView", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "random", "Ljava/security/SecureRandom;", "bind", "", "barrage", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "loadGiftIcon", "url", "", "sb", "Landroid/text/SpannableStringBuilder;", "start", "", "end", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35936a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final Drawable f77884g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f77885h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Context f77886i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final SecureRandom f77887j;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.giftaccess.view.GiftBarrageAdapter$a$a */
        /* JADX INFO: compiled from: GiftBarrageAdapter.kt */
        @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/component/giftaccess/view/GiftBarrageAdapter$GiftViewHolder$loadGiftIcon$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadCleared", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Landroid/graphics/drawable/Drawable;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC42392c<Bitmap> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ SpannableStringBuilder f77889f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f77890g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ int f77891h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ String f77892i;

            public a(SpannableStringBuilder spannableStringBuilder, int i11, int i12, String str) {
                this.f77889f = spannableStringBuilder;
                this.f77890g = i11;
                this.f77891h = i12;
                this.f77892i = str;
            }

            @Override // p445m2.InterfaceC42399j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                ImageSpan imageSpan = new ImageSpan(C35936a.this.f77886i, resource);
                imageSpan.getDrawable().setBounds(C35936a.this.f77884g.getBounds());
                this.f77889f.setSpan(imageSpan, this.f77890g, this.f77891h, 33);
                C35936a.this.f77885h.setText(this.f77889f);
            }

            @Override // p445m2.InterfaceC42399j
            /* JADX INFO: renamed from: c */
            public void mo59882c(Drawable drawable) {
                Log.e("GiftBarrageAdapter", "glide load failed: " + this.f77892i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35936a(@NotNull View itemView, @NotNull Drawable defaultGiftIcon) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(defaultGiftIcon, "defaultGiftIcon");
            this.f77884g = defaultGiftIcon;
            this.f77887j = new SecureRandom();
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f77886i = context;
            LinearLayout linearLayout = (LinearLayout) itemView;
            View childAt = linearLayout.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) childAt;
            this.f77885h = textView;
            linearLayout.setPadding(0, ScreenUtil.dip2px(3.0f), 0, ScreenUtil.dip2px(3.0f));
            textView.setTextColor(-1);
            textView.setTextSize(12.0f);
            textView.setTypeface(null, 1);
            textView.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
            textView.setPadding(ScreenUtil.dip2px(5.0f), ScreenUtil.dip2px(5.0f), ScreenUtil.dip2px(5.0f), ScreenUtil.dip2px(5.0f));
            textView.setBackgroundResource(R$drawable.git_barrage_bg_msg_item);
        }

        /* JADX INFO: renamed from: d */
        public final void m79770d(@NotNull Barrage barrage) {
            Intrinsics.checkNotNullParameter(barrage, "barrage");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String userName = barrage.getSender().getUserName();
            if (TextUtils.isEmpty(userName)) {
                userName = "";
            }
            spannableStringBuilder.append((CharSequence) userName);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f77886i.getResources().getColor(R$color.common_barrage_user_name_color));
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, userName.length(), 33);
            spannableStringBuilder.append(' ' + this.f77886i.getString(R$string.common_sent) + ' ');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(barrage.getExtensionInfo().get("gift_receiver_username"));
            sb2.append(' ');
            String string = sb2.toString();
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(foregroundColorSpan.getForegroundColor()), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            String strValueOf = String.valueOf(barrage.getExtensionInfo().get("gift_name"));
            spannableStringBuilder.append((CharSequence) strValueOf);
            Resources resources = this.f77886i.getResources();
            C43993c c43993c = C43993c.f97231a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(resources.getColor(c43993c.m96955a()[this.f77887j.nextInt(c43993c.m96955a().length)])), spannableStringBuilder.length() - strValueOf.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(C33627eb.f69716f);
            int length = spannableStringBuilder.length();
            int i11 = length - 1;
            ImageSpan imageSpan = new ImageSpan(this.f77884g);
            imageSpan.getDrawable().setBounds(this.f77884g.getBounds());
            spannableStringBuilder.setSpan(imageSpan, i11, length, 33);
            spannableStringBuilder.append("x").append(String.valueOf(barrage.getExtensionInfo().get("gift_count"))).append("   ");
            this.f77885h.setText(spannableStringBuilder);
            m79771e(String.valueOf(barrage.getExtensionInfo().get("gift_icon_url")), spannableStringBuilder, i11, length);
        }

        /* JADX INFO: renamed from: e */
        public final void m79771e(String str, SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
            ComponentCallbacks2C5309c.m6556t(this.f77886i).mo6621d().mo6601L0(str).m6591B0(new a(spannableStringBuilder, i11, i12, str));
        }
    }

    public GiftBarrageAdapter(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f77882a = mContext;
        ColorDrawable colorDrawable = new ColorDrawable(-12303292);
        this.f77883b = colorDrawable;
        colorDrawable.setBounds(new Rect(0, 0, ScreenUtil.dip2px(13.0f), ScreenUtil.dip2px(13.0f)));
    }

    @Override // cd0.InterfaceC4935a
    @NotNull
    /* JADX INFO: renamed from: a */
    public RecyclerView.ViewHolder mo5162a(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(this.f77882a);
        linearLayout.addView(new TextView(this.f77882a));
        return new C35936a(linearLayout, this.f77883b);
    }

    @Override // cd0.InterfaceC4935a
    /* JADX INFO: renamed from: b */
    public void mo5163b(@NotNull RecyclerView.ViewHolder holder, int i11, @NotNull Barrage barrage) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(barrage, "barrage");
        ((C35936a) holder).m79770d(barrage);
    }
}
