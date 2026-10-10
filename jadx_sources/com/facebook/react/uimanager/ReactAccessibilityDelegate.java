package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class ReactAccessibilityDelegate extends ExploreByTouchHelper {
    private static final int SEND_EVENT = 1;
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_DISABLED = "disabled";
    private static final String STATE_SELECTED = "selected";
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";
    private static final String delimiter = ", ";
    private static final int delimiterLength = 2;
    public static final HashMap<String, Integer> sActionIdMap;
    private static int sCounter = 1056964608;
    private final HashMap<Integer, String> mAccessibilityActionsMap;

    @Nullable
    View mAccessibilityLabelledBy;
    private final AccessibilityLinks mAccessibilityLinks;
    private Handler mHandler;
    private final View mView;

    public static class AccessibilityLinks {
        private final List<AccessibleLink> mLinks;

        public static class AccessibleLink {
            public String description;
            public int end;

            /* JADX INFO: renamed from: id */
            public int f9924id;
            public int start;

            private AccessibleLink() {
            }
        }

        @Nullable
        public AccessibleLink getLinkById(int i11) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.f9924id == i11) {
                    return accessibleLink;
                }
            }
            return null;
        }

        @Nullable
        public AccessibleLink getLinkBySpanPos(int i11, int i12) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.start == i11 && accessibleLink.end == i12) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public int size() {
            return this.mLinks.size();
        }

        public AccessibilityLinks(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < clickableSpanArr.length; i11++) {
                ClickableSpan clickableSpan = clickableSpanArr[i11];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    AccessibleLink accessibleLink = new AccessibleLink();
                    accessibleLink.description = spannable.subSequence(spanStart, spanEnd).toString();
                    accessibleLink.start = spanStart;
                    accessibleLink.end = spanEnd;
                    accessibleLink.f9924id = (clickableSpanArr.length - 1) - i11;
                    arrayList.add(accessibleLink);
                }
            }
            this.mLinks = arrayList;
        }
    }

    public enum AccessibilityRole {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        @Nullable
        public static AccessibilityRole fromRole(Role role) {
            switch (C61013.f9923x7898823b[role.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static AccessibilityRole fromValue(@Nullable String str) {
            if (str == null) {
                return NONE;
            }
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        @Nullable
        public static AccessibilityRole fromViewTag(View view) {
            Role role = (Role) view.getTag(C5771R.id.role);
            return role != null ? fromRole(role) : (AccessibilityRole) view.getTag(C5771R.id.accessibility_role);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (C61013.f9922x27e8253f[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return BuglyReplayOptions.IMAGE_VIEW_CLASS_NAME;
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return BuglyReplayOptions.TEXT_VIEW_CLASS_NAME;
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return BuglyReplayOptions.WEB_VIEW_CLASS_NAME;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    @Nullable
    public static AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        try {
            ViewCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            return accessibilityNodeInfoCompatObtain;
        } catch (NullPointerException unused) {
            if (accessibilityNodeInfoCompatObtain != null) {
                accessibilityNodeInfoCompatObtain.recycle();
            }
            return null;
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        if (accessibilityNodeInfoCompat != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                    try {
                        ViewCompat.onInitializeAccessibilityNodeInfo(childAt, accessibilityNodeInfoCompatObtain);
                        if (accessibilityNodeInfoCompatObtain.isVisibleToUser() && !isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, childAt) && isSpeakingNode(accessibilityNodeInfoCompatObtain, childAt)) {
                            return true;
                        }
                        accessibilityNodeInfoCompatObtain.recycle();
                    } finally {
                        if (accessibilityNodeInfoCompatObtain != null) {
                            accessibilityNodeInfoCompatObtain.recycle();
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasValidRangeInfo(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat.RangeInfoCompat rangeInfo;
        if (accessibilityNodeInfoCompat == null || (rangeInfo = accessibilityNodeInfoCompat.getRangeInfo()) == null) {
            return false;
        }
        float max = rangeInfo.getMax();
        float min = rangeInfo.getMin();
        float current = rangeInfo.getCurrent();
        return max - min > 0.0f && current >= min && current <= max;
    }

    public static boolean isAccessibilityFocusable(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.isVisibleToUser()) {
            return false;
        }
        return accessibilityNodeInfoCompat.isScreenReaderFocusable() || isActionableForAccessibility(accessibilityNodeInfoCompat);
    }

    public static boolean isActionableForAccessibility(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.isClickable() && !accessibilityNodeInfoCompat.isLongClickable() && !accessibilityNodeInfoCompat.isFocusable()) {
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = accessibilityNodeInfoCompat.getActionList();
            if (!actionList.contains(16) && !actionList.contains(32) && !actionList.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpeakingNode(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @Nullable View view) {
        int importantForAccessibility;
        if (accessibilityNodeInfoCompat == null || view == null || (importantForAccessibility = ViewCompat.getImportantForAccessibility(view)) == 4 || (importantForAccessibility == 2 && accessibilityNodeInfoCompat.getChildCount() <= 0)) {
            return false;
        }
        return hasText(accessibilityNodeInfoCompat) || hasStateDescription(accessibilityNodeInfoCompat) || accessibilityNodeInfoCompat.isCheckable() || hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i11, int i12, @Nullable Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$3 */
    public static /* synthetic */ class C61013 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole */
        static final /* synthetic */ int[] f9922x27e8253f;

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$Role */
        static final /* synthetic */ int[] f9923x7898823b;

        static {
            int[] iArr = new int[Role.values().length];
            f9923x7898823b = iArr;
            try {
                iArr[Role.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9923x7898823b[Role.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9923x7898823b[Role.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9923x7898823b[Role.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9923x7898823b[Role.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9923x7898823b[Role.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9923x7898823b[Role.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9923x7898823b[Role.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9923x7898823b[Role.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9923x7898823b[Role.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9923x7898823b[Role.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9923x7898823b[Role.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9923x7898823b[Role.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9923x7898823b[Role.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9923x7898823b[Role.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9923x7898823b[Role.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9923x7898823b[Role.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9923x7898823b[Role.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9923x7898823b[Role.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9923x7898823b[Role.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9923x7898823b[Role.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9923x7898823b[Role.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9923x7898823b[Role.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9923x7898823b[Role.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9923x7898823b[Role.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9923x7898823b[Role.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[AccessibilityRole.values().length];
            f9922x27e8253f = iArr2;
            try {
                iArr2[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f9922x27e8253f[AccessibilityRole.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public enum Role {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        @Nullable
        public static Role fromValue(@Nullable String str) {
            for (Role role : values()) {
                if (role.name().equalsIgnoreCase(str)) {
                    return role;
                }
            }
            return null;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        sActionIdMap = map;
        map.put(RemoteConfigComponent.ACTIVATE_FILE_NAME, Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK.getId()));
        map.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK.getId()));
        map.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId()));
        map.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId()));
        map.put("expand", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND.getId()));
        map.put("collapse", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE.getId()));
    }

    private Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        View view = this.mView;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.mView.getWidth(), this.mView.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d11 = accessibleLink.start;
        double d12 = accessibleLink.end;
        int i11 = (int) d11;
        int lineForOffset = layout.getLineForOffset(i11);
        if (d11 > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(i11);
        Paint paint = new Paint();
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) getFirstSpan(accessibleLink.start, accessibleLink.end, AbsoluteSizeSpan.class);
        paint.setTextSize(absoluteSizeSpan != null ? absoluteSizeSpan.getSize() : textView.getTextSize());
        int iCeil = (int) Math.ceil(paint.measureText(accessibleLink.description));
        boolean z11 = lineForOffset != layout.getLineForOffset((int) d12);
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
        if (z11) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i12 = rect.left;
        return new Rect(i12, rect.top, iCeil + i12, rect.bottom);
    }

    @Nullable
    public static CharSequence getTalkbackDescription(View view, @Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = accessibilityNodeInfoCompat == null ? createNodeInfoFromView(view) : AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompatCreateNodeInfoFromView == null) {
            return null;
        }
        try {
            CharSequence contentDescription = accessibilityNodeInfoCompatCreateNodeInfoFromView.getContentDescription();
            CharSequence text = accessibilityNodeInfoCompatCreateNodeInfoFromView.getText();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z11 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z11 || zIsEmpty)) {
                sb2.append(contentDescription);
                return sb2;
            }
            if (!zIsEmpty) {
                sb2.append(text);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                ViewCompat.onInitializeAccessibilityNodeInfo(childAt, accessibilityNodeInfoCompatObtain);
                if (isSpeakingNode(accessibilityNodeInfoCompatObtain, childAt) && !isAccessibilityFocusable(accessibilityNodeInfoCompatObtain, childAt)) {
                    CharSequence talkbackDescription = getTalkbackDescription(childAt, null);
                    if (!TextUtils.isEmpty(talkbackDescription)) {
                        sb3.append(((Object) talkbackDescription) + delimiter);
                    }
                }
                accessibilityNodeInfoCompatObtain.recycle();
            }
            return removeFinalDelimiter(sb3);
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.recycle();
        }
    }

    private static boolean hasStateDescription(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat != null) {
            return !TextUtils.isEmpty(accessibilityNodeInfoCompat.getStateDescription()) || accessibilityNodeInfoCompat.isCheckable() || hasValidRangeInfo(accessibilityNodeInfoCompat);
        }
        return false;
    }

    public static boolean hasText(@Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null || accessibilityNodeInfoCompat.getCollectionInfo() != null) {
            return false;
        }
        return (TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.getHintText())) ? false : true;
    }

    public static void resetDelegate(View view, boolean z11, int i11) {
        ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate(view, z11, i11));
    }

    private void scheduleAccessibilityEventSender(View view) {
        if (this.mHandler.hasMessages(1, view)) {
            this.mHandler.removeMessages(1, view);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, view), 200L);
    }

    public static void setRole(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        accessibilityNodeInfoCompat.setClassName(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.link_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.image_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.imagebutton_description));
            accessibilityNodeInfoCompat.setClickable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.BUTTON)) {
            accessibilityNodeInfoCompat.setClickable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TOGGLEBUTTON)) {
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.setCheckable(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.summary_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            accessibilityNodeInfoCompat.setHeading(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.alert_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.combobox_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.menu_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.menubar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.menuitem_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.progressbar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.radiogroup_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.scrollbar_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.spinbutton_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.rn_tab_description));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.tablist_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.timer_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            accessibilityNodeInfoCompat.setRoleDescription(context.getString(C5771R.string.toolbar_description));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    @Nullable
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mAccessibilityLinks != null) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    @Nullable
    public <T> T getFirstSpan(int i11, int i12, Class<T> cls) {
        View view = this.mView;
        if ((view instanceof TextView) && (((TextView) view).getText() instanceof Spanned)) {
            Object[] spans = ((Spanned) ((TextView) this.mView).getText()).getSpans(i11, i12, cls);
            if (spans.length > 0) {
                return (T) spans[0];
            }
        }
        return null;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f11, float f12) {
        Layout layout;
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks != null && accessibilityLinks.size() != 0) {
            View view = this.mView;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
                    return Integer.MIN_VALUE;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f12 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f11 - textView.getTotalPaddingLeft()) + textView.getScrollX());
                ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpan == null) {
                    return Integer.MIN_VALUE;
                }
                Spanned spanned = (Spanned) textView.getText();
                AccessibilityLinks.AccessibleLink linkBySpanPos = this.mAccessibilityLinks.getLinkBySpanPos(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
                if (linkBySpanPos != null) {
                    return linkBySpanPos.f9924id;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        if (this.mAccessibilityLinks == null) {
            return;
        }
        for (int i11 = 0; i11 < this.mAccessibilityLinks.size(); i11++) {
            list.add(Integer.valueOf(i11));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(i11);
        if (linkById == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        Rect boundsInParent = getBoundsInParent(linkById);
        if (boundsInParent == null) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription(linkById.description);
        accessibilityNodeInfoCompat.addAction(16);
        accessibilityNodeInfoCompat.setBoundsInParent(boundsInParent);
        accessibilityNodeInfoCompat.setRoleDescription(this.mView.getResources().getString(C5771R.string.link_description));
        accessibilityNodeInfoCompat.setClassName(AccessibilityRole.getValue(AccessibilityRole.BUTTON));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (i11 == 524288) {
            view.setTag(C5771R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i11 == 262144) {
            view.setTag(C5771R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        if (!this.mAccessibilityActionsMap.containsKey(Integer.valueOf(i11))) {
            return super.performAccessibilityAction(view, i11, bundle);
        }
        final WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.mAccessibilityActionsMap.get(Integer.valueOf(i11)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(id2));
            if (uIManager != null) {
                uIManager.getEventDispatcher().dispatchEvent(new Event(surfaceId, id2) { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.2
                    @Override // com.facebook.react.uimanager.events.Event
                    public WritableMap getEventData() {
                        return writableMapCreateMap;
                    }

                    @Override // com.facebook.react.uimanager.events.Event
                    public String getEventName() {
                        return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
                    }
                });
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C5771R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(C5771R.id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE) {
            return true;
        }
        if (i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() && i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            scheduleAccessibilityEventSender(view);
        }
        return super.performAccessibilityAction(view, i11, bundle);
    }

    public ReactAccessibilityDelegate(View view, boolean z11, int i11) {
        super(view);
        this.mView = view;
        this.mAccessibilityActionsMap = new HashMap<>();
        this.mHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ((View) message.obj).sendAccessibilityEvent(4);
            }
        };
        view.setFocusable(z11);
        ViewCompat.setImportantForAccessibility(view, i11);
        this.mAccessibilityLinks = (AccessibilityLinks) view.getTag(C5771R.id.accessibility_links);
    }

    private static String removeFinalDelimiter(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - delimiterLength, length);
        }
        return sb2.toString();
    }

    public static void setDelegate(View view, boolean z11, int i11) {
        if (!ViewCompat.hasAccessibilityDelegate(view)) {
            if (view.getTag(C5771R.id.accessibility_role) != null || view.getTag(C5771R.id.accessibility_state) != null || view.getTag(C5771R.id.accessibility_actions) != null || view.getTag(C5771R.id.react_test_id) != null || view.getTag(C5771R.id.accessibility_collection_item) != null || view.getTag(C5771R.id.accessibility_links) != null || view.getTag(C5771R.id.role) != null) {
                ViewCompat.setAccessibilityDelegate(view, new ReactAccessibilityDelegate(view, z11, i11));
            }
        }
    }

    private static void setState(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals(STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setSelected(dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.setEnabled(!dynamic.asBoolean());
            } else if (strNextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(zAsBoolean);
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(C5771R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                        accessibilityEvent.setCurrentItemIndex(iAsInt2);
                    }
                }
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z11;
        String string;
        int i11;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i12 = C5771R.id.accessibility_state_expanded;
        if (view.getTag(i12) != null) {
            if (((Boolean) view.getTag(i12)).booleanValue()) {
                i11 = 524288;
            } else {
                i11 = 262144;
            }
            accessibilityNodeInfoCompat.addAction(i11);
        }
        AccessibilityRole accessibilityRoleFromViewTag = AccessibilityRole.fromViewTag(view);
        String str = (String) view.getTag(C5771R.id.accessibility_hint);
        if (accessibilityRoleFromViewTag != null) {
            setRole(accessibilityNodeInfoCompat, accessibilityRoleFromViewTag, view.getContext());
        }
        if (str != null) {
            accessibilityNodeInfoCompat.setTooltipText(str);
        }
        Object tag = view.getTag(C5771R.id.labelled_by);
        if (tag != null) {
            View viewFindView = ReactFindViewUtil.findView(view.getRootView(), (String) tag);
            this.mAccessibilityLabelledBy = viewFindView;
            if (viewFindView != null) {
                accessibilityNodeInfoCompat.setLabeledBy(viewFindView);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C5771R.id.accessibility_state);
        if (readableMap != null) {
            setState(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C5771R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C5771R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z12 = true;
        if (readableArray != null) {
            for (int i13 = 0; i13 < readableArray.size(); i13++) {
                ReadableMap map = readableArray.getMap(i13);
                if (map.hasKey("name")) {
                    int iIntValue = sCounter;
                    if (map.hasKey(Constants.ScionAnalytics.PARAM_LABEL)) {
                        string = map.getString(Constants.ScionAnalytics.PARAM_LABEL);
                    } else {
                        string = null;
                    }
                    HashMap<String, Integer> map2 = sActionIdMap;
                    if (map2.containsKey(map.getString("name"))) {
                        iIntValue = map2.get(map.getString("name")).intValue();
                    } else {
                        sCounter++;
                    }
                    this.mAccessibilityActionsMap.put(Integer.valueOf(iIntValue), map.getString("name"));
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIntValue, string));
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(C5771R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(C5771R.id.react_test_id);
        if (str2 != null) {
            accessibilityNodeInfoCompat.setViewIdResourceName(str2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(accessibilityNodeInfoCompat.getContentDescription());
        boolean zIsEmpty2 = TextUtils.isEmpty(accessibilityNodeInfoCompat.getText());
        if (zIsEmpty && zIsEmpty2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (readableArray == null && readableMap == null && tag == null && accessibilityRoleFromViewTag == null) {
            z12 = false;
        }
        if (z11 && z12) {
            accessibilityNodeInfoCompat.setContentDescription(getTalkbackDescription(view, accessibilityNodeInfoCompat));
        }
    }
}
