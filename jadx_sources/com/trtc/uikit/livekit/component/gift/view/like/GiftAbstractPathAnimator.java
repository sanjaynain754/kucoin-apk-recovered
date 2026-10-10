package com.trtc.uikit.livekit.component.gift.view.like;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$dimen;
import com.trtc.uikit.livekit.R$integer;
import com.trtc.uikit.livekit.R$styleable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import uc0.C45152a;

/* JADX INFO: compiled from: GiftAbstractPathAnimator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator;", "", "config", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;", "<init>", "(Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;)V", "getConfig", "()Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;", "random", "Ljava/security/SecureRandom;", "randomRotation", "", "createPath", "Landroid/graphics/Path;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "factor", "", "start", "", "child", "parent", "Landroid/view/ViewGroup;", "Config", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class GiftAbstractPathAnimator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Config f77826a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SecureRandom f77827b;

    /* JADX INFO: compiled from: GiftAbstractPathAnimator.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;", "", "<init>", "()V", "initX", "", "getInitX", "()I", "setInitX", "(I)V", "initY", "getInitY", "setInitY", "xRand", "getXRand", "setXRand", "animLengthRand", "getAnimLengthRand", "setAnimLengthRand", "bezierFactor", "getBezierFactor", "setBezierFactor", "xPointFactor", "getXPointFactor", "setXPointFactor", "animLength", "getAnimLength", "setAnimLength", "heartWidth", "getHeartWidth", "setHeartWidth", "heartHeight", "getHeartHeight", "setHeartHeight", "animDuration", "getAnimDuration", "setAnimDuration", "isRTL", "", "()Z", "setRTL", "(Z)V", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Config {

        /* JADX INFO: renamed from: l */
        @NotNull
        public static final Companion f77828l = new Companion(null);

        /* JADX INFO: renamed from: a */
        public int f77829a;

        /* JADX INFO: renamed from: b */
        public int f77830b;

        /* JADX INFO: renamed from: c */
        public int f77831c;

        /* JADX INFO: renamed from: d */
        public int f77832d;

        /* JADX INFO: renamed from: e */
        public int f77833e;

        /* JADX INFO: renamed from: f */
        public int f77834f;

        /* JADX INFO: renamed from: g */
        public int f77835g;

        /* JADX INFO: renamed from: h */
        public int f77836h;

        /* JADX INFO: renamed from: i */
        public int f77837i;

        /* JADX INFO: renamed from: j */
        public int f77838j;

        /* JADX INFO: renamed from: k */
        public boolean f77839k;

        /* JADX INFO: compiled from: GiftAbstractPathAnimator.kt */
        @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;", "", "<init>", "()V", "fromTypeArray", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;", "typedArray", "Landroid/content/res/TypedArray;", "x", "", "y", "pointX", "", "heartWidth", "heartHeight", "isRTL", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final Config fromTypeArray(@NotNull TypedArray typedArray, float x11, float y11, int pointX, int heartWidth, int heartHeight, boolean isRTL) {
                Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                Config config = new Config();
                Resources resources = typedArray.getResources();
                config.m79743r((int) typedArray.getDimension(R$styleable.LiveKitGiftHeartLayout_initX, x11));
                config.m79744s((int) typedArray.getDimension(R$styleable.LiveKitGiftHeartLayout_initY, y11));
                config.m79747v((int) typedArray.getDimension(R$styleable.LiveKitGiftHeartLayout_xRand, resources.getDimensionPixelOffset(R$dimen.gift_heart_anim_bezier_x_rand)));
                config.m79738m((int) typedArray.getDimension(R$styleable.LiveKitGiftHeartLayout_animLength, resources.getDimensionPixelOffset(R$dimen.gift_heart_anim_length)));
                config.m79739n((int) typedArray.getDimension(R$styleable.LiveKitGiftHeartLayout_animLengthRand, resources.getDimensionPixelOffset(R$dimen.gift_heart_anim_length_rand)));
                config.m79740o(typedArray.getInteger(R$styleable.LiveKitGiftHeartLayout_bezierFactor, resources.getInteger(R$integer.gift_heart_anim_bezier_factor)));
                config.m79746u(pointX);
                config.m79742q(heartWidth);
                config.m79741p(heartHeight);
                config.m79737l(typedArray.getInteger(R$styleable.LiveKitGiftHeartLayout_anim_duration, resources.getInteger(R$integer.gift_heart_anim_duration)));
                config.m79745t(isRTL);
                return config;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF77838j() {
            return this.f77838j;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF77835g() {
            return this.f77835g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF77832d() {
            return this.f77832d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF77833e() {
            return this.f77833e;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getF77837i() {
            return this.f77837i;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF77836h() {
            return this.f77836h;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getF77829a() {
            return this.f77829a;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getF77830b() {
            return this.f77830b;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getF77834f() {
            return this.f77834f;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getF77831c() {
            return this.f77831c;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getF77839k() {
            return this.f77839k;
        }

        /* JADX INFO: renamed from: l */
        public final void m79737l(int i11) {
            this.f77838j = i11;
        }

        /* JADX INFO: renamed from: m */
        public final void m79738m(int i11) {
            this.f77835g = i11;
        }

        /* JADX INFO: renamed from: n */
        public final void m79739n(int i11) {
            this.f77832d = i11;
        }

        /* JADX INFO: renamed from: o */
        public final void m79740o(int i11) {
            this.f77833e = i11;
        }

        /* JADX INFO: renamed from: p */
        public final void m79741p(int i11) {
            this.f77837i = i11;
        }

        /* JADX INFO: renamed from: q */
        public final void m79742q(int i11) {
            this.f77836h = i11;
        }

        /* JADX INFO: renamed from: r */
        public final void m79743r(int i11) {
            this.f77829a = i11;
        }

        /* JADX INFO: renamed from: s */
        public final void m79744s(int i11) {
            this.f77830b = i11;
        }

        /* JADX INFO: renamed from: t */
        public final void m79745t(boolean z11) {
            this.f77839k = z11;
        }

        /* JADX INFO: renamed from: u */
        public final void m79746u(int i11) {
            this.f77834f = i11;
        }

        /* JADX INFO: renamed from: v */
        public final void m79747v(int i11) {
            this.f77831c = i11;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo79725d(@NotNull View view, @NotNull ViewGroup viewGroup);

    public GiftAbstractPathAnimator(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f77826a = config;
        this.f77827b = new SecureRandom();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Path m79722a(@NotNull AtomicInteger counter, @NotNull View view, int i11) {
        int f77834f;
        int f77834f2;
        Intrinsics.checkNotNullParameter(counter, "counter");
        Intrinsics.checkNotNullParameter(view, "view");
        SecureRandom secureRandom = this.f77827b;
        int iNextInt = secureRandom.nextInt(this.f77826a.getF77831c());
        int iNextInt2 = secureRandom.nextInt(this.f77826a.getF77831c());
        int height = view.getHeight() - this.f77826a.getF77830b();
        int iIntValue = (counter.intValue() * 15) + (this.f77826a.getF77835g() * i11) + secureRandom.nextInt(this.f77826a.getF77832d());
        int f77833e = iIntValue / this.f77826a.getF77833e();
        if (this.f77826a.getF77839k()) {
            f77834f = this.f77826a.getF77834f() - iNextInt;
            f77834f2 = this.f77826a.getF77834f() - iNextInt2;
        } else {
            f77834f = this.f77826a.getF77834f() + iNextInt;
            f77834f2 = this.f77826a.getF77834f() + iNextInt2;
        }
        int i12 = height - iIntValue;
        int i13 = height - (iIntValue / 2);
        Path path = new Path();
        path.moveTo(this.f77826a.getF77829a() - C45152a.m99799a(50.0f), height);
        float f11 = f77834f;
        float f12 = i13;
        path.cubicTo(this.f77826a.getF77829a(), height - f77833e, f11, i13 + f77833e, f11, f12);
        path.moveTo(f11, f12);
        float f13 = f77834f2;
        path.cubicTo(f11, i13 - f77833e, f13, f77833e + i12, f13, i12);
        return path;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Config getF77826a() {
        return this.f77826a;
    }

    /* JADX INFO: renamed from: c */
    public final float m79724c() {
        return (this.f77827b.nextFloat() * 28.6f) - 14.3f;
    }
}
