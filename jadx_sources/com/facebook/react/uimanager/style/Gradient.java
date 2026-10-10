package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Gradient.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/Gradient;", "", "gradient", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V", "type", "Lcom/facebook/react/uimanager/style/Gradient$GradientType;", "linearGradient", "Lcom/facebook/react/uimanager/style/LinearGradient;", "getShader", "Landroid/graphics/Shader;", "bounds", "Landroid/graphics/Rect;", "GradientType", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Gradient {

    @NotNull
    private final LinearGradient linearGradient;

    @NotNull
    private final GradientType type;

    /* JADX INFO: compiled from: Gradient.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/Gradient$GradientType;", "", "<init>", "(Ljava/lang/String;I)V", "LINEAR_GRADIENT", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum GradientType {
        LINEAR_GRADIENT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<GradientType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Gradient.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientType.values().length];
            try {
                iArr[GradientType.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Gradient(@Nullable ReadableMap readableMap, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (readableMap == null) {
            throw new IllegalArgumentException("Gradient cannot be null");
        }
        String string = readableMap.getString("type");
        if (!Intrinsics.areEqual(string, "linearGradient")) {
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        this.type = GradientType.LINEAR_GRADIENT;
        ReadableMap map = readableMap.getMap("direction");
        if (map == null) {
            throw new IllegalArgumentException("Gradient must have direction");
        }
        ReadableArray array = readableMap.getArray("colorStops");
        if (array == null) {
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        int size = array.size();
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map2 = array.getMap(i11);
            if (map2 != null) {
                Integer color = map2.getType("color") == ReadableType.Map ? ColorPropConverter.getColor(map2.getMap("color"), context) : Integer.valueOf(map2.getInt("color"));
                Intrinsics.checkNotNull(color);
                iArr[i11] = color.intValue();
                fArr[i11] = (float) map2.getDouble(ViewProps.POSITION);
            }
        }
        this.linearGradient = new LinearGradient(map, iArr, fArr);
    }

    @Nullable
    public final Shader getShader(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()] == 1) {
            return this.linearGradient.getShader(bounds.width(), bounds.height());
        }
        throw new NoWhenBranchMatchedException();
    }
}
