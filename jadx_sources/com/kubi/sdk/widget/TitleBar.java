package com.kubi.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.R$color;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$font;
import com.kubi.sdk.R$id;
import com.kubi.sdk.R$styleable;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import i10.Menu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TitleBar.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b#\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\fJ\u0010\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\bJ\u001a\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\b2\b\b\u0001\u0010(\u001a\u00020\bJ\u000e\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020 J\u000e\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,J\u0018\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020/J\u0018\u00100\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020/J\u0010\u00101\u001a\u00020&2\b\b\u0001\u00102\u001a\u00020\bJ\u000e\u00101\u001a\u00020&2\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020&J\u001f\u00106\u001a\u00020&2\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020908\"\u000209¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020\bJ%\u0010?\u001a\n A*\u0004\u0018\u0001H@H@\"\b\b\u0000\u0010@*\u00020\u001a2\u0006\u0010B\u001a\u00020\b¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020&H\u0016J\b\u0010E\u001a\u00020&H\u0016J\u0012\u00100\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u000204H\u0016J\u0010\u0010H\u001a\u00020&2\u0006\u0010G\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\u000eH\u0016J\b\u0010J\u001a\u00020\u000eH\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010L\u001a\u0004\u0018\u00010\u000eH\u0016J1\u0010M\u001a\u00020&*\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010N\u001a\u00020\bH\u0002¢\u0006\u0002\u0010OJ\u0016\u0010(\u001a\u00020 *\u00020 2\b\b\u0001\u0010(\u001a\u00020\bH\u0002J\u000e\u0010P\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010Q\u001a\u00020\u001eJ\b\u0010R\u001a\u00020&H\u0002J\b\u0010S\u001a\u00020&H\u0002J\b\u0010T\u001a\u00020&H\u0002J\b\u0010U\u001a\u00020&H\u0002J\b\u0010V\u001a\u00020\u0016H\u0002J\b\u0010W\u001a\u00020 H\u0002J\u0010\u0010X\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010Y\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,J\u0006\u0010Z\u001a\u00020&R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, m90084d2 = {"Lcom/kubi/sdk/widget/TitleBar;", "Landroid/widget/RelativeLayout;", "Lcom/kubi/resources/INavigationBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navView", "Landroid/widget/ImageView;", "rightView", "navLayout", "Landroid/widget/FrameLayout;", "titleView", "Landroid/widget/TextView;", "titleLayout", "menuLayout", "Landroid/widget/LinearLayout;", "miniProgramLeftContainer", "miniProgramRightContainer", "miniProgramDivider", "Landroid/view/View;", "miniProgramLeftButton", "miniProgramRightButton", "mode", "Lcom/kubi/sdk/widget/TitleBarMode;", "navigationIcon", "Landroid/graphics/drawable/Drawable;", "titleText", "", "titleColor", "titleSize", "setNavigation", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "tint", "drawable", "setOnNavigationListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "setTitle", "setTitleIfEmpty", "titleRes", "title", "", "removeAllMenu", "setMenu", "list", "", "Lcom/kubi/sdk/widget/Menu;", "([Lcom/kubi/sdk/widget/Menu;)V", "addMenu", "index", "menu", "size", "getMenu", ExifInterface.GPS_DIRECTION_TRUE, "kotlin.jvm.PlatformType", "id", "(I)Landroid/view/View;", TIMPushProvider.f75062n, TIMPushProvider.f75063o, "setTitleTextColor", "color", "setBackGroundColor", "getLeftIcon", "getRightOneIcon", "getRightThreeIcon", "getRightTwoIcon", "setImageResource", "direction", "(Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "setMode", "getMode", "initNavigationForNormal", "initTitleForNormal", "initRightViewForNormal", "initMiniProgramLayout", "createMiniProgramRightContainer", "createMiniProgramRightBackground", "setMiniProgramLeftButtonListener", "setMiniProgramRightButtonListener", "hideMiniProgramLeftIcon", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTitleBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TitleBar.kt\ncom/kubi/sdk/widget/TitleBar\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,629:1\n52#2,9:630\n13537#3,3:639\n1#4:642\n470#5:643\n49#6:644\n*S KotlinDebug\n*F\n+ 1 TitleBar.kt\ncom/kubi/sdk/widget/TitleBar\n*L\n65#1:630,9\n186#1:639,3\n243#1:643\n586#1:644\n*E\n"})
public final class TitleBar extends RelativeLayout {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f48580r = new Companion(null);

