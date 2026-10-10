package com.trtc.uikit.livekit.component.gift.view.like;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$styleable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GiftHeartLayout.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dX\u0082.¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animator", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;", "heartViewList", "", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartView;", "textHeight", "", "bitmapHeight", "bitmapWidth", "pointX", "isRtl", "", "findViewById", "", "init", "defStyleAttr", "clearAnimation", "resourceLoad", "mRandom", "Ljava/security/SecureRandom;", "mHeartsDrawable", "", "Landroid/graphics/drawable/BitmapDrawable;", "[Landroid/graphics/drawable/BitmapDrawable;", "addFavor", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGiftHeartLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftHeartLayout.kt\ncom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,113:1\n59#2,2:114\n43#3:116\n*S KotlinDebug\n*F\n+ 1 GiftHeartLayout.kt\ncom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout\n*L\n36#1:114,2\n56#1:116\n*E\n"})
public final class GiftHeartLayout extends RelativeLayout {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f77840k = new Companion(null);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final int[] f77841l = {R$drawable.gift_heart0, R$drawable.gift_heart1, R$drawable.gift_heart2, R$drawable.gift_heart3, R$drawable.gift_heart4, R$drawable.gift_heart5, R$drawable.gift_heart6, R$drawable.gift_heart7, R$drawable.gift_heart8};

    /* JADX INFO: renamed from: b */
    @Nullable
    public GiftAbstractPathAnimator f77842b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<GiftHeartView> f77843c;

    /* JADX INFO: renamed from: d */
    public int f77844d;

    /* JADX INFO: renamed from: e */
    public int f77845e;

    /* JADX INFO: renamed from: f */
    public int f77846f;

    /* JADX INFO: renamed from: g */
    public int f77847g;

    /* JADX INFO: renamed from: h */
    public final boolean f77848h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final SecureRandom f77849i;

    /* JADX INFO: renamed from: j */
    public BitmapDrawable[] f77850j;

    /* JADX INFO: compiled from: GiftHeartLayout.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout$Companion;", "", "<init>", "()V", "HEART_VIEW_COUNT_MAX", "", "sp2px", "context", "Landroid/content/Context;", "spValue", "", "mDrawableIds", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final int m79752a(Context context, float f11) {
            return (int) ((f11 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m79748a() {
        BitmapDrawable[] bitmapDrawableArr;
        GiftHeartView giftHeartView;
        Iterator<GiftHeartView> it = this.f77843c.iterator();
        do {
            bitmapDrawableArr = null;
            if (!it.hasNext()) {
                giftHeartView = null;
                break;
            }
            giftHeartView = it.next();
        } while (giftHeartView.getParent() != null);
        if (giftHeartView == null) {
            if (this.f77843c.size() >= 30) {
                return;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            giftHeartView = new GiftHeartView(context);
            BitmapDrawable[] bitmapDrawableArr2 = this.f77850j;
            if (bitmapDrawableArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeartsDrawable");
            } else {
                bitmapDrawableArr = bitmapDrawableArr2;
            }
            giftHeartView.setDrawable(bitmapDrawableArr[this.f77849i.nextInt(8)]);
            this.f77843c.add(giftHeartView);
        }
        GiftAbstractPathAnimator giftAbstractPathAnimator = this.f77842b;
        if (giftAbstractPathAnimator != null) {
            giftAbstractPathAnimator.mo79725d(giftHeartView, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m79751d() {
        int[] iArr = f77841l;
        Bitmap[] bitmapArr = new Bitmap[iArr.length];
        this.f77850j = new BitmapDrawable[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            bitmapArr[i11] = BitmapFactory.decodeResource(getResources(), f77841l[i11]);
            BitmapDrawable[] bitmapDrawableArr = this.f77850j;
            if (bitmapDrawableArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeartsDrawable");
                bitmapDrawableArr = null;
            }
            bitmapDrawableArr[i11] = new BitmapDrawable(getResources(), bitmapArr[i11]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public GiftHeartLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        boolean z11;
        Resources resources;
        Configuration configuration;
        super(context, attributeSet);
        this.f77843c = new ArrayList();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            z11 = configuration.getLayoutDirection() == 1;
        }
        this.f77848h = z11;
        this.f77849i = new SecureRandom();
        m79749b(context);
        m79751d();
        m79750c(attributeSet, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m79749b(Context context) {
        LayoutInflater.from(context).inflate(R$layout.gift_layout_heart_layout, this);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.gift_ic_like_png);
        this.f77845e = bitmapDecodeResource.getWidth();
        this.f77846f = bitmapDecodeResource.getHeight();
        Companion companion = f77840k;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f77844d = companion.m79752a(context2, 20.0f) + (this.f77845e / 2);
        this.f77847g = this.f77846f;
        bitmapDecodeResource.recycle();
    }

    /* JADX INFO: renamed from: c */
    public final void m79750c(AttributeSet attributeSet, int i11) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] LiveKitGiftHeartLayout = R$styleable.LiveKitGiftHeartLayout;
        Intrinsics.checkNotNullExpressionValue(LiveKitGiftHeartLayout, "LiveKitGiftHeartLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveKitGiftHeartLayout, i11, 0);
        int i12 = this.f77847g;
        if (i12 <= 30 && i12 >= 0) {
            this.f77847g = i12 - 10;
        } else if (i12 >= -30 && i12 <= 0) {
            this.f77847g = i12 + 10;
        } else {
            this.f77847g = 30;
        }
        this.f77842b = new GiftPathAnimator(GiftAbstractPathAnimator.Config.f77828l.fromTypeArray(typedArrayObtainStyledAttributes, 30, this.f77844d, this.f77847g, this.f77846f, this.f77845e, this.f77848h));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void clearAnimation() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).clearAnimation();
        }
        removeAllViews();
    }
}
