package com.facebook.react.uimanager.style;

import android.content.Context;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BorderRadiusStyle.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00140\u0013¢\u0006\u0004\b\u0010\u0010\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0015J\u0006\u00108\u001a\u000209J&\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020AJ8\u0010C\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020D2\u0006\u0010\u0006\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020D2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020AH\u0002J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010S\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020=HÖ\u0001J\t\u0010V\u001a\u00020WHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001a¨\u0006X"}, m90084d2 = {"Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "", "uniform", "Lcom/facebook/react/uimanager/LengthPercentage;", "topLeft", "topRight", "bottomLeft", "bottomRight", "topStart", "topEnd", "bottomStart", "bottomEnd", "startStart", "startEnd", "endStart", "endEnd", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "properties", "", "Lkotlin/Pair;", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "(Ljava/util/List;)V", "getUniform", "()Lcom/facebook/react/uimanager/LengthPercentage;", "setUniform", "(Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTopLeft", "setTopLeft", "getTopRight", "setTopRight", "getBottomLeft", "setBottomLeft", "getBottomRight", "setBottomRight", "getTopStart", "setTopStart", "getTopEnd", "setTopEnd", "getBottomStart", "setBottomStart", "getBottomEnd", "setBottomEnd", "getStartStart", "setStartStart", "getStartEnd", "setStartEnd", "getEndStart", "setEndStart", "getEndEnd", "setEndEnd", "set", "", "property", "value", "get", "hasRoundedBorders", "", "resolve", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", ViewProps.LAYOUT_DIRECTION, "", "context", "Landroid/content/Context;", "width", "", "height", "ensureNoOverlap", "Lcom/facebook/react/uimanager/style/CornerRadii;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBorderRadiusStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderRadiusStyle.kt\ncom/facebook/react/uimanager/style/BorderRadiusStyle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1863#2,2:212\n*S KotlinDebug\n*F\n+ 1 BorderRadiusStyle.kt\ncom/facebook/react/uimanager/style/BorderRadiusStyle\n*L\n49#1:212,2\n*E\n"})
public final /* data */ class BorderRadiusStyle {

    @Nullable
    private LengthPercentage bottomEnd;

    @Nullable
    private LengthPercentage bottomLeft;

    @Nullable
    private LengthPercentage bottomRight;

    @Nullable
    private LengthPercentage bottomStart;

    @Nullable
    private LengthPercentage endEnd;

    @Nullable
    private LengthPercentage endStart;

    @Nullable
    private LengthPercentage startEnd;

    @Nullable
    private LengthPercentage startStart;

    @Nullable
    private LengthPercentage topEnd;

    @Nullable
    private LengthPercentage topLeft;

    @Nullable
    private LengthPercentage topRight;

    @Nullable
    private LengthPercentage topStart;

    @Nullable
    private LengthPercentage uniform;

    public BorderRadiusStyle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ BorderRadiusStyle copy$default(BorderRadiusStyle borderRadiusStyle, LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lengthPercentage = borderRadiusStyle.uniform;
        }
        return borderRadiusStyle.copy(lengthPercentage, (i11 & 2) != 0 ? borderRadiusStyle.topLeft : lengthPercentage2, (i11 & 4) != 0 ? borderRadiusStyle.topRight : lengthPercentage3, (i11 & 8) != 0 ? borderRadiusStyle.bottomLeft : lengthPercentage4, (i11 & 16) != 0 ? borderRadiusStyle.bottomRight : lengthPercentage5, (i11 & 32) != 0 ? borderRadiusStyle.topStart : lengthPercentage6, (i11 & 64) != 0 ? borderRadiusStyle.topEnd : lengthPercentage7, (i11 & 128) != 0 ? borderRadiusStyle.bottomStart : lengthPercentage8, (i11 & 256) != 0 ? borderRadiusStyle.bottomEnd : lengthPercentage9, (i11 & 512) != 0 ? borderRadiusStyle.startStart : lengthPercentage10, (i11 & 1024) != 0 ? borderRadiusStyle.startEnd : lengthPercentage11, (i11 & 2048) != 0 ? borderRadiusStyle.endStart : lengthPercentage12, (i11 & 4096) != 0 ? borderRadiusStyle.endEnd : lengthPercentage13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderRadiusStyle)) {
            return false;
        }
        BorderRadiusStyle borderRadiusStyle = (BorderRadiusStyle) other;
        return Intrinsics.areEqual(this.uniform, borderRadiusStyle.uniform) && Intrinsics.areEqual(this.topLeft, borderRadiusStyle.topLeft) && Intrinsics.areEqual(this.topRight, borderRadiusStyle.topRight) && Intrinsics.areEqual(this.bottomLeft, borderRadiusStyle.bottomLeft) && Intrinsics.areEqual(this.bottomRight, borderRadiusStyle.bottomRight) && Intrinsics.areEqual(this.topStart, borderRadiusStyle.topStart) && Intrinsics.areEqual(this.topEnd, borderRadiusStyle.topEnd) && Intrinsics.areEqual(this.bottomStart, borderRadiusStyle.bottomStart) && Intrinsics.areEqual(this.bottomEnd, borderRadiusStyle.bottomEnd) && Intrinsics.areEqual(this.startStart, borderRadiusStyle.startStart) && Intrinsics.areEqual(this.startEnd, borderRadiusStyle.startEnd) && Intrinsics.areEqual(this.endStart, borderRadiusStyle.endStart) && Intrinsics.areEqual(this.endEnd, borderRadiusStyle.endEnd);
    }

    /* JADX INFO: compiled from: BorderRadiusStyle.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderRadiusProp.values().length];
            try {
                iArr[BorderRadiusProp.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderRadiusStyle(@Nullable LengthPercentage lengthPercentage, @Nullable LengthPercentage lengthPercentage2, @Nullable LengthPercentage lengthPercentage3, @Nullable LengthPercentage lengthPercentage4, @Nullable LengthPercentage lengthPercentage5, @Nullable LengthPercentage lengthPercentage6, @Nullable LengthPercentage lengthPercentage7, @Nullable LengthPercentage lengthPercentage8, @Nullable LengthPercentage lengthPercentage9, @Nullable LengthPercentage lengthPercentage10, @Nullable LengthPercentage lengthPercentage11, @Nullable LengthPercentage lengthPercentage12, @Nullable LengthPercentage lengthPercentage13) {
        this.uniform = lengthPercentage;
        this.topLeft = lengthPercentage2;
        this.topRight = lengthPercentage3;
        this.bottomLeft = lengthPercentage4;
        this.bottomRight = lengthPercentage5;
        this.topStart = lengthPercentage6;
        this.topEnd = lengthPercentage7;
        this.bottomStart = lengthPercentage8;
        this.bottomEnd = lengthPercentage9;
        this.startStart = lengthPercentage10;
        this.startEnd = lengthPercentage11;
        this.endStart = lengthPercentage12;
        this.endEnd = lengthPercentage13;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LengthPercentage getUniform() {
        return this.uniform;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LengthPercentage getStartStart() {
        return this.startStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final LengthPercentage getStartEnd() {
        return this.startEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LengthPercentage getEndStart() {
        return this.endStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final LengthPercentage getEndEnd() {
        return this.endEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LengthPercentage getTopLeft() {
        return this.topLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LengthPercentage getTopRight() {
        return this.topRight;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LengthPercentage getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LengthPercentage getBottomRight() {
        return this.bottomRight;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LengthPercentage getTopStart() {
        return this.topStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LengthPercentage getTopEnd() {
        return this.topEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LengthPercentage getBottomStart() {
        return this.bottomStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final LengthPercentage getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final BorderRadiusStyle copy(@Nullable LengthPercentage uniform, @Nullable LengthPercentage topLeft, @Nullable LengthPercentage topRight, @Nullable LengthPercentage bottomLeft, @Nullable LengthPercentage bottomRight, @Nullable LengthPercentage topStart, @Nullable LengthPercentage topEnd, @Nullable LengthPercentage bottomStart, @Nullable LengthPercentage bottomEnd, @Nullable LengthPercentage startStart, @Nullable LengthPercentage startEnd, @Nullable LengthPercentage endStart, @Nullable LengthPercentage endEnd) {
        return new BorderRadiusStyle(uniform, topLeft, topRight, bottomLeft, bottomRight, topStart, topEnd, bottomStart, bottomEnd, startStart, startEnd, endStart, endEnd);
    }

    @Nullable
    public final LengthPercentage getBottomEnd() {
        return this.bottomEnd;
    }

    @Nullable
    public final LengthPercentage getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    public final LengthPercentage getBottomRight() {
        return this.bottomRight;
    }

    @Nullable
    public final LengthPercentage getBottomStart() {
        return this.bottomStart;
    }

    @Nullable
    public final LengthPercentage getEndEnd() {
        return this.endEnd;
    }

    @Nullable
    public final LengthPercentage getEndStart() {
        return this.endStart;
    }

    @Nullable
    public final LengthPercentage getStartEnd() {
        return this.startEnd;
    }

    @Nullable
    public final LengthPercentage getStartStart() {
        return this.startStart;
    }

    @Nullable
    public final LengthPercentage getTopEnd() {
        return this.topEnd;
    }

    @Nullable
    public final LengthPercentage getTopLeft() {
        return this.topLeft;
    }

    @Nullable
    public final LengthPercentage getTopRight() {
        return this.topRight;
    }

    @Nullable
    public final LengthPercentage getTopStart() {
        return this.topStart;
    }

    @Nullable
    public final LengthPercentage getUniform() {
        return this.uniform;
    }

    public final boolean hasRoundedBorders() {
        return (this.uniform == null && this.topLeft == null && this.topRight == null && this.bottomLeft == null && this.bottomRight == null && this.topStart == null && this.topEnd == null && this.bottomStart == null && this.bottomEnd == null && this.startStart == null && this.startEnd == null && this.endStart == null && this.endEnd == null) ? false : true;
    }

    public int hashCode() {
        LengthPercentage lengthPercentage = this.uniform;
        int iHashCode = (lengthPercentage == null ? 0 : lengthPercentage.hashCode()) * 31;
        LengthPercentage lengthPercentage2 = this.topLeft;
        int iHashCode2 = (iHashCode + (lengthPercentage2 == null ? 0 : lengthPercentage2.hashCode())) * 31;
        LengthPercentage lengthPercentage3 = this.topRight;
        int iHashCode3 = (iHashCode2 + (lengthPercentage3 == null ? 0 : lengthPercentage3.hashCode())) * 31;
        LengthPercentage lengthPercentage4 = this.bottomLeft;
        int iHashCode4 = (iHashCode3 + (lengthPercentage4 == null ? 0 : lengthPercentage4.hashCode())) * 31;
        LengthPercentage lengthPercentage5 = this.bottomRight;
        int iHashCode5 = (iHashCode4 + (lengthPercentage5 == null ? 0 : lengthPercentage5.hashCode())) * 31;
        LengthPercentage lengthPercentage6 = this.topStart;
        int iHashCode6 = (iHashCode5 + (lengthPercentage6 == null ? 0 : lengthPercentage6.hashCode())) * 31;
        LengthPercentage lengthPercentage7 = this.topEnd;
        int iHashCode7 = (iHashCode6 + (lengthPercentage7 == null ? 0 : lengthPercentage7.hashCode())) * 31;
        LengthPercentage lengthPercentage8 = this.bottomStart;
        int iHashCode8 = (iHashCode7 + (lengthPercentage8 == null ? 0 : lengthPercentage8.hashCode())) * 31;
        LengthPercentage lengthPercentage9 = this.bottomEnd;
        int iHashCode9 = (iHashCode8 + (lengthPercentage9 == null ? 0 : lengthPercentage9.hashCode())) * 31;
        LengthPercentage lengthPercentage10 = this.startStart;
        int iHashCode10 = (iHashCode9 + (lengthPercentage10 == null ? 0 : lengthPercentage10.hashCode())) * 31;
        LengthPercentage lengthPercentage11 = this.startEnd;
        int iHashCode11 = (iHashCode10 + (lengthPercentage11 == null ? 0 : lengthPercentage11.hashCode())) * 31;
        LengthPercentage lengthPercentage12 = this.endStart;
        int iHashCode12 = (iHashCode11 + (lengthPercentage12 == null ? 0 : lengthPercentage12.hashCode())) * 31;
        LengthPercentage lengthPercentage13 = this.endEnd;
        return iHashCode12 + (lengthPercentage13 != null ? lengthPercentage13.hashCode() : 0);
    }

    @NotNull
    public final ComputedBorderRadius resolve(int layoutDirection, @NotNull Context context, float width, float height) {
        CornerRadii cornerRadiiResolve;
        CornerRadii cornerRadiiResolve2;
        CornerRadii cornerRadiiResolve3;
        CornerRadii cornerRadiiResolve4;
        CornerRadii cornerRadiiResolve5;
        CornerRadii cornerRadiiResolve6;
        CornerRadii cornerRadiiResolve7;
        CornerRadii cornerRadiiResolve8;
        CornerRadii cornerRadiiResolve9;
        CornerRadii cornerRadiiResolve10;
        CornerRadii cornerRadiiResolve11;
        CornerRadii cornerRadiiResolve12;
        Intrinsics.checkNotNullParameter(context, "context");
        CornerRadii cornerRadii = new CornerRadii(0.0f, 0.0f);
        if (layoutDirection == 0) {
            LengthPercentage lengthPercentage = this.startStart;
            if (lengthPercentage == null && (lengthPercentage = this.topStart) == null && (lengthPercentage = this.topLeft) == null) {
                lengthPercentage = this.uniform;
            }
            if (lengthPercentage == null || (cornerRadiiResolve = lengthPercentage.resolve(width, height)) == null) {
                cornerRadiiResolve = cornerRadii;
            }
            LengthPercentage lengthPercentage2 = this.endStart;
            if (lengthPercentage2 == null && (lengthPercentage2 = this.topEnd) == null && (lengthPercentage2 = this.topRight) == null) {
                lengthPercentage2 = this.uniform;
            }
            CornerRadii cornerRadii2 = (lengthPercentage2 == null || (cornerRadiiResolve4 = lengthPercentage2.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve4;
            LengthPercentage lengthPercentage3 = this.startEnd;
            if (lengthPercentage3 == null && (lengthPercentage3 = this.bottomStart) == null && (lengthPercentage3 = this.bottomLeft) == null) {
                lengthPercentage3 = this.uniform;
            }
            CornerRadii cornerRadii3 = (lengthPercentage3 == null || (cornerRadiiResolve3 = lengthPercentage3.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve3;
            LengthPercentage lengthPercentage4 = this.endEnd;
            if (lengthPercentage4 == null && (lengthPercentage4 = this.bottomEnd) == null && (lengthPercentage4 = this.bottomRight) == null) {
                lengthPercentage4 = this.uniform;
            }
            return ensureNoOverlap(cornerRadiiResolve, cornerRadii2, cornerRadii3, (lengthPercentage4 == null || (cornerRadiiResolve2 = lengthPercentage4.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve2, width, height);
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context)) {
            LengthPercentage lengthPercentage5 = this.endStart;
            if (lengthPercentage5 == null && (lengthPercentage5 = this.topEnd) == null && (lengthPercentage5 = this.topRight) == null) {
                lengthPercentage5 = this.uniform;
            }
            CornerRadii cornerRadii4 = (lengthPercentage5 == null || (cornerRadiiResolve12 = lengthPercentage5.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve12;
            LengthPercentage lengthPercentage6 = this.startStart;
            if (lengthPercentage6 == null && (lengthPercentage6 = this.topStart) == null && (lengthPercentage6 = this.topLeft) == null) {
                lengthPercentage6 = this.uniform;
            }
            CornerRadii cornerRadii5 = (lengthPercentage6 == null || (cornerRadiiResolve11 = lengthPercentage6.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve11;
            LengthPercentage lengthPercentage7 = this.endEnd;
            if (lengthPercentage7 == null && (lengthPercentage7 = this.bottomStart) == null && (lengthPercentage7 = this.bottomRight) == null) {
                lengthPercentage7 = this.uniform;
            }
            CornerRadii cornerRadii6 = (lengthPercentage7 == null || (cornerRadiiResolve10 = lengthPercentage7.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve10;
            LengthPercentage lengthPercentage8 = this.startEnd;
            if (lengthPercentage8 == null && (lengthPercentage8 = this.bottomEnd) == null && (lengthPercentage8 = this.bottomLeft) == null) {
                lengthPercentage8 = this.uniform;
            }
            return ensureNoOverlap(cornerRadii4, cornerRadii5, cornerRadii6, (lengthPercentage8 == null || (cornerRadiiResolve9 = lengthPercentage8.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve9, width, height);
        }
        LengthPercentage lengthPercentage9 = this.endStart;
        if (lengthPercentage9 == null && (lengthPercentage9 = this.topEnd) == null && (lengthPercentage9 = this.topLeft) == null) {
            lengthPercentage9 = this.uniform;
        }
        if (lengthPercentage9 == null || (cornerRadiiResolve5 = lengthPercentage9.resolve(width, height)) == null) {
            cornerRadiiResolve5 = cornerRadii;
        }
        LengthPercentage lengthPercentage10 = this.startStart;
        if (lengthPercentage10 == null && (lengthPercentage10 = this.topStart) == null && (lengthPercentage10 = this.topRight) == null) {
            lengthPercentage10 = this.uniform;
        }
        CornerRadii cornerRadii7 = (lengthPercentage10 == null || (cornerRadiiResolve8 = lengthPercentage10.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve8;
        LengthPercentage lengthPercentage11 = this.endEnd;
        if (lengthPercentage11 == null && (lengthPercentage11 = this.bottomStart) == null && (lengthPercentage11 = this.bottomLeft) == null) {
            lengthPercentage11 = this.uniform;
        }
        CornerRadii cornerRadii8 = (lengthPercentage11 == null || (cornerRadiiResolve7 = lengthPercentage11.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve7;
        LengthPercentage lengthPercentage12 = this.startEnd;
        if (lengthPercentage12 == null && (lengthPercentage12 = this.bottomEnd) == null && (lengthPercentage12 = this.bottomRight) == null) {
            lengthPercentage12 = this.uniform;
        }
        return ensureNoOverlap(cornerRadiiResolve5, cornerRadii7, cornerRadii8, (lengthPercentage12 == null || (cornerRadiiResolve6 = lengthPercentage12.resolve(width, height)) == null) ? cornerRadii : cornerRadiiResolve6, width, height);
    }

    public final void setBottomEnd(@Nullable LengthPercentage lengthPercentage) {
        this.bottomEnd = lengthPercentage;
    }

    public final void setBottomLeft(@Nullable LengthPercentage lengthPercentage) {
        this.bottomLeft = lengthPercentage;
    }

    public final void setBottomRight(@Nullable LengthPercentage lengthPercentage) {
        this.bottomRight = lengthPercentage;
    }

    public final void setBottomStart(@Nullable LengthPercentage lengthPercentage) {
        this.bottomStart = lengthPercentage;
    }

    public final void setEndEnd(@Nullable LengthPercentage lengthPercentage) {
        this.endEnd = lengthPercentage;
    }

    public final void setEndStart(@Nullable LengthPercentage lengthPercentage) {
        this.endStart = lengthPercentage;
    }

    public final void setStartEnd(@Nullable LengthPercentage lengthPercentage) {
        this.startEnd = lengthPercentage;
    }

    public final void setStartStart(@Nullable LengthPercentage lengthPercentage) {
        this.startStart = lengthPercentage;
    }

    public final void setTopEnd(@Nullable LengthPercentage lengthPercentage) {
        this.topEnd = lengthPercentage;
    }

    public final void setTopLeft(@Nullable LengthPercentage lengthPercentage) {
        this.topLeft = lengthPercentage;
    }

    public final void setTopRight(@Nullable LengthPercentage lengthPercentage) {
        this.topRight = lengthPercentage;
    }

    public final void setTopStart(@Nullable LengthPercentage lengthPercentage) {
        this.topStart = lengthPercentage;
    }

    public final void setUniform(@Nullable LengthPercentage lengthPercentage) {
        this.uniform = lengthPercentage;
    }

    @NotNull
    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.uniform + ", topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ", topStart=" + this.topStart + ", topEnd=" + this.topEnd + ", bottomStart=" + this.bottomStart + ", bottomEnd=" + this.bottomEnd + ", startStart=" + this.startStart + ", startEnd=" + this.startEnd + ", endStart=" + this.endStart + ", endEnd=" + this.endEnd + ")";
    }

    private final ComputedBorderRadius ensureNoOverlap(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight, float width, float height) {
        float fMin;
        float fMin2;
        float fMin3;
        float horizontal = topLeft.getHorizontal() + bottomLeft.getHorizontal();
        float vertical = topLeft.getVertical() + topRight.getVertical();
        float horizontal2 = topRight.getHorizontal() + bottomRight.getHorizontal();
        float vertical2 = bottomLeft.getVertical() + bottomRight.getVertical();
        float fMin4 = 0.0f;
        if (horizontal > 0.0f) {
            fMin = Math.min(1.0f, height / horizontal);
        } else {
            fMin = 0.0f;
        }
        if (vertical > 0.0f) {
            fMin2 = Math.min(1.0f, width / vertical);
        } else {
            fMin2 = 0.0f;
        }
        if (horizontal2 > 0.0f) {
            fMin3 = Math.min(1.0f, height / horizontal2);
        } else {
            fMin3 = 0.0f;
        }
        if (vertical2 > 0.0f) {
            fMin4 = Math.min(1.0f, width / vertical2);
        }
        return new ComputedBorderRadius(new CornerRadii(topLeft.getHorizontal() * Math.min(fMin2, fMin), topLeft.getVertical() * Math.min(fMin2, fMin)), new CornerRadii(topRight.getHorizontal() * Math.min(fMin2, fMin3), topRight.getVertical() * Math.min(fMin2, fMin3)), new CornerRadii(bottomLeft.getHorizontal() * Math.min(fMin4, fMin), bottomLeft.getVertical() * Math.min(fMin4, fMin)), new CornerRadii(bottomRight.getHorizontal() * Math.min(fMin4, fMin3), bottomRight.getVertical() * Math.min(fMin4, fMin3)));
    }

    @Nullable
    public final LengthPercentage get(@NotNull BorderRadiusProp property) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                return this.uniform;
            case 2:
                return this.topLeft;
            case 3:
                return this.topRight;
            case 4:
                return this.bottomLeft;
            case 5:
                return this.bottomRight;
            case 6:
                return this.topStart;
            case 7:
                return this.topEnd;
            case 8:
                return this.bottomStart;
            case 9:
                return this.bottomEnd;
            case 10:
                return this.startStart;
            case 11:
                return this.startEnd;
            case 12:
                return this.endStart;
            case 13:
                return this.endEnd;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void set(@NotNull BorderRadiusProp property, @Nullable LengthPercentage value) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                this.uniform = value;
                return;
            case 2:
                this.topLeft = value;
                return;
            case 3:
                this.topRight = value;
                return;
            case 4:
                this.bottomLeft = value;
                return;
            case 5:
                this.bottomRight = value;
                return;
            case 6:
                this.topStart = value;
                return;
            case 7:
                this.topEnd = value;
                return;
            case 8:
                this.bottomStart = value;
                return;
            case 9:
                this.bottomEnd = value;
                return;
            case 10:
                this.startStart = value;
                return;
            case 11:
                this.startEnd = value;
                return;
            case 12:
                this.endStart = value;
                return;
            case 13:
                this.endEnd = value;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : lengthPercentage, (i11 & 2) != 0 ? null : lengthPercentage2, (i11 & 4) != 0 ? null : lengthPercentage3, (i11 & 8) != 0 ? null : lengthPercentage4, (i11 & 16) != 0 ? null : lengthPercentage5, (i11 & 32) != 0 ? null : lengthPercentage6, (i11 & 64) != 0 ? null : lengthPercentage7, (i11 & 128) != 0 ? null : lengthPercentage8, (i11 & 256) != 0 ? null : lengthPercentage9, (i11 & 512) != 0 ? null : lengthPercentage10, (i11 & 1024) != 0 ? null : lengthPercentage11, (i11 & 2048) != 0 ? null : lengthPercentage12, (i11 & 4096) != 0 ? null : lengthPercentage13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BorderRadiusStyle(@NotNull List<? extends Pair<? extends BorderRadiusProp, LengthPercentage>> properties) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        Intrinsics.checkNotNullParameter(properties, "properties");
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set((BorderRadiusProp) pair.component1(), (LengthPercentage) pair.component2());
        }
    }
}
