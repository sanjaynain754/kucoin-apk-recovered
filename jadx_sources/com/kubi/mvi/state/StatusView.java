package com.kubi.mvi.state;

import android.content.Context;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.view.MviView;
import com.kubi.mvi.view.MviViewDelegate;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001a\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001d\u001a\u00020\u000e2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0014\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\u0014\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\u0010R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Lcom/kubi/mvi/state/StatusView;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/view/MviView;", "Lcom/kubi/mvi/state/d;", "Lcom/kubi/mvi/state/StatusState;", "Lcom/kubi/mvi/state/StatusVM;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "u", "()V", "Lcom/kubi/mvi/view/MviViewDelegate;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/kubi/mvi/view/MviViewDelegate;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "y", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/mvi/state/MVIStatus;", "z", "(Lkotlin/jvm/functions/Function2;)V", "", "()Z", "p", "Lcom/kubi/mvi/state/MviViewStatusDelegate;", "f", "Lcom/kubi/mvi/state/MviViewStatusDelegate;", "stateDelegate", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class StatusView<S> extends MviView<InterfaceC19282d, StatusState<S>, StatusVM<S>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public MviViewStatusDelegate<S> stateDelegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public boolean m42647A() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.mvi.view.MviView
    @Nullable
    /* JADX INFO: renamed from: s */
    public MviViewDelegate<InterfaceC19282d, StatusState<S>, StatusVM<S>> mo42648s() {
        MviConfig mviConfig = new MviConfig(this, this);
        mviConfig.m42574n(this);
        mviConfig.m42575o(new Function0<ViewModelProvider.Factory>(this) { // from class: com.kubi.mvi.state.StatusView$customStateDelegate$1$1
            final /* synthetic */ StatusView<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getViewModeFactory();
            }
        });
        MviViewStatusDelegate<S> mviViewStatusDelegate = new MviViewStatusDelegate<>(mviConfig, getVmClass(), this);
        this.stateDelegate = mviViewStatusDelegate;
        return mviViewStatusDelegate;
    }

    /* JADX INFO: renamed from: y */
    public final <A> void m42649y(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        MviViewStatusDelegate<S> mviViewStatusDelegate = this.stateDelegate;
        if (mviViewStatusDelegate != null) {
            mviViewStatusDelegate.m42577E(kProperty1, action);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m42650z(@NotNull Function2<? super MVIStatus, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        MviViewStatusDelegate<S> mviViewStatusDelegate = this.stateDelegate;
        if (mviViewStatusDelegate != null) {
            mviViewStatusDelegate.m42578F(action);
        }
    }

    public /* synthetic */ StatusView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: p */
    public void mo40902p() {
        if (!m42647A()) {
            m42650z(new StatusView$bindState$1(this, null));
        }
    }

    @Override // com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: u */
    public void mo42579u() {
        super.mo42579u();
        m42695w(InitIntent.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
