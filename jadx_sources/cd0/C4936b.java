package cd0;

import ad0.C0241a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import bd0.C4561a;
import bd0.C4577q;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: cd0.b */
/* JADX INFO: compiled from: BarrageItemDefaultAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0017J(\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000eH\u0002J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0018\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemDefaultAdapter;", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemAdapter;", "context", "Landroid/content/Context;", TUIConstantDefine.OWNER_ID, "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "mLayoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "mEmojiResource", "Lcom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource;", "isRtl", "", "userNameColor", "", "contentColor", "anchorTagText", "anchorTagBackground", "Landroid/graphics/drawable/Drawable;", "anchorTagWidth", "anchorTagHeight", "anchorTagMarginEnd", "anchorTagTextSize", "", "onBindViewHolder", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ViewProps.POSITION, "barrage", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "buildMessageContent", "Landroid/text/SpannableStringBuilder;", TUIConstantDefine.USER_NAME, "textContent", "fontSize", "isOwner", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "getFontSize", "textView", "Landroid/widget/TextView;", "getContentWithEmoji", "processEmojiSpan", "sb", "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBarrageItemDefaultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarrageItemDefaultAdapter.kt\ncom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemDefaultAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
public final class C4936b implements InterfaceC4935a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f5475a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f5476b;

    /* JADX INFO: renamed from: c */
    public final LayoutInflater f5477c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C0241a f5478d;

    /* JADX INFO: renamed from: e */
    public final boolean f5479e;

    /* JADX INFO: renamed from: f */
    public final int f5480f;

    /* JADX INFO: renamed from: g */
    public final int f5481g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final String f5482h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Drawable f5483i;

    /* JADX INFO: renamed from: j */
    public final int f5484j;

    /* JADX INFO: renamed from: k */
    public final int f5485k;

    /* JADX INFO: renamed from: l */
    public final int f5486l;

    /* JADX INFO: renamed from: m */
    public final float f5487m;

    /* JADX INFO: renamed from: cd0.b$a */
    /* JADX INFO: compiled from: BarrageItemDefaultAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemDefaultAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemDefaultAdapter;Landroid/view/View;)V", "avatarView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getAvatarView", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textMsgContent", "Landroid/widget/TextView;", "getTextMsgContent", "()Landroid/widget/TextView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f5488g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f5489h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C4936b f5490i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C4936b c4936b, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f5490i = c4936b;
            View viewFindViewById = itemView.findViewById(R$id.iv_avatar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f5488g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_msg_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f5489h = (TextView) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF5488g() {
            return this.f5488g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF5489h() {
            return this.f5489h;
        }
    }

    public C4936b(@NotNull Context context, @NotNull String ownerId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f5475a = context;
        this.f5476b = ownerId;
        this.f5477c = LayoutInflater.from(context);
        this.f5478d = new C0241a();
        this.f5479e = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f5480f = ContextCompat.getColor(context, R$color.livekit_barrage_user_name_color);
        this.f5481g = ContextCompat.getColor(context, R$color.livekit_barrage_g8);
        String string = context.getString(R$string.live_barrage_anchor);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f5482h = string;
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.livekit_barrage_bg_anchor_flag);
        Intrinsics.checkNotNull(drawable);
        this.f5483i = drawable;
        this.f5484j = (int) TypedValue.applyDimension(1, 44.0f, context.getResources().getDisplayMetrics());
        this.f5485k = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        this.f5486l = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
        this.f5487m = TypedValue.applyDimension(2, 9.0f, context.getResources().getDisplayMetrics());
    }

    @Override // cd0.InterfaceC4935a
    @NotNull
    /* JADX INFO: renamed from: a */
    public RecyclerView.ViewHolder mo5162a(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.f5477c.inflate(R$layout.livekit_barrage_item_msg, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(this, viewInflate);
    }

    @Override // cd0.InterfaceC4935a
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b */
    public void mo5163b(@NotNull RecyclerView.ViewHolder holder, int i11, @NotNull Barrage barrage) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(barrage, "barrage");
        a aVar = (a) holder;
        int iM5166e = m5166e(aVar.getF5489h());
        aVar.getF5488g().setContent(new AtomicAvatar.AbstractC39363b.URL(barrage.getSender().getAvatarURL(), R$drawable.room_info_default_avatar));
        String userName = barrage.getSender().getUserName();
        if (userName.length() <= 0) {
            userName = null;
        }
        if (userName == null) {
            userName = barrage.getSender().getUserID();
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f5476b, barrage.getSender().getUserID());
        aVar.getF5489h().setText(m5164c(userName, barrage.getTextContent(), iM5166e, zAreEqual));
        aVar.getF5489h().setMovementMethod(zAreEqual ? LinkMovementMethod.getInstance() : null);
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m5164c(String str, String str2, int i11, boolean z11) {
        SpannableStringBuilder spannableStringBuilderM5165d = m5165d(str2, i11);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!this.f5479e) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) "\u200b");
                String str3 = this.f5482h;
                int i12 = this.f5481g;
                float f11 = this.f5487m;
                Drawable.ConstantState constantState = this.f5483i.getConstantState();
                Intrinsics.checkNotNull(constantState);
                Drawable drawableMutate = constantState.newDrawable().mutate();
                Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
                spannableStringBuilder.setSpan(new C4561a(str3, i12, f11, drawableMutate, this.f5484j, this.f5485k, this.f5486l, false), 0, 1, 33);
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) (str + ' '));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5480f), length, length2, 33);
            int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, this.f5475a.getResources().getDisplayMetrics());
            spannableStringBuilder.append((CharSequence) "\u2002");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iApplyDimension), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilderM5165d);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5481g), length2, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) "\u200b");
            String str4 = this.f5482h;
            int i13 = this.f5481g;
            float f12 = this.f5487m;
            Drawable.ConstantState constantState2 = this.f5483i.getConstantState();
            Intrinsics.checkNotNull(constantState2);
            Drawable drawableMutate2 = constantState2.newDrawable().mutate();
            Intrinsics.checkNotNullExpressionValue(drawableMutate2, "mutate(...)");
            spannableStringBuilder.setSpan(new C4561a(str4, i13, f12, drawableMutate2, this.f5484j, this.f5485k, this.f5486l, true), 0, 1, 33);
        }
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (str + (char) 8207));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5480f), length3, spannableStringBuilder.length(), 33);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, this.f5475a.getResources().getDisplayMetrics());
        spannableStringBuilder.append((CharSequence) "\u2002");
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iApplyDimension2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\u2066");
        int length4 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) spannableStringBuilderM5165d);
        int length5 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u2069");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f5481g), length4, length5, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m5165d(String str, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        m5167f(spannableStringBuilder, i11);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final int m5166e(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Paint paint = new Paint();
        paint.setTextSize(textView.getTextSize());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: f */
    public final void m5167f(SpannableStringBuilder spannableStringBuilder, int i11) {
        String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        int i12 = 0;
        int i13 = 0;
        while (i12 < string.length()) {
            if (string.charAt(i12) == '[') {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, ']', i12, false, 4, (Object) null);
                if (iIndexOf$default != -1) {
                    int i14 = iIndexOf$default + 1;
                    String strSubstring = string.substring(i12, i14);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Integer numValueOf = Integer.valueOf(this.f5478d.m876c(strSubstring));
                    if (numValueOf.intValue() == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        Drawable drawableMo874a = this.f5478d.mo874a(this.f5475a, numValueOf.intValue(), new Rect(0, 0, i11, i11));
                        drawableMo874a.setBounds(0, 0, i11, i11);
                        spannableStringBuilder.setSpan(new C4577q(drawableMo874a, 0), i13, i14, 33);
                    }
                    i12 = iIndexOf$default;
                    i13 = i14;
                }
            } else {
                i13++;
            }
            i12++;
        }
    }
}
