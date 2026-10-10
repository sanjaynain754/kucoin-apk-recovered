package com.kubi.kumex.guide;

import androidx.fragment.app.FragmentManager;
import com.kubi.event.api.C12572a;
import com.kubi.futures.dialog.FuturesAdDialog;
import com.kubi.futures.dialog.FuturesAdFrequencyManager;
import com.kubi.kumex.utils.C17067s;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesAdGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/guide/FuturesAdGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "priority", "", "runnable", "Ljava/lang/Runnable;", "fragment", "Lcom/kubi/sdk/BaseFragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/ad/api/entity/ResAdEntity;", "<init>", "(ILjava/lang/Runnable;Lcom/kubi/sdk/BaseFragment;Lcom/kubi/ad/api/entity/ResAdEntity;)V", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "enabled", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesAdGuide implements StepGuide {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f29104g = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String f29105h = "FuturesAdGuide";

    /* JADX INFO: renamed from: b */
    public final int f29106b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Runnable f29107c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final BaseFragment f29108d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ResAdEntity f29109e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC41775x1 f29110f;

    /* JADX INFO: compiled from: FuturesAdGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/guide/FuturesAdGuide$Companion;", "", "<init>", "()V", "Key", "", "getKey", "()Ljava/lang/String;", "sendNextStep", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void sendNextStep() {
            C12572a.m23695d("javaClass", null, 0L, 6, null);
        }

        public Companion() {
        }

        @NotNull
        public final String getKey() {
            return FuturesAdGuide.f29105h;
        }
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public boolean enabled() {
        return true;
    }

    public FuturesAdGuide(int i11, @NotNull Runnable runnable, @NotNull BaseFragment fragment, @Nullable ResAdEntity resAdEntity) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f29106b = i11;
        this.f29107c = runnable;
        this.f29108d = fragment;
        this.f29109e = resAdEntity;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29106b() {
        return this.f29106b;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29107c() {
        return this.f29107c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
        InterfaceC41775x1 interfaceC41775x1 = this.f29110f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        getF29107c().run();
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        ResAdEntity resAdEntity = this.f29109e;
        if (resAdEntity == null || !FuturesAdFrequencyManager.f22826a.m25278c(C27041f.m66668h(resAdEntity.getId())) || C17067s.m36608a(this.f29108d) || this.f29108d.getChildFragmentManager().isDestroyed()) {
            hide();
            return;
        }
        FuturesAdDialog.Companion companion = FuturesAdDialog.f22774s0;
        FragmentManager childFragmentManager = this.f29108d.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, resAdEntity);
        this.f29110f = C41696j.m91104d(C41713n0.m91125a(C42911a.m94121c()), C41727q2.m91192b(null, 1, null), null, new FuturesAdGuide$showGuide$1(this, null), 2, null);
    }
}
