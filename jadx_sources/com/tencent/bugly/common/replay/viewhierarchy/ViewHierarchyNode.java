package com.tencent.bugly.common.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.liveness.DaClient;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.bugly.common.replay.tool.AndroidTextLayout;
import com.tencent.bugly.common.replay.tool.TextLayout;
import com.tencent.bugly.common.replay.tool.ViewsKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 32\u00020\u0001:\u000534567Bm\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0002J\u000e\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fJ\u001a\u00100\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f02R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b\u0082\u0001\u000389:¨\u0006;"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "", "x", "", "y", "width", "", "height", "elevation", DaClient.ATTR_DISTANCE, "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getDistance", "()I", "getElevation", "()F", "getHeight", "()Z", "setImportantForContentCapture", "(Z)V", "getParent", "()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "getShouldMask", "getVisibleRect", "()Landroid/graphics/Rect;", "getWidth", "getX", "getY", "findLCA", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "node", "otherNode", "isObscured", "setImportantForCaptureToAncestors", "", "isImportant", "traverse", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Companion", "GenericViewHierarchyNode", "ImageViewHierarchyNode", "LCAResult", "TextViewHierarchyNode", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@TargetApi(26)
public abstract class ViewHierarchyNode {

    @NotNull
    private static final String BUGLY_UNMASK_TAG = "bugly-unmask";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;

    @Nullable
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;

