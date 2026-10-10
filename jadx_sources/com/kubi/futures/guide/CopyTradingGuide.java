package com.kubi.futures.guide;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.kubi.kumex.guide.StepGuide;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: CopyTradingGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0001H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/guide/CopyTradingGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "priority", "", "runnable", "Ljava/lang/Runnable;", "<init>", "(Lcom/kubi/sdk/BaseFragment;ILjava/lang/Runnable;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "showDialog", "", "(Lcom/kubi/sdk/BaseFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowOtherStepGuideFloatToDisplayOnUpper", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingGuide.kt\ncom/kubi/futures/guide/CopyTradingGuide\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,127:1\n75#2,2:128\n*S KotlinDebug\n*F\n+ 1 CopyTradingGuide.kt\ncom/kubi/futures/guide/CopyTradingGuide\n*L\n56#1:128,2\n*E\n"})
public final class CopyTradingGuide implements StepGuide {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f23052e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseFragment f23053b;

    /* JADX INFO: renamed from: c */
    public final int f23054c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Runnable f23055d;

    /* JADX INFO: compiled from: CopyTradingGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/guide/CopyTradingGuide$Companion;", "", "<init>", "()V", "KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CopyTradingGuide(@Nullable BaseFragment baseFragment, int i11, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f23053b = baseFragment;
        this.f23054c = i11;
        this.f23055d = runnable;
    }

    /* JADX INFO: renamed from: e */
    public static final void m25568e(InterfaceC41769w interfaceC41769w, DialogInterface dialogInterface) {
        interfaceC41769w.mo91370n(Boolean.FALSE);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BaseFragment getF23053b() {
        return this.f23053b;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23054c() {
        return this.f23054c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23055d() {
        return this.f23055d;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope coroutineScope;
        BaseFragment baseFragment = this.f23053b;
        if (baseFragment == null || (lifecycle = baseFragment.getLifecycle()) == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        C41696j.m91104d(coroutineScope, null, null, new CopyTradingGuide$showGuide$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    public final Object m25570d(BaseFragment baseFragment, Continuation<? super Boolean> continuation) {
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        if (childFragmentManager.isDestroyed() && childFragmentManager.isStateSaved()) {
            return Boxing.boxBoolean(false);
        }
        new CopyTradingGuideDialog().m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.guide.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CopyTradingGuide.m25568e(interfaceC41769wM91388c, dialogInterface);
            }
        }).show(childFragmentManager, "CopyTradingGuideDialog");
        C46392a.m102330m(C46894j.f104736a.m103237B(), System.currentTimeMillis());
        return interfaceC41769wM91388c.mo91198h(continuation);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
