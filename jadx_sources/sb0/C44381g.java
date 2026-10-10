package sb0;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.core.PointerEventsConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import rb0.InterfaceC43983q;

/* JADX INFO: renamed from: sb0.g */
/* JADX INFO: compiled from: RNViewConfigurationHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lsb0/g;", "Lrb0/q;", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/swmansion/gesturehandler/core/PointerEventsConfig;", "c", "(Landroid/view/View;)Lcom/swmansion/gesturehandler/core/PointerEventsConfig;", "Landroid/view/ViewGroup;", "parent", "", "index", "b", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/ViewGroup;)Z", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44381g implements InterfaceC43983q {

    /* JADX INFO: renamed from: sb0.g$a */
    /* JADX INFO: compiled from: RNViewConfigurationHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // rb0.InterfaceC43983q
    /* JADX INFO: renamed from: a */
    public boolean mo96939a(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof ReactScrollView) {
            if (!Intrinsics.areEqual(((ReactScrollView) view).getOverflow(), ViewProps.VISIBLE)) {
                return true;
            }
            return false;
        }
        if (view instanceof ReactHorizontalScrollView) {
            if (!Intrinsics.areEqual(((ReactHorizontalScrollView) view).getOverflow(), ViewProps.VISIBLE)) {
                return true;
            }
            return false;
        }
        if (!(view instanceof ReactViewGroup)) {
            return false;
        }
        return Intrinsics.areEqual(((ReactViewGroup) view).getOverflow(), ViewProps.HIDDEN);
    }

    @Override // rb0.InterfaceC43983q
    @NotNull
    /* JADX INFO: renamed from: b */
    public View mo96940b(@NotNull ViewGroup parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent instanceof ReactViewGroup) {
            View childAt = parent.getChildAt(((ReactViewGroup) parent).getZIndexMappedChildIndex(index));
            Intrinsics.checkNotNull(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        return childAt2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rb0.InterfaceC43983q
    @NotNull
    /* JADX INFO: renamed from: c */
    public PointerEventsConfig mo96941c(@NotNull View view) {
        PointerEvents pointerEvents;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
            Intrinsics.checkNotNull(pointerEvents);
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return PointerEventsConfig.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return PointerEventsConfig.NONE;
            }
        }
        int i11 = a.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return PointerEventsConfig.AUTO;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return PointerEventsConfig.NONE;
            }
            return PointerEventsConfig.BOX_NONE;
        }
        return PointerEventsConfig.BOX_ONLY;
    }
}