    @Nullable
    private final Rect visibleRect;
    private final int width;
    private final float x;
    private final float y;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u0014\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u0016\u001a\u00020\u000f*\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;", "", "()V", "BUGLY_UNMASK_TAG", "", "fromView", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", DaClient.ATTR_DISTANCE, "", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "isAssignableFrom", "", "Ljava/lang/Class;", "set", "", "isMaskContainer", "isUnmaskContainer", "Landroid/view/ViewParent;", "shouldMask", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        @NotNull
        public final ViewHierarchyNode fromView(@NotNull View view, @Nullable ViewHierarchyNode parent, int distance, @NotNull BuglyReplayOptions options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = pairIsVisibleToUser.component1().booleanValue();
            Rect rectComponent2 = pairIsVisibleToUser.component2();
            boolean z11 = zBooleanValue && shouldMask(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z11, false, zBooleanValue, rectComponent2);
                }
                if (parent != null) {
                    parent.setImportantForCaptureToAncestors(true);
                }
                ImageView imageView = (ImageView) view;
                return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (parent != null ? parent.getElevation() : 0.0f), distance, parent, z11 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rectComponent2);
            }
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            AndroidTextLayout androidTextLayout = layout != null ? new AndroidTextLayout(layout) : null;
            int opaque = ViewsKt.toOpaque(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            float x11 = textView.getX();
            float y11 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (parent != null) {
                elevation = parent.getElevation();
            }
            return new TextViewHierarchyNode(androidTextLayout, Integer.valueOf(opaque), totalPaddingLeft, totalPaddingTop, x11, y11, width, height, elevation + textView.getElevation(), distance, parent, z11, true, zBooleanValue, rectComponent2);
        }

        private final boolean isMaskContainer(View view, BuglyReplayOptions buglyReplayOptions) {
            String maskViewContainerClass = buglyReplayOptions.getMaskViewContainerClass();
            if (maskViewContainerClass == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), maskViewContainerClass);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, BuglyReplayOptions buglyReplayOptions) {
            String unmaskViewContainerClass = buglyReplayOptions.getUnmaskViewContainerClass();
            if (unmaskViewContainerClass == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), unmaskViewContainerClass);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0027  */
        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        /* JADX WARN: Code duplicated, block: B:22:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0069 A[RETURN] */
        private final boolean shouldMask(View view, BuglyReplayOptions buglyReplayOptions) {
            String str;
            Class<?> cls;
            Set<String> unmaskViewClasses;
            ViewParent parent;
            Object tag = view.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (lowerCase == null || !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ViewHierarchyNode.BUGLY_UNMASK_TAG, false, 2, (Object) null)) {
                    if (!Intrinsics.areEqual(view.getTag(BuglyReplayOptions.MASK_KEY), "unmask")) {
                        if (!isMaskContainer(view, buglyReplayOptions) && view.getParent() != null) {
                            parent = view.getParent();
                            Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                            if (isUnmaskContainer(parent, buglyReplayOptions)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        unmaskViewClasses = buglyReplayOptions.getUnmaskViewClasses();
                        Intrinsics.checkNotNullExpressionValue(unmaskViewClasses, "options.unmaskViewClasses");
                        if (isAssignableFrom(cls, unmaskViewClasses)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (!Intrinsics.areEqual(view.getTag(BuglyReplayOptions.MASK_KEY), "unmask")) {
                if (!isMaskContainer(view, buglyReplayOptions)) {
                    parent = view.getParent();
                    Intrinsics.checkNotNullExpressionValue(parent, "this.parent");
                    if (isUnmaskContainer(parent, buglyReplayOptions)) {
                        return false;
                    }
                }
                cls = view.getClass();
                unmaskViewClasses = buglyReplayOptions.getUnmaskViewClasses();
                Intrinsics.checkNotNullExpressionValue(unmaskViewClasses, "options.unmaskViewClasses");
                if (isAssignableFrom(cls, unmaskViewClasses)) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", "elevation", DaClient.ATTR_DISTANCE, "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public /* synthetic */ GenericViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, f12, i11, i12, f13, i13, (i14 & 64) != 0 ? null : viewHierarchyNode, (i14 & 128) != 0 ? false : z11, (i14 & 256) != 0 ? false : z12, (i14 & 512) != 0 ? false : z13, (i14 & 1024) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, @Nullable Rect rect) {
            super(f11, f12, i11, i12, f13, i13, viewHierarchyNode, z11, z12, z13, rect, null);
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "x", "", "y", "width", "", "height", "elevation", DaClient.ATTR_DISTANCE, "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public /* synthetic */ ImageViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, f12, i11, i12, f13, i13, (i14 & 64) != 0 ? null : viewHierarchyNode, (i14 & 128) != 0 ? false : z11, (i14 & 256) != 0 ? false : z12, (i14 & 512) != 0 ? false : z13, (i14 & 1024) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, @Nullable Rect rect) {
            super(f11, f12, i11, i12, f13, i13, viewHierarchyNode, z11, z12, z13, rect, null);
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;", "", "lca", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "nodeSubtree", "otherNodeSubtree", "(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V", "getLca", "()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "getNodeSubtree", "setNodeSubtree", "(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V", "getOtherNodeSubtree", "setOtherNodeSubtree", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final /* data */ class LCAResult {

        @Nullable
        private final ViewHierarchyNode lca;

        @Nullable
        private ViewHierarchyNode nodeSubtree;

        @Nullable
        private ViewHierarchyNode otherNodeSubtree;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) other;
            return Intrinsics.areEqual(this.lca, lCAResult.lca) && Intrinsics.areEqual(this.nodeSubtree, lCAResult.nodeSubtree) && Intrinsics.areEqual(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i11 & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i11 & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        @NotNull
        public final LCAResult copy(@Nullable ViewHierarchyNode lca, @Nullable ViewHierarchyNode nodeSubtree, @Nullable ViewHierarchyNode otherNodeSubtree) {
            return new LCAResult(lca, nodeSubtree, otherNodeSubtree);
        }

        @Nullable
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        @Nullable
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        @Nullable
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        @NotNull
        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }

        public LCAResult(@Nullable ViewHierarchyNode viewHierarchyNode, @Nullable ViewHierarchyNode viewHierarchyNode2, @Nullable ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", TtmlNode.TAG_LAYOUT, "Lcom/tencent/bugly/common/replay/tool/TextLayout;", "dominantColor", "", ViewProps.PADDING_LEFT, ViewProps.PADDING_TOP, "x", "", "y", "width", "height", "elevation", DaClient.ATTR_DISTANCE, "parent", "shouldMask", "", "isImportantForContentCapture", "isVisible", "visibleRect", "Landroid/graphics/Rect;", "(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V", "getDominantColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Lcom/tencent/bugly/common/replay/tool/TextLayout;", "getPaddingLeft", "()I", "getPaddingTop", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {

        @Nullable
        private final Integer dominantColor;

        @Nullable
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? null : textLayout, (i16 & 2) != 0 ? null : num, (i16 & 4) != 0 ? 0 : i11, (i16 & 8) != 0 ? 0 : i12, f11, f12, i13, i14, f13, i15, (i16 & 1024) != 0 ? null : viewHierarchyNode, (i16 & 2048) != 0 ? false : z11, (i16 & 4096) != 0 ? false : z12, (i16 & 8192) != 0 ? false : z13, (i16 & 16384) != 0 ? null : rect);
        }

        public TextViewHierarchyNode(@Nullable TextLayout textLayout, @Nullable Integer num, int i11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, @Nullable Rect rect) {
            super(f11, f12, i13, i14, f13, i15, viewHierarchyNode, z11, z12, z13, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i11;
            this.paddingTop = i12;
        }

        @Nullable
        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        @Nullable
        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, i12, f13, i13, viewHierarchyNode, z11, z12, z13, rect);
    }

    private ViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect) {
        this.x = f11;
        this.y = f12;
        this.width = i11;
        this.height = i12;
        this.elevation = f13;
        this.distance = i13;
        this.parent = viewHierarchyNode;
        this.shouldMask = z11;
        this.isImportantForContentCapture = z12;
        this.isVisible = z13;
        this.visibleRect = rect;
    }

    @Nullable
    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    @Nullable
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: isImportantForContentCapture, reason: from getter */
    public final boolean getIsImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setChildren(@Nullable List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean isImportant) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = isImportant;
        }
    }

    public final void setImportantForContentCapture(boolean z11) {
        this.isImportantForContentCapture = z11;
    }

    public final void traverse(@NotNull Function1<? super ViewHierarchyNode, Boolean> callback) {
        List<? extends ViewHierarchyNode> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!callback.invoke(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode node, ViewHierarchyNode otherNode) {
        ViewHierarchyNode viewHierarchyNode;
        ViewHierarchyNode viewHierarchyNode2;
        ViewHierarchyNode viewHierarchyNode3 = null;
        if (Intrinsics.areEqual(this, node)) {
            viewHierarchyNode = this;
        } else {
            viewHierarchyNode = null;
        }
        if (Intrinsics.areEqual(this, otherNode)) {
            viewHierarchyNode2 = this;
        } else {
            viewHierarchyNode2 = null;
        }
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            for (ViewHierarchyNode viewHierarchyNode4 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode4.findLCA(node, otherNode);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode = viewHierarchyNode4;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode2 = viewHierarchyNode4;
                }
            }
        }
        if (viewHierarchyNode != null && viewHierarchyNode2 != null) {
            viewHierarchyNode3 = this;
        }
        return new LCAResult(viewHierarchyNode3, viewHierarchyNode, viewHierarchyNode2);
    }

    public final boolean isObscured(@NotNull final ViewHierarchyNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.parent == null) {
            if (node.visibleRect == null) {
                return false;
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: com.tencent.bugly.common.replay.viewhierarchy.ViewHierarchyNode.isObscured.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ViewHierarchyNode otherNode) {
                    Intrinsics.checkNotNullParameter(otherNode, "otherNode");
                    if (otherNode.getVisibleRect() == null || booleanRef.element) {
                        return Boolean.FALSE;
                    }
                    if (!otherNode.getIsVisible() || !otherNode.getIsImportantForContentCapture() || !otherNode.getVisibleRect().contains(node.getVisibleRect())) {
                        return Boolean.FALSE;
                    }
                    if (otherNode.getElevation() > node.getElevation()) {
                        booleanRef.element = true;
                        return Boolean.FALSE;
                    }
                    if (otherNode.getElevation() == node.getElevation()) {
                        LCAResult lCAResultFindLCA = this.findLCA(node, otherNode);
                        ViewHierarchyNode lca = lCAResultFindLCA.getLca();
                        ViewHierarchyNode nodeSubtree = lCAResultFindLCA.getNodeSubtree();
                        ViewHierarchyNode otherNodeSubtree = lCAResultFindLCA.getOtherNodeSubtree();
                        if (!Intrinsics.areEqual(lca, otherNode) && otherNodeSubtree != null && nodeSubtree != null) {
                            booleanRef.element = otherNodeSubtree.getDistance() > nodeSubtree.getDistance();
                            return Boolean.valueOf(!booleanRef.element);
                        }
                    }
                    return Boolean.TRUE;
                }
            });
            return booleanRef.element;
        }
        throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
    }

    public /* synthetic */ ViewHierarchyNode(float f11, float f12, int i11, int i12, float f13, int i13, ViewHierarchyNode viewHierarchyNode, boolean z11, boolean z12, boolean z13, Rect rect, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, i12, f13, i13, (i14 & 64) != 0 ? null : viewHierarchyNode, (i14 & 128) != 0 ? false : z11, (i14 & 256) != 0 ? false : z12, (i14 & 512) != 0 ? false : z13, (i14 & 1024) != 0 ? null : rect, null);
    }
}
