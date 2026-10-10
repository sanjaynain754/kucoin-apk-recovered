package com.swmansion.rnscreens;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.events.HeaderAttachedEvent;
import com.swmansion.rnscreens.events.HeaderDetachedEvent;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScreenStackHeaderConfig.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0002\u0085\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010(¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010(¢\u0006\u0004\b/\u0010+J\u0015\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b5\u0010#J\u0015\u00106\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b6\u0010#J\u0015\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b=\u00109J\u0015\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u00109J\u0015\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bA\u00109J\u0015\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u000f¢\u0006\u0004\bC\u00109J\u0015\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u000f¢\u0006\u0004\bE\u00109J\u0017\u0010G\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010(¢\u0006\u0004\bG\u0010+J\u0018\u0010J\u001a\n I*\u0004\u0018\u00010H0HH\u0096\u0001¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR$\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u001f0Mj\b\u0012\u0004\u0012\u00020\u001f`N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010\u000e\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\b\u000e\u0010R\u001a\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bU\u0010W\"\u0004\bX\u00109R\"\u0010Y\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010V\u001a\u0004\bY\u0010W\"\u0004\bZ\u00109R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010[R\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010,\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010[R\u0018\u0010F\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010[R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010^R\u0016\u0010_\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010VR\u0016\u0010d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010VR\u0016\u0010D\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010VR$\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bf\u0010V\u001a\u0004\bf\u0010WR\u0016\u0010g\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010]R\u0016\u0010h\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010VR\u0014\u0010i\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010]R\u0014\u0010j\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010]R\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010n\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010V\u001a\u0004\bn\u0010W\"\u0004\bo\u00109R\u0016\u0010s\u001a\u0004\u0018\u00010p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010w\u001a\u0004\u0018\u00010t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010z\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010|\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b{\u0010yR\u0011\u0010~\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b}\u0010yR\u0016\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0013\u0010\u0084\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010y¨\u0006\u0086\u0001"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/swmansion/rnscreens/FabricEnabledHeaderConfigViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Landroid/content/Context;", "context", "pointerEventsImpl", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/ReactPointerEventsView;)V", "(Landroid/content/Context;)V", "", "maybeUpdate", "()V", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "Landroidx/appcompat/widget/Toolbar;", "toolbar", "", "shouldUpdateShadowStateHint", "onNativeToolbarLayout", "(Landroidx/appcompat/widget/Toolbar;Z)V", "changed", "", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", ViewProps.ON_LAYOUT, "(ZIIII)V", "onAttachedToWindow", "onDetachedFromWindow", "onUpdate", "index", "Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;", "getConfigSubview", "(I)Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;", "removeConfigSubview", "(I)V", "removeAllConfigSubviews", "child", "addConfigSubview", "(Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;I)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "fontWeightString", "setTitleFontWeight", "", "titleFontSize", "setTitleFontSize", "(F)V", "color", "setTitleColor", "setTintColor", "topInsetEnabled", "setTopInsetEnabled", "(Z)V", "setBackgroundColor", "(Ljava/lang/Integer;)V", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "Lcom/facebook/react/uimanager/PointerEvents;", "kotlin.jvm.PlatformType", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "configSubviews", "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/CustomToolbar;", "Lcom/swmansion/rnscreens/CustomToolbar;", "getToolbar", "()Lcom/swmansion/rnscreens/CustomToolbar;", "isHeaderHidden", "Z", "()Z", "setHeaderHidden", "isHeaderTranslucent", "setHeaderTranslucent", "Ljava/lang/String;", "titleColor", "I", "F", "titleFontWeight", "backgroundColor", "Ljava/lang/Integer;", "isBackButtonHidden", "isShadowHidden", "isDestroyed", "value", "isTopInsetEnabled", "tintColor", "isAttachedToWindow", "defaultStartInset", "defaultStartInsetWithNavigation", "Landroid/view/View$OnClickListener;", "backClickListener", "Landroid/view/View$OnClickListener;", "isTitleEmpty", "setTitleEmpty", "Lcom/swmansion/rnscreens/Screen;", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "screen", "Lcom/swmansion/rnscreens/ScreenStack;", "getScreenStack", "()Lcom/swmansion/rnscreens/ScreenStack;", "screenStack", "getPreferredContentInsetStart", "()I", "preferredContentInsetStart", "getPreferredContentInsetEnd", "preferredContentInsetEnd", "getPreferredContentInsetStartWithNavigation", "preferredContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getScreenFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "screenFragment", "getConfigSubviewsCount", "configSubviewsCount", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackHeaderConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackHeaderConfig.kt\ncom/swmansion/rnscreens/ScreenStackHeaderConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n295#2,2:472\n1#3:474\n*S KotlinDebug\n*F\n+ 1 ScreenStackHeaderConfig.kt\ncom/swmansion/rnscreens/ScreenStackHeaderConfig\n*L\n127#1:472,2\n*E\n"})
public final class ScreenStackHeaderConfig extends FabricEnabledHeaderConfigViewGroup implements ReactPointerEventsView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean backButtonInCustomView;

    @NotNull
    private final View.OnClickListener backClickListener;

    @Nullable
    private Integer backgroundColor;

    @NotNull
    private final ArrayList<ScreenStackHeaderSubview> configSubviews;
    private final int defaultStartInset;
    private final int defaultStartInsetWithNavigation;

    @Nullable
    private String direction;
    private boolean isAttachedToWindow;
    private boolean isBackButtonHidden;
    private boolean isDestroyed;
    private boolean isHeaderHidden;
    private boolean isHeaderTranslucent;
    private boolean isShadowHidden;
    private boolean isTitleEmpty;
    private boolean isTopInsetEnabled;

    @NotNull
    private final ReactPointerEventsView pointerEventsImpl;
    private int tintColor;

    @Nullable
    private String title;
    private int titleColor;

    @Nullable
    private String titleFontFamily;
    private float titleFontSize;
    private int titleFontWeight;

    @NotNull
    private final CustomToolbar toolbar;

    /* JADX INFO: compiled from: ScreenStackHeaderConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfig$Companion;", "", "<init>", "()V", "findTitleTextViewInToolbar", "Landroid/widget/TextView;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final TextView findTitleTextViewInToolbar(@NotNull Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = toolbar.getChildAt(i11);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackHeaderConfig(@NotNull Context context, @NotNull ReactPointerEventsView pointerEventsImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        this.pointerEventsImpl = pointerEventsImpl;
        this.configSubviews = new ArrayList<>(3);
        this.isTopInsetEnabled = true;
        this.backClickListener = new View.OnClickListener() { // from class: com.swmansion.rnscreens.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenStackHeaderConfig.backClickListener$lambda$1(this.f68466b, view);
            }
        };
        setVisibility(8);
        CustomToolbar customToolbar = new CustomToolbar(context, this);
        this.toolbar = customToolbar;
        this.defaultStartInset = customToolbar.getContentInsetStart();
        this.defaultStartInsetWithNavigation = customToolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true)) {
            customToolbar.setBackgroundColor(typedValue.data);
        }
        customToolbar.setClipChildren(false);
    }

    public final void destroy() {
        this.isDestroyed = true;
    }

    /* JADX INFO: compiled from: ScreenStackHeaderConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenStackHeaderSubview.Type.values().length];
            try {
                iArr[ScreenStackHeaderSubview.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenStackHeaderSubview.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenStackHeaderSubview.Type.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void addConfigSubview(@NotNull ScreenStackHeaderSubview child, int index) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.configSubviews.add(index, child);
        maybeUpdate();
    }

    @NotNull
    public final ScreenStackHeaderSubview getConfigSubview(int index) {
        ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(index);
        Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, "get(...)");
        return screenStackHeaderSubview;
    }

    public final int getConfigSubviewsCount() {
        return this.configSubviews.size();
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.pointerEventsImpl.getPointerEvents();
    }

    /* JADX INFO: renamed from: getPreferredContentInsetEnd, reason: from getter */
    public final int getDefaultStartInset() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetStart() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.isTitleEmpty) {
            return 0;
        }
        return this.defaultStartInsetWithNavigation;
    }

    @NotNull
    public final CustomToolbar getToolbar() {
        return this.toolbar;
    }

    /* JADX INFO: renamed from: isHeaderHidden, reason: from getter */
    public final boolean getIsHeaderHidden() {
        return this.isHeaderHidden;
    }

    /* JADX INFO: renamed from: isHeaderTranslucent, reason: from getter */
    public final boolean getIsHeaderTranslucent() {
        return this.isHeaderTranslucent;
    }

    /* JADX INFO: renamed from: isTitleEmpty, reason: from getter */
    public final boolean getIsTitleEmpty() {
        return this.isTitleEmpty;
    }

    /* JADX INFO: renamed from: isTopInsetEnabled, reason: from getter */
    public final boolean getIsTopInsetEnabled() {
        return this.isTopInsetEnabled;
    }

    public final void removeAllConfigSubviews() {
        this.configSubviews.clear();
        maybeUpdate();
    }

    public final void removeConfigSubview(int index) {
        this.configSubviews.remove(index);
        maybeUpdate();
    }

    public final void setBackButtonInCustomView(boolean backButtonInCustomView) {
        this.backButtonInCustomView = backButtonInCustomView;
    }

    public final void setBackgroundColor(@Nullable Integer color) {
        this.backgroundColor = color;
    }

    public final void setDirection(@Nullable String direction) {
        this.direction = direction;
    }

    public final void setHeaderHidden(boolean z11) {
        this.isHeaderHidden = z11;
    }

    public final void setHeaderTranslucent(boolean z11) {
        this.isHeaderTranslucent = z11;
    }

    public final void setHidden(boolean hidden) {
        this.isHeaderHidden = hidden;
    }

    public final void setHideBackButton(boolean hideBackButton) {
        this.isBackButtonHidden = hideBackButton;
    }

    public final void setHideShadow(boolean hideShadow) {
        this.isShadowHidden = hideShadow;
    }

    public final void setTintColor(int color) {
        this.tintColor = color;
    }

    public final void setTitle(@Nullable String title) {
        this.title = title;
    }

    public final void setTitleColor(int color) {
        this.titleColor = color;
    }

    public final void setTitleEmpty(boolean z11) {
        this.isTitleEmpty = z11;
    }

    public final void setTitleFontFamily(@Nullable String titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    public final void setTitleFontSize(float titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public final void setTopInsetEnabled(boolean topInsetEnabled) {
        this.isTopInsetEnabled = topInsetEnabled;
    }

    public final void setTranslucent(boolean translucent) {
        this.isHeaderTranslucent = translucent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backClickListener$lambda$1(ScreenStackHeaderConfig screenStackHeaderConfig, View view) {
        ScreenStackFragment screenFragment = screenStackHeaderConfig.getScreenFragment();
        if (screenFragment != null) {
            ScreenStack screenStack = screenStackHeaderConfig.getScreenStack();
            if (screenStack != null && Intrinsics.areEqual(screenStack.getRootScreen(), screenFragment.getScreen())) {
                Fragment parentFragment = screenFragment.getParentFragment();
                if (parentFragment instanceof ScreenStackFragment) {
                    ScreenStackFragment screenStackFragment = (ScreenStackFragment) parentFragment;
                    if (screenStackFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                        screenStackFragment.dismissFromContainer();
                        return;
                    } else {
                        screenStackFragment.dispatchHeaderBackButtonClickedEvent();
                        return;
                    }
                }
                return;
            }
            if (screenFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                screenFragment.dismissFromContainer();
            } else {
                screenFragment.dispatchHeaderBackButtonClickedEvent();
            }
        }
    }

    private final Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        ScreenContainer container;
        Screen screen = getScreen();
        if (screen != null) {
            container = screen.getContainer();
        } else {
            container = null;
        }
        if (!(container instanceof ScreenStack)) {
            return null;
        }
        return (ScreenStack) container;
    }

    private final void maybeUpdate() {
        Screen screen;
        if (getParent() != null && !this.isDestroyed && (screen = getScreen()) != null && !screen.getIsBeingRemoved()) {
            onUpdate();
        }
    }

    @Nullable
    public final ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            Fragment fragment = ((Screen) parent).getFragment();
            if (fragment instanceof ScreenStackFragment) {
                return (ScreenStackFragment) fragment;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderAttachedEvent(surfaceId, getId()));
        }
        onUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderDetachedEvent(surfaceId, getId()));
        }
    }

    public final void onNativeToolbarLayout(@NotNull Toolbar toolbar, boolean shouldUpdateShadowStateHint) {
        int iMax;
        Object next;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (!shouldUpdateShadowStateHint) {
            return;
        }
        if (toolbar.getNavigationIcon() != null) {
            iMax = toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart();
        } else {
            iMax = Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
        }
        Iterator<T> it = this.configSubviews.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((ScreenStackHeaderSubview) next).getType() != ScreenStackHeaderSubview.Type.LEFT);
        ScreenStackHeaderSubview screenStackHeaderSubview = (ScreenStackHeaderSubview) next;
        if (screenStackHeaderSubview != null) {
            iMax = screenStackHeaderSubview.getLeft();
        }
        updateHeaderConfigState(toolbar.getWidth(), toolbar.getHeight(), iMax, toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onUpdate() {
        boolean z11;
        FragmentActivity activity;
        boolean z12;
        ImageView imageView;
        Drawable navigationIcon;
        ScreenStackFragment screenFragment;
        ScreenStackFragment screenFragment2;
        ReactContext reactContextTryGetContext;
        ScreenStack screenStack = getScreenStack();
        if (screenStack != null && !Intrinsics.areEqual(screenStack.getTopScreen(), getParent())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.isAttachedToWindow && z11 && !this.isDestroyed) {
            ScreenStackFragment screenFragment3 = getScreenFragment();
            if (screenFragment3 != null) {
                activity = screenFragment3.getActivity();
            } else {
                activity = null;
            }
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity != null) {
                String str = this.direction;
                if (str != null) {
                    if (Intrinsics.areEqual(str, "rtl")) {
                        this.toolbar.setLayoutDirection(1);
                    } else if (Intrinsics.areEqual(this.direction, "ltr")) {
                        this.toolbar.setLayoutDirection(0);
                    }
                }
                Screen screen = getScreen();
                if (screen != null) {
                    if (getContext() instanceof ReactContext) {
                        Context context = getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        reactContextTryGetContext = (ReactContext) context;
                    } else {
                        ScreenFragmentWrapper fragmentWrapper = screen.getFragmentWrapper();
                        if (fragmentWrapper != null) {
                            reactContextTryGetContext = fragmentWrapper.tryGetContext();
                        } else {
                            reactContextTryGetContext = null;
                        }
                    }
                    ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(screen, appCompatActivity, reactContextTryGetContext);
                }
                if (this.isHeaderHidden) {
                    if (this.toolbar.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                        screenFragment2.removeToolbar();
                        return;
                    }
                    return;
                }
                if (this.toolbar.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                    screenFragment.setToolbar(this.toolbar);
                }
                appCompatActivity.setSupportActionBar(this.toolbar);
                ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    ScreenStackFragment screenFragment4 = getScreenFragment();
                    if (screenFragment4 != null && screenFragment4.canNavigateBack() && !this.isBackButtonHidden) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    supportActionBar.setDisplayHomeAsUpEnabled(z12);
                    supportActionBar.setTitle(this.title);
                    if (TextUtils.isEmpty(this.title)) {
                        this.isTitleEmpty = true;
                    }
                    this.toolbar.updateContentInsets();
                    this.toolbar.setNavigationOnClickListener(this.backClickListener);
                    ScreenStackFragment screenFragment5 = getScreenFragment();
                    if (screenFragment5 != null) {
                        screenFragment5.setToolbarShadowHidden(this.isShadowHidden);
                    }
                    ScreenStackFragment screenFragment6 = getScreenFragment();
                    if (screenFragment6 != null) {
                        screenFragment6.setToolbarTranslucent(this.isHeaderTranslucent);
                    }
                    TextView textViewFindTitleTextViewInToolbar = INSTANCE.findTitleTextViewInToolbar(this.toolbar);
                    int i11 = this.titleColor;
                    if (i11 != 0) {
                        this.toolbar.setTitleTextColor(i11);
                    }
                    if (textViewFindTitleTextViewInToolbar != null) {
                        String str2 = this.titleFontFamily;
                        if (str2 != null || this.titleFontWeight > 0) {
                            int i12 = this.titleFontWeight;
                            AssetManager assets = getContext().getAssets();
                            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                            textViewFindTitleTextViewInToolbar.setTypeface(ReactTypefaceUtils.applyStyles(null, 0, i12, str2, assets));
                        }
                        float f11 = this.titleFontSize;
                        if (f11 > 0.0f) {
                            textViewFindTitleTextViewInToolbar.setTextSize(f11);
                        }
                    }
                    Integer num = this.backgroundColor;
                    if (num != null) {
                        this.toolbar.setBackgroundColor(num.intValue());
                    }
                    if (this.tintColor != 0 && (navigationIcon = this.toolbar.getNavigationIcon()) != null) {
                        navigationIcon.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP));
                    }
                    for (int childCount = this.toolbar.getChildCount() - 1; -1 < childCount; childCount--) {
                        if (this.toolbar.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                            this.toolbar.removeViewAt(childCount);
                        }
                    }
                    int size = this.configSubviews.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ScreenStackHeaderSubview screenStackHeaderSubview = this.configSubviews.get(i13);
                        Intrinsics.checkNotNullExpressionValue(screenStackHeaderSubview, "get(...)");
                        ScreenStackHeaderSubview screenStackHeaderSubview2 = screenStackHeaderSubview;
                        ScreenStackHeaderSubview.Type type = screenStackHeaderSubview2.getType();
                        if (type == ScreenStackHeaderSubview.Type.BACK) {
                            View childAt = screenStackHeaderSubview2.getChildAt(0);
                            if (childAt instanceof ImageView) {
                                imageView = (ImageView) childAt;
                            } else {
                                imageView = null;
                            }
                            if (imageView != null) {
                                supportActionBar.setHomeAsUpIndicator(imageView.getDrawable());
                            } else {
                                throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                            }
                        } else {
                            Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -1);
                            int i14 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 == 3) {
                                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                                        layoutParams.gravity = 1;
                                        this.toolbar.setTitle((CharSequence) null);
                                    }
                                } else {
                                    layoutParams.gravity = GravityCompat.END;
                                }
                            } else {
                                if (!this.backButtonInCustomView) {
                                    this.toolbar.setNavigationIcon((Drawable) null);
                                }
                                this.toolbar.setTitle((CharSequence) null);
                                layoutParams.gravity = GravityCompat.START;
                            }
                            screenStackHeaderSubview2.setLayoutParams(layoutParams);
                            this.toolbar.addView(screenStackHeaderSubview2);
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void setTitleFontWeight(@Nullable String fontWeightString) {
        this.titleFontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenStackHeaderConfig(@NotNull Context context) {
        this(context, new PointerEventsBoxNoneImpl());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