    /* JADX INFO: renamed from: b */
    public ImageView f48581b;

    /* JADX INFO: renamed from: c */
    public ImageView f48582c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public FrameLayout f48583d;

    /* JADX INFO: renamed from: e */
    public TextView f48584e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public FrameLayout f48585f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public LinearLayout f48586g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public LinearLayout f48587h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public LinearLayout f48588i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public View f48589j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public ImageView f48590k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ImageView f48591l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public TitleBarMode f48592m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Drawable f48593n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public CharSequence f48594o;

    /* JADX INFO: renamed from: p */
    public int f48595p;

    /* JADX INFO: renamed from: q */
    public int f48596q;

    /* JADX INFO: compiled from: TitleBar.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/widget/TitleBar$Companion;", "", "<init>", "()V", "dp2px", "", "context", "Landroid/content/Context;", "dp", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int dp2px(@NotNull Context context, int dp2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) ((dp2 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48592m = TitleBarMode.NORMAL;
        int[] TitleBar = R$styleable.TitleBar;
        Intrinsics.checkNotNullExpressionValue(TitleBar, "TitleBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TitleBar, 0, 0);
        this.f48592m = TitleBarMode.INSTANCE.fromValue(typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_mode, 0));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.TitleBar_navigationIcon);
        this.f48593n = drawable == null ? ResourcesCompat.getDrawable(context.getResources(), R$drawable.ic2_arrow_left2_20, context.getTheme()) : drawable;
        this.f48594o = typedArrayObtainStyledAttributes.getText(R$styleable.TitleBar_titleText);
        this.f48595p = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_titleColor, ContextCompat.getColor(context, R$color.emphasis));
        this.f48596q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_titleSize, C43881b.m96650a(18));
        int i12 = C24338a.$EnumSwitchMapping$0[this.f48592m.ordinal()];
        if (i12 == 1) {
            m58936h();
            m58938j();
            m58937i();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m58935g();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Nullable
    public ImageView getRightThreeIcon() {
        return null;
    }

    @Nullable
    public ImageView getRightTwoIcon() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m58941n() {
        setVisibility(0);
    }

    public final void setNavigation(@DrawableRes int icon) {
        ImageView imageView = this.f48581b;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView = null;
        }
        imageView.setImageResource(icon);
        ImageView imageView3 = this.f48581b;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
        FrameLayout frameLayout = this.f48583d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void setTitleIfEmpty(@StringRes int titleRes) {
        setTitle(getContext().getString(titleRes));
    }

    /* JADX INFO: renamed from: com.kubi.sdk.widget.TitleBar$a */
    /* JADX INFO: compiled from: TitleBar.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24338a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TitleBarMode.values().length];
            try {
                iArr[TitleBarMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitleBarMode.MINI_PROGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Drawable m58929l(TextView textView, Integer num, TitleBar titleBar, Integer num2) {
        if (num2 == null) {
            return null;
        }
        Drawable drawable = textView.getContext().getResources().getDrawable(num2.intValue());
        if (drawable != null) {
            return num != null ? titleBar.m58942o(drawable, textView.getContext().getResources().getColor(num.intValue())) : drawable;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m58930b(int i11, @NotNull Menu menu, int i12) {
        CharSequence string;
        Intrinsics.checkNotNullParameter(menu, "menu");
        LinearLayout linearLayout = this.f48586g;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            Unit unit = Unit.INSTANCE;
            addView(linearLayout, layoutParams);
            this.f48586g = linearLayout;
        }
        TextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(menu.getId());
        appCompatTextView.setGravity(17);
        Integer text = menu.getText();
        if (text != null) {
            string = getResources().getString(text.intValue());
        } else {
            string = null;
        }
        appCompatTextView.setText(string);
        appCompatTextView.setTextSize(2, menu.getTextSize());
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), menu.getTextColor()));
        appCompatTextView.setCompoundDrawablePadding(menu.getDrawablePadding());
        if (i11 == i12 - 1) {
            appCompatTextView.setPaddingRelative(C43881b.m96650a(8), 0, C43881b.m96650a(16), 0);
        } else {
            appCompatTextView.setPaddingRelative(C43881b.m96650a(8), 0, C43881b.m96650a(8), 0);
        }
        m58939k(appCompatTextView, menu.getIcon(), menu.getTint(), menu.getDirection());
        appCompatTextView.setOnClickListener(menu.getListener());
        linearLayout.addView(appCompatTextView, i11, new LinearLayout.LayoutParams(-2, -1));
    }

    /* JADX INFO: renamed from: d */
    public final LinearLayout m58932d() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(m58931c());
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setImageResource(R$drawable.ic2_more_24);
        Context context = appCompatImageView.getContext();
        int i11 = R$color.c_text;
        C27046k.m66701p(appCompatImageView, ContextCompat.getColor(context, i11));
        this.f48590k = appCompatImageView;
        int iM96650a = C43881b.m96650a(24);
        int iM96650a2 = C43881b.m96650a(10);
        int iM96650a3 = C43881b.m96650a(8);
        ImageView imageView = this.f48590k;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM96650a, iM96650a);
        layoutParams.setMargins(iM96650a2, C43881b.m96650a(3), iM96650a3, C43881b.m96650a(3));
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(imageView, layoutParams);
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R$color.emphasis8));
        linearLayout.addView(view, new LinearLayout.LayoutParams(C43881b.m96650a(1), C43881b.m96650a(14)));
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(linearLayout.getContext());
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView2.setImageResource(R$drawable.ic2_close_titlebar);
        C27046k.m66701p(appCompatImageView2, ContextCompat.getColor(appCompatImageView2.getContext(), i11));
        this.f48591l = appCompatImageView2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C43881b.m96650a(24), C43881b.m96650a(24));
        layoutParams2.setMarginStart(C43881b.m96650a(6));
        layoutParams2.setMarginEnd(C43881b.m96650a(8));
        linearLayout.addView(appCompatImageView2, layoutParams2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: f */
    public void m58934f() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public final void m58935g() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f48581b = appCompatImageView;
        appCompatImageView.setId(R$id.base_titlebar_iv_back);
        ImageView imageView = this.f48581b;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView = null;
        }
        imageView.setImageDrawable(this.f48593n);
        ImageView imageView2 = this.f48581b;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView2 = null;
        }
        Context context = getContext();
        int i11 = R$color.c_text;
        C27046k.m66701p(imageView2, ContextCompat.getColor(context, i11));
        ImageView imageView3 = this.f48581b;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView3 = null;
        }
        imageView3.setVisibility(8);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        this.f48582c = appCompatImageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        appCompatImageView2.setScaleType(scaleType);
        ImageView imageView4 = this.f48582c;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightView");
            imageView4 = null;
        }
        imageView4.setVisibility(8);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f48584e = appCompatTextView;
        appCompatTextView.setText(this.f48594o);
        TextView textView2 = this.f48584e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView2 = null;
        }
        textView2.setTextColor(this.f48595p);
        TextView textView3 = this.f48584e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView3 = null;
        }
        Context context2 = getContext();
        int i12 = R$font.semi;
        textView3.setTypeface(ResourcesCompat.getFont(context2, i12));
        TextView textView4 = this.f48584e;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView4 = null;
        }
        textView4.setTextSize(0, this.f48596q);
        TextView textView5 = this.f48584e;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView5 = null;
        }
        textView5.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPaddingRelative(C43881b.m96650a(12), 0, 0, 0);
        ImageView imageView5 = this.f48581b;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView5 = null;
        }
        if (imageView5.getDrawable() != null) {
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(linearLayout.getContext());
            ImageView imageView6 = this.f48581b;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navView");
                imageView6 = null;
            }
            appCompatImageView3.setImageDrawable(imageView6.getDrawable());
            appCompatImageView3.setScaleType(scaleType);
            C27046k.m66701p(appCompatImageView3, ContextCompat.getColor(appCompatImageView3.getContext(), i11));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(C43881b.m96650a(12));
            Unit unit = Unit.INSTANCE;
            linearLayout.addView(appCompatImageView3, layoutParams);
        }
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R$color.emphasis8));
        this.f48589j = view;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C43881b.m96650a(1), C43881b.m96650a(16));
        layoutParams2.setMarginEnd(C43881b.m96650a(12));
        Unit unit2 = Unit.INSTANCE;
        linearLayout.addView(view, layoutParams2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext());
        TextView textView6 = this.f48584e;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        } else {
            textView = textView6;
        }
        appCompatTextView2.setText(textView.getText());
        appCompatTextView2.setGravity(GravityCompat.START);
        appCompatTextView2.setTextSize(2, 18.0f);
        appCompatTextView2.setTextColor(ContextCompat.getColor(appCompatTextView2.getContext(), R$color.emphasis));
        appCompatTextView2.setTypeface(ResourcesCompat.getFont(appCompatTextView2.getContext(), i12));
        this.f48584e = appCompatTextView2;
        linearLayout.addView(appCompatTextView2, new LinearLayout.LayoutParams(-2, -2));
        this.f48587h = linearLayout;
        this.f48588i = m58932d();
        View view2 = this.f48587h;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(20);
        layoutParams3.addRule(15);
        addView(view2, layoutParams3);
        View view3 = this.f48588i;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(21);
        layoutParams4.addRule(15);
        layoutParams4.setMarginEnd(C43881b.m96650a(16));
        addView(view3, layoutParams4);
    }

    @NotNull
    public ImageView getLeftIcon() {
        ImageView imageView = this.f48581b;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final TitleBarMode getF48592m() {
        return this.f48592m;
    }

    @NotNull
    public ImageView getRightOneIcon() {
        ImageView imageView = this.f48582c;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rightView");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m58936h() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f48581b = appCompatImageView;
        appCompatImageView.setId(R$id.base_titlebar_iv_back);
        ImageView imageView = this.f48581b;
        View view = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView = null;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f48581b;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView2 = null;
        }
        imageView2.setImageDrawable(this.f48593n);
        ImageView imageView3 = this.f48581b;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView3 = null;
        }
        C27046k.m66701p(imageView3, ContextCompat.getColor(getContext(), R$color.c_text));
        ImageView imageView4 = this.f48581b;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView4 = null;
        }
        imageView4.setPaddingRelative(C43881b.m96650a(16), 0, C43881b.m96650a(32), 0);
        View view2 = this.f48581b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
        } else {
            view = view2;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C43881b.m96650a(44));
        layoutParams.addRule(15);
        layoutParams.addRule(20);
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m58937i() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f48582c = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView = this.f48582c;
        View view = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightView");
            imageView = null;
        }
        imageView.setPaddingRelative(C43881b.m96650a(32), 0, C43881b.m96650a(16), 0);
        View view2 = this.f48582c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rightView");
        } else {
            view = view2;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C43881b.m96650a(44));
        layoutParams.addRule(15);
        layoutParams.addRule(21);
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public final void m58938j() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f48584e = appCompatTextView;
        appCompatTextView.setGravity(17);
        TextView textView = this.f48584e;
        View view = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        textView.setText(this.f48594o);
        TextView textView2 = this.f48584e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView2 = null;
        }
        textView2.setTextColor(this.f48595p);
        TextView textView3 = this.f48584e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView3 = null;
        }
        textView3.setTypeface(ResourcesCompat.getFont(getContext(), R$font.semi));
        TextView textView4 = this.f48584e;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView4 = null;
        }
        textView4.setTextSize(0, this.f48596q);
        View view2 = this.f48584e;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        } else {
            view = view2;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public final void m58939k(final TextView textView, Integer num, final Integer num2, int i11) {
        Function1 function1 = new Function1() { // from class: i10.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TitleBar.m58929l(textView, num2, this, (Integer) obj);
            }
        };
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 == 48) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) function1.invoke(num), (Drawable) null, (Drawable) null);
                    return;
                } else if (i11 == 80) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) function1.invoke(num));
                    return;
                } else if (i11 != 8388611) {
                    if (i11 != 8388613) {
                        return;
                    }
                }
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) function1.invoke(num), (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) function1.invoke(num), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: m */
    public final void m58940m(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        FrameLayout frameLayout = this.f48585f;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            addView(frameLayout, layoutParams2);
            this.f48585f = frameLayout;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(view, layoutParams);
        TextView textView = this.f48584e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        textView.setVisibility(8);
        frameLayout.setVisibility(0);
    }

    public final void setMenu(@NotNull Menu... list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.length == 0) {
            return;
        }
        LinearLayout linearLayout = this.f48586g;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        int length = list.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m58930b(i12, list[i11], list.length);
            i11++;
            i12++;
        }
    }

    public final void setMiniProgramLeftButtonListener(@Nullable View.OnClickListener listener) {
        ImageView imageView = this.f48590k;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setMiniProgramRightButtonListener(@Nullable View.OnClickListener listener) {
        ImageView imageView = this.f48591l;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setMode(@NotNull TitleBarMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.f48592m == mode) {
            return;
        }
        this.f48592m = mode;
        removeAllViews();
        this.f48583d = null;
        this.f48585f = null;
        this.f48586g = null;
        this.f48587h = null;
        this.f48588i = null;
        this.f48589j = null;
        this.f48590k = null;
        this.f48591l = null;
        this.f48593n = ResourcesCompat.getDrawable(getContext().getResources(), R$drawable.ic2_arrow_left2_20, getContext().getTheme());
        this.f48594o = null;
        this.f48595p = ContextCompat.getColor(getContext(), R$color.emphasis);
        this.f48596q = C43881b.m96650a(18);
        int i11 = C24338a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m58935g();
        } else {
            m58936h();
            m58938j();
            m58937i();
        }
    }

    public final void setOnNavigationListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ImageView imageView = this.f48581b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView = null;
        }
        imageView.setOnClickListener(listener);
    }

    public void setTitle(@Nullable String title) {
        TextView textView = this.f48584e;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        textView.setText(title);
        TextView textView3 = this.f48584e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(0);
        FrameLayout frameLayout = this.f48585f;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void setTitleIfEmpty(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = this.f48584e;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        if (textView.getText() != null) {
            TextView textView3 = this.f48584e;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            } else {
                textView2 = textView3;
            }
            CharSequence text = textView2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        setTitle(title);
    }

    public void setTitleTextColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        TextView textView = this.f48584e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        textView.setTextColor(Color.parseColor(color));
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m58931c() {
        int color = ContextCompat.getColor(getContext(), R$color.emphasis8);
        Companion companion = f48580r;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fDp2px = companion.dp2px(context, 14);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(C43881b.m96650a(1), color);
        gradientDrawable.setCornerRadius(fDp2px);
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public final <T extends View> T m58933e(int i11) {
        return (T) findViewById(i11);
    }

    /* JADX INFO: renamed from: o */
    public final Drawable m58942o(Drawable drawable, @ColorInt int i11) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap, i11);
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "apply(...)");
        return drawableWrap;
    }

    public void setBackGroundColor(int color) {
        setBackgroundColor(color);
    }

    public final void setNavigation(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView imageView = this.f48581b;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView3 = this.f48581b;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
        FrameLayout frameLayout = this.f48583d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleBar(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
