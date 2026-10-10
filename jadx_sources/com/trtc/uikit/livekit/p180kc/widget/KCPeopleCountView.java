package com.trtc.uikit.livekit.p180kc.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: KCPeopleCountView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCPeopleCountView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textAudienceCount", "Landroid/widget/TextView;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "roomId", "", "init", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "setUserCount", "count", "", "formatUserCount", "onAttachedToWindow", "addObserver", "onDetachedFromWindow", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class KCPeopleCountView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Context f79250b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public TextView f79251c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41709m0 f79252d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f79253e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KCRoomInfoService f79254f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f79255g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCPeopleCountView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCPeopleCountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m81659c() {
        this.f79253e = C41696j.m91104d(this.f79252d, null, null, new KCPeopleCountView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m81661e(@NotNull LiveInfo liveInfo, @Nullable KCRoomInfoService kCRoomInfoService) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f79254f = kCRoomInfoService;
        this.f79255g = liveInfo.getLiveID();
        m81659c();
    }

    public /* synthetic */ KCPeopleCountView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void setUserCount(long count) {
        this.f79251c.setText(m81660d(count));
        if (count > 0) {
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m81660d(long j11) {
        String strValueOf = String.valueOf(j11);
        if (j11 >= 10000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%dk", Arrays.copyOf(new Object[]{Long.valueOf(j11 / ((long) 1000))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        return strValueOf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f79253e;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C41713n0.m91129e(this.f79252d, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCPeopleCountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79250b = context;
        LayoutInflater.from(context).inflate(R$layout.live_kc_people_count_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tv_audience_count);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79251c = (TextView) viewFindViewById;
        this.f79252d = C41713n0.m91126b();
    }
}
