package com.trtc.uikit.livekit.common.p179ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasicView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0017H$J\b\u0010\u0019\u001a\u00020\u0017H$J\b\u0010\u001a\u001a\u00020\u0017H$J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/ui/BasicView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "getSubscribeStateJob", "()Lkotlinx/coroutines/Job;", "setSubscribeStateJob", "(Lkotlinx/coroutines/Job;)V", "roomId", "", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "init", "", "initStore", "addObserver", "removeObserver", "onAttachedToWindow", "onDetachedFromWindow", "setupLifecycleIfNeeded", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasicView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC41775x1 f77567b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f77568c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo79408a();

    /* JADX INFO: renamed from: c */
    public abstract void mo79410c();

    /* JADX INFO: renamed from: d */
    public abstract void mo79411d();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public void mo79409b(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        if (roomId.length() == 0) {
            return;
        }
        this.f77568c = roomId;
        m79412e();
    }

    /* JADX INFO: renamed from: e */
    public final void m79412e() {
        if (this.f77568c.length() == 0) {
            return;
        }
        mo79410c();
        mo79411d();
        mo79408a();
    }

    @NotNull
    /* JADX INFO: renamed from: getRoomId, reason: from getter */
    public final String getF77568c() {
        return this.f77568c;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubscribeStateJob, reason: from getter */
    public final InterfaceC41775x1 getF77567b() {
        return this.f77567b;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f77568c = str;
    }

    public final void setSubscribeStateJob(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f77567b = interfaceC41775x1;
    }

    public /* synthetic */ BasicView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f77568c.length() == 0) {
            return;
        }
        m79412e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mo79411d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77568c = "";
    }
}
