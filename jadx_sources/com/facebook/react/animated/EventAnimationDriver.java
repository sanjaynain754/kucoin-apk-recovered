package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.TouchEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EventAnimationDriver.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J*\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0017JB\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "eventName", "", "viewTag", "", "eventPath", "", "valueNode", "Lcom/facebook/react/animated/ValueAnimatedNode;", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/ValueAnimatedNode;)V", "receiveEvent", "", "targetReactTag", "event", "Lcom/facebook/react/bridge/WritableMap;", "surfaceId", "targetTag", "receiveTouches", "touches", "Lcom/facebook/react/bridge/WritableArray;", "changedIndices", "touchEvent", "Lcom/facebook/react/uimanager/events/TouchEvent;", "canCoalesceEvent", "", "customCoalesceKey", "category", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEventAnimationDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventAnimationDriver.kt\ncom/facebook/react/animated/EventAnimationDriver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class EventAnimationDriver implements RCTModernEventEmitter {

    @JvmField
    @NotNull
    public String eventName;

    @NotNull
    private final List<String> eventPath;

    @JvmField
    @NotNull
    public ValueAnimatedNode valueNode;

    @JvmField
    public int viewTag;

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveEvent(int targetReactTag, @NotNull String eventName, @Nullable WritableMap event) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(-1, targetReactTag, eventName, event);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveTouches(@NotNull String eventName, @NotNull WritableArray touches, @NotNull WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    public EventAnimationDriver(@NotNull String eventName, int i11, @NotNull List<String> eventPath, @NotNull ValueAnimatedNode valueNode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventPath, "eventPath");
        Intrinsics.checkNotNullParameter(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i11;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, @NotNull String eventName, @Nullable WritableMap event) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(surfaceId, targetTag, eventName, false, 0, event, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    @Deprecated(message = "Deprecated in Java")
    public void receiveTouches(@NotNull TouchEvent touchEvent) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, @NotNull String eventName, boolean canCoalesceEvent, int customCoalesceKey, @Nullable WritableMap event, int category) {
        ReadableMap readableMap;
        ReadableType type;
        ReadableMap map;
        ReadableMap readableMap2;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (event != null) {
            int size = this.eventPath.size() - 1;
            int i11 = 0;
            ReadableArray array = null;
            while (i11 < size) {
                if (readableMap != null) {
                    String str = this.eventPath.get(i11);
                    ReadableType type2 = readableMap.getType(str);
                    if (type2 == ReadableType.Map) {
                        readableMap = event;
                        map = readableMap.getMap(str);
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            readableMap = event;
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for key '" + str + "'");
                        }
                        readableMap = event;
                        array = readableMap.getArray(str);
                        readableMap2 = null;
                    }
                } else {
                    int i12 = Integer.parseInt(this.eventPath.get(i11));
                    if (array != null) {
                        readableMap = event;
                        type = array.getType(i12);
                    } else {
                        readableMap = event;
                        type = null;
                    }
                    if (type == ReadableType.Map) {
                        map = array != null ? array.getMap(i12) : null;
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for index '" + i12 + "'");
                        }
                        array = array != null ? array.getArray(i12) : null;
                        readableMap2 = null;
                    }
                }
                i11++;
                readableMap = readableMap2;
            }
            readableMap = event;
            List<String> list = this.eventPath;
            String str2 = list.get(list.size() - 1);
            if (readableMap != null) {
                this.valueNode.nodeValue = readableMap.getDouble(str2);
                return;
            }
            this.valueNode.nodeValue = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
