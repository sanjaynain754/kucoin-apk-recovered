package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors();
    private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray<>();
    private final Map<ViewAndId, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public static class ReflectionAccessors {

        @Nullable
        private final Field childNodeIdsField;

        @Nullable
        private final Method getChildId;

        @Nullable
        private final Method getParentNodeId;

        @Nullable
        private final Method getRecordSourceNodeId;

        @Nullable
        private final Method getSourceNodeId;

        @Nullable
        private final Method longArrayGetIndex;

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        private ReflectionAccessors() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                Log.m87483w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                Log.m87483w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            int i11 = Build.VERSION.SDK_INT;
            Class cls = Integer.TYPE;
            if (i11 > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                    field = declaredField;
                    method4 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    Log.m87483w(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = field;
                }
                this.getSourceNodeId = method;
                this.getParentNodeId = method6;
                this.getRecordSourceNodeId = method2;
                this.getChildId = method4;
                this.childNodeIdsField = field;
                this.longArrayGetIndex = method5;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                Log.m87483w(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method3 = null;
            }
            try {
                method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
                field = null;
            } catch (NoSuchMethodException unused5) {
                Log.m87483w(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method4 = null;
                field = null;
            }
            method6 = method3;
            method5 = field;
            this.getSourceNodeId = method;
            this.getParentNodeId = method6;
            this.getRecordSourceNodeId = method2;
            this.getChildId = method4;
            this.childNodeIdsField = field;
            this.longArrayGetIndex = method5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public Long getChildId(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int i11) {
            Method method = this.getChildId;
            if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i11));
                } catch (IllegalAccessException e11) {
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e11);
                } catch (InvocationTargetException e12) {
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e12);
                }
            } else {
                try {
                    Long l11 = (Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), Integer.valueOf(i11));
                    l11.longValue();
                    return l11;
                } catch (ArrayIndexOutOfBoundsException e13) {
                    e = e13;
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e14) {
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e14);
                } catch (InvocationTargetException e15) {
                    e = e15;
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public Long getParentNodeId(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getParentNodeId;
            if (method != null) {
                try {
                    Long l11 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l11.longValue();
                    return l11;
                } catch (IllegalAccessException e11) {
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e11);
                } catch (InvocationTargetException e12) {
                    Log.m87484w(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e12);
                }
            }
            return yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public Long getRecordSourceNodeId(@NonNull AccessibilityRecord accessibilityRecord) {
            Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.m87484w(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.m87484w(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e12);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public Long getSourceNodeId(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e11) {
                Log.m87484w(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.m87484w(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e12);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getVirtualNodeId(long j11) {
            return (int) (j11 >> 32);
        }

        private static boolean isBitSet(long j11, int i11) {
            return (j11 & (1 << i11)) != 0;
        }

        @Nullable
        private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                Log.m87483w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j11 = parcelObtain.readLong();
            if (isBitSet(j11, 0)) {
                parcelObtain.readInt();
            }
            if (isBitSet(j11, 1)) {
                parcelObtain.readLong();
            }
            if (isBitSet(j11, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = isBitSet(j11, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class ViewAndId {

        /* JADX INFO: renamed from: id */
        final int f86987id;
        final View view;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAndId)) {
                return false;
            }
            ViewAndId viewAndId = (ViewAndId) obj;
            return this.f86987id == viewAndId.f86987id && this.view.equals(viewAndId.view);
        }

        private ViewAndId(View view, int i11) {
            this.view = view;
            this.f86987id = i11;
        }

        public int hashCode() {
            return ((this.view.hashCode() + 31) * 31) + this.f86987id;
        }
    }

    private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i11 = 0; i11 < accessibilityNodeInfo.getChildCount(); i11++) {
            Long childId = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i11);
            if (childId != null) {
                int virtualNodeId = ReflectionAccessors.getVirtualNodeId(childId.longValue());
                ViewAndId viewAndId = new ViewAndId(view, virtualNodeId);
                if (this.originToFlutterId.containsKey(viewAndId)) {
                    iIntValue = this.originToFlutterId.get(viewAndId).intValue();
                } else {
                    int i12 = this.nextFlutterId;
                    this.nextFlutterId = i12 + 1;
                    cacheVirtualIdMappings(view, virtualNodeId, i12);
                    iIntValue = i12;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(@NonNull View view, int i11, int i12) {
        ViewAndId viewAndId = new ViewAndId(view, i11);
        this.originToFlutterId.put(viewAndId, Integer.valueOf(i12));
        this.flutterIdToOrigin.put(i12, viewAndId);
    }

    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int i11, @NonNull View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i11);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i11);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long parentNodeId = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (parentNodeId == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(parentNodeId.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull Rect rect, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    @Nullable
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i11);
        if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.f86987id)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i11, viewAndId.view);
    }

    @Nullable
    public Integer getRecordFlutterId(@NonNull View view, @NonNull AccessibilityRecord accessibilityRecord) {
        Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (recordSourceNodeId == null) {
            return null;
        }
        return this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue())));
    }

    public boolean onAccessibilityHoverEvent(int i11, @NonNull MotionEvent motionEvent) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i11);
        if (viewAndId == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i12] = pointerProperties;
            motionEvent.getPointerProperties(i12, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i12, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i12] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return viewAndId.view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i11, int i12, @Nullable Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i11);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.f86987id, i12, bundle);
    }

    public View platformViewOfNode(int i11) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i11);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.view;
    }

    public AccessibilityViewEmbedder(@NonNull View view, int i11) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i11;
    }

    private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i11 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i11 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    public AccessibilityNodeInfo getRootNode(@NonNull View view, int i11, @NonNull Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long sourceNodeId = this.reflectionAccessors.getSourceNodeId(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (sourceNodeId == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(sourceNodeId.longValue()), i11);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i11, view);
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
        if (recordSourceNodeId != null) {
            int virtualNodeId = ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue());
            Integer num = this.originToFlutterId.get(new ViewAndId(view, virtualNodeId));
            if (num == null) {
                int i11 = this.nextFlutterId;
                this.nextFlutterId = i11 + 1;
                Integer numValueOf = Integer.valueOf(i11);
                cacheVirtualIdMappings(view, virtualNodeId, i11);
                num = numValueOf;
            }
            accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
            accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
            accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i12 = 0; i12 < accessibilityEventObtain.getRecordCount(); i12++) {
                AccessibilityRecord record = accessibilityEventObtain.getRecord(i12);
                Long recordSourceNodeId2 = this.reflectionAccessors.getRecordSourceNodeId(record);
                if (recordSourceNodeId2 == null) {
                    return false;
                }
                ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId2.longValue()));
                if (!this.originToFlutterId.containsKey(viewAndId)) {
                    return false;
                }
                record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
        }
        return false;
    }
}
