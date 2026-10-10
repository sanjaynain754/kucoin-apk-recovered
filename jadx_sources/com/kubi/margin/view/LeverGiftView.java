package com.kubi.margin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.api.entity.MarginBonusConfig;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.margin.api.entity.MarginWelfare;
import com.kubi.margin.view.LeverGiftView;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36944v0;
import p698vp.C45618h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: LeverGiftView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\u001eJ\u0010\u0010!\u001a\u00020\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/view/LeverGiftView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "bmarginViewLeverGiftBinding", "Lcom/kubi/margin/databinding/BmarginViewLeverGiftBinding;", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "page", "config", "Lcom/kubi/margin/api/entity/MarginWelfare;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "getAction", "()Lio/reactivex/functions/Action;", "setAction", "(Lio/reactivex/functions/Action;)V", "dismissCallback", "getDismissCallback", "setDismissCallback", "initView", "", "checkShow", "setGone", "isLatestActive", "", "saveLastConfigTime", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverGiftView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverGiftView.kt\ncom/kubi/margin/view/LeverGiftView\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n84#2:161\n84#2:162\n84#2:163\n75#2,2:165\n75#2,2:167\n75#2,2:169\n75#2,2:171\n1#3:164\n*S KotlinDebug\n*F\n+ 1 LeverGiftView.kt\ncom/kubi/margin/view/LeverGiftView\n*L\n116#1:161\n117#1:162\n147#1:163\n158#1:165,2\n55#1:167,2\n57#1:169,2\n59#1:171,2\n*E\n"})
public final class LeverGiftView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public C36944v0 f34250b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f34251c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f34252d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public MarginWelfare f34253e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Action f34254f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Action f34255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverGiftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34251c = "bonus";
        this.f34252d = "";
        C36944v0 c36944v0M82758a = C36944v0.m82758a(LayoutInflater.from(context).inflate(R$layout.bmargin_view_lever_gift, this));
        Intrinsics.checkNotNullExpressionValue(c36944v0M82758a, "bind(...)");
        this.f34250b = c36944v0M82758a;
        m40686e();
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m40682f(LeverGiftView leverGiftView) throws Exception {
        MarginCouponConfig lend;
        Long createdAt;
        MarginBonusConfig bonus;
        Long updatedAt;
        C45618h c45618h = C45618h.f102740a;
        C46392a.m102330m(c45618h.m100716d(leverGiftView.f34251c, leverGiftView.f34252d), System.currentTimeMillis());
        if (Intrinsics.areEqual(leverGiftView.f34251c, "bonus")) {
            MarginWelfare marginWelfare = leverGiftView.f34253e;
            if (marginWelfare != null && (bonus = marginWelfare.getBonus()) != null && (updatedAt = bonus.getUpdatedAt()) != null) {
                C46392a.m102330m(c45618h.m100714b(leverGiftView.f34251c, leverGiftView.f34252d), updatedAt.longValue());
            }
        } else {
            MarginWelfare marginWelfare2 = leverGiftView.f34253e;
            if (marginWelfare2 != null && (lend = marginWelfare2.getLend()) != null && (createdAt = lend.getCreatedAt()) != null) {
                C46392a.m102330m(c45618h.m100714b(leverGiftView.f34251c, leverGiftView.f34252d), createdAt.longValue());
            }
        }
        Action action = leverGiftView.f34255g;
        if (action != null) {
            action.run();
        }
        leverGiftView.m40689k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m40683g(LeverGiftView leverGiftView) throws Exception {
        Action action = leverGiftView.f34254f;
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m40684h(LeverGiftView leverGiftView, ScaleAnimation scaleAnimation) {
        leverGiftView.f34250b.f82018c.startAnimation(scaleAnimation);
    }

    /* JADX INFO: renamed from: d */
    public final void m40685d(@NotNull String type, @Nullable MarginWelfare marginWelfare, @NotNull String page) {
        Long createdAt;
        MarginCouponConfig lend;
        MarginCouponConfig lend2;
        MarginBonusConfig bonus;
        MarginBonusConfig bonus2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f34251c = type;
        this.f34253e = marginWelfare;
        this.f34252d = page;
        Boolean boolValueOf = null;
        if (Intrinsics.areEqual(type, "bonus")) {
            createdAt = (marginWelfare == null || (bonus2 = marginWelfare.getBonus()) == null) ? null : bonus2.getUpdatedAt();
            if (marginWelfare != null && (bonus = marginWelfare.getBonus()) != null) {
                boolValueOf = bonus.isUnReceive();
            }
            this.f34250b.f82019d.setImageResource(R$mipmap.bmargin_ic_margin_bonus);
        } else {
            createdAt = (marginWelfare == null || (lend2 = marginWelfare.getLend()) == null) ? null : lend2.getCreatedAt();
            if (marginWelfare != null && (lend = marginWelfare.getLend()) != null) {
                boolValueOf = Boolean.valueOf(lend.isUnReceive());
            }
            this.f34250b.f82019d.setImageResource(R$mipmap.bmargin_ic_lever_gift);
        }
        if ((Intrinsics.areEqual(type, "bonus") && !C27025c.m66566d(boolValueOf)) || (Intrinsics.areEqual(type, "interest") && (createdAt == null || !C27025c.m66566d(boolValueOf)))) {
            m40689k();
            return;
        }
        if (ViewExtKt.m66581l(this)) {
            return;
        }
        C45618h c45618h = C45618h.f102740a;
        boolean z11 = C27025c.m66566d(boolValueOf) && (createdAt == null || C46392a.m102324f(c45618h.m100714b(type, page), 0L) != createdAt.longValue()) && TimeUtils.m66419f(System.currentTimeMillis(), C46392a.m102324f(c45618h.m100716d(type, page), 0L), TimeUtils.Unit.HOUR) >= 24;
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        if ((Intrinsics.areEqual(type, "bonus") && zM66566d) || (Intrinsics.areEqual(type, "interest") && z11)) {
            ViewExtKt.m66594y(this);
        } else {
            m40689k();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m40686e() {
        ImageView ivClose = this.f34250b.f82017b;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: xp.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeverGiftView.m40682f(this.f103889b);
            }
        }, 1, null);
        FrameLayout llGift = this.f34250b.f82020e;
        Intrinsics.checkNotNullExpressionValue(llGift, "llGift");
        C27046k.m66711z(llGift, 0L, new Function0() { // from class: xp.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeverGiftView.m40683g(this.f103890b);
            }
        }, 1, null);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleAnimation.setDuration(150L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        this.f34250b.f82018c.postDelayed(new Runnable() { // from class: xp.h
            @Override // java.lang.Runnable
            public final void run() {
                LeverGiftView.m40684h(this.f103891b, scaleAnimation);
            }
        }, 500L);
    }

    @Nullable
    /* JADX INFO: renamed from: getAction, reason: from getter */
    public final Action getF34254f() {
        return this.f34254f;
    }

    @Nullable
    /* JADX INFO: renamed from: getDismissCallback, reason: from getter */
    public final Action getF34255g() {
        return this.f34255g;
    }

    @Nullable
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final String getF34251c() {
        return this.f34251c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m40687i(@Nullable String str) {
        MarginCouponConfig lend;
        MarginBonusConfig bonus;
        Long createdAt = null;
        boolIsUnReceive = null;
        Boolean boolIsUnReceive = null;
        createdAt = null;
        if (Intrinsics.areEqual(str, "bonus")) {
            MarginWelfare marginWelfare = this.f34253e;
            if (marginWelfare != null && (bonus = marginWelfare.getBonus()) != null) {
                boolIsUnReceive = bonus.isUnReceive();
            }
            return C27025c.m66566d(boolIsUnReceive);
        }
        MarginWelfare marginWelfare2 = this.f34253e;
        if (marginWelfare2 != null && (lend = marginWelfare2.getLend()) != null) {
            createdAt = lend.getCreatedAt();
        }
        return (createdAt == null || C46392a.m102324f(C45618h.f102740a.m100727o(str), 0L) == createdAt.longValue()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final void m40688j(@Nullable String str) {
        MarginCouponConfig lend;
        MarginBonusConfig bonus;
        Long createdAt = null;
        if (Intrinsics.areEqual(str, "bonus")) {
            MarginWelfare marginWelfare = this.f34253e;
            if (marginWelfare != null && (bonus = marginWelfare.getBonus()) != null) {
                createdAt = bonus.getUpdatedAt();
            }
        } else {
            MarginWelfare marginWelfare2 = this.f34253e;
            if (marginWelfare2 != null && (lend = marginWelfare2.getLend()) != null) {
                createdAt = lend.getCreatedAt();
            }
        }
        if (createdAt != null) {
            C46392a.m102330m(C45618h.f102740a.m100727o(str), createdAt.longValue());
        }
    }

    public final void setAction(@Nullable Action action) {
        this.f34254f = action;
    }

    public final void setDismissCallback(@Nullable Action action) {
        this.f34255g = action;
    }

    public final void setType(@Nullable String str) {
        this.f34251c = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m40689k() {
        ViewExtKt.m66577h(this);
        if (Intrinsics.areEqual(this.f34251c, "bonus")) {
            m40685d("interest", this.f34253e, this.f34252d);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverGiftView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
