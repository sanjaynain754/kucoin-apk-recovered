package io.trtc.tuikit.atomicx.widget.basicwidget.avatar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cg0.C4968b;
import com.facebook.react.uimanager.ViewProps;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicx.R$styleable;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import io.trtc.tuikit.atomicx.widget.utils.ImageLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AtomicAvatar.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0005FGHIJB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0019J\u000e\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u001bJ\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u001dJ\u0018\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014J0\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0014J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u00020\u0007H\u0002J\u001a\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020\u0007H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020 H\u0002J\b\u0010B\u001a\u00020 H\u0002J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u000206H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "themeStore", "Lio/trtc/tuikit/atomicx/theme/ThemeStore;", LinearGradientManager.PROP_COLORS, "Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;", "getColors", "()Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;", "avatarContainer", "Landroid/widget/FrameLayout;", "imageView", "Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "badgeView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/Badge;", "avatarSize", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarSize;", "avatarShape", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarShape;", "avatarBadge", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge;", "actualAvatarSizePx", "parseAttributes", "", "setContent", "content", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent;", "setSize", "size", "setShape", "shape", "setBadge", "badge", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", ViewProps.ON_LAYOUT, "changed", "", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "calculateBadgeCenter", "Lkotlin/Pair;", "", "avatarSizePx", "setImageContent", "url", "", "placeImage", "setTextContent", "name", "setIconContent", "drawable", "Landroid/graphics/drawable/Drawable;", "applyShape", "applyBackgroundColor", "createRoundClipDrawable", "Landroid/view/ViewOutlineProvider;", "radius", "Companion", "AvatarContent", "AvatarBadge", "AvatarSize", "AvatarShape", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicAvatar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicAvatar.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,492:1\n1#2:493\n*E\n"})
public final class AtomicAvatar extends ViewGroup {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f87454k = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ThemeStore f87455b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FrameLayout f87456c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ImageView f87457d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f87458e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Badge f87459f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public AvatarSize f87460g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public AvatarShape f87461h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public AbstractC39362a f87462i;

    /* JADX INFO: renamed from: j */
    public int f87463j;

    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarShape;", "", "<init>", "(Ljava/lang/String;I)V", "Round", "RoundRectangle", "Rectangle", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum AvatarShape {
        Round,
        RoundRectangle,
        Rectangle;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87465c = EnumEntriesKt.enumEntries(m88110a());

