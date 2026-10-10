package com.kubi.mvi.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.mvi.state.InterfaceC19285g;
import com.kubi.mvi.state.MviConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty1;
import ro.C44128b;

/* JADX INFO: compiled from: MviView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u0014\b\u0002\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00072\u00020\b2\u00020\tB'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u0014J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0012H\u0014¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&JI\u0010-\u001a\u00020\u0012\"\u0004\b\u0003\u0010'*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00030(2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0004¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0014¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00028\u0001H\u0004¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u0012\"\b\b\u0003\u00102*\u00028\u0000*\u00028\u0003H\u0004¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0014¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\u0012H\u0016¢\u0006\u0004\b8\u0010\u0014R(\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00109R\u001a\u0010?\u001a\u00020;8\u0014X\u0094D¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020@8$X¤\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, m90084d2 = {"Lcom/kubi/mvi/view/MviView;", "Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/BaseStateVM;", "VM", "Lcom/kubi/mvi/view/LifecycleView;", "Lcom/kubi/mvi/state/g;", "Lcom/kubi/mvi/view/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "Lcom/kubi/mvi/view/MviViewDelegate;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/kubi/mvi/view/MviViewDelegate;", "g", "u", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModeFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "p", "o", "c", "d", CmcdData.Factory.STREAM_TYPE_LIVE, "i", "Ldr/a;", "singleEvent", "t", "(Ldr/a;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "q", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "v", "getState", "()Lcom/kubi/mvi/state/f;", ExifInterface.GPS_DIRECTION_TRUE, "w", "(Lcom/kubi/mvi/state/d;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/mvi/view/MviViewDelegate;", "mviViewDelegate", "", "Z", "getAsyncInit", "()Z", "asyncInit", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "vmClass", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MviView<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> extends LifecycleView implements InterfaceC19285g, InterfaceC19301a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MviViewDelegate<I, S, VM> mviViewDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean asyncInit;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MviView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public abstract KClass<? extends VM> getVmClass();

    @Nullable
    /* JADX INFO: renamed from: s */
    public MviViewDelegate<I, S, VM> mo42648s() {
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MviView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.mvi.view.InterfaceC19301a
    /* JADX INFO: renamed from: a */
    public void mo42687a() {
        C44128b.m97259c("mvi", "view:" + this + " displayFailView");
    }

    @Override // com.kubi.mvi.view.InterfaceC19301a
    /* JADX INFO: renamed from: b */
    public void mo42688b() {
        C44128b.m97259c("mvi", "view:" + this + " displayEmptyView");
    }

    @Override // com.kubi.mvi.view.InterfaceC19301a
    /* JADX INFO: renamed from: e */
    public void mo42691e() {
        C44128b.m97259c("mvi", "view:" + this + " displayNetErrorView");
    }

    public boolean getAsyncInit() {
        return this.asyncInit;
    }

    @NotNull
    public final S getState() {
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        return (S) mviViewDelegate.m42711m();
    }

    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        C19243e.m42538g("getViewModeFactory", mviViewDelegate.getMviConfig().m42567g());
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void mo40902p() {
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42707h();
    }

    /* JADX INFO: renamed from: q */
    public final <A> void m42693q(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42708i(kProperty1, action);
    }

    /* JADX INFO: renamed from: t */
    public void m42694t(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
    }

    /* JADX INFO: renamed from: u */
    public void mo42579u() {
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        MviViewDelegate<I, S, VM> mviViewDelegate2 = null;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42715q();
        mo40902p();
        m42692o();
        MviViewDelegate<I, S, VM> mviViewDelegate3 = this.mviViewDelegate;
        if (mviViewDelegate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
        } else {
            mviViewDelegate2 = mviViewDelegate3;
        }
        mviViewDelegate2.m42706C(new Function1<InterfaceC36952a, Unit>(this) { // from class: com.kubi.mvi.view.MviView$init$1
            final /* synthetic */ MviView<I, S, VM> this$0;

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36952a interfaceC36952a) {
                invoke2(interfaceC36952a);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC36952a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.m42694t(it);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void mo40903v() {
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42716r();
    }

    /* JADX WARN: Incorrect types in method signature: <T::TI;>(TT;)V */
    /* JADX INFO: renamed from: w */
    public final void m42695w(@NotNull InterfaceC19282d interfaceC19282d) {
        Intrinsics.checkNotNullParameter(interfaceC19282d, "<this>");
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42721w(interfaceC19282d);
    }

    public /* synthetic */ MviView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: r */
    private final void m42686r() {
        MviViewDelegate<I, S, VM> mviViewDelegateMo42648s = mo42648s();
        if (mviViewDelegateMo42648s == null) {
            MviConfig mviConfig = new MviConfig(this, this);
            mviConfig.m42574n(this);
            mviConfig.m42575o(new Function0<ViewModelProvider.Factory>(this) { // from class: com.kubi.mvi.view.MviView$createStateDelegate$1$1
                final /* synthetic */ MviView<I, S, VM> this$0;

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
            this.mviViewDelegate = new MviViewDelegate<>(mviConfig, getVmClass(), this);
        } else {
            this.mviViewDelegate = mviViewDelegateMo42648s;
        }
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42717s();
    }

    @Override // com.kubi.mvi.view.LifecycleView
    /* JADX INFO: renamed from: g */
    public void mo42679g() {
        MviViewDelegate<I, S, VM> mviViewDelegate;
        super.mo42679g();
        m42686r();
        if (getAsyncInit()) {
            MviViewDelegate<I, S, VM> mviViewDelegate2 = this.mviViewDelegate;
            if (mviViewDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
                mviViewDelegate = null;
            } else {
                mviViewDelegate = mviViewDelegate2;
            }
            MviViewDelegate.m42703k(mviViewDelegate, false, false, new MviView$onCreate$1(this, null), 3, null);
        } else {
            mo42579u();
        }
        mo40903v();
    }

    @Override // com.kubi.mvi.view.LifecycleView
    /* JADX INFO: renamed from: h */
    public void mo41008h() {
        super.mo41008h();
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42718t();
    }

    @Override // com.kubi.mvi.view.LifecycleView
    /* JADX INFO: renamed from: i */
    public void mo42680i() {
        super.mo42680i();
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42719u();
    }

    @Override // com.kubi.mvi.view.LifecycleView
    /* JADX INFO: renamed from: l */
    public void mo42683l() {
        super.mo42683l();
        MviViewDelegate<I, S, VM> mviViewDelegate = this.mviViewDelegate;
        if (mviViewDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mviViewDelegate");
            mviViewDelegate = null;
        }
        mviViewDelegate.m42720v();
    }

    public boolean needCatchUIException() {
        return InterfaceC19285g.a.m42667a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MviView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.asyncInit = true;
    }

    @Override // com.kubi.mvi.view.InterfaceC19301a
    /* JADX INFO: renamed from: c */
    public void mo42689c() {
    }

    @Override // com.kubi.mvi.view.InterfaceC19301a
    /* JADX INFO: renamed from: d */
    public void mo42690d() {
    }

    /* JADX INFO: renamed from: o */
    public void m42692o() {
    }
}
