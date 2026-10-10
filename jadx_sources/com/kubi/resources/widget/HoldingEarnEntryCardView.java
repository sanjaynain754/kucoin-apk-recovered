package com.kubi.resources.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37749a;
import k00.C40845i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingEarnEntryCardView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011J\u0016\u0010\u001a\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ\u0016\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/kubi/resources/widget/HoldingEarnEntryCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/KucoinViewHoldingEarnEntryCardBinding;", "onCardClick", "Lkotlin/Function0;", "", "onCloseClick", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "setInterestRateText", "text", "setTitleText", "setDescText", "setOnCardClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCloseClickListener", "trackExposureEvent", "trackClickEvent", "trackCloseEvent", "getTrackEventSpm", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HoldingEarnEntryCardView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C40845i f43823b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function0<Unit> f43824c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f43825d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f43826e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HoldingEarnEntryCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HoldingEarnEntryCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m54525c(HoldingEarnEntryCardView holdingEarnEntryCardView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = holdingEarnEntryCardView.f43826e;
        if (str == null) {
            str = "";
        }
        holdingEarnEntryCardView.m54527e(str);
        InterfaceC37749a.a.m85112g(C37304a.f82764a, holdingEarnEntryCardView.getTrackEventSpm(), null, null, 6, null);
        Function0<Unit> function0 = holdingEarnEntryCardView.f43824c;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m54526d(HoldingEarnEntryCardView holdingEarnEntryCardView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        holdingEarnEntryCardView.m54528f();
        holdingEarnEntryCardView.setVisibility(8);
        Function0<Unit> function0 = holdingEarnEntryCardView.f43825d;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final String getTrackEventSpm() {
        if (TextUtils.isEmpty(this.f43826e)) {
            return "";
        }
        String str = this.f43826e;
        return C43852m.m96602n(str != null ? str : "", "SoftearningBannerClick", null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m54527e(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        C43852m.m96591c(pageId, "SoftearningBannerClick", null, null, 12, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m54528f() {
        if (TextUtils.isEmpty(this.f43826e)) {
            return;
        }
        String str = this.f43826e;
        if (str == null) {
            str = "";
        }
        C43852m.m96591c(str, "SoftearningBannerRemove", null, null, 12, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m54529g() {
        String str;
        if (TextUtils.isEmpty(this.f43826e) || ViewExtKt.m66579j(this) || (str = this.f43826e) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        C43852m.m96595g(str, "SoftearningBannerExposure", null, null, 12, null);
    }

    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public final String getF43826e() {
        return this.f43826e;
    }

    public final void setDescText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43823b.f90767d.setText(text);
    }

    public final void setInterestRateText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43823b.f90768e.setText(text);
    }

    public final void setOnCardClickListener(@Nullable Function0<Unit> listener) {
        this.f43824c = listener;
    }

    public final void setOnCloseClickListener(@Nullable Function0<Unit> listener) {
        this.f43825d = listener;
    }

    public final void setPageId(@Nullable String str) {
        this.f43826e = str;
    }

    public final void setTitleText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43823b.f90769f.setText(text);
    }

    public /* synthetic */ HoldingEarnEntryCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HoldingEarnEntryCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C40845i c40845iM89389c = C40845i.m89389c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c40845iM89389c, "inflate(...)");
        this.f43823b = c40845iM89389c;
        ShapeConstraintLayout rootCard = c40845iM89389c.f90766c;
        Intrinsics.checkNotNullExpressionValue(rootCard, "rootCard");
        ViewExtKt.m66575f(rootCard, new Function1() { // from class: com.kubi.resources.widget.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HoldingEarnEntryCardView.m54525c(this.f44237b, (View) obj);
            }
        });
        ImageView ivClose = c40845iM89389c.f90765b;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: com.kubi.resources.widget.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HoldingEarnEntryCardView.m54526d(this.f44422b, (View) obj);
            }
        });
    }
}