        @NotNull
        public static EnumEntries<AvatarShape> getEntries() {
            return f87465c;
        }
    }

    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarSize;", "", "sizeDp", "", "textSizeSp", "borderRadiusDp", "<init>", "(Ljava/lang/String;IFFF)V", "getSizeDp", "()F", "getTextSizeSp", "getBorderRadiusDp", "XXS", "XS", ExifInterface.LATITUDE_SOUTH, "M", "L", "XL", "XXL", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum AvatarSize {
        XXS(16.0f, 10.0f, 4.0f),
        XS(28.0f, 12.0f, 4.0f),
        S(32.0f, 14.0f, 4.0f),
        M(40.0f, 16.0f, 4.0f),
        L(48.0f, 18.0f, 8.0f),
        XL(64.0f, 28.0f, 12.0f),
        XXL(96.0f, 36.0f, 12.0f);


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87472c = EnumEntriesKt.enumEntries(m88111a());
        private final float borderRadiusDp;
        private final float sizeDp;
        private final float textSizeSp;

        @NotNull
        public static EnumEntries<AvatarSize> getEntries() {
            return f87472c;
        }

        public final float getBorderRadiusDp() {
            return this.borderRadiusDp;
        }

        public final float getSizeDp() {
            return this.sizeDp;
        }

        public final float getTextSizeSp() {
            return this.textSizeSp;
        }

        AvatarSize(float f11, float f12, float f13) {
            this.sizeDp = f11;
            this.textSizeSp = f12;
            this.borderRadiusDp = f13;
        }
    }

    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$Companion;", "", "<init>", "()V", "SQRT2_OVER_2", "", "BADGE_EXTRA_PADDING_DP", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$a */
    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge;", "", "<init>", "()V", "None", "Dot", "Text", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge$Dot;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge$None;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge$Text;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC39362a {

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$a$a */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge$None;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge;", "<init>", "()V", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC39362a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f87473a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$a$b, reason: from toString */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge$Text;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarBadge;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Text extends AbstractC39362a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String text;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "Text(text=" + this.text + ')';
            }
        }

        public /* synthetic */ AbstractC39362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC39362a() {
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$b */
    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent;", "", "<init>", "()V", "URL", "Text", "Icon", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$Icon;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$Text;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$URL;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC39363b {

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$b$a, reason: from toString */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$Icon;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent;", "drawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Icon extends AbstractC39363b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final Drawable drawable;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && Intrinsics.areEqual(this.drawable, ((Icon) other).drawable);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Drawable getDrawable() {
                return this.drawable;
            }

            public int hashCode() {
                return this.drawable.hashCode();
            }

            @NotNull
            public String toString() {
                return "Icon(drawable=" + this.drawable + ')';
            }
        }

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$b$b, reason: from toString */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$Text;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Text extends AbstractC39363b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String name;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.name, ((Text) other).name);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            @NotNull
            public String toString() {
                return "Text(name=" + this.name + ')';
            }
        }

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$b$c, reason: from toString */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent$URL;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$AvatarContent;", "url", "", "placeImage", "", "<init>", "(Ljava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getPlaceImage", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class URL extends AbstractC39363b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String url;

            /* JADX INFO: renamed from: b, reason: from toString */
            public final int placeImage;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof URL)) {
                    return false;
                }
                URL url = (URL) other;
                return Intrinsics.areEqual(this.url, url.url) && this.placeImage == url.placeImage;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getPlaceImage() {
                return this.placeImage;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Integer.hashCode(this.placeImage);
            }

            @NotNull
            public String toString() {
                return "URL(url=" + this.url + ", placeImage=" + this.placeImage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public URL(@NotNull String url, @DrawableRes int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.placeImage = i11;
            }
        }

        public /* synthetic */ AbstractC39363b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC39363b() {
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$d */
    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"io/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$createRoundClipDrawable$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C39365d extends ViewOutlineProvider {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f87480b;

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$d$a */
        /* JADX INFO: compiled from: AtomicAvatar.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AvatarShape.values().length];
                try {
                    iArr[AvatarShape.Round.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AvatarShape.RoundRectangle.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C39365d(float f11) {
            this.f87480b = f11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float width;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            int i11 = a.$EnumSwitchMapping$0[AtomicAvatar.this.f87461h.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    width = this.f87480b;
                } else {
                    Context context = AtomicAvatar.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    width = C4968b.m5262a(context, AtomicAvatar.this.f87460g.getBorderRadiusDp());
                }
            } else {
                width = view.getWidth() / 2.0f;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), width);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicAvatar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar$c */
    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39364c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.Round.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.RoundRectangle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarShape.Rectangle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicAvatar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ColorTokens getColors() {
        return this.f87455b.m87980c().getValue().getCurrentTheme().getTokens().getColor();
    }

    private final void setIconContent(Drawable drawable) {
        this.f87457d.setVisibility(0);
        this.f87458e.setVisibility(8);
        this.f87457d.setImageDrawable(drawable);
    }

    private final void setTextContent(String name) {
        this.f87457d.setVisibility(8);
        this.f87458e.setVisibility(0);
        this.f87458e.setText(name);
    }

    /* JADX INFO: renamed from: c */
    public final void m88104c() {
        this.f87456c.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.transparent));
    }

    /* JADX INFO: renamed from: d */
    public final void m88105d() {
        ViewOutlineProvider viewOutlineProviderM88107f;
        int iM5262a = this.f87463j;
        if (iM5262a <= 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM5262a = C4968b.m5262a(context, this.f87460g.getSizeDp());
        }
        float f11 = iM5262a;
        int i11 = C39364c.$EnumSwitchMapping$0[this.f87461h.ordinal()];
        if (i11 == 1) {
            viewOutlineProviderM88107f = m88107f(f11 / 2);
        } else if (i11 == 2) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            viewOutlineProviderM88107f = m88107f(C4968b.m5262a(context2, this.f87460g.getBorderRadiusDp()));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            viewOutlineProviderM88107f = null;
        }
        this.f87456c.setClipToOutline(viewOutlineProviderM88107f != null);
        this.f87456c.setOutlineProvider(viewOutlineProviderM88107f);
    }

    /* JADX INFO: renamed from: e */
    public final Pair<Float, Float> m88106e(int i11) {
        int i12 = C39364c.$EnumSwitchMapping$0[this.f87461h.ordinal()];
        if (i12 == 1) {
            float f11 = i11 / 2.0f;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fM5262a = (C4968b.m5262a(context, 2.0f) + f11) * 0.70710677f;
            return TuplesKt.m90091to(Float.valueOf(f11 + fM5262a), Float.valueOf(f11 - fM5262a));
        }
        if (i12 != 2) {
            if (i12 == 3) {
                return TuplesKt.m90091to(Float.valueOf(i11), Float.valueOf(0.0f));
            }
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C4968b.m5262a(context2, this.f87460g.getBorderRadiusDp());
        return TuplesKt.m90091to(Float.valueOf(i11), Float.valueOf(0.0f));
    }

    /* JADX INFO: renamed from: f */
    public final ViewOutlineProvider m88107f(float f11) {
        return new C39365d(f11);
    }

    /* JADX INFO: renamed from: h */
    public final void m88109h(String str, @DrawableRes int i11) {
        this.f87457d.setVisibility(0);
        this.f87458e.setVisibility(8);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader.m88214b(context, this.f87457d, str, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int measuredHeight;
        int i11 = this.f87463j;
        Pair<Float, Float> pairM88106e = m88106e(i11);
        float fFloatValue = pairM88106e.component1().floatValue();
        float fFloatValue2 = pairM88106e.component2().floatValue();
        Badge badge = this.f87459f;
        int i12 = (badge == null || (measuredHeight = (int) (fFloatValue2 - ((float) (badge.getMeasuredHeight() / 2)))) >= 0) ? 0 : -measuredHeight;
        this.f87456c.layout(0, i12, i11, i12 + i11);
        Badge badge2 = this.f87459f;
        if (badge2 != null) {
            int measuredWidth = badge2.getMeasuredWidth();
            int measuredHeight2 = badge2.getMeasuredHeight();
            int i13 = (int) (fFloatValue - (measuredWidth / 2));
            int i14 = ((int) (fFloatValue2 - (measuredHeight2 / 2))) + i12;
            badge2.layout(i13, i14, measuredWidth + i13, measuredHeight2 + i14);
        }
    }

    public final void setBadge(@NotNull AbstractC39362a badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f87462i = badge;
        View view = this.f87459f;
        if (view != null) {
            removeView(view);
        }
        this.f87459f = null;
        if (!(badge instanceof AbstractC39362a.a)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Badge badge2 = new Badge(context, null, 0, 6, null);
            if (badge instanceof AbstractC39362a.Text) {
                badge2.m88119c(((AbstractC39362a.Text) badge).getText());
                badge2.m88120d(Badge.BadgeType.Text);
            }
            this.f87459f = badge2;
            addView(badge2);
        }
        requestLayout();
    }

    public final void setContent(@NotNull AbstractC39363b content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content instanceof AbstractC39363b.URL) {
            AbstractC39363b.URL url = (AbstractC39363b.URL) content;
            m88109h(url.getUrl(), url.getPlaceImage());
        } else if (content instanceof AbstractC39363b.Text) {
            setTextContent(((AbstractC39363b.Text) content).getName());
        } else {
            if (!(content instanceof AbstractC39363b.Icon)) {
                throw new NoWhenBranchMatchedException();
            }
            setIconContent(((AbstractC39363b.Icon) content).getDrawable());
        }
    }

    public final void setShape(@NotNull AvatarShape shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f87461h = shape;
        m88105d();
    }

    public /* synthetic */ AtomicAvatar(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public final void m88108g(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.AtomicAvatar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f87460g = AvatarSize.values()[typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicAvatar_avatarSize, AvatarSize.M.ordinal())];
            this.f87461h = AvatarShape.values()[typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicAvatar_avatarShape, AvatarShape.Round.ordinal())];
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 1073741824 && mode2 == 1073741824) {
            size = Math.min(size, size2);
        } else if (mode != 1073741824) {
            if (mode2 == 1073741824) {
                size = size2;
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                size = C4968b.m5262a(context, this.f87460g.getSizeDp());
            }
        }
        if (this.f87463j != size) {
            this.f87463j = size;
            m88105d();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f87463j, 1073741824);
        this.f87456c.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int i12 = this.f87463j;
        Badge badge = this.f87459f;
        if (badge != null) {
            int i13 = 0;
            badge.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = badge.getMeasuredWidth();
            int measuredHeight = badge.getMeasuredHeight();
            Pair<Float, Float> pairM88106e = m88106e(this.f87463j);
            float fFloatValue = pairM88106e.component1().floatValue();
            int iFloatValue = (int) (pairM88106e.component2().floatValue() - (measuredHeight / 2));
            int i14 = ((int) (fFloatValue - (measuredWidth / 2))) + measuredWidth;
            int i15 = this.f87463j;
            if (i14 > i15) {
                i12 = i14;
            }
            if (iFloatValue < 0) {
                i13 = -iFloatValue;
            }
            i11 = i15 + i13;
        } else {
            i11 = i12;
        }
        setMeasuredDimension(View.resolveSize(i12, widthMeasureSpec), View.resolveSize(i11, heightMeasureSpec));
    }

    public final void setSize(@NotNull AvatarSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f87460g = size;
        this.f87458e.setTextSize(2, size.getTextSizeSp());
        m88105d();
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicAvatar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87455b = ThemeStore.f87316e.shared(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(true);
        this.f87456c = frameLayout;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setVisibility(8);
        this.f87457d = imageView;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setVisibility(8);
        textView.setTextColor(getColors().getTextColorPrimary());
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f87458e = textView;
        this.f87460g = AvatarSize.M;
        this.f87461h = AvatarShape.Round;
        this.f87462i = AbstractC39362a.a.f87473a;
        frameLayout.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(textView, new ViewGroup.LayoutParams(-1, -1));
        addView(frameLayout);
        if (attributeSet != null) {
            m88108g(attributeSet);
        }
        setSize(this.f87460g);
        m88105d();
        m88104c();
    }
}
