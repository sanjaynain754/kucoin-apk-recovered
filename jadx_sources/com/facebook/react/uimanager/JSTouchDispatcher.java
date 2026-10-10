package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.TouchEvent;
import com.facebook.react.uimanager.events.TouchEventCoalescingKeyHelper;
import com.facebook.react.uimanager.events.TouchEventType;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class JSTouchDispatcher {
    private final ViewGroup mViewGroup;
    private int mTargetTag = -1;
    private final float[] mTargetCoordinates = new float[2];
    private boolean mChildIsHandlingNativeGesture = false;
    private long mGestureStartTime = Long.MIN_VALUE;
    private final TouchEventCoalescingKeyHelper mTouchEventCoalescingKeyHelper = new TouchEventCoalescingKeyHelper();

    public void handleTouchEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        handleTouchEvent(motionEvent, eventDispatcher, null);
    }

    public void onChildEndedNativeGesture(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        this.mChildIsHandlingNativeGesture = false;
    }

    private void dispatchCancelEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mTargetTag == -1) {
            C45999a.m101488I(ReactConstants.TAG, "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C38115a.m86046b(!this.mChildIsHandlingNativeGesture, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) C38115a.m86047c(eventDispatcher);
        int surfaceId = UIManagerHelper.getSurfaceId(this.mViewGroup);
        int i11 = this.mTargetTag;
        TouchEventType touchEventType = TouchEventType.CANCEL;
        long j11 = this.mGestureStartTime;
        float[] fArr = this.mTargetCoordinates;
        eventDispatcher2.dispatchEvent(TouchEvent.obtain(surfaceId, i11, touchEventType, motionEvent, j11, fArr[0], fArr[1], this.mTouchEventCoalescingKeyHelper));
    }

    public void handleTouchEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher, @Nullable ReactContext reactContext) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.mTargetTag != -1) {
                C45999a.m101507m(ReactConstants.TAG, "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.mChildIsHandlingNativeGesture = false;
            this.mGestureStartTime = motionEvent.getEventTime();
            this.mTargetTag = findTargetTagAndSetCoordinates(motionEvent);
            markActiveTouchForTag(UIManagerHelper.getSurfaceId(this.mViewGroup), this.mTargetTag, reactContext);
            int surfaceId = UIManagerHelper.getSurfaceId(this.mViewGroup);
            int i11 = this.mTargetTag;
            TouchEventType touchEventType = TouchEventType.START;
            long j11 = this.mGestureStartTime;
            float[] fArr = this.mTargetCoordinates;
            eventDispatcher.dispatchEvent(TouchEvent.obtain(surfaceId, i11, touchEventType, motionEvent, j11, fArr[0], fArr[1], this.mTouchEventCoalescingKeyHelper));
            return;
        }
        if (this.mChildIsHandlingNativeGesture) {
            return;
        }
        if (this.mTargetTag == -1) {
            C45999a.m101507m(ReactConstants.TAG, "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            findTargetTagAndSetCoordinates(motionEvent);
            int surfaceId2 = UIManagerHelper.getSurfaceId(this.mViewGroup);
            int i12 = this.mTargetTag;
            TouchEventType touchEventType2 = TouchEventType.END;
            long j12 = this.mGestureStartTime;
            float[] fArr2 = this.mTargetCoordinates;
            eventDispatcher.dispatchEvent(TouchEvent.obtain(surfaceId2, i12, touchEventType2, motionEvent, j12, fArr2[0], fArr2[1], this.mTouchEventCoalescingKeyHelper));
            sweepActiveTouchForTag(surfaceId2, this.mTargetTag, reactContext);
            this.mTargetTag = -1;
            this.mGestureStartTime = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            findTargetTagAndSetCoordinates(motionEvent);
            int surfaceId3 = UIManagerHelper.getSurfaceId(this.mViewGroup);
            int i13 = this.mTargetTag;
            TouchEventType touchEventType3 = TouchEventType.MOVE;
            long j13 = this.mGestureStartTime;
            float[] fArr3 = this.mTargetCoordinates;
            eventDispatcher.dispatchEvent(TouchEvent.obtain(surfaceId3, i13, touchEventType3, motionEvent, j13, fArr3[0], fArr3[1], this.mTouchEventCoalescingKeyHelper));
            return;
        }
        if (action == 5) {
            int surfaceId4 = UIManagerHelper.getSurfaceId(this.mViewGroup);
            int i14 = this.mTargetTag;
            TouchEventType touchEventType4 = TouchEventType.START;
            long j14 = this.mGestureStartTime;
            float[] fArr4 = this.mTargetCoordinates;
            eventDispatcher.dispatchEvent(TouchEvent.obtain(surfaceId4, i14, touchEventType4, motionEvent, j14, fArr4[0], fArr4[1], this.mTouchEventCoalescingKeyHelper));
            return;
        }
        if (action == 6) {
            int surfaceId5 = UIManagerHelper.getSurfaceId(this.mViewGroup);
            int i15 = this.mTargetTag;
            TouchEventType touchEventType5 = TouchEventType.END;
            long j15 = this.mGestureStartTime;
            float[] fArr5 = this.mTargetCoordinates;
            eventDispatcher.dispatchEvent(TouchEvent.obtain(surfaceId5, i15, touchEventType5, motionEvent, j15, fArr5[0], fArr5[1], this.mTouchEventCoalescingKeyHelper));
            return;
        }
        if (action == 3) {
            if (this.mTouchEventCoalescingKeyHelper.hasCoalescingKey(motionEvent.getDownTime())) {
                dispatchCancelEvent(motionEvent, eventDispatcher);
            } else {
                C45999a.m101507m(ReactConstants.TAG, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            sweepActiveTouchForTag(UIManagerHelper.getSurfaceId(this.mViewGroup), this.mTargetTag, reactContext);
            this.mTargetTag = -1;
            this.mGestureStartTime = Long.MIN_VALUE;
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Warning : touch event was ignored. Action=" + action + " Target=" + this.mTargetTag);
    }

    public void onChildStartedNativeGesture(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mChildIsHandlingNativeGesture) {
            return;
        }
        dispatchCancelEvent(motionEvent, eventDispatcher);
        this.mChildIsHandlingNativeGesture = true;
        this.mTargetTag = -1;
    }

    public JSTouchDispatcher(ViewGroup viewGroup) {
        this.mViewGroup = viewGroup;
    }

    private int findTargetTagAndSetCoordinates(MotionEvent motionEvent) {
        return TouchTargetHelper.findTargetTagAndCoordinatesForTouch(motionEvent.getX(), motionEvent.getY(), this.mViewGroup, this.mTargetCoordinates, null);
    }

    private void markActiveTouchForTag(int i11, int i12, @Nullable ReactContext reactContext) {
        UIManager uIManager;
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid() && reactContext != null && (uIManager = UIManagerHelper.getUIManager(reactContext, 2)) != null) {
            uIManager.markActiveTouchForTag(i11, i12);
        }
    }

    private void sweepActiveTouchForTag(int i11, int i12, @Nullable ReactContext reactContext) {
        UIManager uIManager;
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid() && reactContext != null && (uIManager = UIManagerHelper.getUIManager(reactContext, 2)) != null) {
            uIManager.sweepActiveTouchForTag(i11, i12);
        }
    }
}
